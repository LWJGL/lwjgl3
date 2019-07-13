/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.dyncall;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.testng.annotations.*;

import java.nio.*;

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
        try (SharedLibrary lib = Library.loadNative(Library.class, "org.lwjgl", Library.JNI_LIBRARY_NAME, true)) {
            long putInt = lib.getFunctionAddress(
                Platform.get() == Platform.WINDOWS && Pointer.BITS32
                    ? "_Java_org_lwjgl_system_MemoryAccessJNI_nputInt@20" // __stdcall (Win32)
                    : "Java_org_lwjgl_system_MemoryAccessJNI_nputInt"
            );
            assertTrue(putInt != NULL);
            return putInt;
        }
    }

}