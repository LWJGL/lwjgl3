/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.Pointer;
import org.lwjgl.system.DynamicLinkLibrary;

/**
 * This class initializes the jemalloc native library on first access. The library instance is intentionally {@code static final} to improve JIT constant
 * propagation. The expectation is that if this class is accessed, jemalloc will be used extensivelly and never unloaded, so performance is prioritized over
 * flexibility.
 */
final class LibJEmalloc {

	private static final DynamicLinkLibrary jemalloc;

	static final JEmalloc __JEmalloc;

	static {
		jemalloc = LWJGLUtil.loadLibraryNative(System.getProperty("org.lwjgl.system.jemalloc.libname", Pointer.BITS64 ? "jemalloc" : "jemalloc32"));
		__JEmalloc = new JEmalloc(jemalloc);
	}

	private LibJEmalloc() {}

}