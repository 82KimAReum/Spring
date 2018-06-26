package com.javasoft.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

@Repository("ticketDao")
public class TicketDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private TransactionTemplate transactionTemplate;

	public void buyTicket(final TicketVO ticketVO) {
		System.out.println("buyTicket()");
		System.out.println("ticketVO.getConsumerId() : " + ticketVO.getConsumerId());
		System.out.println("ticketVO.getAmount() : " + ticketVO.getAmount());
		
		this.transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				String sql = "INSERT INTO card(consumerid, amount) VALUES(?, ?)";
				TicketDao.this.jdbcTemplate.update(sql, ticketVO.getConsumerId(), ticketVO.getAmount());
					
				sql = "INSERT INTO ticket(consumerid, countnum) VALUES(?, ?)";
				TicketDao.this.jdbcTemplate.update(sql, ticketVO.getConsumerId(), ticketVO.getAmount());
			}
		});
		// 트랜잭션 안에서 동작하는 코드 , 트랜잭션 매니저와 연결되어 있는 모든 DAO 는 같은 트랜잭션에 참여한다 .
		 // 정상적으로 작업을 마치고 리턴되면 트랜잭션은 커밋된다 .
		 // 만약 이전에 시작한 트랜잭션에 참여했다면 해당 트랜잭션의 작업을 모두 마칠 때까지 커밋은 보류된다 .
		 // 리턴되기 이전에 예외가 발생하면 트랜잭션은 롤백된다 .
		
		
	}
}
