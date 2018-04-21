/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/** Native bindings to the <strong>amd_offline_devices</strong> extension. */
public final class AMDOfflineDevices {

    /**
     * To generate binary images offline, it is necessary to access the compiler for every device that the runtime supports, even if the device is currently
     * not installed on the system. When, during context creation, {@link #CL_CONTEXT_OFFLINE_DEVICES_AMD CONTEXT_OFFLINE_DEVICES_AMD} is passed in the context properties, all supported
     * devices, whether online or offline, are reported and can be used to create OpenCL binary images.
     */
    public static final int CL_CONTEXT_OFFLINE_DEVICES_AMD = 0x403F;

    private AMDOfflineDevices() {}

}