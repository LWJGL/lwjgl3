/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val ANGLE_sync_control_rate = "ANGLESyncControlRate".nativeClassEGL("ANGLE_sync_control_rate", postfix = ANGLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.
        
        This extension provides counters which let applications know about the timing of the last vertical retrace. By looking at the system clock, as well as
        the refresh rate of the monitor, this should enable applications to predict the position of future retraces so as to schedule an optimal workload.

        This extension incorporates the use of a counter that provides the necessary synchronization. The graphics Media Stream Counter (or graphics MSC) is a
        counter that is unique to the graphics subsystem and increments for each vertical retrace that occurs. 

        By querying the MSC rate for a given surface, the application can accurately predict the timing for the next vertical retraces and schedule rendering
        accordingly.
        """

    EGLBoolean(
        "GetMscRateANGLE",
        "",

        EGLDisplay("dpy", ""),
        EGLSurface("surface", ""),
        Check(1)..int32_t.p("numerator", ""),
        Check(1)..int32_t.p("denominator", "")
    )
}