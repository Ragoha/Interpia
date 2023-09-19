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

import kr.co.interpia.domain.Biz;
import kr.co.interpia.dto.BizDto.DeleteRequestDto;
import kr.co.interpia.dto.BizDto.InsertRequestDto;
import kr.co.interpia.dto.BizDto.SearchRequestDto;
import kr.co.interpia.dto.BizDto.SelectRequestDto;
import kr.co.interpia.dto.BizDto.SelectResponseDto;
import kr.co.interpia.dto.BizDto.UpdateRequestDto;
import kr.co.interpia.service.BizService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BizController {
	
	private final BizService bizService;
	
	@PostMapping("/biz")
	public ResponseEntity<Void> insertBiz(@RequestBody InsertRequestDto bizDto){
		
		bizService.insertBiz(bizDto);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
//	@GetMapping("/biz")
//	public ResponseEntity<List<Biz>> getBizList(){
//		List<Biz> bizList = bizService.getBizList();
//		
//		return new ResponseEntity<List<Biz>>(bizList,HttpStatus.OK);
//		
//	}
	
	@GetMapping("/biz/{coCd}")
	public ResponseEntity<SelectResponseDto> selectBiz(@PathVariable("coCd") SelectRequestDto bizDto){
		
		SelectResponseDto rbizDto = bizService.selectBiz(bizDto);
		
		return new ResponseEntity<>(rbizDto, HttpStatus.OK);
	}
	
	@PutMapping("/biz")
	public ResponseEntity<Void> updateBiz(@RequestBody UpdateRequestDto bizDto){
		
		bizService.updateBiz(bizDto);
		System.out.println(bizDto.toString());
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@DeleteMapping("/biz/{coCd}")
	public ResponseEntity<Void> deleteBiz(@PathVariable("coCd") DeleteRequestDto bizDto){
		
		bizService.deleteBiz(bizDto);
		System.out.println(bizDto.toString());
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/biz")
	public ResponseEntity<List<Biz>> getBizByCoNm(SearchRequestDto bizDto){
		List<Biz> bizList = bizService.getBizByCoNm(bizDto);
		
		return new ResponseEntity<List<Biz>>(bizList,HttpStatus.OK);
	}

}
