/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Pointer interface.
 * <p/>
 * LWJGL can run on both 32bit and 64bit architectures. Since LWJGL applications deal with native memory directly, this interface provides necessary information
 * about the underlying architecture of the running JVM process.
 * <p/>
 * When interacting with native functions, pointer values are mapped to Java {@code long}. LWJGL automatically converts long values to the correct pointer
 * addresses when used in native code. Native functions sometimes require arrays of pointer values; the {@link PointerBuffer} class may be used for that
 * purpose. It has an API similar to a {@link java.nio.LongBuffer} but handles pointer casts automatically.
 */
public interface Pointer {

	/** The pointer size in bytes. Will be 4 on a 32bit JVM and 8 on a 64bit one. */
	int POINTER_SIZE = memPointerSize();

	/** The pointer size power-of-two. Will be 2 on a 32bit JVM and 3 on a 64bit one. */
	int POINTER_SHIFT = POINTER_SIZE == 8 ? 3 : 2;

	/** Will be true on a 32bit JVM. */
	boolean BITS32 = POINTER_SIZE * 8 == 32;

	/** Will be true on a 64bit JVM. */
	boolean BITS64 = POINTER_SIZE * 8 == 64;

	/**
	 * Returns the raw pointer address as a {@code long} value.
	 *
	 * @return the pointer address
	 */
	long getPointer();

}