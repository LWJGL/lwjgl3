/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;

/** Base class for all CLObjects that are associated with a parent CLObject. */
abstract class CLObjectChild<P extends CLObject> extends CLObject {

	private final P parent;

	protected CLObjectChild(long pointer, P parent) {
		super(pointer);

		if ( LWJGLUtil.DEBUG && parent == null )
			throw new OpenCLException("No parent specified.");

		this.parent = parent;
	}

	public P getParent() {
		return parent;
	}

	@Override
	public CLCapabilities getCapabilities() {
		return getParent().getCapabilities();
	}

}