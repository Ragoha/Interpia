package kr.co.interpia.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.interpia.dto.EmpDto.DeleteEmpRequestDto;
import kr.co.interpia.dto.EmpDto.InsertEmpRequestDto;
import kr.co.interpia.dto.EmpDto.SelectListEmpResponseDto;
import kr.co.interpia.dto.EmpDto.SelectOneEmpRequestDto;
import kr.co.interpia.dto.EmpDto.SelectOneEmpResponseDto;
import kr.co.interpia.dto.EmpDto.UpdateEmpRequestDto;
import kr.co.interpia.service.EmpService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class EmpController {
	
	private final EmpService empService;
	
	@GetMapping("/emp")
	public ResponseEntity<List<SelectListEmpResponseDto>> selectListEmp(){
		
		List<SelectListEmpResponseDto> rEmpDtoList = empService.selectListEmp();
		
		return new ResponseEntity<List<SelectListEmpResponseDto>>(rEmpDtoList, HttpStatus.OK);
	}
	
	@GetMapping("/emp/{empCd}")
	public ResponseEntity<SelectOneEmpResponseDto> selectOneEmp(@PathVariable("empCd") SelectOneEmpRequestDto empDto ){
		
		System.out.println(empDto.toString());
		
		SelectOneEmpResponseDto rEmpDto = empService.selectOneEmp(empDto);
		
	    return new ResponseEntity<>(rEmpDto, HttpStatus.OK);

	}

	@PostMapping("/emp")
	public ResponseEntity<Void> insertEmp(@RequestBody InsertEmpRequestDto empDto) {

		empService.insertEmp(empDto);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PutMapping("/emp")
	public ResponseEntity<Void> updateEmp(@RequestBody UpdateEmpRequestDto empDto) {
		
		empService.updateEmp(empDto);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@DeleteMapping("/emp/{empCd}")
	public ResponseEntity<Void> deleteEmp(@PathVariable("empCd") DeleteEmpRequestDto empDto) {
		
		
		empService.deleteEmp(empDto);
		System.out.println(empDto.toString());
		
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
