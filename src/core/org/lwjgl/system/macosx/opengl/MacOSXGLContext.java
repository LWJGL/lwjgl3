package org.lwjgl.system.macosx.opengl;

import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLContext;

import static org.lwjgl.system.MemoryUtil.*;

public class MacOSXGLContext extends GLContext {

	private final long handle;

	public MacOSXGLContext(ContextCapabilities capabilities, long handle) {
		super(capabilities);

		this.handle = handle;
	}

	@Override
	public long getHandle() {
		return handle;
	}

	@Override
	protected void makeCurrentImpl(long target) {
		// TODO: implement
	}

	@Override
	protected void makeCurrentImpl(long targetDraw, long targetRead) {
		// TODO: implement
	}

	@Override
	public boolean isCurrent() {
		// TODO: implement
		return false;
	}

	public static MacOSXGLContext createFromCurrent() {
		ContextCapabilities capabilities = GL.createCapabilities(false);

		return new MacOSXGLContext(capabilities, NULL);
	}

	@Override
	public void destroyImpl() {
		// TODO: implement
	}

}