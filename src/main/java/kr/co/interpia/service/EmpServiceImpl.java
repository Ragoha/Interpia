package kr.co.interpia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.interpia.converter.EmpConverter;
import kr.co.interpia.domain.Emp;
import kr.co.interpia.dto.EmpDto.DeleteRequestDto;
import kr.co.interpia.dto.EmpDto.InsertRequestDto;
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
	public void insertEmp(InsertRequestDto empDto) {
		empMapper.insertEmp(EmpConverter.insertDtoToModel(empDto));
		
	}


	@Override
	public void deleteEmp(DeleteRequestDto empDto) {
		
		empMapper.deleteEmp(EmpConverter.deleteDtoToModel(empDto));
		
	}


	@Override
	public void updateEmp(UpdateRequestDto empDto) {
		
		empMapper.updateEmp(EmpConverter.updateDtoToModel(empDto));
		
	}

}
