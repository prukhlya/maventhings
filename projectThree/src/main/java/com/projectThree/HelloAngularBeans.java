package com.projectThree;

import angularBeans.api.AngularBean;
import angularBeans.api.NGReturn;
import angularBeans.api.http.Get;

@AngularBean
public class HelloAngularBeans {

	@Get
	@NGReturn(model = "message")
	public String sayHello(String name) {

		return "hello " + name + " from AngularBeans !";

	}

}
