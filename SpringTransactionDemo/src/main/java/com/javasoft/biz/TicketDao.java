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
		// Ʈ����� �ȿ��� �����ϴ� �ڵ� , Ʈ����� �Ŵ����� ����Ǿ� �ִ� ��� DAO �� ���� Ʈ����ǿ� �����Ѵ� .
		 // ���������� �۾��� ��ġ�� ���ϵǸ� Ʈ������� Ŀ�Եȴ� .
		 // ���� ������ ������ Ʈ����ǿ� �����ߴٸ� �ش� Ʈ������� �۾��� ��� ��ĥ ������ Ŀ���� �����ȴ� .
		 // ���ϵǱ� ������ ���ܰ� �߻��ϸ� Ʈ������� �ѹ�ȴ� .
		
		
	}
}
