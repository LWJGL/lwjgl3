/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class AMDAntiLag {

    public static final int VK_AMD_ANTI_LAG_SPEC_VERSION = 1;

    public static final String VK_AMD_ANTI_LAG_EXTENSION_NAME = "VK_AMD_anti_lag";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD = 1000476000,
        VK_STRUCTURE_TYPE_ANTI_LAG_DATA_AMD                     = 1000476001,
        VK_STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD        = 1000476002;

    public static final int
        VK_ANTI_LAG_MODE_DRIVER_CONTROL_AMD = 0,
        VK_ANTI_LAG_MODE_ON_AMD             = 1,
        VK_ANTI_LAG_MODE_OFF_AMD            = 2;

    public static final int
        VK_ANTI_LAG_STAGE_INPUT_AMD   = 0,
        VK_ANTI_LAG_STAGE_PRESENT_AMD = 1;

    protected AMDAntiLag() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkAntiLagUpdateAMD ] ---

    /** {@code void vkAntiLagUpdateAMD(VkDevice device, VkAntiLagDataAMD const * pData)} */
    public static void nvkAntiLagUpdateAMD(VkDevice device, long pData) {
        long __functionAddress = device.getCapabilities().vkAntiLagUpdateAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(device.address(), pData, __functionAddress);
    }

    /** {@code void vkAntiLagUpdateAMD(VkDevice device, VkAntiLagDataAMD const * pData)} */
    public static void vkAntiLagUpdateAMD(VkDevice device, @NativeType("VkAntiLagDataAMD const *") VkAntiLagDataAMD pData) {
        nvkAntiLagUpdateAMD(device, pData.address());
    }

}