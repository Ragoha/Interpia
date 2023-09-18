package kr.co.interpia.service;

import org.springframework.stereotype.Service;

import kr.co.interpia.dto.CertSkillDto.CertSkillRequestDto;


public interface CertSkillService {

	public void registerCertSkill(CertSkillRequestDto certSkillRequestDto);
}
