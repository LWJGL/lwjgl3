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

	public WindowsLibrary(String name) {
		super(LoadLibrary(name), name);

		if ( address() == NULL )
			windowsThrowException("Failed to load library: " + name);

		apiLog("Loaded native library: " + name);
	}

	@Override
	public long getFunctionAddress(CharSequence name) {
		return GetProcAddress(address(), name);
	}

	@Override
	public void free() {
		if ( FreeLibrary(address()) == FALSE )
			windowsThrowException("Failed to unload library: " + getName());
	}

}