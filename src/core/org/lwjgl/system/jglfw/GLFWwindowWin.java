/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.glfw.GLFW;
import org.lwjgl.system.windows.MSG;
import org.lwjgl.system.windows.TRACKMOUSEEVENT;
import org.lwjgl.system.windows.WinUser;
import org.lwjgl.system.windows.WindowProc;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Map;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.jglfw.InputUtil.*;
import static org.lwjgl.system.jglfw.JGLFW.*;
import static org.lwjgl.system.jglfw.WindowUtil.*;
import static org.lwjgl.system.windows.WinBase.*;
import static org.lwjgl.system.windows.WinUser.*;

class GLFWwindowWin extends GLFWwindow {

	long handle;
	int  dwStyle;
	int  dwExStyle;

	final WindowProcWin wndproc;
	long wndprocRef;

	boolean cursorCentered;
	boolean cursorInside;
	int     oldCursorX, oldCursorY;

	// Context state

	long      dc;
	GLContext context;

	boolean EXT_swap_control;
	boolean ARB_multisample;
	boolean ARB_framebuffer_sRGB;
	boolean ARB_pixel_format;
	boolean ARB_create_context;
	boolean ARB_create_context_profile;
	boolean EXT_create_context_es2_profile;
	boolean ARB_create_context_robustness;

	GLFWwindowWin(PlatformWin platform) {
		this.wndproc = new WindowProcWin(platform);
	}

	private static int LOWORD(long param) {
		return (int)(param & 0xFFFF);
	}

	private static int HIWORD(long param) {
		return (int)((param >> 16) & 0xFFFF);
	}

	private static int GET_X_LPARAM(long param) {
		return LOWORD(param);
	}

	private static int GET_Y_LPARAM(long param) {
		return HIWORD(param);
	}

	private class WindowProcWin extends WindowProc {

		private final PlatformWin platform;

		WindowProcWin(PlatformWin platform) {
			this.platform = platform;
		}

		@Override
		public long invoke(long hWnd, int uMsg, long wParam, long lParam) {
			GLFWwindowWin window = GLFWwindowWin.this;

			//System.out.println(MessageDebug.getMessageName(uMsg));

			switch ( uMsg ) {
				case WM_ACTIVATE: {
					// Window was (de)focused and/or (de)iconified

					boolean focused = LOWORD(wParam) != WA_INACTIVE;
					boolean iconified = HIWORD(wParam) != 0;

					if ( focused && iconified ) {
						// This is a workaround for window iconification using the
						// taskbar leading to windows being told they're focused and
						// iconified and then never told they're defocused
						focused = false;
					}

					if ( !focused && focusedWindow == window ) {
						// The window was defocused (or iconified, see above)

						if ( cursorMode == GLFW_CURSOR_CAPTURED )
							PlatformWin.showCursor(window);

						if ( window.monitor != null ) {
							if ( !iconified ) {
								// Iconify the (on top, borderless, oddly positioned)
								// window or the user will be annoyed
								platform.iconifyWindow(window);
							}

							PlatformWin.restoreVideoMode(window.monitor);
						}
					} else if ( focused && focusedWindow != window ) {
						// The window was focused

						if ( window.cursorMode == GLFW.GLFW_CURSOR_CAPTURED )
							PlatformWin.captureCursor(window);

						if ( window.monitor != null )
							platform.setVideoMode(window.monitor, window.videoMode);
					}

					inputWindowFocus(window, focused);
					inputWindowIconify(window, iconified);
					return 0;
				}

				case WM_SHOWWINDOW: {
					inputWindowVisibility(window, wParam != 0);
					break;
				}

				case WM_SYSCOMMAND: {
					switch ( (int)(wParam & 0xfff0) ) {
						case SC_SCREENSAVE:
						case SC_MONITORPOWER: {
							if ( window.monitor != null ) {
								// We are running in fullscreen mode, so disallow
								// screen saver and screen blanking
								return 0;
							} else
								break;
						}

						// User trying to access application menu using ALT?
						case SC_KEYMENU:
							return 0;
					}
					break;
				}

				case WM_CLOSE:
					inputWindowCloseRequest(window);
					return 0;

				case WM_KEYDOWN:
				case WM_SYSKEYDOWN: {
					inputKey(window, translateKey(wParam, lParam), GLFW.GLFW_PRESS);
					break;
				}

				case WM_CHAR: {
					inputChar(window, (int)wParam);
					return 0;
				}

				case WM_UNICHAR: {
					// This message is not sent by Windows, but is sent by some
					// third-party input method engines

					if ( wParam == UNICODE_NOCHAR ) {
						// Returning TRUE here announces support for this message
						return TRUE;
					}

					inputChar(window, (int)wParam);
					return FALSE;
				}

				case WM_KEYUP:
				case WM_SYSKEYUP: {
					if ( wParam == VK_SHIFT ) {
						// Special trick: release both shift keys on SHIFT up event
						inputKey(window, GLFW.GLFW_KEY_LEFT_SHIFT, GLFW.GLFW_RELEASE);
						inputKey(window, GLFW.GLFW_KEY_RIGHT_SHIFT, GLFW.GLFW_RELEASE);
					} else if ( wParam == VK_SNAPSHOT ) {
						// Key down is not reported for the print screen key
						inputKey(window, GLFW.GLFW_KEY_PRINT_SCREEN, GLFW.GLFW_PRESS);
						inputKey(window, GLFW.GLFW_KEY_PRINT_SCREEN, GLFW.GLFW_RELEASE);
					} else
						inputKey(window, translateKey(wParam, lParam), GLFW.GLFW_RELEASE);

					break;
				}

				case WM_LBUTTONDOWN: {
					SetCapture(hWnd);
					inputMouseClick(window, GLFW.GLFW_MOUSE_BUTTON_LEFT, GLFW.GLFW_PRESS);
					return 0;
				}

				case WM_RBUTTONDOWN: {
					SetCapture(hWnd);
					inputMouseClick(window, GLFW.GLFW_MOUSE_BUTTON_RIGHT, GLFW.GLFW_PRESS);
					return 0;
				}

				case WM_MBUTTONDOWN: {
					SetCapture(hWnd);
					inputMouseClick(window, GLFW.GLFW_MOUSE_BUTTON_MIDDLE, GLFW.GLFW_PRESS);
					return 0;
				}

				case WM_XBUTTONDOWN: {
					if ( HIWORD(wParam) == XBUTTON1 ) {
						SetCapture(hWnd);
						inputMouseClick(window, GLFW.GLFW_MOUSE_BUTTON_4, GLFW.GLFW_PRESS);
					} else if ( HIWORD(wParam) == XBUTTON2 ) {
						SetCapture(hWnd);
						inputMouseClick(window, GLFW.GLFW_MOUSE_BUTTON_5, GLFW.GLFW_PRESS);
					}

					return 1;
				}

				case WM_LBUTTONUP: {
					ReleaseCapture();
					inputMouseClick(window, GLFW.GLFW_MOUSE_BUTTON_LEFT, GLFW.GLFW_RELEASE);
					return 0;
				}

				case WM_RBUTTONUP: {
					ReleaseCapture();
					inputMouseClick(window, GLFW.GLFW_MOUSE_BUTTON_RIGHT, GLFW.GLFW_RELEASE);
					return 0;
				}

				case WM_MBUTTONUP: {
					ReleaseCapture();
					inputMouseClick(window, GLFW.GLFW_MOUSE_BUTTON_MIDDLE, GLFW.GLFW_RELEASE);
					return 0;
				}

				case WM_XBUTTONUP: {
					if ( HIWORD(wParam) == XBUTTON1 ) {
						ReleaseCapture();
						inputMouseClick(window, GLFW.GLFW_MOUSE_BUTTON_4, GLFW.GLFW_RELEASE);
					} else if ( HIWORD(wParam) == XBUTTON2 ) {
						ReleaseCapture();
						inputMouseClick(window, GLFW.GLFW_MOUSE_BUTTON_5, GLFW.GLFW_RELEASE);
					}

					return 1;
				}

				case WM_MOUSEMOVE: {
					int newCursorX = GET_X_LPARAM(lParam);
					int newCursorY = GET_Y_LPARAM(lParam);

					if ( newCursorX != window.oldCursorX || newCursorY != window.oldCursorY ) {
						int x, y;

						if ( window.cursorMode == GLFW.GLFW_CURSOR_CAPTURED ) {
							if ( focusedWindow != window )
								return 0;

							x = newCursorX - window.oldCursorX;
							y = newCursorY - window.oldCursorY;
						} else {
							x = newCursorX;
							y = newCursorY;
						}

						window.oldCursorX = newCursorX;
						window.oldCursorY = newCursorY;
						window.cursorCentered = false;

						inputCursorMotion(window, x, y);
					}

					if ( !window.cursorInside ) {
						APIBuffer __buffer = apiBuffer();
						ByteBuffer tme = __buffer.buffer();

						JGLFWUtil.zeroMemory(tme, TRACKMOUSEEVENT.SIZEOF);
						TRACKMOUSEEVENT.sizeSet(tme, TRACKMOUSEEVENT.SIZEOF);
						TRACKMOUSEEVENT.flagsSet(tme, TME_LEAVE);
						TRACKMOUSEEVENT.hwndTrackSet(tme, window.handle);
						TrackMouseEvent(tme);

						window.cursorInside = true;
						inputCursorEnter(window, true);
					}

					return 0;
				}

				case WM_MOUSELEAVE: {
					window.cursorInside = false;
					inputCursorEnter(window, false);
					return 0;
				}

				case WM_MOUSEWHEEL: {
					inputScroll(window, 0.0, HIWORD(wParam) / (double)WHEEL_DELTA);
					return 0;
				}

				case WM_MOUSEHWHEEL: {
					// This message is only sent on Windows Vista and later
					inputScroll(window, HIWORD(wParam) / (double)WHEEL_DELTA, 0.0);
					return 0;
				}

				case WM_SIZE: {
					if ( window.cursorMode == GLFW.GLFW_CURSOR_CAPTURED )
						PlatformWin.updateClipRect(window);

					inputWindowSize(window, LOWORD(lParam), HIWORD(lParam));
					return 0;
				}

				case WM_MOVE: {
					if ( window.cursorMode == GLFW.GLFW_CURSOR_CAPTURED )
						PlatformWin.updateClipRect(window);

					inputWindowPos(window, LOWORD(lParam), HIWORD(lParam));
					return 0;
				}

				case WM_PAINT: {
					inputWindowDamage(window);
					break;
				}

				case WM_SETCURSOR: {
					if ( window.cursorMode == GLFW.GLFW_CURSOR_HIDDEN &&
					     window.handle == GetForegroundWindow() && LOWORD(lParam) == HTCLIENT ) {
						SetCursor(NULL);
						return TRUE;
					}

					break;
				}

				case WM_DEVICECHANGE: {
					if ( DBT_DEVNODES_CHANGED == wParam ) {
						inputMonitorChange();
						return TRUE;
					}
					break;
				}

				case WM_DWMCOMPOSITIONCHANGED: {
					if ( platform.isCompositionEnabled() ) {
						GLFWwindowWin previous = platform.getCurrentContext();
						platform.makeContextCurrent(window);
						platform.swapInterval(0);
						platform.makeContextCurrent(previous);
					}

					// TODO: Restore vsync if compositing was disabled
					break;
				}
			}

			return nDefWindowProc(hWnd, uMsg, wParam, lParam);
		}
	}

	// Translates a Windows key to the corresponding GLFW key
	static int translateKey(long wParam, long lParam) {
		// Check for numeric keypad keys
		// NOTE: This way we always force "NumLock = ON", which is intentional since
		// the returned key code should correspond to a physical location.
		int hiFlags = HIWORD(lParam);
		if ( (hiFlags & 0x100) == 0 ) {
			switch ( MapVirtualKey(hiFlags & 0xFF, 1) ) {
				case VK_INSERT:
					return GLFW_KEY_KP_0;
				case VK_END:
					return GLFW_KEY_KP_1;
				case VK_DOWN:
					return GLFW_KEY_KP_2;
				case VK_NEXT:
					return GLFW_KEY_KP_3;
				case VK_LEFT:
					return GLFW_KEY_KP_4;
				case VK_CLEAR:
					return GLFW_KEY_KP_5;
				case VK_RIGHT:
					return GLFW_KEY_KP_6;
				case VK_HOME:
					return GLFW_KEY_KP_7;
				case VK_UP:
					return GLFW_KEY_KP_8;
				case VK_PRIOR:
					return GLFW_KEY_KP_9;
				case VK_DIVIDE:
					return GLFW_KEY_KP_DIVIDE;
				case VK_MULTIPLY:
					return GLFW_KEY_KP_MULTIPLY;
				case VK_SUBTRACT:
					return GLFW_KEY_KP_SUBTRACT;
				case VK_ADD:
					return GLFW_KEY_KP_ADD;
				case VK_DELETE:
					return GLFW_KEY_KP_DECIMAL;
				default:
					break;
			}
		}

		// Check which key was pressed or released
		switch ( (int)wParam ) {
			// The SHIFT keys require special handling
			case VK_SHIFT: {
				// Compare scan code for this key with that of VK_RSHIFT in
				// order to determine which shift key was pressed (left or
				// right)
				int scan_code = MapVirtualKey(VK_RSHIFT, 0);
				if ( (lParam & 0x01ff0000) >> 16 == scan_code )
					return GLFW_KEY_RIGHT_SHIFT;

				return GLFW_KEY_LEFT_SHIFT;
			}

			// The CTRL keys require special handling
			case VK_CONTROL: {
				// Is this an extended key (i.e. right key)?
				if ( (lParam & 0x01000000) != 0 )
					return GLFW_KEY_RIGHT_CONTROL;

				// Here is a trick: "Alt Gr" sends LCTRL, then RALT. We only
				// want the RALT message, so we try to see if the next message
				// is a RALT message. In that case, this is a false LCTRL!
				int msg_time = GetMessageTime();
				APIBuffer __buffer = apiBuffer();
				ByteBuffer next_msg = __buffer.buffer();
				if ( PeekMessage(next_msg, NULL, 0, 0, PM_NOREMOVE) != 0 ) {
					int message = MSG.messageGet(next_msg);
					if ( message == WM_KEYDOWN ||
					     message == WM_SYSKEYDOWN ) {
						if ( MSG.wParamGet(next_msg) == VK_MENU && (MSG.lParamGet(next_msg) & 0x01000000) != 0 && MSG.timeGet(next_msg) == msg_time ) {
							// Next message is a RALT down message, which
							// means that this is NOT a proper LCTRL message!
							return -1;
						}
					}
				}

				return GLFW_KEY_LEFT_CONTROL;
			}

			// The ALT keys require special handling
			case VK_MENU: {
				// Is this an extended key (i.e. right key)?
				if ( (lParam & 0x01000000) != 0 )
					return GLFW_KEY_RIGHT_ALT;

				return GLFW_KEY_LEFT_ALT;
			}

			// The ENTER keys require special handling
			case VK_RETURN: {
				// Is this an extended key (i.e. right key)?
				if ( (lParam & 0x01000000) != 0 )
					return GLFW_KEY_KP_ENTER;

				return GLFW_KEY_ENTER;
			}

			// Funcion keys (non-printable keys)
			case VK_ESCAPE:
				return GLFW_KEY_ESCAPE;
			case VK_TAB:
				return GLFW_KEY_TAB;
			case VK_BACK:
				return GLFW_KEY_BACKSPACE;
			case VK_HOME:
				return GLFW_KEY_HOME;
			case VK_END:
				return GLFW_KEY_END;
			case VK_PRIOR:
				return GLFW_KEY_PAGE_UP;
			case VK_NEXT:
				return GLFW_KEY_PAGE_DOWN;
			case VK_INSERT:
				return GLFW_KEY_INSERT;
			case VK_DELETE:
				return GLFW_KEY_DELETE;
			case VK_LEFT:
				return GLFW_KEY_LEFT;
			case VK_UP:
				return GLFW_KEY_UP;
			case VK_RIGHT:
				return GLFW_KEY_RIGHT;
			case VK_DOWN:
				return GLFW_KEY_DOWN;
			case VK_F1:
				return GLFW_KEY_F1;
			case VK_F2:
				return GLFW_KEY_F2;
			case VK_F3:
				return GLFW_KEY_F3;
			case VK_F4:
				return GLFW_KEY_F4;
			case VK_F5:
				return GLFW_KEY_F5;
			case VK_F6:
				return GLFW_KEY_F6;
			case VK_F7:
				return GLFW_KEY_F7;
			case VK_F8:
				return GLFW_KEY_F8;
			case VK_F9:
				return GLFW_KEY_F9;
			case VK_F10:
				return GLFW_KEY_F10;
			case VK_F11:
				return GLFW_KEY_F11;
			case VK_F12:
				return GLFW_KEY_F12;
			case VK_F13:
				return GLFW_KEY_F13;
			case VK_F14:
				return GLFW_KEY_F14;
			case VK_F15:
				return GLFW_KEY_F15;
			case VK_F16:
				return GLFW_KEY_F16;
			case VK_F17:
				return GLFW_KEY_F17;
			case VK_F18:
				return GLFW_KEY_F18;
			case VK_F19:
				return GLFW_KEY_F19;
			case VK_F20:
				return GLFW_KEY_F20;
			case VK_F21:
				return GLFW_KEY_F21;
			case VK_F22:
				return GLFW_KEY_F22;
			case VK_F23:
				return GLFW_KEY_F23;
			case VK_F24:
				return GLFW_KEY_F24;
			case VK_NUMLOCK:
				return GLFW_KEY_NUM_LOCK;
			case VK_CAPITAL:
				return GLFW_KEY_CAPS_LOCK;
			case VK_SNAPSHOT:
				return GLFW_KEY_PRINT_SCREEN;
			case VK_SCROLL:
				return GLFW_KEY_SCROLL_LOCK;
			case VK_PAUSE:
				return GLFW_KEY_PAUSE;
			case VK_LWIN:
				return GLFW_KEY_LEFT_SUPER;
			case VK_RWIN:
				return GLFW_KEY_RIGHT_SUPER;
			case VK_APPS:
				return GLFW_KEY_MENU;

			// Numeric keypad
			case VK_NUMPAD0:
				return GLFW_KEY_KP_0;
			case VK_NUMPAD1:
				return GLFW_KEY_KP_1;
			case VK_NUMPAD2:
				return GLFW_KEY_KP_2;
			case VK_NUMPAD3:
				return GLFW_KEY_KP_3;
			case VK_NUMPAD4:
				return GLFW_KEY_KP_4;
			case VK_NUMPAD5:
				return GLFW_KEY_KP_5;
			case VK_NUMPAD6:
				return GLFW_KEY_KP_6;
			case VK_NUMPAD7:
				return GLFW_KEY_KP_7;
			case VK_NUMPAD8:
				return GLFW_KEY_KP_8;
			case VK_NUMPAD9:
				return GLFW_KEY_KP_9;
			case VK_DIVIDE:
				return GLFW_KEY_KP_DIVIDE;
			case VK_MULTIPLY:
				return GLFW_KEY_KP_MULTIPLY;
			case VK_SUBTRACT:
				return GLFW_KEY_KP_SUBTRACT;
			case VK_ADD:
				return GLFW_KEY_KP_ADD;
			case VK_DECIMAL:
				return GLFW_KEY_KP_DECIMAL;

			// Printable keys are mapped according to US layout
			case VK_SPACE:
				return GLFW_KEY_SPACE;
			case 0x30:
				return GLFW_KEY_0;
			case 0x31:
				return GLFW_KEY_1;
			case 0x32:
				return GLFW_KEY_2;
			case 0x33:
				return GLFW_KEY_3;
			case 0x34:
				return GLFW_KEY_4;
			case 0x35:
				return GLFW_KEY_5;
			case 0x36:
				return GLFW_KEY_6;
			case 0x37:
				return GLFW_KEY_7;
			case 0x38:
				return GLFW_KEY_8;
			case 0x39:
				return GLFW_KEY_9;
			case 0x41:
				return GLFW_KEY_A;
			case 0x42:
				return GLFW_KEY_B;
			case 0x43:
				return GLFW_KEY_C;
			case 0x44:
				return GLFW_KEY_D;
			case 0x45:
				return GLFW_KEY_E;
			case 0x46:
				return GLFW_KEY_F;
			case 0x47:
				return GLFW_KEY_G;
			case 0x48:
				return GLFW_KEY_H;
			case 0x49:
				return GLFW_KEY_I;
			case 0x4A:
				return GLFW_KEY_J;
			case 0x4B:
				return GLFW_KEY_K;
			case 0x4C:
				return GLFW_KEY_L;
			case 0x4D:
				return GLFW_KEY_M;
			case 0x4E:
				return GLFW_KEY_N;
			case 0x4F:
				return GLFW_KEY_O;
			case 0x50:
				return GLFW_KEY_P;
			case 0x51:
				return GLFW_KEY_Q;
			case 0x52:
				return GLFW_KEY_R;
			case 0x53:
				return GLFW_KEY_S;
			case 0x54:
				return GLFW_KEY_T;
			case 0x55:
				return GLFW_KEY_U;
			case 0x56:
				return GLFW_KEY_V;
			case 0x57:
				return GLFW_KEY_W;
			case 0x58:
				return GLFW_KEY_X;
			case 0x59:
				return GLFW_KEY_Y;
			case 0x5A:
				return GLFW_KEY_Z;
			case 0xBD:
				return GLFW_KEY_MINUS;
			case 0xBB:
				return GLFW_KEY_EQUAL;
			case 0xDB:
				return GLFW_KEY_LEFT_BRACKET;
			case 0xDD:
				return GLFW_KEY_RIGHT_BRACKET;
			case 0xDC:
				return GLFW_KEY_BACKSLASH;
			case 0xBA:
				return GLFW_KEY_SEMICOLON;
			case 0xDE:
				return GLFW_KEY_APOSTROPHE;
			case 0xC0:
				return GLFW_KEY_GRAVE_ACCENT;
			case 0xBC:
				return GLFW_KEY_COMMA;
			case 0xBE:
				return GLFW_KEY_PERIOD;
			case 0xBF:
				return GLFW_KEY_SLASH;
			case 0xDF:
				return GLFW_KEY_WORLD_1;
			case 0xE2:
				return GLFW_KEY_WORLD_2;
			default:
				break;
		}

		// No matching translation was found, so return -1
		return -1;
	}

	// In a class for lazy-init
	private static final class MessageDebug {

		/** Maps WM_* token values to their String representations. */
		static final Map<Integer, String> TOKENS = LWJGLUtil.getClassTokens(new LWJGLUtil.TokenFilter() {
			@Override
			public boolean accept(Field field, int value) {
				return field.getName().startsWith("WM_");
			}
		}, null, WinUser.class);

		private MessageDebug() {
		}

		static String getMessageName(int msg) {
			String name = TOKENS.get(msg);
			if ( name == null )
				name = "UNKNOWN [" + LWJGLUtil.toHexString(msg) + ']';

			return name;
		}

	}

}