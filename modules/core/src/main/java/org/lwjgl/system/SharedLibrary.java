/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.system.libc.Stdlib;

import java.nio.ByteBuffer;

import static org.lwjgl.system.MemoryUtil.*;

/** A {@link FunctionProvider} implementation that opens a platform-specific shared library and returns functions pointers from it. */
public interface SharedLibrary extends FunctionProvider, Pointer {

	/** Returns the library name. */
	String getName();

	abstract class Default extends Pointer.Default implements SharedLibrary {

		/*
		 * We use Stdlib allocations in {@link SharedLibrary} implementations to break a cyclic dependency with the default {@link MemoryUtil} allocator during
		 * LWJGL initialization.
		 */

		private final String name;

		protected Default(long address, String name) {
			super(address);
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public long getFunctionAddress(CharSequence functionName) {
			ByteBuffer encoded = encodeASCII(functionName);
			try {
				return getFunctionAddress(encoded);
			} finally {
				Stdlib.free(encoded);
			}
		}

		protected static ByteBuffer encodeASCII(CharSequence text) {
			ByteBuffer encoded = Stdlib.malloc(memLengthASCII(text, true));
			memASCII(text, true, encoded);
			return encoded;
		}

		protected static ByteBuffer encodeUTF8(CharSequence text) {
			ByteBuffer encoded = Stdlib.malloc(memLengthUTF8(text, true));
			memUTF8(text, true, encoded);
			return encoded;
		}

		protected static ByteBuffer encodeUTF16(CharSequence text) {
			ByteBuffer encoded = Stdlib.malloc(memLengthUTF16(text, true));
			memUTF16(text, true, encoded);
			return encoded;
		}

	}

}