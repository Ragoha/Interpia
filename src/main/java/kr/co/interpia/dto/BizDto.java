package kr.co.interpia.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class BizDto {
	
	@Getter
	@Builder
	@ToString
	@AllArgsConstructor
	@NoArgsConstructor
	public static class InsertRequestDto {
		
		private int coCd;
		private String coNm;			
		private String coNb;			
		private String ceo;			
		private String sector;			
		private String bizTp;			
		private String zipCd;			
		private String addr;			
		private String addrDtl;			
		private String phone;			
		private String fax;			
		private String contact;			
		private String mobile;			
		private String insertDt;			
		private String modifyDt;	
		
	}
	
	@ToString
	@Getter
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class SelectRequestDto {
		private int coCd;
	}
	
	@Getter
	@Builder
	@ToString
	@AllArgsConstructor
	@NoArgsConstructor
	public static class SelectResponseDto {
		
		private int coCd;
		private String coNm;			
		private String coNb;			
		private String ceo;			
		private String sector;			
		private String bizTp;			
		private String zipCd;			
		private String addr;			
		private String addrDtl;			
		private String phone;			
		private String fax;			
		private String contact;			
		private String mobile;			
		private String insertDt;			
		private String modifyDt;	
		
	}
	
	@Getter
	@Builder
	@ToString
	@AllArgsConstructor
	@NoArgsConstructor
	public static class UpdateRequestDto {
		
		private int coCd;
		private String coNm;			
		private String coNb;			
		private String ceo;			
		private String sector;			
		private String bizTp;			
		private String zipCd;			
		private String addr;			
		private String addrDtl;			
		private String phone;			
		private String fax;			
		private String contact;			
		private String mobile;			
		private String insertDt;			
		private String modifyDt;	
		
	}
	
	@ToString
	@Getter
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class DeleteRequestDto {
		private int coCd;
	}

}
