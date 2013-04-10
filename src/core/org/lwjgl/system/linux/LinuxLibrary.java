/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux;

import org.lwjgl.system.Library;

import static org.lwjgl.system.linux.DynamicLinkLoader.*;

public class LinuxLibrary implements Library {

	private final String name;

	private final long handle;

	public LinuxLibrary(String name) {
		this.name = name;

		this.handle = dlopen(name, RTLD_LAZY);
		if ( handle == 0 ) // TODO: better error handling
			throw new RuntimeException("Failed to dynamically load library: " + name);
	}

	public String getName() {
		return name;
	}

	public long getHandle() {
		return handle;
	}

	public long getProcAddress(String name) {
		return dlsym(handle, name);
	}

	public void destroy() {
		dlclose(handle);
	}

}