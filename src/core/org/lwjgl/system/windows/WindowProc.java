package org.lwjgl.system.windows;

import java.lang.reflect.Method;

import static org.lwjgl.system.APIUtil.*;

/**
 * Instances of this class may be used as {@code WNDPROC} implementations.
 * <p/>
 * The default callback address ({@link Util#CALLBACK}) requires that the window instance has a {@code jobject} reference at index 0 of the extra window
 * bytes. That reference must point to an instance of this class. The instance can be associated with the window using {@link WinUser#SetWindowLongPtr} or
 * preferably, with {@link WinUser#CreateWindowEx} using the {@code param} argument. LWJGL will intercept {@link WinUser#WM_NCCREATE} and call
 * {@link WinUser#SetWindowLongPtr} with the value that finds at {@code lpCreateParams} in the {@code CREATESTRUCT} struct. If LWJGL does not find a
 * {@code jobject} reference, {@link WinUser#DefWindowProc} will be called instead.
 * <p/>
 * Alternative {@code WNDPROC} function addresses and implementations may be set up using the utility methods in {@link Util}. The non-static version has the
 * same requirements described above. The static version has no requirements, but is obviously less flexible. LWJGL does not use any of the alternative
 * callback functions.
 */
/*@FunctionalInterface*/
public interface WindowProc {

	/** The default WNDPROC function address. */
	long CALLBACK = Util.setCallback(apiCallbackMethod(WindowProc.class, long.class, int.class, long.class, long.class));

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
	long invoke(long hWnd, int msg, long wParam, long lParam);

	final class Util {

		private Util() {
		}

		private static native long setCallback(Method callback);

		/**
		 * May be used to setup an alternative WNDPROC function. The WNDPROC may only be invoked from a JVM thread.
		 *
		 * @param callback an instance method that will be called from the WNDPROC function. Its arguments must match those of
		 *                 {@link #invoke(long, int, long, long)}. The reference to the instance on which it will be called will be retrieved from index 0 of
		 *                 the HWND's extra window memory.
		 *
		 * @return the WNDPROC function address
		 */
		public static native long setCallbackInstance(Method callback);

		/**
		 * May be used to setup an alternative WNDPROC function. The WNDPROC may only be invoked from a JVM thread.
		 *
		 * @param callback a static method that will be called from the WNDPROC function. Its arguments must match those of
		 *                 {@link #invoke(long, int, long, long)}
		 *
		 * @return the WNDPROC function address
		 */
		public static native long setCallbackStatic(Method callback);

	}

}