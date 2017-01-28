/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.system.tinycc;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.system.*;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.jni.JNINativeMethod;
import org.lwjgl.system.tinycc.ErrorCallback;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.JNITinyHeader.prependJNIHeader;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.jni.JNINativeInterface.*;
import static org.lwjgl.system.tinycc.TinyCC.*;

public final class HelloTinyCC {

	private HelloTinyCC() {
	}

	public static void main(String[] args) {
		test();
		testGLFW();
		testJNI();
	}

	private static void test() {
		long tcc = tcc_new();

		ErrorCallback error_func = ErrorCallback.create((opaque, msg) -> System.err.println(memASCII(msg)));
		tcc_set_error_func(tcc, NULL, error_func);
		tcc_set_options(tcc, "-nostdinc -nostdlib");
		tcc_set_output_type(tcc, TCC_OUTPUT_MEMORY);

		try {
			if ( tcc_compile_string(tcc, "int foo(int x) { return x * 10; }") == -1 )
				throw new IllegalStateException("Compilation failed.");

			if ( tcc_relocate(tcc, TCC_RELOCATE_AUTO) == -1 )
				throw new IllegalStateException("Relocation failed.");

			long func = tcc_get_symbol(tcc, "foo");

			int result = JNI.invokeI(func, 10);
			if ( result != 100 )
				throw new IllegalStateException();
		} finally {
			tcc_delete(tcc);
			error_func.free();
		}
	}

	private static void testGLFW() {
		SharedLibrary glfw = Library.loadNative(GLFW.getLibrary().getName(), true);

		long glfwInit = glfw.getFunctionAddress("glfwInit");

		long tcc = tcc_new();

		ErrorCallback error_func = ErrorCallback.create((opaque, msg) -> System.err.println(memASCII(msg)));
		tcc_set_error_func(tcc, NULL, error_func);
		tcc_set_options(tcc, "-nostdinc -nostdlib");
		tcc_set_output_type(tcc, TCC_OUTPUT_MEMORY);

		try {
			if ( tcc_compile_string(tcc, "extern void glfwInit(void);\n" +
				"\n" +
				"void init() { glfwInit(); }") == -1 )
				throw new IllegalStateException("Compilation failed.");

			tcc_add_symbol(tcc, "glfwInit", glfwInit);

			if ( tcc_relocate(tcc, TCC_RELOCATE_AUTO) == -1 )
				throw new IllegalStateException("Relocation failed.");

			long func = tcc_get_symbol(tcc, "init");

			//JNI.invokePV(func, glfwInit);
			JNI.invokeV(func);

			glfwDefaultWindowHints();
			glfwWindowHint(GLFW_VISIBLE, GLFW_TRUE);
			glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
			glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GLFW_TRUE);
			if ( Platform.get() == Platform.MACOSX )
				glfwWindowHint(GLFW_COCOA_RETINA_FRAMEBUFFER, GLFW_FALSE);

			int WIDTH = 300;
			int HEIGHT = 300;

			long window = glfwCreateWindow(WIDTH, HEIGHT, "GLFW Gears Demo", NULL, NULL);
			if ( window == NULL )
				throw new RuntimeException("Failed to create the GLFW window");

			System.out.println("window = " + window);

			glfwTerminate();
		} finally {
			tcc_delete(tcc);
			error_func.free();
		}
	}

	private static void testJNI() {
		long tcc = tcc_new();

		tcc_set_options(tcc, "-nostdinc -nostdlib");
		tcc_set_output_type(tcc, TCC_OUTPUT_MEMORY);

		String source = "" +
			"JNIEXPORT jint JNICALL getPointerSize(JNIEnv *__env, jclass clazz) {\n" +
			"  return (jint)sizeof(void *);\n" +
			"}";

		try ( MemoryStack stack = stackPush() ) {
			//System.err.print(source);
			if ( tcc_compile_string(tcc, prependJNIHeader(source, stack)) == -1 )
				throw new IllegalStateException("Compilation failed.");

			if ( tcc_relocate(tcc, TCC_RELOCATE_AUTO) == -1 )
				throw new IllegalStateException("Relocation failed.");

			long func = tcc_get_symbol(
				tcc,
				NativeMethodHandle.getJNISymbol("getPointerSize")
			);

			JNINativeMethod.Buffer methods = JNINativeMethod.calloc(1);
			methods.get(0)
				.name(stack.UTF8("getPointerSize"))
				.signature(stack.UTF8("()I"))
				.fnPtr(func);

			RegisterNatives(
				FindClass("org/lwjgl/demo/system/tinycc/HelloTinyCC$JNITest"),
				methods
			);

			System.out.println("JNITest.getPointerSize() = " + JNITest.getPointerSize());
		} finally {
			tcc_delete(tcc);
		}
	}

	public static final class JNITest {
		private JNITest() {
		}

		public static native int getPointerSize();
	}

}