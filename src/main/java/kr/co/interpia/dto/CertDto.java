package kr.co.interpia.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class CertDto {
	
	@ToString
	@Getter
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class CertRequestDto{
		
		private int certCd;
		private String certNm;
		private String certDt;
		
	}
	
	@ToString
	@Getter
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class CertResponseDto{ 
		private int certCd;
		private String certNm;
		private String certDt;
	}
}
