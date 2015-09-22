/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.DynamicLinkLibrary;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.linux.DynamicLinkLoader.*;

/** Implements a {@link DynamicLinkLibrary} on the Linux OS. */
public class LinuxLibrary extends DynamicLinkLibrary.Default {

	private final long handle;

	public LinuxLibrary(String name) {
		super(name);

		handle = dlopen(name, RTLD_LAZY | RTLD_GLOBAL);
		if ( handle == NULL ) // TODO: better error handling
			throw new RuntimeException("Failed to dynamically load library: " + name + "(error = " + dlerror() + ")");

		LWJGLUtil.log("Loaded native library: " + name);
	}

	@Override
	public long getPointer() {
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