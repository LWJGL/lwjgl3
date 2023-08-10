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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_draw_buffers.txt">ARB_draw_buffers</a> extension.
 * 
 * <p>This extension extends {@link ARBFragmentProgram ARB_fragment_program} and {@link ARBFragmentShader ARB_fragment_shader} to allow multiple output colors, and provides a mechanism for
 * directing those outputs to multiple color buffers.</p>
 * 
 * <p>Requires {@link GL13 OpenGL 1.3}. Promoted to core in {@link GL20 OpenGL 2.0}.</p>
 */
public class ARBDrawBuffers {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev. */
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

    /**
     * Unsafe version of: {@link #glDrawBuffersARB DrawBuffersARB}
     *
     * @param n the number of buffers in {@code bufs}
     */
    public static native void nglDrawBuffersARB(int n, long bufs);

    /**
     * Defines the draw buffers to which all output colors are written.
     *
     * @param bufs a buffer of symbolic constants specifying the buffer to which each output color is written. One of:<br><table><tr><td>{@link GL11#GL_NONE NONE}</td><td>{@link GL11#GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link GL11#GL_BACK_LEFT BACK_LEFT}</td><td>{@link GL11#GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link GL11#GL_AUX0 AUX0}</td><td>{@link GL11#GL_AUX1 AUX1}</td><td>{@link GL11#GL_AUX2 AUX2}</td></tr><tr><td>{@link GL11#GL_AUX3 AUX3}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>
     */
    public static void glDrawBuffersARB(@NativeType("GLenum const *") IntBuffer bufs) {
        nglDrawBuffersARB(bufs.remaining(), memAddress(bufs));
    }

    /** Array version of: {@link #glDrawBuffersARB DrawBuffersARB} */
    public static void glDrawBuffersARB(@NativeType("GLenum const *") int[] bufs) {
        long __functionAddress = GL.getICD().glDrawBuffersARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(bufs.length, bufs, __functionAddress);
    }

}