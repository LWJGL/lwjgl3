/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_viewport_array = "ARBViewportArray".nativeClassGL("ARB_viewport_array") {
    IntConstant(
        "MAX_VIEWPORTS"..0x825B,
        "VIEWPORT_SUBPIXEL_BITS"..0x825C,
        "VIEWPORT_BOUNDS_RANGE"..0x825D,
        "LAYER_PROVOKING_VERTEX"..0x825E,
        "VIEWPORT_INDEX_PROVOKING_VERTEX"..0x825F
    )

    IntConstant(
        "UNDEFINED_VERTEX"..0x8260
    )

    reuse(GL41C, "ViewportArrayv")
    reuse(GL41C, "ViewportIndexedf")
    reuse(GL41C, "ViewportIndexedfv")
    reuse(GL41C, "ScissorArrayv")
    reuse(GL41C, "ScissorIndexed")
    reuse(GL41C, "ScissorIndexedv")
    reuse(GL41C, "DepthRangeArrayv")
    reuse(GL41C, "DepthRangeIndexed")
    reuse(GL41C, "GetFloati_v")
    reuse(GL41C, "GetDoublei_v")
}