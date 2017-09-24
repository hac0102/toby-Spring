package kr.co.test.abc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.test.repository.dao.AbcDAO;
import kr.co.test.repository.vo.UserVO;

@Service
public class AbcServiceImpl implements AbcService {
	
	@Autowired
	AbcDAO dao;

	@Override
	public List<UserVO> getList() throws Exception {
		return dao.getList();
	}

}
