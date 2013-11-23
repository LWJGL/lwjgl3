/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.glfw.templates

import org.lwjgl.generator.*
import org.lwjgl.system.glfw.*
import org.lwjgl.opengl.*

fun GLFW() = "GLFW".nativeClass(packageName = GLFW_PACKAGE, prefix = "GLFW") {
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

		"VERSION_MINOR" _ 0
	)

	IntConstant.block(
		"This is incremented when a bug fix release is made that does not contain any API changes.",

		"VERSION_REVISION" _ 3
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
		"Modifier key flags.",

		"MOD_SHIFT" _ 0x0001,
		"MOD_CONTROL" _ 0x0002,
		"MOD_ALT" _ 0x0004,
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

	IntConstant.block(
		"Window events.",

		"FOCUSED" _ 0x00020001,
		"ICONIFIED" _ 0x00020002,
		"RESIZABLE" _ 0x00020003,
		"VISIBLE" _ 0x00020004,
		"DECORATED" _ 0x00020005
	)

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
		"Joystick state.",

		"PRESENT" _ 0x00050001,
		"AXES" _ 0x00050002,
		"BUTTONS" _ 0x00050003
	)

	IntConstant.block(
		"Monitor events.",

		"CONNECTED" _ 0x00040001,
		"DISCONNECTED" _ 0x00040002
	)

	val Init = (Code(
		javaInit = statement("\t\tif ( LWJGLUtil.getPlatform() == LWJGLUtil.Platform.MACOSX ) org.lwjgl.system.macosx.EventLoop.initSharedApplication();")
	) _ int.func(
		"Init",
		"""
		Initializes the GLFW library. Before most GLFW functions can be used, GLFW must be initialized, and before a program terminates GLFW should be
		terminated in order to free any resources allocated during or after initialization.

		If this function fails, it calls ${"SetGammaRamp()".link} before returning. If it succeeds, you should call ${"SetGammaRamp()".link} before the program
		exits.

		Additional calls to this function after successful initialization but before termination will succeed but will do nothing.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"This function may take several seconds to complete on some systems, while on other systems it may take only a fraction of a second to complete.",
			"""
			<strong>Mac OS X</strong>: This function will change the current directory of the application to the `Contents/Resources` subdirectory of the
			application's bundle, if present.
			"""
		)}
		"""
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
		Returns a static string generated at compile-time according to which configuration macros were defined. This is intended for use when submitting bug
		reports, to allow developers to see which code paths are enabled in a binary.

		The format of the string is as follows:
		${ul(
			"The version of GLFW",
			"The name of the window system API",
			"The name of the context creation API",
			"Any additional options or APIs"
		)}

		For example, when compiling GLFW 3.0 with MinGW using the Win32 and WGL backends, the version string may look something like this:

		3.0.0 Win32 WGL MinGW
		"""
	)

	GLFWerrorfun.func(
		"SetErrorCallback",
		"""
		Sets the error callback, which is called with an error code and a human-readable description each time a GLFW error occurs.

		Notes:
		${ul(
			"This function may be called before $Init.",
			"""
			The error callback is called by the thread where the error was generated. If you are using GLFW from multiple threads, your error callback needs to
			be written accordingly.
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
		) _ GLFWerrorfun.IN("cbfun", "the new callback or $NULL if no callback was set or an error occurred")
	)

	GLFWmonitor_p.func(
		"GetMonitors",
		"""
		Returns an array of handles for all currently connected monitors. The returned array is valid only until the monitor configuration changes.

		See ${"SetGammaRamp()".link} to receive notifications of configuration changes.
		""",

		autoSizeResult _ int_p.OUT("count", "where to store the size of the returned array. This is set to zero if an error occurred.")
	)

	GLFWmonitor.func(
		"GetPrimaryMonitor",
		"Returns the primary monitor. This is usually the monitor where elements like the Windows task bar or the OS X menu bar is located."
	)

	void.func(
		"GetMonitorPos",
		"Returns the position, in screen coordinates, of the upper-left corner of the specified monitor.",

		GLFWmonitor.IN("monitor", "monitor to query"),
		mods(nullable, Check(1)) _ int_p.OUT("xpos", "where to store the monitor x-coordinate, or $NULL"),
		mods(nullable, Check(1)) _ int_p.OUT("ypos", "where to store the monitor y-coordinate, or $NULL")
	)

	void.func(
		"GetMonitorPhysicalSize",
		"""
		Returns the size, in millimetres, of the display area of the specified monitor.

		Note: Some operating systems do not provide accurate information, either because the monitor's EDID data is incorrect, or because the driver does not
		report it accurately.
		""",

		GLFWmonitor.IN("monitor", "monitor to query"),
		mods(nullable, Check(1)) _ int_p.OUT("width", "where to store the width, in mm, of the monitor's display area, or $NULL"),
		mods(nullable, Check(1)) _ int_p.OUT("height", "where to store the height, in mm, of the monitor's display area, or $NULL")
	)

	(const _ charUTF8_p).func(
		"GetMonitorName",
		"Returns a human-readable name, encoded as UTF-8, of the specified monitor.",

		GLFWmonitor.IN("monitor", "monitor to query")
	)

	GLFWmonitorfun.func(
		"SetMonitorCallback",
		"""
		Sets the monitor configuration callback, or removes the currently set callback. This is called when a monitor is connected to or disconnected from the
		system.

		<strong>X11</strong>: This callback is not yet called on monitor configuration changes.
		""",

		mods(
			Callback("MonitorCallback"),
			Expression("MonitorCallback.Util.register(cbfun)", keepParam = true),
			nullable
		) _ GLFWmonitorfun.IN("cbfun", "the new callback, or $NULL if no callback was set or an error occurred")
	)

	(const _ GLFWvidmode).func(
		"GetVideoModes",
		"Returns an array of all video modes supported by the specified monitor.",

		GLFWmonitor.IN("monitor", "monitor to query"),
		mods(Check(1), autoSizeResult) _ int_p.OUT("count", "where to store the number of video modes in the returned array. This is set to zero if an error occurred.")
	)

	(const _ GLFWvidmode_p).func(
		"GetVideoMode",
		"""
		Returns the current video mode of the specified monitor. if you are using a full screen window, the return value will therefore depend on whether it is
		focused.
		""",

		GLFWmonitor.IN("monitor", "monitor to query")
	)

	void.func(
		"SetGamma",
		"Generates a 256-element gamma ramp from the specified exponent and then calls ${"SetGammaRamp()".link} with it.",

		GLFWmonitor.IN("monitor", "monitor whose gamma ramp to set"),
		float.IN("gamma", "desired exponent")
	)

	(const _ GLFWgammaramp_p).func(
		"GetGammaRamp",
		"Retrieves the current gamma ramp of the specified monitor.",

		GLFWmonitor.IN("monitor", "the monitor to query")
	)

	void.func(
		"SetGammaRamp",
		"""
		Sets the current gamma ramp for the specified monitor.

		Note: Gamma ramp sizes other than 256 are not supported by all hardware.
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
		Sets hints for the next call to ${"CreateWindow()".link}. The hints, once set, retain their values until changed by a call to glfwWindowHint or
		${"DefaultWindowHints()".link}, or until the library is terminated with ${"Terminate()".link}.

		Some window hints are hard constraints. These must match the available capabilities <em>exactly</em> for window creation to succeed. Hints that are not
		hard constraints are matched as closely as possible, but the resulting window may differ from what these hints requested. To find out the actual
		parameters of the created window, use the ${"GetWindowAttrib()".link} function.

		Hints that do not apply to a given type of window are ignored.

		Window hints:

		The ${"RESIZABLE".link} hint specifies whether the window will be resizable by the user. The window will still be resizable using the
		${"SetWindowSize()".link} function. This hint is ignored for fullscreen windows.

		The ${"VISIBLE".link} hint specifies whether the window will be initially visible. This hint is ignored for fullscreen windows.

		Note: This function may only be called from the main thread.
		""",

		int.IN("target", "The window hint to set"),
		int.IN("hint", "new value of the window hint")
	).javaDocLink

	Code(
		// Make sure there's always a WindowCallback registered on MacOSX, else glfwWaitEvents will block indefinitely.
		javaAfterNative = statement(
			"\t\tif ( __result != NULL && LWJGLUtil.getPlatform() == LWJGLUtil.Platform.MACOSX )\n\t\t\tWindowCallback.set(__result, new WindowCallbackAdapter());"
		)
	) _ GLFWwindow.func(
		"CreateWindow",
		"""
		Creates a window. Most of the options controlling how the window should be created are specified through $WindowHint.

		Note that the actual properties of the window may differ from what you requested, as not all parameters and hints are hard constraints.

		To create a full screen window, you need to specify the monitor to use. If no monitor is specified, windowed mode will be used. Unless you have a way
		for the user to choose a specific monitor, it is recommended that you pick the primary monitor.

		To create the window at a specific position, make it initially invisible using the ${"VISIBLE".link} window hint, set its position and then show it.

		If a full screen window is active, the screensaver is prohibited from starting.

		The swap interval is not set during window creation, but is left at the default value for that platform. For more information, see
		${"SwapInterval()".link}.

		  Note: This function may only be called from the main thread.
		""",

		int.IN("width", "desired width, in pixels, of the window"),
		int.IN("height", "desired height, in pixels, of the window"),
		const _ charUTF8_p.IN("title", "initial, UTF-8 encoded window title"),
		nullable _ GLFWmonitor.IN("monitor", "monitor to use for fullscreen mode, or $NULL to use windowed mode"),
		nullable _ GLFWwindow.IN("share", " window whose context to share resources with, or $NULL to not share resources")
	)

	val DestroyWindow = (Code(
		javaBeforeNative = statement("\t\tWindowCallback.set(window, null);")
	) _ (void.func(
		"DestroyWindow",
		"""
		Destroys the specified window. On calling this function, no further callbacks will be called for that window.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"This function may not be called from a callback."
		)}
		""",

		GLFWwindow.IN("window", "window to destroy")
	))).javaDocLink

	int.func(
		"WindowShouldClose",
		"""
		Returns the value of the close flag of the specified window.

		Note: This function may be called from secondary threads.
		""",

		GLFWwindow.IN("window", "window to query")
	)

	void.func(
		"SetWindowShouldClose",
		"""
		Sets the value of the close flag of the specified window. This can be used to override the user's attempt to close the window, or to signal that it
		should be closed.

		Note: This function may be called from secondary threads.
		""",

		GLFWwindow.IN("window", "window whose flag to change"),
		int.IN("value", "new value")
	)

	void.func(
		"SetWindowTitle",
		"Sets the window title, encoded as UTF-8, of the specified window.",

		GLFWwindow.IN("window", "window whose title to change"),
		const _ charUTF8_p.IN("title", "UTF-8 encoded window title")
	)

	void.func(
		"GetWindowPos",
		"Retrieves the position, in screen coordinates, of the upper-left corner of the client area of the specified window.",

		GLFWwindow.IN("window", "window to query"),
		mods(nullable, Check(1)) _ int_p.OUT("xpos", "where to store the x-coordinate of the upper-left corner of the client area, or $NULL"),
		mods(nullable, Check(1)) _ int_p.OUT("ypos", "where to store the y-coordinate of the upper-left corner of the client area, or $NULL")
	)

	void.func(
		"SetWindowPos",
		"""
		Sets the position, in screen coordinates, of the upper-left corner of the client area of the window.

		If the specified window is a full screen window, this function does nothing.

		If you wish to set an initial window position you should create a hidden window (using $WindowHint and ${"VISIBLE".link}, set its
		position and then show it.

		Notes:
		${ul(
			"It is very rarely a good idea to move an already visible window, as it will confuse and annoy the user.",
			"This function may only be called from the main thread.",
			"The window manager may put limits on what positions are allowed.",
			"""
			<strong>X11</strong>: Some window managers ignore the set position of hidden (i.e. unmapped) windows, instead placing them where it thinks is
			appropriate once they are shown.
			"""
		)}
		""",

		GLFWwindow.IN("window", "window to query"),
		int.IN("xpos", "x-coordinate of the upper-left corner of the client area"),
		int.IN("ypos", "y-coordinate of the upper-left corner of the client area")
	)

	void.func(
		"GetWindowSize",
		"Retrieves the size, in screen coordinates, of the client area of the specified window.",

		GLFWwindow.IN("window", "window whose size to retrieve"),
		mods(nullable, Check(1)) _ int_p.OUT("width", "where to store the width, in screen coordinates, of the client area, or $NULL"),
		mods(nullable, Check(1)) _ int_p.OUT("height", "where to store the height, in screen coordinates, of the client area, or $NULL")
	)

	void.func(
		"SetWindowSize",
		"""
		Sets the size, in pixels, of the client area of the specified window.

		Notes:
		${ul(
			"This function may only be called from the main thread.",
			"The window manager may put limits on what window sizes are allowed.",
			"For fullscreen windows, this function selects and switches to the resolution closest to the specified size, without destroying the window's context."
		)}
		""",

		GLFWwindow.IN("window", "window to resize"),
		int.IN("width", "desired width of the specified window"),
		int.IN("height", "desired height of the specified window")
	)

	void.func(
		"GetFramebufferSize",
		"Retrieves the size, in pixels, of the framebuffer of the specified window.",

		GLFWwindow.IN("window", "the window whose framebuffer to query"),
		mods(nullable, Check(1)) _ int_p.OUT("width", "where to store the width, in pixels, of the framebuffer, or $NULL"),
		mods(nullable, Check(1)) _ int_p.OUT("height", "where to store the height, in pixels, of the framebuffer, or $NULL")
	)

	void.func(
		"IconifyWindow",
		"""
		Iconifies/minimizes the specified window, if it was previously restored. If it is a fullscreen window, the original monitor resolution is restored
		until the window is restored. If the window is already iconified, this function does nothing.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "window to iconify")
	)

	void.func(
		"RestoreWindow",
		"""
		Restores the specified window, if it was previously iconified/minimized. If the window is already restored, this function does nothing.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "window to restore")
	)

	void.func(
		"ShowWindow",
		"""
		Makes the specified window visible, if it was previously hidden. If the window is already visible or is in fullscreen mode, this function does nothing.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "window to make visible")
	)

	void.func(
		"HideWindow",
		"""
		Hides the specified window, if it was previously visible. If the window is already hidden or is in fullscreen mode, this function does nothing.

		Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "window to hide")
	)

	GLFWmonitor.func(
		"GetWindowMonitor",
		"Returns the handle of the monitor that the specified window is in fullscreen on.",

		GLFWwindow.IN("window", "window to query")
	)

	int.func(
		"GetWindowAttrib",
		"""
		Returns an attribute of the specified window.
		${ul(
			"The ${"FOCUSED".link} attribute indicates whether the window is focused.",
			"The ${"ICONIFIED".link} attribute indicates whether the window is iconified.",
			"The ${"VISIBLE".link} attribute indicates whether the window is visible.",
			"The ${"RESIZABLE".link} attribute indicates whether the window is resizable by the user.",
			"The ${"DECORATED".link} attribute indicates whether the window is decorated."
		)}
		""",

		GLFWwindow.IN("window", "window to query"),
		int.IN("attrib", "parameter whose value to return")
	)

	void.func(
		"SetWindowUserPointer",
		"Sets the user-defined pointer of the specified window. The current value is retained until the window is destroyed. The initial value is $NULL.",

		GLFWwindow.IN("window", "window whose pointer to set"),
		nullable _ voidptr.IN("pointer", "new value")
	)

	voidptr.func(
		"GetWindowUserPointer",
		"Returns the current value of the user-defined pointer of the specified window. The initial value is $NULL.",

		GLFWwindow.IN("window", "window whose pointer to return")
	)

	val WindowCallbackSet = "{@link WindowCallback#set(long, WindowCallback, java.util.EnumSet) WindowCallback.set}"

	GLFWwindowposfun.func(
		"SetWindowPosCallback",
		"Sets the position callback for the specified window. See $WindowCallbackSet.",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWwindowposfun.IN("cbfun", "the new callback or $NULL if no callback was set or an error occurred")
	)

	GLFWwindowsizefun.func(
		"SetWindowSizeCallback",
		"Sets the size callback for the specified window. See $WindowCallbackSet.",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWwindowsizefun.IN("cbfun", "the new callback or $NULL if no callback was set or an error occurred")
	)

	GLFWwindowclosefun.func(
		"SetWindowCloseCallback",
		"""
		Sets the close callback of the specified window, which is called when the user attempts to close the window, for example by clicking the close widget in
		the title bar. See $WindowCallbackSet.

		The close flag is set before this callback is called, but you can modify it at any time with ${"SetWindowShouldClose()".link}.

		The close callback is not triggered by $DestroyWindow.

		<b>Mac OS X:</b> Selecting Quit from the application menu will trigger the close callback for all windows.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWwindowclosefun.IN("cbfun", "the new callback or $NULL if no callback was set or an error occurred")
	)

	GLFWwindowrefreshfun.func(
		"SetWindowRefreshCallback",
		"""
		Sets the refresh callback for the specified window. See $WindowCallbackSet.

		This callback is called when the client area of the window needs to be redrawn, for example if the window has been exposed after having been covered by
		another window.

		On compositing window systems such as Aero, Compiz or Aqua, where the window contents are saved off-screen, this callback may be called only very
		infrequently or never at all.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWwindowrefreshfun.IN("cbfun", "the new callback or $NULL if no callback was set or an error occurred")
	)

	GLFWwindowfocusfun.func(
		"SetWindowFocusCallback",
		"""
		Sets the focus callback for the specified window. See $WindowCallbackSet.

		This callback is called when the window gains or loses focus.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWwindowfocusfun.IN("cbfun", "the new callback or $NULL if no callback was set or an error occurred")
	)

	GLFWwindowiconifyfun.func(
		"SetWindowIconifyCallback",
		"""
		Sets the iconify callback for the specified window. See $WindowCallbackSet.

		This callback is called when the window is iconified or restored.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWwindowiconifyfun.IN("cbfun", "the new callback or $NULL if no callback was set or an error occurred")
	)

	GLFWframebuffersizefun.func(
		"SetFramebufferSizeCallback",
		"""
		Sets the framebuffer resize callback of the specified window, which is called when the framebuffer of the specified window is resized.

		See $WindowCallbackSet
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWframebuffersizefun.IN("cbfun", "the new callback or $NULL if no callback was set or an error occurred")
	)

	val PollEvents = (Code(
		javaInit = statement("\t\tif ( LWJGLUtil.getPlatform() == LWJGLUtil.Platform.MACOSX ) { WindowCallbackMacOSX.pollEvents(); return; }")
	) _ void.func(
		"PollEvents",
		"""
		Processes only those events that have already been received and then returns immediately. Processing events will cause the window and input callbacks
		associated with those events to be called.

		Notes:
		${ul(
			"This function is not required for joystick input to work.",
			"This function may only be called from the main thread.",
			"This function may not be called from a callback.",
			"On some platforms, certain callbacks may be called outside of a call to one of the event processing functions."
		)}
		"""
	)).javaDocLink

	Code(
		javaInit = statement("\t\tif ( LWJGLUtil.getPlatform() == LWJGLUtil.Platform.MACOSX ) { WindowCallbackMacOSX.waitEvents(); return; }")
	) _ void.func(
		"WaitEvents",
		"""
		Puts the calling thread to sleep until at least one event has been received. Once one or more events have been received, it behaves as if $PollEvents
		was called, i.e. the events are processed and the function then returns immediately. Processing events will cause the window and input callbacks
		associated with those events to be called.

		Since not all events are associated with callbacks, this function may return without a callback having been called even if you are monitoring all
		callbacks.

		Notes:
		${ul(
			"This function is not required for joystick input to work.",
			"This function may only be called from the main thread.",
			"This function may not be called from a callback.",
			"On some platforms, certain callbacks may be called outside of a call to one of the event processing functions."
		)}
		"""
	)

	int.func(
		"GetInputMode",
		"Returns the value of an input option for the specified window",

		GLFWwindow.IN("window", "window to query"),
		int.IN("mode", "One of ${"CURSOR".link}, ${"STICKY_KEYS".link} or ${"STICKY_MOUSE_BUTTONS".link}")
	)

	void.func(
		"SetInputMode",
		"""
		Sets an input option for the specified window
		
		If mode is ${"CURSOR".link}, the value must be one of the supported input modes:
		${ul(
			"${"CURSOR_NORMAL".link} makes the cursor visible and behaving normally.",
			"${"CURSOR_HIDDEN".link} makes the cursor invisible when it is over the client area of the window.",
			"${"CURSOR_DISABLED".link} disables the cursor and removes any limitations on cursor movement."
		)}

		If mode is ${"STICKY_KEYS".link}, the value must be either ${"GL11".linkGL("TRUE")} to enable sticky keys, or ${"GL11".linkGL("FALSE")} to disable it. If
		sticky keys are enabled, a key press will ensure that ${"GetKey()".link} returns ${"PRESS".link} the next time it is called even if the key had
		been released before the call.

		If mode is ${"STICKY_MOUSE_BUTTONS".link}, the value must be either ${"GL11".linkGL("TRUE")} to enable sticky mouse buttons, or ${"GL11".linkGL("FALSE")} to
		disable it. If sticky mouse buttons are enabled, a mouse button press will ensure that ${"GetMouseButton()".link} returns ${"PRESS".link} the next
		time it is called even if the mouse button had been released before the call. This is useful when you are only interested in whether mouse buttons have
		been pressed but not when or in which order.
		""",

		GLFWwindow.IN("window", "window whose input mode to set"),
		int.IN("mode", "One of ${"CURSOR".link}, ${"STICKY_KEYS".link} or ${"STICKY_MOUSE_BUTTONS".link}"),
		int.IN("value", "new value of the specified input mode")
	)

	int.func(
		"GetKey",
		"""
		Returns the last state reported for the specified key to the specified window. The returned state is one of ${"PRESS".link} or
		${"RELEASE".link}. The higher-level state ${"REPEAT".link} is only reported to the key callback.

		If the ${"STICKY_KEYS".link} input mode is enabled, this function returns ${"PRESS".link} the first time you call this function after a key has
		been pressed, even if the key has already been released.

		The key functions deal with physical keys, with tokens named after their use on the standard US keyboard layout. If you want to input text, use the
		Unicode character callback instead.

		Note: ${"KEY_UNKNOWN".link} is not a valid key for this function.
		""",

		GLFWwindow.IN("window", "desired window"),
		int.IN("key", "desired keyboard key")
	)

	int.func(
		"GetMouseButton",
		"""
		Returns the last state reported for the specified mouse button to the specified window.

		If the ${"STICKY_MOUSE_BUTTONS".link} input mode is enabled, this function
		returns ${"PRESS".link} the first time you call this function after a mouse
		button has been pressed, even if the mouse button has already been released.
		""",

		GLFWwindow.IN("window", "desired window"),
		int.IN("button", "desired mouse button")
	)

	void.func(
		"GetCursorPos",
		"""
		Returns the last reported position of the cursor to the specified window.

		If the cursor is disabled (with ${"CURSOR_DISABLED".link}) then the cursor position is unbounded and limited only by the minimum and maximum values
		of a <strong>double</strong>.

		The coordinate can be converted to their integer equivalents with the {@link Math#floor} function. Casting directly to an integer type works for
		positive coordinates, but fails for negative ones.
		""",

		GLFWwindow.IN("window", "desired window"),
		mods(nullable, Check(1)) _ double_p.OUT("xpos", "where to store the cursor x-coordinate, relative to the left edge of the client area, or $NULL"),
		mods(nullable, Check(1)) _ double_p.OUT("ypos", "where to store the cursor y-coordinate, relative to the to top edge of the client area, or $NULL.")
	)

	void.func(
		"SetCursorPos",
		"""
		Sets the position of the cursor. The specified window must be focused. If the window does not have focus when this function is called, it fails
		silently.

		If the cursor is disabled (with ${"CURSOR_DISABLED".link}) then the cursor position is unbounded and limited only by the minimum and maximum values
		of a <strong>double</strong>.
		""",

		GLFWwindow.IN("window", "desired window"),
		double.IN("xpos", "desired x-coordinate, relative to the left edge of the client area"),
		double.IN("ypos", "desired y-coordinate, relative to the top edge of the client area")
	)

	GLFWkeyfun.func(
		"SetKeyCallback",
		"""
		Sets the key callback. See $WindowCallbackSet.

		The key callback deals with physical keys, with key tokens named after their use on the standard US keyboard layout. If you want to input text, use the
		Unicode character callback instead.

		When a window loses focus, it will generate synthetic key release events for all pressed keys. You can tell these events from user-generated events by
		the fact that the synthetic ones are generated after the window has lost focus, i.e. ${"FOCUSED".link} will be false and the focus callback will
		have already been called.

		The scancode of a key is specific to that platform or sometimes even to that machine. Scancodes are intended to allow users to bind keys that don't have
		a GLFW key token. Such keys have {@code key} set to ${"KEY_UNKNOWN".link}, their state is not saved and so it cannot be retrieved with
		${"GetKey()".link}.

		Sometimes GLFW needs to generate synthetic key events, in which case the scancode may be zero.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWkeyfun.IN("cbfun", "the new callback or $NULL if no callback was set or an error occurred")
	)

	GLFWcharfun.func(
		"SetCharCallback",
		"""
		Sets the Unicode character callback. See $WindowCallbackSet.

		The Unicode character callback is for text input. If you want to know whether a specific key was pressed or released, use the key callback.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWcharfun.IN("cbfun", "the new callback or $NULL if no callback was set or an error occurred")
	)

	GLFWmousebuttonfun.func(
		"SetMouseButtonCallback",
		"Sets the mouse button callback. See $WindowCallbackSet.",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWmousebuttonfun.IN("cbfun", "the new callback or $NULL if no callback was set or an error occurred")
	)

	GLFWcursorposfun.func(
		"SetCursorPosCallback",
		"""
		Sets the cursor position callback. See $WindowCallbackSet.

		The position is relative to the upper-left corner of the client area of the window.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWcursorposfun.IN("cbfun", "the new callback or $NULL if no callback was set or an error occurred")
	)

	GLFWcursorenterfun.func(
		"SetCursorEnterCallback",
		"Sets the cursor enter/exit callback. See $WindowCallbackSet.",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWcursorenterfun.IN("cbfun", "the new callback or $NULL if no callback was set or an error occurred")
	)

	GLFWscrollfun.func(
		"SetScrollCallback",
		"""
		Sets the scroll callback. See $WindowCallbackSet.

		This receives all scrolling input, like that from a mouse wheel or a touchpad scrolling area.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWscrollfun.IN("cbfun", "the new callback or $NULL if no callback was set or an error occurred")
	)

	int.func(
		"JoystickPresent",
		"Returns whether the specified joystick is present.",

		int.IN("joy", "joystick to query")
	)

	(const _ float_p).func(
		"GetJoystickAxes",
		"""
		Returns the values of all axes of the specified joystick.

		Note: The returned array is valid only until the next call to glfwGetJoystickAxes for that joystick.
		""",

		int.IN("joy", "joystick to query"),
		autoSizeResult _ int_p.OUT("count", "where to store the size of the returned array. This is set to zero if an error occurred.")
	)

	(const _ unsigned_char_p).func(
		"GetJoystickButtons",
		"""
		Returns the state of all buttons of the specified joystick.

		Note: The returned array is valid only until the next call to glfwGetJoystickButtons for that joystick.
		""",

		int.IN("joy", "joystick to query"),
		autoSizeResult _ int_p.OUT("count", "where to store the size of the returned array. This is set to zero if an error occurred.")
	)

	(const _ charUTF8_p).func(
		"GetJoystickName",
		"Returns the name, encoded as UTF-8, of the specified joystick.",

		int.IN("joy", "joystick to query")
	)

	void.func(
		"SetClipboardString",
		"Sets the system clipboard to the specified, UTF-8 encoded string. The string is copied before returning, so you don't have to retain it afterwards.",

		GLFWwindow.IN("window", "window that will own the clipboard contents"),
		const _ charUTF8_p.IN("string", "UTF-8 encoded string")
	)

	(const _ charUTF8_p).func(
		"GetClipboardString",
		"Returns the contents of the system clipboard, if it contains or is convertible to a UTF-8 encoded string.",

		GLFWwindow.IN("window", "window that will request the clipboard contents")
	)

	double.func(
		"GetTime",
		"Returns the value of the GLFW timer. Unless the timer has been set using glfwSetTime, the timer measures time elapsed since GLFW was initialized."
	)

	void.func(
		"SetTime",
		"Sets the value of the GLFW timer. It then continues to count up from that value.",

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
		"REFRESH_RATE" _ 0x0002100F
	)

	IntConstant.block(
		"Client API hints.",

		"CLIENT_API" _ 0x00022001,
		"CONTEXT_VERSION_MAJOR" _ 0x00022002,
		"CONTEXT_VERSION_MINOR" _ 0x00022003,
		"CONTEXT_REVISION" _ 0x00021004,
		"CONTEXT_ROBUSTNESS" _ 0x00022005,
		"OPENGL_FORWARD_COMPAT" _ 0x00022006,
		"OPENGL_DEBUG_CONTEXT" _ 0x00022007,
		"OPENGL_PROFILE" _ 0x00022008
	)

	IntConstant.block(
		"Values for the ${"CLIENT_API".link} hint.",

		"OPENGL_API" _ 0x00030001,
		"OPENGL_ES_API" _ 0x00030002
	)

	IntConstant.block(
		"Values for the ${"CONTEXT_ROBUSTNESS".link} hint.",

		"NO_ROBUSTNESS" _ 0,
		"NO_RESET_NOTIFICATION" _ 0x00031001,
		"LOSE_CONTEXT_ON_RESET" _ 0x00031002
	)

	IntConstant.block(
		"Values for the ${"OPENGL_PROFILE".link} hint.",

		"OPENGL_ANY_PROFILE" _ 0,
		"OPENGL_CORE_PROFILE" _ 0x00032001,
		"OPENGL_COMPAT_PROFILE" _ 0x00032002
	)

	void.func(
		"MakeContextCurrent",
		"""
		Makes the context of the specified window current on the calling thread. A context can only be made current on a single thread at a time and each
		thread can have only a single current context at a time.
		""",

		GLFWwindow.IN("window", "the window whose context to make current, or $NULL to detach the current context")
	)

	GLFWwindow.func(
		"GetCurrentContext",
		"Returns the window whose context is current on the calling thread."
	)

	val SwapBuffers = void.func(
		"SwapBuffers",
		"""
		Swaps the front and back buffers of the specified window. If the swap interval is greater than zero, the GPU driver waits the specified number of
		screen updates before swapping the buffers.
		""",

		GLFWwindow.IN("window", "the window whose buffers to swap")
	).javaDocLink

	void.func(
		"SwapInterval",
		"""
		Sets the swap interval for the current context, i.e. the number of screen updates to wait before swapping the buffers of a window and returning from
		$SwapBuffers. This is sometimes called 'vertical synchronization', 'vertical retrace synchronization' or 'vsync'.

		Contexts that support either of the {@code WGL_EXT_swap_control_tear} and {@code GLX_EXT_swap_control_tear} extensions also accept negative swap
		intervals, which allow the driver to swap even if a frame arrives a little bit late. You can check for the presence of these extensions using
		${"ExtensionSupported()".link}. For more information about swap tearing, see the extension specifications.

		Some GPU drivers do not honor the requested swap interval, either because of user settings that override the request or due to bugs in the driver.

		Note: This function may be called from secondary threads.
		""",

		int.IN("interval", "the minimum number of screen updates to wait for until the buffers are swapped by $SwapBuffers")
	)

	int.func(
		"ExtensionSupported",
		"""
		Returns whether the specified OpenGL or context creation API extension is supported by the current context. For example, on Windows both the OpenGL and
		WGL extension strings are checked.

		Note: This function may be called from secondary threads.

		As this functions searches one or more extension strings on each call, it is recommended that you cache its results if it's going to be used frequently.
		The extension strings will not change during the lifetime of a context, so there is no danger in doing this.
		""",

		const _ charASCII_p.IN("extension", "the ASCII encoded name of the extension")
	)

	/*
	GLFWglproc.func(
		"GetProcAddress",
		"",

		const _ charASCII_p.IN("procname", "")
	)
	*/

}