/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

fun Xutil() = "Xutil".nativeClass(LINUX_PACKAGE) {
	nativeImport (
		"LinuxLWJGL.h",
	    "<X11/Xutil.h>"
	)

	javaDoc("Native bindings to Xutil.h.")

	IntConstant.block(
		"Definition for flags of {@link XWMHints}",

		"InputHint".expr<Int>("1 << 0"),
		"StateHint".expr<Int>("1 << 1"),
		"IconPixmapHint".expr<Int>("1 << 2"),
		"IconWindowHint".expr<Int>("1 << 3"),
		"IconPositionHint".expr<Int>("1 << 4"),
		"IconMaskHint".expr<Int>("1 << 5"),
		"WindowGroupHint".expr<Int>("1 << 6"),
		"AllHints".expr<Int>("InputHint|StateHint|IconPixmapHint|IconWindowHint|IconPositionHint|IconMaskHint|WindowGroupHint"),
		"XUrgencyHint".expr<Int>("1 << 8")
	)

	IntConstant.block(
		"Definitions for initial window state",

		"WithdrawnState" _ 0,
		"NormalState" _ 1,
		"IconicState" _ 3
	)

	int.func(
		"XLookupString",
	    """
	    Translates a key event to a {@code KeySym} and a string. The {@code KeySym} is obtained by using the standard interpretation of the Shift, Lock, group,
	    and numlock modifiers as defined in the X Protocol specification. If the {@code KeySym} has been rebound (see {@link Xlib#XRebindKeysym}), the bound
	    string will be stored in the buffer. Otherwise, the {@code KeySym} is mapped, if possible, to an ISO Latin-1 character or (if the Control modifier is
	    on) to an ASCII control character, and that character is stored in the buffer. {@code XLookupString} returns the number of characters that are stored
	    in the buffer.

		If present (non-$NULL), the {@link XComposeStatus} structure records the state, which is private to Xlib, that needs preservation across calls to
		{@code XLookupString} to implement compose processing. The creation of {@link XComposeStatus} structures is implementation dependent; a portable
		program must pass $NULL for this argument.

		{@code XLookupString} depends on the cached keyboard information mentioned in the previous section, so it is necessary to use
		{@link Xlib#XRefreshKeyboardMapping} to keep this information up-to-date.
	    """,

	    XKeyEvent_p.IN("event_struct", "specifies the {@link XKeyEvent} structure to be used."),
		char_p.OUT("buffer_return", "returns the translated characters"),
	    AutoSize("buffer_return") _ int.IN("bytes_buffer", "specifies the length of the buffer. No more than {@code bytes_buffer} of translation are returned."),
	    KeySym_p.OUT("keysym_return", "returns the {@code KeySym} computed from the event if this argument is not $NULL"),
	    XComposeStatus_p.IN("status_in_out", "specifies or returns the {@link XComposeStatus} structure or $NULL.")
	)

	XWMHints_p.func(
		"XAllocWMHints",
	    """
	    Allocates and returns a pointer to a {@link XWMHints} structure. Note that all fields in the {@link XWMHints} structure are initially set to zero. If
	    insufficient memory is available, {@code XAllocWMHints} returns $NULL. To free the memory allocated to this structure, use {@link Xlib#XFree}.
	    """
	)

	XSizeHints_p.func(
		"XAllocSizeHints",
		"""
	    Allocates and returns a pointer to a {@link XSizeHints} structure. Note that all fields in the {@link XSizeHints} structure are initially set to zero.
	    If insufficient memory is available, {@code XAllocSizeHints} returns $NULL. To free the memory allocated to this structure, use {@link Xlib#XFree}.
	    """
	)

}