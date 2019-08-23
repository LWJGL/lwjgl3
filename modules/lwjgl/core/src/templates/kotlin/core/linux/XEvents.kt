/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux

import org.lwjgl.generator.*

val XAnyEvent = struct(Module.CORE_LINUX, "XAnyEvent") {
	documentation = "Generic X event."

	int("type", "the event type constant name that uniquely identifies it")
	unsigned_long("serial", "# of last request processed by server")
	Bool("send_event", "true if this came from an #XSendEvent() request")
	Display.p("display", "{@code Display} the event was read from")
	Window("window", "window it reported relative to")
}

val XKeyEvent = struct(Module.CORE_LINUX, "XKeyEvent") {
	documentation = "Key event."

	int("type", "the event type").links("#KeyPress #KeyRelease")
	XAnyEvent copy "serial"
	XAnyEvent copy "send_event"
	XAnyEvent copy "display"
	XAnyEvent copy "window"
	Window("root", "root window that the event occurred on")
	Window("subwindow", "child window")
	Time("time", "milliseconds ")
	int("x", "pointer x coordinate in event window")
	int("y", "pointer y coordinate in event window")
	int("x_root", "x coordinate relative to {@code root}")
	int("y_root", "y coordinate relative to {@code root}")
	unsigned_int("state", "key mask")
	unsigned_int("keycode", "detail")
	Bool("same_screen", "same screen flag")
}

val XEvent = union(Module.CORE_LINUX, "XEvent", mutable = false) {
	documentation = "This union is defined so Xlib can always use the same sized event structure internally, to avoid memory fragmentation."

	int("type", "")
	
	XAnyEvent("xany", "")
	XKeyEvent("xkey", "")
	struct(Module.CORE_LINUX, "XButtonEvent") {
		documentation = "Button event."

		int("type", "the event type").links("#ButtonPress #ButtonRelease")
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
		unsigned_int("state", "button mask")
		unsigned_int("button", "detail")
		XKeyEvent copy "same_screen"
	}("xbutton", "")
	struct(Module.CORE_LINUX, "XMotionEvent") {
		documentation = "Motion event."

		int("type", "the event type").links("#MotionNotify")
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
		unsigned_int("state", "key or button mask")
		char("is_hint", "detail")
		Bool("same_screen", "same screen flag")
	}("xmotion", "")
	struct(Module.CORE_LINUX, "XCrossingEvent") {
		documentation = ""

		int("type", "of event")
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
		int("mode", "").links("#NotifyNormal #NotifyGrab #NotifyUngrab")
		int("detail", "")
		int("same_screen", "same screen flag")
		int("focus", "boolean focus")
		unsigned_int("state", "key or button mask")
	}("xcrossing", "")
	struct(Module.CORE_LINUX, "XFocusChangeEvent") {
		documentation = ""

		int("type", "").links("#FocusIn #FocusOut")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		int("mode", "").links("#NotifyNormal #NotifyWhileGrabbed #NotifyGrab #NotifyUngrab")
		int("detail", "").links(
			"#NotifyAncestor #NotifyVirtual #NotifyInferior #NotifyNonlinear #NotifyNonlinearVirtual #NotifyPointer #NotifyPointerRoot #NotifyDetailNone"
		)
	}("xfocus", "")
	struct(Module.CORE_LINUX, "XExposeEvent") {
		documentation = ""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		int("x", "")
		int("y", "")
		int("width", "")
		int("height", "")
		int("count", "if non-zero, at least this many more")
	}("xexpose", "")
	struct(Module.CORE_LINUX, "XGraphicsExposeEvent") {
		documentation = ""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Drawable("drawable", "")
		int("x", "")
		int("y", "")
		int("width", "")
		int("height", "")
		int("count", "if non-zero, at least this many more")
		int("major_code", "core is {@code CopyArea} or {@code CopyPlane}")
		int("minor_code", "not defined in the core")
	}("xgraphicsexpose", "")
	struct(Module.CORE_LINUX, "XNoExposeEvent") {
		documentation = ""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Drawable("drawable", "")
		int("major_code", "core is {@code CopyArea} or {@code CopyPlane}")
		int("minor_code", "not defined in the core")
	}("xnoexpose", "")
	struct(Module.CORE_LINUX, "XVisibilityEvent") {
		documentation = ""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		int("state", "visibility state")
	}("xvisibility", "")
	struct(Module.CORE_LINUX, "XCreateWindowEvent") {
		documentation = ""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("parent", "parent of the window")
		Window("window", "window id of window created")
		int("x", "window location")
		int("y", "window location")
		int("width", "size of window")
		int("height", "size of window")
		int("border_width", "border width")
		int("override_redirect", "creation should be overridden")
	}("xcreatewindow", "")
	struct(Module.CORE_LINUX, "XDestroyWindowEvent") {
		documentation = ""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("event", "")
		Window("window", "")
	}("xdestroywindow", "")
	struct(Module.CORE_LINUX, "XUnmapEvent") {
		documentation = ""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("event", "")
		Window("window", "")
		int("from_configure", "")
	}("xunmap", "")
	struct(Module.CORE_LINUX, "XMapEvent") {
		documentation = ""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("event", "")
		Window("window", "")
		int("override_redirect", "boolean, is override set...")
	}("xmap", "")
	struct(Module.CORE_LINUX, "XMapRequestEvent") {
		documentation = ""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("parent", "")
		Window("window", "")
	}("xmaprequest", "")
	struct(Module.CORE_LINUX, "XReparentEvent") {
		documentation = ""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("event", "")
		Window("window", "")
		Window("parent", "")
		int("x", "")
		int("y", "")
		int("override_redirect", "")
	}("xreparent", "")
	struct(Module.CORE_LINUX, "XConfigureEvent") {
		documentation = "Motion event."

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		int("x", "")
		int("y", "")
		int("width", "")
		int("height", "")
		int("border_width", "")
		Window("above", "")
		Bool("override_redirect", "")
	}("xconfigure", "")
	struct(Module.CORE_LINUX, "XGravityEvent") {
		documentation = ""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("event", "")
		Window("window", "")
		int("x", "")
		int("y", "")
	}("xgravity", "")
	struct(Module.CORE_LINUX, "XResizeRequestEvent") {
		documentation = ""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		int("width", "")
		int("height", "")
	}("xresizerequest", "")
	struct(Module.CORE_LINUX, "XConfigureRequestEvent") {
		documentation = ""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("parent", "")
		Window("window", "")
		int("x", "")
		int("y", "")
		int("width", "")
		int("height", "")
		int("border_width", "")
		Window("above", "")
		int("detail", "").links("#Above #Below #TopIf #BottomIf #Opposite")
		unsigned_long("value_mask", "")
	}("xconfigurerequest", "")
	struct(Module.CORE_LINUX, "XCirculateEvent") {
		documentation = ""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("event", "")
		Window("window", "")
		int("place", "").links("#PlaceOnTop #PlaceOnBottom")
	}("xcirculate", "")
	struct(Module.CORE_LINUX, "XCirculateRequestEvent") {
		documentation = ""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("parent", "")
		Window("window", "")
		int("place", "").links("#PlaceOnTop #PlaceOnBottom")
	}("xcirculaterequest", "")
	struct(Module.CORE_LINUX, "XPropertyEvent") {
		documentation = "Property event."

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		Atom("atom", "")
		Time("time", "")
		int("state", "").links("#PropertyNewValue #PropertyDelete")
	}("xproperty", "")
	struct(Module.CORE_LINUX, "XSelectionClearEvent") {
		documentation = ""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		Atom("selection", "")
		Time("time", "")
	}("xselectionclear", "")
	struct(Module.CORE_LINUX, "XSelectionRequestEvent") {
		documentation = "SelectionRequest event structure."

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("owner", "")
		Window("requestor", "")
		Atom("selection", "")
		Atom("target", "")
		Atom("property", "")
		Time("time", "")
	}("xselectionrequest", "")
	struct(Module.CORE_LINUX, "XSelectionEvent") {
		documentation = "Selection event structure."

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("requestor", "")
		Atom("selection", "")
		Atom("target", "")
		Atom("property", "atom or #None")
		Time("time", "")
	}("xselection", "")
	struct(Module.CORE_LINUX, "XColormapEvent") {
		documentation = ""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		Colormap("colormap", "colormap or #None")
		int("new", "")
		int("state", "").links("#ColormapInstalled #ColormapUninstalled")
	}("xcolormap", "")
	struct(Module.CORE_LINUX, "XClientMessageEvent") {
		documentation =
			"""
			Client message event.
			
			The {@code message_type} member is set to an atom that indicates how the data should be interpreted by the receiving client. The {@code format}
			member is set to 8, 16, or 32 and specifies whether the data should be viewed as a list of bytes, shorts, or longs. The {@code data} member is a
			union that contains the members {@code b}, {@code s}, and {@code l}. The {@code b}, {@code s}, and {@code l} members represent data of twenty 8-bit
			values, ten 16-bit values, and five 32-bit values. Particular message types might not make use of all these values. The X server places no
			interpretation on the values in the {@code window}, {@code message_type}, or {@code data} members.
			"""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		Atom("message_type", "")
		int("format", "")
		struct {
			char("b", "")[20]
			short("s", "")[10]
			long("l", "")[5]
		}("data", "")
	}("xclient", "")
	struct(Module.CORE_LINUX, "XMappingEvent") {
		documentation = ""

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		int("request", "").links("#MappingModifier #MappingKeyboard #MappingPointer")
		int("first_keycode", "first keycode")
		int("count", "defines range of change w. {@code first_keycode}")
	}("xmapping", "")
	struct(Module.CORE_LINUX, "XErrorEvent") {
		documentation = "Error event."

		int("type", "")
		Display.p("display", "display the event was read from")
		XID("resourceid", "resource id")
		unsigned_long("serial", "serial number of failed request")
		unsigned_char("error_code", "error code of failed request")
		unsigned_char("request_code", "major op-code of failed request")
		unsigned_char("minor_code", "minor op-code of failed request")
	}("xerror", "")
	struct(Module.CORE_LINUX, "XKeymapEvent") {
		documentation = "Generated on {@code EnterWindow} and {@code FocusIn} when {@code KeyMapState} selected."

		int("type", "")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		char("key_vector", "")[32]
	}("xkeymap", "")
	struct(Module.CORE_LINUX, "XGenericEvent") {
		documentation = "GenericEvent. This event is the standard event for all newer extensions."

		int("type", "of event").links("#GenericEvent")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		int("extension", "major opcode of extension that caused the event")
		int("evtype", "actual event type")
	}("xgeneric", "")
	struct(Module.CORE_LINUX, "XGenericEventCookie") {
		documentation = "Additional information for an {@code XGenericEvent}."

		int("type", "of event").links("#GenericEvent")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		int("extension", "major opcode of extension that caused the event")
		int("evtype", "actual event type")
		unsigned_int("cookie", "")
		void.p("data", "")
	}("xcookie", "")

	long("pad", "")[24].private()
}

val XTimeCoord = struct(Module.CORE_LINUX, "XTimeCoord", mutable = false) {
    Time("time", "the time, in milliseconds")
    short("x", "the x coordinate of the pointer relative to the origin of the specified window")
	short("y", "the y coordinate of the pointer relative to the origin of the specified window")
}