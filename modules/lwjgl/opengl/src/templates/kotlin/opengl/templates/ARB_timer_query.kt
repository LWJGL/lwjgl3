/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_timer_query = "ARBTimerQuery".nativeClassGL("ARB_timer_query") {
    IntConstant(
        "TIME_ELAPSED"..0x88BF
    )

    IntConstant(
        "TIMESTAMP"..0x8E28
    )

    reuse(GL33C, "QueryCounter")
    reuse(GL33C, "GetQueryObjecti64v")
    reuse(GL33C, "GetQueryObjectui64v")
}