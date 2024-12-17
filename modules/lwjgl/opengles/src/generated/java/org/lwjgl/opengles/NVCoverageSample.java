/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class NVCoverageSample {

    static { GLES.initialize(); }

    public static final int GL_COVERAGE_COMPONENT_NV = 0x8ED0;

    public static final int GL_COVERAGE_COMPONENT4_NV = 0x8ED1;

    public static final int
        GL_COVERAGE_ALL_FRAGMENTS_NV  = 0x8ED5,
        GL_COVERAGE_EDGE_FRAGMENTS_NV = 0x8ED6,
        GL_COVERAGE_AUTOMATIC_NV      = 0x8ED7;

    public static final int GL_COVERAGE_ATTACHMENT_NV = 0x8ED2;

    public static final int GL_COVERAGE_BUFFER_BIT_NV = 0x8000;

    public static final int
        GL_COVERAGE_BUFFERS_NV = 0x8ED3,
        GL_COVERAGE_SAMPLES_NV = 0x8ED4;

    protected NVCoverageSample() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCoverageMaskNV ] ---

    /** {@code void glCoverageMaskNV(GLboolean mask)} */
    public static native void glCoverageMaskNV(@NativeType("GLboolean") boolean mask);

    // --- [ glCoverageOperationNV ] ---

    /** {@code void glCoverageOperationNV(GLenum operation)} */
    public static native void glCoverageOperationNV(@NativeType("GLenum") int operation);

}