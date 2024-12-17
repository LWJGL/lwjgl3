/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTMetalObjects {

    public static final int VK_EXT_METAL_OBJECTS_SPEC_VERSION = 2;

    public static final String VK_EXT_METAL_OBJECTS_EXTENSION_NAME = "VK_EXT_metal_objects";

    public static final int
        VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT = 1000311000,
        VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT       = 1000311001,
        VK_STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT        = 1000311002,
        VK_STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT = 1000311003,
        VK_STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT        = 1000311004,
        VK_STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT        = 1000311005,
        VK_STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT       = 1000311006,
        VK_STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT       = 1000311007,
        VK_STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT    = 1000311008,
        VK_STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT    = 1000311009,
        VK_STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT  = 1000311010,
        VK_STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT  = 1000311011;

    public static final int
        VK_EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT        = 0x1,
        VK_EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT = 0x2,
        VK_EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT        = 0x4,
        VK_EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT       = 0x8,
        VK_EXPORT_METAL_OBJECT_TYPE_METAL_IOSURFACE_BIT_EXT     = 0x10,
        VK_EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT  = 0x20;

    protected EXTMetalObjects() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkExportMetalObjectsEXT ] ---

    /** {@code void vkExportMetalObjectsEXT(VkDevice device, VkExportMetalObjectsInfoEXT * pMetalObjectsInfo)} */
    public static void nvkExportMetalObjectsEXT(VkDevice device, long pMetalObjectsInfo) {
        long __functionAddress = device.getCapabilities().vkExportMetalObjectsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(device.address(), pMetalObjectsInfo, __functionAddress);
    }

    /** {@code void vkExportMetalObjectsEXT(VkDevice device, VkExportMetalObjectsInfoEXT * pMetalObjectsInfo)} */
    public static void vkExportMetalObjectsEXT(VkDevice device, @NativeType("VkExportMetalObjectsInfoEXT *") VkExportMetalObjectsInfoEXT pMetalObjectsInfo) {
        nvkExportMetalObjectsEXT(device, pMetalObjectsInfo.address());
    }

}