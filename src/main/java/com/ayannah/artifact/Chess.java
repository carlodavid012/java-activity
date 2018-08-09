package com.ayannah.artifact;

//inheritance
class Game{
	 Game(){
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game{
	 BoardGame() {
		super();
		System.out.println("BoardGame constructor");
	}
}

public class Chess extends BoardGame {
	public Chess(){
		super();
		System.out.println("Chess constructor");
	}
}
