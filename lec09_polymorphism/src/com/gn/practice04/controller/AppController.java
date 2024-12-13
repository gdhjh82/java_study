package com.gn.practice04.controller;

import com.gn.practice04.model.vo.AppFeatures;
import com.gn.practice04.model.vo.LoginMenu;

public class AppController {
	public void startMyApp() {
		
		AppFeatures LoginMenu = new LoginMenu();
		LoginMenu.display();
		LoginMenu.input();
		LoginMenu.close();
		
	}
}
