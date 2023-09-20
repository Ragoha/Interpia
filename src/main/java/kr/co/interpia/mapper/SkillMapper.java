package kr.co.interpia.mapper;

import java.util.List;

import kr.co.interpia.domain.Skill;

public interface SkillMapper {

	public int getCountSkillByEmpCd(Skill skill);
	
	public void insertSkill(Skill skill);

	public void updateSkill(Skill skill);
	
	public void deleteSkill(Skill skill);

	public List<Skill> selectListSkill(Skill skill);

}
