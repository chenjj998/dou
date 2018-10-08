package basedao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Basebao {
         
	  Connection connection=null;
	  PreparedStatement preparedStatement;
	  
	  public Connection getConnection() throws ClassNotFoundException{
		  try {
			  Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		return connection;		  
	  }
	  public ResultSet getResultSet(String sql) throws ClassNotFoundException, SQLException{
		  
		 PreparedStatement statement =null;
		 ResultSet resultSet =null;
		 connection =getConnection();
		 statement=connection.prepareStatement(sql);
		 resultSet=statement.executeQuery();
		return resultSet; 
	  }
	  
	  public ResultSet select(String sql, Object[] objects) {
		 
		  PreparedStatement ps = null;
		  ResultSet read = null;
			try {
				  connection = getConnection();
				ps = connection.prepareStatement(sql);
				if (objects != null) {
					for (int i = 0; i < objects.length; i++) {
						ps.setObject(i + 1, objects[i]);
					}
				}
				read = ps.executeQuery();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return read;
		}

	  //澧炲垹鏀规煡
	  public int UPdata(String sql,Object[] object) throws ClassNotFoundException, SQLException{
		  connection = getConnection();
			int num = 0;
			try {
				preparedStatement = connection.prepareStatement(sql);
				if (object != null) {
					for (int i = 0; i < object.length; i++) {
						preparedStatement.setObject(i + 1, object[i]);
					}
				}
				num = preparedStatement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return num;
	  }
	   //鍏抽棴璧勬簮
	  public void close(Connection connection , PreparedStatement ps,ResultSet rs) throws SQLException{
		  
		  if(rs!=null){
			  rs.close();
		  }
		  if(ps!=null){
			  ps.close();
		  }
		  if (connection!=null) {
			connection.close();
		}
	  }
}