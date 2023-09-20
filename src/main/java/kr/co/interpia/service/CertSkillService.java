package kr.co.interpia.service;

import java.util.Map;

import kr.co.interpia.dto.CertSkillDto.CertSkillRequestDto;
import kr.co.interpia.dto.CertSkillDto.SelectCertSkillRequestDto;


public interface CertSkillService {

	public void registerCertSkill(CertSkillRequestDto certSkillRequestDto);
	
	public Map<String, Object> selectListCertSkillByEmpCd(SelectCertSkillRequestDto selectCertSkillRequestDto);
}
