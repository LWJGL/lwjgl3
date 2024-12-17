/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_loop_points = "SOFTLoopPoints".nativeClassAL("SOFT_loop_points") {
    IntConstant(
        "LOOP_POINTS_SOFT"..0x2015
    )
}