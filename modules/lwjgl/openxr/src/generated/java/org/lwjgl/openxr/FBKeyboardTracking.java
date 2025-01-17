/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class FBKeyboardTracking {

    public static final int XR_FB_keyboard_tracking_SPEC_VERSION = 1;

    public static final String XR_FB_KEYBOARD_TRACKING_EXTENSION_NAME = "XR_FB_keyboard_tracking";

    public static final int XR_MAX_KEYBOARD_TRACKING_NAME_SIZE_FB = 128;

    public static final int
        XR_TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB = 1000116002,
        XR_TYPE_KEYBOARD_TRACKING_QUERY_FB             = 1000116004,
        XR_TYPE_KEYBOARD_SPACE_CREATE_INFO_FB          = 1000116009;

    public static final int
        XR_KEYBOARD_TRACKING_EXISTS_BIT_FB    = 0x1,
        XR_KEYBOARD_TRACKING_LOCAL_BIT_FB     = 0x2,
        XR_KEYBOARD_TRACKING_REMOTE_BIT_FB    = 0x4,
        XR_KEYBOARD_TRACKING_CONNECTED_BIT_FB = 0x8;

    public static final int
        XR_KEYBOARD_TRACKING_QUERY_LOCAL_BIT_FB  = 0x2,
        XR_KEYBOARD_TRACKING_QUERY_REMOTE_BIT_FB = 0x4;

    protected FBKeyboardTracking() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrQuerySystemTrackedKeyboardFB ] ---

    /** {@code XrResult xrQuerySystemTrackedKeyboardFB(XrSession session, XrKeyboardTrackingQueryFB const * queryInfo, XrKeyboardTrackingDescriptionFB * keyboard)} */
    public static int nxrQuerySystemTrackedKeyboardFB(XrSession session, long queryInfo, long keyboard) {
        long __functionAddress = session.getCapabilities().xrQuerySystemTrackedKeyboardFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), queryInfo, keyboard, __functionAddress);
    }

    /** {@code XrResult xrQuerySystemTrackedKeyboardFB(XrSession session, XrKeyboardTrackingQueryFB const * queryInfo, XrKeyboardTrackingDescriptionFB * keyboard)} */
    @NativeType("XrResult")
    public static int xrQuerySystemTrackedKeyboardFB(XrSession session, @NativeType("XrKeyboardTrackingQueryFB const *") XrKeyboardTrackingQueryFB queryInfo, @NativeType("XrKeyboardTrackingDescriptionFB *") XrKeyboardTrackingDescriptionFB keyboard) {
        return nxrQuerySystemTrackedKeyboardFB(session, queryInfo.address(), keyboard.address());
    }

    // --- [ xrCreateKeyboardSpaceFB ] ---

    /** {@code XrResult xrCreateKeyboardSpaceFB(XrSession session, XrKeyboardSpaceCreateInfoFB const * createInfo, XrSpace * keyboardSpace)} */
    public static int nxrCreateKeyboardSpaceFB(XrSession session, long createInfo, long keyboardSpace) {
        long __functionAddress = session.getCapabilities().xrCreateKeyboardSpaceFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, keyboardSpace, __functionAddress);
    }

    /** {@code XrResult xrCreateKeyboardSpaceFB(XrSession session, XrKeyboardSpaceCreateInfoFB const * createInfo, XrSpace * keyboardSpace)} */
    @NativeType("XrResult")
    public static int xrCreateKeyboardSpaceFB(XrSession session, @NativeType("XrKeyboardSpaceCreateInfoFB const *") XrKeyboardSpaceCreateInfoFB createInfo, @NativeType("XrSpace *") PointerBuffer keyboardSpace) {
        if (CHECKS) {
            check(keyboardSpace, 1);
        }
        return nxrCreateKeyboardSpaceFB(session, createInfo.address(), memAddress(keyboardSpace));
    }

}