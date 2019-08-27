/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRDebug = "VRDebug".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRDebug_",
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation =
        """
        """

    EVRDebugError(
        "EmitVrProfilerEvent",
        """
        Creates a vr profiler discrete event (point).
		
        The event will be associated with the message provided in {@code pchMessage}, and the current time will be used as the event timestamp.
        """,

        charASCII.p("pchMessage", "")
    )

    EVRDebugError(
        "BeginVrProfilerEvent",
        """
        Creates an vr profiler duration event (line).
        
		The current time will be used as the timestamp for the start of the line. On success, {@code pHandleOut} will contain a handle valid for terminating
        this event.
        """,

        Check(1)..VrProfilerEventHandle_t.p("pHandleOut", "")
    )

    EVRDebugError(
        "FinishVrProfilerEvent",
        """
        Terminates a vr profiler event.
        
		The event associated with {@code hHandle} will be considered completed when this method is called. The current time will be used associated to the
        termination time of the event, and {@code pchMessage} will be used as the event title.
        """,

        VrProfilerEventHandle_t("hHandle", ""),
        charASCII.p("pchMessage", "")
    )

    uint32_t(
        "DriverDebugRequest",
        """
        Sends a request to the driver for the specified device and returns the response.
        
        The maximum response size is 32k, but this method can be called with a smaller buffer. If the response exceeds the size of the buffer, it is truncated.
        The size of the response including its terminating null is returned.
        """,

        TrackedDeviceIndex_t("unDeviceIndex", ""),
        charASCII.p("pchRequest", ""),
        charASCII.p("pchResponseBuffer", ""),
        AutoSize("pchResponseBuffer")..uint32_t("unResponseBufferSize", "")
    )
}