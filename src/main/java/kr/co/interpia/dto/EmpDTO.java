package kr.co.interpia.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class EmpDTO {
	String empId = "";
	String empPw = "";
	String empNm = "";
}
