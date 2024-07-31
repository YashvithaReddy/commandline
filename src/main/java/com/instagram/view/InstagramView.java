package com.instagram.view;

import java.util.Scanner;

import com.instagram.controller.InstagramController;
import com.instagram.controller.InstagramControllerInterface;



public class InstagramView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***************MAIN MENU****************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to delete profile");
		System.out.println("press 4 to edit profile");
		System.out.println("press 5 to search profile");
		System.out.println("press 6 to view all profile");
		System.out.println("press 7 to login profile");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice:");
	    int c=sc.nextInt();
	    InstagramControllerInterface ic=new InstagramController(); 
	    switch(c) {
	    case 1: 	
	    	ic.createProfileController();
	    	break;
	    case 2: 	
	    	ic.viewProfileController();
	    	break;
	    case 3: 	
	    	ic.deleteProfileController();
	    	break;
	    case 4: 	
	    	ic.editProfileController();
	    	break;
	    case 5: 	
	    	ic.searchProfileController();
	    	break;
	    case 6: 	
	    	ic.viewAllProfileController();
	    	break;
	    case 7: 	
	    	ic.loginProfileController();
	    	break;
	    	default:
	    		System.out.println("Wrong choice");
	}
	

}

}

	

	