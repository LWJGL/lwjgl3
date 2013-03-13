/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

public abstract class GLContext {

	final ContextCapabilities capabilities;

	protected GLContext(final ContextCapabilities capabilities) {
		this.capabilities = capabilities;

		GL.setCurrent(this);
	}

	public ContextCapabilities getCapabilities() {
		return capabilities;
	}

	public void makeCurrent() {
		makeCurrentImpl();
		GL.setCurrent(this);
	}

	protected abstract void makeCurrentImpl();

	public abstract boolean isCurrent();

	public abstract void destroy();

}