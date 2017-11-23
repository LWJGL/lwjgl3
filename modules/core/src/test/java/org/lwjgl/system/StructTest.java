/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;
import org.lwjgl.system.jni.*;
import org.testng.annotations.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.testng.Assert.*;

@Test
public class StructTest {

    public void testAllocation() {
        JNINativeMethod.create();
        JNINativeMethod.malloc().free();
        JNINativeMethod.calloc().free();

        try (MemoryStack stack = stackPush()) {
            JNINativeMethod.mallocStack(stack);
            JNINativeMethod.callocStack(stack);
        }

        expectThrows(IllegalArgumentException.class, () -> new JNINativeMethod(BufferUtils.createByteBuffer(4)));
    }

    public void testAllocationBuffer() {
        JNINativeMethod.create(10);
        JNINativeMethod.malloc(10).free();
        JNINativeMethod.calloc(10).free();

        try (MemoryStack stack = stackPush()) {
            JNINativeMethod.mallocStack(10, stack);
            JNINativeMethod.callocStack(10, stack);
        }

        assertEquals(new JNINativeMethod.Buffer(BufferUtils.createByteBuffer(4)).capacity(), 0);
    }

    public void testValidation() {
        try (MemoryStack stack = stackPush()) {
            JNINativeMethod s = JNINativeMethod.callocStack(stack);

            assertTrue(s.isNull(JNINativeMethod.NAME));
            expectThrows(NullPointerException.class, s::name);

            expectThrows(NullPointerException.class, () -> JNINativeMethod.validate(s.address()));
            s.name(stack.UTF8("myMethodName"));
            expectThrows(NullPointerException.class, () -> JNINativeMethod.validate(s.address()));
            s.signature(stack.UTF8("(I)I"));
            expectThrows(NullPointerException.class, () -> JNINativeMethod.validate(s.address()));
            s.fnPtr(0x12341234L);
            JNINativeMethod.validate(s.address());

            assertFalse(s.isNull(JNINativeMethod.NAME));
            assertEquals(s.nameString(), "myMethodName");

        }
    }

}
