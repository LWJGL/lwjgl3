/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.SharedLibrary;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.macosx.CoreFoundation.*;

/** Implements a {@link SharedLibrary} on the MacOS X using CFBundleCreate. */
public class MacOSXLibraryBundle extends MacOSXLibrary {

	public MacOSXLibraryBundle(String name) {
		super(createBundle(name), name);
	}

	private static long createBundle(String name) {
		long fsPath = NULL, url = NULL;

		long bundleRef;
		try {
			APIBuffer __buffer = apiBuffer();
			__buffer.stringParamUTF8(name, true);

			fsPath = nCFStringCreateWithCStringNoCopy(NULL, __buffer.address(), kCFStringEncodingUTF8, kCFAllocatorNull());
			if ( fsPath == NULL )
				throw new NullPointerException();

			url = CFURLCreateWithFileSystemPath(NULL, fsPath, kCFURLPOSIXPathStyle, true);
			if ( url == NULL )
				throw new NullPointerException();

			bundleRef = CFBundleCreate(NULL, url);
			if ( bundleRef == NULL )
				throw new RuntimeException("Failed to dynamically load bundle: " + name);

			apiLog("Loaded native library bundle: " + name);
		} finally {
			if ( url != NULL ) CFRelease(url);
			if ( fsPath != NULL ) CFRelease(fsPath);
		}

		return bundleRef;
	}

	@Override
	public long getFunctionAddress(CharSequence functionName) {
		APIBuffer __buffer = apiBuffer();
		__buffer.stringParamASCII(functionName, true);

		long nameRef = nCFStringCreateWithCStringNoCopy(NULL, __buffer.address(), kCFStringEncodingASCII, kCFAllocatorNull());
		if ( nameRef == NULL )
			throw new NullPointerException();

		try {
			return CFBundleGetFunctionPointerForName(address(), nameRef);
		} finally {
			CFRelease(nameRef);
		}
	}

	@Override
	public void free() {
		CFRelease(address());
	}

}