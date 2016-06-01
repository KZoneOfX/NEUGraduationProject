package com.nb.org.testService;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nb.org.service.IPersonService;


@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner�?
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestPersonService {

	
	@Resource
	private IPersonService personService = null;
	
	@Test
	public void test() throws Exception {
		int password = personService.changePassword("admin", "admin", "123456");
		System.out.println(password);
	}

}
