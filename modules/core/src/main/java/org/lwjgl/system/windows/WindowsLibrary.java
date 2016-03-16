/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

import org.lwjgl.system.Library;
import org.lwjgl.system.SharedLibrary;
import org.lwjgl.system.libc.Stdlib;

import java.nio.ByteBuffer;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WinBase.*;
import static org.lwjgl.system.windows.WindowsUtil.*;

/** Implements a {@link SharedLibrary} on the Windows OS. */
public class WindowsLibrary extends SharedLibrary.Default {

	/** The LWJGL dll handle. */
	public static final long HINSTANCE;

	static {
		ByteBuffer nameEncoded = memEncodeUTF16(Library.JNI_LIBRARY_NAME, SYSTEM_ALLOCATOR);
		try {
			HINSTANCE = GetModuleHandle(nameEncoded);
			if ( HINSTANCE == NULL )
				throw new RuntimeException("Failed to retrieve LWJGL module handle.");
		} finally {
			Stdlib.free(nameEncoded);
		}
	}

	public WindowsLibrary(String name) {
		super(loadLibrary(name), name);

		if ( address() == NULL )
			windowsThrowException("Failed to load library: " + name);

		apiLog("Loaded native library: " + name);
	}

	private static long loadLibrary(String name) {
		ByteBuffer nameEncoded = memEncodeUTF16(name, SYSTEM_ALLOCATOR);
		try {
			return LoadLibrary(nameEncoded);
		} finally {
			Stdlib.free(nameEncoded);
		}
	}

	@Override
	public long getFunctionAddress(CharSequence name) {
		ByteBuffer nameEncoded = memEncodeASCII(name, SYSTEM_ALLOCATOR);
		try {
			return GetProcAddress(address(), nameEncoded);
		} finally {
			Stdlib.free(nameEncoded);
		}
	}

	@Override
	public void free() {
		if ( FreeLibrary(address()) == FALSE )
			windowsThrowException("Failed to unload library: " + getName());
	}

}