/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRExtendedVersioning {

    public static final int
        CL_VERSION_MAJOR_BITS_KHR  = 10,
        CL_VERSION_MINOR_BITS_KHR  = 10,
        CL_VERSION_PATCH_BITS_KHR  = 12;

    public static final int
        CL_VERSION_MAJOR_MASK_KHR = ((1 << CL_VERSION_MAJOR_BITS_KHR) - 1),
        CL_VERSION_MINOR_MASK_KHR = ((1 << CL_VERSION_MINOR_BITS_KHR) - 1),
        CL_VERSION_PATCH_MASK_KHR = ((1 << CL_VERSION_PATCH_BITS_KHR) - 1);

    public static final int CL_PLATFORM_NUMERIC_VERSION_KHR = 0x906;

    public static final int CL_PLATFORM_EXTENSIONS_WITH_VERSION_KHR = 0x907;

    public static final int CL_DEVICE_NUMERIC_VERSION_KHR = 0x105E;

    public static final int CL_DEVICE_OPENCL_C_NUMERIC_VERSION_KHR = 0x105F;

    public static final int CL_DEVICE_EXTENSIONS_WITH_VERSION_KHR = 0x1060;

    public static final int CL_DEVICE_ILS_WITH_VERSION_KHR = 0x1061;

    public static final int CL_DEVICE_BUILT_IN_KERNELS_WITH_VERSION_KHR = 0x1062;

    protected KHRExtendedVersioning() {
        throw new UnsupportedOperationException();
    }

    // --- [ CL_VERSION_MAJOR_KHR ] ---

    /** {@code uint32_t CL_VERSION_MAJOR_KHR(uint32_t version)} */
    @NativeType("uint32_t")
    public static int CL_VERSION_MAJOR_KHR(@NativeType("uint32_t") int version) {
        return version >> (CL_VERSION_MINOR_BITS_KHR + CL_VERSION_PATCH_BITS_KHR);
    }

    // --- [ CL_VERSION_MINOR_KHR ] ---

    /** {@code uint32_t CL_VERSION_MINOR_KHR(uint32_t version)} */
    @NativeType("uint32_t")
    public static int CL_VERSION_MINOR_KHR(@NativeType("uint32_t") int version) {
        return (version >> CL_VERSION_PATCH_BITS_KHR) & CL_VERSION_MINOR_MASK_KHR;
    }

    // --- [ CL_VERSION_PATCH_KHR ] ---

    /** {@code uint32_t CL_VERSION_PATCH_KHR(uint32_t version)} */
    @NativeType("uint32_t")
    public static int CL_VERSION_PATCH_KHR(@NativeType("uint32_t") int version) {
        return version & CL_VERSION_PATCH_MASK_KHR;
    }

    // --- [ CL_MAKE_VERSION_KHR ] ---

    /** {@code uint32_t CL_MAKE_VERSION_KHR(uint32_t major, uint32_t minor, uint32_t patch)} */
    @NativeType("uint32_t")
    public static int CL_MAKE_VERSION_KHR(@NativeType("uint32_t") int major, @NativeType("uint32_t") int minor, @NativeType("uint32_t") int patch) {
        return ((major & CL_VERSION_MAJOR_MASK_KHR) << (CL_VERSION_MINOR_BITS_KHR + CL_VERSION_PATCH_BITS_KHR)) | ((minor & CL_VERSION_MINOR_MASK_KHR) << CL_VERSION_PATCH_BITS_KHR) | (patch & CL_VERSION_PATCH_MASK_KHR);
    }

}