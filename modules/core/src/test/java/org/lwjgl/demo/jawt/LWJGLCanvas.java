/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.jawt;

import org.lwjgl.demo.opengl.AbstractGears;
import org.lwjgl.system.jawt.*;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.WGL;
import org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR;
import org.lwjgl.system.windows.WinBase;

import java.awt.*;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.WGL.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.jawt.JAWTFunctions.*;
import static org.lwjgl.system.windows.GDI32.*;

/**
 * A Canvas component that uses OpenGL for rendering.
 *
 * <p>This implementation supports Windows only and is no way complete or robust enough for production use.</p>
 */
public class LWJGLCanvas extends Canvas {

	private final JAWT awt;

	private final AbstractGears gears;

	private final WGL wgl;

	private long hglrc;

	private GLCapabilities caps;

	public LWJGLCanvas() {
		awt = JAWT.calloc();
		awt.version(JAWT_VERSION_1_4);
		if ( !JAWT_GetAWT(awt) )
			throw new RuntimeException("GetAWT failed");

		gears = new AbstractGears();
		wgl = new WGL(GL.getFunctionProvider());
	}

	@Override
	public void update(Graphics g) {
		paint(g);
	}

	@Override
	public void paint(Graphics g) {
		// Get the drawing surface
		JAWTDrawingSurface ds = JAWT_GetDrawingSurface(awt.GetDrawingSurface(), this);
		if ( ds == null )
			throw new RuntimeException("awt->GetDrawingSurface() failed");

		try {
			// Lock the drawing surface
			int lock = JAWT_DrawingSurface_Lock(ds.Lock(), ds);
			if ( (lock & JAWT_LOCK_ERROR) != 0 )
				throw new RuntimeException("ds->Lock() failed");

			try {
				// Get the drawing surface info
				JAWTDrawingSurfaceInfo dsi = JAWT_DrawingSurface_GetDrawingSurfaceInfo(ds.GetDrawingSurfaceInfo(), ds);

				try {
					// Get the platform-specific drawing info
					JAWTWin32DrawingSurfaceInfo dsi_win = JAWTWin32DrawingSurfaceInfo.create(dsi.platformInfo());
					long hdc = dsi_win.hdc();
					if ( hdc != NULL ) {
						if ( hglrc == NULL ) {
							createContext(dsi_win);
							gears.initGLState();
						} else {
							if ( callPPI(wgl.MakeCurrent, hdc, hglrc) == 0 )
								throw new IllegalStateException("wglMakeCurrent() failed");

							GL.setCapabilities(caps);
						}

						glViewport(0, 0, getWidth(), getHeight());
						gears.renderLoop();
						SwapBuffers(hdc);

						wglMakeCurrent(NULL, NULL);
						GL.setCapabilities(null);
					}
				} finally {
					// Free the drawing surface info
					JAWT_DrawingSurface_FreeDrawingSurfaceInfo(ds.FreeDrawingSurfaceInfo(), dsi);
				}
			} finally {
				// Unlock the drawing surface
				JAWT_DrawingSurface_Unlock(ds.Unlock(), ds);
			}
		} finally {
			// Free the drawing surface
			JAWT_FreeDrawingSurface(awt.FreeDrawingSurface(), ds);
		}

		repaint();
	}

	// Simplest possible context creation.
	private void createContext(JAWTWin32DrawingSurfaceInfo dsi_win) {
		long hdc = dsi_win.hdc();

		PIXELFORMATDESCRIPTOR pfd = PIXELFORMATDESCRIPTOR.calloc();

		pfd.nSize((byte)PIXELFORMATDESCRIPTOR.SIZEOF);
		pfd.nVersion((short)1);
		pfd.dwFlags(PFD_SUPPORT_OPENGL | PFD_DRAW_TO_WINDOW | PFD_DOUBLEBUFFER);
		pfd.iPixelType((byte)PFD_TYPE_RGBA);
		pfd.cColorBits((byte)32);
		pfd.cAlphaBits((byte)8);
		pfd.cDepthBits((byte)24);
		pfd.iLayerType((byte)PFD_MAIN_PLANE);

		try {
			int pixelFormat = GetPixelFormat(hdc);
			if ( pixelFormat != 0 ) {
				if ( DescribePixelFormat(hdc, pixelFormat, pfd) == 0 )
					throw new IllegalStateException("DescribePixelFormat() failed: " + WinBase.getLastError());
			} else {
				pixelFormat = ChoosePixelFormat(hdc, pfd);
				if ( pixelFormat < 1 )
					throw new IllegalStateException("ChoosePixelFormat() failed: " + WinBase.getLastError());

				if ( SetPixelFormat(hdc, pixelFormat, null) == 0 )
					throw new IllegalStateException("SetPixelFormat() failed: " + WinBase.getLastError());
			}

			hglrc = callPP(wgl.CreateContext, hdc);

			if ( hglrc == NULL )
				throw new IllegalStateException("wglCreateContext() failed");

			if ( callPPI(wgl.MakeCurrent, hdc, hglrc) == 0 )
				throw new IllegalStateException("wglMakeCurrent() failed");

			caps = GL.createCapabilities();
		} finally {
			pfd.free();
		}
	}

	public void destroy() {
		awt.free();

		if ( hglrc != NULL )
			callPI(wgl.DeleteContext, hglrc);
	}

}