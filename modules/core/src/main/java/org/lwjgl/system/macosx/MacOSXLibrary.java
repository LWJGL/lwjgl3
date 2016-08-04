/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.SharedLibrary;

import static org.lwjgl.system.APIUtil.*;

/** Implements a {@link SharedLibrary} on the MacOS X. */
public abstract class MacOSXLibrary extends SharedLibrary.Default {

	protected MacOSXLibrary(long address, String name) {
		super(address, name);
	}

	public static MacOSXLibrary getWithIdentifier(String bundleID) {
		apiLog("Loading library: " + bundleID);
		MacOSXLibraryBundle lib = MacOSXLibraryBundle.getWithIdentifier(bundleID);
		apiLog("\tSuccess");
		return lib;
	}

	public static MacOSXLibrary create(String name) {
		if ( name.endsWith(".framework") )
			return MacOSXLibraryBundle.create(name);
		else
			return new MacOSXLibraryDL(name);
	}

}

