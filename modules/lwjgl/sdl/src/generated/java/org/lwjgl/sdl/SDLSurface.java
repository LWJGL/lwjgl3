/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLSurface {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CreateSurface                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateSurface"),
            CreateSurfaceFrom            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateSurfaceFrom"),
            DestroySurface               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroySurface"),
            GetSurfaceProperties         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSurfaceProperties"),
            SetSurfaceColorspace         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetSurfaceColorspace"),
            GetSurfaceColorspace         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSurfaceColorspace"),
            CreateSurfacePalette         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateSurfacePalette"),
            SetSurfacePalette            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetSurfacePalette"),
            GetSurfacePalette            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSurfacePalette"),
            AddSurfaceAlternateImage     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_AddSurfaceAlternateImage"),
            SurfaceHasAlternateImages    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SurfaceHasAlternateImages"),
            GetSurfaceImages             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSurfaceImages"),
            RemoveSurfaceAlternateImages = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RemoveSurfaceAlternateImages"),
            LockSurface                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LockSurface"),
            UnlockSurface                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnlockSurface"),
            LoadBMP_IO                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadBMP_IO"),
            LoadBMP                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadBMP"),
            SaveBMP_IO                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SaveBMP_IO"),
            SaveBMP                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SaveBMP"),
            SetSurfaceRLE                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetSurfaceRLE"),
            SurfaceHasRLE                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SurfaceHasRLE"),
            SetSurfaceColorKey           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetSurfaceColorKey"),
            SurfaceHasColorKey           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SurfaceHasColorKey"),
            GetSurfaceColorKey           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSurfaceColorKey"),
            SetSurfaceColorMod           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetSurfaceColorMod"),
            GetSurfaceColorMod           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSurfaceColorMod"),
            SetSurfaceAlphaMod           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetSurfaceAlphaMod"),
            GetSurfaceAlphaMod           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSurfaceAlphaMod"),
            SetSurfaceBlendMode          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetSurfaceBlendMode"),
            GetSurfaceBlendMode          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSurfaceBlendMode"),
            SetSurfaceClipRect           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetSurfaceClipRect"),
            GetSurfaceClipRect           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSurfaceClipRect"),
            FlipSurface                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_FlipSurface"),
            DuplicateSurface             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DuplicateSurface"),
            ScaleSurface                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ScaleSurface"),
            ConvertSurface               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ConvertSurface"),
            ConvertSurfaceAndColorspace  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ConvertSurfaceAndColorspace"),
            ConvertPixels                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ConvertPixels"),
            ConvertPixelsAndColorspace   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ConvertPixelsAndColorspace"),
            PremultiplyAlpha             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_PremultiplyAlpha"),
            PremultiplySurfaceAlpha      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_PremultiplySurfaceAlpha"),
            ClearSurface                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ClearSurface"),
            FillSurfaceRect              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_FillSurfaceRect"),
            FillSurfaceRects             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_FillSurfaceRects"),
            BlitSurface                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BlitSurface"),
            BlitSurfaceUnchecked         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BlitSurfaceUnchecked"),
            BlitSurfaceScaled            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BlitSurfaceScaled"),
            BlitSurfaceUncheckedScaled   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BlitSurfaceUncheckedScaled"),
            StretchSurface               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_StretchSurface"),
            BlitSurfaceTiled             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BlitSurfaceTiled"),
            BlitSurfaceTiledWithScale    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BlitSurfaceTiledWithScale"),
            BlitSurface9Grid             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BlitSurface9Grid"),
            MapSurfaceRGB                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_MapSurfaceRGB"),
            MapSurfaceRGBA               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_MapSurfaceRGBA"),
            ReadSurfacePixel             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadSurfacePixel"),
            ReadSurfacePixelFloat        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadSurfacePixelFloat"),
            WriteSurfacePixel            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteSurfacePixel"),
            WriteSurfacePixelFloat       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteSurfacePixelFloat");

    }

    public static final int
        SDL_SURFACE_PREALLOCATED = 0x00000001,
        SDL_SURFACE_LOCK_NEEDED  = 0x00000002,
        SDL_SURFACE_LOCKED       = 0x00000004,
        SDL_SURFACE_SIMD_ALIGNED = 0x00000008;

    public static final int
        SDL_SCALEMODE_INVALID = -1,
        SDL_SCALEMODE_NEAREST = 0,
        SDL_SCALEMODE_LINEAR  = 1;

    public static final int
        SDL_FLIP_NONE       = 0,
        SDL_FLIP_HORIZONTAL = 1,
        SDL_FLIP_VERTICAL   = 2;

    public static final String
        SDL_PROP_SURFACE_SDR_WHITE_POINT_FLOAT   = "SDL.surface.SDR_white_point",
        SDL_PROP_SURFACE_HDR_HEADROOM_FLOAT      = "SDL.surface.HDR_headroom",
        SDL_PROP_SURFACE_TONEMAP_OPERATOR_STRING = "SDL.surface.tonemap",
        SDL_PROP_SURFACE_HOTSPOT_X_NUMBER        = "SDL.surface.hotspot.x",
        SDL_PROP_SURFACE_HOTSPOT_Y_NUMBER        = "SDL.surface.hotspot.y";

    protected SDLSurface() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_CreateSurface ] ---

    /** {@code SDL_Surface * SDL_CreateSurface(int width, int height, SDL_PixelFormat format)} */
    public static long nSDL_CreateSurface(int width, int height, int format) {
        long __functionAddress = Functions.CreateSurface;
        return invokeP(width, height, format, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_CreateSurface(int width, int height, SDL_PixelFormat format)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_CreateSurface(int width, int height, @NativeType("SDL_PixelFormat") int format) {
        long __result = nSDL_CreateSurface(width, height, format);
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_CreateSurfaceFrom ] ---

    /** {@code SDL_Surface * SDL_CreateSurfaceFrom(int width, int height, SDL_PixelFormat format, void * pixels, int pitch)} */
    public static long nSDL_CreateSurfaceFrom(int width, int height, int format, long pixels, int pitch) {
        long __functionAddress = Functions.CreateSurfaceFrom;
        return invokePP(width, height, format, pixels, pitch, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_CreateSurfaceFrom(int width, int height, SDL_PixelFormat format, void * pixels, int pitch)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_CreateSurfaceFrom(int width, int height, @NativeType("SDL_PixelFormat") int format, @NativeType("void *") @Nullable ByteBuffer pixels, int pitch) {
        if (CHECKS) {
            checkSafe(pixels, height * pitch);
        }
        long __result = nSDL_CreateSurfaceFrom(width, height, format, memAddressSafe(pixels), pitch);
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_DestroySurface ] ---

    /** {@code void SDL_DestroySurface(SDL_Surface * surface)} */
    public static void nSDL_DestroySurface(long surface) {
        long __functionAddress = Functions.DestroySurface;
        invokePV(surface, __functionAddress);
    }

    /** {@code void SDL_DestroySurface(SDL_Surface * surface)} */
    public static void SDL_DestroySurface(@NativeType("SDL_Surface *") SDL_Surface surface) {
        nSDL_DestroySurface(surface.address());
    }

    // --- [ SDL_GetSurfaceProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetSurfaceProperties(SDL_Surface * surface)} */
    public static int nSDL_GetSurfaceProperties(long surface) {
        long __functionAddress = Functions.GetSurfaceProperties;
        return invokePI(surface, __functionAddress);
    }

    /** {@code SDL_PropertiesID SDL_GetSurfaceProperties(SDL_Surface * surface)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetSurfaceProperties(@NativeType("SDL_Surface *") SDL_Surface surface) {
        return nSDL_GetSurfaceProperties(surface.address());
    }

    // --- [ SDL_SetSurfaceColorspace ] ---

    /** {@code bool SDL_SetSurfaceColorspace(SDL_Surface * surface, SDL_Colorspace colorspace)} */
    public static boolean nSDL_SetSurfaceColorspace(long surface, int colorspace) {
        long __functionAddress = Functions.SetSurfaceColorspace;
        return invokePZ(surface, colorspace, __functionAddress);
    }

    /** {@code bool SDL_SetSurfaceColorspace(SDL_Surface * surface, SDL_Colorspace colorspace)} */
    @NativeType("bool")
    public static boolean SDL_SetSurfaceColorspace(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_Colorspace") int colorspace) {
        return nSDL_SetSurfaceColorspace(surface.address(), colorspace);
    }

    // --- [ SDL_GetSurfaceColorspace ] ---

    /** {@code SDL_Colorspace SDL_GetSurfaceColorspace(SDL_Surface * surface)} */
    public static int nSDL_GetSurfaceColorspace(long surface) {
        long __functionAddress = Functions.GetSurfaceColorspace;
        return invokePI(surface, __functionAddress);
    }

    /** {@code SDL_Colorspace SDL_GetSurfaceColorspace(SDL_Surface * surface)} */
    @NativeType("SDL_Colorspace")
    public static int SDL_GetSurfaceColorspace(@NativeType("SDL_Surface *") SDL_Surface surface) {
        return nSDL_GetSurfaceColorspace(surface.address());
    }

    // --- [ SDL_CreateSurfacePalette ] ---

    /** {@code SDL_Palette * SDL_CreateSurfacePalette(SDL_Surface * surface)} */
    public static long nSDL_CreateSurfacePalette(long surface) {
        long __functionAddress = Functions.CreateSurfacePalette;
        return invokePP(surface, __functionAddress);
    }

    /** {@code SDL_Palette * SDL_CreateSurfacePalette(SDL_Surface * surface)} */
    @NativeType("SDL_Palette *")
    public static @Nullable SDL_Palette SDL_CreateSurfacePalette(@NativeType("SDL_Surface *") SDL_Surface surface) {
        long __result = nSDL_CreateSurfacePalette(surface.address());
        return SDL_Palette.createSafe(__result);
    }

    // --- [ SDL_SetSurfacePalette ] ---

    /** {@code bool SDL_SetSurfacePalette(SDL_Surface * surface, SDL_Palette * palette)} */
    public static boolean nSDL_SetSurfacePalette(long surface, long palette) {
        long __functionAddress = Functions.SetSurfacePalette;
        return invokePPZ(surface, palette, __functionAddress);
    }

    /** {@code bool SDL_SetSurfacePalette(SDL_Surface * surface, SDL_Palette * palette)} */
    @NativeType("bool")
    public static boolean SDL_SetSurfacePalette(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_Palette *") @Nullable SDL_Palette palette) {
        return nSDL_SetSurfacePalette(surface.address(), memAddressSafe(palette));
    }

    // --- [ SDL_GetSurfacePalette ] ---

    /** {@code SDL_Palette * SDL_GetSurfacePalette(SDL_Surface * surface)} */
    public static long nSDL_GetSurfacePalette(long surface) {
        long __functionAddress = Functions.GetSurfacePalette;
        return invokePP(surface, __functionAddress);
    }

    /** {@code SDL_Palette * SDL_GetSurfacePalette(SDL_Surface * surface)} */
    @NativeType("SDL_Palette *")
    public static @Nullable SDL_Palette SDL_GetSurfacePalette(@NativeType("SDL_Surface *") SDL_Surface surface) {
        long __result = nSDL_GetSurfacePalette(surface.address());
        return SDL_Palette.createSafe(__result);
    }

    // --- [ SDL_AddSurfaceAlternateImage ] ---

    /** {@code bool SDL_AddSurfaceAlternateImage(SDL_Surface * surface, SDL_Surface * image)} */
    public static boolean nSDL_AddSurfaceAlternateImage(long surface, long image) {
        long __functionAddress = Functions.AddSurfaceAlternateImage;
        return invokePPZ(surface, image, __functionAddress);
    }

    /** {@code bool SDL_AddSurfaceAlternateImage(SDL_Surface * surface, SDL_Surface * image)} */
    @NativeType("bool")
    public static boolean SDL_AddSurfaceAlternateImage(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_Surface *") SDL_Surface image) {
        return nSDL_AddSurfaceAlternateImage(surface.address(), image.address());
    }

    // --- [ SDL_SurfaceHasAlternateImages ] ---

    /** {@code bool SDL_SurfaceHasAlternateImages(SDL_Surface * surface)} */
    public static boolean nSDL_SurfaceHasAlternateImages(long surface) {
        long __functionAddress = Functions.SurfaceHasAlternateImages;
        return invokePZ(surface, __functionAddress);
    }

    /** {@code bool SDL_SurfaceHasAlternateImages(SDL_Surface * surface)} */
    @NativeType("bool")
    public static boolean SDL_SurfaceHasAlternateImages(@NativeType("SDL_Surface *") SDL_Surface surface) {
        return nSDL_SurfaceHasAlternateImages(surface.address());
    }

    // --- [ SDL_GetSurfaceImages ] ---

    /** {@code SDL_Surface ** SDL_GetSurfaceImages(SDL_Surface * surface, int * count)} */
    public static long nSDL_GetSurfaceImages(long surface, long count) {
        long __functionAddress = Functions.GetSurfaceImages;
        return invokePPP(surface, count, __functionAddress);
    }

    /** {@code SDL_Surface ** SDL_GetSurfaceImages(SDL_Surface * surface, int * count)} */
    @NativeType("SDL_Surface **")
    public static @Nullable PointerBuffer SDL_GetSurfaceImages(@NativeType("SDL_Surface *") SDL_Surface surface) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetSurfaceImages(surface.address(), memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_RemoveSurfaceAlternateImages ] ---

    /** {@code void SDL_RemoveSurfaceAlternateImages(SDL_Surface * surface)} */
    public static void nSDL_RemoveSurfaceAlternateImages(long surface) {
        long __functionAddress = Functions.RemoveSurfaceAlternateImages;
        invokePV(surface, __functionAddress);
    }

    /** {@code void SDL_RemoveSurfaceAlternateImages(SDL_Surface * surface)} */
    public static void SDL_RemoveSurfaceAlternateImages(@NativeType("SDL_Surface *") SDL_Surface surface) {
        nSDL_RemoveSurfaceAlternateImages(surface.address());
    }

    // --- [ SDL_LockSurface ] ---

    /** {@code bool SDL_LockSurface(SDL_Surface * surface)} */
    public static boolean nSDL_LockSurface(long surface) {
        long __functionAddress = Functions.LockSurface;
        return invokePZ(surface, __functionAddress);
    }

    /** {@code bool SDL_LockSurface(SDL_Surface * surface)} */
    @NativeType("bool")
    public static boolean SDL_LockSurface(@NativeType("SDL_Surface *") SDL_Surface surface) {
        return nSDL_LockSurface(surface.address());
    }

    // --- [ SDL_UnlockSurface ] ---

    /** {@code void SDL_UnlockSurface(SDL_Surface * surface)} */
    public static void nSDL_UnlockSurface(long surface) {
        long __functionAddress = Functions.UnlockSurface;
        invokePV(surface, __functionAddress);
    }

    /** {@code void SDL_UnlockSurface(SDL_Surface * surface)} */
    public static void SDL_UnlockSurface(@NativeType("SDL_Surface *") SDL_Surface surface) {
        nSDL_UnlockSurface(surface.address());
    }

    // --- [ SDL_LoadBMP_IO ] ---

    /** {@code SDL_Surface * SDL_LoadBMP_IO(SDL_IOStream * src, bool closeio)} */
    public static long nSDL_LoadBMP_IO(long src, boolean closeio) {
        long __functionAddress = Functions.LoadBMP_IO;
        if (CHECKS) {
            check(src);
        }
        return invokePP(src, closeio, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_LoadBMP_IO(SDL_IOStream * src, bool closeio)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_LoadBMP_IO(@NativeType("SDL_IOStream *") long src, @NativeType("bool") boolean closeio) {
        long __result = nSDL_LoadBMP_IO(src, closeio);
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_LoadBMP ] ---

    /** {@code SDL_Surface * SDL_LoadBMP(char const * file)} */
    public static long nSDL_LoadBMP(long file) {
        long __functionAddress = Functions.LoadBMP;
        return invokePP(file, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_LoadBMP(char const * file)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_LoadBMP(@NativeType("char const *") ByteBuffer file) {
        if (CHECKS) {
            checkNT1(file);
        }
        long __result = nSDL_LoadBMP(memAddress(file));
        return SDL_Surface.createSafe(__result);
    }

    /** {@code SDL_Surface * SDL_LoadBMP(char const * file)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_LoadBMP(@NativeType("char const *") CharSequence file) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            long __result = nSDL_LoadBMP(fileEncoded);
            return SDL_Surface.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SaveBMP_IO ] ---

    /** {@code bool SDL_SaveBMP_IO(SDL_Surface * surface, SDL_IOStream * dst, bool closeio)} */
    public static boolean nSDL_SaveBMP_IO(long surface, long dst, boolean closeio) {
        long __functionAddress = Functions.SaveBMP_IO;
        if (CHECKS) {
            check(dst);
        }
        return invokePPZ(surface, dst, closeio, __functionAddress);
    }

    /** {@code bool SDL_SaveBMP_IO(SDL_Surface * surface, SDL_IOStream * dst, bool closeio)} */
    @NativeType("bool")
    public static boolean SDL_SaveBMP_IO(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_IOStream *") long dst, @NativeType("bool") boolean closeio) {
        return nSDL_SaveBMP_IO(surface.address(), dst, closeio);
    }

    // --- [ SDL_SaveBMP ] ---

    /** {@code bool SDL_SaveBMP(SDL_Surface * surface, char const * file)} */
    public static boolean nSDL_SaveBMP(long surface, long file) {
        long __functionAddress = Functions.SaveBMP;
        return invokePPZ(surface, file, __functionAddress);
    }

    /** {@code bool SDL_SaveBMP(SDL_Surface * surface, char const * file)} */
    @NativeType("bool")
    public static boolean SDL_SaveBMP(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("char const *") ByteBuffer file) {
        if (CHECKS) {
            checkNT1(file);
        }
        return nSDL_SaveBMP(surface.address(), memAddress(file));
    }

    /** {@code bool SDL_SaveBMP(SDL_Surface * surface, char const * file)} */
    @NativeType("bool")
    public static boolean SDL_SaveBMP(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("char const *") CharSequence file) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            return nSDL_SaveBMP(surface.address(), fileEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetSurfaceRLE ] ---

    /** {@code bool SDL_SetSurfaceRLE(SDL_Surface * surface, bool enabled)} */
    public static boolean nSDL_SetSurfaceRLE(long surface, boolean enabled) {
        long __functionAddress = Functions.SetSurfaceRLE;
        return invokePZ(surface, enabled, __functionAddress);
    }

    /** {@code bool SDL_SetSurfaceRLE(SDL_Surface * surface, bool enabled)} */
    @NativeType("bool")
    public static boolean SDL_SetSurfaceRLE(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("bool") boolean enabled) {
        return nSDL_SetSurfaceRLE(surface.address(), enabled);
    }

    // --- [ SDL_SurfaceHasRLE ] ---

    /** {@code bool SDL_SurfaceHasRLE(SDL_Surface * surface)} */
    public static boolean nSDL_SurfaceHasRLE(long surface) {
        long __functionAddress = Functions.SurfaceHasRLE;
        return invokePZ(surface, __functionAddress);
    }

    /** {@code bool SDL_SurfaceHasRLE(SDL_Surface * surface)} */
    @NativeType("bool")
    public static boolean SDL_SurfaceHasRLE(@NativeType("SDL_Surface *") SDL_Surface surface) {
        return nSDL_SurfaceHasRLE(surface.address());
    }

    // --- [ SDL_SetSurfaceColorKey ] ---

    /** {@code bool SDL_SetSurfaceColorKey(SDL_Surface * surface, bool enabled, Uint32 key)} */
    public static boolean nSDL_SetSurfaceColorKey(long surface, boolean enabled, int key) {
        long __functionAddress = Functions.SetSurfaceColorKey;
        return invokePZ(surface, enabled, key, __functionAddress);
    }

    /** {@code bool SDL_SetSurfaceColorKey(SDL_Surface * surface, bool enabled, Uint32 key)} */
    @NativeType("bool")
    public static boolean SDL_SetSurfaceColorKey(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("bool") boolean enabled, @NativeType("Uint32") int key) {
        return nSDL_SetSurfaceColorKey(surface.address(), enabled, key);
    }

    // --- [ SDL_SurfaceHasColorKey ] ---

    /** {@code bool SDL_SurfaceHasColorKey(SDL_Surface * surface)} */
    public static boolean nSDL_SurfaceHasColorKey(long surface) {
        long __functionAddress = Functions.SurfaceHasColorKey;
        return invokePZ(surface, __functionAddress);
    }

    /** {@code bool SDL_SurfaceHasColorKey(SDL_Surface * surface)} */
    @NativeType("bool")
    public static boolean SDL_SurfaceHasColorKey(@NativeType("SDL_Surface *") SDL_Surface surface) {
        return nSDL_SurfaceHasColorKey(surface.address());
    }

    // --- [ SDL_GetSurfaceColorKey ] ---

    /** {@code bool SDL_GetSurfaceColorKey(SDL_Surface * surface, Uint32 * key)} */
    public static boolean nSDL_GetSurfaceColorKey(long surface, long key) {
        long __functionAddress = Functions.GetSurfaceColorKey;
        return invokePPZ(surface, key, __functionAddress);
    }

    /** {@code bool SDL_GetSurfaceColorKey(SDL_Surface * surface, Uint32 * key)} */
    @NativeType("bool")
    public static boolean SDL_GetSurfaceColorKey(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("Uint32 *") @Nullable IntBuffer key) {
        if (CHECKS) {
            checkSafe(key, 1);
        }
        return nSDL_GetSurfaceColorKey(surface.address(), memAddressSafe(key));
    }

    // --- [ SDL_SetSurfaceColorMod ] ---

    /** {@code bool SDL_SetSurfaceColorMod(SDL_Surface * surface, Uint8 r, Uint8 g, Uint8 b)} */
    public static boolean nSDL_SetSurfaceColorMod(long surface, byte r, byte g, byte b) {
        long __functionAddress = Functions.SetSurfaceColorMod;
        return invokePUUUZ(surface, r, g, b, __functionAddress);
    }

    /** {@code bool SDL_SetSurfaceColorMod(SDL_Surface * surface, Uint8 r, Uint8 g, Uint8 b)} */
    @NativeType("bool")
    public static boolean SDL_SetSurfaceColorMod(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b) {
        return nSDL_SetSurfaceColorMod(surface.address(), r, g, b);
    }

    // --- [ SDL_GetSurfaceColorMod ] ---

    /** {@code bool SDL_GetSurfaceColorMod(SDL_Surface * surface, Uint8 * r, Uint8 * g, Uint8 * b)} */
    public static boolean nSDL_GetSurfaceColorMod(long surface, long r, long g, long b) {
        long __functionAddress = Functions.GetSurfaceColorMod;
        return invokePPPPZ(surface, r, g, b, __functionAddress);
    }

    /** {@code bool SDL_GetSurfaceColorMod(SDL_Surface * surface, Uint8 * r, Uint8 * g, Uint8 * b)} */
    @NativeType("bool")
    public static boolean SDL_GetSurfaceColorMod(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("Uint8 *") @Nullable ByteBuffer r, @NativeType("Uint8 *") @Nullable ByteBuffer g, @NativeType("Uint8 *") @Nullable ByteBuffer b) {
        if (CHECKS) {
            checkSafe(r, 1);
            checkSafe(g, 1);
            checkSafe(b, 1);
        }
        return nSDL_GetSurfaceColorMod(surface.address(), memAddressSafe(r), memAddressSafe(g), memAddressSafe(b));
    }

    // --- [ SDL_SetSurfaceAlphaMod ] ---

    /** {@code bool SDL_SetSurfaceAlphaMod(SDL_Surface * surface, Uint8 alpha)} */
    public static boolean nSDL_SetSurfaceAlphaMod(long surface, byte alpha) {
        long __functionAddress = Functions.SetSurfaceAlphaMod;
        return invokePUZ(surface, alpha, __functionAddress);
    }

    /** {@code bool SDL_SetSurfaceAlphaMod(SDL_Surface * surface, Uint8 alpha)} */
    @NativeType("bool")
    public static boolean SDL_SetSurfaceAlphaMod(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("Uint8") byte alpha) {
        return nSDL_SetSurfaceAlphaMod(surface.address(), alpha);
    }

    // --- [ SDL_GetSurfaceAlphaMod ] ---

    /** {@code bool SDL_GetSurfaceAlphaMod(SDL_Surface * surface, Uint8 * alpha)} */
    public static boolean nSDL_GetSurfaceAlphaMod(long surface, long alpha) {
        long __functionAddress = Functions.GetSurfaceAlphaMod;
        return invokePPZ(surface, alpha, __functionAddress);
    }

    /** {@code bool SDL_GetSurfaceAlphaMod(SDL_Surface * surface, Uint8 * alpha)} */
    @NativeType("bool")
    public static boolean SDL_GetSurfaceAlphaMod(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("Uint8 *") @Nullable ByteBuffer alpha) {
        if (CHECKS) {
            checkSafe(alpha, 1);
        }
        return nSDL_GetSurfaceAlphaMod(surface.address(), memAddressSafe(alpha));
    }

    // --- [ SDL_SetSurfaceBlendMode ] ---

    /** {@code bool SDL_SetSurfaceBlendMode(SDL_Surface * surface, SDL_BlendMode blendMode)} */
    public static boolean nSDL_SetSurfaceBlendMode(long surface, int blendMode) {
        long __functionAddress = Functions.SetSurfaceBlendMode;
        return invokePZ(surface, blendMode, __functionAddress);
    }

    /** {@code bool SDL_SetSurfaceBlendMode(SDL_Surface * surface, SDL_BlendMode blendMode)} */
    @NativeType("bool")
    public static boolean SDL_SetSurfaceBlendMode(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_BlendMode") int blendMode) {
        return nSDL_SetSurfaceBlendMode(surface.address(), blendMode);
    }

    // --- [ SDL_GetSurfaceBlendMode ] ---

    /** {@code bool SDL_GetSurfaceBlendMode(SDL_Surface * surface, SDL_BlendMode * blendMode)} */
    public static boolean nSDL_GetSurfaceBlendMode(long surface, long blendMode) {
        long __functionAddress = Functions.GetSurfaceBlendMode;
        return invokePPZ(surface, blendMode, __functionAddress);
    }

    /** {@code bool SDL_GetSurfaceBlendMode(SDL_Surface * surface, SDL_BlendMode * blendMode)} */
    @NativeType("bool")
    public static boolean SDL_GetSurfaceBlendMode(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_BlendMode *") @Nullable IntBuffer blendMode) {
        if (CHECKS) {
            checkSafe(blendMode, 1);
        }
        return nSDL_GetSurfaceBlendMode(surface.address(), memAddressSafe(blendMode));
    }

    // --- [ SDL_SetSurfaceClipRect ] ---

    /** {@code bool SDL_SetSurfaceClipRect(SDL_Surface * surface, SDL_Rect const * rect)} */
    public static boolean nSDL_SetSurfaceClipRect(long surface, long rect) {
        long __functionAddress = Functions.SetSurfaceClipRect;
        return invokePPZ(surface, rect, __functionAddress);
    }

    /** {@code bool SDL_SetSurfaceClipRect(SDL_Surface * surface, SDL_Rect const * rect)} */
    @NativeType("bool")
    public static boolean SDL_SetSurfaceClipRect(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_Rect const *") SDL_Rect rect) {
        return nSDL_SetSurfaceClipRect(surface.address(), rect.address());
    }

    // --- [ SDL_GetSurfaceClipRect ] ---

    /** {@code bool SDL_GetSurfaceClipRect(SDL_Surface * surface, SDL_Rect * rect)} */
    public static boolean nSDL_GetSurfaceClipRect(long surface, long rect) {
        long __functionAddress = Functions.GetSurfaceClipRect;
        return invokePPZ(surface, rect, __functionAddress);
    }

    /** {@code bool SDL_GetSurfaceClipRect(SDL_Surface * surface, SDL_Rect * rect)} */
    @NativeType("bool")
    public static boolean SDL_GetSurfaceClipRect(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_Rect *") SDL_Rect rect) {
        return nSDL_GetSurfaceClipRect(surface.address(), rect.address());
    }

    // --- [ SDL_FlipSurface ] ---

    /** {@code bool SDL_FlipSurface(SDL_Surface * surface, SDL_FlipMode flip)} */
    public static boolean nSDL_FlipSurface(long surface, int flip) {
        long __functionAddress = Functions.FlipSurface;
        return invokePZ(surface, flip, __functionAddress);
    }

    /** {@code bool SDL_FlipSurface(SDL_Surface * surface, SDL_FlipMode flip)} */
    @NativeType("bool")
    public static boolean SDL_FlipSurface(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_FlipMode") int flip) {
        return nSDL_FlipSurface(surface.address(), flip);
    }

    // --- [ SDL_DuplicateSurface ] ---

    /** {@code SDL_Surface * SDL_DuplicateSurface(SDL_Surface * surface)} */
    public static long nSDL_DuplicateSurface(long surface) {
        long __functionAddress = Functions.DuplicateSurface;
        return invokePP(surface, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_DuplicateSurface(SDL_Surface * surface)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_DuplicateSurface(@NativeType("SDL_Surface *") SDL_Surface surface) {
        long __result = nSDL_DuplicateSurface(surface.address());
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_ScaleSurface ] ---

    /** {@code SDL_Surface * SDL_ScaleSurface(SDL_Surface * surface, int width, int height, SDL_ScaleMode scaleMode)} */
    public static long nSDL_ScaleSurface(long surface, int width, int height, int scaleMode) {
        long __functionAddress = Functions.ScaleSurface;
        return invokePP(surface, width, height, scaleMode, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_ScaleSurface(SDL_Surface * surface, int width, int height, SDL_ScaleMode scaleMode)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_ScaleSurface(@NativeType("SDL_Surface *") SDL_Surface surface, int width, int height, @NativeType("SDL_ScaleMode") int scaleMode) {
        long __result = nSDL_ScaleSurface(surface.address(), width, height, scaleMode);
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_ConvertSurface ] ---

    /** {@code SDL_Surface * SDL_ConvertSurface(SDL_Surface * surface, SDL_PixelFormat format)} */
    public static long nSDL_ConvertSurface(long surface, int format) {
        long __functionAddress = Functions.ConvertSurface;
        return invokePP(surface, format, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_ConvertSurface(SDL_Surface * surface, SDL_PixelFormat format)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_ConvertSurface(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_PixelFormat") int format) {
        long __result = nSDL_ConvertSurface(surface.address(), format);
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_ConvertSurfaceAndColorspace ] ---

    /** {@code SDL_Surface * SDL_ConvertSurfaceAndColorspace(SDL_Surface * surface, SDL_PixelFormat format, SDL_Palette * palette, SDL_Colorspace colorspace, SDL_PropertiesID props)} */
    public static long nSDL_ConvertSurfaceAndColorspace(long surface, int format, long palette, int colorspace, int props) {
        long __functionAddress = Functions.ConvertSurfaceAndColorspace;
        return invokePPP(surface, format, palette, colorspace, props, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_ConvertSurfaceAndColorspace(SDL_Surface * surface, SDL_PixelFormat format, SDL_Palette * palette, SDL_Colorspace colorspace, SDL_PropertiesID props)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_ConvertSurfaceAndColorspace(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_PixelFormat") int format, @NativeType("SDL_Palette *") @Nullable SDL_Palette palette, @NativeType("SDL_Colorspace") int colorspace, @NativeType("SDL_PropertiesID") int props) {
        long __result = nSDL_ConvertSurfaceAndColorspace(surface.address(), format, memAddressSafe(palette), colorspace, props);
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_ConvertPixels ] ---

    /** {@code bool SDL_ConvertPixels(int width, int height, SDL_PixelFormat src_format, void const * src, int src_pitch, SDL_PixelFormat dst_format, void * dst, int dst_pitch)} */
    public static boolean nSDL_ConvertPixels(int width, int height, int src_format, long src, int src_pitch, int dst_format, long dst, int dst_pitch) {
        long __functionAddress = Functions.ConvertPixels;
        return invokePPZ(width, height, src_format, src, src_pitch, dst_format, dst, dst_pitch, __functionAddress);
    }

    /** {@code bool SDL_ConvertPixels(int width, int height, SDL_PixelFormat src_format, void const * src, int src_pitch, SDL_PixelFormat dst_format, void * dst, int dst_pitch)} */
    @NativeType("bool")
    public static boolean SDL_ConvertPixels(int width, int height, @NativeType("SDL_PixelFormat") int src_format, @NativeType("void const *") ByteBuffer src, int src_pitch, @NativeType("SDL_PixelFormat") int dst_format, @NativeType("void *") ByteBuffer dst, int dst_pitch) {
        if (CHECKS) {
            check(src, height * src_pitch);
            check(dst, height * dst_pitch);
        }
        return nSDL_ConvertPixels(width, height, src_format, memAddress(src), src_pitch, dst_format, memAddress(dst), dst_pitch);
    }

    // --- [ SDL_ConvertPixelsAndColorspace ] ---

    /** {@code bool SDL_ConvertPixelsAndColorspace(int width, int height, SDL_PixelFormat src_format, SDL_Colorspace src_colorspace, SDL_PropertiesID src_properties, void const * src, int src_pitch, SDL_PixelFormat dst_format, SDL_Colorspace dst_colorspace, SDL_PropertiesID dst_properties, void * dst, int dst_pitch)} */
    public static boolean nSDL_ConvertPixelsAndColorspace(int width, int height, int src_format, int src_colorspace, int src_properties, long src, int src_pitch, int dst_format, int dst_colorspace, int dst_properties, long dst, int dst_pitch) {
        long __functionAddress = Functions.ConvertPixelsAndColorspace;
        return invokePPZ(width, height, src_format, src_colorspace, src_properties, src, src_pitch, dst_format, dst_colorspace, dst_properties, dst, dst_pitch, __functionAddress);
    }

    /** {@code bool SDL_ConvertPixelsAndColorspace(int width, int height, SDL_PixelFormat src_format, SDL_Colorspace src_colorspace, SDL_PropertiesID src_properties, void const * src, int src_pitch, SDL_PixelFormat dst_format, SDL_Colorspace dst_colorspace, SDL_PropertiesID dst_properties, void * dst, int dst_pitch)} */
    @NativeType("bool")
    public static boolean SDL_ConvertPixelsAndColorspace(int width, int height, @NativeType("SDL_PixelFormat") int src_format, @NativeType("SDL_Colorspace") int src_colorspace, @NativeType("SDL_PropertiesID") int src_properties, @NativeType("void const *") ByteBuffer src, int src_pitch, @NativeType("SDL_PixelFormat") int dst_format, @NativeType("SDL_Colorspace") int dst_colorspace, @NativeType("SDL_PropertiesID") int dst_properties, @NativeType("void *") ByteBuffer dst, int dst_pitch) {
        if (CHECKS) {
            check(src, height * src_pitch);
            check(dst, height * dst_pitch);
        }
        return nSDL_ConvertPixelsAndColorspace(width, height, src_format, src_colorspace, src_properties, memAddress(src), src_pitch, dst_format, dst_colorspace, dst_properties, memAddress(dst), dst_pitch);
    }

    // --- [ SDL_PremultiplyAlpha ] ---

    /** {@code bool SDL_PremultiplyAlpha(int width, int height, SDL_PixelFormat src_format, void const * src, int src_pitch, SDL_PixelFormat dst_format, void * dst, int dst_pitch, bool linear)} */
    public static boolean nSDL_PremultiplyAlpha(int width, int height, int src_format, long src, int src_pitch, int dst_format, long dst, int dst_pitch, boolean linear) {
        long __functionAddress = Functions.PremultiplyAlpha;
        return invokePPZ(width, height, src_format, src, src_pitch, dst_format, dst, dst_pitch, linear, __functionAddress);
    }

    /** {@code bool SDL_PremultiplyAlpha(int width, int height, SDL_PixelFormat src_format, void const * src, int src_pitch, SDL_PixelFormat dst_format, void * dst, int dst_pitch, bool linear)} */
    @NativeType("bool")
    public static boolean SDL_PremultiplyAlpha(int width, int height, @NativeType("SDL_PixelFormat") int src_format, @NativeType("void const *") ByteBuffer src, int src_pitch, @NativeType("SDL_PixelFormat") int dst_format, @NativeType("void *") ByteBuffer dst, int dst_pitch, @NativeType("bool") boolean linear) {
        if (CHECKS) {
            check(src, height * src_pitch);
            check(dst, height * dst_pitch);
        }
        return nSDL_PremultiplyAlpha(width, height, src_format, memAddress(src), src_pitch, dst_format, memAddress(dst), dst_pitch, linear);
    }

    // --- [ SDL_PremultiplySurfaceAlpha ] ---

    /** {@code bool SDL_PremultiplySurfaceAlpha(SDL_Surface * surface, bool linear)} */
    public static boolean nSDL_PremultiplySurfaceAlpha(long surface, boolean linear) {
        long __functionAddress = Functions.PremultiplySurfaceAlpha;
        return invokePZ(surface, linear, __functionAddress);
    }

    /** {@code bool SDL_PremultiplySurfaceAlpha(SDL_Surface * surface, bool linear)} */
    @NativeType("bool")
    public static boolean SDL_PremultiplySurfaceAlpha(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("bool") boolean linear) {
        return nSDL_PremultiplySurfaceAlpha(surface.address(), linear);
    }

    // --- [ SDL_ClearSurface ] ---

    /** {@code bool SDL_ClearSurface(SDL_Surface * surface, float r, float g, float b, float a)} */
    public static boolean nSDL_ClearSurface(long surface, float r, float g, float b, float a) {
        long __functionAddress = Functions.ClearSurface;
        return invokePZ(surface, r, g, b, a, __functionAddress);
    }

    /** {@code bool SDL_ClearSurface(SDL_Surface * surface, float r, float g, float b, float a)} */
    @NativeType("bool")
    public static boolean SDL_ClearSurface(@NativeType("SDL_Surface *") SDL_Surface surface, float r, float g, float b, float a) {
        return nSDL_ClearSurface(surface.address(), r, g, b, a);
    }

    // --- [ SDL_FillSurfaceRect ] ---

    /** {@code bool SDL_FillSurfaceRect(SDL_Surface * dst, SDL_Rect const * rect, Uint32 color)} */
    public static boolean nSDL_FillSurfaceRect(long dst, long rect, int color) {
        long __functionAddress = Functions.FillSurfaceRect;
        return invokePPZ(dst, rect, color, __functionAddress);
    }

    /** {@code bool SDL_FillSurfaceRect(SDL_Surface * dst, SDL_Rect const * rect, Uint32 color)} */
    @NativeType("bool")
    public static boolean SDL_FillSurfaceRect(@NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") @Nullable SDL_Rect rect, @NativeType("Uint32") int color) {
        return nSDL_FillSurfaceRect(dst.address(), memAddressSafe(rect), color);
    }

    // --- [ SDL_FillSurfaceRects ] ---

    /** {@code bool SDL_FillSurfaceRects(SDL_Surface * dst, SDL_Rect const * rects, int count, Uint32 color)} */
    public static boolean nSDL_FillSurfaceRects(long dst, long rects, int count, int color) {
        long __functionAddress = Functions.FillSurfaceRects;
        return invokePPZ(dst, rects, count, color, __functionAddress);
    }

    /** {@code bool SDL_FillSurfaceRects(SDL_Surface * dst, SDL_Rect const * rects, int count, Uint32 color)} */
    @NativeType("bool")
    public static boolean SDL_FillSurfaceRects(@NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") SDL_Rect.Buffer rects, @NativeType("Uint32") int color) {
        return nSDL_FillSurfaceRects(dst.address(), rects.address(), rects.remaining(), color);
    }

    // --- [ SDL_BlitSurface ] ---

    /** {@code bool SDL_BlitSurface(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    public static boolean nSDL_BlitSurface(long src, long srcrect, long dst, long dstrect) {
        long __functionAddress = Functions.BlitSurface;
        return invokePPPPZ(src, srcrect, dst, dstrect, __functionAddress);
    }

    /** {@code bool SDL_BlitSurface(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    @NativeType("bool")
    public static boolean SDL_BlitSurface(@NativeType("SDL_Surface *") SDL_Surface src, @NativeType("SDL_Rect const *") @Nullable SDL_Rect srcrect, @NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") @Nullable SDL_Rect dstrect) {
        return nSDL_BlitSurface(src.address(), memAddressSafe(srcrect), dst.address(), memAddressSafe(dstrect));
    }

    // --- [ SDL_BlitSurfaceUnchecked ] ---

    /** {@code bool SDL_BlitSurfaceUnchecked(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    public static boolean nSDL_BlitSurfaceUnchecked(long src, long srcrect, long dst, long dstrect) {
        long __functionAddress = Functions.BlitSurfaceUnchecked;
        return invokePPPPZ(src, srcrect, dst, dstrect, __functionAddress);
    }

    /** {@code bool SDL_BlitSurfaceUnchecked(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    @NativeType("bool")
    public static boolean SDL_BlitSurfaceUnchecked(@NativeType("SDL_Surface *") SDL_Surface src, @NativeType("SDL_Rect const *") SDL_Rect srcrect, @NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") SDL_Rect dstrect) {
        return nSDL_BlitSurfaceUnchecked(src.address(), srcrect.address(), dst.address(), dstrect.address());
    }

    // --- [ SDL_BlitSurfaceScaled ] ---

    /** {@code bool SDL_BlitSurfaceScaled(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect, SDL_ScaleMode scaleMode)} */
    public static boolean nSDL_BlitSurfaceScaled(long src, long srcrect, long dst, long dstrect, int scaleMode) {
        long __functionAddress = Functions.BlitSurfaceScaled;
        return invokePPPPZ(src, srcrect, dst, dstrect, scaleMode, __functionAddress);
    }

    /** {@code bool SDL_BlitSurfaceScaled(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect, SDL_ScaleMode scaleMode)} */
    @NativeType("bool")
    public static boolean SDL_BlitSurfaceScaled(@NativeType("SDL_Surface *") SDL_Surface src, @NativeType("SDL_Rect const *") @Nullable SDL_Rect srcrect, @NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") @Nullable SDL_Rect dstrect, @NativeType("SDL_ScaleMode") int scaleMode) {
        return nSDL_BlitSurfaceScaled(src.address(), memAddressSafe(srcrect), dst.address(), memAddressSafe(dstrect), scaleMode);
    }

    // --- [ SDL_BlitSurfaceUncheckedScaled ] ---

    /** {@code bool SDL_BlitSurfaceUncheckedScaled(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect, SDL_ScaleMode scaleMode)} */
    public static boolean nSDL_BlitSurfaceUncheckedScaled(long src, long srcrect, long dst, long dstrect, int scaleMode) {
        long __functionAddress = Functions.BlitSurfaceUncheckedScaled;
        return invokePPPPZ(src, srcrect, dst, dstrect, scaleMode, __functionAddress);
    }

    /** {@code bool SDL_BlitSurfaceUncheckedScaled(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect, SDL_ScaleMode scaleMode)} */
    @NativeType("bool")
    public static boolean SDL_BlitSurfaceUncheckedScaled(@NativeType("SDL_Surface *") SDL_Surface src, @NativeType("SDL_Rect const *") SDL_Rect srcrect, @NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") SDL_Rect dstrect, @NativeType("SDL_ScaleMode") int scaleMode) {
        return nSDL_BlitSurfaceUncheckedScaled(src.address(), srcrect.address(), dst.address(), dstrect.address(), scaleMode);
    }

    // --- [ SDL_StretchSurface ] ---

    /** {@code bool SDL_StretchSurface(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect, SDL_ScaleMode scaleMode)} */
    public static boolean nSDL_StretchSurface(long src, long srcrect, long dst, long dstrect, int scaleMode) {
        long __functionAddress = Functions.StretchSurface;
        return invokePPPPZ(src, srcrect, dst, dstrect, scaleMode, __functionAddress);
    }

    /** {@code bool SDL_StretchSurface(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect, SDL_ScaleMode scaleMode)} */
    @NativeType("bool")
    public static boolean SDL_StretchSurface(@NativeType("SDL_Surface *") SDL_Surface src, @NativeType("SDL_Rect const *") SDL_Rect srcrect, @NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") SDL_Rect dstrect, @NativeType("SDL_ScaleMode") int scaleMode) {
        return nSDL_StretchSurface(src.address(), srcrect.address(), dst.address(), dstrect.address(), scaleMode);
    }

    // --- [ SDL_BlitSurfaceTiled ] ---

    /** {@code bool SDL_BlitSurfaceTiled(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    public static boolean nSDL_BlitSurfaceTiled(long src, long srcrect, long dst, long dstrect) {
        long __functionAddress = Functions.BlitSurfaceTiled;
        return invokePPPPZ(src, srcrect, dst, dstrect, __functionAddress);
    }

    /** {@code bool SDL_BlitSurfaceTiled(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    @NativeType("bool")
    public static boolean SDL_BlitSurfaceTiled(@NativeType("SDL_Surface *") SDL_Surface src, @NativeType("SDL_Rect const *") @Nullable SDL_Rect srcrect, @NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") @Nullable SDL_Rect dstrect) {
        return nSDL_BlitSurfaceTiled(src.address(), memAddressSafe(srcrect), dst.address(), memAddressSafe(dstrect));
    }

    // --- [ SDL_BlitSurfaceTiledWithScale ] ---

    /** {@code bool SDL_BlitSurfaceTiledWithScale(SDL_Surface * src, SDL_Rect const * srcrect, float scale, SDL_ScaleMode scaleMode, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    public static boolean nSDL_BlitSurfaceTiledWithScale(long src, long srcrect, float scale, int scaleMode, long dst, long dstrect) {
        long __functionAddress = Functions.BlitSurfaceTiledWithScale;
        return invokePPPPZ(src, srcrect, scale, scaleMode, dst, dstrect, __functionAddress);
    }

    /** {@code bool SDL_BlitSurfaceTiledWithScale(SDL_Surface * src, SDL_Rect const * srcrect, float scale, SDL_ScaleMode scaleMode, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    @NativeType("bool")
    public static boolean SDL_BlitSurfaceTiledWithScale(@NativeType("SDL_Surface *") SDL_Surface src, @NativeType("SDL_Rect const *") @Nullable SDL_Rect srcrect, float scale, @NativeType("SDL_ScaleMode") int scaleMode, @NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") @Nullable SDL_Rect dstrect) {
        return nSDL_BlitSurfaceTiledWithScale(src.address(), memAddressSafe(srcrect), scale, scaleMode, dst.address(), memAddressSafe(dstrect));
    }

    // --- [ SDL_BlitSurface9Grid ] ---

    /** {@code bool SDL_BlitSurface9Grid(SDL_Surface * src, SDL_Rect const * srcrect, int left_width, int right_width, int top_height, int bottom_height, float scale, SDL_ScaleMode scaleMode, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    public static boolean nSDL_BlitSurface9Grid(long src, long srcrect, int left_width, int right_width, int top_height, int bottom_height, float scale, int scaleMode, long dst, long dstrect) {
        long __functionAddress = Functions.BlitSurface9Grid;
        return invokePPPPZ(src, srcrect, left_width, right_width, top_height, bottom_height, scale, scaleMode, dst, dstrect, __functionAddress);
    }

    /** {@code bool SDL_BlitSurface9Grid(SDL_Surface * src, SDL_Rect const * srcrect, int left_width, int right_width, int top_height, int bottom_height, float scale, SDL_ScaleMode scaleMode, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    @NativeType("bool")
    public static boolean SDL_BlitSurface9Grid(@NativeType("SDL_Surface *") SDL_Surface src, @NativeType("SDL_Rect const *") @Nullable SDL_Rect srcrect, int left_width, int right_width, int top_height, int bottom_height, float scale, @NativeType("SDL_ScaleMode") int scaleMode, @NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") @Nullable SDL_Rect dstrect) {
        return nSDL_BlitSurface9Grid(src.address(), memAddressSafe(srcrect), left_width, right_width, top_height, bottom_height, scale, scaleMode, dst.address(), memAddressSafe(dstrect));
    }

    // --- [ SDL_MapSurfaceRGB ] ---

    /** {@code Uint32 SDL_MapSurfaceRGB(SDL_Surface * surface, Uint8 r, Uint8 g, Uint8 b)} */
    public static int nSDL_MapSurfaceRGB(long surface, byte r, byte g, byte b) {
        long __functionAddress = Functions.MapSurfaceRGB;
        return invokePUUUI(surface, r, g, b, __functionAddress);
    }

    /** {@code Uint32 SDL_MapSurfaceRGB(SDL_Surface * surface, Uint8 r, Uint8 g, Uint8 b)} */
    @NativeType("Uint32")
    public static int SDL_MapSurfaceRGB(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b) {
        return nSDL_MapSurfaceRGB(surface.address(), r, g, b);
    }

    // --- [ SDL_MapSurfaceRGBA ] ---

    /** {@code Uint32 SDL_MapSurfaceRGBA(SDL_Surface * surface, Uint8 r, Uint8 g, Uint8 b, Uint8 a)} */
    public static int nSDL_MapSurfaceRGBA(long surface, byte r, byte g, byte b, byte a) {
        long __functionAddress = Functions.MapSurfaceRGBA;
        return invokePUUUUI(surface, r, g, b, a, __functionAddress);
    }

    /** {@code Uint32 SDL_MapSurfaceRGBA(SDL_Surface * surface, Uint8 r, Uint8 g, Uint8 b, Uint8 a)} */
    @NativeType("Uint32")
    public static int SDL_MapSurfaceRGBA(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b, @NativeType("Uint8") byte a) {
        return nSDL_MapSurfaceRGBA(surface.address(), r, g, b, a);
    }

    // --- [ SDL_ReadSurfacePixel ] ---

    /** {@code bool SDL_ReadSurfacePixel(SDL_Surface * surface, int x, int y, Uint8 * r, Uint8 * g, Uint8 * b, Uint8 * a)} */
    public static boolean nSDL_ReadSurfacePixel(long surface, int x, int y, long r, long g, long b, long a) {
        long __functionAddress = Functions.ReadSurfacePixel;
        return invokePPPPPZ(surface, x, y, r, g, b, a, __functionAddress);
    }

    /** {@code bool SDL_ReadSurfacePixel(SDL_Surface * surface, int x, int y, Uint8 * r, Uint8 * g, Uint8 * b, Uint8 * a)} */
    @NativeType("bool")
    public static boolean SDL_ReadSurfacePixel(@NativeType("SDL_Surface *") SDL_Surface surface, int x, int y, @NativeType("Uint8 *") @Nullable ByteBuffer r, @NativeType("Uint8 *") @Nullable ByteBuffer g, @NativeType("Uint8 *") @Nullable ByteBuffer b, @NativeType("Uint8 *") @Nullable ByteBuffer a) {
        if (CHECKS) {
            checkSafe(r, 1);
            checkSafe(g, 1);
            checkSafe(b, 1);
            checkSafe(a, 1);
        }
        return nSDL_ReadSurfacePixel(surface.address(), x, y, memAddressSafe(r), memAddressSafe(g), memAddressSafe(b), memAddressSafe(a));
    }

    // --- [ SDL_ReadSurfacePixelFloat ] ---

    /** {@code bool SDL_ReadSurfacePixelFloat(SDL_Surface * surface, int x, int y, float * r, float * g, float * b, float * a)} */
    public static boolean nSDL_ReadSurfacePixelFloat(long surface, int x, int y, long r, long g, long b, long a) {
        long __functionAddress = Functions.ReadSurfacePixelFloat;
        return invokePPPPPZ(surface, x, y, r, g, b, a, __functionAddress);
    }

    /** {@code bool SDL_ReadSurfacePixelFloat(SDL_Surface * surface, int x, int y, float * r, float * g, float * b, float * a)} */
    @NativeType("bool")
    public static boolean SDL_ReadSurfacePixelFloat(@NativeType("SDL_Surface *") SDL_Surface surface, int x, int y, @NativeType("float *") @Nullable FloatBuffer r, @NativeType("float *") @Nullable FloatBuffer g, @NativeType("float *") @Nullable FloatBuffer b, @NativeType("float *") @Nullable FloatBuffer a) {
        if (CHECKS) {
            checkSafe(r, 1);
            checkSafe(g, 1);
            checkSafe(b, 1);
            checkSafe(a, 1);
        }
        return nSDL_ReadSurfacePixelFloat(surface.address(), x, y, memAddressSafe(r), memAddressSafe(g), memAddressSafe(b), memAddressSafe(a));
    }

    // --- [ SDL_WriteSurfacePixel ] ---

    /** {@code bool SDL_WriteSurfacePixel(SDL_Surface * surface, int x, int y, Uint8 r, Uint8 g, Uint8 b, Uint8 a)} */
    public static boolean nSDL_WriteSurfacePixel(long surface, int x, int y, byte r, byte g, byte b, byte a) {
        long __functionAddress = Functions.WriteSurfacePixel;
        return invokePUUUUZ(surface, x, y, r, g, b, a, __functionAddress);
    }

    /** {@code bool SDL_WriteSurfacePixel(SDL_Surface * surface, int x, int y, Uint8 r, Uint8 g, Uint8 b, Uint8 a)} */
    @NativeType("bool")
    public static boolean SDL_WriteSurfacePixel(@NativeType("SDL_Surface *") SDL_Surface surface, int x, int y, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b, @NativeType("Uint8") byte a) {
        return nSDL_WriteSurfacePixel(surface.address(), x, y, r, g, b, a);
    }

    // --- [ SDL_WriteSurfacePixelFloat ] ---

    /** {@code bool SDL_WriteSurfacePixelFloat(SDL_Surface * surface, int x, int y, float r, float g, float b, float a)} */
    public static boolean nSDL_WriteSurfacePixelFloat(long surface, int x, int y, float r, float g, float b, float a) {
        long __functionAddress = Functions.WriteSurfacePixelFloat;
        return invokePZ(surface, x, y, r, g, b, a, __functionAddress);
    }

    /** {@code bool SDL_WriteSurfacePixelFloat(SDL_Surface * surface, int x, int y, float r, float g, float b, float a)} */
    @NativeType("bool")
    public static boolean SDL_WriteSurfacePixelFloat(@NativeType("SDL_Surface *") SDL_Surface surface, int x, int y, float r, float g, float b, float a) {
        return nSDL_WriteSurfacePixelFloat(surface.address(), x, y, r, g, b, a);
    }

    // --- [ SDL_MUSTLOCK ] ---

    /** {@code bool SDL_MUSTLOCK(SDL_Surface S)} */
    @NativeType("bool")
    public static boolean SDL_MUSTLOCK(SDL_Surface S) {
        return (S.flags() & SDL_SURFACE_LOCK_NEEDED) == SDL_SURFACE_LOCK_NEEDED;
    }

}