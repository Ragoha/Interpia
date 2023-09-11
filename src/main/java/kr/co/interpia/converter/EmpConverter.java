package kr.co.interpia.converter;


import java.text.SimpleDateFormat;
import java.util.Date;

import kr.co.interpia.domain.Emp;
import kr.co.interpia.dto.EmpDto.DeleteRequestDto;
import kr.co.interpia.dto.EmpDto.InsertRequestDto;
import kr.co.interpia.dto.EmpDto.SelectOneRequestDto;
import kr.co.interpia.dto.EmpDto.SelectOneResponseDto;
import kr.co.interpia.dto.EmpDto.UpdateRequestDto;
import kr.co.interpia.util.CommonUtil;

public class EmpConverter {
	
	public static Emp insertDtoToModel(InsertRequestDto empDto) {

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
				.matrial(empDto.getMatrial())
				.year(empDto.getYear())
				.salTp(empDto.getSalTp())
				.desJob(empDto.getDesJob())
				.joinTp(empDto.getJoinTp())
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
	


	public static Emp updateDtoToModel(UpdateRequestDto empDto) {
		
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
				.matrial(empDto.getMatrial())
				.year(empDto.getYear())
				.salTp(empDto.getSalTp())
				.desJob(empDto.getDesJob())
				.joinTp(empDto.getJoinTp())
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
	
	public static Emp deleteDtoToModel(DeleteRequestDto empDto) {
		
		Emp emp = Emp.builder()
				.empCd(empDto.getEmpCd())
				.build();
		
		return emp;
	}

	public static Emp selectOneDtoToModel(SelectOneRequestDto empDto) {
		
		Emp emp = Emp.builder()
				.empCd(empDto.getEmpCd())
				.build();
		
		return emp;
	}
	
	public static SelectOneResponseDto ModelToSelectOneResponseDto(Emp emp) {
		
		return SelectOneResponseDto.builder()
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
				.matrial(emp.getMatrial())
				.year(emp.getYear())
				.salTp(emp.getSalTp())
				.desJob(emp.getDesJob())
				.joinTp(emp.getJoinTp())
				.addr(emp.getAddr())
				.addrDtl(emp.getAddrDtl())
				.phone(emp.getPhone())
				.email(emp.getEmail())
				.techLv(emp.getTechLv())
				.drink(emp.getDrink())
				.build();
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
