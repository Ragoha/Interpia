package kr.co.interpia.service;

import java.util.List;

import kr.co.interpia.domain.Emp;
import kr.co.interpia.dto.EmpDto.DeleteRequestDto;
import kr.co.interpia.dto.EmpDto.InsertRequestDto;
import kr.co.interpia.dto.EmpDto.UpdateRequestDto;

public interface EmpService {

	List<Emp> getEmpList();
	
	void insertEmp(InsertRequestDto empDto);

	void deleteEmp(DeleteRequestDto empDto);

	void updateEmp(UpdateRequestDto empDto);
}
 