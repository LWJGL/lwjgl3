/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package driftfx.templates

import driftfx.*
import org.lwjgl.generator.*

val DriftFXClass = "DriftFX".nativeClass(Module.DRIFTFX, prefix = "DRIFTFX") {
    cpp = true
    nativeImport(
        "DriftFX/DriftFX.h",
        "<string.h>"
    )

    documentation = "Bindings to the {@code DriftFX} class."

    EnumConstant(
        "{@code PresentationHint}",

        "CENTER".enum("", 0),
        "COVER".enum,
        "CONTAIN".enum,
        "TOP_LEFT".enum,
        "TOP_CENTER".enum,
        "TOP_RIGHT".enum,
        "CENTER_LEFT".enum,
        "CENTER_RIGHT".enum,
        "BOTTOM_LEFT".enum,
        "BOTTOM_CENTER".enum,
        "BOTTOM_RIGHT".enum
    )

    // DriftFX.h

    Code(
        nativeCall = "${t}return (jlong)(intptr_t)driftfx::DriftFX::Get();"
    )..DriftFX.p(
        "Get",
        "",

        void()
    )

    Code(
        nativeCall = "${t}return (jlong)(intptr_t)_this->GetSurface((long)surfaceId);"
    )..DriftFXSurface.p(
        "GetSurface",
        "",

        DriftFX.p("_this", ""),
        long("surfaceId", "")
    )

    // DriftFXSurface.h

    Code(
        nativeCall = "${t}_this->Initialize();"
    )..void(
        "SurfaceInitialize",
        """
        Initializes this surface.

        Should be called on your render thread. This will create a {@code GLContext}. Its accessible via #SurfaceGetContext().
        """,

        DriftFXSurface.p("_this", "")
    )

    Code(
        nativeCall = "${t}_this->Cleanup();"
    )..void(
        "SurfaceCleanup",
        """
        Cleanup this native surface.

        Should be called on your render thread. Releases all pending resources and destroys its contexts.
        """,

        DriftFXSurface.p("_this", "")
    )

    Code(
        nativeCall = """
    int w = width == 0xFFFFFFFF ? _this->GetWidth() : width;
    int h = height == 0xFFFFFFFF ? _this->GetHeight() : height;
    
    return transferMode == NULL
        ? (long)(intptr_t)_this->Acquire(w, h)
        : (long)(intptr_t)_this->Acquire(w, h, transferMode);"""
    )..RenderTarget.p(
        "SurfaceAcquire",
        "Acquires a new {@code RenderTarget} with the given size.",

        DriftFXSurface.p("_this", ""),
        unsigned_int("width", "the render target width, or -1 to use the surface width"),
        unsigned_int("height", "the render target height, or -1 to use the surface height"),
        nullable..TransferMode.p("transferMode", "the transfer mode, or {@code null} to use the default")
    )

    Code(
        nativeCall = "${t}return (long)(intptr_t)_this->Acquire(*size);"
    )..RenderTarget.p(
        "SurfaceAcquireV",
        """
        Acquires a new {@code RenderTarget} with the given size.

        Should be called from your render thread.
        """,

        DriftFXSurface.p("_this", ""),
        Vec2ui("size", "")
    )

    Code(
        nativeCall = "${t}return (long)(intptr_t)_this->Acquire(*size, transferMode);"
    )..RenderTarget.p(
        "SurfaceAcquireVM",
        """
        Acquires a new {@code RenderTarget} with the given size.

        Should be called from your render thread.
        """,

        DriftFXSurface.p("_this", ""),
        Vec2ui("size", ""),
        TransferMode.p("transferMode", "")
    )

    Code(
        nativeCall = "${t}_this->Present(target, (driftfx::PresentationHint)hint);"
    )..void(
        "SurfacePresent",
        """
        Presents a previously acquired {@code RenderTarget}.

        Should be called from your render thread.
        """,

        DriftFXSurface.p("_this", ""),
        RenderTarget.p("target", ""),
        PresentationHint("hint", "")
    )

    Code(
        nativeCall = "${t}return (jlong)(intptr_t)_this->GetContext();"
    )..GLContext.p(
        "SurfaceGetContext",
        "",

        DriftFXSurface.p("_this", "")
    )

    Code(
        nativeCall = "${t}return (jint)_this->GetWidth();"
    )..unsigned_int(
        "SurfaceGetWidth",
        "Returns the current width of the {@code NativeSurface} in JavaFX.",

        DriftFXSurface.p("_this", "")
    )

    Code(
        nativeCall = "${t}return (jint)_this->GetHeight();"
    )..unsigned_int(
        "SurfaceGetHeight",
        "Returns the current height of the {@code NativeSurface} in JavaFX.",

        DriftFXSurface.p("_this", "")
    )

    Code(
        nativeCall = "${t}*(driftfx::math::Vec2d *)(intptr_t)$RESULT = _this->GetSurfaceSize();"
    )..Vec2d(
        "SurfaceGetSurfaceSize",
        "Returns the current surface size in JavaFX units.",

        DriftFXSurface.p("_this", "")
    )

    Code(
        nativeCall = "${t}*(driftfx::math::Vec2d *)(intptr_t)$RESULT = _this->GetScreenScale();"
    )..Vec2d(
        "SurfaceGetScreenScale",
        "Returns the current screen scale.",

        DriftFXSurface.p("_this", "")
    )

    Code(
        nativeCall = "${t}*(driftfx::math::Vec2d *)(intptr_t)$RESULT = _this->GetUserScale();"
    )..Vec2d(
        "SurfaceGetUserScale",
        "Returns the current user scale.",

        DriftFXSurface.p("_this", "")
    )

    Code(
        nativeCall = "${t}*(driftfx::math::Vec2ui *)(intptr_t)$RESULT = _this->GetScaledSize();"
    )..Vec2ui(
        "SurfaceGetScaledSize",
        "Returns {@code ceil(surfaceSize * screenScale * userScale)}.",

        DriftFXSurface.p("_this", "")
    )

    Code(
        nativeCall = """
    std::list<driftfx::TransferMode *> list = driftfx::DriftFXSurface::GetAvailableTransferModes();
    if (modes != NULL) {
        size_t i = 0;
        for (std::list<driftfx::TransferMode *>::const_iterator it = list.cbegin(); it != list.cend() && i < modesLength;) {
            modes[i++] = *it++;
        }
    }
    return list.size();"""
    )..size_t(
        "SurfaceGetAvailableTransferModes",
        "",

        nullable..TransferMode.p.p("modes", ""),
        AutoSize("modes")..size_t("modesLength", "")
    )

    Code(
        nativeCall = "${t}return (jlong)(intptr_t)driftfx::DriftFXSurface::GetPlatformDefaultTransferMode();"
    )..TransferMode.p(
        "SurfaceGetPlatformDefaultTransferMode",
        "",

        void()
    )

    Code(
        nativeCall = "${t}return (jlong)(intptr_t)driftfx::DriftFXSurface::GetFallbackTransferMode();"
    )..TransferMode.p(
        "SurfaceGetFallbackTransferMode",
        "",

        void()
    )

    // Context.h

    Code(
        nativeCall = "${t}return (jlong)(intptr_t)_this->CreateTexture(width, height);"
    )..Texture.p(
        "ContextCreateTexture",
        "",

        Context.p("_this", ""),
        int("width", ""),
        int("height", "")
    )

    // RenderTarget.h

    Code(
        nativeCall = "${t}return (jint)_this->GetWidth();"
    )..unsigned_int(
        "RenderTargetGetWidth",
        "",

        RenderTarget.p("_this", "")
    )

    Code(
        nativeCall = "${t}return (jint)_this->GetHeight();"
    )..unsigned_int(
        "RenderTargetGetHeight",
        "",

        RenderTarget.p("_this", "")
    )

    Code(
        nativeCall = "${t}return (jint)_this->GetGLTexture();"
    )..unsigned_int(
        "RenderTargetGetGLTexture",
        "",

        RenderTarget.p("_this", "")
    )

    // Texture.h

    Code(
        nativeCall = "${t}return (jint)_this->GetWidth();"
    )..unsigned_int(
        "TextureGetWidth",
        "",

        Texture.p("_this", "")
    )

    Code(
        nativeCall = "${t}return (jint)_this->GetHeight();"
    )..unsigned_int(
        "TextureGetHeight",
        "",

        Texture.p("_this", "")
    )

    // TransferMode.h

    Code(
        nativeCall = "${t}return (jint)_this->Id();"
    )..TransferModeId(
        "TransferModeId",
        "",

        TransferMode.p("_this", "")
    )

    Code(
        nativeCall = """
    std::string str = _this->Name();
    size_t len = str.length();
    if (name != NULL) {
        strncpy(name, str.c_str(), nameLength);
    }
    return len;"""
    )..size_t(
        "TransferModeName",
        "",

        TransferMode.p("_this", ""),
        nullable..char.p("name", ""),
        AutoSize("name")..size_t("nameLength", "")
    )

    // GL/GLContext.h

    Code(
        nativeCall = "${t}_this->SetCurrent();"
    )..void(
        "GLContextSetCurrent",
        "",

        GLContext.p("_this", "")
    )

    Code(
        nativeCall = "${t}_this->UnsetCurrent();"
    )..void(
        "GLContextUnsetCurrent",
        "",

        GLContext.p("_this", "")
    )

    Code(
        nativeCall = "${t}return (jboolean)_this->IsCurrent();"
    )..bool(
        "GLContextIsCurrent",
        "",

        GLContext.p("_this", "")
    )

    Code(
        nativeCall = "${t}return (jlong)(intptr_t)_this->CreateSharedContext();"
    )..GLContext.p(
        "GLContextCreateSharedContext",
        "",

        GLContext.p("_this", "")
    )

    /*Code(
        nativeCall = "${t}return (jlong)(intptr_t)_this->CreateSharedContext(name);"
    )..GLContext.p(
        "GLContextCreateSharedContextS",
        "",

        GLContext.p("_this", ""),
        charUTF8.p("name", "")
    )*/

    Code(
        nativeCall = "${t}return (jlong)(intptr_t)_this->CreateTexture(width, height);"
    )..Texture.p(
        "GLContextCreateTexture",
        "",

        GLContext.p("_this", ""),
        int("width", ""),
        int("height", "")
    )

    Code(
        nativeCall = """
    std::string str = _this->GetName();
    size_t len = str.length();
    if (name != NULL) {
        strncpy(name, str.c_str(), nameLength);
    }
    return len;"""
    )..size_t(
        "GLContextGetName",
        "",

        GLContext.p("_this", ""),
        nullable..char.p("name", ""),
        AutoSize("name")..size_t("nameLength", "")
    )
}