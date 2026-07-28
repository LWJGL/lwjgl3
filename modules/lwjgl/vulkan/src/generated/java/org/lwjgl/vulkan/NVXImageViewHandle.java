/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class NVXImageViewHandle {

    public static final int VK_NVX_IMAGE_VIEW_HANDLE_SPEC_VERSION = 4;

    public static final String VK_NVX_IMAGE_VIEW_HANDLE_EXTENSION_NAME = "VK_NVX_image_view_handle";

    public static final int
        VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX        = 1000030000,
        VK_STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX = 1000030001;

    protected NVXImageViewHandle() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetImageViewHandleNVX ] ---

    /** {@code uint32_t vkGetImageViewHandleNVX(VkDevice device, VkImageViewHandleInfoNVX const * pInfo)} */
    public static int nvkGetImageViewHandleNVX(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetImageViewHandleNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pInfo, __functionAddress);
    }

    /** {@code uint32_t vkGetImageViewHandleNVX(VkDevice device, VkImageViewHandleInfoNVX const * pInfo)} */
    @NativeType("uint32_t")
    public static int vkGetImageViewHandleNVX(VkDevice device, @NativeType("VkImageViewHandleInfoNVX const *") VkImageViewHandleInfoNVX pInfo) {
        return nvkGetImageViewHandleNVX(device, pInfo.address());
    }

    // --- [ vkGetImageViewHandle64NVX ] ---

    /** {@code uint64_t vkGetImageViewHandle64NVX(VkDevice device, VkImageViewHandleInfoNVX const * pInfo)} */
    public static long nvkGetImageViewHandle64NVX(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetImageViewHandle64NVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(device.address(), pInfo, __functionAddress);
    }

    /** {@code uint64_t vkGetImageViewHandle64NVX(VkDevice device, VkImageViewHandleInfoNVX const * pInfo)} */
    @NativeType("uint64_t")
    public static long vkGetImageViewHandle64NVX(VkDevice device, @NativeType("VkImageViewHandleInfoNVX const *") VkImageViewHandleInfoNVX pInfo) {
        return nvkGetImageViewHandle64NVX(device, pInfo.address());
    }

    // --- [ vkGetImageViewAddressNVX ] ---

    /** {@code VkResult vkGetImageViewAddressNVX(VkDevice device, VkImageView imageView, VkImageViewAddressPropertiesNVX * pProperties)} */
    public static int nvkGetImageViewAddressNVX(VkDevice device, long imageView, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetImageViewAddressNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), imageView, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetImageViewAddressNVX(VkDevice device, VkImageView imageView, VkImageViewAddressPropertiesNVX * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetImageViewAddressNVX(VkDevice device, @NativeType("VkImageView") long imageView, @NativeType("VkImageViewAddressPropertiesNVX *") VkImageViewAddressPropertiesNVX pProperties) {
        return nvkGetImageViewAddressNVX(device, imageView, pProperties.address());
    }

    // --- [ vkGetDeviceCombinedImageSamplerIndexNVX ] ---

    /** {@code uint64_t vkGetDeviceCombinedImageSamplerIndexNVX(VkDevice device, uint64_t imageViewIndex, uint64_t samplerIndex)} */
    @NativeType("uint64_t")
    public static long vkGetDeviceCombinedImageSamplerIndexNVX(VkDevice device, @NativeType("uint64_t") long imageViewIndex, @NativeType("uint64_t") long samplerIndex) {
        long __functionAddress = device.getCapabilities().vkGetDeviceCombinedImageSamplerIndexNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJJ(device.address(), imageViewIndex, samplerIndex, __functionAddress);
    }

}