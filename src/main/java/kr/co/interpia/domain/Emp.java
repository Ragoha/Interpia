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
	private String marital = "";		//��ȥ����
	private String year = "";			//����
	private String salTp = "";			//�޿���������
	private String desJob = "";			//�������
	private String joinTp = "";			//�Ի�����
	private String zipCd = "";			//�����ȣ
	private String addr = "";			//�ּ�
	private String addrDtl = "";		//���ּ�
	private String phone = "";			//����ó
	private String email = "";			//�̸���
	private String techLv = "";			//������
	private String drink = "";			//�ַ�
	private String insertDt = "";		//�������
	private String modifyDt = "";		//��������
	
}
