/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.Sys;
import org.lwjgl.system.DynamicLinkLibrary;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WinBase.*;
import static org.lwjgl.system.windows.WindowsUtil.*;

/** Implements a {@link DynamicLinkLibrary} on the Windows OS. */
public class WindowsLibrary extends DynamicLinkLibrary.Default {

	/** The LWJGL dll handle. */
	public static final long HINSTANCE = GetModuleHandle(Sys.JNI_LIBRARY_NAME);

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

		LWJGLUtil.log("Loaded native library: " + name);
	}

	@Override
	public long getPointer() {
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