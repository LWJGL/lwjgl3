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
public class WindowsLibrary implements DynamicLinkLibrary {

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

	public long getHandle() {
		return handle;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public long getFunctionAddress(ByteBuffer name) {
		return GetProcAddress(handle, name);
	}

	@Override
	public long getFunctionAddress(String name) {
		return GetProcAddress(handle, memEncodeASCII(name));
	}

	@Override
	public void destroy() {
		if ( FreeLibrary(handle) == 0 )
			windowsThrowException("Failed to unload library: " + name);
	}

}