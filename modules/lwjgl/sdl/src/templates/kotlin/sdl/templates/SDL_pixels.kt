/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_pixels = "SDLPixels".nativeClassSDL("SDL_pixels") {
    javaImport("static org.lwjgl.sdl.SDLStdinc.*")

    IntConstant(
        "ALPHA_OPAQUE".."255",
        "ALPHA_TRANSPARENT".."0"
    )

    FloatConstant(
        "ALPHA_OPAQUE_FLOAT"..1.0f,
        "ALPHA_TRANSPARENT_FLOAT"..0.0f
    )

    EnumConstant(
        "PIXELTYPE_UNKNOWN".enum("0"),
        "PIXELTYPE_INDEX1".enum,
        "PIXELTYPE_INDEX4".enum,
        "PIXELTYPE_INDEX8".enum,
        "PIXELTYPE_PACKED8".enum,
        "PIXELTYPE_PACKED16".enum,
        "PIXELTYPE_PACKED32".enum,
        "PIXELTYPE_ARRAYU8".enum,
        "PIXELTYPE_ARRAYU16".enum,
        "PIXELTYPE_ARRAYU32".enum,
        "PIXELTYPE_ARRAYF16".enum,
        "PIXELTYPE_ARRAYF32".enum,
        "PIXELTYPE_INDEX2".enum
    )

    EnumConstant(
        "BITMAPORDER_NONE".enum("0"),
        "BITMAPORDER_4321".enum,
        "BITMAPORDER_1234".enum
    )

    EnumConstant(
        "PACKEDORDER_NONE".enum("0"),
        "PACKEDORDER_XRGB".enum,
        "PACKEDORDER_RGBX".enum,
        "PACKEDORDER_ARGB".enum,
        "PACKEDORDER_RGBA".enum,
        "PACKEDORDER_XBGR".enum,
        "PACKEDORDER_BGRX".enum,
        "PACKEDORDER_ABGR".enum,
        "PACKEDORDER_BGRA".enum
    )

    EnumConstant(
        "ARRAYORDER_NONE".enum("0"),
        "ARRAYORDER_RGB".enum,
        "ARRAYORDER_RGBA".enum,
        "ARRAYORDER_ARGB".enum,
        "ARRAYORDER_BGR".enum,
        "ARRAYORDER_BGRA".enum,
        "ARRAYORDER_ABGR".enum
    )

    EnumConstant(
        "PACKEDLAYOUT_NONE".enum("0"),
        "PACKEDLAYOUT_332".enum,
        "PACKEDLAYOUT_4444".enum,
        "PACKEDLAYOUT_1555".enum,
        "PACKEDLAYOUT_5551".enum,
        "PACKEDLAYOUT_565".enum,
        "PACKEDLAYOUT_8888".enum,
        "PACKEDLAYOUT_2101010".enum,
        "PACKEDLAYOUT_1010102".enum
    )

    EnumConstant(
        "PIXELFORMAT_UNKNOWN".enum("0"),
        "PIXELFORMAT_INDEX1LSB".enum("0x11100100"),
        "PIXELFORMAT_INDEX1MSB".enum("0x11200100"),
        "PIXELFORMAT_INDEX2LSB".enum("0x1c100200"),
        "PIXELFORMAT_INDEX2MSB".enum("0x1c200200"),
        "PIXELFORMAT_INDEX4LSB".enum("0x12100400"),
        "PIXELFORMAT_INDEX4MSB".enum("0x12200400"),
        "PIXELFORMAT_INDEX8".enum("0x13000801"),
        "PIXELFORMAT_RGB332".enum("0x14110801"),
        "PIXELFORMAT_XRGB4444".enum("0x15120c02"),
        "PIXELFORMAT_XBGR4444".enum("0x15520c02"),
        "PIXELFORMAT_XRGB1555".enum("0x15130f02"),
        "PIXELFORMAT_XBGR1555".enum("0x15530f02"),
        "PIXELFORMAT_ARGB4444".enum("0x15321002"),
        "PIXELFORMAT_RGBA4444".enum("0x15421002"),
        "PIXELFORMAT_ABGR4444".enum("0x15721002"),
        "PIXELFORMAT_BGRA4444".enum("0x15821002"),
        "PIXELFORMAT_ARGB1555".enum("0x15331002"),
        "PIXELFORMAT_RGBA5551".enum("0x15441002"),
        "PIXELFORMAT_ABGR1555".enum("0x15731002"),
        "PIXELFORMAT_BGRA5551".enum("0x15841002"),
        "PIXELFORMAT_RGB565".enum("0x15151002"),
        "PIXELFORMAT_BGR565".enum("0x15551002"),
        "PIXELFORMAT_RGB24".enum("0x17101803"),
        "PIXELFORMAT_BGR24".enum("0x17401803"),
        "PIXELFORMAT_XRGB8888".enum("0x16161804"),
        "PIXELFORMAT_RGBX8888".enum("0x16261804"),
        "PIXELFORMAT_XBGR8888".enum("0x16561804"),
        "PIXELFORMAT_BGRX8888".enum("0x16661804"),
        "PIXELFORMAT_ARGB8888".enum("0x16362004"),
        "PIXELFORMAT_RGBA8888".enum("0x16462004"),
        "PIXELFORMAT_ABGR8888".enum("0x16762004"),
        "PIXELFORMAT_BGRA8888".enum("0x16862004"),
        "PIXELFORMAT_XRGB2101010".enum("0x16172004"),
        "PIXELFORMAT_XBGR2101010".enum("0x16572004"),
        "PIXELFORMAT_ARGB2101010".enum("0x16372004"),
        "PIXELFORMAT_ABGR2101010".enum("0x16772004"),
        "PIXELFORMAT_RGB48".enum("0x18103006"),
        "PIXELFORMAT_BGR48".enum("0x18403006"),
        "PIXELFORMAT_RGBA64".enum("0x18204008"),
        "PIXELFORMAT_ARGB64".enum("0x18304008"),
        "PIXELFORMAT_BGRA64".enum("0x18504008"),
        "PIXELFORMAT_ABGR64".enum("0x18604008"),
        "PIXELFORMAT_RGB48_FLOAT".enum("0x1a103006"),
        "PIXELFORMAT_BGR48_FLOAT".enum("0x1a403006"),
        "PIXELFORMAT_RGBA64_FLOAT".enum("0x1a204008"),
        "PIXELFORMAT_ARGB64_FLOAT".enum("0x1a304008"),
        "PIXELFORMAT_BGRA64_FLOAT".enum("0x1a504008"),
        "PIXELFORMAT_ABGR64_FLOAT".enum("0x1a604008"),
        "PIXELFORMAT_RGB96_FLOAT".enum("0x1b10600c"),
        "PIXELFORMAT_BGR96_FLOAT".enum("0x1b40600c"),
        "PIXELFORMAT_RGBA128_FLOAT".enum("0x1b208010"),
        "PIXELFORMAT_ARGB128_FLOAT".enum("0x1b308010"),
        "PIXELFORMAT_BGRA128_FLOAT".enum("0x1b508010"),
        "PIXELFORMAT_ABGR128_FLOAT".enum("0x1b608010"),
        "PIXELFORMAT_YV12".enum("0x32315659"),
        "PIXELFORMAT_IYUV".enum("0x56555949"),
        "PIXELFORMAT_YUY2".enum("0x32595559"),
        "PIXELFORMAT_UYVY".enum("0x59565955"),
        "PIXELFORMAT_YVYU".enum("0x55595659"),
        "PIXELFORMAT_NV12".enum("0x3231564e"),
        "PIXELFORMAT_NV21".enum("0x3132564e"),
        "PIXELFORMAT_P010".enum("0x30313050"),
        "PIXELFORMAT_EXTERNAL_OES".enum("0x2053454f"),
        "PIXELFORMAT_MJPG".enum("0x47504a4d"),
        "PIXELFORMAT_RGBA32".enum("ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_ABGR8888 : SDL_PIXELFORMAT_RGBA8888"),
        "PIXELFORMAT_ARGB32".enum("ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_BGRA8888 : SDL_PIXELFORMAT_ARGB8888"),
        "PIXELFORMAT_BGRA32".enum("ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_ARGB8888 : SDL_PIXELFORMAT_BGRA8888"),
        "PIXELFORMAT_ABGR32".enum("ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_RGBA8888 : SDL_PIXELFORMAT_ABGR8888"),
        "PIXELFORMAT_RGBX32".enum("ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_XBGR8888 : SDL_PIXELFORMAT_RGBX8888"),
        "PIXELFORMAT_XRGB32".enum("ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_BGRX8888 : SDL_PIXELFORMAT_XRGB8888"),
        "PIXELFORMAT_BGRX32".enum("ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_XRGB8888 : SDL_PIXELFORMAT_BGRX8888"),
        "PIXELFORMAT_XBGR32".enum("ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_RGBX8888 : SDL_PIXELFORMAT_XBGR8888"),
    )

    EnumConstant(
        "COLOR_TYPE_UNKNOWN".enum("0"),
        "COLOR_TYPE_RGB".enum,
        "COLOR_TYPE_YCBCR".enum
    )

    EnumConstant(
        "COLOR_RANGE_UNKNOWN".enum("0"),
        "COLOR_RANGE_LIMITED".enum,
        "COLOR_RANGE_FULL".enum
    )

    EnumConstant(
        "COLOR_PRIMARIES_UNKNOWN".enum("0"),
        "COLOR_PRIMARIES_BT709".enum,
        "COLOR_PRIMARIES_UNSPECIFIED".enum,
        "COLOR_PRIMARIES_BT470M".enum("4"),
        "COLOR_PRIMARIES_BT470BG".enum,
        "COLOR_PRIMARIES_BT601".enum,
        "COLOR_PRIMARIES_SMPTE240".enum,
        "COLOR_PRIMARIES_GENERIC_FILM".enum,
        "COLOR_PRIMARIES_BT2020".enum,
        "COLOR_PRIMARIES_XYZ".enum,
        "COLOR_PRIMARIES_SMPTE431".enum,
        "COLOR_PRIMARIES_SMPTE432".enum,
        "COLOR_PRIMARIES_EBU3213".enum("22"),
        "COLOR_PRIMARIES_CUSTOM".enum("31")
    )

    EnumConstant(
        "TRANSFER_CHARACTERISTICS_UNKNOWN".enum("0"),
        "TRANSFER_CHARACTERISTICS_BT709".enum,
        "TRANSFER_CHARACTERISTICS_UNSPECIFIED".enum,
        "TRANSFER_CHARACTERISTICS_GAMMA22".enum("4"),
        "TRANSFER_CHARACTERISTICS_GAMMA28".enum,
        "TRANSFER_CHARACTERISTICS_BT601".enum,
        "TRANSFER_CHARACTERISTICS_SMPTE240".enum,
        "TRANSFER_CHARACTERISTICS_LINEAR".enum,
        "TRANSFER_CHARACTERISTICS_LOG100".enum,
        "TRANSFER_CHARACTERISTICS_LOG100_SQRT10".enum,
        "TRANSFER_CHARACTERISTICS_IEC61966".enum,
        "TRANSFER_CHARACTERISTICS_BT1361".enum,
        "TRANSFER_CHARACTERISTICS_SRGB".enum,
        "TRANSFER_CHARACTERISTICS_BT2020_10BIT".enum,
        "TRANSFER_CHARACTERISTICS_BT2020_12BIT".enum,
        "TRANSFER_CHARACTERISTICS_PQ".enum,
        "TRANSFER_CHARACTERISTICS_SMPTE428".enum,
        "TRANSFER_CHARACTERISTICS_HLG".enum,
        "TRANSFER_CHARACTERISTICS_CUSTOM".enum("31")
    )

    EnumConstant(
        "MATRIX_COEFFICIENTS_IDENTITY".enum("0"),
        "MATRIX_COEFFICIENTS_BT709".enum,
        "MATRIX_COEFFICIENTS_UNSPECIFIED".enum,
        "MATRIX_COEFFICIENTS_FCC".enum("4"),
        "MATRIX_COEFFICIENTS_BT470BG".enum,
        "MATRIX_COEFFICIENTS_BT601".enum,
        "MATRIX_COEFFICIENTS_SMPTE240".enum,
        "MATRIX_COEFFICIENTS_YCGCO".enum,
        "MATRIX_COEFFICIENTS_BT2020_NCL".enum,
        "MATRIX_COEFFICIENTS_BT2020_CL".enum,
        "MATRIX_COEFFICIENTS_SMPTE2085".enum,
        "MATRIX_COEFFICIENTS_CHROMA_DERIVED_NCL".enum,
        "MATRIX_COEFFICIENTS_CHROMA_DERIVED_CL".enum,
        "MATRIX_COEFFICIENTS_ICTCP".enum,
        "MATRIX_COEFFICIENTS_CUSTOM".enum("31")
    )

    EnumConstant(
        "CHROMA_LOCATION_NONE".enum("0"),
        "CHROMA_LOCATION_LEFT".enum,
        "CHROMA_LOCATION_CENTER".enum,
        "CHROMA_LOCATION_TOPLEFT".enum
    )

    EnumConstant(
        "COLORSPACE_UNKNOWN".enum("0"),
        "COLORSPACE_SRGB".enum("0x120005a0"),
        "COLORSPACE_SRGB_LINEAR".enum("0x12000500"),
        "COLORSPACE_HDR10".enum("0x12002600"),
        "COLORSPACE_JPEG".enum("0x220004c6"),
        "COLORSPACE_BT601_LIMITED".enum("0x211018c6"),
        "COLORSPACE_BT601_FULL".enum("0x221018c6"),
        "COLORSPACE_BT709_LIMITED".enum("0x21100421"),
        "COLORSPACE_BT709_FULL".enum("0x22100421"),
        "COLORSPACE_BT2020_LIMITED".enum("0x21102609"),
        "COLORSPACE_BT2020_FULL".enum("0x22102609"),
        "COLORSPACE_RGB_DEFAULT".enum("SDL_COLORSPACE_SRGB"),
        "COLORSPACE_YUV_DEFAULT".enum("SDL_COLORSPACE_JPEG")
    )

    charASCII.const.p(
        "GetPixelFormatName",

        SDL_PixelFormat("format")
    )

    bool(
        "GetMasksForPixelFormat",

        SDL_PixelFormat("format"),
        Check(1)..int.p("bpp"),
        Check(1)..Uint32.p("Rmask"),
        Check(1)..Uint32.p("Gmask"),
        Check(1)..Uint32.p("Bmask"),
        Check(1)..Uint32.p("Amask")
    )

    SDL_PixelFormat(
        "GetPixelFormatForMasks",

        int("bpp"),
        Uint32("Rmask"),
        Uint32("Gmask"),
        Uint32("Bmask"),
        Uint32("Amask")
    )

    SDL_PixelFormatDetails.const.p(
        "GetPixelFormatDetails",

        SDL_PixelFormat("format")
    )

    SDL_Palette.p(
        "CreatePalette",

        int("ncolors")
    )

    bool(
        "SetPaletteColors",

        SDL_Palette.p("palette"),
        SDL_Color.const.p("colors"),
        int("firstcolor"),
        AutoSize("colors")..int("ncolors")
    )

    void(
        "DestroyPalette",

        SDL_Palette.p("palette")
    )

    Uint32(
        "MapRGB",

        SDL_PixelFormatDetails.const.p("format"),
        nullable..SDL_Palette.const.p("palette"),
        Uint8("r"),
        Uint8("g"),
        Uint8("b")
    )

    Uint32(
        "MapRGBA",

        SDL_PixelFormatDetails.const.p("format"),
        nullable..SDL_Palette.const.p("palette"),
        Uint8("r"),
        Uint8("g"),
        Uint8("b"),
        Uint8("a")
    )

    void(
        "GetRGB",

        Uint32("pixel"),
        SDL_PixelFormatDetails.const.p("format"),
        nullable..SDL_Palette.const.p("palette"),
        Check(1)..nullable..Uint8.p("r"),
        Check(1)..nullable..Uint8.p("g"),
        Check(1)..nullable..Uint8.p("b")
    )

    void(
        "GetRGBA",

        Uint32("pixel"),
        SDL_PixelFormatDetails.const.p("format"),
        nullable..SDL_Palette.const.p("palette"),
        Check(1)..nullable..Uint8.p("r"),
        Check(1)..nullable..Uint8.p("g"),
        Check(1)..nullable..Uint8.p("b"),
        Check(1)..nullable..Uint8.p("a")
    )

    macro(expression = "SDL_FOURCC(A, B, C, D)")..uint32_t(
        "DEFINE_PIXELFOURCC",

        uint8_t("A"),
        uint8_t("B"),
        uint8_t("C"),
        uint8_t("D")
    )

    macro(expression = "(1 << 28) | (type << 24) | (order << 20) | (layout << 16) | ((bits & 0xFF) << 8) | ((bytes & 0xFF) << 0)")..SDL_PixelFormat(
        "DEFINE_PIXELFORMAT",

        SDL_PixelType("type"),
        SDL_BitmapOrder("order"),
        SDL_PackedLayout("layout"),
        uint32_t("bits"),
        uint32_t("bytes")
    )

    macro(expression = "(format >> 28) & 0x0F")..uint32_t(
        "PIXELFLAG",

        SDL_PixelFormat("format")
    )
    macro(expression = "(format >> 24) & 0x0F")..SDL_PixelType(
        "PIXELTYPE",

        SDL_PixelFormat("format")
    )
    macro(expression = "(format >> 20) & 0x0F")..SDL_BitmapOrder(
        "PIXELORDER",

        SDL_PixelFormat("format")
    )
    macro(expression = "(format >> 16) & 0x0F")..SDL_PackedLayout(
        "PIXELLAYOUT",

        SDL_PixelFormat("format")
    )
    macro(expression = "SDL_ISPIXELFORMAT_FOURCC(format) ? 0 : ((format >> 8) & 0xFF)")..uint32_t(
        "BITSPERPIXEL",

        SDL_PixelFormat("format")
    )
    macro(expression = """SDL_ISPIXELFORMAT_FOURCC(format) ?
            (
                (format == SDL_PIXELFORMAT_YUY2) ||
                (format == SDL_PIXELFORMAT_UYVY) ||
                (format == SDL_PIXELFORMAT_YVYU) ||
                (format == SDL_PIXELFORMAT_P010) ? 2 : 1
            ) : ((format >> 0) & 0xFF)"""
    )..uint32_t(
        "BYTESPERPIXEL",

        SDL_PixelFormat("format")
    )

    macro(expression = """!SDL_ISPIXELFORMAT_FOURCC(format) &&
               (
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_INDEX1 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_INDEX2 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_INDEX4 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_INDEX8
               )"""
    )..bool(
        "SDL_ISPIXELFORMAT_INDEXED",
        SDL_PixelFormat("format"),
        noPrefix = true
    )
    macro(expression = """!SDL_ISPIXELFORMAT_FOURCC(format) &&
               (
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_PACKED8 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_PACKED16 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_PACKED32
               )"""
    )..bool(
        "SDL_ISPIXELFORMAT_PACKED",
        SDL_PixelFormat("format"),
        noPrefix = true
    )
    macro(expression = """!SDL_ISPIXELFORMAT_FOURCC(format) &&
               (
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYU8 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYU16 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYU32 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYF16 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYF32
               )"""
    )..bool(
        "ISPIXELFORMAT_ARRAY",

        SDL_PixelFormat("format")
    )
    macro(expression = """!SDL_ISPIXELFORMAT_FOURCC(format) &&
               SDL_PIXELTYPE(format) == SDL_PIXELTYPE_PACKED32 &&
               SDL_PIXELLAYOUT(format) == SDL_PACKEDLAYOUT_2101010"""
    )..bool(
        "ISPIXELFORMAT_10BIT",

        SDL_PixelFormat("format")
    )
    macro(expression = """!SDL_ISPIXELFORMAT_FOURCC(format) &&
               (
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYF16 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYF32
               )"""
    )..bool(
        "ISPIXELFORMAT_FLOAT",

        SDL_PixelFormat("format")
    )
    macro(expression = """SDL_ISPIXELFORMAT_PACKED(format) &&
               (
                   SDL_PIXELORDER(format) == SDL_PACKEDORDER_ARGB ||
                   SDL_PIXELORDER(format) == SDL_PACKEDORDER_RGBA ||
                   SDL_PIXELORDER(format) == SDL_PACKEDORDER_ABGR ||
                   SDL_PIXELORDER(format) == SDL_PACKEDORDER_BGRA
               ) ||
               SDL_ISPIXELFORMAT_ARRAY(format) &&
                (
                    SDL_PIXELORDER(format) == SDL_ARRAYORDER_ARGB ||
                    SDL_PIXELORDER(format) == SDL_ARRAYORDER_RGBA ||
                    SDL_PIXELORDER(format) == SDL_ARRAYORDER_ABGR ||
                    SDL_PIXELORDER(format) == SDL_ARRAYORDER_BGRA
                )"""
    )..bool(
        "ISPIXELFORMAT_ALPHA",

        SDL_PixelFormat("format")
    )
    macro(expression = "format != 0 && SDL_PIXELFLAG(format) != 1")..bool(
        "ISPIXELFORMAT_FOURCC",

        SDL_PixelFormat("format")
    )

    macro(expression = "(type << 28) | (range << 24) | (chroma << 20) | (primaries << 10) | (transfer << 5) | (matrix << 0)")..SDL_Colorspace(
        "DEFINE_COLORSPACE",

        SDL_ColorType("type"),
        SDL_ColorRange("range"),
        SDL_ColorPrimaries("primaries"),
        SDL_TransferCharacteristics("transfer"),
        SDL_MatrixCoefficients("matrix"),
        SDL_ChromaLocation("chroma")
    )

    macro(expression = "(cspace >> 28) & 0x0F")..SDL_ColorType("COLORSPACETYPE", SDL_Colorspace("cspace"))
    macro(expression = "(cspace >> 24) & 0x0F")..SDL_ColorRange("COLORSPACERANGE", SDL_Colorspace("cspace"))
    macro(expression = "(cspace >> 20) & 0x0F")..SDL_ChromaLocation("COLORSPACECHROMA", SDL_Colorspace("cspace"))
    macro(expression = "(cspace >> 10) & 0x1F")..SDL_ColorPrimaries("COLORSPACEPRIMARIES", SDL_Colorspace("cspace"))
    macro(expression = "(cspace >> 5) & 0x1F")..SDL_TransferCharacteristics("COLORSPACETRANSFER", SDL_Colorspace("cspace"))
    macro(expression = "cspace & 0x1F")..SDL_MatrixCoefficients("COLORSPACEMATRIX", SDL_Colorspace("cspace"))

    macro(expression = "SDL_COLORSPACEMATRIX(cspace) == SDL_MATRIX_COEFFICIENTS_BT601 || SDL_COLORSPACEMATRIX(cspace) == SDL_MATRIX_COEFFICIENTS_BT470BG")..bool(
        "ISCOLORSPACE_MATRIX_BT601",

        SDL_Colorspace("cspace")
    )
    macro(expression = "SDL_COLORSPACEMATRIX(cspace) == SDL_MATRIX_COEFFICIENTS_BT709")..bool(
        "ISCOLORSPACE_MATRIX_BT709",

        SDL_Colorspace("cspace")
    )
    macro(expression = "SDL_COLORSPACEMATRIX(cspace) == SDL_MATRIX_COEFFICIENTS_BT2020_NCL")..bool(
        "ISCOLORSPACE_MATRIX_BT2020_NCL",

        SDL_Colorspace("cspace")
    )
    macro(expression = "SDL_COLORSPACERANGE(cspace) != SDL_COLOR_RANGE_FULL")..bool(
        "ISCOLORSPACE_LIMITED_RANGE",

        SDL_Colorspace("cspace")
    )
    macro(expression = "SDL_COLORSPACERANGE(cspace) == SDL_COLOR_RANGE_FULL")..bool(
        "ISCOLORSPACE_FULL_RANGE",

        SDL_Colorspace("cspace")
    )
}
