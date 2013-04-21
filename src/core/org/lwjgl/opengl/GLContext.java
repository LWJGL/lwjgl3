/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.linux.opengl.LinuxGLContext;
import org.lwjgl.system.windows.opengl.WindowsGLContext;

import static org.lwjgl.system.MemoryUtil.*;

/** This class is a wrapper over an OS-specific OpenGL context handle and provides basic functionality related to OpenGL contexts. */
public abstract class GLContext {

	final ContextCapabilities capabilities;

	protected GLContext(ContextCapabilities capabilities) {
		this.capabilities = capabilities;

		GL.setCurrent(this);
	}

	public static GLContext createFromCurrent() {
		switch ( LWJGLUtil.getPlatform() ) {
			case WINDOWS:
				return WindowsGLContext.createFromCurrent();
			case LINUX:
				return LinuxGLContext.createFromCurrent();
			case MACOSX:
				throw new UnsupportedOperationException("not implemented yet");
			default:
				throw new IllegalStateException();
		}
	}

	/**
	 * Returns the {@code ContextCapabilities} instance that describes the capabilities of this context.
	 *
	 * @return the {@code ContextCapabilities} instance associated with this context
	 */
	public ContextCapabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Returns the context handle. The type of this handle is OS-specific.
	 *
	 * @return the context handle
	 */
	public abstract long getHandle();

	/**
	 * Makes the context current in the current thread and associates with the device/drawable given by the {@code target} handle for both draw and read
	 * operations.
	 * <p/>
	 * The {@code target} handle is OS-specific.
	 *
	 * @param target the device/drawable to associate the context with
	 *
	 * @see GL#setCurrent(GLContext)
	 */
	public void makeCurrent(long target) {
		makeCurrentImpl(target);
		GL.setCurrent(this);
	}

	/**
	 * Makes the context current in the current thread and associates with the device/drawable given by the {@code targetDraw} handle for draw operations and
	 * the
	 * device/drawable given by the {@code targetRead} handle for read operations. This functionality is optional as it may not be supported by the OpenGL
	 * implementation. The user must check the availability of the corresponding OpenGL extension before calling this method.
	 * <p/>
	 * The {@code targetDraw} and {@code targetRead} handles are OS-specific.
	 *
	 * @param targetDraw the device/drawable to associate the context with for draw operations
	 * @param targetRead the device/drawable to associate the context with for read operations
	 *
	 * @throws OpenGLException if separate associations are not supported
	 */
	public void makeCurrent(long targetDraw, long targetRead) {
		makeCurrentImpl(targetDraw, targetRead);
		GL.setCurrent(this);
	}

	protected abstract void makeCurrentImpl(long target);

	protected abstract void makeCurrentImpl(long targetDraw, long targetRead);

	/** Returns true if this {@code GLContext} is current in the current thread. */
	public abstract boolean isCurrent();

	/** Destroys this {@code GLContext} and releases any resources associated with it. */
	public void destroy() {
		// Clean-up callbacks
		if ( capabilities.GL_AMD_debug_output && capabilities.__AMDDebugOutput.DEBUGPROCAMD != NULL ) AMDDebugOutput.glDebugMessageCallbackAMD(null);
		if ( capabilities.OpenGL43 && capabilities.__GL43.DEBUGPROC != NULL ) GL43.glDebugMessageCallback(null);

		destroyImpl();
	}

	protected abstract void destroyImpl();

}