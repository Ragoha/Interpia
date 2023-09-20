package kr.co.interpia.service;

import java.util.List;

import kr.co.interpia.domain.Skill;
import kr.co.interpia.dto.SkillDto.SkillResponseDto;

public interface SkillService {

	int getCountSkillByEmpCd(Skill skill);
	
	public void insertSkill(Skill skill);

	public void updateSkill(Skill skill);

	public void deleteSkill(Skill skill);

	List<SkillResponseDto> selectListSkill(Skill skill);

}
