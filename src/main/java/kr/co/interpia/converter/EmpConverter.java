package kr.co.interpia.converter;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import kr.co.interpia.domain.Emp;
import kr.co.interpia.dto.EmpDto.DeleteEmpRequestDto;
import kr.co.interpia.dto.EmpDto.InsertEmpRequestDto;
import kr.co.interpia.dto.EmpDto.SelectListEmpResponseDto;
import kr.co.interpia.dto.EmpDto.SelectOneEmpRequestDto;
import kr.co.interpia.dto.EmpDto.SelectOneEmpResponseDto;
import kr.co.interpia.dto.EmpDto.UpdateEmpRequestDto;
import kr.co.interpia.util.CommonUtil;

public class EmpConverter {
	
	public static Emp convertToModel(InsertEmpRequestDto empDto) {

		Emp emp = Emp.builder()
				.empCd(empDto.getEmpCd())
				.empId(empDto.getEmpId())
				.empPw(empDto.getEmpPw())
				.korNm(empDto.getKorNm())
				.engNm(empDto.getEngNm())
				.chaNm(empDto.getChaNm())
				.regNb(empDto.getRegNb())
				.imgNm(empDto.getImgNm())
				.imgPath(empDto.getImgPath())
				.birthDt(empDto.getBirthDt())
				.birthTp(empDto.getBirthTp())
				.gender(empDto.getGender())
				.marital(empDto.getMarital())
				.year(empDto.getYear())
				.salTp(empDto.getSalTp())
				.desJob(empDto.getDesJob())
				.joinTp(empDto.getJoinTp())
				.zipCd(empDto.getZipCd())
				.addr(empDto.getAddr())
				.addrDtl(empDto.getAddrDtl())
				.phone(empDto.getPhone())
				.email(empDto.getEmail())
				.techLv(empDto.getTechLv())
				.drink(empDto.getDrink())
				.insertDt(CommonUtil.getCurrentFormattedDate())
				.modifyDt(CommonUtil.getCurrentFormattedDate())
				.build();
		
		return emp;
	}
	


	public static Emp convertToModel(UpdateEmpRequestDto empDto) {
		
		Emp emp = Emp.builder()
				.empCd(empDto.getEmpCd())
				.korNm(empDto.getKorNm())
				.engNm(empDto.getEngNm())
				.chaNm(empDto.getChaNm())
				.regNb(empDto.getRegNb())
				.imgNm(empDto.getImgNm())
				.imgPath(empDto.getImgPath())
				.birthDt(empDto.getBirthDt())
				.birthTp(empDto.getBirthTp())
				.gender(empDto.getGender())
				.marital(empDto.getMarital())
				.year(empDto.getYear())
				.salTp(empDto.getSalTp())
				.desJob(empDto.getDesJob())
				.joinTp(empDto.getJoinTp())
				.zipCd(empDto.getZipCd())
				.addr(empDto.getAddr())
				.addrDtl(empDto.getAddrDtl())
				.phone(empDto.getPhone())
				.email(empDto.getEmail())
				.techLv(empDto.getTechLv())
				.drink(empDto.getDrink())
				.modifyDt(CommonUtil.getCurrentFormattedDate())
				.build();
		
		return emp;
	}
	
	public static Emp convertToModel(DeleteEmpRequestDto empDto) {
		
		Emp emp = Emp.builder()
				.empCd(empDto.getEmpCd())
				.build();
		
		return emp;
	}

	public static Emp convertToModel(SelectOneEmpRequestDto empDto) {
		
		Emp emp = Emp.builder()
				.empCd(empDto.getEmpCd())
				.build();
		
		return emp;
	}
	
	public static SelectOneEmpResponseDto convertToSelectOneResponseDto(Emp emp) {
		
		return SelectOneEmpResponseDto.builder()
				.empCd(emp.getEmpCd())
				.empId(emp.getEmpId())
				.korNm(emp.getKorNm())
				.engNm(emp.getEngNm())
				.chaNm(emp.getChaNm())
				.regNb(emp.getRegNb())
				.imgNm(emp.getImgNm())
				.imgPath(emp.getImgPath())
				.birthDt(emp.getBirthDt())
				.birthTp(emp.getBirthTp())
				.gender(emp.getGender())
				.marital(emp.getMarital())
				.year(emp.getYear())
				.salTp(emp.getSalTp())
				.desJob(emp.getDesJob())
				.joinTp(emp.getJoinTp())
				.zipCd(emp.getZipCd())
				.addr(emp.getAddr())
				.addrDtl(emp.getAddrDtl())
				.phone(emp.getPhone())
				.email(emp.getEmail())
				.techLv(emp.getTechLv())
				.drink(emp.getDrink())
				.build();
	}
	
	public static List<SelectListEmpResponseDto> convertToSelectListResponseDtoList(List<Map<String, Object>> empList) {
	    return empList.stream()
	            .map((Map<String, Object> emp) -> SelectListEmpResponseDto.builder()
	                    .empCd((String) emp.get("EMP_CD"))
	                    .empNm((String) emp.get("KOR_NM"))
	                    .regNb((String) emp.get("REG_NB"))
	                    .gender((String) emp.get("GENDER"))
	                    .techLv((String) emp.get("TECH_LV"))
	                    .year((String) emp.get("YEAR"))
	                    .client((String) emp.get("CLIENT"))
	                    .build())
	            .collect(Collectors.toList());
	}

	
	
	

//	public static EmpDto convertToDto(Emp emp) {
//		return EmpDto.builder()
//				.build();
//	}
//	
//	public static Emp conveertToModel(EmpDto empDto) {
//		return Emp.builder()
//				.build();
//	}
//	
//	public static List<EmpDto> convertToDTOList(List<Emp> EmpList){
//		return EmpList.stream().map(EmpConverter::convertToDto).collect(Collectors.toList());
//	}
}
