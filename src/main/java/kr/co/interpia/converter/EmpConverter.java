package kr.co.interpia.converter;


import java.util.List;
import java.util.stream.Collectors;

import kr.co.interpia.domain.Emp;
import kr.co.interpia.dto.EmpDTO;

public class EmpConverter {

	public static EmpDTO convertToDTO(Emp emp) {
		return EmpDTO.builder()
				.empId(emp.getEmpId())
				.empPw(emp.getEmpPw())
				.empNm(emp.getEmpNm())
				.build();
	}
	
	public static Emp conveertToModel(EmpDTO empDTO) {
		return Emp.builder()
				.empId(empDTO.getEmpId())
				.empPw(empDTO.getEmpPw())
				.empNm(empDTO.getEmpNm())
				.build();
	}
	
	public static List<EmpDTO> convertToDTOList(List<Emp> EmpList){
		return EmpList.stream().map(EmpConverter::convertToDTO).collect(Collectors.toList());
	}
}
