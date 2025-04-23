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

public class EXTFragmentDensityMapOffset {

    public static final int VK_EXT_FRAGMENT_DENSITY_MAP_OFFSET_SPEC_VERSION = 1;

    public static final String VK_EXT_FRAGMENT_DENSITY_MAP_OFFSET_EXTENSION_NAME = "VK_EXT_fragment_density_map_offset";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_EXT   = 1000425000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_EXT = 1000425001,
        VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_EXT       = 1000425002,
        VK_STRUCTURE_TYPE_RENDERING_END_INFO_EXT                                     = 1000619003;

    public static final int VK_IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_EXT = 0x8000;

    protected EXTFragmentDensityMapOffset() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdEndRendering2EXT ] ---

    /** {@code void vkCmdEndRendering2EXT(VkCommandBuffer commandBuffer, VkRenderingEndInfoEXT const * pRenderingEndInfo)} */
    public static void nvkCmdEndRendering2EXT(VkCommandBuffer commandBuffer, long pRenderingEndInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRendering2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pRenderingEndInfo, __functionAddress);
    }

    /** {@code void vkCmdEndRendering2EXT(VkCommandBuffer commandBuffer, VkRenderingEndInfoEXT const * pRenderingEndInfo)} */
    public static void vkCmdEndRendering2EXT(VkCommandBuffer commandBuffer, @NativeType("VkRenderingEndInfoEXT const *") @Nullable VkRenderingEndInfoEXT pRenderingEndInfo) {
        nvkCmdEndRendering2EXT(commandBuffer, memAddressSafe(pRenderingEndInfo));
    }

}