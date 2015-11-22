/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux

import org.lwjgl.generator.*

val Bool = typedef(int, "Bool")

val XID = typedef(unsigned_long, "XID")
val VisualID = typedef(unsigned_long, "VisualID")

val Window = typedef(XID, "Window")
val Font = typedef(XID, "Font")
val Pixmap = typedef(XID, "Pixmap")

val Display_p = "Display".p // Display is a struct, but should be treated as an opaque type by apps
val DISPLAY = Display_p.IN("display", "the connection to the X server") // This is here so that GLX extensions can use it

val Visual_p = struct_p(LINUX_PACKAGE, "Visual") {
	documentation = "Visual structure; contains information about colormapping possible."

	// ignored: XExtData_p.member("ext_data")
	VisualID.member("visualid", "")
	int.member("class", "")
	unsigned_long.member("red_mask", "")
	unsigned_long.member("green_mask", "")
	unsigned_long.member("blue_mask", "")
	int.member("bits_per_rgb", "")
	int.member("map_entries", "")
}

val XVisualInfo_p = struct_p(LINUX_PACKAGE, "XVisualInfo") {
	documentation = "Information used by the visual utility routines to find desired visual type from the many visuals a display may support."

	Visual_p.member("visual", "")
	VisualID.member("visualid", "")
	int.member("screen", "")
	int.member("depth", "")
	int.member("class", "")
	unsigned_long.member("red_mask", "")
	unsigned_long.member("green_mask", "")
	unsigned_long.member("blue_mask", "")
	int.member("colormap_size", "")
	int.member("bits_per_rgb", "")
}

// --------------- Xrandr.h ---------------

val RROutput = typedef(XID, "RROutput")
val RRCrtc = typedef(XID, "RRCrtc")