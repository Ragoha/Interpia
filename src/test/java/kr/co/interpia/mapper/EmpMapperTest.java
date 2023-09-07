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
public class EmpMapperTest {
	
	@Autowired
	private EmpMapper empMapper;
	
	@Test
	public void getEmpListTest() {
		
		List<Emp> rEmpList = empMapper.getEmpList();
		
		System.out.println(rEmpList.toString());
		
//		rEmpList.forEach(emp -> {
//			System.out.println(emp.toString());
//		});
		
	}

}
