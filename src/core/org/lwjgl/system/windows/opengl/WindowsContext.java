package org.lwjgl.system.windows.opengl;

import org.lwjgl.opengl.Context;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GLContext;

import static org.lwjgl.system.windows.WGL.*;

public class WindowsContext extends Context {

	private final long hdc;
	private final long hglrc;

	public WindowsContext(final ContextCapabilities capabilities, final long hdc, final long hglrc) {
		super(capabilities);

		this.hdc = hdc;
		this.hglrc = hglrc;
	}

	protected void makeCurrentImpl() {
		wglMakeCurrent(hdc, hglrc);
	}

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
	public static WindowsContext create() {
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
	public static WindowsContext create(final long hdc) {
		final long hglrc = wglCreateContext(hdc);
		if ( hglrc == 0 )
			throw new RuntimeException("Failed to create OpenGL context.");

		try {
			final int result = wglMakeCurrent(hdc, hglrc);
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
	public static WindowsContext create(final long hdc, final long hglrc) {
		if ( hdc == 0 || hglrc == 0 )
			throw new IllegalStateException("Invalid OpenGL context specified.");

		if ( wglGetCurrentContext() != hglrc )
			throw new IllegalStateException("The specified OpenGL context must be current in the current thread.");

		final ContextCapabilities capabilities = GLContext.createCapabilities(false);

		return new WindowsContext(capabilities, hdc, hglrc);
	}

	public void destroy() {
		final int result = wglDeleteContext(hglrc);
		if ( result == 0 )
			throw new RuntimeException("Failed to delete OpenGL context.");
	}
}