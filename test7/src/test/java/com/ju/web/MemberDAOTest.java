package com.ju.web;
import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

/*public class MemberDAOTest {
	@Inject
	private MemberDAO dao;

	@Test
	public void testTime() throws Exception{
		System.out.println(dao.getTime());
	}
	
	@Test
	public void testInsertMember() throws Exception{
		MemberVo vo = new MemberVo();
		vo.setUserid("user01");
		vo.setUserpw("user01");
		vo.setUsername("user01");
		vo.setEmail("user01@aaa.com");
		
		dao.insertMember(vo);
	}
	
	@Test
	public void testToString() throws Exception{
		MemberVo vo = dao.readMember("ju001");
		
		System.out.println(vo);
	}
}
*/