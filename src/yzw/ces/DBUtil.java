package yzw.ces;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DBUtil {
	//连接数据库
	public static Connection getConn(){
		
		InputStream in = DBUtil.class.getClassLoader().getResourceAsStream("db.properties");
		Properties prop = new Properties();
		Connection conn = null;
		try {
			prop.load(in);
			//获得数据库连接数据
			String classDriver = prop.getProperty("classDriver");
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");
			//加载数据库驱动
			Class.forName(classDriver);
			//获得连接
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	//获得预编译对象
	public static PreparedStatement getPstmt(String sql){
		Connection conn = getConn();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pstmt;
	}
	//update资源关闭
	public static void closeResUpdate(PreparedStatement pstmt){
		Connection conn = null;
		try {
			if(pstmt != null){
				conn = pstmt.getConnection();
				pstmt.close();
			}
			if(conn != null){
				conn.close();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void closeResQuery(ResultSet res){
		Statement stat = null;
		Connection conn = null;
		try {
			if(res != null){
				stat = res.getStatement();
				conn = stat.getConnection();
                res.close();
            }
			if(stat !=null){
				stat.close();
			}
			if(conn != null){
				conn.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println(getConn());
	}
}
