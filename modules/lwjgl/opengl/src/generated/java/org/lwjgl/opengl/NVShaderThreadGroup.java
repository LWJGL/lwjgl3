/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_shader_thread_group.txt">NV_shader_thread_group</a> extension.
 * 
 * <p>Implementations of the OpenGL Shading Language may, but are not required to, run multiple shader threads for a single stage as a SIMD thread group,
 * where individual execution threads are assigned to thread groups in an undefined, implementation-dependent order. This extension provides a set of new
 * features to the OpenGL Shading Language to query thread states and to share data between fragments within a 2x2 pixel quad.</p>
 * 
 * <p>Requires {@link GL43 OpenGL 4.3}.</p>
 */
public final class NVShaderThreadGroup {

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_WARP_SIZE_NV    = 0x9339,
        GL_WARPS_PER_SM_NV = 0x933A,
        GL_SM_COUNT_NV     = 0x933B;

    private NVShaderThreadGroup() {}

}