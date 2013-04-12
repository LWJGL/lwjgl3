/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Pointer utility class.
 * <p/>
 * LWJGL can run on both 32bit and 64bit architectures. Since LWJGL applications deal with native memory directly, this class provides the necessary information
 * about the underlying architecture of the running JVM process.
 * <p/>
 * Pointer values in client APIs are mapped to Java longs. LWJGL automatically converts the long values to the correct pointer types when passed to JNI. Some
 * client API calls require buffers of pointer data; the {@link PointerBuffer} class may be used for that purpose. It has an API similar to a {@link java.nio.LongBuffer}
 * but handles pointer conversions automatically.
 */
public final class Pointer {

	/** The pointer size in bytes. Will be 4 on a 32bit JVM and 8 on a 64bit one. */
	public static final int POINTER_SIZE;

	/** The pointer size power-of-two. Will be 2 on a 32bit JVM and 3 on a 64bit one. */
	public static final int POINTER_SHIFT;

	static {
		POINTER_SIZE = memPointerSize();
		POINTER_SHIFT = POINTER_SIZE == 8 ? 3 : 2;
	}

	/** Will be true on a 32bit JVM. */
	public static final boolean BITS32 = POINTER_SIZE * 8 == 32;

	/** Will be true on a 64bit JVM. */
	public static final boolean BITS64 = POINTER_SIZE * 8 == 64;

	private Pointer() {
	}

}