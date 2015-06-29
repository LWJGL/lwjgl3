/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux

import org.lwjgl.generator.*

val Bool = typedef(int, "Bool")
val Status = typedef(int, "Status")

val CARD32 = typedef(unsigned_int, "CARD32")

val XID = typedef(unsigned_long, "XID")
val Mask = typedef(unsigned_long, "Mask")
val Atom = typedef(unsigned_long, "Atom")
val VisualID = typedef(unsigned_long, "VisualID")
val Time = typedef(unsigned_long, "Time")

val Window = typedef(XID, "Window")
val Drawable = typedef(XID, "Drawable")
val Font = typedef(XID, "Font")
val Pixmap = typedef(XID, "Pixmap")
val Cursor = typedef(XID, "Cursor")
val Colormap = typedef(XID, "Colormap")
val GContext = typedef(XID, "GContext")
val KeySym = typedef(XID, "KeySym")

val KeyCode = typedef(unsigned_char, "KeyCode")

val XContext = typedef(int, "XContext")
val XPointer = PointerType(char)
val XPointer_p = PointerType(XPointer)

val Bool_p = PointerType(Bool)
val Atom_p = PointerType(Atom)
val KeySym_p = PointerType(KeySym)

val Display_p = PointerType("Display") // Display is a struct, but should be treated as an opaque type by apps
val DISPLAY = Display_p.IN("display", "the connection to the X server") // This is here so that GLX extensions can use it

val Screen_p = PointerType("Screen") // Screen is a struct, but should be treated as an opaque type by apps
val Window_p = PointerType(Window)

val XComposeStatus = struct(LINUX_PACKAGE, "XComposeStatus") {
	documentation = "Compose sequence status structure, used in calling Xutil#XLookupString()."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/Xutil.h>"
	)
	XPointer.member("compose_ptr")
	int.member("chars_matched")
}.nativeType
val XComposeStatus_p = StructType(XComposeStatus)

val XSetWindowAttributes = struct(LINUX_PACKAGE, "XSetWindowAttributes") {
	documentation = "Data structure for setting window attributes."
	nativeImport ("LinuxLWJGL.h")

	Pixmap.member("background_pixmap")
	unsigned_long.member("background_pixel")
	Pixmap.member("border_pixmap")
	unsigned_long.member("border_pixel")
	int.member("bit_gravity")
	int.member("win_gravity")
	int.member("backing_store")
	unsigned_long.member("backing_planes")
	unsigned_long.member("backing_pixel")
	Bool.member("save_under")
	long.member("event_mask")
	long.member("do_not_propagate_mask")
	Bool.member("override_redirect")
	Colormap.member("colormap")
	Cursor.member("cursor")
}.nativeType
val XSetWindowAttributes_p = StructType(XSetWindowAttributes)

val Visual = struct(LINUX_PACKAGE, "Visual") {
	documentation = "Visual structure; contains information about colormapping possible."
	nativeImport ("LinuxLWJGL.h")

	// ignored: XExtData_p.member("ext_data")
	VisualID.member("visualid")
	int.member("class", "clazz")
	unsigned_long.member("red_mask")
	unsigned_long.member("green_mask")
	unsigned_long.member("blue_mask")
	int.member("bits_per_rgb")
	int.member("map_entries")
}.nativeType
val Visual_p = StructType(Visual)

val XWindowAttributes = struct(LINUX_PACKAGE, "XWindowAttributes") {
	documentation = "Data structure for window attributes."
	nativeImport ("LinuxLWJGL.h")

	int.member("x")
	int.member("y")
	int.member("width")
	int.member("height")
	int.member("border_width")
	int.member("depth")
	Visual_p.member("visual")
	Window.member("root")
	int.member("class", "clazz")
	int.member("bit_gravity")
	int.member("win_gravity")
	int.member("backing_store")
	unsigned_long.member("backing_planes")
	unsigned_long.member("backing_pixel")
	Bool.member("save_under")
	Colormap.member("colormap")
	Bool.member("map_installed")
	int.member("map_state")
	long.member("all_event_masks")
	long.member("your_event_mask")
	long.member("do_not_propagate_mask")
	Bool.member("override_redirect")
	Screen_p.member("screen")
}.nativeType
val XWindowAttributes_p = StructType(XWindowAttributes)

val XVisualInfo = struct(LINUX_PACKAGE, "XVisualInfo") {
	documentation = "Information used by the visual utility routines to find desired visual type from the many visuals a display may support."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/Xutil.h>"
	)

	Visual_p.member("visual")
	VisualID.member("visualid")
	int.member("screen")
	int.member("depth")
	int.member("class", "clazz")
	unsigned_long.member("red_mask")
	unsigned_long.member("green_mask")
	unsigned_long.member("blue_mask")
	int.member("colormap_size")
	int.member("bits_per_rgb")
}.nativeType
val XVisualInfo_p = StructType(XVisualInfo)

val XSizeHints = struct(LINUX_PACKAGE, "XSizeHints") {
	documentation = "Used by Xlib#XSetSizeHints()."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/Xutil.h>"
	)

	val aspect = struct {
		int.member("x")
		int.member("y")
	}

	long.member("flags")
	int.member("x")
	int.member("y")
	int.member("width")
	int.member("height")
	int.member("min_width")
	int.member("min_height")
	int.member("max_width")
	int.member("max_height")
	int.member("width_inc")
	int.member("height_inc")
	aspect.member("min_aspect")
	aspect.member("max_aspect")
	int.member("base_width")
	int.member("base_height")
	int.member("win_gravity")
}.nativeType
val XSizeHints_p = StructType(XSizeHints)

val XWMHints = struct(LINUX_PACKAGE, "XWMHints") {
	documentation = "Used by Xlib#XSetWMHints()."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/Xutil.h>"
	)

	long.member("flags")
	Bool.member("input")
	int.member("initial_state")
	Pixmap.member("icon_pixmap")
	Window.member("icon_window")
	int.member("icon_x")
	int.member("icon_y")
	Pixmap.member("icon_mask")
	XID.member("window_group")
}.nativeType
val XWMHints_p = StructType(XWMHints)

val XClassHint = struct(LINUX_PACKAGE, "XClassHint") {
	documentation = "Used by Xlib#XSetClassHint()."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/Xutil.h>"
	)

	charASCII_p.member("res_name")
	charASCII_p.member("res_class")
}.nativeType
val XClassHint_p = StructType(XClassHint)

// --------------- XInput2.h ---------------

val XIEventMask = struct(LINUX_PACKAGE, "XIEventMask") {
	documentation = "XInput2 event mask."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/extensions/XInput2.h>"
	)

	int.member("deviceid")
	unsigned_char_p.member("mask")
	int.member("mask_len")
}.nativeType
val XIEventMask_p = StructType(XIEventMask)

val XIButtonState = struct(LINUX_PACKAGE, "XIButtonState") {
	documentation = "XInput2 button state."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/extensions/XInput2.h>"
	)

	int.member("mask_len")
	unsigned_char_p.member("mask")
}.nativeType

val XIValuatorState = struct(LINUX_PACKAGE, "XIValuatorState") {
	documentation = "XInput2 valuator state."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/extensions/XInput2.h>"
	)

	int.member("mask_len")
	unsigned_char_p.member("mask")
	double_p.member("values")
}.nativeType

val XIModifierState = struct(LINUX_PACKAGE, "XIModifierState") {
	documentation = "XInput2 modifier state."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/extensions/XInput2.h>"
	)

	int.member("base")
	int.member("latched")
	int.member("locked")
	int.member("effective")
}.nativeType

val XIDeviceEvent = struct(LINUX_PACKAGE, "XIDeviceEvent") {
	documentation = "XInput2 device event."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/extensions/XInput2.h>"
	)

	int.member("type")
	unsigned_long.member("serial")
	Bool.member("send_event")
	Display_p.member("display")
	int.member("extension")
	int.member("evtype")
	Time.member("time")
	int.member("deviceid")
	int.member("sourceid")
	int.member("detail")
	Window.member("root")
	Window.member("event")
	Window.member("child")
	double.member("root_x")
	double.member("root_y")
	double.member("event_x")
	double.member("event_y")
	int.member("flags")
	XIButtonState.member("buttons")
	XIValuatorState.member("valuators")
	XIModifierState.member("mods")
	XIModifierState.member("group") // XIGroupState == XIModifierState
}.nativeType

// --------------- joystick.h ---------------

val JSEvent = struct(LINUX_PACKAGE, "JSEvent", structName = "js_event", identifierType = StructIdentifierType.STRUCT) {
	documentation = "Joystick event."
	nativeImport (
		"LinuxLWJGL.h",
		"<linux/joystick.h>"
	)

	int.member("time")
	short.member("value")
	unsigned_char.member("type")
	unsigned_char.member("number")
}.nativeType

// --------------- Xrandr.h ---------------

val Rotation = typedef(unsigned_short, "Rotation")
val SizeID = typedef(unsigned_short, "SizeID")
val SubpixelOrder = typedef(unsigned_short, "SubpixelOrder")
val Connection = typedef(unsigned_short, "Connection")
val XRandrRotation = typedef(unsigned_short, "XRandrRotation")
val XRandrSizeID = typedef(unsigned_short, "XRandrSizeID")
val XRandrSubpixelOrder = typedef(unsigned_short, "XRandrSubpixelOrder")
val XRRModeFlags = typedef(unsigned_long, "XRRModeFlags")

val RROutput = typedef(XID, "RROutput")
val RRCrtc = typedef(XID, "RRCrtc")
val RRMode = typedef(XID, "RRMode")
val RRProvider = typedef(XID, "RRProvider")

val XRRModeFlags_p = PointerType(XRRModeFlags)

val RROutput_p = PointerType(RROutput)
val RRCrtc_p = PointerType(RRCrtc)
val RRMode_p = PointerType(RRMode)

val XRRModeInfo = struct(LINUX_PACKAGE, "XRRModeInfo") {
	documentation = "Xrandr mode info struct."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/extensions/Xrandr.h>"
	)

	RRMode.member("id");
	unsigned_int.member("width");
	unsigned_int.member("height");
	unsigned_long.member("dotClock");
	unsigned_int.member("hSyncStart");
	unsigned_int.member("hSyncEnd");
	unsigned_int.member("hTotal");
	unsigned_int.member("hSkew");
	unsigned_int.member("vSyncStart");
	unsigned_int.member("vSyncEnd");
	unsigned_int.member("vTotal");
	char_p.member("name");
	unsigned_int.member("nameLength");
	XRRModeFlags.member("modeFlags");
}.nativeType
val XRRModeInfo_p = StructType(XRRModeInfo)

val XRRScreenResources = struct(LINUX_PACKAGE, "XRRScreenResources") {
	documentation = "Xrandr screen resources struct."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/extensions/Xrandr.h>"
	)

	Time.member("timestamp")
	Time.member("configTimestamp")
	int.member("ncrtc")
	RRCrtc_p.member("crtcs")
	int.member("noutput")
	RROutput_p.member("outputs")
	int.member("nmode")
	XRRModeInfo_p.member("modes")
}.nativeType
val XRRScreenResources_p = StructType(XRRScreenResources)

val XRRCrtcInfo = struct(LINUX_PACKAGE, "XRRCrtcInfo") {
	documentation = "Xrandr Crtc info struct."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/extensions/Xrandr.h>"
	)

	Time.member("timestamp")
	int.member("x")
	int.member("y")
	unsigned_int.member("width")
	unsigned_int.member("height")
	RRMode.member("mode")
	Rotation.member("rotation")
	int.member("noutput")
	RROutput_p.member("outputs")
	Rotation.member("rotations")
	int.member("npossible")
	RROutput_p.member("possible")
}.nativeType
val XRRCrtcInfo_p = StructType(XRRCrtcInfo)

val XRROutputInfo = struct(LINUX_PACKAGE, "XRROutputInfo") {
	documentation = "Xrandr output info struct."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/extensions/Xrandr.h>"
	)

	Time.member("timestamp")
	RRCrtc.member("crtc")
	char_p.member("name")
	int.member("nameLen")
	unsigned_long.member("mm_width")
	unsigned_long.member("mm_height")
	Connection.member("connection")
	SubpixelOrder.member("subpixel_order")
	int.member("ncrtc")
	RRCrtc_p.member("crtcs")
	int.member("nclone")
	RROutput_p.member("clones")
	int.member("nmode")
	int.member("npreferred")
	RRMode_p.member("modes")
}.nativeType
val XRROutputInfo_p = StructType(XRROutputInfo)

val XRRCrtcGamma = struct(LINUX_PACKAGE, "XRRCrtcGamma") {
	documentation = "Xrandr CrtcGamma struct."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/extensions/Xrandr.h>"
	)

	int.member("size")
	unsigned_short_p.member("red")
	unsigned_short_p.member("green")
	unsigned_short_p.member("blue")
}.nativeType
val XRRCrtcGamma_p = StructType(XRRCrtcGamma)

// --------------- XKBlib.h ---------------

// TODO: are these portable?
val XkbKeyNameLength = 4
val XkbNumVirtualMods = 16
val XkbNumIndicators = 32
val XkbNumKbdGroups = 4

val XkbKeyNameRec = struct(LINUX_PACKAGE, "XkbKeyNameRec") {
	documentation = "Xkb key name record."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/XKBlib.h>"
	)

	charASCII.member("name", size = XkbKeyNameLength, nullTerminated = false)
}.nativeType
val XkbKeyNamePtr = StructType(XkbKeyNameRec)

val XkbKeyAliasRec = struct(LINUX_PACKAGE, "XkbKeyAliasRec") {
	documentation = "Xkb key alias record."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/XKBlib.h>"
	)

	charASCII.member("real", size = XkbKeyNameLength, nullTerminated = false)
	charASCII.member("alias", size = XkbKeyNameLength, nullTerminated = false)
}.nativeType
val XkbKeyAliasPtr = StructType(XkbKeyAliasRec)

val XkbNamesRec = struct(LINUX_PACKAGE, "XkbNamesRec") {
	documentation = "Describes an Xkb keyboard."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/XKBlib.h>"
	)

	Atom.member("keycodes")
	Atom.member("geometry")
	Atom.member("symbols")
	Atom.member("types")
	Atom.member("compat")
	Atom.member("vmods", size = XkbNumVirtualMods)
	Atom.member("indicators", size = XkbNumIndicators)
	Atom.member("groups", size = XkbNumKbdGroups)
	XkbKeyNamePtr.member("keys")
	XkbKeyAliasPtr.member("key_aliases")
	Atom_p.member("radio_groups")
	Atom.member("phys_symbols")

	unsigned_char.member("num_keys")
	unsigned_char.member("num_key_aliases")
	unsigned_short.member("num_rg")
}.nativeType
val XkbNamesPtr = StructType(XkbNamesRec)

val XkbDescRec = struct(LINUX_PACKAGE, "XkbDescRec") {
	documentation = "Describes an Xkb keyboard."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/XKBlib.h>"
	)

	Display_p.member("dpy")
	// private: unsigned_short.member("flags")
	unsigned_short.member("device_spec")
	KeyCode.member("min_key_code")
	KeyCode.member("max_key_code")
	// hidden until we need them
	//XkbControlsPtr.member("ctrls")
	//XkbServerMapPtr.member("server")
	//XkbClientMapPtr.member("map")
	//XkbIndicatorPtr.member("indicators")
	XkbNamesPtr.member("names")
	//XkbCompatMapPtr.member("compat")
	//XkbGeometryPtr.member("geom")
}.nativeType
val XkbDescPtr = StructType(XkbDescRec)

// ------------- Graphics --------------

val XGCValues = struct(LINUX_PACKAGE, "XGCValues") {
	documentation = "Data structure for setting graphics context."
	nativeImport ("LinuxLWJGL.h")

	int.member("function")
	unsigned_long.member("plane_mask")
	unsigned_long.member("foreground")
	unsigned_long.member("background")
	int.member("line_width")
	int.member("line_style")
	int.member("cap_style")
	int.member("join_style")
	int.member("fill_style")
	int.member("fill_rule")
	int.member("arc_mode")
	Pixmap.member("tile")
	Pixmap.member("stipple")
	int.member("ts_x_origin")
	int.member("ts_y_origin")
	Font.member("font")
	int.member("subwindow_mode")
	Bool.member("graphics_exposures")
	int.member("clip_x_origin")
	int.member("clip_y_origin")
	Pixmap.member("clip_mask")
	int.member("dash_offset")
	char.member("dashes")
}.nativeType
val XGCValues_p = StructType(XGCValues)

val GC = PointerType("GC", includesPointer = true) // GC is a struct, but should be treated as an opaque type by apps

val XColor = struct(LINUX_PACKAGE, "XColor") {
	documentation = "Data structure used by color operations."
	nativeImport ("LinuxLWJGL.h")

	unsigned_long.member("pixel")
	unsigned_short.member("red")
	unsigned_short.member("green")
	unsigned_short.member("blue")
	char.member("flags")
	char.member("pad")
}.nativeType
val XColor_p = StructType(XColor)