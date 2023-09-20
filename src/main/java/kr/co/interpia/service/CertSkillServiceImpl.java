package kr.co.interpia.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import kr.co.interpia.converter.CertConverter;
import kr.co.interpia.converter.SkillConverter;
import kr.co.interpia.domain.Cert;
import kr.co.interpia.domain.Skill;
import kr.co.interpia.dto.CertDto.CertRequestDto;
import kr.co.interpia.dto.CertDto.CertResponseDto;
import kr.co.interpia.dto.CertSkillDto.CertSkillRequestDto;
import kr.co.interpia.dto.CertSkillDto.CertSkillResponseDto;
import kr.co.interpia.dto.CertSkillDto.SelectCertSkillRequestDto;
import kr.co.interpia.dto.SkillDto.SkillRequestDto;
import kr.co.interpia.dto.SkillDto.SkillResponseDto;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CertSkillServiceImpl implements CertSkillService{

	private final CertService certService;
	private final SkillService skillService;
	
	@Override
	public void registerCertSkill(CertSkillRequestDto certSkillRequestDto) {
		
		String empCd = certSkillRequestDto.getEmpCd();
		List<CertRequestDto> certDtoList = certSkillRequestDto.getCertRequestDtoList();
		
		certDtoList.forEach(certDto -> {
			
			String state = certDto.getState();
			
			Cert cert = CertConverter.convertToModel(certDto);
			cert.initEmpCd(empCd);
			
			if(state.equals("inserted")) {
				certService.insertCert(cert);
			}else if(state.equals("updated")) {
				certService.updateCert(cert);
			}else if(state.equals("deleted")) {
				certService.deleteCert(cert);
			}
			
		});
		
		List<SkillRequestDto> skillDtoList = certSkillRequestDto.getSkillRequestDtoList();
		
		skillDtoList.forEach(skillDto -> {
			
			String state = skillDto.getState();
			
			Skill skill = SkillConverter.convertToModel(skillDto);
			skill.initEmpCd(empCd);
			
			if(state.equals("inserted")) {
				skillService.insertSkill(skill);
			}else if(state.equals("updated")) {
				skillService.updateSkill(skill);
			}else if(state.equals("deleted")) {
				skillService.deleteSkill(skill);
			}
			
		});
		
		
	}

	@Override
	public Map<String, Object> selectListCertSkillByEmpCd(SelectCertSkillRequestDto selectCertSkillRequestDto) {
		
		String empCd = selectCertSkillRequestDto.getEmpCd();
		
		Cert cert = Cert.builder()
				.empCd(empCd)
				.build();
		
		List<CertResponseDto> rCertList = certService.selectListCert(cert);
		
		System.out.println(rCertList.toString());
		
		
		Skill skill = Skill.builder()
				.empCd(empCd)
				.build();
		
		List<SkillResponseDto> rSkillList = skillService.selectListSkill(skill);
		
		System.out.println(rSkillList.toString());
		
		
		Map<String, Object> rCertSkillMap = new HashMap();
		
		rCertSkillMap.put("CertList", rCertList);
		rCertSkillMap.put("SkillList", rSkillList);
		
		return rCertSkillMap;
	}

}
