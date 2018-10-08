package impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import User.User;
import User.UserDao;
import basedao.Basebao;

public class Impl extends Basebao implements UserDao{

	@Override
	public List<User> servlet() {
		List<User> list = new ArrayList<User>();
		 String sql = "select * from douban";
		 ResultSet resultSet = this.select(sql, null);
		 try {
			while(resultSet.next()){
				 User user = new User(resultSet.getInt("id"),resultSet.getString("author"),resultSet.getString("imgsrc"),resultSet.getString("title"),resultSet.getString("describe"),resultSet.getString("climn"));
				 list.add(user);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return list;
	}
	

}
