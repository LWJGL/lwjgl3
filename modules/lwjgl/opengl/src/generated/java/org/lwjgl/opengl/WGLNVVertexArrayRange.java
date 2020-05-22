/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class WGLNVVertexArrayRange {

    protected WGLNVVertexArrayRange() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglAllocateMemoryNV ] ---

    public static long nwglAllocateMemoryNV(int size, float readfreq, float writefreq, float priority) {
        long __functionAddress = GL.getCapabilitiesWGL().wglAllocateMemoryNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(size, readfreq, writefreq, priority, __functionAddress);
    }

    @Nullable
    @NativeType("void *")
    public static ByteBuffer wglAllocateMemoryNV(@NativeType("GLsizei") int size, @NativeType("GLfloat") float readfreq, @NativeType("GLfloat") float writefreq, @NativeType("GLfloat") float priority) {
        long __result = nwglAllocateMemoryNV(size, readfreq, writefreq, priority);
        return memByteBufferSafe(__result, size);
    }

    // --- [ wglFreeMemoryNV ] ---

    public static void nwglFreeMemoryNV(long pointer) {
        long __functionAddress = GL.getCapabilitiesWGL().wglFreeMemoryNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pointer, __functionAddress);
    }

    public static void wglFreeMemoryNV(@NativeType("void *") ByteBuffer pointer) {
        nwglFreeMemoryNV(memAddress(pointer));
    }

}