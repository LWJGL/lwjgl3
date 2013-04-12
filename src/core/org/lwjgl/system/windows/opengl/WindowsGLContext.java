package org.lwjgl.system.windows.opengl;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLContext;

import java.nio.IntBuffer;

import static org.lwjgl.opengl.WGLARBCreateContext.*;
import static org.lwjgl.opengl.WGLARBCreateContextProfile.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WGL.*;

public class WindowsGLContext extends GLContext {

	private final long hdc;
	private final long hglrc;

	public WindowsGLContext(ContextCapabilities capabilities, long hdc, long hglrc) {
		super(capabilities);

		this.hdc = hdc;
		this.hglrc = hglrc;
	}

	@Override
	public long getHandle() {
		return hglrc;
	}

	@Override
	protected void makeCurrentImpl() {
		if ( wglMakeCurrent(hdc, hglrc) == 0 )
			throw new RuntimeException("Failed to make the OpenGL context current.");
	}

	@Override
	public boolean isCurrent() {
		return wglGetCurrentContext() == hglrc;
	}

	/**
	 * Creates a WindowsContext from the current DC and OpenGL context of the current thread.
	 *
	 * @return the new WindowsContext
	 *
	 * @throws IllegalStateException if no OpenGL context is current in the current thread.
	 */
	public static WindowsGLContext create() {
		return create(
			wglGetCurrentDC(),
			wglGetCurrentContext()
		);
	}

	/**
	 * Creates an OpenGL context on the given device context and returns a WindowContext from it.
	 *
	 * @param hdc the device context
	 *
	 * @return the new WindowsContext
	 */
	public static WindowsGLContext create(long hdc) {
		WindowsGLContext context = createLegacy(hdc);
		try {
			return createARB(hdc);
		} finally {
			context.destroy();
		}
	}

	public static WindowsGLContext createLegacy(long hdc) {
		long hglrc = wglCreateContext(hdc);
		if ( hglrc == 0 )
			throw new RuntimeException("Failed to create OpenGL context.");

		try {
			int result = wglMakeCurrent(hdc, hglrc);
			if ( result == 0 )
				throw new RuntimeException("Failed to make the new OpenGL context current.");

			return create(hdc, hglrc);
		} catch (RuntimeException e) {
			wglDeleteContext(hglrc);
			throw e;
		}
	}

	/**
	 * Creates an OpenGL context on the given device context and returns a WindowContext from it.
	 *
	 * @param hdc the device context
	 *
	 * @return the new WindowsContext
	 */
	public static WindowsGLContext createARB(long hdc) {
		IntBuffer attribs = BufferUtils.createIntBuffer(16);

		/*attribs.put(WGL_CONTEXT_MAJOR_VERSION_ARB);
		attribs.put(4);

		attribs.put(WGL_CONTEXT_MINOR_VERSION_ARB);
		attribs.put(2);*/

		attribs.put(WGL_CONTEXT_FLAGS_ARB);
		attribs.put(WGL_CONTEXT_DEBUG_BIT_ARB);

		attribs.put(WGL_CONTEXT_PROFILE_MASK_ARB);
		attribs.put(WGL_CONTEXT_COMPATIBILITY_PROFILE_BIT_ARB);

		attribs.put(0);
		attribs.flip();

		long hglrc = wglCreateContextAttribsARB(hdc, NULL, attribs);
		if ( hglrc == 0 )
			throw new RuntimeException("Failed to create OpenGL context.");

		try {
			int result = wglMakeCurrent(hdc, hglrc);
			if ( result == 0 )
				throw new RuntimeException("Failed to make the new OpenGL context current.");

			return create(hdc, hglrc);
		} catch (RuntimeException e) {
			wglDeleteContext(hglrc);
			throw e;
		}
	}

	/**
	 * Creates a WindowsContext from the given device and OpenGL contexts. The OpenGL context
	 * must be current in the current thread before calling this method.
	 *
	 * @param hdc   the device context
	 * @param hglrc the OpenGL context
	 *
	 * @return the new WindowsContext
	 */
	public static WindowsGLContext create(long hdc, long hglrc) {
		if ( hdc == 0 || hglrc == 0 )
			throw new IllegalStateException("Invalid OpenGL context specified.");

		if ( wglGetCurrentContext() != hglrc )
			throw new IllegalStateException("The specified OpenGL context must be current in the current thread.");

		ContextCapabilities capabilities = GL.createCapabilities(false);

		return new WindowsGLContext(capabilities, hdc, hglrc);
	}

	@Override
	public void destroyImpl() {
		int result = wglDeleteContext(hglrc);
		if ( result == 0 )
			throw new RuntimeException("Failed to delete OpenGL context.");
	}
}