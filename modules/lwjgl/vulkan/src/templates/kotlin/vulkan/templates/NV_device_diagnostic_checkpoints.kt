/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_device_diagnostic_checkpoints = "NVDeviceDiagnosticCheckpoints".nativeClassVK("NV_device_diagnostic_checkpoints", type = "device", postfix = "NV") {
    IntConstant(
        "NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_SPEC_VERSION".."2"
    )

    StringConstant(
        "NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_EXTENSION_NAME".."VK_NV_device_diagnostic_checkpoints"
    )

    EnumConstant(
        "STRUCTURE_TYPE_CHECKPOINT_DATA_NV".."1000206000",
        "STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV".."1000206001",
        "STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2_NV".."1000314008",
        "STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV".."1000314009"
    )

    void(
        "CmdSetCheckpointNV",

        VkCommandBuffer("commandBuffer"),
        nullable..opaque_const_p("pCheckpointMarker")
    )

    void(
        "GetQueueCheckpointDataNV",

        VkQueue("queue"),
        AutoSize("pCheckpointData")..Check(1)..uint32_t.p("pCheckpointDataCount"),
        nullable..VkCheckpointDataNV.p("pCheckpointData")
    )

    DependsOn("""ext.contains("Vulkan13") || ext.contains("VK_KHR_synchronization2")""")..void(
        "GetQueueCheckpointData2NV",

        VkQueue("queue"),
        AutoSize("pCheckpointData")..Check(1)..uint32_t.p("pCheckpointDataCount"),
        nullable..VkCheckpointData2NV.p("pCheckpointData")
    )
}