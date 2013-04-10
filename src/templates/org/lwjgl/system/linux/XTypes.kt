/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux

import org.lwjgl.generator.*

val Status = PrimitiveType("Bool", int)

val XID = PrimitiveType("XID", unsigned_long)
val Mask = PrimitiveType("Mask", unsigned_long)
val Atom = PrimitiveType("Atom", unsigned_long)
val VisualID = PrimitiveType("VisualID", unsigned_long)
val Time = PrimitiveType("Time", unsigned_long)

val Window = PrimitiveType("Window", XID)
val Drawable = PrimitiveType("Drawable", XID)
val Font = PrimitiveType("Font", XID)
val Pixmap = PrimitiveType("Pixmap", XID)
val Cursor = PrimitiveType("Cursor", XID)
val Colormap = PrimitiveType("Colormap", XID)
val GContext = PrimitiveType("GContext", XID)
val KeySym = PrimitiveType("KeySym", XID)

val KeyCode = PrimitiveType("KeyCode", unsigned_char)

val XPointer = PointerType(char)

val Atom_p = PointerType(Atom)
val KeySym_p = PointerType(KeySym)

val Display_p = PointerType("Display") // Display is a struct, but should be treated as an opaque type by apps
val DISPLAY = Display_p.IN("display", "the connection to the X server") // This is here so that GLX extensions can use it

val Screen_p = PointerType("Screen") // Screen is a struct, but should be treated as an opaque type by apps
val Window_p = PointerType(Window)

// TODO: This type is not in the Xlib spec, typedef manually?
val XErrorHandler = PointerType("XErrorHandler", includesPointer = true)

val XComposeStatus = StructType(
	struct(LINUX_PACKAGE, "XComposeStatus") {
		javaDoc("Compose sequence status structure, used in calling {@link Xutil#XLookupString}.")
		nativeImport (
			"LinuxLWJGL.h",
		    "<X11/Xutil.h>"
		)
		XPointer.member("compose_ptr")
		int.member("chars_matched")
	}
)
val XComposeStatus_p = StructType(XComposeStatus)

val XSetWindowAttributes = StructType(
	struct(LINUX_PACKAGE, "XSetWindowAttributes") {
		javaDoc("Data structure for setting window attributes.")
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
	}
)
val XSetWindowAttributes_p = StructType(XSetWindowAttributes)

val Visual = StructType(
	struct(LINUX_PACKAGE, "Visual") {
		javaDoc("Visual structure; contains information about colormapping possible.")
		nativeImport ("LinuxLWJGL.h")

		// ignored: XExtData_p.member("ext_data")
		VisualID.member("visualid")
		int.member("class", "clazz")
		unsigned_long.member("red_mask")
		unsigned_long.member("green_mask")
		unsigned_long.member("blue_mask")
		int.member("bits_per_rgb")
		int.member("map_entries")
	}
)
val Visual_p = StructType(Visual)

val XWindowAttributes = StructType(
	struct(LINUX_PACKAGE, "XWindowAttributes") {
		javaDoc("Data structure for window attributes.")
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
	}
)
val XWindowAttributes_p = StructType(XWindowAttributes)

val XVisualInfo = StructType(
	struct(LINUX_PACKAGE, "XVisualInfo") {
		javaDoc("Information used by the visual utility routines to find desired visual type from the many visuals a display may support.")
		nativeImport (
			"LinuxLWJGL.h",
			"<X11/Xutil.h>"
		)

		PointerType("Visual").member("visual")
		VisualID.member("visualid")
		int.member("screen")
		int.member("depth")
		int.member("class", "clazz")
		unsigned_long.member("red_mask")
		unsigned_long.member("green_mask")
		unsigned_long.member("blue_mask")
		int.member("colormap_size")
		int.member("bits_per_rgb")
	}
)
val XVisualInfo_p = StructType(XVisualInfo)

val XSizeHints = StructType(
	struct(LINUX_PACKAGE, "XSizeHints") {
		javaDoc("Used by {@link Xlib#XSetSizeHints}.")
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
	}
)
val XSizeHints_p = StructType(XSizeHints)

val XWMHints = StructType(
	struct(LINUX_PACKAGE, "XWMHints") {
		javaDoc("Used by {@link Xlib#XSetWMHints}.")
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
	}
)
val XWMHints_p = StructType(XWMHints)

val XClassHint = StructType(
	struct(LINUX_PACKAGE, "XClassHint") {
		javaDoc("Used by {@link Xlib#XSetClassHint}.")
		nativeImport (
			"LinuxLWJGL.h",
			"<X11/Xutil.h>"
		)

		charASCII_p.member("res_name")
		charASCII_p.member("res_class")
	}
)
val XClassHint_p = StructType(XClassHint)

val XIEventMask = StructType(
	struct(LINUX_PACKAGE, "XIEventMask") {
		javaDoc("XInput2 event mask.")
		nativeImport (
			"LinuxLWJGL.h",
		    "<X11/extensions/XInput2.h>"
		)

		int.member("deviceid")
		unsigned_char_p.member("mask")
		int.member("mask_len")
	}
)
val XIEventMask_p = StructType(XIEventMask)

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

// --------------- Xrandr.h ---------------

val Rotation = PrimitiveType("Rotation", unsigned_short)
val SizeID = PrimitiveType("SizeID", unsigned_short)
val SubpixelOrder = PrimitiveType("SubpixelOrder", unsigned_short)
val Connection = PrimitiveType("Connection", unsigned_short)
val XRandrRotation = PrimitiveType("XRandrRotation", unsigned_short)
val XRandrSizeID = PrimitiveType("XRandrSizeID", unsigned_short)
val XRandrSubpixelOrder = PrimitiveType("XRandrSubpixelOrder", unsigned_short)
val XRRModeFlags = PrimitiveType("XRRModeFlags", unsigned_long)

val RROutput = PrimitiveType("RROutput", XID)
val RRCrtc = PrimitiveType("RRCrtc", XID)
val RRMode = PrimitiveType("RRMode", XID)
val RRProvider = PrimitiveType("RRProvider", XID)

val XRRModeFlags_p = PointerType(XRRModeFlags)

val RROutput_p = PointerType(RROutput)
val RRCrtc_p = PointerType(RRCrtc)

val XRRModeInfo = StructType(
	struct(LINUX_PACKAGE, "XRRModeInfo") {
		javaDoc("Xrandr mode info struct.")
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
	}
)
val XRRModeInfo_p = StructType(XRRModeInfo)

val XRRScreenResources = StructType(
	struct(LINUX_PACKAGE, "XRRScreenResources") {
		javaDoc("Xrandr screen resources struct.")
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
	}
)
val XRRScreenResources_p = StructType(XRRScreenResources)

val XRRCrtcInfo = StructType(
	struct(LINUX_PACKAGE, "XRRCrtcInfo") {
		javaDoc("Xrandr Crtc info struct.")
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
	}
)
val XRRCrtcInfo_p = StructType(XRRCrtcInfo)

val XRROutputInfo = StructType(
	struct(LINUX_PACKAGE, "XRROutputInfo") {
		javaDoc("Xrandr output info struct.")
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
	}
)
val XRROutputInfo_p = StructType(XRROutputInfo)

val XRRCrtcGamma = StructType(
	struct(LINUX_PACKAGE, "XRRCrtcGamma") {
		javaDoc("Xrandr CrtcGamma struct.")
		nativeImport (
			"LinuxLWJGL.h",
			"<X11/extensions/Xrandr.h>"
		)

		int.member("size")
	    unsigned_short_p.member("red")
		unsigned_short_p.member("green")
		unsigned_short_p.member("blue")
	}
)
val XRRCrtcGamma_p = StructType(XRRCrtcGamma)

// --------------- XKBlib.h ---------------

val XkbDescRec = StructType(
	struct(LINUX_PACKAGE, "XkbDescRec") {
		javaDoc("Describes an Xkb keyboard.")
		nativeImport (
			"LinuxLWJGL.h",
			"<X11/XKBlib.h>"
		)

		Display_p.member("dpy")
		// private: unsigned_short.member("flags")
		unsigned_short.member("device_spec")
		KeyCode.member("min_key_code")
		KeyCode.member("max_key_code")
		/* hidden until we need them
		XkbControlsPtr.member("ctrls")
		XkbServerMapPtr.member("server")
		XkbClientMapPtr.member("map")
		XkbIndicatorPtr.member("indicators")
		XkbNamesPtr.member("names")
		XkbCompatMapPtr.member("compat")
		XkbGeometryPtr.member("geom")
		*/
	}
)
val XkbDescPtr = StructType(XkbDescRec)

// ------------- Graphics --------------

val XGCValues = StructType(
	struct(LINUX_PACKAGE, "XGCValues") {
		javaDoc("Data structure for setting graphics context.")
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
	}
)
val XGCValues_p = StructType(XGCValues)

val GC = PointerType("GC", includesPointer = true) // GC is a struct, but should be treated as an opaque type by apps

val XColor = StructType(
	struct(LINUX_PACKAGE, "XColor") {
		javaDoc("Data structure used by color operations.")
		nativeImport ("LinuxLWJGL.h")

		unsigned_long.member("pixel")
		unsigned_short.member("red")
		unsigned_short.member("green")
		unsigned_short.member("blue")
		char.member("flags")
		char.member("pad")
	}
)
val XColor_p = StructType(XColor)