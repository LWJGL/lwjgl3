/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.glfw.templates

import org.lwjgl.generator.*
import org.lwjgl.system.glfw.*
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
		Native bindings to the GLFW library.

		<b>Note</b>: All OpenGL related functionality has been stripped away.
		"""

	IntConstant.block(
		"This is incremented when the API is changed in non-compatible ways.",

		"VERSION_MAJOR" _ 3
	)

	IntConstant.block(
		"This is incremented when features are added to the API but it remains backward-compatible.",

		"VERSION_MINOR" _ 1
	)

	IntConstant.block(
		"This is incremented when a bug fix release is made that does not contain any API changes.",

		"VERSION_REVISION" _ 0
	)

	IntConstant.block(
		"The key or button was released.",

		"RELEASE" _ 0
	)

	IntConstant.block(
		"The key or button was pressed.",

		"PRESS" _ 1
	)

	IntConstant.block(
		"The key was held down until it repeated.",

		"REPEAT" _ 2
	)

	IntConstant.block(
		"The unknown key.",

		"KEY_UNKNOWN" _ -1
	)

	IntConstant.block(
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

	IntConstant.block(
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
		"KEY_LAST".expr<Int>("GLFW_KEY_MENU")
	)

	IntConstant.block(
		"If this bit is set one or more Shift keys were held down.",

		"MOD_SHIFT" _ 0x0001
	)

	IntConstant.block(
		"If this bit is set one or more Control keys were held down.",

		"MOD_CONTROL" _ 0x0002
	)

	IntConstant.block(
		"If this bit is set one or more Alt keys were held down.",

		"MOD_ALT" _ 0x0004
	)

	IntConstant.block(
		"If this bit is set one or more Super keys were held down.",

		"MOD_SUPER" _ 0x0008
	)

	IntConstant.block(
		"Mouse buttons.",

		"MOUSE_BUTTON_1" _ 0,
		"MOUSE_BUTTON_2" _ 1,
		"MOUSE_BUTTON_3" _ 2,
		"MOUSE_BUTTON_4" _ 3,
		"MOUSE_BUTTON_5" _ 4,
		"MOUSE_BUTTON_6" _ 5,
		"MOUSE_BUTTON_7" _ 6,
		"MOUSE_BUTTON_8" _ 7,
		"MOUSE_BUTTON_LAST".expr<Int>("GLFW_MOUSE_BUTTON_8"),
		"MOUSE_BUTTON_LEFT".expr<Int>("GLFW_MOUSE_BUTTON_1"),
		"MOUSE_BUTTON_RIGHT".expr<Int>("GLFW_MOUSE_BUTTON_2"),
		"MOUSE_BUTTON_MIDDLE".expr<Int>("GLFW_MOUSE_BUTTON_3")
	)

	IntConstant.block(
		"Joysticks.",

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
		"JOYSTICK_LAST".expr<Int>("GLFW_JOYSTICK_16")
	)

	IntConstant.block(
		"GLFW has not been initialized.",

		"NOT_INITIALIZED" _ 0x00010001
	)

	IntConstant.block(
		"No context is current for this thread.",

		"NO_CURRENT_CONTEXT" _ 0x00010002
	)

	IntConstant.block(
		"One of the enum parameters for the function was given an invalid enum.",

		"INVALID_ENUM" _ 0x00010003
	)

	IntConstant.block(
		"One of the parameters for the function was given an invalid value.",

		"INVALID_VALUE" _ 0x00010004
	)

	IntConstant.block(
		"A memory allocation failed.",

		"OUT_OF_MEMORY" _ 0x00010005
	)

	IntConstant.block(
		"GLFW could not find support for the requested client API on the system.",

		"API_UNAVAILABLE" _ 0x00010006
	)

	IntConstant.block(
		"The requested client API version is not available.",

		"VERSION_UNAVAILABLE" _ 0x00010007
	)

	IntConstant.block(
		"A platform-specific error occurred that does not match any of the more specific categories.",

		"PLATFORM_ERROR" _ 0x00010008
	)

	IntConstant.block(
		"The clipboard did not contain data in the requested format.",

		"FORMAT_UNAVAILABLE" _ 0x00010009
	)

	val WindowAttributes = IntConstant.block(
		"Window attributes.",

		"FOCUSED" _ 0x00020001,
		"ICONIFIED" _ 0x00020002,
		"RESIZABLE" _ 0x00020003,
		"VISIBLE" _ 0x00020004,
		"DECORATED" _ 0x00020005,
		"AUTO_ICONIFY" _ 0x00020006,
		"FLOATING" _ 0x00020007
	).javaDocLinks

	IntConstant.block(
		"Input options.",

		"CURSOR" _ 0x00033001,
		"STICKY_KEYS" _ 0x00033002,
		"STICKY_MOUSE_BUTTONS" _ 0x00033003
	)

	IntConstant.block(
		"Cursor state.",

		"CURSOR_NORMAL" _ 0x00034001,
		"CURSOR_HIDDEN" _ 0x00034002,
		"CURSOR_DISABLED" _ 0x00034003
	)

	IntConstant.block(
		"Monitor events.",

		"CONNECTED" _ 0x00040001,
		"DISCONNECTED" _ 0x00040002
	)

	IntConstant.block(
		"Don't care value.",

		"DONT_CARE" _ -1
	)


	val Init = (Code(
		javaInit = statement("\t\tSys.touch();\n\t\tif ( LWJGLUtil.getPlatform() == LWJGLUtil.Platform.MACOSX ) org.lwjgl.system.macosx.EventLoop.initSharedApplication();")
	) _ int.func(
		"Init",
		"""
		Initializes the GLFW library. Before most GLFW functions can be used, GLFW must be initialized, and before a program terminates GLFW should be
		terminated in order to free any resources allocated during or after initialization.

		If this function fails, it calls #SetGammaRamp() before returning. If it succeeds, you should call #SetGammaRamp() before the program
		exits.

		Additional calls to this function after successful initialization but before termination will return GL11##GL_TRUE immediately.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"""
			<b>Mac OS X</b>: This function will change the current directory of the application to the `Contents/Resources` subdirectory of the
			application's bundle, if present.
			"""
		)}
		""",

	    returnDoc = "GL11##GL_TRUE if successful, or GL11##GL_FALSE if an error occured. Errors are reported to the error callback."
	)).javaDocLink

	Code(
		javaBeforeNative = statement("\t\tWindowCallback.clearAll();")
	) _ void.func(
		"Terminate",
		"""
		Destroys all remaining windows, frees any allocated resources and sets the library to an uninitialized state. Once this is called, you must again call
		$Init successfully before you will be able to use most GLFW functions.

		If GLFW has been successfully initialized, this function should be called before the program exits. If initialization fails, there is no need to call
		this function, as it is called by $Init before it returns failure.

		Notes:
		${ul(
			"This function may be called before $Init.",
			"This function may only be called from the main thread.",
			"No window's context may be current on another thread when this function is called."
		)}
		"""
	)

	void.func(
		"GetVersion",
		"""
		Retrieves the major, minor and revision numbers of the GLFW library. It is intended for when you are using GLFW as a shared library and want to ensure
		that you are using the minimum required version.

		Notes:
		${ul(
			"This function always succeeds.",
			"This function may be called before $Init.",
			"This function may be called from any thread."
		)}
		""",

		Check(1) _ int_p.OUT("major", "major version number"),
		Check(1) _ int_p.OUT("minor", "minor version number"),
		Check(1) _ int_p.OUT("rev", "revision number")
	)

	(const _ charUTF8_p).func(
		"GetVersionString",
		"""
		Returns the compile-time generated version string of the GLFW library binary. It describes the version, platform, compiler and any platform-specific
		compile-time options.

		Notes:
		${ul(
			"This function always succeeds.",
			"This function may be called before $Init.",
			"This function may be called from any thread."
		)}
		""",
	    returnDoc = "the GLFW version string"
	)

	GLFWerrorfun.func(
		"SetErrorCallback",
		"""
		Sets the error callback, which is called with an error code and a human-readable description each time a GLFW error occurs.

		Notes:
		${ul(
			"This function always succeeds.",
			"This function may be called before $Init.",
			"This function may only be called from the main thread.",
			"""
			The error callback is called by the thread where the error occurred. If you are using GLFW from multiple threads, your error callback needs to be
			written accordingly.
			""",
			"""
			Because the description string provided to the callback may have been generated specifically for that error, it is not guaranteed to be valid after
			the callback has returned. If you wish to use it after that, you need to make your own copy of it before returning.
			"""
		)}
		""",

		mods(
			Callback("ErrorCallback"),
			Expression("ErrorCallback.Util.register(cbfun)", keepParam = true),
			nullable
		) _ GLFWerrorfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

	    returnDoc = "the previously set callback, or $NULL if no callback was set"
	)

	GLFWmonitor_p.func(
		"GetMonitors",
		"""
		Returns an array of handles for all currently connected monitors.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
		    "The returned array is allocated and freed by GLFW. You should not free it yourself.",
		    """
		    The returned array is valid only until the monitor configuration changes. See #SetMonitorCallback() to receive notifications of configuration
		    changes.
		    """
		)}
		""",

		autoSizeResult _ int_p.OUT("count", "where to store the size of the returned array. This is set to zero if an error occurred."),

	    returnDoc = "an array of monitor handlers, or $NULL if an error occured. Errors are reported to the error callback."
	)

	GLFWmonitor.func(
		"GetPrimaryMonitor",
		"""
		Returns the primary monitor. This is usually the monitor where elements like the Windows task bar or the OS X menu bar is located.

		Note: This function may only be called from the main thread.
		""",

	    returnDoc = "the primary monitor, or $NULL if an error occured. Errors are reported to the error callback."
	)

	void.func(
		"GetMonitorPos",
		"""
		Returns the position, in screen coordinates, of the upper-left corner of the specified monitor.

		Note: This function may only be called from the main thread.
		""",

		GLFWmonitor.IN("monitor", "the monitor to query"),
		mods(nullable, Check(1)) _ int_p.OUT("xpos", "where to store the monitor x-coordinate, or $NULL"),
		mods(nullable, Check(1)) _ int_p.OUT("ypos", "where to store the monitor y-coordinate, or $NULL")
	)

	void.func(
		"GetMonitorPhysicalSize",
		"""
		Returns the size, in millimetres, of the display area of the specified monitor.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
		    """
		    Some operating systems do not provide accurate information, either because the monitor's EDID data is incorrect, or because the driver does not
		    report it accurately.
		    """
		)}
		""",

		GLFWmonitor.IN("monitor", "the monitor to query"),
		mods(nullable, Check(1)) _ int_p.OUT("width", "where to store the width, in mm, of the monitor's display area, or $NULL"),
		mods(nullable, Check(1)) _ int_p.OUT("height", "where to store the height, in mm, of the monitor's display area, or $NULL")
	)

	(const _ charUTF8_p).func(
		"GetMonitorName",
		"""
		Returns a human-readable name, encoded as UTF-8, of the specified monitor.

		Note: This function may only be called from the main thread.
		""",

		GLFWmonitor.IN("monitor", "the monitor to query"),

	    returnDoc = "the UTF-8 encoded name of the monitor, or $NULL if an error occured. Errors are reported to the error callback."
	)

	GLFWmonitorfun.func(
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

		mods(
			Callback("MonitorCallback"),
			Expression("MonitorCallback.Util.register(cbfun)", keepParam = true),
			nullable
		) _ GLFWmonitorfun.IN("cbfun", "the new callback, or $NULL to remove the currently set callback"),

	    returnDoc = "the previously set callback, or $NULL if no callback was set"
	)

	(const _ GLFWvidmode).func(
		"GetVideoModes",
		"""
		Returns an array of all video modes supported by the specified monitor. The returned array is sorted in ascending order, first by color bit depth (the
		sum of all channel depths) and then by resolution area (the product of width and height).

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"The returned array is allocated and freed by GLFW. You should not free it yourself.",
		    "The returned array is valid only until this function is called again for the specified monitor."
		)}
		""",

		GLFWmonitor.IN("monitor", "the monitor to query"),
		mods(Check(1), autoSizeResult) _ int_p.OUT("count", "where to store the number of video modes in the returned array. This is set to zero if an error occurred."),

	    returnDoc = "an array of video modes, or $NULL if an error occured. Errors are reported to the error callback."
	)

	(const _ GLFWvidmode_p).func(
		"GetVideoMode",
		"""
		Returns the current video mode of the specified monitor. if you are using a full screen window, the return value will therefore depend on whether it is
		focused.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"The returned struct is allocated and freed by GLFW. You should not free it yourself."
		)}
		""",

		GLFWmonitor.IN("monitor", "the monitor to query"),

	    returnDoc = "the current mode of the monitor, or $NULL if an error occurred. Errors are reported to the error callback."
	)

	void.func(
		"SetGamma",
		"""
		Generates a 256-element gamma ramp from the specified exponent and then calls #SetGammaRamp() with it.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"""
			You cannot generate sRGB gamma using this function, because although it is approximately 2.2 it cannot be accurately expressed as a single numerical
			value.
			"""
		)}
		""",

		GLFWmonitor.IN("monitor", "the monitor whose gamma ramp to set"),
		float.IN("gamma", "the desired exponent")
	)

	(const _ GLFWgammaramp_p).func(
		"GetGammaRamp",
		"""
		Retrieves the current gamma ramp of the specified monitor.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"The value arrays of the returned ramp are allocated and freed by GLFW. You should not free them yourself."
		)}
		""",

		GLFWmonitor.IN("monitor", "the monitor to query"),

	    returnDoc = "the current gamma ramp, or $NULL if an error occurred. Errors are reported to the error callback."
	)

	void.func(
		"SetGammaRamp",
		"""
		Sets the current gamma ramp for the specified monitor.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"Gamma ramp sizes other than 256 are not supported by all hardware"
		)}
		""",

		GLFWmonitor.IN("monitor", "the monitor whose gamma ramp to set"),
		const _ GLFWgammaramp_p.IN("ramp", "the gamma ramp to use")
	)

	void.func(
		"DefaultWindowHints",
		"""
		Resets all window hints to their default values.

		Note: This function may only be called from the main thread.
		"""
	)

	val WindowHint = void.func(
		"WindowHint",
		"""
		Sets hints for the next call to #CreateWindow(). The hints, once set, retain their values until changed by a call to glfwWindowHint or
		#DefaultWindowHints(), or until the library is terminated with #Terminate().

		Note: This function may only be called from the main thread.
		""",

		int.IN("target", "the window hint to set"),
		int.IN("hint", "the new value of the window hint")
	).javaDocLink

	Code(
		// Make sure there's always a WindowCallback registered on MacOSX, else glfwWaitEvents will block indefinitely.
		javaAfterNative = statement(
			"\t\tif ( $RESULT != NULL && LWJGLUtil.getPlatform() == LWJGLUtil.Platform.MACOSX )\n\t\t\tWindowCallback.set(__result, new WindowCallbackAdapter());"
		)
	) _ GLFWwindow.func(
		"CreateWindow",
		"""
		Creates a window and its associated context. Most of the options controlling how the window and its context should be created are specified through
		#WindowHint().
 
		Successful creation does not change which context is current. Before you can use the newly created context, you need to make it current using
		#MakeContextCurrent().
 
		The created window, framebuffer and context may differ from what you requested, as not all parameters and hints are hard constraints. This includes the
		size of the window, especially for full screen windows. To retrieve the actual attributes of the created window, framebuffer and context, use queries
		like #GetWindowAttrib() and #GetWindowSize().
 
		To create a full screen window, you need to specify the monitor the window will cover. If no monitor is specified, windowed mode will be used. Unless
		you have a way for the user to choose a specific monitor, it is recommended that you pick the primary monitor.
 
		By default, newly created windows use the placement recommended by the window system. To create the window at a specific position, make it initially
		invisible using the #VISIBLE window hint, set its position and then show it.
 
		If a full screen window is active, the screensaver is prohibited from starting.

        Notes:
		${ul(
			"This function may only be called from the main thread.",
			"The swap interval is not set during window creation and the initial value may vary depending on driver settings and defaults.",
		    "<b>Windows</b>: Window creation will fail if the Microsoft GDI software OpenGL implementation is the only one available.",
		    """
		    <b>Windows</b>: If the executable has an icon resource named {@code GLFW_ICON}, it will be set as the icon for the window. If no such icon
		    is present, the {@code IDI_WINLOGO} icon will be used instead.
			""",
		    """
		    <b>OS X</b>: The GLFW window has no icon, as it is not a document window, but the dock icon will be the same as the application bundle's
		    icon. Also, the first time a window is opened the menu bar is populated with common commands like Hide, Quit and About. The (minimal) about dialog
		    uses information from the application's bundle. For more information on bundles, see the
		    <a href="https://developer.apple.com/library/mac/documentation/CoreFoundation/Conceptual/CFBundles/">Bundle Programming Guide</a> in the Mac
		    Developer Library.
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

	    returnDoc = "the handle of the created window, or $NULL if an error occurred. Errors are reported to the error callback."
	)

	Code(
		javaBeforeNative = statement("\t\tWindowCallback.set(window, null);")
	) _ (void.func(
		"DestroyWindow",
		"""
		Destroys the specified window. On calling this function, no further callbacks will be called for that window.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"This function may not be called from a callback.",
		    "If the window's context is current on the main thread, it is detached before being destroyed.",
		    "The window's context must not be current on any other thread."
		)}
		""",

		GLFWwindow.IN("window", "the window to destroy")
	))

	int.func(
		"WindowShouldClose",
		"""
		Returns the value of the close flag of the specified window.

		Note: This function may be called from any thread.
		""",

		GLFWwindow.IN("window", "the window to query"),

	    returnDoc = "the value of the close flag"
	)

	void.func(
		"SetWindowShouldClose",
		"""
		Sets the value of the close flag of the specified window. This can be used to override the user's attempt to close the window, or to signal that it
		should be closed.

		Note: This function may be called from any thread.
		""",

		GLFWwindow.IN("window", "the window whose flag to change"),
		int.IN("value", "the new value")
	)

	void.func(
		"SetWindowTitle",
		"""
		Sets the window title, encoded as UTF-8, of the specified window.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window whose title to change"),
		const _ charUTF8_p.IN("title", "the UTF-8 encoded window title")
	)

	void.func(
		"GetWindowPos",
		"""
		Retrieves the position, in screen coordinates, of the upper-left corner of the client area of the specified window.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window to query"),
		mods(nullable, Check(1)) _ int_p.OUT("xpos", "where to store the x-coordinate of the upper-left corner of the client area, or $NULL"),
		mods(nullable, Check(1)) _ int_p.OUT("ypos", "where to store the y-coordinate of the upper-left corner of the client area, or $NULL")
	)

	void.func(
		"SetWindowPos",
		"""
		Sets the position, in screen coordinates, of the upper-left corner of the client area of the window.

		If the specified window is a full screen window, this function does nothing.

		If you wish to set an initial window position you should create a hidden window (using $WindowHint and #VISIBLE, set its
		position and then show it.

		Notes:
		${ul(
			"It is very rarely a good idea to move an already visible window, as it will confuse and annoy the user.",
			"This function may only be called from the main thread.",
			"The window manager may put limits on what positions are allowed."
		)}
		""",

		GLFWwindow.IN("window", "the window to query"),
		int.IN("xpos", "the x-coordinate of the upper-left corner of the client area"),
		int.IN("ypos", "the y-coordinate of the upper-left corner of the client area")
	)

	void.func(
		"GetWindowSize",
		"""
		Retrieves the size, in screen coordinates, of the client area of the specified window. If you wish to retrieve the size of the framebuffer in pixels,
		see #GetFramebufferSize().

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window whose size to retrieve"),
		mods(nullable, Check(1)) _ int_p.OUT("width", "where to store the width, in screen coordinates, of the client area, or $NULL"),
		mods(nullable, Check(1)) _ int_p.OUT("height", "where to store the height, in screen coordinates, of the client area, or $NULL")
	)

	void.func(
		"SetWindowSize",
		"""
		Sets the size, in pixels, of the client area of the specified window.

		For full screen windows, this function selects and switches to the resolution closest to the specified size, without affecting the window's context. As
		the context is unaffected, the bit depths of the framebuffer remain unchanged.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"The window manager may put limits on what window sizes are allowed."
		)}
		""",

		GLFWwindow.IN("window", "the window to resize"),
		int.IN("width", "the desired width of the specified window"),
		int.IN("height", "the desired height of the specified window")
	)

	void.func(
		"GetFramebufferSize",
		"""
		Retrieves the size, in pixels, of the framebuffer of the specified window. If you wish to retrieve the size of the window in screen coordinates, see
		#GetWindowSize().

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window whose framebuffer to query"),
		mods(nullable, Check(1)) _ int_p.OUT("width", "where to store the width, in pixels, of the framebuffer, or $NULL"),
		mods(nullable, Check(1)) _ int_p.OUT("height", "where to store the height, in pixels, of the framebuffer, or $NULL")
	)

	void.func(
		"GetWindowFrameSize",
	    """
	    Retrieves the size, in screen coordinates, of each edge of the frame of the specified window. This size includes the title bar, if the window has one.
	    The size of the frame may vary depending on the window-related hints used to create it.

	    Notes:
		${ul(
		    "This function may only be called from the main thread.",
		    """
		    This function retrieves the size of each window frame edge, not the offset along a screen coordinate axis, so the retrieved values will always be
		    zero or positive.
		    """
	    )}
	    """,

	    GLFWwindow.IN("window", "the window whose frame size to query"),
	    Check(1) _ int_p.OUT("left", "where to store the size, in screen coordinates, of the left edge of the window frame"),
	    Check(1) _ int_p.OUT("top", "where to store the size, in screen coordinates, of the top edge of the window frame"),
	    Check(1) _ int_p.OUT("right", "where to store the size, in screen coordinates, of the right edge of the window frame"),
	    Check(1) _ int_p.OUT("bottom", "where to store the size, in screen coordinates, of the bottom edge of the window frame")
	)

	void.func(
		"IconifyWindow",
		"""
		Iconifies/minimizes the specified window, if it was previously restored. If it is a fullscreen window, the original monitor resolution is restored until
		the window is restored. If the window is already iconified, this function does nothing.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window to iconify")
	)

	void.func(
		"RestoreWindow",
		"""
		Restores the specified window, if it was previously iconified/minimized. If it is a full screen window, the resolution chosen for the window is restored
		on the selected monitor. If the window is already restored, this function does nothing.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window to restore")
	)

	void.func(
		"ShowWindow",
		"""
		Makes the specified window visible, if it was previously hidden. If the window is already visible or is in fullscreen mode, this function does nothing.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window to make visible")
	)

	void.func(
		"HideWindow",
		"""
		Hides the specified window, if it was previously visible.  If the window is already hidden or is in full screen mode, this function does nothing.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window to hide")
	)

	GLFWmonitor.func(
		"GetWindowMonitor",
		"""
		Returns the handle of the monitor that the specified window is in full screen on.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window to query"),

	    returnDoc = "the monitor, or $NULL if the window is in windowed mode"
	)

	int.func(
		"GetWindowAttrib",
		"""
		Returns an attribute of the specified window.  There are many attributes, some related to the window and others to its context.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window to query", WindowAttributes),
		int.IN("attrib", "the window attribute whose value to return"),

	    returnDoc = "the value of the attribute, or zero if an error occured. Errors are reported to the error callback."
	)

	void.func(
		"SetWindowUserPointer",
		"""
		Sets the user-defined pointer of the specified window. The current value is retained until the window is destroyed. The initial value is $NULL.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window whose pointer to set"),
		nullable _ voidptr.IN("pointer", "the new value")
	)

	voidptr.func(
		"GetWindowUserPointer",
		"""
		Returns the current value of the user-defined pointer of the specified window. The initial value is $NULL.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window whose pointer to return")
	)

	val WindowCallbackSet = "WindowCallback##set(long, WindowCallback, java.util.EnumSet)"

	GLFWwindowposfun.func(
		"SetWindowPosCallback",
		"""
		Sets the position callback of the specified window, which is called when the window is moved. The callback is provided with the screen position of the
		upper-left corner of the client area of the window.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
		    "<b>LWJGL</b>: see $WindowCallbackSet."
		)}
 		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWwindowposfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set"
	)

	GLFWwindowsizefun.func(
		"SetWindowSizeCallback",
		"""
		Sets the size callback of the specified window, which is called when the window is resized. The callback is provided with the size, in screen
		coordinates, of the client area of the window.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"<b>LWJGL</b>: see $WindowCallbackSet."
		)}
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWwindowsizefun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set"
	)

	GLFWwindowclosefun.func(
		"SetWindowCloseCallback",
		"""
		Sets the close callback of the specified window, which is called when the user attempts to close the window, for example by clicking the close widget in
		the title bar.

        The close flag is set before this callback is called, but you can modify it at any time with #SetWindowShouldClose().

        The close callback is not triggered by #DestroyWindow().

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"<b>LWJGL</b>: see $WindowCallbackSet.",
		    "<b>Mac OS X:</b> Selecting Quit from the application menu will trigger the close callback for all windows."
		)}
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWwindowclosefun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set"
	)

	GLFWwindowrefreshfun.func(
		"SetWindowRefreshCallback",
		"""
		Sets the refresh callback of the specified window, which is called when the client area of the window needs to be redrawn, for example if the window has
		been exposed after having been covered by another window.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"<b>LWJGL</b>: see $WindowCallbackSet.",
		    """
		    On compositing window systems such as Aero, Compiz or Aqua, where the window contents are saved off-screen, this callback may be called only very
		    infrequently or never at all.
		    """
		)}
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWwindowrefreshfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set"
	)

	GLFWwindowfocusfun.func(
		"SetWindowFocusCallback",
		"""
		Sets the focus callback of the specified window, which is called when the window gains or loses focus.

		After the focus callback is called for a window that lost focus, synthetic key and mouse button release events will be generated for all such that had
		been pressed. For more information, see #SetKeyCallback() and #SetMouseButtonCallback().

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"<b>LWJGL</b>: see $WindowCallbackSet."
		)}
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWwindowfocusfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set"
	)

	GLFWwindowiconifyfun.func(
		"SetWindowIconifyCallback",
		"""
		Sets the iconification callback of the specified window, which is called when the window is iconified or restored.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"<b>LWJGL</b>: see $WindowCallbackSet."
		)}
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWwindowiconifyfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set"
	)

	GLFWframebuffersizefun.func(
		"SetFramebufferSizeCallback",
		"""
		Sets the framebuffer resize callback of the specified window, which is called when the framebuffer of the specified window is resized.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"<b>LWJGL</b>: see $WindowCallbackSet."
		)}
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWframebuffersizefun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set"
	)

	Code(
		javaInit = statement("\t\tif ( LWJGLUtil.getPlatform() == LWJGLUtil.Platform.MACOSX ) { WindowCallbackMacOSX.pollEvents(); return; }")
	) _ void.func(
		"PollEvents",
		"""
		Processes all pending events.

        This function processes only those events that have already been received and then returns immediately. Processing events will cause the window and
        input callbacks associated with those events to be called.

        This function is not required for joystick input to work.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"This function may not be called from a callback.",
			"""
			On some platforms, a window move, resize or menu operation will cause event processing to block. This is due to how event processing is designed on
			those platforms. You can use the window refresh callback to redraw the contents your window when necessary during the operation.
			""",
			"On some platforms, certain callbacks may be called outside of a call to one of the event processing functions."
		)}
		"""
	)

	Code(
		javaInit = statement("\t\tif ( LWJGLUtil.getPlatform() == LWJGLUtil.Platform.MACOSX ) { WindowCallbackMacOSX.waitEvents(); return; }")
	) _ void.func(
		"WaitEvents",
		"""
		 Waits until events are pending and processes them.

        This function puts the calling thread to sleep until at least one event has been received. Once one or more events have been received, it behaves as if
        #PollEvents() was called, i.e. the events are processed and the function then returns immediately. Processing events will cause the window and input
        callbacks associated with those events to be called.

		Since not all events are associated with callbacks, this function may return without a callback having been called even if you are monitoring all
		callbacks.

        This function is not required for joystick input to work.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"This function may not be called from a callback.",
			"""
			On some platforms, a window move, resize or menu operation will cause event processing to block. This is due to how event processing is designed on
			those platforms. You can use the window refresh callback to redraw the contents your window when necessary during the operation.
			""",
			"On some platforms, certain callbacks may be called outside of a call to one of the event processing functions."
		)}
		"""
	)

	void.func(
		"PostEmptyEvent",
		"""
	    Posts an empty event from the current thread to the main thread event queue, causing #WaitEvents() to return.

	    ${ul(
			"This function may be called from any thread.",
			"""
			If no windows exist, this function returns immediately. For synchronization of threads in applications that do not create windows, use your
			threading library of choice.
			"""
		)}
	    """
	)

	int.func(
		"GetInputMode",
		"""
		Returns the value of an input option for the specified window.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window to query"),
		int.IN("mode", "the input mode whose value to return", "#CURSOR #STICKY_KEYS #STICKY_MOUSE_BUTTONS"),

	    returnDoc = "the input mode value"
	)

	void.func(
		"SetInputMode",
		"""
		Sets an input option for the specified window.
		
		If {@code mode} is #CURSOR, the value must be one of the supported input modes:
		${ul(
			"#CURSOR_NORMAL makes the cursor visible and behaving normally.",
			"""
			#CURSOR_HIDDEN makes the cursor invisible when it is over the client area of the window but does not restrict the cursor from leaving. This is
			useful if you wish to render your own cursor or have no visible cursor at all.
			""",
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

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window whose input mode to set"),
		int.IN("mode", "the input mode to set", "#CURSOR #STICKY_KEYS #STICKY_MOUSE_BUTTONS"),
		int.IN("value", "the new value of the specified input mode")
	)

	int.func(
		"GetKey",
		"""
		Returns the last state reported for the specified key to the specified window. The returned state is one of #PRESS or #RELEASE. The higher-level state
		#REPEAT is only reported to the key callback.

		If the #STICKY_KEYS input mode is enabled, this function returns #PRESS the first time you call this function after a key has been pressed, even if the
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

	    returnDoc = "one of #PRESS or #RELEASE"
	)

	int.func(
		"GetMouseButton",
		"""
		Returns the last state reported for the specified mouse button to the specified window.

		If the #STICKY_MOUSE_BUTTONS input mode is enabled, this function returns #PRESS the first time you call this function after a mouse button has been
		pressed, even if the mouse button has already been released.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the desired window"),
		int.IN("button", "the desired mouse button"),

	    returnDoc = "one of #PRESS or #RELEASE"
	)

	void.func(
		"GetCursorPos",
		"""
		Returns the last reported position of the cursor, in screen coordinates, relative to the upper-left corner of the client area of the specified window.

		If the cursor is disabled (with #CURSOR_DISABLED) then the cursor position is unbounded and limited only by the minimum and maximum values of a
		<b>double</b>.

		The coordinate can be converted to their integer equivalents with the Math##floor() function. Casting directly to an integer type works for positive
		coordinates, but fails for negative ones.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the desired window"),
		mods(nullable, Check(1)) _ double_p.OUT("xpos", "where to store the cursor x-coordinate, relative to the left edge of the client area, or $NULL"),
		mods(nullable, Check(1)) _ double_p.OUT("ypos", "where to store the cursor y-coordinate, relative to the to top edge of the client area, or $NULL.")
	)

	void.func(
		"SetCursorPos",
		"""
		Sets the position, in screen coordinates, of the cursor relative to the upper-left corner of the client area of the specified window. The window must be
		focused. If the window does not have focus when this function is called, it fails silently.

		If the cursor is disabled (with #CURSOR_DISABLED) then the cursor position is unbounded and limited only by the minimum and maximum values of a
		<b>double</b>.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the desired window"),
		double.IN("xpos", "the desired x-coordinate, relative to the left edge of the client area"),
		double.IN("ypos", "the desired y-coordinate, relative to the top edge of the client area")
	)

	GLFWcursor.func(
		"CreateCursor",
	    """
	    Creates a new cursor that can be made the system cursor for a window with #SetCursor(). The cursor can be destroyed with #DestroyCursor(). Any remaining
	    cursors are destroyed by #Terminate().

	    The specified image is in 32-bit RGBA format, so eight bits per channel.

	    Note: This function may only be called from the main thread.
	    """,

	    const _ GLFWimage_p.IN("image", "the desired cursor image"),
	    int.IN("xhot", "the desired x-coordinate of the cursor hotspot"),
	    int.IN("yhot", "the desired y-coordinate of the cursor hotspot"),

	    returnDoc = "a new cursor ready to use or $NULL if an error occurred. Errors are reported to the error callback."
	)

	void.func(
		"DestroyCursor",
	    """
	    Destroys a cursor previously created with #CreateCursor(). Any remaining cursors will be destroyed by #Terminate().

	    Note: This function may only be called from the main thread.
	    """,

	    GLFWcursor.IN("cursor", "the cursor object to destroy")
	)

	void.func(
		"SetCursor",
	    """
	    Sets the system cursor for a given window.

	    Note: This function may only be called from the main thread.
	    """,

	    GLFWwindow.IN("window", "the window to set the system cursor for"),
	    GLFWcursor.IN("cursor", "he cursor to change to, or $NULL to switch back to the default system cursor")
	)

	GLFWkeyfun.func(
		"SetKeyCallback",
		"""
		Sets the key callback of the specific window, which is called when a key is pressed, repeated or released.

		The key functions deal with physical keys, with layout independent key tokens named after their values in the standard US keyboard layout. If you want
		to input text, use #SetCharCallback() instead.

		When a window loses focus, it will generate synthetic key release events for all pressed keys. You can tell these events from user-generated events by
		the fact that the synthetic ones are generated after the window has lost focus, i.e. #FOCUSED will be false and the focus callback will have already
		been called.

		The scancode of a key is specific to that platform or sometimes even to that machine. Scancodes are intended to allow users to bind keys that don't have
		a GLFW key token. Such keys have {@code key} set to #KEY_UNKNOWN, their state is not saved and so it cannot be retrieved with #GetKey().

		Sometimes GLFW needs to generate synthetic key events, in which case the scancode may be zero.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"<b>LWJGL</b>: see $WindowCallbackSet."
		)}
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWkeyfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set"
	)

	GLFWcharfun.func(
		"SetCharCallback",
		"""
		Sets the character callback of the specific window, which is called when a Unicode character is input.

		The character callback is intended for Unicode text input. As it deals with characters, it is keyboard layout dependent, whereas #SetKeyCallback() is
		not. Characters do not map 1:1 to physical keys, as a key may produce zero, one or more characters. If you want to know whether a specific physical key
		was pressed or released, see the key callback instead.

		The character callback behaves as system text input normally does and will not be called if modifier keys are held down that would prevent normal text
		input on that platform, for example a Super (Command) key on OS X or Alt key on Windows. There is #SetCharModsCallback() that receives these events.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"<b>LWJGL</b>: see $WindowCallbackSet."
		)}
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWcharfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set"
	)

	GLFWcharmodsfun.func(
		"SetCharModsCallback",
		"""
		Sets the character with modifiers callback of the specific window, which is called when a Unicode character is input regardless of what modifier keys
		are used.

		The character with modifiers callback is intended for implementing custom Unicode character input. For regular Unicode text input, see
		#SetCharCallback(). Like the character callback, the character with modifiers callback deals with characters and is keyboard layout dependent.
		Characters do not map 1:1 to physical keys, as a key may produce zero, one or more characters. If you want to know whether a specific physical key was
		pressed or released, see #SetKeyCallback() instead.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"<b>LWJGL</b>: see $WindowCallbackSet."
		)}
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWcharmodsfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set"
	)

	GLFWmousebuttonfun.func(
		"SetMouseButtonCallback",
		"""
		Sets the mouse button callback of the specified window, which is called when a mouse button is pressed or released.

		When a window loses focus, it will generate synthetic mouse button release events for all pressed mouse buttons. You can tell these events from
		user-generated events by the fact that the synthetic ones are generated after the window has lost focus, i.e. #FOCUSED will be false and the focus
		callback will have already been called.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"<b>LWJGL</b>: see $WindowCallbackSet."
		)}
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWmousebuttonfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set"
	)

	GLFWcursorposfun.func(
		"SetCursorPosCallback",
		"""
		Sets the cursor position callback of the specified window, which is called when the cursor is moved. The callback is provided with the position, in
		screen coordinates, relative to the upper-left corner of the client area of the window.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"<b>LWJGL</b>: see $WindowCallbackSet."
		)}
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWcursorposfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set"
	)

	GLFWcursorenterfun.func(
		"SetCursorEnterCallback",
		"""
		Sets the cursor boundary crossing callback of the specified window, which is called when the cursor enters or leaves the client area of the window.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"<b>LWJGL</b>: see $WindowCallbackSet."
		)}
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWcursorenterfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set"
	)

	GLFWscrollfun.func(
		"SetScrollCallback",
		"""
		Sets the scroll callback of the specified window, which is called when a scrolling device is used.

		The scroll callback receives all scrolling input, like that from a mouse wheel or a touchpad scrolling area.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"<b>LWJGL</b>: see $WindowCallbackSet."
		)}
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWscrollfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

		returnDoc = "the previously set callback, or $NULL if no callback was set"
	)

	GLFWdropfun.func(
		"SetDropCallback",
	    """
	    Sets the file drop callback of the specified window, which is called when one or more dragged files are dropped on the window.

		Notes:
		${ul(
		    "This function may only be called from the main thread.",
		    "<b>LWJGL</b>: see $WindowCallbackSet."
	    )}
	    """,

	    GLFWwindow.IN("window", "the window whose callback to set"),
	    nullable _ GLFWdropfun.IN("cbfun", "the new callback or $NULL to remove the currently set callback"),

	    returnDoc = "the previously set callback, or $NULL if no callback was set"
	)

	int.func(
		"JoystickPresent",
		"""
		Returns whether the specified joystick is present.

		Note: This function may only be called from the main thread.
		""",

		int.IN("joy", "joystick to query"),

	    returnDoc = "GL11##GL_TRUE if the joystick is present, or GL11##GL_FALSE otherwise"
	)

	(const _ float_p).func(
		"GetJoystickAxes",
		"""
		Returns the values of all axes of the specified joystick.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"The returned array is allocated and freed by GLFW.  You should not free it yourself.",
			"The returned array is valid only until the next call to #GetJoystickAxes() for that joystick."
		)}
		""",

		int.IN("joy", "the joystick to query"),
		autoSizeResult _ int_p.OUT("count", "where to store the size of the returned array. This is set to zero if an error occurred."),

	    returnDoc = "an array of axis values, or $NULL if the joystick is not present"
	)

	(const _ unsigned_char_p).func(
		"GetJoystickButtons",
		"""
		Returns the state of all buttons of the specified joystick.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"The returned array is allocated and freed by GLFW.  You should not free it yourself.",
			"The returned array is valid only until the next call to #GetJoystickButtons() for that joystick."
		)}
		""",

		int.IN("joy", "the joystick to query"),
		autoSizeResult _ int_p.OUT("count", "where to store the size of the returned array. This is set to zero if an error occurred."),

	    returnDoc = "an array of button states, or $NULL if the joystick is not present"
	)

	(const _ charUTF8_p).func(
		"GetJoystickName",
		"""
		Returns the name, encoded as UTF-8, of the specified joystick.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"The returned string is allocated and freed by GLFW.  You should not free it yourself.",
			"The returned string is valid only until the next call to #GetJoystickName() for that joystick."
		)}
		""",

		int.IN("joy", "the joystick to query"),

	    returnDoc = "the UTF-8 encoded name of the joystick, or $NULL if the joystick is not present"
	)

	void.func(
		"SetClipboardString",
		"""
		Sets the system clipboard to the specified, UTF-8 encoded string. The string is copied before returning, so you don't have to retain it afterwards.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "the window that will own the clipboard contents"),
		const _ charUTF8_p.IN("string", "a UTF-8 encoded string")
	)

	(const _ charUTF8_p).func(
		"GetClipboardString",
		"""
		Returns the contents of the system clipboard, if it contains or is convertible to a UTF-8 encoded string.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"The returned string is allocated and freed by GLFW.  You should not free it yourself.",
			"The returned string is valid only until the next call to #GetClipboardString() or #SetClipboardString()."
		)}
		""",

		GLFWwindow.IN("window", "the window that will request the clipboard contents"),

	    returnDoc = "the contents of the clipboard as a UTF-8 encoded string, or $NULL if an error occurred"
	)

	double.func(
		"GetTime",
		"""
		Returns the value of the GLFW timer. Unless the timer has been set using #SetTime(), the timer measures time elapsed since GLFW was initialized.

		Notes:
		${ul(
			"This function may be called from any thread.",
			"""
			The resolution of the timer is system dependent, but is usually on the order of a few micro- or nanoseconds. It uses the highest-resolution
			monotonic time source on each supported platform.
			"""
		)}
		""",

	    returnDoc = "the current value, in seconds, or zero if an error occurred. Errors are reported to the error callback."
	)

	void.func(
		"SetTime",
		"""
		Sets the value of the GLFW timer. It then continues to count up from that value.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"""
			The resolution of the timer is system dependent, but is usually on the order of a few micro- or nanoseconds. It uses the highest-resolution
			monotonic time source on each supported platform.
			"""
		)}
		""",

		double.IN("time", "new value, in seconds")
	)

	// [ OpenGL ]

	IntConstant.block(
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
	)

	IntConstant.block(
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
	)

	IntConstant.block(
		"Values for the #CLIENT_API hint.",

		"OPENGL_API" _ 0x00030001,
		"OPENGL_ES_API" _ 0x00030002
	)

	IntConstant.block(
		"Values for the #CONTEXT_ROBUSTNESS hint.",

		"NO_ROBUSTNESS" _ 0,
		"NO_RESET_NOTIFICATION" _ 0x00031001,
		"LOSE_CONTEXT_ON_RESET" _ 0x00031002
	)

	IntConstant.block(
		"Values for the #OPENGL_PROFILE hint.",

		"OPENGL_ANY_PROFILE" _ 0,
		"OPENGL_CORE_PROFILE" _ 0x00032001,
		"OPENGL_COMPAT_PROFILE" _ 0x00032002
	)

	IntConstant.block(
		"Values for the #CONTEXT_RELEASE_BEHAVIOR hint.",

		"ANY_RELEASE_BEHAVIOR" _ 0,
		"RELEASE_BEHAVIOR_FLUSH" _ 0x00035001,
		"RELEASE_BEHAVIOR_NONE" _ 0x00035002
	)

	void.func(
		"MakeContextCurrent",
		"""
		Makes the context of the specified window current on the calling thread. A context can only be made current on a single thread at a time and each
		thread can have only a single current context at a time.

		Note: This function may be called from any thread.
		""",

		nullable _ GLFWwindow.IN("window", "the window whose context to make current, or $NULL to detach the current context")
	)

	GLFWwindow.func(
		"GetCurrentContext",
		"""
		Returns the window whose context is current on the calling thread.

		Note: This function may be called from any thread.
		""",

	    returnDoc = "the window whose context is current, or $NULL if no window's context is current"
	)

	void.func(
		"SwapBuffers",
		"""
		Swaps the front and back buffers of the specified window. If the swap interval is greater than zero, the GPU driver waits the specified number of screen
		updates before swapping the buffers.

		Note: This function may be called from any thread.
		""",

		GLFWwindow.IN("window", "the window whose buffers to swap")
	)

	void.func(
		"SwapInterval",
		"""
		Sets the swap interval for the current context, i.e. the number of screen updates to wait before swapping the buffers of a window and returning from
		#SwapBuffers(). This is sometimes called 'vertical synchronization', 'vertical retrace synchronization' or 'vsync'.

		Contexts that support either of the {@code WGL_EXT_swap_control_tear} and {@code GLX_EXT_swap_control_tear} extensions also accept negative swap
		intervals, which allow the driver to swap even if a frame arrives a little bit late. You can check for the presence of these extensions using
		#ExtensionSupported(). For more information about swap tearing, see the extension specifications.

		Notes:
		${ul(
			"This function may be called from any thread.",
			"""
			This function is not called during window creation, leaving the swap interval set to whatever is the default on that platform. This is done because
			some swap interval extensions used by GLFW do not allow the swap interval to be reset to zero once it has been set to a non-zero value.
			""",
		    "Some GPU drivers do not honor the requested swap interval, either because of user settings that override the request or due to bugs in the driver."
		)}
		""",

		int.IN("interval", "the minimum number of screen updates to wait for until the buffers are swapped by #SwapBuffers()")
	)

	int.func(
		"ExtensionSupported",
		"""
		Returns whether the specified OpenGL or context creation API extension is supported by the current context. For example, on Windows both the OpenGL and
		WGL extension strings are checked.

		Notes:
		${ul(
			"This function may be called from any thread.",
			"""
			As this functions searches one or more extension strings on each call, it is recommended that you cache its results if it's going to be used
			frequently. The extension strings will not change during the lifetime of a context, so there is no danger in doing this.
			"""
		)}
		""",

		const _ charASCII_p.IN("extension", "the ASCII encoded name of the extension"),

	    returnDoc = "GL11##GL_TRUE if the extension is available, or GL11##GL_FALSE otherwise"
	)

	GLFWglproc.func(
		"GetProcAddress",
		"""
		Returns the address of the specified client API or extension function if it is supported by the current context.

		Notes:
		${ul(
			"This function may be called from any thread.",
			"""
			The addresses of these functions are not guaranteed to be the same for all contexts, especially if they use different client APIs or even different
			context creation hints.
			"""
		)}
		""",

		const _ charASCII_p.IN("procname", "the ASCII encoded name of the function"),

	    returnDoc = "the address of the function, or $NULL if the function is unavailable"
	)

}