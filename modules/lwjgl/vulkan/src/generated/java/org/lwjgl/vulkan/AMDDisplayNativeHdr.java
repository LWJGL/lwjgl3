/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class AMDDisplayNativeHdr {

    public static final int VK_AMD_DISPLAY_NATIVE_HDR_SPEC_VERSION = 1;

    public static final String VK_AMD_DISPLAY_NATIVE_HDR_EXTENSION_NAME = "VK_AMD_display_native_hdr";

    public static final int
        VK_STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD  = 1000213000,
        VK_STRUCTURE_TYPE_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO_AMD = 1000213001;

    public static final int VK_COLOR_SPACE_DISPLAY_NATIVE_AMD = 1000213000;

    protected AMDDisplayNativeHdr() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkSetLocalDimmingAMD ] ---

    /** {@code void vkSetLocalDimmingAMD(VkDevice device, VkSwapchainKHR swapChain, VkBool32 localDimmingEnable)} */
    public static void vkSetLocalDimmingAMD(VkDevice device, @NativeType("VkSwapchainKHR") long swapChain, @NativeType("VkBool32") boolean localDimmingEnable) {
        long __functionAddress = device.getCapabilities().vkSetLocalDimmingAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(device.address(), swapChain, localDimmingEnable ? 1 : 0, __functionAddress);
    }

}