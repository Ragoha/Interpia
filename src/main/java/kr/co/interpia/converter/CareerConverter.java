package kr.co.interpia.converter;

import kr.co.interpia.domain.Career;
import kr.co.interpia.dto.CareerDto.InsertRequestDto;
import kr.co.interpia.util.CommonUtil;

public class CareerConverter {
	
	public static Career convertToModel(InsertRequestDto careerDto) {
		
		Career career = Career.builder()
				.empCd(careerDto.getEmpCd())
				.expCd(careerDto.getExpCd())
				.company(careerDto.getCompany())
				.pos(careerDto.getPos())
				.expPer(careerDto.getExpPer())
				.role(careerDto.getRole())
				.insertDt(CommonUtil.getCurrentFormattedDate())
				.modifyDt(CommonUtil.getCurrentFormattedDate())
				.build();
		
		return career;
	}

}
