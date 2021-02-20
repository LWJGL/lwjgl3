/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.libffi;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.testng.annotations.*;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;
import static org.lwjgl.system.libffi.LibFFI.*;
import static org.testng.Assert.*;

@Test
public class LibFFITest {

    /** Calls {@link MemoryAccessJNI#nputInt} using libffi. */
    public void testDowncall() {
        // Get the function address. Ignore this particular implementation, normally you'd create
        // a SharedLibrary instance here and call getFunctionAddress("<function name>").
        long memPutInt = getMemPutIntAddress();
        downcall(memPutInt);
    }

    private static void downcall(long functionAddress) {
        // Prepare the call interface
        FFICIF cif = FFICIF.malloc();

        PointerBuffer argumentTypes = BufferUtils.createPointerBuffer(4) // 4 arguments
            .put(0, ffi_type_pointer) // JNIEnv*
            .put(1, ffi_type_pointer) // jclass
            .put(2, ffi_type_sint64) // void* (jlong)
            .put(3, ffi_type_sint32); // jint

        int status = ffi_prep_cif(cif, FFI_DEFAULT_ABI, ffi_type_void, argumentTypes);
        if (status != FFI_OK) {
            throw new IllegalStateException("ffi_prep_cif failed: " + status);
        }

        // An array of pointers that point to the actual argument values.
        PointerBuffer arguments = BufferUtils.createPointerBuffer(4);

        // Storage for the actual argument values.
        ByteBuffer values = BufferUtils.createByteBuffer(
            POINTER_SIZE +  // JNIEnv*
            POINTER_SIZE +  // jclass
            8 +             // void* (jlong)
            4               // jint
        );

        // The memory we'll modify using libffi
        IntBuffer target = BufferUtils.createIntBuffer(1);

        // Setup the argument buffers
        {
            // JNIEnv* (unused)
            arguments.put(memAddress(values));
            PointerBuffer.put(values, NULL);

            // jclass (unused)
            arguments.put(memAddress(values));
            PointerBuffer.put(values, NULL);

            // void* (jlong)
            arguments.put(memAddress(values));
            values.putLong(memAddress(target));

            // jint
            arguments.put(memAddress(values));
            values.putInt(0xBAADF00D);
        }
        arguments.flip();
        values.flip();

        // Invoke the function and validate
        assertEquals(target.get(0), 0x0);
        ffi_call(cif, functionAddress, null, arguments);
        assertEquals(target.get(0), 0xBAADF00D);

        cif.free();
    }

    private static long getMemPutIntAddress() {
        SharedLibrary lib = Library.loadNative(MemoryUtil.class, "org.lwjgl", Library.JNI_LIBRARY_NAME, true);

        long putInt = lib.getFunctionAddress(
            Platform.get() == Platform.WINDOWS && Pointer.BITS32
                ? "_Java_org_lwjgl_system_MemoryAccessJNI_nputInt@20" // __stdcall (Win32)
                : "Java_org_lwjgl_system_MemoryAccessJNI_nputInt"
        );

        assertTrue(putInt != NULL);

        return putInt;
    }

}