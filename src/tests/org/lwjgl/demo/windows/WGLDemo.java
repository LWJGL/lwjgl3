/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.windows;

import org.lwjgl.opengl.Context;
import org.lwjgl.system.windows.*;
import org.lwjgl.system.windows.opengl.WindowsContext;

import java.nio.ByteBuffer;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.WGLARBExtensionsString.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WGL.*;
import static org.lwjgl.system.windows.WinBase.*;
import static org.lwjgl.system.windows.WinGDI.*;
import static org.lwjgl.system.windows.WinUser.*;
import static org.testng.Assert.*;

public final class WGLDemo {

	private WGLDemo() {
	}

	public static void main(String[] args) {
		WindowsDisplay window = new WindowsDisplay("LWJGL");

		final int deviceBPP = GetDeviceCaps(window.getHdc(), BITSPIXEL);
		System.out.println("deviceBPP = " + deviceBPP);

		final ByteBuffer pfdOut = PIXELFORMATDESCRIPTOR.malloc();
		int pixelFormat = findPixelFormatLegacy(window.getHdc(), pfdOut);

		pixelFormat = findPixelFormatARB(pixelFormat, pfdOut);

		int success = SetPixelFormat(window.getHdc(), pixelFormat, pfdOut);
		assertTrue(success != 0);

		final Context context = WindowsContext.create(window.getHdc());

		glViewport(0, 0, 640, 480);

		glMatrixMode(GL_PROJECTION);
		glOrtho(0.0, 640.0, 0, 480.0, -1.0, 1.0);
		glMatrixMode(GL_MODELVIEW);

		window.setLocation(128, 128);
		window.setVisible(true);

		final ByteBuffer msg = MSG.malloc();
		float rotation = 0.0f;
		while ( !window.isCloseRequested() ) {
			int status;
			while ( (status = PeekMessage(msg, 0, 0, 0, PM_REMOVE)) != FALSE ) {
				if ( status == -1 ) // error
					return;

				TranslateMessage(msg);
				DispatchMessage(msg);
			}

			glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

			glLoadIdentity();

			glTranslatef(640 * 0.5f, 480 * 0.5f, 0.0f);
			glRotatef(rotation, 0.0f, 0.0f, 1.0f);
			rotation += 1.0f;

			glColor3f(1.0f, 0.0f, 0.0f);
			glBegin(GL_TRIANGLES);
			{
				glVertex2f(0.0f, 100.0f);
				glVertex2f(100.0f, 100.0f);
				glVertex2f(100.0f, 0.0f);
			}
			glEnd();

			SwapBuffers(window.getHdc());
			try {
				Thread.sleep(16); // Don't blow up my GPU!
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		context.destroy();
		window.destroy();
	}

	private static int findPixelFormatLegacy(final long dc, final ByteBuffer pfdOut) {
		final ByteBuffer pfdIn = PIXELFORMATDESCRIPTOR.malloc();

		PIXELFORMATDESCRIPTOR.sizeSet(pfdIn, PIXELFORMATDESCRIPTOR.SIZEOF);
		PIXELFORMATDESCRIPTOR.versionSet(pfdIn, 1);
		PIXELFORMATDESCRIPTOR.flagsSet(pfdIn, PFD_DRAW_TO_WINDOW | PFD_SUPPORT_OPENGL | PFD_DOUBLEBUFFER);
		PIXELFORMATDESCRIPTOR.pixelTypeSet(pfdIn, PFD_TYPE_RGBA);
		PIXELFORMATDESCRIPTOR.colorBitsSet(pfdIn, 24);
		PIXELFORMATDESCRIPTOR.alphaBitsSet(pfdIn, 8);
		PIXELFORMATDESCRIPTOR.depthBitsSet(pfdIn, 24);
		PIXELFORMATDESCRIPTOR.stencilBitsSet(pfdIn, 8);

		int pixelFormat = ChoosePixelFormat(dc, pfdIn);
		assertTrue(pixelFormat != 0);

		int describePF = DescribePixelFormat(dc, pixelFormat, pfdOut);
		assertTrue(describePF != 0);

		final int flagsOut = PIXELFORMATDESCRIPTOR.flagsGet(pfdOut);

		assertEquals(flagsOut & PFD_DRAW_TO_WINDOW, PFD_DRAW_TO_WINDOW);
		assertEquals(flagsOut & PFD_SUPPORT_OPENGL, PFD_SUPPORT_OPENGL);
		assertEquals(flagsOut & PFD_DOUBLEBUFFER, PFD_DOUBLEBUFFER);
		assertEquals(flagsOut & PFD_GENERIC_FORMAT, 0); // software mode
		assertTrue(PIXELFORMATDESCRIPTOR.colorBitsGet(pfdIn) <= PIXELFORMATDESCRIPTOR.colorBitsGet(pfdOut));
		assertTrue(PIXELFORMATDESCRIPTOR.alphaBitsGet(pfdIn) <= PIXELFORMATDESCRIPTOR.alphaBitsGet(pfdOut));
		assertTrue(PIXELFORMATDESCRIPTOR.depthBitsGet(pfdIn) <= PIXELFORMATDESCRIPTOR.depthBitsGet(pfdOut));
		assertTrue(PIXELFORMATDESCRIPTOR.stencilBitsGet(pfdIn) <= PIXELFORMATDESCRIPTOR.stencilBitsGet(pfdOut));

		return pixelFormat;
	}

	private static int findPixelFormatARB(final int pixelFormat, final ByteBuffer pfd) {
		final long pushDC = wglGetCurrentDC();
		final long pushGLRC = wglGetCurrentContext();

		final WindowsDisplay dummy = new WindowsDisplay();

		int success = SetPixelFormat(dummy.getHdc(), pixelFormat, pfd);
		assertTrue(success != 0);

		final Context context = WindowsContext.create(dummy.getHdc());

		// TODO: Implement WGLARBPixelFormat choice

		context.destroy();
		dummy.destroy();

		wglMakeCurrent(pushDC, pushGLRC);

		return pixelFormat;
	}

}