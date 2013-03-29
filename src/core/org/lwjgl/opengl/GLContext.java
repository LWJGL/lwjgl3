/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

public abstract class GLContext {

	final ContextCapabilities capabilities;

	protected GLContext(ContextCapabilities capabilities) {
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

	public void destroy() {
		// Clean-up callbacks
		if ( capabilities.GL_AMD_debug_output && capabilities.__AMDDebugOutput.DEBUGPROCAMD != 0L ) AMDDebugOutput.glDebugMessageCallbackAMD(null);
		if ( capabilities.OpenGL43 && capabilities.__GL43.DEBUGPROC != 0L ) GL43.glDebugMessageCallback(null);

		destroyImpl();
	}

	public abstract void destroyImpl();

}