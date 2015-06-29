/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux;

import org.lwjgl.system.DynamicLinkLibrary;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.linux.DynamicLinkLoader.*;

/** Implements a {@link DynamicLinkLibrary} on the Linux OS. */
public class LinuxLibrary extends DynamicLinkLibrary.Default {

	private final String name;

	private final long handle;

	public LinuxLibrary(String name) {
		this.name = name;

		long handle = NULL;
		if ( name.endsWith(".so") )
			handle = dlopen(name + ".1", RTLD_LAZY | RTLD_GLOBAL);
		if ( handle == NULL )
			handle = dlopen(name, RTLD_LAZY | RTLD_GLOBAL);

		if ( handle == NULL ) // TODO: better error handling
			throw new RuntimeException("Failed to dynamically load library: " + name);

		this.handle = handle;
	}

	@Override
	public long getPointer() {
		return handle;
	}

	@Override
	public String getName() {
		return name;
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