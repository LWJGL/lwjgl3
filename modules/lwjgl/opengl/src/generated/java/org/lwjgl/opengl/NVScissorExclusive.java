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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_scissor_exclusive.txt">NV_scissor_exclusive</a> extension.
 * 
 * <p>In unextended OpenGL, applications can enable a per-viewport scissor test ({@link GL11#GL_SCISSOR_TEST SCISSOR_TEST}) where fragments are discarded if their (x,y) coordinates lie
 * outside the corresponding scissor rectangle. In this extension, we provide a separate per-viewport exclusive scissor test, where fragments are
 * discarded if their (x,y) coordinates lie <b>inside</b> the corresponding exclusive scissor rectangle.</p>
 * 
 * <p>The regular (inclusive) scissor test and exclusive scissor test are orthogonal; applications can enable either or both tests for each viewport. If both
 * tests are enabled, fragments will be discarded unless their (x,y) coordinates are both inside the regular scissor rectangle and outside the exclusive
 * scissor rectangle.</p>
 * 
 * <p>Requires {@link GL45 OpenGL 4.5}.</p>
 */
public class NVScissorExclusive {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code cap} parameter of {@link CGL#CGLEnable Enable}, {@link CGL#CGLDisable Disable}, and {@link CGL#CGLIsEnabled IsEnabled}, by the {@code target} parameter of {@link GL30C#glEnablei Enablei}, {@link GL30C#glDisablei Disablei},
     * {@link GL30C#glIsEnabledi IsEnabledi}, {@link EXTDrawBuffers2#glEnableIndexedEXT EnableIndexedEXT}, {@link EXTDrawBuffers2#glDisableIndexedEXT DisableIndexedEXT}, and {@link EXTDrawBuffers2#glIsEnabledIndexedEXT IsEnabledIndexedEXT}, and by the {@code pname} parameter of {@link GL11C#glGetBooleanv GetBooleanv},
     * {@link GL11C#glGetIntegerv GetIntegerv}, {@link GL32C#glGetInteger64v GetInteger64v}, {@link GL11C#glGetFloatv GetFloatv}, {@link GL11C#glGetDoublev GetDoublev}, {@link EXTDirectStateAccess#glGetDoubleIndexedvEXT GetDoubleIndexedvEXT}, {@link GL30C#glGetBooleani_v GetBooleani_v}, {@link GL30C#glGetIntegeri_v GetIntegeri_v}, {@link GL32C#glGetInteger64i_v GetInteger64i_v},
     * {@link GL41C#glGetFloati_v GetFloati_v}, {@link GL41C#glGetDoublei_v GetDoublei_v}, {@link EXTDrawBuffers2#glGetBooleanIndexedvEXT GetBooleanIndexedvEXT}, {@link EXTDrawBuffers2#glGetIntegerIndexedvEXT GetIntegerIndexedvEXT}, and {@link EXTDirectStateAccess#glGetFloatIndexedvEXT GetFloatIndexedvEXT}.
     */
    public static final int GL_SCISSOR_TEST_EXCLUSIVE_NV = 0x9555;

    /**
     * Accepted by the {@code pname} parameter of {@link GL11C#glGetBooleanv GetBooleanv}, {@link GL11C#glGetIntegerv GetIntegerv}, {@link GL32C#glGetInteger64v GetInteger64v}, {@link GL11C#glGetFloatv GetFloatv}, {@link GL11C#glGetDoublev GetDoublev}, {@link GL30C#glGetBooleani_v GetBooleani_v},
     * {@link GL30C#glGetIntegeri_v GetIntegeri_v}, {@link GL32C#glGetInteger64i_v GetInteger64i_v}, {@link GL41C#glGetFloati_v GetFloati_v}, {@link GL41C#glGetDoublei_v GetDoublei_v}, {@link EXTDirectStateAccess#glGetDoubleIndexedvEXT GetDoubleIndexedvEXT}, {@link EXTDrawBuffers2#glGetBooleanIndexedvEXT GetBooleanIndexedvEXT}, {@link EXTDrawBuffers2#glGetIntegerIndexedvEXT GetIntegerIndexedvEXT}, and
     * {@link EXTDirectStateAccess#glGetFloatIndexedvEXT GetFloatIndexedvEXT}.
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
        long __functionAddress = GL.getICD().glScissorExclusiveArrayvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, v.length >> 2, v, __functionAddress);
    }

}