/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.SharedLibrary;

import java.nio.ByteBuffer;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.macosx.CoreFoundation.*;

/** Implements a {@link SharedLibrary} on the MacOS X using CFBundleCreate. */
public class MacOSXLibraryBundle extends MacOSXLibrary {

	public MacOSXLibraryBundle(String name) {
		super(createBundle(name), name);
	}

	private static long createBundle(String path) {
		MemoryStack stack = stackPush();
		long filePath = NULL;
		long url = NULL;
		try {
			filePath = CString2CFString(stack.UTF8(path), kCFStringEncodingUTF8);
			url = checkPointer(CFURLCreateWithFileSystemPath(NULL, filePath, kCFURLPOSIXPathStyle, true));

			long bundleRef = CFBundleCreate(NULL, url);
			if ( bundleRef == NULL )
				throw new RuntimeException("Failed to dynamically load bundle: " + path);

			apiLog("Loaded native library bundle: " + path);
			return bundleRef;
		} finally {
			if ( url != NULL ) CFRelease(url);
			if ( filePath != NULL ) CFRelease(filePath);
			stack.pop();
		}
	}

	@Override
	public long getFunctionAddress(ByteBuffer functionName) {
		long nameRef = CString2CFString(functionName, kCFStringEncodingASCII);
		try {
			return CFBundleGetFunctionPointerForName(address(), nameRef);
		} finally {
			CFRelease(nameRef);
		}
	}

	private static long CString2CFString(ByteBuffer name, int encoding) {
		return checkPointer(CFStringCreateWithCStringNoCopy(NULL, name, encoding, kCFAllocatorNull()));
	}

	@Override
	public void free() {
		CFRelease(address());
	}

}