/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.libc;

import org.lwjgl.system.*;
import org.testng.annotations.*;

import java.nio.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCall.*;
import static org.lwjgl.system.libc.LibCLocale.*;
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

        long vm = dcNewCallVM(1024);
        try (MemoryStack stack = stackPush()) {
            dcReset(vm);

            ByteBuffer input  = stack.UTF8(INPUT);
            ByteBuffer format = stack.ASCII(FORMAT);

            ByteBuffer message = stack.malloc(64);
            IntBuffer  answer  = stack.mallocInt(1);

            dcMode(vm, DC_CALL_C_ELLIPSIS);
            dcArgPointer(vm, memAddress(input));
            dcArgPointer(vm, memAddress(format));

            dcMode(vm, DC_CALL_C_ELLIPSIS_VARARGS);
            dcArgPointer(vm, memAddress(message));
            dcArgPointer(vm, memAddress(answer));

            int args = dcCallInt(vm, LibCStdio.sscanf);

            assertEquals(args, 2);
            assertEquals(memASCII(message, memLengthNT1(message)).trim(), MESSAGE);
            assertEquals(answer.get(0), ANSWER);
        } finally {
            dcFree(vm);
        }
    }

    public void testPrintf() {
        String FORMAT = "%s = %d";

        long vm = dcNewCallVM(1024);
        try (MemoryStack stack = stackPush()) {
            dcReset(vm);

            ByteBuffer buffer  = stack.malloc(64);
            ByteBuffer format  = stack.ASCII(FORMAT);
            ByteBuffer message = stack.UTF8(MESSAGE);

            dcMode(vm, DC_CALL_C_ELLIPSIS);
            dcArgPointer(vm, memAddress(buffer));
            dcArgInt(vm, buffer.remaining());
            dcArgPointer(vm, memAddress(format));

            dcMode(vm, DC_CALL_C_ELLIPSIS_VARARGS);
            dcArgPointer(vm, memAddress(message));
            dcArgInt(vm, ANSWER);

            int chars = dcCallInt(vm, LibCStdio.snprintf);

            String expected = String.format(FORMAT, MESSAGE, ANSWER);

            assertEquals(chars, expected.length());
            assertEquals(memUTF8(buffer, chars), expected);
        } finally {
            dcFree(vm);
        }
    }
}