package kr.co.interpia.service;

import java.util.List;

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
	public CertSkillResponseDto selectCertSkillByEmpCd(SelectCertSkillRequestDto selectCertSkillRequestDto) {
		
		Cert cert = Cert.builder()
				.empCd(selectCertSkillRequestDto.getEmpCd())
				.build();
		
		List<Cert> rCertList = certService.selectListCert(cert);
		
//		List<CertResponseDto> rCertResponseDtoList = CertConverter.
		
//		System.out.println(rCertList.toString());
		
		return null;
	}

}
