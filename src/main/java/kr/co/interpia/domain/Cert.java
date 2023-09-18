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
public class Cert {

	private String empCd = "";			//사원 코드
	private int certCd = 0;			//자격증 코드
	private String certNm = "";		
	private String certDt = "";			
	private String insertDt = "";		
	private String modifyDt = "";	
	
	
	public void initEmpCd(String empCd) {
		this.empCd = empCd;
	}
}
