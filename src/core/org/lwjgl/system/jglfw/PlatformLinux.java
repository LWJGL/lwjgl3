/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.glfw.GLFWgammaramp;
import org.lwjgl.system.linux.*;
import org.lwjgl.system.linux.opengl.LinuxGLContext;

import java.io.File;
import java.io.FileFilter;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.*;
import java.util.regex.Pattern;

import static java.lang.Math.*;
import static org.lwjgl.BufferUtils.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GLX11.*;
import static org.lwjgl.opengl.GLX13.*;
import static org.lwjgl.opengl.GLXARBCreateContext.*;
import static org.lwjgl.opengl.GLXARBCreateContextRobustness.*;
import static org.lwjgl.opengl.GLXARBFramebufferSRGB.*;
import static org.lwjgl.opengl.GLXARBMultisample.*;
import static org.lwjgl.opengl.GLXEXTSwapControl.*;
import static org.lwjgl.opengl.GLXSGISwapControl.*;
import static org.lwjgl.opengl.GLXSGIXFBConfig.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.jglfw.GLFWwindowLinux.*;
import static org.lwjgl.system.jglfw.JGLFW.*;
import static org.lwjgl.system.linux.Fcntl.*;
import static org.lwjgl.system.linux.GLX.*;
import static org.lwjgl.system.linux.Joystick.*;
import static org.lwjgl.system.linux.SysIOctl.*;
import static org.lwjgl.system.linux.SysSelect.*;
import static org.lwjgl.system.linux.Unistd.*;
import static org.lwjgl.system.linux.X.*;
import static org.lwjgl.system.linux.XInput2.*;
import static org.lwjgl.system.linux.XKBlib.*;
import static org.lwjgl.system.linux.XMacros.*;
import static org.lwjgl.system.linux.Xatom.*;
import static org.lwjgl.system.linux.Xf86vmode.*;
import static org.lwjgl.system.linux.Xlib.*;
import static org.lwjgl.system.linux.Xrandr.*;
import static org.lwjgl.system.linux.Xutil.*;
import static org.lwjgl.system.linux.keysymdef.*;

class PlatformLinux implements Platform<GLFWwindowLinux> {

	// Clipboard format atom indices (in order of preference)
	static final int
		_GLFW_CLIPBOARD_FORMAT_UTF8     = 0,
		_GLFW_CLIPBOARD_FORMAT_COMPOUND = 1,
		_GLFW_CLIPBOARD_FORMAT_STRING   = 2,
		_GLFW_CLIPBOARD_FORMAT_COUNT    = 3;

	// Action for EWMH client messages
	static final long
		_NET_WM_STATE_REMOVE = 0,
		_NET_WM_STATE_ADD    = 1,
		_NET_WM_STATE_TOGGLE = 2;

	private final TimerLinux timer = new TimerLinux();

	static final X11 x11 = new X11();

	static final _GLX glx = new _GLX();

	private final ThreadLocal<GLFWwindowLinux> currentWindow = new ThreadLocal<GLFWwindowLinux>();

	private int glfwErrorCode;

	private GLFWwindowLinux focusedWindow;

	@Override
	public boolean init() {
		XInitThreads();

		if ( !initDisplay() )
			return false;

		initGammaRamp();

		if ( !initContextAPI() )
			return false;

		x11.cursor = createNULLCursor();

		if ( !initJoysticks() )
			return false;

		timer.init();

		return true;
	}

	@Override
	public void terminate() {
		if ( x11.cursor != NULL ) {
			XFreeCursor(x11.display, x11.cursor);
			x11.cursor = NULL;
		}

		terminateJoysticks();

		//_glfwTerminateContextAPI();

		if ( x11.display != NULL ) {
			// terminateDisplay()
			XCloseDisplay(x11.display);
			x11.display = NULL;
		}

		x11.selection.string = null;
	}

	@Override
	public List<GLFWmonitor> getMonitors() {
		List<GLFWmonitor> monitors = new ArrayList<GLFWmonitor>(4);

		if ( x11.randr.available ) {
			ByteBuffer sr = XRRGetScreenResources(x11.display, x11.root);
			long primary = XRRGetOutputPrimary(x11.display, x11.root);

			try {
				for ( int i = 0; i < XRRScreenResources.ncrtcGet(sr); i++ ) {
					ByteBuffer ci = XRRGetCrtcInfo(x11.display, sr, memGetAddress(XRRScreenResources.crtcsGet(sr) + i * POINTER_SIZE));
					long output = memGetAddress(XRRCrtcInfo.outputsGet(ci));

					for ( int j = 0; j < XRRCrtcInfo.noutputGet(ci); j++ ) {
						if ( memGetAddress(XRRCrtcInfo.outputsGet(ci) + j * POINTER_SIZE) == primary ) {
							output = primary;
							break;
						}
					}

					ByteBuffer oi = XRRGetOutputInfo(x11.display, sr, output);
					try {
						if ( XRROutputInfo.connectionGet(oi) != RR_Connected )
							continue;

						String name = memDecodeASCII(XRROutputInfo.nameGet(oi, XRROutputInfo.nameLenGet(oi)));

						GLFWmonitor monitor = new GLFWmonitorLinux(
							name,
							(int)XRROutputInfo.mm_widthGet(oi),
							(int)XRROutputInfo.mm_heightGet(oi),
							output,
							XRROutputInfo.crtcGet(oi)
						);

						monitors.add(
							output == primary ? 0 : monitors.size(),
							monitor
						);
					} finally {
						XRRFreeOutputInfo(oi);
						XRRFreeCrtcInfo(ci);
					}
				}
			} finally {
				XRRFreeScreenResources(sr);
			}
		} else {
			GLFWmonitor monitor = new GLFWmonitorLinux(
				"Display",
				XDisplayWidthMM(x11.display, x11.screen),
				XDisplayHeightMM(x11.display, x11.screen),
				NULL,
				NULL
			);
			monitors.add(monitor);
		}

		return monitors;
	}

	@Override
	public String getVersionString() {
		return "3.0.0 X11 GLX";
	}

	@Override
	public void getMonitorPos(GLFWmonitor monitor, IntBuffer xpos, IntBuffer ypos) {
		getMonitorPos(monitor, memAddressSafe(xpos), memAddressSafe(ypos));
	}

	private static void getMonitorPos(GLFWmonitor monitor, long xpos, long ypos) {
		if ( x11.randr.available ) {
			long sr = nXRRGetScreenResources(x11.display, x11.root);
			long ci = nXRRGetCrtcInfo(x11.display, sr, ((GLFWmonitorLinux)monitor).getCrtc());

			if ( xpos != NULL )
				memPutInt(xpos, memGetInt(ci + XRRCrtcInfo.X));
			if ( ypos != NULL )
				memPutInt(ypos, memGetInt(ci + XRRCrtcInfo.Y));

			nXRRFreeCrtcInfo(ci);
			nXRRFreeScreenResources(sr);
		} else {
			if ( xpos != NULL )
				memPutInt(xpos, 0);
			if ( ypos != NULL )
				memPutInt(ypos, 0);
		}
	}

	@Override
	public List<GLFWvidmode> getVideoModes(GLFWmonitor monitorIn) {
		GLFWmonitorLinux monitor = (GLFWmonitorLinux)monitorIn;

		List<GLFWvidmode> vidmodes = new ArrayList<GLFWvidmode>(64);

		int depth;

		depth = XDefaultDepth(x11.display, x11.screen);

		// Build array of available resolutions

		if ( x11.randr.available ) {
			ByteBuffer sr = XRRGetScreenResources(x11.display, x11.root);
			ByteBuffer oi = XRRGetOutputInfo(x11.display, sr, monitor.getOutput());

			for ( int i = 0, oiModes = XRROutputInfo.nmodeGet(oi); i < oiModes; i++ ) {
				long RRMode = memGetAddress(XRROutputInfo.modesGet(oi) + i * POINTER_SIZE);

				int j = 0;
				for ( int srModes = XRRScreenResources.nmodeGet(sr); j < srModes; j++ ) {
					if ( memGetAddress(XRRScreenResources.modesGet(sr) + j * XRRModeInfo.SIZEOF + XRRModeInfo.ID) == RRMode )
						break;
				}

				if ( j == XRRScreenResources.nmodeGet(sr) )
					continue;

				GLFWvidmode mode = new GLFWvidmode(
					memGetInt(XRRScreenResources.modesGet(sr) + j * XRRModeInfo.SIZEOF + XRRModeInfo.WIDTH),
					memGetInt(XRRScreenResources.modesGet(sr) + j * XRRModeInfo.SIZEOF + XRRModeInfo.HEIGHT),
					depth
				);

				if ( !vidmodes.contains(mode) )
					vidmodes.add(mode);
			}

			XRRFreeOutputInfo(oi);
			XRRFreeScreenResources(sr);
		} else {
			vidmodes.add(
				new GLFWvidmode(
					XDisplayWidth(x11.display, x11.screen),
					XDisplayHeight(x11.display, x11.screen),
					depth
				)
			);
		}

		return vidmodes;
	}

	@Override
	public GLFWvidmode getVideoMode(GLFWmonitor monitor) {
		int width, height;

		if ( x11.randr.available ) {
			ByteBuffer sr = XRRGetScreenResources(x11.display, x11.root);
			ByteBuffer ci = XRRGetCrtcInfo(x11.display, sr, ((GLFWmonitorLinux)monitor).getCrtc());

			width = XRRCrtcInfo.widthGet(ci);
			height = XRRCrtcInfo.heightGet(ci);

			XRRFreeCrtcInfo(ci);
			XRRFreeScreenResources(sr);
		} else {
			width = XDisplayWidth(x11.display, x11.screen);
			height = XDisplayHeight(x11.display, x11.screen);
		}

		return new GLFWvidmode(width, height, XDefaultDepth(x11.display, x11.screen));
	}

	@Override
	public void getGammaRamp(GLFWmonitor monitor, ByteBuffer ramp) {
		// TODO: Support ramp sizes other than 256

		if ( x11.randr.available && !x11.randr.gammaBroken ) {
			long crtc = ((GLFWmonitorLinux)monitor).getCrtc();

			if ( XRRGetCrtcGammaSize(x11.display, crtc) != GLFW_GAMMA_RAMP_SIZE ) {
				inputError(GLFW_PLATFORM_ERROR, "X11: Only gamma ramps of size 256 supported");
				return;
			}

			ByteBuffer gamma = XRRGetCrtcGamma(x11.display, crtc);

			int size = GLFW_GAMMA_RAMP_SIZE * 2;
			long dst = memAddress(ramp);
			memCopy(XRRCrtcGamma.redGet(gamma), dst + GLFWgammaramp.RED, size);
			memCopy(XRRCrtcGamma.greenGet(gamma), dst + GLFWgammaramp.GREEN, size);
			memCopy(XRRCrtcGamma.blueGet(gamma), dst + GLFWgammaramp.BLUE, size);

			XRRFreeGamma(gamma);
		} else if ( x11.vidmode.available ) {
			APIBuffer __buffer = apiBuffer();
			XF86VidModeGetGammaRampSize(x11.display, x11.screen, __buffer.buffer());

			if ( __buffer.intValue(0) != GLFW_GAMMA_RAMP_SIZE ) {
				inputError(GLFW_PLATFORM_ERROR, "X11: Only gamma ramps of size 256 supported");
				return;
			}

			long a = memAddress(ramp);
			nXF86VidModeGetGammaRamp(x11.display, x11.screen, GLFW_GAMMA_RAMP_SIZE, a + GLFWgammaramp.RED, a + GLFWgammaramp.GREEN, a + GLFWgammaramp.BLUE);
		}
	}

	@Override
	public void setGammaRamp(GLFWmonitor monitor, ByteBuffer ramp) {
		if ( x11.randr.available && !x11.randr.gammaBroken ) {
			long crtc = ((GLFWmonitorLinux)monitor).getCrtc();

			if ( XRRGetCrtcGammaSize(x11.display, crtc) != GLFW_GAMMA_RAMP_SIZE ) {
				inputError(GLFW_PLATFORM_ERROR, "X11: Only gamma ramps of size 256 supported");
				return;
			}

			ByteBuffer gamma = XRRAllocGamma(GLFW_GAMMA_RAMP_SIZE);

			int size = GLFW_GAMMA_RAMP_SIZE * 2;
			long src = memAddress(ramp);
			memCopy(src + GLFWgammaramp.RED, XRRCrtcGamma.redGet(gamma), size);
			memCopy(src + GLFWgammaramp.GREEN, XRRCrtcGamma.greenGet(gamma), size);
			memCopy(src + GLFWgammaramp.BLUE, XRRCrtcGamma.blueGet(gamma), size);

			XRRSetCrtcGamma(x11.display, crtc, gamma);

			XFree(gamma);
		} else if ( x11.vidmode.available ) {
			APIBuffer __buffer = apiBuffer();
			XF86VidModeGetGammaRampSize(x11.display, x11.screen, __buffer.buffer());

			if ( __buffer.intValue(0) != GLFW_GAMMA_RAMP_SIZE ) {
				inputError(GLFW_PLATFORM_ERROR, "X11: Only gamma ramps of size 256 supported");
				return;
			}

			long a = memAddress(ramp);
			nXF86VidModeSetGammaRamp(x11.display, x11.screen, GLFW_GAMMA_RAMP_SIZE, a + GLFWgammaramp.RED, a + GLFWgammaramp.GREEN, a + GLFWgammaramp.BLUE);
		}
	}

	@Override
	public GLFWwindowLinux createWindowInstance() {
		return new GLFWwindowLinux();
	}

	@Override
	public boolean createWindow(GLFWwindowLinux window, GLFWwndconfig wndconfig, GLFWfbconfig fbconfig) {
		if ( !createContext(window, wndconfig, fbconfig) )
			return false;

		if ( !createWindowImpl(window, wndconfig) )
			return false;

		if ( wndconfig.monitor != null ) {
			showWindow(window);
			enterFullscreenMode(window);
		}

		// Retrieve and set initial cursor position
		{
			APIBuffer __buffer = apiBuffer();
			__buffer.bufferParam(2 * POINTER_SIZE + 5 * 4);

			long a = __buffer.address();

			nXQueryPointer(
				x11.display, window.handle,
				a + 0, // cursorRoot
				a + POINTER_SIZE, // cursorWindow
				a + (POINTER_SIZE * 2) + 0, // rootX
				a + (POINTER_SIZE * 2) + 4, // rootY
				a + (POINTER_SIZE * 2) + 8, // windowX
				a + (POINTER_SIZE * 2) + 12, // windowY
				a + (POINTER_SIZE * 2) + 16 // mask
			);

			// TODO: Probably check for some corner cases here.

			window.cursorPosX = memGetInt(a + (POINTER_SIZE * 2) + 8);
			window.cursorPosY = memGetInt(a + (POINTER_SIZE * 2) + 12);
		}

		return true;
	}

	@Override
	public void showWindow(GLFWwindowLinux window) {
		XMapRaised(x11.display, window.handle);
		XFlush(x11.display);
	}

	@Override
	public void hideWindow(GLFWwindowLinux window) {
		XUnmapWindow(x11.display, window.handle);
		XFlush(x11.display);
	}

	@Override
	public GLFWwindowLinux getCurrentContext() {
		return currentWindow.get();
	}

	@Override
	public void makeContextCurrent(GLFWwindowLinux window) {
		if ( window != null )
			window.context.makeCurrent(window.handle);
		else
			glXMakeCurrent(x11.display, None, NULL);

		currentWindow.set(window);
	}

	@Override
	public void swapBuffers(GLFWwindowLinux window) {
		glXSwapBuffers(x11.display, window.handle);
	}

	@Override
	public void swapInterval(int interval) {
		GLFWwindowLinux window = currentWindow.get();

		if ( glx.EXT_swap_control ) {
			glXSwapIntervalEXT(x11.display, window.handle, interval);
		} /*TODO: else if ( glx.MESA_swap_control )
			glx.SwapIntervalMESA(interval);*/ else if ( glx.SGI_swap_control ) {
			if ( interval > 0 )
				glXSwapIntervalSGI(interval);
		}
	}

	@Override
	public void destroyWindow(GLFWwindowLinux window) {
		if ( window.monitor != null )
			leaveFullscreenMode(window);

		destroyContext(window);

		if ( window.handle != NULL ) {
			XDeleteContext(x11.display, window.handle, x11.context);
			XUnmapWindow(x11.display, window.handle);
			XDestroyWindow(x11.display, window.handle);
			window.handle = NULL;
		}

		if ( window.colormap != NULL ) {
			XFreeColormap(x11.display, window.colormap);
			window.colormap = NULL;
		}
	}

	private static void destroyContext(GLFWwindowLinux window) {
		if ( window.visual != NULL ) {
			nXFree(window.visual);
			window.visual = NULL;
		}

		if ( window.context != null ) {
			glXDestroyContext(x11.display, window.context.getHandle());
			window.context = null;
		}
	}

	@Override
	public void setWindowTitle(GLFWwindowLinux window, CharSequence title) {
//#if defined(X_HAVE_UTF8_STRING)
		ByteBuffer titleUTF8 = memEncodeUTF8(title);
		Xutf8SetWMProperties(x11.display, window.handle, titleUTF8, titleUTF8, null, 0, null, null, null);
//#else
		// This may be a slightly better fallback than using XStoreName and
		// XSetIconName, which always store their arguments using STRING
		//TODO: XmbSetWMProperties(x11.display, window.handle, title, title, NULL, 0, NULL, NULL, NULL);
//#endif

		if ( x11.NET_WM_NAME != None ) {
			XChangeProperty(x11.display, window.handle, x11.NET_WM_NAME, x11.UTF8_STRING, 8, PropModeReplace, memEncodeASCII(title), title.length());
		}

		if ( x11.NET_WM_ICON_NAME != None ) {
			XChangeProperty(x11.display, window.handle, x11.NET_WM_ICON_NAME, x11.UTF8_STRING, 8, PropModeReplace, memEncodeASCII(title), title.length());
		}
	}

	@Override
	public void getWindowPos(GLFWwindowLinux window, IntBuffer xpos, IntBuffer ypos) {
		APIBuffer __buffer = apiBuffer();
		int child = __buffer.pointerParam();
		int x = __buffer.intParam();
		int y = __buffer.intParam();

		long a = __buffer.address();
		nXTranslateCoordinates(x11.display, window.handle, x11.root, 0, 0, a + x, a + y, a + child);

		if ( xpos != null )
			xpos.put(xpos.position(), __buffer.intValue(x));
		if ( ypos != null )
			ypos.put(ypos.position(), __buffer.intValue(y));
	}

	@Override
	public void setWindowPos(GLFWwindowLinux window, int xpos, int ypos) {
		XMoveWindow(x11.display, window.handle, xpos, ypos);
	}

	@Override
	public void getWindowSize(GLFWwindowLinux window, IntBuffer width, IntBuffer height) {
		APIBuffer __buffer = apiBuffer();
		__buffer.bufferParam(XWindowAttributes.SIZEOF);

		nXGetWindowAttributes(x11.display, window.handle, __buffer.address());

		if ( width != null )
			width.put(width.position(), XWindowAttributes.widthGet(__buffer.buffer()));
		if ( height != null )
			height.put(height.position(), XWindowAttributes.heightGet(__buffer.buffer()));
	}

	@Override
	public void setWindowSize(GLFWwindowLinux window, int width, int height) {
		if ( !window.resizable ) {
			// Update window size restrictions to match new window size

			ByteBuffer hints = XAllocSizeHints();

			XSizeHints.flagsSet(hints, XSizeHints.flagsGet(hints) | PMinSize | PMaxSize);

			XSizeHints.min_widthSet(hints, width);
			XSizeHints.max_widthSet(hints, width);

			XSizeHints.min_heightSet(hints, height);
			XSizeHints.max_heightSet(hints, height);

			XSetWMNormalHints(x11.display, window.handle, hints);
			XFree(hints);
		}

		if ( window.monitor != null ) {
			if ( window.overrideRedirect ) {
				GLFWvidmode mode = getVideoMode(window.monitor); // LWJGL TODO: what?
				XResizeWindow(x11.display, window.handle, window.videoMode.width, window.videoMode.height);
			}
			setVideoMode((GLFWmonitorLinux)window.monitor, window.videoMode);
		} else
			XResizeWindow(x11.display, window.handle, width, height);
	}

	@Override
	public void iconifyWindow(GLFWwindowLinux window) {
		if ( window.overrideRedirect ) {
			// Override-redirect windows cannot be iconified or restored, as those
			// tasks are performed by the window manager
			return;
		}

		XIconifyWindow(x11.display, window.handle, x11.screen);
	}

	@Override
	public void restoreWindow(GLFWwindowLinux window) {
		if ( window.overrideRedirect ) {
			// Override-redirect windows cannot be iconified or restored, as those
			// tasks are performed by the window manager
			return;
		}

		XMapWindow(x11.display, window.handle);
	}

	@Override
	public void pollEvents() {
		int count = XPending(x11.display);

		ByteBuffer event = XEvent.malloc();
		while ( count-- > 0 ) {
			zeroBuffer(event);
			XNextEvent(x11.display, event);
			processEvent(event);
		}

		// Check whether the cursor has moved inside an focused window that has
		// captured the cursor (because then it needs to be re-centered)

		GLFWwindowLinux window = focusedWindow;
		if ( window != null ) {
			if ( window.cursorMode == GLFW_CURSOR_CAPTURED && !window.cursorCentered ) {
				IntBuffer widthOut = BufferUtils.createIntBuffer(1);
				IntBuffer heightOut = BufferUtils.createIntBuffer(1);

				getWindowSize(window, widthOut, heightOut);

				int width = widthOut.get(0);
				int height = heightOut.get(0);

				setCursorPos(window, width / 2, height / 2);
				window.cursorCentered = true;

				// NOTE: This is a temporary fix.  It works as long as you use
				//       offsets accumulated over the course of a frame, instead of
				//       performing the necessary actions per callback call.
				XFlush(x11.display);
			}
		}
	}

	@Override
	public void waitEvents() {
		if ( XPending(x11.display) == 0 ) {
			APIBuffer __buffer = apiBuffer();
			__buffer.bufferParam(16 * 8); // TODO: Is this correct/portable?

			int fd = XConnectionNumber(x11.display);

			FD_ZERO(__buffer.address());
			FD_SET(fd, __buffer.address());

			// select(1) is used instead of an X function like XNextEvent, as the
			// wait inside those are guarded by the mutex protecting the display
			// struct, locking out other threads from using X (including GLX)
			if ( nselect(fd + 1, __buffer.address(), NULL, NULL, NULL) < 0 )
				return;
		}

		pollEvents();
	}

	@Override
	public void setCursorPos(GLFWwindowLinux window, double x, double y) {
		// Store the new position so it can be recognized later
		window.cursorPosX = x;
		window.cursorPosY = y;

		XWarpPointer(x11.display, None, window.handle, 0, 0, 0, 0, (int)x, (int)y);
	}

	@Override
	public void setCursorMode(GLFWwindowLinux window, int mode) {
		switch ( mode ) {
			case GLFW_CURSOR_NORMAL:
				showCursor(window);
				break;
			case GLFW_CURSOR_HIDDEN:
				hideCursor(window);
				break;
			case GLFW_CURSOR_CAPTURED:
				captureCursor(window);
				break;
		}
	}

	@Override
	public int getJoystickParam(int joy, int param) {
		pollJoystickEvents();

		if ( !x11.joystick[joy].present )
			return 0;

		switch ( param ) {
			case GLFW_PRESENT:
				return GL_TRUE;

			case GLFW_AXES:
				return x11.joystick[joy].numAxes;

			case GLFW_BUTTONS:
				return x11.joystick[joy].numButtons;

			default:
				inputError(GLFW_INVALID_ENUM, "Invalid joystick param");
		}

		return 0;
	}

	@Override
	public int getJoystickAxes(int joy, FloatBuffer axes) {
		pollJoystickEvents();

		if ( !x11.joystick[joy].present )
			return 0;

		int numAxes = min(x11.joystick[joy].numAxes, axes.remaining());

		for ( int i = 0; i < numAxes; i++ )
			axes.put(axes.position() + i, x11.joystick[joy].axis.get(i));

		return numAxes;
	}

	@Override
	public int getJoystickButtons(int joy, ByteBuffer buttons) {
		pollJoystickEvents();

		if ( !x11.joystick[joy].present )
			return 0;

		int numButtons = min(x11.joystick[joy].numButtons, buttons.remaining());

		for ( int i = 0; i < numButtons; i++ )
			buttons.put(buttons.position() + i, x11.joystick[joy].button.get(i));

		return numButtons;
	}

	@Override
	public String getJoystickName(int joy) {
		if ( !x11.joystick[joy].present )
			return null;

		return x11.joystick[joy].name;
	}

	@Override
	public void setClipboardString(GLFWwindowLinux window, CharSequence string) {
		x11.selection.string = string.toString();

		XSetSelectionOwner(x11.display, x11.CLIPBOARD, window.handle, CurrentTime);

		if ( XGetSelectionOwner(x11.display, x11.CLIPBOARD) != window.handle ) {
			inputError(GLFW_PLATFORM_ERROR, "X11: Failed to become owner of the clipboard selection");
		}
	}

	@Override
	public String getClipboardString(GLFWwindowLinux window) {
		int i;

		if ( findWindowByHandle(XGetSelectionOwner(x11.display, x11.CLIPBOARD)) != null ) {
			// Instead of doing a large number of X round-trips just to put this
			// string into a window property and then read it back, just return it
			return x11.selection.string.toString();
		}

		x11.selection.string = null;

		ByteBuffer event = XEvent.malloc();
		for ( i = 0; i < _GLFW_CLIPBOARD_FORMAT_COUNT; i++ ) {
			XConvertSelection(x11.display, x11.CLIPBOARD, x11.selection.formats.get(i), x11.selection.property, window.handle, CurrentTime);

			zeroBuffer(event);
			// XCheckTypedEvent is used instead of XIfEvent in order not to lock
			// other threads out from the display during the entire wait period
			while ( XCheckTypedEvent(x11.display, SelectionNotify, event) == 0 ) ;

			if ( XEvent.xselectionPropertyGet(event) == None )
				continue;

			APIBuffer __buffer = apiBuffer();
			int actualType = __buffer.pointerParam();
			int itemCount = __buffer.pointerParam();
			int bytesAfter = __buffer.pointerParam();
			int data = __buffer.pointerParam();
			int actualFormat = __buffer.intParam();

			long a = __buffer.address();
			nXGetWindowProperty(
				x11.display,
				XEvent.xselectionRequestorGet(event),
				XEvent.xselectionPropertyGet(event),
				0, Long.MAX_VALUE,
				False,
				XEvent.xselectionTargetGet(event),
				a + actualType,
				a + actualFormat,
				a + itemCount,
				a + bytesAfter,
				a + data
			);

			XDeleteProperty(x11.display, XEvent.xselectionRequestorGet(event), XEvent.xselectionPropertyGet(event));

			if ( __buffer.pointerValue(actualType) == XEvent.xselectionTargetGet(event) )
				x11.selection.string = memDecodeUTF8(memByteBufferNT1(__buffer.pointerValue(data)));

			nXFree(__buffer.pointerValue(data));

			if ( x11.selection.string != null )
				break;
		}

		if ( x11.selection.string == null ) {
			inputError(GLFW_FORMAT_UNAVAILABLE, "X11: Failed to convert selection to string");
		}

		return x11.selection.string;
	}

	@Override
	public double getTime() {
		return timer.getTime();

	}

	@Override
	public void setTime(double time) {
		timer.setTime(time);
	}

	// ---------------- IMPLEMENTATION STUFF ------------------

	// Initialize X11 display and look for supported X11 extensions
	//
	private static boolean initDisplay() {
		x11.display = nXOpenDisplay(NULL);
		if ( x11.display == NULL ) {
			inputError(GLFW_API_UNAVAILABLE, "X11: Failed to open X display");
			return false;
		}

		x11.screen = XDefaultScreen(x11.display);
		x11.root = XRootWindow(x11.display, x11.screen);
		x11.context = XUniqueContext();

		// Find or create window manager atoms
		x11.WM_STATE = XInternAtom(x11.display, "WM_STATE", False);
		x11.WM_DELETE_WINDOW = XInternAtom(x11.display, "WM_DELETE_WINDOW", False);
		x11.MOTIF_WM_HINTS = XInternAtom(x11.display, "_MOTIF_WM_HINTS", False);

		// Check for XF86VidMode extension
		x11.vidmode.available = XF86VidModeQueryExtension(x11.display, x11.vidmode.eventBase, x11.vidmode.errorBase) != 0;

		// Check for RandR extension
		x11.randr.available = XRRQueryExtension(x11.display, x11.randr.eventBase, x11.randr.errorBase) != 0;

		if ( x11.randr.available ) {
			if ( XRRQueryVersion(x11.display, x11.randr.versionMajor, x11.randr.versionMinor) == 0 ) {
				inputError(GLFW_PLATFORM_ERROR, "X11: Failed to query RandR version");
				return false;
			}

			// The GLFW RandR path requires at least version 1.3
			if ( x11.randr.versionMajor.get(0) == 1 && x11.randr.versionMinor.get(0) < 3 ) {
				x11.randr.available = false;
			}
		}

		if ( XQueryExtension(x11.display, "XInputExtension", x11.xi.majorOpcode, x11.xi.eventBase, x11.xi.errorBase) != 0 ) {
			x11.xi.versionMajor.put(0, 2);
			x11.xi.versionMinor.put(0, 0);

			if ( XIQueryVersion(x11.display, x11.xi.versionMajor, x11.xi.versionMinor) != BadRequest ) {
				x11.xi.available = true;
			}
		}

		// Check if Xkb is supported on this display
		x11.xkb.versionMajor.put(0, 1);
		x11.xkb.versionMinor.put(0, 0);
		if ( XkbQueryExtension(x11.display, x11.xkb.majorOpcode, x11.xkb.eventBase, x11.xkb.errorBase, x11.xkb.versionMajor, x11.xkb.versionMinor) == 0 ) {
			inputError(GLFW_PLATFORM_ERROR, "X11: The keyboard extension is not available");
			return false;
		}

		IntBuffer supported = createIntBuffer(1);
		if ( XkbSetDetectableAutoRepeat(x11.display, True, supported) == 0 ) {
			inputError(GLFW_PLATFORM_ERROR, "X11: Failed to set detectable key repeat");
			return false;
		}

		if ( supported.get(0) == 0 ) {
			inputError(GLFW_PLATFORM_ERROR, "X11: Detectable key repeat is not supported");
			return false;
		}

		// Update the key code LUT
		// FIXME: We should listen to XkbMapNotify events to track changes to
		// the keyboard mapping.
		updateKeyCodeLUT();

		// Detect whether an EWMH-conformant window manager is running
		detectEWMH();

		// Find or create string format atoms
		x11.UTF8_STRING = XInternAtom(x11.display, "UTF8_STRING", False);
		x11.COMPOUND_STRING = XInternAtom(x11.display, "COMPOUND_STRING", False); // LWJGL TODO: Shouldn't this be COMPOUND_TEXT?

		// Find or create selection property atom
		x11.selection.property = XInternAtom(x11.display, "GLFW_SELECTION", False);

		// Find or create standard clipboard atoms
		x11.TARGETS = XInternAtom(x11.display, "TARGETS", False);
		x11.CLIPBOARD = XInternAtom(x11.display, "CLIPBOARD", False);

		// Find or create selection target atoms
		x11.selection.formats.put(_GLFW_CLIPBOARD_FORMAT_UTF8, x11.UTF8_STRING);
		x11.selection.formats.put(_GLFW_CLIPBOARD_FORMAT_COMPOUND, x11.COMPOUND_STRING);
		x11.selection.formats.put(_GLFW_CLIPBOARD_FORMAT_STRING, XA_STRING);

		return true;
	}

	// Update the key code LUT
	private static void updateKeyCodeLUT() {
		// Clear the LUT
		for ( int keyCode = 0; keyCode < 256; keyCode++ )
			x11.keyCodeLUT[keyCode] = -1;

		// Use XKB to determine physical key locations independently of the current
		// keyboard layout

		// Get keyboard description
		ByteBuffer descr = XkbGetKeyboard(x11.display, XkbAllComponentsMask, XkbUseCoreKbd);

		ByteBuffer names = XkbDescRec.namesGetb(descr);

		// Find the X11 key code -> GLFW key code mapping
		for ( int keyCode = XkbDescRec.min_key_codeGet(descr), maxKeyCode = XkbDescRec.max_key_codeGet(descr); keyCode <= maxKeyCode; ++keyCode ) {
			ByteBuffer key = memByteBuffer(XkbNamesRec.keysGet(names) + keyCode * XkbKeyNameRec.SIZEOF, XkbKeyNameRec.SIZEOF);

			// Get the key name
			String name = XkbKeyNameRec.nameGets(key);

			// Map the key name to a GLFW key code. Note: We only map printable
			// keys here, and we use the US keyboard layout. The rest of the
			// keys (function keys) are mapped using traditional KeySym
			// translations.
			int keyCodeGLFW;

			if ( "TLDE".equals(name) ) keyCodeGLFW = GLFW_KEY_GRAVE_ACCENT;
			else if ( "AE01".equals(name) ) keyCodeGLFW = GLFW_KEY_1;
			else if ( "AE02".equals(name) ) keyCodeGLFW = GLFW_KEY_2;
			else if ( "AE03".equals(name) ) keyCodeGLFW = GLFW_KEY_3;
			else if ( "AE04".equals(name) ) keyCodeGLFW = GLFW_KEY_4;
			else if ( "AE05".equals(name) ) keyCodeGLFW = GLFW_KEY_5;
			else if ( "AE06".equals(name) ) keyCodeGLFW = GLFW_KEY_6;
			else if ( "AE07".equals(name) ) keyCodeGLFW = GLFW_KEY_7;
			else if ( "AE08".equals(name) ) keyCodeGLFW = GLFW_KEY_8;
			else if ( "AE09".equals(name) ) keyCodeGLFW = GLFW_KEY_9;
			else if ( "AE10".equals(name) ) keyCodeGLFW = GLFW_KEY_0;
			else if ( "AE11".equals(name) ) keyCodeGLFW = GLFW_KEY_MINUS;
			else if ( "AE12".equals(name) ) keyCodeGLFW = GLFW_KEY_EQUAL;
			else if ( "AD01".equals(name) ) keyCodeGLFW = GLFW_KEY_Q;
			else if ( "AD02".equals(name) ) keyCodeGLFW = GLFW_KEY_W;
			else if ( "AD03".equals(name) ) keyCodeGLFW = GLFW_KEY_E;
			else if ( "AD04".equals(name) ) keyCodeGLFW = GLFW_KEY_R;
			else if ( "AD05".equals(name) ) keyCodeGLFW = GLFW_KEY_T;
			else if ( "AD06".equals(name) ) keyCodeGLFW = GLFW_KEY_Y;
			else if ( "AD07".equals(name) ) keyCodeGLFW = GLFW_KEY_U;
			else if ( "AD08".equals(name) ) keyCodeGLFW = GLFW_KEY_I;
			else if ( "AD09".equals(name) ) keyCodeGLFW = GLFW_KEY_O;
			else if ( "AD10".equals(name) ) keyCodeGLFW = GLFW_KEY_P;
			else if ( "AD11".equals(name) ) keyCodeGLFW = GLFW_KEY_LEFT_BRACKET;
			else if ( "AD12".equals(name) ) keyCodeGLFW = GLFW_KEY_RIGHT_BRACKET;
			else if ( "AC01".equals(name) ) keyCodeGLFW = GLFW_KEY_A;
			else if ( "AC02".equals(name) ) keyCodeGLFW = GLFW_KEY_S;
			else if ( "AC03".equals(name) ) keyCodeGLFW = GLFW_KEY_D;
			else if ( "AC04".equals(name) ) keyCodeGLFW = GLFW_KEY_F;
			else if ( "AC05".equals(name) ) keyCodeGLFW = GLFW_KEY_G;
			else if ( "AC06".equals(name) ) keyCodeGLFW = GLFW_KEY_H;
			else if ( "AC07".equals(name) ) keyCodeGLFW = GLFW_KEY_J;
			else if ( "AC08".equals(name) ) keyCodeGLFW = GLFW_KEY_K;
			else if ( "AC09".equals(name) ) keyCodeGLFW = GLFW_KEY_L;
			else if ( "AC10".equals(name) ) keyCodeGLFW = GLFW_KEY_SEMICOLON;
			else if ( "AC11".equals(name) ) keyCodeGLFW = GLFW_KEY_APOSTROPHE;
			else if ( "AB01".equals(name) ) keyCodeGLFW = GLFW_KEY_Z;
			else if ( "AB02".equals(name) ) keyCodeGLFW = GLFW_KEY_X;
			else if ( "AB03".equals(name) ) keyCodeGLFW = GLFW_KEY_C;
			else if ( "AB04".equals(name) ) keyCodeGLFW = GLFW_KEY_V;
			else if ( "AB05".equals(name) ) keyCodeGLFW = GLFW_KEY_B;
			else if ( "AB06".equals(name) ) keyCodeGLFW = GLFW_KEY_N;
			else if ( "AB07".equals(name) ) keyCodeGLFW = GLFW_KEY_M;
			else if ( "AB08".equals(name) ) keyCodeGLFW = GLFW_KEY_COMMA;
			else if ( "AB09".equals(name) ) keyCodeGLFW = GLFW_KEY_PERIOD;
			else if ( "AB10".equals(name) ) keyCodeGLFW = GLFW_KEY_SLASH;
			else if ( "BKSL".equals(name) ) keyCodeGLFW = GLFW_KEY_BACKSLASH;
			else if ( "LSGT".equals(name) ) keyCodeGLFW = GLFW_KEY_WORLD_1;
			else keyCodeGLFW = -1;

			// Update the key code LUT
			if ( (keyCode >= 0) && (keyCode < 256) )
				x11.keyCodeLUT[keyCode] = keyCodeGLFW;
		}

		// Free the keyboard description
		XkbFreeKeyboard(descr, 0, True);

		// Translate the un-translated key codes using traditional X11 KeySym
		// lookups
		for ( int keyCode = 0; keyCode < 256; keyCode++ ) {
			if ( x11.keyCodeLUT[keyCode] < 0 )
				x11.keyCodeLUT[keyCode] = keyCodeToGLFWKeyCode(keyCode);
		}
	}

	// Translate an X11 key code to a GLFW key code.
	private static int keyCodeToGLFWKeyCode(int keyCode) {
		int keySym;

		// Valid key code range is  [8,255], according to the XLib manual
		if ( keyCode < 8 || keyCode > 255 )
			return -1;

		// Try secondary keysym, for numeric keypad keys
		// Note: This way we always force "NumLock = ON", which is intentional
		// since the returned key code should correspond to a physical
		// location.
		keySym = (int)XkbKeycodeToKeysym(x11.display, keyCode, 1, 0);
		switch ( keySym ) {
			case XK_KP_0:
				return GLFW_KEY_KP_0;
			case XK_KP_1:
				return GLFW_KEY_KP_1;
			case XK_KP_2:
				return GLFW_KEY_KP_2;
			case XK_KP_3:
				return GLFW_KEY_KP_3;
			case XK_KP_4:
				return GLFW_KEY_KP_4;
			case XK_KP_5:
				return GLFW_KEY_KP_5;
			case XK_KP_6:
				return GLFW_KEY_KP_6;
			case XK_KP_7:
				return GLFW_KEY_KP_7;
			case XK_KP_8:
				return GLFW_KEY_KP_8;
			case XK_KP_9:
				return GLFW_KEY_KP_9;
			case XK_KP_Separator:
			case XK_KP_Decimal:
				return GLFW_KEY_KP_DECIMAL;
			case XK_KP_Equal:
				return GLFW_KEY_KP_EQUAL;
			case XK_KP_Enter:
				return GLFW_KEY_KP_ENTER;
			default:
				break;
		}

		// Now try pimary keysym for function keys (non-printable keys). These
		// should not be layout dependent (i.e. US layout and international
		// layouts should give the same result).
		keySym = (int)XkbKeycodeToKeysym(x11.display, keyCode, 0, 0);
		switch ( keySym ) {
			case XK_Escape:
				return GLFW_KEY_ESCAPE;
			case XK_Tab:
				return GLFW_KEY_TAB;
			case XK_Shift_L:
				return GLFW_KEY_LEFT_SHIFT;
			case XK_Shift_R:
				return GLFW_KEY_RIGHT_SHIFT;
			case XK_Control_L:
				return GLFW_KEY_LEFT_CONTROL;
			case XK_Control_R:
				return GLFW_KEY_RIGHT_CONTROL;
			case XK_Meta_L:
			case XK_Alt_L:
				return GLFW_KEY_LEFT_ALT;
			case XK_Mode_switch: // Mapped to Alt_R on many keyboards
			case XK_ISO_Level3_Shift: // AltGr on at least some machines
			case XK_Meta_R:
			case XK_Alt_R:
				return GLFW_KEY_RIGHT_ALT;
			case XK_Super_L:
				return GLFW_KEY_LEFT_SUPER;
			case XK_Super_R:
				return GLFW_KEY_RIGHT_SUPER;
			case XK_Menu:
				return GLFW_KEY_MENU;
			case XK_Num_Lock:
				return GLFW_KEY_NUM_LOCK;
			case XK_Caps_Lock:
				return GLFW_KEY_CAPS_LOCK;
			case XK_Print:
				return GLFW_KEY_PRINT_SCREEN;
			case XK_Scroll_Lock:
				return GLFW_KEY_SCROLL_LOCK;
			case XK_Pause:
				return GLFW_KEY_PAUSE;
			case XK_Delete:
				return GLFW_KEY_DELETE;
			case XK_BackSpace:
				return GLFW_KEY_BACKSPACE;
			case XK_Return:
				return GLFW_KEY_ENTER;
			case XK_Home:
				return GLFW_KEY_HOME;
			case XK_End:
				return GLFW_KEY_END;
			case XK_Page_Up:
				return GLFW_KEY_PAGE_UP;
			case XK_Page_Down:
				return GLFW_KEY_PAGE_DOWN;
			case XK_Insert:
				return GLFW_KEY_INSERT;
			case XK_Left:
				return GLFW_KEY_LEFT;
			case XK_Right:
				return GLFW_KEY_RIGHT;
			case XK_Down:
				return GLFW_KEY_DOWN;
			case XK_Up:
				return GLFW_KEY_UP;
			case XK_F1:
				return GLFW_KEY_F1;
			case XK_F2:
				return GLFW_KEY_F2;
			case XK_F3:
				return GLFW_KEY_F3;
			case XK_F4:
				return GLFW_KEY_F4;
			case XK_F5:
				return GLFW_KEY_F5;
			case XK_F6:
				return GLFW_KEY_F6;
			case XK_F7:
				return GLFW_KEY_F7;
			case XK_F8:
				return GLFW_KEY_F8;
			case XK_F9:
				return GLFW_KEY_F9;
			case XK_F10:
				return GLFW_KEY_F10;
			case XK_F11:
				return GLFW_KEY_F11;
			case XK_F12:
				return GLFW_KEY_F12;
			case XK_F13:
				return GLFW_KEY_F13;
			case XK_F14:
				return GLFW_KEY_F14;
			case XK_F15:
				return GLFW_KEY_F15;
			case XK_F16:
				return GLFW_KEY_F16;
			case XK_F17:
				return GLFW_KEY_F17;
			case XK_F18:
				return GLFW_KEY_F18;
			case XK_F19:
				return GLFW_KEY_F19;
			case XK_F20:
				return GLFW_KEY_F20;
			case XK_F21:
				return GLFW_KEY_F21;
			case XK_F22:
				return GLFW_KEY_F22;
			case XK_F23:
				return GLFW_KEY_F23;
			case XK_F24:
				return GLFW_KEY_F24;
			case XK_F25:
				return GLFW_KEY_F25;

			// Numeric keypad
			case XK_KP_Divide:
				return GLFW_KEY_KP_DIVIDE;
			case XK_KP_Multiply:
				return GLFW_KEY_KP_MULTIPLY;
			case XK_KP_Subtract:
				return GLFW_KEY_KP_SUBTRACT;
			case XK_KP_Add:
				return GLFW_KEY_KP_ADD;

			// These should have been detected in secondary keysym test above!
			case XK_KP_Insert:
				return GLFW_KEY_KP_0;
			case XK_KP_End:
				return GLFW_KEY_KP_1;
			case XK_KP_Down:
				return GLFW_KEY_KP_2;
			case XK_KP_Page_Down:
				return GLFW_KEY_KP_3;
			case XK_KP_Left:
				return GLFW_KEY_KP_4;
			case XK_KP_Right:
				return GLFW_KEY_KP_6;
			case XK_KP_Home:
				return GLFW_KEY_KP_7;
			case XK_KP_Up:
				return GLFW_KEY_KP_8;
			case XK_KP_Page_Up:
				return GLFW_KEY_KP_9;
			case XK_KP_Delete:
				return GLFW_KEY_KP_DECIMAL;
			case XK_KP_Equal:
				return GLFW_KEY_KP_EQUAL;
			case XK_KP_Enter:
				return GLFW_KEY_KP_ENTER;

			// Last resort: Check for printable keys (should not happen if the XKB
			// extension is available). This will give a layout dependent mapping
			// (which is wrong, and we may miss some keys, especially on non-US
			// keyboards), but it's better than nothing...
			case XK_a:
				return GLFW_KEY_A;
			case XK_b:
				return GLFW_KEY_B;
			case XK_c:
				return GLFW_KEY_C;
			case XK_d:
				return GLFW_KEY_D;
			case XK_e:
				return GLFW_KEY_E;
			case XK_f:
				return GLFW_KEY_F;
			case XK_g:
				return GLFW_KEY_G;
			case XK_h:
				return GLFW_KEY_H;
			case XK_i:
				return GLFW_KEY_I;
			case XK_j:
				return GLFW_KEY_J;
			case XK_k:
				return GLFW_KEY_K;
			case XK_l:
				return GLFW_KEY_L;
			case XK_m:
				return GLFW_KEY_M;
			case XK_n:
				return GLFW_KEY_N;
			case XK_o:
				return GLFW_KEY_O;
			case XK_p:
				return GLFW_KEY_P;
			case XK_q:
				return GLFW_KEY_Q;
			case XK_r:
				return GLFW_KEY_R;
			case XK_s:
				return GLFW_KEY_S;
			case XK_t:
				return GLFW_KEY_T;
			case XK_u:
				return GLFW_KEY_U;
			case XK_v:
				return GLFW_KEY_V;
			case XK_w:
				return GLFW_KEY_W;
			case XK_x:
				return GLFW_KEY_X;
			case XK_y:
				return GLFW_KEY_Y;
			case XK_z:
				return GLFW_KEY_Z;
			case XK_1:
				return GLFW_KEY_1;
			case XK_2:
				return GLFW_KEY_2;
			case XK_3:
				return GLFW_KEY_3;
			case XK_4:
				return GLFW_KEY_4;
			case XK_5:
				return GLFW_KEY_5;
			case XK_6:
				return GLFW_KEY_6;
			case XK_7:
				return GLFW_KEY_7;
			case XK_8:
				return GLFW_KEY_8;
			case XK_9:
				return GLFW_KEY_9;
			case XK_0:
				return GLFW_KEY_0;
			case XK_space:
				return GLFW_KEY_SPACE;
			case XK_minus:
				return GLFW_KEY_MINUS;
			case XK_equal:
				return GLFW_KEY_EQUAL;
			case XK_bracketleft:
				return GLFW_KEY_LEFT_BRACKET;
			case XK_bracketright:
				return GLFW_KEY_RIGHT_BRACKET;
			case XK_backslash:
				return GLFW_KEY_BACKSLASH;
			case XK_semicolon:
				return GLFW_KEY_SEMICOLON;
			case XK_apostrophe:
				return GLFW_KEY_APOSTROPHE;
			case XK_grave:
				return GLFW_KEY_GRAVE_ACCENT;
			case XK_comma:
				return GLFW_KEY_COMMA;
			case XK_period:
				return GLFW_KEY_PERIOD;
			case XK_slash:
				return GLFW_KEY_SLASH;
			case XK_less:
				return GLFW_KEY_WORLD_1; // At least in some layouts...
			default:
				break;
		}

		// No matching translation was found, so return -1
		return -1;
	}

	// Check whether the running window manager is EWMH-compliant
	private static void detectEWMH() {
		x11.hasEWMH = false;

		// First we need a couple of atoms, which should already be there
		long supportingWmCheck = XInternAtom(x11.display, "_NET_SUPPORTING_WM_CHECK", True);
		long wmSupported = XInternAtom(x11.display, "_NET_SUPPORTED", True);
		if ( supportingWmCheck == None || wmSupported == None )
			return;

		APIBuffer __buffer = apiBuffer();
		__buffer.pointerParam();

		// Then we look for the _NET_SUPPORTING_WM_CHECK property of the root window
		if ( getWindowProperty(x11.root, supportingWmCheck, XA_WINDOW, __buffer.address()) != 1 ) {
			nXFree(__buffer.pointerValue(0));
			return;
		}

		long windowFromRoot = __buffer.pointerValue(0);

		// It should be the ID of a child window (of the root)
		// Then we look for the same property on the child window
		if ( getWindowProperty(memGetAddress(windowFromRoot), supportingWmCheck, XA_WINDOW, __buffer.address()) != 1 ) {
			nXFree(__buffer.pointerValue(0));
			nXFree(windowFromRoot);
			return;
		}

		long windowFromChild = __buffer.pointerValue(0);

		// It should be the ID of that same child window
		try {
			if ( memGetAddress(windowFromRoot) != memGetAddress(windowFromChild) )
				return;
		} finally {
			nXFree(windowFromChild);
			nXFree(windowFromRoot);
		}

		// We are now fairly sure that an EWMH-compliant window manager is running

		// Now we need to check the _NET_SUPPORTED property of the root window
		// It should be a list of supported WM protocol and state atoms
		int atomCount = (int)getWindowProperty(x11.root, wmSupported, XA_ATOM, __buffer.address());

		PointerBuffer supportedAtoms = memPointerBuffer(__buffer.pointerValue(0), atomCount);

		// See which of the atoms we support that are supported by the WM

		x11.NET_WM_STATE =
			getSupportedAtom(supportedAtoms, atomCount, "_NET_WM_STATE");

		x11.NET_WM_STATE_FULLSCREEN =
			getSupportedAtom(supportedAtoms, atomCount, "_NET_WM_STATE_FULLSCREEN");

		x11.NET_WM_NAME =
			getSupportedAtom(supportedAtoms, atomCount, "_NET_WM_NAME");

		x11.NET_WM_ICON_NAME =
			getSupportedAtom(supportedAtoms, atomCount, "_NET_WM_ICON_NAME");

		x11.NET_WM_PING =
			getSupportedAtom(supportedAtoms, atomCount, "_NET_WM_PING");

		x11.NET_ACTIVE_WINDOW =
			getSupportedAtom(supportedAtoms, atomCount, "_NET_ACTIVE_WINDOW");

		XFree(supportedAtoms);

		x11.hasEWMH = true;
	}

	// Check whether the specified atom is supported
	private static long getSupportedAtom(PointerBuffer supportedAtoms, int atomCount, String atomName) {
		long atom = XInternAtom(x11.display, atomName, True);
		if ( atom != None ) {
			for ( int i = 0; i < atomCount; i++ ) {
				if ( supportedAtoms.get(i) == atom )
					return atom;
			}
		}

		return None;
	}

	// Detect gamma ramp support
	private static void initGammaRamp() {
		// RandR gamma support is only available with version 1.2 and above
		if ( x11.randr.available && (x11.randr.versionMajor.get(0) > 1 || (x11.randr.versionMajor.get(0) == 1 && x11.randr.versionMinor.get(0) >= 2)) ) {
			// FIXME: Assumes that all monitors have the same size gamma tables
			// This is reasonable as I suspect the that if they did differ, it
			// would imply that setting the gamma size to an arbitary size is
			// possible as well.
			ByteBuffer rr = XRRGetScreenResources(x11.display, x11.root);

			if ( XRRGetCrtcGammaSize(x11.display, memGetAddress(XRRScreenResources.crtcsGet(rr))) == 0 ) {
				// This is probably older Nvidia RandR with broken gamma support
				// Flag it as useless and try Xf86VidMode below, if available
				x11.randr.gammaBroken = true;
			}

			XRRFreeScreenResources(rr);
		}
	}

	private static boolean initContextAPI() {
		GL.getFunctionProvider(); // touch to load libGL

		// Check if GLX is supported on this display
		if ( glXQueryExtension(x11.display, glx.errorBase, glx.eventBase) == 0 ) {
			inputError(GLFW_API_UNAVAILABLE, "GLX: GLX support not found");
			return false;
		}

		if ( glXQueryVersion(x11.display, glx.versionMajor, glx.versionMinor) == 0 ) {
			inputError(GLFW_API_UNAVAILABLE, "GLX: Failed to query GLX version");
			return false;
		}

		// LWJGL note: We need to call GLX functions before context creation. We retrieve the function pointers here and call the JNI methods manually.
		// (GLX function pointers do not change across contexts, that's why we can do this).
		FunctionProvider functionProvider = GL.getFunctionProvider();

		// LWJGL TODO: We basically require GLX 1.3 with these. Relax?
		glx.QueryExtensionsString = functionProvider.getFunctionAddress("glXQueryExtensionsString");
		glx.ChooseFBConfig = functionProvider.getFunctionAddress("glXChooseFBConfig");
		glx.GetVisualFromFBConfig = functionProvider.getFunctionAddress("glXGetVisualFromFBConfig");
		glx.CreateNewContext = functionProvider.getFunctionAddress("glXCreateNewContext");

		String extensionsString = memDecodeASCII(memByteBufferNT1(nglXQueryExtensionsString(x11.display, x11.screen, glx.QueryExtensionsString)));
		Set<String> extensions = new HashSet<String>(32);
		StringTokenizer tokenizer = new StringTokenizer(extensionsString);
		while ( tokenizer.hasMoreTokens() )
			extensions.add(tokenizer.nextToken());

		if ( extensions.contains("GLX_EXT_swap_control") ) {
			glx.SwapIntervalEXT = functionProvider.getFunctionAddress("glXSwapIntervalEXT");

			if ( glx.SwapIntervalEXT != NULL )
				glx.EXT_swap_control = true;
		}

		if ( extensions.contains("GLX_SGI_swap_control") ) {
			glx.SwapIntervalSGI = functionProvider.getFunctionAddress("glXSwapIntervalSGI");

			if ( glx.SwapIntervalSGI != NULL )
				glx.SGI_swap_control = true;
		}

		if ( extensions.contains("GLX_MESA_swap_control") ) {
			glx.SwapIntervalMESA = functionProvider.getFunctionAddress("glXSwapIntervalMESA");

			if ( glx.SwapIntervalMESA != NULL )
				glx.MESA_swap_control = true;
		}

		if ( extensions.contains("GLX_SGIX_fbconfig") ) {
			glx.GetFBConfigAttribSGIX = functionProvider.getFunctionAddress("glXGetFBConfigAttribSGIX");
			glx.ChooseFBConfigSGIX = functionProvider.getFunctionAddress("glXChooseFBConfigSGIX");
			glx.CreateContextWithConfigSGIX = functionProvider.getFunctionAddress("glXCreateContextWithConfigSGIX");
			glx.GetVisualFromFBConfigSGIX = functionProvider.getFunctionAddress("glXGetVisualFromFBConfigSGIX");

			if ( glx.GetFBConfigAttribSGIX != NULL &&
			     glx.ChooseFBConfigSGIX != NULL &&
			     glx.CreateContextWithConfigSGIX != NULL &&
			     glx.GetVisualFromFBConfigSGIX != NULL ) {
				glx.SGIX_fbconfig = true;
			}
		}

		if ( extensions.contains("GLX_ARB_multisample") )
			glx.ARB_multisample = true;

		if ( extensions.contains("GLX_ARB_framebuffer_sRGB") )
			glx.ARB_framebuffer_sRGB = true;

		if ( extensions.contains("GLX_ARB_create_context") ) {
			glx.CreateContextAttribsARB = functionProvider.getFunctionAddress("glXCreateContextAttribsARB");

			if ( glx.CreateContextAttribsARB != NULL )
				glx.ARB_create_context = true;
		}

		if ( extensions.contains("GLX_ARB_create_context_robustness") )
			glx.ARB_create_context_robustness = true;

		if ( extensions.contains("GLX_ARB_create_context_profile") )
			glx.ARB_create_context_profile = true;

		if ( extensions.contains("GLX_EXT_create_context_es2_profile") )
			glx.EXT_create_context_es2_profile = true;

		return true;
	}

	private static long createNULLCursor() {
		// TODO: Add error checks

		long cursormask = XCreatePixmap(x11.display, x11.root, 1, 1, 1);

		ByteBuffer xgc = XGCValues.malloc();
		XGCValues.functionSet(xgc, GXclear);
		long gc = XCreateGC(x11.display, cursormask, GCFunction, xgc);
		XFillRectangle(x11.display, cursormask, gc, 0, 0, 1, 1);

		ByteBuffer col = XColor.malloc();
		XColor.pixelSet(col, 0);
		XColor.redSet(col, 0);
		XColor.flagsSet(col, 4);
		long cursor = XCreatePixmapCursor(x11.display, cursormask, cursormask, col, col, 0, 0);
		XFreePixmap(x11.display, cursormask);
		XFreeGC(x11.display, gc);

		return cursor;
	}

	private boolean createWindowImpl(GLFWwindowLinux window, GLFWwndconfig wndconfig) {
		long visualInfo = window.visual;
		long visual = memGetAddress(visualInfo + XVisualInfo.VISUAL);

		// Every window needs a colormap
		// Create one based on the visual used by the current context
		// TODO: Decouple this from context creation

		window.colormap = nXCreateColormap(x11.display, x11.root, visual, AllocNone);

		// Create the actual window
		{
			int wamask = CWBorderPixel | CWColormap | CWEventMask;

			ByteBuffer wa = XSetWindowAttributes.malloc();
			XSetWindowAttributes.colormapSet(wa, window.colormap);
			XSetWindowAttributes.border_pixelSet(wa, 0);
			XSetWindowAttributes.event_maskSet(
				wa,
				StructureNotifyMask | KeyPressMask | KeyReleaseMask |
				PointerMotionMask | ButtonPressMask | ButtonReleaseMask |
				ExposureMask | FocusChangeMask | VisibilityChangeMask |
				EnterWindowMask | LeaveWindowMask | PropertyChangeMask
			);

			if ( wndconfig.monitor == null ) {
				// HACK: This is a workaround for windows without a background pixel
				// not getting any decorations on certain older versions of Compiz
				// running on Intel hardware
				XSetWindowAttributes.background_pixelSet(wa, XBlackPixel(x11.display, x11.screen));
				wamask |= CWBackPixel;
			}

			window.handle = nXCreateWindow(
				x11.display,
				x11.root,
				0,
				0,
				wndconfig.width,
				wndconfig.height,
				0, // Border width
				memGetInt(visualInfo + XVisualInfo.DEPTH),  // Color depth
				InputOutput,
				visual,
				wamask, memAddress(wa)
			);

			if ( window.handle == NULL ) {
				// TODO: Handle all the various error codes here and translate them
				// to GLFW errors

				inputError(GLFW_PLATFORM_ERROR, "X11: Failed to create window");
				return false;
			}

			if ( !wndconfig.decorated ) {
				ByteBuffer hints = createByteBuffer(POINTER_SIZE * 5);
				PointerBuffer.put(hints, 0 * POINTER_SIZE, (1L << 1)); // flags
				PointerBuffer.put(hints, 2 * POINTER_SIZE, 0); // decorations

				XChangeProperty(x11.display, window.handle, x11.MOTIF_WM_HINTS, x11.MOTIF_WM_HINTS, 32, PropModeReplace, hints, 5);
			}

			nXSaveContext(x11.display, window.handle, x11.context, memGlobalRefNew(window));
		}

		if ( window.monitor != null && !x11.hasEWMH ) {
			// This is the butcher's way of removing window decorations
			// Setting the override-redirect attribute on a window makes the window
			// manager ignore the window completely (ICCCM, section 4)
			// The good thing is that this makes undecorated fullscreen windows
			// easy to do; the bad thing is that we have to do everything manually
			// and some things (like iconify/restore) won't work at all, as those
			// are tasks usually performed by the window manager

			ByteBuffer attributes = XSetWindowAttributes.malloc();
			XSetWindowAttributes.override_redirectSet(attributes, True);
			XChangeWindowAttributes(x11.display, window.handle, CWOverrideRedirect, attributes);

			window.overrideRedirect = true;
		}

		// Declare the WM protocols supported by GLFW
		{
			PointerBuffer protocols = createPointerBuffer(2);

			// The WM_DELETE_WINDOW ICCCM protocol
			// Basic window close notification protocol
			if ( x11.WM_DELETE_WINDOW != None )
				protocols.put(x11.WM_DELETE_WINDOW);

			// The _NET_WM_PING EWMH protocol
			// Tells the WM to ping the GLFW window and flag the application as
			// unresponsive if the WM doesn't get a reply within a few seconds
			if ( x11.NET_WM_PING != None )
				protocols.put(x11.NET_WM_PING);

			protocols.flip();
			if ( protocols.hasRemaining() )
				XSetWMProtocols(x11.display, window.handle, protocols);
		}

		// Set ICCCM WM_HINTS property
		{
			ByteBuffer hints = XAllocWMHints();
			if ( hints == null ) { // TODO: IAE above
				inputError(GLFW_OUT_OF_MEMORY, "X11: Failed to allocate WM hints");
				return false;
			}

			XWMHints.flagsSet(hints, StateHint);
			XWMHints.initial_stateSet(hints, NormalState);

			XSetWMHints(x11.display, window.handle, hints);
			XFree(hints);
		}

		// Set ICCCM WM_NORMAL_HINTS property (even if no parts are set)
		{
			ByteBuffer hints = XAllocSizeHints();
			XSizeHints.flagsSet(hints, 0);

			if ( wndconfig.monitor != null ) {
				XSizeHints.flagsSet(hints, XSizeHints.flagsGet(hints) | PPosition);
				getMonitorPos(wndconfig.monitor, memAddress(hints) + XSizeHints.X, memAddress(hints) + XSizeHints.Y);
			}

			if ( !wndconfig.resizable ) {
				XSizeHints.flagsSet(hints, XSizeHints.flagsGet(hints) | PMinSize | PMaxSize);
				XSizeHints.min_widthSet(hints, wndconfig.width);
				XSizeHints.max_widthSet(hints, wndconfig.width);
				XSizeHints.min_heightSet(hints, wndconfig.height);
				XSizeHints.max_heightSet(hints, wndconfig.height);
			}

			XSetWMNormalHints(x11.display, window.handle, hints);
			XFree(hints);
		}

		if ( x11.xi.available ) {
			// Select for XInput2 events

			ByteBuffer eventmask = XIEventMask.malloc();
			ByteBuffer mask = createByteBuffer(1);

			XIEventMask.deviceidSet(eventmask, 2);
			XIEventMask.mask_lenSet(eventmask, 1); // sizeof(mask)
			XIEventMask.maskSet(eventmask, mask);

			XISetMask(mask, XInput2.XI_Motion);

			XISelectEvents(x11.display, window.handle, eventmask, 1);
		}

		setWindowTitle(window, wndconfig.title);

		XRRSelectInput(x11.display, window.handle, RRScreenChangeNotifyMask);

		// TODO: GLFW does not make the context current here
		glXMakeCurrent(x11.display, window.handle, window.contextHandle);
		window.context = new LinuxGLContext(GL.createCapabilities(window.glForward), x11.display, window.contextHandle);

		return true;
	}

	private void enterFullscreenMode(GLFWwindowLinux window) {
		if ( !x11.saver.changed ) {
			long a = memAddress(x11.saver.buffer);

			// Remember old screen saver settings
			nXGetScreenSaver(
				x11.display,
				a + 0, // timeout
				a + 4, // interval
				a + 8, // blanking
				a + 12 // exposure
			);

			// Disable screen saver
			XSetScreenSaver(x11.display, 0, 0, DontPreferBlanking, DefaultExposures);

			x11.saver.changed = true;
		}

		setVideoMode((GLFWmonitorLinux)window.monitor, window.videoMode);

		if ( x11.hasEWMH &&
		     x11.NET_WM_STATE != None &&
		     x11.NET_WM_STATE_FULLSCREEN != None ) {
			if ( x11.NET_ACTIVE_WINDOW != None ) {
				// Ask the window manager to raise and focus the GLFW window
				// Only focused windows with the _NET_WM_STATE_FULLSCREEN state end
				// up on top of all other windows ("Stacking order" in EWMH spec)

				ByteBuffer event = XEvent.malloc();

				XEvent.typeSet(event, ClientMessage);
				XEvent.xclientWindowSet(event, window.handle);
				XEvent.xclientFormatSet(event, 32); // Data is 32-bit longs
				XEvent.xclientMessage_typeSet(event, x11.NET_ACTIVE_WINDOW);
				long datal = memAddress(event) + XEvent.XCLIENT + XClientMessageEvent.DATA_L;
				memPutAddress(datal + 0 * POINTER_SIZE, 1); // Sender is a normal application
				memPutAddress(datal + 1 * POINTER_SIZE, 0); // We don't really know the timestamp

				XSendEvent(x11.display, x11.root, False, SubstructureNotifyMask | SubstructureRedirectMask, event);
			}

			// Ask the window manager to make the GLFW window a fullscreen window
			// Fullscreen windows are undecorated and, when focused, are kept
			// on top of all other windows

			ByteBuffer event = XEvent.malloc();

			XEvent.typeSet(event, ClientMessage);
			XEvent.xclientWindowSet(event, window.handle);
			XEvent.xclientFormatSet(event, 32); // Data is 32-bit longs
			XEvent.xclientMessage_typeSet(event, x11.NET_WM_STATE);
			long datal = memAddress(event) + XEvent.XCLIENT + XClientMessageEvent.DATA_L;
			memPutAddress(datal + 0 * POINTER_SIZE, _NET_WM_STATE_ADD);
			memPutAddress(datal + 1 * POINTER_SIZE, x11.NET_WM_STATE_FULLSCREEN);
			memPutAddress(datal + 2 * POINTER_SIZE, 0); // No secondary property
			memPutAddress(datal + 3 * POINTER_SIZE, 1); // Sender is a normal application

			XSendEvent(x11.display, x11.root, False, SubstructureNotifyMask | SubstructureRedirectMask, event);
		} else if ( window.overrideRedirect ) {
			// In override-redirect mode we have divorced ourselves from the
			// window manager, so we need to do everything manually

			GLFWvidmode mode = getVideoMode(window.monitor);

			XRaiseWindow(x11.display, window.handle);
			XSetInputFocus(x11.display, window.handle, RevertToParent, CurrentTime);
			XMoveWindow(x11.display, window.handle, 0, 0);
			XResizeWindow(x11.display, window.handle, mode.width, mode.height);
		}
	}

	private void leaveFullscreenMode(GLFWwindowLinux window) {
		restoreVideoMode((GLFWmonitorLinux)window.monitor);

		if ( x11.saver.changed ) {
			// Restore old screen saver settings
			XSetScreenSaver(
				x11.display,
				x11.saver.buffer.get(0),
				x11.saver.buffer.get(4),
				x11.saver.buffer.get(8),
				x11.saver.buffer.get(12)
			);

			x11.saver.changed = false;
		}

		if ( x11.hasEWMH && x11.NET_WM_STATE != None && x11.NET_WM_STATE_FULLSCREEN != None ) {
			// Ask the window manager to make the GLFW window a normal window
			// Normal windows usually have frames and other decorations

			ByteBuffer event = XEvent.malloc();

			XEvent.typeSet(event, ClientMessage);
			XEvent.xclientWindowSet(event, window.handle);
			XEvent.xclientFormatSet(event, 32); // Data is 32-bit longs
			XEvent.xclientMessage_typeSet(event, x11.NET_WM_STATE);
			long datal = memAddress(event) + XEvent.XCLIENT + XClientMessageEvent.DATA_L;
			memPutAddress(datal + 0 * POINTER_SIZE, _NET_WM_STATE_REMOVE);
			memPutAddress(datal + 1 * POINTER_SIZE, x11.NET_WM_STATE_FULLSCREEN);
			memPutAddress(datal + 2 * POINTER_SIZE, 0); // No secondary property
			memPutAddress(datal + 3 * POINTER_SIZE, 1); // Sender is a normal application

			XSendEvent(x11.display, x11.root, False, SubstructureNotifyMask | SubstructureRedirectMask, event);
		}
	}

	// Set the current video mode for the specified monitor
	static void setVideoMode(GLFWmonitorLinux monitor, GLFWvidmode mode) {
		if ( x11.randr.available ) {
			long bestMode = 0;
			int leastSizeDiff = Integer.MAX_VALUE;

			ByteBuffer sr = XRRGetScreenResources(x11.display, x11.root);
			ByteBuffer ci = XRRGetCrtcInfo(x11.display, sr, monitor.getCrtc());

			for ( int i = 0; i < XRRScreenResources.nmodeGet(sr); i++ ) {
				boolean usable = true;
				ByteBuffer mi = memByteBuffer(memAddress(sr) + XRRScreenResources.MODES + i * XRRModeInfo.SIZEOF, XRRModeInfo.SIZEOF);

				for ( int j = 0; j < XRRCrtcInfo.noutputGet(ci); j++ ) {
					ByteBuffer oi = XRRGetOutputInfo(x11.display, sr, XRRCrtcInfo.outputsGet(ci) + j * POINTER_SIZE);

					int k;
					for ( k = 0; k < XRROutputInfo.nmodeGet(oi); k++ ) {
						if ( memGetAddress(XRROutputInfo.modesGet(oi) + k * POINTER_SIZE) == XRRModeInfo.idGet(mi) )
							break;
					}

					if ( k == XRROutputInfo.nmodeGet(oi) )
						usable = false;

					XRRFreeOutputInfo(oi);
				}

				if ( !usable )
					continue;

				if ( (XRRModeInfo.modeFlagsGet(mi) & RR_Interlace) != 0 )
					continue;

				int sizeDiff = (XRRModeInfo.widthGet(mi) - mode.width) * (XRRModeInfo.widthGet(mi) - mode.width) + (XRRModeInfo.heightGet(mi) - mode.height) * (XRRModeInfo.heightGet(mi) - mode.height);

				if ( sizeDiff < leastSizeDiff ) {
					bestMode = XRRModeInfo.idGet(mi);
					leastSizeDiff = sizeDiff;
				}
			}

			monitor.oldMode = XRRCrtcInfo.modeGet(ci);

			nXRRSetCrtcConfig(x11.display,
			                  memAddress(sr), monitor.getCrtc(),
			                  CurrentTime,
			                  XRRCrtcInfo.xGet(ci), XRRCrtcInfo.yGet(ci),
			                  bestMode,
			                  (short)XRRCrtcInfo.rotationGet(ci),
			                  XRRCrtcInfo.outputsGet(ci),
			                  XRRCrtcInfo.noutputGet(ci)
			);

			XRRFreeCrtcInfo(ci);
			XRRFreeScreenResources(sr);
		}
	}

	// Restore the saved (original) video mode for the specified monitor
	static void restoreVideoMode(GLFWmonitorLinux monitor) {
		if ( x11.randr.available ) {
			ByteBuffer sr = XRRGetScreenResources(x11.display, x11.root);
			ByteBuffer ci = XRRGetCrtcInfo(x11.display, sr, monitor.getCrtc());

			nXRRSetCrtcConfig(x11.display,
			                  memAddress(sr), monitor.getCrtc(),
			                  CurrentTime,
			                  XRRCrtcInfo.xGet(ci), XRRCrtcInfo.yGet(ci),
			                  monitor.oldMode,
			                  (short)XRRCrtcInfo.rotationGet(ci),
			                  XRRCrtcInfo.outputsGet(ci),
			                  XRRCrtcInfo.noutputGet(ci)
			);

			XRRFreeCrtcInfo(ci);
			XRRFreeScreenResources(sr);
		}
	}

	// Prepare for creation of the OpenGL context
	private boolean createContext(GLFWwindowLinux window, GLFWwndconfig wndconfig, GLFWfbconfig fbconfig) {
		IntBuffer attribs = BufferUtils.createIntBuffer(40);

		long share = NULL;
		if ( wndconfig.share != null )
			share = ((GLFWwindowLinux)wndconfig.share).context.getHandle();

		long nativeConfig;
		// Find a suitable GLXFBConfig
		{
			setGLXattrib(attribs, GLX_DOUBLEBUFFER, True);
			setGLXattrib(attribs, GLX_X_RENDERABLE, True);

			if ( fbconfig.redBits != 0 )
				setGLXattrib(attribs, GLX_RED_SIZE, fbconfig.redBits);
			if ( fbconfig.greenBits != 0 )
				setGLXattrib(attribs, GLX_GREEN_SIZE, fbconfig.greenBits);
			if ( fbconfig.blueBits != 0 )
				setGLXattrib(attribs, GLX_BLUE_SIZE, fbconfig.blueBits);
			if ( fbconfig.alphaBits != 0 )
				setGLXattrib(attribs, GLX_ALPHA_SIZE, fbconfig.alphaBits);

			if ( fbconfig.depthBits != 0 )
				setGLXattrib(attribs, GLX_DEPTH_SIZE, fbconfig.depthBits);
			if ( fbconfig.stencilBits != 0 )
				setGLXattrib(attribs, GLX_STENCIL_SIZE, fbconfig.stencilBits);

			if ( fbconfig.auxBuffers != 0 )
				setGLXattrib(attribs, GLX_AUX_BUFFERS, fbconfig.auxBuffers);

			if ( fbconfig.accumRedBits != 0 )
				setGLXattrib(attribs, GLX_ACCUM_RED_SIZE, fbconfig.accumRedBits);
			if ( fbconfig.accumGreenBits != 0 )
				setGLXattrib(attribs, GLX_ACCUM_GREEN_SIZE, fbconfig.accumGreenBits);
			if ( fbconfig.accumBlueBits != 0 )
				setGLXattrib(attribs, GLX_ACCUM_BLUE_SIZE, fbconfig.accumBlueBits);
			if ( fbconfig.accumAlphaBits != 0 )
				setGLXattrib(attribs, GLX_ACCUM_BLUE_SIZE, fbconfig.accumAlphaBits);

			if ( fbconfig.stereo != 0 )
				setGLXattrib(attribs, GLX_STEREO, True);

			if ( glx.ARB_multisample ) {
				if ( fbconfig.samples != 0 ) {
					setGLXattrib(attribs, GLX_SAMPLE_BUFFERS_ARB, 1);
					setGLXattrib(attribs, GLX_SAMPLES_ARB, fbconfig.samples);
				}
			}

			if ( glx.ARB_framebuffer_sRGB ) {
				if ( fbconfig.sRGB )
					setGLXattrib(attribs, GLX_FRAMEBUFFER_SRGB_CAPABLE_ARB, True);
			}

			setGLXattrib(attribs, None, None);
			attribs.flip();

			APIBuffer __buffer = apiBuffer();
			__buffer.intParam();
			if ( glx.SGIX_fbconfig ) {
				nativeConfig = nglXChooseFBConfigSGIX(x11.display, x11.screen, memAddress(attribs), __buffer.address(), glx.ChooseFBConfigSGIX);
			} else {
				nativeConfig = nglXChooseFBConfig(x11.display, x11.screen, memAddress(attribs), __buffer.address(), glx.ChooseFBConfig);
			}

			if ( nativeConfig == NULL ) {
				inputError(GLFW_PLATFORM_ERROR, "GLX: Failed to find a suitable GLXFBConfig");
				return false;
			}
		}

		// Retrieve the corresponding visual
		if ( glx.SGIX_fbconfig ) {
			window.visual = nglXGetVisualFromFBConfigSGIX(x11.display, memGetAddress(nativeConfig), glx.GetVisualFromFBConfigSGIX);
		} else {
			window.visual = nglXGetVisualFromFBConfig(x11.display, memGetAddress(nativeConfig), glx.GetVisualFromFBConfig);
		}

		if ( window.visual == NULL ) {
			nXFree(nativeConfig);

			inputError(GLFW_PLATFORM_ERROR, "GLX: Failed to retrieve visual for GLXFBConfig");
			return false;
		}

		if ( wndconfig.glForward ) {
			if ( !glx.ARB_create_context ) {
				nXFree(nativeConfig);

				inputError(GLFW_VERSION_UNAVAILABLE, "GLX: Forward compatibility requested but GLX_ARB_create_context_profile is unavailable");
				return false;
			}
		}

		if ( wndconfig.glProfile != 0 ) {
			if ( !glx.ARB_create_context || !glx.ARB_create_context_profile ) {
				nXFree(nativeConfig);

				inputError(GLFW_VERSION_UNAVAILABLE, "GLX: An OpenGL profile requested but GLX_ARB_create_context_profile is unavailable");
				return false;
			}
		}

		glfwErrorCode = Success;
		XSetErrorHandler(new XErrorHandler() {
			@Override
			public int invoke(long display, ByteBuffer error_event) {
				glfwErrorCode = XErrorEvent.error_codeGet(error_event);
				return 0;
			}
		});

		if ( glx.ARB_create_context ) {
			int mask = 0, flags = 0, strategy = 0;

			if ( wndconfig.glForward )
				flags |= GLX_CONTEXT_FORWARD_COMPATIBLE_BIT_ARB;

			if ( wndconfig.glDebug )
				flags |= GLX_CONTEXT_DEBUG_BIT_ARB;

			if ( wndconfig.glProfile != 0 ) {
				if ( wndconfig.glProfile == GLFW_OPENGL_CORE_PROFILE )
					mask |= GLX_CONTEXT_CORE_PROFILE_BIT_ARB;
				else if ( wndconfig.glProfile == GLFW_OPENGL_COMPAT_PROFILE )
					mask |= GLX_CONTEXT_COMPATIBILITY_PROFILE_BIT_ARB;
			}

			if ( wndconfig.glRobustness != GLFW_NO_ROBUSTNESS ) {
				if ( glx.ARB_create_context_robustness ) {
					if ( wndconfig.glRobustness == GLFW_NO_RESET_NOTIFICATION )
						strategy = GLX_NO_RESET_NOTIFICATION_ARB;
					else if ( wndconfig.glRobustness == GLFW_LOSE_CONTEXT_ON_RESET )
						strategy = GLX_LOSE_CONTEXT_ON_RESET_ARB;

					flags |= GLX_CONTEXT_ROBUST_ACCESS_BIT_ARB;
				}
			}

			attribs.clear();
			if ( wndconfig.glMajor != 1 || wndconfig.glMinor != 0 ) {
				// NOTE: Only request an explicitly versioned context when
				// necessary, as explicitly requesting version 1.0 does not always
				// return the highest available version

				setGLXattrib(attribs, GLX_CONTEXT_MAJOR_VERSION_ARB, wndconfig.glMajor);
				setGLXattrib(attribs, GLX_CONTEXT_MINOR_VERSION_ARB, wndconfig.glMinor);
			}

			if ( mask != 0 )
				setGLXattrib(attribs, GLX_CONTEXT_PROFILE_MASK_ARB, mask);

			if ( flags != 0 )
				setGLXattrib(attribs, GLX_CONTEXT_FLAGS_ARB, flags);

			if ( strategy != 0 )
				setGLXattrib(attribs, GLX_CONTEXT_RESET_NOTIFICATION_STRATEGY_ARB, strategy);

			setGLXattrib(attribs, None, None);
			attribs.flip();

			window.contextHandle = nglXCreateContextAttribsARB(x11.display, memGetAddress(nativeConfig), share, True, memAddress(attribs), glx.CreateContextAttribsARB);

			if ( window.contextHandle == NULL ) {
				// HACK: This is a fallback for the broken Mesa implementation of
				// GLX_ARB_create_context_profile, which fails default 1.0 context
				// creation with a GLXBadProfileARB error in violation of the spec
				if ( glfwErrorCode == glx.errorBase.get(0) + GLXBadProfileARB && wndconfig.glProfile == GLFW_OPENGL_NO_PROFILE && !wndconfig.glForward ) {
					window.contextHandle = createLegacyContext(nativeConfig, share);
				}
			}

		} else
			window.contextHandle = createLegacyContext(nativeConfig, share);

		XSetErrorHandler(NULL);

		nXFree(nativeConfig);

		if ( window.contextHandle == NULL ) {
			ByteBuffer buffer = BufferUtils.createByteBuffer(8192);
			XGetErrorText(x11.display, glfwErrorCode, buffer);

			inputError(GLFW_PLATFORM_ERROR, "GLX: Failed to create context: %s", memDecodeASCII(buffer, memStrLen1(buffer)));

			return false;
		}

		return true;
	}

	private static long createLegacyContext(long fbconfig, long share) {
		if ( glx.SGIX_fbconfig )
			return nglXCreateContextWithConfigSGIX(x11.display, fbconfig, GLX_RGBA_TYPE, share, True, glx.CreateContextWithConfigSGIX);
		else
			return nglXCreateNewContext(x11.display, fbconfig, GLX_RGBA_TYPE, share, True, glx.CreateNewContext);
	}

	private static void setGLXattrib(IntBuffer attribs, int attribName, int attribValue) {
		attribs.put(attribName);
		attribs.put(attribValue);
	}

	// Hide cursor
	static void hideCursor(GLFWwindowLinux window) {
		// Un-grab cursor (in windowed mode only; in fullscreen mode we still
		// want the cursor grabbed in order to confine the cursor to the window
		// area)
		if ( window.cursorGrabbed && window.monitor == null ) {
			XUngrabPointer(x11.display, CurrentTime);
			window.cursorGrabbed = false;
		}

		if ( !window.cursorHidden ) {
			XDefineCursor(x11.display, window.handle, x11.cursor);
			window.cursorHidden = true;
		}
	}

	// Capture cursor
	static void captureCursor(GLFWwindowLinux window) {
		hideCursor(window);

		if ( !window.cursorGrabbed ) {
			if ( XGrabPointer(
				x11.display, window.handle, True,
				ButtonPressMask | ButtonReleaseMask | PointerMotionMask, GrabModeAsync, GrabModeAsync,
				window.handle, None, CurrentTime
			) == GrabSuccess ) {
				window.cursorGrabbed = true;
				window.cursorCentered = false;
			}
		}
	}

	// Show cursor
	static void showCursor(GLFWwindowLinux window) {
		// Un-grab cursor (in windowed mode only; in fullscreen mode we still
		// want the cursor grabbed in order to confine the cursor to the window
		// area)
		if ( window.cursorGrabbed && window.monitor == null ) {
			XUngrabPointer(x11.display, CurrentTime);
			window.cursorGrabbed = false;
		}

		// Show cursor
		if ( window.cursorHidden ) {
			XUndefineCursor(x11.display, window.handle);
			window.cursorHidden = false;
		}
	}

	static boolean initJoysticks() {
		String[] dirs = {
			"/dev/input",
			"/dev"
		};

		final Pattern regex = Pattern.compile("^js[0-9]\\+$");

		int joy = 0;
		for ( String dirPath : dirs ) {
			File dir = new File(dirPath);

			File[] joysticks = dir.listFiles(new FileFilter() {
				@Override
				public boolean accept(File file) {
					return regex.matcher(file.getName()).matches();
				}
			});

			for ( File joystick : joysticks ) {
				if ( openJoystickDevice(joy, joystick.getPath()) )
					joy++;
			}
		}

		return true;
	}

	private static boolean openJoystickDevice(int joy, String path) {
		int fd = open(path, O_RDONLY | O_NONBLOCK);
		if ( fd == -1 )
			return false;

		x11.joystick[joy].fd = fd;

		APIBuffer __buffer = apiBuffer();

		// Verify that the joystick driver version is at least 1.0
		ioctl(fd, JSIOCGVERSION(), __buffer.address());
		int version = __buffer.intValue(0);
		if ( version < 0x010000 ) {
			// It's an old 0.x interface (we don't support it)
			close(fd);
			return false;
		}

		if ( ioctl(fd, JSIOCGNAME(256), __buffer.address()) < 0 )
			x11.joystick[joy].name = "Unknown";
		else
			x11.joystick[joy].name = memDecodeUTF8(memByteBufferNT1(__buffer.address()));

		ioctl(fd, JSIOCGAXES(), __buffer.address());
		x11.joystick[joy].numAxes = __buffer.intValue(0);
		x11.joystick[joy].axis = createFloatBuffer(__buffer.intValue(0));

		ioctl(fd, JSIOCGBUTTONS(), __buffer.address());
		x11.joystick[joy].numButtons = __buffer.intValue(0);
		x11.joystick[joy].button = createByteBuffer(__buffer.intValue(0));

		x11.joystick[joy].present = true;

		return true;
	}

	private static void terminateJoysticks() {
		for ( int i = 0; i <= GLFW_JOYSTICK_LAST; i++ ) {
			if ( x11.joystick[i].present ) {
				close(x11.joystick[i].fd);

				x11.joystick[i].axis = null;
				x11.joystick[i].button = null;
				x11.joystick[i].name = null;

				x11.joystick[i].present = false;
			}
		}
	}

	// Polls for and processes events for all present joysticks
	static void pollJoystickEvents() {
		ByteBuffer e = JSEvent.malloc();

		for ( int i = 0; i <= GLFW_JOYSTICK_LAST; i++ ) {
			if ( !x11.joystick[i].present )
				continue;

			// Read all queued events (non-blocking)
			for (; ; ) {
				int errno = 0;
				long result = read(x11.joystick[i].fd, e, JSEvent.SIZEOF);

				// LWJGL TODO: what?
				if ( errno == 19 ) // ENODEV: No such device
					x11.joystick[i].present = false;

				if ( result == -1 )
					break;

				// We don't care if it's an init event or not
				JSEvent.typeSet(e, JSEvent.typeGet(e) & ~JS_EVENT_INIT);

				int number = JSEvent.numberGet(e);
				switch ( JSEvent.typeGet(e) ) {
					case JS_EVENT_AXIS:
						x11.joystick[i].axis.put(number, (float)JSEvent.valueGet(e) / 32767.0f);

						// We need to change the sign for the Y axes, so that
						// positive = up/forward, according to the GLFW spec.
						if ( (number & 1) == 1 ) {
							x11.joystick[i].axis.put(number, -x11.joystick[i].axis.get(number));
						}

						break;

					case JS_EVENT_BUTTON:
						x11.joystick[i].button.put(number, (byte)(JSEvent.valueGet(e) != 0 ? GLFW_PRESS : GLFW_RELEASE));
						break;

					default:
						break;
				}
			}
		}
	}

	static class X11 {

		long display;
		int  screen;
		long root;

		long cursor;
		int  context;

		long WM_STATE;
		long WM_DELETE_WINDOW;
		long NET_WM_STATE;
		long NET_WM_STATE_FULLSCREEN;
		long NET_WM_NAME;
		long NET_WM_ICON_NAME;
		long NET_WM_PING;
		long NET_ACTIVE_WINDOW;
		long MOTIF_WM_HINTS;

		long TARGETS;
		long CLIPBOARD;
		long UTF8_STRING;
		long COMPOUND_STRING;

		boolean hasEWMH;

		final Xf86vidmode vidmode = new Xf86vidmode();
		final Xrandr      randr   = new Xrandr();
		final XI2         xi      = new XI2();
		final Xkb         xkb     = new Xkb();

		final Saver saver = new Saver();

		final Selection selection = new Selection();

		final Joystick[] joystick = new Joystick[GLFW_JOYSTICK_LAST + 1];

		final int[] keyCodeLUT = new int[256];

		X11() {
			for ( int i = 0; i < joystick.length; i++ )
				joystick[i] = new Joystick();
		}

	}

	static class Xf86vidmode {

		boolean available;

		IntBuffer eventBase = createIntBuffer(1);
		IntBuffer errorBase = createIntBuffer(1);

	}

	static class Xrandr {

		boolean available;

		IntBuffer eventBase = createIntBuffer(1);
		IntBuffer errorBase = createIntBuffer(1);

		IntBuffer versionMajor = createIntBuffer(1);
		IntBuffer versionMinor = createIntBuffer(1);

		boolean gammaBroken;

	}

	static class XI2 {

		boolean available;

		IntBuffer eventBase = createIntBuffer(1);
		IntBuffer errorBase = createIntBuffer(1);

		IntBuffer majorOpcode = createIntBuffer(1);

		IntBuffer versionMajor = createIntBuffer(1);
		IntBuffer versionMinor = createIntBuffer(1);

	}

	static class Xkb {

		boolean available;

		IntBuffer eventBase = createIntBuffer(1);
		IntBuffer errorBase = createIntBuffer(1);

		IntBuffer majorOpcode = createIntBuffer(1);

		IntBuffer versionMajor = createIntBuffer(1);
		IntBuffer versionMinor = createIntBuffer(1);

	}

	static class Selection {

		LongBuffer formats = createLongBuffer(_GLFW_CLIPBOARD_FORMAT_COUNT);
		long property;

		String string;

	}

	static class _GLX {

		IntBuffer eventBase = createIntBuffer(1);
		IntBuffer errorBase = createIntBuffer(1);

		IntBuffer versionMajor = createIntBuffer(1);
		IntBuffer versionMinor = createIntBuffer(1);

		long QueryExtensionsString;
		long ChooseFBConfig;
		long GetVisualFromFBConfig;
		long CreateNewContext;

		long SwapIntervalEXT;
		long SwapIntervalSGI;

		long SwapIntervalMESA;
		long GetFBConfigAttribSGIX;
		long ChooseFBConfigSGIX;
		long CreateContextWithConfigSGIX;
		long GetVisualFromFBConfigSGIX;
		long CreateContextAttribsARB;

		boolean EXT_swap_control;
		boolean SGI_swap_control;
		boolean MESA_swap_control;
		boolean SGIX_fbconfig;
		boolean ARB_multisample;
		boolean ARB_framebuffer_sRGB;
		boolean ARB_create_context;
		boolean ARB_create_context_robustness;
		boolean ARB_create_context_profile;
		boolean EXT_create_context_es2_profile;
	}

	static class Saver {

		boolean changed;

		IntBuffer buffer = createIntBuffer(4);

	}

	static class Joystick {

		boolean     present;
		int         fd;
		int         numAxes;
		int         numButtons;
		FloatBuffer axis;
		ByteBuffer  button;
		String      name;

	}

}