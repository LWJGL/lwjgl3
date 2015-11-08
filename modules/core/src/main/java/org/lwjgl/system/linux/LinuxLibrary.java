/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux;

import org.lwjgl.system.SharedLibrary;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.linux.DynamicLinkLoader.*;

/** Implements a {@link SharedLibrary} on the Linux OS. */
public class LinuxLibrary extends SharedLibrary.Default {

	private final long handle;

	public LinuxLibrary(String name) {
		super(name);

		handle = dlopen(name, RTLD_LAZY | RTLD_GLOBAL);
		if ( handle == NULL ) // TODO: better error handling
			throw new RuntimeException("Failed to dynamically load library: " + name + "(error = " + dlerror() + ")");

		apiLog("Loaded native library: " + name);
	}

	@Override
	public long address() {
		return handle;
	}

	@Override
	public long getFunctionAddress(CharSequence name) {
		return dlsym(handle, name);
	}

	@Override
	protected void destroy() {
		dlclose(handle);
	}

}