/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.sdl.SDLStdinc.*;

public class SDLPixels {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetPixelFormatName     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPixelFormatName"),
            GetMasksForPixelFormat = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetMasksForPixelFormat"),
            GetPixelFormatForMasks = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPixelFormatForMasks"),
            GetPixelFormatDetails  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPixelFormatDetails"),
            CreatePalette          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreatePalette"),
            SetPaletteColors       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetPaletteColors"),
            DestroyPalette         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyPalette"),
            MapRGB                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_MapRGB"),
            MapRGBA                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_MapRGBA"),
            GetRGB                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRGB"),
            GetRGBA                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRGBA");

    }

    public static final int
        SDL_ALPHA_OPAQUE      = 255,
        SDL_ALPHA_TRANSPARENT = 0;

    public static final float
        SDL_ALPHA_OPAQUE_FLOAT      = 1.0f,
        SDL_ALPHA_TRANSPARENT_FLOAT = 0.0f;

    public static final int
        SDL_PIXELTYPE_UNKNOWN  = 0,
        SDL_PIXELTYPE_INDEX1   = 1,
        SDL_PIXELTYPE_INDEX4   = 2,
        SDL_PIXELTYPE_INDEX8   = 3,
        SDL_PIXELTYPE_PACKED8  = 4,
        SDL_PIXELTYPE_PACKED16 = 5,
        SDL_PIXELTYPE_PACKED32 = 6,
        SDL_PIXELTYPE_ARRAYU8  = 7,
        SDL_PIXELTYPE_ARRAYU16 = 8,
        SDL_PIXELTYPE_ARRAYU32 = 9,
        SDL_PIXELTYPE_ARRAYF16 = 10,
        SDL_PIXELTYPE_ARRAYF32 = 11,
        SDL_PIXELTYPE_INDEX2   = 12;

    public static final int
        SDL_BITMAPORDER_NONE = 0,
        SDL_BITMAPORDER_4321 = 1,
        SDL_BITMAPORDER_1234 = 2;

    public static final int
        SDL_PACKEDORDER_NONE = 0,
        SDL_PACKEDORDER_XRGB = 1,
        SDL_PACKEDORDER_RGBX = 2,
        SDL_PACKEDORDER_ARGB = 3,
        SDL_PACKEDORDER_RGBA = 4,
        SDL_PACKEDORDER_XBGR = 5,
        SDL_PACKEDORDER_BGRX = 6,
        SDL_PACKEDORDER_ABGR = 7,
        SDL_PACKEDORDER_BGRA = 8;

    public static final int
        SDL_ARRAYORDER_NONE = 0,
        SDL_ARRAYORDER_RGB  = 1,
        SDL_ARRAYORDER_RGBA = 2,
        SDL_ARRAYORDER_ARGB = 3,
        SDL_ARRAYORDER_BGR  = 4,
        SDL_ARRAYORDER_BGRA = 5,
        SDL_ARRAYORDER_ABGR = 6;

    public static final int
        SDL_PACKEDLAYOUT_NONE    = 0,
        SDL_PACKEDLAYOUT_332     = 1,
        SDL_PACKEDLAYOUT_4444    = 2,
        SDL_PACKEDLAYOUT_1555    = 3,
        SDL_PACKEDLAYOUT_5551    = 4,
        SDL_PACKEDLAYOUT_565     = 5,
        SDL_PACKEDLAYOUT_8888    = 6,
        SDL_PACKEDLAYOUT_2101010 = 7,
        SDL_PACKEDLAYOUT_1010102 = 8;

    public static final int
        SDL_PIXELFORMAT_UNKNOWN       = 0,
        SDL_PIXELFORMAT_INDEX1LSB     = 0x11100100,
        SDL_PIXELFORMAT_INDEX1MSB     = 0x11200100,
        SDL_PIXELFORMAT_INDEX2LSB     = 0x1c100200,
        SDL_PIXELFORMAT_INDEX2MSB     = 0x1c200200,
        SDL_PIXELFORMAT_INDEX4LSB     = 0x12100400,
        SDL_PIXELFORMAT_INDEX4MSB     = 0x12200400,
        SDL_PIXELFORMAT_INDEX8        = 0x13000801,
        SDL_PIXELFORMAT_RGB332        = 0x14110801,
        SDL_PIXELFORMAT_XRGB4444      = 0x15120c02,
        SDL_PIXELFORMAT_XBGR4444      = 0x15520c02,
        SDL_PIXELFORMAT_XRGB1555      = 0x15130f02,
        SDL_PIXELFORMAT_XBGR1555      = 0x15530f02,
        SDL_PIXELFORMAT_ARGB4444      = 0x15321002,
        SDL_PIXELFORMAT_RGBA4444      = 0x15421002,
        SDL_PIXELFORMAT_ABGR4444      = 0x15721002,
        SDL_PIXELFORMAT_BGRA4444      = 0x15821002,
        SDL_PIXELFORMAT_ARGB1555      = 0x15331002,
        SDL_PIXELFORMAT_RGBA5551      = 0x15441002,
        SDL_PIXELFORMAT_ABGR1555      = 0x15731002,
        SDL_PIXELFORMAT_BGRA5551      = 0x15841002,
        SDL_PIXELFORMAT_RGB565        = 0x15151002,
        SDL_PIXELFORMAT_BGR565        = 0x15551002,
        SDL_PIXELFORMAT_RGB24         = 0x17101803,
        SDL_PIXELFORMAT_BGR24         = 0x17401803,
        SDL_PIXELFORMAT_XRGB8888      = 0x16161804,
        SDL_PIXELFORMAT_RGBX8888      = 0x16261804,
        SDL_PIXELFORMAT_XBGR8888      = 0x16561804,
        SDL_PIXELFORMAT_BGRX8888      = 0x16661804,
        SDL_PIXELFORMAT_ARGB8888      = 0x16362004,
        SDL_PIXELFORMAT_RGBA8888      = 0x16462004,
        SDL_PIXELFORMAT_ABGR8888      = 0x16762004,
        SDL_PIXELFORMAT_BGRA8888      = 0x16862004,
        SDL_PIXELFORMAT_XRGB2101010   = 0x16172004,
        SDL_PIXELFORMAT_XBGR2101010   = 0x16572004,
        SDL_PIXELFORMAT_ARGB2101010   = 0x16372004,
        SDL_PIXELFORMAT_ABGR2101010   = 0x16772004,
        SDL_PIXELFORMAT_RGB48         = 0x18103006,
        SDL_PIXELFORMAT_BGR48         = 0x18403006,
        SDL_PIXELFORMAT_RGBA64        = 0x18204008,
        SDL_PIXELFORMAT_ARGB64        = 0x18304008,
        SDL_PIXELFORMAT_BGRA64        = 0x18504008,
        SDL_PIXELFORMAT_ABGR64        = 0x18604008,
        SDL_PIXELFORMAT_RGB48_FLOAT   = 0x1a103006,
        SDL_PIXELFORMAT_BGR48_FLOAT   = 0x1a403006,
        SDL_PIXELFORMAT_RGBA64_FLOAT  = 0x1a204008,
        SDL_PIXELFORMAT_ARGB64_FLOAT  = 0x1a304008,
        SDL_PIXELFORMAT_BGRA64_FLOAT  = 0x1a504008,
        SDL_PIXELFORMAT_ABGR64_FLOAT  = 0x1a604008,
        SDL_PIXELFORMAT_RGB96_FLOAT   = 0x1b10600c,
        SDL_PIXELFORMAT_BGR96_FLOAT   = 0x1b40600c,
        SDL_PIXELFORMAT_RGBA128_FLOAT = 0x1b208010,
        SDL_PIXELFORMAT_ARGB128_FLOAT = 0x1b308010,
        SDL_PIXELFORMAT_BGRA128_FLOAT = 0x1b508010,
        SDL_PIXELFORMAT_ABGR128_FLOAT = 0x1b608010,
        SDL_PIXELFORMAT_YV12          = 0x32315659,
        SDL_PIXELFORMAT_IYUV          = 0x56555949,
        SDL_PIXELFORMAT_YUY2          = 0x32595559,
        SDL_PIXELFORMAT_UYVY          = 0x59565955,
        SDL_PIXELFORMAT_YVYU          = 0x55595659,
        SDL_PIXELFORMAT_NV12          = 0x3231564e,
        SDL_PIXELFORMAT_NV21          = 0x3132564e,
        SDL_PIXELFORMAT_P010          = 0x30313050,
        SDL_PIXELFORMAT_EXTERNAL_OES  = 0x2053454f,
        SDL_PIXELFORMAT_MJPG          = 0x47504a4d,
        SDL_PIXELFORMAT_RGBA32        = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_ABGR8888 : SDL_PIXELFORMAT_RGBA8888,
        SDL_PIXELFORMAT_ARGB32        = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_BGRA8888 : SDL_PIXELFORMAT_ARGB8888,
        SDL_PIXELFORMAT_BGRA32        = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_ARGB8888 : SDL_PIXELFORMAT_BGRA8888,
        SDL_PIXELFORMAT_ABGR32        = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_RGBA8888 : SDL_PIXELFORMAT_ABGR8888,
        SDL_PIXELFORMAT_RGBX32        = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_XBGR8888 : SDL_PIXELFORMAT_RGBX8888,
        SDL_PIXELFORMAT_XRGB32        = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_BGRX8888 : SDL_PIXELFORMAT_XRGB8888,
        SDL_PIXELFORMAT_BGRX32        = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_XRGB8888 : SDL_PIXELFORMAT_BGRX8888,
        SDL_PIXELFORMAT_XBGR32        = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_RGBX8888 : SDL_PIXELFORMAT_XBGR8888;

    public static final int
        SDL_COLOR_TYPE_UNKNOWN = 0,
        SDL_COLOR_TYPE_RGB     = 1,
        SDL_COLOR_TYPE_YCBCR   = 2;

    public static final int
        SDL_COLOR_RANGE_UNKNOWN = 0,
        SDL_COLOR_RANGE_LIMITED = 1,
        SDL_COLOR_RANGE_FULL    = 2;

    public static final int
        SDL_COLOR_PRIMARIES_UNKNOWN      = 0,
        SDL_COLOR_PRIMARIES_BT709        = 1,
        SDL_COLOR_PRIMARIES_UNSPECIFIED  = 2,
        SDL_COLOR_PRIMARIES_BT470M       = 4,
        SDL_COLOR_PRIMARIES_BT470BG      = 5,
        SDL_COLOR_PRIMARIES_BT601        = 6,
        SDL_COLOR_PRIMARIES_SMPTE240     = 7,
        SDL_COLOR_PRIMARIES_GENERIC_FILM = 8,
        SDL_COLOR_PRIMARIES_BT2020       = 9,
        SDL_COLOR_PRIMARIES_XYZ          = 10,
        SDL_COLOR_PRIMARIES_SMPTE431     = 11,
        SDL_COLOR_PRIMARIES_SMPTE432     = 12,
        SDL_COLOR_PRIMARIES_EBU3213      = 22,
        SDL_COLOR_PRIMARIES_CUSTOM       = 31;

    public static final int
        SDL_TRANSFER_CHARACTERISTICS_UNKNOWN       = 0,
        SDL_TRANSFER_CHARACTERISTICS_BT709         = 1,
        SDL_TRANSFER_CHARACTERISTICS_UNSPECIFIED   = 2,
        SDL_TRANSFER_CHARACTERISTICS_GAMMA22       = 4,
        SDL_TRANSFER_CHARACTERISTICS_GAMMA28       = 5,
        SDL_TRANSFER_CHARACTERISTICS_BT601         = 6,
        SDL_TRANSFER_CHARACTERISTICS_SMPTE240      = 7,
        SDL_TRANSFER_CHARACTERISTICS_LINEAR        = 8,
        SDL_TRANSFER_CHARACTERISTICS_LOG100        = 9,
        SDL_TRANSFER_CHARACTERISTICS_LOG100_SQRT10 = 10,
        SDL_TRANSFER_CHARACTERISTICS_IEC61966      = 11,
        SDL_TRANSFER_CHARACTERISTICS_BT1361        = 12,
        SDL_TRANSFER_CHARACTERISTICS_SRGB          = 13,
        SDL_TRANSFER_CHARACTERISTICS_BT2020_10BIT  = 14,
        SDL_TRANSFER_CHARACTERISTICS_BT2020_12BIT  = 15,
        SDL_TRANSFER_CHARACTERISTICS_PQ            = 16,
        SDL_TRANSFER_CHARACTERISTICS_SMPTE428      = 17,
        SDL_TRANSFER_CHARACTERISTICS_HLG           = 18,
        SDL_TRANSFER_CHARACTERISTICS_CUSTOM        = 31;

    public static final int
        SDL_MATRIX_COEFFICIENTS_IDENTITY           = 0,
        SDL_MATRIX_COEFFICIENTS_BT709              = 1,
        SDL_MATRIX_COEFFICIENTS_UNSPECIFIED        = 2,
        SDL_MATRIX_COEFFICIENTS_FCC                = 4,
        SDL_MATRIX_COEFFICIENTS_BT470BG            = 5,
        SDL_MATRIX_COEFFICIENTS_BT601              = 6,
        SDL_MATRIX_COEFFICIENTS_SMPTE240           = 7,
        SDL_MATRIX_COEFFICIENTS_YCGCO              = 8,
        SDL_MATRIX_COEFFICIENTS_BT2020_NCL         = 9,
        SDL_MATRIX_COEFFICIENTS_BT2020_CL          = 10,
        SDL_MATRIX_COEFFICIENTS_SMPTE2085          = 11,
        SDL_MATRIX_COEFFICIENTS_CHROMA_DERIVED_NCL = 12,
        SDL_MATRIX_COEFFICIENTS_CHROMA_DERIVED_CL  = 13,
        SDL_MATRIX_COEFFICIENTS_ICTCP              = 14,
        SDL_MATRIX_COEFFICIENTS_CUSTOM             = 31;

    public static final int
        SDL_CHROMA_LOCATION_NONE    = 0,
        SDL_CHROMA_LOCATION_LEFT    = 1,
        SDL_CHROMA_LOCATION_CENTER  = 2,
        SDL_CHROMA_LOCATION_TOPLEFT = 3;

    public static final int
        SDL_COLORSPACE_UNKNOWN        = 0,
        SDL_COLORSPACE_SRGB           = 0x120005a0,
        SDL_COLORSPACE_SRGB_LINEAR    = 0x12000500,
        SDL_COLORSPACE_HDR10          = 0x12002600,
        SDL_COLORSPACE_JPEG           = 0x220004c6,
        SDL_COLORSPACE_BT601_LIMITED  = 0x211018c6,
        SDL_COLORSPACE_BT601_FULL     = 0x221018c6,
        SDL_COLORSPACE_BT709_LIMITED  = 0x21100421,
        SDL_COLORSPACE_BT709_FULL     = 0x22100421,
        SDL_COLORSPACE_BT2020_LIMITED = 0x21102609,
        SDL_COLORSPACE_BT2020_FULL    = 0x22102609,
        SDL_COLORSPACE_RGB_DEFAULT    = SDL_COLORSPACE_SRGB,
        SDL_COLORSPACE_YUV_DEFAULT    = SDL_COLORSPACE_JPEG;

    protected SDLPixels() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GetPixelFormatName ] ---

    /** {@code char const * SDL_GetPixelFormatName(SDL_PixelFormat format)} */
    public static long nSDL_GetPixelFormatName(int format) {
        long __functionAddress = Functions.GetPixelFormatName;
        return invokeP(format, __functionAddress);
    }

    /** {@code char const * SDL_GetPixelFormatName(SDL_PixelFormat format)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetPixelFormatName(@NativeType("SDL_PixelFormat") int format) {
        long __result = nSDL_GetPixelFormatName(format);
        return memASCIISafe(__result);
    }

    // --- [ SDL_GetMasksForPixelFormat ] ---

    /** {@code bool SDL_GetMasksForPixelFormat(SDL_PixelFormat format, int * bpp, Uint32 * Rmask, Uint32 * Gmask, Uint32 * Bmask, Uint32 * Amask)} */
    public static boolean nSDL_GetMasksForPixelFormat(int format, long bpp, long Rmask, long Gmask, long Bmask, long Amask) {
        long __functionAddress = Functions.GetMasksForPixelFormat;
        return invokePPPPPZ(format, bpp, Rmask, Gmask, Bmask, Amask, __functionAddress);
    }

    /** {@code bool SDL_GetMasksForPixelFormat(SDL_PixelFormat format, int * bpp, Uint32 * Rmask, Uint32 * Gmask, Uint32 * Bmask, Uint32 * Amask)} */
    @NativeType("bool")
    public static boolean SDL_GetMasksForPixelFormat(@NativeType("SDL_PixelFormat") int format, @NativeType("int *") IntBuffer bpp, @NativeType("Uint32 *") IntBuffer Rmask, @NativeType("Uint32 *") IntBuffer Gmask, @NativeType("Uint32 *") IntBuffer Bmask, @NativeType("Uint32 *") IntBuffer Amask) {
        if (CHECKS) {
            check(bpp, 1);
            check(Rmask, 1);
            check(Gmask, 1);
            check(Bmask, 1);
            check(Amask, 1);
        }
        return nSDL_GetMasksForPixelFormat(format, memAddress(bpp), memAddress(Rmask), memAddress(Gmask), memAddress(Bmask), memAddress(Amask));
    }

    // --- [ SDL_GetPixelFormatForMasks ] ---

    /** {@code SDL_PixelFormat SDL_GetPixelFormatForMasks(int bpp, Uint32 Rmask, Uint32 Gmask, Uint32 Bmask, Uint32 Amask)} */
    @NativeType("SDL_PixelFormat")
    public static int SDL_GetPixelFormatForMasks(int bpp, @NativeType("Uint32") int Rmask, @NativeType("Uint32") int Gmask, @NativeType("Uint32") int Bmask, @NativeType("Uint32") int Amask) {
        long __functionAddress = Functions.GetPixelFormatForMasks;
        return invokeI(bpp, Rmask, Gmask, Bmask, Amask, __functionAddress);
    }

    // --- [ SDL_GetPixelFormatDetails ] ---

    /** {@code SDL_PixelFormatDetails const * SDL_GetPixelFormatDetails(SDL_PixelFormat format)} */
    public static long nSDL_GetPixelFormatDetails(int format) {
        long __functionAddress = Functions.GetPixelFormatDetails;
        return invokeP(format, __functionAddress);
    }

    /** {@code SDL_PixelFormatDetails const * SDL_GetPixelFormatDetails(SDL_PixelFormat format)} */
    @NativeType("SDL_PixelFormatDetails const *")
    public static @Nullable SDL_PixelFormatDetails SDL_GetPixelFormatDetails(@NativeType("SDL_PixelFormat") int format) {
        long __result = nSDL_GetPixelFormatDetails(format);
        return SDL_PixelFormatDetails.createSafe(__result);
    }

    // --- [ SDL_CreatePalette ] ---

    /** {@code SDL_Palette * SDL_CreatePalette(int ncolors)} */
    public static long nSDL_CreatePalette(int ncolors) {
        long __functionAddress = Functions.CreatePalette;
        return invokeP(ncolors, __functionAddress);
    }

    /** {@code SDL_Palette * SDL_CreatePalette(int ncolors)} */
    @NativeType("SDL_Palette *")
    public static @Nullable SDL_Palette SDL_CreatePalette(int ncolors) {
        long __result = nSDL_CreatePalette(ncolors);
        return SDL_Palette.createSafe(__result);
    }

    // --- [ SDL_SetPaletteColors ] ---

    /** {@code bool SDL_SetPaletteColors(SDL_Palette * palette, SDL_Color const * colors, int firstcolor, int ncolors)} */
    public static boolean nSDL_SetPaletteColors(long palette, long colors, int firstcolor, int ncolors) {
        long __functionAddress = Functions.SetPaletteColors;
        return invokePPZ(palette, colors, firstcolor, ncolors, __functionAddress);
    }

    /** {@code bool SDL_SetPaletteColors(SDL_Palette * palette, SDL_Color const * colors, int firstcolor, int ncolors)} */
    @NativeType("bool")
    public static boolean SDL_SetPaletteColors(@NativeType("SDL_Palette *") SDL_Palette palette, @NativeType("SDL_Color const *") SDL_Color.Buffer colors, int firstcolor) {
        return nSDL_SetPaletteColors(palette.address(), colors.address(), firstcolor, colors.remaining());
    }

    // --- [ SDL_DestroyPalette ] ---

    /** {@code void SDL_DestroyPalette(SDL_Palette * palette)} */
    public static void nSDL_DestroyPalette(long palette) {
        long __functionAddress = Functions.DestroyPalette;
        invokePV(palette, __functionAddress);
    }

    /** {@code void SDL_DestroyPalette(SDL_Palette * palette)} */
    public static void SDL_DestroyPalette(@NativeType("SDL_Palette *") SDL_Palette palette) {
        nSDL_DestroyPalette(palette.address());
    }

    // --- [ SDL_MapRGB ] ---

    /** {@code Uint32 SDL_MapRGB(SDL_PixelFormatDetails const * format, SDL_Palette const * palette, Uint8 r, Uint8 g, Uint8 b)} */
    public static int nSDL_MapRGB(long format, long palette, byte r, byte g, byte b) {
        long __functionAddress = Functions.MapRGB;
        return invokePPUUUI(format, palette, r, g, b, __functionAddress);
    }

    /** {@code Uint32 SDL_MapRGB(SDL_PixelFormatDetails const * format, SDL_Palette const * palette, Uint8 r, Uint8 g, Uint8 b)} */
    @NativeType("Uint32")
    public static int SDL_MapRGB(@NativeType("SDL_PixelFormatDetails const *") SDL_PixelFormatDetails format, @NativeType("SDL_Palette const *") @Nullable SDL_Palette palette, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b) {
        return nSDL_MapRGB(format.address(), memAddressSafe(palette), r, g, b);
    }

    // --- [ SDL_MapRGBA ] ---

    /** {@code Uint32 SDL_MapRGBA(SDL_PixelFormatDetails const * format, SDL_Palette const * palette, Uint8 r, Uint8 g, Uint8 b, Uint8 a)} */
    public static int nSDL_MapRGBA(long format, long palette, byte r, byte g, byte b, byte a) {
        long __functionAddress = Functions.MapRGBA;
        return invokePPUUUUI(format, palette, r, g, b, a, __functionAddress);
    }

    /** {@code Uint32 SDL_MapRGBA(SDL_PixelFormatDetails const * format, SDL_Palette const * palette, Uint8 r, Uint8 g, Uint8 b, Uint8 a)} */
    @NativeType("Uint32")
    public static int SDL_MapRGBA(@NativeType("SDL_PixelFormatDetails const *") SDL_PixelFormatDetails format, @NativeType("SDL_Palette const *") @Nullable SDL_Palette palette, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b, @NativeType("Uint8") byte a) {
        return nSDL_MapRGBA(format.address(), memAddressSafe(palette), r, g, b, a);
    }

    // --- [ SDL_GetRGB ] ---

    /** {@code void SDL_GetRGB(Uint32 pixel, SDL_PixelFormatDetails const * format, SDL_Palette const * palette, Uint8 * r, Uint8 * g, Uint8 * b)} */
    public static void nSDL_GetRGB(int pixel, long format, long palette, long r, long g, long b) {
        long __functionAddress = Functions.GetRGB;
        invokePPPPPV(pixel, format, palette, r, g, b, __functionAddress);
    }

    /** {@code void SDL_GetRGB(Uint32 pixel, SDL_PixelFormatDetails const * format, SDL_Palette const * palette, Uint8 * r, Uint8 * g, Uint8 * b)} */
    public static void SDL_GetRGB(@NativeType("Uint32") int pixel, @NativeType("SDL_PixelFormatDetails const *") SDL_PixelFormatDetails format, @NativeType("SDL_Palette const *") @Nullable SDL_Palette palette, @NativeType("Uint8 *") @Nullable ByteBuffer r, @NativeType("Uint8 *") @Nullable ByteBuffer g, @NativeType("Uint8 *") @Nullable ByteBuffer b) {
        if (CHECKS) {
            checkSafe(r, 1);
            checkSafe(g, 1);
            checkSafe(b, 1);
        }
        nSDL_GetRGB(pixel, format.address(), memAddressSafe(palette), memAddressSafe(r), memAddressSafe(g), memAddressSafe(b));
    }

    // --- [ SDL_GetRGBA ] ---

    /** {@code void SDL_GetRGBA(Uint32 pixel, SDL_PixelFormatDetails const * format, SDL_Palette const * palette, Uint8 * r, Uint8 * g, Uint8 * b, Uint8 * a)} */
    public static void nSDL_GetRGBA(int pixel, long format, long palette, long r, long g, long b, long a) {
        long __functionAddress = Functions.GetRGBA;
        invokePPPPPPV(pixel, format, palette, r, g, b, a, __functionAddress);
    }

    /** {@code void SDL_GetRGBA(Uint32 pixel, SDL_PixelFormatDetails const * format, SDL_Palette const * palette, Uint8 * r, Uint8 * g, Uint8 * b, Uint8 * a)} */
    public static void SDL_GetRGBA(@NativeType("Uint32") int pixel, @NativeType("SDL_PixelFormatDetails const *") SDL_PixelFormatDetails format, @NativeType("SDL_Palette const *") @Nullable SDL_Palette palette, @NativeType("Uint8 *") @Nullable ByteBuffer r, @NativeType("Uint8 *") @Nullable ByteBuffer g, @NativeType("Uint8 *") @Nullable ByteBuffer b, @NativeType("Uint8 *") @Nullable ByteBuffer a) {
        if (CHECKS) {
            checkSafe(r, 1);
            checkSafe(g, 1);
            checkSafe(b, 1);
            checkSafe(a, 1);
        }
        nSDL_GetRGBA(pixel, format.address(), memAddressSafe(palette), memAddressSafe(r), memAddressSafe(g), memAddressSafe(b), memAddressSafe(a));
    }

    // --- [ SDL_DEFINE_PIXELFOURCC ] ---

    /** {@code uint32_t SDL_DEFINE_PIXELFOURCC(uint8_t A, uint8_t B, uint8_t C, uint8_t D)} */
    @NativeType("uint32_t")
    public static int SDL_DEFINE_PIXELFOURCC(@NativeType("uint8_t") byte A, @NativeType("uint8_t") byte B, @NativeType("uint8_t") byte C, @NativeType("uint8_t") byte D) {
        return SDL_FOURCC(A, B, C, D);
    }

    // --- [ SDL_DEFINE_PIXELFORMAT ] ---

    /** {@code SDL_PixelFormat SDL_DEFINE_PIXELFORMAT(SDL_PixelType type, SDL_BitmapOrder order, SDL_PackedLayout layout, uint32_t bits, uint32_t bytes)} */
    @NativeType("SDL_PixelFormat")
    public static int SDL_DEFINE_PIXELFORMAT(@NativeType("SDL_PixelType") int type, @NativeType("SDL_BitmapOrder") int order, @NativeType("SDL_PackedLayout") int layout, @NativeType("uint32_t") int bits, @NativeType("uint32_t") int bytes) {
        return (1 << 28) | (type << 24) | (order << 20) | (layout << 16) | ((bits & 0xFF) << 8) | ((bytes & 0xFF) << 0);
    }

    // --- [ SDL_PIXELFLAG ] ---

    /** {@code uint32_t SDL_PIXELFLAG(SDL_PixelFormat format)} */
    @NativeType("uint32_t")
    public static int SDL_PIXELFLAG(@NativeType("SDL_PixelFormat") int format) {
        return (format >> 28) & 0x0F;
    }

    // --- [ SDL_PIXELTYPE ] ---

    /** {@code SDL_PixelType SDL_PIXELTYPE(SDL_PixelFormat format)} */
    @NativeType("SDL_PixelType")
    public static int SDL_PIXELTYPE(@NativeType("SDL_PixelFormat") int format) {
        return (format >> 24) & 0x0F;
    }

    // --- [ SDL_PIXELORDER ] ---

    /** {@code SDL_BitmapOrder SDL_PIXELORDER(SDL_PixelFormat format)} */
    @NativeType("SDL_BitmapOrder")
    public static int SDL_PIXELORDER(@NativeType("SDL_PixelFormat") int format) {
        return (format >> 20) & 0x0F;
    }

    // --- [ SDL_PIXELLAYOUT ] ---

    /** {@code SDL_PackedLayout SDL_PIXELLAYOUT(SDL_PixelFormat format)} */
    @NativeType("SDL_PackedLayout")
    public static int SDL_PIXELLAYOUT(@NativeType("SDL_PixelFormat") int format) {
        return (format >> 16) & 0x0F;
    }

    // --- [ SDL_BITSPERPIXEL ] ---

    /** {@code uint32_t SDL_BITSPERPIXEL(SDL_PixelFormat format)} */
    @NativeType("uint32_t")
    public static int SDL_BITSPERPIXEL(@NativeType("SDL_PixelFormat") int format) {
        return SDL_ISPIXELFORMAT_FOURCC(format) ? 0 : ((format >> 8) & 0xFF);
    }

    // --- [ SDL_BYTESPERPIXEL ] ---

    /** {@code uint32_t SDL_BYTESPERPIXEL(SDL_PixelFormat format)} */
    @NativeType("uint32_t")
    public static int SDL_BYTESPERPIXEL(@NativeType("SDL_PixelFormat") int format) {
        return SDL_ISPIXELFORMAT_FOURCC(format) ?
            (
                (format == SDL_PIXELFORMAT_YUY2) ||
                (format == SDL_PIXELFORMAT_UYVY) ||
                (format == SDL_PIXELFORMAT_YVYU) ||
                (format == SDL_PIXELFORMAT_P010) ? 2 : 1
            ) : ((format >> 0) & 0xFF);
    }

    // --- [ SDL_ISPIXELFORMAT_INDEXED ] ---

    /** {@code bool SDL_ISPIXELFORMAT_INDEXED(SDL_PixelFormat format)} */
    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_INDEXED(@NativeType("SDL_PixelFormat") int format) {
        return !SDL_ISPIXELFORMAT_FOURCC(format) &&
               (
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_INDEX1 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_INDEX2 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_INDEX4 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_INDEX8
               );
    }

    // --- [ SDL_ISPIXELFORMAT_PACKED ] ---

    /** {@code bool SDL_ISPIXELFORMAT_PACKED(SDL_PixelFormat format)} */
    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_PACKED(@NativeType("SDL_PixelFormat") int format) {
        return !SDL_ISPIXELFORMAT_FOURCC(format) &&
               (
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_PACKED8 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_PACKED16 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_PACKED32
               );
    }

    // --- [ SDL_ISPIXELFORMAT_ARRAY ] ---

    /** {@code bool SDL_ISPIXELFORMAT_ARRAY(SDL_PixelFormat format)} */
    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_ARRAY(@NativeType("SDL_PixelFormat") int format) {
        return !SDL_ISPIXELFORMAT_FOURCC(format) &&
               (
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYU8 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYU16 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYU32 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYF16 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYF32
               );
    }

    // --- [ SDL_ISPIXELFORMAT_10BIT ] ---

    /** {@code bool SDL_ISPIXELFORMAT_10BIT(SDL_PixelFormat format)} */
    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_10BIT(@NativeType("SDL_PixelFormat") int format) {
        return !SDL_ISPIXELFORMAT_FOURCC(format) &&
               SDL_PIXELTYPE(format) == SDL_PIXELTYPE_PACKED32 &&
               SDL_PIXELLAYOUT(format) == SDL_PACKEDLAYOUT_2101010;
    }

    // --- [ SDL_ISPIXELFORMAT_FLOAT ] ---

    /** {@code bool SDL_ISPIXELFORMAT_FLOAT(SDL_PixelFormat format)} */
    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_FLOAT(@NativeType("SDL_PixelFormat") int format) {
        return !SDL_ISPIXELFORMAT_FOURCC(format) &&
               (
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYF16 ||
                   SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYF32
               );
    }

    // --- [ SDL_ISPIXELFORMAT_ALPHA ] ---

    /** {@code bool SDL_ISPIXELFORMAT_ALPHA(SDL_PixelFormat format)} */
    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_ALPHA(@NativeType("SDL_PixelFormat") int format) {
        return SDL_ISPIXELFORMAT_PACKED(format) &&
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
                );
    }

    // --- [ SDL_ISPIXELFORMAT_FOURCC ] ---

    /** {@code bool SDL_ISPIXELFORMAT_FOURCC(SDL_PixelFormat format)} */
    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_FOURCC(@NativeType("SDL_PixelFormat") int format) {
        return format != 0 && SDL_PIXELFLAG(format) != 1;
    }

    // --- [ SDL_DEFINE_COLORSPACE ] ---

    /** {@code SDL_Colorspace SDL_DEFINE_COLORSPACE(SDL_ColorType type, SDL_ColorRange range, SDL_ColorPrimaries primaries, SDL_TransferCharacteristics transfer, SDL_MatrixCoefficients matrix, SDL_ChromaLocation chroma)} */
    @NativeType("SDL_Colorspace")
    public static int SDL_DEFINE_COLORSPACE(@NativeType("SDL_ColorType") int type, @NativeType("SDL_ColorRange") int range, @NativeType("SDL_ColorPrimaries") int primaries, @NativeType("SDL_TransferCharacteristics") int transfer, @NativeType("SDL_MatrixCoefficients") int matrix, @NativeType("SDL_ChromaLocation") int chroma) {
        return (type << 28) | (range << 24) | (chroma << 20) | (primaries << 10) | (transfer << 5) | (matrix << 0);
    }

    // --- [ SDL_COLORSPACETYPE ] ---

    /** {@code SDL_ColorType SDL_COLORSPACETYPE(SDL_Colorspace cspace)} */
    @NativeType("SDL_ColorType")
    public static int SDL_COLORSPACETYPE(@NativeType("SDL_Colorspace") int cspace) {
        return (cspace >> 28) & 0x0F;
    }

    // --- [ SDL_COLORSPACERANGE ] ---

    /** {@code SDL_ColorRange SDL_COLORSPACERANGE(SDL_Colorspace cspace)} */
    @NativeType("SDL_ColorRange")
    public static int SDL_COLORSPACERANGE(@NativeType("SDL_Colorspace") int cspace) {
        return (cspace >> 24) & 0x0F;
    }

    // --- [ SDL_COLORSPACECHROMA ] ---

    /** {@code SDL_ChromaLocation SDL_COLORSPACECHROMA(SDL_Colorspace cspace)} */
    @NativeType("SDL_ChromaLocation")
    public static int SDL_COLORSPACECHROMA(@NativeType("SDL_Colorspace") int cspace) {
        return (cspace >> 20) & 0x0F;
    }

    // --- [ SDL_COLORSPACEPRIMARIES ] ---

    /** {@code SDL_ColorPrimaries SDL_COLORSPACEPRIMARIES(SDL_Colorspace cspace)} */
    @NativeType("SDL_ColorPrimaries")
    public static int SDL_COLORSPACEPRIMARIES(@NativeType("SDL_Colorspace") int cspace) {
        return (cspace >> 10) & 0x1F;
    }

    // --- [ SDL_COLORSPACETRANSFER ] ---

    /** {@code SDL_TransferCharacteristics SDL_COLORSPACETRANSFER(SDL_Colorspace cspace)} */
    @NativeType("SDL_TransferCharacteristics")
    public static int SDL_COLORSPACETRANSFER(@NativeType("SDL_Colorspace") int cspace) {
        return (cspace >> 5) & 0x1F;
    }

    // --- [ SDL_COLORSPACEMATRIX ] ---

    /** {@code SDL_MatrixCoefficients SDL_COLORSPACEMATRIX(SDL_Colorspace cspace)} */
    @NativeType("SDL_MatrixCoefficients")
    public static int SDL_COLORSPACEMATRIX(@NativeType("SDL_Colorspace") int cspace) {
        return cspace & 0x1F;
    }

    // --- [ SDL_ISCOLORSPACE_MATRIX_BT601 ] ---

    /** {@code bool SDL_ISCOLORSPACE_MATRIX_BT601(SDL_Colorspace cspace)} */
    @NativeType("bool")
    public static boolean SDL_ISCOLORSPACE_MATRIX_BT601(@NativeType("SDL_Colorspace") int cspace) {
        return SDL_COLORSPACEMATRIX(cspace) == SDL_MATRIX_COEFFICIENTS_BT601 || SDL_COLORSPACEMATRIX(cspace) == SDL_MATRIX_COEFFICIENTS_BT470BG;
    }

    // --- [ SDL_ISCOLORSPACE_MATRIX_BT709 ] ---

    /** {@code bool SDL_ISCOLORSPACE_MATRIX_BT709(SDL_Colorspace cspace)} */
    @NativeType("bool")
    public static boolean SDL_ISCOLORSPACE_MATRIX_BT709(@NativeType("SDL_Colorspace") int cspace) {
        return SDL_COLORSPACEMATRIX(cspace) == SDL_MATRIX_COEFFICIENTS_BT709;
    }

    // --- [ SDL_ISCOLORSPACE_MATRIX_BT2020_NCL ] ---

    /** {@code bool SDL_ISCOLORSPACE_MATRIX_BT2020_NCL(SDL_Colorspace cspace)} */
    @NativeType("bool")
    public static boolean SDL_ISCOLORSPACE_MATRIX_BT2020_NCL(@NativeType("SDL_Colorspace") int cspace) {
        return SDL_COLORSPACEMATRIX(cspace) == SDL_MATRIX_COEFFICIENTS_BT2020_NCL;
    }

    // --- [ SDL_ISCOLORSPACE_LIMITED_RANGE ] ---

    /** {@code bool SDL_ISCOLORSPACE_LIMITED_RANGE(SDL_Colorspace cspace)} */
    @NativeType("bool")
    public static boolean SDL_ISCOLORSPACE_LIMITED_RANGE(@NativeType("SDL_Colorspace") int cspace) {
        return SDL_COLORSPACERANGE(cspace) != SDL_COLOR_RANGE_FULL;
    }

    // --- [ SDL_ISCOLORSPACE_FULL_RANGE ] ---

    /** {@code bool SDL_ISCOLORSPACE_FULL_RANGE(SDL_Colorspace cspace)} */
    @NativeType("bool")
    public static boolean SDL_ISCOLORSPACE_FULL_RANGE(@NativeType("SDL_Colorspace") int cspace) {
        return SDL_COLORSPACERANGE(cspace) == SDL_COLOR_RANGE_FULL;
    }

}