/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class METASimultaneousHandsAndControllers {

    public static final int XR_META_simultaneous_hands_and_controllers_SPEC_VERSION = 1;

    public static final String XR_META_SIMULTANEOUS_HANDS_AND_CONTROLLERS_EXTENSION_NAME = "XR_META_simultaneous_hands_and_controllers";

    public static final int
        XR_TYPE_SYSTEM_SIMULTANEOUS_HANDS_AND_CONTROLLERS_PROPERTIES_META    = 1000532001,
        XR_TYPE_SIMULTANEOUS_HANDS_AND_CONTROLLERS_TRACKING_RESUME_INFO_META = 1000532002,
        XR_TYPE_SIMULTANEOUS_HANDS_AND_CONTROLLERS_TRACKING_PAUSE_INFO_META  = 1000532003;

    protected METASimultaneousHandsAndControllers() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrResumeSimultaneousHandsAndControllersTrackingMETA ] ---

    /** {@code XrResult xrResumeSimultaneousHandsAndControllersTrackingMETA(XrSession session, XrSimultaneousHandsAndControllersTrackingResumeInfoMETA const * resumeInfo)} */
    public static int nxrResumeSimultaneousHandsAndControllersTrackingMETA(XrSession session, long resumeInfo) {
        long __functionAddress = session.getCapabilities().xrResumeSimultaneousHandsAndControllersTrackingMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), resumeInfo, __functionAddress);
    }

    /** {@code XrResult xrResumeSimultaneousHandsAndControllersTrackingMETA(XrSession session, XrSimultaneousHandsAndControllersTrackingResumeInfoMETA const * resumeInfo)} */
    @NativeType("XrResult")
    public static int xrResumeSimultaneousHandsAndControllersTrackingMETA(XrSession session, @NativeType("XrSimultaneousHandsAndControllersTrackingResumeInfoMETA const *") XrSimultaneousHandsAndControllersTrackingResumeInfoMETA resumeInfo) {
        return nxrResumeSimultaneousHandsAndControllersTrackingMETA(session, resumeInfo.address());
    }

    // --- [ xrPauseSimultaneousHandsAndControllersTrackingMETA ] ---

    /** {@code XrResult xrPauseSimultaneousHandsAndControllersTrackingMETA(XrSession session, XrSimultaneousHandsAndControllersTrackingPauseInfoMETA const * pauseInfo)} */
    public static int nxrPauseSimultaneousHandsAndControllersTrackingMETA(XrSession session, long pauseInfo) {
        long __functionAddress = session.getCapabilities().xrPauseSimultaneousHandsAndControllersTrackingMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), pauseInfo, __functionAddress);
    }

    /** {@code XrResult xrPauseSimultaneousHandsAndControllersTrackingMETA(XrSession session, XrSimultaneousHandsAndControllersTrackingPauseInfoMETA const * pauseInfo)} */
    @NativeType("XrResult")
    public static int xrPauseSimultaneousHandsAndControllersTrackingMETA(XrSession session, @NativeType("XrSimultaneousHandsAndControllersTrackingPauseInfoMETA const *") XrSimultaneousHandsAndControllersTrackingPauseInfoMETA pauseInfo) {
        return nxrPauseSimultaneousHandsAndControllersTrackingMETA(session, pauseInfo.address());
    }

}