/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.glfw.templates

import org.lwjgl.generator.*
import org.lwjgl.system.glfw.*

fun GLFW() = "GLFW".nativeClass(packageName = GLFW_PACKAGE, prefix = "GLFW") {
	javaImport (
		"org.lwjgl.opengl.GL11"
	)

	nativeImport (
		"glfw3.h"
	)

	javaDoc(
		"""
		Native bindings to the GLFW library.

		<b>Note</b>: All OpenGL related functionality has been stripped away.
		"""
	)

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

		"NOT_INITIALIZED" _ 0x00070001
	)

	IntConstant.block(
		"No context is current for this thread.",

		"NO_CURRENT_CONTEXT" _ 0x00070002
	)

	IntConstant.block(
		"One of the enum parameters for the function was given an invalid enum.",

		"INVALID_ENUM" _ 0x00070003
	)

	IntConstant.block(
		"One of the parameters for the function was given an invalid value.",

		"INVALID_VALUE" _ 0x00070004
	)

	IntConstant.block(
		"A memory allocation failed.",

		"OUT_OF_MEMORY" _ 0x00070005
	)

	IntConstant.block(
		"GLFW could not find support for the requested client API on the system.",

		"API_UNAVAILABLE" _ 0x00070006
	)

	IntConstant.block(
		"The requested client API version is not available.",

		"VERSION_UNAVAILABLE" _ 0x00070007
	)

	IntConstant.block(
		"A platform-specific error occurred that does not match any of the more specific categories.",

		"PLATFORM_ERROR" _ 0x00070008
	)

	IntConstant.block(
		"The clipboard did not contain data in the requested format.",

		"FORMAT_UNAVAILABLE" _ 0x00070009
	)

	IntConstant.block(
		"Window events.",

		"FOCUSED" _ 0x00020001,
		"ICONIFIED" _ 0x00020002,
		"RESIZABLE" _ 0x00022007,
		"VISIBLE" _ 0x00022008,
	    "DECORATED" _ 0x00022009
	)

	IntConstant.block(
		"Input options.",

		"CURSOR_MODE" _ 0x00030001,
		"STICKY_KEYS" _ 0x00030002,
		"STICKY_MOUSE_BUTTONS" _ 0x00030003
	)

	IntConstant.block(
		"Cursor state.",

		"CURSOR_NORMAL" _ 0x00040001,
		"CURSOR_HIDDEN" _ 0x00040002,
		"CURSOR_CAPTURED" _ 0x00040003
	)

	IntConstant.block(
		"Joystick state.",

		"PRESENT" _ 0x00050001,
		"AXES" _ 0x00050002,
		"BUTTONS" _ 0x00050003
	)

	IntConstant.block(
		"Gamma ramp size.",

		"GAMMA_RAMP_SIZE" _ 256
	)

	IntConstant.block(
		"Monitor events.",

		"CONNECTED" _ 0x00061000,
		"DISCONNECTED" _ 0x00061001
	)

	val Init = int.func(
		"Init",
		"""
		This function initializes the GLFW library. Before most GLFW functions can be used, GLFW must be initialized, and before a program terminates GLFW
		should be terminated in order to free any resources allocated during or after initialization.

		If this function fails, it calls {@link #glfwTerminate} before returning.  If it succeeds, you should call {@link #glfwTerminate} before the program
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
	).javaDocLink

	Code(
		javaBeforeNative = "\t\tWindowCallback.clearAll();"
	) _ void.func(
		"Terminate",
		"""
		This function destroys all remaining windows, frees any allocated resources and sets the library to an uninitialized state. Once this is called, you
		must again call $Init successfully before you will be able to use most GLFW functions.

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
		This function retrieves the major, minor and revision numbers of the GLFW library. It is intended for when you are using GLFW as a shared library and
		want to ensure that you are using the minimum required version.

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
		This function returns a static string generated at compile-time according to which configuration macros were defined. This is intended for use when
		submitting bug reports, to allow developers to see which code paths are enabled in a binary.

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

	void.func(
		"SetErrorCallback",
		"""
		This function sets the error callback, which is called with an error code and a human-readable description each time a GLFW error occurs.

		Notes:
		${ul(
			"This function may be called before $Init.",
			"""
			The error callback is called by the thread where the error was generated. If you are using GLFW from multiple threads, your error callback needs to
			be written accordingly.
			""",
			"""
			Because the description string provided to the callback may have been generated specifically for that error, it is not guaranteed to be valid after
			the callback has returned.  If you wish to use it after that, you need to make your own copy of it before returning.
			"""
		)}
		""",

		mods(
			Callback("ErrorCallback"),
			Expression("ErrorCallback.register(cbfun)", keepParam = true),
			nullable
		) _ GLFWerrorfun.IN("cbfun", "the new callback or NULL to remove the currently set callback")
	)

	GLFWmonitor_p.func(
		"GetMonitors",
		"""
		This function returns an array of handles for all currently connected monitors. The returned array is valid only until the monitor configuration
		changes.

        See {@link #glfwSetMonitorCallback} to receive notifications of configuration changes.
		""",

		autoSizeResult _ int_p.OUT("count", "the size of the returned array")
	)

	GLFWmonitor.func(
		"GetPrimaryMonitor",
		"""
		This function returns the primary monitor.  This is usually the monitor
        where elements like the Windows task bar or the OS X menu bar is located.
		"""
	)

	void.func(
		"GetMonitorPos",
		"""
		This function returns the position, in screen coordinates, of the upper-left
        corner of the specified monitor.
		""",

		GLFWmonitor.IN("monitor", "monitor to query"),
		Check(1) _ int_p.OUT("xpos", "The monitor x-coordinate"),
		Check(1) _ int_p.OUT("ypos", "The monitor y-coordinate")
	)

	void.func(
		"GetMonitorPhysicalSize",
		"""
		This function returns the size, in millimetres, of the display area of the specified monitor.

        Note: Some operating systems do not provide accurate information, either
        because the monitor's EDID data is incorrect, or because the driver does not
        report it accurately.
		""",

		GLFWmonitor.IN("monitor", "monitor to query"),
		Check(1) _ int_p.OUT("width", "width, in mm, of the monitor's display"),
		Check(1) _ int_p.OUT("height", "height, in mm, of the monitor's display")
	)

	(const _ charUTF8_p).func(
		"GetMonitorName",
		"""
		This function returns a human-readable name, encoded as UTF-8, of the
        specified monitor.
		""",

		GLFWmonitor.IN("monitor", "monitor to query")
	)

	void.func(
		"SetMonitorCallback",
		"Sets the monitor configuration callback.",

		mods(
			Callback("MonitorCallback"),
			Expression("MonitorCallback.register(cbfun)", keepParam = true),
			nullable
		) _ GLFWmonitorfun.IN("cbfun", "the new callback, or NULL to remove the currently set callback")
	)

	(const _ GLFWvidmode).func(
		"GetVideoModes",
		"""
		This function returns an array of all video modes supported by the specified
        monitor.
		""",

		GLFWmonitor.IN("monitor", "monitor to query"),
		mods(Check(1), autoSizeResult) _ int_p.OUT("count", "number of video modes in the returned array")
	)

	GLFWvidmode.func(
		"GetVideoMode",
		"This function returns the current video mode of the specified monitor.",

		GLFWmonitor.IN("monitor", "monitor to query")
	)

	void.func(
		"SetGamma",
		"""
		This function generates a gamma ramp from the specified exponent and then
        calls {@link #glfwSetGammaRamp} with it.
        """,

		GLFWmonitor.IN("monitor", "monitor whose gamma ramp to set"),
		float.IN("gamma", "desired exponent")
	)

	void.func(
		"GetGammaRamp",
		"This function retrieves the current gamma ramp of the specified monitor.",

		GLFWmonitor.IN("monitor", "monitor to query"),
		GLFWgammaramp_p.IN("ramp", "Where to store the gamma ramp")
	)

	void.func(
		"SetGammaRamp",
		"This function sets the current gamma ramp for the specified monitor.",

		GLFWmonitor.IN("monitor", "monitor whose gamma ramp to set"),
		const _ GLFWgammaramp_p.IN("ramp", "gamma ramp to use")
	)

	void.func(
		"DefaultWindowHints",
		"""
		This function resets all window hints to their default values.
		
		Note: This function may only be called from the main thread.
		"""
	)

	void.func(
		"WindowHint",
		"""
		This function sets hints for the next call to {@link #glfwCreateWindow}. The
        hints, once set, retain their values until changed by a call to
        glfwWindowHint or {@link #glfwDefaultWindowHints}, or until the library is
        terminated with {@link #glfwTerminate}.
        
        Some window hints are hard constraints. These must match the available
        capabilities <em>exactly</em> for window creation to succeed. Hints
        that are not hard constraints are matched as closely as possible, but the
        resulting window may differ from what these hints requested. To
        find out the actual parameters of the created window, use the
        {@link #glfwGetWindowParam} function.
        
        Hints that do not apply to a given type of window are ignored.

        Window hints:
        
        The {@link #GLFW_RESIZABLE} hint specifies whether the window will be resizable by
        the user. The window will still be resizable using the
        {@link #glfwSetWindowSize} function.  This hint is ignored for fullscreen windows.
        
        The {@link #GLFW_VISIBLE} hint specifies whether the window will be initially
        visible. This hint is ignored for fullscreen windows.
        
        Note: This function may only be called from the main thread.
		""",

		int.IN("target", "The window hint to set"),
		int.IN("hint", "new value of the window hint")
	)

	GLFWwindow.func(
		"CreateWindow",
		"""
		This function creates a window. Most of the options controlling how the window should be created are specified through {@link #glfwWindowHint}.

        Note that the actual properties of the window may differ from what you requested, as not all parameters and hints are hard constraints.

        To create the window at a specific position, make it initially invisible using the {@link #GLFW_VISIBLE} window hint, set its position and then show it.

        If a fullscreen window is active, the screensaver is prohibited from starting.

        This function may only be called from the main thread.
		""",

		int.IN("width", "desired width, in pixels, of the window"),
		int.IN("height", "desired height, in pixels, of the window"),
		const _ charUTF8_p.IN("title", "initial, UTF-8 encoded window title"),
		nullable _ GLFWmonitor.IN("monitor", "monitor to use for fullscreen mode, or null to use windowed mode"),
		nullable _ GLFWwindow.IN("share", " window whose context to share resources with, or null to not share resources")
	)

	val DestroyWindow = (Code(
		javaBeforeNative = "\t\tWindowCallback.set(window, null);"
	) _ (void.func(
		"DestroyWindow",
		"""
		This function destroys the specified window. On calling this function, no further callbacks will be called for that window.

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
		"This function returns the value of the close flag of the specified window.",

		GLFWwindow.IN("window", "window to query")
	)

	void.func(
		"SetWindowShouldClose",
		"""
		This function sets the value of the close flag of the specified window.
        This can be used to override the user's attempt to close the window, or
        to signal that it should be closed.
		""",

		GLFWwindow.IN("window", "window whose flag to change"),
		int.IN("value", "new value")
	)

	void.func(
		"SetWindowTitle",
		"""
		This function sets the window title, encoded as UTF-8, of the specified
        window.
		""",

		GLFWwindow.IN("window", "window whose title to change"),
		const _ charUTF8_p.IN("title", "UTF-8 encoded window title")
	)

	void.func(
		"GetWindowPos",
		"""
		This function retrieves the position, in screen coordinates, of the
        upper-left corner of the client area of the specified window.
		""",

		GLFWwindow.IN("window", "window to query"),
		Check(1) _ int_p.OUT("xpos", "x-coordinate of the upper-left corner of the client area"),
		Check(1) _ int_p.OUT("ypos", "y-coordinate of the upper-left corner of the client area")
	)

	void.func(
		"SetWindowPos",
		"""
		This function sets the position, in screen coordinates, of the upper-left
        corner of the client area of the window.

        If you wish to set an initial window position you should create a hidden window (using {@link #glfwWindowHint} and {@link #GLFW_VISIBLE}, set its
        position and then show it.

        Notes:
        ${ul(
			"It is very rarely a good idea to move an already visible window, as it will confuse and annoy the user.",
		    "This function may only be called from the main thread.",
		    "The window manager may put limits on what positions are allowed.",
		    """
		    <strong>X11</strong>: Some window managers ignore the set position of hidden (i.e. unmapped) windows, instead placing them where it thinks is
		    appropriate once they are shown.
			""",
			"<strong>Mac OS X</strong>: The screen coordinate system is inverted."
		)}
		""",

		GLFWwindow.IN("window", "window to query"),
		int.IN("xpos", "x-coordinate of the upper-left corner of the client area"),
		int.IN("ypos", "y-coordinate of the upper-left corner of the client area")
	)

	void.func(
		"GetWindowSize",
		"""
		This function retrieves the size, in pixels, of the client area of the
        specified window.
		""",

		GLFWwindow.IN("window", "window whose size to retrieve"),
		Check(1) _ int_p.OUT("width", "width of the client area"),
		Check(1) _ int_p.OUT("height", "height of the client area")
	)

	void.func(
		"SetWindowSize",
		"""
		This function sets the size, in pixels, of the client area of the specified
        window.

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
		"IconifyWindow",
		"""
		This function iconifies/minimizes the specified window, if it was previously
        restored.  If it is a fullscreen window, the original monitor resolution is
        restored until the window is restored.  If the window is already iconified,
        this function does nothing.

        Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "window to iconify")
	)

	void.func(
		"RestoreWindow",
		"""
		This function restores the specified window, if it was previously
        iconified/minimized.  If the window is already restored, this function does
        nothing.

        Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "window to restore")
	)

	void.func(
		"ShowWindow",
		"""
        This function makes the specified window visible, if it was previously
        hidden.  If the window is already visible or is in fullscreen mode, this
        function does nothing.

        Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "window to make visible")
	)

	void.func(
		"HideWindow",
		"""
        This function hides the specified window, if it was previously visible.  If
        the window is already hidden or is in fullscreen mode, this function does
        nothing.

        Note: This function may only be called from the main thread.
		""",

		GLFWwindow.IN("window", "window to hide")
	)

	GLFWmonitor.func(
		"GetWindowMonitor",
		"""
		This function returns the handle of the monitor that the specified window is
        in fullscreen on.
		""",

		GLFWwindow.IN("window", "window to query")
	)

	int.func(
		"GetWindowParam",
		"""
		This function returns a property of the specified window.
        ${ul(
	        "The {@link #GLFW_FOCUSED} parameter indicates whether the window is focused.",
            "The {@link #GLFW_ICONIFIED} parameter indicates whether the window is iconified.",
	        "The {@link #GLFW_VISIBLE} parameter indicates whether the window is visible.",
	        "The {@link #GLFW_RESIZABLE} parameter indicates whether the window is resizable by the user."
		)}
		""",

		GLFWwindow.IN("window", "window to query"),
		int.IN("param", " parameter whose value to return")
	)

	void.func(
		"SetWindowUserPointer",
		"""
		This function sets the user-defined pointer of the specified window.  The
        current value is retained until the window is destroyed.  The initial value
        is null.
		""",

		GLFWwindow.IN("window", "window whose pointer to set"),
		nullable _ voidptr.IN("pointer", "new value")
	)

	voidptr.func(
		"GetWindowUserPointer",
		"""
		This function returns the current value of the user-defined pointer of the
        specified window.  The initial value is null.
		""",

		GLFWwindow.IN("window", "window whose pointer to return")
	)

	void.func(
		"SetWindowPosCallback",
		"Sets the position callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWwindowposfun.IN("cbfun", "the new callback or NULL to remove the currently set callback")
	)

	void.func(
		"SetWindowSizeCallback",
		"Sets the size callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWwindowsizefun.IN("cbfun", "the new callback or NULL to remove the currently set callback")
	)

	void.func(
		"SetWindowCloseCallback",
		"""
		Sets the close callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.

		This callback is called when the user attempts to close the window, i.e. for example by clicking the window's close widget.  It is called immediately
		after the window's close flag has been set.

        Calling $DestroyWindow does not cause this callback to be called.

        <b>Mac OS X:</b> Selecting Quit from the application menu will trigger the close callback for all windows.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWwindowclosefun.IN("cbfun", "the new callback or NULL to remove the currently set callback")
	)

	void.func(
		"SetWindowRefreshCallback",
		"""
		Sets the refresh callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.

		This callback is called when the client area of the window needs to be redrawn, for example if the window has been exposed after having been covered by
		another window.

		On compositing window systems such as Aero, Compiz or Aqua, where the window contents are saved off-screen, this callback may be called only very
		infrequently or never at all.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWwindowrefreshfun.IN("cbfun", "the new callback or NULL to remove the currently set callback")
	)

	void.func(
		"SetWindowFocusCallback",
		"""
		Sets the focus callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.

		This callback is called when the window gains or loses focus.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWwindowfocusfun.IN("cbfun", "the new callback or NULL to remove the currently set callback")
	)

	void.func(
		"SetWindowIconifyCallback",
		"""
		Sets the iconify callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.

		This callback is called when the window is iconified or restored.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWwindowiconifyfun.IN("cbfun", "the new callback or NULL to remove the currently set callback")
	)

	void.func(
		"PollEvents",
		"""
		This function processes only those events that have already been recevied
        and then returns immediately.
		"""
	)

	void.func(
		"WaitEvents",
		"""
		This function blocks until at least one event has been recevied and then
        processes all received events before returning.
		"""
	)

	int.func(
		"GetInputMode",
		"Returns the value of an input option for the specified window",

		GLFWwindow.IN("window", "window to query"),
		int.IN("mode", "One of {@link #GLFW_CURSOR_MODE}, {@link #GLFW_STICKY_KEYS} or {@link #GLFW_STICKY_MOUSE_BUTTONS}")
	)

	void.func(
		"SetInputMode",
		"""
		Sets an input option for the specified window
		
		If mode is {@link #GLFW_CURSOR_MODE}, the value must be one of the supported input
        modes:
        ${ul(
			"{@link #GLFW_CURSOR_NORMAL} makes the cursor visible and behaving normally.",
			"{@link #GLFW_CURSOR_HIDDEN} makes the cursor invisible when it is over the client area of the window.",
			"{@link #GLFW_CURSOR_CAPTURED} makes the cursor invisible and unable to leave the window but unconstrained in terms of position."
		)}

        If mode is {@link #GLFW_STICKY_KEYS}, the value must be either {@link GL11#GL_TRUE} to
        enable sticky keys, or {@link GL11#GL_FALSE} to disable it.  If sticky keys are
        enabled, a key press will ensure that {@link #glfwGetKey} returns
        {@link #GLFW_PRESS} the next time it is called even if the key had been released
        before the call.
         
        If mode is {@link #GLFW_STICKY_MOUSE_BUTTONS}, the value must be either {@link GL11#GL_TRUE}
        to enable sticky mouse buttons, or {@link GL11#GL_FALSE} to disable it.  If sticky
        mouse buttons are enabled, a mouse button press will ensure that
        {@link #glfwGetMouseButton} returns {@link #GLFW_PRESS} the next time it is called even
        if the mouse button had been released before the call.
		""",

		GLFWwindow.IN("window", "window whose input mode to set"),
		int.IN("mode", "One of {@link #GLFW_CURSOR_MODE}, {@link #GLFW_STICKY_KEYS} or {@link #GLFW_STICKY_MOUSE_BUTTONS}"),
		int.IN("value", "new value of the specified input mode")
	)

	int.func(
		"GetKey",
		"""
		This function returns the last state reported for the specified key to the
        specified window. The returned state is one of {@link #GLFW_PRESS} or
        {@link #GLFW_RELEASE}. The higher-level state {@link #GLFW_REPEAT} is only reported to
        the key callback.
        
        If the {@link #GLFW_STICKY_KEYS} input mode is enabled, this function returns
        {@link #GLFW_PRESS} the first time you call this function after a key has been
        pressed, even if the key has already been released.
        
        The key functions deal with physical keys, with tokens named after their use on the standard US keyboard layout. If you want to input text, use the
        Unicode character callback instead.
		""",

		GLFWwindow.IN("window", "desired window"),
		int.IN("key", "desired keyboard key")
	)

	int.func(
		"GetMouseButton",
		"""
        This function returns the last state reported for the specified mouse button
        to the specified window.
        
        If the {@link #GLFW_STICKY_MOUSE_BUTTONS} input mode is enabled, this function
        returns {@link #GLFW_PRESS} the first time you call this function after a mouse
        button has been pressed, even if the mouse button has already been released.		
		""",

		GLFWwindow.IN("window", "desired window"),
		int.IN("button", "desired mouse button")
	)

	void.func(
		"GetCursorPos",
		"""
		This function returns the last reported position of the cursor to the
        specified window.
        """,

		GLFWwindow.IN("window", "desired window"),
		Check(1) _ double_p.OUT("xpos", "cursor x-coordinate, relative to the left edge of the client area or null"),
		Check(1) _ double_p.OUT("ypos", "cursor y-coordinate, relative to the to top edge of the client area, or null.")
	)

	void.func(
		"SetCursorPos",
		"""
		This function sets the position of the cursor. The specified window must be
        focused. If the window does not have focus when this function is called, it
        fails silently.
		""",

		GLFWwindow.IN("window", "desired window"),
		double.IN("xpos", "desired x-coordinate, relative to the left edge of the client area, or null"),
		double.IN("ypos", "desired y-coordinate, relative to the top edge of the client area, or null")
	)

	void.func(
		"SetKeyCallback",
		"""
		Sets the key callback. See {@link WindowCallback#set(long, WindowCallback, int)}.

		The key callback deals with physical keys, with key tokens named after their use on the standard US keyboard layout. If you want to input text, use the
		Unicode character callback instead.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWkeyfun.IN("cbfun", "the new callback or NULL to remove the currently set callback")
	)

	void.func(
		"SetCharCallback",
		"""
		Sets the Unicode character callback. See {@link WindowCallback#set(long, WindowCallback, int)}.

		The Unicode character callback is for text input. If you want to know whether a specific key was pressed or released, use the key callback.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWcharfun.IN("cbfun", "the new callback or NULL to remove the currently set callback")
	)

	void.func(
		"SetMouseButtonCallback",
		"Sets the mouse button callback. See {@link WindowCallback#set(long, WindowCallback, int)}.",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWmousebuttonfun.IN("cbfun", "the new callback or NULL to remove the currently set callback")
	)

	void.func(
		"SetCursorPosCallback",
		"""
		Sets the cursor position callback. See {@link WindowCallback#set(long, WindowCallback, int)}.

		The position is relative to the upper-left corner of the client area of the window.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWcursorposfun.IN("cbfun", "the new callback or NULL to remove the currently set callback")
	)

	void.func(
		"SetCursorEnterCallback",
		"Sets the cursor enter/exit callback. See {@link WindowCallback#set(long, WindowCallback, int)}.",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWcursorenterfun.IN("cbfun", "the new callback or NULL to remove the currently set callback")
	)

	void.func(
		"SetScrollCallback",
		"""
		Sets the scroll callback. See {@link WindowCallback#set(long, WindowCallback, int)}.

		This receives all scrolling input, like that from a mouse wheel or a touchpad scrolling area.
		""",

		GLFWwindow.IN("window", "the window whose callback to set"),
		nullable _ GLFWscrollfun.IN("cbfun", "the new callback or NULL to remove the currently set callback")
	)

	int.func(
		"GetJoystickParam",
		"This function returns a parameter of the specified joystick.",

		int.IN("joy", "joystick to query"),
		int.IN("param", "parameter whose value to return")
	)

	int.func(
		"GetJoystickAxes",
		"""
		This function returns the current positions of axes of the specified
        joystick.
        """,

		int.IN("joy", "joystick to query"),
		float_p.OUT("axes", "array to hold the values"),
		AutoSize("axes") _ int.IN("numaxes", "size of the provided array")
	)

	int.func(
		"GetJoystickButtons",
		"""
		This function returns the current state of buttons of the specified
        joystick.
		""",

		int.IN("joy", "joystick to query"),
		unsigned_char_p.IN("buttons", "array to hold the values"),
		AutoSize("buttons") _ int.IN("numbuttons", "size of the provided array")
	)

	(const _ charUTF8_p).func(
		"GetJoystickName",
		"""
		This function returns the name, encoded as UTF-8, of the specified joystick.
		""",

		int.IN("joy", "joystick to query")
	)

	void.func(
		"SetClipboardString",
		"""
		This function sets the system clipboard to the specified, UTF-8 encoded
        string.  The string is copied before returning, so you don't have to retain
        it afterwards.
		""",

		GLFWwindow.IN("window", "window that will own the clipboard contents"),
		const _ charUTF8_p.IN("string", "UTF-8 encoded string")
	)

	(const _ charUTF8_p).func(
		"GetClipboardString",
		"""
		This function returns the contents of the system clipboard, if it contains
        or is convertible to a UTF-8 encoded string.
		""",

		GLFWwindow.IN("window", "window that will request the clipboard contents")
	)

	double.func(
		"GetTime",
		"""
		This function returns the value of the GLFW timer. Unless the timer has
        been set using glfwSetTime, the timer measures time elapsed since GLFW
        was initialized.
		"""
	)

	void.func(
		"SetTime",
		"""
		This function sets the value of the GLFW timer.  It then continues to count
        up from that value.
        """,

		double.IN("time", "new value, in seconds")
	)

	// [ OpenGL ]

	IntConstant.block(
		"PixelFormat hints.",

		"RED_BITS" _ 0x00021000,
		"GREEN_BITS" _ 0x00021001,
		"BLUE_BITS" _ 0x00021002,
		"ALPHA_BITS" _ 0x00021003,
		"DEPTH_BITS" _ 0x00021004,
		"STENCIL_BITS" _ 0x00021005,
		"ACCUM_RED_BITS" _ 0x00021006,
		"ACCUM_GREEN_BITS" _ 0x00021007,
		"ACCUM_BLUE_BITS" _ 0x00021008,
		"ACCUM_ALPHA_BITS" _ 0x00021009,
		"AUX_BUFFERS" _ 0x0002100A,
		"STEREO" _ 0x0002100B,
		"SAMPLES" _ 0x0002100C,
		"SRGB_CAPABLE" _ 0x0002100D
	)

	IntConstant.block(
		"Client API hints.",

		"CLIENT_API" _ 0x00022000,
		"CONTEXT_VERSION_MAJOR" _ 0x00022001,
		"CONTEXT_VERSION_MINOR" _ 0x00022002,
		"CONTEXT_REVISION" _ 0x00020004,
		"CONTEXT_ROBUSTNESS" _ 0x00022003,
		"OPENGL_FORWARD_COMPAT" _ 0x00022004,
		"OPENGL_DEBUG_CONTEXT" _ 0x00022005,
		"OPENGL_PROFILE" _ 0x00022006
	)

	IntConstant.block(
		"Client API types.",

		"OPENGL_API" _ 0x00000001,
		"OPENGL_ES_API" _ 0x00000002
	)

	IntConstant.block(
		"// Robustness values.",

		"NO_ROBUSTNESS" _ 0x00000000,
		"NO_RESET_NOTIFICATION" _ 0x00000001,
		"LOSE_CONTEXT_ON_RESET" _ 0x00000002
	)

	IntConstant.block(
		"OpenGL profiles.",

		"OPENGL_NO_PROFILE" _ 0x00000000,
		"OPENGL_CORE_PROFILE" _ 0x00000001,
		"OPENGL_COMPAT_PROFILE" _ 0x00000002
	)

	/*
	void.func(
		"MakeContextCurrent",
		"",

		GLFWwindow.IN("window", "")
	)

	GLFWwindow.func(
		"GetCurrentContext",
		""
	)

	void.func(
		"SwapBuffers",
		"",

		GLFWwindow.IN("window", "")
	)

	void.func(
		"SwapInterval",
		"",

		int.IN("interval", "")
	)

	int.func(
		"ExtensionSupported",
		"",

		const _ charASCII_p.IN("extension", "")
	)

	GLFWglproc.func(
		"GetProcAddress",
		"",

		const _ charASCII_p.IN("procname", "")
	)
	*/

}