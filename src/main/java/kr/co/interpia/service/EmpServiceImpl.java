package kr.co.interpia.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import kr.co.interpia.converter.EmpConverter;
import kr.co.interpia.domain.Emp;
import kr.co.interpia.dto.EmpDto.DeleteRequestDto;
import kr.co.interpia.dto.EmpDto.InsertRequestDto;
import kr.co.interpia.dto.EmpDto.SelectListResponseDto;
import kr.co.interpia.dto.EmpDto.SelectOneRequestDto;
import kr.co.interpia.dto.EmpDto.SelectOneResponseDto;
import kr.co.interpia.dto.EmpDto.UpdateRequestDto;
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
	public SelectOneResponseDto selectOneEmp(SelectOneRequestDto empDto) {
		
		Emp rEmp = empMapper.selectOneEmp(EmpConverter.convertToModel(empDto));
		
		return EmpConverter.convertToSelectOneResponseDto(rEmp);
	}


	@Override
	public void insertEmp(InsertRequestDto empDto) {
		empMapper.insertEmp(EmpConverter.convertToModel(empDto));
		
	}


	@Override
	public void deleteEmp(DeleteRequestDto empDto) {
		
		empMapper.deleteEmp(EmpConverter.convertToModel(empDto));
		
	}


	@Override
	public void updateEmp(UpdateRequestDto empDto) {
		
		empMapper.updateEmp(EmpConverter.convertToModel(empDto));
		
	}


	@Override
	public List<SelectListResponseDto> selectListEmp() {
		
//		List<Emp> rEmpList = empMapper.selectListEmp();
		
		List<Map<String, Object>> rEmpList = empMapper.selectListEmp();
		
		System.out.println(rEmpList.toString());
		System.out.println(rEmpList);
		
		return EmpConverter.convertToSelectListResponseDtoList(rEmpList);
	}



}
