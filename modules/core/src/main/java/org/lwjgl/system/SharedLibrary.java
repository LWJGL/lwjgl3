/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.system.MemoryUtil.*;
import org.lwjgl.system.libc.Stdlib;

import java.nio.ByteBuffer;

import static org.lwjgl.system.MemoryUtil.*;

/** A {@link FunctionProvider} implementation that opens a platform-specific shared library and returns functions pointers from it. */
public interface SharedLibrary extends FunctionProvider, Pointer {

	/** Returns the library name. */
	String getName();

	abstract class Default extends Pointer.Default implements SharedLibrary {

		/**
		 * We use this allocator in {@link SharedLibrary} implementations to break a cyclic dependency with the default {@link MemoryUtil} allocator during
		 * LWJGL initialization.
		 */
		protected static final BufferAllocator SYSTEM_ALLOCATOR = new BufferAllocator() {
			@Override
			public ByteBuffer allocate(int size) {
				return Stdlib.malloc(size);
			}
		};

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
			ByteBuffer encoded = memEncodeASCII(functionName, SYSTEM_ALLOCATOR);
			try {
				return getFunctionAddress(encoded);
			} finally {
				Stdlib.free(encoded);
			}
		}

	}

}