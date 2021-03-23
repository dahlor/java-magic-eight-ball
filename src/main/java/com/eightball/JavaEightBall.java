package com.eightball;

import com.eightball.view.Menu;

public class JavaEightBall {
	
	private Menu menu;
	private static final String MAIN_MENU_OPTION_SHAKE = "Ask a question and shake the Magic Eight Ball";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit Program";
	private static final String[] MAIN_MENU_OPTIONS = new String[] {MAIN_MENU_OPTION_SHAKE, MAIN_MENU_OPTION_EXIT};
	
	public static void main(String[] args) throws InterruptedException {
		JavaEightBall application = new JavaEightBall();
		application.run();
	}
	
	public JavaEightBall() {  
		this.menu = new Menu(System.in, System.out);
	}
	
	private void run() throws InterruptedException {
		while(true) {
			displayApplicationBanner();	
			printHeading("Main Menu");
			String choice = (String)menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			if(choice.equals(MAIN_MENU_OPTION_SHAKE)) {
				shimmyShimmyShake();
			} else if(choice.equals(MAIN_MENU_OPTION_EXIT)) {
				System.out.println("\n" + "-".repeat(54) + "\n The Magic Eight Ball will patiently await your return."+ "\n" + "-".repeat(54) + "\n");
				System.exit(0);
			}
		}
	}
	
	private void printHeading(String headingText) {
		System.out.println("\n"+headingText);
		for(int i = 0; i < headingText.length(); i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	private void shimmyShimmyShake() {
		
		
		
	}
		
	private void displayApplicationBanner() {
		System.out.println();
		System.out.println("█▀▄▀█ ██     ▄▀  ▄█ ▄█▄        ▄███▄   ▄█   ▄▀   ▄  █    ▄▄▄▄▀     ███   ██   █     █     ");
		System.out.println("█ █ █ █ █  ▄▀    ██ █▀ ▀▄      █▀   ▀  ██ ▄▀    █   █ ▀▀▀ █        █  █  █ █  █     █     ");
		System.out.println("█ ▄ █ █▄▄█ █ ▀▄  ██ █   ▀      ██▄▄    ██ █ ▀▄  ██▀▀█     █        █ ▀ ▄ █▄▄█ █     █     ");
		System.out.println("█   █ █  █ █   █ ▐█ █▄  ▄▀     █▄   ▄▀ ▐█ █   █ █   █    █         █  ▄▀ █  █ ███▄  ███▄  ");
		System.out.println("   █     █  ███   ▐ ▀███▀      ▀███▀    ▐  ███     █    ▀          ███      █     ▀     ▀ ");
		System.out.println("  ▀     █                                         ▀                        █              ");
		System.out.println("       ▀                                                                  ▀               ");
	}
}