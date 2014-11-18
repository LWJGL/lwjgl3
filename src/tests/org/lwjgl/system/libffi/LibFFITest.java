/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.libffi;

import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.DynamicLinkLibrary;
import org.testng.annotations.Test;

import java.nio.ByteBuffer;

import static org.lwjgl.Pointer.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.glfw.GLFW.*;
import static org.lwjgl.system.libffi.LibFFI.*;
import static org.testng.Assert.*;

@Test
public class LibFFITest {

	public void testLibFFI() {
		int WIDTH = 300;
		int HEIGHT = 300;

		long window = createGLFWWindow(WIDTH, HEIGHT);

		// -- Test GLFW window size using JNI

		ByteBuffer width = BufferUtils.createByteBuffer(4);
		ByteBuffer height = BufferUtils.createByteBuffer(4);

		glfwGetWindowSize(window, width, height);

		assertEquals(width.getInt(0), WIDTH);
		assertEquals(height.getInt(0), HEIGHT);

		width.putInt(0, -1);
		height.putInt(0, -1);

		// -- Test GLFW window size using libffi

		// Get the function address. Ignore this particular implementation, normally you'd create
		// a DynamicLinkLibrary instance here and call getFunctionAddress("<function name>").
		long glfwGetWindowSize = glfwGetWindowSizeAddress();

		// Prepare the call interface
		ByteBuffer cif = ffi_cif.malloc();

		ByteBuffer returnType = memByteBuffer(ffi_type_void, ffi_type.SIZEOF); // Returns void

		PointerBuffer argumentTypes = BufferUtils.createPointerBuffer(5); // 5 arguments
		argumentTypes.put(0, ffi_type_pointer); // JNIEnv*
		argumentTypes.put(1, ffi_type_pointer); // jclass
		argumentTypes.put(2, ffi_type_sint64); // GLFWwindow* (jlong)
		argumentTypes.put(3, ffi_type_sint64); // int* (jlong)
		argumentTypes.put(4, ffi_type_sint64); // int* (jlong)

		int status = ffi_prep_cif(cif, FFI_DEFAULT_ABI, returnType, argumentTypes);
		if ( status != FFI_OK )
			throw new IllegalStateException("ffi_prep_cif failed: " + status);

		// An array of pointers that point to the actual argument values.
		PointerBuffer arguments = BufferUtils.createPointerBuffer(5);

		// Storage for the actual argument values.
		ByteBuffer values = BufferUtils.createByteBuffer(
			POINTER_SIZE +  // JNIEnv*
			POINTER_SIZE +  // jclass
			8 +             // GLFWwindow* (jlong)
			8 +             // int* (jlong)
			8               // int* (jlong)
		);

		{
			// Unsafe, error-prone code. Very easy to crash the JVM.
			// Care must also be taken to correctly align arguments.
			long base = memAddress(values);
			int offset = 0;

			PointerBuffer.put(values, offset, NULL); // JNIEnv* (unused)
			arguments.put(0, base + offset);
			offset += POINTER_SIZE;

			PointerBuffer.put(values, offset, NULL); // jclass (unused)
			arguments.put(1, base + offset);
			offset += POINTER_SIZE;

			values.putLong(offset, window); // GLFWwindow*
			arguments.put(2, base + offset);
			offset += 8;

			values.putLong(offset, memAddress(width)); // int*
			arguments.put(3, base + offset);
			offset += 8;

			values.putLong(offset, memAddress(height)); // int*
			arguments.put(4, base + offset);
		}

		// Invoke the function
		ffi_call(cif, glfwGetWindowSize, null, arguments);

		// Validate
		assertEquals(width.getInt(0), WIDTH);
		assertEquals(height.getInt(0), HEIGHT);

		glfwDestroyWindow(window);
		glfwTerminate();
	}

	private static long createGLFWWindow(int width, int height) {
		if ( glfwInit() != GL_TRUE )
			throw new IllegalStateException("Unable to initialize glfw");

		glfwDefaultWindowHints();
		glfwWindowHint(GLFW_VISIBLE, GL_FALSE);

		return glfwCreateWindow(width, height, "LibFFI Demo", NULL, NULL);
	}

	private static long glfwGetWindowSizeAddress() {
		DynamicLinkLibrary lib = LWJGLUtil.loadLibraryNative("lwjgl");

		long glfwGetWindowSize = lib.getFunctionAddress("Java_org_lwjgl_system_glfw_GLFW_nglfwGetWindowSize");
		if ( glfwGetWindowSize == NULL )
			glfwGetWindowSize = lib.getFunctionAddress("_Java_org_lwjgl_system_glfw_GLFW_nglfwGetWindowSize@32"); // __stdcall (Win32)

		assertTrue(glfwGetWindowSize != NULL);

		return glfwGetWindowSize;
	}

}