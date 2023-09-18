package kr.co.interpia.dto;

import java.util.List;

import kr.co.interpia.dto.CertDto.CertRequestDto;
import kr.co.interpia.dto.SkillDto.SkillRequestDto;
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
		private List<CertRequestDto> CertRequestDtoList;
		private List<SkillRequestDto> SkillRequestDtoList;
	}
	
}
