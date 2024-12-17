/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

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
            EventTapCreateForPid          = apiGetFunctionAddress(COREGRAPHICS, "CGEventTapCreateForPid"),
            EventTapEnable                = apiGetFunctionAddress(COREGRAPHICS, "CGEventTapEnable"),
            EventTapIsEnabled             = apiGetFunctionAddress(COREGRAPHICS, "CGEventTapIsEnabled"),
            EventTapPostEvent             = apiGetFunctionAddress(COREGRAPHICS, "CGEventTapPostEvent"),
            EventPost                     = apiGetFunctionAddress(COREGRAPHICS, "CGEventPost"),
            EventPostToPid                = apiGetFunctionAddress(COREGRAPHICS, "CGEventPostToPid"),
            GetEventTapList               = apiGetFunctionAddress(COREGRAPHICS, "CGGetEventTapList");

    }

    /** Returns the CoreGraphics {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return COREGRAPHICS;
    }

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

    public static final int
        kCGMouseButtonLeft   = 0,
        kCGMouseButtonRight  = 1,
        kCGMouseButtonCenter = 2;

    public static final int
        kCGHIDEventTap              = 0x0,
        kCGSessionEventTap          = 0x1,
        kCGAnnotatedSessionEventTap = 0x2;

    public static final int
        kCGScrollEventUnitPixel = 0,
        kCGScrollEventUnitLine  = 1;

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

    public static final int
        kCGEventMouseSubtypeDefault         = 0,
        kCGEventMouseSubtypeTabletPoint     = 1,
        kCGEventMouseSubtypeTabletProximity = 2;

    protected CoreGraphics() {
        throw new UnsupportedOperationException();
    }

    // --- [ CGEventGetTypeID ] ---

    /** {@code CFTypeID CGEventGetTypeID(void)} */
    @NativeType("CFTypeID")
    public static long CGEventGetTypeID() {
        long __functionAddress = Functions.EventGetTypeID;
        return invokeJ(__functionAddress);
    }

    // --- [ CGEventCreate ] ---

    /** {@code CGEventRef CGEventCreate(CGEventSourceRef source)} */
    @NativeType("CGEventRef")
    public static long CGEventCreate(@NativeType("CGEventSourceRef") long source) {
        long __functionAddress = Functions.EventCreate;
        return invokePP(source, __functionAddress);
    }

    // --- [ CGEventCreateData ] ---

    /** {@code CFDataRef CGEventCreateData(CFAllocatorRef allocator, CGEventRef event)} */
    @NativeType("CFDataRef")
    public static long CGEventCreateData(@NativeType("CFAllocatorRef") long allocator, @NativeType("CGEventRef") long event) {
        long __functionAddress = Functions.EventCreateData;
        return invokePPP(allocator, event, __functionAddress);
    }

    // --- [ CGEventCreateFromData ] ---

    /** {@code CGEventRef CGEventCreateFromData(CFAllocatorRef allocator, CFDataRef data)} */
    @NativeType("CGEventRef")
    public static long CGEventCreateFromData(@NativeType("CFAllocatorRef") long allocator, @NativeType("CFDataRef") long data) {
        long __functionAddress = Functions.EventCreateFromData;
        return invokePPP(allocator, data, __functionAddress);
    }

    // --- [ CGEventCreateMouseEvent ] ---

    /** {@code CGEventRef CGEventCreateMouseEvent(CGEventSourceRef source, CGEventType mouseType, CGPoint mouseCursorPosition, CGMouseButton mouseButton)} */
    public static native long nCGEventCreateMouseEvent(long source, int mouseType, long mouseCursorPosition, int mouseButton, long __functionAddress);

    /** {@code CGEventRef CGEventCreateMouseEvent(CGEventSourceRef source, CGEventType mouseType, CGPoint mouseCursorPosition, CGMouseButton mouseButton)} */
    public static long nCGEventCreateMouseEvent(long source, int mouseType, long mouseCursorPosition, int mouseButton) {
        long __functionAddress = Functions.EventCreateMouseEvent;
        return nCGEventCreateMouseEvent(source, mouseType, mouseCursorPosition, mouseButton, __functionAddress);
    }

    /** {@code CGEventRef CGEventCreateMouseEvent(CGEventSourceRef source, CGEventType mouseType, CGPoint mouseCursorPosition, CGMouseButton mouseButton)} */
    @NativeType("CGEventRef")
    public static long CGEventCreateMouseEvent(@NativeType("CGEventSourceRef") long source, @NativeType("CGEventType") int mouseType, CGPoint mouseCursorPosition, @NativeType("CGMouseButton") int mouseButton) {
        return nCGEventCreateMouseEvent(source, mouseType, mouseCursorPosition.address(), mouseButton);
    }

    // --- [ CGEventCreateKeyboardEvent ] ---

    /** {@code CGEventRef CGEventCreateKeyboardEvent(CGEventSourceRef source, CGKeyCode virtualKey, bool keyDown)} */
    @NativeType("CGEventRef")
    public static long CGEventCreateKeyboardEvent(@NativeType("CGEventSourceRef") long source, @NativeType("CGKeyCode") short virtualKey, @NativeType("bool") boolean keyDown) {
        long __functionAddress = Functions.EventCreateKeyboardEvent;
        return invokePCP(source, virtualKey, keyDown, __functionAddress);
    }

    // --- [ CGEventCreateScrollWheelEvent ] ---

    /** {@code CGEventRef CGEventCreateScrollWheelEvent(CGEventSourceRef source, CGScrollEventUnit units, uint32_t wheelCount, int32_t wheel1)} */
    @NativeType("CGEventRef")
    public static long CGEventCreateScrollWheelEvent(@NativeType("CGEventSourceRef") long source, @NativeType("CGScrollEventUnit") int units, @NativeType("uint32_t") int wheelCount, @NativeType("int32_t") int wheel1) {
        long __functionAddress = Functions.EventCreateScrollWheelEvent;
        return invokePP(source, units, wheelCount, wheel1, __functionAddress);
    }

    /** {@code CGEventRef CGEventCreateScrollWheelEvent(CGEventSourceRef source, CGScrollEventUnit units, uint32_t wheelCount, int32_t wheel1)} */
    @NativeType("CGEventRef")
    public static long CGEventCreateScrollWheelEvent(@NativeType("CGEventSourceRef") long source, @NativeType("CGScrollEventUnit") int units, @NativeType("int32_t") int wheel1) {
        long __functionAddress = Functions.EventCreateScrollWheelEvent;
        return invokePP(source, units, 1, wheel1, __functionAddress);
    }

    // --- [ CGEventCreateScrollWheelEvent2 ] ---

    /** {@code CGEventRef CGEventCreateScrollWheelEvent2(CGEventSourceRef source, CGScrollEventUnit units, uint32_t wheelCount, int32_t wheel1, int32_t wheel2, int32_t wheel3)} */
    @NativeType("CGEventRef")
    public static long CGEventCreateScrollWheelEvent2(@NativeType("CGEventSourceRef") long source, @NativeType("CGScrollEventUnit") int units, @NativeType("uint32_t") int wheelCount, @NativeType("int32_t") int wheel1, @NativeType("int32_t") int wheel2, @NativeType("int32_t") int wheel3) {
        long __functionAddress = Functions.EventCreateScrollWheelEvent2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(source, units, wheelCount, wheel1, wheel2, wheel3, __functionAddress);
    }

    // --- [ CGEventCreateCopy ] ---

    /** {@code CGEventRef CGEventCreateCopy(CGEventRef event)} */
    @NativeType("CGEventRef")
    public static long CGEventCreateCopy(@NativeType("CGEventRef") long event) {
        long __functionAddress = Functions.EventCreateCopy;
        return invokePP(event, __functionAddress);
    }

    // --- [ CGEventCreateSourceFromEvent ] ---

    /** {@code CGEventSourceRef CGEventCreateSourceFromEvent(CGEventRef event)} */
    @NativeType("CGEventSourceRef")
    public static long CGEventCreateSourceFromEvent(@NativeType("CGEventRef") long event) {
        long __functionAddress = Functions.EventCreateSourceFromEvent;
        return invokePP(event, __functionAddress);
    }

    // --- [ CGEventSetSource ] ---

    /** {@code void CGEventSetSource(CGEventRef event, CGEventSourceRef source)} */
    public static void CGEventSetSource(@NativeType("CGEventRef") long event, @NativeType("CGEventSourceRef") long source) {
        long __functionAddress = Functions.EventSetSource;
        invokePPV(event, source, __functionAddress);
    }

    // --- [ CGEventGetType ] ---

    /** {@code CGEventType CGEventGetType(CGEventRef event)} */
    @NativeType("CGEventType")
    public static int CGEventGetType(@NativeType("CGEventRef") long event) {
        long __functionAddress = Functions.EventGetType;
        return invokePI(event, __functionAddress);
    }

    // --- [ CGEventSetType ] ---

    /** {@code void CGEventSetType(CGEventRef event, CGEventType type)} */
    public static void CGEventSetType(@NativeType("CGEventRef") long event, @NativeType("CGEventType") int type) {
        long __functionAddress = Functions.EventSetType;
        invokePV(event, type, __functionAddress);
    }

    // --- [ CGEventGetTimestamp ] ---

    /** {@code CGEventTimestamp CGEventGetTimestamp(CGEventRef event)} */
    @NativeType("CGEventTimestamp")
    public static long CGEventGetTimestamp(@NativeType("CGEventRef") long event) {
        long __functionAddress = Functions.EventGetTimestamp;
        return invokePJ(event, __functionAddress);
    }

    // --- [ CGEventSetTimestamp ] ---

    /** {@code void CGEventSetTimestamp(CGEventRef event, CGEventTimestamp timestamp)} */
    public static void CGEventSetTimestamp(@NativeType("CGEventRef") long event, @NativeType("CGEventTimestamp") long timestamp) {
        long __functionAddress = Functions.EventSetTimestamp;
        invokePJV(event, timestamp, __functionAddress);
    }

    // --- [ CGEventGetLocation ] ---

    /** {@code CGPoint CGEventGetLocation(CGEventRef event)} */
    public static native void nCGEventGetLocation(long event, long __functionAddress, long __result);

    /** {@code CGPoint CGEventGetLocation(CGEventRef event)} */
    public static void nCGEventGetLocation(long event, long __result) {
        long __functionAddress = Functions.EventGetLocation;
        nCGEventGetLocation(event, __functionAddress, __result);
    }

    /** {@code CGPoint CGEventGetLocation(CGEventRef event)} */
    public static CGPoint CGEventGetLocation(@NativeType("CGEventRef") long event, CGPoint __result) {
        nCGEventGetLocation(event, __result.address());
        return __result;
    }

    // --- [ CGEventGetUnflippedLocation ] ---

    /** {@code CGPoint CGEventGetUnflippedLocation(CGEventRef event)} */
    public static native void nCGEventGetUnflippedLocation(long event, long __functionAddress, long __result);

    /** {@code CGPoint CGEventGetUnflippedLocation(CGEventRef event)} */
    public static void nCGEventGetUnflippedLocation(long event, long __result) {
        long __functionAddress = Functions.EventGetUnflippedLocation;
        nCGEventGetUnflippedLocation(event, __functionAddress, __result);
    }

    /** {@code CGPoint CGEventGetUnflippedLocation(CGEventRef event)} */
    public static CGPoint CGEventGetUnflippedLocation(@NativeType("CGEventRef") long event, CGPoint __result) {
        nCGEventGetUnflippedLocation(event, __result.address());
        return __result;
    }

    // --- [ CGEventSetLocation ] ---

    /** {@code void CGEventSetLocation(CGEventRef event, CGPoint location)} */
    public static native void nCGEventSetLocation(long event, long location, long __functionAddress);

    /** {@code void CGEventSetLocation(CGEventRef event, CGPoint location)} */
    public static void nCGEventSetLocation(long event, long location) {
        long __functionAddress = Functions.EventSetLocation;
        nCGEventSetLocation(event, location, __functionAddress);
    }

    /** {@code void CGEventSetLocation(CGEventRef event, CGPoint location)} */
    public static void CGEventSetLocation(@NativeType("CGEventRef") long event, CGPoint location) {
        nCGEventSetLocation(event, location.address());
    }

    // --- [ CGEventGetFlags ] ---

    /** {@code CGEventFlags CGEventGetFlags(CGEventRef event)} */
    @NativeType("CGEventFlags")
    public static long CGEventGetFlags(@NativeType("CGEventRef") long event) {
        long __functionAddress = Functions.EventGetFlags;
        return invokePJ(event, __functionAddress);
    }

    // --- [ CGEventSetFlags ] ---

    /** {@code void CGEventSetFlags(CGEventRef event, CGEventFlags flags)} */
    public static void CGEventSetFlags(@NativeType("CGEventRef") long event, @NativeType("CGEventFlags") long flags) {
        long __functionAddress = Functions.EventSetFlags;
        invokePJV(event, flags, __functionAddress);
    }

    // --- [ CGEventKeyboardGetUnicodeString ] ---

    /** {@code void CGEventKeyboardGetUnicodeString(CGEventRef event, UniCharCount maxStringLength, UniCharCount * actualStringLength, UniChar * unicodeString)} */
    public static void nCGEventKeyboardGetUnicodeString(long event, long maxStringLength, long actualStringLength, long unicodeString) {
        long __functionAddress = Functions.EventKeyboardGetUnicodeString;
        invokePNPPV(event, maxStringLength, actualStringLength, unicodeString, __functionAddress);
    }

    /** {@code void CGEventKeyboardGetUnicodeString(CGEventRef event, UniCharCount maxStringLength, UniCharCount * actualStringLength, UniChar * unicodeString)} */
    public static void CGEventKeyboardGetUnicodeString(@NativeType("CGEventRef") long event, @NativeType("UniCharCount *") @Nullable CLongBuffer actualStringLength, @NativeType("UniChar *") @Nullable ShortBuffer unicodeString) {
        if (CHECKS) {
            checkSafe(actualStringLength, 1);
        }
        nCGEventKeyboardGetUnicodeString(event, remainingSafe(unicodeString), memAddressSafe(actualStringLength), memAddressSafe(unicodeString));
    }

    // --- [ CGEventKeyboardSetUnicodeString ] ---

    /** {@code void CGEventKeyboardSetUnicodeString(CGEventRef event, UniCharCount stringLength, UniChar const * unicodeString)} */
    public static void nCGEventKeyboardSetUnicodeString(long event, long stringLength, long unicodeString) {
        long __functionAddress = Functions.EventKeyboardSetUnicodeString;
        invokePNPV(event, stringLength, unicodeString, __functionAddress);
    }

    /** {@code void CGEventKeyboardSetUnicodeString(CGEventRef event, UniCharCount stringLength, UniChar const * unicodeString)} */
    public static void CGEventKeyboardSetUnicodeString(@NativeType("CGEventRef") long event, @NativeType("UniChar const *") ShortBuffer unicodeString) {
        nCGEventKeyboardSetUnicodeString(event, unicodeString.remaining(), memAddress(unicodeString));
    }

    // --- [ CGEventGetIntegerValueField ] ---

    /** {@code int64_t CGEventGetIntegerValueField(CGEventRef event, CGEventField field)} */
    @NativeType("int64_t")
    public static long CGEventGetIntegerValueField(@NativeType("CGEventRef") long event, @NativeType("CGEventField") int field) {
        long __functionAddress = Functions.EventGetIntegerValueField;
        return invokePJ(event, field, __functionAddress);
    }

    // --- [ CGEventSetIntegerValueField ] ---

    /** {@code void CGEventSetIntegerValueField(CGEventRef event, CGEventField field, int64_t value)} */
    public static void CGEventSetIntegerValueField(@NativeType("CGEventRef") long event, @NativeType("CGEventField") int field, @NativeType("int64_t") long value) {
        long __functionAddress = Functions.EventSetIntegerValueField;
        invokePJV(event, field, value, __functionAddress);
    }

    // --- [ CGEventGetDoubleValueField ] ---

    /** {@code double CGEventGetDoubleValueField(CGEventRef event, CGEventField field)} */
    public static double CGEventGetDoubleValueField(@NativeType("CGEventRef") long event, @NativeType("CGEventField") int field) {
        long __functionAddress = Functions.EventGetDoubleValueField;
        return invokePD(event, field, __functionAddress);
    }

    // --- [ CGEventSetDoubleValueField ] ---

    /** {@code void CGEventSetDoubleValueField(CGEventRef event, CGEventField field, double value)} */
    public static void CGEventSetDoubleValueField(@NativeType("CGEventRef") long event, @NativeType("CGEventField") int field, double value) {
        long __functionAddress = Functions.EventSetDoubleValueField;
        invokePV(event, field, value, __functionAddress);
    }

    // --- [ CGEventTapCreate ] ---

    /** {@code CFMachPortRef CGEventTapCreate(CGEventTapLocation tap, CGEventTapPlacement place, CGEventTapOptions options, CGEventMask eventsOfInterest, CGEventRef (*) (CGEventTapProxy, CGEventType, CGEventRef, void *) callback, void * userInfo)} */
    public static long nCGEventTapCreate(int tap, int place, int options, long eventsOfInterest, long callback, long userInfo) {
        long __functionAddress = Functions.EventTapCreate;
        return invokeJPPP(tap, place, options, eventsOfInterest, callback, userInfo, __functionAddress);
    }

    /** {@code CFMachPortRef CGEventTapCreate(CGEventTapLocation tap, CGEventTapPlacement place, CGEventTapOptions options, CGEventMask eventsOfInterest, CGEventRef (*) (CGEventTapProxy, CGEventType, CGEventRef, void *) callback, void * userInfo)} */
    @NativeType("CFMachPortRef")
    public static long CGEventTapCreate(@NativeType("CGEventTapLocation") int tap, @NativeType("CGEventTapPlacement") int place, @NativeType("CGEventTapOptions") int options, @NativeType("CGEventMask") long eventsOfInterest, @NativeType("CGEventRef (*) (CGEventTapProxy, CGEventType, CGEventRef, void *)") CGEventTapCallBackI callback, @NativeType("void *") long userInfo) {
        return nCGEventTapCreate(tap, place, options, eventsOfInterest, callback.address(), userInfo);
    }

    // --- [ CGEventTapCreateForPid ] ---

    /** {@code CFMachPortRef CGEventTapCreateForPid(pid_t pid, CGEventTapPlacement place, CGEventTapOptions options, CGEventMask eventsOfInterest, CGEventRef (*) (CGEventTapProxy, CGEventType, CGEventRef, void *) callback, void * userInfo)} */
    public static long nCGEventTapCreateForPid(long pid, int place, int options, long eventsOfInterest, long callback, long userInfo) {
        long __functionAddress = Functions.EventTapCreateForPid;
        if (CHECKS) {
            check(pid);
        }
        return invokePJPPP(pid, place, options, eventsOfInterest, callback, userInfo, __functionAddress);
    }

    /** {@code CFMachPortRef CGEventTapCreateForPid(pid_t pid, CGEventTapPlacement place, CGEventTapOptions options, CGEventMask eventsOfInterest, CGEventRef (*) (CGEventTapProxy, CGEventType, CGEventRef, void *) callback, void * userInfo)} */
    @NativeType("CFMachPortRef")
    public static long CGEventTapCreateForPid(@NativeType("pid_t") long pid, @NativeType("CGEventTapPlacement") int place, @NativeType("CGEventTapOptions") int options, @NativeType("CGEventMask") long eventsOfInterest, @NativeType("CGEventRef (*) (CGEventTapProxy, CGEventType, CGEventRef, void *)") CGEventTapCallBackI callback, @NativeType("void *") long userInfo) {
        return nCGEventTapCreateForPid(pid, place, options, eventsOfInterest, callback.address(), userInfo);
    }

    // --- [ CGEventTapEnable ] ---

    /** {@code void CGEventTapEnable(CFMachPortRef tap, bool enable)} */
    public static void CGEventTapEnable(@NativeType("CFMachPortRef") long tap, @NativeType("bool") boolean enable) {
        long __functionAddress = Functions.EventTapEnable;
        if (CHECKS) {
            check(tap);
        }
        invokePV(tap, enable, __functionAddress);
    }

    // --- [ CGEventTapIsEnabled ] ---

    /** {@code bool CGEventTapIsEnabled(CFMachPortRef tap)} */
    @NativeType("bool")
    public static boolean CGEventTapIsEnabled(@NativeType("CFMachPortRef") long tap) {
        long __functionAddress = Functions.EventTapIsEnabled;
        if (CHECKS) {
            check(tap);
        }
        return invokePZ(tap, __functionAddress);
    }

    // --- [ CGEventTapPostEvent ] ---

    /** {@code void CGEventTapPostEvent(CGEventTapProxy proxy, CGEventRef event)} */
    public static void CGEventTapPostEvent(@NativeType("CGEventTapProxy") long proxy, @NativeType("CGEventRef") long event) {
        long __functionAddress = Functions.EventTapPostEvent;
        invokePPV(proxy, event, __functionAddress);
    }

    // --- [ CGEventPost ] ---

    /** {@code void CGEventPost(CGEventTapLocation tap, CGEventRef event)} */
    public static void CGEventPost(@NativeType("CGEventTapLocation") int tap, @NativeType("CGEventRef") long event) {
        long __functionAddress = Functions.EventPost;
        if (CHECKS) {
            check(event);
        }
        invokePV(tap, event, __functionAddress);
    }

    // --- [ CGEventPostToPid ] ---

    /** {@code void CGEventPostToPid(pid_t pid, CGEventRef event)} */
    public static void CGEventPostToPid(@NativeType("pid_t") long pid, @NativeType("CGEventRef") long event) {
        long __functionAddress = Functions.EventPostToPid;
        if (CHECKS) {
            check(pid);
        }
        invokePPV(pid, event, __functionAddress);
    }

    // --- [ CGGetEventTapList ] ---

    /** {@code CGError CGGetEventTapList(uint32_t maxNumberOfTaps, CGEventTapInformation * tapList, uint32_t * eventTapCount)} */
    public static int nCGGetEventTapList(int maxNumberOfTaps, long tapList, long eventTapCount) {
        long __functionAddress = Functions.GetEventTapList;
        return invokePPI(maxNumberOfTaps, tapList, eventTapCount, __functionAddress);
    }

    /** {@code CGError CGGetEventTapList(uint32_t maxNumberOfTaps, CGEventTapInformation * tapList, uint32_t * eventTapCount)} */
    @NativeType("CGError")
    public static int CGGetEventTapList(@NativeType("CGEventTapInformation *") CGEventTapInformation.@Nullable Buffer tapList, @NativeType("uint32_t *") @Nullable IntBuffer eventTapCount) {
        if (CHECKS) {
            checkSafe(eventTapCount, 1);
        }
        return nCGGetEventTapList(remainingSafe(tapList), memAddressSafe(tapList), memAddressSafe(eventTapCount));
    }

    /** {@code void CGEventKeyboardGetUnicodeString(CGEventRef event, UniCharCount maxStringLength, UniCharCount * actualStringLength, UniChar * unicodeString)} */
    public static void CGEventKeyboardGetUnicodeString(@NativeType("CGEventRef") long event, @NativeType("UniCharCount *") @Nullable CLongBuffer actualStringLength, @NativeType("UniChar *") short @Nullable [] unicodeString) {
        long __functionAddress = Functions.EventKeyboardGetUnicodeString;
        if (CHECKS) {
            checkSafe(actualStringLength, 1);
        }
        invokePNPPV(event, (long)lengthSafe(unicodeString), memAddressSafe(actualStringLength), unicodeString, __functionAddress);
    }

    /** {@code void CGEventKeyboardSetUnicodeString(CGEventRef event, UniCharCount stringLength, UniChar const * unicodeString)} */
    public static void CGEventKeyboardSetUnicodeString(@NativeType("CGEventRef") long event, @NativeType("UniChar const *") short[] unicodeString) {
        long __functionAddress = Functions.EventKeyboardSetUnicodeString;
        invokePNPV(event, (long)unicodeString.length, unicodeString, __functionAddress);
    }

    /** {@code CGError CGGetEventTapList(uint32_t maxNumberOfTaps, CGEventTapInformation * tapList, uint32_t * eventTapCount)} */
    @NativeType("CGError")
    public static int CGGetEventTapList(@NativeType("CGEventTapInformation *") CGEventTapInformation.@Nullable Buffer tapList, @NativeType("uint32_t *") int @Nullable [] eventTapCount) {
        long __functionAddress = Functions.GetEventTapList;
        if (CHECKS) {
            checkSafe(eventTapCount, 1);
        }
        return invokePPI(remainingSafe(tapList), memAddressSafe(tapList), eventTapCount, __functionAddress);
    }

}