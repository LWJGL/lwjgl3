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

public class METAPassthroughColorLut {

    public static final int XR_META_passthrough_color_lut_SPEC_VERSION = 1;

    public static final String XR_META_PASSTHROUGH_COLOR_LUT_EXTENSION_NAME = "XR_META_passthrough_color_lut";

    public static final int
        XR_TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META = 1000266000,
        XR_TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META       = 1000266001,
        XR_TYPE_PASSTHROUGH_COLOR_LUT_UPDATE_INFO_META       = 1000266002,
        XR_TYPE_PASSTHROUGH_COLOR_MAP_LUT_META               = 1000266100,
        XR_TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META  = 1000266101;

    public static final int XR_OBJECT_TYPE_PASSTHROUGH_COLOR_LUT_META = 1000266000;

    public static final int XR_ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META = -1000266000;

    public static final int
        XR_PASSTHROUGH_COLOR_LUT_CHANNELS_RGB_META  = 1,
        XR_PASSTHROUGH_COLOR_LUT_CHANNELS_RGBA_META = 2;

    protected METAPassthroughColorLut() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreatePassthroughColorLutMETA ] ---

    /** {@code XrResult xrCreatePassthroughColorLutMETA(XrPassthroughFB passthrough, XrPassthroughColorLutCreateInfoMETA const * createInfo, XrPassthroughColorLutMETA * colorLut)} */
    public static int nxrCreatePassthroughColorLutMETA(XrPassthroughFB passthrough, long createInfo, long colorLut) {
        long __functionAddress = passthrough.getCapabilities().xrCreatePassthroughColorLutMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrPassthroughColorLutCreateInfoMETA.validate(createInfo);
        }
        return callPPPI(passthrough.address(), createInfo, colorLut, __functionAddress);
    }

    /** {@code XrResult xrCreatePassthroughColorLutMETA(XrPassthroughFB passthrough, XrPassthroughColorLutCreateInfoMETA const * createInfo, XrPassthroughColorLutMETA * colorLut)} */
    @NativeType("XrResult")
    public static int xrCreatePassthroughColorLutMETA(XrPassthroughFB passthrough, @NativeType("XrPassthroughColorLutCreateInfoMETA const *") XrPassthroughColorLutCreateInfoMETA createInfo, @NativeType("XrPassthroughColorLutMETA *") PointerBuffer colorLut) {
        if (CHECKS) {
            check(colorLut, 1);
        }
        return nxrCreatePassthroughColorLutMETA(passthrough, createInfo.address(), memAddress(colorLut));
    }

    // --- [ xrDestroyPassthroughColorLutMETA ] ---

    /** {@code XrResult xrDestroyPassthroughColorLutMETA(XrPassthroughColorLutMETA colorLut)} */
    @NativeType("XrResult")
    public static int xrDestroyPassthroughColorLutMETA(XrPassthroughColorLutMETA colorLut) {
        long __functionAddress = colorLut.getCapabilities().xrDestroyPassthroughColorLutMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(colorLut.address(), __functionAddress);
    }

    // --- [ xrUpdatePassthroughColorLutMETA ] ---

    /** {@code XrResult xrUpdatePassthroughColorLutMETA(XrPassthroughColorLutMETA colorLut, XrPassthroughColorLutUpdateInfoMETA const * updateInfo)} */
    public static int nxrUpdatePassthroughColorLutMETA(XrPassthroughColorLutMETA colorLut, long updateInfo) {
        long __functionAddress = colorLut.getCapabilities().xrUpdatePassthroughColorLutMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrPassthroughColorLutUpdateInfoMETA.validate(updateInfo);
        }
        return callPPI(colorLut.address(), updateInfo, __functionAddress);
    }

    /** {@code XrResult xrUpdatePassthroughColorLutMETA(XrPassthroughColorLutMETA colorLut, XrPassthroughColorLutUpdateInfoMETA const * updateInfo)} */
    @NativeType("XrResult")
    public static int xrUpdatePassthroughColorLutMETA(XrPassthroughColorLutMETA colorLut, @NativeType("XrPassthroughColorLutUpdateInfoMETA const *") XrPassthroughColorLutUpdateInfoMETA updateInfo) {
        return nxrUpdatePassthroughColorLutMETA(colorLut, updateInfo.address());
    }

}