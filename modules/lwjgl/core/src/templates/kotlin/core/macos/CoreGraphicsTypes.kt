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
    CGFloat("x")
    CGFloat("y")
}

val CGEventTapInformation = struct(Module.CORE_MACOS, "CGEventTapInformation", mutable = false) {
    uint32_t("eventTapID")
    CGEventTapLocation("tapPoint")
    CGEventTapOptions("options")
    CGEventMask("eventsOfInterest")
    pid_t("tappingProcess")
    pid_t("processBeingTapped")
    bool("enabled")
    float("minUsecLatency")
    float("avgUsecLatency")
    float("maxUsecLatency")
}

val CGEventTapCallBack = Module.CORE_MACOS.callback {
    CGEventRef(
        "CGEventTapCallBack",

        CGEventTapProxy("proxy"),
        CGEventType("type"),
        CGEventRef("event"),
        opaque_p("userInfo")
    ) {}
}