/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_coverage_sample_resolve.txt">NV_coverage_sample_resolve</a> extension.
 * 
 * <p>NV_coverage_sample introduced a method to improve rendering quality using a separate buffer to store coverage information for pixels in the color
 * buffers. It also provided a mechanism to disable writing to the coverage buffer when coverage sample filtering was not needed or undesirable. However,
 * it did not provide a way to disable reading data from the coverage buffer at resolve time. In some cases performance can be improved by eliminating
 * these memory reads. To that end, this extension exposes a surface attribute that allows applications to specify when no coverage sample resolve is
 * desired.</p>
 * 
 * <p>Requires {@link EGL12 EGL 1.2}.</p>
 */
public final class NVCoverageSampleResolve {

    public static final int
        EGL_COVERAGE_SAMPLE_RESOLVE_NV         = 0x3131,
        EGL_COVERAGE_SAMPLE_RESOLVE_DEFAULT_NV = 0x3132,
        EGL_COVERAGE_SAMPLE_RESOLVE_NONE_NV    = 0x3133;

    private NVCoverageSampleResolve() {}

}