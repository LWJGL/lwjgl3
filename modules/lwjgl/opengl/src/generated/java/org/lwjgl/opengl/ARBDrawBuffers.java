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

public class ARBDrawBuffers {

    static { GL.initialize(); }

    public static final int
        GL_MAX_DRAW_BUFFERS_ARB = 0x8824,
        GL_DRAW_BUFFER0_ARB     = 0x8825,
        GL_DRAW_BUFFER1_ARB     = 0x8826,
        GL_DRAW_BUFFER2_ARB     = 0x8827,
        GL_DRAW_BUFFER3_ARB     = 0x8828,
        GL_DRAW_BUFFER4_ARB     = 0x8829,
        GL_DRAW_BUFFER5_ARB     = 0x882A,
        GL_DRAW_BUFFER6_ARB     = 0x882B,
        GL_DRAW_BUFFER7_ARB     = 0x882C,
        GL_DRAW_BUFFER8_ARB     = 0x882D,
        GL_DRAW_BUFFER9_ARB     = 0x882E,
        GL_DRAW_BUFFER10_ARB    = 0x882F,
        GL_DRAW_BUFFER11_ARB    = 0x8830,
        GL_DRAW_BUFFER12_ARB    = 0x8831,
        GL_DRAW_BUFFER13_ARB    = 0x8832,
        GL_DRAW_BUFFER14_ARB    = 0x8833,
        GL_DRAW_BUFFER15_ARB    = 0x8834;

    protected ARBDrawBuffers() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawBuffersARB ] ---

    /** {@code void glDrawBuffersARB(GLsizei n, GLenum const * bufs)} */
    public static native void nglDrawBuffersARB(int n, long bufs);

    /** {@code void glDrawBuffersARB(GLsizei n, GLenum const * bufs)} */
    public static void glDrawBuffersARB(@NativeType("GLenum const *") IntBuffer bufs) {
        nglDrawBuffersARB(bufs.remaining(), memAddress(bufs));
    }

    /** {@code void glDrawBuffersARB(GLsizei n, GLenum const * bufs)} */
    public static void glDrawBuffersARB(@NativeType("GLenum const *") int[] bufs) {
        long __functionAddress = GL.getICD().glDrawBuffersARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(bufs.length, bufs, __functionAddress);
    }

}