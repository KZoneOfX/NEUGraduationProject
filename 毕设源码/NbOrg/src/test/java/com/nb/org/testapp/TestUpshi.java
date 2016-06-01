package com.nb.org.testapp;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nb.org.domain.Department;
import com.nb.org.domain.Person;
import com.nb.org.exception.PersonException;
import com.nb.org.service.IAppInfoService;
import com.nb.org.service.IDepartmentService;
import com.nb.org.service.IPersonService;
import com.nb.org.util.StringUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestUpshi {

	@Autowired
	IPersonService personService;
	
	@Autowired
	IDepartmentService departmentService;
	
	@Autowired
	IAppInfoService appInfoService;
	
	@Test
	public void testAuthenticate() throws Exception {
		Department department = departmentService.getDepartmentById(1);
		System.out.println(department.getParentdep());
		//assertEquals(true, personService.authenticate("admin", "admin1"));
	}
	
	@Test
	public void test() {
		List<String> personUserNames = new ArrayList<String>();
		personUserNames.add("admin");
		personUserNames.add("sdsad");
		personUserNames.add("234234");
		List<Person> personsByUserNames = personService.getPersonsByUserNames(personUserNames);
		System.out.println("-----------------------------------" + personsByUserNames);
	}
	
	@Test
	public void test3(){
//		try {
//			List<Person> person = personService.selectPersonsByName("宁波市管理员");
			boolean flag = false;
			try {
				 flag = personService.authenticate("admin", "admin");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(flag);
//		} catch (PersonException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	
	public static void main(String[] args) {
		
	}

}
