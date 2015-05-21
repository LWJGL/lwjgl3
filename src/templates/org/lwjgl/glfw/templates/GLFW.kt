/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.glfw.templates

import org.lwjgl.generator.*
import org.lwjgl.glfw.*
import org.lwjgl.opengl.*

val GLFW = "GLFW".nativeClass(packageName = GLFW_PACKAGE, prefix = "GLFW") {
	javaImport (
		"org.lwjgl.opengl.GL11"
	)

	nativeImport (
		"glfw3.h"
	)

	documentation =
		"""
		Native bindings to the <a href="http://www.glfw.org/docs/latest/">GLFW</a> library.

		GLFW is a free, Open Source, multi-platform library for opening a window, creating an OpenGL context and managing input. It is easy to integrate into
		existing applications and does not lay claim to the main loop.
		"""

	IntConstant(
		"The major version number of the GLFW library. This is incremented when the API is changed in non-compatible ways.",

		"VERSION_MAJOR" _ 3
	)

	IntConstant(
		"The minor version number of the GLFW library. This is incremented when features are added to the API but it remains backward-compatible.",

		"VERSION_MINOR" _ 1
	)

	IntConstant(
		"The revision number of the GLFW library. This is incremented when a bug fix release is made that does not contain any API changes.",

		"VERSION_REVISION" _ 1
	)

	IntConstant(
		"The key or button was released.",

		"RELEASE" _ 0
	)

	IntConstant(
		"The key or button was pressed.",

		"PRESS" _ 1
	)

	IntConstant(
		"The key was held down until it repeated.",

		"REPEAT" _ 2
	)

	IntConstant(
		"The unknown key.",

		"KEY_UNKNOWN" _ -1
	)

	IntConstant(
		"Printable keys.",

		"KEY_SPACE" _ 32,
		"KEY_APOSTROPHE" _ 39,
		"KEY_COMMA" _ 44,
		"KEY_MINUS" _ 45,
		"KEY_PERIOD" _ 46,
		"KEY_SLASH" _ 47,
		"KEY_0" _ 48,
		"KEY_1" _ 49,
		"KEY_2" _ 50,
		"KEY_3" _ 51,
		"KEY_4" _ 52,
		"KEY_5" _ 53,
		"KEY_6" _ 54,
		"KEY_7" _ 55,
		"KEY_8" _ 56,
		"KEY_9" _ 57,
		"KEY_SEMICOLON" _ 59,
		"KEY_EQUAL" _ 61,
		"KEY_A" _ 65,
		"KEY_B" _ 66,
		"KEY_C" _ 67,
		"KEY_D" _ 68,
		"KEY_E" _ 69,
		"KEY_F" _ 70,
		"KEY_G" _ 71,
		"KEY_H" _ 72,
		"KEY_I" _ 73,
		"KEY_J" _ 74,
		"KEY_K" _ 75,
		"KEY_L" _ 76,
		"KEY_M" _ 77,
		"KEY_N" _ 78,
		"KEY_O" _ 79,
		"KEY_P" _ 80,
		"KEY_Q" _ 81,
		"KEY_R" _ 82,
		"KEY_S" _ 83,
		"KEY_T" _ 84,
		"KEY_U" _ 85,
		"KEY_V" _ 86,
		"KEY_W" _ 87,
		"KEY_X" _ 88,
		"KEY_Y" _ 89,
		"KEY_Z" _ 90,
		"KEY_LEFT_BRACKET" _ 91,
		"KEY_BACKSLASH" _ 92,
		"KEY_RIGHT_BRACKET" _ 93,
		"KEY_GRAVE_ACCENT" _ 96,
		"KEY_WORLD_1" _ 161,
		"KEY_WORLD_2" _ 162
	)

	IntConstant(
		"Function keys.",

		"KEY_ESCAPE" _ 256,
		"KEY_ENTER" _ 257,
		"KEY_TAB" _ 258,
		"KEY_BACKSPACE" _ 259,
		"KEY_INSERT" _ 260,
		"KEY_DELETE" _ 261,
		"KEY_RIGHT" _ 262,
		"KEY_LEFT" _ 263,
		"KEY_DOWN" _ 264,
		"KEY_UP" _ 265,
		"KEY_PAGE_UP" _ 266,
		"KEY_PAGE_DOWN" _ 267,
		"KEY_HOME" _ 268,
		"KEY_END" _ 269,
		"KEY_CAPS_LOCK" _ 280,
		"KEY_SCROLL_LOCK" _ 281,
		"KEY_NUM_LOCK" _ 282,
		"KEY_PRINT_SCREEN" _ 283,
		"KEY_PAUSE" _ 284,
		"KEY_F1" _ 290,
		"KEY_F2" _ 291,
		"KEY_F3" _ 292,
		"KEY_F4" _ 293,
		"KEY_F5" _ 294,
		"KEY_F6" _ 295,
		"KEY_F7" _ 296,
		"KEY_F8" _ 297,
		"KEY_F9" _ 298,
		"KEY_F10" _ 299,
		"KEY_F11" _ 300,
		"KEY_F12" _ 301,
		"KEY_F13" _ 302,
		"KEY_F14" _ 303,
		"KEY_F15" _ 304,
		"KEY_F16" _ 305,
		"KEY_F17" _ 306,
		"KEY_F18" _ 307,
		"KEY_F19" _ 308,
		"KEY_F20" _ 309,
		"KEY_F21" _ 310,
		"KEY_F22" _ 311,
		"KEY_F23" _ 312,
		"KEY_F24" _ 313,
		"KEY_F25" _ 314,
		"KEY_KP_0" _ 320,
		"KEY_KP_1" _ 321,
		"KEY_KP_2" _ 322,
		"KEY_KP_3" _ 323,
		"KEY_KP_4" _ 324,
		"KEY_KP_5" _ 325,
		"KEY_KP_6" _ 326,
		"KEY_KP_7" _ 327,
		"KEY_KP_8" _ 328,
		"KEY_KP_9" _ 329,
		"KEY_KP_DECIMAL" _ 330,
		"KEY_KP_DIVIDE" _ 331,
		"KEY_KP_MULTIPLY" _ 332,
		"KEY_KP_SUBTRACT" _ 333,
		"KEY_KP_ADD" _ 334,
		"KEY_KP_ENTER" _ 335,
		"KEY_KP_EQUAL" _ 336,
		"KEY_LEFT_SHIFT" _ 340,
		"KEY_LEFT_CONTROL" _ 341,
		"KEY_LEFT_ALT" _ 342,
		"KEY_LEFT_SUPER" _ 343,
		"KEY_RIGHT_SHIFT" _ 344,
		"KEY_RIGHT_CONTROL" _ 345,
		"KEY_RIGHT_ALT" _ 346,
		"KEY_RIGHT_SUPER" _ 347,
		"KEY_MENU" _ 348,
		"KEY_LAST" expr "GLFW_KEY_MENU"
	)

	IntConstant(
		"If this bit is set one or more Shift keys were held down.",

		"MOD_SHIFT" _ 0x0001
	)

	IntConstant(
		"If this bit is set one or more Control keys were held down.",

		"MOD_CONTROL" _ 0x0002
	)

	IntConstant(
		"If this bit is set one or more Alt keys were held down.",

		"MOD_ALT" _ 0x0004
	)

	IntConstant(
		"If this bit is set one or more Super keys were held down.",

		"MOD_SUPER" _ 0x0008
	)

	IntConstant(
		"""Mouse buttons. See <a href="http://www.glfw.org/docs/latest/input.html\#input_mouse_button">mouse button input</a> for how these are used.""",

		"MOUSE_BUTTON_1" _ 0,
		"MOUSE_BUTTON_2" _ 1,
		"MOUSE_BUTTON_3" _ 2,
		"MOUSE_BUTTON_4" _ 3,
		"MOUSE_BUTTON_5" _ 4,
		"MOUSE_BUTTON_6" _ 5,
		"MOUSE_BUTTON_7" _ 6,
		"MOUSE_BUTTON_8" _ 7,
		"MOUSE_BUTTON_LAST" expr "GLFW_MOUSE_BUTTON_8",
		"MOUSE_BUTTON_LEFT" expr "GLFW_MOUSE_BUTTON_1",
		"MOUSE_BUTTON_RIGHT" expr "GLFW_MOUSE_BUTTON_2",
		"MOUSE_BUTTON_MIDDLE" expr "GLFW_MOUSE_BUTTON_3"
	)

	IntConstant(
		"""Joysticks. See <a href="http://www.glfw.org/docs/latest/input.html\#joystick">joystick input</a> for how these are used.""",

		"JOYSTICK_1" _ 0,
		"JOYSTICK_2" _ 1,
		"JOYSTICK_3" _ 2,
		"JOYSTICK_4" _ 3,
		"JOYSTICK_5" _ 4,
		"JOYSTICK_6" _ 5,
		"JOYSTICK_7" _ 6,
		"JOYSTICK_8" _ 7,
		"JOYSTICK_9" _ 8,
		"JOYSTICK_10" _ 9,
		"JOYSTICK_11" _ 10,
		"JOYSTICK_12" _ 11,
		"JOYSTICK_13" _ 12,
		"JOYSTICK_14" _ 13,
		"JOYSTICK_15" _ 14,
		"JOYSTICK_16" _ 15,
		"JOYSTICK_LAST" expr "GLFW_JOYSTICK_16"
	)

	IntConstant(
		"""
		GLFW has not been initialized.

		This occurs if a GLFW function was called that may not be called unless the library is initialized.
		""",

		"NOT_INITIALIZED" _ 0x00010001
	)

	IntConstant(
		"""
		No context is current for this thread.

		This occurs if a GLFW function was called that needs and operates on the current OpenGL or OpenGL ES context but no context is current on the calling
		thread. One such function is #SwapInterval().
		""",

		"NO_CURRENT_CONTEXT" _ 0x00010002
	)

	IntConstant(
		"""
		One of the arguments to the function was an invalid enum value.

		One of the arguments to the function was an invalid enum value, for example requesting #RED_BITS with #GetWindowAttrib().
		""",

		"INVALID_ENUM" _ 0x00010003
	)

	IntConstant(
		"""
		One of the arguments to the function was an invalid value.

		One of the arguments to the function was an invalid value, for example requesting a non-existent OpenGL or OpenGL ES version like 2.7.

		Requesting a valid but unavailable OpenGL or OpenGL ES version will instead result in a #VERSION_UNAVAILABLE error.
		""",

		"INVALID_VALUE" _ 0x00010004
	)

	IntConstant(
		"""
		A memory allocation failed.

		A bug in GLFW or the underlying operating system. Report the bug to our <a href="https://github.com/glfw/glfw/issues">issue tracker</a>.
		""",

		"OUT_OF_MEMORY" _ 0x00010005
	)

	IntConstant(
		"""
		GLFW could not find support for the requested client API on the system. If emitted by functions other than @ref glfwCreateWindow, no supported client
		API was found.

		The installed graphics driver does not support the requested client API, or does not support it via the chosen context creation backend. Below are a
		few examples:

		Some pre-installed Windows graphics drivers do not support OpenGL. AMD only supports OpenGL ES via EGL, while Nvidia and Intel only support it via a
		WGL or GLX extension. OS X does not provide OpenGL ES at all. The Mesa EGL, OpenGL and OpenGL ES libraries do not interface with the Nvidia binary
		driver.
		""",

		"API_UNAVAILABLE" _ 0x00010006
	)

	IntConstant(
		"""
		The requested OpenGL or OpenGL ES version (including any requested context or framebuffer hints) is not available on this machine.

		The machine does not support your requirements. If your application is sufficiently flexible, downgrade your requirements and try again. Otherwise,
		inform the user that their machine does not match your requirements.

		Future invalid OpenGL and OpenGL ES versions, for example OpenGL 4.8 if 5.0 comes out before the 4.x series gets that far, also fail with this error and
		not #INVALID_VALUE, because GLFW cannot know what future versions will exist.
		""",

		"VERSION_UNAVAILABLE" _ 0x00010007
	)

	IntConstant(
		"""
		A platform-specific error occurred that does not match any of the more specific categories.

		A bug or configuration error in GLFW, the underlying operating system or its drivers, or a lack of required resources. Report the issue to our
		<a href="https://github.com/glfw/glfw/issues">issue tracker</a>.
		""",

		"PLATFORM_ERROR" _ 0x00010008
	)

	IntConstant(
		"""
		The requested format is not supported or available.

		If emitted during window creation, one or more hard constraints did not match any of the available pixel formats. If your application is sufficiently
		flexible, downgrade your requirements and try again. Otherwise, inform the user that their machine does not match your requirements.

		If emitted when querying the clipboard, ignore the error or report it to the user, as appropriate.
		""",

		"FORMAT_UNAVAILABLE" _ 0x00010009
	)

	val WindowAttributes = IntConstant(
		"Window attributes.",

		"FOCUSED" _ 0x00020001,
		"ICONIFIED" _ 0x00020002,
		"RESIZABLE" _ 0x00020003,
		"VISIBLE" _ 0x00020004,
		"DECORATED" _ 0x00020005,
		"AUTO_ICONIFY" _ 0x00020006,
		"FLOATING" _ 0x00020007
	).javaDocLinks

	IntConstant(
		"Input options.",

		"CURSOR" _ 0x00033001,
		"STICKY_KEYS" _ 0x00033002,
		"STICKY_MOUSE_BUTTONS" _ 0x00033003
	)

	IntConstant(
		"Cursor state.",

		"CURSOR_NORMAL" _ 0x00034001,
		"CURSOR_HIDDEN" _ 0x00034002,
		"CURSOR_DISABLED" _ 0x00034003
	)

	val CursorShapes = IntConstant(
		"""Standard cursor shapes. See <a href="http://www.glfw.org/docs/latest/input.html\#cursor_standard">standard cursor creation</a> for how these are used.""",

		"ARROW_CURSOR" _ 0x00036001,
		"IBEAM_CURSOR" _ 0x00036002,
		"CROSSHAIR_CURSOR" _ 0x00036003,
		"HAND_CURSOR" _ 0x00036004,
		"HRESIZE_CURSOR" _ 0x00036005,
		"VRESIZE_CURSOR" _ 0x00036006
	).javaDocLinks

	IntConstant(
		"Monitor events.",

		"CONNECTED" _ 0x00040001,
		"DISCONNECTED" _ 0x00040002
	)

	IntConstant(
		"Don't care value.",

		"DONT_CARE" _ -1
	)

	// [ OpenGL ]

	val PixelFormatHints = IntConstant(
		"PixelFormat hints.",

		"RED_BITS" _ 0x00021001,
		"GREEN_BITS" _ 0x00021002,
		"BLUE_BITS" _ 0x00021003,
		"ALPHA_BITS" _ 0x00021004,
		"DEPTH_BITS" _ 0x00021005,
		"STENCIL_BITS" _ 0x00021006,
		"ACCUM_RED_BITS" _ 0x00021007,
		"ACCUM_GREEN_BITS" _ 0x00021008,
		"ACCUM_BLUE_BITS" _ 0x00021009,
		"ACCUM_ALPHA_BITS" _ 0x0002100A,
		"AUX_BUFFERS" _ 0x0002100B,
		"STEREO" _ 0x0002100C,
		"SAMPLES" _ 0x0002100D,
		"SRGB_CAPABLE" _ 0x0002100E,
		"REFRESH_RATE" _ 0x0002100F,
		"DOUBLE_BUFFER" _ 0x00021010
	).javaDocLinks

	val ClientAPIHints = IntConstant(
		"Client API hints.",

		"CLIENT_API" _ 0x00022001,
		"CONTEXT_VERSION_MAJOR" _ 0x00022002,
		"CONTEXT_VERSION_MINOR" _ 0x00022003,
		"CONTEXT_REVISION" _ 0x00022004,
		"CONTEXT_ROBUSTNESS" _ 0x00022005,
		"OPENGL_FORWARD_COMPAT" _ 0x00022006,
		"OPENGL_DEBUG_CONTEXT" _ 0x00022007,
		"OPENGL_PROFILE" _ 0x00022008,
		"CONTEXT_RELEASE_BEHAVIOR" _ 0x00022009
	).javaDocLinks

	val ClientAPIValues = IntConstant(
		"Values for the #CLIENT_API hint.",

		"OPENGL_API" _ 0x00030001,
		"OPENGL_ES_API" _ 0x00030002
	).javaDocLinks

	val ContextRobustnessValues = IntConstant(
		"Values for the #CONTEXT_ROBUSTNESS hint.",

		"NO_ROBUSTNESS" _ 0,
		"NO_RESET_NOTIFICATION" _ 0x00031001,
		"LOSE_CONTEXT_ON_RESET" _ 0x00031002
	).javaDocLinks

	val OpenGLProfileValues = IntConstant(
		"Values for the #OPENGL_PROFILE hint.",

		"OPENGL_ANY_PROFILE" _ 0,
		"OPENGL_CORE_PROFILE" _ 0x00032001,
		"OPENGL_COMPAT_PROFILE" _ 0x00032002
	).javaDocLinks

	val ContextReleaseBehaviorValues = IntConstant(
		"Values for the #CONTEXT_RELEASE_BEHAVIOR hint.",

		"ANY_RELEASE_BEHAVIOR" _ 0,
		"RELEASE_BEHAVIOR_FLUSH" _ 0x00035001,
		"RELEASE_BEHAVIOR_NONE" _ 0x00035002
	).javaDocLinks

	Code(
		javaInit = statement("\t\tif ( LWJGLUtil.getPlatform() == LWJGLUtil.Platform.MACOSX ) org.lwjgl.system.macosx.EventLoop.checkFirstThread();")
	) _ int(
		"Init",
		"""
		Initializes the GLFW library. Before most GLFW functions can be used, GLFW must be initialized, and before an application terminates GLFW should be
		terminated in order to free any resources allocated during or after initialization.

		If this function fails, it calls #Terminate() before returning. If it succeeds, you should call #Terminate() before the application exits.

		Additional calls to this function after successful initialization but before termination will return GL11##GL_TRUE immediately.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"""
			<b>Mac OS X</b>: This function will change the current directory of the application to the `Contents/Resources` subdirectory of the application's
			bundle, if present.
			""",
		    """
		    <b>X11</b>: If the {@code LC_CTYPE} category of the current locale is set to {@code "C"} then the environment's locale will be applied to that
		    category. This is done because character input will not function when {@code LC_CTYPE} is set to {@code "C"}. If another locale was set before this
		    function was called, it will be left untouched.
		    """
		)}
		""",

	    returnDoc = "GL11##GL_TRUE if successful, or GL11##GL_FALSE if an error occured.",
	    since = "GLFW 1.0"
	)

	void(
		"Terminate",
		"""
		Destroys all remaining windows and cursors, restores any modified gamma ramps and frees any other allocated resources. Once this function is called, you
		must again call #Init() successfully before you will be able to use most GLFW functions.

		If GLFW has been successfully initialized, this function should be called before the application exits. If initialization fails, there is no need to
		call this function, as it is called by #Init() before it returns failure.

		Notes:
		${ul(
			"This function may be called before #Init().",
			"This function may only be called from the main thread.",
			"This function may not be called from a callback.",
			"No window's context may be current on another thread when this function is called."
		)}
		""",
	    since = "GLFW 1.0"
	)

	void(
		"GetVersion",
		"""
		Retrieves the major, minor and revision numbers of the GLFW library. It is intended for when you are using GLFW as a shared library and want to ensure
		that you are using the minimum required version.

		Notes:
		${ul(
			"Any or all of the version arguments may be $NULL.",
			"This function always succeeds.",
			"This function may be called before #Init().",
			"This function may be called from any thread."
		)}
		""",

		nullable _ Check(1) _ int_p.OUT("major", "where to store the major version number, or $NULL"),
		nullable _ Check(1) _ int_p.OUT("minor", "where to store the minor version number, or $NULL"),
		nullable _ Check(1) _ int_p.OUT("rev", "where to store the revision number, or $NULL"),
	    since = "GLFW 1.0"
	)

	(const _ charUTF8_p)(
		"GetVersionString",
		"""
		Returns the compile-time generated version string of the GLFW library binary. It describes the version, platform, compiler and any platform-specific
		compile-time options.

		<b>Do not use the version string</b> to parse the GLFW library version. The #GetVersion() function already provides the version of the
		running library binary.

		Notes:
		${ul(
			"This function always succeeds.",
			"This function may be called before #Init().",
			"This function may be called from any thread.",
		    "The returned string is static and compile-time generated."
		)}
		""",
	    returnDoc = "the GLFW version string",
	    since = "GLFW 3.0"
	)

	GLFWerrorfun(
		"SetErrorCallback",
		"""
		Sets the error callback, which is called with an error code and a human-readable description each time a GLFW error occurs.

		The error callback is called on the thread where the error occurred. If you are using GLFW from multiple threads, your error callback needs to be
		written accordingly.

		Because the description string may have been generated specifically for that error, it is not guaranteed to be valid after the callback has returned. If
        you wish to use it after the callback returns, you need to make a copy.

        Once set, the error callback remains set even after the library has been terminated.

		Notes:
		${ul(
			"This function may be called before #Init().",
			"This function may only be called from the main thread."
		)}
		""",

		nullable _ GLFWerrorfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set",
	    since = "GLFW 3.0"
	)

	GLFWmonitor_p(
		"GetMonitors",
		"""
		Returns an array of handles for all currently connected monitors.

		The returned array is allocated and freed by GLFW. You should not free it yourself. It is guaranteed to be valid only until the monitor configuration
		changes or the library is terminated.

		This function may only be called from the main thread.
		""",

		autoSizeResult _ int_p.OUT("count", "where to store the number of monitors in the returned array. This is set to zero if an error occurred."),

	    returnDoc = "an array of monitor handlers, or $NULL if an error occured",
	    since = "GLFW 3.0"
	)

	GLFWmonitor(
		"GetPrimaryMonitor",
		"""
		Returns the primary monitor. This is usually the monitor where elements like the Windows task bar or the OS X menu bar is located.

		This function may only be called from the main thread.
		""",

	    returnDoc = "the primary monitor, or $NULL if an error occured",
	    since = "GLFW 3.0"
	)

	void(
		"GetMonitorPos",
		"""
		Returns the position, in screen coordinates, of the upper-left corner of the specified monitor.

		Any or all of the position arguments may be $NULL. If an error occurs, all non-$NULL position arguments will be set to zero.

		This function may only be called from the main thread.
		""",

		GLFWmonitor.IN("monitor", "the monitor to query"),
		nullable _ Check(1) _ int_p.OUT("xpos", "where to store the monitor x-coordinate, or $NULL"),
		nullable _ Check(1) _ int_p.OUT("ypos", "where to store the monitor y-coordinate, or $NULL"),
	    since = "GLFW 3.0"
	)

	void(
		"GetMonitorPhysicalSize",
		"""
		Returns the size, in millimetres, of the display area of the specified monitor.

		Some systems do not provide accurate monitor size information, either because the monitor
		<a href="https://en.wikipedia.org/wiki/Extended_display_identification_data">EDID</a> data is incorrect or because the driver does not report it
		accurately.

		Any or all of the size arguments may be $NULL. If an error occurs, all non-$NULL size arguments will be set to zero.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
		    """
			<b>Windows</b>: The OS calculates the returned physical size from the current resolution and system DPI instead of querying the monitor EDID data.
		    """
		)}
		""",

		GLFWmonitor.IN("monitor", "the monitor to query"),
		nullable _ Check(1) _ int_p.OUT("widthMM", "where to store the width, in millimetres, of the monitor's display area, or $NULL"),
		nullable _ Check(1) _ int_p.OUT("heightMM", "where to store the height, in millimetres, of the monitor's display area, or $NULL"),
	    since = "GLFW 3.0"
	)

	(const _ charUTF8_p)(
		"GetMonitorName",
		"""
		Returns a human-readable name, encoded as UTF-8, of the specified monitor. The name typically reflects the make and model of the monitor and is not
		guaranteed to be unique among the connected monitors.

		The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected or the
		library is terminated.

		This function may only be called from the main thread.
		""",

		GLFWmonitor.IN("monitor", "the monitor to query"),

	    returnDoc = "the UTF-8 encoded name of the monitor, or $NULL if an error occured",
	    since = "GLFW 3.0"
	)

	GLFWmonitorfun(
		"SetMonitorCallback",
		"""
		Sets the monitor configuration callback, or removes the currently set callback. This is called when a monitor is connected to or disconnected from the
		system.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
		    "<b>X11</b>: This callback is not yet called on monitor configuration changes."
		)}
		""",

		nullable _ GLFWmonitorfun.IN("cbfun", "the new callback, or $NULL to remove the currently set callback"),

	    returnDoc = "the previously set callback, or $NULL if no callback was set or the library had not been initialized",
	    since = "GLFW 3.0"
	)

	(const _ GLFWvidmode_p)(
		"GetVideoModes",
		"""
		Returns an array of all video modes supported by the specified monitor. The returned array is sorted in ascending order, first by color bit depth (the
		sum of all channel depths) and then by resolution area (the product of width and height).

		The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected, this
		function is called again for that monitor or the library is terminated.

		This function may only be called from the main thread.
		""",

		GLFWmonitor.IN("monitor", "the monitor to query"),
		Check(1) _ autoSizeResult _ int_p.OUT("count", "where to store the number of video modes in the returned array. This is set to zero if an error occurred."),

	    returnDoc = "an array of video modes, or $NULL if an error occured",
	    since = "GLFW 1.0"
	)

	(const _ GLFWvidmode_p)(
		"GetVideoMode",
		"""
		Returns the current video mode of the specified monitor. If you have created a full screen window for that monitor, the return value will depend on
		whether that window is iconified.

		The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected or the
		library is terminated.

  		This function may only be called from the main thread.
		""",

		GLFWmonitor.IN("monitor", "the monitor to query"),

	    returnDoc = "the current mode of the monitor, or $NULL if an error occurred",
	    since = "GLFW 3.0"
	)

	void(
		"SetGamma",
		"""
		Generates a 256-element gamma ramp from the specified exponent and then calls #SetGammaRamp() with it. The value must be a finite number greater than
		zero.

		This function may only be called from the main thread.
		""",

		GLFWmonitor.IN("monitor", "the monitor whose gamma ramp to set"),
		float.IN("gamma", "the desired exponent"),
	    since = "GLFW 3.0"
	)

	(const _ GLFWgammaramp_p)(
		"GetGammaRamp",
		"""
		Returns the current gamma ramp of the specified monitor.

		The returned structure and its arrays are allocated and freed by GLFW. You should not free them yourself. They are valid until the specified monitor is
		disconnected, this function is called again for that monitor or the library is terminated.

  		This function may only be called from the main thread.
		""",

		GLFWmonitor.IN("monitor", "the monitor to query"),

	    returnDoc = "the current gamma ramp, or $NULL if an error occurred",
	    since = "GLFW 3.0"
	)

	void(
		"SetGammaRamp",
		"""
		Sets the current gamma ramp for the specified monitor. The original gamma ramp for that monitor is saved by GLFW the first time this function is called
		and is restored by #Terminate().

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"Gamma ramp sizes other than 256 are not supported by all hardware",
			"<b>Windows</b>: The gamma ramp size must be 256.",
		    "The specified gamma ramp is copied before this function returns."
		)}
		""",

		GLFWmonitor.IN("monitor", "the monitor whose gamma ramp to set"),
		const _ GLFWgammaramp_p.IN("ramp", "the gamma ramp to use"),
	    since = "GLFW 3.0"
	)

	void(
		"DefaultWindowHints",
		"""
		Resets all window hints to their default values. See #WindowHint() for details.

		This function may only be called from the main thread.
		""",
	    since = "GLFW 3.0"
	)

	void(
		"WindowHint",
		"""
		Sets hints for the next call to #CreateWindow(). The hints, once set, retain their values until changed by a call to glfwWindowHint or
		#DefaultWindowHints(), or until the library is terminated.

		<h3>Supported and default values</h3>
		${table(
			tr(th("Name"), th("Default value"), th("Supported values")),

		    tr(td("#RESIZABLE"), td("GL11##GL_TRUE"), td("GL11##GL_TRUE or GL11##GL_FALSE")),
		    tr(td("#VISIBLE"), td("GL11##GL_TRUE"), td("GL11##GL_TRUE or GL11##GL_FALSE")),
		    tr(td("#DECORATED"), td("GL11##GL_TRUE"), td("GL11##GL_TRUE or GL11##GL_FALSE")),
		    tr(td("#AUTO_ICONIFY"), td("GL11##GL_TRUE"), td("GL11##GL_TRUE or GL11##GL_FALSE")),
		    tr(td("#FLOATING"), td("GL11##GL_TRUE"), td("GL11##GL_TRUE or GL11##GL_FALSE")),

		    tr(td("#RED_BITS"), td("8"), td("0 to Integer##MAX_VALUE")),
		    tr(td("#GREEN_BITS"), td("8"), td("0 to Integer##MAX_VALUE")),
		    tr(td("#BLUE_BITS"), td("8"), td("0 to Integer##MAX_VALUE")),
		    tr(td("#ALPHA_BITS"), td("8"), td("0 to Integer##MAX_VALUE")),
		    tr(td("#DEPTH_BITS"), td("24"), td("0 to Integer##MAX_VALUE")),
		    tr(td("#STENCIL_BITS"), td("8"), td("0 to Integer##MAX_VALUE")),
		    tr(td("#ACCUM_RED_BITS"), td("0"), td("0 to Integer##MAX_VALUE")),
		    tr(td("#ACCUM_GREEN_BITS"), td("0"), td("0 to Integer##MAX_VALUE")),
		    tr(td("#ACCUM_BLUE_BITS"), td("0"), td("0 to Integer##MAX_VALUE")),
		    tr(td("#ACCUM_ALPHA_BITS"), td("0"), td("0 to Integer##MAX_VALUE")),
		    tr(td("#AUX_BUFFERS"), td("0"), td("0 to Integer##MAX_VALUE")),
		    tr(td("#SAMPLES"), td("0"), td("0 to Integer##MAX_VALUE")),
		    tr(td("#REFRESH_RATE"), td("0"), td("0 to Integer##MAX_VALUE")),

		    tr(td("#STEREO"), td("GL11##GL_FALSE"), td("GL11##GL_TRUE or GL11##GL_FALSE")),
		    tr(td("#SRGB_CAPABLE"), td("GL11##GL_FALSE"), td("GL11##GL_TRUE or GL11##GL_FALSE")),

		    tr(td("#CLIENT_API"), td("#OPENGL_API"), td(ClientAPIValues)),
		    tr(td("#CONTEXT_VERSION_MAJOR"), td("1"), td("Any valid major version number of the chosen client API")),
		    tr(td("#CONTEXT_VERSION_MINOR"), td("0"), td("Any valid minor version number of the chosen client API")),

		    tr(td("#CONTEXT_ROBUSTNESS"), td("#NO_ROBUSTNESS"), td(ContextRobustnessValues)),
		    tr(td("#CONTEXT_RELEASE_BEHAVIOR"), td("#ANY_RELEASE_BEHAVIOR"), td(ContextReleaseBehaviorValues)),

		    tr(td("#OPENGL_FORWARD_COMPAT"), td("GL11##GL_FALSE"), td("GL11##GL_TRUE or GL11##GL_FALSE")),
		    tr(td("#OPENGL_DEBUG_CONTEXT"), td("GL11##GL_FALSE"), td("GL11##GL_TRUE or GL11##GL_FALSE")),
		    tr(td("#OPENGL_PROFILE"), td("#OPENGL_ANY_PROFILE"), td(OpenGLProfileValues))
		)}

		This function may only be called from the main thread.
		""",

		int.IN("target", "the window hint to set", "#RESIZABLE #VISIBLE #DECORATED $ClientAPIHints $PixelFormatHints"),
		int.IN("hint", "the new value of the window hint"),
		since = "GLFW 2.2"
	)

	GLFWwindow(
		"CreateWindow",
		"""
		Creates a window and its associated OpenGL or OpenGL ES context. Most of the options controlling how the window and its context should be created are
		specified with window hints.

		Successful creation does not change which context is current. Before you can use the newly created context, you need to make it current. For information
		about the {@code share} parameter, see <a href="http://www.glfw.org/docs/latest/context.html\#context_sharing">context sharing</a>.

		The created window, framebuffer and context may differ from what you requested, as not all parameters and hints are hard constraints. This includes the
		size of the window, especially for full screen windows. To query the actual attributes of the created window, framebuffer and context, use queries like
		#GetWindowAttrib() and #GetWindowSize().

		To create a full screen window, you need to specify the monitor the window will cover. If no monitor is specified, windowed mode will be used. Unless
		you have a way for the user to choose a specific monitor, it is recommended that you pick the primary monitor. For more information on how to query
		connected monitors, see <a href="http://www.glfw.org/docs/latest/monitor.html\#monitor_monitors">monitors</a>.

		For full screen windows, the specified size becomes the resolution of the window's desired video mode. As long as a full screen window has input focus,
		the supported video mode most closely matching the desired video mode is set for the specified monitor. For more information about full screen windows,
		including the creation of so called <i>windowed full screen</i> or <i>borderless full screen windows</i>, see
		<a href="http://www.glfw.org/docs/latest/window.html\#window_windowed_full_screen">full screen</a>.

		By default, newly created windows use the placement recommended by the window system. To create the window at a specific position, make it initially
		invisible using the #VISIBLE window hint, set its <a href="http://www.glfw.org/docs/latest/window.html\#window_pos">position</a> and then
		<a href="http://www.glfw.org/docs/latest/window.html\#window_hide">show</a> it.

		If a full screen window has input focus, the screensaver is prohibited from starting.

		Window systems put limits on window sizes. Very large or very small window dimensions may be overridden by the window system on creation. Check the
		actual <a href="http://www.glfw.org/docs/latest/window.html\#window_size">size</a> after creation.

		The <a href="http://www.glfw.org/docs/latest/window.html\#buffer_swap">swap interval</a> is not set during window creation and the initial value may vary
		depending on driver settings and defaults.

        Notes:
		${ul(
			"This function may only be called from the main thread.",
			"This function may not be called from a callback.",
		    "<b>Windows</b>: Window creation will fail if the Microsoft GDI software OpenGL implementation is the only one available.",
		    """
		    <b>Windows</b>: If the executable has an icon resource named {@code GLFW_ICON}, it will be set as the icon for the window. If no such icon
		    is present, the {@code IDI_WINLOGO} icon will be used instead.
			""",
		    "<b>Windows</b>: The context to share resources with may not be current on any other thread.",
		    """
		    <b>OS X</b>: The GLFW window has no icon, as it is not a document window, but the dock icon will be the same as the application bundle's
		    icon. Also, the first time a window is opened the menu bar is populated with common commands like Hide, Quit and About. The (minimal) about dialog
		    uses information from the application's bundle. For more information on bundles, see the
		    <a href="https://developer.apple.com/library/mac/documentation/CoreFoundation/Conceptual/CFBundles/">Bundle Programming Guide</a> in the Mac
		    Developer Library.
			""",
		    """
		    <b>OS X</b>: The first time a window is created the menu bar is populated with common commands like Hide, Quit and About. The About entry opens a
		    minimal about dialog with information from the application's bundle. The menu bar can be disabled with a
		    <a href="http://www.glfw.org/docs/latest/compile.html\#compile_options_osx">compile-time option</a>.
		    """,
			"""
		    <b>OS X</b>: On OS X 10.10 and later the window frame will not be rendered at full resolution on Retina displays unless the
		    {@code NSHighResolutionCapable} key is enabled in the application bundle's {@code Info.plist}. For more information, see
		    <a href="https://developer.apple.com/library/mac/documentation/GraphicsAnimation/Conceptual/HighResolutionOSX/Explained/Explained.html">High
		    Resolution Guidelines for OS X</a> in the Mac Developer Library.
			""",
		    "<b>X11</b>: There is no mechanism for setting the window icon yet.",
		    "<b>X11</b>: Some window managers will not respect the placement of initially hidden windows."
		)}
		""",

		int.IN("width", "the desired width, in screen coordinates, of the window"),
		int.IN("height", "the desired height, in screen coordinates, of the window"),
		const _ charUTF8_p.IN("title", "initial, UTF-8 encoded window title"),
		nullable _ GLFWmonitor.IN("monitor", "the monitor to use for fullscreen mode, or $NULL to use windowed mode"),
		nullable _ GLFWwindow.IN("share", " the window whose context to share resources with, or $NULL to not share resources"),

	    returnDoc = "the handle of the created window, or $NULL if an error occurred",
	    since ="GLFW 1.0"
	)

	void(
		"DestroyWindow",
		"""
		Destroys the specified window and its context. On calling this function, no further callbacks will be called for that window.

		If the context of the specified window is current on the main thread, it is detached before being destroyed.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"This function may not be called from a callback.",
		    "The context of the specified window must not be current on any other thread when this function is called."
		)}
		""",

		GLFWwindow.IN("window", "the window to destroy"),
	    since = "GLFW 1.0"
	)

	int(
		"WindowShouldClose",
		"""
		Returns the value of the close flag of the specified window.

		This function may be called from any thread.
		""",

		GLFWwindow.IN("window", "the window to query"),

	    returnDoc = "the value of the close flag",
	    since = "GLFW 3.0"
	)

	void(
		"SetWindowShouldClose",
		"""
		Sets the value of the close flag of the specified window. This can be used to override the user's attempt to close the window, or to signal that it
		should be closed.

		This function may be called from any thread. Access is not synchronized.
		""",

		GLFWwindow.IN("window", "the window whose flag to change"),
		int.IN("value", "the new value"),

		since = "GLFW 3.0"
	)

	void(
		"SetWindowTitle",
		"""
		Sets the window title, encoded as UTF-8, of the specified window.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window whose title to change"),
		const _ charUTF8_p.IN("title", "the UTF-8 encoded window title"),

	    since = "GLFW 1.0"
	)

	void(
		"GetWindowPos",
		"""
		Retrieves the position, in screen coordinates, of the upper-left corner of the client area of the specified window.

		Any or all of the position arguments may be $NULL. If an error occurs, all non-$NULL position arguments will be set to zero.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window to query"),
		nullable _ Check(1) _ int_p.OUT("xpos", "where to store the x-coordinate of the upper-left corner of the client area, or $NULL"),
		nullable _ Check(1) _ int_p.OUT("ypos", "where to store the y-coordinate of the upper-left corner of the client area, or $NULL"),

	    since = "GLFW 3.0"
	)

	void(
		"SetWindowPos",
		"""
		Sets the position, in screen coordinates, of the upper-left corner of the client area of the specified windowed mode window. If the window is a full
		screen window, this function does nothing.

		<b>Do not use this function</b> to move an already visible window unless you have very good reasons for doing so, as it will confuse and annoy the
		user.

		The window manager may put limits on what positions are allowed. GLFW cannot and should not override these limits.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window to query"),
		int.IN("xpos", "the x-coordinate of the upper-left corner of the client area"),
		int.IN("ypos", "the y-coordinate of the upper-left corner of the client area"),

	    since = "GLFW 1.0"
	)

	void(
		"GetWindowSize",
		"""
		Retrieves the size, in screen coordinates, of the client area of the specified window. If you wish to retrieve the size of the framebuffer of the
		window in pixels, see #GetFramebufferSize().

		Any or all of the size arguments may be $NULL. If an error occurs, all non-$NULL size arguments will be set to zero.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window whose size to retrieve"),
		nullable _ Check(1) _ int_p.OUT("width", "where to store the width, in screen coordinates, of the client area, or $NULL"),
		nullable _ Check(1) _ int_p.OUT("height", "where to store the height, in screen coordinates, of the client area, or $NULL"),

	    since = "GLFW 1.0"
	)

	void(
		"SetWindowSize",
		"""
		Sets the size, in pixels, of the client area of the specified window.

		For full screen windows, this function selects and switches to the resolution closest to the specified size, without affecting the window's context. As
		the context is unaffected, the bit depths of the framebuffer remain unchanged.

		The window manager may put limits on what sizes are allowed. GLFW cannot and should not override these limits.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window to resize"),
		int.IN("width", "the desired width of the specified window"),
		int.IN("height", "the desired height of the specified window"),

	    since = "GLFW 1.0"
	)

	void(
		"GetFramebufferSize",
		"""
		Retrieves the size, in pixels, of the framebuffer of the specified window. If you wish to retrieve the size of the window in screen coordinates, see
		#GetWindowSize().

		Any or all of the size arguments may be $NULL. If an error occurs, all non-$NULL size arguments will be set to zero.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window whose framebuffer to query"),
		nullable _ Check(1) _ int_p.OUT("width", "where to store the width, in pixels, of the framebuffer, or $NULL"),
		nullable _ Check(1) _ int_p.OUT("height", "where to store the height, in pixels, of the framebuffer, or $NULL"),

	    since = "GLFW 3.0"
	)

	void(
		"GetWindowFrameSize",
	    """
	    Retrieves the size, in screen coordinates, of each edge of the frame of the specified window. This size includes the title bar, if the window has one.
	    The size of the frame may vary depending on the <a href="http://www.glfw.org/docs/latest/window.html\#window-hints_wnd">window-related hints</a> used to
	    create it.

		Because this function retrieves the size of each window frame edge and not the offset along a particular coordinate axis, the retrieved values will
		always be zero or positive.

		Any or all of the size arguments may be $NULL. If an error occurs, all non-$NULL size arguments will be set to zero.

	    This function may only be called from the main thread.
	    """,

	    GLFWwindow.IN("window", "the window whose frame size to query"),
	    Check(1) _ nullable _ int_p.OUT("left", "where to store the size, in screen coordinates, of the left edge of the window frame, or $NULL"),
		Check(1) _ nullable _ int_p.OUT("top", "where to store the size, in screen coordinates, of the top edge of the window frame, or $NULL"),
		Check(1) _ nullable _ int_p.OUT("right", "where to store the size, in screen coordinates, of the right edge of the window frame, or $NULL"),
		Check(1) _ nullable _ int_p.OUT("bottom", "where to store the size, in screen coordinates, of the bottom edge of the window frame, or $NULL"),

	    since = "GLFW 3.1"
	)

	void(
		"IconifyWindow",
		"""
		Iconifies (minimizes) the specified window if it was previously restored. If the window is already iconified, this function does nothing.

		If the specified window is a full screen window, the original monitor resolution is restored until the window is restored.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window to iconify"),

	    since = "GLFW 2.1"
	)

	void(
		"RestoreWindow",
		"""
		Restores the specified window if it was previously iconified (minimized). If the window is already restored, this function does nothing.

		If the specified window is a full screen window, the resolution chosen for the window is restored on the selected monitor.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window to restore"),

	    since = "GLFW 2.1"
	)

	void(
		"ShowWindow",
		"""
		Makes the specified window visible if it was previously hidden. If the window is already visible or is in full screen mode, this function does nothing.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window to make visible"),

	    since = "GLFW 3.0"
	)

	void(
		"HideWindow",
		"""
		Hides the specified window, if it was previously visible. If the window is already hidden or is in full screen mode, this function does nothing.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window to hide"),

	    since = "GLFW 3.0"
	)

	GLFWmonitor(
		"GetWindowMonitor",
		"""
		Returns the handle of the monitor that the specified window is in full screen on.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window to query"),

	    returnDoc = "the monitor, or $NULL if the window is in windowed mode or an error occurred",
	    since = "GLFW 3.0"
	)

	int(
		"GetWindowAttrib",
		"""
		Returns the value of an attribute of the specified window or its OpenGL or OpenGL ES context.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window to query"),
		int.IN("attrib", "the <a href=\"http://www.glfw.org/docs/latest/window.html\\#window_attribs\">window attribute</a> whose value to return", WindowAttributes),

	    returnDoc = "the value of the attribute, or zero if an error occured",
	    since = "GLFW 3.0"
	)

	void(
		"SetWindowUserPointer",
		"""
		Sets the user-defined pointer of the specified window. The current value is retained until the window is destroyed. The initial value is $NULL.

		This function may be called from any thread. Access is not synchronized.
		""",

		GLFWwindow.IN("window", "the window whose pointer to set"),
		nullable _ voidptr.IN("pointer", "the new value"),

	    since = "GLFW 3.0"
	)

	voidptr(
		"GetWindowUserPointer",
		"""
		Returns the current value of the user-defined pointer of the specified window. The initial value is $NULL.

		This function may be called from any thread. Access is not synchronized.
		""",

		GLFWwindow.IN("window", "the window whose pointer to return"),

	    since = "GLFW 3.0"
	)

	val CallbackReturnDoc =
		"""
		the previously set callback, or $NULL if no callback was set or the library had not been
		<a href="http://www.glfw.org/docs/latest/intro.html\#intro_init">initialized</a>
		"""

	val CALLBACK_WINDOW = GLFWwindow.IN("window", "the window whose callback to set")

	GLFWwindowposfun(
		"SetWindowPosCallback",
		"""
		Sets the position callback of the specified window, which is called when the window is moved. The callback is provided with the screen position of the
		upper-left corner of the client area of the window.

		This function may only be called from the main thread.
 		""",

		CALLBACK_WINDOW,
		nullable _ GLFWwindowposfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = CallbackReturnDoc,
	    since = "GLFW 1.0"
	)

	GLFWwindowsizefun(
		"SetWindowSizeCallback",
		"""
		Sets the size callback of the specified window, which is called when the window is resized. The callback is provided with the size, in screen
		coordinates, of the client area of the window.

		This function may only be called from the main thread.
		""",

		CALLBACK_WINDOW,
		nullable _ GLFWwindowsizefun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = CallbackReturnDoc,
	    since = "GLFW 1.0"
	)

	GLFWwindowclosefun(
		"SetWindowCloseCallback",
		"""
		Sets the close callback of the specified window, which is called when the user attempts to close the window, for example by clicking the close widget in
		the title bar.

        The close flag is set before this callback is called, but you can modify it at any time with #SetWindowShouldClose().

        The close callback is not triggered by #DestroyWindow().

		Notes:
		${ul(
			"This function may only be called from the main thread.",
		    "<b>Mac OS X:</b> Selecting Quit from the application menu will trigger the close callback for all windows."
		)}
		""",

		CALLBACK_WINDOW,
		nullable _ GLFWwindowclosefun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = CallbackReturnDoc,
	    since = "GLFW 2.5"
	)

	GLFWwindowrefreshfun(
		"SetWindowRefreshCallback",
		"""
		Sets the refresh callback of the specified window, which is called when the client area of the window needs to be redrawn, for example if the window has
		been exposed after having been covered by another window.

		On compositing window systems such as Aero, Compiz or Aqua, where the window contents are saved off-screen, this callback may be called only very
		infrequently or never at all.

		This function may only be called from the main thread.
		""",

		CALLBACK_WINDOW,
		nullable _ GLFWwindowrefreshfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = CallbackReturnDoc,
	    since = "GLFW 2.5"
	)

	GLFWwindowfocusfun(
		"SetWindowFocusCallback",
		"""
		Sets the focus callback of the specified window, which is called when the window gains or loses input focus.

  		After the focus callback is called for a window that lost input focus, synthetic key and mouse button release events will be generated for all such
  		that had been pressed. For more information, see #SetKeyCallback() and #SetMouseButtonCallback().

		This function may only be called from the main thread.
		""",

		CALLBACK_WINDOW,
		nullable _ GLFWwindowfocusfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = CallbackReturnDoc,
	    since = "GLFW 3.0"
	)

	GLFWwindowiconifyfun(
		"SetWindowIconifyCallback",
		"""
		Sets the iconification callback of the specified window, which is called when the window is iconified or restored.

		This function may only be called from the main thread.
		""",

		CALLBACK_WINDOW,
		nullable _ GLFWwindowiconifyfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = CallbackReturnDoc,
	    since = "GLFW 3.0"
	)

	GLFWframebuffersizefun(
		"SetFramebufferSizeCallback",
		"""
		Sets the framebuffer resize callback of the specified window, which is called when the framebuffer of the specified window is resized.

		This function may only be called from the main thread.
		""",

		CALLBACK_WINDOW,
		nullable _ GLFWframebuffersizefun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = CallbackReturnDoc,
	    since = "GLFW 3.0"
	)

	void(
		"PollEvents",
		"""
		Processes all pending events.

        This function processes only those events that are already in the event queue and then returns immediately. Processing events will cause the window and
        input callbacks associated with those events to be called.

        On some platforms, a window move, resize or menu operation will cause event processing to block. This is due to how event processing is designed on
        those platforms. You can use the <a href="http://www.glfw.org/docs/latest/window.html\#window_refresh">window refresh callback</a> to redraw the
        contents of your window when necessary during such operations.

		On some platforms, certain events are sent directly to the application without going through the event queue, causing callbacks to be called outside of
		a call to one of the event processing functions.

		Event processing is not required for joystick input to work.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"This function may not be called from a callback."
		)}
		""",
	    since = "GLFW 1.0"
	)

	void(
		"WaitEvents",
		"""
		Waits until events are queued and processes them.

		This function puts the calling thread to sleep until at least one event is available in the event queue. Once one or more events are available, it
		behaves exactly like #PollEvents(), i.e. the events in the queue are processed and the function then returns immediately. Processing events will cause
		the window and input callbacks associated with those events to be called.

		Since not all events are associated with callbacks, this function may return without a callback having been called even if you are monitoring all
		callbacks.

		On some platforms, a window move, resize or menu operation will cause event processing to block. This is due to how event processing is designed on
		those platforms. You can use the <a href="http://www.glfw.org/docs/latest/window.html\#window_refresh">window refresh callback</a> to redraw the
		contents of your window when necessary during such operations.

		On some platforms, certain callbacks may be called outside of a call to one of the event processing functions.

		If no windows exist, this function returns immediately. For synchronization of threads in applications that do not create windows, use your threading
		library of choice.

		Event processing is not required for joystick input to work.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"This function may not be called from a callback.",
			"On some platforms, certain callbacks may be called outside of a call to one of the event processing functions."
		)}
		""",
	    since = "GLFW 2.5"
	)

	void(
		"PostEmptyEvent",
		"""
	    Posts an empty event from the current thread to the main thread event queue, causing #WaitEvents() to return.

	    If no windows exist, this function returns immediately. For synchronization of threads in applications that do not create windows, use your threading
		library of choice.

		This function may be called from any thread.
	    """,

		since = "GLFW 3.1"
	)

	int(
		"GetInputMode",
		"""
		Returns the value of an input option for the specified window.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window to query"),
		int.IN("mode", "the input mode whose value to return", "#CURSOR #STICKY_KEYS #STICKY_MOUSE_BUTTONS"),

	    returnDoc = "the input mode value",
	    since = "GLFW 3.0"
	)

	void(
		"SetInputMode",
		"""
		Sets an input option for the specified window.
		
		If {@code mode} is #CURSOR, the value must be one of the following cursor modes:
		${ul(
			"#CURSOR_NORMAL makes the cursor visible and behaving normally.",
			"#CURSOR_HIDDEN makes the cursor invisible when it is over the client area of the window but does not restrict the cursor from leaving.",
			"""
			#CURSOR_DISABLED hides and grabs the cursor, providing virtual and unlimited cursor movement. This is useful for implementing for example 3D camera
			controls.
			"""
		)}

		If {@code mode} is #STICKY_KEYS, the value must be either GL11##GL_TRUE to enable sticky keys, or GL11##GL_FALSE to disable it. If sticky keys are
		enabled, a key press will ensure that #GetKey() returns #PRESS the next time it is called even if the key had been released before the call. This is
		useful when you are only interested in whether keys have been pressed but not when or in which order.

		If {@code mode} is #STICKY_MOUSE_BUTTONS, the value must be either GL11##GL_TRUE to enable sticky mouse buttons, or GL11##GL_FALSE to
		disable it. If sticky mouse buttons are enabled, a mouse button press will ensure that #GetMouseButton() returns #PRESS the next
		time it is called even if the mouse button had been released before the call. This is useful when you are only interested in whether mouse buttons have
		been pressed but not when or in which order.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window whose input mode to set"),
		int.IN("mode", "the input mode to set", "#CURSOR #STICKY_KEYS #STICKY_MOUSE_BUTTONS"),
		int.IN("value", "the new value of the specified input mode"),

	    since = "GFLW 3.0"
	)

	int(
		"GetKey",
		"""
		Returns the last state reported for the specified key to the specified window. The returned state is one of #PRESS or #RELEASE. The higher-level action
		#REPEAT is only reported to the key callback.

		If the #STICKY_KEYS input mode is enabled, this function returns #PRESS the first time you call it for a key that was pressed, even if that
		key has already been released.

		The key functions deal with physical keys, with key tokens named after their use on the standard US keyboard layout. If you want to input text, use the
		Unicode character callback instead.

		The modifier key bit masks are not key tokens and cannot be used with this function.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
		    "#KEY_UNKNOWN is not a valid key for this function."
		)}
		""",

		GLFWwindow.IN("window", "the desired window"),
		int.IN("key", "the desired keyboard key"),

	    returnDoc = "one of #PRESS or #RELEASE",
	    since = "GLFW 1.0"
	)

	int(
		"GetMouseButton",
		"""
		Returns the last state reported for the specified mouse button to the specified window. The returned state is one of #PRESS or #RELEASE. The
		higher-level action #REPEAT is only reported to the mouse button callback.

		If the #STICKY_MOUSE_BUTTONS input mode is enabled, this function returns #PRESS the first time you call it for a mouse button that has been pressed,
		even if that mouse button has already been released.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the desired window"),
		int.IN("button", "the desired mouse button"),

	    returnDoc = "one of #PRESS or #RELEASE",
	    since = "GLFW 1.0"
	)

	void(
		"GetCursorPos",
		"""
		Returns the position of the cursor, in screen coordinates, relative to the upper-left corner of the client area of the specified window.

		If the cursor is disabled (with #CURSOR_DISABLED) then the cursor position is unbounded and limited only by the minimum and maximum values of a
		<b>double</b>.

		The coordinates can be converted to their integer equivalents with the Math##floor() function. Casting directly to an integer type works for positive
		coordinates, but fails for negative ones.

		Any or all of the position arguments may be $NULL. If an error occurs, all non-$NULL position arguments will be set to zero.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the desired window"),
		nullable _ Check(1) _ double_p.OUT("xpos", "where to store the cursor x-coordinate, relative to the left edge of the client area, or $NULL"),
		nullable _ Check(1) _ double_p.OUT("ypos", "where to store the cursor y-coordinate, relative to the to top edge of the client area, or $NULL."),

	    since = "GLFW 1.0"
	)

	void(
		"SetCursorPos",
		"""
		Sets the position, in screen coordinates, of the cursor relative to the upper-left corner of the client area of the specified window. The window must
		have input focus. If the window does not have input focus when this function is called, it fails silently.

		<b>Do not use this function</b> to implement things like camera controls. GLFW already provides the #CURSOR_DISABLED cursor mode that hides the cursor,
		transparently re-centers it and provides unconstrained cursor motion. See #SetInputMode() for more information.

  		If the cursor mode is #CURSOR_DISABLED then the cursor position is unconstrained and limited only by the minimum and maximum values of <b>double</b>.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
		    """
		    <b>X11:</b> Due to the asynchronous nature of a modern X desktop, it may take a moment for the window focus event to arrive. This means you will not
		    be able to set the cursor position directly after window creation.
		    """
		)}
		""",

		GLFWwindow.IN("window", "the desired window"),
		double.IN("xpos", "the desired x-coordinate, relative to the left edge of the client area"),
		double.IN("ypos", "the desired y-coordinate, relative to the top edge of the client area"),

	    since = "GLFW 1.0"
	)

	GLFWcursor(
		"CreateCursor",
	    """
		Creates a new custom cursor image that can be set for a window with #SetCursor(). The cursor can be destroyed with #DestroyCursor(). Any remaining
		cursors are destroyed by #Terminate().

		The pixels are 32-bit little-endian RGBA, i.e. eight bits per channel. They are arranged canonically as packed sequential rows, starting from the
		top-left corner.

		The cursor hotspot is specified in pixels, relative to the upper-left corner of the cursor image. Like all other coordinate systems in GLFW, the X-axis
		points to the right and the Y-axis points down.

	    Notes:
	    ${ul(
		    "This function may only be called from the main thread.",
	        "This function may not be called from a callback.",
	        "The specified image data is copied before this function returns."
	    )}
	    """,

	    const _ GLFWimage_p.IN("image", "the desired cursor image"),
	    int.IN("xhot", "the desired x-coordinate, in pixels, of the cursor hotspot"),
	    int.IN("yhot", "the desired y-coordinate, in pixels, of the cursor hotspot"),

	    returnDoc = "the handle of the created cursor, or $NULL if an error occurred",
	    since = "GLFW 3.1"
	)

	GLFWcursor(
		"CreateStandardCursor",
		"""
		Returns a cursor with a standard shape, that can be set for a window with #SetCursor().

	    Notes:
	    ${ul(
			"This function may only be called from the main thread.",
			"This function may not be called from a callback.",
			"The specified image data is copied before this function returns."
		)}
	    """,

		int.IN("shape", "one of the standard shapes", CursorShapes),

		returnDoc = "a new cursor ready to use or $NULL if an error occurred",
		since = "GLFW 3.1"
	)

	void(
		"DestroyCursor",
	    """
	    Destroys a cursor previously created with #CreateCursor(). Any remaining cursors will be destroyed by #Terminate().

		Notes:
		${ul(
		    "This function may only be called from the main thread.",
	        "This function may not be called from a callback."
	    )}
	    """,

	    GLFWcursor.IN("cursor", "the cursor object to destroy"),

	    since = "GLFW 3.1"
	)

	void(
		"SetCursor",
	    """
	    Sets the cursor image to be used when the cursor is over the client area of the specified window. The set cursor will only be visible when the
	    <a href="http://www.glfw.org/docs/latest/input.html\#cursor_mode">cursor mode</a> of the window is #CURSOR_NORMAL.

		On some platforms, the set cursor may not be visible unless the window also has input focus.

  	    This function may only be called from the main thread.
	    """,

	    GLFWwindow.IN("window", "the window to set the system cursor for"),
	    nullable _ GLFWcursor.IN("cursor", "the cursor to set, or $NULL to switch back to the default arrow cursor"),

	    since = "GLFW 3.1"
	)

	GLFWkeyfun(
		"SetKeyCallback",
		"""
		Sets the key callback of the specified window, which is called when a key is pressed, repeated or released.

		The key functions deal with physical keys, with layout independent key tokens named after their values in the standard US keyboard layout. If you want
		to input text, use #SetCharCallback() instead.

		When a window loses input focus, it will generate synthetic key release events for all pressed keys. You can tell these events from user-generated
		events by the fact that the synthetic ones are generated after the focus loss event has been processed, i.e. after the window focus callback has been
		called.

		The scancode of a key is specific to that platform or sometimes even to that machine. Scancodes are intended to allow users to bind keys that don't have
		a GLFW key token. Such keys have {@code key} set to #KEY_UNKNOWN, their state is not saved and so it cannot be queried with #GetKey().

		Sometimes GLFW needs to generate synthetic key events, in which case the scancode may be zero.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWkeyfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set",
	    since = "GLFW 1.0"
	)

	GLFWcharfun(
		"SetCharCallback",
		"""
		Sets the character callback of the specified window, which is called when a Unicode character is input.

		The character callback is intended for Unicode text input. As it deals with characters, it is keyboard layout dependent, whereas #SetKeyCallback() is
		not. Characters do not map 1:1 to physical keys, as a key may produce zero, one or more characters. If you want to know whether a specific physical key
		was pressed or released, see the key callback instead.

		The character callback behaves as system text input normally does and will not be called if modifier keys are held down that would prevent normal text
		input on that platform, for example a Super (Command) key on OS X or Alt key on Windows. There is #SetCharModsCallback() that receives these events.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWcharfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set",
	    since = "GLFW 2.4"
	)

	GLFWcharmodsfun(
		"SetCharModsCallback",
		"""
		Sets the character with modifiers callback of the specified window, which is called when a Unicode character is input regardless of what modifier keys
		are used.

		The character with modifiers callback is intended for implementing custom Unicode character input. For regular Unicode text input, see
		#SetCharCallback(). Like the character callback, the character with modifiers callback deals with characters and is keyboard layout dependent.
		Characters do not map 1:1 to physical keys, as a key may produce zero, one or more characters. If you want to know whether a specific physical key was
		pressed or released, see #SetKeyCallback() instead.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWcharmodsfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set",
	    since = "GLFW 3.1"
	)

	GLFWmousebuttonfun(
		"SetMouseButtonCallback",
		"""
		Sets the mouse button callback of the specified window, which is called when a mouse button is pressed or released.

		When a window loses input focus, it will generate synthetic mouse button release events for all pressed mouse buttons. You can tell these events from
		user-generated events by the fact that the synthetic ones are generated after the focus loss event has been processed, i.e. after the window focus
		callback has been called.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWmousebuttonfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set",
	    since = "GLFW 1.0"
	)

	GLFWcursorposfun(
		"SetCursorPosCallback",
		"""
		Sets the cursor position callback of the specified window, which is called when the cursor is moved. The callback is provided with the position, in
		screen coordinates, relative to the upper-left corner of the client area of the window.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWcursorposfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set",
	    since = "GLFW 1.0"
	)

	GLFWcursorenterfun(
		"SetCursorEnterCallback",
		"""
		Sets the cursor boundary crossing callback of the specified window, which is called when the cursor enters or leaves the client area of the window.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWcursorenterfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set",
	    since = "GLFW 3.0"
	)

	GLFWscrollfun(
		"SetScrollCallback",
		"""
		Sets the scroll callback of the specified window, which is called when a scrolling device is used.

		The scroll callback receives all scrolling input, like that from a mouse wheel or a touchpad scrolling area.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWscrollfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set",
	    since = "GLFW 2.1"
	)

	GLFWdropfun(
		"SetDropCallback",
	    """
	    Sets the file drop callback of the specified window, which is called when one or more dragged files are dropped on the window.

	    Because the path array and its strings may have been generated specifically for that event, they are not guaranteed to be valid after the callback has
	    returned. If you wish to use them after the callback returns, you need to make a deep copy.

		This function may only be called from the main thread.
	    """,

	    GLFWwindow.IN("window", "the window whose callback to set"),
	    nullable _ GLFWdropfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

	    returnDoc = "the previously set callback, or $NULL if no callback was set",
	    since = "GLFW 3.1"
	)

	int(
		"JoystickPresent",
		"""
		Returns whether the specified joystick is present.

		This function may only be called from the main thread.
		""",

		int.IN("joy", "joystick to query"),

	    returnDoc = "GL11##GL_TRUE if the joystick is present, or GL11##GL_FALSE otherwise",
	    since = "GLFW 3.0"
	)

	(const _ float_p)(
		"GetJoystickAxes",
		"""
		Returns the values of all axes of the specified joystick. Each element in the array is a value between -1.0 and 1.0.

		The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
		function is called again for that joystick or the library is terminated.

		This function may only be called from the main thread.
		""",

		int.IN("joy", "the joystick to query"),
		autoSizeResult _ int_p.OUT("count", "where to store the number of axis values in the returned array. This is set to zero if an error occurred."),

	    returnDoc = "an array of axis values, or $NULL if the joystick is not present",
	    since = "GLFW 2.2"
	)

	(const _ unsigned_char_p)(
		"GetJoystickButtons",
		"""
		Returns the state of all buttons of the specified joystick. Each element in the array is either #PRESS or #RELEASE.

		The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
		function is called again for that joystick or the library is terminated.

  		This function may only be called from the main thread.
		""",

		int.IN("joy", "the joystick to query"),
		autoSizeResult _ int_p.OUT("count", "where to store the number of button states in the returned array. This is set to zero if an error occurred."),

	    returnDoc = "an array of button states, or $NULL if the joystick is not present",
	    since = "GLFW 2.2"
	)

	(const _ charUTF8_p)(
		"GetJoystickName",
		"""
		Returns the name, encoded as UTF-8, of the specified joystick.

		The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
		function is called again for that joystick or the library is terminated.

		This function may only be called from the main thread.
		""",

		int.IN("joy", "the joystick to query"),

	    returnDoc = "the UTF-8 encoded name of the joystick, or $NULL if the joystick is not present",
	    since = "GLFW 3.0"
	)

	void(
		"SetClipboardString",
		"""
		Sets the system clipboard to the specified, UTF-8 encoded string.

		The specified string is copied before this function returns.

		This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window that will own the clipboard contents"),
		const _ charUTF8_p.IN("string", "a UTF-8 encoded string"),

	    since = "GLFW 3.0"
	)

	(const _ charUTF8_p)(
		"GetClipboardString",
		"""
		Returns the contents of the system clipboard, if it contains or is convertible to a UTF-8 encoded string.

		The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the next call to #GetClipboardString() or
		#SetClipboardString(), or until the library is terminated.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"The returned string is allocated and freed by GLFW.  You should not free it yourself.",
			"The returned string is valid only until the next call to #GetClipboardString() or #SetClipboardString()."
		)}
		""",

		GLFWwindow.IN("window", "the window that will request the clipboard contents"),

	    returnDoc = "the contents of the clipboard as a UTF-8 encoded string, or $NULL if an error occurred",
	    since = "GLFW 3.0"
	)

	double(
		"GetTime",
		"""
		Returns the value of the GLFW timer. Unless the timer has been set using #SetTime(), the timer measures time elapsed since GLFW was initialized.

		The resolution of the timer is system dependent, but is usually on the order of a few micro- or nanoseconds. It uses the highest-resolution monotonic
		time source on each supported platform.

		This function may be called from any thread. Access is not synchronized.
		""",

	    returnDoc = "the current value, in seconds, or zero if an error occurred",
	    since = "GLFW 1.0"
	)

	void(
		"SetTime",
		"""
		Sets the value of the GLFW timer. It then continues to count up from that value. The value must be a positive finite number less than or equal to
		18446744073.0, which is approximately 584.5 years.

		The upper limit of the timer is calculated as ${code("floor((2<sup>64</sup> - 1) / 10<sup>9</sup>)")} and is due to implementations storing nanoseconds
		in 64 bits. The limit may be increased in the future.

		This function may only be called from the main thread.
		""",

		double.IN("time", "the new value, in seconds"),

		since = "GLFW 2.2"
	)

	// [ OpenGL ]

	void(
		"MakeContextCurrent",
		"""
		Makes the OpenGL or OpenGL ES context of the specified window current on the calling thread. A context can only be made current on a single thread at a
		time and each thread can have only a single current context at a time.

		By default, making a context non-current implicitly forces a pipeline flush. On machines that support
		<a href="https://www.opengl.org/registry/specs/KHR/context_flush_control.txt">GL_KHR_context_flush_control</a>, you can control whether a context
		performs this flush by setting the #CONTEXT_RELEASE_BEHAVIOR <a href="http://www.glfw.org/docs/latest/window.html\#window_hints_ctx">window hint</a>.

		This function may be called from any thread.
		""",

		nullable _ GLFWwindow.IN("window", "the window whose context to make current, or $NULL to detach the current context"),

	    since = "GLFW 3.0"
	)

	GLFWwindow(
		"GetCurrentContext",
		"""
		Returns the window whose OpenGL or OpenGL ES context is current on the calling thread.

		This function may be called from any thread.
		""",

	    returnDoc = "the window whose context is current, or $NULL if no window's context is current",
	    since = "GLFW 3.0"
	)

	void(
		"SwapBuffers",
		"""
		Swaps the front and back buffers of the specified window. If the swap interval is greater than zero, the GPU driver waits the specified number of screen
		updates before swapping the buffers.

		This function may be called from any thread.
		""",

		GLFWwindow.IN("window", "the window whose buffers to swap"),

	    since = "GLFW 1.0"
	)

	void(
		"SwapInterval",
		"""
		Sets the swap interval for the current context, i.e. the number of screen updates to wait from the time #SwapBuffers() was called before swapping the
		buffers and returning. This is sometimes called <i>vertical synchronization</i>, <i>vertical retrace synchronization</i> or just <i>vsync</i>.

		Contexts that support either of the <a href="https://www.opengl.org/registry/specs/EXT/wgl_swap_control_tear.txt">WGL_EXT_swap_control_tear</a> and
		<a href="https://www.opengl.org/registry/specs/EXT/glx_swap_control_tear.txt">GLX_EXT_swap_control_tear</a> extensions also accept negative swap
		intervals, which allow the driver to swap even if a frame arrives a little bit late. You can check for the presence of these extensions using
		#ExtensionSupported(). For more information about swap tearing, see the extension specifications.

		A context must be current on the calling thread. Calling this function without a current context will cause a #NO_CURRENT_CONTEXT error.

		Notes:
		${ul(
			"This function may be called from any thread.",
			"""
			This function is not called during window creation, leaving the swap interval set to whatever is the default on that platform. This is done because
			some swap interval extensions used by GLFW do not allow the swap interval to be reset to zero once it has been set to a non-zero value.
			""",
		    """
		    Some GPU drivers do not honor the requested swap interval, either because of a user setting that overrides the application's request or due to bugs
		    in the driver.
		    """
		)}
		""",

		int.IN("interval", "the minimum number of screen updates to wait for until the buffers are swapped by #SwapBuffers()"),

	    since = "GLFW 1.0"
	)

	int(
		"ExtensionSupported",
		"""
		Returns whether the specified <a href="http://www.glfw.org/docs/latest/context.html\#context_glext">API extension</a> is supported by the current
		OpenGL or OpenGL ES context. It searches both for OpenGL and OpenGL ES extension and platform-specific context creation API extensions.

		A context must be current on the calling thread. Calling this function without a current context will cause a #NO_CURRENT_CONTEXT error.

		As this functions retrieves and searches one or more extension strings each call, it is recommended that you cache its results if it is going to be used
		frequently. The extension strings will not change during the lifetime of a context, so there is no danger in doing this.

		This function may be called from any thread.
		""",

		const _ charASCII_p.IN("extension", "the ASCII encoded name of the extension"),

	    returnDoc = "GL11##GL_TRUE if the extension is available, or GL11##GL_FALSE otherwise",

	    since = "GLFW 1.0"
	)

	GLFWglproc(
		"GetProcAddress",
		"""
		Returns the address of the specified <a href="http://www.glfw.org/docs/latest/context.html\#context_glext">core or extension function</a>, if it is
		supported by the current context.

		A context must be current on the calling thread.  Calling this function without a current context will cause a `GLFW_NO_CURRENT_CONTEXT` error.

		Notes:
		${ul(
			"The addresses of a given function is not guaranteed to be the same between contexts.",
			"""
			This function may return a non-$NULL address despite the associated version or extension not being available. Always check the context version or
			extension string presence first.
			""",
			"The returned function pointer is valid until the context is destroyed or the library is terminated.",
			"This function may be called from any thread."
		)}
		""",

		const _ charASCII_p.IN("procname", "the ASCII encoded name of the function"),

	    returnDoc = "the address of the function, or $NULL if the function is unavailable",
	    since = "GLFW 1.0"
	)

}