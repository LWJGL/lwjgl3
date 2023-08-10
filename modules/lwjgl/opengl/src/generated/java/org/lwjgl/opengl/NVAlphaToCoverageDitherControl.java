/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_alpha_to_coverage_dither_control.txt">NV_alpha_to_coverage_dither_control</a> extension.
 * 
 * <p>{@code NV_alpha_to_coverage_dither_control} provides a new mechanism to control whether dithering is applied when the existing alpha to coverage
 * functionality is used.</p>
 */
public class NVAlphaToCoverageDitherControl {

    static { GL.initialize(); }

    /** Accepted by the {@code param} parameter of {@link #glAlphaToCoverageDitherControlNV AlphaToCoverageDitherControlNV}. */
    public static final int
        GL_ALPHA_TO_COVERAGE_DITHER_DEFAULT_NV = 0x934D,
        GL_ALPHA_TO_COVERAGE_DITHER_ENABLE_NV  = 0x934E,
        GL_ALPHA_TO_COVERAGE_DITHER_DISABLE_NV = 0x934F;

    /** Accepted by the {@code param} of {@link GL11C#glGetIntegerv GetIntegerv}. */
    public static final int GL_ALPHA_TO_COVERAGE_DITHER_MODE_NV = 0x92BF;

    protected NVAlphaToCoverageDitherControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ glAlphaToCoverageDitherControlNV ] ---

    public static native void glAlphaToCoverageDitherControlNV(@NativeType("GLenum") int mode);

}