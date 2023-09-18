package kr.co.interpia.service;

import java.util.List;

import kr.co.interpia.domain.Emp;
import kr.co.interpia.dto.EmpDto.DeleteEmpRequestDto;
import kr.co.interpia.dto.EmpDto.InsertEmpRequestDto;
import kr.co.interpia.dto.EmpDto.SelectListEmpResponseDto;
import kr.co.interpia.dto.EmpDto.SelectOneEmpRequestDto;
import kr.co.interpia.dto.EmpDto.SelectOneEmpResponseDto;
import kr.co.interpia.dto.EmpDto.UpdateEmpRequestDto;

public interface EmpService {

	public List<Emp> getEmpList();
	
	public void insertEmp(InsertEmpRequestDto empDto);

	public void deleteEmp(DeleteEmpRequestDto empDto);

	public void updateEmp(UpdateEmpRequestDto empDto);

	public SelectOneEmpResponseDto selectOneEmp(SelectOneEmpRequestDto empDto);

	public List<SelectListEmpResponseDto> selectListEmp();
}
 