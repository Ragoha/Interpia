package kr.co.interpia.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class EmpDto {
	
	@ToString
	@Getter
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class SelectListEmpResponseDto {
		
		private String empCd;				//��� ��ȣ
		private String empNm;				//��� �̸�
		private String regNb;				//�ֹε�Ϲ�ȣ
		private String gender;				//����
		private String techLv;				//������
		private String year;				//���
		private String client;				//�ŷ�ó
		
	}
	

	@Getter
	@Builder
	@ToString
	@AllArgsConstructor
	@NoArgsConstructor
	public static class SelectOneEmpRequestDto {
		private String empCd;				//��� ��ȣ
	}
	
	@ToString
	@Getter
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class SelectOneEmpResponseDto {
		
		private String empCd;				//��� �ڵ�
		private String empId;				//��� ID
		private String korNm;				//�ѱ� �̸�
		private String engNm;				//���� �̸�
		private String chaNm;				//�ѹ� �̸�
		private String regNb;				//�ֹε�Ϲ�ȣ
		private String imgNm;				//���� ���ϸ�
		private String imgPath;				//���� ���ϰ��
		private String birthDt;				//�������
		private String birthTp;;			//���� Ÿ��
		private String gender;				//����
		private String marital;				//��ȥ����
		private String year;				//����
		private String salTp;				//�޿���������
		private String desJob;				//�������
		private String joinTp;				//�Ի�����
		private String zipCd;				//�����ȣ
		private String addr;				//�ּ�
		private String addrDtl;				//���ּ�
		private String phone;				//����ó
		private String email;				//�̸���
		private String techLv;				//������
		private String drink;				//�ַ�

		
	}
	
	@ToString
	@Getter
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class SearchEmpRequestDto {
		private String keyword = "";
	}
	
	@Getter
	@Builder
	@ToString
	@AllArgsConstructor
	@NoArgsConstructor
	public static class InsertEmpRequestDto {
		
		private String empCd;				
		private String empId;				
		private String empPw;				
		private String korNm;				
		private String engNm;				
		private String chaNm;				
		private String regNb;				
		private String imgNm;				
		private String imgPath;				
		private String birthDt;				
		private String birthTp;;			
		private String gender;				
		private String marital;				
		private String year;			
		private String salTp;				
		private String desJob;				
		private String joinTp;				
		private String zipCd;				
		private String addr;			
		private String addrDtl;			
		private String phone;			
		private String email;			
		private String techLv;			
		private String drink;				
		private String insertDt;			
		private String modifyDt;			
		
	}
	
	@Getter
	@Builder
	@ToString
	@AllArgsConstructor
	@NoArgsConstructor
	public static class UpdateEmpRequestDto {
		
		private String empCd;				
		private String korNm;				
		private String engNm;				
		private String chaNm;				
		private String regNb;				
		private String imgNm;			
		private String imgPath;			
		private String birthDt;			
		private String birthTp;;			
		private String gender;			
		private String marital;			
		private String year;			
		private String salTp;			
		private String desJob;			
		private String joinTp;			
		private String zipCd;			
		private String addr;			
		private String addrDtl;			
		private String phone;			
		private String email;			
		private String techLv;			
		private String drink;			
		
	}
	
	@ToString
	@Getter
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class DeleteEmpRequestDto {
		private String empCd = "";
	}
	


	
	
}
