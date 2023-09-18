package kr.co.interpia.service;

import kr.co.interpia.domain.Skill;

public interface SkillService {

	int getCountSkillByEmpCd(Skill skill);
	
	public void insertSkill(Skill skill);

	public void updateSkill(Skill skill);

	public void deleteSkill(Skill skill);

}
