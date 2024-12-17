/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_path_rendering_shared_edge = "NVPathRenderingSharedEdge".nativeClassGLES("NV_path_rendering_shared_edge", postfix = NV) {
    IntConstant(
        "SHARED_EDGE_NV"..0xC0
    )
}