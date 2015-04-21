/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

import static org.lwjgl.opengl.CGL.*;

public class GLContextMacOSX extends GLContext {

	private final long handle;

	public GLContextMacOSX(ContextCapabilities capabilities, long handle) {
		super(capabilities);

		this.handle = handle;
	}

	@Override
	public long getPointer() {
		return handle;
	}

	@Override
	protected void makeCurrentImpl(long target) {
		CGLSetCurrentContext(handle);
	}

	@Override
	protected void makeCurrentImpl(long targetDraw, long targetRead) {
		CGLSetCurrentContext(handle);
	}

	@Override
	public boolean isCurrent() {
		return CGLGetCurrentContext() == handle;
	}

	public static GLContextMacOSX createFromCurrent() {
		ContextCapabilities capabilities = GL.createCapabilities(false);

		return new GLContextMacOSX(capabilities, CGLGetCurrentContext());
	}

	@Override
	protected void destroyImpl() {
		CGLDestroyContext(handle);
	}

}