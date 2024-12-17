/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val amd_offline_devices = "AMDOfflineDevices".nativeClassCL("amd_offline_devices", AMD) {

    IntConstant(
        "CONTEXT_OFFLINE_DEVICES_AMD"..0x403F
    )

}