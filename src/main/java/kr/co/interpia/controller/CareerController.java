package kr.co.interpia.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.interpia.dto.CareerDto.InsertRequestDto;
import kr.co.interpia.service.CareerService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CareerController {
	
	private final CareerService careerService;
	
	@PostMapping("/career")
	public ResponseEntity<Void> insertCareer(@RequestBody InsertRequestDto careerDto){
		
		careerService.insertCareer(careerDto);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
