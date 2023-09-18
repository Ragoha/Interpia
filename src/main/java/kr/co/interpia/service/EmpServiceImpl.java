package kr.co.interpia.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import kr.co.interpia.converter.EmpConverter;
import kr.co.interpia.domain.Emp;
import kr.co.interpia.dto.EmpDto.DeleteEmpRequestDto;
import kr.co.interpia.dto.EmpDto.InsertEmpRequestDto;
import kr.co.interpia.dto.EmpDto.SelectListEmpResponseDto;
import kr.co.interpia.dto.EmpDto.SelectOneEmpRequestDto;
import kr.co.interpia.dto.EmpDto.SelectOneEmpResponseDto;
import kr.co.interpia.dto.EmpDto.UpdateEmpRequestDto;
import kr.co.interpia.mapper.EmpMapper;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class EmpServiceImpl implements EmpService{

	private final EmpMapper empMapper;
	
	@Override
	public List<Emp> getEmpList() {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public SelectOneEmpResponseDto selectOneEmp(SelectOneEmpRequestDto empDto) {
		
		Emp rEmp = empMapper.selectOneEmp(EmpConverter.convertToModel(empDto));
		
		return EmpConverter.convertToSelectOneResponseDto(rEmp);
	}


	@Override
	public void insertEmp(InsertEmpRequestDto empDto) {
		empMapper.insertEmp(EmpConverter.convertToModel(empDto));
		
	}


	@Override
	public void deleteEmp(DeleteEmpRequestDto empDto) {
		
		empMapper.deleteEmp(EmpConverter.convertToModel(empDto));
		
	}


	@Override
	public void updateEmp(UpdateEmpRequestDto empDto) {
		
		empMapper.updateEmp(EmpConverter.convertToModel(empDto));
		
	}


	@Override
	public List<SelectListEmpResponseDto> selectListEmp() {
		
//		List<Emp> rEmpList = empMapper.selectListEmp();
		
		List<Map<String, Object>> rEmpList = empMapper.selectListEmp();
		
		System.out.println(rEmpList.toString());
		System.out.println(rEmpList);
		
		return EmpConverter.convertToSelectListResponseDtoList(rEmpList);
	}



}
