package com.busanit501.jsp_server_project1;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class _0203_2_ConnectTests {
    @Test
    public void testHikariCP() throws Exception {
        // HikariConfig 클래스 이용해서 옵션 설정
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("org.mariadb.jdbc.Driver");
        config.setJdbcUrl("jdbc:mariadb://localhost:3306/webdb");
        config.setUsername("webuser");
        config.setPassword("webuser");

        // PreparedStatement 캐시 설정
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

        // HikariDataSource 클래스에 위의 설정 클래스를 담아주기
        HikariDataSource ds = new HikariDataSource(config);
        Connection connection = ds.getConnection();

        // 해당 connection이 있는지 여부 확인
        System.out.println(connection);

        connection.close();
    }
}
