/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CU50 = "CU50".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    extends = CU42
    documentation = "Contains bindings to <a href=\"https://docs.nvidia.com/cuda/cuda-driver-api/index.html\">CUDA Driver API</a>."

    EnumConstant(
        "Resource types. ({@code CUresourcetype})",

        "RESOURCE_TYPE_ARRAY".enum("Array resoure", 0x00),
        "RESOURCE_TYPE_MIPMAPPED_ARRAY".enum("Mipmapped array resource", 0x01),
        "RESOURCE_TYPE_LINEAR".enum("Linear resource", 0x02),
        "RESOURCE_TYPE_PITCH2D".enum("Pitch 2D resource", 0x03)
    )

    EnumConstant(
        "Resource view format. ({@code CUresourceViewFormat})",

        "RES_VIEW_FORMAT_NONE".enum("No resource view format (use underlying resource format)", 0x00),
        "RES_VIEW_FORMAT_UINT_1X8".enum("1 channel unsigned 8-bit integers", 0x01),
        "RES_VIEW_FORMAT_UINT_2X8".enum("2 channel unsigned 8-bit integers", 0x02),
        "RES_VIEW_FORMAT_UINT_4X8".enum("4 channel unsigned 8-bit integers", 0x03),
        "RES_VIEW_FORMAT_SINT_1X8".enum("1 channel signed 8-bit integers", 0x04),
        "RES_VIEW_FORMAT_SINT_2X8".enum("2 channel signed 8-bit integers", 0x05),
        "RES_VIEW_FORMAT_SINT_4X8".enum("4 channel signed 8-bit integers", 0x06),
        "RES_VIEW_FORMAT_UINT_1X16".enum("1 channel unsigned 16-bit integers", 0x07),
        "RES_VIEW_FORMAT_UINT_2X16".enum("2 channel unsigned 16-bit integers", 0x08),
        "RES_VIEW_FORMAT_UINT_4X16".enum("4 channel unsigned 16-bit integers", 0x09),
        "RES_VIEW_FORMAT_SINT_1X16".enum("1 channel signed 16-bit integers", 0x0a),
        "RES_VIEW_FORMAT_SINT_2X16".enum("2 channel signed 16-bit integers", 0x0b),
        "RES_VIEW_FORMAT_SINT_4X16".enum("4 channel signed 16-bit integers", 0x0c),
        "RES_VIEW_FORMAT_UINT_1X32".enum("1 channel unsigned 32-bit integers", 0x0d),
        "RES_VIEW_FORMAT_UINT_2X32".enum("2 channel unsigned 32-bit integers", 0x0e),
        "RES_VIEW_FORMAT_UINT_4X32".enum("4 channel unsigned 32-bit integers", 0x0f),
        "RES_VIEW_FORMAT_SINT_1X32".enum("1 channel signed 32-bit integers", 0x10),
        "RES_VIEW_FORMAT_SINT_2X32".enum("2 channel signed 32-bit integers", 0x11),
        "RES_VIEW_FORMAT_SINT_4X32".enum("4 channel signed 32-bit integers", 0x12),
        "RES_VIEW_FORMAT_FLOAT_1X16".enum("1 channel 16-bit floating point", 0x13),
        "RES_VIEW_FORMAT_FLOAT_2X16".enum("2 channel 16-bit floating point", 0x14),
        "RES_VIEW_FORMAT_FLOAT_4X16".enum("4 channel 16-bit floating point", 0x15),
        "RES_VIEW_FORMAT_FLOAT_1X32".enum("1 channel 32-bit floating point", 0x16),
        "RES_VIEW_FORMAT_FLOAT_2X32".enum("2 channel 32-bit floating point", 0x17),
        "RES_VIEW_FORMAT_FLOAT_4X32".enum("4 channel 32-bit floating point", 0x18),
        "RES_VIEW_FORMAT_UNSIGNED_BC1".enum("Block compressed 1", 0x19),
        "RES_VIEW_FORMAT_UNSIGNED_BC2".enum("Block compressed 2", 0x1a),
        "RES_VIEW_FORMAT_UNSIGNED_BC3".enum("Block compressed 3", 0x1b),
        "RES_VIEW_FORMAT_UNSIGNED_BC4".enum("Block compressed 4 unsigned", 0x1c),
        "RES_VIEW_FORMAT_SIGNED_BC4".enum("Block compressed 4 signed", 0x1d),
        "RES_VIEW_FORMAT_UNSIGNED_BC5".enum("Block compressed 5 unsigned", 0x1e),
        "RES_VIEW_FORMAT_SIGNED_BC5".enum("Block compressed 5 signed", 0x1f),
        "RES_VIEW_FORMAT_UNSIGNED_BC6H".enum("Block compressed 6 unsigned half-float", 0x20),
        "RES_VIEW_FORMAT_SIGNED_BC6H".enum("Block compressed 6 signed half-float", 0x21),
        "RES_VIEW_FORMAT_UNSIGNED_BC7".enum("Block compressed 7", 0x22)
    )

    CUresult(
        "MipmappedArrayCreate",
        "",

        Check(1)..CUmipmappedArray.p("pHandle", ""),
        CUDA_ARRAY3D_DESCRIPTOR.const.p("pMipmappedArrayDesc", ""),
        unsigned_int("numMipmapLevels", "")
    )

    CUresult(
        "MipmappedArrayGetLevel",
        "",

        Check(1)..CUarray.p("pLevelArray", ""),
        CUmipmappedArray("hMipmappedArray", ""),
        unsigned_int("level", "")
    )

    CUresult(
        "MipmappedArrayDestroy",
        "",

        CUmipmappedArray("hMipmappedArray", "")
    )

    CUresult(
        "TexObjectCreate",
        "",

        Check(1)..CUtexObject.p("pTexObject", ""),
        CUDA_RESOURCE_DESC.const.p("pResDesc", ""),
        CUDA_TEXTURE_DESC.const.p("pTexDesc", ""),
        CUDA_RESOURCE_VIEW_DESC.const.p("pResViewDesc", "")
    )

    CUresult(
        "TexObjectDestroy",
        "",

        CUtexObject("texObject", "")
    )

    CUresult(
        "TexObjectGetResourceDesc",
        "",

        CUDA_RESOURCE_DESC.p("pResDesc", ""),
        CUtexObject("texObject", "")
    )

    CUresult(
        "TexObjectGetTextureDesc",
        "",

        CUDA_TEXTURE_DESC.p("pTexDesc", ""),
        CUtexObject("texObject", "")
    )

    CUresult(
        "TexObjectGetResourceViewDesc",
        "",

        CUDA_RESOURCE_VIEW_DESC.p("pResViewDesc", ""),
        CUtexObject("texObject", "")
    )

    CUresult(
        "SurfObjectCreate",
        "",

        Check(1)..CUsurfObject.p("pSurfObject", ""),
        CUDA_RESOURCE_DESC.const.p("pResDesc", "")
    )

    CUresult(
        "SurfObjectDestroy",
        "",

        CUsurfObject("surfObject", "")
    )

    CUresult(
        "SurfObjectGetResourceDesc",
        "",

        CUDA_RESOURCE_DESC.p("pResDesc", ""),
        CUsurfObject("surfObject", "")
    )

    CUresult(
        "GraphicsResourceGetMappedMipmappedArray",
        "",

        Check(1)..CUmipmappedArray.p("pMipmappedArray", ""),
        CUgraphicsResource("resource", "")
    )
}