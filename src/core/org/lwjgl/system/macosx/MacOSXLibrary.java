/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.DynamicLinkLibrary;

import java.nio.ByteBuffer;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.macosx.CoreFoundation.*;

/** Implements a {@link org.lwjgl.system.DynamicLinkLibrary} on the MacOS X. */
public class MacOSXLibrary implements DynamicLinkLibrary {

	private final String name;

	private final long bundleRef;

	public MacOSXLibrary(String name) {
		this.name = name;

		long fsPath = NULL, url = NULL;

		try {
			fsPath = CFStringCreateWithCStringNoCopy(NULL, memEncodeASCII(name), kCFStringEncodingASCII, kCFAllocatorNull());
			if ( fsPath == NULL )
				throw new NullPointerException();

			url = CFURLCreateWithFileSystemPath(0L, fsPath, kCFURLPOSIXPathStyle, TRUE);
			if ( url == NULL )
				throw new NullPointerException();

			bundleRef = CFBundleCreate(0L, url);
			if ( bundleRef == 0 ) // TODO: better error handling
				throw new RuntimeException("Failed to dynamically load bundle: " + name);
		} finally {
			if ( url != NULL ) CFRelease(url);
			if ( fsPath != NULL ) CFRelease(fsPath);
		}
	}

	public long getHandle() {
		return bundleRef;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public long getFunctionAddress(ByteBuffer name) {
		long nameRef = CFStringCreateWithCStringNoCopy(NULL, name, kCFStringEncodingASCII, kCFAllocatorNull());
		if ( nameRef == NULL )
			throw new NullPointerException();

		try {
			return CFBundleGetFunctionPointerForName(bundleRef, nameRef);
		} finally {
			CFRelease(nameRef);
		}
	}

	@Override
	public long getFunctionAddress(String name) {
		return getFunctionAddress(memEncodeASCII(name));
	}

	@Override
	public void destroy() {
		CFRelease(bundleRef);
	}

}