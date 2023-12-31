package kr.co.interpia.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.interpia.domain.Emp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class EmpTest {

	@Autowired
	private EmpMapper empMapper;
	
	@Test
	public void getEmpList() {
		List<Emp> emp = empMapper.getEmpList();
		System.out.println(emp.toString());
	}
}
