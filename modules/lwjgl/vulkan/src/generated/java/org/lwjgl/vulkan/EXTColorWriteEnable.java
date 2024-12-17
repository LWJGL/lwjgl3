/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTColorWriteEnable {

    public static final int VK_EXT_COLOR_WRITE_ENABLE_SPEC_VERSION = 1;

    public static final String VK_EXT_COLOR_WRITE_ENABLE_EXTENSION_NAME = "VK_EXT_color_write_enable";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT = 1000381000,
        VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT            = 1000381001;

    public static final int VK_DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT = 1000381000;

    protected EXTColorWriteEnable() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetColorWriteEnableEXT ] ---

    /** {@code void vkCmdSetColorWriteEnableEXT(VkCommandBuffer commandBuffer, uint32_t attachmentCount, VkBool32 const * pColorWriteEnables)} */
    public static void nvkCmdSetColorWriteEnableEXT(VkCommandBuffer commandBuffer, int attachmentCount, long pColorWriteEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorWriteEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), attachmentCount, pColorWriteEnables, __functionAddress);
    }

    /** {@code void vkCmdSetColorWriteEnableEXT(VkCommandBuffer commandBuffer, uint32_t attachmentCount, VkBool32 const * pColorWriteEnables)} */
    public static void vkCmdSetColorWriteEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32 const *") IntBuffer pColorWriteEnables) {
        nvkCmdSetColorWriteEnableEXT(commandBuffer, pColorWriteEnables.remaining(), memAddress(pColorWriteEnables));
    }

    /** {@code void vkCmdSetColorWriteEnableEXT(VkCommandBuffer commandBuffer, uint32_t attachmentCount, VkBool32 const * pColorWriteEnables)} */
    public static void vkCmdSetColorWriteEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32 const *") int[] pColorWriteEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorWriteEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pColorWriteEnables.length, pColorWriteEnables, __functionAddress);
    }

}