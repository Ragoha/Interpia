package kr.co.interpia.mapper;

import java.util.List;
import java.util.Map;

import kr.co.interpia.domain.Emp;
import kr.co.interpia.dto.EmpDto.InsertRequestDto;
import kr.co.interpia.dto.EmpDto.SelectOneRequestDto;
import kr.co.interpia.dto.EmpDto.SelectOneResponseDto;

public interface EmpMapper {

	public List<Emp> getEmpList();
	
	public void insertEmp(Emp emp);

	public void deleteEmp(Emp emp);

	public void updateEmp(Emp emp);

	public Emp selectOneEmp(Emp emp);

	public List<Map<String, Object>> selectListEmp();
	
	
}
