package com.combat.objrepo;

import org.testng.annotations.Test;

public class CreateContacact {
	@Test
	public void createcontact() {
		System.out.println("Createcontact");
	}
	@Test
	public void createcontact(String name) {
		System.out.println("Createcontact");
	}

	@Test
	public void createcontact(String name,String adress) {
		System.out.println("Createcontact");
	}
	@Test
	public void createcontact(int i,String name,String adress) {


	}
	@Test
	public void createcontact(long l,String name,String adress) {
		System.out.println("Createcontact");
	}
}
