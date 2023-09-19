package kr.co.interpia.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import kr.co.interpia.converter.BizConverter;
import kr.co.interpia.domain.Biz;
import kr.co.interpia.dto.BizDto.DeleteRequestDto;
import kr.co.interpia.dto.BizDto.InsertRequestDto;
import kr.co.interpia.dto.BizDto.SearchRequestDto;
import kr.co.interpia.dto.BizDto.SelectRequestDto;
import kr.co.interpia.dto.BizDto.SelectResponseDto;
import kr.co.interpia.dto.BizDto.UpdateRequestDto;
import kr.co.interpia.mapper.BizMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BizServiceImpl implements BizService{
	
	private final BizMapper bizMapper;

	@Override
	public void insertBiz(InsertRequestDto bizDto) {
		bizMapper.insertBiz(BizConverter.convertToModel(bizDto));
	}

	@Override
	public void updateBiz(UpdateRequestDto bizDto) {
		bizMapper.updateBiz(BizConverter.convertToModel(bizDto));
		
	}

	@Override
	public void deleteBiz(DeleteRequestDto bizDto) {
		bizMapper.deleteBiz(BizConverter.convertToModel(bizDto));
		
	}

	@Override
	public SelectResponseDto selectBiz(SelectRequestDto bizDto) {
		Biz biz = bizMapper.selectBiz(BizConverter.convertToModel(bizDto));
		
		return BizConverter.convertToSelectResponseDto(biz);
	}

	@Override
	public List<Biz> getBizList() {
		List<Biz> biz = bizMapper.getBizList();
		return biz;
	}

	@Override
	public List<Biz> getBizByCoNm(SearchRequestDto bizDto) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("keyword", "더존");
		
		List<Biz> bizList = bizMapper.getBizBycoNm(paramMap);
		
		System.out.println(bizList.toString());
		return bizList;
	}

	
	

}
