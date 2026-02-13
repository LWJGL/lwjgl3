/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val ARM_tensors = "ARMTensors".nativeClassVK("ARM_tensors", type = "device", postfix = "ARM") {
    IntConstant(
        "ARM_TENSORS_SPEC_VERSION".."2"
    )

    StringConstant(
        "ARM_TENSORS_EXTENSION_NAME".."VK_ARM_tensors"
    )

    EnumConstant(
        "STRUCTURE_TYPE_TENSOR_CREATE_INFO_ARM".."1000460000",
        "STRUCTURE_TYPE_TENSOR_VIEW_CREATE_INFO_ARM".."1000460001",
        "STRUCTURE_TYPE_BIND_TENSOR_MEMORY_INFO_ARM".."1000460002",
        "STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_TENSOR_ARM".."1000460003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_PROPERTIES_ARM".."1000460004",
        "STRUCTURE_TYPE_TENSOR_FORMAT_PROPERTIES_ARM".."1000460005",
        "STRUCTURE_TYPE_TENSOR_DESCRIPTION_ARM".."1000460006",
        "STRUCTURE_TYPE_TENSOR_MEMORY_REQUIREMENTS_INFO_ARM".."1000460007",
        "STRUCTURE_TYPE_TENSOR_MEMORY_BARRIER_ARM".."1000460008",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_FEATURES_ARM".."1000460009",
        "STRUCTURE_TYPE_DEVICE_TENSOR_MEMORY_REQUIREMENTS_ARM".."1000460010",
        "STRUCTURE_TYPE_COPY_TENSOR_INFO_ARM".."1000460011",
        "STRUCTURE_TYPE_TENSOR_COPY_ARM".."1000460012",
        "STRUCTURE_TYPE_TENSOR_DEPENDENCY_INFO_ARM".."1000460013",
        "STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO_TENSOR_ARM".."1000460014",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_TENSOR_INFO_ARM".."1000460015",
        "STRUCTURE_TYPE_EXTERNAL_TENSOR_PROPERTIES_ARM".."1000460016",
        "STRUCTURE_TYPE_EXTERNAL_MEMORY_TENSOR_CREATE_INFO_ARM".."1000460017",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_FEATURES_ARM".."1000460018",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_PROPERTIES_ARM".."1000460019",
        "STRUCTURE_TYPE_DESCRIPTOR_GET_TENSOR_INFO_ARM".."1000460020",
        "STRUCTURE_TYPE_TENSOR_CAPTURE_DESCRIPTOR_DATA_INFO_ARM".."1000460021",
        "STRUCTURE_TYPE_TENSOR_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_ARM".."1000460022",
        "STRUCTURE_TYPE_FRAME_BOUNDARY_TENSORS_ARM".."1000460023"
    )

    EnumConstant(
        "OBJECT_TYPE_TENSOR_ARM".."1000460000",
        "OBJECT_TYPE_TENSOR_VIEW_ARM".."1000460001"
    )

    EnumConstant(
        "DESCRIPTOR_TYPE_TENSOR_ARM".."1000460000"
    )

    EnumConstantLong(
        "FORMAT_FEATURE_2_TENSOR_SHADER_BIT_ARM".enum(0x8000000000L),
        "FORMAT_FEATURE_2_TENSOR_IMAGE_ALIASING_BIT_ARM".enum(0x80000000000L)
    )

    EnumConstant(
        "IMAGE_USAGE_TENSOR_ALIASING_BIT_ARM".enum(0x00800000)
    )

    EnumConstant(
        "IMAGE_LAYOUT_TENSOR_ALIASING_ARM".."1000460000"
    )

    EnumConstant(
        "FORMAT_R8_BOOL_ARM".."1000460000",
        "FORMAT_R16_SFLOAT_FPENCODING_BFLOAT16_ARM".."1000460001",
        "FORMAT_R8_SFLOAT_FPENCODING_FLOAT8E4M3_ARM".."1000460002",
        "FORMAT_R8_SFLOAT_FPENCODING_FLOAT8E5M2_ARM".."1000460003"
    )

    EnumConstantLong(
        "TENSOR_CREATE_MUTABLE_FORMAT_BIT_ARM".enum(0x00000001L),
        "TENSOR_CREATE_PROTECTED_BIT_ARM".enum(0x00000002L),
        "TENSOR_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_ARM".enum(0x00000004L)
    )

    EnumConstantLong(
        "TENSOR_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_ARM".enum(0x00000001L)
    )

    EnumConstantLong(
        "TENSOR_USAGE_SHADER_BIT_ARM".enum(0x00000002L),
        "TENSOR_USAGE_TRANSFER_SRC_BIT_ARM".enum(0x00000004L),
        "TENSOR_USAGE_TRANSFER_DST_BIT_ARM".enum(0x00000008L),
        "TENSOR_USAGE_IMAGE_ALIASING_BIT_ARM".enum(0x00000010L)
    )

    EnumConstant(
        "TENSOR_TILING_OPTIMAL_ARM".."0",
        "TENSOR_TILING_LINEAR_ARM".."1"
    )

    VkResult(
        "CreateTensorARM",

        VkDevice("device"),
        VkTensorCreateInfoARM.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkTensorARM.p("pTensor")
    )

    void(
        "DestroyTensorARM",

        VkDevice("device"),
        VkTensorARM("tensor"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "CreateTensorViewARM",

        VkDevice("device"),
        VkTensorViewCreateInfoARM.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkTensorViewARM.p("pView")
    )

    void(
        "DestroyTensorViewARM",

        VkDevice("device"),
        VkTensorViewARM("tensorView"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "GetTensorMemoryRequirementsARM",

        VkDevice("device"),
        VkTensorMemoryRequirementsInfoARM.const.p("pInfo"),
        VkMemoryRequirements2.p("pMemoryRequirements")
    )

    VkResult(
        "BindTensorMemoryARM",

        VkDevice("device"),
        AutoSize("pBindInfos")..uint32_t("bindInfoCount"),
        VkBindTensorMemoryInfoARM.const.p("pBindInfos")
    )

    void(
        "GetDeviceTensorMemoryRequirementsARM",

        VkDevice("device"),
        VkDeviceTensorMemoryRequirementsARM.const.p("pInfo"),
        VkMemoryRequirements2.p("pMemoryRequirements")
    )

    void(
        "CmdCopyTensorARM",

        VkCommandBuffer("commandBuffer"),
        VkCopyTensorInfoARM.const.p("pCopyTensorInfo")
    )

    void(
        "GetPhysicalDeviceExternalTensorPropertiesARM",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceExternalTensorInfoARM.const.p("pExternalTensorInfo"),
        VkExternalTensorPropertiesARM.p("pExternalTensorProperties")
    )

    DependsOn("VK_EXT_descriptor_buffer")..VkResult(
        "GetTensorOpaqueCaptureDescriptorDataARM",

        VkDevice("device"),
        VkTensorCaptureDescriptorDataInfoARM.const.p("pInfo"),
        Check(1)..void.p("pData")
    )

    DependsOn("VK_EXT_descriptor_buffer")..VkResult(
        "GetTensorViewOpaqueCaptureDescriptorDataARM",

        VkDevice("device"),
        VkTensorViewCaptureDescriptorDataInfoARM.const.p("pInfo"),
        Check(1)..void.p("pData")
    )
}