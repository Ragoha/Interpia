package kr.co.interpia.converter;


import java.text.SimpleDateFormat;
import java.util.Date;

import kr.co.interpia.domain.Emp;
import kr.co.interpia.dto.EmpDto.DeleteRequestDto;
import kr.co.interpia.dto.EmpDto.InsertRequestDto;
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
