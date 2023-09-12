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
public class Emp {
	
	private String empCd = "";			//사원 코드
	private String empId = "";			//사원 아이디
	private String empPw = "";			//사원 패스워드
	private String korNm = "";			//한글 이름
	private String engNm = "";			//영어 이름
	private String chaNm = "";			//한문 이름
	private String regNb = "";			//주민등록번호
	private String imgNm = "";			//사진 이름
	private String imgPath = "";		//사진 경로
	private String birthDt = "";		//생년월일
	private String birthTp = "";		//생일 타입
	private String gender = "";			//성별
	private String marital = "";		//결혼유무
	private String year = "";			//연차
	private String salTp = "";			//급여지급유형
	private String desJob = "";			//희망직무
	private String joinTp = "";			//입사유형
	private String zipCd = "";			//우편번호
	private String addr = "";			//주소
	private String addrDtl = "";		//상세주소
	private String phone = "";			//연락처
	private String email = "";			//이메일
	private String techLv = "";			//기술등급
	private String drink = "";			//주량
	private String insertDt = "";		//등록일자
	private String modifyDt = "";		//수정일자
	
}
