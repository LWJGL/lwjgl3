/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.windows;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GLUtil;
import org.lwjgl.system.libffi.Closure;
import org.lwjgl.system.windows.MSG;
import org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import static java.lang.Math.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.WGL.*;
import static org.lwjgl.opengl.WGLAMDGPUAssociation.*;
import static org.lwjgl.opengl.WGLARBBufferRegion.*;
import static org.lwjgl.opengl.WGLEXTSwapControl.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WinBase.*;
import static org.lwjgl.system.windows.WinGDI.*;
import static org.lwjgl.system.windows.WinUser.*;
import static org.testng.Assert.*;

public final class WGLDemo {

	private WGLDemo() {
	}

	public static void main(String[] args) {
		WindowsDisplay window = new WindowsDisplay("LWJGL");

		int deviceBPP = GetDeviceCaps(window.getHdc(), BITSPIXEL);
		System.out.println("deviceBPP = " + deviceBPP);

		PIXELFORMATDESCRIPTOR pfdOut = new PIXELFORMATDESCRIPTOR();
		int pixelFormat = WGLUtil.findPixelFormatLegacy(window.getHdc(), pfdOut);

		pixelFormat = WGLUtil.findPixelFormatARB(pixelFormat, pfdOut);

		int success = SetPixelFormat(window.getHdc(), pixelFormat, pfdOut.buffer());
		assertTrue(success != 0);

		WGLContext context = WGLContext.create(window.getHdc());
		Closure debugProc = GLUtil.setupDebugMessageCallback();

		GLCapabilities caps = context.getCapabilities();
		if ( caps.WGL_AMD_gpu_association ) {
			int GPUs = wglGetGPUIDsAMD(null);

			IntBuffer gpuBuffer = BufferUtils.createIntBuffer(GPUs);
			wglGetGPUIDsAMD(gpuBuffer);

			IntBuffer data = BufferUtils.createIntBuffer(1);
			ByteBuffer nameBuffer = BufferUtils.createByteBuffer(256);
			for ( int i = 0; i < /*GPUs*/1; i++ ) { // Crashes for non-AMD GPUs, sigh...
				int gpuID = gpuBuffer.get(i);
				assertTrue(gpuID != 0);
				System.out.println("GPU ID: " + gpuID);

				success = wglGetGPUInfoAMD(gpuID, WGL_GPU_VENDOR_AMD, nameBuffer);
				assertTrue(1 <= success);
				nameBuffer.limit(success);
				System.out.println("GPU VENDOR: " + memDecodeUTF8(nameBuffer));
				nameBuffer.clear();

				success = wglGetGPUInfoAMD(gpuID, WGL_GPU_CLOCK_AMD, data);
				assertTrue(success == 1);
				System.out.println("GPU CLOCK: " + data.get(0));

				success = wglGetGPUInfoAMD(gpuID, WGL_GPU_NUM_RB_AMD, data);
				assertTrue(success == 1);
				System.out.println("GPU NUM RB: " + data.get(0));

				success = wglGetGPUInfoAMD(gpuID, WGL_GPU_NUM_PIPES_AMD, data);
				assertTrue(success == 1);
				System.out.println("GPU NUM PIPES: " + data.get(0));

				success = wglGetGPUInfoAMD(gpuID, WGL_GPU_RAM_AMD, data);
				assertTrue(success == 1);
				System.out.println("GPU RAM: " + data.get(0));
			}
		}

		if ( caps.WGL_EXT_swap_control )
			wglSwapIntervalEXT(caps.WGL_EXT_swap_control_tear ? -1 : 1);

		window.setLocation(128, 128);
		window.setVisible(true);

		long bufferRegion = wglCreateBufferRegionARB(window.getHdc(), 0, WGL_BACK_COLOR_BUFFER_BIT_ARB);
		assertTrue(bufferRegion != 0);

		SelectObject(window.getHdc(), GetStockObject(DEFAULT_GUI_FONT));

		int fontBase = glGenLists(256);
		success = wglUseFontBitmaps(window.getHdc(), 0, 256, fontBase);
		assertTrue(success != 0);

		ByteBuffer stringBuffer = memEncodeASCII("Hello WGL!");
		stringBuffer.limit(stringBuffer.limit() - 1);

		// indicate start of glyph display lists
		glListBase(fontBase);

		ByteBuffer msg = MSG.malloc();
		float rotation = 0.0f;
		while ( !window.isCloseRequested() ) {
			int status;
			while ( (status = PeekMessage(msg, 0, 0, 0, PM_REMOVE)) != FALSE ) {
				if ( status == -1 ) // error
					return;

				TranslateMessage(msg);
				DispatchMessage(msg);
			}

			int w = window.getWidth();
			int h = window.getHeight();

			glViewport(0, 0, w, h);

			glMatrixMode(GL_PROJECTION);
			glLoadIdentity();
			glOrtho(0.0, w, 0, h, -1.0, 1.0);

			glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

			glMatrixMode(GL_MODELVIEW);
			glLoadIdentity();

			glTranslatef(w * 0.5f, h * 0.5f, 0.0f);
			glRotatef(rotation, 0.0f, 0.0f, 1.0f);
			rotation += 1.0f;

			int ts = (int)ceil(min(w, h) * 0.1);
			int tr = ts * 3;

			glColor3f(1.0f, 0.0f, 0.0f);
			glBegin(GL_TRIANGLES);
			{
				glVertex2f(0.0f, ts);
				glVertex2f(ts, ts);
				glVertex2f(ts, 0.0f);
			}
			glEnd();

			success = wglSaveBufferRegionARB(bufferRegion, w / 2 - tr / 2, h / 2 - tr / 2, tr, tr);
			assertTrue(success != 0);

			success = wglRestoreBufferRegionARB(bufferRegion, 0, 0, tr, tr, 0, 0);
			assertTrue(success != 0);

			success = wglRestoreBufferRegionARB(bufferRegion, w - tr, 0, tr, tr, 0, 0);
			assertTrue(success != 0);

			success = wglRestoreBufferRegionARB(bufferRegion, 0, h - tr, tr, tr, 0, 0);
			assertTrue(success != 0);

			success = wglRestoreBufferRegionARB(bufferRegion, w - tr, h - tr, tr, tr, 0, 0);
			assertTrue(success != 0);

			glColor3f(0.0f, 1.0f, 0.0f);
			glRasterPos2f(ts + 10.0f, ts + 10.0f);
			glCallLists(stringBuffer);

			SwapBuffers(window.getHdc());
		}

		wglDeleteBufferRegionARB(bufferRegion);

		context.destroy();
		if ( debugProc != null )
			debugProc.release();

		window.destroy();
	}

}