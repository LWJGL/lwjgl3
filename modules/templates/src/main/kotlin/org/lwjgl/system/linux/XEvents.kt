/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux

import org.lwjgl.generator.*

val XAnyEvent = struct(LINUX_PACKAGE, "XAnyEvent") {
	documentation = "Any event."
	nativeImport ("LinuxLWJGL.h")

	int.member("type")
	unsigned_long.member("serial")
	Bool.member("send_event")
	Display_p.member("display")
	Window.member("window")
}.nativeType

val XKeyEvent = struct(LINUX_PACKAGE, "XKeyEvent") {
	documentation = "Key event."
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
}.nativeType
val XKeyEvent_p = StructType(XKeyEvent)

val XButtonEvent = struct(LINUX_PACKAGE, "XButtonEvent") {
	documentation = "Button event."
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
}.nativeType

val XMotionEvent = struct(LINUX_PACKAGE, "XMotionEvent") {
	documentation = "Motion event."
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
}.nativeType

val XConfigureEvent = struct(LINUX_PACKAGE, "XConfigureEvent") {
	documentation = "Motion event."
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
}.nativeType

val XPropertyEvent = struct(LINUX_PACKAGE, "XPropertyEvent") {
	documentation = "Property event."
	nativeImport ("LinuxLWJGL.h")

	int.member("type")
	unsigned_long.member("serial")
	Bool.member("send_event")
	Display_p.member("display")
	Window.member("window")
	Atom.member("atom")
	Time.member("time")
	int.member("state")
}.nativeType

val XSelectionRequestEvent = struct(LINUX_PACKAGE, "XSelectionRequestEvent") {
	documentation = "SelectionRequest event structure."
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
}.nativeType
val XSelectionRequestEvent_p = StructType(XSelectionRequestEvent)

val XSelectionEvent = struct(LINUX_PACKAGE, "XSelectionEvent") {
	documentation = "Selection event structure."
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
}.nativeType

val XClientMessageEvent = struct(LINUX_PACKAGE, "XClientMessageEvent") {
	documentation = "Client message event."
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
}.nativeType

val XErrorEvent = struct(LINUX_PACKAGE, "XErrorEvent") {
	documentation = "Error event."
	nativeImport ("LinuxLWJGL.h")

	int.member("type")
	Display_p.member("display")
	unsigned_long.member("serial")
	unsigned_char.member("error_code")
	unsigned_char.member("request_code")
	unsigned_char.member("minor_code")
	XID.member("resourceid")
}.nativeType
val XErrorEvent_p = StructType(XErrorEvent)

val XErrorHandler = callback(
	LINUX_PACKAGE, void, "XErrorHandler",
	"Will be called with an X error occurs.",
	DISPLAY,
	XErrorEvent_p.IN("error_event", "the {@link XErrorEvent} structure describing the error")
) {
	documentation = "Instances of this interface may be passed to the Xlib##XSetErrorHandler() method."
}.nativeType

val XGenericEventCookie = struct(LINUX_PACKAGE, "XGenericEventCookie") {
	documentation = "Additional information for an {@code XGenericEvent}."
	nativeImport ("LinuxLWJGL.h")

	int.member("type")
	unsigned_long.member("serial")
	Bool.member("send_event")
	Display_p.member("display")
	int.member("extension")
	int.member("evtype")
	unsigned_int.member("cookie")
	void_p.member("data")
}.nativeType
val XGenericEventCookie_p = StructType(XGenericEventCookie)

val XEvent = struct(LINUX_PACKAGE, "XEvent") {
	documentation = "This union is defined so Xlib can always use the same sized event structure internally, to avoid memory fragmentation."
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

	//long.member("pad", size = 24)
}.nativeType
val XEvent_p = StructType(XEvent)

fun config() {
	struct(LINUX_PACKAGE, "PropertyWMState", virtual = true) {
		documentation = "Contents of the WM_STATE property."
		nativeImport(
			"LinuxLWJGL.h",
			"<X11/Xmd.h>" // for the CARD32 typedef
		)

		CARD32.member("state")
		Window.member("icon")
	}
}