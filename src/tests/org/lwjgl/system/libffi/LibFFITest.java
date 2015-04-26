/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.libffi;

import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.PointerBuffer;
import org.lwjgl.Sys;
import org.lwjgl.system.DynamicLinkLibrary;
import org.testng.annotations.Test;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;
import static org.testng.Assert.*;

@Test
public class LibFFITest {

	public void testLibFFI() {
		// -- Test MemoryUtil.nMemPutInt using libffi

		// Get the function address. Ignore this particular implementation, normally you'd create
		// a DynamicLinkLibrary instance here and call getFunctionAddress("<function name>").
		long memPutInt = getMemPutIntAddress();

		// Prepare the call interface
		ByteBuffer cif = FFICIF.malloc();

		PointerBuffer argumentTypes = BufferUtils.createPointerBuffer(4); // 4 arguments
		argumentTypes.put(0, ffi_type_pointer); // JNIEnv*
		argumentTypes.put(1, ffi_type_pointer); // jclass
		argumentTypes.put(2, ffi_type_sint64); // void* (jlong)
		argumentTypes.put(3, ffi_type_sint32); // jint

		int status = ffi_prep_cif(cif, FFI_DEFAULT_ABI, ffi_type_void, argumentTypes);
		if ( status != FFI_OK )
			throw new IllegalStateException("ffi_prep_cif failed: " + status);

		// An array of pointers that point to the actual argument values.
		PointerBuffer arguments = BufferUtils.createPointerBuffer(5);

		// Storage for the actual argument values.
		ByteBuffer values = BufferUtils.createByteBuffer(
			POINTER_SIZE +  // JNIEnv*
			POINTER_SIZE +  // jclass
			8 +             // void* (jlong)
			4               // jint
		);

		// The memory we'll modify using libffi
		IntBuffer target = BufferUtils.createIntBuffer(1);

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

			values.putLong(offset, memAddress(target)); // void*
			arguments.put(2, base + offset);
			offset += 8;

			values.putInt(offset, 0xBAADF00D); // jint
			arguments.put(3, base + offset);
		}

		// Invoke the function
		ffi_call(cif, memPutInt, null, arguments);

		// Validate
		assertEquals(target.get(0), 0xBAADF00D);
	}

	private static long getMemPutIntAddress() {
		DynamicLinkLibrary lib = LWJGLUtil.loadLibraryNative(Sys.JNI_LIBRARY_NAME);

		long nMemPutInt = lib.getFunctionAddress("Java_org_lwjgl_system_MemoryUtil_nMemPutInt");
		if ( nMemPutInt == NULL )
			nMemPutInt = lib.getFunctionAddress("_Java_org_lwjgl_system_MemoryUtil_nMemPutInt@20"); // __stdcall (Win32)

		assertTrue(nMemPutInt != NULL);

		return nMemPutInt;
	}

}