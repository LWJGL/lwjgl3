package org.lwjgl.system.macosx.opengl;

import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLContext;

import static org.lwjgl.system.macosx.CGL.*;

public class MacOSXGLContext extends GLContext {

	private final long handle;

	public MacOSXGLContext(ContextCapabilities capabilities, long handle) {
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

	public static MacOSXGLContext createFromCurrent() {
		ContextCapabilities capabilities = GL.createCapabilities(false);

		return new MacOSXGLContext(capabilities, CGLGetCurrentContext());
	}

	@Override
	protected void destroyImpl() {
		CGLDestroyContext(handle);
	}

}