package com.iris.daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.iris.daos.EmployeeDao;
import com.iris.models.Employee;
import com.iris.utility.ConnectionProvider;

public class EmployeeDaoImpl implements EmployeeDao{

	Connection conn=ConnectionProvider.getConn();
	
	
	
	public boolean addEmployee(Employee e) throws Exception{
		PreparedStatement ps=conn.prepareStatement("insert into Employee1 values(?,?,?,?)");
		ps.setInt(1,e.getEmpId());
		ps.setString(2,e.getName());
		ps.setString(3,e.getGender());
		ps.setString(4,e.getPassword());
		
		
		int i=ps.executeUpdate();
		if(i!=0){
			return true;
		}
		
		return false;
	}


	public boolean deleteEmployee(int empId) throws Exception {
		PreparedStatement ps=conn.prepareStatement("delete from Employee1 Where EmpId=?");
		ps.setInt(1,empId);
		
		int i=ps.executeUpdate();
		if(i!=0){
			return true;
		}
		return false;
	}

	
	public Employee getEmployeeById(int empId) throws Exception{
		PreparedStatement ps=conn.prepareStatement("select * from Employee1 where EmpId=?");
		ps.setInt(1, empId);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String gen=rs.getString(3);
			String pass=rs.getString(4);
		
			
			Employee emp=new Employee();
			emp.setEmpId(id);
			emp.setName(name);
			emp.setGender(gen);
			emp.setPassword(pass);
		
			
			return emp;
		}
		
		return null;
	}

	
	public boolean validateEmployee(int empId, String empPass) throws Exception{
		PreparedStatement ps=conn.prepareStatement("select * from Employee1 where EmpId=? and Password=?");
		ps.setInt(1, empId);
		ps.setString(2,empPass);
		
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()){
			return true;
		}
		
		return false;
	}

	
	public List<Employee> getAllEmployees() throws Exception{
		
		List<Employee> empList=new ArrayList<>();
		
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from Employee");
		while(rs.next()){
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String gen=rs.getString(3);
			String pass=rs.getString(4);
		
			
			Employee emp=new Employee();
			emp.setEmpId(id);
			emp.setName(name);
			emp.setGender(gen);
			emp.setPassword(pass);
		
			
			empList.add(emp);
			
		}
		return empList;
	}

}

