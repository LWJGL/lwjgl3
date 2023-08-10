/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_coverage_sample.txt">NV_coverage_sample</a> extension.
 * 
 * <p>Anti-aliasing is a critical component for delivering high-quality OpenGL rendering. Traditionally, OpenGL implementations have implemented two
 * anti-aliasing algorithms: edge anti-aliasing and multisampling.</p>
 * 
 * <p>Edge anti-aliasing computes fractional fragment coverage for all primitives in a rendered frame, and blends edges of abutting and/or overlapping
 * primitives to produce smooth results. The image quality produced by this approach is exceptionally high; however, applications are render their
 * geometry perfectly ordered back-to-front in order to avoid artifacts such as bleed-through. Given the algorithmic complexity and performance cost of
 * performing exact geometric sorts, edge anti-aliasing has been used very sparingly, and almost never in interactive games.</p>
 * 
 * <p>Multisampling, on the other hand, computes and stores subpixel (a.k.a. "sample") coverage for rasterized fragments, and replicates all post-alpha test
 * operations (e.g., depth test, stencil test, alpha blend) for each sample. After the entire scene is rendered, the samples are filtered to compute the
 * final anti-aliased image. Because the post-alpha test operations are replicated for each sample, all of the bleed-through and ordering artifacts that
 * could occur with edge anti-aliasing are avoided completely; however, since each sample must be computed and stored separately, anti-aliasing quality is
 * limited by framebuffer storage and rendering performance.</p>
 * 
 * <p>This extension introduces a new anti-aliasing algorithm to OpenGL, which dramatically improves multisampling quality without adversely affecting
 * multisampling's robustness or significantly increasing the storage required, coverage sampling.</p>
 * 
 * <p>Coverage sampling adds an additional high-precision geometric coverage buffer to the framebuffer, which is used to produce high-quality filtered
 * results (with or without the presence of a multisample buffer). This coverage information is computed and stored during rasterization; since
 * applications may render objects where the specified geometry does not correspond to the visual result (examples include alpha-testing for "imposters,"
 * or extruded volume rendering for stencil shadow volumes), coverage buffer updates may be masked by the application, analagous to masking the depth
 * buffer.</p>
 * 
 * <p>Requires {@link EGL11 EGL 1.1}.</p>
 */
public final class NVCoverageSample {

    public static final int
        EGL_COVERAGE_BUFFERS_NV = 0x30E0,
        EGL_COVERAGE_SAMPLES_NV = 0x30E1;

    private NVCoverageSample() {}

}