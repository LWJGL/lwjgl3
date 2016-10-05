/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.dyncall;

import org.lwjgl.BufferUtils;
import org.lwjgl.system.*;
import org.testng.annotations.Test;

import java.nio.IntBuffer;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCall.*;
import static org.testng.Assert.*;

@Test
public class DynCallTest {

	/** Test MemoryAccess.putInt using dyncall. */
	public void testDynCall() {
		// Get the function address. Ignore this particular implementation, normally we'd create
		// a SharedLibrary instance here and call getFunctionAddress("<function name>").
		long putInt = getPutIntAddress();

		// The memory we'll modify using dyncall
		IntBuffer target = BufferUtils.createIntBuffer(1);

		// Create the CallVM object
		long vm = dcNewCallVM(1024);

		// Set calling convention
		dcMode(vm, DC_CALL_C_DEFAULT);

		{
			// must reset before every call
			dcReset(vm);

			// bind the arguments
			dcArgPointer(vm, NULL); // JNIEnv*
			dcArgPointer(vm, NULL); // jclass
			dcArgLongLong(vm, memAddress(target));
			dcArgInt(vm, 0xBAADF00D);

			// call the function
			dcCallVoid(vm, putInt);
		}

		// Validate
		assertEquals(target.get(0), 0xBAADF00D);

		// Free the CallVM object
		dcFree(vm);
	}

	private static long getPutIntAddress() {
		try ( SharedLibrary lib = Library.loadNative(Library.JNI_LIBRARY_NAME) ) {
			long putInt = lib.getFunctionAddress("Java_org_lwjgl_system_MemoryAccess_putInt");
			assertTrue(putInt != NULL);
			return putInt;
		}
	}

}