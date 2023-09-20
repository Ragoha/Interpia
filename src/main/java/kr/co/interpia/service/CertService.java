package kr.co.interpia.service;

import java.util.List;

import kr.co.interpia.domain.Cert;
import kr.co.interpia.dto.CertDto.CertResponseDto;

public interface CertService {

	public int getCountCertByEmpCd(Cert cert);

	public void insertCert(Cert cert);

	public void updateCert(Cert cert);

	public void deleteCert(Cert cert);

	public List<CertResponseDto> selectListCert(Cert cert);
	
}
