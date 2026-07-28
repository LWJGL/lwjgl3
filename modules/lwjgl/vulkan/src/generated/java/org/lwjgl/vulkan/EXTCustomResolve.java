/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTCustomResolve {

    public static final int VK_EXT_CUSTOM_RESOLVE_SPEC_VERSION = 1;

    public static final String VK_EXT_CUSTOM_RESOLVE_EXTENSION_NAME = "VK_EXT_custom_resolve";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_RESOLVE_FEATURES_EXT = 1000628000,
        VK_STRUCTURE_TYPE_BEGIN_CUSTOM_RESOLVE_INFO_EXT               = 1000628001,
        VK_STRUCTURE_TYPE_CUSTOM_RESOLVE_CREATE_INFO_EXT              = 1000628002;

    public static final int
        VK_SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_EXT = 0x4,
        VK_SUBPASS_DESCRIPTION_CUSTOM_RESOLVE_BIT_EXT  = 0x8;

    public static final int
        VK_RENDERING_FRAGMENT_REGION_BIT_EXT = 0x40,
        VK_RENDERING_CUSTOM_RESOLVE_BIT_EXT  = 0x80;

    public static final int VK_RESOLVE_MODE_CUSTOM_BIT_EXT = 0x20;

    protected EXTCustomResolve() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdBeginCustomResolveEXT ] ---

    /** {@code void vkCmdBeginCustomResolveEXT(VkCommandBuffer commandBuffer, VkBeginCustomResolveInfoEXT const * pBeginCustomResolveInfo)} */
    public static void nvkCmdBeginCustomResolveEXT(VkCommandBuffer commandBuffer, long pBeginCustomResolveInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginCustomResolveEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pBeginCustomResolveInfo, __functionAddress);
    }

    /** {@code void vkCmdBeginCustomResolveEXT(VkCommandBuffer commandBuffer, VkBeginCustomResolveInfoEXT const * pBeginCustomResolveInfo)} */
    public static void vkCmdBeginCustomResolveEXT(VkCommandBuffer commandBuffer, @NativeType("VkBeginCustomResolveInfoEXT const *") @Nullable VkBeginCustomResolveInfoEXT pBeginCustomResolveInfo) {
        nvkCmdBeginCustomResolveEXT(commandBuffer, memAddressSafe(pBeginCustomResolveInfo));
    }

}