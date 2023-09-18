package kr.co.interpia.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.interpia.converter.CertConverter;
import kr.co.interpia.domain.Cert;
import kr.co.interpia.domain.Skill;
import kr.co.interpia.dto.CertSkillDto.CertSkillRequestDto;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CertSkillServiceImpl implements CertSkillService{

	private final CertService certService;
	private final SkillService skillService;
	
	@Override
	public void registerCertSkill(CertSkillRequestDto certSkillRequestDto) {
		
		String empCd = certSkillRequestDto.getEmpCd();
		List<Cert> certList = CertConverter.convertToModelList(certSkillRequestDto.getCertRequestDtoList());
		certList.forEach(cert -> {
			cert.initEmpCd(empCd);
		});
		
		int countCert = certService.getCountCertByEmpCd(
				Cert.builder()
				.empCd(empCd)
				.build()
				);
		
		System.out.println(countCert);
		if(countCert == 0) {
			certList.forEach(cert -> {
				certService.insertCert(cert);
			});
		}
		else if(countCert == certList.size()) {
			certList.forEach(cert -> {
				certService.updateCert(cert);
			});
		}else if(countCert < certList.size() || countCert > certList.size()) {
			int compare = certList.size() - countCert;
			if(compare > 0) {
				List<Cert> uCertList = certList.subList(0, countCert);
				List<Cert> iCertList = certList.subList(countCert, certList.size());
				uCertList.forEach(cert -> {
					certService.updateCert(cert);
				});
				iCertList.forEach(cert -> {
					certService.insertCert(cert);
				});
			}else {
				System.out.println(compare);
				int uToIndex = countCert + compare;
				List<Cert> uCertList = certList.subList(0, uToIndex);
				System.out.println(uCertList);
				for(int i = uToIndex; i < countCert; i++) {
					System.out.println(i+1);
					
					certService.deleteEmp(Cert.builder()
							.empCd(empCd)
							.certCd(i+1)
							.build());
				}
			}
		}
		
		int countSkill = skillService.getCountSkillByEmpCd(
				Skill.builder()
				.empCd(empCd)
				.build()
				);
		System.out.println(countSkill);
		
	}

}
