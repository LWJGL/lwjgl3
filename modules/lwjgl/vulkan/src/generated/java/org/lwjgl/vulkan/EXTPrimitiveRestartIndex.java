/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTPrimitiveRestartIndex {

    public static final int VK_EXT_PRIMITIVE_RESTART_INDEX_SPEC_VERSION = 1;

    public static final String VK_EXT_PRIMITIVE_RESTART_INDEX_EXTENSION_NAME = "VK_EXT_primitive_restart_index";

    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVE_RESTART_INDEX_FEATURES_EXT = 1000678000;

    protected EXTPrimitiveRestartIndex() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetPrimitiveRestartIndexEXT ] ---

    /** {@code void vkCmdSetPrimitiveRestartIndexEXT(VkCommandBuffer commandBuffer, uint32_t primitiveRestartIndex)} */
    public static void vkCmdSetPrimitiveRestartIndexEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int primitiveRestartIndex) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPrimitiveRestartIndexEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), primitiveRestartIndex, __functionAddress);
    }

}