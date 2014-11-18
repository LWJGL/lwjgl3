/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

import org.lwjgl.Sys;
import org.lwjgl.system.DynamicLinkLibrary;

import java.nio.ByteBuffer;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WinBase.*;
import static org.lwjgl.system.windows.WindowsPlatform.*;

/** Implements a {@link DynamicLinkLibrary} on the Windows OS. */
public class WindowsLibrary extends DynamicLinkLibrary.Default {

	/** The LWJGL dll handle. */
	public static final long HINSTANCE = GetModuleHandle("lwjgl");

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

	@Override
	public String getName() {
		return name;
	}

	@Override
	public long getPointer() {
		return handle;
	}

	@Override
	public long getFunctionAddress(ByteBuffer name) {
		return GetProcAddress(handle, name);
	}

	@Override
	public long getFunctionAddress(CharSequence name) {
		return GetProcAddress(handle, name);
	}

	@Override
	protected void destroy() {
		if ( FreeLibrary(handle) == FALSE )
			windowsThrowException("Failed to unload library: " + name);
	}

}