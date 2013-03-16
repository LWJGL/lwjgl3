/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

import org.lwjgl.Sys;
import org.lwjgl.system.Library;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WinBase.*;
import static org.lwjgl.system.windows.WindowsPlatform.*;

public class WindowsLibrary implements Library {

	/** The LWJGL dll handle. */
	public static final long HINSTANCE = GetModuleHandle(memEncodeUTF16(Sys.getNativeLibrary()));

	static {
		if ( HINSTANCE == 0 )
			throw new RuntimeException("Failed to retrieve LWJGL module handle.");
	}

	private final String name;

	private final long handle;

	public WindowsLibrary(String name) {
		this.name = name;

		handle = LoadLibrary(memEncodeUTF16(name));
		if ( handle == 0 )
			windowsThrowException("Failed to load library: " + name);
	}

	public String getName() {
		return name;
	}

	public long getHandle() {
		return handle;
	}

	public long getProcAddress(String name) {
		return GetProcAddress(handle, memEncodeASCII(name));
	}

	public void destroy() {
		if ( FreeLibrary(handle) == 0 )
			windowsThrowException("Failed to unload library: " + name);
	}

}