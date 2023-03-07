package application;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FilesMenu implements Screen{
	Directory d=new Directory();
	ArrayList<String> menu=new ArrayList<>();
	public FilesMenu() {
		System.out.println("Actions on Files");
		menu.add("1.Add");
		menu.add("2.Delete");
		menu.add("3.Search");
		menu.add("4.Goto Menu");
	}

	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println("File Menu");
		for(String s:menu) {
			System.out.println(s);
		}
		
	}

	@Override
	public void Navigate(int menu) {
		// TODO Auto-generated method stub
		switch(menu) {
		case 1:
			this.addfile();
			this.Show();
			break;
		case 2:
			this.deletefile();
			this.Show();
			break;
		case 3:
			this.searchfile();
			this.Show();
			break;
		case 4:
			ScreenService.setCurrentScreen(ScreenService.FileOptionScreen);
			ScreenService.setCurrentScreen().Show();
			ScreenService.setCurrentScreen().option();
			this.Show();
			break;
		default:
			System.out.println("Invalid");
			break;
		
		}
	}

	@Override
	public Void option() {
		// TODO Auto-generated method stub
		int input;
		while(input!=4) {
			this.Navigate(input);
				
			}
		
		//return null;
	}
	public void addfile() {
		System.out.println("filename is..");
		String filename=this.getInput();
		System.out.println("filename is adding"+ filename);
		//path
	}
	public void deletefile() {
		System.out.println("filename is..");
		String filename=this.getInput();
		System.out.println("filename is deleting"+ filename);
		//path
	}
	public void searchfile() {
		Boolean found;
		System.out.println("filename is..");
		String filename=this.getInput();
		System.out.println("you are searcging"+ filename);
		ArrayList<File> files=d.getFiles();
		for(int i=0;i<files.size();i++) {
			if(files.get(i).getName().equals(filename)) {
				System.out.println("Found"+filename);
				found=true;
				
			}
		}
		if(found==false) {
			System.out.println("file not found");
		}
	}
	String getInput() {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		}
		
	}
	

}
