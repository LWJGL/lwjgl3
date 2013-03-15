package org.lwjgl.demo.glfw;

import org.lwjgl.BufferUtils;
import org.lwjgl.Sys;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.DEBUGPROCAMD;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.system.glfw.ErrorCallback;
import org.lwjgl.system.glfw.WindowCallback;
import org.lwjgl.system.glfw.WindowCallbackAdapter;
import org.lwjgl.system.windows.opengl.WindowsGLContext;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Math.*;
import static org.lwjgl.opengl.AMDDebugOutput.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.WGLAMDGpuAssociation.*;
import static org.lwjgl.opengl.WGLARBBufferRegion.*;
import static org.lwjgl.opengl.WGLEXTSwapControl.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.glfw.GLFW.*;
import static org.lwjgl.system.windows.GLFWWin32.*;
import static org.lwjgl.system.windows.WGL.*;
import static org.lwjgl.system.windows.WinGDI.*;
import static org.lwjgl.system.windows.WinUser.*;
import static org.testng.Assert.*;

public class WGLInterop {

	public static void main(String[] args) {
		Sys.touch();

		glfwSetErrorCallback(new ErrorCallback());
		if ( glfwInit() == 0 )
			throw new IllegalStateException("Failed to initialize GLFW.");

		System.out.println("GLFW initialized");

		try {
			demo();
		} finally {
			glfwTerminate();
		}
	}

	private static void demo() {
		glfwDefaultWindowHints();

		glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 4);
		glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 2);
		glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_COMPAT_PROFILE);
		glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GL_TRUE);

		final long window = glfwCreateWindow(640, 480, "GLFW-WGL Interop", 0L, 0L);
		if ( window == 0L )
			throw new IllegalStateException("Failed to create GLFW window.");

		final AtomicInteger windowWidth = new AtomicInteger(640);
		final AtomicInteger windowHeight = new AtomicInteger(480);

		WindowCallback.set(window, new WindowCallbackAdapter() {
			@Override
			public void windowSize(final long window, final int width, final int height) {
				windowWidth.set(width);
				windowHeight.set(height);
			}

			@Override
			public void key(final long window, final int key, final int action) {
				if ( key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE )
					glfwSetWindowShouldClose(window, 1);
			}
		});

		final long HWND = glfwGetWin32Window(window);
		final long HDC = GetDC(HWND);

		int success;

		glfwMakeContextCurrent(window);
		wglDeleteContext(wglGetCurrentContext());

		final GLContext context = WindowsGLContext.create(HDC);
		//final GLContext context = WindowsGLContext.create(HDC, wglGetCurrentContext());

		final ContextCapabilities caps = GL.getCapabilities();

		if ( caps.GL_AMD_debug_output )
			glDebugMessageCallbackAMD(new DEBUGPROCAMD());

		if ( caps.WGL_AMD_gpu_association ) {
			final int GPUs = wglGetGPUIDsAMD(null);

			final IntBuffer gpuBuffer = BufferUtils.createIntBuffer(GPUs);
			wglGetGPUIDsAMD(gpuBuffer);

			final IntBuffer data = BufferUtils.createIntBuffer(1);
			final ByteBuffer nameBuffer = BufferUtils.createByteBuffer(256);
			for ( int i = 0; i < /*GPUs*/1; i++ ) { // Crashes for non-AMD GPUs, sigh...
				final int gpuID = gpuBuffer.get(i);
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

		final long bufferRegion = wglCreateBufferRegionARB(HDC, 0, WGL_BACK_COLOR_BUFFER_BIT_ARB);
		assertTrue(bufferRegion != 0);

		SelectObject(HDC, GetStockObject(DEFAULT_GUI_FONT));

		final int fontBase = glGenLists(256);
		success = wglUseFontBitmaps(HDC, 0, 256, fontBase);
		assertTrue(success != 0);

		final ByteBuffer stringBuffer = memEncodeASCII("Hello WGL!");
		stringBuffer.limit(stringBuffer.limit() - 1);

		// indicate start of glyph display lists
		glListBase(fontBase);

		float rotation = 0.0f;
		while ( glfwWindowShouldClose(window) == 0 ) {
			glfwPollEvents();

			final int w = windowWidth.get();
			final int h = windowHeight.get();

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

			final int ts = (int)ceil(min(w, h) * 0.1);
			final int tr = ts * 3;

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

		//context.destroy();
		glfwDestroyWindow(window);
	}

}