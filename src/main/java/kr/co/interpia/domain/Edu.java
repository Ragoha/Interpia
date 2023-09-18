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
public class Edu {

	private String empCd = "";			
	private int eduCd = 0;			
	private String eduNm = "";			
	private String eduPer = "";			
	private String insertDt = "";			
	private String modifyDt = "";			
}
