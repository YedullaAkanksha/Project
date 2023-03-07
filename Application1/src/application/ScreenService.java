package application;

public class ScreenService {
	static WelcomePage wc=new WelcomePage();
	public static FileOptionsScreen fm=new FileOptionsScreen();
	static Screen CurrentScreen=wc;
	public static Screen getCurrentScreen() {
		return CurrentScreen;
	
	}
	public static void setCurrentScren(Screen currentScreen) {
		CurrentScreen=currentScreen;
	}
}
