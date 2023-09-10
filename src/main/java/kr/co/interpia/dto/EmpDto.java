package kr.co.interpia.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class EmpDto {

	@Setter
	@Getter
	@Builder
	@AllArgsConstructor
	public static class RequestDto {
		
		private String empCd = "";			//��� �ڵ�
		private String empId = "";			//��� ���̵�
		private String empPw = "";			//��� �н�����
		private String korNm = "";			//�ѱ� �̸�
		private String engNm = "";			//���� �̸�
		private String chaNm = "";			//�ѹ� �̸�
		private String regNb = "";			//�ֹε�Ϲ�ȣ
		private String imgNm = "";			//���� �̸�
		private String imgPath = "";		//���� ���
		private String birthDt = "";		//�������
		private String birthTp = "";		//���� Ÿ��
		private String gender = "";			//����
		private String matrial = "";		//��ȥ����
		private String year = "";			//����
		private String salTp = "";			//�޿���������
		private String desJob = "";			//�������
		private String joinTp = "";			//�Ի�����
		private String addr = "";			//�ּ�
		private String addrDtl = "";		//���ּ�
		private String contact = "";		//����ó
		private String email = "";			//�̸���
		private String techLv = "";			//������
		private String drink = "";			//�ַ�
	}
	
	@Setter
	@Getter
	@Builder
	@AllArgsConstructor
	public static class ResponseDto implements Serializable {
		
		private String empCd = "";			//��� �ڵ�
		private String empId = "";			//��� ���̵�
		private String empPw = "";			//��� �н�����
		private String korNm = "";			//�ѱ� �̸�
		private String engNm = "";			//���� �̸�
		private String chaNm = "";			//�ѹ� �̸�
		private String regNb = "";			//�ֹε�Ϲ�ȣ
		private String imgNm = "";			//���� �̸�
		private String imgPath = "";		//���� ���
		private String birthDt = "";		//�������
		private String birthTp = "";		//���� Ÿ��
		private String gender = "";			//����
		private String matrial = "";		//��ȥ����
		private String year = "";			//����
		private String salTp = "";			//�޿���������
		private String desJob = "";			//�������
		private String joinTp = "";			//�Ի�����
		private String addr = "";			//�ּ�
		private String addrDtl = "";		//���ּ�
		private String contact = "";		//����ó
		private String email = "";			//�̸���
		private String techLv = "";			//������
		private String drink = "";			//�ַ�
		
	}
	
	@Setter
	@Getter
	@Builder
	@ToString
	@AllArgsConstructor
	public static class insert {
		
		private String korNm = "";			//�ѱ� �̸�
		private String engNm = "";			//���� �̸�
		private String chaNm = "";			//�ѹ� �̸�
		private String regNb = "";			//�ֹε�Ϲ�ȣ
		private String imgNm = "";			//���� ���ϸ�
		private String imgPath = "";		//���� ���ϰ��
		private String birthDt = "";		//�������
		private String birthTp = "";		//���� Ÿ��
		private String gender = "";			//����
		private String matrial = "";		//��ȥ����
		private String year = "";			//����
		private String salTp = "";			//�޿���������
		private String desJob = "";			//�������
		private String joinTp = "";			//�Ի�����
		private String addr = "";			//�ּ�
		private String addrDtl = "";		//���ּ�
		private String contact = "";		//����ó
		private String email = "";			//�̸���
		private String techLv = "";			//������
		private String drink = "";			//�ַ�
		private String insertDt = "";		//�������
		private String modifyDt = "";		//��������
		
	}
	
	public static class update {
		private String korNm = "";			//�ѱ� �̸�
		private String engNm = "";			//���� �̸�
		private String chaNm = "";			//�ѹ� �̸�
		private String regNb = "";			//�ֹε�Ϲ�ȣ
		private String imgNm = "";			//���� ���ϸ�
		private String imgPath = "";		//���� ���ϰ��
		private String birthDt = "";		//�������
		private String birthTp = "";		//���� Ÿ��
		private String gender = "";			//����
		private String matrial = "";		//��ȥ����
		private String year = "";			//����
		private String salTp = "";			//�޿���������
		private String desJob = "";			//�������
		private String joinTp = "";			//�Ի�����
		private String addr = "";			//�ּ�
		private String addrDtl = "";		//���ּ�
		private String contact = "";		//����ó
		private String email = "";			//�̸���
		private String techLv = "";			//������
		private String drink = "";			//�ַ�
		private String insertDt = "";		//�������
		private String modifyDt = "";		//��������
	}
	
	@ToString
	@Setter
	@Getter
	@Builder
	public static class delete {
		private String empCd = "";
	}
	
	public static class detail {
		private String empCd = "";
	}
	
	public static class search {
		private String keyword = "";
	}
	
	
}
