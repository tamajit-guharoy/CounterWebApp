package com.mkyong.controller;

import org.junit.Test;
import org.springframework.ui.ModelMap;

import com.mkyong.controller.BaseController;

public class BaseControllerTest {
	@Test
public void testWelcome(){
	BaseController baseController=new BaseController();
	baseController.welcome(new ModelMap());
}
}
