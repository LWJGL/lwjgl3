/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux;

import org.lwjgl.system.SharedLibrary;
import org.lwjgl.system.libc.Stdlib;

import java.nio.ByteBuffer;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.linux.DynamicLinkLoader.*;

/** Implements a {@link SharedLibrary} on the Linux OS. */
public class LinuxLibrary extends SharedLibrary.Default {

	public LinuxLibrary(String name) {
		super(loadLibrary(name), name);

		if ( address() == NULL )
			throw new RuntimeException("Failed to dynamically load library: " + name + "(error = " + dlerror() + ")");

		apiLog("Loaded native library: " + name);
	}

	private static long loadLibrary(String name) {
		ByteBuffer nameEncoded = memEncodeASCII(name, SYSTEM_ALLOCATOR);
		try {
			return dlopen(nameEncoded, RTLD_LAZY | RTLD_GLOBAL);
		} finally {
			Stdlib.free(nameEncoded);
		}
	}

	@Override
	public long getFunctionAddress(CharSequence name) {
		ByteBuffer nameEncoded = memEncodeASCII(name, SYSTEM_ALLOCATOR);
		try {
			return dlsym(address(), nameEncoded);
		} finally {
			Stdlib.free(nameEncoded);
		}
	}

	@Override
	public void free() {
		dlclose(address());
	}

}