/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_scissor_exclusive.txt">NV_scissor_exclusive</a> extension.
 * 
 * <p>In unextended OpenGL, applications can enable a per-viewport scissor test ({@link GLES20#GL_SCISSOR_TEST SCISSOR_TEST}) where fragments are discarded if their (x,y) coordinates lie
 * outside the corresponding scissor rectangle. In this extension, we provide a separate per-viewport exclusive scissor test, where fragments are
 * discarded if their (x,y) coordinates lie <b>inside</b> the corresponding exclusive scissor rectangle.</p>
 * 
 * <p>The regular (inclusive) scissor test and exclusive scissor test are orthogonal; applications can enable either or both tests for each viewport. If both
 * tests are enabled, fragments will be discarded unless their (x,y) coordinates are both inside the regular scissor rectangle and outside the exclusive
 * scissor rectangle.</p>
 * 
 * <p>Requires {@link GLES32 GLES 3.2} and {@link NVViewportArray NV_viewport_array} or {@link OESViewportArray OES_viewport_array}.</p>
 */
public class NVScissorExclusive {

    static { GLES.initialize(); }

    /**
     * Accepted by the {@code cap} parameter of {@link GLES20#glEnable Enable}, {@link GLES20#glDisable Disable}, and {@link GLES20#glIsEnabled IsEnabled}, by the {@code target} parameter of {@link GLES32#glEnablei Enablei}, {@link GLES32#glDisablei Disablei} and
     * {@link GLES32#glIsEnabledi IsEnabledi}, and by the {@code pname} parameter of {@link GLES20#glGetBooleanv GetBooleanv}, {@link GLES20#glGetIntegerv GetIntegerv}, {@link GLES30#glGetInteger64v GetInteger64v}, {@link GLES20#glGetFloatv GetFloatv}, {@link GLES31#glGetBooleani_v GetBooleani_v}, {@link GLES30#glGetIntegeri_v GetIntegeri_v}
     * and {@link GLES30#glGetInteger64i_v GetInteger64i_v}.
     */
    public static final int GL_SCISSOR_TEST_EXCLUSIVE_NV = 0x9555;

    /**
     * Accepted by the {@code pname} parameter of {@link GLES20#glGetBooleanv GetBooleanv}, {@link GLES20#glGetIntegerv GetIntegerv}, {@link GLES30#glGetInteger64v GetInteger64v}, {@link GLES20#glGetFloatv GetFloatv}, {@link GLES31#glGetBooleani_v GetBooleani_v}, {@link GLES30#glGetIntegeri_v GetIntegeri_v} and
     * {@link GLES30#glGetInteger64i_v GetInteger64i_v}.
     */
    public static final int GL_SCISSOR_BOX_EXCLUSIVE_NV = 0x9556;

    protected NVScissorExclusive() {
        throw new UnsupportedOperationException();
    }

    // --- [ glScissorExclusiveArrayvNV ] ---

    public static native void nglScissorExclusiveArrayvNV(int first, int count, long v);

    public static void glScissorExclusiveArrayvNV(@NativeType("GLuint") int first, @NativeType("GLint const *") IntBuffer v) {
        nglScissorExclusiveArrayvNV(first, v.remaining() >> 2, memAddress(v));
    }

    // --- [ glScissorExclusiveNV ] ---

    public static native void glScissorExclusiveNV(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    /** Array version of: {@link #glScissorExclusiveArrayvNV ScissorExclusiveArrayvNV} */
    public static void glScissorExclusiveArrayvNV(@NativeType("GLuint") int first, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GLES.getICD().glScissorExclusiveArrayvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, v.length >> 2, v, __functionAddress);
    }

}