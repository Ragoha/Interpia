package kr.co.interpia.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.interpia.dto.CertSkillDto.CertSkillRequestDto;
import kr.co.interpia.dto.CertSkillDto.SelectCertSkillRequestDto;
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
	
	@GetMapping("/certskill/{empCd}")
	public ResponseEntity<Map<String, Object>> selectListCertSkill(@PathVariable("empCd") SelectCertSkillRequestDto selectCertSkillRequestDto){
		
		
		System.out.println(selectCertSkillRequestDto.toString());
		Map<String, Object> rCertSkillMap = certSkillService.selectListCertSkillByEmpCd(selectCertSkillRequestDto);
		
		return new ResponseEntity(rCertSkillMap, HttpStatus.OK);
	}

}
