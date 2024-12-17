/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val ANGLE_sync_control_rate = "ANGLESyncControlRate".nativeClassEGL("ANGLE_sync_control_rate", postfix = ANGLE) {
    EGLBoolean(
        "GetMscRateANGLE",

        EGLDisplay("dpy"),
        EGLSurface("surface"),
        Check(1)..int32_t.p("numerator"),
        Check(1)..int32_t.p("denominator")
    )
}