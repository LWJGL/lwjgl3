/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "DriftFX/DriftFX.h"
#include <string.h>

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_driftfx_DriftFX_driftfxGet(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)driftfx::DriftFX::Get();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxGetSurface(JNIEnv *__env, jclass clazz, jlong _thisAddress, jlong surfaceId) {
    driftfx::DriftFX *_this = (driftfx::DriftFX *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)_this->GetSurface((long)surfaceId);
}

JNIEXPORT void JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxSurfaceInitialize(JNIEnv *__env, jclass clazz, jlong _thisAddress) {
    driftfx::DriftFXSurface *_this = (driftfx::DriftFXSurface *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    _this->Initialize();
}

JNIEXPORT void JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxSurfaceCleanup(JNIEnv *__env, jclass clazz, jlong _thisAddress) {
    driftfx::DriftFXSurface *_this = (driftfx::DriftFXSurface *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    _this->Cleanup();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxSurfaceAcquire(JNIEnv *__env, jclass clazz, jlong _thisAddress, jint width, jint height, jlong transferModeAddress) {
    driftfx::DriftFXSurface *_this = (driftfx::DriftFXSurface *)(intptr_t)_thisAddress;
    driftfx::TransferMode *transferMode = (driftfx::TransferMode *)(intptr_t)transferModeAddress;
    UNUSED_PARAMS(__env, clazz)

    int w = width == 0xFFFFFFFF ? _this->GetWidth() : width;
    int h = height == 0xFFFFFFFF ? _this->GetHeight() : height;
    
    return transferMode == NULL
        ? (long)(intptr_t)_this->Acquire(w, h)
        : (long)(intptr_t)_this->Acquire(w, h, transferMode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxSurfaceAcquireV(JNIEnv *__env, jclass clazz, jlong _thisAddress, jlong sizeAddress) {
    driftfx::DriftFXSurface *_this = (driftfx::DriftFXSurface *)(intptr_t)_thisAddress;
    driftfx::math::Vec2ui *size = (driftfx::math::Vec2ui *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (long)(intptr_t)_this->Acquire(*size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxSurfaceAcquireVM(JNIEnv *__env, jclass clazz, jlong _thisAddress, jlong sizeAddress, jlong transferModeAddress) {
    driftfx::DriftFXSurface *_this = (driftfx::DriftFXSurface *)(intptr_t)_thisAddress;
    driftfx::math::Vec2ui *size = (driftfx::math::Vec2ui *)(intptr_t)sizeAddress;
    driftfx::TransferMode *transferMode = (driftfx::TransferMode *)(intptr_t)transferModeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (long)(intptr_t)_this->Acquire(*size, transferMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxSurfacePresent(JNIEnv *__env, jclass clazz, jlong _thisAddress, jlong targetAddress, jint hint) {
    driftfx::DriftFXSurface *_this = (driftfx::DriftFXSurface *)(intptr_t)_thisAddress;
    driftfx::RenderTarget *target = (driftfx::RenderTarget *)(intptr_t)targetAddress;
    UNUSED_PARAMS(__env, clazz)
    _this->Present(target, (driftfx::PresentationHint)hint);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxSurfaceGetContext(JNIEnv *__env, jclass clazz, jlong _thisAddress) {
    driftfx::DriftFXSurface *_this = (driftfx::DriftFXSurface *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)_this->GetContext();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxSurfaceGetWidth(JNIEnv *__env, jclass clazz, jlong _thisAddress) {
    driftfx::DriftFXSurface *_this = (driftfx::DriftFXSurface *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)_this->GetWidth();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxSurfaceGetHeight(JNIEnv *__env, jclass clazz, jlong _thisAddress) {
    driftfx::DriftFXSurface *_this = (driftfx::DriftFXSurface *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)_this->GetHeight();
}

JNIEXPORT void JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxSurfaceGetSurfaceSize(JNIEnv *__env, jclass clazz, jlong _thisAddress, jlong __result) {
    driftfx::DriftFXSurface *_this = (driftfx::DriftFXSurface *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    *(driftfx::math::Vec2d *)(intptr_t)__result = _this->GetSurfaceSize();
}

JNIEXPORT void JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxSurfaceGetScreenScale(JNIEnv *__env, jclass clazz, jlong _thisAddress, jlong __result) {
    driftfx::DriftFXSurface *_this = (driftfx::DriftFXSurface *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    *(driftfx::math::Vec2d *)(intptr_t)__result = _this->GetScreenScale();
}

JNIEXPORT void JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxSurfaceGetUserScale(JNIEnv *__env, jclass clazz, jlong _thisAddress, jlong __result) {
    driftfx::DriftFXSurface *_this = (driftfx::DriftFXSurface *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    *(driftfx::math::Vec2d *)(intptr_t)__result = _this->GetUserScale();
}

JNIEXPORT void JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxSurfaceGetScaledSize(JNIEnv *__env, jclass clazz, jlong _thisAddress, jlong __result) {
    driftfx::DriftFXSurface *_this = (driftfx::DriftFXSurface *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    *(driftfx::math::Vec2ui *)(intptr_t)__result = _this->GetScaledSize();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxSurfaceGetAvailableTransferModes(JNIEnv *__env, jclass clazz, jlong modesAddress, jlong modesLength) {
    driftfx::TransferMode **modes = (driftfx::TransferMode **)(intptr_t)modesAddress;
    UNUSED_PARAMS(__env, clazz)

    std::list<driftfx::TransferMode *> list = driftfx::DriftFXSurface::GetAvailableTransferModes();
    if (modes != NULL) {
        size_t i = 0;
        for (std::list<driftfx::TransferMode *>::const_iterator it = list.cbegin(); it != list.cend() && i < modesLength;) {
            modes[i++] = *it++;
        }
    }
    return list.size();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_driftfx_DriftFX_driftfxSurfaceGetPlatformDefaultTransferMode(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)driftfx::DriftFXSurface::GetPlatformDefaultTransferMode();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_driftfx_DriftFX_driftfxSurfaceGetFallbackTransferMode(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)driftfx::DriftFXSurface::GetFallbackTransferMode();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxContextCreateTexture(JNIEnv *__env, jclass clazz, jlong _thisAddress, jint width, jint height) {
    driftfx::Context *_this = (driftfx::Context *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)_this->CreateTexture(width, height);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxRenderTargetGetWidth(JNIEnv *__env, jclass clazz, jlong _thisAddress) {
    driftfx::RenderTarget *_this = (driftfx::RenderTarget *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)_this->GetWidth();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxRenderTargetGetHeight(JNIEnv *__env, jclass clazz, jlong _thisAddress) {
    driftfx::RenderTarget *_this = (driftfx::RenderTarget *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)_this->GetHeight();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxRenderTargetGetGLTexture(JNIEnv *__env, jclass clazz, jlong _thisAddress) {
    driftfx::RenderTarget *_this = (driftfx::RenderTarget *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)_this->GetGLTexture();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxTextureGetWidth(JNIEnv *__env, jclass clazz, jlong _thisAddress) {
    driftfx::Texture *_this = (driftfx::Texture *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)_this->GetWidth();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxTextureGetHeight(JNIEnv *__env, jclass clazz, jlong _thisAddress) {
    driftfx::Texture *_this = (driftfx::Texture *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)_this->GetHeight();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxTransferModeId(JNIEnv *__env, jclass clazz, jlong _thisAddress) {
    driftfx::TransferMode *_this = (driftfx::TransferMode *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)_this->Id();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxTransferModeName(JNIEnv *__env, jclass clazz, jlong _thisAddress, jlong nameAddress, jlong nameLength) {
    driftfx::TransferMode *_this = (driftfx::TransferMode *)(intptr_t)_thisAddress;
    char *name = (char *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)

    std::string str = _this->Name();
    size_t len = str.length();
    if (name != NULL) {
        strncpy(name, str.c_str(), nameLength);
    }
    return len;
}

JNIEXPORT void JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxGLContextSetCurrent(JNIEnv *__env, jclass clazz, jlong _thisAddress) {
    driftfx::gl::GLContext *_this = (driftfx::gl::GLContext *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    _this->SetCurrent();
}

JNIEXPORT void JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxGLContextUnsetCurrent(JNIEnv *__env, jclass clazz, jlong _thisAddress) {
    driftfx::gl::GLContext *_this = (driftfx::gl::GLContext *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    _this->UnsetCurrent();
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxGLContextIsCurrent(JNIEnv *__env, jclass clazz, jlong _thisAddress) {
    driftfx::gl::GLContext *_this = (driftfx::gl::GLContext *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)_this->IsCurrent();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxGLContextCreateSharedContext(JNIEnv *__env, jclass clazz, jlong _thisAddress) {
    driftfx::gl::GLContext *_this = (driftfx::gl::GLContext *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)_this->CreateSharedContext();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxGLContextCreateTexture(JNIEnv *__env, jclass clazz, jlong _thisAddress, jint width, jint height) {
    driftfx::gl::GLContext *_this = (driftfx::gl::GLContext *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)_this->CreateTexture(width, height);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_driftfx_DriftFX_ndriftfxGLContextGetName(JNIEnv *__env, jclass clazz, jlong _thisAddress, jlong nameAddress, jlong nameLength) {
    driftfx::gl::GLContext *_this = (driftfx::gl::GLContext *)(intptr_t)_thisAddress;
    char *name = (char *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)

    std::string str = _this->GetName();
    size_t len = str.length();
    if (name != NULL) {
        strncpy(name, str.c_str(), nameLength);
    }
    return len;
}

EXTERN_C_EXIT
