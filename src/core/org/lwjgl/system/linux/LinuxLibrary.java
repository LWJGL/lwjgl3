/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux;

import org.lwjgl.system.DynamicLinkLibrary;

import java.nio.ByteBuffer;

import static org.lwjgl.system.linux.DynamicLinkLoader.*;

/** Implements a {@link DynamicLinkLibrary} on the Linux OS. */
public class LinuxLibrary implements DynamicLinkLibrary {

	private final String name;

	private final long handle;

	public LinuxLibrary(String name) {
		this.name = name;

		this.handle = dlopen(name, RTLD_LAZY);
		if ( handle == 0 ) // TODO: better error handling
			throw new RuntimeException("Failed to dynamically load library: " + name);
	}

	public long getHandle() {
		return handle;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public long getFunctionAddress(ByteBuffer name) {
		return dlsym(handle, name);
	}

	@Override
	public long getFunctionAddress(String name) {
		return dlsym(handle, name);
	}

	@Override
	public void destroy() {
		dlclose(handle);
	}

}