/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_depth_bounds_test = "EXTDepthBoundsTest".nativeClassGL("EXT_depth_bounds_test", postfix = EXT) {
    IntConstant(
        "DEPTH_BOUNDS_TEST_EXT"..0x8890
    )

    IntConstant(
        "DEPTH_BOUNDS_EXT"..0x8891
    )

    void(
        "DepthBoundsEXT",

        double("zmin"),
        double("zmax")
    )
}