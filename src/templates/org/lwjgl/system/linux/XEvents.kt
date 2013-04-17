/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux

import org.lwjgl.generator.*

val XAnyEvent = StructType(
	struct(LINUX_PACKAGE, "XAnyEvent") {
		javaDoc("Any event.")
		nativeImport ("LinuxLWJGL.h")

		int.member("type")
		unsigned_long.member("serial")
		Bool.member("send_event")
		Display_p.member("display")
		Window.member("window")
	}
)

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

val XButtonEvent = StructType(
	struct(LINUX_PACKAGE, "XButtonEvent") {
		javaDoc("Button event.")
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
        unsigned_int.member("button")
        Bool.member("same_screen")
	}
)

val XMotionEvent = StructType(
	struct(LINUX_PACKAGE, "XMotionEvent") {
		javaDoc("Motion event.")
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
        char.member("is_hint")
        Bool.member("same_screen")
	}
)

val XConfigureEvent = StructType(
	struct(LINUX_PACKAGE, "XConfigureEvent") {
		javaDoc("Motion event.")
		nativeImport ("LinuxLWJGL.h")

		int.member("type")
		unsigned_long.member("serial")
		Bool.member("send_event")
		Display_p.member("display")
		Window.member("event")
		 Window.member("window")
        int.member("x")
		 int.member("y")
        int.member("width")
		 int.member("height")
        int.member("border_width")
        Window.member("above")
        Bool.member("override_redirect")
	}
)

val XPropertyEvent = StructType(
	struct(LINUX_PACKAGE, "XPropertyEvent") {
		javaDoc("Property event.")
		nativeImport ("LinuxLWJGL.h")

		int.member("type")
		unsigned_long.member("serial")
		Bool.member("send_event")
		Display_p.member("display")
		Window.member("window")
		Atom.member("atom")
		Time.member("time")
		int.member("state")
	}
)

val XSelectionRequestEvent = StructType(
	struct(LINUX_PACKAGE, "XSelectionRequestEvent") {
		javaDoc("SelectionRequest event structure.")
		nativeImport ("LinuxLWJGL.h")

		int.member("type")
		unsigned_long.member("serial")
		Bool.member("send_event")
		Display_p.member("display")
		Window.member("owner")
		Window.member("requestor")
		Atom.member("selection")
		Atom.member("target")
		Atom.member("property")
		Time.member("time")
	}
)
val XSelectionRequestEvent_p = StructType(XSelectionRequestEvent)

val XSelectionEvent = StructType(
	struct(LINUX_PACKAGE, "XSelectionEvent") {
		javaDoc("Selection event structure.")
		nativeImport ("LinuxLWJGL.h")

		int.member("type")
		unsigned_long.member("serial")
		Bool.member("send_event")
		Display_p.member("display")
		Window.member("requestor")
		Atom.member("selection")
		Atom.member("target")
		Atom.member("property")
		Time.member("time")
	}
)

val XClientMessageEvent = StructType(
	struct(LINUX_PACKAGE, "XClientMessageEvent") {
		javaDoc("Client message event.")
		nativeImport ("LinuxLWJGL.h")

		int.member("type")
        unsigned_long.member("serial")
        Bool.member("send_event")
        Display_p.member("display")
        Window.member("window")
        Atom.member("message_type")
        int.member("format")
		struct {
			char.member("b", size = 20)
			short.member("s", size = 10)
			long.member("l", size = 5)
		}.member("data")
	}
)

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

val XGenericEventCookie = StructType(
	struct(LINUX_PACKAGE, "XGenericEventCookie") {
		javaDoc("Additional information for an {@code XGenericEvent}.")
		nativeImport ("LinuxLWJGL.h")

		int.member("type")
		unsigned_long.member("serial")
		Bool.member("send_event")
		Display_p.member("display")
		int.member("extension")
		int.member("evtype")
		unsigned_int.member("cookie")
		void_p.member("data")
	}
)
val XGenericEventCookie_p = StructType(XGenericEventCookie)

val XEvent = StructType(
	// O.o holy mother of unions
	struct(LINUX_PACKAGE, "XEvent") {
		javaDoc("This union is defined so Xlib can always use the same sized event structure internally, to avoid memory fragmentation.")
		nativeImport ("LinuxLWJGL.h")

		int.member("type")

		XAnyEvent.member("xany")
		XKeyEvent.member("xkey")
		XButtonEvent.member("xbutton")
		XMotionEvent.member("xmotion")
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
		XConfigureEvent.member("xconfigure")
		//XGravityEvent.member("xgravity")
		//XResizeRequestEvent.member("xresizerequest")
		//XConfigureRequestEvent.member("xconfigurerequest")
		//XCirculateEvent.member("xcirculate")
		//XCirculateRequestEvent.member("xcirculaterequest")
		XPropertyEvent.member("xproperty")
		//XSelectionClearEvent.member("xselectionclear")
		XSelectionRequestEvent.member("xselectionrequest")
		XSelectionEvent.member("xselection")
		//XColormapEvent.member("xcolormap")
		XClientMessageEvent.member("xclient")
		//XMappingEvent.member("xmapping")
		XErrorEvent.member("xerror")
		//XKeymapEvent.member("xkeymap")
		//XGenericEvent.member("xgeneric")
		XGenericEventCookie.member("xcookie")

		long.member("pad", size = 24)
	}
)
val XEvent_p = StructType(XEvent)

fun config() {
	struct(LINUX_PACKAGE, "PropertyWMState", virtual = true) {
		javaDoc("Contents of the WM_STATE property.")
		nativeImport(
			"LinuxLWJGL.h",
		    "<X11/Xmd.h>" // for the CARD32 typedef
		)

		CARD32.member("state")
		Window.member("icon")
	}
}