package com.instagram.service;

import com.instagram.dao.InstagramDAO;
import com.instagram.dao.InstagramDAOInterface;
import com.instagram.entity.InstagramUser;

public class InstagramService implements InstagramServiceInterface {

	public int createProfileService(InstagramUser iu) {
		// TODO Auto-generated method stub
		InstagramDAOInterface id=new InstagramDAO();
		int i=id.createProfileDAO();
		return 0;
	}

}
