package kr.co.interpia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.interpia.converter.SkillConverter;
import kr.co.interpia.domain.Skill;
import kr.co.interpia.dto.SkillDto.SkillResponseDto;
import kr.co.interpia.mapper.SkillMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SkillServiceImpl implements SkillService{
	
	private final SkillMapper skillMapper;
	
	@Override
	public int getCountSkillByEmpCd(Skill skill) {
		return skillMapper.getCountSkillByEmpCd(skill);
	}

	@Override
	public void insertSkill(Skill skill) {
		
		skillMapper.insertSkill(skill);
		
	}

	@Override
	public void updateSkill(Skill skill) {

		skillMapper.updateSkill(skill);
		
	}

	@Override
	public void deleteSkill(Skill skill) {
		
		skillMapper.deleteSkill(skill);
		
	}

	@Override
	public List<SkillResponseDto> selectListSkill(Skill skill){
		
		return SkillConverter.convertToSkillResponseDtoList(skillMapper.selectListSkill(skill));
	
	}

}
