package kr.co.interpia.converter;

import java.util.List;
import java.util.stream.Collectors;

import kr.co.interpia.domain.Skill;
import kr.co.interpia.dto.SkillDto.SkillRequestDto;
import kr.co.interpia.dto.SkillDto.SkillResponseDto;
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
	
	public static SkillResponseDto convertToSkillResponseDto(Skill skill) {
		
		SkillResponseDto skillResponseDto = SkillResponseDto.builder()
				.skillCd(skill.getSkillCd())
				.skillNm(skill.getSkillNm())
				.skillPf(skill.getSkillPf())
				.build();
		
		return skillResponseDto;
		
	}
	
	public static List<SkillResponseDto> convertToSkillResponseDtoList(List<Skill> skillList){
		
		return skillList.stream().map(SkillConverter::convertToSkillResponseDto).collect(Collectors.toList());
	}

}
