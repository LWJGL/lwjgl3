package org.lwjgl.system.linux;

import org.lwjgl.LWJGLUtil;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link Xlib#XSetErrorHandler(XErrorHandler)} method. */
public class XErrorHandler {

	private static final String[] X_ERRORS = {
		"Success",
		"BadRequest",
		"BadValue",
		"BadWindow",
		"BadPixmap",
		"BadAtom",
		"BadCursor",
		"BadFont",
		"BadMatch",
		"BadDrawable",
		"BadAccess",
		"BadAlloc",
		"BadColor",
		"BadGC",
		"BadIDChoice",
		"BadName",
		"BadLength",
		"BadImplementation"
	};

	static final long CALLBACK;

	static {
		try {
			CALLBACK = setCallback(XErrorHandler.class.getDeclaredMethod(
				"callback", long.class, long.class
			));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static XErrorHandler callback;

	public XErrorHandler() {
	}

	private static native long setCallback(Method callback);

	static long register(XErrorHandler handler) {
		callback = handler;
		return CALLBACK;
	}

	private static void callback(long display, long error_event) {
		callback.invoke(display, error_event);
	}

	/**
	 * This method will be called when an X11 server error is generated. It should be overriden if custom behavior is desired.
	 * The default implementation will print the error details on the standard error stream.
	 *
	 * @param display     the connection to the X server in which the error occured
	 * @param error_event a pointer to an {@link XErrorEvent} struct describing the error that occured
	 */
	public int invoke(long display, long error_event) {
		return invoke(display, memByteBuffer(error_event, XErrorEvent.SIZEOF));
	}

	/** Alternative version of {@link #invoke(long, long)}. */
	public int invoke(long display, ByteBuffer error_event) {
		System.err.println("[LWJGL] X error: " + getErrorName(XErrorEvent.error_codeGet(error_event)));
		System.err.println("\tDisplay: " + LWJGLUtil.toHexString(display));
		System.err.println("\tMajor opcode: " + XErrorEvent.request_codeGet(error_event));
		System.err.println("\tMinor opcode: " + XErrorEvent.minor_codeGet(error_event));
		System.err.println("\tSerial number: " + XErrorEvent.serialGet(error_event));
		System.err.println("\tResource ID: " + LWJGLUtil.toHexString(XErrorEvent.resourceidGet(error_event)));

		return 0;
	}

	private static String getErrorName(int error_code) {
		return error_code < X_ERRORS.length ? X_ERRORS[error_code] : "UNKNOWN [" + LWJGLUtil.toHexString(error_code) + ']';
	}

}