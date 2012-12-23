package org.lwjgl.system.windows;

import org.lwjgl.Sys;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WinBase.*;
import static org.lwjgl.system.windows.WinUser.*;
import static org.lwjgl.system.windows.WindowsLibrary.*;
import static org.lwjgl.system.windows.WindowsPlatform.*;

public class WindowsDisplay {

	static {
		Sys.touch();
	}

	/** Handle to the default window proc. */
	public static final long DEF_WINDOW_PROC =
		GetProcAddress(
			GetModuleHandle(memEncodeUTF16("User32.dll")),
			memEncodeASCII("DefWindowProcW")
		);

	/** Handle to the LWJGL global window proc. */
	public static final long LWJGL_WINDOW_PROC;

	static {
		try {
			LWJGL_WINDOW_PROC = setJavaWindowProc(WindowsDisplay.class.getDeclaredMethod("windowProc", long.class, int.class, long.class, long.class));
		} catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		}

		if ( DEF_WINDOW_PROC == 0 )
			throw new RuntimeException("Failed to retrieve the default window proc.");

		if ( LWJGL_WINDOW_PROC == 0 )
			throw new RuntimeException("Failed to retrieve the LWJGL window proc.");
	}

	/** Each window created increments this integer. */
	private static final AtomicInteger WINDOW_ID = new AtomicInteger(0);

	private static final Map<Long, WindowsDisplay> windowMap = new HashMap<Long, WindowsDisplay>();

	private final int id;

	private final short classAtom;

	private final long hwnd;
	private final long hdc;

	private int x, y;
	private int width, height;

	private boolean closeRequested;

	public WindowsDisplay() {
		this("LWJGL");
	}

	public WindowsDisplay(final String title) {
		this.id = WINDOW_ID.incrementAndGet();

		final String className = "LWJGL" + id;

		final ByteBuffer in = WNDCLASSEX.malloc();

		WNDCLASSEX.sizeSet(in, WNDCLASSEX.SIZEOF);
		WNDCLASSEX.styleSet(in, CS_OWNDC); // CS_HREDRAW | CS_VREDRAW
		WNDCLASSEX.wndProcSet(in, LWJGL_WINDOW_PROC);
		WNDCLASSEX.clsExtraSet(in, 0);
		WNDCLASSEX.wndExtraSet(in, 0);
		WNDCLASSEX.instanceSet(in, HINSTANCE);
		WNDCLASSEX.iconSet(in, nLoadIcon(0, IDI_APPLICATION));
		WNDCLASSEX.cursorSet(in, nLoadCursor(0, IDC_ARROW));
		WNDCLASSEX.backgroundSet(in, 0);
		WNDCLASSEX.menuNameSet(in, 0);
		WNDCLASSEX.classNameSet(in, className);
		WNDCLASSEX.iconSmSet(in, 0);

		this.classAtom = RegisterClassEx(in);
		windowsCheckHandle(classAtom, "Failed to register window class");

		hwnd = CreateWindowEx(
			WS_EX_APPWINDOW,
			className,
			title,
			// WS_OVERLAPPEDWINDOW == WS_OVERLAPPED | WS_CAPTION | WS_SYSMENU | WS_THICKFRAME | WS_MINIMIZEBOX | WS_MAXIMIZEBOX
			WS_OVERLAPPEDWINDOW | WS_CLIPCHILDREN | WS_CLIPSIBLINGS, // CLIP CHILDREN & SIBLINGS are required for OpenGL windows
			0, 0, 640, 480,
			0, 0, HINSTANCE, 0
		);
		windowsCheckHandle(hwnd, "Failed to create window");

		windowMap.put(hwnd, this);

		hdc = GetDC(hwnd);
		windowsCheckHandle(hdc, "Failed to get device context handle.");
	}

	public long getHwnd() {
		return hwnd;
	}

	public long getHdc() {
		return hdc;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setLocation(final int x, final int y) {
		windowsCheckResult(
			SetWindowPos(hwnd, 0, x, y, width, height, SWP_NOOWNERZORDER | SWP_NOSIZE),
			"SetWindowPos"
		);
		this.x = x;
		this.y = y;
	}

	public void setSize(final int width, final int height) {
		windowsCheckResult(
			SetWindowPos(hwnd, 0, x, y, width, height, SWP_NOOWNERZORDER | SWP_NOMOVE),
			"SetWindowPos"
		);

		this.width = width;
		this.height = height;
	}

	public void setVisible(final boolean visible) {
		ShowWindow(hwnd, visible ? SW_SHOW : SW_HIDE);
	}

	public void destroy() {
		windowsCheckResult(DestroyWindow(hwnd), "DestroyWindow");
	}

	public boolean isCloseRequested() {
		return closeRequested;
	}

	private static long windowProc(
		final long window, final int msg, final long wParam, final long lParam
	) {
		//System.out.println("In WINDOW PROC: " + Integer.toHexString(msg) + " - " +wParam + " - " +lParam);

		switch ( msg ) {
			case WM_QUIT:
				System.out.println("\tQUIT!");
				windowMap.get(window).closeRequested = true;
				return 0;
			case WM_SYSCOMMAND:
				switch ( (int)(wParam & 0xfff0) ) {
					case SC_KEYMENU:
					case SC_MOUSEMENU:
					case SC_SCREENSAVE:
					case SC_MONITORPOWER:
						return 0;
					case SC_CLOSE:
						System.out.println("\tSC_CLOSE!");
						windowMap.get(window).closeRequested = true;
						return 0;
					default:
						break;
				}
				break;
		}
		return DefWindowProc(window, msg, wParam, lParam);
	}

	private static native long setJavaWindowProc(Method method);

}