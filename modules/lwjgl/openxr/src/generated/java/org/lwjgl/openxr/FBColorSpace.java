/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class FBColorSpace {

    public static final int XR_FB_color_space_SPEC_VERSION = 3;

    public static final String XR_FB_COLOR_SPACE_EXTENSION_NAME = "XR_FB_color_space";

    public static final int XR_TYPE_SYSTEM_COLOR_SPACE_PROPERTIES_FB = 1000108000;

    public static final int XR_ERROR_COLOR_SPACE_UNSUPPORTED_FB = -1000108000;

    public static final int
        XR_COLOR_SPACE_UNMANAGED_FB = 0,
        XR_COLOR_SPACE_REC2020_FB   = 1,
        XR_COLOR_SPACE_REC709_FB    = 2,
        XR_COLOR_SPACE_RIFT_CV1_FB  = 3,
        XR_COLOR_SPACE_RIFT_S_FB    = 4,
        XR_COLOR_SPACE_QUEST_FB     = 5,
        XR_COLOR_SPACE_P3_FB        = 6,
        XR_COLOR_SPACE_ADOBE_RGB_FB = 7;

    protected FBColorSpace() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateColorSpacesFB ] ---

    /** {@code XrResult xrEnumerateColorSpacesFB(XrSession session, uint32_t colorSpaceCapacityInput, uint32_t * colorSpaceCountOutput, XrColorSpaceFB * colorSpaces)} */
    public static int nxrEnumerateColorSpacesFB(XrSession session, int colorSpaceCapacityInput, long colorSpaceCountOutput, long colorSpaces) {
        long __functionAddress = session.getCapabilities().xrEnumerateColorSpacesFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), colorSpaceCapacityInput, colorSpaceCountOutput, colorSpaces, __functionAddress);
    }

    /** {@code XrResult xrEnumerateColorSpacesFB(XrSession session, uint32_t colorSpaceCapacityInput, uint32_t * colorSpaceCountOutput, XrColorSpaceFB * colorSpaces)} */
    @NativeType("XrResult")
    public static int xrEnumerateColorSpacesFB(XrSession session, @NativeType("uint32_t *") IntBuffer colorSpaceCountOutput, @NativeType("XrColorSpaceFB *") @Nullable IntBuffer colorSpaces) {
        if (CHECKS) {
            check(colorSpaceCountOutput, 1);
        }
        return nxrEnumerateColorSpacesFB(session, remainingSafe(colorSpaces), memAddress(colorSpaceCountOutput), memAddressSafe(colorSpaces));
    }

    // --- [ xrSetColorSpaceFB ] ---

    /** {@code XrResult xrSetColorSpaceFB(XrSession session, XrColorSpaceFB colorSpace)} */
    @NativeType("XrResult")
    public static int xrSetColorSpaceFB(XrSession session, @NativeType("XrColorSpaceFB") int colorSpace) {
        long __functionAddress = session.getCapabilities().xrSetColorSpaceFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), colorSpace, __functionAddress);
    }

}