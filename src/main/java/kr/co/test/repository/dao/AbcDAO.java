package kr.co.test.repository.dao;

import java.util.List;

import kr.co.test.repository.vo.UserVO;

public interface AbcDAO {

	public List<UserVO> getList() throws Exception;

}
