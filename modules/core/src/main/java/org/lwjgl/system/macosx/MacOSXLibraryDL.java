/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.SharedLibrary;
import org.lwjgl.system.libc.Stdlib;

import java.nio.ByteBuffer;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.macosx.DynamicLinkLoader.*;

/** Implements a {@link SharedLibrary} on the MacOS X using dlopen. */
public class MacOSXLibraryDL extends MacOSXLibrary {

	public MacOSXLibraryDL(String name) {
		super(loadLibrary(name), name);

		if ( address() == NULL )
			throw new RuntimeException("Failed to dynamically load library: " + name + "(error = " + dlerror() + ")");

		apiLog("Loaded native library: " + name);
	}

	private static long loadLibrary(String name) {
		ByteBuffer nameEncoded = encodeASCII(name);
		try {
			return dlopen(nameEncoded, RTLD_LAZY | RTLD_GLOBAL);
		} finally {
			Stdlib.free(nameEncoded);
		}
	}

	@Override
	public long getFunctionAddress(ByteBuffer functionName) {
		return dlsym(address(), functionName);
	}

	@Override
	public void free() {
		dlclose(address());
	}

}