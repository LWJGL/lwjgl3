/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ktx

import org.lwjgl.generator.*
import vulkan.*

val KTX_BINDING = simpleBinding(
    Module.KTX,
    libraryExpression = """Configuration.KTX_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("ktx"))""",
    bundledWithLWJGL = true
)
val KTX_BINDING_DELEGATE = KTX_BINDING.delegate("KTX.getLibrary()")

val ktx_bool_t = typedef(bool, "ktx_bool_t")
val ktx_uint8_t = typedef(uint8_t, "ktx_uint8_t")
val ktx_int16_t = typedef(int16_t, "ktx_int16_t")
val ktx_uint16_t = typedef(uint16_t, "ktx_uint16_t")
val ktx_int32_t = typedef(int32_t, "ktx_int32_t")
val ktx_uint32_t = typedef(uint32_t, "ktx_uint32_t")
val ktx_int64_t = typedef(int64_t, "ktx_int64_t")
val ktx_uint64_t = typedef(uint64_t, "ktx_uint64_t")
val ktx_off_t = typedef(uint64_t, "ktx_off_t")
val ktx_size_t = typedef(size_t, "ktx_size_t")

val ktxHashListEntry = "ktxHashListEntry".opaque
val ktxMem = "ktxMem".opaque
val _ktxStream = "ktxStream".opaque

val ktxHashList = "ktxHashList".handle
val ktxHashList_p = "ktxHashList*".handle
val ktxTexture1_private = "struct ktxTexture1_private".handle
val ktxTexture2_private = "struct ktxTexture2_private".handle
val ktxTexture_protected = "struct ktxTexture_protected".handle

val ktxTextureCreateFlags = typedef(ktx_uint32_t, "ktxTextureCreateFlags")
val ktx_pack_uastc_flags = typedef(ktx_uint32_t, "ktx_pack_uastc_flags")
val ktx_transcode_flags = typedef(ktx_uint32_t, "ktx_transcode_flags")

val class_id = "class_id".enumType
val ktxOrientationX = "ktxOrientationX".enumType
val ktxOrientationY = "ktxOrientationY".enumType
val ktxOrientationZ = "ktxOrientationZ".enumType
val ktxResult = "ktxResult".enumType
val ktxSupercmpScheme = "ktxSupercmpScheme".enumType
val ktxTextureCreateFlagBits = "enum ktxTextureCreateFlagBits".enumType
val ktxTextureCreateStorageEnum = "ktxTextureCreateStorageEnum".enumType
val ktx_error_code_e = "KTX_error_code".enumType
val ktx_pack_astc_block_dimension_e = "ktx_pack_astc_block_dimension_e".enumType
val ktx_pack_astc_encoder_mode_e = "ktx_pack_astc_encoder_mode_e".enumType
val ktx_pack_astc_quality_levels_e = "ktx_pack_astc_quality_levels_e".enumType
val ktx_pack_uastc_flag_bits_e = "ktx_pack_uastc_flag_bits_e".enumType
val ktx_transcode_flag_bits_e = "ktx_transcode_flag_bits_e".enumType
val ktx_transcode_fmt_e = "ktx_transcode_fmt_e".enumType
val streamType = "enum streamType".enumType

val khr_df_model_e = "khr_df_model_e".enumType
val khr_df_primaries_e = "khr_df_primaries_e".enumType
val khr_df_transfer_e = "khr_df_transfer_e".enumType

val GLboolean = typedef(unsigned_char, "GLboolean")
val GLenum = typedef(unsigned_int, "GLenum")
val GLint = typedef(int, "GLint")
val GLsizei = typedef(int, "GLsizei")
val GLubyte = typedef(unsigned_char, "GLubyte")
val GLuint = typedef(unsigned_int, "GLuint")

val ktxOrientation = struct(Module.KTX, "ktxOrientation", nativeName = "struct ktxOrientation", mutable = false) {
    ktxOrientationX("x")
    ktxOrientationY("y")
    ktxOrientationZ("z")
}

val _ktxTexture_vtbl = struct(Module.KTX, "ktxTexture_vtbl", nativeName = "struct ktxTexture_vtbl")
val _ktxTexture_vvtbl = "struct ktxTexture_vvtbl".opaque

val ktxTexture = struct(Module.KTX, "ktxTexture", mutable = false) {
    class_id("classId")
    _ktxTexture_vtbl.p("vtbl")
    _ktxTexture_vvtbl.p("vvtbl")
    ktxTexture_protected.p("_protected")
    ktx_bool_t("isArray")
    ktx_bool_t("isCubemap")
    ktx_bool_t("isCompressed")
    ktx_bool_t("generateMipmaps")
    ktx_uint32_t("baseWidth")
    ktx_uint32_t("baseHeight")
    ktx_uint32_t("baseDepth")
    ktx_uint32_t("numDimensions")
    ktx_uint32_t("numLevels")
    ktx_uint32_t("numLayers")
    ktx_uint32_t("numFaces")
    ktxOrientation("orientation")
    ktxHashList("kvDataHead")
    AutoSize("kvData")..ktx_uint32_t("kvDataLen")
    nullable..ktx_uint8_t.p("kvData")
    AutoSize("pData")..ktx_size_t("dataSize")
    ktx_uint8_t.p("pData")
}

val PFNKTXITERCB = Module.KTX.callback {
    ktx_error_code_e(
        "PFNKTXITERCB",

        int("miplevel"),
        int("face"),
        int("width"),
        int("height"),
        int("depth"),
        AutoSize("pixels")..ktx_uint64_t("faceLodSize"),
        void.p("pixels"),
        nullable..opaque_p("userdata"),

        nativeType = "PFNKTXITERCB"
    ) {
        callingConvention = CallingConvention.DEFAULT
    }
}

val ktxTexture_vtbl = struct(Module.KTX, "ktxTexture_vtbl", nativeName = "struct ktxTexture_vtbl", mutable = false) {
    "PFNKTEXDESTROY".handle("Destroy")
    "PFNKTEXGETIMAGEOFFSET".handle("GetImageOffset")
    "PFNKTEXGETDATASIZEUNCOMPRESSED".handle("GetDataSizeUncompressed")
    "PFNKTEXGETIMAGESIZE".handle("GetImageSize")
    "PFNKTEXGETLEVELSIZE".handle("GetLevelSize")
    "PFNKTEXITERATELEVELS".handle("IterateLevels")
    "PFNKTEXITERATELOADLEVELFACES".handle("IterateLoadLevelFaces")
    "PFNKTEXNEEDSTRANSCODING".handle("NeedsTranscoding")
    "PFNKTEXLOADIMAGEDATA".handle("LoadImageData")
    "PFNKTEXSETIMAGEFROMMEMORY".handle("SetImageFromMemory")
    "PFNKTEXSETIMAGEFROMSTDIOSTREAM".handle("SetImageFromStdioStream")
    "PFNKTEXWRITETOSTDIOSTREAM".handle("WriteToStdioStream")
    "PFNKTEXWRITETONAMEDFILE".handle("WriteToNamedFile")
    "PFNKTEXWRITETOMEMORY".handle("WriteToMemory")
    "PFNKTEXWRITETOSTREAM".handle("WriteToStream")
}

val ktxTexture1 = struct(Module.KTX, "ktxTexture1", mutable = false) {
    class_id("classId")
    _ktxTexture_vtbl.p("vtbl")
    _ktxTexture_vvtbl.p("vvtbl")
    ktxTexture_protected.p("_protected")
    ktx_bool_t("isArray")
    ktx_bool_t("isCubemap")
    ktx_bool_t("isCompressed")
    ktx_bool_t("generateMipmaps")
    ktx_uint32_t("baseWidth")
    ktx_uint32_t("baseHeight")
    ktx_uint32_t("baseDepth")
    ktx_uint32_t("numDimensions")
    ktx_uint32_t("numLevels")
    ktx_uint32_t("numLayers")
    ktx_uint32_t("numFaces")
    ktxOrientation("orientation")
    ktxHashList("kvDataHead")
    AutoSize("kvData")..ktx_uint32_t("kvDataLen")
    nullable..ktx_uint8_t.p("kvData")
    AutoSize("pData")..ktx_size_t("dataSize")
    ktx_uint8_t.p("pData")
    ktx_uint32_t("glFormat")
    ktx_uint32_t("glInternalformat")
    ktx_uint32_t("glBaseInternalformat")
    ktx_uint32_t("glType")
    ktxTexture1_private.p("_private").private()
}

val ktxTexture2 = struct(Module.KTX, "ktxTexture2", mutable = false) {
    class_id("classId")
    _ktxTexture_vtbl.p("vtbl")
    _ktxTexture_vvtbl.p("vvtbl")
    ktxTexture_protected.p("_protected")
    ktx_bool_t("isArray")
    ktx_bool_t("isCubemap")
    ktx_bool_t("isCompressed")
    ktx_bool_t("generateMipmaps")
    ktx_uint32_t("baseWidth")
    ktx_uint32_t("baseHeight")
    ktx_uint32_t("baseDepth")
    ktx_uint32_t("numDimensions")
    ktx_uint32_t("numLevels")
    ktx_uint32_t("numLayers")
    ktx_uint32_t("numFaces")
    ktxOrientation("orientation")
    ktxHashList("kvDataHead")
    AutoSize("kvData")..ktx_uint32_t("kvDataLen")
    nullable..ktx_uint8_t.p("kvData")
    AutoSize("pData")..ktx_size_t("dataSize")
    ktx_uint8_t.p("pData")
    ktx_uint32_t("vkFormat")
    nullable..ktx_uint32_t.p("pDfd") // TODO:
    ktxSupercmpScheme("supercompressionScheme")
    ktx_bool_t("isVideo")
    ktx_uint32_t("duration")
    ktx_uint32_t("timescale")
    ktx_uint32_t("loopcount")
    ktxTexture2_private.p("_private").private()
}

val ktxTextureCreateInfo = struct(Module.KTX, "ktxTextureCreateInfo") {
    ktx_uint32_t("glInternalformat")
    ktx_uint32_t("vkFormat")
    nullable..ktx_uint32_t.p("pDfd")
    ktx_uint32_t("baseWidth")
    ktx_uint32_t("baseHeight")
    ktx_uint32_t("baseDepth")
    ktx_uint32_t("numDimensions")
    ktx_uint32_t("numLevels")
    ktx_uint32_t("numLayers")
    ktx_uint32_t("numFaces")
    ktx_bool_t("isArray")
    ktx_bool_t("generateMipmaps")
}

val ktxStream_read = Module.KTX.callback {
    ktx_error_code_e(
        "ktxStream_read",

        _ktxStream.p("str"),
        void.p("dst"),
        AutoSize("dst")..ktx_size_t.const("count"),

        nativeType = "ktxStream_read"
    )
}

val ktxStream_skip = Module.KTX.callback {
    ktx_error_code_e(
        "ktxStream_skip",

        _ktxStream.p("str"),
        ktx_size_t.const("count"),

        nativeType = "ktxStream_skip"
    )
}

val ktxStream_write = Module.KTX.callback {
    ktx_error_code_e(
        "ktxStream_write",

        _ktxStream.p("str"),
        void.const.p("src"),
        AutoSize("src")..ktx_size_t.const("size"),
        ktx_size_t.const("count"),

        nativeType = "ktxStream_write"
    )
}

val ktxStream_getpos = Module.KTX.callback {
    ktx_error_code_e(
        "ktxStream_getpos",

        _ktxStream.p("str"),
        Check(1)..ktx_off_t.p.const("offset"),

        nativeType = "ktxStream_getpos"
    )
}

val ktxStream_setpos = Module.KTX.callback {
    ktx_error_code_e(
        "ktxStream_setpos",

        _ktxStream.p("str"),
        ktx_off_t.const("offset"),

        nativeType = "ktxStream_setpos"
    )
}

val ktxStream_getsize = Module.KTX.callback {
    ktx_error_code_e(
        "ktxStream_getsize",

        _ktxStream.p("str"),
        Check(1)..ktx_size_t.p.const("size"),

        nativeType = "ktxStream_getsize"
    )
}

val ktxStream_destruct = Module.KTX.callback {
    void(
        "ktxStream_destruct",

        _ktxStream.p("str"),

        nativeType = "ktxStream_destruct"
    )
}

val ktxStream = struct(Module.KTX, "ktxStream", nativeName = "struct ktxStream") {
    ktxStream_read("read")
    ktxStream_skip("skip")
    ktxStream_write("write")
    ktxStream_getpos("getpos")
    ktxStream_setpos("setpos")
    ktxStream_getsize("getsize")
    ktxStream_destruct("destruct")
    streamType("type")
    union {
        "FILE".opaque.p("file")
        ktxMem.p("mem")
        struct {
            void.p("address")
            nullable..opaque_p("allocatorAddress")
            AutoSize("address")..ktx_size_t("size")
        }("custom_ptr")
    }("data")
    ktx_off_t("readpos")
    ktx_bool_t("closeOnDestruct")
}

val ktxAstcParams = struct(Module.KTX, "ktxAstcParams") {
    ktx_uint32_t("structSize")
    ktx_bool_t("verbose")
    ktx_uint32_t("threadCount")
    ktx_uint32_t("blockDimension")
    ktx_uint32_t("mode")
    ktx_uint32_t("qualityLevel")
    ktx_bool_t("normalMap")
    ktx_bool_t("perceptual")
    char("inputSwizzle")[4]
}

val ktxBasisParams = struct(Module.KTX, "ktxBasisParams") {
    ktx_uint32_t("structSize")
    ktx_bool_t("uastc")
    ktx_bool_t("verbose")
    ktx_bool_t("noSSE")
    ktx_uint32_t("threadCount")
    ktx_uint32_t("compressionLevel")
    ktx_uint32_t("qualityLevel")
    ktx_uint32_t("maxEndpoints")
    float("endpointRDOThreshold")
    ktx_uint32_t("maxSelectors")
    float("selectorRDOThreshold")
    char("inputSwizzle")[4]
    ktx_bool_t("normalMap")
    ktx_bool_t("separateRGToRGB_A")
    ktx_bool_t("preSwizzle")
    ktx_bool_t("noEndpointRDO")
    ktx_bool_t("noSelectorRDO")
    ktx_pack_uastc_flags("uastcFlags")
    ktx_bool_t("uastcRDO")
    float("uastcRDOQualityScalar")
    ktx_uint32_t("uastcRDODictSize")
    float("uastcRDOMaxSmoothBlockErrorScale")
    float("uastcRDOMaxSmoothBlockStdDev")
    ktx_bool_t("uastcRDODontFavorSimplerModes")
    ktx_bool_t("uastcRDONoMultithreading")
}

// ktxvulkan.h

val ktxVulkanFunctions = struct(Module.KTX, "ktxVulkanFunctions") {
    javaImport("org.lwjgl.vulkan.*")

    PFN_vkGetInstanceProcAddr("vkGetInstanceProcAddr")
    "PFN_vkGetDeviceProcAddr".handle("vkGetDeviceProcAddr")
    nullable.."PFN_vkAllocateCommandBuffers".handle("vkAllocateCommandBuffers")
    nullable.."PFN_vkAllocateMemory".handle("vkAllocateMemory")
    nullable.."PFN_vkBeginCommandBuffer".handle("vkBeginCommandBuffer")
    nullable.."PFN_vkBindBufferMemory".handle("vkBindBufferMemory")
    nullable.."PFN_vkBindImageMemory".handle("vkBindImageMemory")
    nullable.."PFN_vkCmdBlitImage".handle("vkCmdBlitImage")
    nullable.."PFN_vkCmdCopyBufferToImage".handle("vkCmdCopyBufferToImage")
    nullable.."PFN_vkCmdPipelineBarrier".handle("vkCmdPipelineBarrier")
    nullable.."PFN_vkCreateImage".handle("vkCreateImage")
    nullable.."PFN_vkDestroyImage".handle("vkDestroyImage")
    nullable.."PFN_vkCreateBuffer".handle("vkCreateBuffer")
    nullable.."PFN_vkDestroyBuffer".handle("vkDestroyBuffer")
    nullable.."PFN_vkCreateFence".handle("vkCreateFence")
    nullable.."PFN_vkDestroyFence".handle("vkDestroyFence")
    nullable.."PFN_vkEndCommandBuffer".handle("vkEndCommandBuffer")
    nullable.."PFN_vkFreeCommandBuffers".handle("vkFreeCommandBuffers")
    nullable.."PFN_vkFreeMemory".handle("vkFreeMemory")
    nullable.."PFN_vkGetBufferMemoryRequirements".handle("vkGetBufferMemoryRequirements")
    nullable.."PFN_vkGetImageMemoryRequirements".handle("vkGetImageMemoryRequirements")
    nullable.."PFN_vkGetImageSubresourceLayout".handle("vkGetImageSubresourceLayout")
    nullable.."PFN_vkGetPhysicalDeviceImageFormatProperties".handle("vkGetPhysicalDeviceImageFormatProperties")
    nullable.."PFN_vkGetPhysicalDeviceFormatProperties".handle("vkGetPhysicalDeviceFormatProperties")
    nullable.."PFN_vkGetPhysicalDeviceMemoryProperties".handle("vkGetPhysicalDeviceMemoryProperties")
    nullable.."PFN_vkMapMemory".handle("vkMapMemory")
    nullable.."PFN_vkQueueSubmit".handle("vkQueueSubmit")
    nullable.."PFN_vkQueueWaitIdle".handle("vkQueueWaitIdle")
    nullable.."PFN_vkUnmapMemory".handle("vkUnmapMemory")
    nullable.."PFN_vkWaitForFences".handle("vkWaitForFences")

    customMethod("""
    /**
     * Helper method that populates this struct with required Vulkan function pointers from the specified Vulkan instance and device.
     *
     * @param instance a Vulkan instance
     * @param device   a Vulkan device
     */
    public ktxVulkanFunctions set(VkInstance instance, VkDevice device) {
        VKCapabilitiesInstance ic = instance.getCapabilities();
        VKCapabilitiesDevice   dc = device.getCapabilities();
        this
            .vkGetInstanceProcAddr(VK.getFunctionProvider().getFunctionAddress("vkGetInstanceProcAddr"))
            .vkGetDeviceProcAddr(dc.vkGetDeviceProcAddr)
            .vkAllocateCommandBuffers(dc.vkAllocateCommandBuffers)
            .vkAllocateMemory(dc.vkAllocateMemory)
            .vkBeginCommandBuffer(dc.vkBeginCommandBuffer)
            .vkBindBufferMemory(dc.vkBindBufferMemory)
            .vkBindImageMemory(dc.vkBindImageMemory)
            .vkCmdBlitImage(dc.vkCmdBlitImage)
            .vkCmdCopyBufferToImage(dc.vkCmdCopyBufferToImage)
            .vkCmdPipelineBarrier(dc.vkCmdPipelineBarrier)
            .vkCreateImage(dc.vkCreateImage)
            .vkDestroyImage(dc.vkDestroyImage)
            .vkCreateBuffer(dc.vkCreateBuffer)
            .vkDestroyBuffer(dc.vkDestroyBuffer)
            .vkCreateFence(dc.vkCreateFence)
            .vkDestroyFence(dc.vkDestroyFence)
            .vkEndCommandBuffer(dc.vkEndCommandBuffer)
            .vkFreeCommandBuffers(dc.vkFreeCommandBuffers)
            .vkFreeMemory(dc.vkFreeMemory)
            .vkGetBufferMemoryRequirements(dc.vkGetBufferMemoryRequirements)
            .vkGetImageMemoryRequirements(dc.vkGetImageMemoryRequirements)
            .vkGetImageSubresourceLayout(dc.vkGetImageSubresourceLayout)
            .vkGetPhysicalDeviceImageFormatProperties(ic.vkGetPhysicalDeviceImageFormatProperties)
            .vkGetPhysicalDeviceFormatProperties(ic.vkGetPhysicalDeviceFormatProperties)
            .vkGetPhysicalDeviceMemoryProperties(ic.vkGetPhysicalDeviceMemoryProperties)
            .vkMapMemory(dc.vkMapMemory)
            .vkQueueSubmit(dc.vkQueueSubmit)
            .vkQueueWaitIdle(dc.vkQueueWaitIdle)
            .vkUnmapMemory(dc.vkUnmapMemory)
            .vkWaitForFences(dc.vkWaitForFences);
        return this;
    }""")
}

val ktxVulkanTexture = struct(Module.KTX, "ktxVulkanTexture", mutable = false) {
    "PFN_vkDestroyImage".handle("vkDestroyImage")
    "PFN_vkFreeMemory".handle("vkFreeMemory")
    VkImage("image")
    VkFormat("imageFormat")
    VkImageLayout("imageLayout")
    VkDeviceMemory("deviceMemory")
    VkImageViewType("viewType")
    uint32_t("width")
    uint32_t("height")
    uint32_t("depth")
    uint32_t("levelCount")
    uint32_t("layerCount")
    uint64_t("allocationId")
}

val ktxVulkanTexture_subAllocatorAllocMemFuncPtr = Module.KTX.callback {
    void.p(
        "ktxVulkanTexture_subAllocatorAllocMemFuncPtr",

        VkMemoryAllocateInfo.p("allocInfo"),
        VkMemoryRequirements.p("memReq"),
        Check(1)..uint64_t.p("pageCount")
    ) {}
}
val ktxVulkanTexture_subAllocatorBindBufferFuncPtr = Module.KTX.callback {
    void.p(
        "ktxVulkanTexture_subAllocatorBindBufferFuncPtr",

        VkBuffer("buffer"),
        uint64_t("allocId")
    ) {}
}
val ktxVulkanTexture_subAllocatorBindImageFuncPtr = Module.KTX.callback {
    void.p(
        "ktxVulkanTexture_subAllocatorBindImageFuncPtr",

        VkImage("image"),
        uint64_t("allocId")
    ) {}
}
val ktxVulkanTexture_subAllocatorMemoryMapFuncPtr = Module.KTX.callback {
    void.p(
        "ktxVulkanTexture_subAllocatorMemoryMapFuncPtr",

        uint64_t("allocId"),
        uint64_t("pageNumber"),
        Check(1)..VkDeviceSize.p("mapLength"),
        Check(1)..void.p.p("dataPtr")
    ) {}
}
val ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr = Module.KTX.callback {
    void.p(
        "ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr",

        uint64_t("allocId"),
        uint64_t("pageNumber")
    ) {}
}
val ktxVulkanTexture_subAllocatorFreeMemFuncPtr = Module.KTX.callback {
    void.p(
        "ktxVulkanTexture_subAllocatorFreeMemFuncPtr",

        uint64_t("allocId")
    ) {}
}

val ktxVulkanTexture_subAllocatorCallbacks = struct(Module.KTX, "ktxVulkanTexture_subAllocatorCallbacks") {
    ktxVulkanTexture_subAllocatorAllocMemFuncPtr("allocMemFuncPtr")
    ktxVulkanTexture_subAllocatorBindBufferFuncPtr("bindBufferFuncPtr")
    ktxVulkanTexture_subAllocatorBindImageFuncPtr("bindImageFuncPtr")
    ktxVulkanTexture_subAllocatorMemoryMapFuncPtr("memoryMapFuncPtr")
    ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr("memoryUnmapFuncPtr")
    ktxVulkanTexture_subAllocatorFreeMemFuncPtr("freeMemFuncPtr")
}

val ktxVulkanDeviceInfo = struct(Module.KTX, "ktxVulkanDeviceInfo") {
    javaImport("org.lwjgl.vulkan.*")

    VkInstance("instance")
    VkPhysicalDevice("physicalDevice")
    VkDevice("device")
    VkQueue("queue")
    VkCommandBuffer("cmdBuffer")
    VkCommandPool("cmdPool")
    nullable..VkAllocationCallbacks.const.p("pAllocator")
    VkPhysicalDeviceMemoryProperties("deviceMemoryProperties")
    ktxVulkanFunctions("vkFuncs")
}