package kr.co.interpia.converter;

import kr.co.interpia.domain.Biz;
import kr.co.interpia.dto.BizDto.DeleteRequestDto;
import kr.co.interpia.dto.BizDto.InsertRequestDto;
import kr.co.interpia.dto.BizDto.SelectRequestDto;
import kr.co.interpia.dto.BizDto.SelectResponseDto;
import kr.co.interpia.dto.BizDto.UpdateRequestDto;
import kr.co.interpia.util.CommonUtil;

public class BizConverter {
	
	public static Biz convertToModel(InsertRequestDto BizDto) {
		
		Biz biz = Biz.builder()
				.coCd(BizDto.getCoCd())
				.coNm(BizDto.getCoNm())
				.coNb(BizDto.getCoNb())
				.ceo(BizDto.getCeo())
				.sector(BizDto.getSector())
				.bizTp(BizDto.getBizTp())
				.zipCd(BizDto.getZipCd())
				.addr(BizDto.getAddr())
				.addrDtl(BizDto.getAddrDtl())
				.phone(BizDto.getPhone())
				.fax(BizDto.getFax())
				.contact(BizDto.getContact())
				.mobile(BizDto.getMobile())
				.insertDt(CommonUtil.getCurrentFormattedDate())
				.modifyDt(CommonUtil.getCurrentFormattedDate())
				.build();
		
		return biz;
		
	}
	
	public static Biz convertToModel(SelectRequestDto BizDto) {
		
		Biz biz = Biz.builder()
				.coCd(BizDto.getCoCd())
				.build();
		
		return biz;
		
	}
	
	public static SelectResponseDto convertToSelectResponseDto(Biz biz) {
		return SelectResponseDto.builder()
				.coCd(biz.getCoCd())
				.coNm(biz.getCoNm())
				.coNb(biz.getCoNb())
				.ceo(biz.getCeo())
				.sector(biz.getSector())
				.bizTp(biz.getBizTp())
				.zipCd(biz.getZipCd())
				.addr(biz.getAddr())
				.addrDtl(biz.getAddrDtl())
				.phone(biz.getPhone())
				.fax(biz.getFax())
				.contact(biz.getContact())
				.mobile(biz.getMobile())
				.build();
	}
	
	public static Biz convertToModel(UpdateRequestDto BizDto) {
		
		Biz biz = Biz.builder()
				.coCd(BizDto.getCoCd())
				.coNm(BizDto.getCoNm())
				.coNb(BizDto.getCoNb())
				.ceo(BizDto.getCeo())
				.sector(BizDto.getSector())
				.bizTp(BizDto.getBizTp())
				.zipCd(BizDto.getZipCd())
				.addr(BizDto.getAddr())
				.addrDtl(BizDto.getAddrDtl())
				.phone(BizDto.getPhone())
				.fax(BizDto.getFax())
				.contact(BizDto.getContact())
				.mobile(BizDto.getMobile())
				.modifyDt(CommonUtil.getCurrentFormattedDate())
				.build();
		
		return biz;
		
	}
	
	public static Biz convertToModel(DeleteRequestDto BizDto) {
		
		Biz biz = Biz.builder()
				.coCd(BizDto.getCoCd())
				.build();
		
		return biz;
		
	}

}
