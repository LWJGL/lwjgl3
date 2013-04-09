package org.lwjgl.system.windows;

import org.lwjgl.Sys;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

import static org.lwjgl.Pointer.*;
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

	static {
		if ( DEF_WINDOW_PROC == 0 )
			throw new RuntimeException("Failed to retrieve the default window proc.");
	}

	/** Each window created increments this integer. */
	private static final AtomicInteger WINDOW_ID = new AtomicInteger(0);

	private final int id;

	private final WindowProc wndProc;
	private final long       wndProcRef;

	private final short classAtom;

	private final long hwnd;
	private final long hdc;

	private final ByteBuffer windowPos;

	private boolean closeRequested;

	public WindowsDisplay() {
		this("LWJGL");
	}

	public WindowsDisplay(String title) {
		this(title, 640, 480);
	}

	public WindowsDisplay(String title, int width, int height) {
		this.id = WINDOW_ID.incrementAndGet();

		this.wndProc = new WindowProcImpl();
		this.wndProcRef = memGlobalRefNew(wndProc);

		this.windowPos = WINDOWPOS.malloc();
		WINDOWPOS.cxSet(windowPos, width);
		WINDOWPOS.cySet(windowPos, height);

		String className = "LWJGL" + id;

		ByteBuffer in = WNDCLASSEX.malloc(
			WNDCLASSEX.SIZEOF,
			CS_OWNDC /*| CS_HREDRAW | CS_VREDRAW*/,
			WindowProc.CALLBACK,
			0,
			POINTER_SIZE + 4, // WNDPROC reference + reserved int
			HINSTANCE,
			nLoadIcon(0, IDI_APPLICATION),
			nLoadCursor(0, IDC_ARROW),
			NULL,
			null,
			className,
			NULL
		);

		this.classAtom = RegisterClassEx(in);
		windowsCheckHandle(classAtom, "Failed to register window class");

		hwnd = CreateWindowEx(
			WS_EX_APPWINDOW,
			className,
			title,
			// WS_OVERLAPPEDWINDOW == WS_OVERLAPPED | WS_CAPTION | WS_SYSMENU | WS_THICKFRAME | WS_MINIMIZEBOX | WS_MAXIMIZEBOX
			WS_OVERLAPPEDWINDOW | WS_CLIPCHILDREN | WS_CLIPSIBLINGS, // CLIP CHILDREN & SIBLINGS are required for OpenGL windows
			0, 0, width, height,
			NULL, NULL, HINSTANCE, wndProcRef
		);
		windowsCheckHandle(hwnd, "Failed to create window");

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
		return WINDOWPOS.xGet(windowPos);
	}

	public int getY() {
		return WINDOWPOS.yGet(windowPos);
	}

	public int getWidth() {
		return WINDOWPOS.cxGet(windowPos);
	}

	public int getHeight() {
		return WINDOWPOS.cyGet(windowPos);
	}

	public void setLocation(int x, int y) {
		windowsCheckResult(
			SetWindowPos(hwnd, 0, x, y, WINDOWPOS.cxGet(windowPos), WINDOWPOS.cyGet(windowPos), SWP_NOOWNERZORDER | SWP_NOSIZE),
			"SetWindowPos"
		);
	}

	public void setSize(int width, int height) {
		windowsCheckResult(
			SetWindowPos(hwnd, 0, WINDOWPOS.xGet(windowPos), WINDOWPOS.yGet(windowPos), width, height, SWP_NOOWNERZORDER | SWP_NOMOVE),
			"SetWindowPos"
		);
	}

	public void setVisible(boolean visible) {
		ShowWindow(hwnd, visible ? SW_SHOW : SW_HIDE);
	}

	public void destroy() {
		windowsCheckResult(DestroyWindow(hwnd), "DestroyWindow");
		windowsCheckResult(UnregisterClass("LWJGL" + id, HINSTANCE), "UnregisterClass");

		memGlobalRefDelete(wndProcRef);
	}

	public boolean isCloseRequested() {
		return closeRequested;
	}

	private class WindowProcImpl extends WindowProc {

		public long invoke(long hWnd, int msg, long wParam, long lParam) {
			//System.out.println("In WINDOW PROC: " + Integer.toHexString(msg) + " - " +wParam + " - " +lParam);

			switch ( msg ) {
				case WM_QUIT:
					System.out.println("\tQUIT!");
					closeRequested = true;
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
							closeRequested = true;
							return 0;
						default:
							break;
					}
					break;
				case WM_WINDOWPOSCHANGED:
					memCopy(lParam, memAddress(windowPos), WINDOWPOS.SIZEOF);
					break;
			}

			return nDefWindowProc(hWnd, msg, wParam, lParam);
		}
	}

}