/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

val WINDOW = Window.IN("w", "the window")
val DRAWABLE = Drawable.IN("d", "the drawable")

val Xlib = "Xlib".nativeClass(LINUX_PACKAGE) {
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/Xutil.h>"
	)

	documentation = "Native bindings to Xlib.h."

	IntConstant(
		"Boolean values",

		"True" _ 1,
		"False" _ 0
	)

	IntConstant(
		"Event queue modes.",

		"QueuedAlready" _ 0,
		"QueuedAfterReading" _ 1,
		"QueuedAfterFlush" _ 2
	)

	Status(
		"XInitThreads",
		"""
		Initializes Xlib support for concurrent threads. This function must be the first Xlib function a multi-threaded program calls, and it must complete
		before any other Xlib call is made. This function returns a nonzero status if initialization was successful; otherwise, it returns zero. On systems that
		do not support threads, this function always returns zero.

		It is only necessary to call this function if multiple threads might use Xlib concurrently. If all calls to Xlib functions are protected by some other
		access mechanism (for example, a mutual exclusion lock in a toolkit or through explicit client programming), Xlib thread initialization is not required.
		It is recommended that single-threaded programs not call this function.
		"""
	)

	XErrorHandler(
		"XSetErrorHandler",
		"""
		Sets the error handler that will be invoked when a X11 protocol error occurs. If {@code handler} is $NULL, the default error handler is used. The action
		of the default handlers is to print an explanatory message and exit.

		If the returned value is non-$NULL, the new error handler must pass the error down to the previous error handler. Use #XErrorHandler() to do that.
		""",

		nullable _ XErrorHandler.IN("handler", "the program's supplied error handler."),

		returnDoc = "the previous error handler"
	)

	int(
		"XGetErrorText",
		"""
		Copies a null-terminated string describing the specified error code into the specified buffer. The returned text is in the encoding of the current
		locale. It is recommended that you use this function to obtain an error description because extensions to Xlib may define their own error codes and
		error strings.
		""",

		DISPLAY,
		int.IN("code", "the error code for which you want to obtain a description"),
		char_p.OUT("buffer_return", "returns the error description"),
		AutoSize("buffer_return") _ int.IN("length", "the size of the buffer")
	)

	int(
		"XFree",
		"Free in-memory data that was created by an Xlib function.",

		MultiType(PointerMapping.DATA_POINTER) _ void_p.IN("data", "the data that is to be freed")
	)

	Display_p(
		"XOpenDisplay",
		"""
		Returns a Display structure that serves as the connection to the X server and that contains all the information about that X server. {@code XOpenDisplay}
		connects your application to the X server through TCP or DECnet communications protocols, or through some local inter-process communication protocol.
		If the hostname is a host machine name and a single colon (:) separates the hostname and display number, {@code XOpenDisplay} connects using TCP streams.
		If the hostname is not specified, Xlib uses whatever it believes is the fastest transport. If the hostname is a host machine name and a double colon
		(::) separates the hostname and display number, {@code XOpenDisplay} connects using DECnet. A single X server can support any or all of these transport
		mechanisms simultaneously. A particular Xlib implementation can support many more of these transport mechanisms.
		""",

		const _ nullable _ charASCII_p.IN(
			"display_name",
			"""
			the hardware display name, which determines the display and communications domain to be used. On a POSIX-conformant system, if the
			{@code display_name} is $NULL, it defaults to the value of the DISPLAY environment variable.
			"""
		)
	)

	int(
		"XCloseDisplay",
		"""
		Closes the connection to the X server for the display specified in the Display structure and destroys all windows, resource IDs (Window, Font, Pixmap,
		Colormap, Cursor, and GContext), or other resources that the client has created on this display, unless the close-down mode of the resource has been
		changed (see #XSetCloseDownMode()). Therefore, these windows, resource IDs, and other resources should never be referenced again or an error will
		be generated. Before exiting, you should call {@code XCloseDisplay} explicitly so that any pending errors are reported as {@code XCloseDisplay} performs
		a final {@code XSync} operation.
		""",

		DISPLAY
	)

	Atom(
		"XInternAtom",
		"Returns the atom identifier associated with the specified {@code atom_name} string.",

		DISPLAY,
		const _ charASCII_p.IN("atom_name", "the name associated with the atom you want returned"),
		Bool.IN("only_if_exists", "a Boolean value that indicates whether the atom must be created")
	)

	int(
		"XDefaultScreen",
		"Returns a pointer to the default screen.",

		DISPLAY
	)

	int(
		"XDefaultDepth",
		"Returns the depth (number of planes) of the default root window for the specified screen.",

		DISPLAY,
		int.IN("screen_number", "the appropriate screen number on the host server")
	)

	int(
		"XDisplayWidth",
		"Returns an integer that describes the width of the screen in pixels.",

		DISPLAY,
		int.IN("screen_number", "the appropriate screen number on the host server")
	)

	int(
		"XDisplayHeight",
		"Returns an integer that describes the height of the screen in pixels.",

		DISPLAY,
		int.IN("screen_number", "the appropriate screen number on the host server")
	)

	int(
		"XDisplayWidthMM",
		"Returns an integer that describes the width of the screen in millimeters.",

		DISPLAY,
		int.IN("screen_number", "the appropriate screen number on the host server")
	)

	int(
		"XDisplayHeightMM",
		"Returns an integer that describes the height of the screen in millimeters.",

		DISPLAY,
		int.IN("screen_number", "the appropriate screen number on the host server")
	)

	int(
		"XSync",
		"""
		Flushes the output buffer and then waits until all requests have been received and processed by the X server. Any errors generated must be handled by
		the error handler. For each protocol error received by Xlib, {@code XSync()} calls the client application's error handling routine. Any events generated
		by the server are enqueued into the library's event queue.

		Finally, if you passed X#GrabSuccess(), {@code XSync()} does not discard the events in the queue. If you passed X#GrabSuccess, {@code XSync()} discards
		all events in the queue, including those events that were on the queue before {@code XSync()} was called. Client applications seldom need to call
		{@code XSync()}.
		""",

		DISPLAY,
		Bool.IN("discard", "whether to discard events in the queue")
	)

	Window(
		"XRootWindow",
		"Returns the root window of the specified screen.",

		DISPLAY,
		int.IN("screen_number", "the appropriate screen number on the host server")
	)

	Bool(
		"XQueryExtension",
		"""
		Determines if the named extension is present. If the extension is not present, {@code XQueryExtension()} returns #False; otherwise, it returns
		#True. If the extension is present, {@code XQueryExtension()} returns the major opcode for the extension to {@code major_opcode_return};
		otherwise, it returns zero. Any minor opcode and the request formats are specific to the extension. If the extension involves additional event types,
		{@code XQueryExtension()} returns the base event type code to {@code first_event_return}; otherwise, it returns zero. The format of the events is
		specific to the extension. If the extension involves additional error codes, {@code XQueryExtension()} returns the base error code to
		{@code first_error_return}; otherwise, it returns zero. The format of additional data in the errors is specific to the extension.
		""",

		DISPLAY,
		const _ charASCII_p.IN("name", "the extension name"),
		int_p.IN("major_opcode_return", "returns the major opcode"),
		int_p.IN("first_event_return", "returns the first event code, if any"),
		int_p.IN("first_error_return", "returns the first error code, if any")
	)

	int(
		"XFlush",
		"""
		Flushes the output buffer. Most client applications need not use this function because the output buffer is automatically flushed as needed by calls to
		#XPending(), #XNextEvent(), and #XWindowEvent(). Events generated by the server may be enqueued into the library's event queue.
		""",

		DISPLAY
	)

	int(
		"XPending",
		"""
		Returns the number of events that have been received from the X server but have not been removed from the event queue. {@code XPending()} is identical
		to #XEventsQueued() with the mode {@code QueuedAfterFlush} specified.
		""",

		DISPLAY
	)

	int(
		"XNextEvent",
		"""
		Copies the first event from the event queue into the specified ##XEvent structure and then removes it from the queue. If the event queue is empty,
		{@code XNextEvent()} flushes the output buffer and blocks until an event is received.
		""",

		DISPLAY,
		XEvent_p.OUT("event_return", "a pointer to a ##XEvent structure that will receive the next event in the queue")
	)

	Colormap(
		"XCreateColormap",
		"""
		Creates a colormap of the specified visual type for the screen on which the specified window resides and returns the colormap ID associated with it.
		Note that the specified window is only used to determine the screen.
		""",

		DISPLAY,
		WINDOW,
		Visual_p.IN("visual", "a visual type supported on the screen. If the visual type is not one supported by the screen, a {@code BadMatch} error results."),
		int.IN("alloc", "the colormap entries to be allocated. You can pass AllocNone or AllocAll.")
	)

	int(
		"XFreeColormap",
		"""
		Deletes the association between the {@code colormap} resource ID and the {@code colormap} and frees the {@code colormap} storage. However, this function
		has no effect on the default colormap for a screen. If the specified {@code colormap} is an installed map for a screen, it is uninstalled. If the
		specified {@code colormap} is defined as the {@code colormap} for a window, {@code XFreeColormap()} changes the colormap associated with the window to
		X#GrabSuccess() and generates a {@code ColormapNotify} event. X does not define the colors displayed for a window with a colormap of X#GrabSuccess.
		""",

		DISPLAY,
		Colormap.IN("colormap", "the colormap to destroy")
	)

	Screen_p(
		"XScreenOfDisplay",
		"Return a pointer to the indicated screen.",

		DISPLAY,
		int.IN("screen_number", "the appropriate screen number on the host server")
	)

	unsigned_long(
		"XBlackPixel",
		"Return the black pixel value for the specified screen.",

		DISPLAY,
		int.IN("screen_number", "the appropriate screen number on the host server")
	)

	int(
		"XConnectionNumber",
		"Returns a connection number for the specified display. On a POSIX-conformant system, this is the file descriptor of the connection.",

		DISPLAY
	)

	Window(
		"XCreateWindow",
		"""
		Creates an unmapped subwindow for a specified parent window, returns the window ID of the created window, and causes the X server to generate a
		{@code CreateNotify }event. The created window is placed on top in the stacking order with respect to siblings.

		The coordinate system has the X axis horizontal and the Y axis vertical with the origin [0, 0] at the upper-left corner. Coordinates are integral, in
		terms of pixels, and coincide with pixel centers. Each window and pixmap has its own coordinate system. For a window, the origin is inside the border at
		the inside, upper-left corner.

		The x and y coordinates are the top-left outside corner of the window's borders and are relative to the inside of the parent window's borders.

		The width and height are the created window's inside dimensions and do not include the created window's borders.
		""",

		DISPLAY,
		Window.IN("parent", "the parent window"),
		int.IN("x", "the window x-coordinate"),
		int.IN("y", "the window y-coordinate"),
		unsigned_int.IN("width", "the window width"),
		unsigned_int.IN("height", "the window height"),
		unsigned_int.IN("border_width", "the border width"),
		int.IN("depth", "the window's depth. A depth of X#GrabSuccess() means the depth is taken from the parent."),
		unsigned_int.IN("windowClass", "the created window's class", "X#InputOutput X#InputOnly X#CopyFromParent"),
		Visual_p.IN("visual", "the visual type. A visual of X#GrabSuccess() means the visual type is taken from the parent."),
		unsigned_long.IN(
			"valuemask",
			"""
			which window attributes are defined in the attributes argument. This mask is the bitwise inclusive OR of the valid attribute mask bits. If
			{@code valuemask} is zero, the attributes are ignored and are not referenced.
			"""
		),
		XSetWindowAttributes_p.IN("attributes", "the structure from which the values (as specified by the value mask) are to be taken")
	)

	int(
		"XChangeWindowAttributes",
		"Depending on the {@code valuemask}, uses the window attributes in the #XSetWindowAttributes structure to change the specified window attributes.",

		DISPLAY,
		WINDOW,
		unsigned_long.IN(
			"valuemask",
			"""
			specifies which window attributes are defined in the attributes argument. This mask is the bitwise inclusive OR of the valid attribute mask bits. If
			valuemask is zero, the attributes are ignored and are not referenced. The values and restrictions are the same as for #XCreateWindow().
			"""
		),
		XSetWindowAttributes_p.IN(
			"attributes",
			"the #XSetWindowAttributes structure from which the values (as specified by the value mask) are to be taken."
		)
	)

	Status(
		"XSetWMProtocols",
		"Replaces the {@code WM_PROTOCOLS} property on the specified window with the list of atoms specified by the protocols argument.",

		DISPLAY,
		WINDOW,
		Atom_p.IN("protocols", "the list of protocols"),
		AutoSize("protocols") _ int.IN("count", "the number of protocols in the list")
	)

	int(
		"XSetWMHints",
		"""
		Sets the window manager hints that include icon information and location, the initial state of the window, and whether the application relies on the
		window manager to get keyboard input.
		""",

		DISPLAY,
		WINDOW,
		XWMHints_p.IN("hints", "the ##XWMHints structure to be used")
	)

	int(
		"XSetSizeHints",
		"Sets the ##XSizeHints structure for the named property and the specified window.",

		DISPLAY,
		WINDOW,
		XSizeHints_p.IN("hints", "the ##XSizeHints structure to be used"),
		Atom.IN("property", "the property name")
	)

	void(
		"XSetWMNormalHints",
		"""
		Replaces the size hints for the {@code WM_NORMAL_HINTS} property on the specified window. If the property does not already exist,
		{@code XSetWMNormalHints()} sets the size hints for the {@code WM_NORMAL_HINTS} property on the specified window. The property is stored with a type of
		{@code WM_SIZE_HINTS} and a format of 32.
		""",

		DISPLAY,
		WINDOW,
		XSizeHints_p.IN("hints", "the ##XSizeHints for the window in its normal state")
	)

	int(
		"XGrabPointer",
		"""
		Actively grabs control of the pointer and returns X#GrabSuccess() if the grab was successful. Further pointer events are reported only to the
		grabbing client. {@code XGrabPointer} overrides any active pointer grab by this client. If {@code owner_events} is #False, all generated pointer
		events are reported with respect to {@code grab_window} and are reported only if selected by {@code event_mask}. If owner_events is True and if a generated pointer event would normally be
		reported to this client, it is reported as usual. Otherwise, the event is reported with respect to the grab_window and is reported only if selected by event_mask. For either value of owner_events, unreported events are discarded.
		""",

		DISPLAY,
		Window.IN("grab_window", "the grab window"),
		Bool.IN(
			"owner_events",
			"""
			a Boolean value that indicates whether the pointer events are to be reported as usual or reported with respect to the grab window if selected by the
			event mask
			"""
		),
		unsigned_int.IN("event_mask", "which pointer events are reported to the client. The mask is the bitwise inclusive OR of the valid pointer event mask bits."),
		int.IN("pointer_mode", "further processing of pointer events", "X#GrabModeSync X#GrabModeAsync"),
		int.IN("keyboard_mode", "further processing of keyboard events", "X#GrabModeSync X#GrabModeAsync"),
		Window.IN("confine_to", "the window to confine the pointer in or $None"),
		Cursor.IN("cursor", "the cursor that is to be displayed during the grab or $None"),
		Time.IN("time", "the time. You can pass either a timestamp or X#CurrentTime")
	)

	int(
		"XUngrabPointer",
		"""
		Releases the pointer and any queued events if this client has actively grabbed the pointer from #XGrabPointer(), #XGrabButton(), or from
		a normal button press. {@code XUngrabPointer} does not release the pointer if the specified time is earlier than the last-pointer-grab time or is later
		than the current X server time. It also generates {@code EnterNotify} and {@code LeaveNotify} events. The X server performs an {@code UngrabPointer}
		request automatically if the event window or {@code confine_to} window for an active pointer grab becomes not viewable or if window reconfiguration
		causes the {@code confine_to} window to lie completely outside the boundaries of the root window.
		""",

		DISPLAY,
		Time.IN("time", "specifies the time. You can pass either a timestamp or X#CurrentTime.")
	)

	int(
		"XDefineCursor",
		"If a cursor is set, it will be used when the pointer is in the window. If the cursor is $None, it is equivalent to #XUndefineCursor().",

		DISPLAY,
		WINDOW,
		Cursor.IN("cursor", "the cursor that is to be displayed or $None")
	)

	int(
		"XUndefineCursor",
		"""
		Undoes the effect of a previous #XDefineCursor() for this window. When the pointer is in the window, the parent's cursor will now be used. On the
		root window, the default cursor is restored.
		""",

		DISPLAY,
		WINDOW
	)

	int(
		"XFreeCursor",
		"""
		Deletes the association between the cursor resource ID and the specified cursor. The cursor storage is freed when no other resource references it. The
		specified cursor ID should not be referred to again.
		""",

		DISPLAY,
		Cursor.IN("cursor", "the cursor to free")
	)

	int(
		"XGetScreenSaver",
		"Gets the current screen saver values.",

		DISPLAY,
		Check(1) _ int_p.OUT("timeout_return", "the timeout, in seconds, until the screen saver turns on"),
		Check(1) _ int_p.OUT("interval_return", "the interval between screen saver invocations"),
		Check(1) _ int_p.OUT("prefer_blanking_return", "the current screen blanking preference"),
		Check(1) _ int_p.OUT("allow_exposures_return", "the current screen save control value")
	)

	int(
		"XSetScreenSaver",
		"Sets the current screen saver values.",

		DISPLAY,
		int.IN("timeout_return", "the timeout, in seconds, until the screen saver turns on"),
		int.IN("interval_return", "the interval between screen saver invocations"),
		int.IN("prefer_blanking_return", "the current screen blanking preference"),
		int.IN("allow_exposures_return", "the current screen save control value")
	)

	Status(
		"XSendEvent",
		"""
		Identifies the destination window, determines which clients should receive the specified events, and ignores any active grabs. This function requires
		you to pass an event mask. This function uses the {@code w} argument to identify the destination window as follows:
		${ul(
			"If {@code w} is X#PointerWindow, the destination window is the window that contains the pointer.",
			"""
			If {@code w} is X#InputFocus and if the focus window contains the pointer, the destination window is the window that contains the pointer;
			otherwise, the destination window is the focus window.
			"""
		)}

		To determine which clients should receive the specified events, XSendEvent() uses the propagate argument as follows:
		${ul(
			"""
			If {@code }event_mask is the empty set, the event is sent to the client that created the destination window. If that client no longer exists, no
			event is sent.
			""",
			"If propagate is #False, the event is sent to every client selecting on destination any of the event types in the {@code event_mask} argument.",
			"""
			If propagate is #True and no clients have selected on destination any of the event types in event-mask, the destination is replaced with the
			closest ancestor of destination for which some client has selected a type in event-mask and for which no intervening window has that type in its
			do-not-propagate-mask. If no such window exists or if the window is an ancestor of the focus window and X#InputFocus was originally
			specified as the destination, the event is not sent to any clients. Otherwise, the event is reported to every client selecting on the final
			destination any of the types specified in {@code event_mask}.
			"""
		)}

		The event in the XEvent structure must be one of the core events or one of the events defined by an extension (or a BadValue error results) so that the X server can correctly byte-swap the contents as necessary. The contents of the event are otherwise unaltered and unchecked by the X server except to force send_event to True in the forwarded event and to set the serial number in the event correctly; therefore these fields and the display field are ignored by XSendEvent().
		""",

		DISPLAY,
		Window.IN("w", "the window the event is to be sent to, or X#PointerWindow, or X#InputFocus"),
		Bool.IN("propagate", "a Boolean value"),
		long.IN("event_mask", "the event mask"),
		XEvent_p.IN("event_send", "the event that is to be sent")
	)

	int(
		"XRaiseWindow",
		"""
		Raises the specified window to the top of the stack so that no sibling window obscures it. If the windows are regarded as overlapping sheets of paper
		stacked on a desk, then raising a window is analogous to moving the sheet to the top of the stack but leaving its x and y location on the desk constant.
		Raising a mapped window may generate Expose events for the window and any mapped subwindows that were formerly obscured.
		""",

		DISPLAY,
		WINDOW
	)

	int(
		"XSetInputFocus",
		"""
		Changes the input focus and the last-focus-change time. It has no effect if the specified time is earlier than the current last-focus-change time or is
		later than the current X server time. Otherwise, the last-focus-change time is set to the specified time (X#CurrentTime is replaced by the
		current X server time). {@code XSetInputFocus} causes the X server to generate {@code FocusIn} and {@code FocusOut} events.

		Depending on the focus argument, the following occurs:
		${ul(
			"If focus is $None, all keyboard events are discarded until a new focus window is set, and the {@code revert_to} argument is ignored.",
			"""
			If focus is a window, it becomes the keyboard's focus window. If a generated keyboard event would normally be reported to this window or one of its
			inferiors, the event is reported as usual. Otherwise, the event is reported relative to the focus window.
			""",
			"""
			If focus is X#PointerRoot, the focus window is dynamically taken to be the root window of whatever screen the pointer is on at each keyboard
			event. In this case, the {@code revert_to} argument is ignored. The specified focus window must be viewable at the time {@code XSetInputFocus} is
			called, or a X#BadMatch error results. If the focus window later becomes not viewable, the X server evaluates the revert_to argument to
			determine the new focus window as follows:
			""",
			"""
			If {@code revert_to} is X#RevertToParent, the focus reverts to the parent (or the closest viewable ancestor), and the new {@code revert_to}
			value is taken to be X#RevertToNone.
			""",
			"""
			If {@code revert_to} is X#RevertToPointerRoot or X#RevertToNone, the focus reverts to X#PointerRoot or $None,
			respectively. When the focus reverts, the X server generates {@code FocusIn} and {@code FocusOut} events, but the last-focus-change time is not
			affected.
			"""
		)}
		""",

		DISPLAY,
		Window.IN("focus", "the window, X#PointerRoot or $None"),
		int.IN("revert_to", "where the input focus reverts to if the window becomes not viewable", "X#RevertToParent X#RevertToPointerRoot X#RevertToNone"),
		Time.IN("time", " the time. You can pass either a timestamp or X#CurrentTime.")
	)

	int(
		"XGetInputFocus",
		"Returns the focus window and the current focus state.",

		DISPLAY,
		Window_p.OUT("focus_return", "returns the focus window, X#PointerRoot or $None"),
		int_p.OUT("revert_to_return", "returns the current focus state")
	)

	int(
		"XMoveWindow",
		"""
		Moves the specified window to the specified {@code x} and {@code y} coordinates, but it does not change the window's size, raise the window, or change
		the mapping state of the window. Moving a mapped window may or may not lose the window's contents depending on if the window is obscured by nonchildren
		and if no backing store exists. If the contents of the window are lost, the X server generates Expose events. Moving a mapped window generates
		{@code Expose} events on any formerly obscured windows.

		The {@code x} and {@code y} coordinates define the new location of the top-left pixel of the window's border or the window itself if it has no border.
		""",

		DISPLAY,
		WINDOW,
		int.IN("x", "the window x-coordinate"),
		int.IN("y", "the window y-coordinate")
	)

	int(
		"XResizeWindow",
		"""
		Changes the inside dimensions of the specified window, not including its borders. This function does not change the window's upper-left coordinate or
		the origin and does not restack the window. Changing the size of a mapped window may lose its contents and generate Expose events. If a mapped window is
		made smaller, changing its size generates {@code Expose} events on windows that the mapped window formerly obscured.
		""",

		DISPLAY,
		WINDOW,
		unsigned_int.IN("width", "the window width"),
		unsigned_int.IN("height", "the window height")
	)

	Bool(
		"XGetEventData",
		"Retrieves extra data from the specified cookie.",

		DISPLAY,
		XGenericEventCookie_p.OUT("cookie", "a pointer to a ##XGenericEventCookie structure.")
	)

	void(
		"XFreeEventData",
		"Frees the data associated with a cookie.",

		DISPLAY,
		XGenericEventCookie_p.IN("cookie", "a pointer to a ##XGenericEventCookie structure.")
	)

	int(
		"XGetWindowProperty",
		"Retrieves a window property.",

		DISPLAY,
		WINDOW,
		Atom.IN("property", "the property name"),
		long.IN("long_offset", "the offset in the specified property (in 32-bit quantities) where the data is to be retrieved"),
		long.IN("long_length", "the length in 32-bit multiples of the data to be retrieved"),
		Bool.IN("delete", "a Boolean value that determines whether the property is deleted"),
		Atom.IN("req_type", "the atom identifier associated with the property type or X#AnyPropertyType."),
		Atom_p.OUT("actual_type_return", "the atom identifier that defines the actual type of the property"),
		int_p.OUT("actual_format_return", "the actual format of the property"),
		unsigned_long_p.OUT("nitems_return", "the actual number of 8-bit, 16-bit, or 32-bit items stored in the {@code prop_return} data"),
		unsigned_long_p.OUT("bytes_after_return", "the number of bytes remaining to be read in the property if a partial read was performed"),
		unsigned_char_pp.OUT("prop_return", "the data in the specified format")
	)

	int(
		"XDeleteProperty",
		"""
		Deletes the specified property only if the property was defined on the specified window and causes the X server to generate a {@code PropertyNotify}
		event on the window unless the property does not exist.
		""",

		DISPLAY,
		WINDOW,
		Atom.IN("property", "the property atom")
	)

	int(
		"XQueryPointer",
		"""
		Returns the root window the pointer is logically on and the pointer coordinates relative to the root window's origin. If {@code XQueryPointer} returns
		#False, the pointer is not on the same screen as the specified window, and {@code XQueryPointer} returns $None to {@code child_return}
		and zero to {@code win_x_return} and {@code win_y_return}. If {@code XQueryPointer} returns #True, the pointer coordinates returned to
		{@code win_x_return} and {@code win_y_return} are relative to the origin of the specified window. In this case, {@code XQueryPointer} returns the child
		that contains the pointer, if any, or else $None to {@code child_return}.

		Returns the current logical state of the keyboard buttons and the modifier keys in {@code mask_return}. It sets {@code mask_return} to the bitwise
		inclusive OR of one or more of the button or modifier key bitmasks to match the current state of the mouse buttons and the modifier keys.
		""",

		DISPLAY,
		WINDOW,
		Window_p.OUT("root_return", "the root window that the pointer is in"),
		Window_p.OUT("child_return", "the child window that the pointer is located in, if any"),
		int_p.OUT("root_x_return", "the pointer x-coordinate relative to the root window's origin"),
		int_p.OUT("root_y_return", "the pointer y-coordinate relative to the root window's origin"),
		int_p.OUT("win_x_return", "the pointer x-coordinate relative to the specified window"),
		int_p.OUT("win_y_return", "the pointer y-coordinate relative to the specified window"),
		unsigned_int_p.OUT("mask_return", "the current state of the modifier keys and pointer buttons")
	)

	int(
		"XUnmapWindow",
		"""
		Unmaps the specified window and causes the X server to generate an {@code UnmapNotify} event. If the specified window is already unmapped,
		{@code XUnmapWindow()} has no effect. Normal exposure processing on formerly obscured windows is performed. Any child window will no longer be visible
		until another map call is made on the parent. In other words, the subwindows are still mapped but are not visible until the parent is mapped. Unmapping
		a window will generate {@code Expose} events on windows that were formerly obscured by it.
		""",

		DISPLAY,
		WINDOW
	)

	int(
		"XDestroyWindow",
		"""
		Destroys the specified window as well as all of its subwindows and causes the X server to generate a {@code DestroyNotify} event for each window. The
		window should never be referenced again. If the window specified by the {@code w} argument is mapped, it is unmapped automatically. The ordering of the
		{@code DestroyNotify} events is such that for any given window being destroyed, {@code DestroyNotify} is generated on any inferiors of the window before
		being generated on the window itself. The ordering among siblings and across subhierarchies is not otherwise constrained. If the window you specified is
		a root window, no windows are destroyed. Destroying a mapped window will generate {@code Expose} events on other windows that were obscured by the
		window being destroyed.
		""",

		DISPLAY,
		WINDOW
	)

	void(
		"Xutf8SetWMProperties",
		"Sets window properties.",

		DISPLAY,
		WINDOW,
		const _ charUTF8_p.IN("window_name", "the window name, which should be a null-terminated string"),
		const _ charUTF8_p.IN("icon_name", "the icon name, which should be a null-terminated string"),
		nullable _ char_pp.IN("argv", "the application's argument list"),
		AutoSize("argv") _ int.IN("argc", "the number of arguments"),
		nullable _ XSizeHints_p.IN("normal_hints", "the size hints for the window in its normal state"),
		nullable _ XWMHints_p.IN("wm_hints", "the XWMHints structure to be used"),
		nullable _ XClassHint_p.IN("class_hints", "the ##XClassHint structure to be used")
	)

	int(
		"XChangeProperty",
		"Alters a property for the specified window and causes the X server to generate a {@code PropertyNotify} event on that window.",

		DISPLAY,
		WINDOW,
		Atom.IN("property", "the property name"),
		Atom.IN("type", "the type of the property"),
		int.IN("format", "whether the data should be viewed as a list of 8-bit, 16-bit, or 32-bit quantities", "8 16 32"),
		int.IN("mode", "the mode of the operation", "X#PropModeReplace X#PropModePrepend X#PropModeAppend"),
		const _ MultiType(PointerMapping.DATA_BYTE, PointerMapping.DATA_SHORT, PointerMapping.DATA_INT) _ unsigned_char_p.IN("data", "the property data"),
		AutoSize("data", autoTyped = true) _ int.IN("nelements", "the number of elements of the specified data format")
	)

	Bool(
		"XTranslateCoordinates",
		"Translates a coordinate in one window to the coordinate space of another window.",

		DISPLAY,
		Window.IN("src_w", "the source window"),
		Window.IN("dest_w", "the destination window"),
		int.IN("src_x", "the x-coordinate within the source window"),
		int.IN("src_y", "the y-coordinate within the source window"),
		Check(1) _ int_p.OUT("dest_x_return", "the x-coordinate within the destination window"),
		Check(1) _ int_p.OUT("dest_y_return", "the x-coordinate within the destination window"),
		Window_p.IN("child_return", "the child if the coordinates are contained in a mapped child of the destination window")
	)

	Status(
		"XGetWindowAttributes",
		"Returns the current attributes for the specified window to an ##XWindowAttributes structure.",

		DISPLAY,
		WINDOW,
		XWindowAttributes_p.IN("window_attributes_return", "a pointer to a ##XWindowAttributes structure")
	)

	Status(
		"XIconifyWindow",
		"""
		Sends a {@code WM_CHANGE_STATE} {@code ClientMessage} event with a format of 32 and a first data element of {@code IconicState} and a window of {@code w}
		to the root window of the specified screen with an event mask set to {@code SubstructureNotifyMask} | {@code SubstructureRedirectMask}. Window managers
		may elect to receive this message and if the window is in its normal state, may treat it as a request to change the window's state from normal to
		iconic. If the {@code WM_CHANGE_STATE} property cannot be interned, {@code XIconifyWindow()} does not send a message and returns a zero status. It
		returns a nonzero status if the client message is sent successfully; otherwise, it returns a zero status.
		""",

		DISPLAY,
		WINDOW,
		int.IN("screen_number", "the appropriate screen number on the host server")
	)

	int(
		"XMapWindow",
		"""
		Maps the window and all of its subwindows that have had map requests. Mapping a window that has an unmapped ancestor does not display the window but
		marks it as eligible for display when the ancestor becomes mapped. Such a window is called unviewable. When all its ancestors are mapped, the window
		becomes viewable and will be visible on the screen if it is not obscured by another window. This function has no effect if the window is already mapped.
		""",

		DISPLAY,
		WINDOW
	)

	int(
		"XMapRaised",
		"""
		Essentially is similar to #XMapWindow() in that it maps the window and all of its subwindows that have had map requests. However, it also raises
		the specified window to the top of the stack.
		""",

		DISPLAY,
		WINDOW
	)

	int(
		"XWarpPointer",
		"""
		If {@code dest_w} is None, {@code XWarpPointer()} moves the pointer by the offsets {@code (dest_x, dest_y)} relative to the current position of the
		pointer. If {@code dest_w} is a window, {@code XWarpPointer()} moves the pointer to the offsets {@code (dest_x, dest_y)} relative to the origin of
		{@code dest_w}. However, if {@code src_w} is a window, the move only takes place if the window {@code src_w} contains the pointer and if the specified
		rectangle of {@code src_w} contains the pointer.

		The {@code src_x} and {@code src_y} coordinates are relative to the origin of {@code src_w}. If {@code src_height} is zero, it is replaced with the
		current height of {@code src_w} minus {@code src_y}. If {@code src_width} is zero, it is replaced with the current width of {@code src_w} minus
		{@code src_x}.

		There is seldom any reason for calling this function. The pointer should normally be left to the user. If you do use this function, however, it
		generates events just as if the user had instantaneously moved the pointer from one position to another. Note that you cannot use {@code XWarpPointer()}
		to move the pointer outside the {@code confine_to} window of an active pointer grab. An attempt to do so will only move the pointer as far as the
		closest edge of the {@code confine_to} window.
		""",

		DISPLAY,
		Window.IN("src_w", "the source window or $None"),
		Window.IN("dest_w", "the destination window or $None"),
		int.IN("src_x", "the source rectangle x-coordinate"),
		int.IN("src_y", "the source rectangle y-coordinate"),
		unsigned_int.IN("src_width", "the source rectangle width"),
		unsigned_int.IN("src_height", "the source rectangle height"),
		int.IN("dest_x", "the x-coordinate within the destination window"),
		int.IN("dest_y", "the y-coordinate within the destination window")
	)

	int(
		"XSetSelectionOwner",
		"""
		changes the owner and last-change time for the specified selection and has no effect if the specified time is earlier than the current last-change time
		of the specified selection or is later than the current X server time. Otherwise, the last-change time is set to the specified time, with X#CurrentTime
		replaced by the current server time. If the owner window is specified as $None, then the owner of the selection becomes $None (that
		is, no owner). Otherwise, the owner of the selection becomes the client executing the request.

		If the new owner (whether a client or $None) is not the same as the current owner of the selection and the current owner is not $None,
		the current owner is sent a {@code SelectionClear} event. If the client that is the owner of a selection is later terminated (that is, its connection is
		closed) or if the owner window it has specified in the request is later destroyed, the owner of the selection automatically reverts to $None,
		but the last-change time is not affected. The selection atom is uninterpreted by the X server. #XGetSelectionOwner() returns the owner window,
		which is reported in {@code SelectionRequest} and {@code SelectionClear} events. Selections are global to the X server.
		""",

		DISPLAY,
		Atom.IN("selection", "the selection atom"),
		Window.IN("owner", "the owner of the specified selection atom. You can pass a window or $None."),
		Time.IN("time", "the time. You can pass either a timestamp or X#CurrentTime")
	)

	Window(
		"XGetSelectionOwner",
		"""
		Returns the window ID associated with the window that currently owns the specified selection. If no selection was specified, the function returns the
		constant $None. If $None is returned, there is no owner for the selection.
		""",

		DISPLAY,
		Atom.IN("selection", "the selection atom whose owner you want returned")
	)

	int(
		"XConvertSelection",
		"Requests that the specified selection be converted to the specified target type.",

		DISPLAY,
		Atom.IN("selection", "the selection atom"),
		Atom.IN("target", "the target atom"),
		Atom.IN("property", "the property name or $None"),
		Window.IN("requestor", "the requestor window"),
		Time.IN("time", "the time. You can pass either a timestamp or X#CurrentTime")
	)

	Bool(
		"XCheckTypedEvent",
		"""
		Searches the event queue and then any events available on the server connection for the first event that matches the specified type. If it finds a
		match, {@code XCheckTypedEvent()} removes that event, copies it into the specified ##XEvent structure, and returns #True. The other events
		in the queue are not discarded. If the event is not available, {@code XCheckTypedEvent()} returns #False, and the output buffer will have been
		flushed.
		""",

		DISPLAY,
		int.IN("event_type", "the event type to be compared"),
		XEvent_p.OUT("event_return", "the matched event's associated ##XEvent structure")
	)

	Pixmap(
		"XCreatePixmap",
		"""
		Creates a pixmap of the width, height, and depth you specified and returns a pixmap ID that identifies it. It is valid to pass an X#InputOnly
		window to the drawable argument. The width and height arguments must be nonzero, or a X#BadValue error results. The depth argument must be one
		of the depths supported by the screen of the specified drawable, or a X#BadValue error results.
		""",

		DISPLAY,
		Drawable.IN("d", "which screen the pixmap is created on"),
		unsigned_int.IN("width", "the pixmap width"),
		unsigned_int.IN("height", "the pixmap height"),
		unsigned_int.IN("depth", "the pixmap depth")
	)

	GC(
		"XCreateGC",
		"""
		Creates a graphics context and returns a GC. The GC can be used with any destination drawable having the same root and depth as the specified drawable.
		Use with other drawables results in a X#BadMatch error.
		""",

		Display_p.IN("display", ""),
		Drawable.IN("d", ""),
		unsigned_long.IN("valuemask", ""),
		XGCValues_p.IN("values", "")
	)

	int(
		"XFillRectangle",
		"Fills the specified rectangle as if a four-point FillPolygon protocol request were specified for each rectangle.",

		DISPLAY,
		DRAWABLE,
		GC.IN("gc", "the GC"),
		int.IN("x", "the x-coordinate"),
		int.IN("y", "the y-coordinate"),
		unsigned_int.IN("width", "the rectangle width"),
		unsigned_int.IN("height", "the rectangle height")
	)

	Cursor(
		"XCreatePixmapCursor",
		"Creates a cursor and returns the cursor ID associated with it.",

		DISPLAY,
		Pixmap.IN("source", "the shape of the source cursor"),
		Pixmap.IN("mask", "the cursor's source bits to be displayed or $None"),
		XColor_p.IN("foreground_color", "the RGB values for the foreground of the source"),
		XColor_p.IN("background_color", "the RGB values for the background of the source"),
		unsigned_int.IN("x", "the hotspot x-coordinate relative to the source's origin"),
		unsigned_int.IN("y", "the hotspot y-coordinate relative to the source's origin")
	)

	int(
		"XFreePixmap",
		"""
		First deletes the association between the pixmap ID and the pixmap. Then, the X server frees the pixmap storage when there are no references to it. The
		pixmap should never be referenced again.
		""",

		DISPLAY,
		Pixmap.IN("pixmap", "the pixmap to free")
	)

	int(
		"XFreeGC",
		"Destroys the specified GC as well as all the associated storage.",

		DISPLAY,
		GC.IN("gc", "the GC to free")
	)

}