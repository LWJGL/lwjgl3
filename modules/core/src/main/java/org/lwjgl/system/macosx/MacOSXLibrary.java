/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.SharedLibrary;

/** Implements a {@link SharedLibrary} on the MacOS X. */
public abstract class MacOSXLibrary extends SharedLibrary.Default {

	protected MacOSXLibrary(String name) {
		super(name);
	}

	public static MacOSXLibrary create(String name) {
		if ( name.endsWith(".framework") )
			return new MacOSXLibraryBundle(name);
		else
			return new MacOSXLibraryDL(name);
	}

}

