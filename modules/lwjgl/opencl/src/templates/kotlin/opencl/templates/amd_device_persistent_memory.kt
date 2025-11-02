/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val amd_device_persistent_memory = "AMDDevicePersistentMemory".nativeClassCL("amd_device_persistent_memory", AMD) {
    LongConstant(
        "MEM_USE_PERSISTENT_MEM_AMD".."1L << 6"
    )

}