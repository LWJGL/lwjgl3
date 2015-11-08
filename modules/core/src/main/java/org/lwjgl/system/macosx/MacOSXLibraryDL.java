/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.SharedLibrary;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.macosx.DynamicLinkLoader.*;

/** Implements a {@link SharedLibrary} on the MacOS X using dlopen. */
public class MacOSXLibraryDL extends MacOSXLibrary {

	private final long handle;

	public MacOSXLibraryDL(String name) {
		super(name);

		this.handle = dlopen(name, RTLD_LAZY | RTLD_GLOBAL);
		if ( handle == NULL )
			throw new RuntimeException("Failed to dynamically load library: " + name);

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