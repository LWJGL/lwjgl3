/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val NV_coverage_sample = "NVCoverageSample".nativeClassEGL("NV_coverage_sample", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Anti-aliasing is a critical component for delivering high-quality OpenGL rendering. Traditionally, OpenGL implementations have implemented two
        anti-aliasing algorithms: edge anti-aliasing and multisampling.

        Edge anti-aliasing computes fractional fragment coverage for all primitives in a rendered frame, and blends edges of abutting and/or overlapping
        primitives to produce smooth results. The image quality produced by this approach is exceptionally high; however, applications are render their
        geometry perfectly ordered back-to-front in order to avoid artifacts such as bleed-through. Given the algorithmic complexity and performance cost of
        performing exact geometric sorts, edge anti-aliasing has been used very sparingly, and almost never in interactive games.

        Multisampling, on the other hand, computes and stores subpixel (a.k.a. "sample") coverage for rasterized fragments, and replicates all post-alpha test
        operations (e.g., depth test, stencil test, alpha blend) for each sample. After the entire scene is rendered, the samples are filtered to compute the
        final anti-aliased image. Because the post-alpha test operations are replicated for each sample, all of the bleed-through and ordering artifacts that
        could occur with edge anti-aliasing are avoided completely; however, since each sample must be computed and stored separately, anti-aliasing quality is
        limited by framebuffer storage and rendering performance.

        This extension introduces a new anti-aliasing algorithm to OpenGL, which dramatically improves multisampling quality without adversely affecting
        multisampling's robustness or significantly increasing the storage required, coverage sampling.

        Coverage sampling adds an additional high-precision geometric coverage buffer to the framebuffer, which is used to produce high-quality filtered
        results (with or without the presence of a multisample buffer). This coverage information is computed and stored during rasterization; since
        applications may render objects where the specified geometry does not correspond to the visual result (examples include alpha-testing for "imposters,"
        or extruded volume rendering for stencil shadow volumes), coverage buffer updates may be masked by the application, analagous to masking the depth
        buffer.

        Requires ${EGL11.core}.
        """

    IntConstant(
        "",

        "COVERAGE_BUFFERS_NV"..0x30E0,
        "COVERAGE_SAMPLES_NV"..0x30E1
    )
}