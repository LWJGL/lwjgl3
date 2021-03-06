/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The FB_color_space extension. */
public class FBColorSpace {

    /** The extension specification version. */
    public static final int XR_FB_color_space_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_COLOR_SPACE_EXTENSION_NAME = "XR_FB_color_space";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_SYSTEM_COLOR_SPACE_PROPERTIES_FB = 1000108000;

    /** Extends {@code XrResult}. */
    public static final int XR_ERROR_COLOR_SPACE_UNSUPPORTED_FB = -1000108000;

    /**
     * XrColorSpaceFB
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_COLOR_SPACE_UNMANAGED_FB COLOR_SPACE_UNMANAGED_FB}</li>
     * <li>{@link #XR_COLOR_SPACE_REC2020_FB COLOR_SPACE_REC2020_FB}</li>
     * <li>{@link #XR_COLOR_SPACE_REC709_FB COLOR_SPACE_REC709_FB}</li>
     * <li>{@link #XR_COLOR_SPACE_RIFT_CV1_FB COLOR_SPACE_RIFT_CV1_FB}</li>
     * <li>{@link #XR_COLOR_SPACE_RIFT_S_FB COLOR_SPACE_RIFT_S_FB}</li>
     * <li>{@link #XR_COLOR_SPACE_QUEST_FB COLOR_SPACE_QUEST_FB}</li>
     * <li>{@link #XR_COLOR_SPACE_P3_FB COLOR_SPACE_P3_FB}</li>
     * <li>{@link #XR_COLOR_SPACE_ADOBE_RGB_FB COLOR_SPACE_ADOBE_RGB_FB}</li>
     * </ul>
     */
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

    public static int nxrEnumerateColorSpacesFB(XrSession session, int colorSpaceCapacityInput, long colorSpaceCountOutput, long colorSpaces) {
        long __functionAddress = session.getCapabilities().xrEnumerateColorSpacesFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), colorSpaceCapacityInput, colorSpaceCountOutput, colorSpaces, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrEnumerateColorSpacesFB(XrSession session, @NativeType("uint32_t *") IntBuffer colorSpaceCountOutput, @Nullable @NativeType("XrColorSpaceFB *") IntBuffer colorSpaces) {
        if (CHECKS) {
            check(colorSpaceCountOutput, 1);
        }
        return nxrEnumerateColorSpacesFB(session, remainingSafe(colorSpaces), memAddress(colorSpaceCountOutput), memAddressSafe(colorSpaces));
    }

    // --- [ xrSetColorSpaceFB ] ---

    @NativeType("XrResult")
    public static int xrSetColorSpaceFB(XrSession session, @NativeType("XrColorSpaceFB const") int colorspace) {
        long __functionAddress = session.getCapabilities().xrSetColorSpaceFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), colorspace, __functionAddress);
    }

    /** Array version of: {@link #xrEnumerateColorSpacesFB EnumerateColorSpacesFB} */
    @NativeType("XrResult")
    public static int xrEnumerateColorSpacesFB(XrSession session, @NativeType("uint32_t *") int[] colorSpaceCountOutput, @Nullable @NativeType("XrColorSpaceFB *") int[] colorSpaces) {
        long __functionAddress = session.getCapabilities().xrEnumerateColorSpacesFB;
        if (CHECKS) {
            check(__functionAddress);
            check(colorSpaceCountOutput, 1);
        }
        return callPPPI(session.address(), lengthSafe(colorSpaces), colorSpaceCountOutput, colorSpaces, __functionAddress);
    }

}