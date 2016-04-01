/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux;

import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.SharedLibrary;

import java.nio.ByteBuffer;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryStack.*;
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
		MemoryStack stack = stackPush();
		try {
			return dlopen(stack.ASCII(name), RTLD_LAZY | RTLD_GLOBAL);
		} finally {
			stack.pop();
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