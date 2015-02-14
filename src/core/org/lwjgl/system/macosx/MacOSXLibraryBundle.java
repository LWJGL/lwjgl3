/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.APIBuffer;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.macosx.CoreFoundation.*;

/** Implements a {@link org.lwjgl.system.DynamicLinkLibrary} on the MacOS X using CFBundleCreate. */
public class MacOSXLibraryBundle extends MacOSXLibrary {

	private final long bundleRef;

	public MacOSXLibraryBundle(String name) {
		super(name);

		long fsPath = NULL, url = NULL;

		try {
			APIBuffer __buffer = apiBuffer();
			__buffer.stringParamUTF8(name, true);

			fsPath = nCFStringCreateWithCStringNoCopy(NULL, __buffer.address(), kCFStringEncodingUTF8, kCFAllocatorNull());
			if ( fsPath == NULL )
				throw new NullPointerException();

			url = CFURLCreateWithFileSystemPath(NULL, fsPath, kCFURLPOSIXPathStyle, TRUE);
			if ( url == NULL )
				throw new NullPointerException();

			bundleRef = CFBundleCreate(NULL, url);
			if ( bundleRef == 0 ) // TODO: better error handling
				throw new RuntimeException("Failed to dynamically load bundle: " + name);
		} finally {
			if ( url != NULL ) CFRelease(url);
			if ( fsPath != NULL ) CFRelease(fsPath);
		}
	}

	@Override
	public long getPointer() {
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
			return CFBundleGetFunctionPointerForName(bundleRef, nameRef);
		} finally {
			CFRelease(nameRef);
		}
	}

	@Override
	protected void destroy() {
		CFRelease(bundleRef);
	}

}