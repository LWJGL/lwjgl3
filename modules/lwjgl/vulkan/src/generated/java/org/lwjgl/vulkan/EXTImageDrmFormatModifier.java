/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTImageDrmFormatModifier {

    public static final int VK_EXT_IMAGE_DRM_FORMAT_MODIFIER_SPEC_VERSION = 2;

    public static final String VK_EXT_IMAGE_DRM_FORMAT_MODIFIER_EXTENSION_NAME = "VK_EXT_image_drm_format_modifier";

    public static final int VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT = -1000158000;

    public static final int
        VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT            = 1000158000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT = 1000158002,
        VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT     = 1000158003,
        VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT = 1000158004,
        VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT           = 1000158005,
        VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT          = 1000158006;

    public static final int VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT = 1000158000;

    public static final int
        VK_IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT = 0x80,
        VK_IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT = 0x100,
        VK_IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT = 0x200,
        VK_IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT = 0x400;

    protected EXTImageDrmFormatModifier() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetImageDrmFormatModifierPropertiesEXT ] ---

    /** {@code VkResult vkGetImageDrmFormatModifierPropertiesEXT(VkDevice device, VkImage image, VkImageDrmFormatModifierPropertiesEXT * pProperties)} */
    public static int nvkGetImageDrmFormatModifierPropertiesEXT(VkDevice device, long image, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetImageDrmFormatModifierPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), image, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetImageDrmFormatModifierPropertiesEXT(VkDevice device, VkImage image, VkImageDrmFormatModifierPropertiesEXT * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetImageDrmFormatModifierPropertiesEXT(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkImageDrmFormatModifierPropertiesEXT *") VkImageDrmFormatModifierPropertiesEXT pProperties) {
        return nvkGetImageDrmFormatModifierPropertiesEXT(device, image, pProperties.address());
    }

}