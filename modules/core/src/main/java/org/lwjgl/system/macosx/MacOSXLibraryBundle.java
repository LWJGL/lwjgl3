/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.SharedLibrary;

import java.nio.ByteBuffer;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.macosx.CoreFoundation.*;

/** Implements a {@link SharedLibrary} on the MacOS X using CFBundleCreate. */
public class MacOSXLibraryBundle extends MacOSXLibrary {

	public MacOSXLibraryBundle(String name) {
		super(createBundle(name), name);
	}

	private static long createBundle(String path) {
		long filePath = CString2CFString(encodeUTF8(path), kCFStringEncodingUTF8, kCFAllocatorMalloc());
		long url = NULL;
		try {
			url = CFURLCreateWithFileSystemPath(NULL, filePath, kCFURLPOSIXPathStyle, true);
			if ( url == NULL )
				throw new NullPointerException();

			long bundleRef = CFBundleCreate(NULL, url);
			if ( bundleRef == NULL )
				throw new RuntimeException("Failed to dynamically load bundle: " + path);

			apiLog("Loaded native library bundle: " + path);
			return bundleRef;
		} finally {
			if ( url != NULL ) CFRelease(url);
			CFRelease(filePath);
		}
	}

	@Override
	public long getFunctionAddress(ByteBuffer functionName) {
		long nameRef = CString2CFString(functionName, kCFStringEncodingASCII, kCFAllocatorNull());
		try {
			return CFBundleGetFunctionPointerForName(address(), nameRef);
		} finally {
			CFRelease(nameRef);
		}
	}

	private static long CString2CFString(ByteBuffer name, int encoding, long allocator) {
		long string = CFStringCreateWithCStringNoCopy(NULL, name, encoding, allocator);
		if ( string == NULL )
			throw new NullPointerException();

		return string;
	}

	@Override
	public void free() {
		CFRelease(address());
	}

}