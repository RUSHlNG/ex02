package com.bigdata2019.emaillist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vo.EmaillistVo;

public class EmaillistDao {
	
	public List<EmaillistVo> findAll() {
		
		List<EmaillistVo> list = new ArrayList<>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			
			//3. Statement κ°μ²΄ ??±
			stmt = conn.createStatement();
			
			//4. SQLλ¬? ?€?
			String sql = 
				"select no," +
				"       first_name," +
				"       last_name," + 
				"       email" + 
				"  from emaillist";
			
			rs = stmt.executeQuery(sql);
			
			//5. κ²°κ³Ό κ°?? Έ?€κΈ?
			while(rs.next()) {
				Long no = rs.getLong(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				String email = rs.getString(4);
				
				EmaillistVo vo = new EmaillistVo();
				vo.setNo(no);
				vo.setFirstName(firstName);
				vo.setLastName(lastName);
				vo.setEmail(email);
				
				list.add(vo);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("??Ό?΄λ²? λ‘λ© ?€?¨:" + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				//6.?? ? λ¦?
				if(rs != null) {
					rs.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	public Boolean insert(EmaillistVo vo) {
		Boolean result = false;
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = getConnection();
	
			//3. Statement κ°μ²΄ ??±
			stmt = conn.createStatement();			
		
			//4. SQLλ¬? ?€?
			String sql = 
				" insert" + 
				"   into emaillist" +
				" values (null, '"+ vo.getFirstName() + "', '" + vo.getLastName() + "', '" + vo.getEmail() + "')"; 
			
			int count = stmt.executeUpdate(sql);
			result = (count == 1);
			
		} catch (ClassNotFoundException e) {
			System.out.println("??Ό?΄λ²? λ‘λ© ?€?¨:" + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		//1. JDBC Driver(Mysql) λ‘λ©
		Class.forName("com.mysql.jdbc.Driver");
		
		//2. ?°κ²°νκΈ?
		String url = "jdbc:mysql://localhost:3306/webdb";
		Connection conn = DriverManager.getConnection(url, "webdb", "webdb");
		
		return conn;
	}	
}
