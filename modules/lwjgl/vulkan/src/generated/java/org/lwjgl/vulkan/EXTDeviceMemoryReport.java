/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

public final class EXTDeviceMemoryReport {

    public static final int VK_EXT_DEVICE_MEMORY_REPORT_SPEC_VERSION = 2;

    public static final String VK_EXT_DEVICE_MEMORY_REPORT_EXTENSION_NAME = "VK_EXT_device_memory_report";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES_EXT = 1000284000,
        VK_STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT       = 1000284001,
        VK_STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT            = 1000284002;

    public static final int
        VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT          = 0,
        VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_FREE_EXT              = 1,
        VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT            = 2,
        VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_UNIMPORT_EXT          = 3,
        VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATION_FAILED_EXT = 4;

    private EXTDeviceMemoryReport() {}

}