package kr.co.interpia.dto;

import java.util.List;

import kr.co.interpia.dto.CertDto.CertRequestDto;
import kr.co.interpia.dto.CertDto.CertResponseDto;
import kr.co.interpia.dto.SkillDto.SkillRequestDto;
import kr.co.interpia.dto.SkillDto.SkillResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class CertSkillDto {
	
	@Setter
	@Getter
	@Builder
	@ToString
	@AllArgsConstructor
	@NoArgsConstructor
	public static class CertSkillRequestDto {
		private String empCd;
		private List<CertRequestDto> certRequestDtoList;
		private List<SkillRequestDto> skillRequestDtoList;
	}
	
	@Setter
	@Getter
	@Builder
	@ToString
	@AllArgsConstructor
	@NoArgsConstructor
	public static class CertSkillResponseDto {
		
		private List<CertResponseDto> certResponseDtoList;
		private List<SkillResponseDto> skillResponseDtoList;
		
	}
	
	@Setter
	@Getter
	@Builder
	@ToString
	@AllArgsConstructor
	@NoArgsConstructor
	public static class SelectCertSkillRequestDto {
		private String empCd;
	}
	
}
