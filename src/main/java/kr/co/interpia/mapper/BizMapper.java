package kr.co.interpia.mapper;

import java.util.List;

import kr.co.interpia.domain.Biz;

public interface BizMapper {
	
	public List<Biz> getBizList();

	public void insertBiz(Biz biz);
	
	public void updateBiz(Biz biz);
	
	public void deleteBiz(Biz biz);
	
	public Biz selectBiz(Biz biz);

}
