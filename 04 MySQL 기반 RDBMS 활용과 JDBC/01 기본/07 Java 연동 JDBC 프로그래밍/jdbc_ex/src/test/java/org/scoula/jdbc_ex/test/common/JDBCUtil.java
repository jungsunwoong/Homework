package org.scoula.jdbc_ex.test.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCUtil {
    static Connection con = null;

    public static Connection getConnection() {
        if(con == null ) {
            return con;
        }
        try {
            Properties properties = new Properties();
            properties.load(JDBCUtil.class.getResourceAsStream("/application.properties"));
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            String id = properties.getProperty("id");
            String password = properties.getProperty("password");

            Class.forName(driver);
            con = DriverManager.getConnection(url,id,password);
        } catch ( Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
