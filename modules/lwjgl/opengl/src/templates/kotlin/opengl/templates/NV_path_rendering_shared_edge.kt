/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_path_rendering_shared_edge = "NVPathRenderingSharedEdge".nativeClassGL("NV_path_rendering_shared_edge", postfix = NV) {
    IntConstant(
        "SHARED_EDGE_NV"..0xC0
    )
}