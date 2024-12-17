/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class QCOMTileProperties {

    public static final int VK_QCOM_TILE_PROPERTIES_SPEC_VERSION = 1;

    public static final String VK_QCOM_TILE_PROPERTIES_EXTENSION_NAME = "VK_QCOM_tile_properties";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM = 1000484000,
        VK_STRUCTURE_TYPE_TILE_PROPERTIES_QCOM                          = 1000484001;

    protected QCOMTileProperties() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetFramebufferTilePropertiesQCOM ] ---

    /** {@code VkResult vkGetFramebufferTilePropertiesQCOM(VkDevice device, VkFramebuffer framebuffer, uint32_t * pPropertiesCount, VkTilePropertiesQCOM * pProperties)} */
    public static int nvkGetFramebufferTilePropertiesQCOM(VkDevice device, long framebuffer, long pPropertiesCount, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetFramebufferTilePropertiesQCOM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), framebuffer, pPropertiesCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetFramebufferTilePropertiesQCOM(VkDevice device, VkFramebuffer framebuffer, uint32_t * pPropertiesCount, VkTilePropertiesQCOM * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetFramebufferTilePropertiesQCOM(VkDevice device, @NativeType("VkFramebuffer") long framebuffer, @NativeType("uint32_t *") IntBuffer pPropertiesCount, @NativeType("VkTilePropertiesQCOM *") VkTilePropertiesQCOM.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertiesCount, 1);
            checkSafe(pProperties, pPropertiesCount.get(pPropertiesCount.position()));
        }
        return nvkGetFramebufferTilePropertiesQCOM(device, framebuffer, memAddress(pPropertiesCount), memAddressSafe(pProperties));
    }

    // --- [ vkGetDynamicRenderingTilePropertiesQCOM ] ---

    /** {@code VkResult vkGetDynamicRenderingTilePropertiesQCOM(VkDevice device, VkRenderingInfo const * pRenderingInfo, VkTilePropertiesQCOM * pProperties)} */
    public static int nvkGetDynamicRenderingTilePropertiesQCOM(VkDevice device, long pRenderingInfo, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetDynamicRenderingTilePropertiesQCOM;
        if (CHECKS) {
            check(__functionAddress);
            VkRenderingInfo.validate(pRenderingInfo);
        }
        return callPPPI(device.address(), pRenderingInfo, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetDynamicRenderingTilePropertiesQCOM(VkDevice device, VkRenderingInfo const * pRenderingInfo, VkTilePropertiesQCOM * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetDynamicRenderingTilePropertiesQCOM(VkDevice device, @NativeType("VkRenderingInfo const *") VkRenderingInfo pRenderingInfo, @NativeType("VkTilePropertiesQCOM *") VkTilePropertiesQCOM pProperties) {
        return nvkGetDynamicRenderingTilePropertiesQCOM(device, pRenderingInfo.address(), pProperties.address());
    }

    /** {@code VkResult vkGetFramebufferTilePropertiesQCOM(VkDevice device, VkFramebuffer framebuffer, uint32_t * pPropertiesCount, VkTilePropertiesQCOM * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetFramebufferTilePropertiesQCOM(VkDevice device, @NativeType("VkFramebuffer") long framebuffer, @NativeType("uint32_t *") int[] pPropertiesCount, @NativeType("VkTilePropertiesQCOM *") VkTilePropertiesQCOM.@Nullable Buffer pProperties) {
        long __functionAddress = device.getCapabilities().vkGetFramebufferTilePropertiesQCOM;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertiesCount, 1);
            checkSafe(pProperties, pPropertiesCount[0]);
        }
        return callPJPPI(device.address(), framebuffer, pPropertiesCount, memAddressSafe(pProperties), __functionAddress);
    }

}