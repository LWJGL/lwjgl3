/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.glfw;

import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.glfw.GLFWWindowSizeCallback;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.system.libffi.Closure;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Math.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.glfw.GLFWWin32.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.WGL.*;
import static org.lwjgl.opengl.WGLAMDGPUAssociation.*;
import static org.lwjgl.opengl.WGLARBBufferRegion.*;
import static org.lwjgl.opengl.WGLEXTSwapControl.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WinGDI.*;
import static org.lwjgl.system.windows.WinUser.*;
import static org.testng.Assert.*;

/** GLFW/WGL interop demo. */
public final class WGLInterop {
	private WGLInterop() {
	}

	public static void main(String[] args) {
		GLFWErrorCallback errorfun;
		glfwSetErrorCallback(errorfun = errorCallbackPrint(System.err));
		if ( glfwInit() == 0 )
			throw new IllegalStateException("Failed to initialize GLFW.");

		System.out.println("GLFW initialized");

		try {
			demo();
		} finally {
			glfwTerminate();
			errorfun.release();
		}
	}

	private static void demo() {
		glfwDefaultWindowHints();
		glfwWindowHint(GLFW_VISIBLE, GL_FALSE);
		glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GL_TRUE);

		long window = glfwCreateWindow(640, 480, "GLFW-WGL Interop", NULL, NULL);
		if ( window == 0L )
			throw new IllegalStateException("Failed to create GLFW window.");

		final AtomicInteger windowWidth = new AtomicInteger(640);
		final AtomicInteger windowHeight = new AtomicInteger(480);

		GLFWWindowSizeCallback windowsizefun;
		glfwSetWindowSizeCallback(window, windowsizefun = new GLFWWindowSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				windowWidth.set(width);
				windowHeight.set(height);
			}
		});

		GLFWKeyCallback keyfun;
		glfwSetKeyCallback(window, keyfun = new GLFWKeyCallback() {
			@Override
			public void invoke(long window, int key, int scancode, int action, int mods) {
				if ( key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE )
					glfwSetWindowShouldClose(window, 1);
			}
		});

		long HWND = glfwGetWin32Window(window);
		long HDC = GetDC(HWND);

		// Make the GLFW context current in the current thread
		glfwMakeContextCurrent(window);

		// Creates an LWJGL GLContext from the GLFW context.
		GLContext context = GLContext.createFromCurrent();
		Closure debugProc = context.setupDebugMessageCallback();

		// Now we can retrieve the GLFW context's capabilities
		ContextCapabilities caps = context.getCapabilities();

		int success;

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

		glfwSetWindowPos(window, 128, 128);
		glfwShowWindow(window);

		glViewport(0, 0, windowWidth.get(), windowHeight.get());

		long bufferRegion = wglCreateBufferRegionARB(HDC, 0, WGL_BACK_COLOR_BUFFER_BIT_ARB);
		assertTrue(bufferRegion != 0);

		SelectObject(HDC, GetStockObject(DEFAULT_GUI_FONT));

		int fontBase = glGenLists(256);
		success = wglUseFontBitmaps(HDC, 0, 256, fontBase);
		assertTrue(success != 0);

		ByteBuffer stringBuffer = memEncodeASCII("Hello WGL!");
		stringBuffer.limit(stringBuffer.limit() - 1);

		// indicate start of glyph display lists
		glListBase(fontBase);

		float rotation = 0.0f;
		while ( glfwWindowShouldClose(window) == 0 ) {
			glfwPollEvents();

			int w = windowWidth.get();
			int h = windowHeight.get();

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

			SwapBuffers(HDC);
		}

		wglDeleteBufferRegionARB(bufferRegion);

		glfwDestroyWindow(window);
		if ( debugProc != null )
			debugProc.release();
		keyfun.release();
		windowsizefun.release();
	}
}