/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTDirectModeDisplay {

    public static final int VK_EXT_DIRECT_MODE_DISPLAY_SPEC_VERSION = 1;

    public static final String VK_EXT_DIRECT_MODE_DISPLAY_EXTENSION_NAME = "VK_EXT_direct_mode_display";

    protected EXTDirectModeDisplay() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkReleaseDisplayEXT ] ---

    /** {@code VkResult vkReleaseDisplayEXT(VkPhysicalDevice physicalDevice, VkDisplayKHR display)} */
    @NativeType("VkResult")
    public static int vkReleaseDisplayEXT(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display) {
        long __functionAddress = physicalDevice.getCapabilities().vkReleaseDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(physicalDevice.address(), display, __functionAddress);
    }

}