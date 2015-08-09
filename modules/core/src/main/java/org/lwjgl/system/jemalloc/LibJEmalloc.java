/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.Pointer;
import org.lwjgl.system.FunctionProvider;

public final class LibJEmalloc {

	private static FunctionProvider functionProvider;

	static JEmalloc __JEmalloc;

	static {
		if ( !Boolean.getBoolean("org.lwjgl.system.jemalloc.explicitInit") )
			create();
	}

	private LibJEmalloc() {}

	/** Loads the jemalloc native library, using the default library name. */
	public static void create() {
		create(System.getProperty("org.lwjgl.system.jemalloc.libname", Pointer.BITS64 ? "jemalloc" : "jemalloc32"));
	}

	/**
	 * Loads the jemalloc native library, using the specified library name.
	 *
	 * @param libName the native library name
	 */
	public static void create(String libName) {
		create(LWJGLUtil.loadLibraryNative(libName));
	}

	/**
	 * Initializes jemalloc with the specified {@link FunctionProvider}. This method can be used to implement custom jemalloc library loading.
	 *
	 * @param functionProvider the provider of jemalloc function addresses
	 */
	public static void create(FunctionProvider functionProvider) {
		if ( LibJEmalloc.functionProvider != null )
			throw new IllegalStateException("jemalloc has already been created.");

		LibJEmalloc.functionProvider = functionProvider;
		__JEmalloc = new JEmalloc(functionProvider);
	}

	/** Unloads the jemalloc native library. */
	public static void destroy() {
		if ( functionProvider == null )
			return;

		__JEmalloc = null;

		functionProvider.release();
		functionProvider = null;
	}

	/** Returns the {@link FunctionProvider} for the jemalloc native library. */
	public static FunctionProvider getFunctionProvider() {
		return functionProvider;
	}

}