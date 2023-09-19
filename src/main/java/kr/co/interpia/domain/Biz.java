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
public class Biz {
	
	private String coCd = "";			//회사코드
	private String coNm = "";			//상호명
	private String coNb = "";			//사업자 등록번호
	private String ceo = "";			//대표자 이름
	private String sector = "";			//업종
	private String bizTp = "";			//업태
	private String zipCd = "";			//우편번호
	private String addr = "";			//회사주소
	private String addrDtl = "";		//회사 상세주소
	private String phone = "";			//전화번호
	private String fax = "";			//팩스번호
	private String contact = "";		//담당자
	private String mobile = "";			//핸드폰번호
	private String insertDt = "";		//등록일자
	private String modifyDt = "";		//수정일자

}
