/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.macos

import org.lwjgl.generator.*

val CGDirectDisplayID = typedef(uint32_t, "CGDirectDisplayID")
val CGEventField = typedef(uint32_t, "CGEventField")
val CGEventMask = typedef(uint64_t, "CGEventMask")
val CGEventTimestamp = typedef(uint64_t, "CGEventTimestamp")
val CGFloat = typedef(double, "CGFloat")
val CGKeyCode = typedef(uint16_t, "CGKeyCode")
val UniChar = typedef(UInt16, "UniChar")
val UniCharCount = typedef(unsigned_long, "UniCharCount")

val CFMachPortRef = "CFMachPortRef".handle
val CGEventRef = "CGEventRef".handle
val CGEventSourceRef = "CGEventSourceRef".handle
val CGEventTapProxy = "CGEventTapProxy".handle

val CGError = "CGError".enumType
val CGEventFlags = "CGEventFlags".enumType(uint64_t)
val CGEventTapLocation = "CGEventTapLocation".enumType
val CGEventTapOptions = "CGEventTapOptions".enumType
val CGEventTapPlacement = "CGEventTapPlacement".enumType
val CGEventType = "CGEventType".enumType
val CGMouseButton = "CGMouseButton".enumType
val CGScrollEventUnit = "CGScrollEventUnit".enumType

val CGPoint = struct(Module.CORE_MACOS, "CGPoint") {
    documentation = "A structure that contains a point in a two-dimensional coordinate system."

    CGFloat("x", "the x-coordinate of the point")
    CGFloat("y", "the y-coordinate of the point")
}

val CGEventTapInformation = struct(Module.CORE_MACOS, "CGEventTapInformation", mutable = false) {
    documentation = "The structure used to report information about event taps."

    uint32_t("eventTapID", "")
    CGEventTapLocation("tapPoint", "HID, session, annotated session")
    CGEventTapOptions("options", "listener, filter")
    CGEventMask("eventsOfInterest", "mask of events being tapped")
    pid_t("tappingProcess", "process that is tapping events")
    pid_t("processBeingTapped", "zero if not a per-process tap")
    bool("enabled", "true if tap is enabled")
    float("minUsecLatency", "minimum latency in microseconds")
    float("avgUsecLatency", "average latency in microseconds")
    float("maxUsecLatency", "maximum latency in microseconds")
}

val CGEventTapCallBack = Module.CORE_MACOS.callback {
    CGEventRef(
        "CGEventTapCallBack",
        """
        A client-supplied callback function that’s invoked whenever an associated event tap receives a Quartz event.
   
        The callback is passed a proxy for the tap, the event type, the incoming event, and the user-defined data specified when the event tap was created. The
        function should return the (possibly modified) passed-in event, a newly constructed event, or #NULL if the event is to be deleted. The event passed to
        the callback is retained by the calling code, and is released after the callback returns and the data is passed back to the event system. If a
        different event is returned by the callback function, then that event will be released by the calling code along with the original event, after the
        event data has been passed back to the event system.
        """,

        CGEventTapProxy("proxy", ""),
        CGEventType("type", ""),
        CGEventRef("event", ""),
        opaque_p("userInfo", "")
    ) {
        documentation = "Instances of this interface may be passed to the #EventTapCreate() method."
    }
}