package kr.co.interpia.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Biz {
	
	private int coCd = 0;			
	private String coNm = "";			
	private String coNb = "";			
	private String ceo = "";			
	private String sector = "";			
	private String bizTp = "";			
	private String zipCd = "";			
	private String addr = "";			
	private String addrDtl = "";			
	private String phone = "";			
	private String fax = "";			
	private String contact = "";			
	private String mobile = "";			
	private String insertDt = "";			
	private String modifyDt = "";			

}
