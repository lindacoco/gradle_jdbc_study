package gradle_jdbc_study.dao.impl;

import java.util.List;

import gradle_jdbc_study.dao.EmployeeDao;
import gradle_jdbc_study.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private static final EmployeeDaoImpl instance = new EmployeeDaoImpl();
	
	public static EmployeeDaoImpl getInstance() {
		return instance;
	}

	private EmployeeDaoImpl() {}

	@Override
	public Employee selectEmployeeByNo(Employee emp) {
		String sql = "select emp_no, emp_name, title, manager, salary, dept, hire_date, pic from employee where emp_no=?";
		return null;
	}

	@Override
	public List<Employee> selectEmployeeByAll() {
		String sql = "select emp_no, emp_name, title, manager, salary, dept, hire_date from employee";
		return null;
	}

	@Override
	public int insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmployee(Employee emp) {
		StringBuilder sb = new StringBuilder("update employee set");
		/*... 조건에 따른 문자열 추가 */
		// update employee set emp_no=?, title=?, where
		sb.append("where emp_no=?");
		
		/*
		 * 비밀번호만 변경            update employee set passwd=? where emp_no=?;
		 * 사진 변경                     update employee set pic=? where emp_no=?;
		 * 이름, 직책, 비밀번호  update employee set emp_name=?, title=?, passwd=?, where emp_no=?;
		 */		
		return 0;
	}

	@Override
	public int deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee loginEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

}
