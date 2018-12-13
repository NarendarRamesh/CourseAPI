package com.naren;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	
	public List<User> getAllUsers()
	{
		List<User> userList = null;
		File userFile = new File("Users.txt");
		if(!userFile.exists())
		{
			long id = 10001L;
			User user = new User(id,"xyz","Naren","Male");
			userList = new ArrayList<>();
			userList.add(user);
		}
		else
		{
		try {
			FileInputStream fis= new FileInputStream(userFile);
			ObjectInputStream ois = new ObjectInputStream(fis);
			userList = (List<User>)ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		return userList;
	}
	public void saveUserList(List<User> userList)
	{
		File userFile = new File("User.txt");
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(userFile);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(userList);
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
