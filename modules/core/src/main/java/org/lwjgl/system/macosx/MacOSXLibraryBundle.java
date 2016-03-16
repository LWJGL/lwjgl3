/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.SharedLibrary;
import org.lwjgl.system.libc.Stdlib;

import java.nio.ByteBuffer;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.macosx.CoreFoundation.*;

/** Implements a {@link SharedLibrary} on the MacOS X using CFBundleCreate. */
public class MacOSXLibraryBundle extends MacOSXLibrary {

	public MacOSXLibraryBundle(String name) {
		super(createBundle(name), name);
	}

	private static long createBundle(String name) {
		long fsPath = CString2CFString(name), url = NULL;

		try {
			url = CFURLCreateWithFileSystemPath(NULL, fsPath, kCFURLPOSIXPathStyle, true);
			if ( url == NULL )
				throw new NullPointerException();

			long bundleRef = CFBundleCreate(NULL, url);
			if ( bundleRef == NULL )
				throw new RuntimeException("Failed to dynamically load bundle: " + name);

			apiLog("Loaded native library bundle: " + name);
			return bundleRef;
		} finally {
			if ( url != NULL ) CFRelease(url);
			if ( fsPath != NULL ) CFRelease(fsPath);
		}
	}

	@Override
	public long getFunctionAddress(CharSequence functionName) {
		long nameRef = CString2CFString(functionName);
		try {
			return CFBundleGetFunctionPointerForName(address(), nameRef);
		} finally {
			CFRelease(nameRef);
		}
	}

	private static long CString2CFString(CharSequence name) {
		ByteBuffer nameEncoded = memEncodeUTF8(name, SYSTEM_ALLOCATOR);

		try {
			long string = CFStringCreateWithCStringNoCopy(NULL, nameEncoded, kCFStringEncodingUTF8, kCFAllocatorNull());
			if ( string == NULL )
				throw new NullPointerException();

			return string;
		} finally {
			Stdlib.free(nameEncoded);
		}
	}

	@Override
	public void free() {
		CFRelease(address());
	}

}