package com.nb.org.all;

import java.util.List;

import com.nb.org.domain.AppRolePerson;

public interface IAppRolePerService {
	
	int addPersonsToRole(List<AppRolePerson> appRolePersons);
	
	int removePersonsFromRole(List<AppRolePerson> appRolePersons);
	
}
