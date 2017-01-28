/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.system.tinycc;

import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLCapabilities;

import java.lang.invoke.MethodHandle;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class PerfTestMH {

	private PerfTestMH() {
	}

	private static void benchGL() {
		for ( int i = 0; i < 100; i++ ) {
			benchGL(10000);
		}

		long t = 0;
		for ( int i = 0; i < 10000; i++ ) {
			t += benchGL(10000);
		}
		System.out.println("OpenGL     : " + t / 10000 / 10000.0);
	}

	private static long benchGL(int loops) {
		long t = System.nanoTime();
		for ( int i = 0; i < loops; i++ ) {
			glVertexAttribI1i(0, 0);
		}
		t = System.nanoTime() - t;
		return t;
	}

	private static final NativeMethodHandle testExplicitNMH = NativeMethodHandle.create(
		NativeMethodHandle.Mode.EXPLICIT,
		NativeMethodHandle.CallConvention.STDCALL,
		void.class,
		int.class, int.class
	);

	private static final NativeMethodHandle testThreadLocalNMH = NativeMethodHandle.create(
		NativeMethodHandle.Mode.THREAD_LOCAL,
		NativeMethodHandle.CallConvention.STDCALL,
		1968,
		void.class,
		int.class, int.class
	);

	private static final MethodHandle testExplicit    = testExplicitNMH.getHandle();
	private static final MethodHandle testThreadLocal = testThreadLocalNMH.getHandle();

	public static void main(String[] args) {
		glfwInit();
		glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
		long window = glfwCreateWindow(100, 100, "TinyCC Perf Test", NULL, NULL);

		glfwMakeContextCurrent(window);
		GLCapabilities caps = GL.createCapabilities();

		NativeMethodHandle testExternNMH = NativeMethodHandle.create(
			NativeMethodHandle.Mode.EXTERN,
			NativeMethodHandle.CallConvention.STDCALL,
			caps.glVertexAttribI1i,
			void.class,
			int.class, int.class
		);
		MethodHandle testExtern = testExternNMH.getHandle();

		long t = 0;
		for ( int i = 0; i < 10000; i++ ) {
			t += System.nanoTime();
		}
		if ( t == 0 )
			throw new IllegalStateException();

		for ( int i = 0; i < 3; i++ ) {
			System.out.println();
			benchGL();
			benchExplicit(caps);
			benchThreadLocal();
			benchExtern(testExtern);
		}

		testExternNMH.free();
		testThreadLocalNMH.free();
		testExplicitNMH.free();

		glfwTerminate();
	}

	private static void benchExplicit(GLCapabilities caps) {
		long t = 0;
		for ( int i = 0; i < 10000; i++ ) {
			t += benchExplicit(10000, caps.glVertexAttribI1i);
		}
		System.out.println("Explicit   : " + t / 10000 / 10000.0);
	}

	private static long benchExplicit(int loops, long func) {
		long t = System.nanoTime();
		for ( int i = 0; i < loops; i++ ) {
			try {
				testExplicit.invokeExact(func, 0, 0);
			} catch (Throwable ignored) {
			}
		}
		t = System.nanoTime() - t;
		return t;
	}

	private static void benchThreadLocal() {
		long t = 0;
		for ( int i = 0; i < 10000; i++ ) {
			t += benchThreadLocal(10000);
		}
		System.out.println("ThreadLocal: " + t / 10000 / 10000.0);
	}

	private static long benchThreadLocal(int loops) {
		long t = System.nanoTime();
		for ( int i = 0; i < loops; i++ ) {
			try {
				testThreadLocal.invokeExact(0, 0);
			} catch (Throwable ignored) {
			}
		}
		t = System.nanoTime() - t;
		return t;
	}

	private static void benchExtern(MethodHandle handle) {
		long t = 0;
		for ( int i = 0; i < 10000; i++ ) {
			t += benchExtern(handle, 10000);
		}
		System.out.println("Extern     : " + t / 10000 / 10000.0);
	}

	private static long benchExtern(MethodHandle handle, int loops) {
		long t = System.nanoTime();
		for ( int i = 0; i < loops; i++ ) {
			try {
				handle.invokeExact(0, 0);
			} catch (Throwable ignored) {
			}
		}
		t = System.nanoTime() - t;
		return t;
	}

}