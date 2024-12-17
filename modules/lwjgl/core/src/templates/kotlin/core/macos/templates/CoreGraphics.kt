/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.macos.templates

import org.lwjgl.generator.*
import core.macos.*

val CoreGraphics = "CoreGraphics".nativeClass(
    Module.CORE_MACOS,
    nativeSubPath = "macos",
    prefixConstant = "kCG",
    prefixMethod = "CG",
    binding = simpleBinding(Module.CORE_MACOS, "CoreGraphics", "\"/System/Library/Frameworks/CoreGraphics.framework\"")
) {
    nativeImport("<CoreGraphics/CoreGraphics.h>")

    EnumConstant(
        "ErrorSuccess".enum("0"),
        "ErrorFailure".enum("1000"),
        "ErrorIllegalArgument".enum,
        "ErrorInvalidConnection".enum,
        "ErrorInvalidContext".enum,
        "ErrorCannotComplete".enum,
        "ErrorNotImplemented".enum("1006"),
        "ErrorRangeCheck".enum,
        "ErrorTypeCheck".enum,
        "ErrorInvalidOperation".enum("1010"),
        "ErrorNoneAvailable".enum
    )

    EnumConstant(
        "EventNull".enum("0"),

        "EventLeftMouseDown".enum,
        "EventLeftMouseUp".enum,
        "EventRightMouseDown".enum,
        "EventRightMouseUp".enum,
        "EventMouseMoved".enum,
        "EventLeftMouseDragged".enum,
        "EventRightMouseDragged".enum,

        "EventKeyDown".enum(10),
        "EventKeyUp".enum,
        "EventFlagsChanged".enum,

        "EventScrollWheel".enum(22),
        "EventTabletPointer".enum,
        "EventTabletProximity".enum,
        "EventOtherMouseDown".enum,
        "EventOtherMouseUp".enum,
        "EventOtherMouseDragged".enum,

        "EventTapDisabledByTimeout".enum(0xFFFFFFFE.i),
        "EventTapDisabledByUserInput".enum(0xFFFFFFFF.i)
    )

    EnumConstant(
        "MouseButtonLeft".enum("0"),
        "MouseButtonRight".enum,
        "MouseButtonCenter".enum
    )

    EnumConstant(
        "HIDEventTap".enum(0),
        "SessionEventTap".enum,
        "AnnotatedSessionEventTap".enum
    )

    EnumConstant(
        "ScrollEventUnitPixel".enum("0"),
        "ScrollEventUnitLine".enum
    )

    EnumConstant(
        "MouseEventNumber".enum("0"),
        "MouseEventClickState".enum,
        "MouseEventPressure".enum,
        "MouseEventButtonNumber".enum,
        "MouseEventDeltaX".enum,
        "MouseEventDeltaY".enum,
        "MouseEventInstantMouser".enum,
        "MouseEventSubtype".enum,
        "KeyboardEventAutorepeat".enum,
        "KeyboardEventKeycode".enum,
        "KeyboardEventKeyboardType".enum,
        "ScrollWheelEventDeltaAxis1".enum,
        "ScrollWheelEventDeltaAxis2".enum,
        "ScrollWheelEventDeltaAxis3".enum,
        "ScrollWheelEventFixedPtDeltaAxis1".enum("93"),
        "ScrollWheelEventFixedPtDeltaAxis2".enum,
        "ScrollWheelEventFixedPtDeltaAxis3".enum,
        "ScrollWheelEventPointDeltaAxis1".enum,
        "ScrollWheelEventPointDeltaAxis2".enum,
        "ScrollWheelEventPointDeltaAxis3".enum,
        "ScrollWheelEventScrollPhase".enum,
        "ScrollWheelEventScrollCount".enum,
        "ScrollWheelEventMomentumPhase".enum("123"),
        "ScrollWheelEventInstantMouser".enum("14"),
        "TabletEventPointX".enum,
        "TabletEventPointY".enum,
        "TabletEventPointZ".enum,
        "TabletEventPointButtons".enum,
        "TabletEventPointPressure".enum,
        "TabletEventTiltX".enum,
        "TabletEventTiltY".enum,
        "TabletEventRotation".enum,
        "TabletEventTangentialPressure".enum,
        "TabletEventDeviceID".enum,
        "TabletEventVendor1".enum,
        "TabletEventVendor2".enum,
        "TabletEventVendor3".enum,
        "TabletProximityEventVendorID".enum,
        "TabletProximityEventTabletID".enum,
        "TabletProximityEventPointerID".enum,
        "TabletProximityEventDeviceID".enum,
        "TabletProximityEventSystemTabletID".enum,
        "TabletProximityEventVendorPointerType".enum,
        "TabletProximityEventVendorPointerSerialNumber".enum,
        "TabletProximityEventVendorUniqueID".enum,
        "TabletProximityEventCapabilityMask".enum,
        "TabletProximityEventPointerType".enum,
        "TabletProximityEventEnterProximity".enum,
        "EventTargetProcessSerialNumber".enum,
        "EventTargetUnixProcessID".enum,
        "EventSourceUnixProcessID".enum,
        "EventSourceUserData".enum,
        "EventSourceUserID".enum,
        "EventSourceGroupID".enum,
        "EventSourceStateID".enum,
        "ScrollWheelEventIsContinuous".enum("88"),
        "MouseEventWindowUnderMousePointer".enum("91"),
        "MouseEventWindowUnderMousePointerThatCanHandleThisEvent".enum
    )

    EnumConstant(
        "EventMouseSubtypeDefault".enum("0"),
        "EventMouseSubtypeTabletPoint".enum,
        "EventMouseSubtypeTabletProximity".enum
    )

    CFTypeID(
        "EventGetTypeID",

        void()
    )

    CGEventRef(
        "EventCreate",

        nullable..CGEventSourceRef("source")
    )

    CFDataRef(
        "EventCreateData",

        nullable..CFAllocatorRef("allocator"),
        nullable..CGEventRef("event")
    )

    CGEventRef(
        "EventCreateFromData",

        nullable..CFAllocatorRef("allocator"),
        nullable..CFDataRef("data")
    )

    CGEventRef(
        "EventCreateMouseEvent",

        nullable..CGEventSourceRef("source"),
        CGEventType("mouseType"),
        CGPoint("mouseCursorPosition"),
        CGMouseButton("mouseButton")
    )

    CGEventRef(
        "EventCreateKeyboardEvent",

        nullable..CGEventSourceRef("source"),
        CGKeyCode("virtualKey"),
        bool("keyDown")
    )

    CGEventRef(
        "EventCreateScrollWheelEvent",

        nullable..CGEventSourceRef("source"),
        CGScrollEventUnit("units"),
        //TODO:
        Expression("1")..uint32_t("wheelCount"),
        int32_t("wheel1")/*,
        ...*/
    )

    IgnoreMissing..CGEventRef(
        "EventCreateScrollWheelEvent2",

        nullable..CGEventSourceRef("source"),
        CGScrollEventUnit("units"),
        uint32_t("wheelCount"),
        int32_t("wheel1"),
        int32_t("wheel2"),
        int32_t("wheel3")
    )

    CGEventRef(
        "EventCreateCopy",

        nullable..CGEventRef("event")
    )

    CGEventSourceRef(
        "EventCreateSourceFromEvent",

        nullable..CGEventRef("event")
    )

    void(
        "EventSetSource",

        nullable..CGEventRef("event"),
        nullable..CGEventSourceRef("source")
    )

    CGEventType(
        "EventGetType",

        nullable..CGEventRef("event")
    )

    void(
        "EventSetType",

        nullable..CGEventRef("event"),
        CGEventType("type")
    )

    CGEventTimestamp(
        "EventGetTimestamp",

        nullable..CGEventRef("event")
    )

    void(
        "EventSetTimestamp",

        nullable..CGEventRef("event"),
        CGEventTimestamp("timestamp")
    )

    CGPoint(
        "EventGetLocation",

        nullable..CGEventRef("event")
    )

    CGPoint(
        "EventGetUnflippedLocation",

        nullable..CGEventRef("event")
    )

    void(
        "EventSetLocation",

        nullable..CGEventRef("event"),
        CGPoint("location")
    )

    CGEventFlags(
        "EventGetFlags",

        nullable..CGEventRef("event")
    )

    void(
        "EventSetFlags",

        nullable..CGEventRef("event"),
        CGEventFlags("flags")
    )

    void(
        "EventKeyboardGetUnicodeString",

        nullable..CGEventRef("event"),
        AutoSize("unicodeString")..UniCharCount("maxStringLength"),
        nullable..Check(1)..UniCharCount.p("actualStringLength"),
        nullable..UniChar.p("unicodeString")
    )

    void(
        "EventKeyboardSetUnicodeString",

        nullable..CGEventRef("event"),
        AutoSize("unicodeString")..UniCharCount("stringLength"),
        UniChar.const.p("unicodeString")
    )

    int64_t(
        "EventGetIntegerValueField",

        nullable..CGEventRef("event"),
        CGEventField("field")
    )

    void(
        "EventSetIntegerValueField",

        nullable..CGEventRef("event"),
        CGEventField("field"),
        int64_t("value")
    )

    double(
        "EventGetDoubleValueField",

        nullable..CGEventRef("event"),
        CGEventField("field")
    )

    void(
        "EventSetDoubleValueField",

        nullable..CGEventRef("event"),
        CGEventField("field"),
        double("value")
    )

    val EventTapCreate = CFMachPortRef(
        "EventTapCreate",

        CGEventTapLocation("tap"),
        CGEventTapPlacement("place"),
        CGEventTapOptions("options"),
        CGEventMask("eventsOfInterest"),
        CGEventTapCallBack("callback"),
        nullable..opaque_p("userInfo")
    )

    CFMachPortRef(
        "EventTapCreateForPid",

        pid_t("pid"),
        EventTapCreate["place"],
        EventTapCreate["options"],
        EventTapCreate["eventsOfInterest"],
        EventTapCreate["callback"],
        EventTapCreate["userInfo"]
    )

    void(
        "EventTapEnable",

        CFMachPortRef("tap"),
        bool("enable")
    )

    bool(
        "EventTapIsEnabled",

        CFMachPortRef("tap")
    )

    void(
        "EventTapPostEvent",

        nullable..CGEventTapProxy("proxy"),
        nullable..CGEventRef("event")
    )

    void(
        "EventPost",

        CGEventTapLocation("tap"),
        CGEventRef("event")
    )

    void(
        "EventPostToPid",

        pid_t("pid"),
        nullable..CGEventRef("event")
    )

    CGError(
        "GetEventTapList",

        AutoSize("tapList")..uint32_t("maxNumberOfTaps"),
        nullable..CGEventTapInformation.p("tapList"),
        nullable..Check(1)..uint32_t.p("eventTapCount")
    )
}