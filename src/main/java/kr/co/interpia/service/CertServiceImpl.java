package kr.co.interpia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.interpia.domain.Cert;
import kr.co.interpia.mapper.CertMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CertServiceImpl implements CertService{
	
	private final CertMapper certMapper;
	
	@Override
	public int getCountCertByEmpCd(Cert cert) {
		
		return certMapper.getCountCertByEmpCd(cert);
	
	}
	
	@Override
	public void insertCert(Cert cert) {
		
		certMapper.insertCert(cert);
		
	}

	@Override
	public void updateCert(Cert cert) {

		certMapper.updateCert(cert);
		
	}

	@Override
	public void deleteCert(Cert cert) {
		
		certMapper.deleteCert(cert);
		
	}

	@Override
	public List<Cert> selectListCert(Cert cert) {
		
		return certMapper.selectListCert(cert);
	
	}

}
