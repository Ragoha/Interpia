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
public class Career {
	
	private String empCd = "";			
	private int expCd = 0;			
	private String company = "";			
	private String pos = "";			
	private String expPer = "";			
	private String role = "";			
	private String insertDt = "";			
	private String modifyDt = "";			

}
