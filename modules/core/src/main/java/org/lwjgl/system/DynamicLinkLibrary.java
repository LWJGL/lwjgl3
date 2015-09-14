/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.Pointer;

public interface DynamicLinkLibrary extends FunctionProvider, Pointer {

	/** Returns the library name. */
	String getName();

	abstract class Default extends Retainable.Default implements DynamicLinkLibrary {

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