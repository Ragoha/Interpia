package kr.co.interpia.controller;

import java.util.ArrayList;
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

import kr.co.interpia.dto.EmpDto.DeleteRequestDto;
import kr.co.interpia.dto.EmpDto.InsertRequestDto;
import kr.co.interpia.dto.EmpDto.SelectListResponseDto;
import kr.co.interpia.dto.EmpDto.SelectOneRequestDto;
import kr.co.interpia.dto.EmpDto.SelectOneResponseDto;
import kr.co.interpia.dto.EmpDto.UpdateRequestDto;
import kr.co.interpia.service.EmpService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class EmpController {
	
	private final EmpService empService;
	
	@GetMapping("/emp")
	public ResponseEntity<List<SelectListResponseDto>> selectList(){
		
		List<SelectListResponseDto> rEmpDtoList = empService.selectListEmp();
		
		return new ResponseEntity<List<SelectListResponseDto>>(rEmpDtoList, HttpStatus.OK);
	}
	
	@GetMapping("/emp/{empCd}")
	public ResponseEntity<SelectOneResponseDto> selectOne(@PathVariable("empCd") SelectOneRequestDto empDto ){
		
		System.out.println(empDto.toString());
		
		SelectOneResponseDto rEmpDto = empService.selectOneEmp(empDto);
		
	    return new ResponseEntity<>(rEmpDto, HttpStatus.OK);

	}

	@PostMapping("/emp")
	public ResponseEntity<Void> insertEmp(@RequestBody InsertRequestDto empDto) {

		empService.insertEmp(empDto);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PutMapping("/emp")
	public ResponseEntity<Void> uupdateEmp(@RequestBody UpdateRequestDto empDto) {
		
		empService.updateEmp(empDto);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@DeleteMapping("/emp/{empCd}")
	public ResponseEntity<Void> deleteEmp(@PathVariable("empCd") DeleteRequestDto empDto) {
		
		
		empService.deleteEmp(empDto);
		System.out.println(empDto.toString());
		
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
