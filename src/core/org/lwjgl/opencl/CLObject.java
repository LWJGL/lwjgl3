/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.system.PointerWrapper;

abstract class CLObject extends PointerWrapper {

	CLObject(long pointer) {
		super(pointer);
	}

	public abstract CLCapabilities getCapabilities();

}