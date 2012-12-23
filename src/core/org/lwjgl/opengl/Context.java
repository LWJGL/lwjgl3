/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

public abstract class Context {

	private final ContextCapabilities capabilities;

	protected Context(final ContextCapabilities capabilities) {
		this.capabilities = capabilities;

		GLContext.setCurrent(this);
	}

	public ContextCapabilities getCapabilities() {
		return capabilities;
	}

	public void makeCurrent() {
		makeCurrentImpl();
		GLContext.setCurrent(this);
	}

	protected abstract void makeCurrentImpl();

	public abstract boolean isCurrent();

	public abstract void destroy();

}