package edu.lmu.cmsi.gabriel.thelabyrinth.core;

public enum Types{
	PLAYER('p'), MONSTER_Z('z'), MONSTER_X('x'),
	MONSTER_A('a'), MONSTER_S('s'), BOSS_O('o'), BOSS_K('k'),
	TREES('t'), ROCKS('r'), WALL('w');

	private final char renderedChar;

	private Types(char renderedChar){
		this.renderedChar = renderedChar;
	}

	public char getRenderedChar(){
		return renderedChar;
	}
}

//trying to get enum class to compile, getting duplicate class error
