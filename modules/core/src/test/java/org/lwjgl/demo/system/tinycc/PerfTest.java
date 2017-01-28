/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.system.tinycc;

import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.jni.JNINativeMethod;
import org.lwjgl.system.tinycc.ErrorCallback;

import java.lang.invoke.MethodHandle;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.system.JNITinyHeader.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.jni.JNINativeInterface.*;
import static org.lwjgl.system.tinycc.TinyCC.*;

public final class PerfTest {

	private PerfTest() {
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

		public static native void testExplicit(long __functionAddress, int index, int x);

		public static native void testThreadLocal(int index, int x);

		public static native void testExtern(int index, int x);

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
		tcc_set_options(tcc, "-nostdinc -nostdlib");
		tcc_set_output_type(tcc, TCC_OUTPUT_MEMORY);

		String source = "" +
			"typedef void (__stdcall *glVertexAttribI1iPROC) (jint, jint);\n" +
			"extern glVertexAttribI1iPROC glVertexAttribI1i;\n" +
			"\n" +
			"JNIEXPORT void JNICALL testExplicit(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint index, jint x) {\n" +
			"  glVertexAttribI1iPROC glVertexAttribI1i = (glVertexAttribI1iPROC)(intptr_t)__functionAddress;\n" +
			"  glVertexAttribI1i(index, x);\n" +
			"}\n" +
			"\n" +
			"JNIEXPORT void JNICALL testThreadLocal(JNIEnv *__env, jclass clazz, jint index, jint x) {\n" +
			"  glVertexAttribI1iPROC glVertexAttribI1i = (glVertexAttribI1iPROC)(intptr_t)((void **)(*__env)->reserved3)[1968];" +
			"  glVertexAttribI1i(index, x);\n" +
			"}\n" +
			"\n" +
			"JNIEXPORT void JNICALL testExtern(JNIEnv *__env, jclass clazz, jint index, jint x) {\n" +
			"  glVertexAttribI1i(index, x);\n" +
			"}\n";

		try ( MemoryStack stack = stackPush() ) {
			//System.err.print(source);
			if ( tcc_compile_string(tcc, prependJNIHeader(source, stack)) == -1 )
				throw new IllegalStateException("Compilation failed.");

			tcc_add_symbol(tcc, "glVertexAttribI1i", caps.glVertexAttribI1i);

			if ( tcc_relocate(tcc, TCC_RELOCATE_AUTO) == -1 )
				throw new IllegalStateException("Relocation failed.");

			long testExplicit_p = tcc_get_symbol(tcc, NativeMethodHandle.getJNISymbol("testExplicit", long.class, int.class, int.class));
			long testThreadLocal_p = tcc_get_symbol(tcc, NativeMethodHandle.getJNISymbol("testThreadLocal", int.class, int.class));
			long testExtern_p = tcc_get_symbol(tcc, NativeMethodHandle.getJNISymbol("testExtern", int.class, int.class));

			JNINativeMethod.Buffer methods = JNINativeMethod.calloc(3);
			methods.get(0)
				.name(stack.UTF8("testExplicit"))
				.signature(stack.UTF8("(JII)V"))
				.fnPtr(testExplicit_p);
			methods.get(1)
				.name(stack.UTF8("testThreadLocal"))
				.signature(stack.UTF8("(II)V"))
				.fnPtr(testThreadLocal_p);
			methods.get(2)
				.name(stack.UTF8("testExtern"))
				.signature(stack.UTF8("(II)V"))
				.fnPtr(testExtern_p);

			if ( RegisterNatives(
				FindClass("org/lwjgl/demo/system/tinycc/PerfTest$JNITest"),
				methods
			) != 0 )
				throw new IllegalStateException("Failed to register JNI natives");

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
				benchExtern();
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
			JNITest.testExplicit(func, 0, 0);
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

	private static void benchExtern() {
		long t = 0;
		for ( int i = 0; i < 10000; i++ ) {
			t += benchExtern(10000);
		}
		System.out.println("Extern     : " + t / 10000 / 10000.0);
	}

	private static long benchExtern(int loops) {
		long t = System.nanoTime();
		for ( int i = 0; i < loops; i++ ) {
			JNITest.testExtern(0, 0);
		}
		t = System.nanoTime() - t;
		return t;
	}

}