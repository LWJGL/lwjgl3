/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.glfw.GLFWgammaramp;
import org.lwjgl.system.glfw.WindowCallback;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.jglfw.WindowUtil.*;

/** A Java implementation of GLFW. */
public final class JGLFW {

	/** This is incremented when the API is changed in non-compatible ways. */
	public static final int
		GLFW_VERSION_MAJOR = 0x3;

	/** This is incremented when features are added to the API but it remains backward-compatible. */
	public static final int
		GLFW_VERSION_MINOR = 0x0;

	/** This is incremented when a bug fix release is made that does not contain any API changes. */
	public static final int
		GLFW_VERSION_REVISION = 0x0;

	/** The key or button was released. */
	public static final int
		GLFW_RELEASE = 0x0;

	/** The key or button was pressed. */
	public static final int
		GLFW_PRESS = 0x1;

	/** The key was held down until it repeated. */
	public static final int
		GLFW_REPEAT = 0x2;

	/** Printable keys. */
	public static final int
		GLFW_KEY_SPACE         = 0x20,
		GLFW_KEY_APOSTROPHE    = 0x27,
		GLFW_KEY_COMMA         = 0x2C,
		GLFW_KEY_MINUS         = 0x2D,
		GLFW_KEY_PERIOD        = 0x2E,
		GLFW_KEY_SLASH         = 0x2F,
		GLFW_KEY_0             = 0x30,
		GLFW_KEY_1             = 0x31,
		GLFW_KEY_2             = 0x32,
		GLFW_KEY_3             = 0x33,
		GLFW_KEY_4             = 0x34,
		GLFW_KEY_5             = 0x35,
		GLFW_KEY_6             = 0x36,
		GLFW_KEY_7             = 0x37,
		GLFW_KEY_8             = 0x38,
		GLFW_KEY_9             = 0x39,
		GLFW_KEY_SEMICOLON     = 0x3B,
		GLFW_KEY_EQUAL         = 0x3D,
		GLFW_KEY_A             = 0x41,
		GLFW_KEY_B             = 0x42,
		GLFW_KEY_C             = 0x43,
		GLFW_KEY_D             = 0x44,
		GLFW_KEY_E             = 0x45,
		GLFW_KEY_F             = 0x46,
		GLFW_KEY_G             = 0x47,
		GLFW_KEY_H             = 0x48,
		GLFW_KEY_I             = 0x49,
		GLFW_KEY_J             = 0x4A,
		GLFW_KEY_K             = 0x4B,
		GLFW_KEY_L             = 0x4C,
		GLFW_KEY_M             = 0x4D,
		GLFW_KEY_N             = 0x4E,
		GLFW_KEY_O             = 0x4F,
		GLFW_KEY_P             = 0x50,
		GLFW_KEY_Q             = 0x51,
		GLFW_KEY_R             = 0x52,
		GLFW_KEY_S             = 0x53,
		GLFW_KEY_T             = 0x54,
		GLFW_KEY_U             = 0x55,
		GLFW_KEY_V             = 0x56,
		GLFW_KEY_W             = 0x57,
		GLFW_KEY_X             = 0x58,
		GLFW_KEY_Y             = 0x59,
		GLFW_KEY_Z             = 0x5A,
		GLFW_KEY_LEFT_BRACKET  = 0x5B,
		GLFW_KEY_BACKSLASH     = 0x5C,
		GLFW_KEY_RIGHT_BRACKET = 0x5D,
		GLFW_KEY_GRAVE_ACCENT  = 0x60,
		GLFW_KEY_WORLD_1       = 0xA1,
		GLFW_KEY_WORLD_2       = 0xA2;

	/** Function keys. */
	public static final int
		GLFW_KEY_ESCAPE        = 0x100,
		GLFW_KEY_ENTER         = 0x101,
		GLFW_KEY_TAB           = 0x102,
		GLFW_KEY_BACKSPACE     = 0x103,
		GLFW_KEY_INSERT        = 0x104,
		GLFW_KEY_DELETE        = 0x105,
		GLFW_KEY_RIGHT         = 0x106,
		GLFW_KEY_LEFT          = 0x107,
		GLFW_KEY_DOWN          = 0x108,
		GLFW_KEY_UP            = 0x109,
		GLFW_KEY_PAGE_UP       = 0x10A,
		GLFW_KEY_PAGE_DOWN     = 0x10B,
		GLFW_KEY_HOME          = 0x10C,
		GLFW_KEY_END           = 0x10D,
		GLFW_KEY_CAPS_LOCK     = 0x118,
		GLFW_KEY_SCROLL_LOCK   = 0x119,
		GLFW_KEY_NUM_LOCK      = 0x11A,
		GLFW_KEY_PRINT_SCREEN  = 0x11B,
		GLFW_KEY_PAUSE         = 0x11C,
		GLFW_KEY_F1            = 0x122,
		GLFW_KEY_F2            = 0x123,
		GLFW_KEY_F3            = 0x124,
		GLFW_KEY_F4            = 0x125,
		GLFW_KEY_F5            = 0x126,
		GLFW_KEY_F6            = 0x127,
		GLFW_KEY_F7            = 0x128,
		GLFW_KEY_F8            = 0x129,
		GLFW_KEY_F9            = 0x12A,
		GLFW_KEY_F10           = 0x12B,
		GLFW_KEY_F11           = 0x12C,
		GLFW_KEY_F12           = 0x12D,
		GLFW_KEY_F13           = 0x12E,
		GLFW_KEY_F14           = 0x12F,
		GLFW_KEY_F15           = 0x130,
		GLFW_KEY_F16           = 0x131,
		GLFW_KEY_F17           = 0x132,
		GLFW_KEY_F18           = 0x133,
		GLFW_KEY_F19           = 0x134,
		GLFW_KEY_F20           = 0x135,
		GLFW_KEY_F21           = 0x136,
		GLFW_KEY_F22           = 0x137,
		GLFW_KEY_F23           = 0x138,
		GLFW_KEY_F24           = 0x139,
		GLFW_KEY_F25           = 0x13A,
		GLFW_KEY_KP_0          = 0x140,
		GLFW_KEY_KP_1          = 0x141,
		GLFW_KEY_KP_2          = 0x142,
		GLFW_KEY_KP_3          = 0x143,
		GLFW_KEY_KP_4          = 0x144,
		GLFW_KEY_KP_5          = 0x145,
		GLFW_KEY_KP_6          = 0x146,
		GLFW_KEY_KP_7          = 0x147,
		GLFW_KEY_KP_8          = 0x148,
		GLFW_KEY_KP_9          = 0x149,
		GLFW_KEY_KP_DECIMAL    = 0x14A,
		GLFW_KEY_KP_DIVIDE     = 0x14B,
		GLFW_KEY_KP_MULTIPLY   = 0x14C,
		GLFW_KEY_KP_SUBTRACT   = 0x14D,
		GLFW_KEY_KP_ADD        = 0x14E,
		GLFW_KEY_KP_ENTER      = 0x14F,
		GLFW_KEY_KP_EQUAL      = 0x150,
		GLFW_KEY_LEFT_SHIFT    = 0x154,
		GLFW_KEY_LEFT_CONTROL  = 0x155,
		GLFW_KEY_LEFT_ALT      = 0x156,
		GLFW_KEY_LEFT_SUPER    = 0x157,
		GLFW_KEY_RIGHT_SHIFT   = 0x158,
		GLFW_KEY_RIGHT_CONTROL = 0x159,
		GLFW_KEY_RIGHT_ALT     = 0x15A,
		GLFW_KEY_RIGHT_SUPER   = 0x15B,
		GLFW_KEY_MENU          = 0x15C,
		GLFW_KEY_LAST          = GLFW_KEY_MENU;

	/** Mouse buttons. */
	public static final int
		GLFW_MOUSE_BUTTON_1      = 0x0,
		GLFW_MOUSE_BUTTON_2      = 0x1,
		GLFW_MOUSE_BUTTON_3      = 0x2,
		GLFW_MOUSE_BUTTON_4      = 0x3,
		GLFW_MOUSE_BUTTON_5      = 0x4,
		GLFW_MOUSE_BUTTON_6      = 0x5,
		GLFW_MOUSE_BUTTON_7      = 0x6,
		GLFW_MOUSE_BUTTON_8      = 0x7,
		GLFW_MOUSE_BUTTON_LAST   = GLFW_MOUSE_BUTTON_8,
		GLFW_MOUSE_BUTTON_LEFT   = GLFW_MOUSE_BUTTON_1,
		GLFW_MOUSE_BUTTON_RIGHT  = GLFW_MOUSE_BUTTON_2,
		GLFW_MOUSE_BUTTON_MIDDLE = GLFW_MOUSE_BUTTON_3;

	/** Joysticks. */
	public static final int
		GLFW_JOYSTICK_1    = 0x0,
		GLFW_JOYSTICK_2    = 0x1,
		GLFW_JOYSTICK_3    = 0x2,
		GLFW_JOYSTICK_4    = 0x3,
		GLFW_JOYSTICK_5    = 0x4,
		GLFW_JOYSTICK_6    = 0x5,
		GLFW_JOYSTICK_7    = 0x6,
		GLFW_JOYSTICK_8    = 0x7,
		GLFW_JOYSTICK_9    = 0x8,
		GLFW_JOYSTICK_10   = 0x9,
		GLFW_JOYSTICK_11   = 0xA,
		GLFW_JOYSTICK_12   = 0xB,
		GLFW_JOYSTICK_13   = 0xC,
		GLFW_JOYSTICK_14   = 0xD,
		GLFW_JOYSTICK_15   = 0xE,
		GLFW_JOYSTICK_16   = 0xF,
		GLFW_JOYSTICK_LAST = GLFW_JOYSTICK_16;

	/** GLFW has not been initialized. */
	public static final int
		GLFW_NOT_INITIALIZED = 0x70001;

	/** No context is current for this thread. */
	public static final int
		GLFW_NO_CURRENT_CONTEXT = 0x70002;

	/** One of the enum parameters for the function was given an invalid enum. */
	public static final int
		GLFW_INVALID_ENUM = 0x70003;

	/** One of the parameters for the function was given an invalid value. */
	public static final int
		GLFW_INVALID_VALUE = 0x70004;

	/** A memory allocation failed. */
	public static final int
		GLFW_OUT_OF_MEMORY = 0x70005;

	/** GLFW could not find support for the requested client API on the system. */
	public static final int
		GLFW_API_UNAVAILABLE = 0x70006;

	/** The requested client API version is not available. */
	public static final int
		GLFW_VERSION_UNAVAILABLE = 0x70007;

	/** A platform-specific error occurred that does not match any of the more specific categories. */
	public static final int
		GLFW_PLATFORM_ERROR = 0x70008;

	/** The clipboard did not contain data in the requested format. */
	public static final int
		GLFW_FORMAT_UNAVAILABLE = 0x70009;

	/** Window events. */
	public static final int
		GLFW_FOCUSED   = 0x20001,
		GLFW_ICONIFIED = 0x20002,
		GLFW_RESIZABLE = 0x22007,
		GLFW_VISIBLE   = 0x22008,
		GLFW_DECORATED = 0x22009;

	/** Input options. */
	public static final int
		GLFW_CURSOR_MODE          = 0x30001,
		GLFW_STICKY_KEYS          = 0x30002,
		GLFW_STICKY_MOUSE_BUTTONS = 0x30003;

	/** Cursor state. */
	public static final int
		GLFW_CURSOR_NORMAL   = 0x40001,
		GLFW_CURSOR_HIDDEN   = 0x40002,
		GLFW_CURSOR_CAPTURED = 0x40003;

	/** Joystick state. */
	public static final int
		GLFW_PRESENT = 0x50001,
		GLFW_AXES    = 0x50002,
		GLFW_BUTTONS = 0x50003;

	/** Gamma ramp size. */
	public static final int
		GLFW_GAMMA_RAMP_SIZE = 0x100;

	/** Monitor events. */
	public static final int
		GLFW_CONNECTED    = 0x61000,
		GLFW_DISCONNECTED = 0x61001;

	/** PixelFormat hints. */
	public static final int
		GLFW_RED_BITS         = 0x21000,
		GLFW_GREEN_BITS       = 0x21001,
		GLFW_BLUE_BITS        = 0x21002,
		GLFW_ALPHA_BITS       = 0x21003,
		GLFW_DEPTH_BITS       = 0x21004,
		GLFW_STENCIL_BITS     = 0x21005,
		GLFW_ACCUM_RED_BITS   = 0x21006,
		GLFW_ACCUM_GREEN_BITS = 0x21007,
		GLFW_ACCUM_BLUE_BITS  = 0x21008,
		GLFW_ACCUM_ALPHA_BITS = 0x21009,
		GLFW_AUX_BUFFERS      = 0x2100A,
		GLFW_STEREO           = 0x2100B,
		GLFW_SAMPLES          = 0x2100C,
		GLFW_SRGB_CAPABLE     = 0x2100D;

	/** Client API hints. */
	public static final int
		GLFW_CLIENT_API            = 0x22000,
		GLFW_CONTEXT_VERSION_MAJOR = 0x22001,
		GLFW_CONTEXT_VERSION_MINOR = 0x22002,
		GLFW_CONTEXT_REVISION      = 0x20004,
		GLFW_CONTEXT_ROBUSTNESS    = 0x22003,
		GLFW_OPENGL_FORWARD_COMPAT = 0x22004,
		GLFW_OPENGL_DEBUG_CONTEXT  = 0x22005,
		GLFW_OPENGL_PROFILE        = 0x22006;

	/** Client API types. */
	public static final int
		GLFW_OPENGL_API    = 0x1,
		GLFW_OPENGL_ES_API = 0x2;

	/** // Robustness values. */
	public static final int
		GLFW_NO_ROBUSTNESS         = 0x0,
		GLFW_NO_RESET_NOTIFICATION = 0x1,
		GLFW_LOSE_CONTEXT_ON_RESET = 0x2;

	/** OpenGL profiles. */
	public static final int
		GLFW_OPENGL_NO_PROFILE     = 0x0,
		GLFW_OPENGL_CORE_PROFILE   = 0x1,
		GLFW_OPENGL_COMPAT_PROFILE = 0x2;

	// ------------------------------------------------------------------------------

	static final Platform platform;

	static {
		switch ( LWJGLUtil.getPlatform() ) {
			case WINDOWS:
				platform = new PlatformWin();
				break;
			case LINUX:
				platform = new PlatformLinux();
				break;
			case MACOSX:
				throw new UnsupportedOperationException("not implemented yet");
			default:
				throw new IllegalStateException();
		}
	}

	private static boolean initialized;

	private static final GLFWhints hints = new GLFWhints();

	private static GLFWerrorfun   errorCallback;
	private static GLFWmonitorfun monitorCallback;

	private static List<GLFWmonitor> monitors;

	static List<GLFWwindow> windows = new ArrayList<GLFWwindow>(8);

	private JGLFW() {
	}

	/**
	 * This function initializes the GLFW library. Before most GLFW functions can be used, GLFW must be initialized, and before a program terminates GLFW
	 * should be terminated in order to free any resources allocated during or after initialization.
	 * <p/>
	 * If this function fails, it calls {@link #glfwTerminate} before returning.  If it succeeds, you should call {@link #glfwTerminate} before the program
	 * exits.
	 * <p/>
	 * Additional calls to this function after successful initialization but before termination will succeed but will do nothing.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>This function may take several seconds to complete on some systems, while on other systems it may take only a fraction of a second to complete.</li>
	 * <li><strong>Mac OS X</strong>: This function will change the current directory of the application to the `Contents/Resources` subdirectory of the
	 * application's bundle, if present.</li>
	 * </ul>
	 */
	public static boolean glfwInit() {
		if ( initialized )
			return true;

		if ( !platform.init() ) {
			platform.terminate();
			return false;
		}

		monitors = platform.getMonitors();
		if ( monitors.isEmpty() ) {
			errorCallback.invoke(GLFW_PLATFORM_ERROR, "No monitors found");
			platform.terminate();
			return false;
		}

		initialized = true;

		// Not all window hints have zero as their default value
		glfwDefaultWindowHints();

		return true;
	}

	private static boolean notInitialized() {
		if ( !initialized ) {
			inputError(GLFW_NOT_INITIALIZED, "GLFW not initialized");
			return true;
		}

		return false;
	}

	/**
	 * This function destroys all remaining windows, frees any allocated resources and sets the library to an uninitialized state. Once this is called, you
	 * must again call {@link #glfwInit} successfully before you will be able to use most GLFW functions.
	 * <p/>
	 * If GLFW has been successfully initialized, this function should be called before the program exits. If initialization fails, there is no need to call
	 * this function, as it is called by {@link #glfwInit} before it returns failure.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function may be called before {@link #glfwInit}.</li>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>No window's context may be current on another thread when this function is called.</li>
	 * </ul>
	 */
	public static void glfwTerminate() {
		if ( !initialized )
			return;

		// Close all remaining windows
		while ( !windows.isEmpty() )
			glfwDestroyWindow(windows.get(windows.size() - 1));

		if ( monitors != null ) {
			// Restore gamma ramps
			for ( GLFWmonitor monitor : monitors ) {
				if ( monitor.getOriginalGammaRamp() != null )
					platform.setGammaRamp(monitor, monitor.getOriginalGammaRamp());
			}

			monitors = null;
		}

		platform.terminate();

		errorCallback = null;
		monitorCallback = null;

		initialized = false;
	}

	/**
	 * This function retrieves the major, minor and revision numbers of the GLFW library. It is intended for when you are using GLFW as a shared library and
	 * want to ensure that you are using the minimum required version.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function may be called before {@link #glfwInit}.</li>
	 * <li>This function may be called from any thread.</li>
	 * </ul>
	 *
	 * @param major major version number
	 * @param minor minor version number
	 * @param rev   revision number
	 */
	public static void glfwGetVersion(IntBuffer major, IntBuffer minor, IntBuffer rev) {
		if ( major != null )
			major.put(GLFW_VERSION_MAJOR);

		if ( minor != null )
			minor.put(GLFW_VERSION_MINOR);

		if ( rev != null )
			rev.put(GLFW_VERSION_REVISION);
	}

	/**
	 * This function returns a static string generated at compile-time according to which configuration macros were defined. This is intended for use when
	 * submitting bug reports, to allow developers to see which code paths are enabled in a binary.
	 * <p/>
	 * The format of the string is as follows:
	 * <ul>
	 * <li>The version of GLFW</li>
	 * <li>The name of the window system API</li>
	 * <li>The name of the context creation API</li>
	 * <li>Any additional options or APIs</li>
	 * </ul>
	 * <p/>
	 * For example, when compiling GLFW 3.0 with MinGW using the Win32 and WGL backends, the version string may look something like this:
	 * <p/>
	 * 3.0.0 Win32 WGL MinGW
	 */
	public static String glfwGetVersionString() {
		return platform.getVersionString();
	}

	/**
	 * This function sets the error callback, which is called with an error code and a human-readable description each time a GLFW error occurs.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function may be called before {@link #glfwInit}.</li>
	 * <li>The error callback is called by the thread where the error was generated. If you are using GLFW from multiple threads, your error callback needs to
	 * be written accordingly.</li>
	 * <li>Because the description string provided to the callback may have been generated specifically for that error, it is not guaranteed to be valid after
	 * the callback has returned.  If you wish to use it after that, you need to make your own copy of it before returning.</li>
	 * </ul>
	 *
	 * @param cbfun the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetErrorCallback(GLFWerrorfun cbfun) {
		errorCallback = cbfun;
	}

	static void inputError(int error, String format, Object... args) {
		inputError(error, String.format(format, args));
	}

	static void inputError(int error, String msg) {
		if ( errorCallback == null )
			return;

		errorCallback.invoke(error, msg);
	}

	/**
	 * This function returns an array of handles for all currently connected monitors. The returned array is valid only until the monitor configuration
	 * changes.
	 * <p/>
	 * See {@link #glfwSetMonitorCallback} to receive notifications of configuration changes.
	 */
	public static List<GLFWmonitor> glfwGetMonitors() {
		if ( notInitialized() )
			return null;

		return new ArrayList<GLFWmonitor>(monitors);
	}

	/**
	 * This function returns the primary monitor.  This is usually the monitor
	 * where elements like the Windows task bar or the OS X menu bar is located.
	 */
	public static GLFWmonitor glfwGetPrimaryMonitor() {
		if ( notInitialized() )
			return null;

		return monitors.get(0);
	}

	/**
	 * This function returns the position, in screen coordinates, of the upper-left
	 * corner of the specified monitor.
	 *
	 * @param monitor monitor to query
	 * @param xpos    The monitor x-coordinate
	 * @param ypos    The monitor y-coordinate
	 */
	public static void glfwGetMonitorPos(GLFWmonitor monitor, IntBuffer xpos, IntBuffer ypos) {
		if ( notInitialized() )
			return;

		platform.getMonitorPos(monitor, xpos, ypos);
	}

	/**
	 * This function returns a human-readable name, encoded as UTF-8, of the
	 * specified monitor.
	 *
	 * @param monitor monitor to query
	 */
	public static String glfwGetMonitorName(GLFWmonitor monitor) {
		if ( notInitialized() )
			return null;

		return monitor.getName();
	}

	/**
	 * Sets the monitor configuration callback.
	 *
	 * @param cbfun the new callback, or NULL to remove the currently set callback
	 */
	public static void glfwSetMonitorCallback(GLFWmonitorfun cbfun) {
		if ( notInitialized() )
			return;

		monitorCallback = cbfun;
	}

	/**
	 * This function returns an array of all video modes supported by the specified
	 * monitor.
	 *
	 * @param monitor monitor to query
	 */
	public static List<GLFWvidmode> glfwGetVideoModes(GLFWmonitor monitor) {
		if ( notInitialized() )
			return null;

		if ( !refreshVideoModes(monitor) )
			return null;

		return monitor.getVidmodes();
	}

	public static GLFWvidmode glfwGetVideoMode(GLFWmonitor monitor) {
		if ( notInitialized() )
			return null;

		return platform.getVideoMode(monitor);
	}

	private static boolean refreshVideoModes(GLFWmonitor monitor) {
		List<GLFWvidmode> vidmodes = platform.getVideoModes(monitor);
		if ( vidmodes.isEmpty() )
			return false;

		Collections.sort(vidmodes);

		monitor.setVidmodes(vidmodes);

		return true;
	}

	/**
	 * This function generates a gamma ramp from the specified exponent and then
	 * calls {@link #glfwSetGammaRamp} with it.
	 *
	 * @param monitor monitor whose gamma ramp to set
	 * @param gamma   desired exponent
	 */
	public static void glfwSetGamma(GLFWmonitor monitor, float gamma) {
		if ( notInitialized() )
			return;

		if ( gamma < 0.0f ) {
			inputError(GLFW_INVALID_VALUE, "Gamma value must be greater than zero");
			return;
		}

		int size = GLFW_GAMMA_RAMP_SIZE;

		ByteBuffer ramp = GLFWgammaramp.malloc();

		for ( int i = 0; i < size; i++ ) {
			// Calculate intensity
			float value = (float)i / (float)(size - 1);
			// Apply gamma curve
			value = (float)pow(value, 1.f / gamma) * 65535.f + 0.5f;

			// Clamp to value range
			short rampValue;

			if ( value < 1.f )
				rampValue = 1;
			else if ( value > 65535.f )
				rampValue = (short)65535;
			else
				rampValue = (short)value;

			ramp.putShort(GLFWgammaramp.RED + (i << 1), rampValue);
			ramp.putShort(GLFWgammaramp.GREEN + (i << 1), rampValue);
			ramp.putShort(GLFWgammaramp.BLUE + (i << 1), rampValue);
		}

		glfwSetGammaRamp(monitor, ramp);
	}

	/**
	 * This function retrieves the current gamma ramp of the specified monitor.
	 *
	 * @param monitor monitor to query
	 * @param ramp    Where to store the gamma ramp
	 */
	public static void glfwGetGammaRamp(GLFWmonitor monitor, ByteBuffer ramp) {
		if ( notInitialized() )
			return;

		platform.getGammaRamp(monitor, ramp);
	}

	/**
	 * This function sets the current gamma ramp for the specified monitor.
	 *
	 * @param monitor monitor whose gamma ramp to set
	 * @param ramp    gamma ramp to use
	 */
	public static void glfwSetGammaRamp(GLFWmonitor monitor, ByteBuffer ramp) {
		if ( notInitialized() )
			return;

		if ( monitor.getOriginalGammaRamp() == null ) {
			ByteBuffer originalRamp = GLFWgammaramp.malloc();
			glfwGetGammaRamp(monitor, originalRamp);
			monitor.setOriginalGammaRamp(originalRamp);
		}

		platform.setGammaRamp(monitor, ramp);
	}

	/**
	 * This function resets all window hints to their default values.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 */
	public static void glfwDefaultWindowHints() {
		if ( notInitialized() )
			return;

		// The default is OpenGL with minimum version 1.0
		//hints.clientAPI = GLFW_OPENGL_API;
		hints.glMajor = 1;
		hints.glMinor = 0;

		// The default is to show the window and allow window resizing
		hints.resizable = true;
		hints.visible = true;
		hints.decorated = true;

		// The default is 24 bits of color, 24 bits of depth and 8 bits of stencil
		hints.redBits = 8;
		hints.greenBits = 8;
		hints.blueBits = 8;
		hints.depthBits = 24;
		hints.stencilBits = 8;
	}

	/**
	 * This function sets hints for the next call to {@link #glfwCreateWindow}. The
	 * hints, once set, retain their values until changed by a call to
	 * glfwWindowHint or {@link #glfwDefaultWindowHints}, or until the library is
	 * terminated with {@link #glfwTerminate}.
	 * <p/>
	 * Some window hints are hard constraints. These must match the available
	 * capabilities <em>exactly</em> for window creation to succeed. Hints
	 * that are not hard constraints are matched as closely as possible, but the
	 * resulting window may differ from what these hints requested. To
	 * find out the actual parameters of the created window, use the
	 * {@link #glfwGetWindowParam} function.
	 * <p/>
	 * Hints that do not apply to a given type of window are ignored.
	 * <p/>
	 * Window hints:
	 * <p/>
	 * The {@link #GLFW_RESIZABLE} hint specifies whether the window will be resizable by
	 * the user. The window will still be resizable using the
	 * {@link #glfwSetWindowSize} function.  This hint is ignored for fullscreen windows.
	 * <p/>
	 * The {@link #GLFW_VISIBLE} hint specifies whether the window will be initially
	 * visible. This hint is ignored for fullscreen windows.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 *
	 * @param target The window hint to set
	 * @param hint   new value of the window hint
	 */
	public static void glfwWindowHint(int target, int hint) {
		if ( notInitialized() )
			return;

		switch ( target ) {
			case GLFW_RED_BITS:
				hints.redBits = hint;
				break;
			case GLFW_GREEN_BITS:
				hints.greenBits = hint;
				break;
			case GLFW_BLUE_BITS:
				hints.blueBits = hint;
				break;
			case GLFW_ALPHA_BITS:
				hints.alphaBits = hint;
				break;
			case GLFW_DEPTH_BITS:
				hints.depthBits = hint;
				break;
			case GLFW_STENCIL_BITS:
				hints.stencilBits = hint;
				break;
			case GLFW_ACCUM_RED_BITS:
				hints.accumRedBits = hint;
				break;
			case GLFW_ACCUM_GREEN_BITS:
				hints.accumGreenBits = hint;
				break;
			case GLFW_ACCUM_BLUE_BITS:
				hints.accumBlueBits = hint;
				break;
			case GLFW_ACCUM_ALPHA_BITS:
				hints.accumAlphaBits = hint;
				break;
			case GLFW_AUX_BUFFERS:
				hints.auxBuffers = hint;
				break;
			case GLFW_STEREO:
				hints.stereo = hint;
				break;
			case GLFW_RESIZABLE:
				hints.resizable = hint == GL_TRUE;
				break;
			case GLFW_DECORATED:
				hints.decorated = hint == GL_TRUE;
				break;
			case GLFW_VISIBLE:
				hints.visible = hint == GL_TRUE;
				break;
			case GLFW_SAMPLES:
				hints.samples = hint;
				break;
			case GLFW_SRGB_CAPABLE:
				hints.sRGB = hint == GL_TRUE;
				break;
			/*case GLFW_CLIENT_API:
				hints.clientAPI = hint;
				break;*/
			case GLFW_CONTEXT_VERSION_MAJOR:
				hints.glMajor = hint;
				break;
			case GLFW_CONTEXT_VERSION_MINOR:
				hints.glMinor = hint;
				break;
			case GLFW_CONTEXT_ROBUSTNESS:
				hints.glRobustness = hint;
				break;
			case GLFW_OPENGL_FORWARD_COMPAT:
				hints.glForward = hint == GL_TRUE;
				break;
			case GLFW_OPENGL_DEBUG_CONTEXT:
				hints.glDebug = hint == GL_TRUE;
				break;
			case GLFW_OPENGL_PROFILE:
				hints.glProfile = hint;
				break;
			default:
				inputError(GLFW_INVALID_ENUM, "Invalid window hint");
				break;
		}
	}

	/**
	 * This function creates a window. Most of the options controlling how the window should be created are specified via the {@link #glfwWindowHint} function.
	 * <p/>
	 * Note that the actual properties of the window may differ from what you requested, as not all parameters and hints are hard constraints.
	 * <p/>
	 * To create the window at a specific position, make it initially invisible using the {@link #GLFW_VISIBLE} window hint, set its position and then show it.
	 * <p/>
	 * For fullscreen windows the initial cursor mode is {@link #GLFW_CURSOR_CAPTURED} and the screensaver is prohibited from starting. For regular windows the
	 * initial cursor mode is {@link #GLFW_CURSOR_NORMAL} and the screensaver is allowed to start.
	 * <p/>
	 * This function may only be called from the main thread.
	 *
	 * @param width   desired width, in pixels, of the window
	 * @param height  desired height, in pixels, of the window
	 * @param title   initial, UTF-8 encoded window title
	 * @param monitor monitor to use for fullscreen mode, or null to use windowed mode
	 */
	public static GLFWwindow glfwCreateWindow(int width, int height, CharSequence title, GLFWmonitor monitor, GLFWwindow share) {
		if ( notInitialized() )
			return null;

		if ( width <= 0 || height <= 0 ) {
			inputError(GLFW_INVALID_VALUE, "Invalid window size");
			return null;
		}

		GLFWfbconfig fbconfig = new GLFWfbconfig(
			max(hints.redBits, 0),
			max(hints.greenBits, 0),
			max(hints.blueBits, 0),
			max(hints.alphaBits, 0),
			max(hints.depthBits, 0),
			max(hints.stencilBits, 0),
			max(hints.accumRedBits, 0),
			max(hints.accumGreenBits, 0),
			max(hints.accumBlueBits, 0),
			max(hints.accumAlphaBits, 0),
			max(hints.auxBuffers, 0),
			hints.stereo,
			max(hints.samples, 0),
			hints.sRGB
		);

		GLFWwndconfig wndconfig = new GLFWwndconfig(
			width,
			height,
			title,
			monitor != null || hints.resizable,
			monitor != null || hints.visible,
			hints.decorated,
			hints.glMajor,
			hints.glMinor,
			hints.glForward,
			hints.glDebug,
			hints.glProfile,
			hints.glRobustness,
			monitor,
			share
		);

		if ( !isValidContextConfig(wndconfig) )
			return null;

		GLFWwindow window = platform.createWindowInstance();
		windows.add(window);
		window.title = title;

		if ( monitor != null ) {
			window.videoMode = new GLFWvidmode(
				width,
				height,
				fbconfig.redBits,
				fbconfig.greenBits,
				fbconfig.blueBits
			);
		}

		window.monitor = monitor;
		window.resizable = wndconfig.resizable;
		window.decorated = wndconfig.decorated;
		window.cursorMode = GLFW_CURSOR_NORMAL;

		// Save the currently current context so it can be restored later
		GLFWwindow previous = glfwGetCurrentContext();

		// Open the actual window and create its context
		if ( !platform.createWindow(window, wndconfig, fbconfig) ) {
			glfwDestroyWindow(window);
			glfwMakeContextCurrent(previous);
			return null;
		}

		glfwMakeContextCurrent(window);

		// Cache the actual (as opposed to requested) context parameters
		if ( !refreshContextParams() ) {
			glfwDestroyWindow(window);
			glfwMakeContextCurrent(previous);
			return null;
		}

		// Verify the context against the requested parameters
		if ( !isValidContext(wndconfig) ) {
			glfwDestroyWindow(window);
			glfwMakeContextCurrent(previous);
			return null;
		}

		// Clearing the front buffer to black to avoid garbage pixels left over
		// from previous uses of our bit of VRAM
		glClear(GL_COLOR_BUFFER_BIT);
		platform.swapBuffers(window);

		// Restore the previously current context (or NULL)
		glfwMakeContextCurrent(previous);

		if ( wndconfig.monitor == null && wndconfig.visible )
			glfwShowWindow(window);

		return window;
	}

	private static boolean refreshContextParams() {
		return true;
	}

	private static boolean isValidContext(GLFWwndconfig wndconfig) {
		return true;
	}

	private static boolean isValidContextConfig(GLFWwndconfig wndconfig) {
		if ( wndconfig.glMajor < 1 || wndconfig.glMinor < 0 ||
		     (wndconfig.glMajor == 1 && wndconfig.glMinor > 5) ||
		     (wndconfig.glMajor == 2 && wndconfig.glMinor > 1) ||
		     (wndconfig.glMajor == 3 && wndconfig.glMinor > 3) ) {
			// OpenGL 1.0 is the smallest valid version
			// OpenGL 1.x series ended with version 1.5
			// OpenGL 2.x series ended with version 2.1
			// OpenGL 3.x series ended with version 3.3

			inputError(GLFW_INVALID_VALUE, "Invalid OpenGL version %i.%i requested", wndconfig.glMajor, wndconfig.glMinor);
			return false;
		} else {
			// For now, let everything else through
		}

		if ( wndconfig.glProfile != 0 ) {
			if ( wndconfig.glProfile != GLFW_OPENGL_CORE_PROFILE && wndconfig.glProfile != GLFW_OPENGL_COMPAT_PROFILE ) {
				inputError(GLFW_INVALID_ENUM, "Invalid OpenGL profile requested");
				return false;
			}

			if ( wndconfig.glMajor < 3 ||
			     (wndconfig.glMajor == 3 && wndconfig.glMinor < 2) ) {
				// Desktop OpenGL context profiles are only defined for version 3.2 and above
				inputError(GLFW_INVALID_VALUE, "Context profiles only exist for OpenGL version 3.2 and above");
				return false;
			}
		}

		if ( wndconfig.glForward && wndconfig.glMajor < 3 ) {
			// Forward-compatible contexts are only defined for OpenGL version 3.0 and above
			inputError(GLFW_INVALID_VALUE, "Forward compatibility only exist for OpenGL version 3.0 and above");
			return false;
		}

		if ( wndconfig.glRobustness != 0 ) {
			if ( wndconfig.glRobustness != GLFW_NO_RESET_NOTIFICATION && wndconfig.glRobustness != GLFW_LOSE_CONTEXT_ON_RESET ) {
				inputError(GLFW_INVALID_VALUE, "Invalid context robustness mode requested");
				return false;
			}
		}

		return true;
	}

	/**
	 * This function destroys the specified window. On calling this function, no further callbacks will be called for that window.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>This function may not be called from a callback.</li>
	 * </ul>
	 *
	 * @param window window to destroy
	 */
	public static void glfwDestroyWindow(GLFWwindow window) {
		if ( notInitialized() )
			return;

		if ( window == null )
			return;

		// Clear all callbacks to avoid exposing a half torn-down window object
		// TODO: memset(&window->callbacks, 0, sizeof(window->callbacks));

		// The window's context must not be current on another thread when the
		// window is destroyed
		if ( window == platform.getCurrentContext() )
			platform.makeContextCurrent(null);

		// Clear the focused window pointer if this is the focused window
		if ( window == focusedWindow )
			focusedWindow = null;

		platform.destroyWindow(window);

		// Unlink window from global linked list
		windows.remove(window);
	}

	/**
	 * This function returns the value of the close flag of the specified window.
	 *
	 * @param window window to query
	 */
	public static boolean glfwWindowShouldClose(GLFWwindow window) {
		if ( notInitialized() )
			return false;

		return window.closed;
	}

	/**
	 * This function sets the value of the close flag of the specified window.
	 * This can be used to override the user's attempt to close the window, or
	 * to signal that it should be closed.
	 *
	 * @param window window whose flag to change
	 * @param value  new value
	 */
	public static void glfwSetWindowShouldClose(GLFWwindow window, boolean value) {
		if ( notInitialized() )
			return;

		window.closed = true;
	}

	/**
	 * This function sets the window title, encoded as UTF-8, of the specified
	 * window.
	 *
	 * @param window window whose title to change
	 * @param title  UTF-8 encoded window title
	 */
	public static void glfwSetWindowTitle(GLFWwindow window, CharSequence title) {
		if ( notInitialized() )
			return;

		platform.setWindowTitle(window, title);
		window.title = title;
	}

	/**
	 * This function retrieves the position, in screen coordinates, of the
	 * upper-left corner of the client area of the specified window.
	 *
	 * @param window window to query
	 * @param xpos   x-coordinate of the upper-left corner of the client area
	 * @param ypos   y-coordinate of the upper-left corner of the client area
	 */
	public static void glfwGetWindowPos(GLFWwindow window, IntBuffer xpos, IntBuffer ypos) {
		if ( notInitialized() )
			return;

		platform.getWindowPos(window, xpos, ypos);
	}

	/**
	 * This function sets the position, in screen coordinates, of the upper-left
	 * corner of the client area of the window.
	 * <p/>
	 * If you wish to set an initial window position you should create a hidden window (using {@link #glfwWindowHint} and {@link #GLFW_VISIBLE}, set its
	 * position and then show it.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>It is very rarely a good idea to move an already visible window, as it will confuse and annoy the user.</li>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>The window manager may put limits on what positions are allowed.</li>
	 * <li><strong>X11</strong>: Some window managers ignore the set position of hidden (i.e. unmapped) windows, instead placing them where it thinks is
	 * appropriate once they are shown.</li>
	 * <li><strong>Mac OS X</strong>: The screen coordinate system is inverted.</li>
	 * </ul>
	 *
	 * @param window window to query
	 * @param xpos   x-coordinate of the upper-left corner of the client area
	 * @param ypos   y-coordinate of the upper-left corner of the client area
	 */
	public static void glfwSetWindowPos(GLFWwindow window, int xpos, int ypos) {
		if ( notInitialized() )
			return;

		if ( window.monitor != null ) {
			inputError(GLFW_INVALID_VALUE, "Fullscreen windows cannot be positioned");
			return;
		}

		platform.setWindowPos(window, xpos, ypos);
	}

	/**
	 * This function retrieves the size, in pixels, of the client area of the
	 * specified window.
	 *
	 * @param window window whose size to retrieve
	 * @param width  width of the client area
	 * @param height height of the client area
	 */
	public static void glfwGetWindowSize(GLFWwindow window, IntBuffer width, IntBuffer height) {
		if ( notInitialized() )
			return;

		platform.getWindowSize(window, width, height);
	}

	/**
	 * This function sets the size, in pixels, of the client area of the specified
	 * window.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>The window manager may put limits on what window sizes are allowed.</li>
	 * <li>For fullscreen windows, this function selects and switches to the resolution closest to the specified size, without destroying the window's context.</li>
	 * </ul>
	 *
	 * @param window window to resize
	 * @param width  desired width of the specified window
	 * @param height desired height of the specified window
	 */
	public static void glfwSetWindowSize(GLFWwindow window, int width, int height) {
		if ( notInitialized() )
			return;

		if ( window.iconified ) {
			// TODO: Figure out if this is an error
			return;
		}

		if ( window.monitor != null ) {
			window.videoMode.width = width;
			window.videoMode.height = height;
		}

		platform.setWindowSize(window, width, height);
	}

	/**
	 * This function iconifies/minimizes the specified window, if it was previously
	 * restored.  If it is a fullscreen window, the original monitor resolution is
	 * restored until the window is restored.  If the window is already iconified,
	 * this function does nothing.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 *
	 * @param window window to iconify
	 */
	public static void glfwIconifyWindow(GLFWwindow window) {
		if ( notInitialized() )
			return;

		if ( window.iconified )
			return;

		platform.iconifyWindow(window);
	}

	/**
	 * This function restores the specified window, if it was previously
	 * iconified/minimized.  If the window is already restored, this function does
	 * nothing.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 *
	 * @param window window to restore
	 */
	public static void glfwRestoreWindow(GLFWwindow window) {
		if ( notInitialized() )
			return;

		if ( !window.iconified )
			return;

		platform.restoreWindow(window);
	}

	/**
	 * This function makes the specified window visible, if it was previously
	 * hidden.  If the window is already visible or is in fullscreen mode, this
	 * function does nothing.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 *
	 * @param window window to make visible
	 */
	public static void glfwShowWindow(GLFWwindow window) {
		if ( notInitialized() )
			return;

		if ( window.monitor != null )
			return;

		platform.showWindow(window);
	}

	/**
	 * This function hides the specified window, if it was previously visible.  If
	 * the window is already hidden or is in fullscreen mode, this function does
	 * nothing.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 *
	 * @param window window to hide
	 */
	public static void glfwHideWindow(GLFWwindow window) {
		if ( notInitialized() )
			return;

		if ( window.monitor != null )
			return;

		platform.hideWindow(window);
	}

	/**
	 * This function returns the handle of the monitor that the specified window is
	 * in fullscreen on.
	 *
	 * @param window window to query
	 */
	public static GLFWmonitor glfwGetWindowMonitor(GLFWwindow window) {
		if ( notInitialized() )
			return null;

		return window.monitor;
	}

	/**
	 * This function returns a property of the specified window.
	 * <ul>
	 * <li>The {@link #GLFW_FOCUSED} parameter indicates whether the window is focused.</li>
	 * <li>The {@link #GLFW_ICONIFIED} parameter indicates whether the window is iconified.</li>
	 * <li>The {@link #GLFW_VISIBLE} parameter indicates whether the window is visible.</li>
	 * <li>The {@link #GLFW_RESIZABLE} parameter indicates whether the window is resizable by the user.</li>
	 * </ul>
	 *
	 * @param window window to query
	 * @param param  parameter whose value to return
	 */
	public static int glfwGetWindowParam(GLFWwindow window, int param) {
		if ( notInitialized() )
			return 0;

		switch ( param ) {
			case GLFW_FOCUSED:
				return window == focusedWindow ? GL_TRUE : GL_FALSE;
			case GLFW_ICONIFIED:
				return window.iconified ? GL_TRUE : GL_FALSE;
			case GLFW_RESIZABLE:
				return window.resizable ? GL_TRUE : GL_FALSE;
			case GLFW_DECORATED:
				return window.decorated ? GL_TRUE : GL_FALSE;
			case GLFW_VISIBLE:
				return window.visible ? GL_TRUE : GL_FALSE;
		/*case GLFW_CLIENT_API:
		    return window.clientAPI;*/
			case GLFW_CONTEXT_VERSION_MAJOR:
				return window.glMajor;
			case GLFW_CONTEXT_VERSION_MINOR:
				return window.glMinor;
			case GLFW_CONTEXT_REVISION:
				return window.glRevision;
			case GLFW_CONTEXT_ROBUSTNESS:
				return window.glRobustness;
			case GLFW_OPENGL_FORWARD_COMPAT:
				return window.glForward ? GL_TRUE : GL_FALSE;
			case GLFW_OPENGL_DEBUG_CONTEXT:
				return window.glDebug ? GL_TRUE : GL_FALSE;
			case GLFW_OPENGL_PROFILE:
				return window.glProfile;
		}

		inputError(GLFW_INVALID_ENUM, "Invalid window parameter");
		return 0;
	}

	/**
	 * This function sets the user-defined pointer of the specified window.  The
	 * current value is retained until the window is destroyed.  The initial value
	 * is null.
	 *
	 * @param window  window whose pointer to set
	 * @param pointer new value
	 */
	public static void glfwSetWindowUserPointer(GLFWwindow window, Object pointer) {
		if ( notInitialized() )
			return;

		window.userPointer = pointer;
	}

	/**
	 * This function returns the current value of the user-defined pointer of the
	 * specified window.  The initial value is null.
	 *
	 * @param window window whose pointer to return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T glfwGetWindowUserPointer(GLFWwindow window) {
		if ( notInitialized() )
			return null;

		return (T)window.userPointer;
	}

	/**
	 * Sets the position callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetWindowPosCallback(GLFWwindow window, GLFWwindowposfun cbfun) {
		if ( notInitialized() )
			return;

		window.posCallback = cbfun;
	}

	/**
	 * Sets the size callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetWindowSizeCallback(GLFWwindow window, GLFWwindowsizefun cbfun) {
		if ( notInitialized() )
			return;

		window.sizeCallback = cbfun;
	}

	/**
	 * Sets the close callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * This callback is called when the user attempts to close the window, i.e. for example by clicking the window's close widget.  It is called immediately
	 * after the window's close flag has been set.
	 * <p/>
	 * Calling {@link #glfwDestroyWindow} does not cause this callback to be called.
	 * <p/>
	 * <b>Mac OS X:</b> Selecting Quit from the application menu will trigger the close callback for all windows.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetWindowCloseCallback(GLFWwindow window, GLFWwindowclosefun cbfun) {
		if ( notInitialized() )
			return;

		window.closeCallback = cbfun;
	}

	/**
	 * Sets the refresh callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * This callback is called when the client area of the window needs to be redrawn, for example if the window has been exposed after having been covered by
	 * another window.
	 * <p/>
	 * On compositing window systems such as Aero, Compiz or Aqua, where the window contents are saved off-screen, this callback may be called only very
	 * infrequently or never at all.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetWindowRefreshCallback(GLFWwindow window, GLFWwindowrefreshfun cbfun) {
		if ( notInitialized() )
			return;

		window.refreshCallback = cbfun;
	}

	/**
	 * Sets the focus callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * This callback is called when the window gains or loses focus.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetWindowFocusCallback(GLFWwindow window, GLFWwindowfocusfun cbfun) {
		if ( notInitialized() )
			return;

		window.focusCallback = cbfun;
	}

	/**
	 * Sets the iconify callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * This callback is called when the window is iconified or restored.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetWindowIconifyCallback(GLFWwindow window, GLFWwindowiconifyfun cbfun) {
		if ( notInitialized() )
			return;

		window.iconifyCallback = cbfun;
	}

	// --- [ glfwPollEvents ] ---

	/**
	 * This function processes only those events that have already been recevied
	 * and then returns immediately.
	 */
	public static void glfwPollEvents() {
		if ( notInitialized() )
			return;

		platform.pollEvents();
	}

	// --- [ glfwWaitEvents ] ---

	/**
	 * This function blocks until at least one event has been recevied and then
	 * processes all received events before returning.
	 */
	public static void glfwWaitEvents() {
		if ( notInitialized() )
			return;

		platform.waitEvents();
	}

	/**
	 * Returns the value of an input option for the specified window
	 *
	 * @param window window to query
	 * @param mode   One of {@link #GLFW_CURSOR_MODE}, {@link #GLFW_STICKY_KEYS} or {@link #GLFW_STICKY_MOUSE_BUTTONS}
	 */
	public static int glfwGetInputMode(GLFWwindow window, int mode) {
		if ( notInitialized() )
			return 0;

		switch ( mode ) {
			case GLFW_CURSOR_MODE:
				return window.cursorMode;
			case GLFW_STICKY_KEYS:
				return window.stickyKeys ? GL_TRUE : GL_FALSE;
			case GLFW_STICKY_MOUSE_BUTTONS:
				return window.stickyMouseButtons ? GL_TRUE : GL_FALSE;
			default:
				inputError(GLFW_INVALID_ENUM, "Invalid input mode");
				return 0;
		}
	}

	/**
	 * Sets an input option for the specified window
	 * <p/>
	 * If mode is {@link #GLFW_CURSOR_MODE}, the value must be one of the supported input
	 * modes:
	 * <ul>
	 * <li>{@link #GLFW_CURSOR_NORMAL} makes the cursor visible and behaving normally.</li>
	 * <li>{@link #GLFW_CURSOR_HIDDEN} makes the cursor invisible when it is over the client area of the window.</li>
	 * <li>{@link #GLFW_CURSOR_CAPTURED} makes the cursor invisible and unable to leave the window but unconstrained in terms of position.</li>
	 * </ul>
	 * <p/>
	 * If mode is {@link #GLFW_STICKY_KEYS}, the value must be either {@link org.lwjgl.opengl.GL11#GL_TRUE} to
	 * enable sticky keys, or {@link org.lwjgl.opengl.GL11#GL_FALSE} to disable it.  If sticky keys are
	 * enabled, a key press will ensure that {@link #glfwGetKey} returns
	 * {@link #GLFW_PRESS} the next time it is called even if the key had been released
	 * before the call.
	 * <p/>
	 * If mode is {@link #GLFW_STICKY_MOUSE_BUTTONS}, the value must be either {@link org.lwjgl.opengl.GL11#GL_TRUE}
	 * to enable sticky mouse buttons, or {@link org.lwjgl.opengl.GL11#GL_FALSE} to disable it.  If sticky
	 * mouse buttons are enabled, a mouse button press will ensure that
	 * {@link #glfwGetMouseButton} returns {@link #GLFW_PRESS} the next time it is called even
	 * if the mouse button had been released before the call.
	 *
	 * @param window window whose input mode to set
	 * @param mode   One of {@link #GLFW_CURSOR_MODE}, {@link #GLFW_STICKY_KEYS} or {@link #GLFW_STICKY_MOUSE_BUTTONS}
	 * @param value  new value of the specified input mode
	 */
	public static void glfwSetInputMode(GLFWwindow window, int mode, int value) {
		if ( notInitialized() )
			return;

		switch ( mode ) {
			case GLFW_CURSOR_MODE:
				InputUtil.setCursorMode(window, value);
				break;
			case GLFW_STICKY_KEYS:
				InputUtil.setStickyKeys(window, value != GL_FALSE);
				break;
			case GLFW_STICKY_MOUSE_BUTTONS:
				InputUtil.setStickyMouseButtons(window, value != GL_FALSE);
				break;
			default:
				inputError(GLFW_INVALID_ENUM, "Invalid input mode");
				break;
		}
	}

	/**
	 * This function returns the last state reported for the specified key to the
	 * specified window. The returned state is one of {@link #GLFW_PRESS} or
	 * {@link #GLFW_RELEASE}. The higher-level state {@link #GLFW_REPEAT} is only reported to
	 * the key callback.
	 * <p/>
	 * If the {@link #GLFW_STICKY_KEYS} input mode is enabled, this function returns
	 * {@link #GLFW_PRESS} the first time you call this function after a key has been
	 * pressed, even if the key has already been released.
	 * <p/>
	 * The key functions deal with physical keys, with tokens named after their use on the standard US keyboard layout. If you want to input text, use the
	 * Unicode character callback instead.
	 *
	 * @param window desired window
	 * @param key    desired keyboard key
	 */
	public static int glfwGetKey(GLFWwindow window, int key) {
		if ( notInitialized() )
			return GLFW_RELEASE;

		if ( key < 0 || key > GLFW_KEY_LAST ) {
			inputError(GLFW_INVALID_ENUM, "The specified key is invalid");
			return GLFW_RELEASE;
		}

		if ( window.keys[key] == InputUtil._GLFW_STICK ) {
			// Sticky mode: release key now
			window.keys[key] = GLFW_RELEASE;
			return GLFW_PRESS;
		}

		return (int)window.keys[key];
	}

	/**
	 * This function returns the last state reported for the specified mouse button
	 * to the specified window.
	 * <p/>
	 * If the {@link #GLFW_STICKY_MOUSE_BUTTONS} input mode is enabled, this function
	 * returns {@link #GLFW_PRESS} the first time you call this function after a mouse
	 * button has been pressed, even if the mouse button has already been released.
	 *
	 * @param window desired window
	 * @param button desired mouse button
	 */
	public static int glfwGetMouseButton(GLFWwindow window, int button) {
		if ( notInitialized() )
			return GLFW_RELEASE;

		if ( button < 0 || button > GLFW_MOUSE_BUTTON_LAST ) {
			inputError(GLFW_INVALID_ENUM, "The specified mouse button is invalid");
			return GLFW_RELEASE;
		}

		if ( window.mouseButtons[button] == InputUtil._GLFW_STICK ) {
			// Sticky mode: release mouse button now
			window.mouseButtons[button] = GLFW_RELEASE;
			return GLFW_PRESS;
		}

		return (int)window.mouseButtons[button];
	}

	/**
	 * This function returns the last reported position of the cursor to the
	 * specified window.
	 *
	 * @param window desired window
	 * @param xpos   cursor x-coordinate, relative to the left edge of the client area or null
	 * @param ypos   cursor y-coordinate, relative to the to top edge of the client area, or null.
	 */
	public static void glfwGetCursorPos(GLFWwindow window, DoubleBuffer xpos, DoubleBuffer ypos) {
		if ( notInitialized() )
			return;

		if ( xpos != null )
			xpos.put(xpos.position(), window.cursorPosX);

		if ( ypos != null )
			ypos.put(ypos.position(), window.cursorPosY);
	}

	/**
	 * This function sets the position of the cursor. The specified window must be
	 * focused. If the window does not have focus when this function is called, it
	 * fails silently.
	 *
	 * @param window desired window
	 * @param xpos   desired x-coordinate, relative to the left edge of the client area, or null
	 * @param ypos   desired y-coordinate, relative to the top edge of the client area, or null
	 */
	public static void glfwSetCursorPos(GLFWwindow window, int xpos, int ypos) {
		if ( notInitialized() )
			return;

		if ( focusedWindow != window )
			return;

		// Don't do anything if the cursor position did not change
		if ( xpos == window.cursorPosX && ypos == window.cursorPosY )
			return;

		// Set GLFW cursor position
		window.cursorPosX = xpos;
		window.cursorPosY = ypos;

		// Do not move physical cursor in locked cursor mode
		if ( window.cursorMode == GLFW_CURSOR_CAPTURED )
			return;

		// Update physical cursor position
		platform.setCursorPos(window, xpos, ypos);
	}

	/**
	 * Sets the key callback. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * The key callback deals with physical keys, with key tokens named after their use on the standard US keyboard layout. If you want to input text, use the
	 * Unicode character callback instead.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetKeyCallback(GLFWwindow window, GLFWkeyfun cbfun) {
		if ( notInitialized() )
			return;

		window.keyCallback = cbfun;
	}

	/**
	 * Sets the Unicode character callback. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * The Unicode character callback is for text input. If you want to know whether a specific key was pressed or released, use the key callback.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetCharCallback(GLFWwindow window, GLFWcharfun cbfun) {
		if ( notInitialized() )
			return;

		window.charCallback = cbfun;
	}

	/**
	 * Sets the mouse button callback. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetMouseButtonCallback(GLFWwindow window, GLFWmousebuttonfun cbfun) {
		if ( notInitialized() )
			return;

		window.mouseButtonCallback = cbfun;
	}

	/**
	 * Sets the cursor position callback. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * The position is relative to the upper-left corner of the client area of the window.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetCursorPosCallback(GLFWwindow window, GLFWcursorposfun cbfun) {
		if ( notInitialized() )
			return;

		window.cursorPosCallback = cbfun;
	}

	/**
	 * Sets the cursor enter/exit callback. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetCursorEnterCallback(GLFWwindow window, GLFWcursorenterfun cbfun) {
		if ( notInitialized() )
			return;

		window.cursorEnterCallback = cbfun;
	}

	/**
	 * Sets the scroll callback. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * This receives all scrolling input, like that from a mouse wheel or a touchpad scrolling area.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetScrollCallback(GLFWwindow window, GLFWscrollfun cbfun) {
		if ( notInitialized() )
			return;

		window.scrollCallback = cbfun;
	}

	/**
	 * This function returns a parameter of the specified joystick.
	 *
	 * @param joy   joystick to query
	 * @param param parameter whose value to return
	 */
	public static int glfwGetJoystickParam(int joy, int param) {
		if ( notInitialized() )
			return 0;

		if ( joy < 0 || GLFW_JOYSTICK_16 < joy ) { // TODO: change to last
			inputError(GLFW_INVALID_ENUM, "Invalid joystick");
			return 0;
		}

		return platform.getJoystickParam(joy, param);
	}

	/**
	 * This function returns the current positions of axes of the specified
	 * joystick.
	 *
	 * @param joy  joystick to query
	 * @param axes array to hold the values
	 */
	public static int glfwGetJoystickAxes(int joy, FloatBuffer axes) {
		if ( notInitialized() )
			return 0;

		if ( joy < 0 || GLFW_JOYSTICK_LAST < joy ) {
			inputError(GLFW_INVALID_ENUM, "Invalid joystick");
			return 0;
		}

		if ( axes == null ) {
			inputError(GLFW_INVALID_VALUE, "Invalid axes");
			return 0;
		}

		return platform.getJoystickAxes(joy, axes);
	}

	/**
	 * This function returns the current state of buttons of the specified
	 * joystick.
	 *
	 * @param joy     joystick to query
	 * @param buttons array to hold the values
	 */
	public static int glfwGetJoystickButtons(int joy, ByteBuffer buttons) {
		if ( notInitialized() )
			return 0;

		if ( joy < 0 || GLFW_JOYSTICK_LAST < joy ) {
			inputError(GLFW_INVALID_ENUM, "Invalid joystick");
			return 0;
		}

		if ( buttons == null ) {
			inputError(GLFW_INVALID_VALUE, "Invalid buttons");
			return 0;
		}

		// Clear button states
		memSet(memAddress(buttons), GLFW_RELEASE, buttons.remaining());

		return platform.getJoystickButtons(joy, buttons);
	}

	/**
	 * This function returns the name, encoded as UTF-8, of the specified joystick.
	 *
	 * @param joy joystick to query
	 */
	public static String glfwGetJoystickName(int joy) {
		if ( notInitialized() )
			return null;

		if ( joy < 0 || GLFW_JOYSTICK_LAST < joy ) {
			inputError(GLFW_INVALID_ENUM, "Invalid joystick");
			return null;
		}

		return platform.getJoystickName(joy);
	}

	/**
	 * This function sets the system clipboard to the specified, UTF-8 encoded
	 * string.  The string is copied before returning, so you don't have to retain
	 * it afterwards.
	 *
	 * @param window window that will own the clipboard contents
	 * @param string UTF-8 encoded string
	 */
	public static void glfwSetClipboardString(GLFWwindow window, CharSequence string) {
		if ( notInitialized() )
			return;

		platform.setClipboardString(window, string);
	}

	/**
	 * This function returns the contents of the system clipboard, if it contains
	 * or is convertible to a UTF-8 encoded string.
	 *
	 * @param window window that will request the clipboard contents
	 */
	public static String glfwGetClipboardString(GLFWwindow window) {
		if ( notInitialized() )
			return null;

		return platform.getClipboardString(window);
	}

	/**
	 * This function returns the value of the GLFW timer. Unless the timer has
	 * been set using glfwSetTime, the timer measures time elapsed since GLFW
	 * was initialized.
	 */
	public static double glfwGetTime() {
		if ( notInitialized() )
			return 0.0;

		return platform.getTime();
	}

	/**
	 * This function sets the value of the GLFW timer.  It then continues to count
	 * up from that value.
	 *
	 * @param time new value, in seconds
	 */
	public static void glfwSetTime(double time) {
		if ( notInitialized() )
			return;

		platform.setTime(time);
	}

	// OPENGL

	public static void glfwMakeContextCurrent(GLFWwindow window) {
		if ( notInitialized() )
			return;

		if ( platform.getCurrentContext() == window ) // TODO: this is shit
			return;

		platform.makeContextCurrent(window);
	}

	public static GLFWwindow glfwGetCurrentContext() {
		if ( notInitialized() )
			return null;

		return platform.getCurrentContext();
	}

	public static void glfwSwapBuffers(GLFWwindow window) {
		if ( notInitialized() )
			return;

		platform.swapBuffers(window);
	}

	public static void glfwSwapInterval(int interval) {
		if ( notInitialized() )
			return;

		if ( platform.getCurrentContext() == null ) {
			inputError(GLFW_NO_CURRENT_CONTEXT, "There is no context current");
			return;
		}

		platform.swapInterval(interval);
	}

	// ------------------ IMPLEMENTATION STUFF -----------------------

	static void inputMonitorChange() {
		List<GLFWmonitor> monitors = platform.getMonitors();

		for ( int i = 0; i < monitors.size(); i++ ) {
			int j;
			for ( j = 0; j < JGLFW.monitors.size(); j++ ) {
				if ( JGLFW.monitors.get(j) == null )
					continue;

				if ( monitors.get(i).getName().equals(JGLFW.monitors.get(j).getName()) ) {
					// This monitor was connected before, so re-use the existing
					// monitor object to preserve its address and user pointer

					// TODO: Transfer monitor properties

					monitors.set(i, JGLFW.monitors.set(j, null));
					break;
				}
			}

			if ( j == JGLFW.monitors.size() && monitorCallback != null ) { // TODO: GLFW has no null check here?
				// This monitor was not connected before
				monitorCallback.invoke(monitors.get(i), GLFW_CONNECTED);
			}
		}

		for ( int i = 0; i < JGLFW.monitors.size(); i++ ) {
			if ( JGLFW.monitors.get(i) == null )
				continue;

			// This monitor is no longer connected
			if ( monitorCallback != null ) // TODO: GLFW has no null check here?
				monitorCallback.invoke(JGLFW.monitors.get(i), GLFW_DISCONNECTED);

			for ( GLFWwindow window : windows ) {
				if ( window.monitor == JGLFW.monitors.get(i) )
					window.monitor = null;
			}
		}

		JGLFW.monitors = monitors;
	}

	static GLFWvidmode chooseVideoMode(GLFWmonitor monitor, GLFWvidmode desired) {
		if ( !refreshVideoModes(monitor) )
			return null;

		int leastSizeDiff = Integer.MAX_VALUE;
		int leastColorDiff = Integer.MAX_VALUE;

		GLFWvidmode closest = null;

		for ( GLFWvidmode current : monitor.getVidmodes() ) {
			int colorDiff = abs((current.redBits + current.greenBits + current.blueBits) - (desired.redBits + desired.greenBits + desired.blueBits));
			int sizeDiff = abs((current.width - desired.width) * (current.width - desired.width) + (current.height - desired.height) * (current.height - desired.height));

			if ( (colorDiff < leastColorDiff) || (colorDiff == leastColorDiff && sizeDiff < leastSizeDiff) ) {
				closest = current;
				leastSizeDiff = sizeDiff;
				leastColorDiff = colorDiff;
			}
		}

		return closest;
	}

}