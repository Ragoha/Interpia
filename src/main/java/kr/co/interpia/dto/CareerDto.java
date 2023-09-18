package kr.co.interpia.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class CareerDto {
	
	@Getter
	@Builder
	@ToString
	@AllArgsConstructor
	@NoArgsConstructor
	public static class InsertRequestDto {
		
		private String empCd;			
		private int expCd;			
		private String company;			
		private String pos;			
		private String expPer;			
		private String role;			
		private String insertDt;			
		private String modifyDt;		
		
	}

}
