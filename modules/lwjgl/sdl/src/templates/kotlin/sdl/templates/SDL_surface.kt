/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_surface = "SDLSurface".nativeClassSDL("SDL_surface") {
    IntConstant(
        "SURFACE_PREALLOCATED".."0x00000001",
        "SURFACE_LOCK_NEEDED".."0x00000002",
        "SURFACE_LOCKED".."0x00000004",
        "SURFACE_SIMD_ALIGNED".."0x00000008"
    )

    EnumConstant(
        "SCALEMODE_INVALID".enum("-1"),
        "SCALEMODE_NEAREST".enum,
        "SCALEMODE_LINEAR".enum
    )

    EnumConstant(
        "FLIP_NONE".enum("0"),
        "FLIP_HORIZONTAL".enum,
        "FLIP_VERTICAL".enum
    )

    StringConstant(
        "PROP_SURFACE_SDR_WHITE_POINT_FLOAT".."SDL.surface.SDR_white_point",
        "PROP_SURFACE_HDR_HEADROOM_FLOAT".."SDL.surface.HDR_headroom",
        "PROP_SURFACE_TONEMAP_OPERATOR_STRING".."SDL.surface.tonemap",
        "PROP_SURFACE_HOTSPOT_X_NUMBER".."SDL.surface.hotspot.x",
        "PROP_SURFACE_HOTSPOT_Y_NUMBER".."SDL.surface.hotspot.y",
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
        nullable..Check("height * pitch")..void.p("pixels"),
        int("pitch")
    )

    void(
        "DestroySurface",

        SDL_Surface.p("surface")
    )

    SDL_PropertiesID(
        "GetSurfaceProperties",

        SDL_Surface.p("surface")
    )

    bool(
        "SetSurfaceColorspace",

        SDL_Surface.p("surface"),
        SDL_Colorspace("colorspace")
    )

    SDL_Colorspace(
        "GetSurfaceColorspace",

        SDL_Surface.p("surface")
    )

    SDL_Palette.p(
        "CreateSurfacePalette",

        SDL_Surface.p("surface")
    )

    bool(
        "SetSurfacePalette",

        SDL_Surface.p("surface"),
        nullable..SDL_Palette.p("palette")
    )

    SDL_Palette.p(
        "GetSurfacePalette",

        SDL_Surface.p("surface")
    )

    bool(
        "AddSurfaceAlternateImage",

        SDL_Surface.p("surface"),
        SDL_Surface.p("image")
    )

    bool(
        "SurfaceHasAlternateImages",

        SDL_Surface.p("surface")
    )

    SDL_Surface.p.p(
        "GetSurfaceImages",

        SDL_Surface.p("surface"),
        AutoSizeResult..int.p("count")
    )

    void(
        "RemoveSurfaceAlternateImages",

        SDL_Surface.p("surface")
    )

    bool(
        "LockSurface",

        SDL_Surface.p("surface")
    )

    void(
        "UnlockSurface",

        SDL_Surface.p("surface")
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

        SDL_Surface.p("surface"),
        SDL_IOStream.p("dst"),
        bool("closeio")
    )

    bool(
        "SaveBMP",

        SDL_Surface.p("surface"),
        charUTF8.const.p("file")
    )

    bool(
        "SetSurfaceRLE",

        SDL_Surface.p("surface"),
        bool("enabled")
    )

    bool(
        "SurfaceHasRLE",

        SDL_Surface.p("surface")
    )

    bool(
        "SetSurfaceColorKey",

        SDL_Surface.p("surface"),
        bool("enabled"),
        Uint32("key")
    )

    bool(
        "SurfaceHasColorKey",

        SDL_Surface.p("surface")
    )

    bool(
        "GetSurfaceColorKey",

        SDL_Surface.p("surface"),
        Check(1)..nullable..Uint32.p("key")
    )

    bool(
        "SetSurfaceColorMod",

        SDL_Surface.p("surface"),
        Uint8("r"),
        Uint8("g"),
        Uint8("b")
    )

    bool(
        "GetSurfaceColorMod",

        SDL_Surface.p("surface"),
        Check(1)..nullable..Uint8.p("r"),
        Check(1)..nullable..Uint8.p("g"),
        Check(1)..nullable..Uint8.p("b")
    )

    bool(
        "SetSurfaceAlphaMod",

        SDL_Surface.p("surface"),
        Uint8("alpha")
    )

    bool(
        "GetSurfaceAlphaMod",

        SDL_Surface.p("surface"),
        Check(1)..nullable..Uint8.p("alpha")
    )

    bool(
        "SetSurfaceBlendMode",

        SDL_Surface.p("surface"),
        SDL_BlendMode("blendMode")
    )

    bool(
        "GetSurfaceBlendMode",

        SDL_Surface.p("surface"),
        Check(1)..nullable..SDL_BlendMode.p("blendMode")
    )

    bool(
        "SetSurfaceClipRect",

        SDL_Surface.p("surface"),
        SDL_Rect.const.p("rect")
    )

    bool(
        "GetSurfaceClipRect",

        SDL_Surface.p("surface"),
        SDL_Rect.p("rect")
    )

    bool(
        "FlipSurface",

        SDL_Surface.p("surface"),
        SDL_FlipMode("flip")
    )

    SDL_Surface.p(
        "DuplicateSurface",

        SDL_Surface.p("surface")
    )

    SDL_Surface.p(
        "ScaleSurface",

        SDL_Surface.p("surface"),
        int("width"),
        int("height"),
        SDL_ScaleMode("scaleMode")
    )

    SDL_Surface.p(
        "ConvertSurface",

        SDL_Surface.p("surface"),
        SDL_PixelFormat("format")
    )

    SDL_Surface.p(
        "ConvertSurfaceAndColorspace",

        SDL_Surface.p("surface"),
        SDL_PixelFormat("format"),
        nullable..SDL_Palette.p("palette"),
        SDL_Colorspace("colorspace"),
        SDL_PropertiesID("props")
    )

    bool(
        "ConvertPixels",

        int("width"),
        int("height"),
        SDL_PixelFormat("src_format"),
        Check("height * src_pitch")..void.const.p("src"),
        int("src_pitch"),
        SDL_PixelFormat("dst_format"),
        Check("height * dst_pitch")..void.p("dst"),
        int("dst_pitch")
    )

    bool(
        "ConvertPixelsAndColorspace",

        int("width"),
        int("height"),
        SDL_PixelFormat("src_format"),
        SDL_Colorspace("src_colorspace"),
        SDL_PropertiesID("src_properties"),
        Check("height * src_pitch")..void.const.p("src"),
        int("src_pitch"),
        SDL_PixelFormat("dst_format"),
        SDL_Colorspace("dst_colorspace"),
        SDL_PropertiesID("dst_properties"),
        Check("height * dst_pitch")..void.p("dst"),
        int("dst_pitch")
    )

    bool(
        "PremultiplyAlpha",

        int("width"),
        int("height"),
        SDL_PixelFormat("src_format"),
        Check("height * src_pitch")..void.const.p("src"),
        int("src_pitch"),
        SDL_PixelFormat("dst_format"),
        Check("height * dst_pitch")..void.p("dst"),
        int("dst_pitch"),
        bool("linear")
    )

    bool(
        "PremultiplySurfaceAlpha",

        SDL_Surface.p("surface"),
        bool("linear")
    )

    bool(
        "ClearSurface",

        SDL_Surface.p("surface"),
        float("r"),
        float("g"),
        float("b"),
        float("a")
    )

    bool(
        "FillSurfaceRect",

        SDL_Surface.p("dst"),
        nullable..SDL_Rect.const.p("rect"),
        Uint32("color")
    )

    bool(
        "FillSurfaceRects",

        SDL_Surface.p("dst"),
        SDL_Rect.const.p("rects"),
        AutoSize("rects")..int("count"),
        Uint32("color")
    )

    bool(
        "BlitSurface",

        SDL_Surface.p("src"),
        nullable..SDL_Rect.const.p("srcrect"),
        SDL_Surface.p("dst"),
        nullable..SDL_Rect.const.p("dstrect")
    )

    bool(
        "BlitSurfaceUnchecked",

        SDL_Surface.p("src"),
        SDL_Rect.const.p("srcrect"),
        SDL_Surface.p("dst"),
        SDL_Rect.const.p("dstrect")
    )

    bool(
        "BlitSurfaceScaled",

        SDL_Surface.p("src"),
        nullable..SDL_Rect.const.p("srcrect"),
        SDL_Surface.p("dst"),
        nullable..SDL_Rect.const.p("dstrect"),
        SDL_ScaleMode("scaleMode")
    )

    bool(
        "BlitSurfaceUncheckedScaled",

        SDL_Surface.p("src"),
        SDL_Rect.const.p("srcrect"),
        SDL_Surface.p("dst"),
        SDL_Rect.const.p("dstrect"),
        SDL_ScaleMode("scaleMode")
    )

    bool(
        "StretchSurface",

        SDL_Surface.p("src"),
        nullable..SDL_Rect.const.p("srcrect"),
        SDL_Surface.p("dst"),
        nullable..SDL_Rect.const.p("dstrect"),
        SDL_ScaleMode("scaleMode")
    )

    bool(
        "BlitSurfaceTiled",

        SDL_Surface.p("src"),
        nullable..SDL_Rect.const.p("srcrect"),
        SDL_Surface.p("dst"),
        nullable..SDL_Rect.const.p("dstrect")
    )

    bool(
        "BlitSurfaceTiledWithScale",

        SDL_Surface.p("src"),
        nullable..SDL_Rect.const.p("srcrect"),
        float("scale"),
        SDL_ScaleMode("scaleMode"),
        SDL_Surface.p("dst"),
        nullable..SDL_Rect.const.p("dstrect")
    )

    bool(
        "BlitSurface9Grid",

        SDL_Surface.p("src"),
        nullable..SDL_Rect.const.p("srcrect"),
        int("left_width"),
        int("right_width"),
        int("top_height"),
        int("bottom_height"),
        float("scale"),
        SDL_ScaleMode("scaleMode"),
        SDL_Surface.p("dst"),
        nullable..SDL_Rect.const.p("dstrect")
    )

    Uint32(
        "MapSurfaceRGB",

        SDL_Surface.p("surface"),
        Uint8("r"),
        Uint8("g"),
        Uint8("b")
    )

    Uint32(
        "MapSurfaceRGBA",

        SDL_Surface.p("surface"),
        Uint8("r"),
        Uint8("g"),
        Uint8("b"),
        Uint8("a")
    )

    bool(
        "ReadSurfacePixel",

        SDL_Surface.p("surface"),
        int("x"),
        int("y"),
        Check(1)..nullable..Uint8.p("r"),
        Check(1)..nullable..Uint8.p("g"),
        Check(1)..nullable..Uint8.p("b"),
        Check(1)..nullable..Uint8.p("a")
    )

    bool(
        "ReadSurfacePixelFloat",

        SDL_Surface.p("surface"),
        int("x"),
        int("y"),
        Check(1)..nullable..float.p("r"),
        Check(1)..nullable..float.p("g"),
        Check(1)..nullable..float.p("b"),
        Check(1)..nullable..float.p("a")
    )

    bool(
        "WriteSurfacePixel",

        SDL_Surface.p("surface"),
        int("x"),
        int("y"),
        Uint8("r"),
        Uint8("g"),
        Uint8("b"),
        Uint8("a")
    )

    bool(
        "WriteSurfacePixelFloat",

        SDL_Surface.p("surface"),
        int("x"),
        int("y"),
        float("r"),
        float("g"),
        float("b"),
        float("a")
    )

    macro(expression = "(S.flags() & SDL_SURFACE_LOCK_NEEDED) == SDL_SURFACE_LOCK_NEEDED")..bool(
        "MUSTLOCK",

        SDL_Surface("S")
    )
}
