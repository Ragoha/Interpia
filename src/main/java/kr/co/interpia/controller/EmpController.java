package kr.co.interpia.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.interpia.dto.EmpDto;

@RestController
public class EmpController {

	@PostMapping("/emp")
	public void insertEmp(EmpDto.delete empDto) {
		System.out.println(empDto.toString());
	}
}
