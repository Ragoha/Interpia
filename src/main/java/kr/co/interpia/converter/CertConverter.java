package kr.co.interpia.converter;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import kr.co.interpia.domain.Cert;
import kr.co.interpia.dto.CertDto.CertRequestDto;
import kr.co.interpia.util.CommonUtil;

public class CertConverter {
	public static Cert convertToModel(CertRequestDto certRequestDto) {
		
		Cert cert = Cert.builder()
				.certCd(certRequestDto.getCertCd())
				.certNm(certRequestDto.getCertNm())
				.certDt(certRequestDto.getCertDt())
				.insertDt(CommonUtil.getCurrentFormattedDate())
				.modifyDt(CommonUtil.getCurrentFormattedDate())
				.build();
		
		return cert;
	}
	
	public static List<Cert> convertToModelList(List<CertRequestDto> certRequestDtoList){
		return certRequestDtoList.stream().map(CertConverter::convertToModel).collect(Collectors.toList());
	}
}
