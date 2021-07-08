/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** The EXT_conformance_automation extension. */
public class EXTConformanceAutomation {

    static { Library.initialize(); }

    /** The extension specification version. */
    public static final int XR_EXT_conformance_automation_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_EXT_CONFORMANCE_AUTOMATION_EXTENSION_NAME = "XR_EXT_conformance_automation";

    protected EXTConformanceAutomation() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetInputDeviceActiveEXT ] ---

    @NativeType("XrResult")
    public static int xrSetInputDeviceActiveEXT(XrSession session, @NativeType("XrPath") long interactionProfile, @NativeType("XrPath") long topLevelPath, @NativeType("XrBool32") boolean isActive) {
        long __functionAddress = session.getCapabilities().xrSetInputDeviceActiveEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJI(session.address(), interactionProfile, topLevelPath, isActive ? 1 : 0, __functionAddress);
    }

    // --- [ xrSetInputDeviceStateBoolEXT ] ---

    @NativeType("XrResult")
    public static int xrSetInputDeviceStateBoolEXT(XrSession session, @NativeType("XrPath") long topLevelPath, @NativeType("XrPath") long inputSourcePath, @NativeType("XrBool32") boolean state) {
        long __functionAddress = session.getCapabilities().xrSetInputDeviceStateBoolEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJI(session.address(), topLevelPath, inputSourcePath, state ? 1 : 0, __functionAddress);
    }

    // --- [ xrSetInputDeviceStateFloatEXT ] ---

    @NativeType("XrResult")
    public static int xrSetInputDeviceStateFloatEXT(XrSession session, @NativeType("XrPath") long topLevelPath, @NativeType("XrPath") long inputSourcePath, float state) {
        long __functionAddress = session.getCapabilities().xrSetInputDeviceStateFloatEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJI(session.address(), topLevelPath, inputSourcePath, state, __functionAddress);
    }

    // --- [ xrSetInputDeviceStateVector2fEXT ] ---

    public static native int nxrSetInputDeviceStateVector2fEXT(long session, long topLevelPath, long inputSourcePath, long state, long __functionAddress);

    public static int nxrSetInputDeviceStateVector2fEXT(XrSession session, long topLevelPath, long inputSourcePath, long state) {
        long __functionAddress = session.getCapabilities().xrSetInputDeviceStateVector2fEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nxrSetInputDeviceStateVector2fEXT(session.address(), topLevelPath, inputSourcePath, state, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrSetInputDeviceStateVector2fEXT(XrSession session, @NativeType("XrPath") long topLevelPath, @NativeType("XrPath") long inputSourcePath, XrVector2f state) {
        return nxrSetInputDeviceStateVector2fEXT(session, topLevelPath, inputSourcePath, state.address());
    }

    // --- [ xrSetInputDeviceLocationEXT ] ---

    public static native int nxrSetInputDeviceLocationEXT(long session, long topLevelPath, long inputSourcePath, long space, long pose, long __functionAddress);

    public static int nxrSetInputDeviceLocationEXT(XrSession session, long topLevelPath, long inputSourcePath, XrSpace space, long pose) {
        long __functionAddress = session.getCapabilities().xrSetInputDeviceLocationEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nxrSetInputDeviceLocationEXT(session.address(), topLevelPath, inputSourcePath, space.address(), pose, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrSetInputDeviceLocationEXT(XrSession session, @NativeType("XrPath") long topLevelPath, @NativeType("XrPath") long inputSourcePath, XrSpace space, XrPosef pose) {
        return nxrSetInputDeviceLocationEXT(session, topLevelPath, inputSourcePath, space, pose.address());
    }

}