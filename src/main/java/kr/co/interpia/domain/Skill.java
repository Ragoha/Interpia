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
public class Skill {

	private String empCd = "";			//사원 코드
	private String skillCd = "";		
	private String skillNm = "";		
	private String skillPf = "";		
	private String insertDt = "";		
	private String modifyDt = "";		
	
}
