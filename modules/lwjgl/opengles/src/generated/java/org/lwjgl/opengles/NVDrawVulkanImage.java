/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVDrawVulkanImage {

    static { GLES.initialize(); }

    protected NVDrawVulkanImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawVkImageNV ] ---

    /** {@code void glDrawVkImageNV(GLuint64 vkImage, GLuint sampler, GLfloat x0, GLfloat y0, GLfloat x1, GLfloat y1, GLfloat z, GLfloat s0, GLfloat t0, GLfloat s1, GLfloat t1)} */
    public static native void glDrawVkImageNV(@NativeType("GLuint64") long vkImage, @NativeType("GLuint") int sampler, @NativeType("GLfloat") float x0, @NativeType("GLfloat") float y0, @NativeType("GLfloat") float x1, @NativeType("GLfloat") float y1, @NativeType("GLfloat") float z, @NativeType("GLfloat") float s0, @NativeType("GLfloat") float t0, @NativeType("GLfloat") float s1, @NativeType("GLfloat") float t1);

    // --- [ glGetVkProcAddrNV ] ---

    /** {@code VULKANPROCNV glGetVkProcAddrNV(GLchar const * name)} */
    public static native long nglGetVkProcAddrNV(long name);

    /** {@code VULKANPROCNV glGetVkProcAddrNV(GLchar const * name)} */
    @NativeType("VULKANPROCNV")
    public static long glGetVkProcAddrNV(@NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetVkProcAddrNV(memAddress(name));
    }

    /** {@code VULKANPROCNV glGetVkProcAddrNV(GLchar const * name)} */
    @NativeType("VULKANPROCNV")
    public static long glGetVkProcAddrNV(@NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetVkProcAddrNV(nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glWaitVkSemaphoreNV ] ---

    /** {@code void glWaitVkSemaphoreNV(GLuint64 vkSemaphore)} */
    public static native void glWaitVkSemaphoreNV(@NativeType("GLuint64") long vkSemaphore);

    // --- [ glSignalVkSemaphoreNV ] ---

    /** {@code void glSignalVkSemaphoreNV(GLuint64 vkSemaphore)} */
    public static native void glSignalVkSemaphoreNV(@NativeType("GLuint64") long vkSemaphore);

    // --- [ glSignalVkFenceNV ] ---

    /** {@code void glSignalVkFenceNV(GLuint64 vkFence)} */
    public static native void glSignalVkFenceNV(@NativeType("GLuint64") long vkFence);

}