/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.glfw.templates

import org.lwjgl.generator.*
import org.lwjgl.system.glfw.*

fun GLFW() = "GLFW".nativeClass(packageName = GLFW_PACKAGE, prefix = "GLFW") {
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
		"KEY_MENU" _ 348
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
		"MOUSE_BUTTON_LEFT".expr<Int>("GLFW_MOUSE_BUTTON_1"),
		"MOUSE_BUTTON_RIGHT".expr<Int>("GLFW_MOUSE_BUTTON_2"),
		"MOUSE_BUTTON_MIDDLE".expr<Int>("GLFW_MOUSE_BUTTON_3")
	)

	IntConstant.block(
		"""
		MOUSE_BUTTON_LAST MOUSE_BUTTON_8 MOUSE_BUTTON_LEFT MOUSE_BUTTON_1 MOUSE_BUTTON_RIGHT MOUSE_BUTTON_2
		MOUSE_BUTTON_MIDDLE MOUSE_BUTTON_3 Joysticks.
		""",

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
		"JOYSTICK_16" _ 15
	)

	IntConstant.block(
		"JOYSTICK_LAST          JOYSTICK_16 No error has occurred.",

		"NO_ERROR" _ 0
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
		"VISIBLE" _ 0x00022008
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
		""
	).javaDocLink

	Code(
		javaBeforeNative = "\t\tWindowCallback.clearAll();"
	) _ void.func(
		"Terminate",
		""
	)

	void.func(
		"GetVersion",
		"",

		Check(1) _ int_p.OUT("major", ""),
		Check(1) _ int_p.OUT("minor", ""),
		Check(1) _ int_p.OUT("rev", "")
	)

	(const _ charUTF8_p).func(
		"GetVersionString",
		""
	)

	void.func(
		"SetErrorCallback",
		"""
		Sets the error callback.

		This function may be called before $Init.

		The error callback is called by the thread where the error was generated.  If you are using GLFW from multiple threads, your error callback needs to be
		written accordingly.

		Because the description string provided to the callback may have been
		generated specifically for that error, it is not guaranteed to be valid
		after the callback has returned.  If you wish to use it after that, you need
		to make your own copy of it before returning.
		""",

		mods(
			Callback("ErrorCallback"),
			Expression("ErrorCallback.register(cbfun)", keepParam = true),
			nullable
		) _ GLFWerrorfun.IN("cbfun", "the new callback or NULL to remove the currently set callback")
	)

	GLFWmonitor_p.func(
		"GetMonitors",
		"",

		autoSizeResult _ int_p.OUT("count", "")
	)

	GLFWmonitor.func(
		"GetPrimaryMonitor",
		""
	)

	void.func(
		"GetMonitorPos",
		"",

		GLFWmonitor.IN("monitor", ""),
		Check(1) _ int_p.OUT("xpos", ""),
		Check(1) _ int_p.OUT("ypos", "")
	)

	void.func(
		"GetMonitorPhysicalSize",
		"",

		GLFWmonitor.IN("monitor", ""),
		Check(1) _ int_p.OUT("width", ""),
		Check(1) _ int_p.OUT("height", "")
	)

	(const _ charUTF8_p).func(
		"GetMonitorName",
		"",

		GLFWmonitor.IN("monitor", "")
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

	(const _ GLFWvidmode_p).func(
		"GetVideoModes",
		"",

		GLFWmonitor.IN("monitor", ""),
		autoSizeResult _ int_p.OUT("count", "")
	)

	GLFWvidmode.func(
		"GetVideoMode",
		"",

		GLFWmonitor.IN("monitor", "")
	)

	void.func(
		"SetGamma",
		"",

		GLFWmonitor.IN("monitor", ""),
		float.IN("gamma", "")
	)

	void.func(
		"GetGammaRamp",
		"",

		GLFWmonitor.IN("monitor", ""),
		GLFWgammaramp.IN("ramp", "")
	)

	void.func(
		"SetGammaRamp",
		"",

		GLFWmonitor.IN("monitor", ""),
		const _ GLFWgammaramp.IN("ramp", "")
	)

	void.func(
		"DefaultWindowHints",
		""
	)

	void.func(
		"WindowHint",
		"",

		int.IN("target", ""),
		int.IN("hint", "")
	)

	GLFWwindow.func(
		"CreateWindow",
		"",

		int.IN("width", ""),
		int.IN("height", ""),
		const _ charUTF8_p.IN("title", ""),
		nullable _ GLFWmonitor.IN("monitor", ""),
		nullable _ GLFWwindow.IN("share", "")
	)

	val DestroyWindow = (Code(
		javaBeforeNative = "\t\tWindowCallback.set(window, null);"
	) _ (void.func(
		"DestroyWindow",
		"",

		GLFWwindow.IN("window", "")
	))).javaDocLink

	int.func(
		"WindowShouldClose",
		"",

		GLFWwindow.IN("window", "")
	)

	void.func(
		"SetWindowShouldClose",
		"",

		GLFWwindow.IN("window", ""),
		int.IN("value", "")
	)

	void.func(
		"SetWindowTitle",
		"",

		GLFWwindow.IN("window", ""),
		const _ charUTF8_p.IN("title", "")
	)

	void.func(
		"GetWindowPos",
		"",

		GLFWwindow.IN("window", ""),
		Check(1) _ int_p.OUT("xpos", ""),
		Check(1) _ int_p.OUT("ypos", "")
	)

	void.func(
		"SetWindowPos",
		"",

		GLFWwindow.IN("window", ""),
		int.IN("xpos", ""),
		int.IN("ypos", "")
	)

	void.func(
		"GetWindowSize",
		"",

		GLFWwindow.IN("window", ""),
		Check(1) _ int_p.OUT("width", ""),
		Check(1) _ int_p.OUT("height", "")
	)

	void.func(
		"SetWindowSize",
		"",

		GLFWwindow.IN("window", ""),
		int.IN("width", ""),
		int.IN("height", "")
	)

	void.func(
		"IconifyWindow",
		"",

		GLFWwindow.IN("window", "")
	)

	void.func(
		"RestoreWindow",
		"",

		GLFWwindow.IN("window", "")
	)

	void.func(
		"ShowWindow",
		"",

		GLFWwindow.IN("window", "")
	)

	void.func(
		"HideWindow",
		"",

		GLFWwindow.IN("window", "")
	)

	GLFWmonitor.func(
		"GetWindowMonitor",
		"",

		GLFWwindow.IN("window", "")
	)

	int.func(
		"GetWindowParam",
		"",

		GLFWwindow.IN("window", ""),
		int.IN("param", "")
	)

	void.func(
		"SetWindowUserPointer",
		"",

		GLFWwindow.IN("window", ""),
		nullable _ voidptr.IN("pointer", "")
	)

	voidptr.func(
		"GetWindowUserPointer",
		"",

		GLFWwindow.IN("window", "")
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
		""
	)

	void.func(
		"WaitEvents",
		""
	)

	int.func(
		"GetInputMode",
		"",

		GLFWwindow.IN("window", ""),
		int.IN("mode", "")
	)

	void.func(
		"SetInputMode",
		"",

		GLFWwindow.IN("window", ""),
		int.IN("mode", ""),
		int.IN("value", "")
	)

	int.func(
		"GetKey",
		"",

		GLFWwindow.IN("window", ""),
		int.IN("key", "")
	)

	int.func(
		"GetMouseButton",
		"",

		GLFWwindow.IN("window", ""),
		int.IN("button", "")
	)

	void.func(
		"GetCursorPos",
		"",

		GLFWwindow.IN("window", ""),
		Check(1) _ int_p.OUT("xpos", ""),
		Check(1) _ int_p.OUT("ypos", "")
	)

	void.func(
		"SetCursorPos",
		"",

		GLFWwindow.IN("window", ""),
		int.IN("xpos", ""),
		int.IN("ypos", "")
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
		"",

		int.IN("joy", ""),
		int.IN("param", "")
	)

	int.func(
		"GetJoystickAxes",
		"",

		int.IN("joy", ""),
		Check(1) _ float_p.OUT("axes", ""),
		int.IN("numaxes", "")
	)

	int.func(
		"GetJoystickButtons",
		"",

		int.IN("joy", ""),
		charUTF8_p.IN("buttons", ""),
		int.IN("numbuttons", "")
	)

	(const _ charUTF8_p).func(
		"GetJoystickName",
		"",

		int.IN("joy", "")
	)

	void.func(
		"SetClipboardString",
		"",

		GLFWwindow.IN("window", ""),
		const _ charUTF8_p.IN("string", "")
	)

	(const _ charUTF8_p).func(
		"GetClipboardString",
		"",

		GLFWwindow.IN("window", "")
	)

	double.func(
		"GetTime",
		""
	)

	void.func(
		"SetTime",
		"",

		double.IN("time", "")
	)

	// [ OpenGL ]

	/*
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