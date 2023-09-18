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
public class Work {
	
	private String empCd = "";			//사원코드
	private int workCd = 0;			
	private String pjtNm = "";			
	private String branch = "";			
	private String workPer = "";			
	private Long rev = 0L;		         
	private String dueDt = "";			
	private String payDt = "";			
	private String client = "";			
	private String insertDt = "";			
	private String modifyDt = "";			

}
