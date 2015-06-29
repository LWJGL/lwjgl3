/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.windows;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.GLContextWindows;
import org.lwjgl.system.libffi.Closure;
import org.lwjgl.system.windows.MSG;
import org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR;
import org.lwjgl.system.windows.WindowsDisplay;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import static java.lang.Math.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.WGL.*;
import static org.lwjgl.opengl.WGLAMDGPUAssociation.*;
import static org.lwjgl.opengl.WGLARBBufferRegion.*;
import static org.lwjgl.opengl.WGLARBMultisample.*;
import static org.lwjgl.opengl.WGLARBPixelFormat.*;
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
		int pixelFormat = findPixelFormatLegacy(window.getHdc(), pfdOut);

		pixelFormat = findPixelFormatARB(pixelFormat, pfdOut);

		int success = SetPixelFormat(window.getHdc(), pixelFormat, pfdOut.buffer());
		assertTrue(success != 0);

		GLContext context = GLContextWindows.create(window.getHdc());
		Closure debugProc = context.setupDebugMessageCallback();

		ContextCapabilities caps = context.getCapabilities();
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

	private static int findPixelFormatLegacy(long dc, PIXELFORMATDESCRIPTOR pfdOut) {
		PIXELFORMATDESCRIPTOR pfdIn = new PIXELFORMATDESCRIPTOR();

		pfdIn.setSize(PIXELFORMATDESCRIPTOR.SIZEOF);
		pfdIn.setVersion(1);
		pfdIn.setFlags(PFD_DRAW_TO_WINDOW | PFD_SUPPORT_OPENGL | PFD_DOUBLEBUFFER);
		pfdIn.setPixelType(PFD_TYPE_RGBA);
		pfdIn.setColorBits(24);
		pfdIn.setAlphaBits(8);
		pfdIn.setDepthBits(24);
		pfdIn.setStencilBits(8);

		int pixelFormat = ChoosePixelFormat(dc, pfdIn.buffer());
		assertTrue(pixelFormat != 0);

		int describePF = DescribePixelFormat(dc, pixelFormat, pfdOut.buffer());
		assertTrue(describePF != 0);

		int flagsOut = pfdOut.getFlags();

		assertEquals(flagsOut & PFD_DRAW_TO_WINDOW, PFD_DRAW_TO_WINDOW);
		assertEquals(flagsOut & PFD_SUPPORT_OPENGL, PFD_SUPPORT_OPENGL);
		assertEquals(flagsOut & PFD_DOUBLEBUFFER, PFD_DOUBLEBUFFER);
		assertEquals(flagsOut & PFD_GENERIC_FORMAT, 0); // software mode
		assertTrue(pfdIn.getColorBits() <= pfdOut.getColorBits());
		assertTrue(pfdIn.getAlphaBits() <= pfdOut.getAlphaBits());
		assertTrue(pfdIn.getDepthBits() <= pfdOut.getDepthBits());
		assertTrue(pfdIn.getStencilBits() <= pfdOut.getStencilBits());

		return pixelFormat;
	}

	private static void add(IntBuffer properties, int key, int value) {
		properties.put(key);
		properties.put(value);
	}

	private static int findPixelFormatARB(int pixelFormat, PIXELFORMATDESCRIPTOR pfd) {
		long pushDC = wglGetCurrentDC();
		long pushGLRC = wglGetCurrentContext();

		WindowsDisplay dummy = new WindowsDisplay();

		int success = SetPixelFormat(dummy.getHdc(), pixelFormat, pfd.buffer());
		assertTrue(success != 0);

		GLContext context = GLContextWindows.create(dummy.getHdc());

		IntBuffer propList = BufferUtils.createIntBuffer(32);

		add(propList, WGL_SUPPORT_OPENGL_ARB, GL_TRUE);
		add(propList, WGL_ACCELERATION_ARB, WGL_FULL_ACCELERATION_ARB);
		add(propList, WGL_DRAW_TO_WINDOW_ARB, GL_TRUE);
		add(propList, WGL_DOUBLE_BUFFER_ARB, GL_TRUE);
		add(propList, WGL_STEREO_ARB, GL_FALSE);
		add(propList, WGL_SAMPLE_BUFFERS_ARB, 0);
		add(propList, WGL_SAMPLES_ARB, 0);

		add(propList, WGL_PIXEL_TYPE_ARB, WGL_TYPE_RGBA_ARB);
		add(propList, WGL_RED_BITS_ARB, 8);
		add(propList, WGL_GREEN_BITS_ARB, 8);
		add(propList, WGL_BLUE_BITS_ARB, 8);
		add(propList, WGL_ALPHA_BITS_ARB, 8);
		add(propList, WGL_DEPTH_BITS_ARB, 24);
		add(propList, WGL_STENCIL_BITS_ARB, 8);

		propList.put(0);
		propList.flip();

		IntBuffer pixelFormatNum = BufferUtils.createIntBuffer(1);

		success = wglGetPixelFormatAttribiARB(dummy.getHdc(), 0, 0, WGL_NUMBER_PIXEL_FORMATS_ARB, pixelFormatNum);
		assertTrue(success != 0);

		IntBuffer pixelFormatRet = BufferUtils.createIntBuffer(pixelFormatNum.get(0));
		//System.out.println("pixelFormatRet.capacity() = " + pixelFormatRet.capacity());

		success = wglChoosePixelFormatARB(dummy.getHdc(), propList, null, pixelFormatRet, pixelFormatNum);
		assertTrue(success != 0);
		assertTrue(1 <= pixelFormatNum.get(0));

		/*System.out.println("pixelFormatNum.get(0) = " + pixelFormatNum.get(0));

		final Map<String, Integer> wglMap = new LinkedHashMap<String, Integer>(64);

		wglMap.put("WGL_DRAW_TO_WINDOW_ARB", 0x2001);
		wglMap.put("WGL_DRAW_TO_BITMAP_ARB", 0x2002);
		wglMap.put("WGL_ACCELERATION_ARB", 0x2003);
		wglMap.put("WGL_NEED_PALETTE_ARB", 0x2004);
		wglMap.put("WGL_NEED_SYSTEM_PALETTE_ARB", 0x2005);
		wglMap.put("WGL_SWAP_LAYER_BUFFERS_ARB", 0x2006);
		wglMap.put("WGL_SWAP_METHOD_ARB", 0x2007);
		wglMap.put("WGL_NUMBER_OVERLAYS_ARB", 0x2008);
		wglMap.put("WGL_NUMBER_UNDERLAYS_ARB", 0x2009);
		wglMap.put("WGL_TRANSPARENT_ARB", 0x200A);
		wglMap.put("WGL_TRANSPARENT_RED_VALUE_ARB", 0x2037);
		wglMap.put("WGL_TRANSPARENT_GREEN_VALUE_ARB", 0x2038);
		wglMap.put("WGL_TRANSPARENT_BLUE_VALUE_ARB", 0x2039);
		wglMap.put("WGL_TRANSPARENT_ALPHA_VALUE_ARB", 0x203A);
		wglMap.put("WGL_TRANSPARENT_INDEX_VALUE_ARB", 0x203B);
		wglMap.put("WGL_SHARE_DEPTH_ARB", 0x200C);
		wglMap.put("WGL_SHARE_STENCIL_ARB", 0x200D);
		wglMap.put("WGL_SHARE_ACCUM_ARB", 0x200E);
		wglMap.put("WGL_SUPPORT_GDI_ARB", 0x200F);
		wglMap.put("WGL_SUPPORT_OPENGL_ARB", 0x2010);
		wglMap.put("WGL_DOUBLE_BUFFER_ARB", 0x2011);
		wglMap.put("WGL_STEREO_ARB", 0x2012);
		wglMap.put("WGL_PIXEL_TYPE_ARB", 0x2013);
		wglMap.put("WGL_COLOR_BITS_ARB", 0x2014);
		wglMap.put("WGL_RED_BITS_ARB", 0x2015);
		wglMap.put("WGL_RED_SHIFT_ARB", 0x2016);
		wglMap.put("WGL_GREEN_BITS_ARB", 0x2017);
		wglMap.put("WGL_GREEN_SHIFT_ARB", 0x2018);
		wglMap.put("WGL_BLUE_BITS_ARB", 0x2019);
		wglMap.put("WGL_BLUE_SHIFT_ARB", 0x201A);
		wglMap.put("WGL_ALPHA_BITS_ARB", 0x201B);
		wglMap.put("WGL_ALPHA_SHIFT_ARB", 0x201C);
		wglMap.put("WGL_ACCUM_BITS_ARB", 0x201D);
		wglMap.put("WGL_ACCUM_RED_BITS_ARB", 0x201E);
		wglMap.put("WGL_ACCUM_GREEN_BITS_ARB", 0x201F);
		wglMap.put("WGL_ACCUM_BLUE_BITS_ARB", 0x2020);
		wglMap.put("WGL_ACCUM_ALPHA_BITS_ARB", 0x2021);
		wglMap.put("WGL_DEPTH_BITS_ARB", 0x2022);
		wglMap.put("WGL_STENCIL_BITS_ARB", 0x2023);
		wglMap.put("WGL_AUX_BUFFERS_ARB", 0x2024);
		wglMap.put("WGL_SAMPLE_BUFFERS_ARB", 0x2041);
		wglMap.put("WGL_SAMPLES_ARB", 0x2042);

		final IntBuffer value = BufferUtils.createIntBuffer(1);
		for ( int i = 0; i < pixelFormatNum.get(0); i++ ) {
			final int pf = pixelFormatRet.get(i);

			System.out.println("\nPIXELFORMAT: " + pf);
			System.out.println("---------------------");
			for ( int j = 0; j < propList.remaining(); j += 2 ) {
				final int property = propList.get(j);
				if ( property == 0 )
					break;

				success = wglGetPixelFormatAttribiARB(dummy.getHdc(), pf, 0, property, value);
				assertTrue(success != 0);

				System.out.println("0x" + Integer.toHexString(property).toUpperCase() + ": " + value.get(0));
			}
			for ( final String key : wglMap.keySet() ) {
				final int property = wglMap.get(key);

				success = wglGetPixelFormatAttribiARB(dummy.getHdc(), pf, 0, property, value);
				assertTrue(success != 0);

				System.out.println(key + ": " + value.get(0));
			}
		}*/

		pixelFormat = pixelFormatRet.get(0);

		context.destroy();
		dummy.destroy();

		wglMakeCurrent(pushDC, pushGLRC);

		return pixelFormat;
	}

}