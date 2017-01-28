/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.system.tinycc;

import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.ThreadLocalUtil;

import java.lang.reflect.Method;
import java.nio.IntBuffer;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.JNITinyHeader.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;
import static org.lwjgl.system.jni.JNINativeInterface.*;
import static org.lwjgl.system.tinycc.TinyCC.*;

public final class CallbackTest {

	public static final int CALLBACK_BLOCK_SIZE = 1024 * 4;
	public static final int CALLBACK_BLOCK_MASK = ~(CALLBACK_BLOCK_SIZE - 1);

	private static int foo;

	private CallbackTest() {
	}

	public static void main(String[] args) {
		long t = 0;
		for ( int i = 0; i < 10000; i++ ) {
			t += System.nanoTime();
		}
		if ( t == -1 )
			throw new IllegalStateException();

		for ( int i = 0; i < 10; i++ ) {
			System.out.println();
			testDyncallback();
			testTinyCCInstance();
			testTinyCCStatic();
			testTinyCCCustom();
		}
	}

	private static void testDyncallback() {
		//glfwSetErrorCallback((error, description) -> System.err.println("DynCallback: " + error + " - " + GLFWErrorCallback.getDescription(description)));
		glfwSetErrorCallback((error, description) -> foo = error);
		// The GLFW library is not initialized

		for ( int i = 0; i < 100000; i++ )
			glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, -1);

		long t = System.nanoTime();
		for ( int i = 0; i < 100000; i++ )
			glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, -1);
		t = System.nanoTime() - t;
		System.out.println("dyncall: " + t / 100000);
		// later...
		glfwSetErrorCallback(null).free();
	}

	private static void testTinyCCInstance() {
		//nglfwSetErrorCallback(createCallback((error, description) -> System.err.println("TinyCC: " + error + " - " + GLFWErrorCallback.getDescription(description))));
		nglfwSetErrorCallback(createCallbackInstance(
			(error, description) -> foo = error,
			"invoke", int.class, long.class
		));

		for ( int i = 0; i < 100000; i++ )
			glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, -1);

		// The GLFW library is not initialized
		long t = System.nanoTime();
		for ( int i = 0; i < 100000; i++ )
			glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, -1);
		t = System.nanoTime() - t;
		System.out.println("instance: " + t / 100000);
		// later...
		freeCallback(nglfwSetErrorCallback(NULL));
	}

	private static void invoke(int error, long description) {
		foo = error;
	}

	private static void testTinyCCStatic() {
		try {
			nglfwSetErrorCallback(createCallbackStatic(CallbackTest.class.getDeclaredMethod("invoke", int.class, long.class)));
		} catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		}

		for ( int i = 0; i < 100000; i++ )
			glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, -1);

		// The GLFW library is not initialized
		long t = System.nanoTime();
		for ( int i = 0; i < 100000; i++ )
			glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, -1);
		t = System.nanoTime() - t;
		System.out.println("static: " + t / 100000);
		// later...
		freeCallback(nglfwSetErrorCallback(NULL));
	}

	private static void testTinyCCCustom() {
		IntBuffer pi = memAllocInt(1);
		PointerBuffer pp = memAllocPointer(1);

		nglfwSetErrorCallback(createCallbackCustom(memAddress(pi), memAddress(pp)));

		for ( int i = 0; i < 1; i++ ) {
			glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, -1);
			foo = pi.get(0);
			//System.err.println("Custom: " + pi.get(0) + " - " + GLFWErrorCallback.getDescription(pp.get(0)));
		}

		// The GLFW library is not initialized
		long t = System.nanoTime();
		for ( int i = 0; i < 100000; i++ ) {
			glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, -1);
			foo = pi.get(0);
		}
		t = System.nanoTime() - t;
		System.out.println("custom: " + t / 100000);
		// later...
		freeCallback(nglfwSetErrorCallback(NULL));
	}

	private static long createCallbackInstance(GLFWErrorCallbackI errorfun, String methodName, Class<?>... parameterTypes) {
		long tcc = tcc_new();

		tcc_set_options(tcc, "-nostdinc -nostdlib");
		tcc_set_output_type(tcc, TCC_OUTPUT_MEMORY);

		String source = "" +
			"extern JNIEnv* getEnv(jboolean *async);\n" +
			"JNIIMPORT extern jobject callback;\n" +
			"JNIIMPORT extern jmethodID method;\n" +
			"\n" +
			"void errorfun(int error, const char *description) {\n" +
			"  jboolean async;\n" +
			"  JNIEnv *env = getEnv(&async);\n" +
			"  (*env)->CallVoidMethod(\n" +
			"    env,\n" +
			"    callback,\n" +
			"    method,\n" +
			"    error,\n" +
			"    description\n" +
			"  );\n" +
			"\n" +
			"  if ( (*env)->ExceptionCheck(env) ) {\n" +
			"    (*env)->ExceptionDescribe(env);\n" +
			"    (*env)->ExceptionClear(env);\n" +
			"  }\n" +
			"}\n";

		long block = nmemAlignedAlloc(CALLBACK_BLOCK_SIZE, CALLBACK_BLOCK_SIZE);
		memSet(block, 0, CALLBACK_BLOCK_SIZE);
		memPutAddress(block, tcc);

		try ( MemoryStack stack = stackPush() ) {
			//System.err.print(source);
			if ( tcc_compile_string(tcc, prependJNIHeader(source, stack)) == -1 )
				throw new IllegalStateException("Compilation failed.");

			tcc_add_symbol(tcc, "getEnv", ThreadLocalUtil.GET_JNI_ENV);
			addSymbol(tcc, block, 2, "callback", NewGlobalRef(errorfun));
			addSymbol(tcc, block, 3, "method", FromReflectedMethod(errorfun.getClass().getDeclaredMethod(methodName, parameterTypes)));
		} catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		}

		int size = tcc_relocate(tcc, NULL);
		if ( size < 0 )
			throw new IllegalStateException("Relocate failed.");

		if ( CALLBACK_BLOCK_SIZE - (4 * POINTER_SIZE) < size )
			throw new IllegalStateException("Callback binary too large.");

		if ( tcc_relocate(tcc, block + 4 * POINTER_SIZE) == -1 )
			throw new IllegalStateException("Relocation failed.");

		return tcc_get_symbol(tcc, "errorfun");
	}


	private static long createCallbackStatic(Method method) {
		long tcc = tcc_new();

		tcc_set_options(tcc, "-nostdinc -nostdlib");
		tcc_set_output_type(tcc, TCC_OUTPUT_MEMORY);

		String source = "" +
			"extern JNIEnv* getEnv(jboolean *async);\n" +
			"JNIIMPORT extern jclass callback;\n" +
			"JNIIMPORT extern jmethodID method;\n" +
			"\n" +
			"void errorfun(int error, const char *description) {\n" +
			"  jboolean async;\n" +
			"  JNIEnv *env = getEnv(&async);\n" +
			"  (*env)->CallStaticVoidMethod(\n" +
			"    env,\n" +
			"    callback,\n" +
			"    method,\n" +
			"    error,\n" +
			"    description\n" +
			"  );\n" +
			"\n" +
			"  if ( (*env)->ExceptionCheck(env) ) {\n" +
			"    (*env)->ExceptionDescribe(env);\n" +
			"    (*env)->ExceptionClear(env);\n" +
			"  }\n" +
			"}\n";

		long block = nmemAlignedAlloc(CALLBACK_BLOCK_SIZE, CALLBACK_BLOCK_SIZE);
		memSet(block, 0, CALLBACK_BLOCK_SIZE);
		memPutAddress(block, tcc);

		try ( MemoryStack stack = stackPush() ) {
			//System.err.print(source);
			if ( tcc_compile_string(tcc, prependJNIHeader(source, stack)) == -1 )
				throw new IllegalStateException("Compilation failed.");

			tcc_add_symbol(tcc, "getEnv", ThreadLocalUtil.GET_JNI_ENV);
			addSymbol(tcc, block, 2, "callback", FindClass(method.getDeclaringClass().getName().replace('.', '/')));
			addSymbol(tcc, block, 3, "method", FromReflectedMethod(method));
		}

		int size = tcc_relocate(tcc, NULL);
		if ( size < 0 )
			throw new IllegalStateException("Relocate failed.");

		if ( CALLBACK_BLOCK_SIZE - (4 * POINTER_SIZE) < size )
			throw new IllegalStateException("Callback binary too large.");

		if ( tcc_relocate(tcc, block + 4 * POINTER_SIZE) == -1 )
			throw new IllegalStateException("Relocation failed.");

		return tcc_get_symbol(tcc, "errorfun");
	}

	private static long createCallbackCustom(long pi, long pp) {
		long tcc = tcc_new();

		tcc_set_options(tcc, "-nostdinc -nostdlib");
		tcc_set_output_type(tcc, TCC_OUTPUT_MEMORY);

		String source = "" +
			"JNIIMPORT extern int *errorOUT;\n" +
			"JNIIMPORT extern const char **descriptionOUT;\n" +
			"\n" +
			"void errorfun(int error, const char *description) {\n" +
			"  *errorOUT = error;\n" +
			"  *descriptionOUT = description;\n" +
			"}\n";

		long block = nmemAlignedAlloc(CALLBACK_BLOCK_SIZE, CALLBACK_BLOCK_SIZE);
		memSet(block, 0, CALLBACK_BLOCK_SIZE);
		memPutAddress(block, tcc);

		try ( MemoryStack stack = stackPush() ) {
			//System.err.print(source);
			if ( tcc_compile_string(tcc, prependJNIHeader(source, stack)) == -1 )
				throw new IllegalStateException("Compilation failed.");

			addSymbol(tcc, block, 1, "errorOUT", pi);
			addSymbol(tcc, block, 3, "descriptionOUT", pp);
		}

		int size = tcc_relocate(tcc, NULL);
		if ( size < 0 )
			throw new IllegalStateException("Relocate failed.");

		if ( CALLBACK_BLOCK_SIZE - (4 * POINTER_SIZE) < size )
			throw new IllegalStateException("Callback binary too large.");

		if ( tcc_relocate(tcc, block + 4 * POINTER_SIZE) == -1 )
			throw new IllegalStateException("Relocation failed.");

		return tcc_get_symbol(tcc, "errorfun");
	}

	private static void addSymbol(long tcc, long block, int index, String name, long value) {
		long a = block + index * POINTER_SIZE;
		memPutAddress(a, value);
		if ( tcc_add_symbol(tcc, name, a) < 0 )
			throw new IllegalStateException("Failed to add symbol: " + name + "::" + value);
	}

	private static void freeCallback(long pointer) {
		long m = pointer & CALLBACK_BLOCK_MASK;

		tcc_delete(memGetAddress(m + 0 * POINTER_SIZE));
		long ref = memGetAddress(m + 2 * POINTER_SIZE);
		if ( ref != NULL )
			DeleteGlobalRef(ref);

		nmemAlignedFree(m);
	}

}