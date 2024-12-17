/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux

import org.lwjgl.generator.*

val XAnyEvent = struct(Module.CORE_LINUX, "XAnyEvent") {
	int("type")
	unsigned_long("serial")
	Bool("send_event")
	Display.p("display")
	Window("window")
}

val XKeyEvent = struct(Module.CORE_LINUX, "XKeyEvent") {
	int("type")
	XAnyEvent copy "serial"
	XAnyEvent copy "send_event"
	XAnyEvent copy "display"
	XAnyEvent copy "window"
	Window("root")
	Window("subwindow")
	Time("time")
	int("x")
	int("y")
	int("x_root")
	int("y_root")
	unsigned_int("state")
	unsigned_int("keycode")
	Bool("same_screen")
}

val XEvent = union(Module.CORE_LINUX, "XEvent", mutable = false) {
	int("type")

	XAnyEvent("xany")
	XKeyEvent("xkey")
	struct(Module.CORE_LINUX, "XButtonEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		XKeyEvent copy "root"
		XKeyEvent copy "subwindow"
		XKeyEvent copy "time"
		XKeyEvent copy "x"
		XKeyEvent copy "y"
		XKeyEvent copy "x_root"
		XKeyEvent copy "y_root"
		unsigned_int("state")
		unsigned_int("button")
		XKeyEvent copy "same_screen"
	}("xbutton")
	struct(Module.CORE_LINUX, "XMotionEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		XKeyEvent copy "root"
		XKeyEvent copy "subwindow"
		XKeyEvent copy "time"
		XKeyEvent copy "x"
		XKeyEvent copy "y"
		XKeyEvent copy "x_root"
		XKeyEvent copy "y_root"
		unsigned_int("state")
		char("is_hint")
		Bool("same_screen")
	}("xmotion")
	struct(Module.CORE_LINUX, "XCrossingEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		XKeyEvent copy "root"
		XKeyEvent copy "subwindow"
		XKeyEvent copy "time"
		XKeyEvent copy "x"
		XKeyEvent copy "y"
		XKeyEvent copy "x_root"
		XKeyEvent copy "y_root"
		int("mode")
		int("detail")
		int("same_screen")
		int("focus")
		unsigned_int("state")
	}("xcrossing")
	struct(Module.CORE_LINUX, "XFocusChangeEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		int("mode")
		int("detail")
	}("xfocus")
	struct(Module.CORE_LINUX, "XExposeEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		int("x")
		int("y")
		int("width")
		int("height")
		int("count")
	}("xexpose")
	struct(Module.CORE_LINUX, "XGraphicsExposeEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Drawable("drawable")
		int("x")
		int("y")
		int("width")
		int("height")
		int("count")
		int("major_code")
		int("minor_code")
	}("xgraphicsexpose")
	struct(Module.CORE_LINUX, "XNoExposeEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Drawable("drawable")
		int("major_code")
		int("minor_code")
	}("xnoexpose")
	struct(Module.CORE_LINUX, "XVisibilityEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		int("state")
	}("xvisibility")
	struct(Module.CORE_LINUX, "XCreateWindowEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("parent")
		Window("window")
		int("x")
		int("y")
		int("width")
		int("height")
		int("border_width")
		int("override_redirect")
	}("xcreatewindow")
	struct(Module.CORE_LINUX, "XDestroyWindowEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("event")
		Window("window")
	}("xdestroywindow")
	struct(Module.CORE_LINUX, "XUnmapEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("event")
		Window("window")
		int("from_configure")
	}("xunmap")
	struct(Module.CORE_LINUX, "XMapEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("event")
		Window("window")
		int("override_redirect")
	}("xmap")
	struct(Module.CORE_LINUX, "XMapRequestEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("parent")
		Window("window")
	}("xmaprequest")
	struct(Module.CORE_LINUX, "XReparentEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("event")
		Window("window")
		Window("parent")
		int("x")
		int("y")
		int("override_redirect")
	}("xreparent")
	struct(Module.CORE_LINUX, "XConfigureEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		int("x")
		int("y")
		int("width")
		int("height")
		int("border_width")
		Window("above")
		Bool("override_redirect")
	}("xconfigure")
	struct(Module.CORE_LINUX, "XGravityEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("event")
		Window("window")
		int("x")
		int("y")
	}("xgravity")
	struct(Module.CORE_LINUX, "XResizeRequestEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		int("width")
		int("height")
	}("xresizerequest")
	struct(Module.CORE_LINUX, "XConfigureRequestEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("parent")
		Window("window")
		int("x")
		int("y")
		int("width")
		int("height")
		int("border_width")
		Window("above")
		int("detail")
		unsigned_long("value_mask")
	}("xconfigurerequest")
	struct(Module.CORE_LINUX, "XCirculateEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("event")
		Window("window")
		int("place")
	}("xcirculate")
	struct(Module.CORE_LINUX, "XCirculateRequestEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("parent")
		Window("window")
		int("place")
	}("xcirculaterequest")
	struct(Module.CORE_LINUX, "XPropertyEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		Atom("atom")
		Time("time")
		int("state")
	}("xproperty")
	struct(Module.CORE_LINUX, "XSelectionClearEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		Atom("selection")
		Time("time")
	}("xselectionclear")
	struct(Module.CORE_LINUX, "XSelectionRequestEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("owner")
		Window("requestor")
		Atom("selection")
		Atom("target")
		Atom("property")
		Time("time")
	}("xselectionrequest")
	struct(Module.CORE_LINUX, "XSelectionEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("requestor")
		Atom("selection")
		Atom("target")
		Atom("property")
		Time("time")
	}("xselection")
	struct(Module.CORE_LINUX, "XColormapEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		Colormap("colormap")
		int("new")
		int("state")
	}("xcolormap")
	struct(Module.CORE_LINUX, "XClientMessageEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		Atom("message_type")
		int("format")
		struct {
			char("b")[20]
			short("s")[10]
			long("l")[5]
		}("data")
	}("xclient")
	struct(Module.CORE_LINUX, "XMappingEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		int("request")
		int("first_keycode")
		int("count")
	}("xmapping")
	struct(Module.CORE_LINUX, "XErrorEvent") {
		int("type")
		Display.p("display")
		XID("resourceid")
		unsigned_long("serial")
		unsigned_char("error_code")
		unsigned_char("request_code")
		unsigned_char("minor_code")
	}("xerror")
	struct(Module.CORE_LINUX, "XKeymapEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		char("key_vector")[32]
	}("xkeymap")
	struct(Module.CORE_LINUX, "XGenericEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		int("extension")
		int("evtype")
	}("xgeneric")
	struct(Module.CORE_LINUX, "XGenericEventCookie") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		int("extension")
		int("evtype")
		unsigned_int("cookie")
		void.p("data")
	}("xcookie")

	long.padding(24)
}

val XTimeCoord = struct(Module.CORE_LINUX, "XTimeCoord", mutable = false) {
    Time("time")
    short("x")
	short("y")
}