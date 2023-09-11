package kr.co.interpia.mapper;

import java.util.List;

import kr.co.interpia.domain.Emp;
import kr.co.interpia.dto.EmpDto.InsertRequestDto;

public interface EmpMapper {

	public List<Emp> getEmpList();
	
	public void insertEmp(Emp emp);

	public void deleteEmp(Emp emp);

	public void updateEmp(Emp emp);
	
	
}
