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

val khr_df_transfer_e = "khr_df_transfer_e".enumType
val khr_df_model_e = "khr_df_model_e".enumType

val GLboolean = typedef(unsigned_char, "GLboolean")
val GLenum = typedef(unsigned_int, "GLenum")
val GLint = typedef(int, "GLint")
val GLsizei = typedef(int, "GLsizei")
val GLubyte = typedef(unsigned_char, "GLubyte")
val GLuint = typedef(unsigned_int, "GLuint")

val ktxOrientation = struct(Module.KTX, "ktxOrientation", nativeName = "struct ktxOrientation", mutable = false) {
    documentation = "Struct describing the logical orientation of an image."

    ktxOrientationX("x", "orientation in X")
    ktxOrientationY("y", "orientation in Y")
    ktxOrientationZ("z", "orientation in Z")
}

val _ktxTexture_vtbl = struct(Module.KTX, "ktxTexture_vtbl", nativeName = "struct ktxTexture_vtbl")
val _ktxTexture_vvtbl = "struct ktxTexture_vvtbl".opaque

val ktxTexture = struct(Module.KTX, "ktxTexture", mutable = false) {
    documentation =
        """
        Base class representing a texture.

        ktxTextures should be created only by one of the provided functions and these fields should be considered read-only.
        """

    class_id(
        "classId",
        "since there are no public {@code ktxTexture} constructors, this can only have values of {@code ktxTexture1_c or} {@code ktxTexture2_c}"
    )
    _ktxTexture_vtbl.p("vtbl", "pointer to the class's vtble")
    _ktxTexture_vvtbl.p("vvtbl", "pointer to the class's vtble for Vulkan functions")
    ktxTexture_protected.p("_protected", "opaque pointer to the class's protected variables")
    ktx_bool_t("isArray", "#TRUE if the texture is an array texture, i.e, a {@code GL_TEXTURE*_ARRAY} target is to be used")
    ktx_bool_t("isCubemap", "#TRUE if the texture is a cubemap or cubemap array")
    ktx_bool_t("isCompressed", "#TRUE if the texture's format is a block compressed format")
    ktx_bool_t("generateMipmaps", "#TRUE if mipmaps should be generated for the texture by #Texture_GLUpload() or #Texture_VkUpload()")
    ktx_uint32_t("baseWidth", "width of the texture's base level")
    ktx_uint32_t("baseHeight", "height of the texture's base level")
    ktx_uint32_t("baseDepth", "depth of the texture's base level")
    ktx_uint32_t("numDimensions", "number of dimensions in the texture: 1, 2 or 3.")
    ktx_uint32_t(
        "numLevels",
        """
        number of mip levels in the texture.

        Must be 1, if {@code generateMipmaps} is #TRUE. Can be less than a full pyramid but always starts at the base level.
        """
    )
    ktx_uint32_t("numLayers", "number of array layers in the texture")
    ktx_uint32_t("numFaces", "number of faces: 6 for cube maps, 1 otherwise")
    ktxOrientation("orientation", "describes the logical orientation of the images in each dimension")
    ktxHashList("kvDataHead", "head of the hash list of metadata")
    AutoSize("kvData")..ktx_uint32_t("kvDataLen", "length of the metadata, if it has been extracted in its raw form, otherwise 0")
    nullable..ktx_uint8_t.p("kvData", "pointer to the metadata, if it has been extracted in its raw form, otherwise #NULL")
    AutoSize("pData")..ktx_size_t("dataSize", "byte length of the texture's uncompressed image data")
    ktx_uint8_t.p("pData", "pointer to the start of the image data")
}

val PFNKTXITERCB = Module.KTX.callback {
    ktx_error_code_e(
        "PFNKTXITERCB",
        """
        Signature of function called by the {@code ktxTexture_Iterate*} functions to receive image data.

        The function parameters are used to pass values which change for each image. Obtain values which are uniform across all images from the
        {@code ktxTexture} object.
        """,

        int("miplevel", "MIP level from 0 to the max level which is dependent on the texture size"),
        int("face", "usually 0; for cube maps, one of the 6 cube faces in the order +X, -X, +Y, -Y, +Z, -Z, 0 to 5"),
        int("width", "width of the image"),
        int("height", "height of the image or, for 1D textures textures, 1"),
        int("depth", "depth of the image or, for 1D &amp; 2D textures, 1"),
        AutoSize("pixels")..ktx_uint64_t("faceLodSize", "number of bytes of data pointed at by {@code pixels}"),
        void.p("pixels", "pointer to the image data"),
        nullable..opaque_p("userdata", "pointer for the application to pass data to and from the callback function"),

        nativeType = "PFNKTXITERCB"
    ) {
        callingConvention = CallingConvention.DEFAULT
    }
}

val ktxTexture_vtbl = struct(Module.KTX, "ktxTexture_vtbl", nativeName = "struct ktxTexture_vtbl", mutable = false) {
    documentation = " Table of virtual {@code ktxTexture} methods."

    "PFNKTEXDESTROY".handle("Destroy", "")
    "PFNKTEXGETIMAGEOFFSET".handle("GetImageOffset", "")
    "PFNKTEXGETDATASIZEUNCOMPRESSED".handle("GetDataSizeUncompressed", "")
    "PFNKTEXGETIMAGESIZE".handle("GetImageSize", "")
    "PFNKTEXITERATELEVELS".handle("IterateLevels", "")
    "PFNKTEXITERATELOADLEVELFACES".handle("IterateLoadLevelFaces", "")
    "PFNKTEXNEEDSTRANSCODING".handle("NeedsTranscoding", "")
    "PFNKTEXLOADIMAGEDATA".handle("LoadImageData", "")
    "PFNKTEXSETIMAGEFROMMEMORY".handle("SetImageFromMemory", "")
    "PFNKTEXSETIMAGEFROMSTDIOSTREAM".handle("SetImageFromStdioStream", "")
    "PFNKTEXWRITETOSTDIOSTREAM".handle("WriteToStdioStream", "")
    "PFNKTEXWRITETONAMEDFILE".handle("WriteToNamedFile", "")
    "PFNKTEXWRITETOMEMORY".handle("WriteToMemory", "")
    "PFNKTEXWRITETOSTREAM".handle("WriteToStream", "")
}

val ktxTexture1 = struct(Module.KTX, "ktxTexture1", mutable = false) {
    documentation =
        """
        Class representing a KTX version 1 format texture.

        {@code ktxTextures} should be created only by one of the {@code ktxTexture_Create*} functions and these fields should be considered read-only.
        """

    class_id("classId", "").links("#ktxTexture1_c")
    _ktxTexture_vtbl.p("vtbl", "pointer to the class's vtble")
    _ktxTexture_vvtbl.p("vvtbl", "pointer to the class's vtble for Vulkan functions")
    ktxTexture_protected.p("_protected", "opaque pointer to the class's protected variables")
    ktx_bool_t("isArray", "#TRUE if the texture is an array texture, i.e, a {@code GL_TEXTURE*_ARRAY} target is to be used")
    ktx_bool_t("isCubemap", "#TRUE if the texture is a cubemap or cubemap array")
    ktx_bool_t("isCompressed", "#TRUE if the texture's format is a block compressed format")
    ktx_bool_t("generateMipmaps", "#TRUE if mipmaps should be generated for the texture by #Texture_GLUpload() or #Texture_VkUpload()")
    ktx_uint32_t("baseWidth", "width of the texture's base level")
    ktx_uint32_t("baseHeight", "height of the texture's base level")
    ktx_uint32_t("baseDepth", "depth of the texture's base level")
    ktx_uint32_t("numDimensions", "number of dimensions in the texture: 1, 2 or 3.")
    ktx_uint32_t(
        "numLevels",
        """
        number of mip levels in the texture.

        Must be 1, if {@code generateMipmaps} is #TRUE. Can be less than a full pyramid but always starts at the base level.
        """
    )
    ktx_uint32_t("numLayers", "number of array layers in the texture")
    ktx_uint32_t("numFaces", "number of faces: 6 for cube maps, 1 otherwise")
    ktxOrientation("orientation", "describes the logical orientation of the images in each dimension")
    ktxHashList("kvDataHead", "head of the hash list of metadata")
    AutoSize("kvData")..ktx_uint32_t("kvDataLen", "length of the metadata, if it has been extracted in its raw form, otherwise 0")
    nullable..ktx_uint8_t.p("kvData", "pointer to the metadata, if it has been extracted in its raw form, otherwise #NULL")
    AutoSize("pData")..ktx_size_t("dataSize", "byte length of the texture's uncompressed image data")
    ktx_uint8_t.p("pData", "pointer to the start of the image data")
    ktx_uint32_t("glFormat", "format of the texture data, e.g., {@code GL_RGB}")
    ktx_uint32_t("glInternalformat", "internal format of the texture data, e.g., {@code GL_RGB8}")
    ktx_uint32_t("glBaseInternalformat", "base format of the texture data, e.g., {@code GL_RGB}")
    ktx_uint32_t("glType", "type of the texture data, e.g, {@code GL_UNSIGNED_BYTE}")
    ktxTexture1_private.p("_private", "private data").private()
}

val ktxTexture2 = struct(Module.KTX, "ktxTexture2", mutable = false) {
    documentation =
        """
        Class representing a KTX version 2 format texture.

        {@code ktxTextures} should be created only by one of the {@code ktxTexture_Create*} functions and these fields should be considered read-only.
        """

    class_id("classId", "").links("#ktxTexture2_c")
    _ktxTexture_vtbl.p("vtbl", "pointer to the class's vtble")
    _ktxTexture_vvtbl.p("vvtbl", "pointer to the class's vtble for Vulkan functions")
    ktxTexture_protected.p("_protected", "opaque pointer to the class's protected variables")
    ktx_bool_t("isArray", "#TRUE if the texture is an array texture, i.e, a {@code GL_TEXTURE*_ARRAY} target is to be used")
    ktx_bool_t("isCubemap", "#TRUE if the texture is a cubemap or cubemap array")
    ktx_bool_t("isCompressed", "#TRUE if the texture's format is a block compressed format")
    ktx_bool_t("generateMipmaps", "#TRUE if mipmaps should be generated for the texture by #Texture_GLUpload() or #Texture_VkUpload()")
    ktx_uint32_t("baseWidth", "width of the texture's base level")
    ktx_uint32_t("baseHeight", "height of the texture's base level")
    ktx_uint32_t("baseDepth", "depth of the texture's base level")
    ktx_uint32_t("numDimensions", "number of dimensions in the texture: 1, 2 or 3.")
    ktx_uint32_t(
        "numLevels",
        """
        number of mip levels in the texture.

        Must be 1, if {@code generateMipmaps} is #TRUE. Can be less than a full pyramid but always starts at the base level.
        """
    )
    ktx_uint32_t("numLayers", "number of array layers in the texture")
    ktx_uint32_t("numFaces", "number of faces: 6 for cube maps, 1 otherwise")
    ktxOrientation("orientation", "describes the logical orientation of the images in each dimension")
    ktxHashList("kvDataHead", "head of the hash list of metadata")
    AutoSize("kvData")..ktx_uint32_t("kvDataLen", "length of the metadata, if it has been extracted in its raw form, otherwise 0")
    nullable..ktx_uint8_t.p("kvData", "pointer to the metadata, if it has been extracted in its raw form, otherwise #NULL")
    AutoSize("pData")..ktx_size_t("dataSize", "byte length of the texture's uncompressed image data")
    ktx_uint8_t.p("pData", "pointer to the start of the image data")
    ktx_uint32_t("vkFormat", "")
    nullable..ktx_uint32_t.p("pDfd", "") // TODO:
    ktxSupercmpScheme("supercompressionScheme", "")
    ktx_bool_t("isVideo", "")
    ktx_uint32_t("duration", "")
    ktx_uint32_t("timescale", "")
    ktx_uint32_t("loopcount", "")
    ktxTexture2_private.p("_private", "private data").private()
}

val ktxTextureCreateInfo = struct(Module.KTX, "ktxTextureCreateInfo") {
    documentation = "Structure for passing texture information to #Texture1_Create() and #Texture2_Create()."

    ktx_uint32_t("glInternalformat", "internal format for the texture, e.g., {@code GL_RGB8}. Ignored when creating a {@code ktxTexture2}.")
    ktx_uint32_t("vkFormat", "{@code vkFormat} for texture. Ignored when creating a {@code ktxTexture1}.")
    nullable..ktx_uint32_t.p(
        "pDfd",
        "pointer to DFD. Used only when creating a {@code ktxTexture2} and only if {@code vkFormat} is {@code VK_FORMAT_UNDEFINED}."
    )
    ktx_uint32_t("baseWidth", "width of the base level of the texture")
    ktx_uint32_t("baseHeight", "height of the base level of the texture")
    ktx_uint32_t("baseDepth", "depth of the base level of the texture")
    ktx_uint32_t("numDimensions", "number of dimensions in the texture, 1, 2 or 3")
    ktx_uint32_t("numLevels", "number of mip levels in the texture. Should be 1 if {@code generateMipmaps} is #TRUE.")
    ktx_uint32_t("numLayers", "number of array layers in the texture")
    ktx_uint32_t("numFaces", "number of faces: 6 for cube maps, 1 otherwise")
    ktx_bool_t("isArray", "set to #TRUE if the texture is to be an array texture. Means OpenGL will use a {@code GL_TEXTURE_*_ARRAY} target.")
    ktx_bool_t("generateMipmaps", "set to #TRUE if mipmaps should be generated for the texture when loading into a 3D API")
}

val ktxStream_read = Module.KTX.callback {
    ktx_error_code_e(
        "ktxStream_read",
        "Type for a pointer to a stream reading function.",

        _ktxStream.p("str", ""),
        void.p("dst", ""),
        AutoSize("dst")..ktx_size_t.const("count", ""),

        nativeType = "ktxStream_read"
    )
}

val ktxStream_skip = Module.KTX.callback {
    ktx_error_code_e(
        "ktxStream_skip",
        "Type for a pointer to a stream skipping function.",

        _ktxStream.p("str", ""),
        ktx_size_t.const("count", ""),

        nativeType = "ktxStream_skip"
    )
}

val ktxStream_write = Module.KTX.callback {
    ktx_error_code_e(
        "ktxStream_write",
        "Type for a pointer to a stream writing function.",

        _ktxStream.p("str", ""),
        void.const.p("src", ""),
        AutoSize("src")..ktx_size_t.const("size", ""),
        ktx_size_t.const("count", ""),

        nativeType = "ktxStream_write"
    )
}

val ktxStream_getpos = Module.KTX.callback {
    ktx_error_code_e(
        "ktxStream_getpos",
        "Type for a pointer to a stream position query function.",

        _ktxStream.p("str", ""),
        Check(1)..ktx_off_t.p.const("offset", ""),

        nativeType = "ktxStream_getpos"
    )
}

val ktxStream_setpos = Module.KTX.callback {
    ktx_error_code_e(
        "ktxStream_setpos",
        "Type for a pointer to a stream position query function.",

        _ktxStream.p("str", ""),
        ktx_off_t.const("offset", ""),

        nativeType = "ktxStream_setpos"
    )
}

val ktxStream_getsize = Module.KTX.callback {
    ktx_error_code_e(
        "ktxStream_getsize",
        "Type for a pointer to a stream size query function",

        _ktxStream.p("str", ""),
        Check(1)..ktx_size_t.p.const("size", ""),

        nativeType = "ktxStream_getsize"
    )
}

val ktxStream_destruct = Module.KTX.callback {
    void(
        "ktxStream_destruct",
        "Destruct a stream.",

        _ktxStream.p("str", ""),

        nativeType = "ktxStream_destruct"
    )
}

val ktxStream = struct(Module.KTX, "ktxStream", nativeName = "struct ktxStream") {
    documentation = "Interface of {@code ktxStream}."

    ktxStream_read("read", "pointer to function for reading bytes")
    ktxStream_skip("skip", "pointer to function for skipping bytes")
    ktxStream_write("write", "pointer to function for writing bytes")
    ktxStream_getpos("getpos", "pointer to function for getting current position in stream")
    ktxStream_setpos("setpos", "pointer to function for setting current position in stream")
    ktxStream_getsize("getsize", "pointer to function for querying size")
    ktxStream_destruct("destruct", "destruct the stream")
    streamType("type", "")
    union {
        "FILE".opaque.p("file", "a {@code stdio} {@code FILE} pointer for a {@code ktxFileStream}")
        ktxMem.p("mem", "a pointer to a {@code ktxMem} struct for a {@code ktxMemStream}")
        struct {
            void.p("address", "pointer to the data")
            nullable..opaque_p("allocatorAddress", "pointer to a memory allocator")
            AutoSize("address")..ktx_size_t("size", "size of the data")
        }("custom_ptr", "pointer to a struct for custom streams")
    }("data", "pointer to the stream data")
    ktx_off_t("readpos", "used by {@code FileStream} for {@code stdin}")
    ktx_bool_t("closeOnDestruct", "close {@code FILE*} or dispose of memory on destruct")
}

val ktxAstcParams = struct(Module.KTX, "ktxAstcParams") {
    documentation =
        """
        Structure for passing extended parameters to {@code ktxTexture_CompressAstc}.

        Passing a struct initialized to 0 will use {@code blockDimension} 4x4, {@code mode} {@code LDR} and {@code qualityLevel} {@code FASTEST}. Setting
        {@code qualityLevel} to #PACK_ASTC_QUALITY_LEVEL_MEDIUM is recommended.
        """

    ktx_uint32_t(
        "structSize",
        """
        Size of this struct.

        Used so library can tell which version of struct is being passed.
        """
    )
    ktx_bool_t(
        "verbose",
        """
        If true, prints Astc encoder operation details to {@code stdout}.

        Not recommended for GUI apps.
        """
    )
    ktx_uint32_t("threadCount", "Number of threads used for compression. Default is 1.")
    ktx_uint32_t("blockDimension", "Combinations of block dimensions that astcenc supports")
    ktx_uint32_t("mode", "Can be {ldr/hdr} from astcenc")
    ktx_uint32_t("qualityLevel", "astcenc supports -fastest, -fast, -medium, -thorough, -exhaustive")
    ktx_bool_t(
        "normalMap",
        """
        Tunes codec parameters for better quality on normal maps.
        
        In this mode normals are compressed to X,Y components, Discarding Z component, reader will need to generate Z component in shaders.
        """
    )
    ktx_bool_t(
        "perceptual",
        """
        The codec should optimize for perceptual error, instead of direct RMS error.
        
        This aims to improves perceived image quality, but typically lowers the measured PSNR score. Perceptual methods are currently only available for normal
        maps and RGB color data.
        """
    )
    char("inputSwizzle", "A swizzle to provide as input to astcenc. It must match the regular expression {@code /^[rgba01]{4}$/}.")[4]
}

val ktxBasisParams = struct(Module.KTX, "ktxBasisParams") {
    documentation =
        """
        Structure for passing extended parameters to #Texture2_CompressBasisEx().

        If you only want default values, use #Texture2_CompressBasis(). Here, at a minimum you must initialize the structure as follows:

        ${codeBlock("""
  ktxBasisParams params = {0};
  params.structSize = sizeof(params);
  params.compressionLevel = KTX_ETC1S_DEFAULT_COMPRESSION_LEVEL;""")}

        {@code compressionLevel} has to be explicitly set because 0 is a valid {@code compressionLevel} but is not the default used by the BasisU encoder
        when no value is set. Only the other settings that are to be non-default must be non-zero.
        """

    ktx_uint32_t(
        "structSize",
        """
        Size of this struct.

        Used so library can tell which version of struct is being passed.
        """
    )
    ktx_bool_t("uastc", "True to use UASTC base, false to use ETC1S base.")
    ktx_bool_t(
        "verbose",
        """
        If true, prints Basis Universal encoder operation details to {@code stdout}.

        Not recommended for GUI apps.
        """
    )
    ktx_bool_t(
        "noSSE",
        """
        True to forbid use of the SSE instruction set.

        Ignored if CPU does not support SSE.
        """
    )
    ktx_uint32_t("threadCount", "Number of threads used for compression. Default is 1.")
    ktx_uint32_t(
        "compressionLevel",
        """
        Encoding speed vs. quality tradeoff.

        Range is {@code [0,5]}. Higher values are slower, but give higher quality. There is no default. Callers must explicitly set this value. Callers can use
        {@link KTX\#KTX_ETC1S_DEFAULT_COMPRESSION_LEVEL ETC1S_DEFAULT_COMPRESSION_LEVEL} as a default value. Currently this is 2.
        """
    )
    ktx_uint32_t(
        "qualityLevel",
        """
        Compression quality.

        Range is {@code [1,255]}. Lower gives better compression/lower quality/faster. Higher gives less compression/higher quality/slower. This automatically
        determines values for {@code maxEndpoints}, {@code maxSelectors}, {@code endpointRDOThreshold} and {@code selectorRDOThreshold} for the target quality
        level. Setting these parameters overrides the values determined by {@code qualityLevel} which defaults to 128 if neither it nor both of
        {@code maxEndpoints} and {@code maxSelectors} have been set.

        Note: Both of {@code maxEndpoints} and {@code maxSelectors} must be set for them to have any effect. {@code qualityLevel will} only determine values
        for {@code endpointRDOThreshold} and {@code selectorRDOThreshold} when its value exceeds 128, otherwise their defaults will be used.
        """
    )
    ktx_uint32_t(
        "maxEndpoints",
        """
        Manually set the max number of color endpoint clusters.

        Range is {@code [1,16128]}. Default is 0, unset. If this is set, {@code maxSelectors} must also be set, otherwise the value will be ignored.
        """
    )
    float(
        "endpointRDOThreshold",
        """
        Set endpoint RDO quality threshold.

        The default is 1.25. Lower is higher quality but less quality per output bit (try {@code [1.0,3.0]}). This will override the value chosen by
        {@code qualityLevel}.
        """
    )
    ktx_uint32_t(
        "maxSelectors",
        """
        Manually set the max number of color selector clusters.

        Range is {@code [1,16128]}. Default is 0, unset. If this is set, {@code maxEndpoints} must also be set, otherwise the value will be ignored.
        """
    )
    float(
        "selectorRDOThreshold",
        """
        Set selector RDO quality threshold.

        The default is 1.5. Lower is higher quality but less quality per output bit (try {@code [1.0,3.0]}). This will override the value chosen by
        {@code qualityLevel}.
        """
    )
    char(
        "inputSwizzle",
        """
        A swizzle to apply before encoding.
        
        It must match the regular expression {@code /^[rgba01]{4}$/}. If both this and {@code preSwizzle} are specified #Texture2_CompressBasisEx() will raise
        #INVALID_OPERATION.
        """
    )[4]
    ktx_bool_t(
        "normalMap",
        """
        Tunes codec parameters for better quality on normal maps (no selector RDO, no endpoint RDO) and sets the texture's DFD appropriately.

        Only valid for linear textures.
        """
    )
    ktx_bool_t("separateRGToRGB_A", "deprecated")
    ktx_bool_t(
        "preSwizzle",
        """
        If the texture has {@code KTXswizzle} metadata, apply it before compressing.

        Swizzling, like {@code rabb} may yield drastically different error metrics if done after supercompression.
        """
    )
    ktx_bool_t(
        "noEndpointRDO",
        """
        Disable endpoint rate distortion optimizations.

        Slightly faster, less noisy output, but lower quality per output bit. Default is #FALSE.
        """
    )
    ktx_bool_t(
        "noSelectorRDO",
        """
        Disable selector rate distortion optimizations.

        Slightly faster, less noisy output, but lower quality per output bit. Default is #FALSE.
        """
    )
    ktx_pack_uastc_flags("uastcFlags", "A set of {@code ktx_pack_uastc_flag_bits_e} controlling UASTC encoding.")
    ktx_bool_t("uastcRDO", "Enable Rate Distortion Optimization (RDO) post-processing.")
    float(
        "uastcRDOQualityScalar",
        """
        UASTC RDO quality scalar (lambda).

        Lower values yield higher quality/larger LZ compressed files, higher values yield lower quality/smaller LZ compressed files. A good range to try is
        {@code [.2,4]}. Full range is {@code [.001,50.0]}. Default is 1.0.
        """
    )
    ktx_uint32_t(
        "uastcRDODictSize",
        """
        UASTC RDO dictionary size in bytes.

        Default is 4096. Lower values=faster, but give less compression. Range is {@code [64,65536]}.
        """
    )
    float(
        "uastcRDOMaxSmoothBlockErrorScale",
        """
        UASTC RDO max smooth block error scale.

        Range is {@code [1,300]}. Default is 10.0, 1.0 is disabled. Larger values suppress more artifacts (and allocate more bits) on smooth blocks.
        """
    )
    float(
        "uastcRDOMaxSmoothBlockStdDev",
        """
        UASTC RDO max smooth block standard deviation.

        Range is {@code [.01,65536.0]}. Default is 18.0. Larger values expand the range of blocks considered smooth.
        """
    )
    ktx_bool_t("uastcRDODontFavorSimplerModes", "Do not favor simpler UASTC modes in RDO mode.")
    ktx_bool_t("uastcRDONoMultithreading", "Disable RDO multithreading (slightly higher compression, deterministic).")
}

// ktxvulkan.h

val ktxVulkanFunctions = struct(Module.KTX, "ktxVulkanFunctions") {
    javaImport("org.lwjgl.vulkan.*")

    documentation =
        """
        Struct for applications to pass Vulkan function pointers to the #Texture_VkUpload() functions via a {@code ktxVulkanDeviceInfo} struct.

        {@code vkGetInstanceProcAddr} and {@code vkGetDeviceProcAddr} should be set, others are optional.
        """

    PFN_vkGetInstanceProcAddr("vkGetInstanceProcAddr", "these are functions pointers we need to perform our vulkan duties")
    "PFN_vkGetDeviceProcAddr".handle("vkGetDeviceProcAddr", "")
    nullable.."PFN_vkAllocateCommandBuffers".handle("vkAllocateCommandBuffers", "")
    nullable.."PFN_vkAllocateMemory".handle("vkAllocateMemory", "")
    nullable.."PFN_vkBeginCommandBuffer".handle("vkBeginCommandBuffer", "")
    nullable.."PFN_vkBindBufferMemory".handle("vkBindBufferMemory", "")
    nullable.."PFN_vkBindImageMemory".handle("vkBindImageMemory", "")
    nullable.."PFN_vkCmdBlitImage".handle("vkCmdBlitImage", "")
    nullable.."PFN_vkCmdCopyBufferToImage".handle("vkCmdCopyBufferToImage", "")
    nullable.."PFN_vkCmdPipelineBarrier".handle("vkCmdPipelineBarrier", "")
    nullable.."PFN_vkCreateImage".handle("vkCreateImage", "")
    nullable.."PFN_vkDestroyImage".handle("vkDestroyImage", "")
    nullable.."PFN_vkCreateBuffer".handle("vkCreateBuffer", "")
    nullable.."PFN_vkDestroyBuffer".handle("vkDestroyBuffer", "")
    nullable.."PFN_vkCreateFence".handle("vkCreateFence", "")
    nullable.."PFN_vkDestroyFence".handle("vkDestroyFence", "")
    nullable.."PFN_vkEndCommandBuffer".handle("vkEndCommandBuffer", "")
    nullable.."PFN_vkFreeCommandBuffers".handle("vkFreeCommandBuffers", "")
    nullable.."PFN_vkFreeMemory".handle("vkFreeMemory", "")
    nullable.."PFN_vkGetBufferMemoryRequirements".handle("vkGetBufferMemoryRequirements", "")
    nullable.."PFN_vkGetImageMemoryRequirements".handle("vkGetImageMemoryRequirements", "")
    nullable.."PFN_vkGetImageSubresourceLayout".handle("vkGetImageSubresourceLayout", "")
    nullable.."PFN_vkGetPhysicalDeviceImageFormatProperties".handle("vkGetPhysicalDeviceImageFormatProperties", "")
    nullable.."PFN_vkGetPhysicalDeviceFormatProperties".handle("vkGetPhysicalDeviceFormatProperties", "")
    nullable.."PFN_vkGetPhysicalDeviceMemoryProperties".handle("vkGetPhysicalDeviceMemoryProperties", "")
    nullable.."PFN_vkMapMemory".handle("vkMapMemory", "")
    nullable.."PFN_vkQueueSubmit".handle("vkQueueSubmit", "")
    nullable.."PFN_vkQueueWaitIdle".handle("vkQueueWaitIdle", "")
    nullable.."PFN_vkUnmapMemory".handle("vkUnmapMemory", "")
    nullable.."PFN_vkWaitForFences".handle("vkWaitForFences", "")

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
    documentation =
        """
        Struct for returning information about the Vulkan texture image created by the {@code ktxTexture_VkUpload*} functions.

        Creation of these objects is internal to the upload functions.
        """

    "PFN_vkDestroyImage".handle("vkDestroyImage", "pointer to {@code vkDestroyImage} function")
    "PFN_vkFreeMemory".handle("vkFreeMemory", "pointer to {@code vkFreeMemory} function")
    VkImage("image", "handle to the Vulkan image created by the loader")
    VkFormat("imageFormat", "format of the image data")
    VkImageLayout("imageLayout", "layout of the created image. Has the same value as {@code layout} parameter passed to the loader.")
    VkDeviceMemory("deviceMemory", "the memory allocated for the image on the Vulkan device")
    VkImageViewType("viewType", "viewType corresponding to {@code image}. Reflects the dimensionality, cubeness and arrayness of the image.")
    uint32_t("width", "the width of the image")
    uint32_t("height", "the height of the image")
    uint32_t("depth", "the depth of the image")
    uint32_t("levelCount", "the number of MIP levels in the image")
    uint32_t("layerCount", "the number of array layers in the image")
}

val ktxVulkanDeviceInfo = struct(Module.KTX, "ktxVulkanDeviceInfo") {
    javaImport("org.lwjgl.vulkan.*")

    documentation =
        """
        Struct for passing information about the Vulkan device on which to create images to the texture image loading functions.

        Avoids passing a large number of parameters to each loading function. Use of #VulkanDeviceInfo_Create() or #VulkanDeviceInfo_Construct() to populate
        this structure is highly recommended.

        ${codeBlock("""
    ktxVulkanDeviceInfo vdi;
    ktxVulkanTexture texture;
 
    vdi = ktxVulkanDeviceInfo_create(physicalDevice,
                                     device,
                                     queue,
                                     cmdPool,
                                     &allocator);
    ktxLoadVkTextureN("texture_1.ktx", vdi, &texture, NULL, NULL);
    // ...
    ktxLoadVkTextureN("texture_n.ktx", vdi, &texture, NULL, NULL);
    ktxVulkanDeviceInfo_destroy(vdi);""")}
        """

    VkInstance("instance", "instance used to communicate with vulkan")
    VkPhysicalDevice("physicalDevice", "handle of the physical device")
    VkDevice("device", "handle of the logical device")
    VkQueue("queue", "handle to the queue to which to submit commands")
    VkCommandBuffer("cmdBuffer", "handle of the cmdBuffer to use")
    VkCommandPool("cmdPool", "handle of the command pool from which to allocate the command buffer")
    nullable..VkAllocationCallbacks.const.p("pAllocator", "pointer to the allocator to use for the command buffer and created images")
    VkPhysicalDeviceMemoryProperties("deviceMemoryProperties", "memory properties of the Vulkan physical device")
    ktxVulkanFunctions("vkFuncs", "the functions needed to operate functions")
}