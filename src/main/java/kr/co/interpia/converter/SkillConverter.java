package kr.co.interpia.converter;

import kr.co.interpia.domain.Skill;
import kr.co.interpia.dto.SkillDto.SkillRequestDto;
import kr.co.interpia.util.CommonUtil;

public class SkillConverter {
	
	public static Skill convertToModel(SkillRequestDto skillRequestDto) {
		
		Skill skill = Skill.builder()
				.skillCd(skillRequestDto.getSkillCd())
				.skillNm(skillRequestDto.getSkillNm())
				.skillPf(skillRequestDto.getSkillPf())
				.insertDt(CommonUtil.getCurrentFormattedDate())
				.modifyDt(CommonUtil.getCurrentFormattedDate())
				.build();
		
		return skill;
	}

}
