/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.SharedLibrary;

import java.nio.ByteBuffer;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WinBase.*;
import static org.lwjgl.system.windows.WindowsUtil.*;

/** Implements a {@link SharedLibrary} on the Windows OS. */
public class WindowsLibrary extends SharedLibrary.Default {

	/** The LWJGL dll handle. */
	public static final long HINSTANCE;

	static {
		MemoryStack stack = stackPush();
		try {
			HINSTANCE = GetModuleHandle(stack.UTF16(Library.JNI_LIBRARY_NAME));
			if ( HINSTANCE == NULL )
				throw new RuntimeException("Failed to retrieve LWJGL module handle.");
		} finally {
			stack.pop();
		}
	}

	public WindowsLibrary(String name) {
		super(loadLibrary(name), name);

		if ( address() == NULL )
			windowsThrowException("Failed to load library: " + name);

		apiLog("Loaded native library: " + name);
	}

	private static long loadLibrary(String name) {
		MemoryStack stack = stackPush();
		try {
			return LoadLibrary(stack.UTF16(name));
		} finally {
			stack.pop();
		}
	}

	@Override
	public long getFunctionAddress(ByteBuffer functionName) {
		return GetProcAddress(address(), functionName);
	}

	@Override
	public void free() {
		if ( FreeLibrary(address()) == FALSE )
			windowsThrowException("Failed to unload library: " + getName());
	}

}