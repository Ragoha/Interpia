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
public class School {
	
	private String empCd = "";			
	private int schCd = 0;			
	private String schNm = "";			
	private String schCtg = "";			
	private String major = "";			
	private String gradPer = "";			
	private String insertDt = "";			
	private String modifyDt = "";			

}
