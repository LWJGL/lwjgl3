/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.libc;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;
import org.testng.annotations.*;

import java.nio.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libc.LibCLocale.*;
import static org.lwjgl.system.libffi.LibFFI.*;
import static org.testng.Assert.*;

@Test
public class StdioTest {

    private static String MESSAGE = "The answer to life the universe and everything";
    private static int    ANSWER  = 42;

    @BeforeClass
    public void init() {
        LibCLocale.setlocale(LC_ALL, "en_US.UTF-8");
    }

    public void testScanf() {
        String INPUT  = String.format("%s = %d", MESSAGE, ANSWER);
        String FORMAT = "%[A-Za-z ]%*[= ]%d";

        try (MemoryStack stack = stackPush()) {
            // Prepare the call interface
            FFICIF cif = FFICIF.mallocStack(stack);

            int status = ffi_prep_cif_var(
                cif, FFI_DEFAULT_ABI, 2, ffi_type_sint,
                stack.callocPointer(4) // 4 arguments (2 fixed, 2 var)
                    // fixed
                    .put(0, ffi_type_pointer) // char const *
                    .put(1, ffi_type_pointer) // char const *
                    // var
                    .put(2, ffi_type_pointer) // char *
                    .put(3, ffi_type_pointer) // int *
            );
            if (status != FFI_OK) {
                throw new IllegalStateException("ffi_prep_cif_var failed: " + status);
            }

            ByteBuffer message = stack.malloc(64);
            IntBuffer  answer  = stack.mallocInt(1);

            ByteBuffer arguments = stack.malloc(4 * POINTER_SIZE);
            PointerBuffer.put(arguments, 0 * POINTER_SIZE, memAddress(stack.UTF8(INPUT)));
            PointerBuffer.put(arguments, 1 * POINTER_SIZE, memAddress(stack.ASCII(FORMAT)));
            PointerBuffer.put(arguments, 2 * POINTER_SIZE, memAddress(message));
            PointerBuffer.put(arguments, 3 * POINTER_SIZE, memAddress(answer));

            ByteBuffer rvalue  = stack.calloc(POINTER_SIZE, POINTER_SIZE);
            long       avalues = memAddress(arguments);

            // call the function
            ffi_call(
                cif, LibCStdio.sscanf, rvalue,
                // An array of pointers that point to the actual argument values.
                stack.mallocPointer(4)
                    .put(0, avalues + 0 * POINTER_SIZE)
                    .put(1, avalues + 1 * POINTER_SIZE)
                    .put(2, avalues + 2 * POINTER_SIZE)
                    .put(3, avalues + 3 * POINTER_SIZE)
            );

            // validate
            int args = rvalue.getInt(0);

            assertEquals(args, 2);
            assertEquals(memASCII(message, memLengthNT1(message)).trim(), MESSAGE);
            assertEquals(answer.get(0), ANSWER);
        }
    }

    public void testPrintf() {
        String FORMAT = "%s = %d";

        try (MemoryStack stack = stackPush()) {
            // Prepare the call interface
            FFICIF cif = FFICIF.mallocStack(stack);

            int status = ffi_prep_cif_var(
                cif, FFI_DEFAULT_ABI, 3, ffi_type_sint,
                stack.mallocPointer(5) // 5 arguments (3 fixed, 2 var)
                    // fixed
                    .put(0, ffi_type_pointer) // char *
                    .put(1, ffi_type_pointer) // size_t
                    .put(2, ffi_type_pointer) // char const *
                    // var
                    .put(3, ffi_type_pointer) // char const *
                    .put(4, ffi_type_sint32) // int
            );
            if (status != FFI_OK) {
                throw new IllegalStateException("ffi_prep_cif_var failed: " + status);
            }

            ByteBuffer buffer = stack.malloc(64);

            ByteBuffer arguments = stack.malloc(4 * POINTER_SIZE + Integer.BYTES);
            PointerBuffer.put(arguments, 0 * POINTER_SIZE, memAddress(buffer));
            PointerBuffer.put(arguments, 1 * POINTER_SIZE, buffer.remaining());
            PointerBuffer.put(arguments, 2 * POINTER_SIZE, memAddress(stack.ASCII(FORMAT)));
            PointerBuffer.put(arguments, 3 * POINTER_SIZE, memAddress(stack.UTF8(MESSAGE)));
            arguments.putInt(4 * POINTER_SIZE, ANSWER);

            ByteBuffer rvalue  = stack.malloc(POINTER_SIZE, POINTER_SIZE);
            long       avalues = memAddress(arguments);

            // call the function
            ffi_call(
                cif, LibCStdio.snprintf, rvalue,
                // An array of pointers that point to the actual argument values.
                stack.mallocPointer(5)
                    .put(0, avalues + 0 * POINTER_SIZE)
                    .put(1, avalues + 1 * POINTER_SIZE)
                    .put(2, avalues + 2 * POINTER_SIZE)
                    .put(3, avalues + 3 * POINTER_SIZE)
                    .put(4, avalues + 4 * POINTER_SIZE)
            );

            int chars = rvalue.get(0);

            // validate
            String expected = String.format(FORMAT, MESSAGE, ANSWER);

            assertEquals(chars, expected.length());
            assertEquals(memUTF8(buffer, chars), expected);
        }
    }
}