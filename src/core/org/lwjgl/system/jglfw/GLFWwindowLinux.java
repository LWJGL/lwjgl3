/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

import org.lwjgl.opengl.GLContext;
import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.linux.*;

import java.nio.ByteBuffer;

import static org.lwjgl.BufferUtils.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.jglfw.InputUtil.*;
import static org.lwjgl.system.jglfw.JGLFW.*;
import static org.lwjgl.system.jglfw.PlatformLinux.*;
import static org.lwjgl.system.jglfw.WindowUtil.*;
import static org.lwjgl.system.linux.X.*;
import static org.lwjgl.system.linux.XInput2.*;
import static org.lwjgl.system.linux.Xatom.*;
import static org.lwjgl.system.linux.Xlib.*;
import static org.lwjgl.system.linux.Xrandr.*;
import static org.lwjgl.system.linux.Xutil.*;

class GLFWwindowLinux extends GLFWwindow {

	long handle; // Window handle

	long      contextHandle;
	GLContext context;

	long colormap; // Window colormap

	long visual;

	boolean overrideRedirect; // True if window is OverrideRedirect

	boolean cursorGrabbed; // True if cursor is currently grabbed
	boolean cursorHidden; // True if cursor is currently hidden
	boolean cursorCentered; // True if cursor was moved since last poll

	double x11CursorPosX;
	double x11CursorPosY;

	GLFWwindowLinux() {
	}

	static long getWindowProperty(long window, long property, long type, long value) {
		APIBuffer __buffer = apiStack();

		int offset = __buffer.bufferParam(POINTER_SIZE * 3 + 4);
		long a = __buffer.address() + offset;

		try {
			nXGetWindowProperty(
				x11.display,
				window,
				property,
				0L,
				Long.MAX_VALUE,
				False,
				type,
				a, // actual_type
				a + (3 * POINTER_SIZE), // actual_format
				a + (1 * POINTER_SIZE), // nitems
				a + (2 * POINTER_SIZE), // bytes_after
				value
			);

			if ( __buffer.pointerValue(offset) != type )
				return 0;

			return __buffer.pointerValue(offset + POINTER_SIZE);
		} finally {
			__buffer.pop();
		}
	}

	// Process the specified X event
	static void processEvent(ByteBuffer event) {
		GLFWwindowLinux window = null;

		int type = XEvent.typeGet(event);
		if ( type != GenericEvent ) {
			window = findWindowByHandle(XAnyEvent.windowGet(event));
			if ( window == null ) {
				// This is either an event for a destroyed GLFW window or an event
				// of a type not currently supported by GLFW
				return;
			}
		}

		switch ( type ) {
			case KeyPress: {
				inputKey(window, translateKey(XKeyEvent.keycodeGet(event)), GLFW_PRESS);

				if ( (XKeyEvent.stateGet(event) & ControlMask) == 0 && (XKeyEvent.stateGet(event) & Mod1Mask /*Alt*/) == 0 ) {
					inputChar(window, translateChar(event));
				}

				break;
			}

			case KeyRelease: {
				inputKey(window, translateKey(XKeyEvent.keycodeGet(event)), GLFW_RELEASE);
				break;
			}

			case ButtonPress: {
				int button = XButtonEvent.buttonGet(event);
				if ( button == Button1 )
					inputMouseClick(window, GLFW_MOUSE_BUTTON_LEFT, GLFW_PRESS);
				else if ( button == Button2 )
					inputMouseClick(window, GLFW_MOUSE_BUTTON_MIDDLE, GLFW_PRESS);
				else if ( button == Button3 )
					inputMouseClick(window, GLFW_MOUSE_BUTTON_RIGHT, GLFW_PRESS);

					// Modern X provides scroll events as mouse button presses
				else if ( button == Button4 )
					inputScroll(window, 0.0, 1.0);
				else if ( button == Button5 )
					inputScroll(window, 0.0, -1.0);
				else if ( button == Button5 + 1 )
					inputScroll(window, -1.0, 0.0);
				else if ( button == Button5 + 2 )
					inputScroll(window, 1.0, 0.0);

				break;
			}

			case ButtonRelease: {
				int button = XButtonEvent.buttonGet(event);

				if ( button == Button1 ) {
					inputMouseClick(window, GLFW_MOUSE_BUTTON_LEFT, GLFW_RELEASE);
				} else if ( button == Button2 ) {
					inputMouseClick(window, GLFW_MOUSE_BUTTON_MIDDLE, GLFW_RELEASE);
				} else if ( button == Button3 ) {
					inputMouseClick(window, GLFW_MOUSE_BUTTON_RIGHT, GLFW_RELEASE);
				}
				break;
			}

			case EnterNotify: {
				if ( window.cursorMode == GLFW_CURSOR_HIDDEN )
					hideCursor(window);

				inputCursorEnter(window, true);
				break;
			}

			case LeaveNotify: {
				if ( window.cursorMode == GLFW_CURSOR_HIDDEN )
					showCursor(window);

				inputCursorEnter(window, false);
				break;
			}

			case MotionNotify: {
				int motionX = XMotionEvent.xGet(event);
				int motionY = XMotionEvent.yGet(event);
				if ( motionX != window.x11CursorPosX || motionY != window.x11CursorPosY ) {
					// The cursor was moved by something other than GLFW

					double x, y;

					if ( window.cursorMode == GLFW_CURSOR_CAPTURED ) {
						if ( focusedWindow != window )
							break;

						x = motionX - window.x11CursorPosX;
						y = motionY - window.x11CursorPosY;
					} else {
						x = motionX;
						y = motionY;
					}

					window.x11CursorPosX = motionX;
					window.x11CursorPosY = motionY;
					window.cursorCentered = false;

					inputCursorMotion(window, x, y);
				}

				break;
			}

			case ConfigureNotify: {
				inputWindowSize(window, XConfigureEvent.widthGet(event), XConfigureEvent.heightGet(event));

				inputWindowPos(window, XConfigureEvent.xGet(event), XConfigureEvent.yGet(event));

				break;
			}

			case ClientMessage: {
				// Custom client message, probably from the window manager

				long clientAtom = memGetLong(memAddress(event) + XClientMessageEvent.DATA_L);
				if ( clientAtom == x11.WM_DELETE_WINDOW ) {
					// The window manager was asked to close the window, for example by
					// the user pressing a 'close' window decoration button

					inputWindowCloseRequest(window);
				} else if ( x11.NET_WM_PING != None && clientAtom == x11.NET_WM_PING ) {
					// The window manager is pinging the application to ensure it's
					// still responding to events

					XClientMessageEvent.windowSet(event, x11.root);
					XSendEvent(x11.display, x11.root, False, SubstructureNotifyMask | SubstructureRedirectMask, event);
				}

				break;
			}

			case MapNotify: {
				inputWindowVisibility(window, true);
				break;
			}

			case UnmapNotify: {
				inputWindowVisibility(window, false);
				break;
			}

			case FocusIn: {
				inputWindowFocus(window, true);

				if ( window.cursorMode == GLFW_CURSOR_CAPTURED )
					captureCursor(window);

				break;
			}

			case FocusOut: {
				inputWindowFocus(window, false);

				if ( window.cursorMode == GLFW_CURSOR_CAPTURED )
					showCursor(window);

				break;
			}

			case Expose: {
				inputWindowDamage(window);
				break;
			}

			case PropertyNotify: {
				if ( XPropertyEvent.atomGet(event) == x11.WM_STATE && XPropertyEvent.stateGet(event) == PropertyNewValue ) {
					APIBuffer __buffer = apiBuffer();
					__buffer.pointerParam();

					if ( getWindowProperty(window.handle, x11.WM_STATE, x11.WM_STATE, __buffer.address()) >= 2 ) {
						long state = __buffer.pointerValue(0);
						switch ( memGetInt(state + PropertyWMState.STATE) ) {
							case IconicState:
								inputWindowIconify(window, true);
								break;
							case NormalState:
								inputWindowIconify(window, false);
								break;

						}
					}

					nXFree(__buffer.pointerValue(0));
				}

				break;
			}

			case SelectionClear: {
				// The ownership of the clipboard selection was lost

				x11.selection.string = null;
				break;
			}

			case SelectionRequest: {
				// The contents of the clipboard selection was requested

				ByteBuffer request = event;

				ByteBuffer response = createByteBuffer(XEvent.SIZEOF);

				XSelectionRequestEvent.propertySet(response, writeSelection(request));
				XSelectionRequestEvent.typeSet(response, SelectionNotify);
				XSelectionRequestEvent.displaySet(response, XSelectionRequestEvent.displayGet(request));
				XSelectionRequestEvent.requestorSet(response, XSelectionRequestEvent.requestorGet(request));
				XSelectionRequestEvent.selectionSet(response, XSelectionRequestEvent.selectionGet(request));
				XSelectionRequestEvent.targetSet(response, XSelectionRequestEvent.targetGet(request));
				XSelectionRequestEvent.timeSet(response, XSelectionRequestEvent.timeGet(request));

				XSendEvent(x11.display, XSelectionRequestEvent.requestorGet(request), False, 0, response);
				break;
			}

			case DestroyNotify:
				return;

			case GenericEvent: {
				if ( XGenericEventCookie.extensionGet(event) == x11.XI2.majorOpcode.get(0) && XGetEventData(x11.display, event) != 0 ) {
					if ( XGenericEventCookie.evtypeGet(event) == XI_Motion ) {
						ByteBuffer data = XGenericEventCookie.dataGet(event, XIDeviceEvent.SIZEOF);

						window = findWindowByHandle(XIDeviceEvent.eventGet(data));
						if ( window != null ) {
							double event_x = XIDeviceEvent.event_xGet(data);
							double event_y = XIDeviceEvent.event_yGet(data);

							if ( event_x != window.x11CursorPosX || event_y != window.x11CursorPosY ) {
								// The cursor was moved by something other than GLFW

								double x, y;

								if ( window.cursorMode == GLFW_CURSOR_CAPTURED ) {
									if ( focusedWindow != window )
										break;

									x = event_x - window.x11CursorPosX;
									y = event_y - window.x11CursorPosY;
								} else {
									x = event_x;
									y = event_y;
								}

								window.x11CursorPosX = event_x;
								window.x11CursorPosY = event_y;
								window.cursorCentered = false;

								inputCursorMotion(window, x, y);
							}
						}
					}
				}

				nXFreeEventData(x11.display, memAddress(event) + XEvent.XCOOKIE);
				break;
			}

			default: {
				switch ( XEvent.typeGet(event) - x11.randr.eventBase.get(0) ) {
					case RRScreenChangeNotify: {
						XRRUpdateConfiguration(event);
						break;
					}
				}

				break;
			}
		}
	}

	static GLFWwindowLinux findWindowByHandle(long handle) {
		for ( GLFWwindow window : windows ) {
			GLFWwindowLinux linuxWindow = (GLFWwindowLinux)window;
			if ( linuxWindow.handle == handle )
				return linuxWindow;
		}

		return null;
	}

	// Translates an X Window key to internal coding
	static int translateKey(int keycode) {
		// Use the pre-filled LUT (see updateKeyCodeLUT() in x11_init.c)
		if ( (keycode >= 0) && (keycode < 256) )
			return x11.keyCodeLUT[keycode];
		else
			return -1;
	}

	// Translates an X Window event to Unicode
	static int translateChar(ByteBuffer event) {
		APIBuffer __buffer = apiBuffer();

		// Get X11 keysym
		nXLookupString(memAddress(event), NULL, 0, __buffer.address(), NULL);

		// Convert to Unicode (see x11_unicode.c)
		return X11Unicode._glfwKeySym2Unicode((int)__buffer.pointerValue(0));
	}

	// Set the specified property to the contents of the requested selection
	static long writeSelection(ByteBuffer request) {
		if ( XSelectionRequestEvent.propertyGet(request) == None ) {
			// The requestor is a legacy client (ICCCM section 2.2)
			return None;
		}

		if ( XSelectionRequestEvent.targetGet(request) == x11.TARGETS ) {
			// The list of supported targets was requested

			nXChangeProperty(x11.display,
			                 XSelectionRequestEvent.requestorGet(request),
			                 XSelectionRequestEvent.propertyGet(request),
			                 XA_ATOM,
			                 32,
			                 PropModeReplace,
			                 memAddress(x11.selection.formats),
			                 _GLFW_CLIPBOARD_FORMAT_COUNT);

			return XSelectionRequestEvent.propertyGet(request);
		}

		for ( int i = 0; i < _GLFW_CLIPBOARD_FORMAT_COUNT; i++ ) {
			if ( XSelectionRequestEvent.targetGet(request) == x11.selection.formats.get(i) ) {
				// The requested target is one we support

				XChangeProperty(x11.display,
				                XSelectionRequestEvent.requestorGet(request),
				                XSelectionRequestEvent.propertyGet(request),
				                XSelectionRequestEvent.targetGet(request),
				                8,
				                PropModeReplace,
				                memEncodeUTF8(x11.selection.string),
				                x11.selection.string.length());

				return XSelectionRequestEvent.propertyGet(request);
			}
		}

		return None;
	}

}