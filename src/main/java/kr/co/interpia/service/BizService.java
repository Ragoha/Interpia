package kr.co.interpia.service;

import java.util.List;

import kr.co.interpia.domain.Biz;
import kr.co.interpia.dto.BizDto.DeleteRequestDto;
import kr.co.interpia.dto.BizDto.InsertRequestDto;
import kr.co.interpia.dto.BizDto.SelectRequestDto;
import kr.co.interpia.dto.BizDto.SelectResponseDto;
import kr.co.interpia.dto.BizDto.UpdateRequestDto;

public interface BizService {
	
	List<Biz> getBizList();
	
	void insertBiz(InsertRequestDto bizDto);
	
	void updateBiz(UpdateRequestDto bizDto);
	
	void deleteBiz(DeleteRequestDto bizDto);
	
	SelectResponseDto selectBiz(SelectRequestDto bizDto);

}
