/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.system.tinycc;

import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.Platform;
import org.lwjgl.system.tinycc.ErrorCallback;

import java.io.File;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.system.JNITinyHeader.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;
import static org.lwjgl.system.tinycc.TinyCC.*;

public final class PerfTestDLL {

	private PerfTestDLL() {
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

	public static final class JNITest {

		private JNITest() {
		}

		public static native void testExplicit(int index, int x, long __functionAddress);

		public static native void testThreadLocal(int index, int x);

	}

	private static void check(int status) {
		if ( status != 0 )
			throw new IllegalStateException(Integer.toString(status));
	}

	public static void main(String[] args) {
		glfwInit();
		glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
		long window = glfwCreateWindow(100, 100, "TinyCC Perf Test", NULL, NULL);

		glfwMakeContextCurrent(window);
		GLCapabilities caps = GL.createCapabilities();

		long tcc = tcc_new();

		ErrorCallback error_func = ErrorCallback.create((opaque, msg) -> System.err.println(memASCII(msg)));
		tcc_set_error_func(tcc, NULL, error_func);
		tcc_set_options(tcc, "-v -nostdinc -nostdlib");

		check(tcc_set_output_type(tcc, TCC_OUTPUT_DLL));

		String source = "" +
			"typedef void (JNICALL *glVertexAttribI1iPROC) (jint, jint);\n" +
			"\n" +
			"JNIEXPORT void JNICALL Java_org_lwjgl_demo_system_tinycc_PerfTestDLL_00024JNITest_testExplicit__IIJ(JNIEnv *__env, jclass clazz, jint index, jint x, jlong __functionAddress) {\n" +
			"  glVertexAttribI1iPROC glVertexAttribI1i = (glVertexAttribI1iPROC)(intptr_t)__functionAddress;\n" +
			"  glVertexAttribI1i(index, x);\n" +
			"}\n" +
			"JNIEXPORT void JNICALL JavaCritical_org_lwjgl_demo_system_tinycc_PerfTestDLL_00024JNITest_testExplicit__IIJ(jint index, jint x, jlong __functionAddress) {\n" +
			"  glVertexAttribI1iPROC glVertexAttribI1i = (glVertexAttribI1iPROC)(intptr_t)__functionAddress;\n" +
			"  glVertexAttribI1i(index, x);\n" +
			"}\n" +
			"\n" +
			"JNIEXPORT void JNICALL Java_org_lwjgl_demo_system_tinycc_PerfTestDLL_00024JNITest_testThreadLocal(JNIEnv *__env, jclass clazz, jint index, jint x) {\n" +
			"  glVertexAttribI1iPROC glVertexAttribI1i = (glVertexAttribI1iPROC)(intptr_t)((void **)(*__env)->reserved3)[1968];\n" +
			"  glVertexAttribI1i(index, x);\n" +
			"}\n";

		if ( Platform.get() == Platform.WINDOWS )
			source += "\n" +
				"uint32_t JNICALL _dllstart(uintptr_t hDll, uint32_t dwReason, uintptr_t lpReserved) {\n" +
				"  return 1;\n" +
				"}\n";

		try ( MemoryStack stack = stackPush() ) {
			//System.err.print(source);
			if ( tcc_compile_string(tcc, prependJNIHeader(source, stack)) != 0 )
				throw new IllegalStateException("Compilation failed.");

			String libraryName = System.mapLibraryName("test" + (BITS32 ? "32" : ""));
			check(tcc_output_file(tcc, libraryName));

			long t = 0;
			for ( int i = 0; i < 10000; i++ )
				t += System.nanoTime();
			if ( t == 0 )
				throw new IllegalStateException();

			System.load(new File(libraryName).getAbsolutePath());

			for ( int i = 0; i < 3; i++ ) {
				System.out.println();
				benchGL();
				benchExplicit(caps);
				benchThreadLocal();
			}
		} finally {
			tcc_delete(tcc);
			error_func.free();
		}

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
			JNITest.testExplicit(0, 0, func);
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
			JNITest.testThreadLocal(0, 0);
		}
		t = System.nanoTime() - t;
		return t;
	}

}