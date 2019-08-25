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

    documentation = "Native bindings to &lt;CoreGraphics.h&gt;."

    EnumConstant(
        "Types used for errors and error handlers. ({@code CGError})",

        "ErrorSuccess".enum("", "0"),
        "ErrorFailure".enum("", "1000"),
        "ErrorIllegalArgument".enum,
        "ErrorInvalidConnection".enum,
        "ErrorInvalidContext".enum,
        "ErrorCannotComplete".enum,
        "ErrorNotImplemented".enum("", "1006"),
        "ErrorRangeCheck".enum,
        "ErrorTypeCheck".enum,
        "ErrorInvalidOperation".enum("", "1010"),
        "ErrorNoneAvailable".enum
    )

    EnumConstant(
        "Event types. ({@code CGEventType})",

        "EventNull".enum("", "0"),

        "EventLeftMouseDown".enum,
        "EventLeftMouseUp".enum,
        "EventRightMouseDown".enum,
        "EventRightMouseUp".enum,
        "EventMouseMoved".enum,
        "EventLeftMouseDragged".enum,
        "EventRightMouseDragged".enum,

        "EventKeyDown".enum("", 10),
        "EventKeyUp".enum,
        "EventFlagsChanged".enum,

        "EventScrollWheel".enum("", 22),
        "EventTabletPointer".enum,
        "EventTabletProximity".enum,
        "EventOtherMouseDown".enum,
        "EventOtherMouseUp".enum,
        "EventOtherMouseDragged".enum,

        "EventTapDisabledByTimeout".enum("", 0xFFFFFFFE.i),
        "EventTapDisabledByUserInput".enum("", 0xFFFFFFFF.i)
    )

    EnumConstant(
        "Constants that specify buttons on a one, two, or three-button mouse. ({@code CGMouseButton})",

        "MouseButtonLeft".enum("", "0"),
        "MouseButtonRight".enum,
        "MouseButtonCenter".enum
    )

    EnumConstant(
        "{@code CGEventTapLocation}",

        "HIDEventTap".enum("Specifies that an event tap is placed at the point where HID system events enter the window server.", 0),
        "SessionEventTap".enum("Specifies that an event tap is placed at the point where HID system and remote control events enter a login session."),
        "AnnotatedSessionEventTap".enum(
            "Specifies that an event tap is placed at the point where session events have been annotated to flow to an application."
        )
    )

    EnumConstant(
        "Constants that specify the unit of measurement for a scrolling event. ({@code CGScrollEventUnit})",

        "ScrollEventUnitPixel".enum("Specifies that the unit of measurement is pixels.", "0"),
        "ScrollEventUnitLine".enum("Specifies that the unit of measurement is lines.")
    )

    EnumConstant(
        "Constants used as keys to access specialized fields in low-level events. ({@code CGEventField})",

        "MouseEventNumber".enum(
            """
            Key to access an integer field that contains the mouse button event number.
            
            Matching mouse-down and mouse-up events will have the same event number.
            """,
            "0"
        ),
        "MouseEventClickState".enum(
            """
            Key to access an integer field that contains the mouse button click state.
            
            A click state of 1 represents a single click. A click state of 2 represents a double-click. A click state of 3 represents a triple-click.
            """
        ),
        "MouseEventPressure".enum(
            """
            Key to access a double field that contains the mouse button pressure.
            
            The pressure value may range from 0 to 1, with 0 representing the mouse being up. This value is commonly set by tablet pens mimicking a mouse.
            """
        ),
        "MouseEventButtonNumber".enum("Key to access an integer field that contains the mouse button number."),
        "MouseEventDeltaX".enum("Key to access an integer field that contains the horizontal mouse delta since the last mouse movement event."),
        "MouseEventDeltaY".enum("Key to access an integer field that contains the vertical mouse delta since the last mouse movement event."),
        "MouseEventInstantMouser".enum("Key to access an integer field. The value is non-zero if the event should be ignored by the Inkwell subsystem."),
        "MouseEventSubtype".enum("Key to access an integer field that encodes the mouse event subtype as a {@code kCFNumberIntType}."),
        "KeyboardEventAutorepeat".enum("Key to access an integer field, non-zero when this is an autorepeat of a key-down, and zero otherwise."),
        "KeyboardEventKeycode".enum("Key to access an integer field that contains the virtual keycode of the key-down or key-up event."),
        "KeyboardEventKeyboardType".enum("Key to access an integer field that contains the keyboard type identifier."),
        "ScrollWheelEventDeltaAxis1".enum(
            """
            Key to access an integer field that contains scrolling data.
            
            This field typically contains the change in vertical position since the last scrolling event from a Mighty Mouse scroller or a single-wheel mouse
            scroller.
            """
        ),
        "ScrollWheelEventDeltaAxis2".enum(
            """
            Key to access an integer field that contains scrolling data.
            
            This field typically contains the change in horizontal position since the last scrolling event from a Mighty Mouse scroller.
            """
        ),
        "ScrollWheelEventDeltaAxis3".enum("This field is not used."),
        "ScrollWheelEventFixedPtDeltaAxis1".enum(
            """
            Key to access a field that contains scrolling data.
            
            The scrolling data represents a line-based or pixel-based change in vertical position since the last scrolling event from a Mighty Mouse scroller
            or a single-wheel mouse scroller. The scrolling data uses a fixed-point 16.16 signed integer format. If this key is passed to
            #EventGetDoubleValueField(), the fixed-point value is converted to a double value.
            """,
            "93"
        ),
        "ScrollWheelEventFixedPtDeltaAxis2".enum(
            """
            Key to access a field that contains scrolling data.
            
            The scrolling data represents a line-based or pixel-based change in horizontal position since the last scrolling event from a Mighty Mouse
            scroller. The scrolling data uses a fixed-point 16.16 signed integer format. If this key is passed to #EventGetDoubleValueField(), the fixed-point
            value is converted to a double value.
            """
        ),
        "ScrollWheelEventFixedPtDeltaAxis3".enum("This field is not used."),
        "ScrollWheelEventPointDeltaAxis1".enum(
            """
            Key to access an integer field that contains pixel-based scrolling data.
            
            The scrolling data represents the change in vertical position since the last scrolling event from a Mighty Mouse scroller or a single-wheel mouse
            scroller. 
            """
        ),
        "ScrollWheelEventPointDeltaAxis2".enum(
            """
            Key to access an integer field that contains pixel-based scrolling data.
            
            The scrolling data represents the change in horizontal position since the last scrolling event from a Mighty Mouse scroller.
            """
        ),
        "ScrollWheelEventPointDeltaAxis3".enum("This field is not used."),
        "ScrollWheelEventScrollPhase".enum,
        "ScrollWheelEventScrollCount".enum("rdar://11259169"),
        "ScrollWheelEventMomentumPhase".enum("", "123"),
        "ScrollWheelEventInstantMouser".enum(
            """
            Key to access an integer field that indicates whether the event should be ignored by the Inkwell subsystem.
            
            If the value is non-zero, the event should be ignored.
            """,
            "14"
        ),
        "TabletEventPointX".enum("Key to access an integer field that contains the absolute X coordinate in tablet space at full tablet resolution."),
        "TabletEventPointY".enum("Key to access an integer field that contains the absolute Y coordinate in tablet space at full tablet resolution."),
        "TabletEventPointZ".enum("Key to access an integer field that contains the absolute Z coordinate in tablet space at full tablet resolution."),
        "TabletEventPointButtons".enum(
            """
            Key to access an integer field that contains the tablet button state.
            
            Bit 0 is the first button, and a set bit represents a closed or pressed button. Up to 16 buttons are supported.
            """
        ),
        "TabletEventPointPressure".enum(
            """
            Key to access a double field that contains the tablet pen pressure.
            
            A value of 0.0 represents no pressure, and 1.0 represents maximum pressure.
            """
        ),
        "TabletEventTiltX".enum(
            """
            Key to access a double field that contains the horizontal tablet pen tilt.
            
            A value of 0 represents no tilt, and 1 represents maximum tilt.
            """
        ),
        "TabletEventTiltY".enum(
            """
            Key to access a double field that contains the vertical tablet pen tilt.
            
            A value of 0 represents no tilt, and 1 represents maximum tilt.
            """
        ),
        "TabletEventRotation".enum("Key to access a double field that contains the tablet pen rotation."),
        "TabletEventTangentialPressure".enum("""
            Key to access a double field that contains the tangential pressure on the device.
            
            A value of 0.0 represents no pressure, and 1.0 represents maximum pressure.
            """
        ),
        "TabletEventDeviceID".enum("Key to access an integer field that contains the system-assigned unique device ID."),
        "TabletEventVendor1".enum("Key to access an integer field that contains a vendor-specified value."),
        "TabletEventVendor2".enum("Key to access an integer field that contains a vendor-specified value."),
        "TabletEventVendor3".enum("Key to access an integer field that contains a vendor-specified value."),
        "TabletProximityEventVendorID".enum("Key to access an integer field that contains the vendor-defined ID, typically the USB vendor ID."),
        "TabletProximityEventTabletID".enum("Key to access an integer field that contains the vendor-defined tablet ID, typically the USB product ID."),
        "TabletProximityEventPointerID".enum("Key to access an integer field that contains the vendor-defined ID of the pointing device."),
        "TabletProximityEventDeviceID".enum("Key to access an integer field that contains the system-assigned device ID."),
        "TabletProximityEventSystemTabletID".enum("Key to access an integer field that contains the system-assigned unique tablet ID."),
        "TabletProximityEventVendorPointerType".enum("Key to access an integer field that contains the vendor-assigned pointer type."),
        "TabletProximityEventVendorPointerSerialNumber".enum("Key to access an integer field that contains the vendor-defined pointer serial number."),
        "TabletProximityEventVendorUniqueID".enum("Key to access an integer field that contains the vendor-defined unique ID."),
        "TabletProximityEventCapabilityMask".enum("Key to access an integer field that contains the device capabilities mask."),
        "TabletProximityEventPointerType".enum("Key to access an integer field that contains the pointer type."),
        "TabletProximityEventEnterProximity".enum(
            """
            Key to access an integer field that indicates whether the pen is in proximity to the tablet.
            
            The value is non-zero if the pen is in proximity to the tablet and zero when leaving the tablet.
            """
        ),
        "EventTargetProcessSerialNumber".enum("Key to access a field that contains the event target process serial number. The value is a 64-bit value."),
        "EventTargetUnixProcessID".enum("Key to access a field that contains the event target Unix process ID."),
        "EventSourceUnixProcessID".enum("Key to access a field that contains the event source Unix process ID."),
        "EventSourceUserData".enum("Key to access a field that contains the event source user-supplied data, up to 64 bits."),
        "EventSourceUserID".enum("Key to access a field that contains the event source Unix effective UID."),
        "EventSourceGroupID".enum("Key to access a field that contains the event source Unix effective GID."),
        "EventSourceStateID".enum("Key to access a field that contains the event source state ID used to create this event."),
        "ScrollWheelEventIsContinuous".enum(
            """
            Key to access an integer field that indicates whether a scrolling event contains continuous, pixel-based scrolling data.
            
            The value is non-zero when the scrolling data is pixel-based and zero when the scrolling data is line-based.
            """,
            "88"
        ),
        "MouseEventWindowUnderMousePointer".enum("", "91"),
        "MouseEventWindowUnderMousePointerThatCanHandleThisEvent".enum
    )

    EnumConstant(
        "Constants used with the #MouseEventSubtype event field. ({@code CGEventMouseSubtype})",

        "EventMouseSubtypeDefault".enum("", "0"),
        "EventMouseSubtypeTabletPoint".enum,
        "EventMouseSubtypeTabletProximity".enum
    )

    CFTypeID(
        "EventGetTypeID",
        "Returns the type identifier for the opaque type {@code CGEventRef}.",

        void()
    )

    CGEventRef(
        "EventCreate",
        "Returns a new event using the event source {@code source}. If {@code source} is #NULL, the default source is used. ",

        nullable..CGEventSourceRef("source", "")
    )

    CFDataRef(
        "EventCreateData",
        "Return a \"flattened\" data representation of an event.",

        nullable..CFAllocatorRef("allocator", ""),
        nullable..CGEventRef("event", "")
    )

    CGEventRef(
        "EventCreateFromData",
        "Returns an event created from a \"flattened\" data representation of the event.",

        nullable..CFAllocatorRef("allocator", ""),
        nullable..CFDataRef("data", "")
    )

    CGEventRef(
        "EventCreateMouseEvent",
        """
        Returns a new mouse event.

        The event source may be taken from another event, or may be #NULL. {@code mouseType} should be one of the mouse event types.
        {@code mouseCursorPosition} should be the position of the mouse cursor in global coordinates. {@code mouseButton} should be the button that's changing
        state; {@code mouseButton} is ignored unless {@code mouseType} is one of #EventOtherMouseDown, #EventOtherMouseDragged, or #EventOtherMouseUp.

        The current implemementation of the event system supports a maximum of thirty-two buttons. Mouse button 0 is the primary button on the mouse. Mouse
        button 1 is the secondary mouse button (right). Mouse button 2 is the center button, and the remaining buttons are in USB device order.
        """,

        nullable..CGEventSourceRef("source", ""),
        CGEventType("mouseType", ""),
        CGPoint("mouseCursorPosition", ""),
        CGMouseButton("mouseButton", "")
    )

    CGEventRef(
        "EventCreateKeyboardEvent",
        """
        Returns a new keyboard event.

        The event source may be taken from another event, or may be #NULL. Based on the virtual key code values entered, the appropriate key down, key up, or
        flags changed events are generated.

        All keystrokes needed to generate a character must be entered, including SHIFT, CONTROL, OPTION, and COMMAND keys. For example, to produce a 'Z', the
        SHIFT key must be down, the 'z' key must go down, and then the SHIFT and 'z' key must be released:
        ${codeBlock("""
CGEventCreateKeyboardEvent(source, (CGKeyCode)56, true);  // shift down
CGEventCreateKeyboardEvent(source, (CGKeyCode) 6, true);  // 'z' down
CGEventCreateKeyboardEvent(source, (CGKeyCode) 6, false); // 'z' up
CGEventCreateKeyboardEvent(source, (CGKeyCode)56, false); // 'shift up""")}
        """,

        nullable..CGEventSourceRef("source", ""),
        CGKeyCode("virtualKey", ""),
        bool("keyDown", "")
    )

    CGEventRef(
        "EventCreateScrollWheelEvent",
        """
        Returns a new scrollwheel event.

        The event source may be taken from another event, or may be #NULL. The scrolling units may be specified in lines using #ScrollEventUnitLine or in
        pixels using #ScrollEventUnitPixel. #ScrollEventUnitPixel will produce an event that most applications interpret as a smooth scrolling event.

        One or more wheels must be specified. The current implementation supports up to three wheels.

        Every scrollwheel event can be interpreted to be scrolling by pixel or by line. The scale between the two is about 10 pixels per line by default.
        The scale can be altered by setting a custom value for the event source, using {@code CGEventSourceSetPixelsPerLine}.
        """,

        nullable..CGEventSourceRef("source", ""),
        CGScrollEventUnit("units", ""),
        //TODO:
        Expression("1")..uint32_t("wheelCount", ""),
        int32_t("wheel1", "")/*,
        ...*/
    )

    IgnoreMissing..CGEventRef(
        "EventCreateScrollWheelEvent2",
        "A non-variadic variant version of #EventCreateScrollWheelEvent().",

        nullable..CGEventSourceRef("source", ""),
        CGScrollEventUnit("units", ""),
        uint32_t("wheelCount", ""),
        int32_t("wheel1", ""),
        int32_t("wheel2", ""),
        int32_t("wheel3", ""),

        since = "macOS 10.13"
    )

    CGEventRef(
        "EventCreateCopy",
        "Return a copy of {@code event}.",

        nullable..CGEventRef("event", "")
    )

    CGEventSourceRef(
        "EventCreateSourceFromEvent",
        """
        Returns an event source created from an existing event.

        Event filters may use the event source to generate events that are compatible with an event being filtered.

        Note that {@code CGEventCreateSourceFromEvent} may return #NULL if the event was generated with a private {@code CGEventSourceStateID} owned by another
        process. Such events should be filtered based on the public state.
        """,

        nullable..CGEventRef("event", "")
    )

    void(
        "EventSetSource",
        "Set the event source of an event.",

        nullable..CGEventRef("event", ""),
        nullable..CGEventSourceRef("source", "")
    )

    CGEventType(
        "EventGetType",
        "Returns the event type of an event (left mouse down, for example).",

        nullable..CGEventRef("event", "")
    )

    void(
        "EventSetType",
        "Sets the event type of an event.",

        nullable..CGEventRef("event", ""),
        CGEventType("type", "")
    )

    CGEventTimestamp(
        "EventGetTimestamp",
        "Returns the timestamp of an event.",

        nullable..CGEventRef("event", "")
    )

    void(
        "EventSetTimestamp",
        "Sets the timestamp of an event.",

        nullable..CGEventRef("event", ""),
        CGEventTimestamp("timestamp", "")
    )

    CGPoint(
        "EventGetLocation",
        """
        Returns the location of an event in global display coordinates.
        
        {@code CGPointZero} is returned if {@code event} is not a valid {@code CGEventRef}.
        """,

        nullable..CGEventRef("event", "")
    )

    CGPoint(
        "EventGetUnflippedLocation",
        """
        Return the location of an event relative to the lower-left corner of the main display.
        
        {@code CGPointZero} is returned if {@code event} is not a valid {@code CGEventRef}.
        """,

        nullable..CGEventRef("event", "")
    )

    void(
        "EventSetLocation",
        "Sets the location of an event in global display coordinates.",

        nullable..CGEventRef("event", ""),
        CGPoint("location", "")
    )

    CGEventFlags(
        "EventGetFlags",
        """
        Returns the event flags of an event.
        
        {@code (CGEventFlags)0} if {@code event} is not a valid {@code CGEventRef}.
        """,

        nullable..CGEventRef("event", "")
    )

    void(
        "EventSetFlags",
        "Sets the event flags of an event.",

        nullable..CGEventRef("event", ""),
        CGEventFlags("flags", "")
    )

    void(
        "EventKeyboardGetUnicodeString",
        """
        Returns the Unicode string associated with a keyboard event.

        When you call this function with a #NULL string or a maximum string length of 0, the function still returns the actual count of Unicode characters in
        the event.
        """,

        nullable..CGEventRef("event", ""),
        AutoSize("unicodeString")..UniCharCount("maxStringLength", ""),
        nullable..Check(1)..UniCharCount.p("actualStringLength", ""),
        nullable..UniChar.p("unicodeString", "")
    )

    void(
        "EventKeyboardSetUnicodeString",
        """
        Sets the Unicode string associated with a keyboard event.

        By default, the system translates the virtual key code in a keyboard event into a Unicode string based on the keyboard ID in the event source. This
        function allows you to manually override this string. Note that application frameworks may ignore the Unicode string in a keyboard event and do their
        own translation based on the virtual keycode and perceived event state.
        """,

        nullable..CGEventRef("event", ""),
        AutoSize("unicodeString")..UniCharCount("stringLength", ""),
        UniChar.const.p("unicodeString", "")
    )

    int64_t(
        "EventGetIntegerValueField",
        "Returns the integer value of a field in an event.",

        nullable..CGEventRef("event", ""),
        CGEventField("field", "")
    )

    void(
        "EventSetIntegerValueField",
        """
        Sets the integer value of a field in an event.

        Before calling this function, the event type must be set using a typed event creation function such as #EventCreateMouseEvent(), or by calling
        #EventSetType().

        If you are creating a mouse event generated by a tablet, call this function and specify the field #MouseEventSubtype with a value of
        #EventMouseSubtypeTabletPoint or #EventMouseSubtypeTabletProximity before setting other parameters.
        """,

        nullable..CGEventRef("event", ""),
        CGEventField("field", ""),
        int64_t("value", "")
    )

    double(
        "EventGetDoubleValueField",
        """
        Returns the floating-point value of a field in an event.

        In cases where the field value is represented within the event by a fixed point number or an integer, the result is scaled to the appropriate range as
        part of creating the floating-point representation.
        """,

        nullable..CGEventRef("event", ""),
        CGEventField("field", "")
    )

    void(
        "EventSetDoubleValueField",
        """
        Sets the floating-point value of a field in an event.

        Before calling this function, the event type must be set using a typed event creation function such as #EventCreateMouseEvent(), or by calling
        #EventSetType().

        In cases where the field’s value is represented within the event by a fixed point number or integer, the value parameter is scaled as needed and
        converted to the appropriate type.
        """,

        nullable..CGEventRef("event", ""),
        CGEventField("field", ""),
        double("value", "")
    )

    val EventTapCreate = CFMachPortRef(
        "EventTapCreate",
        """
        Creates an event tap.

        Taps may be placed at the point where {@code HIDSystem} events enter the server, at the point where {@code HIDSystem} and remote control events enter a
        session, at the point where events have been annotated to flow to a specific application, or at the point where events are delivered to the
        application. Taps may be inserted at a specified point at the head of pre-existing filters, or appended after any pre-existing filters.

        Taps may be passive event listeners, or active filters. An active filter may pass an event through unmodified, modify an event, or discard an event.
        When a tap is registered, it identifies the set of events to be observed with a mask, and indicates if it is a passive or active event filter. Multiple
        event type bitmasks may be ORed together.

        Taps may only be placed at #HIDEventTap by a process running as the root user. #NULL is returned for other users.

        Taps placed at #HIDEventTap, #SessionEventTap, #AnnotatedSessionEventTap, or on a specific process may only receive key up and down events if access
        for assistive devices is enabled (Preferences Accessibility panel, Keyboard view) or the caller is enabled for assistive device access, as by
        {@code AXMakeProcessTrusted}. If the tap is not permitted to monitor these events when the tap is created, then the appropriate bits in the mask are
        cleared. If that results in an empty mask, then #NULL is returned.
        
        An event tap is represented as a {@code CFMachPortRef}. The event tap may be added to an appropriate run loop by calling {@code CFRunLoopAddSource}.
        
        Releasing the {@code CFMachPortRef} will release the tap.
        
        A {@code CGEventTapProxy} is an opaque reference to state within the client application associated with the tap. The tap function may pass this
        reference to other functions, such as the event-posting routines.
        
        The event tap callback runs from the {@code CFRunLoop} to which the tap {@code CFMachPort} is added as a source. Thread safety is defined by the
        {@code CFRunLoop} and its environment.    
        """,

        CGEventTapLocation("tap", ""),
        CGEventTapPlacement("place", ""),
        CGEventTapOptions("options", ""),
        CGEventMask("eventsOfInterest", ""),
        CGEventTapCallBack("callback", ""),
        nullable..opaque_p("userInfo", "")
    )

    IgnoreMissing..CFMachPortRef(
        "EventTapCreateForPid",
        """
        Create an event tap for a specified process.

        Events routed to individual applications may be tapped using another function. {@code CGEventTapCreateForPSN} will report all events routed to the
        specified application.
        """,

        pid_t("pid", ""),
        EventTapCreate["place"],
        EventTapCreate["options"],
        EventTapCreate["eventsOfInterest"],
        EventTapCreate["callback"],
        EventTapCreate["userInfo"],

        since = "macOS 10.11"
    )

    void(
        "EventTapEnable",
        """
        Enables or disables an event tap.

        Taps are normally enabled when created. If a tap becomes unresponsive or a user requests taps be disabled, an appropriate
        {@code kCGEventTapDisabled...} event is passed to the registered ##CGEventTapCallBack function. An event tap may be re-enabled by calling this
        function.
        """,

        CFMachPortRef("tap", ""),
        bool("enable", "")
    )

    bool(
        "EventTapIsEnabled",
        "Return true if {@code tap} is enabled; false otherwise.",

        CFMachPortRef("tap", "")
    )

    void(
        "EventTapPostEvent",
        """
        Post an event from an event tap into the event stream.

        You can use this function to post a new event at the same point to which an event returned from an event tap callback function would be posted. The new
        event enters the system before the event returned by the callback enters the system. Events posted into the system will be seen by all taps placed
        after the tap posting the event.
        """,

        nullable..CGEventTapProxy("proxy", ""),
        nullable..CGEventRef("event", "")
    )

    void(
        "EventPost",
        """
        Posts an event into the event stream at a specified location.

        This function posts the specified event immediately before any event taps instantiated for that location, and the event passes through any such
        taps.
        """,

        CGEventTapLocation("tap", "the location at which to post the event"),
        CGEventRef("event", "the event to post")
    )

    IgnoreMissing..void(
        "EventPostToPid",
        """
        Post an event into the event stream for a specific application.

        This function makes it possible for an application to establish an event routing policy, for example, by tapping events at the
        #AnnotatedSessionEventTap location and then posting the events to another desired process.

        This function posts the specified event immediately before any event taps instantiated for the specified process, and the event passes through any such
        taps.
        """,

        pid_t("pid", ""),
        nullable..CGEventRef("event", ""),

        since = "macOS 10.11"
    )

    CGError(
        "GetEventTapList",
        """
        Gets a list of currently installed event taps.

        {@code tapList} is an array of event tap information structures of length {@code maxNumberOfTaps}. You are responsible for allocating storage for this
        array. On return, your array contains a list of currently installed event taps. On return, the number of event taps that are currently installed is
        stored in {@code eventTapCount}. If you pass #NULL in this parameter, the {@code maxNumberOfTaps} parameter is ignored, and the number of event taps
        that are currently installed is stored in {@code eventTapCount}.

        Each call to this function has the side effect of resetting the minimum and maximum latencies in the {@code tapList} parameter to the corresponding
        average values. Values reported in these fields reflect the minimum and maximum values seen since the preceding call, or the instantiation of the tap.
        This allows a monitoring tool to evaluate the best and worst case latency over time and under various operating conditions.
        """,

        AutoSize("tapList")..uint32_t("maxNumberOfTaps", ""),
        nullable..CGEventTapInformation.p("tapList", ""),
        nullable..Check(1)..uint32_t.p("eventTapCount", "")
    )
}