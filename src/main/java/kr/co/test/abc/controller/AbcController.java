package kr.co.test.abc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.test.abc.service.AbcService;
import kr.co.test.repository.vo.UserVO;

@Controller
public class AbcController {
	
	@Autowired
	AbcService service;

	
	
	@RequestMapping("/test/abc.do")
	public void abc()throws Exception {
		
		System.out.println("asdasdas");
	}
	
	
	@RequestMapping("/test/def.do")
	public Map<String, Object> def() throws Exception {
		System.out.println("sds");
		
		Map<String, Object> param = new HashMap<>();
		
		List<UserVO> userList = service.getList();
		
		String str = userList.get(0).getUserEmail().toString();
		
		param.put("userList", userList);
		param.put("userNickName", str);
		
		for (UserVO strs : userList) {
			System.out.println(strs.getUserEmail());
			System.out.println(strs.getUserNickName());
		}
		
		System.out.println("#############" + str);
		System.out.println("#############" + str);
		System.out.println("#############" + str);
		System.out.println("#############" + str);
		
		return param;
		
//		return "test/def";
		
	}
	
}
