/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx;

import static org.lwjgl.system.macosx.DynamicLinkLoader.*;

/** Implements a {@link org.lwjgl.system.DynamicLinkLibrary} on the MacOS X using dlopen. */
public class MacOSXLibraryDL extends MacOSXLibrary {

	private final long handle;

	public MacOSXLibraryDL(String name) {
		super(name);

		this.handle = dlopen(name, RTLD_LAZY | RTLD_GLOBAL);
		if ( handle == 0 ) // TODO: better error handling
			throw new RuntimeException("Failed to dynamically load library: " + name);
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