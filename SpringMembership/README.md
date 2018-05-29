<pre>

Spring Membership/

http://suyou.tistory.com/68 
ojdbc는 저작권 문제로 Maven repository에서 바로 받을 수 없음으로 직접 jar파일을 build path하거나(수동) mvn으로 install해줘야 함(자동) 
mvn install:install-file -Dfile="C:\Users\chimi\Downloads\ojdbc6.jar" -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2 -Dpackaging=jar

<!-- Oracle 이미 로칼에서 넣어놓은것을 표시해줌 -->
		<dependency>
			<groupId>com.oracle</groupId>
			<artifactId>ojdbc6</artifactId>
			<version>11.2</version>	
		</dependency>

sql문은 첨부 참조


-------------------------------------------------------#
ibatis로 바꾸기 ibatis-2.3.4.726.jar build path 추가
-------------------------------------------------------#
mybatis로 변경
-------------------------------------------------------#
UserDaoJdbcTemplate DataTemplate으로 

</pre>