package application;

import java.util.ArrayList;

public class WelcomePage implements Screen {
	String text="My first project";
	String developer="developer:Akanksha";
	ArrayList<String> menu=new ArrayList<>();
	public WelcomePage() {
		menu.add("1.Files List");
		menu.add("2.Operations on Files");
		menu.add("3.Exit");
		
	}
	public void display() {
		System.out.println(text);
		System.out.println(developer);
		Show();
		
	}
	public void Show() {
		System.out.println("Main Menu");
		for(String s:menu) {
			System.out.println(s);
		}
	}
	public void option() {
		int input;
		while(input!=3) {
			this.Navigate(input);
				
			}
		}
		public void Navigate(int menu) {
			switch(menu) {
			case 1:
				this.ShowFiles();
				this.Show();
				break;
			case 2:
				Screenservice.setCurrentScreen(ScreenService.FileOptionScreen);
				ScreenService.setCurrentScreen().Show();
				ScreenService.setCurrentScreen().option();
				this.Show();
				break;
			default:
				System.out.println("invalid");
				break;
			
		}
	}
		public void ShowFiles() {
			System.out.println("list of files are");
			DirService.printFiles();
		}
		
}
