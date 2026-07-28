/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class QCOMQueuePerfHint {

    public static final int VK_QCOM_QUEUE_PERF_HINT_SPEC_VERSION = 1;

    public static final String VK_QCOM_QUEUE_PERF_HINT_EXTENSION_NAME = "VK_QCOM_queue_perf_hint";

    public static final int
        VK_STRUCTURE_TYPE_PERF_HINT_INFO_QCOM                             = 1000302000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_PERF_HINT_FEATURES_QCOM   = 1000302001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_PERF_HINT_PROPERTIES_QCOM = 1000302002;

    public static final int
        VK_PERF_HINT_TYPE_DEFAULT_QCOM          = 0,
        VK_PERF_HINT_TYPE_FREQUENCY_MIN_QCOM    = 1,
        VK_PERF_HINT_TYPE_FREQUENCY_MAX_QCOM    = 2,
        VK_PERF_HINT_TYPE_FREQUENCY_SCALED_QCOM = 3;

    protected QCOMQueuePerfHint() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkQueueSetPerfHintQCOM ] ---

    /** {@code VkResult vkQueueSetPerfHintQCOM(VkQueue queue, VkPerfHintInfoQCOM const * pPerfHintInfo)} */
    public static int nvkQueueSetPerfHintQCOM(VkQueue queue, long pPerfHintInfo) {
        long __functionAddress = queue.getCapabilities().vkQueueSetPerfHintQCOM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(queue.address(), pPerfHintInfo, __functionAddress);
    }

    /** {@code VkResult vkQueueSetPerfHintQCOM(VkQueue queue, VkPerfHintInfoQCOM const * pPerfHintInfo)} */
    @NativeType("VkResult")
    public static int vkQueueSetPerfHintQCOM(VkQueue queue, @NativeType("VkPerfHintInfoQCOM const *") VkPerfHintInfoQCOM pPerfHintInfo) {
        return nvkQueueSetPerfHintQCOM(queue, pPerfHintInfo.address());
    }

}