package com.eightball;

import java.util.Random;

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
				System.out.println("\n" + "-".repeat(56) + "\n The Magic Eight Ball will patiently await your return."+ "\n" + "-".repeat(56) + "\n");
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
		menu.askYourQuestion();
		System.out.println();
		asciiEightBall();
		menu.pressEnter();
	}
		
	private void displayApplicationBanner() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("█▀▄▀█ ██     ▄▀  ▄█ ▄█▄        ▄███▄   ▄█   ▄▀   ▄  █    ▄▄▄▄▀     ███   ██   █     █     ");
		System.out.println("█ █ █ █ █  ▄▀    ██ █▀ ▀▄      █▀   ▀  ██ ▄▀    █   █ ▀▀▀ █        █  █  █ █  █     █     ");
		System.out.println("█ ▄ █ █▄▄█ █ ▀▄  ██ █   ▀      ██▄▄    ██ █ ▀▄  ██▀▀█     █        █ ▀ ▄ █▄▄█ █     █     ");
		System.out.println("█   █ █  █ █   █ ▐█ █▄  ▄▀     █▄   ▄▀ ▐█ █   █ █   █    █         █  ▄▀ █  █ ███▄  ███▄  ");
		System.out.println("   █     █  ███   ▐ ▀███▀      ▀███▀    ▐  ███     █    ▀          ███      █     ▀     ▀ ");
		System.out.println("  ▀     █                                         ▀                        █              ");
		System.out.println("       ▀                                                                  ▀               ");
	}
	
	private void asciiEightBall() {
		System.out.println();
		System.out.println("        _.a$$$$$a._");
		System.out.println("      ,$$$$$$$$$$$$$.");
		System.out.println("    ,$$$$$$$$$$$$$$$$$.");
		System.out.println("   d$$$$$$$$$$$$$$$$$$$b");
		System.out.println("  d$$$$$$$$~'\"`~$$$$$$$$b");
		System.out.println(" ($$$$$$$p   _   q$$$$$$$)           T H E  M A G I C  E I G H T  B A L L  H A S  S P O K E N :");
		System.out.println(" $$$$$$$$   (_)   $$$$$$$$");
		System.out.println(" $$$$$$$$   (_)   $$$$$$$$           " + randomizedResponse());
		System.out.println(" ($$$$$$$b       d$$$$$$$)");
		System.out.println("  q$$$$$$$$a._.a$$$$$$$$p");
		System.out.println("   q$$$$$$$$$$$$$$$$$$$p");
		System.out.println("    `$$$$$$$$$$$$$$$$$'");
		System.out.println("      `$$$$$$$$$$$$$'");
		System.out.println("        `~$$$$$$$~'");
		System.out.println();
		System.out.println();
	}
	
	public static String randomizedResponse() {
		String theResponse;
		String[] possibleResponses = new String[] {"It is certain.",
										"It is decidedly so.",
										"Without a doubt.",
										"Yes – definitely.",
										"You may rely on it.",
										"As i see it, yes.",
										"Most likely.",
										"Outlook good.",
										"Yes.",
										"Signs point to yes.",
										"Reply hazy, try again.",
										"Ask again later.",
										"Better not to tell you now.",
										"Cannot predict now.",
										"Concentrate and ask again.",
										"Don't count on it.",
										"My reply is no.",
										"My sources say no.",
										"Outlook not so good.",
										"Very doubtful."};
	
		Random rand = new Random();
		theResponse = possibleResponses [rand.nextInt(possibleResponses.length)];
		return theResponse;
	}
}