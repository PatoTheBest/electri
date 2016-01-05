package net.prefixaut.deadalus;

public enum Key {
	/*
	 * Alphabet
	 */
	A('A'), B('B'), C('C'), D('D'), E('E'), F('F'), G('G'), H('H'), I('I'), J('J'), K('K'), L('L'), M('M'), N('N'),
	O('O'), P('P'), Q('Q'), R('R'), S('S'), T('T'), U('U'), V('V'), W('W'), X('X'), Y('Y'), Z('Z'),
	/*
	 * German extra Characters
	 */
	Ü('Ü'), Ö('Ö'), Ä('Ä'), SHARP_S('ß'),
	/*
	 * Numbers
	 */
	NUM_0('0'), NUM_1('1'), NUM_2('2'), NUM_3('3'), NUM_4('4'), NUM_5('5'), NUM_6('6'), NUM_7('7'), NUM_8('8'), NUM_9('9'),
	/*
	 * Number-Pad Number-Keys
	 */
	NUMPAD_0('0'), NUMPAD_1('1'), NUMPAD_2('2'), NUMPAD_3('3'), NUMPAD_4('4'), NUMPAD_5('5'), NUMPAD_6('6'), NUMPAD_7('7'), NUMPAD_8('8'), NUMPAD_9('9'),
	/*
	 * Number-Pad Extra-Keys
	 */
	NUM_LOCK,
	NUMPAD_SLASH,
	NUMPAD_ASTERISK,
	NUMPAD_MINUS,
	NUMPAD_PLUS,
	NUMPAD_ENTER,
	NUMPAD_COMMA,
	/*
	 * Number-Pad Control-Keys
	 */
	NUMPAD_POS1,
	NUMPAD_END,
	NUMPAD_INSERT,
	NUMPAD_DELETE,
	NUMPAD_UP,
	NUMPAD_LEFT,
	NUMPAD_RIGHT,
	NUMPAD_DOWN,
	NUMPAD_PAGE_UP,
	NUMPAD_PAGE_DOWN,
	/*
	 * F-Keys
	 */
	F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12,
	F13, F14, F15, F16, F17, F18, F19, F20, F21, F22, F23, F24, F25,
	/*
	 * Brackets
	 */
	OPEN_ROUND('('), CLOSE_ROUND(')'),
	OPEN_SQUARE('['), CLOSE_SQUARE(']'),
	OPEN_CURLY('{'), CLOSE_CURLYS('}'),
	OPEN_POINTY('<'), CLOSE_POINTY('>'),
	/*
	 * Arrow Keys
	 */
	ARROW_UP, ARROW_DOWN, ARROW_LEFT, ARROW_RIGHT,
	/*
	 * Signs
	 */
	EXCLAMATION_MARK('!'),
	QUESTION_MARK('?'),
	AT('@'),
	NUMBER('#'),
	QUOTATION_MARK('"'),
	APOSTROPHE('\''),
	PERCENT('%'),
	SLASH('/'),
	BACKSLASH('\\'),
	EQUALS('='),
	PLUS('+'),
	MINUS('-'),
	ASTERISK('*'),
	COLON(':'),
	DOT('.'),
	SEMI_COLON(';'),
	COMMA(','),
	SPACE(' '),
	/*
	 * Extra Characters/Signs
	 * 
	 * Quite Uncommon Characters/Signs. Can vary depending on the keyboard
	 */
	CARET('^'),
	GRAVE_ACCENT('`'),
	ACUTE('´'),
	AMPERSAND('&'),
	PARAGRAPH('§'),
	DOLLAR('$'),
	EURO('€'),
	VERTICAL_BAR('|'),
	UNDERLINE('_'),
	TILDE('~'),
	DEGREASE('°'),
	SQUARE('²'),
	/*
	 * Control Keys
	 */
	ESCAPE,
	TAB,
	CAPS_LOCK,
	SHIFT_LEFT,
	CTRL_LEFT,
	SUPER_LEFT,
	ALT_LEFT,
	ALT_RIGHT,
	SUPER_RIGHT,
	MENU,
	CTRL_RIGHT,
	SHIFT_RIGHT,
	ENTER,
	BACKSPACE,
	PRINT_SCREEN,
	SCROLL_LOCK,
	PAUSE,
	INSERT,
	POS1,
	PAGE_UP,
	DELETE,
	END,
	PAGE_DOWN;
	
	private Character character = null;
	
	Key() {}
	
	Key(char character) {
		this.character = character;
	}
	
	public boolean hasCharacter() {
		return this.character != null;
	}
	
	public char getCharacter() {
		return this.character;
	}
}