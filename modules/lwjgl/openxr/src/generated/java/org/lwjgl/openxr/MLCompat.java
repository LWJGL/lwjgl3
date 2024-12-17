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

public class MLCompat {

    public static final int XR_ML_compat_SPEC_VERSION = 1;

    public static final String XR_ML_COMPAT_EXTENSION_NAME = "XR_ML_compat";

    public static final int XR_TYPE_COORDINATE_SPACE_CREATE_INFO_ML = 1000137000;

    protected MLCompat() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpaceFromCoordinateFrameUIDML ] ---

    /** {@code XrResult xrCreateSpaceFromCoordinateFrameUIDML(XrSession session, XrCoordinateSpaceCreateInfoML const * createInfo, XrSpace * space)} */
    public static int nxrCreateSpaceFromCoordinateFrameUIDML(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateSpaceFromCoordinateFrameUIDML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    /** {@code XrResult xrCreateSpaceFromCoordinateFrameUIDML(XrSession session, XrCoordinateSpaceCreateInfoML const * createInfo, XrSpace * space)} */
    @NativeType("XrResult")
    public static int xrCreateSpaceFromCoordinateFrameUIDML(XrSession session, @NativeType("XrCoordinateSpaceCreateInfoML const *") XrCoordinateSpaceCreateInfoML createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateSpaceFromCoordinateFrameUIDML(session, createInfo.address(), memAddress(space));
    }

}