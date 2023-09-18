package kr.co.interpia.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.interpia.dto.CertSkillDto.CertSkillRequestDto;
import kr.co.interpia.service.CertSkillService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CertSkillController {
	
	private final CertSkillService certSkillService;
	
	@PostMapping("/certskill")
	public ResponseEntity<Void> registerCertSkill(@RequestBody CertSkillRequestDto certSkillRequestDto){
		System.out.println(certSkillRequestDto.toString());
		
		certSkillService.registerCertSkill(certSkillRequestDto);
		
		return new ResponseEntity(HttpStatus.OK);
	}

}
