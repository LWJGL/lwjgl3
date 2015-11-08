/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

/** A {@link FunctionProvider} implementation that opens a platform-specific shared library and returns functions pointers from it. */
public interface SharedLibrary extends FunctionProvider, Pointer {

	/** Returns the library name. */
	String getName();

	abstract class Default extends Retainable.Default implements SharedLibrary {

		private final String name;

		protected Default(String name) {
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}

	}

}