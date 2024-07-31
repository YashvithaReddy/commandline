package com.instagram.controller;

import java.util.Scanner;

import com.instagram.entity.InstagramUser;
import com.instagram.service.InstagramService;
import com.instagram.service.InstagramServiceInterface;



public class InstagramController implements InstagramControllerInterface {

	@Override
	public void createProfileController() {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name:");
		String name=sc.next();
		
		System.out.println("Enter password:");
		String password=sc.next();
		
		System.out.println("Enter email:");
		String email=sc.next();
		
		System.out.println("Enter address:");
		String address=sc.next();
		
		InstagramUser iu=new InstagramUser();
		
		iu.setName(name);
		iu.setPassword(password);
		iu.setEmail(email);
		iu.setAddress(address);
		
		InstagramServiceInterface ii=new InstagramService();
		int i=ii.createProfileService(iu);
		
		if(i>0) {
			System.out.println("Profile created");
		}
		else {
			System.out.println("Profile rejected");
		}


	}

	@Override
	public void viewProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void editProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewAllProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loginProfileController() {
		// TODO Auto-generated method stub

	}

}
