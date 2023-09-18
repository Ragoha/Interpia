package kr.co.interpia.service;

import org.springframework.stereotype.Service;

import kr.co.interpia.converter.CareerConverter;
import kr.co.interpia.dto.CareerDto.InsertRequestDto;
import kr.co.interpia.mapper.CareerMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CareerServiceImpl implements CareerService{
	
	private final CareerMapper careerMapper;
	
	@Override
	public void insertCareer(InsertRequestDto careerDto) {
		careerMapper.insertCareer(CareerConverter.convertToModel(careerDto));
	}

}
