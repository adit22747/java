package com.cybage.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import com.cybage.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	

	@Override
	public void add(Employee emp, String type) throws Exception {
//        writer = new FileWriter("db.txt", true);
//        writer.write(emp.toString());
//        writer.close();
		Connection con = DbUtil.getCon();
		
		if(type.equals("REG")) {
			PreparedStatement ps = con.prepareStatement("insert into employee values (?,?,?,?,?)");
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getAddress());
			ps.setLong(4, emp.getCompensation());
			ps.setString(5, type);
			if(! ps.execute()) {
				System.out.println("added record");
			}else {
				System.out.println("could not add record");
			}
		}else {
			PreparedStatement ps = con.prepareStatement("insert into employee values (?,?,?,?,?)");
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getAddress());
			ps.setLong(4, emp.getCompensation());
			ps.setString(5, type);
			if(! ps.execute()) {
				System.out.println("added record");
			}else {
				System.out.println("could not add record");
			}
		}
		
		con.close();

	}

	@Override
	public void delete(int id) throws Exception {
		Connection con = DbUtil.getCon();
		PreparedStatement ps = con.prepareStatement("delete from employee where id=?");
		ps.setInt(1, id);
		int update = ps.executeUpdate();
		if(update > 0) {
			System.out.println("deleted the record");
		}else {
			System.out.println("could not delete the record");
		}
		con.close();
		ps.close();
	}



	@Override
	public void display() throws Exception {
		Connection con = DbUtil.getCon();
		// 3. now we can talk to database through con connection
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery("select * from employee");
		
		while(result.next()) { //will fetch next record
			System.out.println("id :" + result.getInt(1) + " Name:" + result.getString(2) + " Address:" + result.getString(3) + " Compensation:" + result.getInt(4) + " type:" + result.getString(5));
		}
		
		
		result.close();
		statement.close();
		con.close();
	}

	@Override
	public void update(int id, String name, String address) throws Exception {
		Connection con = DbUtil.getCon();
		PreparedStatement ps = con.prepareStatement("update employee set name=?,address=? where id=?");
		ps.setInt(3, id);
		ps.setString(1, name);
		ps.setString(2, address);
		int update = ps.executeUpdate();
		if(update > 0) {
			System.out.println("updated the record");
		}else {
			System.out.println("could not update the record");
		}
		ps.close();
		con.close();
	}

}
