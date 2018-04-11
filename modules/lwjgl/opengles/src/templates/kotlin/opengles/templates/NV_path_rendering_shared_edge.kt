/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_path_rendering_shared_edge = "NVPathRenderingSharedEdge".nativeClassGLES("NV_path_rendering_shared_edge", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces a new path command modifier to the NV_path_rendering extension to indicate that a path command represents an edge (either
        straight or curved) that is shared with another path.

        When used in conjunction with NV_framebuffer_mixed_samples, a shared edge (or a whole path including shared edges) will use modified rasterization
        rules in order to ensure that groups of raster samples associated with a given coverage sample will all produce consistent coverage results, in order
        to avoid artifacts described further in the issues section at the end of this document.

        Requires ${NV_path_rendering.link}.
        """

    IntConstant(
        "Allowed to be added to command tokens in elements of the {@code commands} array parameter of PathCommandsNV and PathSubCommandsNV.",

        "SHARED_EDGE_NV"..0xC0
    )
}