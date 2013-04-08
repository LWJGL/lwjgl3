/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux

import org.lwjgl.generator.*

val XKeyEvent = StructType(
	struct(LINUX_PACKAGE, "XKeyEvent") {
		javaDoc("Key event.")
		nativeImport ("LinuxLWJGL.h")

		int.member("type")
		unsigned_long.member("serial")
		Bool.member("send_event")
		Display_p.member("display")
		Window.member("window")
		Window.member("root")
		Window.member("subwindow")
		Time.member("time")
		int.member("x")
		int.member("y")
		int.member("x_root")
		int.member("y_root")
		unsigned_int.member("state")
		unsigned_int.member("keycode")
		Bool.member("same_screen")
	}
)
val XKeyEvent_p = StructType(XKeyEvent)

val XErrorEvent = StructType(
	struct(LINUX_PACKAGE, "XErrorEvent") {
		javaDoc("Error event.")
		nativeImport ("LinuxLWJGL.h")

		int.member("type")
		Display_p.member("display")
		unsigned_long.member("serial")
		unsigned_char.member("error_code")
		unsigned_char.member("request_code")
		unsigned_char.member("minor_code")
		XID.member("resourceid")
	}
)
val XErrorEvent_p = StructType(XErrorEvent)

val XEvent = StructType(
	// O.o holy mother of unions
	struct(LINUX_PACKAGE, "XEvent") {
		javaDoc("This union is defined so Xlib can always use the same sized event structure internally, to avoid memory fragmentation.")
		nativeImport ("LinuxLWJGL.h")

		int.member("type")

		//XAnyEvent.member("xany")
		XKeyEvent.member("xkey")
		//XButtonEvent.member("xbutton")
		//XMotionEvent.member("xmotion")
		//XCrossingEvent.member("xcrossing")
		//XFocusChangeEvent.member("xfocus")
		//XExposeEvent.member("xexpose")
		//XGraphicsExposeEvent.member("xgraphicsexpose")
		//XNoExposeEvent.member("xnoexpose")
		//XVisibilityEvent.member("xvisibility")
		//XCreateWindowEvent.member("xcreatewindow")
		//XDestroyWindowEvent.member("xdestroywindow")
		//XUnmapEvent.member("xunmap")
		//XMapEvent.member("xmap")
		//XMapRequestEvent.member("xmaprequest")
		//XReparentEvent.member("xreparent")
		//XConfigureEvent.member("xconfigure")
		//XGravityEvent.member("xgravity")
		//XResizeRequestEvent.member("xresizerequest")
		//XConfigureRequestEvent.member("xconfigurerequest")
		//XCirculateEvent.member("xcirculate")
		//XCirculateRequestEvent.member("xcirculaterequest")
		//XPropertyEvent.member("xproperty")
		//XSelectionClearEvent.member("xselectionclear")
		//XSelectionRequestEvent.member("xselectionrequest")
		//XSelectionEvent.member("xselection")
		//XColormapEvent.member("xcolormap")
		//XClientMessageEvent.member("xclient")
		//XMappingEvent.member("xmapping")
		XErrorEvent.member("xerror")
		//XKeymapEvent.member("xkeymap")
		//XGenericEvent.member("xgeneric")
		//XGenericEventCookie.member("xcookie")

		long.member("pad", size = 24)
	}
)
val XEvent_p = StructType(XEvent)