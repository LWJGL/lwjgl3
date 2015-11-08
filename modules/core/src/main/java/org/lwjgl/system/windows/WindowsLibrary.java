/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

import org.lwjgl.system.Library;
import org.lwjgl.system.SharedLibrary;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WinBase.*;
import static org.lwjgl.system.windows.WindowsUtil.*;

/** Implements a {@link SharedLibrary} on the Windows OS. */
public class WindowsLibrary extends SharedLibrary.Default {

	/** The LWJGL dll handle. */
	public static final long HINSTANCE = GetModuleHandle(Library.JNI_LIBRARY_NAME);

	static {
		if ( HINSTANCE == NULL )
			throw new RuntimeException("Failed to retrieve LWJGL module handle.");
	}

	private final long handle;

	public WindowsLibrary(String name) {
		super(name);

		handle = LoadLibrary(name);
		if ( handle == NULL )
			windowsThrowException("Failed to load library: " + name);

		apiLog("Loaded native library: " + name);
	}

	@Override
	public long address() {
		return handle;
	}

	@Override
	public long getFunctionAddress(CharSequence name) {
		return GetProcAddress(handle, name);
	}

	@Override
	protected void destroy() {
		if ( FreeLibrary(handle) == FALSE )
			windowsThrowException("Failed to unload library: " + getName());
	}

}