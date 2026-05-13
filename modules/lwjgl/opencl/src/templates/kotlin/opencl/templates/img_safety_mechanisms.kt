/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val img_safety_mechanisms = "IMGSafetyMechanisms".nativeClassCL("img_safety_mechanisms", IMG) {
    IntConstant(
        "CONTEXT_SAFETY_PROPERTIES_IMG"..0x40D9
    )

    LongConstant(
        "CONTEXT_WORKGROUP_PROTECTION_IMG".."1L << 0",
        "CONTEXT_ENHANCED_EVENT_EXECUTION_STATUS_IMG".."1L << 1",
    )

    IntConstant(
        "DEVICE_WORKGROUP_PROTECTION_SVM_CAPABILITIES_IMG"..0x40DA,
        "DEVICE_WORKGROUP_PROTECTION_DEVICE_ENQUEUE_CAPABILITIES_IMG"..0x40DB,
        "DEVICE_SAFETY_MEM_SIZE_IMG"..0x40DC
    )

    IntConstant(
        "ECC_RECOVERED_IMG"..0x40DD,
        "PAGE_FAULT_IMG".."-1127",
        "SAFETY_FAULT_IMG".."-1128",
        "GENERAL_FAULT_IMG".."-1129",
        "ECC_UNRECOVERED_IMG".."-1130"
    )
}