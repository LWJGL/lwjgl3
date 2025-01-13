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

    bool(
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

    bool(
        "SetSurfacePalette",

        Check(1)..SDL_Surface.p("surface"),
        Check(1)..SDL_Palette.p("palette")
    )

    SDL_Palette.p(
        "GetSurfacePalette",

        Check(1)..SDL_Surface.p("surface")
    )

    bool(
        "AddSurfaceAlternateImage",

        Check(1)..SDL_Surface.p("surface"),
        Check(1)..SDL_Surface.p("image")
    )

    bool(
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

    bool(
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
        bool("closeio")
    )

    SDL_Surface.p(
        "LoadBMP",

        charUTF8.const.p("file")
    )

    bool(
        "SaveBMP_IO",

        Check(1)..SDL_Surface.p("surface"),
        SDL_IOStream.p("dst"),
        bool("closeio")
    )

    bool(
        "SaveBMP",

        Check(1)..SDL_Surface.p("surface"),
        charUTF8.const.p("file")
    )

    bool(
        "SetSurfaceRLE",

        Check(1)..SDL_Surface.p("surface"),
        bool("enabled")
    )

    bool(
        "SurfaceHasRLE",

        Check(1)..SDL_Surface.p("surface")
    )

    bool(
        "SetSurfaceColorKey",

        Check(1)..SDL_Surface.p("surface"),
        bool("enabled"),
        Uint32("key")
    )

    bool(
        "SurfaceHasColorKey",

        Check(1)..SDL_Surface.p("surface")
    )

    bool(
        "GetSurfaceColorKey",

        Check(1)..SDL_Surface.p("surface"),
        Check(1)..Uint32.p("key")
    )

    bool(
        "SetSurfaceColorMod",

        Check(1)..SDL_Surface.p("surface"),
        Uint8("r"),
        Uint8("g"),
        Uint8("b")
    )

    bool(
        "GetSurfaceColorMod",

        Check(1)..SDL_Surface.p("surface"),
        Check(1)..Uint8.p("r"),
        Check(1)..Uint8.p("g"),
        Check(1)..Uint8.p("b")
    )

    bool(
        "SetSurfaceAlphaMod",

        Check(1)..SDL_Surface.p("surface"),
        Uint8("alpha")
    )

    bool(
        "GetSurfaceAlphaMod",

        Check(1)..SDL_Surface.p("surface"),
        Check(1)..Uint8.p("alpha")
    )

    bool(
        "SetSurfaceBlendMode",

        Check(1)..SDL_Surface.p("surface"),
        SDL_BlendMode("blendMode")
    )

    bool(
        "GetSurfaceBlendMode",

        Check(1)..SDL_Surface.p("surface"),
        Check(1)..SDL_BlendMode.p("blendMode")
    )

    bool(
        "SetSurfaceClipRect",

        Check(1)..SDL_Surface.p("surface"),
        Check(1)..SDL_Rect.const.p("rect")
    )

    bool(
        "GetSurfaceClipRect",

        Check(1)..SDL_Surface.p("surface"),
        Check(1)..SDL_Rect.p("rect")
    )

    bool(
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

    bool(
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

    bool(
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

    bool(
        "PremultiplyAlpha",

        int("width"),
        int("height"),
        SDL_PixelFormat("src_format"),
        Check("height*src_pitch")..void.const.p("src"),
        int("src_pitch"),
        SDL_PixelFormat("dst_format"),
        Check("height*dst_pitch")..void.p("dst"),
        int("dst_pitch"),
        bool("linear")
    )

    bool(
        "PremultiplySurfaceAlpha",

        Check(1)..SDL_Surface.p("surface"),
        bool("linear")
    )

    bool(
        "ClearSurface",

        Check(1)..SDL_Surface.p("surface"),
        float("r"),
        float("g"),
        float("b"),
        float("a")
    )

    bool(
        "FillSurfaceRect",

        Check(1)..SDL_Surface.p("dst"),
        Check(1)..SDL_Rect.const.p("rect"),
        Uint32("color")
    )

    bool(
        "FillSurfaceRects",

        Check(1)..SDL_Surface.p("dst"),
        SDL_Rect.const.p("rects"),
        AutoSize("rects")..int("count"),
        Uint32("color")
    )

    bool(
        "BlitSurface",

        Check(1)..SDL_Surface.p("src"),
        Check(1)..SDL_Rect.const.p("srcrect"),
        Check(1)..SDL_Surface.p("dst"),
        Check(1)..SDL_Rect.const.p("dstrect")
    )

    bool(
        "BlitSurfaceUnchecked",

        Check(1)..SDL_Surface.p("src"),
        Check(1)..SDL_Rect.const.p("srcrect"),
        Check(1)..SDL_Surface.p("dst"),
        Check(1)..SDL_Rect.const.p("dstrect")
    )

    bool(
        "BlitSurfaceScaled",

        Check(1)..SDL_Surface.p("src"),
        Check(1)..SDL_Rect.const.p("srcrect"),
        Check(1)..SDL_Surface.p("dst"),
        Check(1)..SDL_Rect.const.p("dstrect"),
        SDL_ScaleMode("scaleMode")
    )

    bool(
        "BlitSurfaceUncheckedScaled",

        Check(1)..SDL_Surface.p("src"),
        Check(1)..SDL_Rect.const.p("srcrect"),
        Check(1)..SDL_Surface.p("dst"),
        Check(1)..SDL_Rect.const.p("dstrect"),
        SDL_ScaleMode("scaleMode")
    )

    bool(
        "BlitSurfaceTiled",

        Check(1)..SDL_Surface.p("src"),
        Check(1)..SDL_Rect.const.p("srcrect"),
        Check(1)..SDL_Surface.p("dst"),
        Check(1)..SDL_Rect.const.p("dstrect")
    )

    bool(
        "BlitSurfaceTiledWithScale",

        Check(1)..SDL_Surface.p("src"),
        Check(1)..SDL_Rect.const.p("srcrect"),
        float("scale"),
        SDL_ScaleMode("scaleMode"),
        Check(1)..SDL_Surface.p("dst"),
        Check(1)..SDL_Rect.const.p("dstrect")
    )

    bool(
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

    bool(
        "ReadSurfacePixel",

        Check(1)..SDL_Surface.p("surface"),
        int("x"),
        int("y"),
        nullable..Check(1)..Uint8.p("r"),
        nullable..Check(1)..Uint8.p("g"),
        nullable..Check(1)..Uint8.p("b"),
        nullable..Check(1)..Uint8.p("a")
    )

    bool(
        "ReadSurfacePixelFloat",

        Check(1)..SDL_Surface.p("surface"),
        int("x"),
        int("y"),
        nullable..Check(1)..float.p("r"),
        nullable..Check(1)..float.p("g"),
        nullable..Check(1)..float.p("b"),
        nullable..Check(1)..float.p("a")
    )

    bool(
        "WriteSurfacePixel",

        Check(1)..SDL_Surface.p("surface"),
        int("x"),
        int("y"),
        Uint8("r"),
        Uint8("g"),
        Uint8("b"),
        Uint8("a")
    )

    bool(
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
