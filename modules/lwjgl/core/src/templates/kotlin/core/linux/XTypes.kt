/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux

import org.lwjgl.generator.*

val Bool = typedef(intb, "Bool")
val Status = typedef(int, "Status")

val XID = typedef(unsigned_long, "XID")
val Mask = typedef(unsigned_long, "Mask")
val Atom = typedef(unsigned_long, "Atom")
val VisualID = typedef(unsigned_long, "VisualID")
val Time = typedef(unsigned_long, "Time")

val Colormap = typedef(XID, "Colormap")
val Cursor = typedef(XID, "Cursor")
val Drawable = typedef(XID, "Drawable")
val Font = typedef(XID, "Font")
val Pixmap = typedef(XID, "Pixmap")
val Window = typedef(XID, "Window")

val Display = "Display".opaque // Display is a struct, but should be treated as an opaque type by apps
val DISPLAY = Parameter(Display.p, "display", "the connection to the X server") // This is here so that GLX extensions can use it

val Visual = struct(Module.CORE_LINUX, "Visual") {
    documentation = "Visual structure; contains information about colormapping possible."

    nullable..opaque_p("ext_data", "")
    VisualID("visualid", "")
    int("class", "")
    unsigned_long("red_mask", "")
    unsigned_long("green_mask", "")
    unsigned_long("blue_mask", "")
    int("bits_per_rgb", "")
    int("map_entries", "")
}

val XVisualInfo = struct(Module.CORE_LINUX, "XVisualInfo") {
    documentation = "Information used by the visual utility routines to find desired visual type from the many visuals a display may support."

    Visual.p("visual", "")
    VisualID("visualid", "")
    int("screen", "")
    int("depth", "")
    int("class", "")
    unsigned_long("red_mask", "")
    unsigned_long("green_mask", "")
    unsigned_long("blue_mask", "")
    int("colormap_size", "")
    int("bits_per_rgb", "")
}

val XSetWindowAttributes = struct(Module.CORE_LINUX, "XSetWindowAttributes") {
    documentation = "Data structure for setting window attributes."

    Pixmap("background_pixmap", "")
    unsigned_long("background_pixel", "")
    Pixmap("border_pixmap", "")
    unsigned_long("border_pixel", "")
    int("bit_gravity", "")
    int("win_gravity", "")
    int("backing_store", "")
    unsigned_long("backing_planes", "")
    unsigned_long("backing_pixel", "")
    Bool("save_under", "")
    long("event_mask", "")
    long("do_not_propagate_mask", "")
    Bool("override_redirect", "")
    Colormap("colormap", "")
    Cursor("cursor", "")
}

// --------------- Xrandr.h ---------------

val RROutput = typedef(XID, "RROutput")
val RRCrtc = typedef(XID, "RRCrtc")