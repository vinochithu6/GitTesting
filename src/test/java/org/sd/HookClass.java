package org.sd;

import org.junit.After;
import org.junit.Before;
import org.sam.BaseClass;

public class HookClass extends BaseClass {
	@Before
	private void precondition1() {
		launchBrowser();
		System.out.println("launch the Browser");

	}
	@Before
	private void precondition2() {
		
		windowMaximize();
		System.out.println(" Max the window");

	}
	@Before
	private void precondition3() {
		System.out.println("Precondition 3");

	}
	@After
	private void postcondition2() {
		System.out.println("Take sceenshot of scenarios");

	}
	@After
	private void postcondition1() {
		closeEntrieBrowser();
		System.out.println("close Entrie Browser");

	}
	

}
