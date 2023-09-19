package kr.co.interpia.service;

import kr.co.interpia.dto.CertSkillDto.CertSkillRequestDto;
import kr.co.interpia.dto.CertSkillDto.CertSkillResponseDto;
import kr.co.interpia.dto.CertSkillDto.SelectCertSkillRequestDto;


public interface CertSkillService {

	public void registerCertSkill(CertSkillRequestDto certSkillRequestDto);
	
	public CertSkillResponseDto selectCertSkillByEmpCd(SelectCertSkillRequestDto selectCertSkillRequestDto);
}
