/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_surface() = SDL.apply {
    IntConstant("SURFACE_PREALLOCATED".."0x00000001")
    IntConstant("SURFACE_LOCK_NEEDED".."0x00000002")
    IntConstant("SURFACE_LOCKED".."0x00000004")
    IntConstant("SURFACE_SIMD_ALIGNED".."0x00000008")
    StringConstant("PROP_SURFACE_SDR_WHITE_POINT_FLOAT".."SDL.surface.SDR_white_point")
    StringConstant("PROP_SURFACE_HDR_HEADROOM_FLOAT".."SDL.surface.HDR_headroom")
    StringConstant("PROP_SURFACE_TONEMAP_OPERATOR_STRING".."SDL.surface.tonemap")

    EnumConstant(
        "SCALEMODE_NEAREST".enum("0"),
        "SCALEMODE_LINEAR".enum
    )

    EnumConstant(
        "FLIP_NONE".enum("0"),
        "FLIP_HORIZONTAL".enum,
        "FLIP_VERTICAL".enum
    )

    SDL_Surface.p(
        "CreateSurface",

        int("width"),
        int("height"),
        SDL_PixelFormat("format")
    )

    SDL_Surface.p(
        "CreateSurfaceFrom",

        int("width"),
        int("height"),
        SDL_PixelFormat("format"),
        nullable..Check("height*pitch")..void.p("pixels"),
        int("pitch")
    )

    void(
        "DestroySurface",

        Check(1)..SDL_Surface.p("surface")
    )

    SDL_PropertiesID(
        "GetSurfaceProperties",

        Check(1)..SDL_Surface.p("surface")
    )

    _Bool(
        "SetSurfaceColorspace",

        Check(1)..SDL_Surface.p("surface"),
        SDL_Colorspace("colorspace")
    )

    SDL_Colorspace(
        "GetSurfaceColorspace",

        Check(1)..SDL_Surface.p("surface")
    )

    SDL_Palette.p(
        "CreateSurfacePalette",

        Check(1)..SDL_Surface.p("surface")
    )

    _Bool(
        "SetSurfacePalette",

        Check(1)..SDL_Surface.p("surface"),
        Check(1)..SDL_Palette.p("palette")
    )

    SDL_Palette.p(
        "GetSurfacePalette",

        Check(1)..SDL_Surface.p("surface")
    )

    _Bool(
        "AddSurfaceAlternateImage",

        Check(1)..SDL_Surface.p("surface"),
        Check(1)..SDL_Surface.p("image")
    )

    _Bool(
        "SurfaceHasAlternateImages",

        Check(1)..SDL_Surface.p("surface")
    )

    SDL_Surface.p.p(
        "GetSurfaceImages",

        Check(1)..SDL_Surface.p("surface"),
        AutoSizeResult..int.p("count")
    )

    void(
        "RemoveSurfaceAlternateImages",

        Check(1)..SDL_Surface.p("surface")
    )

    _Bool(
        "LockSurface",

        Check(1)..SDL_Surface.p("surface")
    )

    void(
        "UnlockSurface",

        Check(1)..SDL_Surface.p("surface")
    )

    SDL_Surface.p(
        "LoadBMP_IO",

        SDL_IOStream.p("src"),
        _Bool("closeio")
    )

    SDL_Surface.p(
        "LoadBMP",

        charUTF8.const.p("file")
    )

    _Bool(
        "SaveBMP_IO",

        Check(1)..SDL_Surface.p("surface"),
        SDL_IOStream.p("dst"),
        _Bool("closeio")
    )

    _Bool(
        "SaveBMP",

        Check(1)..SDL_Surface.p("surface"),
        charUTF8.const.p("file")
    )

    _Bool(
        "SetSurfaceRLE",

        Check(1)..SDL_Surface.p("surface"),
        _Bool("enabled")
    )

    _Bool(
        "SurfaceHasRLE",

        Check(1)..SDL_Surface.p("surface")
    )

    _Bool(
        "SetSurfaceColorKey",

        Check(1)..SDL_Surface.p("surface"),
        _Bool("enabled"),
        Uint32("key")
    )

    _Bool(
        "SurfaceHasColorKey",

        Check(1)..SDL_Surface.p("surface")
    )

    _Bool(
        "GetSurfaceColorKey",

        Check(1)..SDL_Surface.p("surface"),
        Check(1)..Uint32.p("key")
    )

    _Bool(
        "SetSurfaceColorMod",

        Check(1)..SDL_Surface.p("surface"),
        Uint8("r"),
        Uint8("g"),
        Uint8("b")
    )

    _Bool(
        "GetSurfaceColorMod",

        Check(1)..SDL_Surface.p("surface"),
        Check(1)..Uint8.p("r"),
        Check(1)..Uint8.p("g"),
        Check(1)..Uint8.p("b")
    )

    _Bool(
        "SetSurfaceAlphaMod",

        Check(1)..SDL_Surface.p("surface"),
        Uint8("alpha")
    )

    _Bool(
        "GetSurfaceAlphaMod",

        Check(1)..SDL_Surface.p("surface"),
        Check(1)..Uint8.p("alpha")
    )

    _Bool(
        "SetSurfaceBlendMode",

        Check(1)..SDL_Surface.p("surface"),
        SDL_BlendMode("blendMode")
    )

    _Bool(
        "GetSurfaceBlendMode",

        Check(1)..SDL_Surface.p("surface"),
        Check(1)..SDL_BlendMode.p("blendMode")
    )

    _Bool(
        "SetSurfaceClipRect",

        Check(1)..SDL_Surface.p("surface"),
        Check(1)..SDL_Rect.const.p("rect")
    )

    _Bool(
        "GetSurfaceClipRect",

        Check(1)..SDL_Surface.p("surface"),
        Check(1)..SDL_Rect.p("rect")
    )

    _Bool(
        "FlipSurface",

        Check(1)..SDL_Surface.p("surface"),
        SDL_FlipMode("flip")
    )

    SDL_Surface.p(
        "DuplicateSurface",

        Check(1)..SDL_Surface.p("surface")
    )

    SDL_Surface.p(
        "ScaleSurface",

        Check(1)..SDL_Surface.p("surface"),
        int("width"),
        int("height"),
        SDL_ScaleMode("scaleMode")
    )

    SDL_Surface.p(
        "ConvertSurface",

        Check(1)..SDL_Surface.p("surface"),
        SDL_PixelFormat("format")
    )

    SDL_Surface.p(
        "ConvertSurfaceAndColorspace",

        Check(1)..SDL_Surface.p("surface"),
        SDL_PixelFormat("format"),
        Check(1)..SDL_Palette.p("palette"),
        SDL_Colorspace("colorspace"),
        SDL_PropertiesID("props")
    )

    _Bool(
        "ConvertPixels",

        int("width"),
        int("height"),
        SDL_PixelFormat("src_format"),
        Check("height*src_pitch")..void.const.p("src"),
        int("src_pitch"),
        SDL_PixelFormat("dst_format"),
        Check("height*dst_pitch")..void.p("dst"),
        int("dst_pitch")
    )

    _Bool(
        "ConvertPixelsAndColorspace",

        int("width"),
        int("height"),
        SDL_PixelFormat("src_format"),
        SDL_Colorspace("src_colorspace"),
        SDL_PropertiesID("src_properties"),
        Check("height*src_pitch")..void.const.p("src"),
        int("src_pitch"),
        SDL_PixelFormat("dst_format"),
        SDL_Colorspace("dst_colorspace"),
        SDL_PropertiesID("dst_properties"),
        Check("height*dst_pitch")..void.p("dst"),
        int("dst_pitch")
    )

    _Bool(
        "PremultiplyAlpha",

        int("width"),
        int("height"),
        SDL_PixelFormat("src_format"),
        Check("height*src_pitch")..void.const.p("src"),
        int("src_pitch"),
        SDL_PixelFormat("dst_format"),
        Check("height*dst_pitch")..void.p("dst"),
        int("dst_pitch"),
        _Bool("linear")
    )

    _Bool(
        "PremultiplySurfaceAlpha",

        Check(1)..SDL_Surface.p("surface"),
        _Bool("linear")
    )

    _Bool(
        "ClearSurface",

        Check(1)..SDL_Surface.p("surface"),
        float("r"),
        float("g"),
        float("b"),
        float("a")
    )

    _Bool(
        "FillSurfaceRect",

        Check(1)..SDL_Surface.p("dst"),
        Check(1)..SDL_Rect.const.p("rect"),
        Uint32("color")
    )

    _Bool(
        "FillSurfaceRects",

        Check(1)..SDL_Surface.p("dst"),
        SDL_Rect.const.p("rects"),
        AutoSize("rects")..int("count"),
        Uint32("color")
    )

    _Bool(
        "BlitSurface",

        Check(1)..SDL_Surface.p("src"),
        Check(1)..SDL_Rect.const.p("srcrect"),
        Check(1)..SDL_Surface.p("dst"),
        Check(1)..SDL_Rect.const.p("dstrect")
    )

    _Bool(
        "BlitSurfaceUnchecked",

        Check(1)..SDL_Surface.p("src"),
        Check(1)..SDL_Rect.const.p("srcrect"),
        Check(1)..SDL_Surface.p("dst"),
        Check(1)..SDL_Rect.const.p("dstrect")
    )

    _Bool(
        "BlitSurfaceScaled",

        Check(1)..SDL_Surface.p("src"),
        Check(1)..SDL_Rect.const.p("srcrect"),
        Check(1)..SDL_Surface.p("dst"),
        Check(1)..SDL_Rect.const.p("dstrect"),
        SDL_ScaleMode("scaleMode")
    )

    _Bool(
        "BlitSurfaceUncheckedScaled",

        Check(1)..SDL_Surface.p("src"),
        Check(1)..SDL_Rect.const.p("srcrect"),
        Check(1)..SDL_Surface.p("dst"),
        Check(1)..SDL_Rect.const.p("dstrect"),
        SDL_ScaleMode("scaleMode")
    )

    _Bool(
        "BlitSurfaceTiled",

        Check(1)..SDL_Surface.p("src"),
        Check(1)..SDL_Rect.const.p("srcrect"),
        Check(1)..SDL_Surface.p("dst"),
        Check(1)..SDL_Rect.const.p("dstrect")
    )

    _Bool(
        "BlitSurfaceTiledWithScale",

        Check(1)..SDL_Surface.p("src"),
        Check(1)..SDL_Rect.const.p("srcrect"),
        float("scale"),
        SDL_ScaleMode("scaleMode"),
        Check(1)..SDL_Surface.p("dst"),
        Check(1)..SDL_Rect.const.p("dstrect")
    )

    _Bool(
        "BlitSurface9Grid",

        Check(1)..SDL_Surface.p("src"),
        Check(1)..SDL_Rect.const.p("srcrect"),
        int("left_width"),
        int("right_width"),
        int("top_height"),
        int("bottom_height"),
        float("scale"),
        SDL_ScaleMode("scaleMode"),
        Check(1)..SDL_Surface.p("dst"),
        Check(1)..SDL_Rect.const.p("dstrect")
    )

    Uint32(
        "MapSurfaceRGB",

        Check(1)..SDL_Surface.p("surface"),
        Uint8("r"),
        Uint8("g"),
        Uint8("b")
    )

    Uint32(
        "MapSurfaceRGBA",

        Check(1)..SDL_Surface.p("surface"),
        Uint8("r"),
        Uint8("g"),
        Uint8("b"),
        Uint8("a")
    )

    _Bool(
        "ReadSurfacePixel",

        Check(1)..SDL_Surface.p("surface"),
        int("x"),
        int("y"),
        nullable..Check(1)..Uint8.p("r"),
        nullable..Check(1)..Uint8.p("g"),
        nullable..Check(1)..Uint8.p("b"),
        nullable..Check(1)..Uint8.p("a")
    )

    _Bool(
        "ReadSurfacePixelFloat",

        Check(1)..SDL_Surface.p("surface"),
        int("x"),
        int("y"),
        nullable..Check(1)..float.p("r"),
        nullable..Check(1)..float.p("g"),
        nullable..Check(1)..float.p("b"),
        nullable..Check(1)..float.p("a")
    )

    _Bool(
        "WriteSurfacePixel",

        Check(1)..SDL_Surface.p("surface"),
        int("x"),
        int("y"),
        Uint8("r"),
        Uint8("g"),
        Uint8("b"),
        Uint8("a")
    )

    _Bool(
        "WriteSurfacePixelFloat",

        Check(1)..SDL_Surface.p("surface"),
        int("x"),
        int("y"),
        float("r"),
        float("g"),
        float("b"),
        float("a")
    )

    macro(expression = "((S.flags() & SDL_SURFACE_LOCK_NEEDED) == SDL_SURFACE_LOCK_NEEDED)")..bool(
        "SDL_MUSTLOCK",
        SDL_Surface("S"),
        noPrefix = true
    )
}
