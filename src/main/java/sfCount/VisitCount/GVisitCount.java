package sfCount.VisitCount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GVisitCount {
    public int getCount() {
        int visit_count = 0;
        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; //加载JDBC驱动
        String dbURL = "jdbc:sqlserver://10.10.10.101:1433; DatabaseName=safehelper"; //连接服务器和数据库sample
        String userName = "sa"; //默认用户名
        String userPwd = "123456"; //密码


        try {
            Class.forName(driverName);
            try(Connection dbConn = DriverManager.getConnection(dbURL, userName, userPwd)){
                //System.out.println( "Connection Successful! "); //如果连接成功 控制台输出Connection Successful!

                String query = "select visit_count from sf_count where id=1";

                try(Statement stmt = dbConn.createStatement()){
                    try(ResultSet rs = stmt.executeQuery(query)) {
                        rs.next();

                        visit_count = rs.getInt("visit_count");
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return visit_count;
    }
}
