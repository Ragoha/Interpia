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
public class Emp {
	
	private String empCd = "";			//사원 코드
	private String empId = "";			
	private String empPw = "";			
	private String korNm = "";			
	private String engNm = "";			
	private String chaNm = "";			
	private String regNb = "";			
	private String imgNm = "";			
	private String imgPath = "";		
	private String birthDt = "";		
	private String birthTp = "";		
	private String gender = "";			
	private String marital = "";		
	private String year = "";			
	private String salTp = "";			
	private String desJob = "";			
	private String joinTp = "";			
	private String zipCd = "";			
	private String addr = "";			
	private String addrDtl = "";		
	private String phone = "";			
	private String email = "";			
	private String techLv = "";			
	private String drink = "";			
	private String insertDt = "";		
	private String modifyDt = "";		
	
}
