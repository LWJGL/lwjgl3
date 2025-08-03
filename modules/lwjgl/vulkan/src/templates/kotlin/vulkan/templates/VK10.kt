/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val VK10 = "VK10".nativeClass(Module.VULKAN, "VK10", prefix = "VK", binding = VK_BINDING_INSTANCE) {
    
    EnumConstant(
        "SUCCESS".."0",
        "NOT_READY".."1",
        "TIMEOUT".."2",
        "EVENT_SET".."3",
        "EVENT_RESET".."4",
        "INCOMPLETE".."5",
        "ERROR_OUT_OF_HOST_MEMORY".."-1",
        "ERROR_OUT_OF_DEVICE_MEMORY".."-2",
        "ERROR_INITIALIZATION_FAILED".."-3",
        "ERROR_DEVICE_LOST".."-4",
        "ERROR_MEMORY_MAP_FAILED".."-5",
        "ERROR_LAYER_NOT_PRESENT".."-6",
        "ERROR_EXTENSION_NOT_PRESENT".."-7",
        "ERROR_FEATURE_NOT_PRESENT".."-8",
        "ERROR_INCOMPATIBLE_DRIVER".."-9",
        "ERROR_TOO_MANY_OBJECTS".."-10",
        "ERROR_FORMAT_NOT_SUPPORTED".."-11",
        "ERROR_FRAGMENTED_POOL".."-12",
        "ERROR_UNKNOWN".."-13",
        "ERROR_VALIDATION_FAILED".."-1000011001"
    )

    EnumConstant(
        "STRUCTURE_TYPE_APPLICATION_INFO".."0",
        "STRUCTURE_TYPE_INSTANCE_CREATE_INFO".."1",
        "STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO".."2",
        "STRUCTURE_TYPE_DEVICE_CREATE_INFO".."3",
        "STRUCTURE_TYPE_SUBMIT_INFO".."4",
        "STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO".."5",
        "STRUCTURE_TYPE_MAPPED_MEMORY_RANGE".."6",
        "STRUCTURE_TYPE_BIND_SPARSE_INFO".."7",
        "STRUCTURE_TYPE_FENCE_CREATE_INFO".."8",
        "STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO".."9",
        "STRUCTURE_TYPE_EVENT_CREATE_INFO".."10",
        "STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO".."11",
        "STRUCTURE_TYPE_BUFFER_CREATE_INFO".."12",
        "STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO".."13",
        "STRUCTURE_TYPE_IMAGE_CREATE_INFO".."14",
        "STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO".."15",
        "STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO".."16",
        "STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO".."17",
        "STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO".."18",
        "STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO".."19",
        "STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO".."20",
        "STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO".."21",
        "STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO".."22",
        "STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO".."23",
        "STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO".."24",
        "STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO".."25",
        "STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO".."26",
        "STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO".."27",
        "STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO".."28",
        "STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO".."29",
        "STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO".."30",
        "STRUCTURE_TYPE_SAMPLER_CREATE_INFO".."31",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO".."32",
        "STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO".."33",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO".."34",
        "STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET".."35",
        "STRUCTURE_TYPE_COPY_DESCRIPTOR_SET".."36",
        "STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO".."37",
        "STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO".."38",
        "STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO".."39",
        "STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO".."40",
        "STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO".."41",
        "STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO".."42",
        "STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO".."43",
        "STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER".."44",
        "STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER".."45",
        "STRUCTURE_TYPE_MEMORY_BARRIER".."46",
        "STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO".."47",
        "STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO".."48"
    )

    EnumConstant(
        "PIPELINE_CACHE_HEADER_VERSION_ONE".."1"
    )

    EnumConstant(
        "ACCESS_INDIRECT_COMMAND_READ_BIT".enum(0x00000001),
        "ACCESS_INDEX_READ_BIT".enum(0x00000002),
        "ACCESS_VERTEX_ATTRIBUTE_READ_BIT".enum(0x00000004),
        "ACCESS_UNIFORM_READ_BIT".enum(0x00000008),
        "ACCESS_INPUT_ATTACHMENT_READ_BIT".enum(0x00000010),
        "ACCESS_SHADER_READ_BIT".enum(0x00000020),
        "ACCESS_SHADER_WRITE_BIT".enum(0x00000040),
        "ACCESS_COLOR_ATTACHMENT_READ_BIT".enum(0x00000080),
        "ACCESS_COLOR_ATTACHMENT_WRITE_BIT".enum(0x00000100),
        "ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT".enum(0x00000200),
        "ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT".enum(0x00000400),
        "ACCESS_TRANSFER_READ_BIT".enum(0x00000800),
        "ACCESS_TRANSFER_WRITE_BIT".enum(0x00001000),
        "ACCESS_HOST_READ_BIT".enum(0x00002000),
        "ACCESS_HOST_WRITE_BIT".enum(0x00004000),
        "ACCESS_MEMORY_READ_BIT".enum(0x00008000),
        "ACCESS_MEMORY_WRITE_BIT".enum(0x00010000)
    )

    EnumConstant(
        "IMAGE_LAYOUT_UNDEFINED".."0",
        "IMAGE_LAYOUT_GENERAL".."1",
        "IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL".."2",
        "IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL".."3",
        "IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL".."4",
        "IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL".."5",
        "IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL".."6",
        "IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL".."7",
        "IMAGE_LAYOUT_PREINITIALIZED".."8"
    )

    EnumConstant(
        "IMAGE_ASPECT_COLOR_BIT".enum(0x00000001),
        "IMAGE_ASPECT_DEPTH_BIT".enum(0x00000002),
        "IMAGE_ASPECT_STENCIL_BIT".enum(0x00000004),
        "IMAGE_ASPECT_METADATA_BIT".enum(0x00000008)
    )

    EnumConstant(
        "OBJECT_TYPE_UNKNOWN".."0",
        "OBJECT_TYPE_INSTANCE".."1",
        "OBJECT_TYPE_PHYSICAL_DEVICE".."2",
        "OBJECT_TYPE_DEVICE".."3",
        "OBJECT_TYPE_QUEUE".."4",
        "OBJECT_TYPE_SEMAPHORE".."5",
        "OBJECT_TYPE_COMMAND_BUFFER".."6",
        "OBJECT_TYPE_FENCE".."7",
        "OBJECT_TYPE_DEVICE_MEMORY".."8",
        "OBJECT_TYPE_BUFFER".."9",
        "OBJECT_TYPE_IMAGE".."10",
        "OBJECT_TYPE_EVENT".."11",
        "OBJECT_TYPE_QUERY_POOL".."12",
        "OBJECT_TYPE_BUFFER_VIEW".."13",
        "OBJECT_TYPE_IMAGE_VIEW".."14",
        "OBJECT_TYPE_SHADER_MODULE".."15",
        "OBJECT_TYPE_PIPELINE_CACHE".."16",
        "OBJECT_TYPE_PIPELINE_LAYOUT".."17",
        "OBJECT_TYPE_RENDER_PASS".."18",
        "OBJECT_TYPE_PIPELINE".."19",
        "OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT".."20",
        "OBJECT_TYPE_SAMPLER".."21",
        "OBJECT_TYPE_DESCRIPTOR_POOL".."22",
        "OBJECT_TYPE_DESCRIPTOR_SET".."23",
        "OBJECT_TYPE_FRAMEBUFFER".."24",
        "OBJECT_TYPE_COMMAND_POOL".."25"
    )

    EnumConstant(
        "VENDOR_ID_KHRONOS".."0x10000",
        "VENDOR_ID_VIV".."0x10001",
        "VENDOR_ID_VSI".."0x10002",
        "VENDOR_ID_KAZAN".."0x10003",
        "VENDOR_ID_CODEPLAY".."0x10004",
        "VENDOR_ID_MESA".."0x10005",
        "VENDOR_ID_POCL".."0x10006",
        "VENDOR_ID_MOBILEYE".."0x10007"
    )

    EnumConstant(
        "SYSTEM_ALLOCATION_SCOPE_COMMAND".."0",
        "SYSTEM_ALLOCATION_SCOPE_OBJECT".."1",
        "SYSTEM_ALLOCATION_SCOPE_CACHE".."2",
        "SYSTEM_ALLOCATION_SCOPE_DEVICE".."3",
        "SYSTEM_ALLOCATION_SCOPE_INSTANCE".."4"
    )

    EnumConstant(
        "INTERNAL_ALLOCATION_TYPE_EXECUTABLE".."0"
    )

    EnumConstant(
        "FORMAT_UNDEFINED".."0",
        "FORMAT_R4G4_UNORM_PACK8".."1",
        "FORMAT_R4G4B4A4_UNORM_PACK16".."2",
        "FORMAT_B4G4R4A4_UNORM_PACK16".."3",
        "FORMAT_R5G6B5_UNORM_PACK16".."4",
        "FORMAT_B5G6R5_UNORM_PACK16".."5",
        "FORMAT_R5G5B5A1_UNORM_PACK16".."6",
        "FORMAT_B5G5R5A1_UNORM_PACK16".."7",
        "FORMAT_A1R5G5B5_UNORM_PACK16".."8",
        "FORMAT_R8_UNORM".."9",
        "FORMAT_R8_SNORM".."10",
        "FORMAT_R8_USCALED".."11",
        "FORMAT_R8_SSCALED".."12",
        "FORMAT_R8_UINT".."13",
        "FORMAT_R8_SINT".."14",
        "FORMAT_R8_SRGB".."15",
        "FORMAT_R8G8_UNORM".."16",
        "FORMAT_R8G8_SNORM".."17",
        "FORMAT_R8G8_USCALED".."18",
        "FORMAT_R8G8_SSCALED".."19",
        "FORMAT_R8G8_UINT".."20",
        "FORMAT_R8G8_SINT".."21",
        "FORMAT_R8G8_SRGB".."22",
        "FORMAT_R8G8B8_UNORM".."23",
        "FORMAT_R8G8B8_SNORM".."24",
        "FORMAT_R8G8B8_USCALED".."25",
        "FORMAT_R8G8B8_SSCALED".."26",
        "FORMAT_R8G8B8_UINT".."27",
        "FORMAT_R8G8B8_SINT".."28",
        "FORMAT_R8G8B8_SRGB".."29",
        "FORMAT_B8G8R8_UNORM".."30",
        "FORMAT_B8G8R8_SNORM".."31",
        "FORMAT_B8G8R8_USCALED".."32",
        "FORMAT_B8G8R8_SSCALED".."33",
        "FORMAT_B8G8R8_UINT".."34",
        "FORMAT_B8G8R8_SINT".."35",
        "FORMAT_B8G8R8_SRGB".."36",
        "FORMAT_R8G8B8A8_UNORM".."37",
        "FORMAT_R8G8B8A8_SNORM".."38",
        "FORMAT_R8G8B8A8_USCALED".."39",
        "FORMAT_R8G8B8A8_SSCALED".."40",
        "FORMAT_R8G8B8A8_UINT".."41",
        "FORMAT_R8G8B8A8_SINT".."42",
        "FORMAT_R8G8B8A8_SRGB".."43",
        "FORMAT_B8G8R8A8_UNORM".."44",
        "FORMAT_B8G8R8A8_SNORM".."45",
        "FORMAT_B8G8R8A8_USCALED".."46",
        "FORMAT_B8G8R8A8_SSCALED".."47",
        "FORMAT_B8G8R8A8_UINT".."48",
        "FORMAT_B8G8R8A8_SINT".."49",
        "FORMAT_B8G8R8A8_SRGB".."50",
        "FORMAT_A8B8G8R8_UNORM_PACK32".."51",
        "FORMAT_A8B8G8R8_SNORM_PACK32".."52",
        "FORMAT_A8B8G8R8_USCALED_PACK32".."53",
        "FORMAT_A8B8G8R8_SSCALED_PACK32".."54",
        "FORMAT_A8B8G8R8_UINT_PACK32".."55",
        "FORMAT_A8B8G8R8_SINT_PACK32".."56",
        "FORMAT_A8B8G8R8_SRGB_PACK32".."57",
        "FORMAT_A2R10G10B10_UNORM_PACK32".."58",
        "FORMAT_A2R10G10B10_SNORM_PACK32".."59",
        "FORMAT_A2R10G10B10_USCALED_PACK32".."60",
        "FORMAT_A2R10G10B10_SSCALED_PACK32".."61",
        "FORMAT_A2R10G10B10_UINT_PACK32".."62",
        "FORMAT_A2R10G10B10_SINT_PACK32".."63",
        "FORMAT_A2B10G10R10_UNORM_PACK32".."64",
        "FORMAT_A2B10G10R10_SNORM_PACK32".."65",
        "FORMAT_A2B10G10R10_USCALED_PACK32".."66",
        "FORMAT_A2B10G10R10_SSCALED_PACK32".."67",
        "FORMAT_A2B10G10R10_UINT_PACK32".."68",
        "FORMAT_A2B10G10R10_SINT_PACK32".."69",
        "FORMAT_R16_UNORM".."70",
        "FORMAT_R16_SNORM".."71",
        "FORMAT_R16_USCALED".."72",
        "FORMAT_R16_SSCALED".."73",
        "FORMAT_R16_UINT".."74",
        "FORMAT_R16_SINT".."75",
        "FORMAT_R16_SFLOAT".."76",
        "FORMAT_R16G16_UNORM".."77",
        "FORMAT_R16G16_SNORM".."78",
        "FORMAT_R16G16_USCALED".."79",
        "FORMAT_R16G16_SSCALED".."80",
        "FORMAT_R16G16_UINT".."81",
        "FORMAT_R16G16_SINT".."82",
        "FORMAT_R16G16_SFLOAT".."83",
        "FORMAT_R16G16B16_UNORM".."84",
        "FORMAT_R16G16B16_SNORM".."85",
        "FORMAT_R16G16B16_USCALED".."86",
        "FORMAT_R16G16B16_SSCALED".."87",
        "FORMAT_R16G16B16_UINT".."88",
        "FORMAT_R16G16B16_SINT".."89",
        "FORMAT_R16G16B16_SFLOAT".."90",
        "FORMAT_R16G16B16A16_UNORM".."91",
        "FORMAT_R16G16B16A16_SNORM".."92",
        "FORMAT_R16G16B16A16_USCALED".."93",
        "FORMAT_R16G16B16A16_SSCALED".."94",
        "FORMAT_R16G16B16A16_UINT".."95",
        "FORMAT_R16G16B16A16_SINT".."96",
        "FORMAT_R16G16B16A16_SFLOAT".."97",
        "FORMAT_R32_UINT".."98",
        "FORMAT_R32_SINT".."99",
        "FORMAT_R32_SFLOAT".."100",
        "FORMAT_R32G32_UINT".."101",
        "FORMAT_R32G32_SINT".."102",
        "FORMAT_R32G32_SFLOAT".."103",
        "FORMAT_R32G32B32_UINT".."104",
        "FORMAT_R32G32B32_SINT".."105",
        "FORMAT_R32G32B32_SFLOAT".."106",
        "FORMAT_R32G32B32A32_UINT".."107",
        "FORMAT_R32G32B32A32_SINT".."108",
        "FORMAT_R32G32B32A32_SFLOAT".."109",
        "FORMAT_R64_UINT".."110",
        "FORMAT_R64_SINT".."111",
        "FORMAT_R64_SFLOAT".."112",
        "FORMAT_R64G64_UINT".."113",
        "FORMAT_R64G64_SINT".."114",
        "FORMAT_R64G64_SFLOAT".."115",
        "FORMAT_R64G64B64_UINT".."116",
        "FORMAT_R64G64B64_SINT".."117",
        "FORMAT_R64G64B64_SFLOAT".."118",
        "FORMAT_R64G64B64A64_UINT".."119",
        "FORMAT_R64G64B64A64_SINT".."120",
        "FORMAT_R64G64B64A64_SFLOAT".."121",
        "FORMAT_B10G11R11_UFLOAT_PACK32".."122",
        "FORMAT_E5B9G9R9_UFLOAT_PACK32".."123",
        "FORMAT_D16_UNORM".."124",
        "FORMAT_X8_D24_UNORM_PACK32".."125",
        "FORMAT_D32_SFLOAT".."126",
        "FORMAT_S8_UINT".."127",
        "FORMAT_D16_UNORM_S8_UINT".."128",
        "FORMAT_D24_UNORM_S8_UINT".."129",
        "FORMAT_D32_SFLOAT_S8_UINT".."130",
        "FORMAT_BC1_RGB_UNORM_BLOCK".."131",
        "FORMAT_BC1_RGB_SRGB_BLOCK".."132",
        "FORMAT_BC1_RGBA_UNORM_BLOCK".."133",
        "FORMAT_BC1_RGBA_SRGB_BLOCK".."134",
        "FORMAT_BC2_UNORM_BLOCK".."135",
        "FORMAT_BC2_SRGB_BLOCK".."136",
        "FORMAT_BC3_UNORM_BLOCK".."137",
        "FORMAT_BC3_SRGB_BLOCK".."138",
        "FORMAT_BC4_UNORM_BLOCK".."139",
        "FORMAT_BC4_SNORM_BLOCK".."140",
        "FORMAT_BC5_UNORM_BLOCK".."141",
        "FORMAT_BC5_SNORM_BLOCK".."142",
        "FORMAT_BC6H_UFLOAT_BLOCK".."143",
        "FORMAT_BC6H_SFLOAT_BLOCK".."144",
        "FORMAT_BC7_UNORM_BLOCK".."145",
        "FORMAT_BC7_SRGB_BLOCK".."146",
        "FORMAT_ETC2_R8G8B8_UNORM_BLOCK".."147",
        "FORMAT_ETC2_R8G8B8_SRGB_BLOCK".."148",
        "FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK".."149",
        "FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK".."150",
        "FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK".."151",
        "FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK".."152",
        "FORMAT_EAC_R11_UNORM_BLOCK".."153",
        "FORMAT_EAC_R11_SNORM_BLOCK".."154",
        "FORMAT_EAC_R11G11_UNORM_BLOCK".."155",
        "FORMAT_EAC_R11G11_SNORM_BLOCK".."156",
        "FORMAT_ASTC_4x4_UNORM_BLOCK".."157",
        "FORMAT_ASTC_4x4_SRGB_BLOCK".."158",
        "FORMAT_ASTC_5x4_UNORM_BLOCK".."159",
        "FORMAT_ASTC_5x4_SRGB_BLOCK".."160",
        "FORMAT_ASTC_5x5_UNORM_BLOCK".."161",
        "FORMAT_ASTC_5x5_SRGB_BLOCK".."162",
        "FORMAT_ASTC_6x5_UNORM_BLOCK".."163",
        "FORMAT_ASTC_6x5_SRGB_BLOCK".."164",
        "FORMAT_ASTC_6x6_UNORM_BLOCK".."165",
        "FORMAT_ASTC_6x6_SRGB_BLOCK".."166",
        "FORMAT_ASTC_8x5_UNORM_BLOCK".."167",
        "FORMAT_ASTC_8x5_SRGB_BLOCK".."168",
        "FORMAT_ASTC_8x6_UNORM_BLOCK".."169",
        "FORMAT_ASTC_8x6_SRGB_BLOCK".."170",
        "FORMAT_ASTC_8x8_UNORM_BLOCK".."171",
        "FORMAT_ASTC_8x8_SRGB_BLOCK".."172",
        "FORMAT_ASTC_10x5_UNORM_BLOCK".."173",
        "FORMAT_ASTC_10x5_SRGB_BLOCK".."174",
        "FORMAT_ASTC_10x6_UNORM_BLOCK".."175",
        "FORMAT_ASTC_10x6_SRGB_BLOCK".."176",
        "FORMAT_ASTC_10x8_UNORM_BLOCK".."177",
        "FORMAT_ASTC_10x8_SRGB_BLOCK".."178",
        "FORMAT_ASTC_10x10_UNORM_BLOCK".."179",
        "FORMAT_ASTC_10x10_SRGB_BLOCK".."180",
        "FORMAT_ASTC_12x10_UNORM_BLOCK".."181",
        "FORMAT_ASTC_12x10_SRGB_BLOCK".."182",
        "FORMAT_ASTC_12x12_UNORM_BLOCK".."183",
        "FORMAT_ASTC_12x12_SRGB_BLOCK".."184"
    )

    EnumConstant(
        "FORMAT_FEATURE_SAMPLED_IMAGE_BIT".enum(0x00000001),
        "FORMAT_FEATURE_STORAGE_IMAGE_BIT".enum(0x00000002),
        "FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT".enum(0x00000004),
        "FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT".enum(0x00000008),
        "FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT".enum(0x00000010),
        "FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT".enum(0x00000020),
        "FORMAT_FEATURE_VERTEX_BUFFER_BIT".enum(0x00000040),
        "FORMAT_FEATURE_COLOR_ATTACHMENT_BIT".enum(0x00000080),
        "FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT".enum(0x00000100),
        "FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT".enum(0x00000200),
        "FORMAT_FEATURE_BLIT_SRC_BIT".enum(0x00000400),
        "FORMAT_FEATURE_BLIT_DST_BIT".enum(0x00000800),
        "FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT".enum(0x00001000)
    )

    EnumConstant(
        "IMAGE_CREATE_SPARSE_BINDING_BIT".enum(0x00000001),
        "IMAGE_CREATE_SPARSE_RESIDENCY_BIT".enum(0x00000002),
        "IMAGE_CREATE_SPARSE_ALIASED_BIT".enum(0x00000004),
        "IMAGE_CREATE_MUTABLE_FORMAT_BIT".enum(0x00000008),
        "IMAGE_CREATE_CUBE_COMPATIBLE_BIT".enum(0x00000010)
    )

    EnumConstant(
        "SAMPLE_COUNT_1_BIT".enum(0x00000001),
        "SAMPLE_COUNT_2_BIT".enum(0x00000002),
        "SAMPLE_COUNT_4_BIT".enum(0x00000004),
        "SAMPLE_COUNT_8_BIT".enum(0x00000008),
        "SAMPLE_COUNT_16_BIT".enum(0x00000010),
        "SAMPLE_COUNT_32_BIT".enum(0x00000020),
        "SAMPLE_COUNT_64_BIT".enum(0x00000040)
    )

    EnumConstant(
        "IMAGE_TILING_OPTIMAL".."0",
        "IMAGE_TILING_LINEAR".."1"
    )

    EnumConstant(
        "IMAGE_TYPE_1D".."0",
        "IMAGE_TYPE_2D".."1",
        "IMAGE_TYPE_3D".."2"
    )

    EnumConstant(
        "IMAGE_USAGE_TRANSFER_SRC_BIT".enum(0x00000001),
        "IMAGE_USAGE_TRANSFER_DST_BIT".enum(0x00000002),
        "IMAGE_USAGE_SAMPLED_BIT".enum(0x00000004),
        "IMAGE_USAGE_STORAGE_BIT".enum(0x00000008),
        "IMAGE_USAGE_COLOR_ATTACHMENT_BIT".enum(0x00000010),
        "IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT".enum(0x00000020),
        "IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT".enum(0x00000040),
        "IMAGE_USAGE_INPUT_ATTACHMENT_BIT".enum(0x00000080)
    )

    EnumConstant(
        "MEMORY_HEAP_DEVICE_LOCAL_BIT".enum(0x00000001)
    )

    EnumConstant(
        "MEMORY_PROPERTY_DEVICE_LOCAL_BIT".enum(0x00000001),
        "MEMORY_PROPERTY_HOST_VISIBLE_BIT".enum(0x00000002),
        "MEMORY_PROPERTY_HOST_COHERENT_BIT".enum(0x00000004),
        "MEMORY_PROPERTY_HOST_CACHED_BIT".enum(0x00000008),
        "MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT".enum(0x00000010)
    )

    EnumConstant(
        "PHYSICAL_DEVICE_TYPE_OTHER".."0",
        "PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU".."1",
        "PHYSICAL_DEVICE_TYPE_DISCRETE_GPU".."2",
        "PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU".."3",
        "PHYSICAL_DEVICE_TYPE_CPU".."4"
    )

    EnumConstant(
        "QUEUE_GRAPHICS_BIT".enum(0x00000001),
        "QUEUE_COMPUTE_BIT".enum(0x00000002),
        "QUEUE_TRANSFER_BIT".enum(0x00000004),
        "QUEUE_SPARSE_BINDING_BIT".enum(0x00000008)
    )

    EnumConstant(
        "PIPELINE_STAGE_TOP_OF_PIPE_BIT".enum(0x00000001),
        "PIPELINE_STAGE_DRAW_INDIRECT_BIT".enum(0x00000002),
        "PIPELINE_STAGE_VERTEX_INPUT_BIT".enum(0x00000004),
        "PIPELINE_STAGE_VERTEX_SHADER_BIT".enum(0x00000008),
        "PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT".enum(0x00000010),
        "PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT".enum(0x00000020),
        "PIPELINE_STAGE_GEOMETRY_SHADER_BIT".enum(0x00000040),
        "PIPELINE_STAGE_FRAGMENT_SHADER_BIT".enum(0x00000080),
        "PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT".enum(0x00000100),
        "PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT".enum(0x00000200),
        "PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT".enum(0x00000400),
        "PIPELINE_STAGE_COMPUTE_SHADER_BIT".enum(0x00000800),
        "PIPELINE_STAGE_TRANSFER_BIT".enum(0x00001000),
        "PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT".enum(0x00002000),
        "PIPELINE_STAGE_HOST_BIT".enum(0x00004000),
        "PIPELINE_STAGE_ALL_GRAPHICS_BIT".enum(0x00008000),
        "PIPELINE_STAGE_ALL_COMMANDS_BIT".enum(0x00010000)
    )

    EnumConstant(
        "SPARSE_MEMORY_BIND_METADATA_BIT".enum(0x00000001)
    )

    EnumConstant(
        "SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT".enum(0x00000001),
        "SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT".enum(0x00000002),
        "SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT".enum(0x00000004)
    )

    EnumConstant(
        "FENCE_CREATE_SIGNALED_BIT".enum(0x00000001)
    )

    EnumConstant(
        "QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT".enum(0x00000001),
        "QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT".enum(0x00000002),
        "QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT".enum(0x00000004),
        "QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT".enum(0x00000008),
        "QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT".enum(0x00000010),
        "QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT".enum(0x00000020),
        "QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT".enum(0x00000040),
        "QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT".enum(0x00000080),
        "QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT".enum(0x00000100),
        "QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT".enum(0x00000200),
        "QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT".enum(0x00000400)
    )

    EnumConstant(
        "QUERY_TYPE_OCCLUSION".."0",
        "QUERY_TYPE_PIPELINE_STATISTICS".."1",
        "QUERY_TYPE_TIMESTAMP".."2"
    )

    EnumConstant(
        "QUERY_RESULT_64_BIT".enum(0x00000001),
        "QUERY_RESULT_WAIT_BIT".enum(0x00000002),
        "QUERY_RESULT_WITH_AVAILABILITY_BIT".enum(0x00000004),
        "QUERY_RESULT_PARTIAL_BIT".enum(0x00000008)
    )

    EnumConstant(
        "BUFFER_CREATE_SPARSE_BINDING_BIT".enum(0x00000001),
        "BUFFER_CREATE_SPARSE_RESIDENCY_BIT".enum(0x00000002),
        "BUFFER_CREATE_SPARSE_ALIASED_BIT".enum(0x00000004)
    )

    EnumConstant(
        "BUFFER_USAGE_TRANSFER_SRC_BIT".enum(0x00000001),
        "BUFFER_USAGE_TRANSFER_DST_BIT".enum(0x00000002),
        "BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT".enum(0x00000004),
        "BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT".enum(0x00000008),
        "BUFFER_USAGE_UNIFORM_BUFFER_BIT".enum(0x00000010),
        "BUFFER_USAGE_STORAGE_BUFFER_BIT".enum(0x00000020),
        "BUFFER_USAGE_INDEX_BUFFER_BIT".enum(0x00000040),
        "BUFFER_USAGE_VERTEX_BUFFER_BIT".enum(0x00000080),
        "BUFFER_USAGE_INDIRECT_BUFFER_BIT".enum(0x00000100)
    )

    EnumConstant(
        "SHARING_MODE_EXCLUSIVE".."0",
        "SHARING_MODE_CONCURRENT".."1"
    )

    EnumConstant(
        "COMPONENT_SWIZZLE_IDENTITY".."0",
        "COMPONENT_SWIZZLE_ZERO".."1",
        "COMPONENT_SWIZZLE_ONE".."2",
        "COMPONENT_SWIZZLE_R".."3",
        "COMPONENT_SWIZZLE_G".."4",
        "COMPONENT_SWIZZLE_B".."5",
        "COMPONENT_SWIZZLE_A".."6"
    )

    EnumConstant(
        "IMAGE_VIEW_TYPE_1D".."0",
        "IMAGE_VIEW_TYPE_2D".."1",
        "IMAGE_VIEW_TYPE_3D".."2",
        "IMAGE_VIEW_TYPE_CUBE".."3",
        "IMAGE_VIEW_TYPE_1D_ARRAY".."4",
        "IMAGE_VIEW_TYPE_2D_ARRAY".."5",
        "IMAGE_VIEW_TYPE_CUBE_ARRAY".."6"
    )

    EnumConstant(
        "BLEND_FACTOR_ZERO".."0",
        "BLEND_FACTOR_ONE".."1",
        "BLEND_FACTOR_SRC_COLOR".."2",
        "BLEND_FACTOR_ONE_MINUS_SRC_COLOR".."3",
        "BLEND_FACTOR_DST_COLOR".."4",
        "BLEND_FACTOR_ONE_MINUS_DST_COLOR".."5",
        "BLEND_FACTOR_SRC_ALPHA".."6",
        "BLEND_FACTOR_ONE_MINUS_SRC_ALPHA".."7",
        "BLEND_FACTOR_DST_ALPHA".."8",
        "BLEND_FACTOR_ONE_MINUS_DST_ALPHA".."9",
        "BLEND_FACTOR_CONSTANT_COLOR".."10",
        "BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR".."11",
        "BLEND_FACTOR_CONSTANT_ALPHA".."12",
        "BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA".."13",
        "BLEND_FACTOR_SRC_ALPHA_SATURATE".."14",
        "BLEND_FACTOR_SRC1_COLOR".."15",
        "BLEND_FACTOR_ONE_MINUS_SRC1_COLOR".."16",
        "BLEND_FACTOR_SRC1_ALPHA".."17",
        "BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA".."18"
    )

    EnumConstant(
        "BLEND_OP_ADD".."0",
        "BLEND_OP_SUBTRACT".."1",
        "BLEND_OP_REVERSE_SUBTRACT".."2",
        "BLEND_OP_MIN".."3",
        "BLEND_OP_MAX".."4"
    )

    EnumConstant(
        "COLOR_COMPONENT_R_BIT".enum(0x00000001),
        "COLOR_COMPONENT_G_BIT".enum(0x00000002),
        "COLOR_COMPONENT_B_BIT".enum(0x00000004),
        "COLOR_COMPONENT_A_BIT".enum(0x00000008)
    )

    EnumConstant(
        "COMPARE_OP_NEVER".."0",
        "COMPARE_OP_LESS".."1",
        "COMPARE_OP_EQUAL".."2",
        "COMPARE_OP_LESS_OR_EQUAL".."3",
        "COMPARE_OP_GREATER".."4",
        "COMPARE_OP_NOT_EQUAL".."5",
        "COMPARE_OP_GREATER_OR_EQUAL".."6",
        "COMPARE_OP_ALWAYS".."7"
    )

    EnumConstant(
        "PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT".enum(0x00000001),
        "PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT".enum(0x00000002),
        "PIPELINE_CREATE_DERIVATIVE_BIT".enum(0x00000004)
    )

    EnumConstant(
        "SHADER_STAGE_VERTEX_BIT".enum(0x00000001),
        "SHADER_STAGE_TESSELLATION_CONTROL_BIT".enum(0x00000002),
        "SHADER_STAGE_TESSELLATION_EVALUATION_BIT".enum(0x00000004),
        "SHADER_STAGE_GEOMETRY_BIT".enum(0x00000008),
        "SHADER_STAGE_FRAGMENT_BIT".enum(0x00000010),
        "SHADER_STAGE_ALL_GRAPHICS".."0x0000001F",
        "SHADER_STAGE_COMPUTE_BIT".enum(0x00000020),
        "SHADER_STAGE_ALL".."0x7FFFFFFF"
    )

    EnumConstant(
        "CULL_MODE_NONE".."0",
        "CULL_MODE_FRONT_BIT".enum(0x00000001),
        "CULL_MODE_BACK_BIT".enum(0x00000002),
        "CULL_MODE_FRONT_AND_BACK".."0x00000003"
    )

    EnumConstant(
        "DYNAMIC_STATE_VIEWPORT".."0",
        "DYNAMIC_STATE_SCISSOR".."1",
        "DYNAMIC_STATE_LINE_WIDTH".."2",
        "DYNAMIC_STATE_DEPTH_BIAS".."3",
        "DYNAMIC_STATE_BLEND_CONSTANTS".."4",
        "DYNAMIC_STATE_DEPTH_BOUNDS".."5",
        "DYNAMIC_STATE_STENCIL_COMPARE_MASK".."6",
        "DYNAMIC_STATE_STENCIL_WRITE_MASK".."7",
        "DYNAMIC_STATE_STENCIL_REFERENCE".."8"
    )

    EnumConstant(
        "FRONT_FACE_COUNTER_CLOCKWISE".."0",
        "FRONT_FACE_CLOCKWISE".."1"
    )

    EnumConstant(
        "VERTEX_INPUT_RATE_VERTEX".."0",
        "VERTEX_INPUT_RATE_INSTANCE".."1"
    )

    EnumConstant(
        "PRIMITIVE_TOPOLOGY_POINT_LIST".."0",
        "PRIMITIVE_TOPOLOGY_LINE_LIST".."1",
        "PRIMITIVE_TOPOLOGY_LINE_STRIP".."2",
        "PRIMITIVE_TOPOLOGY_TRIANGLE_LIST".."3",
        "PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP".."4",
        "PRIMITIVE_TOPOLOGY_TRIANGLE_FAN".."5",
        "PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY".."6",
        "PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY".."7",
        "PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY".."8",
        "PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY".."9",
        "PRIMITIVE_TOPOLOGY_PATCH_LIST".."10"
    )

    EnumConstant(
        "POLYGON_MODE_FILL".."0",
        "POLYGON_MODE_LINE".."1",
        "POLYGON_MODE_POINT".."2"
    )

    EnumConstant(
        "STENCIL_OP_KEEP".."0",
        "STENCIL_OP_ZERO".."1",
        "STENCIL_OP_REPLACE".."2",
        "STENCIL_OP_INCREMENT_AND_CLAMP".."3",
        "STENCIL_OP_DECREMENT_AND_CLAMP".."4",
        "STENCIL_OP_INVERT".."5",
        "STENCIL_OP_INCREMENT_AND_WRAP".."6",
        "STENCIL_OP_DECREMENT_AND_WRAP".."7"
    )

    EnumConstant(
        "LOGIC_OP_CLEAR".."0",
        "LOGIC_OP_AND".."1",
        "LOGIC_OP_AND_REVERSE".."2",
        "LOGIC_OP_COPY".."3",
        "LOGIC_OP_AND_INVERTED".."4",
        "LOGIC_OP_NO_OP".."5",
        "LOGIC_OP_XOR".."6",
        "LOGIC_OP_OR".."7",
        "LOGIC_OP_NOR".."8",
        "LOGIC_OP_EQUIVALENT".."9",
        "LOGIC_OP_INVERT".."10",
        "LOGIC_OP_OR_REVERSE".."11",
        "LOGIC_OP_COPY_INVERTED".."12",
        "LOGIC_OP_OR_INVERTED".."13",
        "LOGIC_OP_NAND".."14",
        "LOGIC_OP_SET".."15"
    )

    EnumConstant(
        "BORDER_COLOR_FLOAT_TRANSPARENT_BLACK".."0",
        "BORDER_COLOR_INT_TRANSPARENT_BLACK".."1",
        "BORDER_COLOR_FLOAT_OPAQUE_BLACK".."2",
        "BORDER_COLOR_INT_OPAQUE_BLACK".."3",
        "BORDER_COLOR_FLOAT_OPAQUE_WHITE".."4",
        "BORDER_COLOR_INT_OPAQUE_WHITE".."5"
    )

    EnumConstant(
        "FILTER_NEAREST".."0",
        "FILTER_LINEAR".."1"
    )

    EnumConstant(
        "SAMPLER_ADDRESS_MODE_REPEAT".."0",
        "SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT".."1",
        "SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE".."2",
        "SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER".."3"
    )

    EnumConstant(
        "SAMPLER_MIPMAP_MODE_NEAREST".."0",
        "SAMPLER_MIPMAP_MODE_LINEAR".."1"
    )

    EnumConstant(
        "DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT".enum(0x00000001)
    )

    EnumConstant(
        "DESCRIPTOR_TYPE_SAMPLER".."0",
        "DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER".."1",
        "DESCRIPTOR_TYPE_SAMPLED_IMAGE".."2",
        "DESCRIPTOR_TYPE_STORAGE_IMAGE".."3",
        "DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER".."4",
        "DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER".."5",
        "DESCRIPTOR_TYPE_UNIFORM_BUFFER".."6",
        "DESCRIPTOR_TYPE_STORAGE_BUFFER".."7",
        "DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC".."8",
        "DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC".."9",
        "DESCRIPTOR_TYPE_INPUT_ATTACHMENT".."10"
    )

    EnumConstant(
        "ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT".enum(0x00000001)
    )

    EnumConstant(
        "ATTACHMENT_LOAD_OP_LOAD".."0",
        "ATTACHMENT_LOAD_OP_CLEAR".."1",
        "ATTACHMENT_LOAD_OP_DONT_CARE".."2"
    )

    EnumConstant(
        "ATTACHMENT_STORE_OP_STORE".."0",
        "ATTACHMENT_STORE_OP_DONT_CARE".."1"
    )

    EnumConstant(
        "DEPENDENCY_BY_REGION_BIT".enum(0x00000001)
    )

    EnumConstant(
        "PIPELINE_BIND_POINT_GRAPHICS".."0",
        "PIPELINE_BIND_POINT_COMPUTE".."1"
    )

    EnumConstant(
        "COMMAND_POOL_CREATE_TRANSIENT_BIT".enum(0x00000001),
        "COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT".enum(0x00000002)
    )

    EnumConstant(
        "COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT".enum(0x00000001)
    )

    EnumConstant(
        "COMMAND_BUFFER_LEVEL_PRIMARY".."0",
        "COMMAND_BUFFER_LEVEL_SECONDARY".."1"
    )

    EnumConstant(
        "COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT".enum(0x00000001),
        "COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT".enum(0x00000002),
        "COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT".enum(0x00000004)
    )

    EnumConstant(
        "QUERY_CONTROL_PRECISE_BIT".enum(0x00000001)
    )

    EnumConstant(
        "COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT".enum(0x00000001)
    )

    EnumConstant(
        "INDEX_TYPE_UINT16".."0",
        "INDEX_TYPE_UINT32".."1"
    )

    EnumConstant(
        "STENCIL_FACE_FRONT_BIT".enum(0x00000001),
        "STENCIL_FACE_BACK_BIT".enum(0x00000002),
        "STENCIL_FACE_FRONT_AND_BACK".."0x00000003",
        "STENCIL_FRONT_AND_BACK".."0x00000003"
    )

    EnumConstant(
        "SUBPASS_CONTENTS_INLINE".."0",
        "SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS".."1"
    )

    // Device initialization

    GlobalCommand..VkResult(
        "CreateInstance",

        VkInstanceCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkInstance.p("pInstance")
    )

    void(
        "DestroyInstance",

        VkInstance("instance"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "EnumeratePhysicalDevices",

        VkInstance("instance"),
        AutoSize("pPhysicalDevices")..Check(1)..uint32_t.p("pPhysicalDeviceCount"),
        nullable..VkPhysicalDevice.p("pPhysicalDevices")
    )

    void(
        "GetPhysicalDeviceFeatures",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceFeatures.p("pFeatures")
    )

    void(
        "GetPhysicalDeviceFormatProperties",

        VkPhysicalDevice("physicalDevice"),
        VkFormat("format"),
        VkFormatProperties.p("pFormatProperties")
    )

    VkResult(
        "GetPhysicalDeviceImageFormatProperties",

        VkPhysicalDevice("physicalDevice"),
        VkFormat("format"),
        VkImageType("type"),
        VkImageTiling("tiling"),
        VkImageUsageFlags("usage"),
        VkImageCreateFlags("flags"),
        VkImageFormatProperties.p("pImageFormatProperties")
    )

    void(
        "GetPhysicalDeviceProperties",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceProperties.p("pProperties")
    )

    void(
        "GetPhysicalDeviceQueueFamilyProperties",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pQueueFamilyProperties")..Check(1)..uint32_t.p("pQueueFamilyPropertyCount"),
        nullable..VkQueueFamilyProperties.p("pQueueFamilyProperties")
    )

    void(
        "GetPhysicalDeviceMemoryProperties",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceMemoryProperties.p("pMemoryProperties")
    )

    GlobalCommand..PFN_vkVoidFunction(
        "GetInstanceProcAddr",

        VkInstance("instance"),
        charASCII.const.p("pName")
    )

    PFN_vkVoidFunction(
        "GetDeviceProcAddr",

        VkDevice("device"),
        charASCII.const.p("pName")
    )

    // Device commands

    VkResult(
        "CreateDevice",

        VkPhysicalDevice("physicalDevice"),
        VkDeviceCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkDevice.p("pDevice")
    )

    void(
        "DestroyDevice",

        VkDevice("device"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    // Extension discovery commands

    GlobalCommand..VkResult(
        "EnumerateInstanceExtensionProperties",

        nullable..charUTF8.const.p("pLayerName"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount"),
        nullable..VkExtensionProperties.p("pProperties")
    )

    VkResult(
        "EnumerateDeviceExtensionProperties",

        VkPhysicalDevice("physicalDevice"),
        nullable..charUTF8.const.p("pLayerName"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount"),
        nullable..VkExtensionProperties.p("pProperties")
    )

    // Layer discovery commands

    GlobalCommand..VkResult(
        "EnumerateInstanceLayerProperties",

        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount"),
        nullable..VkLayerProperties.p("pProperties")
    )

    VkResult(
        "EnumerateDeviceLayerProperties",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount"),
        nullable..VkLayerProperties.p("pProperties")
    )

    // Queue commands

    void(
        "GetDeviceQueue",

        VkDevice("device"),
        uint32_t("queueFamilyIndex"),
        uint32_t("queueIndex"),
        Check(1)..VkQueue.p("pQueue")
    )

    VkResult(
        "QueueSubmit",

        VkQueue("queue"),
        AutoSize("pSubmits")..uint32_t("submitCount"),
        nullable..VkSubmitInfo.const.p("pSubmits"),
        VkFence("fence")
    )

    VkResult(
        "QueueWaitIdle",

        VkQueue("queue")
    )

    VkResult(
        "DeviceWaitIdle",

        VkDevice("device")
    )

    // Memory commands

    VkResult(
        "AllocateMemory",

        VkDevice("device"),
        VkMemoryAllocateInfo.const.p("pAllocateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkDeviceMemory.p("pMemory")
    )

    void(
        "FreeMemory",

        VkDevice("device"),
        VkDeviceMemory("memory"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "MapMemory",

        VkDevice("device"),
        VkDeviceMemory("memory"),
        VkDeviceSize("offset"),
        VkDeviceSize("size"),
        VkMemoryMapFlags("flags"),
        Check(1)..void.p.p("ppData")
    )

    void(
        "UnmapMemory",

        VkDevice("device"),
        VkDeviceMemory("memory")
    )

    VkResult(
        "FlushMappedMemoryRanges",

        VkDevice("device"),
        AutoSize("pMemoryRanges")..uint32_t("memoryRangeCount"),
        VkMappedMemoryRange.const.p("pMemoryRanges")
    )

    VkResult(
        "InvalidateMappedMemoryRanges",

        VkDevice("device"),
        AutoSize("pMemoryRanges")..uint32_t("memoryRangeCount"),
        VkMappedMemoryRange.const.p("pMemoryRanges")
    )

    void(
        "GetDeviceMemoryCommitment",

        VkDevice("device"),
        VkDeviceMemory("memory"),
        Check(1)..VkDeviceSize.p("pCommittedMemoryInBytes")
    )

    // Memory management API commands

    VkResult(
        "BindBufferMemory",

        VkDevice("device"),
        VkBuffer("buffer"),
        VkDeviceMemory("memory"),
        VkDeviceSize("memoryOffset")
    )

    VkResult(
        "BindImageMemory",

        VkDevice("device"),
        VkImage("image"),
        VkDeviceMemory("memory"),
        VkDeviceSize("memoryOffset")
    )

    void(
        "GetBufferMemoryRequirements",

        VkDevice("device"),
        VkBuffer("buffer"),
        VkMemoryRequirements.p("pMemoryRequirements")
    )

    void(
        "GetImageMemoryRequirements",

        VkDevice("device"),
        VkImage("image"),
        VkMemoryRequirements.p("pMemoryRequirements")
    )

    // Sparse resource memory management API commands

    void(
        "GetImageSparseMemoryRequirements",

        VkDevice("device"),
        VkImage("image"),
        AutoSize("pSparseMemoryRequirements")..Check(1)..uint32_t.p("pSparseMemoryRequirementCount"),
        nullable..VkSparseImageMemoryRequirements.p("pSparseMemoryRequirements")
    )

    void(
        "GetPhysicalDeviceSparseImageFormatProperties",

        VkPhysicalDevice("physicalDevice"),
        VkFormat("format"),
        VkImageType("type"),
        VkSampleCountFlagBits("samples"),
        VkImageUsageFlags("usage"),
        VkImageTiling("tiling"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount"),
        nullable..VkSparseImageFormatProperties.p("pProperties")
    )

    VkResult(
        "QueueBindSparse",

        VkQueue("queue"),
        AutoSize("pBindInfo")..uint32_t("bindInfoCount"),
        nullable..VkBindSparseInfo.const.p("pBindInfo"),
        VkFence("fence")
    )

    // Fence commands

    VkResult(
        "CreateFence",

        VkDevice("device"),
        VkFenceCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkFence.p("pFence")
    )

    void(
        "DestroyFence",

        VkDevice("device"),
        VkFence("fence"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "ResetFences",

        VkDevice("device"),
        AutoSize("pFences")..uint32_t("fenceCount"),
        VkFence.const.p("pFences")
    )

    VkResult(
        "GetFenceStatus",

        VkDevice("device"),
        VkFence("fence")
    )

    VkResult(
        "WaitForFences",

        VkDevice("device"),
        AutoSize("pFences")..uint32_t("fenceCount"),
        VkFence.const.p("pFences"),
        VkBool32("waitAll"),
        uint64_t("timeout")
    )

    // Queue semaphore commands

    VkResult(
        "CreateSemaphore",

        VkDevice("device"),
        VkSemaphoreCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkSemaphore.p("pSemaphore")
    )

    void(
        "DestroySemaphore",

        VkDevice("device"),
        VkSemaphore("semaphore"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    // Event commands

    VkResult(
        "CreateEvent",

        VkDevice("device"),
        VkEventCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkEvent.p("pEvent")
    )

    void(
        "DestroyEvent",

        VkDevice("device"),
        VkEvent("event"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "GetEventStatus",

        VkDevice("device"),
        VkEvent("event")
    )

    VkResult(
        "SetEvent",

        VkDevice("device"),
        VkEvent("event")
    )

    VkResult(
        "ResetEvent",

        VkDevice("device"),
        VkEvent("event")
    )

    // Query commands

    VkResult(
        "CreateQueryPool",

        VkDevice("device"),
        VkQueryPoolCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkQueryPool.p("pQueryPool")
    )

    void(
        "DestroyQueryPool",

        VkDevice("device"),
        VkQueryPool("queryPool"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "GetQueryPoolResults",

        VkDevice("device"),
        VkQueryPool("queryPool"),
        uint32_t("firstQuery"),
        uint32_t("queryCount"),
        AutoSize("pData")..size_t("dataSize"),
        void.p("pData"),
        VkDeviceSize("stride"),
        VkQueryResultFlags("flags")
    )

    // Buffer commands

    VkResult(
        "CreateBuffer",

        VkDevice("device"),
        VkBufferCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkBuffer.p("pBuffer")
    )

    void(
        "DestroyBuffer",

        VkDevice("device"),
        VkBuffer("buffer"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    // Buffer view commands

    VkResult(
        "CreateBufferView",

        VkDevice("device"),
        VkBufferViewCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkBufferView.p("pView")
    )

    void(
        "DestroyBufferView",

        VkDevice("device"),
        VkBufferView("bufferView"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    // Image commands

    VkResult(
        "CreateImage",

        VkDevice("device"),
        VkImageCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkImage.p("pImage")
    )

    void(
        "DestroyImage",

        VkDevice("device"),
        VkImage("image"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "GetImageSubresourceLayout",

        VkDevice("device"),
        VkImage("image"),
        VkImageSubresource.const.p("pSubresource"),
        VkSubresourceLayout.p("pLayout")
    )

    // Image view commands

    VkResult(
        "CreateImageView",

        VkDevice("device"),
        VkImageViewCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkImageView.p("pView")
    )

    void(
        "DestroyImageView",

        VkDevice("device"),
        VkImageView("imageView"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    // Shader commands

    VkResult(
        "CreateShaderModule",

        VkDevice("device"),
        VkShaderModuleCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkShaderModule.p("pShaderModule")
    )

    void(
        "DestroyShaderModule",

        VkDevice("device"),
        VkShaderModule("shaderModule"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    // Pipeline Cache commands

    VkResult(
        "CreatePipelineCache",

        VkDevice("device"),
        VkPipelineCacheCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkPipelineCache.p("pPipelineCache")
    )

    void(
        "DestroyPipelineCache",

        VkDevice("device"),
        VkPipelineCache("pipelineCache"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "GetPipelineCacheData",

        VkDevice("device"),
        VkPipelineCache("pipelineCache"),
        AutoSize("pData")..Check(1)..size_t.p("pDataSize"),
        nullable..void.p("pData")
    )

    VkResult(
        "MergePipelineCaches",

        VkDevice("device"),
        VkPipelineCache("dstCache"),
        AutoSize("pSrcCaches")..uint32_t("srcCacheCount"),
        VkPipelineCache.const.p("pSrcCaches")
    )

    // Pipeline commands

    VkResult(
        "CreateGraphicsPipelines",

        VkDevice("device"),
        VkPipelineCache("pipelineCache"),
        AutoSize("pCreateInfos", "pPipelines")..uint32_t("createInfoCount"),
        VkGraphicsPipelineCreateInfo.const.p("pCreateInfos"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        VkPipeline.p("pPipelines")
    )

    VkResult(
        "CreateComputePipelines",

        VkDevice("device"),
        VkPipelineCache("pipelineCache"),
        AutoSize("pCreateInfos", "pPipelines")..uint32_t("createInfoCount"),
        VkComputePipelineCreateInfo.const.p("pCreateInfos"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        VkPipeline.p("pPipelines")
    )

    void(
        "DestroyPipeline",

        VkDevice("device"),
        VkPipeline("pipeline"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    // Pipeline layout commands

    VkResult(
        "CreatePipelineLayout",

        VkDevice("device"),
        VkPipelineLayoutCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkPipelineLayout.p("pPipelineLayout")
    )

    void(
        "DestroyPipelineLayout",

        VkDevice("device"),
        VkPipelineLayout("pipelineLayout"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    // Sampler commands

    VkResult(
        "CreateSampler",

        VkDevice("device"),
        VkSamplerCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkSampler.p("pSampler")
    )

    void(
        "DestroySampler",

        VkDevice("device"),
        VkSampler("sampler"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    // Descriptor set commands

    VkResult(
        "CreateDescriptorSetLayout",

        VkDevice("device"),
        VkDescriptorSetLayoutCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkDescriptorSetLayout.p("pSetLayout")
    )

    void(
        "DestroyDescriptorSetLayout",

        VkDevice("device"),
        VkDescriptorSetLayout("descriptorSetLayout"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "CreateDescriptorPool",

        VkDevice("device"),
        VkDescriptorPoolCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkDescriptorPool.p("pDescriptorPool")
    )

    void(
        "DestroyDescriptorPool",

        VkDevice("device"),
        VkDescriptorPool("descriptorPool"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "ResetDescriptorPool",

        VkDevice("device"),
        VkDescriptorPool("descriptorPool"),
        VkDescriptorPoolResetFlags("flags")
    )

    VkResult(
        "AllocateDescriptorSets",

        VkDevice("device"),
        VkDescriptorSetAllocateInfo.const.p("pAllocateInfo"),
        Check("pAllocateInfo.descriptorSetCount()")..VkDescriptorSet.p("pDescriptorSets")
    )

    VkResult(
        "FreeDescriptorSets",

        VkDevice("device"),
        VkDescriptorPool("descriptorPool"),
        AutoSize("pDescriptorSets")..uint32_t("descriptorSetCount"),
        nullable..VkDescriptorSet.const.p("pDescriptorSets")
    )

    void(
        "UpdateDescriptorSets",

        VkDevice("device"),
        AutoSize("pDescriptorWrites")..uint32_t("descriptorWriteCount"),
        nullable..VkWriteDescriptorSet.const.p("pDescriptorWrites"),
        AutoSize("pDescriptorCopies")..uint32_t("descriptorCopyCount"),
        nullable..VkCopyDescriptorSet.const.p("pDescriptorCopies")
    )

    // Pass commands

    VkResult(
        "CreateFramebuffer",

        VkDevice("device"),
        VkFramebufferCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkFramebuffer.p("pFramebuffer")
    )

    void(
        "DestroyFramebuffer",

        VkDevice("device"),
        VkFramebuffer("framebuffer"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "CreateRenderPass",

        VkDevice("device"),
        VkRenderPassCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkRenderPass.p("pRenderPass")
    )

    void(
        "DestroyRenderPass",

        VkDevice("device"),
        VkRenderPass("renderPass"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "GetRenderAreaGranularity",

        VkDevice("device"),
        VkRenderPass("renderPass"),
        VkExtent2D.p("pGranularity")
    )

    // Command pool commands

    VkResult(
        "CreateCommandPool",

        VkDevice("device"),
        VkCommandPoolCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkCommandPool.p("pCommandPool")
    )

    void(
        "DestroyCommandPool",

        VkDevice("device"),
        VkCommandPool("commandPool"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "ResetCommandPool",

        VkDevice("device"),
        VkCommandPool("commandPool"),
        VkCommandPoolResetFlags("flags")
    )

    // Command buffer commands

    VkResult(
        "AllocateCommandBuffers",

        VkDevice("device"),
        VkCommandBufferAllocateInfo.const.p("pAllocateInfo"),
        Check("pAllocateInfo.commandBufferCount()")..VkCommandBuffer.p("pCommandBuffers")
    )

    void(
        "FreeCommandBuffers",

        VkDevice("device"),
        VkCommandPool("commandPool"),
        AutoSize("pCommandBuffers")..uint32_t("commandBufferCount"),
        nullable..VkCommandBuffer.const.p("pCommandBuffers")
    )

    VkResult(
        "BeginCommandBuffer",

        VkCommandBuffer("commandBuffer"),
        VkCommandBufferBeginInfo.const.p("pBeginInfo")
    )

    VkResult(
        "EndCommandBuffer",

        VkCommandBuffer("commandBuffer")
    )

    VkResult(
        "ResetCommandBuffer",

        VkCommandBuffer("commandBuffer"),
        VkCommandBufferResetFlags("flags")
    )

    // Command buffer building commands

    void(
        "CmdBindPipeline",

        VkCommandBuffer("commandBuffer"),
        VkPipelineBindPoint("pipelineBindPoint"),
        VkPipeline("pipeline")
    )

    void(
        "CmdSetViewport",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstViewport"),
        AutoSize("pViewports")..uint32_t("viewportCount"),
        VkViewport.const.p("pViewports")
    )

    void(
        "CmdSetScissor",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstScissor"),
        AutoSize("pScissors")..uint32_t("scissorCount"),
        VkRect2D.const.p("pScissors")
    )

    void(
        "CmdSetLineWidth",

        VkCommandBuffer("commandBuffer"),
        float("lineWidth")
    )

    void(
        "CmdSetDepthBias",

        VkCommandBuffer("commandBuffer"),
        float("depthBiasConstantFactor"),
        float("depthBiasClamp"),
        float("depthBiasSlopeFactor")
    )

    void(
        "CmdSetBlendConstants",

        VkCommandBuffer("commandBuffer"),
        Check(4)..float.const.p("blendConstants")
    )

    void(
        "CmdSetDepthBounds",

        VkCommandBuffer("commandBuffer"),
        float("minDepthBounds"),
        float("maxDepthBounds")
    )

    void(
        "CmdSetStencilCompareMask",

        VkCommandBuffer("commandBuffer"),
        VkStencilFaceFlags("faceMask"),
        uint32_t("compareMask")
    )

    void(
        "CmdSetStencilWriteMask",

        VkCommandBuffer("commandBuffer"),
        VkStencilFaceFlags("faceMask"),
        uint32_t("writeMask")
    )

    void(
        "CmdSetStencilReference",

        VkCommandBuffer("commandBuffer"),
        VkStencilFaceFlags("faceMask"),
        uint32_t("reference")
    )

    void(
        "CmdBindDescriptorSets",

        VkCommandBuffer("commandBuffer"),
        VkPipelineBindPoint("pipelineBindPoint"),
        VkPipelineLayout("layout"),
        uint32_t("firstSet"),
        AutoSize("pDescriptorSets")..uint32_t("descriptorSetCount"),
        VkDescriptorSet.const.p("pDescriptorSets"),
        AutoSize("pDynamicOffsets")..uint32_t("dynamicOffsetCount"),
        nullable..uint32_t.const.p("pDynamicOffsets")
    )

    void(
        "CmdBindIndexBuffer",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("buffer"),
        VkDeviceSize("offset"),
        VkIndexType("indexType")
    )

    void(
        "CmdBindVertexBuffers",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstBinding"),
        AutoSize("pBuffers", "pOffsets")..uint32_t("bindingCount"),
        VkBuffer.const.p("pBuffers"),
        VkDeviceSize.const.p("pOffsets")
    )

    void(
        "CmdDraw",

        VkCommandBuffer("commandBuffer"),
        uint32_t("vertexCount"),
        uint32_t("instanceCount"),
        uint32_t("firstVertex"),
        uint32_t("firstInstance")
    )

    void(
        "CmdDrawIndexed",

        VkCommandBuffer("commandBuffer"),
        uint32_t("indexCount"),
        uint32_t("instanceCount"),
        uint32_t("firstIndex"),
        int32_t("vertexOffset"),
        uint32_t("firstInstance")
    )

    void(
        "CmdDrawIndirect",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("buffer"),
        VkDeviceSize("offset"),
        uint32_t("drawCount"),
        uint32_t("stride")
    )

    void(
        "CmdDrawIndexedIndirect",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("buffer"),
        VkDeviceSize("offset"),
        uint32_t("drawCount"),
        uint32_t("stride")
    )

    void(
        "CmdDispatch",

        VkCommandBuffer("commandBuffer"),
        uint32_t("groupCountX"),
        uint32_t("groupCountY"),
        uint32_t("groupCountZ")
    )

    void(
        "CmdDispatchIndirect",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("buffer"),
        VkDeviceSize("offset")
    )

    void(
        "CmdCopyBuffer",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("srcBuffer"),
        VkBuffer("dstBuffer"),
        AutoSize("pRegions")..uint32_t("regionCount"),
        VkBufferCopy.const.p("pRegions")
    )

    void(
        "CmdCopyImage",

        VkCommandBuffer("commandBuffer"),
        VkImage("srcImage"),
        VkImageLayout("srcImageLayout"),
        VkImage("dstImage"),
        VkImageLayout("dstImageLayout"),
        AutoSize("pRegions")..uint32_t("regionCount"),
        VkImageCopy.const.p("pRegions")
    )

    void(
        "CmdBlitImage",

        VkCommandBuffer("commandBuffer"),
        VkImage("srcImage"),
        VkImageLayout("srcImageLayout"),
        VkImage("dstImage"),
        VkImageLayout("dstImageLayout"),
        AutoSize("pRegions")..uint32_t("regionCount"),
        VkImageBlit.const.p("pRegions"),
        VkFilter("filter")
    )

    void(
        "CmdCopyBufferToImage",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("srcBuffer"),
        VkImage("dstImage"),
        VkImageLayout("dstImageLayout"),
        AutoSize("pRegions")..uint32_t("regionCount"),
        VkBufferImageCopy.const.p("pRegions")
    )

    void(
        "CmdCopyImageToBuffer",

        VkCommandBuffer("commandBuffer"),
        VkImage("srcImage"),
        VkImageLayout("srcImageLayout"),
        VkBuffer("dstBuffer"),
        AutoSize("pRegions")..uint32_t("regionCount"),
        VkBufferImageCopy.const.p("pRegions")
    )

    void(
        "CmdUpdateBuffer",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("dstBuffer"),
        VkDeviceSize("dstOffset"),
        AutoSize("pData")..VkDeviceSize("dataSize"),
        void.const.p("pData")
    )

    void(
        "CmdFillBuffer",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("dstBuffer"),
        VkDeviceSize("dstOffset"),
        VkDeviceSize("size"),
        uint32_t("data")
    )

    void(
        "CmdClearColorImage",

        VkCommandBuffer("commandBuffer"),
        VkImage("image"),
        VkImageLayout("imageLayout"),
        nullable..VkClearColorValue.const.p("pColor"),
        AutoSize("pRanges")..uint32_t("rangeCount"),
        VkImageSubresourceRange.const.p("pRanges")
    )

    void(
        "CmdClearDepthStencilImage",

        VkCommandBuffer("commandBuffer"),
        VkImage("image"),
        VkImageLayout("imageLayout"),
        VkClearDepthStencilValue.const.p("pDepthStencil"),
        AutoSize("pRanges")..uint32_t("rangeCount"),
        VkImageSubresourceRange.const.p("pRanges")
    )

    void(
        "CmdClearAttachments",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pAttachments")..uint32_t("attachmentCount"),
        VkClearAttachment.const.p("pAttachments"),
        AutoSize("pRects")..uint32_t("rectCount"),
        VkClearRect.const.p("pRects")
    )

    void(
        "CmdResolveImage",

        VkCommandBuffer("commandBuffer"),
        VkImage("srcImage"),
        VkImageLayout("srcImageLayout"),
        VkImage("dstImage"),
        VkImageLayout("dstImageLayout"),
        AutoSize("pRegions")..uint32_t("regionCount"),
        VkImageResolve.const.p("pRegions")
    )

    void(
        "CmdSetEvent",

        VkCommandBuffer("commandBuffer"),
        VkEvent("event"),
        VkPipelineStageFlags("stageMask")
    )

    void(
        "CmdResetEvent",

        VkCommandBuffer("commandBuffer"),
        VkEvent("event"),
        VkPipelineStageFlags("stageMask")
    )

    void(
        "CmdWaitEvents",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pEvents")..uint32_t("eventCount"),
        VkEvent.const.p("pEvents"),
        VkPipelineStageFlags("srcStageMask"),
        VkPipelineStageFlags("dstStageMask"),
        AutoSize("pMemoryBarriers")..uint32_t("memoryBarrierCount"),
        nullable..VkMemoryBarrier.const.p("pMemoryBarriers"),
        AutoSize("pBufferMemoryBarriers")..uint32_t("bufferMemoryBarrierCount"),
        nullable..VkBufferMemoryBarrier.const.p("pBufferMemoryBarriers"),
        AutoSize("pImageMemoryBarriers")..uint32_t("imageMemoryBarrierCount"),
        nullable..VkImageMemoryBarrier.const.p("pImageMemoryBarriers")
    )

    void(
        "CmdPipelineBarrier",

        VkCommandBuffer("commandBuffer"),
        VkPipelineStageFlags("srcStageMask"),
        VkPipelineStageFlags("dstStageMask"),
        VkDependencyFlags("dependencyFlags"),
        AutoSize("pMemoryBarriers")..uint32_t("memoryBarrierCount"),
        nullable..VkMemoryBarrier.const.p("pMemoryBarriers"),
        AutoSize("pBufferMemoryBarriers")..uint32_t("bufferMemoryBarrierCount"),
        nullable..VkBufferMemoryBarrier.const.p("pBufferMemoryBarriers"),
        AutoSize("pImageMemoryBarriers")..uint32_t("imageMemoryBarrierCount"),
        nullable..VkImageMemoryBarrier.const.p("pImageMemoryBarriers")
    )

    void(
        "CmdBeginQuery",

        VkCommandBuffer("commandBuffer"),
        VkQueryPool("queryPool"),
        uint32_t("query"),
        VkQueryControlFlags("flags")
    )

    void(
        "CmdEndQuery",

        VkCommandBuffer("commandBuffer"),
        VkQueryPool("queryPool"),
        uint32_t("query")
    )

    void(
        "CmdResetQueryPool",

        VkCommandBuffer("commandBuffer"),
        VkQueryPool("queryPool"),
        uint32_t("firstQuery"),
        uint32_t("queryCount")
    )

    void(
        "CmdWriteTimestamp",

        VkCommandBuffer("commandBuffer"),
        VkPipelineStageFlagBits("pipelineStage"),
        VkQueryPool("queryPool"),
        uint32_t("query")
    )

    void(
        "CmdCopyQueryPoolResults",

        VkCommandBuffer("commandBuffer"),
        VkQueryPool("queryPool"),
        uint32_t("firstQuery"),
        uint32_t("queryCount"),
        VkBuffer("dstBuffer"),
        VkDeviceSize("dstOffset"),
        VkDeviceSize("stride"),
        VkQueryResultFlags("flags")
    )

    void(
        "CmdPushConstants",

        VkCommandBuffer("commandBuffer"),
        VkPipelineLayout("layout"),
        VkShaderStageFlags("stageFlags"),
        uint32_t("offset"),
        AutoSize("pValues")..uint32_t("size"),
        void.const.p("pValues")
    )

    void(
        "CmdBeginRenderPass",

        VkCommandBuffer("commandBuffer"),
        VkRenderPassBeginInfo.const.p("pRenderPassBegin"),
        VkSubpassContents("contents")
    )

    void(
        "CmdNextSubpass",

        VkCommandBuffer("commandBuffer"),
        VkSubpassContents("contents")
    )

    void(
        "CmdEndRenderPass",

        VkCommandBuffer("commandBuffer")
    )

    void(
        "CmdExecuteCommands",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pCommandBuffers")..uint32_t("commandBufferCount"),
        VkCommandBuffer.const.p("pCommandBuffers")
    )

}