/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.api;

/**
 * Keyboard interface based on the LWJGL 2.x code
 *
 * @author Brian Matzon <brian@matzon.dk>
 */
public interface Keyboard {

	/**
	 * The special keycode meaning that only the
	 * translated character is valid.
	 */
	int KEY_NONE = 0x00;

	int KEY_ESCAPE       = 0x01;
	int KEY_1            = 0x02;
	int KEY_2            = 0x03;
	int KEY_3            = 0x04;
	int KEY_4            = 0x05;
	int KEY_5            = 0x06;
	int KEY_6            = 0x07;
	int KEY_7            = 0x08;
	int KEY_8            = 0x09;
	int KEY_9            = 0x0A;
	int KEY_0            = 0x0B;
	int KEY_MINUS        = 0x0C; /* - on main keyboard */
	int KEY_EQUALS       = 0x0D;
	int KEY_BACK         = 0x0E; /* backspace */
	int KEY_TAB          = 0x0F;
	int KEY_Q            = 0x10;
	int KEY_W            = 0x11;
	int KEY_E            = 0x12;
	int KEY_R            = 0x13;
	int KEY_T            = 0x14;
	int KEY_Y            = 0x15;
	int KEY_U            = 0x16;
	int KEY_I            = 0x17;
	int KEY_O            = 0x18;
	int KEY_P            = 0x19;
	int KEY_LBRACKET     = 0x1A;
	int KEY_RBRACKET     = 0x1B;
	int KEY_RETURN       = 0x1C; /* Enter on main keyboard */
	int KEY_LCONTROL     = 0x1D;
	int KEY_A            = 0x1E;
	int KEY_S            = 0x1F;
	int KEY_D            = 0x20;
	int KEY_F            = 0x21;
	int KEY_G            = 0x22;
	int KEY_H            = 0x23;
	int KEY_J            = 0x24;
	int KEY_K            = 0x25;
	int KEY_L            = 0x26;
	int KEY_SEMICOLON    = 0x27;
	int KEY_APOSTROPHE   = 0x28;
	int KEY_GRAVE        = 0x29; /* accent grave */
	int KEY_LSHIFT       = 0x2A;
	int KEY_BACKSLASH    = 0x2B;
	int KEY_Z            = 0x2C;
	int KEY_X            = 0x2D;
	int KEY_C            = 0x2E;
	int KEY_V            = 0x2F;
	int KEY_B            = 0x30;
	int KEY_N            = 0x31;
	int KEY_M            = 0x32;
	int KEY_COMMA        = 0x33;
	int KEY_PERIOD       = 0x34; /* . on main keyboard */
	int KEY_SLASH        = 0x35; /* / on main keyboard */
	int KEY_RSHIFT       = 0x36;
	int KEY_MULTIPLY     = 0x37; /* * on numeric keypad */
	int KEY_LMENU        = 0x38; /* left Alt */
	int KEY_SPACE        = 0x39;
	int KEY_CAPITAL      = 0x3A;
	int KEY_F1           = 0x3B;
	int KEY_F2           = 0x3C;
	int KEY_F3           = 0x3D;
	int KEY_F4           = 0x3E;
	int KEY_F5           = 0x3F;
	int KEY_F6           = 0x40;
	int KEY_F7           = 0x41;
	int KEY_F8           = 0x42;
	int KEY_F9           = 0x43;
	int KEY_F10          = 0x44;
	int KEY_NUMLOCK      = 0x45;
	int KEY_SCROLL       = 0x46; /* Scroll Lock */
	int KEY_NUMPAD7      = 0x47;
	int KEY_NUMPAD8      = 0x48;
	int KEY_NUMPAD9      = 0x49;
	int KEY_SUBTRACT     = 0x4A; /* - on numeric keypad */
	int KEY_NUMPAD4      = 0x4B;
	int KEY_NUMPAD5      = 0x4C;
	int KEY_NUMPAD6      = 0x4D;
	int KEY_ADD          = 0x4E; /* + on numeric keypad */
	int KEY_NUMPAD1      = 0x4F;
	int KEY_NUMPAD2      = 0x50;
	int KEY_NUMPAD3      = 0x51;
	int KEY_NUMPAD0      = 0x52;
	int KEY_DECIMAL      = 0x53; /* . on numeric keypad */
	int KEY_F11          = 0x57;
	int KEY_F12          = 0x58;
	int KEY_F13          = 0x64; /*                     (NEC PC98) */
	int KEY_F14          = 0x65; /*                     (NEC PC98) */
	int KEY_F15          = 0x66; /*                     (NEC PC98) */
	int KEY_F16          = 0x67; /* Extended Function keys - (Mac) */
	int KEY_F17          = 0x68;
	int KEY_F18          = 0x69;
	int KEY_KANA         = 0x70; /* (Japanese keyboard)            */
	int KEY_F19          = 0x71; /* Extended Function keys - (Mac) */
	int KEY_CONVERT      = 0x79; /* (Japanese keyboard)            */
	int KEY_NOCONVERT    = 0x7B; /* (Japanese keyboard)            */
	int KEY_YEN          = 0x7D; /* (Japanese keyboard)            */
	int KEY_NUMPADEQUALS = 0x8D; /* = on numeric keypad (NEC PC98) */
	int KEY_CIRCUMFLEX   = 0x90; /* (Japanese keyboard)            */
	int KEY_AT           = 0x91; /*                     (NEC PC98) */
	int KEY_COLON        = 0x92; /*                     (NEC PC98) */
	int KEY_UNDERLINE    = 0x93; /*                     (NEC PC98) */
	int KEY_KANJI        = 0x94; /* (Japanese keyboard)            */
	int KEY_STOP         = 0x95; /*                     (NEC PC98) */
	int KEY_AX           = 0x96; /*                     (Japan AX) */
	int KEY_UNLABELED    = 0x97; /*                        (J3100) */
	int KEY_NUMPADENTER  = 0x9C; /* Enter on numeric keypad */
	int KEY_RCONTROL     = 0x9D;
	int KEY_SECTION      = 0xA7; /* Section symbol (Mac) */
	int KEY_NUMPADCOMMA  = 0xB3; /* , on numeric keypad (NEC PC98) */
	int KEY_DIVIDE       = 0xB5; /* / on numeric keypad */
	int KEY_SYSRQ        = 0xB7;
	int KEY_RMENU        = 0xB8; /* right Alt */
	int KEY_FUNCTION     = 0xC4; /* Function (Mac) */
	int KEY_PAUSE        = 0xC5; /* Pause */
	int KEY_HOME         = 0xC7; /* Home on arrow keypad */
	int KEY_UP           = 0xC8; /* UpArrow on arrow keypad */
	int KEY_PRIOR        = 0xC9; /* PgUp on arrow keypad */
	int KEY_LEFT         = 0xCB; /* LeftArrow on arrow keypad */
	int KEY_RIGHT        = 0xCD; /* RightArrow on arrow keypad */
	int KEY_END          = 0xCF; /* End on arrow keypad */
	int KEY_DOWN         = 0xD0; /* DownArrow on arrow keypad */
	int KEY_NEXT         = 0xD1; /* PgDn on arrow keypad */
	int KEY_INSERT       = 0xD2; /* Insert on arrow keypad */
	int KEY_DELETE       = 0xD3; /* Delete on arrow keypad */
	int KEY_CLEAR        = 0xDA; /* Clear key (Mac) */
	int KEY_LMETA        = 0xDB; /* Left Windows/Option key */
	int KEY_RMETA        = 0xDC; /* Right Windows/Option key */
	int KEY_APPS         = 0xDD; /* AppMenu key */
	int KEY_POWER        = 0xDE;
	int KEY_SLEEP        = 0xDF;

	/**
	 * Checks to see if a key is down.
	 *
	 * @param key Keycode to check
	 *
	 * @return true if the key is down according to the last poll()
	 */
	boolean isKeyDown(int key);

	/**
	 * Gets a key's name
	 *
	 * @param key The key
	 *
	 * @return a String with the key's human readable name in it or null if the key is unnamed
	 */
	String getKeyName(int key);

	/**
	 * Get's a key's index. If the key is unrecognised then KEY_NONE is returned.
	 *
	 * @param keyName The key name
	 */
	int getKeyIndex(String keyName);

	/**
	 * Gets the number of keyboard events waiting after doing a buffer enabled poll().
	 *
	 * @return the number of keyboard events
	 */
	int getNumKeyboardEvents();

	/**
	 * Gets the next keyboard event. You can query which key caused the event by using
	 * <code>getEventKey</code>. To get the state of that key, for that event, use
	 * <code>getEventKeyState</code> - finally use <code>getEventCharacter</code> to get the
	 * character for that event.
	 *
	 * @return true if a keyboard event was read, false otherwise
	 *
	 * @see org.lwjgl.api.Keyboard#getEventKey()
	 * @see org.lwjgl.api.Keyboard#getEventKeyState()
	 * @see org.lwjgl.api.Keyboard#getEventCharacter()
	 */
	boolean nextEvent();

	/**
	 * Controls whether repeat events are reported or not. If repeat events
	 * are enabled, key down events are reported when a key is pressed and held for
	 * a OS dependent amount of time. To distinguish a repeat event from a normal event,
	 * use isRepeatEvent().
	 */
	void enableRepeatEvents(boolean enable);

	/**
	 * Check whether repeat events are currently reported or not.
	 *
	 * @return true is repeat events are reported, false if not.
	 */
	boolean areRepeatEventsEnabled();

	/**
	 * @return Number of keys on this keyboard
	 */
	int getKeyCount();

	/**
	 * @return The character from the current event
	 */
	char getEventCharacter();

	/**
	 * Please note that the key code returned is NOT valid against the
	 * current keyboard layout. To get the actual character pressed call
	 * getEventCharacter
	 *
	 * @return The key from the current event
	 */
	int getEventKey();

	/**
	 * Gets the state of the key that generated the
	 * current event
	 *
	 * @return True if key was down, or false if released
	 */
	boolean getEventKeyState();

	/**
	 * Gets the time in nanoseconds of the current event.
	 * Only useful for relative comparisons with other
	 * Keyboard events, as the absolute time has no defined
	 * origin.
	 *
	 * @return The time in nanoseconds of the current event
	 */
	long getEventNanoseconds();

	/**
	 * @return true if the current event is a repeat event, false if
	 * the current event is not a repeat even or if repeat events are disabled.
	 */
	boolean isRepeatEvent();
}