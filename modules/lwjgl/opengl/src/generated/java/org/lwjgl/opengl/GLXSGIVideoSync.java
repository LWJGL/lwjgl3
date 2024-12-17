/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GLXSGIVideoSync {

    protected GLXSGIVideoSync() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXGetVideoSyncSGI ] ---

    /** {@code GLint glXGetVideoSyncSGI(unsigned int * count)} */
    public static int nglXGetVideoSyncSGI(long count) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetVideoSyncSGI;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(count, __functionAddress);
    }

    /** {@code GLint glXGetVideoSyncSGI(unsigned int * count)} */
    @NativeType("GLint")
    public static int glXGetVideoSyncSGI(@NativeType("unsigned int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nglXGetVideoSyncSGI(memAddress(count));
    }

    // --- [ glXWaitVideoSyncSGI ] ---

    /** {@code GLint glXWaitVideoSyncSGI(int divisor, int remainder, unsigned int * count)} */
    public static int nglXWaitVideoSyncSGI(int divisor, int remainder, long count) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXWaitVideoSyncSGI;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(divisor, remainder, count, __functionAddress);
    }

    /** {@code GLint glXWaitVideoSyncSGI(int divisor, int remainder, unsigned int * count)} */
    @NativeType("GLint")
    public static int glXWaitVideoSyncSGI(int divisor, int remainder, @NativeType("unsigned int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nglXWaitVideoSyncSGI(divisor, remainder, memAddress(count));
    }

    /** {@code GLint glXGetVideoSyncSGI(unsigned int * count)} */
    @NativeType("GLint")
    public static int glXGetVideoSyncSGI(@NativeType("unsigned int *") int[] count) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetVideoSyncSGI;
        if (CHECKS) {
            check(__functionAddress);
            check(count, 1);
        }
        return callPI(count, __functionAddress);
    }

    /** {@code GLint glXWaitVideoSyncSGI(int divisor, int remainder, unsigned int * count)} */
    @NativeType("GLint")
    public static int glXWaitVideoSyncSGI(int divisor, int remainder, @NativeType("unsigned int *") int[] count) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXWaitVideoSyncSGI;
        if (CHECKS) {
            check(__functionAddress);
            check(count, 1);
        }
        return callPI(divisor, remainder, count, __functionAddress);
    }

}