package gradle_jdbc_study.dao;

import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import gradle_jdbc_study.dao.impl.EmployeeDaoImpl;
import gradle_jdbc_study.util.LogUtil;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeDaoTest {
	static EmployeeDao dao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		dao = EmployeeDaoImpl.getInstance();
	}

	@Test
	public void test01SelectEmployeeByNo() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		fail("Not yet implemented");
	}

	@Test
	public void test02SelectEmployeeByAll() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		fail("Not yet implemented");
	}

	@Test
	public void test03InsertEmployee() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		fail("Not yet implemented");
	}

	@Test
	public void test04UpdateEmployee() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		fail("Not yet implemented");
	}

	@Test
	public void test05DeleteEmployee() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		fail("Not yet implemented");
	}

	@Test
	public void test06LoginEmployee() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		fail("Not yet implemented");
	}

}
