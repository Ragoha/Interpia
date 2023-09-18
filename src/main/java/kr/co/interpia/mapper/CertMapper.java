package kr.co.interpia.mapper;

import java.util.List;

import kr.co.interpia.domain.Cert;

public interface CertMapper {

	public void insertCert(Cert cert);
	
	public void updateCert(Cert cert);
	
	public void deleteCert(Cert cert);
	
	public List<Cert> selectListCert(Cert cert);
	
	public int getCountCertByEmpCd(Cert cert);
}
