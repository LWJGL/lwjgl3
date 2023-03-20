/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to &lt;CoreGraphics.h&gt;. */
public class CoreGraphics {

    private static final SharedLibrary COREGRAPHICS = Library.loadNative(CoreGraphics.class, "org.lwjgl", "/System/Library/Frameworks/CoreGraphics.framework");

    /** Contains the function pointers loaded from the CoreGraphics {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            EventGetTypeID                = apiGetFunctionAddress(COREGRAPHICS, "CGEventGetTypeID"),
            EventCreate                   = apiGetFunctionAddress(COREGRAPHICS, "CGEventCreate"),
            EventCreateData               = apiGetFunctionAddress(COREGRAPHICS, "CGEventCreateData"),
            EventCreateFromData           = apiGetFunctionAddress(COREGRAPHICS, "CGEventCreateFromData"),
            EventCreateMouseEvent         = apiGetFunctionAddress(COREGRAPHICS, "CGEventCreateMouseEvent"),
            EventCreateKeyboardEvent      = apiGetFunctionAddress(COREGRAPHICS, "CGEventCreateKeyboardEvent"),
            EventCreateScrollWheelEvent   = apiGetFunctionAddress(COREGRAPHICS, "CGEventCreateScrollWheelEvent"),
            EventCreateScrollWheelEvent2  = apiGetFunctionAddressOptional(COREGRAPHICS, "CGEventCreateScrollWheelEvent2"),
            EventCreateCopy               = apiGetFunctionAddress(COREGRAPHICS, "CGEventCreateCopy"),
            EventCreateSourceFromEvent    = apiGetFunctionAddress(COREGRAPHICS, "CGEventCreateSourceFromEvent"),
            EventSetSource                = apiGetFunctionAddress(COREGRAPHICS, "CGEventSetSource"),
            EventGetType                  = apiGetFunctionAddress(COREGRAPHICS, "CGEventGetType"),
            EventSetType                  = apiGetFunctionAddress(COREGRAPHICS, "CGEventSetType"),
            EventGetTimestamp             = apiGetFunctionAddress(COREGRAPHICS, "CGEventGetTimestamp"),
            EventSetTimestamp             = apiGetFunctionAddress(COREGRAPHICS, "CGEventSetTimestamp"),
            EventGetLocation              = apiGetFunctionAddress(COREGRAPHICS, "CGEventGetLocation"),
            EventGetUnflippedLocation     = apiGetFunctionAddress(COREGRAPHICS, "CGEventGetUnflippedLocation"),
            EventSetLocation              = apiGetFunctionAddress(COREGRAPHICS, "CGEventSetLocation"),
            EventGetFlags                 = apiGetFunctionAddress(COREGRAPHICS, "CGEventGetFlags"),
            EventSetFlags                 = apiGetFunctionAddress(COREGRAPHICS, "CGEventSetFlags"),
            EventKeyboardGetUnicodeString = apiGetFunctionAddress(COREGRAPHICS, "CGEventKeyboardGetUnicodeString"),
            EventKeyboardSetUnicodeString = apiGetFunctionAddress(COREGRAPHICS, "CGEventKeyboardSetUnicodeString"),
            EventGetIntegerValueField     = apiGetFunctionAddress(COREGRAPHICS, "CGEventGetIntegerValueField"),
            EventSetIntegerValueField     = apiGetFunctionAddress(COREGRAPHICS, "CGEventSetIntegerValueField"),
            EventGetDoubleValueField      = apiGetFunctionAddress(COREGRAPHICS, "CGEventGetDoubleValueField"),
            EventSetDoubleValueField      = apiGetFunctionAddress(COREGRAPHICS, "CGEventSetDoubleValueField"),
            EventTapCreate                = apiGetFunctionAddress(COREGRAPHICS, "CGEventTapCreate"),
            EventTapCreateForPid          = apiGetFunctionAddressOptional(COREGRAPHICS, "CGEventTapCreateForPid"),
            EventTapEnable                = apiGetFunctionAddress(COREGRAPHICS, "CGEventTapEnable"),
            EventTapIsEnabled             = apiGetFunctionAddress(COREGRAPHICS, "CGEventTapIsEnabled"),
            EventTapPostEvent             = apiGetFunctionAddress(COREGRAPHICS, "CGEventTapPostEvent"),
            EventPost                     = apiGetFunctionAddress(COREGRAPHICS, "CGEventPost"),
            EventPostToPid                = apiGetFunctionAddressOptional(COREGRAPHICS, "CGEventPostToPid"),
            GetEventTapList               = apiGetFunctionAddress(COREGRAPHICS, "CGGetEventTapList");

    }

    /** Returns the CoreGraphics {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return COREGRAPHICS;
    }

    /**
     * Types used for errors and error handlers. ({@code CGError})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #kCGErrorSuccess ErrorSuccess}</li>
     * <li>{@link #kCGErrorFailure ErrorFailure}</li>
     * <li>{@link #kCGErrorIllegalArgument ErrorIllegalArgument}</li>
     * <li>{@link #kCGErrorInvalidConnection ErrorInvalidConnection}</li>
     * <li>{@link #kCGErrorInvalidContext ErrorInvalidContext}</li>
     * <li>{@link #kCGErrorCannotComplete ErrorCannotComplete}</li>
     * <li>{@link #kCGErrorNotImplemented ErrorNotImplemented}</li>
     * <li>{@link #kCGErrorRangeCheck ErrorRangeCheck}</li>
     * <li>{@link #kCGErrorTypeCheck ErrorTypeCheck}</li>
     * <li>{@link #kCGErrorInvalidOperation ErrorInvalidOperation}</li>
     * <li>{@link #kCGErrorNoneAvailable ErrorNoneAvailable}</li>
     * </ul>
     */
    public static final int
        kCGErrorSuccess           = 0,
        kCGErrorFailure           = 1000,
        kCGErrorIllegalArgument   = 1001,
        kCGErrorInvalidConnection = 1002,
        kCGErrorInvalidContext    = 1003,
        kCGErrorCannotComplete    = 1004,
        kCGErrorNotImplemented    = 1006,
        kCGErrorRangeCheck        = 1007,
        kCGErrorTypeCheck         = 1008,
        kCGErrorInvalidOperation  = 1010,
        kCGErrorNoneAvailable     = 1011;

    /**
     * Event types. ({@code CGEventType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #kCGEventNull EventNull}</li>
     * <li>{@link #kCGEventLeftMouseDown EventLeftMouseDown}</li>
     * <li>{@link #kCGEventLeftMouseUp EventLeftMouseUp}</li>
     * <li>{@link #kCGEventRightMouseDown EventRightMouseDown}</li>
     * <li>{@link #kCGEventRightMouseUp EventRightMouseUp}</li>
     * <li>{@link #kCGEventMouseMoved EventMouseMoved}</li>
     * <li>{@link #kCGEventLeftMouseDragged EventLeftMouseDragged}</li>
     * <li>{@link #kCGEventRightMouseDragged EventRightMouseDragged}</li>
     * <li>{@link #kCGEventKeyDown EventKeyDown}</li>
     * <li>{@link #kCGEventKeyUp EventKeyUp}</li>
     * <li>{@link #kCGEventFlagsChanged EventFlagsChanged}</li>
     * <li>{@link #kCGEventScrollWheel EventScrollWheel}</li>
     * <li>{@link #kCGEventTabletPointer EventTabletPointer}</li>
     * <li>{@link #kCGEventTabletProximity EventTabletProximity}</li>
     * <li>{@link #kCGEventOtherMouseDown EventOtherMouseDown}</li>
     * <li>{@link #kCGEventOtherMouseUp EventOtherMouseUp}</li>
     * <li>{@link #kCGEventOtherMouseDragged EventOtherMouseDragged}</li>
     * <li>{@link #kCGEventTapDisabledByTimeout EventTapDisabledByTimeout}</li>
     * <li>{@link #kCGEventTapDisabledByUserInput EventTapDisabledByUserInput}</li>
     * </ul>
     */
    public static final int
        kCGEventNull                   = 0,
        kCGEventLeftMouseDown          = 1,
        kCGEventLeftMouseUp            = 2,
        kCGEventRightMouseDown         = 3,
        kCGEventRightMouseUp           = 4,
        kCGEventMouseMoved             = 5,
        kCGEventLeftMouseDragged       = 6,
        kCGEventRightMouseDragged      = 7,
        kCGEventKeyDown                = 0xA,
        kCGEventKeyUp                  = 0xB,
        kCGEventFlagsChanged           = 0xC,
        kCGEventScrollWheel            = 0x16,
        kCGEventTabletPointer          = 0x17,
        kCGEventTabletProximity        = 0x18,
        kCGEventOtherMouseDown         = 0x19,
        kCGEventOtherMouseUp           = 0x1A,
        kCGEventOtherMouseDragged      = 0x1B,
        kCGEventTapDisabledByTimeout   = 0xFFFFFFFE,
        kCGEventTapDisabledByUserInput = 0xFFFFFFFF;

    /**
     * Constants that specify buttons on a one, two, or three-button mouse. ({@code CGMouseButton})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #kCGMouseButtonLeft MouseButtonLeft}</li>
     * <li>{@link #kCGMouseButtonRight MouseButtonRight}</li>
     * <li>{@link #kCGMouseButtonCenter MouseButtonCenter}</li>
     * </ul>
     */
    public static final int
        kCGMouseButtonLeft   = 0,
        kCGMouseButtonRight  = 1,
        kCGMouseButtonCenter = 2;

    /**
     * {@code CGEventTapLocation}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #kCGHIDEventTap HIDEventTap} - Specifies that an event tap is placed at the point where HID system events enter the window server.</li>
     * <li>{@link #kCGSessionEventTap SessionEventTap} - Specifies that an event tap is placed at the point where HID system and remote control events enter a login session.</li>
     * <li>{@link #kCGAnnotatedSessionEventTap AnnotatedSessionEventTap} - Specifies that an event tap is placed at the point where session events have been annotated to flow to an application.</li>
     * </ul>
     */
    public static final int
        kCGHIDEventTap              = 0x0,
        kCGSessionEventTap          = 0x1,
        kCGAnnotatedSessionEventTap = 0x2;

    /**
     * Constants that specify the unit of measurement for a scrolling event. ({@code CGScrollEventUnit})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #kCGScrollEventUnitPixel ScrollEventUnitPixel} - Specifies that the unit of measurement is pixels.</li>
     * <li>{@link #kCGScrollEventUnitLine ScrollEventUnitLine} - Specifies that the unit of measurement is lines.</li>
     * </ul>
     */
    public static final int
        kCGScrollEventUnitPixel = 0,
        kCGScrollEventUnitLine  = 1;

    /**
     * Constants used as keys to access specialized fields in low-level events. ({@code CGEventField})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #kCGMouseEventNumber MouseEventNumber} - 
     * Key to access an integer field that contains the mouse button event number.
     * 
     * <p>Matching mouse-down and mouse-up events will have the same event number.</p>
     * </li>
     * <li>{@link #kCGMouseEventClickState MouseEventClickState} - 
     * Key to access an integer field that contains the mouse button click state.
     * 
     * <p>A click state of 1 represents a single click. A click state of 2 represents a double-click. A click state of 3 represents a triple-click.</p>
     * </li>
     * <li>{@link #kCGMouseEventPressure MouseEventPressure} - 
     * Key to access a double field that contains the mouse button pressure.
     * 
     * <p>The pressure value may range from 0 to 1, with 0 representing the mouse being up. This value is commonly set by tablet pens mimicking a mouse.</p>
     * </li>
     * <li>{@link #kCGMouseEventButtonNumber MouseEventButtonNumber} - Key to access an integer field that contains the mouse button number.</li>
     * <li>{@link #kCGMouseEventDeltaX MouseEventDeltaX} - Key to access an integer field that contains the horizontal mouse delta since the last mouse movement event.</li>
     * <li>{@link #kCGMouseEventDeltaY MouseEventDeltaY} - Key to access an integer field that contains the vertical mouse delta since the last mouse movement event.</li>
     * <li>{@link #kCGMouseEventInstantMouser MouseEventInstantMouser} - Key to access an integer field. The value is non-zero if the event should be ignored by the Inkwell subsystem.</li>
     * <li>{@link #kCGMouseEventSubtype MouseEventSubtype} - Key to access an integer field that encodes the mouse event subtype as a {@code kCFNumberIntType}.</li>
     * <li>{@link #kCGKeyboardEventAutorepeat KeyboardEventAutorepeat} - Key to access an integer field, non-zero when this is an autorepeat of a key-down, and zero otherwise.</li>
     * <li>{@link #kCGKeyboardEventKeycode KeyboardEventKeycode} - Key to access an integer field that contains the virtual keycode of the key-down or key-up event.</li>
     * <li>{@link #kCGKeyboardEventKeyboardType KeyboardEventKeyboardType} - Key to access an integer field that contains the keyboard type identifier.</li>
     * <li>{@link #kCGScrollWheelEventDeltaAxis1 ScrollWheelEventDeltaAxis1} - 
     * Key to access an integer field that contains scrolling data.
     * 
     * <p>This field typically contains the change in vertical position since the last scrolling event from a Mighty Mouse scroller or a single-wheel mouse
     * scroller.</p>
     * </li>
     * <li>{@link #kCGScrollWheelEventDeltaAxis2 ScrollWheelEventDeltaAxis2} - 
     * Key to access an integer field that contains scrolling data.
     * 
     * <p>This field typically contains the change in horizontal position since the last scrolling event from a Mighty Mouse scroller.</p>
     * </li>
     * <li>{@link #kCGScrollWheelEventDeltaAxis3 ScrollWheelEventDeltaAxis3} - This field is not used.</li>
     * <li>{@link #kCGScrollWheelEventFixedPtDeltaAxis1 ScrollWheelEventFixedPtDeltaAxis1} - 
     * Key to access a field that contains scrolling data.
     * 
     * <p>The scrolling data represents a line-based or pixel-based change in vertical position since the last scrolling event from a Mighty Mouse scroller
     * or a single-wheel mouse scroller. The scrolling data uses a fixed-point 16.16 signed integer format. If this key is passed to
     * {@link #CGEventGetDoubleValueField EventGetDoubleValueField}, the fixed-point value is converted to a double value.</p>
     * </li>
     * <li>{@link #kCGScrollWheelEventFixedPtDeltaAxis2 ScrollWheelEventFixedPtDeltaAxis2} - 
     * Key to access a field that contains scrolling data.
     * 
     * <p>The scrolling data represents a line-based or pixel-based change in horizontal position since the last scrolling event from a Mighty Mouse
     * scroller. The scrolling data uses a fixed-point 16.16 signed integer format. If this key is passed to {@link #CGEventGetDoubleValueField EventGetDoubleValueField}, the fixed-point
     * value is converted to a double value.</p>
     * </li>
     * <li>{@link #kCGScrollWheelEventFixedPtDeltaAxis3 ScrollWheelEventFixedPtDeltaAxis3} - This field is not used.</li>
     * <li>{@link #kCGScrollWheelEventPointDeltaAxis1 ScrollWheelEventPointDeltaAxis1} - 
     * Key to access an integer field that contains pixel-based scrolling data.
     * 
     * <p>The scrolling data represents the change in vertical position since the last scrolling event from a Mighty Mouse scroller or a single-wheel mouse
     * scroller.</p>
     * </li>
     * <li>{@link #kCGScrollWheelEventPointDeltaAxis2 ScrollWheelEventPointDeltaAxis2} - 
     * Key to access an integer field that contains pixel-based scrolling data.
     * 
     * <p>The scrolling data represents the change in horizontal position since the last scrolling event from a Mighty Mouse scroller.</p>
     * </li>
     * <li>{@link #kCGScrollWheelEventPointDeltaAxis3 ScrollWheelEventPointDeltaAxis3} - This field is not used.</li>
     * <li>{@link #kCGScrollWheelEventScrollPhase ScrollWheelEventScrollPhase}</li>
     * <li>{@link #kCGScrollWheelEventScrollCount ScrollWheelEventScrollCount} - rdar://11259169</li>
     * <li>{@link #kCGScrollWheelEventMomentumPhase ScrollWheelEventMomentumPhase}</li>
     * <li>{@link #kCGScrollWheelEventInstantMouser ScrollWheelEventInstantMouser} - 
     * Key to access an integer field that indicates whether the event should be ignored by the Inkwell subsystem.
     * 
     * <p>If the value is non-zero, the event should be ignored.</p>
     * </li>
     * <li>{@link #kCGTabletEventPointX TabletEventPointX} - Key to access an integer field that contains the absolute X coordinate in tablet space at full tablet resolution.</li>
     * <li>{@link #kCGTabletEventPointY TabletEventPointY} - Key to access an integer field that contains the absolute Y coordinate in tablet space at full tablet resolution.</li>
     * <li>{@link #kCGTabletEventPointZ TabletEventPointZ} - Key to access an integer field that contains the absolute Z coordinate in tablet space at full tablet resolution.</li>
     * <li>{@link #kCGTabletEventPointButtons TabletEventPointButtons} - 
     * Key to access an integer field that contains the tablet button state.
     * 
     * <p>Bit 0 is the first button, and a set bit represents a closed or pressed button. Up to 16 buttons are supported.</p>
     * </li>
     * <li>{@link #kCGTabletEventPointPressure TabletEventPointPressure} - 
     * Key to access a double field that contains the tablet pen pressure.
     * 
     * <p>A value of 0.0 represents no pressure, and 1.0 represents maximum pressure.</p>
     * </li>
     * <li>{@link #kCGTabletEventTiltX TabletEventTiltX} - 
     * Key to access a double field that contains the horizontal tablet pen tilt.
     * 
     * <p>A value of 0 represents no tilt, and 1 represents maximum tilt.</p>
     * </li>
     * <li>{@link #kCGTabletEventTiltY TabletEventTiltY} - 
     * Key to access a double field that contains the vertical tablet pen tilt.
     * 
     * <p>A value of 0 represents no tilt, and 1 represents maximum tilt.</p>
     * </li>
     * <li>{@link #kCGTabletEventRotation TabletEventRotation} - Key to access a double field that contains the tablet pen rotation.</li>
     * <li>{@link #kCGTabletEventTangentialPressure TabletEventTangentialPressure} - 
     * Key to access a double field that contains the tangential pressure on the device.
     * 
     * <p>A value of 0.0 represents no pressure, and 1.0 represents maximum pressure.</p>
     * </li>
     * <li>{@link #kCGTabletEventDeviceID TabletEventDeviceID} - Key to access an integer field that contains the system-assigned unique device ID.</li>
     * <li>{@link #kCGTabletEventVendor1 TabletEventVendor1} - Key to access an integer field that contains a vendor-specified value.</li>
     * <li>{@link #kCGTabletEventVendor2 TabletEventVendor2} - Key to access an integer field that contains a vendor-specified value.</li>
     * <li>{@link #kCGTabletEventVendor3 TabletEventVendor3} - Key to access an integer field that contains a vendor-specified value.</li>
     * <li>{@link #kCGTabletProximityEventVendorID TabletProximityEventVendorID} - Key to access an integer field that contains the vendor-defined ID, typically the USB vendor ID.</li>
     * <li>{@link #kCGTabletProximityEventTabletID TabletProximityEventTabletID} - Key to access an integer field that contains the vendor-defined tablet ID, typically the USB product ID.</li>
     * <li>{@link #kCGTabletProximityEventPointerID TabletProximityEventPointerID} - Key to access an integer field that contains the vendor-defined ID of the pointing device.</li>
     * <li>{@link #kCGTabletProximityEventDeviceID TabletProximityEventDeviceID} - Key to access an integer field that contains the system-assigned device ID.</li>
     * <li>{@link #kCGTabletProximityEventSystemTabletID TabletProximityEventSystemTabletID} - Key to access an integer field that contains the system-assigned unique tablet ID.</li>
     * <li>{@link #kCGTabletProximityEventVendorPointerType TabletProximityEventVendorPointerType} - Key to access an integer field that contains the vendor-assigned pointer type.</li>
     * <li>{@link #kCGTabletProximityEventVendorPointerSerialNumber TabletProximityEventVendorPointerSerialNumber} - Key to access an integer field that contains the vendor-defined pointer serial number.</li>
     * <li>{@link #kCGTabletProximityEventVendorUniqueID TabletProximityEventVendorUniqueID} - Key to access an integer field that contains the vendor-defined unique ID.</li>
     * <li>{@link #kCGTabletProximityEventCapabilityMask TabletProximityEventCapabilityMask} - Key to access an integer field that contains the device capabilities mask.</li>
     * <li>{@link #kCGTabletProximityEventPointerType TabletProximityEventPointerType} - Key to access an integer field that contains the pointer type.</li>
     * <li>{@link #kCGTabletProximityEventEnterProximity TabletProximityEventEnterProximity} - 
     * Key to access an integer field that indicates whether the pen is in proximity to the tablet.
     * 
     * <p>The value is non-zero if the pen is in proximity to the tablet and zero when leaving the tablet.</p>
     * </li>
     * <li>{@link #kCGEventTargetProcessSerialNumber EventTargetProcessSerialNumber} - Key to access a field that contains the event target process serial number. The value is a 64-bit value.</li>
     * <li>{@link #kCGEventTargetUnixProcessID EventTargetUnixProcessID} - Key to access a field that contains the event target Unix process ID.</li>
     * <li>{@link #kCGEventSourceUnixProcessID EventSourceUnixProcessID} - Key to access a field that contains the event source Unix process ID.</li>
     * <li>{@link #kCGEventSourceUserData EventSourceUserData} - Key to access a field that contains the event source user-supplied data, up to 64 bits.</li>
     * <li>{@link #kCGEventSourceUserID EventSourceUserID} - Key to access a field that contains the event source Unix effective UID.</li>
     * <li>{@link #kCGEventSourceGroupID EventSourceGroupID} - Key to access a field that contains the event source Unix effective GID.</li>
     * <li>{@link #kCGEventSourceStateID EventSourceStateID} - Key to access a field that contains the event source state ID used to create this event.</li>
     * <li>{@link #kCGScrollWheelEventIsContinuous ScrollWheelEventIsContinuous} - 
     * Key to access an integer field that indicates whether a scrolling event contains continuous, pixel-based scrolling data.
     * 
     * <p>The value is non-zero when the scrolling data is pixel-based and zero when the scrolling data is line-based.</p>
     * </li>
     * <li>{@link #kCGMouseEventWindowUnderMousePointer MouseEventWindowUnderMousePointer}</li>
     * <li>{@link #kCGMouseEventWindowUnderMousePointerThatCanHandleThisEvent MouseEventWindowUnderMousePointerThatCanHandleThisEvent}</li>
     * </ul>
     */
    public static final int
        kCGMouseEventNumber                                        = 0,
        kCGMouseEventClickState                                    = 1,
        kCGMouseEventPressure                                      = 2,
        kCGMouseEventButtonNumber                                  = 3,
        kCGMouseEventDeltaX                                        = 4,
        kCGMouseEventDeltaY                                        = 5,
        kCGMouseEventInstantMouser                                 = 6,
        kCGMouseEventSubtype                                       = 7,
        kCGKeyboardEventAutorepeat                                 = 8,
        kCGKeyboardEventKeycode                                    = 9,
        kCGKeyboardEventKeyboardType                               = 10,
        kCGScrollWheelEventDeltaAxis1                              = 11,
        kCGScrollWheelEventDeltaAxis2                              = 12,
        kCGScrollWheelEventDeltaAxis3                              = 13,
        kCGScrollWheelEventFixedPtDeltaAxis1                       = 93,
        kCGScrollWheelEventFixedPtDeltaAxis2                       = 94,
        kCGScrollWheelEventFixedPtDeltaAxis3                       = 95,
        kCGScrollWheelEventPointDeltaAxis1                         = 96,
        kCGScrollWheelEventPointDeltaAxis2                         = 97,
        kCGScrollWheelEventPointDeltaAxis3                         = 98,
        kCGScrollWheelEventScrollPhase                             = 99,
        kCGScrollWheelEventScrollCount                             = 100,
        kCGScrollWheelEventMomentumPhase                           = 123,
        kCGScrollWheelEventInstantMouser                           = 14,
        kCGTabletEventPointX                                       = 15,
        kCGTabletEventPointY                                       = 16,
        kCGTabletEventPointZ                                       = 17,
        kCGTabletEventPointButtons                                 = 18,
        kCGTabletEventPointPressure                                = 19,
        kCGTabletEventTiltX                                        = 20,
        kCGTabletEventTiltY                                        = 21,
        kCGTabletEventRotation                                     = 22,
        kCGTabletEventTangentialPressure                           = 23,
        kCGTabletEventDeviceID                                     = 24,
        kCGTabletEventVendor1                                      = 25,
        kCGTabletEventVendor2                                      = 26,
        kCGTabletEventVendor3                                      = 27,
        kCGTabletProximityEventVendorID                            = 28,
        kCGTabletProximityEventTabletID                            = 29,
        kCGTabletProximityEventPointerID                           = 30,
        kCGTabletProximityEventDeviceID                            = 31,
        kCGTabletProximityEventSystemTabletID                      = 32,
        kCGTabletProximityEventVendorPointerType                   = 33,
        kCGTabletProximityEventVendorPointerSerialNumber           = 34,
        kCGTabletProximityEventVendorUniqueID                      = 35,
        kCGTabletProximityEventCapabilityMask                      = 36,
        kCGTabletProximityEventPointerType                         = 37,
        kCGTabletProximityEventEnterProximity                      = 38,
        kCGEventTargetProcessSerialNumber                          = 39,
        kCGEventTargetUnixProcessID                                = 40,
        kCGEventSourceUnixProcessID                                = 41,
        kCGEventSourceUserData                                     = 42,
        kCGEventSourceUserID                                       = 43,
        kCGEventSourceGroupID                                      = 44,
        kCGEventSourceStateID                                      = 45,
        kCGScrollWheelEventIsContinuous                            = 88,
        kCGMouseEventWindowUnderMousePointer                       = 91,
        kCGMouseEventWindowUnderMousePointerThatCanHandleThisEvent = 92;

    /**
     * Constants used with the {@link #kCGMouseEventSubtype MouseEventSubtype} event field. ({@code CGEventMouseSubtype})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #kCGEventMouseSubtypeDefault EventMouseSubtypeDefault}</li>
     * <li>{@link #kCGEventMouseSubtypeTabletPoint EventMouseSubtypeTabletPoint}</li>
     * <li>{@link #kCGEventMouseSubtypeTabletProximity EventMouseSubtypeTabletProximity}</li>
     * </ul>
     */
    public static final int
        kCGEventMouseSubtypeDefault         = 0,
        kCGEventMouseSubtypeTabletPoint     = 1,
        kCGEventMouseSubtypeTabletProximity = 2;

    protected CoreGraphics() {
        throw new UnsupportedOperationException();
    }

    // --- [ CGEventGetTypeID ] ---

    /** Returns the type identifier for the opaque type {@code CGEventRef}. */
    @NativeType("CFTypeID")
    public static long CGEventGetTypeID() {
        long __functionAddress = Functions.EventGetTypeID;
        return invokeJ(__functionAddress);
    }

    // --- [ CGEventCreate ] ---

    /** Returns a new event using the event source {@code source}. If {@code source} is {@code NULL}, the default source is used. */
    @NativeType("CGEventRef")
    public static long CGEventCreate(@NativeType("CGEventSourceRef") long source) {
        long __functionAddress = Functions.EventCreate;
        return invokePP(source, __functionAddress);
    }

    // --- [ CGEventCreateData ] ---

    /** Return a "flattened" data representation of an event. */
    @NativeType("CFDataRef")
    public static long CGEventCreateData(@NativeType("CFAllocatorRef") long allocator, @NativeType("CGEventRef") long event) {
        long __functionAddress = Functions.EventCreateData;
        return invokePPP(allocator, event, __functionAddress);
    }

    // --- [ CGEventCreateFromData ] ---

    /** Returns an event created from a "flattened" data representation of the event. */
    @NativeType("CGEventRef")
    public static long CGEventCreateFromData(@NativeType("CFAllocatorRef") long allocator, @NativeType("CFDataRef") long data) {
        long __functionAddress = Functions.EventCreateFromData;
        return invokePPP(allocator, data, __functionAddress);
    }

    // --- [ CGEventCreateMouseEvent ] ---

    /** Unsafe version of: {@link #CGEventCreateMouseEvent EventCreateMouseEvent} */
    public static native long nCGEventCreateMouseEvent(long source, int mouseType, long mouseCursorPosition, int mouseButton, long __functionAddress);

    /** Unsafe version of: {@link #CGEventCreateMouseEvent EventCreateMouseEvent} */
    public static long nCGEventCreateMouseEvent(long source, int mouseType, long mouseCursorPosition, int mouseButton) {
        long __functionAddress = Functions.EventCreateMouseEvent;
        return nCGEventCreateMouseEvent(source, mouseType, mouseCursorPosition, mouseButton, __functionAddress);
    }

    /**
     * Returns a new mouse event.
     * 
     * <p>The event source may be taken from another event, or may be {@code NULL}. {@code mouseType} should be one of the mouse event types.
     * {@code mouseCursorPosition} should be the position of the mouse cursor in global coordinates. {@code mouseButton} should be the button that's changing
     * state; {@code mouseButton} is ignored unless {@code mouseType} is one of {@link #kCGEventOtherMouseDown EventOtherMouseDown}, {@link #kCGEventOtherMouseDragged EventOtherMouseDragged}, or {@link #kCGEventOtherMouseUp EventOtherMouseUp}.</p>
     * 
     * <p>The current implemementation of the event system supports a maximum of thirty-two buttons. Mouse button 0 is the primary button on the mouse. Mouse
     * button 1 is the secondary mouse button (right). Mouse button 2 is the center button, and the remaining buttons are in USB device order.</p>
     */
    @NativeType("CGEventRef")
    public static long CGEventCreateMouseEvent(@NativeType("CGEventSourceRef") long source, @NativeType("CGEventType") int mouseType, CGPoint mouseCursorPosition, @NativeType("CGMouseButton") int mouseButton) {
        return nCGEventCreateMouseEvent(source, mouseType, mouseCursorPosition.address(), mouseButton);
    }

    // --- [ CGEventCreateKeyboardEvent ] ---

    /**
     * Returns a new keyboard event.
     * 
     * <p>The event source may be taken from another event, or may be {@code NULL}. Based on the virtual key code values entered, the appropriate key down, key up, or
     * flags changed events are generated.</p>
     * 
     * <p>All keystrokes needed to generate a character must be entered, including SHIFT, CONTROL, OPTION, and COMMAND keys. For example, to produce a 'Z', the
     * SHIFT key must be down, the 'z' key must go down, and then the SHIFT and 'z' key must be released:</p>
     * 
     * <pre><code>
     * CGEventCreateKeyboardEvent(source, (CGKeyCode)56, true);  // shift down
     * CGEventCreateKeyboardEvent(source, (CGKeyCode) 6, true);  // 'z' down
     * CGEventCreateKeyboardEvent(source, (CGKeyCode) 6, false); // 'z' up
     * CGEventCreateKeyboardEvent(source, (CGKeyCode)56, false); // 'shift up</code></pre>
     */
    @NativeType("CGEventRef")
    public static long CGEventCreateKeyboardEvent(@NativeType("CGEventSourceRef") long source, @NativeType("CGKeyCode") short virtualKey, @NativeType("bool") boolean keyDown) {
        long __functionAddress = Functions.EventCreateKeyboardEvent;
        return invokePCP(source, virtualKey, keyDown, __functionAddress);
    }

    // --- [ CGEventCreateScrollWheelEvent ] ---

    /**
     * Returns a new scrollwheel event.
     * 
     * <p>The event source may be taken from another event, or may be {@code NULL}. The scrolling units may be specified in lines using {@link #kCGScrollEventUnitLine ScrollEventUnitLine} or in
     * pixels using {@link #kCGScrollEventUnitPixel ScrollEventUnitPixel}. {@link #kCGScrollEventUnitPixel ScrollEventUnitPixel} will produce an event that most applications interpret as a smooth scrolling event.</p>
     * 
     * <p>One or more wheels must be specified. The current implementation supports up to three wheels.</p>
     * 
     * <p>Every scrollwheel event can be interpreted to be scrolling by pixel or by line. The scale between the two is about 10 pixels per line by default.
     * The scale can be altered by setting a custom value for the event source, using {@code CGEventSourceSetPixelsPerLine}.</p>
     */
    @NativeType("CGEventRef")
    public static long CGEventCreateScrollWheelEvent(@NativeType("CGEventSourceRef") long source, @NativeType("CGScrollEventUnit") int units, @NativeType("uint32_t") int wheelCount, @NativeType("int32_t") int wheel1) {
        long __functionAddress = Functions.EventCreateScrollWheelEvent;
        return invokePP(source, units, wheelCount, wheel1, __functionAddress);
    }

    /**
     * Returns a new scrollwheel event.
     * 
     * <p>The event source may be taken from another event, or may be {@code NULL}. The scrolling units may be specified in lines using {@link #kCGScrollEventUnitLine ScrollEventUnitLine} or in
     * pixels using {@link #kCGScrollEventUnitPixel ScrollEventUnitPixel}. {@link #kCGScrollEventUnitPixel ScrollEventUnitPixel} will produce an event that most applications interpret as a smooth scrolling event.</p>
     * 
     * <p>One or more wheels must be specified. The current implementation supports up to three wheels.</p>
     * 
     * <p>Every scrollwheel event can be interpreted to be scrolling by pixel or by line. The scale between the two is about 10 pixels per line by default.
     * The scale can be altered by setting a custom value for the event source, using {@code CGEventSourceSetPixelsPerLine}.</p>
     */
    @NativeType("CGEventRef")
    public static long CGEventCreateScrollWheelEvent(@NativeType("CGEventSourceRef") long source, @NativeType("CGScrollEventUnit") int units, @NativeType("int32_t") int wheel1) {
        long __functionAddress = Functions.EventCreateScrollWheelEvent;
        return invokePP(source, units, 1, wheel1, __functionAddress);
    }

    // --- [ CGEventCreateScrollWheelEvent2 ] ---

    /**
     * A non-variadic variant version of {@link #CGEventCreateScrollWheelEvent EventCreateScrollWheelEvent}.
     *
     * @since macOS 10.13
     */
    @NativeType("CGEventRef")
    public static long CGEventCreateScrollWheelEvent2(@NativeType("CGEventSourceRef") long source, @NativeType("CGScrollEventUnit") int units, @NativeType("uint32_t") int wheelCount, @NativeType("int32_t") int wheel1, @NativeType("int32_t") int wheel2, @NativeType("int32_t") int wheel3) {
        long __functionAddress = Functions.EventCreateScrollWheelEvent2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(source, units, wheelCount, wheel1, wheel2, wheel3, __functionAddress);
    }

    // --- [ CGEventCreateCopy ] ---

    /** Return a copy of {@code event}. */
    @NativeType("CGEventRef")
    public static long CGEventCreateCopy(@NativeType("CGEventRef") long event) {
        long __functionAddress = Functions.EventCreateCopy;
        return invokePP(event, __functionAddress);
    }

    // --- [ CGEventCreateSourceFromEvent ] ---

    /**
     * Returns an event source created from an existing event.
     * 
     * <p>Event filters may use the event source to generate events that are compatible with an event being filtered.</p>
     * 
     * <p>Note that {@code CGEventCreateSourceFromEvent} may return {@code NULL} if the event was generated with a private {@code CGEventSourceStateID} owned by another
     * process. Such events should be filtered based on the public state.</p>
     */
    @NativeType("CGEventSourceRef")
    public static long CGEventCreateSourceFromEvent(@NativeType("CGEventRef") long event) {
        long __functionAddress = Functions.EventCreateSourceFromEvent;
        return invokePP(event, __functionAddress);
    }

    // --- [ CGEventSetSource ] ---

    /** Set the event source of an event. */
    public static void CGEventSetSource(@NativeType("CGEventRef") long event, @NativeType("CGEventSourceRef") long source) {
        long __functionAddress = Functions.EventSetSource;
        invokePPV(event, source, __functionAddress);
    }

    // --- [ CGEventGetType ] ---

    /** Returns the event type of an event (left mouse down, for example). */
    @NativeType("CGEventType")
    public static int CGEventGetType(@NativeType("CGEventRef") long event) {
        long __functionAddress = Functions.EventGetType;
        return invokePI(event, __functionAddress);
    }

    // --- [ CGEventSetType ] ---

    /** Sets the event type of an event. */
    public static void CGEventSetType(@NativeType("CGEventRef") long event, @NativeType("CGEventType") int type) {
        long __functionAddress = Functions.EventSetType;
        invokePV(event, type, __functionAddress);
    }

    // --- [ CGEventGetTimestamp ] ---

    /** Returns the timestamp of an event. */
    @NativeType("CGEventTimestamp")
    public static long CGEventGetTimestamp(@NativeType("CGEventRef") long event) {
        long __functionAddress = Functions.EventGetTimestamp;
        return invokePJ(event, __functionAddress);
    }

    // --- [ CGEventSetTimestamp ] ---

    /** Sets the timestamp of an event. */
    public static void CGEventSetTimestamp(@NativeType("CGEventRef") long event, @NativeType("CGEventTimestamp") long timestamp) {
        long __functionAddress = Functions.EventSetTimestamp;
        invokePJV(event, timestamp, __functionAddress);
    }

    // --- [ CGEventGetLocation ] ---

    /** Unsafe version of: {@link #CGEventGetLocation EventGetLocation} */
    public static native void nCGEventGetLocation(long event, long __functionAddress, long __result);

    /** Unsafe version of: {@link #CGEventGetLocation EventGetLocation} */
    public static void nCGEventGetLocation(long event, long __result) {
        long __functionAddress = Functions.EventGetLocation;
        nCGEventGetLocation(event, __functionAddress, __result);
    }

    /**
     * Returns the location of an event in global display coordinates.
     * 
     * <p>{@code CGPointZero} is returned if {@code event} is not a valid {@code CGEventRef}.</p>
     */
    public static CGPoint CGEventGetLocation(@NativeType("CGEventRef") long event, CGPoint __result) {
        nCGEventGetLocation(event, __result.address());
        return __result;
    }

    // --- [ CGEventGetUnflippedLocation ] ---

    /** Unsafe version of: {@link #CGEventGetUnflippedLocation EventGetUnflippedLocation} */
    public static native void nCGEventGetUnflippedLocation(long event, long __functionAddress, long __result);

    /** Unsafe version of: {@link #CGEventGetUnflippedLocation EventGetUnflippedLocation} */
    public static void nCGEventGetUnflippedLocation(long event, long __result) {
        long __functionAddress = Functions.EventGetUnflippedLocation;
        nCGEventGetUnflippedLocation(event, __functionAddress, __result);
    }

    /**
     * Return the location of an event relative to the lower-left corner of the main display.
     * 
     * <p>{@code CGPointZero} is returned if {@code event} is not a valid {@code CGEventRef}.</p>
     */
    public static CGPoint CGEventGetUnflippedLocation(@NativeType("CGEventRef") long event, CGPoint __result) {
        nCGEventGetUnflippedLocation(event, __result.address());
        return __result;
    }

    // --- [ CGEventSetLocation ] ---

    /** Unsafe version of: {@link #CGEventSetLocation EventSetLocation} */
    public static native void nCGEventSetLocation(long event, long location, long __functionAddress);

    /** Unsafe version of: {@link #CGEventSetLocation EventSetLocation} */
    public static void nCGEventSetLocation(long event, long location) {
        long __functionAddress = Functions.EventSetLocation;
        nCGEventSetLocation(event, location, __functionAddress);
    }

    /** Sets the location of an event in global display coordinates. */
    public static void CGEventSetLocation(@NativeType("CGEventRef") long event, CGPoint location) {
        nCGEventSetLocation(event, location.address());
    }

    // --- [ CGEventGetFlags ] ---

    /**
     * Returns the event flags of an event.
     * 
     * <p>{@code (CGEventFlags)0} if {@code event} is not a valid {@code CGEventRef}.</p>
     */
    @NativeType("CGEventFlags")
    public static long CGEventGetFlags(@NativeType("CGEventRef") long event) {
        long __functionAddress = Functions.EventGetFlags;
        return invokePJ(event, __functionAddress);
    }

    // --- [ CGEventSetFlags ] ---

    /** Sets the event flags of an event. */
    public static void CGEventSetFlags(@NativeType("CGEventRef") long event, @NativeType("CGEventFlags") long flags) {
        long __functionAddress = Functions.EventSetFlags;
        invokePJV(event, flags, __functionAddress);
    }

    // --- [ CGEventKeyboardGetUnicodeString ] ---

    /** Unsafe version of: {@link #CGEventKeyboardGetUnicodeString EventKeyboardGetUnicodeString} */
    public static void nCGEventKeyboardGetUnicodeString(long event, long maxStringLength, long actualStringLength, long unicodeString) {
        long __functionAddress = Functions.EventKeyboardGetUnicodeString;
        invokePNPPV(event, maxStringLength, actualStringLength, unicodeString, __functionAddress);
    }

    /**
     * Returns the Unicode string associated with a keyboard event.
     * 
     * <p>When you call this function with a {@code NULL} string or a maximum string length of 0, the function still returns the actual count of Unicode characters in
     * the event.</p>
     */
    public static void CGEventKeyboardGetUnicodeString(@NativeType("CGEventRef") long event, @Nullable @NativeType("UniCharCount *") CLongBuffer actualStringLength, @Nullable @NativeType("UniChar *") ShortBuffer unicodeString) {
        if (CHECKS) {
            checkSafe(actualStringLength, 1);
        }
        nCGEventKeyboardGetUnicodeString(event, remainingSafe(unicodeString), memAddressSafe(actualStringLength), memAddressSafe(unicodeString));
    }

    // --- [ CGEventKeyboardSetUnicodeString ] ---

    /** Unsafe version of: {@link #CGEventKeyboardSetUnicodeString EventKeyboardSetUnicodeString} */
    public static void nCGEventKeyboardSetUnicodeString(long event, long stringLength, long unicodeString) {
        long __functionAddress = Functions.EventKeyboardSetUnicodeString;
        invokePNPV(event, stringLength, unicodeString, __functionAddress);
    }

    /**
     * Sets the Unicode string associated with a keyboard event.
     * 
     * <p>By default, the system translates the virtual key code in a keyboard event into a Unicode string based on the keyboard ID in the event source. This
     * function allows you to manually override this string. Note that application frameworks may ignore the Unicode string in a keyboard event and do their
     * own translation based on the virtual keycode and perceived event state.</p>
     */
    public static void CGEventKeyboardSetUnicodeString(@NativeType("CGEventRef") long event, @NativeType("UniChar const *") ShortBuffer unicodeString) {
        nCGEventKeyboardSetUnicodeString(event, unicodeString.remaining(), memAddress(unicodeString));
    }

    // --- [ CGEventGetIntegerValueField ] ---

    /** Returns the integer value of a field in an event. */
    @NativeType("int64_t")
    public static long CGEventGetIntegerValueField(@NativeType("CGEventRef") long event, @NativeType("CGEventField") int field) {
        long __functionAddress = Functions.EventGetIntegerValueField;
        return invokePJ(event, field, __functionAddress);
    }

    // --- [ CGEventSetIntegerValueField ] ---

    /**
     * Sets the integer value of a field in an event.
     * 
     * <p>Before calling this function, the event type must be set using a typed event creation function such as {@link #CGEventCreateMouseEvent EventCreateMouseEvent}, or by calling
     * {@link #CGEventSetType EventSetType}.</p>
     * 
     * <p>If you are creating a mouse event generated by a tablet, call this function and specify the field {@link #kCGMouseEventSubtype MouseEventSubtype} with a value of
     * {@link #kCGEventMouseSubtypeTabletPoint EventMouseSubtypeTabletPoint} or {@link #kCGEventMouseSubtypeTabletProximity EventMouseSubtypeTabletProximity} before setting other parameters.</p>
     */
    public static void CGEventSetIntegerValueField(@NativeType("CGEventRef") long event, @NativeType("CGEventField") int field, @NativeType("int64_t") long value) {
        long __functionAddress = Functions.EventSetIntegerValueField;
        invokePJV(event, field, value, __functionAddress);
    }

    // --- [ CGEventGetDoubleValueField ] ---

    /**
     * Returns the floating-point value of a field in an event.
     * 
     * <p>In cases where the field value is represented within the event by a fixed point number or an integer, the result is scaled to the appropriate range as
     * part of creating the floating-point representation.</p>
     */
    public static double CGEventGetDoubleValueField(@NativeType("CGEventRef") long event, @NativeType("CGEventField") int field) {
        long __functionAddress = Functions.EventGetDoubleValueField;
        return invokePD(event, field, __functionAddress);
    }

    // --- [ CGEventSetDoubleValueField ] ---

    /**
     * Sets the floating-point value of a field in an event.
     * 
     * <p>Before calling this function, the event type must be set using a typed event creation function such as {@link #CGEventCreateMouseEvent EventCreateMouseEvent}, or by calling
     * {@link #CGEventSetType EventSetType}.</p>
     * 
     * <p>In cases where the field’s value is represented within the event by a fixed point number or integer, the value parameter is scaled as needed and
     * converted to the appropriate type.</p>
     */
    public static void CGEventSetDoubleValueField(@NativeType("CGEventRef") long event, @NativeType("CGEventField") int field, double value) {
        long __functionAddress = Functions.EventSetDoubleValueField;
        invokePV(event, field, value, __functionAddress);
    }

    // --- [ CGEventTapCreate ] ---

    /** Unsafe version of: {@link #CGEventTapCreate EventTapCreate} */
    public static long nCGEventTapCreate(int tap, int place, int options, long eventsOfInterest, long callback, long userInfo) {
        long __functionAddress = Functions.EventTapCreate;
        return invokeJPPP(tap, place, options, eventsOfInterest, callback, userInfo, __functionAddress);
    }

    /**
     * Creates an event tap.
     * 
     * <p>Taps may be placed at the point where {@code HIDSystem} events enter the server, at the point where {@code HIDSystem} and remote control events enter a
     * session, at the point where events have been annotated to flow to a specific application, or at the point where events are delivered to the
     * application. Taps may be inserted at a specified point at the head of pre-existing filters, or appended after any pre-existing filters.</p>
     * 
     * <p>Taps may be passive event listeners, or active filters. An active filter may pass an event through unmodified, modify an event, or discard an event.
     * When a tap is registered, it identifies the set of events to be observed with a mask, and indicates if it is a passive or active event filter. Multiple
     * event type bitmasks may be ORed together.</p>
     * 
     * <p>Taps may only be placed at {@link #kCGHIDEventTap HIDEventTap} by a process running as the root user. {@code NULL} is returned for other users.</p>
     * 
     * <p>Taps placed at {@link #kCGHIDEventTap HIDEventTap}, {@link #kCGSessionEventTap SessionEventTap}, {@link #kCGAnnotatedSessionEventTap AnnotatedSessionEventTap}, or on a specific process may only receive key up and down events if access
     * for assistive devices is enabled (Preferences Accessibility panel, Keyboard view) or the caller is enabled for assistive device access, as by
     * {@code AXMakeProcessTrusted}. If the tap is not permitted to monitor these events when the tap is created, then the appropriate bits in the mask are
     * cleared. If that results in an empty mask, then {@code NULL} is returned.</p>
     * 
     * <p>An event tap is represented as a {@code CFMachPortRef}. The event tap may be added to an appropriate run loop by calling {@code CFRunLoopAddSource}.</p>
     * 
     * <p>Releasing the {@code CFMachPortRef} will release the tap.</p>
     * 
     * <p>A {@code CGEventTapProxy} is an opaque reference to state within the client application associated with the tap. The tap function may pass this
     * reference to other functions, such as the event-posting routines.</p>
     * 
     * <p>The event tap callback runs from the {@code CFRunLoop} to which the tap {@code CFMachPort} is added as a source. Thread safety is defined by the
     * {@code CFRunLoop} and its environment.</p>
     */
    @NativeType("CFMachPortRef")
    public static long CGEventTapCreate(@NativeType("CGEventTapLocation") int tap, @NativeType("CGEventTapPlacement") int place, @NativeType("CGEventTapOptions") int options, @NativeType("CGEventMask") long eventsOfInterest, @NativeType("CGEventRef (*) (CGEventTapProxy, CGEventType, CGEventRef, void *)") CGEventTapCallBackI callback, @NativeType("void *") long userInfo) {
        return nCGEventTapCreate(tap, place, options, eventsOfInterest, callback.address(), userInfo);
    }

    // --- [ CGEventTapCreateForPid ] ---

    /** Unsafe version of: {@link #CGEventTapCreateForPid EventTapCreateForPid} */
    public static long nCGEventTapCreateForPid(long pid, int place, int options, long eventsOfInterest, long callback, long userInfo) {
        long __functionAddress = Functions.EventTapCreateForPid;
        if (CHECKS) {
            check(__functionAddress);
            check(pid);
        }
        return invokePJPPP(pid, place, options, eventsOfInterest, callback, userInfo, __functionAddress);
    }

    /**
     * Create an event tap for a specified process.
     * 
     * <p>Events routed to individual applications may be tapped using another function. {@code CGEventTapCreateForPSN} will report all events routed to the
     * specified application.</p>
     *
     * @since macOS 10.11
     */
    @NativeType("CFMachPortRef")
    public static long CGEventTapCreateForPid(@NativeType("pid_t") long pid, @NativeType("CGEventTapPlacement") int place, @NativeType("CGEventTapOptions") int options, @NativeType("CGEventMask") long eventsOfInterest, @NativeType("CGEventRef (*) (CGEventTapProxy, CGEventType, CGEventRef, void *)") CGEventTapCallBackI callback, @NativeType("void *") long userInfo) {
        return nCGEventTapCreateForPid(pid, place, options, eventsOfInterest, callback.address(), userInfo);
    }

    // --- [ CGEventTapEnable ] ---

    /**
     * Enables or disables an event tap.
     * 
     * <p>Taps are normally enabled when created. If a tap becomes unresponsive or a user requests taps be disabled, an appropriate
     * {@code kCGEventTapDisabled...} event is passed to the registered {@link CGEventTapCallBack} function. An event tap may be re-enabled by calling this
     * function.</p>
     */
    public static void CGEventTapEnable(@NativeType("CFMachPortRef") long tap, @NativeType("bool") boolean enable) {
        long __functionAddress = Functions.EventTapEnable;
        if (CHECKS) {
            check(tap);
        }
        invokePV(tap, enable, __functionAddress);
    }

    // --- [ CGEventTapIsEnabled ] ---

    /** Return true if {@code tap} is enabled; false otherwise. */
    @NativeType("bool")
    public static boolean CGEventTapIsEnabled(@NativeType("CFMachPortRef") long tap) {
        long __functionAddress = Functions.EventTapIsEnabled;
        if (CHECKS) {
            check(tap);
        }
        return invokePZ(tap, __functionAddress);
    }

    // --- [ CGEventTapPostEvent ] ---

    /**
     * Post an event from an event tap into the event stream.
     * 
     * <p>You can use this function to post a new event at the same point to which an event returned from an event tap callback function would be posted. The new
     * event enters the system before the event returned by the callback enters the system. Events posted into the system will be seen by all taps placed
     * after the tap posting the event.</p>
     */
    public static void CGEventTapPostEvent(@NativeType("CGEventTapProxy") long proxy, @NativeType("CGEventRef") long event) {
        long __functionAddress = Functions.EventTapPostEvent;
        invokePPV(proxy, event, __functionAddress);
    }

    // --- [ CGEventPost ] ---

    /**
     * Posts an event into the event stream at a specified location.
     * 
     * <p>This function posts the specified event immediately before any event taps instantiated for that location, and the event passes through any such
     * taps.</p>
     *
     * @param tap   the location at which to post the event
     * @param event the event to post
     */
    public static void CGEventPost(@NativeType("CGEventTapLocation") int tap, @NativeType("CGEventRef") long event) {
        long __functionAddress = Functions.EventPost;
        if (CHECKS) {
            check(event);
        }
        invokePV(tap, event, __functionAddress);
    }

    // --- [ CGEventPostToPid ] ---

    /**
     * Post an event into the event stream for a specific application.
     * 
     * <p>This function makes it possible for an application to establish an event routing policy, for example, by tapping events at the
     * {@link #kCGAnnotatedSessionEventTap AnnotatedSessionEventTap} location and then posting the events to another desired process.</p>
     * 
     * <p>This function posts the specified event immediately before any event taps instantiated for the specified process, and the event passes through any such
     * taps.</p>
     *
     * @since macOS 10.11
     */
    public static void CGEventPostToPid(@NativeType("pid_t") long pid, @NativeType("CGEventRef") long event) {
        long __functionAddress = Functions.EventPostToPid;
        if (CHECKS) {
            check(__functionAddress);
            check(pid);
        }
        invokePPV(pid, event, __functionAddress);
    }

    // --- [ CGGetEventTapList ] ---

    /** Unsafe version of: {@link #CGGetEventTapList GetEventTapList} */
    public static int nCGGetEventTapList(int maxNumberOfTaps, long tapList, long eventTapCount) {
        long __functionAddress = Functions.GetEventTapList;
        return invokePPI(maxNumberOfTaps, tapList, eventTapCount, __functionAddress);
    }

    /**
     * Gets a list of currently installed event taps.
     * 
     * <p>{@code tapList} is an array of event tap information structures of length {@code maxNumberOfTaps}. You are responsible for allocating storage for this
     * array. On return, your array contains a list of currently installed event taps. On return, the number of event taps that are currently installed is
     * stored in {@code eventTapCount}. If you pass {@code NULL} in this parameter, the {@code maxNumberOfTaps} parameter is ignored, and the number of event taps
     * that are currently installed is stored in {@code eventTapCount}.</p>
     * 
     * <p>Each call to this function has the side effect of resetting the minimum and maximum latencies in the {@code tapList} parameter to the corresponding
     * average values. Values reported in these fields reflect the minimum and maximum values seen since the preceding call, or the instantiation of the tap.
     * This allows a monitoring tool to evaluate the best and worst case latency over time and under various operating conditions.</p>
     */
    @NativeType("CGError")
    public static int CGGetEventTapList(@Nullable @NativeType("CGEventTapInformation *") CGEventTapInformation.Buffer tapList, @Nullable @NativeType("uint32_t *") IntBuffer eventTapCount) {
        if (CHECKS) {
            checkSafe(eventTapCount, 1);
        }
        return nCGGetEventTapList(remainingSafe(tapList), memAddressSafe(tapList), memAddressSafe(eventTapCount));
    }

    /** Array version of: {@link #CGEventKeyboardGetUnicodeString EventKeyboardGetUnicodeString} */
    public static void CGEventKeyboardGetUnicodeString(@NativeType("CGEventRef") long event, @Nullable @NativeType("UniCharCount *") CLongBuffer actualStringLength, @Nullable @NativeType("UniChar *") short[] unicodeString) {
        long __functionAddress = Functions.EventKeyboardGetUnicodeString;
        if (CHECKS) {
            checkSafe(actualStringLength, 1);
        }
        invokePNPPV(event, (long)lengthSafe(unicodeString), memAddressSafe(actualStringLength), unicodeString, __functionAddress);
    }

    /** Array version of: {@link #CGEventKeyboardSetUnicodeString EventKeyboardSetUnicodeString} */
    public static void CGEventKeyboardSetUnicodeString(@NativeType("CGEventRef") long event, @NativeType("UniChar const *") short[] unicodeString) {
        long __functionAddress = Functions.EventKeyboardSetUnicodeString;
        invokePNPV(event, (long)unicodeString.length, unicodeString, __functionAddress);
    }

    /** Array version of: {@link #CGGetEventTapList GetEventTapList} */
    @NativeType("CGError")
    public static int CGGetEventTapList(@Nullable @NativeType("CGEventTapInformation *") CGEventTapInformation.Buffer tapList, @Nullable @NativeType("uint32_t *") int[] eventTapCount) {
        long __functionAddress = Functions.GetEventTapList;
        if (CHECKS) {
            checkSafe(eventTapCount, 1);
        }
        return invokePPI(remainingSafe(tapList), memAddressSafe(tapList), eventTapCount, __functionAddress);
    }

}