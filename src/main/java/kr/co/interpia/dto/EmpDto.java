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
	public static class SelectListResponseDto {
		
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
	public static class SelectOneRequestDto {
		private String empCd;				//��� ��ȣ
	}
	
	@ToString
	@Getter
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class SelectOneResponseDto {
		
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
	public static class SearchRequestDto {
		private String keyword = "";
	}
	
	@Getter
	@Builder
	@ToString
	@AllArgsConstructor
	@NoArgsConstructor
	public static class InsertRequestDto {
		
		private String empCd;				//��� �ڵ�
		private String empId;				//��� ���̵�
		private String empPw;				//��� ��й�ȣ
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
		private String insertDt;			//�������
		private String modifyDt;			//��������
		
	}
	
	@Getter
	@Builder
	@ToString
	@AllArgsConstructor
	@NoArgsConstructor
	public static class UpdateRequestDto {
		
		private String empCd;				//��� �ڵ�
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
	public static class DeleteRequestDto {
		private String empCd = "";
	}
	


	
	
}
