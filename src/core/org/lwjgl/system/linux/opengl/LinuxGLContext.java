package org.lwjgl.system.linux.opengl;

import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLContext;

import static org.lwjgl.opengl.GLX12.*;
import static org.lwjgl.opengl.GLX13.*;
import static org.lwjgl.opengl.GLXSGIMakeCurrentRead.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.linux.GLX.*;
import static org.lwjgl.system.linux.Xlib.*;

public class LinuxGLContext extends GLContext {

	private final long display;
	private final long ctx;

	private final MakeCurrentAction makeCurrentAction;

	public LinuxGLContext(ContextCapabilities capabilities, long display, long ctx) {
		super(capabilities);

		this.display = display;
		this.ctx = ctx;

		if ( capabilities.GLX_13 )
			makeCurrentAction = new MakeCurrentActionARB();
		else if ( capabilities.GLX_SGI_make_current_read )
			makeCurrentAction = new MakeCurrentActionSGI();
		else
			makeCurrentAction = null;
	}

	@Override
	public long getHandle() {
		return ctx;
	}

	@Override
	protected void makeCurrentImpl(long target) {
		if ( glXMakeCurrent(display, target, ctx) == False )
			throw new RuntimeException("Failed to make the OpenGL context current.");
	}

	@Override
	protected void makeCurrentImpl(long targetDraw, long targetRead) {
		if ( makeCurrentAction.invoke(display, targetDraw, targetRead, ctx) == False )
			throw new RuntimeException("Failed to make the OpenGL context current.");
	}

	@Override
	public boolean isCurrent() {
		return glXGetCurrentContext() == ctx;
	}

	public static LinuxGLContext create() {
		return create(glXGetCurrentDisplay());
	}

	public static LinuxGLContext create(long display) {
		if ( display == NULL )
			throw new IllegalStateException("Invalid X server connection specified.");

		long ctx = glXGetCurrentContext();
		if ( ctx == NULL )
			throw new IllegalStateException("No OpenGL context is current in the current thread.");

		ContextCapabilities capabilities = GL.createCapabilities(false);

		return new LinuxGLContext(capabilities, display, ctx);
	}

	/**/

	/*public static LinuxGLContext create(long display, long drawable) {
		LinuxGLContext context = createLegacy(display, drawable);
		try {
			return createARB(display, drawable);
		} finally {
			context.destroy();
		}
	}*/

	/*public static LinuxGLContext createLegacy(long display, long drawable) {
		long hglrc = glXCreateContext(display, );
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

	public static LinuxGLContext createARB(long display, long drawable) {
		IntBuffer attribs = BufferUtils.createIntBuffer(16);

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
	}*/

	@Override
	public void destroyImpl() {
		glXDestroyContext(display, ctx);
	}

	/** Used to dispatch to the MakeCurrentRead implementation the GLX server supports. */
	private interface MakeCurrentAction {

		int invoke(long display, long draw, long read, long ctx);

	}

	private static class MakeCurrentActionSGI implements MakeCurrentAction {

		@Override
		public int invoke(long display, long draw, long read, long ctx) {
			return glXMakeCurrentReadSGI(display, draw, read, ctx);
		}
	}

	private static class MakeCurrentActionARB implements MakeCurrentAction {

		@Override
		public int invoke(long display, long draw, long read, long ctx) {
			return glXMakeContextCurrent(display, draw, read, ctx);
		}
	}

}