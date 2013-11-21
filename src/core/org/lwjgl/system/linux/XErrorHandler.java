package org.lwjgl.system.linux;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link Xlib#XSetErrorHandler(XErrorHandler) XSetErrorHandler} method. */
/*@FunctionalInterface*/
public interface XErrorHandler {

	/**
	 * This method will be called when an X11 server error is generated.
	 *
	 * @param display     the connection to the X server in which the error occured
	 * @param error_event a pointer to an {@link XErrorEvent} struct describing the error that occured
	 */
	int invoke(long display, long error_event);

	/** Extends {@code XErrorHandler} with an alternative version that accepts a buffer. */
	/*@FunctionalInterface*/
	interface Buf extends XErrorHandler {
		/*@Override
		default int invoke(long display, long error_event) {
			return invoke(display, memByteBuffer(error_event, XErrorEvent.SIZEOF));
		}*/

		/**
		 * This method will be called when an X11 server error is generated.
		 *
		 * @param display     the connection to the X server in which the error occured
		 * @param error_event an {@link XErrorEvent} struct describing the error that occured
		 */
		int invoke(long display, ByteBuffer error_event);
	}

	/** An {@link XErrorHandler.Buf} adapter. */
	abstract class BufAdapter implements Buf {
		@Override
		public int invoke(long display, long error_event) {
			return invoke(display, memByteBuffer(error_event, XErrorEvent.SIZEOF));
		}

		@Override
		public int invoke(long display, ByteBuffer error_event) {
			return 0;
		}
	}

	final class Util {

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

		static final long CALLBACK = setCallback(apiCallbackMethod(XErrorHandler.Util.class, long.class, long.class));

		private static final XErrorHandler DEFAULT = new BufAdapter() {
			@Override
			public int invoke(long display, ByteBuffer error_event) {
				System.err.println("[LWJGL] X error: " + getErrorName(XErrorEvent.error_code(error_event)));
				System.err.printf("\tDisplay: [0x%X]\n", display);
				System.err.println("\tMajor opcode: " + XErrorEvent.request_code(error_event));
				System.err.println("\tMinor opcode: " + XErrorEvent.minor_code(error_event));
				System.err.println("\tSerial number: " + XErrorEvent.serial(error_event));
				System.err.printf("\tResource ID: [0x%X]\n", XErrorEvent.resourceid(error_event));

				return 0;
			}

			private String getErrorName(int error_code) {
				return error_code < X_ERRORS.length ? X_ERRORS[error_code] : String.format("UNKNOWN [0x%X]", error_code);
			}

		};

		private static XErrorHandler callback;

		private Util() {
		}

		private static native long setCallback(Method callback);

		static long register(XErrorHandler handler) {
			callback = handler;
			return handler == null ? NULL : CALLBACK;
		}

		private static void callback(long display, long error_event) {
			callback.invoke(display, error_event);
		}

		/**
		 * Returns a default {@code XErrorHandler} implementation that prints a simple description in the standard output stream.
		 *
		 * @return the default implementation
		 */
		public static XErrorHandler getDefault() {
			return DEFAULT;
		}

	}

}