/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

import org.lwjgl.BufferUtils;
import org.lwjgl.Pointer;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.glfw.GLFW;
import org.lwjgl.system.windows.*;
import org.lwjgl.system.windows.opengl.WindowsGLContext;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;

import static org.lwjgl.BufferUtils.*;
import static org.lwjgl.opengl.WGLARBCreateContext.*;
import static org.lwjgl.opengl.WGLARBCreateContextProfile.*;
import static org.lwjgl.opengl.WGLARBCreateContextRobustness.*;
import static org.lwjgl.opengl.WGLARBFramebufferSRGB.*;
import static org.lwjgl.opengl.WGLARBMultisample.*;
import static org.lwjgl.opengl.WGLARBPixelFormat.*;
import static org.lwjgl.opengl.WGLEXTSwapControl.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MathUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.jglfw.InputUtil.*;
import static org.lwjgl.system.jglfw.JGLFW.*;
import static org.lwjgl.system.jglfw.JGLFWUtil.*;
import static org.lwjgl.system.jglfw.WindowUtil.*;
import static org.lwjgl.system.windows.Dwmapi.*;
import static org.lwjgl.system.windows.User32.*;
import static org.lwjgl.system.windows.WGL.*;
import static org.lwjgl.system.windows.WinBase.*;
import static org.lwjgl.system.windows.WinGDI.*;
import static org.lwjgl.system.windows.WinUser.*;

class PlatformWin implements Platform<GLFWwindowWin> {

	private static final int
		_GLFW_RECREATION_NOT_NEEDED = 0,
		_GLFW_RECREATION_REQUIRED   = 1,
		_GLFW_RECREATION_IMPOSSIBLE = 2;

	private static final ByteBuffer DISPLAY = memEncodeUTF16("DISPLAY");

	private static final String GLFW_WNDCLASSNAME = "GLFW30";

	private long classAtom;

	private int foregroundLockTimeout;

	private FunctionProvider user32;
	private FunctionProvider dwmapi;

	private User32.Functions user32Funcs;
	private Dwmapi.Functions dwmapiFuncs;

	private final TimerWin timer = new TimerWin();

	private ThreadLocal<GLFWwindowWin> currentWindow = new ThreadLocal<GLFWwindowWin>();

	@Override
	public boolean init() {
		APIBuffer __buffer = apiBuffer();
		SystemParametersInfo(SPI_GETFOREGROUNDLOCKTIMEOUT, 0, __buffer.address(), 0);
		foregroundLockTimeout = __buffer.intValue(0);
		SystemParametersInfo(SPI_GETFOREGROUNDLOCKTIMEOUT, 0, NULL, SPIF_SENDCHANGE);

		if ( !initLibraries() )
			return false;

		if ( user32Funcs.SetProcessDPIAware != NULL )
			SetProcessDPIAware(user32Funcs.SetProcessDPIAware);

		timer.init();

		initJoysticks();

		return true;
	}

	@Override
	public void terminate() {
		terminateJoysticks();

		freeLibraries();

		// Restore previous FOREGROUNDLOCKTIMEOUT system setting
		SystemParametersInfo(SPI_GETFOREGROUNDLOCKTIMEOUT, 0, mathUIntToPtr(foregroundLockTimeout), SPIF_SENDCHANGE);
	}

	private void freeLibraries() {
		if ( dwmapi != null ) {
			dwmapi.destroy();
			dwmapi = null;
			dwmapiFuncs = null;
		}

		if ( user32 != null ) {
			user32.destroy();
			user32 = null;
			user32Funcs = null;
		}
	}

	@Override
	public List<GLFWmonitor> getMonitors() {
		List<GLFWmonitor> monitors = new ArrayList<GLFWmonitor>(4);

		ByteBuffer adapter = DISPLAY_DEVICE.malloc();
		ByteBuffer device = DISPLAY_DEVICE.malloc();

		int devNum = 0;
		while ( true ) {
			adapter.clear();
			zeroBuffer(adapter);
			DISPLAY_DEVICE.cbSet(adapter, DISPLAY_DEVICE.SIZEOF);
			if ( EnumDisplayDevices((ByteBuffer)null, devNum, adapter, 0) == FALSE )
				break;

			devNum++;

			int adapterStateFlags = DISPLAY_DEVICE.StateFlagsGet(adapter);
			if ( (adapterStateFlags & DISPLAY_DEVICE_MIRRORING_DRIVER) != 0 || (adapterStateFlags & DISPLAY_DEVICE_ACTIVE) == 0 )
				continue;

			// Move struct pointer to the device name
			adapter.position(DISPLAY_DEVICE.DEVICENAME);

			// Get monitor name
			device.clear();
			zeroBuffer(device);
			DISPLAY_DEVICE.cbSet(device, DISPLAY_DEVICE.SIZEOF);
			EnumDisplayDevices(adapter, 0, device, 0);
			// Move struct pointer to the device string
			device.position(DISPLAY_DEVICE.DEVICESTRING);

			long dc = CreateDC(DISPLAY, adapter, null, null);

			GLFWmonitor monitor = new GLFWmonitor(
				memDecodeUTF16(adapter, memStrLen2(adapter)), // Example: "\\.\DISPLAY1"
				memDecodeUTF16(device, memStrLen2(device)), // Example  : "Dell U2410(DP)"
				GetDeviceCaps(dc, HORZSIZE),
				GetDeviceCaps(dc, VERTSIZE)
			);

			DeleteDC(dc);

			monitors.add(
				(adapterStateFlags & DISPLAY_DEVICE_PRIMARY_DEVICE) != 0 ? 0 : monitors.size(),
				monitor
			);
		}

		return monitors;
	}

	@Override
	public String getVersionString() {
		return "3.0.0 Win32";
	}

	@Override
	public void getMonitorPos(GLFWmonitor monitor, IntBuffer xpos, IntBuffer ypos) {
		ByteBuffer settings = DEVMODE.malloc();
		DEVMODE.sizeSet(settings, DEVMODE.SIZEOF);

		EnumDisplaySettingsEx(memEncodeUTF16(monitor.getName()), ENUM_CURRENT_SETTINGS, settings, EDS_ROTATEDMODE);

		if ( xpos != null )
			xpos.put(xpos.position(), DEVMODE.positionXGet(settings));

		if ( ypos != null )
			ypos.put(ypos.position(), DEVMODE.positionYGet(settings));
	}

	@Override
	public List<GLFWvidmode> getVideoModes(GLFWmonitor monitor) {
		List<GLFWvidmode> vidmodes = new ArrayList<GLFWvidmode>(64);

		ByteBuffer monitorName = memEncodeUTF16(monitor.getName());

		int modeIndex = 0;
		while ( true ) {
			ByteBuffer dm = DEVMODE.malloc();
			DEVMODE.sizeSet(dm, DEVMODE.SIZEOF);

			if ( EnumDisplaySettings(monitorName, modeIndex, dm) == FALSE )
				break;

			modeIndex++;

			int bpp = DEVMODE.bitsPerPelGet(dm);
			if ( bpp < 15 ) // Skip modes with less than 15 BPP
				continue;

			GLFWvidmode mode = new GLFWvidmode(
				DEVMODE.pelsWidthGet(dm),
				DEVMODE.pelsHeightGet(dm),
				bpp
			);

			if ( vidmodes.contains(mode) ) // This is a duplicate, so skip it
				continue;

			vidmodes.add(mode);
		}

		return vidmodes;
	}

	@Override
	public GLFWvidmode getVideoMode(GLFWmonitor monitor) {
		APIBuffer __buffer = apiBuffer();
		ByteBuffer dm = __buffer.buffer();

		zeroMemory(dm, DEVMODE.SIZEOF);
		DEVMODE.sizeSet(dm, DEVMODE.SIZEOF);

		EnumDisplaySettings(monitor.getName(), ENUM_CURRENT_SETTINGS, dm);

		return new GLFWvidmode(DEVMODE.pelsWidthGet(dm), DEVMODE.pelsHeightGet(dm), DEVMODE.bitsPerPelGet(dm));
	}

	@Override
	public void getGammaRamp(GLFWmonitor monitor, ByteBuffer ramp) {
		long dc = CreateDC(DISPLAY, memEncodeUTF16(monitor.getName()), null, null);

		if ( GetDeviceGammaRamp(dc, memAddress(ramp)) == FALSE )
			System.err.println("GetDeviceGammaRamp failed.");

		DeleteDC(dc);
	}

	@Override
	public void setGammaRamp(GLFWmonitor monitor, ByteBuffer ramp) {
		long dc = CreateDC(DISPLAY, memEncodeUTF16(monitor.getName()), null, null);

		if ( SetDeviceGammaRamp(dc, memAddress(ramp)) == FALSE )
			System.err.println("SetDeviceGammaRamp failed.");

		DeleteDC(dc);
	}

	@Override
	public GLFWwindowWin createWindowInstance() {
		return new GLFWwindowWin(this);
	}

	@Override
	public boolean createWindow(GLFWwindowWin window, GLFWwndconfig wndconfig, GLFWfbconfig fbconfig) {
		if ( classAtom == NULL ) {
			classAtom = registerWindowClass();
			if ( classAtom == NULL )
				return false;
		}

		if ( window.monitor != null ) {
			if ( !setVideoMode(window.monitor, window.videoMode) )
				return false;
		}

		if ( !createWindowImpl(window, wndconfig, fbconfig) )
			return false;

		int status = analyzeContext(window, wndconfig, fbconfig);

		if ( status == _GLFW_RECREATION_IMPOSSIBLE )
			return false;

		if ( status == _GLFW_RECREATION_REQUIRED ) {
			// Some window hints require us to re-create the context using WGL
			// extensions retrieved through the current context, as we cannot check
			// for WGL extensions or retrieve WGL entry points before we have a
			// current context (actually until we have implicitly loaded the ICD)

			// Yes, this is strange, and yes, this is the proper way on Win32

			// As Windows only allows you to set the pixel format once for a
			// window, we need to destroy the current window and create a new one
			// to be able to use the new pixel format

			// Technically, it may be possible to keep the old window around if
			// we're just creating an OpenGL 3.0+ context with the same pixel
			// format, but it's not worth the added code complexity

			// First we clear the current context (the one we just created)
			// This is usually done by glfwDestroyWindow, but as we're not doing
			// full window destruction, it's duplicated here
			makeContextCurrent(null);

			// Next destroy the Win32 window and WGL context (without resetting or
			// destroying the GLFW window object)
			destroyWindowImpl(window);

			// ...and then create them again, this time with better APIs
			if ( !createWindowImpl(window, wndconfig, fbconfig) )
				return false;
		}

		return true;
	}

	@Override
	public void swapBuffers(GLFWwindowWin window) {
		SwapBuffers(window.dc);
	}

	@Override
	public void swapInterval(int interval) {
		GLFWwindowWin window = currentWindow.get();

		if ( isCompositionEnabled() ) {
			// Don't enable vsync when desktop compositing is enabled, as it leads to frame jitter
			return;
		}

		if ( window.EXT_swap_control )
			wglSwapIntervalEXT(interval);
	}

	@Override
	public void showWindow(GLFWwindowWin window) {
		ShowWindow(window.handle, SW_SHOWNORMAL);
		BringWindowToTop(window.handle);
		SetForegroundWindow(window.handle);
		SetFocus(window.handle);
	}

	@Override
	public void hideWindow(GLFWwindowWin window) {
	}

	@Override
	public GLFWwindowWin getCurrentContext() {
		return currentWindow.get();
	}

	@Override
	public void makeContextCurrent(GLFWwindowWin window) {
		if ( window != null )
			wglMakeCurrent(window.dc, window.context.getHandle());
		else
			wglMakeCurrent(NULL, NULL);

		currentWindow.set(window);
	}

	@Override
	public void destroyWindow(GLFWwindowWin window) {
		destroyWindowImpl(window);

		if ( window.monitor != null )
			restoreVideoMode(window.monitor);
	}

	@Override
	public void setWindowTitle(GLFWwindowWin window, CharSequence title) {
		SetWindowText(window.handle, title);
	}

	@Override
	public void getWindowPos(GLFWwindowWin window, IntBuffer xpos, IntBuffer ypos) {
		APIBuffer __buffer = apiBuffer();
		nClientToScreen(window.handle, __buffer.address());

		if ( xpos != null )
			xpos.put(xpos.position(), POINT.xGet(__buffer.buffer()));

		if ( ypos != null )
			ypos.put(ypos.position(), POINT.yGet(__buffer.buffer()));
	}

	@Override
	public void setWindowPos(GLFWwindowWin window, int xpos, int ypos) {
		APIBuffer __buffer = apiBuffer();
		ByteBuffer rect = __buffer.buffer();

		RECT.leftSet(rect, xpos);
		RECT.topSet(rect, ypos);
		RECT.rightSet(rect, xpos);
		RECT.bottomSet(rect, ypos);

		AdjustWindowRectEx(rect, window.dwStyle, FALSE, window.dwExStyle);

		SetWindowPos(window.handle, NULL, RECT.leftGet(rect), RECT.topGet(rect), 0, 0, SWP_NOACTIVATE | SWP_NOZORDER | SWP_NOSIZE);
	}

	@Override
	public void getWindowSize(GLFWwindowWin window, IntBuffer width, IntBuffer height) {
		APIBuffer __buffer = apiBuffer();
		nGetClientRect(window.handle, __buffer.address());

		if ( width != null )
			width.put(width.position(), RECT.rightGet(__buffer.buffer()));

		if ( height != null )
			height.put(height.position(), RECT.bottomGet(__buffer.buffer()));
	}

	@Override
	public void setWindowSize(GLFWwindowWin window, int width, int height) {
		if ( window.monitor != null ) {
			setVideoMode(window.monitor, window.videoMode);
			GLFWvidmode mode = getVideoMode(window.monitor);

			SetWindowPos(window.handle, HWND_TOP, 0, 0, mode.width, mode.height, SWP_NOMOVE);
		} else {
			APIBuffer __buffer = apiBuffer();
			ByteBuffer rect = __buffer.buffer();

			getFullWindowSize(window, width, height, rect);

			int fullWidth = RECT.rightGet(rect) - RECT.leftGet(rect);
			int fullHeight = RECT.bottomGet(rect) - RECT.topGet(rect);

			SetWindowPos(window.handle, HWND_TOP, 0, 0, fullWidth, fullHeight, SWP_NOOWNERZORDER | SWP_NOMOVE | SWP_NOZORDER);
		}
	}

	@Override
	public void iconifyWindow(GLFWwindowWin window) {
		ShowWindow(window.handle, SW_MINIMIZE);
	}

	@Override
	public void restoreWindow(GLFWwindowWin window) {
		ShowWindow(window.handle, SW_RESTORE);
	}

	@Override
	public void pollEvents() {
		APIBuffer __buffer = apiBuffer();

		GLFWwindowWin window = (GLFWwindowWin)focusedWindow;
		if ( window != null ) {
			ByteBuffer rect = __buffer.buffer();
			GetClientRect(window.handle, rect);

			int width = RECT.rightGet(rect);
			int height = RECT.bottomGet(rect);

			window.cursorCentered = false;
			window.oldCursorX = width / 2;
			window.oldCursorY = height / 2;
		}

		ByteBuffer msg = __buffer.buffer();
		while ( PeekMessage(msg, NULL, 0, 0, PM_REMOVE) != 0 ) {
			if ( MSG.messageGet(msg) == WM_QUIT ) {
				// Treat WM_QUIT as a close on all windows

				for ( GLFWwindow w : windows )
					inputWindowCloseRequest(w);
			} else {
				TranslateMessage(msg);
				DispatchMessage(msg);
			}
		}

		window = (GLFWwindowWin)focusedWindow;
		if ( window != null ) {
			// LSHIFT/RSHIFT fixup (keys tend to "stick" without this fix)
			// This is the only async event handling in GLFW, but it solves some
			// nasty problems
			{
				// Get current state of left and right shift keys
				boolean lshift_up = ((GetAsyncKeyState(VK_LSHIFT) >> 15) & 1) == 0;
				boolean rshift_up = ((GetAsyncKeyState(VK_RSHIFT) >> 15) & 1) == 0;

				// See if this differs from our belief of what has happened
				// (we only have to check for lost key up events)
				if ( lshift_up && window.keys[GLFW.GLFW_KEY_LEFT_SHIFT] == 1 )
					inputKey(window, GLFW.GLFW_KEY_LEFT_SHIFT, GLFW.GLFW_RELEASE);

				if ( rshift_up && window.keys[GLFW.GLFW_KEY_RIGHT_SHIFT] == 1 )
					inputKey(window, GLFW.GLFW_KEY_RIGHT_SHIFT, GLFW.GLFW_RELEASE);
			}

			// Did the cursor move in an focused window that has captured the cursor
			if ( window.cursorMode == GLFW.GLFW_CURSOR_CAPTURED && !window.cursorCentered ) {
				ByteBuffer rect = __buffer.buffer();
				GetClientRect(window.handle, rect);

				int width = RECT.rightGet(rect);
				int height = RECT.bottomGet(rect);

				setCursorPos(window, width / 2, height / 2);
				window.cursorCentered = true;
			}
		}
	}

	@Override
	public void waitEvents() {
		WaitMessage();
		pollEvents();
	}

	@Override
	public void setCursorPos(GLFWwindowWin window, double centerPosX, double centerPosY) {
		APIBuffer __buffer = apiBuffer();
		ByteBuffer pos = __buffer.buffer();

		POINT.xSet(pos, (int)centerPosX);
		POINT.ySet(pos, (int)centerPosY);
		ClientToScreen(window.handle, pos);
		SetCursorPos(POINT.xGet(pos), POINT.yGet(pos));
	}

	@Override
	public void setCursorMode(GLFWwindowWin window, int mode) {
		switch ( mode ) {
			case GLFW.GLFW_CURSOR_NORMAL:
				showCursor(window);
				break;
			case GLFW.GLFW_CURSOR_HIDDEN:
				hideCursor(window);
				break;
			case GLFW.GLFW_CURSOR_CAPTURED:
				captureCursor(window);
				break;
		}
	}

	@Override
	public int getJoystickParam(int joy, int param) {
		// TODO: implement
		return -1;
	}

	@Override
	public int getJoystickAxes(int joy, FloatBuffer axes) {
		// TODO: implement
		return -1;
	}

	@Override
	public int getJoystickButtons(int joy, ByteBuffer buttons) {
		// TODO: implement
		return -1;
	}

	@Override
	public String getJoystickName(int joy) {
		// TODO: implement
		return "";
	}

	@Override
	public void setClipboardString(GLFWwindowWin window, CharSequence string) {
		int bytes = string.length() * 2 + 2;

		long stringHandle = GlobalAlloc(GMEM_MOVEABLE, bytes);
		if ( stringHandle == NULL ) {
			inputError(GLFW_PLATFORM_ERROR, "Win32: Failed to allocate global handle for clipboard");
			return;
		}

		ByteBuffer handleBuffer = memByteBuffer(GlobalLock(stringHandle), bytes);
		memEncodeUTF16(string, true, handleBuffer);
		GlobalUnlock(stringHandle);

		if ( OpenClipboard(window.handle) == FALSE ) {
			GlobalFree(stringHandle);
			inputError(GLFW_PLATFORM_ERROR, "Win32: Failed to open clipboard");
			return;
		}

		EmptyClipboard();
		SetClipboardData(CF_UNICODETEXT, stringHandle);
		CloseClipboard();
	}

	@Override
	public String getClipboardString(GLFWwindowWin window) {
		if ( IsClipboardFormatAvailable(CF_UNICODETEXT) == FALSE ) {
			inputError(GLFW_FORMAT_UNAVAILABLE, null);
			return null;
		}

		if ( OpenClipboard(window.handle) == FALSE ) {
			inputError(GLFW_PLATFORM_ERROR, "Win32: Failed to open clipboard");
			return null;
		}

		long stringHandle = GetClipboardData(CF_UNICODETEXT);
		if ( stringHandle == NULL ) {
			CloseClipboard();

			inputError(GLFW_PLATFORM_ERROR, "Win32: Failed to retrieve clipboard data");
			return null;
		}

		String string = memDecodeUTF16(memByteBufferNT2(GlobalLock(stringHandle)));

		GlobalUnlock(stringHandle);
		CloseClipboard();

		return string;
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

	private boolean initLibraries() {
		try {
			user32 = new WindowsFunctionProvider("user32.dll");
		} catch (Exception e) {
			// ignore silently
			user32 = new DummyFunctionProvider();
		}

		try {
			dwmapi = new WindowsFunctionProvider("dwmapi.dll");
		} catch (Exception e) {
			// ignore silently
			dwmapi = new DummyFunctionProvider();
		}

		user32Funcs = new User32.Functions(user32);
		dwmapiFuncs = new Dwmapi.Functions(dwmapi);

		return true;
	}

	private void initJoysticks() {
	}

	private void terminateJoysticks() {
	}

	private boolean createWindowImpl(GLFWwindowWin window, GLFWwndconfig wndconfig, GLFWfbconfig fbconfig) {
		window.dwStyle = WS_CLIPSIBLINGS | WS_CLIPCHILDREN;
		window.dwExStyle = WS_EX_APPWINDOW;

		int xpos, ypos, fullWidth, fullHeight;

		if ( window.monitor != null ) {
			window.dwStyle |= WS_POPUP;

			IntBuffer xposOut = BufferUtils.createIntBuffer(1);
			IntBuffer yposOut = BufferUtils.createIntBuffer(1);

			getMonitorPos(wndconfig.monitor, xposOut, yposOut);

			xpos = xposOut.get(0);
			ypos = yposOut.get(0);

			fullWidth = wndconfig.width;
			fullHeight = wndconfig.height;
		} else {
			window.dwStyle |= WS_CAPTION | WS_SYSMENU | WS_MINIMIZEBOX;

			if ( wndconfig.resizable ) {
				window.dwStyle |= WS_MAXIMIZEBOX | WS_SIZEBOX;
				window.dwExStyle |= WS_EX_WINDOWEDGE;
			}

			xpos = CW_USEDEFAULT;
			ypos = CW_USEDEFAULT;

			APIBuffer __buffer = apiBuffer();
			ByteBuffer rect = __buffer.buffer();

			getFullWindowSize(window, wndconfig.width, wndconfig.height, rect);

			fullWidth = RECT.rightGet(rect) - RECT.leftGet(rect);
			fullHeight = RECT.bottomGet(rect) - RECT.topGet(rect);
		}

		window.wndprocRef = memGlobalRefNew(window.wndproc);
		window.handle = CreateWindowEx(
			window.dwExStyle,
			GLFW_WNDCLASSNAME,
			wndconfig.title,
			window.dwStyle,
			xpos, ypos,
			fullWidth, fullHeight,
			NULL,
			NULL,
			nGetModuleHandle(NULL),
			window.wndprocRef
		);

		if ( window.handle == NULL ) {
			memGlobalRefDelete(window.wndprocRef);
			inputError(GLFW.GLFW_PLATFORM_ERROR, "Win32: Failed to create window");
			return false;
		}

		ByteBuffer cursorPos = POINT.malloc();
		GetCursorPos(cursorPos);
		ScreenToClient(window.handle, cursorPos);
		window.cursorPosX = window.oldCursorX = POINT.xGet(cursorPos);
		window.cursorPosY = window.oldCursorY = POINT.yGet(cursorPos);

		if ( !createContext(window, wndconfig, fbconfig) )
			return false;

		return true;
	}

	private static long registerWindowClass() {
		long moduleHandle = nGetModuleHandle(NULL);
		long icon = LoadIcon(moduleHandle, "GLFW_ICON");
		if ( icon == NULL )
			icon = nLoadIcon(moduleHandle, IDI_WINLOGO);

		ByteBuffer in = WNDCLASSEX.malloc(
			WNDCLASSEX.SIZEOF,
			CS_HREDRAW | CS_VREDRAW | CS_OWNDC, // Redraw on...
			WindowProc.CALLBACK, // Message handler
			0, // No extra class data
			Pointer.POINTER_SIZE + 4, // WNDPROC reference + reserver int
			moduleHandle,
			icon,
			nLoadCursor(NULL, IDC_ARROW),
			NULL,
			null,
			GLFW_WNDCLASSNAME,
			NULL
		);

		long classAtom = RegisterClassEx(in);
		if ( classAtom == NULL )
			inputError(GLFW.GLFW_PLATFORM_ERROR, "Win32: Failed to register window class");

		return classAtom;
	}

	boolean setVideoMode(GLFWmonitor monitor, GLFWvidmode mode) {
		GLFWvidmode best = chooseVideoMode(monitor, mode);
		GLFWvidmode current = getVideoMode(monitor);

		if ( current.equals(best) )
			return true;

		ByteBuffer dm = DEVMODE.malloc();

		DEVMODE.sizeSet(dm, DEVMODE.SIZEOF);
		DEVMODE.fieldsSet(dm, DM_PELSWIDTH | DM_PELSHEIGHT | DM_BITSPERPEL);
		DEVMODE.pelsWidthSet(dm, best.width);
		DEVMODE.pelsHeightSet(dm, best.height);

		int bpp = best.redBits + best.greenBits + best.blueBits;
		DEVMODE.bitsPerPelSet(dm, bpp < 15 || 24 <= bpp ? 32 : bpp);

		if ( ChangeDisplaySettingsEx(monitor.getName(), dm, NULL, CDS_FULLSCREEN, NULL) != DISP_CHANGE_SUCCESSFUL ) {
			inputError(GLFW.GLFW_PLATFORM_ERROR, "Win32: Failed to set video mode");
			return false;
		}

		return true;
	}

	private static void getFullWindowSize(GLFWwindowWin window, int clientWidth, int clientHeight, ByteBuffer rect) {
		RECT.leftSet(rect, 0);
		RECT.topSet(rect, 0);
		RECT.rightSet(rect, clientWidth);
		RECT.bottomSet(rect, clientHeight);

		AdjustWindowRectEx(rect, window.dwStyle, FALSE, window.dwExStyle);
	}

	private static int setWGLattrib(IntBuffer attribs, int index, int attribName, int attribValue) {
		attribs.put(index++, attribName);
		attribs.put(index++, attribValue);

		return index;
	}

	private boolean createContext(GLFWwindowWin window, GLFWwndconfig wndconfig, GLFWfbconfig fbconfig) {
		long share = wndconfig.share == null ? NULL : wndconfig.share.<GLFWwindowWin>asPlatformWindow().context.getHandle();

		window.dc = GetDC(window.handle);
		if ( window.dc == NULL ) {
			inputError(GLFW.GLFW_PLATFORM_ERROR, "Win32: Failed to retrieve DC for window");
			return false;
		}

		IntBuffer attribs = null;
		int pixelFormat;
		ByteBuffer pfd = null;

		if ( window.ARB_pixel_format ) {
			int index = 0;
			IntBuffer count = BufferUtils.createIntBuffer(1);

			attribs = BufferUtils.createIntBuffer(40);

			setWGLattrib(attribs, index, WGL_SUPPORT_OPENGL_ARB, TRUE);
			setWGLattrib(attribs, index, WGL_DRAW_TO_WINDOW_ARB, TRUE);
			setWGLattrib(attribs, index, WGL_PIXEL_TYPE_ARB, WGL_TYPE_RGBA_ARB);
			setWGLattrib(attribs, index, WGL_DOUBLE_BUFFER_ARB, TRUE);

			if ( fbconfig.redBits != 0 )
				setWGLattrib(attribs, index, WGL_RED_BITS_ARB, fbconfig.redBits);
			if ( fbconfig.greenBits != 0 )
				setWGLattrib(attribs, index, WGL_GREEN_BITS_ARB, fbconfig.greenBits);
			if ( fbconfig.blueBits != 0 )
				setWGLattrib(attribs, index, WGL_BLUE_BITS_ARB, fbconfig.blueBits);
			if ( fbconfig.alphaBits != 0 )
				setWGLattrib(attribs, index, WGL_ALPHA_BITS_ARB, fbconfig.alphaBits);

			if ( fbconfig.depthBits != 0 )
				setWGLattrib(attribs, index, WGL_DEPTH_BITS_ARB, fbconfig.depthBits);
			if ( fbconfig.stencilBits != 0 )
				setWGLattrib(attribs, index, WGL_STENCIL_BITS_ARB, fbconfig.stencilBits);

			if ( fbconfig.auxBuffers != 0 )
				setWGLattrib(attribs, index, WGL_AUX_BUFFERS_ARB, fbconfig.auxBuffers);

			if ( fbconfig.accumRedBits != 0 )
				setWGLattrib(attribs, index, WGL_ACCUM_RED_BITS_ARB, fbconfig.accumRedBits);
			if ( fbconfig.accumGreenBits != 0 )
				setWGLattrib(attribs, index, WGL_ACCUM_GREEN_BITS_ARB, fbconfig.accumGreenBits);
			if ( fbconfig.accumBlueBits != 0 )
				setWGLattrib(attribs, index, WGL_ACCUM_BLUE_BITS_ARB, fbconfig.accumBlueBits);
			if ( fbconfig.accumAlphaBits != 0 )
				setWGLattrib(attribs, index, WGL_ACCUM_BLUE_BITS_ARB, fbconfig.accumAlphaBits);

			if ( fbconfig.stereo != 0 )
				setWGLattrib(attribs, index, WGL_STEREO_ARB, TRUE);

			if ( window.ARB_multisample ) {
				if ( fbconfig.samples != 0 ) {
					setWGLattrib(attribs, index, WGL_SAMPLE_BUFFERS_ARB, 1);
					setWGLattrib(attribs, index, WGL_SAMPLES_ARB, fbconfig.samples);
				}
			}

			if ( window.ARB_framebuffer_sRGB ) {
				if ( fbconfig.sRGB )
					setWGLattrib(attribs, index, WGL_FRAMEBUFFER_SRGB_CAPABLE_ARB, TRUE);
			}

			setWGLattrib(attribs, index, 0, 0);

			IntBuffer pixelFormatOut = BufferUtils.createIntBuffer(1);
			if ( wglChoosePixelFormatARB(window.dc, attribs, null, pixelFormatOut, count) == FALSE ) {
				inputError(GLFW.GLFW_PLATFORM_ERROR, "WGL: Failed to find a suitable pixel format");
				return false;
			}

			pixelFormat = pixelFormatOut.get(0);
		} else {
			pfd = PIXELFORMATDESCRIPTOR.malloc();
			PIXELFORMATDESCRIPTOR.sizeSet(pfd, PIXELFORMATDESCRIPTOR.SIZEOF);
			PIXELFORMATDESCRIPTOR.versionSet(pfd, 1);

			int flags = PFD_DRAW_TO_WINDOW | PFD_SUPPORT_OPENGL | PFD_DOUBLEBUFFER;
			PIXELFORMATDESCRIPTOR.flagsSet(pfd, PFD_DRAW_TO_WINDOW | PFD_SUPPORT_OPENGL | PFD_DOUBLEBUFFER);

			if ( fbconfig.stereo != 0 )
				flags |= PFD_STEREO;

			PIXELFORMATDESCRIPTOR.flagsSet(pfd, flags);

			PIXELFORMATDESCRIPTOR.pixelTypeSet(pfd, PFD_TYPE_RGBA);
			PIXELFORMATDESCRIPTOR.colorBitsSet(pfd, fbconfig.redBits + fbconfig.greenBits + fbconfig.blueBits);
			PIXELFORMATDESCRIPTOR.alphaBitsSet(pfd, fbconfig.alphaBits);
			PIXELFORMATDESCRIPTOR.accumBitsSet(pfd, fbconfig.accumRedBits + fbconfig.accumGreenBits + fbconfig.accumBlueBits);
			PIXELFORMATDESCRIPTOR.depthBitsSet(pfd, fbconfig.depthBits);
			PIXELFORMATDESCRIPTOR.stencilBitsSet(pfd, fbconfig.stencilBits);
			PIXELFORMATDESCRIPTOR.auxBuffersSet(pfd, fbconfig.auxBuffers);

			pixelFormat = ChoosePixelFormat(window.dc, pfd);
			if ( pixelFormat == 0 ) {
				inputError(GLFW.GLFW_PLATFORM_ERROR, "WGL: Failed to find a suitable pixel format");
				return false;
			}
		}

		if ( DescribePixelFormat(window.dc, pixelFormat, pfd) == FALSE ) {
			inputError(GLFW.GLFW_PLATFORM_ERROR, "Win32: Failed to retrieve PFD for selected pixel format");
			return false;
		}

		int flags = PIXELFORMATDESCRIPTOR.flagsGet(pfd);
		if ( (flags & PFD_GENERIC_ACCELERATED) == 0 && (flags & PFD_GENERIC_FORMAT) != 0 ) {
			inputError(GLFW.GLFW_PLATFORM_ERROR, "Win32: Failed to find an accelerated pixel format");
			return false;
		}

		if ( SetPixelFormat(window.dc, pixelFormat, pfd) == FALSE ) {
			inputError(GLFW.GLFW_PLATFORM_ERROR, "Win32: Failed to set selected pixel format");
			return false;
		}

		long context;
		if ( window.ARB_create_context ) {
			int index = 0, mask = 0, strategy = 0;
			flags = 0;

			if ( wndconfig.glForward )
				flags |= WGL_CONTEXT_FORWARD_COMPATIBLE_BIT_ARB;

			if ( wndconfig.glDebug )
				flags |= WGL_CONTEXT_DEBUG_BIT_ARB;

			if ( wndconfig.glProfile != 0 ) {
				if ( wndconfig.glProfile == GLFW.GLFW_OPENGL_CORE_PROFILE )
					mask |= WGL_CONTEXT_CORE_PROFILE_BIT_ARB;
				else if ( wndconfig.glProfile == GLFW.GLFW_OPENGL_COMPAT_PROFILE )
					mask |= WGL_CONTEXT_COMPATIBILITY_PROFILE_BIT_ARB;
			}

			if ( wndconfig.glRobustness != 0 ) {
				if ( window.ARB_create_context_robustness ) {
					if ( wndconfig.glRobustness == GLFW.GLFW_NO_RESET_NOTIFICATION )
						strategy = WGL_NO_RESET_NOTIFICATION_ARB;
					else if ( wndconfig.glRobustness == GLFW.GLFW_LOSE_CONTEXT_ON_RESET )
						strategy = WGL_LOSE_CONTEXT_ON_RESET_ARB;

					flags |= WGL_CONTEXT_ROBUST_ACCESS_BIT_ARB;
				}
			}

			if ( wndconfig.glMajor != 1 || wndconfig.glMinor != 0 ) {
				setWGLattrib(attribs, index, WGL_CONTEXT_MAJOR_VERSION_ARB, wndconfig.glMajor);
				setWGLattrib(attribs, index, WGL_CONTEXT_MINOR_VERSION_ARB, wndconfig.glMinor);
			}

			if ( flags != 0 )
				setWGLattrib(attribs, index, WGL_CONTEXT_FLAGS_ARB, flags);

			if ( mask != 0 )
				setWGLattrib(attribs, index, WGL_CONTEXT_PROFILE_MASK_ARB, mask);

			if ( strategy != 0 )
				setWGLattrib(attribs, index, WGL_CONTEXT_RESET_NOTIFICATION_STRATEGY_ARB, strategy);

			setWGLattrib(attribs, index, 0, 0);

			context = wglCreateContextAttribsARB(window.dc, share, attribs);
			if ( context == NULL ) {
				inputError(GLFW.GLFW_VERSION_UNAVAILABLE, "WGL: Failed to create OpenGL context");
				return false;
			}
		} else {
			context = wglCreateContext(window.dc);
			if ( context == NULL ) {
				inputError(GLFW.GLFW_PLATFORM_ERROR, "WGL: Failed to create OpenGL context");
				return false;
			}

			if ( share != NULL ) {
				if ( wglShareLists(share, context) == FALSE ) {
					inputError(GLFW.GLFW_PLATFORM_ERROR, "WGL: Failed to enable sharing with specified OpenGL context");
					return false;
				}
			}
		}

		//makeContextCurrent(window);
		wglMakeCurrent(window.dc, context);
		currentWindow.set(window);
		window.context = new WindowsGLContext(GL.createCapabilities(window.glForward), window.dc, context);

		initWGLExtensions(window);

		return true;
	}

	private static void initWGLExtensions(GLFWwindowWin window) {
		ContextCapabilities caps = window.context.getCapabilities();

		if ( !(caps.WGL_ARB_extensions_string || caps.WGL_EXT_extensions_string) )
			return;

		window.ARB_multisample = caps.WGL_ARB_multisample;
		window.ARB_framebuffer_sRGB = caps.WGL_ARB_framebuffer_sRGB || caps.WGL_EXT_framebuffer_sRGB;

		window.ARB_create_context = caps.WGL_ARB_create_context;
		window.ARB_create_context_profile = caps.WGL_ARB_create_context_profile;

		window.EXT_create_context_es2_profile = caps.WGL_EXT_create_context_es_profile;

		window.ARB_create_context_robustness = caps.WGL_ARB_create_context_robustness;

		window.EXT_swap_control = caps.WGL_EXT_swap_control;

		window.ARB_pixel_format = caps.WGL_ARB_pixel_format;
	}

	private static int analyzeContext(GLFWwindowWin window, GLFWwndconfig wndconfig, GLFWfbconfig fbconfig) {
		boolean required = false;

		if ( wndconfig.glForward ) {
			if ( !window.ARB_create_context ) {
				inputError(GLFW.GLFW_VERSION_UNAVAILABLE, "WGL: A forward compatible OpenGL context requested but WGL_ARB_create_context is unavailable");
				return _GLFW_RECREATION_IMPOSSIBLE;
			}

			required = true;
		}

		if ( wndconfig.glProfile != 0 ) {
			if ( !window.ARB_create_context_profile ) {
				inputError(GLFW.GLFW_VERSION_UNAVAILABLE, "WGL: OpenGL profile requested but WGL_ARB_create_context_profile is unavailable");
				return _GLFW_RECREATION_IMPOSSIBLE;
			}

			required = true;
		}

		if ( wndconfig.glMajor != 1 || wndconfig.glMinor != 0 ) {
			if ( window.ARB_create_context )
				required = true;
		}

		if ( wndconfig.glDebug ) {
			if ( window.ARB_create_context )
				required = true;
		}

		if ( fbconfig.samples > 0 ) {
			// We want FSAA, but can we get it?
			// FSAA is not a hard constraint, so otherwise we just don't care

			if ( window.ARB_multisample && window.ARB_pixel_format ) {
				// We appear to have both the extension and the means to ask for it
				required = true;
			}
		}

		if ( required )
			return _GLFW_RECREATION_REQUIRED;

		return _GLFW_RECREATION_NOT_NEEDED;
	}

	private static void destroyWindowImpl(GLFWwindowWin window) {
		destroyContext(window);

		if ( window.handle != NULL ) {
			DestroyWindow(window.handle);
			window.handle = NULL;
			memGlobalRefDelete(window.wndprocRef);
		}
	}

	private static void destroyContext(GLFWwindowWin window) {
		if ( window.context != null ) {
			window.context.destroy();
			window.context = null;
		}

		if ( window.dc != NULL ) {
			ReleaseDC(window.handle, window.dc);
			window.dc = NULL;
		}
	}

	static void restoreVideoMode(GLFWmonitor monitor) {
		ChangeDisplaySettingsEx(monitor.getName(), null, NULL, CDS_FULLSCREEN, NULL);
	}

	boolean isCompositionEnabled() {
		if ( dwmapiFuncs.DwmIsCompositionEnabled == NULL )
			return false;

		APIBuffer __buffer = apiBuffer();
		DwmIsCompositionEnabled(__buffer.buffer(), dwmapiFuncs.DwmIsCompositionEnabled);
		return __buffer.intValue(0) == WinError.S_OK;
	}

	static void updateClipRect(GLFWwindowWin window) {
		APIBuffer __buffer = apiBuffer();
		ByteBuffer clipRect = __buffer.buffer();

		GetClientRect(window.handle, clipRect);
		nClientToScreen(window.handle, __buffer.address() + RECT.LEFT);
		nClientToScreen(window.handle, __buffer.address() + RECT.RIGHT);
		ClipCursor(clipRect);
	}

	// Hide mouse cursor
	static void hideCursor(GLFWwindowWin window) {
		ReleaseCapture();
		ClipCursor(null);
		ShowCursor(TRUE);

		APIBuffer __buffer = apiBuffer();
		ByteBuffer pos = __buffer.buffer();
		if ( GetCursorPos(pos) != 0 ) {
			if ( WindowFromPoint(pos) == window.handle )
				SetCursor(NULL);
		}
	}

	// Capture mouse cursor
	static void captureCursor(GLFWwindowWin window) {
		ShowCursor(FALSE);
		updateClipRect(window);
		SetCapture(window.handle);
	}

	// Show mouse cursor
	static void showCursor(GLFWwindowWin window) {
		ReleaseCapture();
		ClipCursor(null);
		ShowCursor(TRUE);

		APIBuffer __buffer = apiBuffer();
		ByteBuffer pos = __buffer.buffer();
		if ( GetCursorPos(pos) != 0 ) {
			if ( WindowFromPoint(pos) == window.handle )
				SetCursor(nLoadCursor(NULL, IDC_ARROW));
		}
	}

	private static class DummyFunctionProvider implements FunctionProvider {

		@Override
		public long getFunctionAddress(String functionName) {
			return NULL;
		}

		@Override
		public void destroy() {
		}

	}

}