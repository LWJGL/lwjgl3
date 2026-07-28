/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

public final class IMGSafetyMechanisms {

    public static final int CL_CONTEXT_SAFETY_PROPERTIES_IMG = 0x40D9;

    public static final long
        CL_CONTEXT_WORKGROUP_PROTECTION_IMG            = 1L << 0,
        CL_CONTEXT_ENHANCED_EVENT_EXECUTION_STATUS_IMG = 1L << 1;

    public static final int
        CL_DEVICE_WORKGROUP_PROTECTION_SVM_CAPABILITIES_IMG            = 0x40DA,
        CL_DEVICE_WORKGROUP_PROTECTION_DEVICE_ENQUEUE_CAPABILITIES_IMG = 0x40DB,
        CL_DEVICE_SAFETY_MEM_SIZE_IMG                                  = 0x40DC;

    public static final int
        CL_ECC_RECOVERED_IMG   = 0x40DD,
        CL_PAGE_FAULT_IMG      = -1127,
        CL_SAFETY_FAULT_IMG    = -1128,
        CL_GENERAL_FAULT_IMG   = -1129,
        CL_ECC_UNRECOVERED_IMG = -1130;

    private IMGSafetyMechanisms() {}

}