package kr.co.interpia.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class SkillDto {

	@ToString
	@Getter
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class SkillRequestDto {
		private int skillCd;
		private String skillNm;
		private String skillPf;
	}
	
	@ToString
	@Getter
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class SkillResponseDto {
		private int skillCd;
		private String skillNm;
		private String skillPf;
	}
} 

