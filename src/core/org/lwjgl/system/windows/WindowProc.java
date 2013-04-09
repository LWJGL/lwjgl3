package org.lwjgl.system.windows;

import java.lang.reflect.Method;

import static org.lwjgl.system.windows.WinUser.*;

/**
 * Instances of this class may be used as {@code WNDPROC} implementations.
 * <p/>
 * The default callback address ({@link #CALLBACK}) requires that the window instance has a {@code jobject} reference at index 0 of the extra window bytes. That
 * reference must point to an instance of this class. The instance can be associated with the window using {@link WinUser#SetWindowLongPtr} or, preferably,
 * with {@link WinUser#CreateWindowEx} using the {@code param} argument. LWJGL will intercept {@link WinUser#WM_NCCREATE} and call {@link WinUser#SetWindowLongPtr}
 * with the value that finds at {@code lpCreateParams} in the {@code CREATESTRUCT} struct. If LWJGL does not find a {@code jobject} reference,
 * {@link WinUser#DefWindowProc} will be called instead.
 * <p/>
 * Alternative {@code WNDPROC} function addresses and implementations may be set up using the utility methods in this class. The non-static versions have the
 * same requirements described above. The static versions have no requirements, but are obviously less flexible. LWJGL does not use any of the alternative
 * callback functions.
 */
public class WindowProc {

	/** The default WNDPROC function address. */
	public static final long CALLBACK;

	static {
		try {
			CALLBACK = setCallback(WindowProc.class.getMethod("invoke", long.class, int.class, long.class, long.class));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static native long setCallback(Method callback);

	/**
	 * May be used to setup an alternative WNDPROC function. The WNDPROC may only be invoked from a JVM thread.
	 * <p/>
	 * The given {@code callback} method must have a signature that matches {@link #invoke(long, int, long, long)} and must be an instance method. The instance
	 * reference on which it will be called will be retrieved from index 0 of the HWND's extra window memory.
	 */
	public static native long setCallbackSync(Method callback);

	/**
	 * May be used to setup an alternative WNDPROC function. The WNDPROC may be invoked from any thread.
	 * <p/>
	 * The given {@code callback} method must have a signature that matches {@link #invoke(long, int, long, long)} and must be an instance method. The instance
	 * reference on which it will be called will be retrieved from index 0 of the HWND's extra window memory.
	 */
	public static native long setCallbackAsync(Method callback);

	/**
	 * May be used to setup an alternative WNDPROC function. The WNDPROC may only be invoked from a JVM thread.
	 * <p/>
	 * The given {@code callback} method must have a signature that matches {@link #invoke(long, int, long, long)} and must be a static method of the given
	 * {@code clazz}.
	 */
	public static native long setCallbackStaticSync(Class clazz, Method callback);

	/**
	 * May be used to setup an alternative WNDPROC function. The WNDPROC may be invoked from any thread.
	 * <p/>
	 * The given {@code callback} method must have a signature that matches {@link #invoke(long, int, long, long)} and must be a static method of the given
	 * {@code clazz}.
	 */
	public static native long setCallbackStaticAsync(Class clazz, Method callback);

	/**
	 * The application-defined function that processes messages sent to a window.
	 *
	 * @param hWnd   a handle to the window
	 * @param msg    the message
	 * @param wParam additional message information. The contents of this parameter depend on the value of the {@code msg} parameter.
	 * @param lParam additional message information. The contents of this parameter depend on the value of the {@code msg} parameter.
	 *
	 * @return the result of the message processing. Depends on the message sent.
	 */
	public long invoke(long hWnd, int msg, long wParam, long lParam) {
		return nDefWindowProc(hWnd, msg, wParam, lParam);
	}

}