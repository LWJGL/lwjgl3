/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

import org.lwjgl.system.FunctionProvider;

public class WindowsFunctionProvider implements FunctionProvider {

	private final WindowsLibrary library;

	public WindowsFunctionProvider(String libraryName) {
		this(new WindowsLibrary(libraryName));
	}

	public WindowsFunctionProvider(WindowsLibrary library) {
		this.library = library;
	}

	@Override
	public long getFunctionAddress(String functionName) {
		return library.getProcAddress(functionName);
	}

	@Override
	public void destroy() {
		library.destroy();
	}

}