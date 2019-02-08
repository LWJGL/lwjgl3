/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#define NK_PRIVATE
#define NK_INCLUDE_FIXED_TYPES
#define NK_INCLUDE_STANDARD_IO
#define NK_INCLUDE_VERTEX_BUFFER_OUTPUT
#define NK_INCLUDE_COMMAND_USERDATA
#ifdef LWJGL_WINDOWS
    #define NK_BUTTON_TRIGGER_ON_RELEASE
#endif
#define NK_ZERO_COMMAND_MEMORY
#define NK_ASSERT(expr)
#define NK_IMPLEMENTATION
#define NK_MEMSET memset
#define NK_MEMCPY memcpy
#define NK_SQRT sqrt
#define NK_SIN sinf
#define NK_COS cosf
#include <math.h>
#include <string.h>
#include "nuklear.h"
typedef float(*nk_value_getter)(void* user, int index);
typedef void(*nk_item_getter)(void*, int, const char**);
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1init_1fixed(jlong ctxAddress, jlong memoryAddress, jlong size, jlong fontAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    void *memory = (void *)(intptr_t)memoryAddress;
    struct nk_user_font const *font = (struct nk_user_font const *)(intptr_t)fontAddress;
    return (jint)nk_init_fixed(ctx, memory, (nk_size)size, font);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1init_1fixed(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong memoryAddress, jlong size, jlong fontAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1init_1fixed(ctxAddress, memoryAddress, size, fontAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1init(jlong ctxAddress, jlong allocatorAddress, jlong fontAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_allocator *allocator = (struct nk_allocator *)(intptr_t)allocatorAddress;
    struct nk_user_font const *font = (struct nk_user_font const *)(intptr_t)fontAddress;
    return (jint)nk_init(ctx, allocator, font);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1init(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong allocatorAddress, jlong fontAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1init(ctxAddress, allocatorAddress, fontAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1init_1custom(jlong ctxAddress, jlong cmdsAddress, jlong poolAddress, jlong fontAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_buffer *cmds = (struct nk_buffer *)(intptr_t)cmdsAddress;
    struct nk_buffer *pool = (struct nk_buffer *)(intptr_t)poolAddress;
    struct nk_user_font const *font = (struct nk_user_font const *)(intptr_t)fontAddress;
    return (jint)nk_init_custom(ctx, cmds, pool, font);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1init_1custom(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong cmdsAddress, jlong poolAddress, jlong fontAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1init_1custom(ctxAddress, cmdsAddress, poolAddress, fontAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1clear(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_clear(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1clear(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1clear(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1free(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_free(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1free(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1free(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1set_1user_1data(jlong ctxAddress, jlong handleAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_handle *handle = (nk_handle *)(intptr_t)handleAddress;
    nk_set_user_data(ctx, *handle);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1set_1user_1data(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong handleAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1set_1user_1data(ctxAddress, handleAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1begin(jlong ctxAddress, jlong titleAddress, jlong boundsAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    struct nk_rect *bounds = (struct nk_rect *)(intptr_t)boundsAddress;
    return (jint)nk_begin(ctx, title, *bounds, (nk_flags)flags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong titleAddress, jlong boundsAddress, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1begin(ctxAddress, titleAddress, boundsAddress, flags);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1begin_1titled(jlong ctxAddress, jlong nameAddress, jlong titleAddress, jlong boundsAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    struct nk_rect *bounds = (struct nk_rect *)(intptr_t)boundsAddress;
    return (jint)nk_begin_titled(ctx, name, title, *bounds, (nk_flags)flags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1begin_1titled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jlong titleAddress, jlong boundsAddress, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1begin_1titled(ctxAddress, nameAddress, titleAddress, boundsAddress, flags);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1end(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_end(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1end(ctxAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1find(jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    return (jlong)(intptr_t)nk_window_find(ctx, name);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1find(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1find(ctxAddress, nameAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1bounds(jlong ctxAddress, jlong __result) {
    struct nk_context const *ctx = (struct nk_context const *)(intptr_t)ctxAddress;
    *((struct nk_rect*)(intptr_t)__result) = nk_window_get_bounds(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1bounds(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1bounds(ctxAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1position(jlong ctxAddress, jlong __result) {
    struct nk_context const *ctx = (struct nk_context const *)(intptr_t)ctxAddress;
    *((struct nk_vec2*)(intptr_t)__result) = nk_window_get_position(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1position(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1position(ctxAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1size(jlong ctxAddress, jlong __result) {
    struct nk_context const *ctx = (struct nk_context const *)(intptr_t)ctxAddress;
    *((struct nk_vec2*)(intptr_t)__result) = nk_window_get_size(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1size(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1size(ctxAddress, __result);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1width(jlong ctxAddress) {
    struct nk_context const *ctx = (struct nk_context const *)(intptr_t)ctxAddress;
    return (jfloat)nk_window_get_width(ctx);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1width(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1width(ctxAddress);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1height(jlong ctxAddress) {
    struct nk_context const *ctx = (struct nk_context const *)(intptr_t)ctxAddress;
    return (jfloat)nk_window_get_height(ctx);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1height(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1height(ctxAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1panel(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jlong)(intptr_t)nk_window_get_panel(ctx);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1panel(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1panel(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region(jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    *((struct nk_rect*)(intptr_t)__result) = nk_window_get_content_region(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region(ctxAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region_1min(jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    *((struct nk_vec2*)(intptr_t)__result) = nk_window_get_content_region_min(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region_1min(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region_1min(ctxAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region_1max(jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    *((struct nk_vec2*)(intptr_t)__result) = nk_window_get_content_region_max(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region_1max(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region_1max(ctxAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region_1size(jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    *((struct nk_vec2*)(intptr_t)__result) = nk_window_get_content_region_size(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region_1size(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region_1size(ctxAddress, __result);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1canvas(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jlong)(intptr_t)nk_window_get_canvas(ctx);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1canvas(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1canvas(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1has_1focus(jlong ctxAddress) {
    struct nk_context const *ctx = (struct nk_context const *)(intptr_t)ctxAddress;
    return (jint)nk_window_has_focus(ctx);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1has_1focus(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1has_1focus(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1collapsed(jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    return (jint)nk_window_is_collapsed(ctx, name);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1collapsed(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1collapsed(ctxAddress, nameAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1closed(jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    return (jint)nk_window_is_closed(ctx, name);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1closed(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1closed(ctxAddress, nameAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1hidden(jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    return (jint)nk_window_is_hidden(ctx, name);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1hidden(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1hidden(ctxAddress, nameAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1active(jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    return (jint)nk_window_is_active(ctx, name);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1active(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1active(ctxAddress, nameAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1hovered(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_window_is_hovered(ctx);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1hovered(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1hovered(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1any_1hovered(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_window_is_any_hovered(ctx);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1any_1hovered(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1any_1hovered(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1item_1is_1any_1active(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_item_is_any_active(ctx);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1item_1is_1any_1active(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1item_1is_1any_1active(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1bounds(jlong ctxAddress, jlong nameAddress, jlong boundsAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    struct nk_rect *bounds = (struct nk_rect *)(intptr_t)boundsAddress;
    nk_window_set_bounds(ctx, name, *bounds);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1bounds(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jlong boundsAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1bounds(ctxAddress, nameAddress, boundsAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1position(jlong ctxAddress, jlong nameAddress, jlong positionAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    struct nk_vec2 *position = (struct nk_vec2 *)(intptr_t)positionAddress;
    nk_window_set_position(ctx, name, *position);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1position(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jlong positionAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1position(ctxAddress, nameAddress, positionAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1size(jlong ctxAddress, jlong nameAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    nk_window_set_size(ctx, name, *size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1size(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1size(ctxAddress, nameAddress, sizeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1focus(jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    nk_window_set_focus(ctx, name);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1focus(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1focus(ctxAddress, nameAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1close(jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    nk_window_close(ctx, name);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1close(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1close(ctxAddress, nameAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1collapse(jlong ctxAddress, jlong nameAddress, jint c) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    nk_window_collapse(ctx, name, (enum nk_collapse_states)c);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1collapse(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint c) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1collapse(ctxAddress, nameAddress, c);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1collapse_1if(jlong ctxAddress, jlong nameAddress, jint c, jint cond) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    nk_window_collapse_if(ctx, name, (enum nk_collapse_states)c, cond);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1collapse_1if(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint c, jint cond) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1collapse_1if(ctxAddress, nameAddress, c, cond);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1show(jlong ctxAddress, jlong nameAddress, jint s) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    nk_window_show(ctx, name, (enum nk_show_states)s);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1show(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint s) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1show(ctxAddress, nameAddress, s);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1show_1if(jlong ctxAddress, jlong nameAddress, jint s, jint cond) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    nk_window_show_if(ctx, name, (enum nk_show_states)s, cond);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1show_1if(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint s, jint cond) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1window_1show_1if(ctxAddress, nameAddress, s, cond);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1set_1min_1row_1height(jlong ctxAddress, jfloat height) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_layout_set_min_row_height(ctx, height);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1set_1min_1row_1height(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat height) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1set_1min_1row_1height(ctxAddress, height);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1reset_1min_1row_1height(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_layout_reset_min_row_height(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1reset_1min_1row_1height(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1reset_1min_1row_1height(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1widget_1bounds(jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    *((struct nk_rect*)(intptr_t)__result) = nk_layout_widget_bounds(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1widget_1bounds(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1widget_1bounds(ctxAddress, __result);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1ratio_1from_1pixel(jlong ctxAddress, jfloat pixel_width) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jfloat)nk_layout_ratio_from_pixel(ctx, pixel_width);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1ratio_1from_1pixel(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat pixel_width) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1ratio_1from_1pixel(ctxAddress, pixel_width);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1dynamic(jlong ctxAddress, jfloat height, jint cols) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_layout_row_dynamic(ctx, height, (nk_int)cols);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1dynamic(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat height, jint cols) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1dynamic(ctxAddress, height, cols);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1static(jlong ctxAddress, jfloat height, jint item_width, jint cols) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_layout_row_static(ctx, height, (nk_int)item_width, (nk_int)cols);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1static(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat height, jint item_width, jint cols) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1static(ctxAddress, height, item_width, cols);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1begin(jlong ctxAddress, jint fmt, jfloat row_height, jint cols) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_layout_row_begin(ctx, (enum nk_layout_format)fmt, row_height, (nk_int)cols);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint fmt, jfloat row_height, jint cols) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1begin(ctxAddress, fmt, row_height, cols);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1push(jlong ctxAddress, jfloat value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_layout_row_push(ctx, value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1push(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat value) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1push(ctxAddress, value);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1end(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_layout_row_end(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1end(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row__JIFIJ(jlong ctxAddress, jint fmt, jfloat height, jint cols, jlong ratioAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    float const *ratio = (float const *)(intptr_t)ratioAddress;
    nk_layout_row(ctx, (enum nk_layout_format)fmt, height, (nk_int)cols, ratio);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row__JIFIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint fmt, jfloat height, jint cols, jlong ratioAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row__JIFIJ(ctxAddress, fmt, height, cols, ratioAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1begin(jlong ctxAddress, jfloat height) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_layout_row_template_begin(ctx, height);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat height) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1begin(ctxAddress, height);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1push_1dynamic(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_layout_row_template_push_dynamic(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1push_1dynamic(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1push_1dynamic(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1push_1variable(jlong ctxAddress, jfloat min_width) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_layout_row_template_push_variable(ctx, min_width);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1push_1variable(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat min_width) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1push_1variable(ctxAddress, min_width);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1push_1static(jlong ctxAddress, jfloat width) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_layout_row_template_push_static(ctx, width);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1push_1static(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat width) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1push_1static(ctxAddress, width);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1end(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_layout_row_template_end(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1end(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1begin(jlong ctxAddress, jint fmt, jfloat height, jint widget_count) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_layout_space_begin(ctx, (enum nk_layout_format)fmt, height, (nk_int)widget_count);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint fmt, jfloat height, jint widget_count) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1begin(ctxAddress, fmt, height, widget_count);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1push(jlong ctxAddress, jlong rectAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    nk_layout_space_push(ctx, *rect);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1push(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong rectAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1push(ctxAddress, rectAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1end(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_layout_space_end(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1end(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1bounds(jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    *((struct nk_rect*)(intptr_t)__result) = nk_layout_space_bounds(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1bounds(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1bounds(ctxAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1to_1screen(jlong ctxAddress, jlong retAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_vec2 *ret = (struct nk_vec2 *)(intptr_t)retAddress;
    *ret = nk_layout_space_to_screen(ctx, *ret);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1to_1screen(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong retAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1to_1screen(ctxAddress, retAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1to_1local(jlong ctxAddress, jlong retAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_vec2 *ret = (struct nk_vec2 *)(intptr_t)retAddress;
    *ret = nk_layout_space_to_local(ctx, *ret);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1to_1local(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong retAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1to_1local(ctxAddress, retAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1rect_1to_1screen(jlong ctxAddress, jlong retAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_rect *ret = (struct nk_rect *)(intptr_t)retAddress;
    *ret = nk_layout_space_rect_to_screen(ctx, *ret);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1rect_1to_1screen(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong retAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1rect_1to_1screen(ctxAddress, retAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1rect_1to_1local(jlong ctxAddress, jlong retAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_rect *ret = (struct nk_rect *)(intptr_t)retAddress;
    *ret = nk_layout_space_rect_to_local(ctx, *ret);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1rect_1to_1local(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong retAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1rect_1to_1local(ctxAddress, retAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1group_1begin(jlong ctxAddress, jlong titleAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    return (jint)nk_group_begin(ctx, title, (nk_flags)flags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong titleAddress, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1group_1begin(ctxAddress, titleAddress, flags);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1group_1begin_1titled(jlong ctxAddress, jlong nameAddress, jlong titleAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    return (jint)nk_group_begin_titled(ctx, name, title, (nk_flags)flags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1begin_1titled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jlong titleAddress, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1group_1begin_1titled(ctxAddress, nameAddress, titleAddress, flags);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1offset_1begin__JJJJI(jlong ctxAddress, jlong x_offsetAddress, jlong y_offsetAddress, jlong titleAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_uint *x_offset = (nk_uint *)(intptr_t)x_offsetAddress;
    nk_uint *y_offset = (nk_uint *)(intptr_t)y_offsetAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    return (jint)nk_group_scrolled_offset_begin(ctx, x_offset, y_offset, title, (nk_flags)flags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1offset_1begin__JJJJI(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong x_offsetAddress, jlong y_offsetAddress, jlong titleAddress, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1offset_1begin__JJJJI(ctxAddress, x_offsetAddress, y_offsetAddress, titleAddress, flags);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1begin(jlong ctxAddress, jlong scrollAddress, jlong titleAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_scroll *scroll = (struct nk_scroll *)(intptr_t)scrollAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    return (jint)nk_group_scrolled_begin(ctx, scroll, title, (nk_flags)flags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong scrollAddress, jlong titleAddress, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1begin(ctxAddress, scrollAddress, titleAddress, flags);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1end(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_group_scrolled_end(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1end(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1group_1end(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_group_end(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1group_1end(ctxAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1list_1view_1begin)(jlong ctxAddress, jlong viewAddress, jlong titleAddress, jint flags, jint row_height, jint row_count) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_list_view *view = (struct nk_list_view *)(intptr_t)viewAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    return (jint)nk_list_view_begin(ctx, view, title, (nk_flags)flags, row_height, row_count);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1list_1view_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong viewAddress, jlong titleAddress, jint flags, jint row_height, jint row_count) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1list_1view_1begin)(ctxAddress, viewAddress, titleAddress, flags, row_height, row_count);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1list_1view_1end(jlong viewAddress) {
    struct nk_list_view *view = (struct nk_list_view *)(intptr_t)viewAddress;
    nk_list_view_end(view);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1list_1view_1end(JNIEnv *__env, jclass clazz, jlong viewAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1list_1view_1end(viewAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1tree_1push_1hashed)(jlong ctxAddress, jint type, jlong titleAddress, jint initial_state, jlong hashAddress, jint len, jint seed) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    char const *hash = (char const *)(intptr_t)hashAddress;
    return (jint)nk_tree_push_hashed(ctx, (enum nk_tree_type)type, title, (enum nk_collapse_states)initial_state, hash, (nk_int)len, (nk_int)seed);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1push_1hashed(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong titleAddress, jint initial_state, jlong hashAddress, jint len, jint seed) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1tree_1push_1hashed)(ctxAddress, type, titleAddress, initial_state, hashAddress, len, seed);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1tree_1image_1push_1hashed)(jlong ctxAddress, jint type, jlong imgAddress, jlong titleAddress, jint initial_state, jlong hashAddress, jint len, jint seed) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    char const *hash = (char const *)(intptr_t)hashAddress;
    return (jint)nk_tree_image_push_hashed(ctx, (enum nk_tree_type)type, *img, title, (enum nk_collapse_states)initial_state, hash, (nk_int)len, (nk_int)seed);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1image_1push_1hashed(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong imgAddress, jlong titleAddress, jint initial_state, jlong hashAddress, jint len, jint seed) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1tree_1image_1push_1hashed)(ctxAddress, type, imgAddress, titleAddress, initial_state, hashAddress, len, seed);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tree_1pop(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_tree_pop(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1pop(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tree_1pop(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1push__JIJJ(jlong ctxAddress, jint type, jlong titleAddress, jlong stateAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    enum nk_collapse_states *state = (enum nk_collapse_states *)(intptr_t)stateAddress;
    return (jint)nk_tree_state_push(ctx, (enum nk_tree_type)type, title, state);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1push__JIJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong titleAddress, jlong stateAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1push__JIJJ(ctxAddress, type, titleAddress, stateAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1image_1push__JIJJJ(jlong ctxAddress, jint type, jlong imageAddress, jlong titleAddress, jlong stateAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *image = (struct nk_image *)(intptr_t)imageAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    enum nk_collapse_states *state = (enum nk_collapse_states *)(intptr_t)stateAddress;
    return (jint)nk_tree_state_image_push(ctx, (enum nk_tree_type)type, *image, title, state);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1image_1push__JIJJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong imageAddress, jlong titleAddress, jlong stateAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1image_1push__JIJJJ(ctxAddress, type, imageAddress, titleAddress, stateAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1pop(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_tree_state_pop(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1pop(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1pop(ctxAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1push_1hashed__JIJIJJII)(jlong ctxAddress, jint type, jlong titleAddress, jint initial_state, jlong selectedAddress, jlong hashAddress, jint len, jint seed) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    int *selected = (int *)(intptr_t)selectedAddress;
    char const *hash = (char const *)(intptr_t)hashAddress;
    return (jint)nk_tree_element_push_hashed(ctx, (enum nk_tree_type)type, title, (enum nk_collapse_states)initial_state, selected, hash, len, seed);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1push_1hashed__JIJIJJII(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong titleAddress, jint initial_state, jlong selectedAddress, jlong hashAddress, jint len, jint seed) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1push_1hashed__JIJIJJII)(ctxAddress, type, titleAddress, initial_state, selectedAddress, hashAddress, len, seed);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1image_1push_1hashed__JIJJIJJII)(jlong ctxAddress, jint type, jlong imgAddress, jlong titleAddress, jint initial_state, jlong selectedAddress, jlong hashAddress, jint len, jint seed) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    int *selected = (int *)(intptr_t)selectedAddress;
    char const *hash = (char const *)(intptr_t)hashAddress;
    return (jint)nk_tree_element_image_push_hashed(ctx, (enum nk_tree_type)type, *img, title, (enum nk_collapse_states)initial_state, selected, hash, len, seed);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1image_1push_1hashed__JIJJIJJII(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong imgAddress, jlong titleAddress, jint initial_state, jlong selectedAddress, jlong hashAddress, jint len, jint seed) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1image_1push_1hashed__JIJJIJJII)(ctxAddress, type, imgAddress, titleAddress, initial_state, selectedAddress, hashAddress, len, seed);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1pop(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_tree_element_pop(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1pop(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1pop(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1text(jlong ctxAddress, jlong strAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    nk_text(ctx, str, (nk_int)len, (nk_flags)alignment);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1text(ctxAddress, strAddress, len, alignment);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1text_1colored(jlong ctxAddress, jlong strAddress, jint len, jint alignment, jlong colorAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_text_colored(ctx, str, (nk_int)len, (nk_flags)alignment, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1text_1colored(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint alignment, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1text_1colored(ctxAddress, strAddress, len, alignment, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1text_1wrap(jlong ctxAddress, jlong strAddress, jint len) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    nk_text_wrap(ctx, str, (nk_int)len);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1text_1wrap(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1text_1wrap(ctxAddress, strAddress, len);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1text_1wrap_1colored(jlong ctxAddress, jlong strAddress, jint len, jlong colorAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_text_wrap_colored(ctx, str, (nk_int)len, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1text_1wrap_1colored(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1text_1wrap_1colored(ctxAddress, strAddress, len, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1label(jlong ctxAddress, jlong strAddress, jint align) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    nk_label(ctx, str, (nk_flags)align);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint align) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1label(ctxAddress, strAddress, align);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1label_1colored(jlong ctxAddress, jlong strAddress, jint align, jlong colorAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_label_colored(ctx, str, (nk_flags)align, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1label_1colored(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint align, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1label_1colored(ctxAddress, strAddress, align, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1label_1wrap(jlong ctxAddress, jlong strAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    nk_label_wrap(ctx, str);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1label_1wrap(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1label_1wrap(ctxAddress, strAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1label_1colored_1wrap(jlong ctxAddress, jlong strAddress, jlong colorAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_label_colored_wrap(ctx, str, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1label_1colored_1wrap(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1label_1colored_1wrap(ctxAddress, strAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1image(jlong ctxAddress, jlong imgAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    nk_image(ctx, *img);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1image(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1image(ctxAddress, imgAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1image_1color(jlong ctxAddress, jlong imgAddress, jlong colorAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_image_color(ctx, *img, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1image_1color(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1image_1color(ctxAddress, imgAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1set_1behavior(jlong ctxAddress, jint behavior) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_button_set_behavior(ctx, (enum nk_button_behavior)behavior);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1set_1behavior(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint behavior) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1set_1behavior(ctxAddress, behavior);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1push_1behavior(jlong ctxAddress, jint behavior) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_button_push_behavior(ctx, (enum nk_button_behavior)behavior);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1push_1behavior(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint behavior) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1push_1behavior(ctxAddress, behavior);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1pop_1behavior(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_button_pop_behavior(ctx);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1pop_1behavior(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1pop_1behavior(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1text(jlong ctxAddress, jlong titleAddress, jint len) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    return (jint)nk_button_text(ctx, title, (nk_int)len);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong titleAddress, jint len) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1text(ctxAddress, titleAddress, len);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1label(jlong ctxAddress, jlong titleAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    return (jint)nk_button_label(ctx, title);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong titleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1label(ctxAddress, titleAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1color(jlong ctxAddress, jlong colorAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    return (jint)nk_button_color(ctx, *color);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1color(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1color(ctxAddress, colorAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol(jlong ctxAddress, jint symbol) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_button_symbol(ctx, (enum nk_symbol_type)symbol);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol(ctxAddress, symbol);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1image(jlong ctxAddress, jlong imgAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    return (jint)nk_button_image(ctx, *img);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1image(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1image(ctxAddress, imgAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1label(jlong ctxAddress, jint symbol, jlong textAddress, jint text_alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_button_symbol_label(ctx, (enum nk_symbol_type)symbol, text, (nk_flags)text_alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint text_alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1label(ctxAddress, symbol, textAddress, text_alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1text(jlong ctxAddress, jint symbol, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_button_symbol_text(ctx, (enum nk_symbol_type)symbol, text, (nk_int)len, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint len, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1text(ctxAddress, symbol, textAddress, len, alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1label(jlong ctxAddress, jlong imgAddress, jlong textAddress, jint text_alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_button_image_label(ctx, *img, text, (nk_flags)text_alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint text_alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1label(ctxAddress, imgAddress, textAddress, text_alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1text(jlong ctxAddress, jlong imgAddress, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_button_image_text(ctx, *img, text, (nk_int)len, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint len, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1text(ctxAddress, imgAddress, textAddress, len, alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1text_1styled(jlong ctxAddress, jlong styleAddress, jlong titleAddress, jint len) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_style_button const *style = (struct nk_style_button const *)(intptr_t)styleAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    return (jint)nk_button_text_styled(ctx, style, title, len);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1text_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jlong titleAddress, jint len) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1text_1styled(ctxAddress, styleAddress, titleAddress, len);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1label_1styled(jlong ctxAddress, jlong styleAddress, jlong titleAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_style_button const *style = (struct nk_style_button const *)(intptr_t)styleAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    return (jint)nk_button_label_styled(ctx, style, title);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1label_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jlong titleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1label_1styled(ctxAddress, styleAddress, titleAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1styled(jlong ctxAddress, jlong styleAddress, jint symbol) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_style_button const *style = (struct nk_style_button const *)(intptr_t)styleAddress;
    return (jint)nk_button_symbol_styled(ctx, style, (enum nk_symbol_type)symbol);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jint symbol) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1styled(ctxAddress, styleAddress, symbol);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1styled(jlong ctxAddress, jlong styleAddress, jlong imgAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_style_button const *style = (struct nk_style_button const *)(intptr_t)styleAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    return (jint)nk_button_image_styled(ctx, style, *img);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jlong imgAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1styled(ctxAddress, styleAddress, imgAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1text_1styled)(jlong ctxAddress, jlong styleAddress, jint symbol, jlong titleAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_style_button const *style = (struct nk_style_button const *)(intptr_t)styleAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    return (jint)nk_button_symbol_text_styled(ctx, style, (enum nk_symbol_type)symbol, title, len, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1text_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jint symbol, jlong titleAddress, jint len, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1text_1styled)(ctxAddress, styleAddress, symbol, titleAddress, len, alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1label_1styled(jlong ctxAddress, jlong styleAddress, jint symbol, jlong titleAddress, jint text_alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_style_button const *style = (struct nk_style_button const *)(intptr_t)styleAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    return (jint)nk_button_symbol_label_styled(ctx, style, (enum nk_symbol_type)symbol, title, (nk_flags)text_alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1label_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jint symbol, jlong titleAddress, jint text_alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1label_1styled(ctxAddress, styleAddress, symbol, titleAddress, text_alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1label_1styled(jlong ctxAddress, jlong styleAddress, jlong imgAddress, jlong titleAddress, jint text_alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_style_button const *style = (struct nk_style_button const *)(intptr_t)styleAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    return (jint)nk_button_image_label_styled(ctx, style, *img, title, (nk_flags)text_alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1label_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jlong imgAddress, jlong titleAddress, jint text_alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1label_1styled(ctxAddress, styleAddress, imgAddress, titleAddress, text_alignment);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1text_1styled)(jlong ctxAddress, jlong styleAddress, jlong imgAddress, jlong titleAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_style_button const *style = (struct nk_style_button const *)(intptr_t)styleAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    return (jint)nk_button_image_text_styled(ctx, style, *img, title, len, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1text_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jlong imgAddress, jlong titleAddress, jint len, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1text_1styled)(ctxAddress, styleAddress, imgAddress, titleAddress, len, alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1check_1label(jlong ctxAddress, jlong strAddress, jint active) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_check_label(ctx, str, active);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1check_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint active) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1check_1label(ctxAddress, strAddress, active);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1check_1text(jlong ctxAddress, jlong strAddress, jint len, jint active) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_check_text(ctx, str, len, active);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1check_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint active) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1check_1text(ctxAddress, strAddress, len, active);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1check_1flags_1label(jlong ctxAddress, jlong strAddress, jint flags, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_check_flags_label(ctx, str, (unsigned int)flags, (unsigned int)value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1check_1flags_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint flags, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1check_1flags_1label(ctxAddress, strAddress, flags, value);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1check_1flags_1text(jlong ctxAddress, jlong strAddress, jint len, jint flags, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_check_flags_text(ctx, str, len, (unsigned int)flags, (unsigned int)value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1check_1flags_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint flags, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1check_1flags_1text(ctxAddress, strAddress, len, flags, value);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1label__JJJ(jlong ctxAddress, jlong strAddress, jlong activeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    int *active = (int *)(intptr_t)activeAddress;
    return (jint)nk_checkbox_label(ctx, str, active);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1label__JJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jlong activeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1label__JJJ(ctxAddress, strAddress, activeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1text__JJIJ(jlong ctxAddress, jlong strAddress, jint len, jlong activeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    int *active = (int *)(intptr_t)activeAddress;
    return (jint)nk_checkbox_text(ctx, str, len, active);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1text__JJIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jlong activeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1text__JJIJ(ctxAddress, strAddress, len, activeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1label__JJJI(jlong ctxAddress, jlong strAddress, jlong flagsAddress, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    unsigned int *flags = (unsigned int *)(intptr_t)flagsAddress;
    return (jint)nk_checkbox_flags_label(ctx, str, flags, (unsigned int)value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1label__JJJI(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jlong flagsAddress, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1label__JJJI(ctxAddress, strAddress, flagsAddress, value);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1text__JJIJI(jlong ctxAddress, jlong strAddress, jint len, jlong flagsAddress, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    unsigned int *flags = (unsigned int *)(intptr_t)flagsAddress;
    return (jint)nk_checkbox_flags_text(ctx, str, len, flags, (unsigned int)value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1text__JJIJI(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jlong flagsAddress, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1text__JJIJI(ctxAddress, strAddress, len, flagsAddress, value);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1radio_1label__JJJ(jlong ctxAddress, jlong strAddress, jlong activeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    int *active = (int *)(intptr_t)activeAddress;
    return (jint)nk_radio_label(ctx, str, active);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1radio_1label__JJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jlong activeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1radio_1label__JJJ(ctxAddress, strAddress, activeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1radio_1text__JJIJ(jlong ctxAddress, jlong strAddress, jint len, jlong activeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    int *active = (int *)(intptr_t)activeAddress;
    return (jint)nk_radio_text(ctx, str, len, active);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1radio_1text__JJIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jlong activeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1radio_1text__JJIJ(ctxAddress, strAddress, len, activeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1option_1label(jlong ctxAddress, jlong strAddress, jint active) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_option_label(ctx, str, active);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1option_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint active) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1option_1label(ctxAddress, strAddress, active);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1option_1text(jlong ctxAddress, jlong strAddress, jint len, jint active) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_option_text(ctx, str, len, active);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1option_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint active) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1option_1text(ctxAddress, strAddress, len, active);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1label__JJIJ(jlong ctxAddress, jlong strAddress, jint align, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    int *value = (int *)(intptr_t)valueAddress;
    return (jint)nk_selectable_label(ctx, str, (nk_flags)align, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1label__JJIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint align, jlong valueAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1label__JJIJ(ctxAddress, strAddress, align, valueAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1text__JJIIJ(jlong ctxAddress, jlong strAddress, jint len, jint align, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    int *value = (int *)(intptr_t)valueAddress;
    return (jint)nk_selectable_text(ctx, str, len, (nk_flags)align, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1text__JJIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint align, jlong valueAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1text__JJIIJ(ctxAddress, strAddress, len, align, valueAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1label__JJJIJ(jlong ctxAddress, jlong imgAddress, jlong strAddress, jint align, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    int *value = (int *)(intptr_t)valueAddress;
    return (jint)nk_selectable_image_label(ctx, *img, str, (nk_flags)align, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1label__JJJIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong strAddress, jint align, jlong valueAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1label__JJJIJ(ctxAddress, imgAddress, strAddress, align, valueAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1text__JJJIIJ)(jlong ctxAddress, jlong imgAddress, jlong strAddress, jint len, jint align, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    int *value = (int *)(intptr_t)valueAddress;
    return (jint)nk_selectable_image_text(ctx, *img, str, len, (nk_flags)align, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1text__JJJIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong strAddress, jint len, jint align, jlong valueAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1text__JJJIIJ)(ctxAddress, imgAddress, strAddress, len, align, valueAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1symbol_1label__JIJIJ(jlong ctxAddress, jint symbol, jlong strAddress, jint align, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    int *value = (int *)(intptr_t)valueAddress;
    return (jint)nk_selectable_symbol_label(ctx, (enum nk_symbol_type)symbol, str, (nk_flags)align, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1symbol_1label__JIJIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong strAddress, jint align, jlong valueAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1symbol_1label__JIJIJ(ctxAddress, symbol, strAddress, align, valueAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1selectable_1symbol_1text__JIJIIJ)(jlong ctxAddress, jint symbol, jlong strAddress, jint len, jint align, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    int *value = (int *)(intptr_t)valueAddress;
    return (jint)nk_selectable_symbol_text(ctx, (enum nk_symbol_type)symbol, str, len, (nk_flags)align, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1symbol_1text__JIJIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong strAddress, jint len, jint align, jlong valueAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1selectable_1symbol_1text__JIJIIJ)(ctxAddress, symbol, strAddress, len, align, valueAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1select_1label(jlong ctxAddress, jlong strAddress, jint align, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_select_label(ctx, str, (nk_flags)align, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1select_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint align, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1select_1label(ctxAddress, strAddress, align, value);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1select_1text(jlong ctxAddress, jlong strAddress, jint len, jint align, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_select_text(ctx, str, len, (nk_flags)align, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1select_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint align, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1select_1text(ctxAddress, strAddress, len, align, value);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1select_1image_1label(jlong ctxAddress, jlong imgAddress, jlong strAddress, jint align, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_select_image_label(ctx, *img, str, (nk_flags)align, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1select_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong strAddress, jint align, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1select_1image_1label(ctxAddress, imgAddress, strAddress, align, value);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1select_1image_1text)(jlong ctxAddress, jlong imgAddress, jlong strAddress, jint len, jint align, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_select_image_text(ctx, *img, str, len, (nk_flags)align, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1select_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong strAddress, jint len, jint align, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1select_1image_1text)(ctxAddress, imgAddress, strAddress, len, align, value);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1select_1symbol_1label(jlong ctxAddress, jint symbol, jlong strAddress, jint align, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_select_symbol_label(ctx, (enum nk_symbol_type)symbol, str, (nk_flags)align, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1select_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong strAddress, jint align, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1select_1symbol_1label(ctxAddress, symbol, strAddress, align, value);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1select_1symbol_1text)(jlong ctxAddress, jint symbol, jlong strAddress, jint len, jint align, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_select_symbol_text(ctx, (enum nk_symbol_type)symbol, str, len, (nk_flags)align, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1select_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong strAddress, jint len, jint align, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1select_1symbol_1text)(ctxAddress, symbol, strAddress, len, align, value);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1slide_1float(jlong ctxAddress, jfloat min, jfloat val, jfloat max, jfloat step) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jfloat)nk_slide_float(ctx, min, val, max, step);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1slide_1float(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat min, jfloat val, jfloat max, jfloat step) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1slide_1float(ctxAddress, min, val, max, step);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1slide_1int(jlong ctxAddress, jint min, jint val, jint max, jint step) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_slide_int(ctx, min, val, max, step);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1slide_1int(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint min, jint val, jint max, jint step) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1slide_1int(ctxAddress, min, val, max, step);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1slider_1float__JFJFF(jlong ctxAddress, jfloat min, jlong valAddress, jfloat max, jfloat step) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    float *val = (float *)(intptr_t)valAddress;
    return (jint)nk_slider_float(ctx, min, val, max, step);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1slider_1float__JFJFF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat min, jlong valAddress, jfloat max, jfloat step) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1slider_1float__JFJFF(ctxAddress, min, valAddress, max, step);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1slider_1int__JIJII(jlong ctxAddress, jint min, jlong valAddress, jint max, jint step) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    int *val = (int *)(intptr_t)valAddress;
    return (jint)nk_slider_int(ctx, min, val, max, step);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1slider_1int__JIJII(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint min, jlong valAddress, jint max, jint step) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1slider_1int__JIJII(ctxAddress, min, valAddress, max, step);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1progress(jlong ctxAddress, jlong curAddress, jlong max, jint modifyable) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_size *cur = (nk_size *)(intptr_t)curAddress;
    return (jint)nk_progress(ctx, cur, (nk_size)max, modifyable);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1progress(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong curAddress, jlong max, jint modifyable) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1progress(ctxAddress, curAddress, max, modifyable);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1prog(jlong ctxAddress, jlong cur, jlong max, jint modifyable) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jlong)nk_prog(ctx, (nk_size)cur, (nk_size)max, modifyable);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1prog(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong cur, jlong max, jint modifyable) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1prog(ctxAddress, cur, max, modifyable);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1picker(jlong ctxAddress, jlong colorAddress, jint fmt) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_colorf *color = (struct nk_colorf *)(intptr_t)colorAddress;
    *color = nk_color_picker(ctx, *color, (enum nk_color_format)fmt);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1picker(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong colorAddress, jint fmt) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1picker(ctxAddress, colorAddress, fmt);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1pick(jlong ctxAddress, jlong colorAddress, jint fmt) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_colorf *color = (struct nk_colorf *)(intptr_t)colorAddress;
    return (jint)nk_color_pick(ctx, color, (enum nk_color_format)fmt);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1pick(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong colorAddress, jint fmt) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1pick(ctxAddress, colorAddress, fmt);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1property_1int__JJIJIIF)(jlong ctxAddress, jlong nameAddress, jint min, jlong valAddress, jint max, jint step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    int *val = (int *)(intptr_t)valAddress;
    nk_property_int(ctx, name, min, val, max, step, inc_per_pixel);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1property_1int__JJIJIIF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint min, jlong valAddress, jint max, jint step, jfloat inc_per_pixel) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1property_1int__JJIJIIF)(ctxAddress, nameAddress, min, valAddress, max, step, inc_per_pixel);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1property_1float__JJFJFFF)(jlong ctxAddress, jlong nameAddress, jfloat min, jlong valAddress, jfloat max, jfloat step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    float *val = (float *)(intptr_t)valAddress;
    nk_property_float(ctx, name, min, val, max, step, inc_per_pixel);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1property_1float__JJFJFFF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jfloat min, jlong valAddress, jfloat max, jfloat step, jfloat inc_per_pixel) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1property_1float__JJFJFFF)(ctxAddress, nameAddress, min, valAddress, max, step, inc_per_pixel);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1property_1double__JJDJDDF)(jlong ctxAddress, jlong nameAddress, jdouble min, jlong valAddress, jdouble max, jdouble step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    double *val = (double *)(intptr_t)valAddress;
    nk_property_double(ctx, name, min, val, max, step, inc_per_pixel);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1property_1double__JJDJDDF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jdouble min, jlong valAddress, jdouble max, jdouble step, jfloat inc_per_pixel) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1property_1double__JJDJDDF)(ctxAddress, nameAddress, min, valAddress, max, step, inc_per_pixel);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1propertyi)(jlong ctxAddress, jlong nameAddress, jint min, jint val, jint max, jint step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    return (jint)nk_propertyi(ctx, name, min, val, max, step, inc_per_pixel);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1propertyi(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint min, jint val, jint max, jint step, jfloat inc_per_pixel) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1propertyi)(ctxAddress, nameAddress, min, val, max, step, inc_per_pixel);
}

JNIEXPORT_CRITICAL jfloat JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1propertyf)(jlong ctxAddress, jlong nameAddress, jfloat min, jfloat val, jfloat max, jfloat step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    return (jfloat)nk_propertyf(ctx, name, min, val, max, step, inc_per_pixel);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1propertyf(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jfloat min, jfloat val, jfloat max, jfloat step, jfloat inc_per_pixel) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1propertyf)(ctxAddress, nameAddress, min, val, max, step, inc_per_pixel);
}

JNIEXPORT_CRITICAL jdouble JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1propertyd)(jlong ctxAddress, jlong nameAddress, jdouble min, jdouble val, jdouble max, jdouble step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    return (jdouble)nk_propertyd(ctx, name, min, val, max, step, inc_per_pixel);
}
JNIEXPORT jdouble JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1propertyd(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jdouble min, jdouble val, jdouble max, jdouble step, jfloat inc_per_pixel) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1propertyd)(ctxAddress, nameAddress, min, val, max, step, inc_per_pixel);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1edit_1focus(jlong ctxAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_edit_focus(ctx, (nk_flags)flags);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1edit_1focus(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1edit_1focus(ctxAddress, flags);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1edit_1unfocus(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_edit_unfocus(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1edit_1unfocus(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1edit_1unfocus(ctxAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1edit_1string__JIJJIJ)(jlong ctxAddress, jint flags, jlong memoryAddress, jlong lenAddress, jint max, jlong filterAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char *memory = (char *)(intptr_t)memoryAddress;
    int *len = (int *)(intptr_t)lenAddress;
    nk_plugin_filter filter = (nk_plugin_filter)(intptr_t)filterAddress;
    return (jint)nk_edit_string(ctx, (nk_flags)flags, memory, len, max, filter);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1edit_1string__JIJJIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint flags, jlong memoryAddress, jlong lenAddress, jint max, jlong filterAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1edit_1string__JIJJIJ)(ctxAddress, flags, memoryAddress, lenAddress, max, filterAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1edit_1buffer(jlong ctxAddress, jint flags, jlong editAddress, jlong filterAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_text_edit *edit = (struct nk_text_edit *)(intptr_t)editAddress;
    nk_plugin_filter filter = (nk_plugin_filter)(intptr_t)filterAddress;
    return (jint)nk_edit_buffer(ctx, (nk_flags)flags, edit, filter);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1edit_1buffer(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint flags, jlong editAddress, jlong filterAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1edit_1buffer(ctxAddress, flags, editAddress, filterAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1edit_1string_1zero_1terminated(jlong ctxAddress, jint flags, jlong bufferAddress, jint max, jlong filterAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char *buffer = (char *)(intptr_t)bufferAddress;
    nk_plugin_filter filter = (nk_plugin_filter)(intptr_t)filterAddress;
    return (jint)nk_edit_string_zero_terminated(ctx, (nk_flags)flags, buffer, max, filter);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1edit_1string_1zero_1terminated(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint flags, jlong bufferAddress, jint max, jlong filterAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1edit_1string_1zero_1terminated(ctxAddress, flags, bufferAddress, max, filterAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1chart_1begin(jlong ctxAddress, jint type, jint num, jfloat min, jfloat max) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_chart_begin(ctx, (enum nk_chart_type)type, num, min, max);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jint num, jfloat min, jfloat max) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1chart_1begin(ctxAddress, type, num, min, max);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1chart_1begin_1colored)(jlong ctxAddress, jint type, jlong colorAddress, jlong activeAddress, jint num, jfloat min, jfloat max) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    struct nk_color *active = (struct nk_color *)(intptr_t)activeAddress;
    return (jint)nk_chart_begin_colored(ctx, (enum nk_chart_type)type, *color, *active, num, min, max);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1begin_1colored(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong colorAddress, jlong activeAddress, jint num, jfloat min, jfloat max) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1chart_1begin_1colored)(ctxAddress, type, colorAddress, activeAddress, num, min, max);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1chart_1add_1slot(jlong ctxAddress, jint type, jint count, jfloat min_value, jfloat max_value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_chart_add_slot(ctx, (enum nk_chart_type)type, count, min_value, max_value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1add_1slot(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jint count, jfloat min_value, jfloat max_value) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1chart_1add_1slot(ctxAddress, type, count, min_value, max_value);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1chart_1add_1slot_1colored)(jlong ctxAddress, jint type, jlong colorAddress, jlong activeAddress, jint count, jfloat min_value, jfloat max_value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    struct nk_color *active = (struct nk_color *)(intptr_t)activeAddress;
    nk_chart_add_slot_colored(ctx, (enum nk_chart_type)type, *color, *active, count, min_value, max_value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1add_1slot_1colored(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong colorAddress, jlong activeAddress, jint count, jfloat min_value, jfloat max_value) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1chart_1add_1slot_1colored)(ctxAddress, type, colorAddress, activeAddress, count, min_value, max_value);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1chart_1push(jlong ctxAddress, jfloat value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_chart_push(ctx, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1push(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1chart_1push(ctxAddress, value);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1chart_1push_1slot(jlong ctxAddress, jfloat value, jint slot) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_chart_push_slot(ctx, value, slot);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1push_1slot(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat value, jint slot) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1chart_1push_1slot(ctxAddress, value, slot);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1chart_1end(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_chart_end(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1chart_1end(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1plot__JIJII(jlong ctxAddress, jint type, jlong valuesAddress, jint count, jint offset) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    float const *values = (float const *)(intptr_t)valuesAddress;
    nk_plot(ctx, (enum nk_chart_type)type, values, count, offset);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1plot__JIJII(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong valuesAddress, jint count, jint offset) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1plot__JIJII(ctxAddress, type, valuesAddress, count, offset);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1plot_1function)(jlong ctxAddress, jint type, jlong userdataAddress, jlong value_getterAddress, jint count, jint offset) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    void *userdata = (void *)(intptr_t)userdataAddress;
    nk_value_getter value_getter = (nk_value_getter)(intptr_t)value_getterAddress;
    nk_plot_function(ctx, (enum nk_chart_type)type, userdata, value_getter, count, offset);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1plot_1function(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong userdataAddress, jlong value_getterAddress, jint count, jint offset) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1plot_1function)(ctxAddress, type, userdataAddress, value_getterAddress, count, offset);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1popup_1begin(jlong ctxAddress, jint type, jlong titleAddress, jint flags, jlong rectAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *title = (char const *)(intptr_t)titleAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    return (jint)nk_popup_begin(ctx, (enum nk_popup_type)type, title, (nk_flags)flags, *rect);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1popup_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong titleAddress, jint flags, jlong rectAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1popup_1begin(ctxAddress, type, titleAddress, flags, rectAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1popup_1close(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_popup_close(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1popup_1close(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1popup_1close(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1popup_1end(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_popup_end(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1popup_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1popup_1end(ctxAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combo)(jlong ctxAddress, jlong itemsAddress, jint count, jint selected, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const **items = (char const **)(intptr_t)itemsAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_combo(ctx, items, count, selected, item_height, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong itemsAddress, jint count, jint selected, jint item_height, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combo)(ctxAddress, itemsAddress, count, selected, item_height, sizeAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combo_1separator)(jlong ctxAddress, jlong items_separated_by_separatorAddress, jint separator, jint selected, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *items_separated_by_separator = (char const *)(intptr_t)items_separated_by_separatorAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_combo_separator(ctx, items_separated_by_separator, separator, selected, count, item_height, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1separator(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong items_separated_by_separatorAddress, jint separator, jint selected, jint count, jint item_height, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combo_1separator)(ctxAddress, items_separated_by_separatorAddress, separator, selected, count, item_height, sizeAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combo_1string)(jlong ctxAddress, jlong items_separated_by_zerosAddress, jint selected, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *items_separated_by_zeros = (char const *)(intptr_t)items_separated_by_zerosAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_combo_string(ctx, items_separated_by_zeros, selected, count, item_height, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1string(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong items_separated_by_zerosAddress, jint selected, jint count, jint item_height, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combo_1string)(ctxAddress, items_separated_by_zerosAddress, selected, count, item_height, sizeAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combo_1callback)(jlong ctxAddress, jlong item_getterAddress, jlong userdataAddress, jint selected, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_item_getter item_getter = (nk_item_getter)(intptr_t)item_getterAddress;
    void *userdata = (void *)(intptr_t)userdataAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_combo_callback(ctx, item_getter, userdata, selected, count, item_height, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1callback(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong item_getterAddress, jlong userdataAddress, jint selected, jint count, jint item_height, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combo_1callback)(ctxAddress, item_getterAddress, userdataAddress, selected, count, item_height, sizeAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox__JJIJIJ)(jlong ctxAddress, jlong itemsAddress, jint count, jlong selectedAddress, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const **items = (char const **)(intptr_t)itemsAddress;
    int *selected = (int *)(intptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    nk_combobox(ctx, items, count, selected, item_height, *size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox__JJIJIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong itemsAddress, jint count, jlong selectedAddress, jint item_height, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox__JJIJIJ)(ctxAddress, itemsAddress, count, selectedAddress, item_height, sizeAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox_1string__JJJIIJ)(jlong ctxAddress, jlong items_separated_by_zerosAddress, jlong selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *items_separated_by_zeros = (char const *)(intptr_t)items_separated_by_zerosAddress;
    int *selected = (int *)(intptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    nk_combobox_string(ctx, items_separated_by_zeros, selected, count, item_height, *size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1string__JJJIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong items_separated_by_zerosAddress, jlong selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox_1string__JJJIIJ)(ctxAddress, items_separated_by_zerosAddress, selectedAddress, count, item_height, sizeAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox_1separator__JJIJIIJ)(jlong ctxAddress, jlong items_separated_by_separatorAddress, jint separator, jlong selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *items_separated_by_separator = (char const *)(intptr_t)items_separated_by_separatorAddress;
    int *selected = (int *)(intptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    nk_combobox_separator(ctx, items_separated_by_separator, separator, selected, count, item_height, *size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1separator__JJIJIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong items_separated_by_separatorAddress, jint separator, jlong selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox_1separator__JJIJIIJ)(ctxAddress, items_separated_by_separatorAddress, separator, selectedAddress, count, item_height, sizeAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox_1callback__JJJJIIJ)(jlong ctxAddress, jlong item_getterAddress, jlong userdataAddress, jlong selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_item_getter item_getter = (nk_item_getter)(intptr_t)item_getterAddress;
    void *userdata = (void *)(intptr_t)userdataAddress;
    int *selected = (int *)(intptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    nk_combobox_callback(ctx, item_getter, userdata, selected, count, item_height, *size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1callback__JJJJIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong item_getterAddress, jlong userdataAddress, jlong selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox_1callback__JJJJIIJ)(ctxAddress, item_getterAddress, userdataAddress, selectedAddress, count, item_height, sizeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1text(jlong ctxAddress, jlong selectedAddress, jint len, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *selected = (char const *)(intptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_combo_begin_text(ctx, selected, len, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong selectedAddress, jint len, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1text(ctxAddress, selectedAddress, len, sizeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1label(jlong ctxAddress, jlong selectedAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *selected = (char const *)(intptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_combo_begin_label(ctx, selected, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong selectedAddress, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1label(ctxAddress, selectedAddress, sizeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1color(jlong ctxAddress, jlong colorAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_combo_begin_color(ctx, *color, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1color(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong colorAddress, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1color(ctxAddress, colorAddress, sizeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1symbol(jlong ctxAddress, jint symbol, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_combo_begin_symbol(ctx, (enum nk_symbol_type)symbol, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1symbol(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1symbol(ctxAddress, symbol, sizeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1symbol_1label(jlong ctxAddress, jlong selectedAddress, jint symbol, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *selected = (char const *)(intptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_combo_begin_symbol_label(ctx, selected, (enum nk_symbol_type)symbol, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong selectedAddress, jint symbol, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1symbol_1label(ctxAddress, selectedAddress, symbol, sizeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1symbol_1text(jlong ctxAddress, jlong selectedAddress, jint len, jint symbol, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *selected = (char const *)(intptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_combo_begin_symbol_text(ctx, selected, len, (enum nk_symbol_type)symbol, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong selectedAddress, jint len, jint symbol, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1symbol_1text(ctxAddress, selectedAddress, len, symbol, sizeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1image(jlong ctxAddress, jlong imgAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_combo_begin_image(ctx, *img, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1image(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1image(ctxAddress, imgAddress, sizeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1image_1label(jlong ctxAddress, jlong selectedAddress, jlong imgAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *selected = (char const *)(intptr_t)selectedAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_combo_begin_image_label(ctx, selected, *img, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong selectedAddress, jlong imgAddress, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1image_1label(ctxAddress, selectedAddress, imgAddress, sizeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1image_1text(jlong ctxAddress, jlong selectedAddress, jint len, jlong imgAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *selected = (char const *)(intptr_t)selectedAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_combo_begin_image_text(ctx, selected, len, *img, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong selectedAddress, jint len, jlong imgAddress, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1image_1text(ctxAddress, selectedAddress, len, imgAddress, sizeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1label(jlong ctxAddress, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_combo_item_label(ctx, text, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1label(ctxAddress, textAddress, alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1text(jlong ctxAddress, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_combo_item_text(ctx, text, len, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint len, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1text(ctxAddress, textAddress, len, alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1image_1label(jlong ctxAddress, jlong imgAddress, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_combo_item_image_label(ctx, *img, text, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1image_1label(ctxAddress, imgAddress, textAddress, alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1image_1text(jlong ctxAddress, jlong imgAddress, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_combo_item_image_text(ctx, *img, text, len, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint len, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1image_1text(ctxAddress, imgAddress, textAddress, len, alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1symbol_1label(jlong ctxAddress, jint symbol, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_combo_item_symbol_label(ctx, (enum nk_symbol_type)symbol, text, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1symbol_1label(ctxAddress, symbol, textAddress, alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1symbol_1text(jlong ctxAddress, jint symbol, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_combo_item_symbol_text(ctx, (enum nk_symbol_type)symbol, text, len, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint len, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1symbol_1text(ctxAddress, symbol, textAddress, len, alignment);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1close(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_combo_close(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1close(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1close(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1end(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_combo_end(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combo_1end(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1begin(jlong ctxAddress, jint flags, jlong sizeAddress, jlong trigger_boundsAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    struct nk_rect *trigger_bounds = (struct nk_rect *)(intptr_t)trigger_boundsAddress;
    return (jint)nk_contextual_begin(ctx, (nk_flags)flags, *size, *trigger_bounds);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint flags, jlong sizeAddress, jlong trigger_boundsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1begin(ctxAddress, flags, sizeAddress, trigger_boundsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1text(jlong ctxAddress, jlong textAddress, jint len, jint align) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_contextual_item_text(ctx, text, len, (nk_flags)align);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint len, jint align) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1text(ctxAddress, textAddress, len, align);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1label(jlong ctxAddress, jlong textAddress, jint align) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_contextual_item_label(ctx, text, (nk_flags)align);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint align) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1label(ctxAddress, textAddress, align);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1image_1label(jlong ctxAddress, jlong imgAddress, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_contextual_item_image_label(ctx, *img, text, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1image_1label(ctxAddress, imgAddress, textAddress, alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1image_1text(jlong ctxAddress, jlong imgAddress, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_contextual_item_image_text(ctx, *img, text, len, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint len, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1image_1text(ctxAddress, imgAddress, textAddress, len, alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1symbol_1label(jlong ctxAddress, jint symbol, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_contextual_item_symbol_label(ctx, (enum nk_symbol_type)symbol, text, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1symbol_1label(ctxAddress, symbol, textAddress, alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1symbol_1text(jlong ctxAddress, jint symbol, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_contextual_item_symbol_text(ctx, (enum nk_symbol_type)symbol, text, len, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint len, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1symbol_1text(ctxAddress, symbol, textAddress, len, alignment);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1close(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_contextual_close(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1close(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1close(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1end(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_contextual_end(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1end(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tooltip(jlong ctxAddress, jlong textAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    nk_tooltip(ctx, text);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tooltip(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tooltip(ctxAddress, textAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tooltip_1begin(jlong ctxAddress, jfloat width) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_tooltip_begin(ctx, width);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tooltip_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat width) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tooltip_1begin(ctxAddress, width);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tooltip_1end(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_tooltip_end(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tooltip_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tooltip_1end(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menubar_1begin(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_menubar_begin(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menubar_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menubar_1begin(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menubar_1end(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_menubar_end(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menubar_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menubar_1end(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1text(jlong ctxAddress, jlong textAddress, jint len, jint align, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_menu_begin_text(ctx, text, len, (nk_flags)align, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint len, jint align, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1text(ctxAddress, textAddress, len, align, sizeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1label(jlong ctxAddress, jlong textAddress, jint align, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_menu_begin_label(ctx, text, (nk_flags)align, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint align, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1label(ctxAddress, textAddress, align, sizeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1image(jlong ctxAddress, jlong textAddress, jlong imgAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_menu_begin_image(ctx, text, *img, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1image(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jlong imgAddress, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1image(ctxAddress, textAddress, imgAddress, sizeAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1image_1text)(jlong ctxAddress, jlong textAddress, jint len, jint align, jlong imgAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_menu_begin_image_text(ctx, text, len, (nk_flags)align, *img, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint len, jint align, jlong imgAddress, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1image_1text)(ctxAddress, textAddress, len, align, imgAddress, sizeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1image_1label(jlong ctxAddress, jlong textAddress, jint align, jlong imgAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_menu_begin_image_label(ctx, text, (nk_flags)align, *img, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint align, jlong imgAddress, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1image_1label(ctxAddress, textAddress, align, imgAddress, sizeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1symbol(jlong ctxAddress, jlong textAddress, jint symbol, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_menu_begin_symbol(ctx, text, (enum nk_symbol_type)symbol, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1symbol(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint symbol, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1symbol(ctxAddress, textAddress, symbol, sizeAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1symbol_1text)(jlong ctxAddress, jlong textAddress, jint len, jint align, jint symbol, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_menu_begin_symbol_text(ctx, text, len, (nk_flags)align, (enum nk_symbol_type)symbol, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint len, jint align, jint symbol, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1symbol_1text)(ctxAddress, textAddress, len, align, symbol, sizeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1symbol_1label(jlong ctxAddress, jlong textAddress, jint align, jint symbol, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    return (jint)nk_menu_begin_symbol_label(ctx, text, (nk_flags)align, (enum nk_symbol_type)symbol, *size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint align, jint symbol, jlong sizeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1symbol_1label(ctxAddress, textAddress, align, symbol, sizeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1text(jlong ctxAddress, jlong textAddress, jint len, jint align) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_menu_item_text(ctx, text, len, (nk_flags)align);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint len, jint align) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1text(ctxAddress, textAddress, len, align);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1label(jlong ctxAddress, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_menu_item_label(ctx, text, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1label(ctxAddress, textAddress, alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1image_1label(jlong ctxAddress, jlong imgAddress, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_menu_item_image_label(ctx, *img, text, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1image_1label(ctxAddress, imgAddress, textAddress, alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1image_1text(jlong ctxAddress, jlong imgAddress, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_menu_item_image_text(ctx, *img, text, len, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint len, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1image_1text(ctxAddress, imgAddress, textAddress, len, alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1symbol_1text(jlong ctxAddress, jint symbol, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_menu_item_symbol_text(ctx, (enum nk_symbol_type)symbol, text, len, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint len, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1symbol_1text(ctxAddress, symbol, textAddress, len, alignment);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1symbol_1label(jlong ctxAddress, jint symbol, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)nk_menu_item_symbol_label(ctx, (enum nk_symbol_type)symbol, text, (nk_flags)alignment);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1symbol_1label(ctxAddress, symbol, textAddress, alignment);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1close(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_menu_close(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1close(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1close(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1end(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_menu_end(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1menu_1end(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1convert(jlong ctxAddress, jlong cmdsAddress, jlong verticesAddress, jlong elementsAddress, jlong configAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_buffer *cmds = (struct nk_buffer *)(intptr_t)cmdsAddress;
    struct nk_buffer *vertices = (struct nk_buffer *)(intptr_t)verticesAddress;
    struct nk_buffer *elements = (struct nk_buffer *)(intptr_t)elementsAddress;
    struct nk_convert_config const *config = (struct nk_convert_config const *)(intptr_t)configAddress;
    return (jint)nk_convert(ctx, cmds, vertices, elements, config);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1convert(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong cmdsAddress, jlong verticesAddress, jlong elementsAddress, jlong configAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1convert(ctxAddress, cmdsAddress, verticesAddress, elementsAddress, configAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1begin(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_input_begin(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1begin(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1motion(jlong ctxAddress, jint x, jint y) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_input_motion(ctx, x, y);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1motion(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint x, jint y) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1motion(ctxAddress, x, y);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1key(jlong ctxAddress, jint key, jint down) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_input_key(ctx, (enum nk_keys)key, down);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1key(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint key, jint down) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1key(ctxAddress, key, down);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1button(jlong ctxAddress, jint id, jint x, jint y, jint down) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_input_button(ctx, (enum nk_buttons)id, x, y, down);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1button(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint id, jint x, jint y, jint down) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1button(ctxAddress, id, x, y, down);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1scroll(jlong ctxAddress, jlong valAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_vec2 *val = (struct nk_vec2 *)(intptr_t)valAddress;
    nk_input_scroll(ctx, *val);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1scroll(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong valAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1scroll(ctxAddress, valAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1char(jlong ctxAddress, jbyte c) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_input_char(ctx, (char)c);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1char(JNIEnv *__env, jclass clazz, jlong ctxAddress, jbyte c) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1char(ctxAddress, c);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1glyph(jlong ctxAddress, jlong glyphAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char *glyph = (char *)(intptr_t)glyphAddress;
    nk_input_glyph(ctx, glyph);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1glyph(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong glyphAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1glyph(ctxAddress, glyphAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1unicode(jlong ctxAddress, jint unicode) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_input_unicode(ctx, (nk_rune)unicode);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1unicode(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint unicode) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1unicode(ctxAddress, unicode);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1end(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_input_end(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1end(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1default(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_style_default(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1default(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1default(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1from_1table(jlong ctxAddress, jlong tableAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_color const *table = (struct nk_color const *)(intptr_t)tableAddress;
    nk_style_from_table(ctx, table);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1from_1table(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong tableAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1from_1table(ctxAddress, tableAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1load_1cursor(jlong ctxAddress, jint style, jlong cursorAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_cursor *cursor = (struct nk_cursor *)(intptr_t)cursorAddress;
    nk_style_load_cursor(ctx, (enum nk_style_cursor)style, cursor);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1load_1cursor(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint style, jlong cursorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1load_1cursor(ctxAddress, style, cursorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1load_1all_1cursors(jlong ctxAddress, jlong cursorsAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_cursor *cursors = (struct nk_cursor *)(intptr_t)cursorsAddress;
    nk_style_load_all_cursors(ctx, cursors);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1load_1all_1cursors(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong cursorsAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1load_1all_1cursors(ctxAddress, cursorsAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1get_1color_1by_1name(jint c) {
    return (jlong)(intptr_t)nk_style_get_color_by_name((enum nk_style_colors)c);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1get_1color_1by_1name(JNIEnv *__env, jclass clazz, jint c) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1get_1color_1by_1name(c);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1set_1font(jlong ctxAddress, jlong fontAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_user_font const *font = (struct nk_user_font const *)(intptr_t)fontAddress;
    nk_style_set_font(ctx, font);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1set_1font(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong fontAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1set_1font(ctxAddress, fontAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1set_1cursor(jlong ctxAddress, jint style) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_style_set_cursor(ctx, (enum nk_style_cursor)style);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1set_1cursor(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint style) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1set_1cursor(ctxAddress, style);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1show_1cursor(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_style_show_cursor(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1show_1cursor(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1show_1cursor(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1hide_1cursor(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_style_hide_cursor(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1hide_1cursor(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1hide_1cursor(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1font(jlong ctxAddress, jlong fontAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_user_font const *font = (struct nk_user_font const *)(intptr_t)fontAddress;
    return (jint)nk_style_push_font(ctx, font);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1font(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong fontAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1font(ctxAddress, fontAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1float__JJF(jlong ctxAddress, jlong addressAddress, jfloat value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    float *address = (float *)(intptr_t)addressAddress;
    return (jint)nk_style_push_float(ctx, address, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1float__JJF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong addressAddress, jfloat value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1float__JJF(ctxAddress, addressAddress, value);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1vec2(jlong ctxAddress, jlong addressAddress, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_vec2 *address = (struct nk_vec2 *)(intptr_t)addressAddress;
    struct nk_vec2 *value = (struct nk_vec2 *)(intptr_t)valueAddress;
    return (jint)nk_style_push_vec2(ctx, address, *value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1vec2(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong addressAddress, jlong valueAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1vec2(ctxAddress, addressAddress, valueAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1style_1item(jlong ctxAddress, jlong addressAddress, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_style_item *address = (struct nk_style_item *)(intptr_t)addressAddress;
    struct nk_style_item *value = (struct nk_style_item *)(intptr_t)valueAddress;
    return (jint)nk_style_push_style_item(ctx, address, *value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1style_1item(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong addressAddress, jlong valueAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1style_1item(ctxAddress, addressAddress, valueAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1flags__JJI(jlong ctxAddress, jlong addressAddress, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_flags *address = (nk_flags *)(intptr_t)addressAddress;
    return (jint)nk_style_push_flags(ctx, address, (nk_flags)value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1flags__JJI(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong addressAddress, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1flags__JJI(ctxAddress, addressAddress, value);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1color(jlong ctxAddress, jlong addressAddress, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_color *address = (struct nk_color *)(intptr_t)addressAddress;
    struct nk_color *value = (struct nk_color *)(intptr_t)valueAddress;
    return (jint)nk_style_push_color(ctx, address, *value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1color(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong addressAddress, jlong valueAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1color(ctxAddress, addressAddress, valueAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1font(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_style_pop_font(ctx);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1font(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1font(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1float(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_style_pop_float(ctx);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1float(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1float(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1vec2(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_style_pop_vec2(ctx);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1vec2(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1vec2(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1style_1item(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_style_pop_style_item(ctx);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1style_1item(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1style_1item(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1flags(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_style_pop_flags(ctx);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1flags(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1flags(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1color(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_style_pop_color(ctx);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1color(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1color(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget_1bounds(jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    *((struct nk_rect*)(intptr_t)__result) = nk_widget_bounds(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1bounds(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget_1bounds(ctxAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget_1position(jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    *((struct nk_vec2*)(intptr_t)__result) = nk_widget_position(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1position(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget_1position(ctxAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget_1size(jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    *((struct nk_vec2*)(intptr_t)__result) = nk_widget_size(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1size(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget_1size(ctxAddress, __result);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget_1width(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jfloat)nk_widget_width(ctx);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1width(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget_1width(ctxAddress);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget_1height(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jfloat)nk_widget_height(ctx);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1height(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget_1height(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget_1is_1hovered(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_widget_is_hovered(ctx);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1is_1hovered(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget_1is_1hovered(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget_1is_1mouse_1clicked(jlong ctxAddress, jint btn) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_widget_is_mouse_clicked(ctx, (enum nk_buttons)btn);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1is_1mouse_1clicked(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint btn) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget_1is_1mouse_1clicked(ctxAddress, btn);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget_1has_1mouse_1click_1down(jlong ctxAddress, jint btn, jint down) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jint)nk_widget_has_mouse_click_down(ctx, (enum nk_buttons)btn, down);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1has_1mouse_1click_1down(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint btn, jint down) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget_1has_1mouse_1click_1down(ctxAddress, btn, down);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1spacing(jlong ctxAddress, jint cols) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_spacing(ctx, cols);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1spacing(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint cols) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1spacing(ctxAddress, cols);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget(jlong boundsAddress, jlong ctxAddress) {
    struct nk_rect *bounds = (struct nk_rect *)(intptr_t)boundsAddress;
    struct nk_context const *ctx = (struct nk_context const *)(intptr_t)ctxAddress;
    return (jint)nk_widget(bounds, ctx);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget(JNIEnv *__env, jclass clazz, jlong boundsAddress, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget(boundsAddress, ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget_1fitting(jlong boundsAddress, jlong ctxAddress, jlong item_paddingAddress) {
    struct nk_rect *bounds = (struct nk_rect *)(intptr_t)boundsAddress;
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_vec2 *item_padding = (struct nk_vec2 *)(intptr_t)item_paddingAddress;
    return (jint)nk_widget_fitting(bounds, ctx, *item_padding);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1fitting(JNIEnv *__env, jclass clazz, jlong boundsAddress, jlong ctxAddress, jlong item_paddingAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1widget_1fitting(boundsAddress, ctxAddress, item_paddingAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb(jint r, jint g, jint b, jlong __result) {
    *((struct nk_color*)(intptr_t)__result) = nk_rgb(r, g, b);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb(JNIEnv *__env, jclass clazz, jint r, jint g, jint b, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb(r, g, b, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1iv__JJ(jlong rgbAddress, jlong __result) {
    int const *rgb = (int const *)(intptr_t)rgbAddress;
    *((struct nk_color*)(intptr_t)__result) = nk_rgb_iv(rgb);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1iv__JJ(JNIEnv *__env, jclass clazz, jlong rgbAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1iv__JJ(rgbAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1bv(jlong rgbAddress, jlong __result) {
    nk_byte const *rgb = (nk_byte const *)(intptr_t)rgbAddress;
    *((struct nk_color*)(intptr_t)__result) = nk_rgb_bv(rgb);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1bv(JNIEnv *__env, jclass clazz, jlong rgbAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1bv(rgbAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1f(jfloat r, jfloat g, jfloat b, jlong __result) {
    *((struct nk_color*)(intptr_t)__result) = nk_rgb_f(r, g, b);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1f(JNIEnv *__env, jclass clazz, jfloat r, jfloat g, jfloat b, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1f(r, g, b, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1fv__JJ(jlong rgbAddress, jlong __result) {
    float const *rgb = (float const *)(intptr_t)rgbAddress;
    *((struct nk_color*)(intptr_t)__result) = nk_rgb_fv(rgb);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1fv__JJ(JNIEnv *__env, jclass clazz, jlong rgbAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1fv__JJ(rgbAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1cf(jlong cAddress, jlong __result) {
    struct nk_colorf *c = (struct nk_colorf *)(intptr_t)cAddress;
    *((struct nk_color*)(intptr_t)__result) = nk_rgb_cf(*c);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1cf(JNIEnv *__env, jclass clazz, jlong cAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1cf(cAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1hex(jlong rgbAddress, jlong __result) {
    char const *rgb = (char const *)(intptr_t)rgbAddress;
    *((struct nk_color*)(intptr_t)__result) = nk_rgb_hex(rgb);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1hex(JNIEnv *__env, jclass clazz, jlong rgbAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1hex(rgbAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba(jint r, jint g, jint b, jint a, jlong __result) {
    *((struct nk_color*)(intptr_t)__result) = nk_rgba(r, g, b, a);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba(JNIEnv *__env, jclass clazz, jint r, jint g, jint b, jint a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba(r, g, b, a, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1u32(jint in, jlong __result) {
    *((struct nk_color*)(intptr_t)__result) = nk_rgba_u32((nk_uint)in);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1u32(JNIEnv *__env, jclass clazz, jint in, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1u32(in, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1iv__JJ(jlong rgbaAddress, jlong __result) {
    int const *rgba = (int const *)(intptr_t)rgbaAddress;
    *((struct nk_color*)(intptr_t)__result) = nk_rgba_iv(rgba);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1iv__JJ(JNIEnv *__env, jclass clazz, jlong rgbaAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1iv__JJ(rgbaAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1bv(jlong rgbaAddress, jlong __result) {
    nk_byte const *rgba = (nk_byte const *)(intptr_t)rgbaAddress;
    *((struct nk_color*)(intptr_t)__result) = nk_rgba_bv(rgba);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1bv(JNIEnv *__env, jclass clazz, jlong rgbaAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1bv(rgbaAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1f(jfloat r, jfloat g, jfloat b, jfloat a, jlong __result) {
    *((struct nk_color*)(intptr_t)__result) = nk_rgba_f(r, g, b, a);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1f(JNIEnv *__env, jclass clazz, jfloat r, jfloat g, jfloat b, jfloat a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1f(r, g, b, a, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1fv__JJ(jlong rgbaAddress, jlong __result) {
    float const *rgba = (float const *)(intptr_t)rgbaAddress;
    *((struct nk_color*)(intptr_t)__result) = nk_rgba_fv(rgba);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1fv__JJ(JNIEnv *__env, jclass clazz, jlong rgbaAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1fv__JJ(rgbaAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1cf(jlong cAddress, jlong __result) {
    struct nk_colorf *c = (struct nk_colorf *)(intptr_t)cAddress;
    *((struct nk_color*)(intptr_t)__result) = nk_rgba_cf(*c);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1cf(JNIEnv *__env, jclass clazz, jlong cAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1cf(cAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1hex(jlong rgbaAddress, jlong __result) {
    char const *rgba = (char const *)(intptr_t)rgbaAddress;
    *((struct nk_color*)(intptr_t)__result) = nk_rgba_hex(rgba);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1hex(JNIEnv *__env, jclass clazz, jlong rgbaAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1hex(rgbaAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1colorf(jfloat h, jfloat s, jfloat v, jfloat a, jlong __result) {
    *((struct nk_colorf*)(intptr_t)__result) = nk_hsva_colorf(h, s, v, a);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1colorf(JNIEnv *__env, jclass clazz, jfloat h, jfloat s, jfloat v, jfloat a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1colorf(h, s, v, a, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1colorfv__JJ(jlong cAddress, jlong __result) {
    float *c = (float *)(intptr_t)cAddress;
    *((struct nk_colorf*)(intptr_t)__result) = nk_hsva_colorfv(c);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1colorfv__JJ(JNIEnv *__env, jclass clazz, jlong cAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1colorfv__JJ(cAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1colorf_1hsva_1f__JJJJJ(jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong out_aAddress, jlong inAddress) {
    float *out_h = (float *)(intptr_t)out_hAddress;
    float *out_s = (float *)(intptr_t)out_sAddress;
    float *out_v = (float *)(intptr_t)out_vAddress;
    float *out_a = (float *)(intptr_t)out_aAddress;
    struct nk_colorf *in = (struct nk_colorf *)(intptr_t)inAddress;
    nk_colorf_hsva_f(out_h, out_s, out_v, out_a, *in);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1colorf_1hsva_1f__JJJJJ(JNIEnv *__env, jclass clazz, jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong out_aAddress, jlong inAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1colorf_1hsva_1f__JJJJJ(out_hAddress, out_sAddress, out_vAddress, out_aAddress, inAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1colorf_1hsva_1fv__JJ(jlong hsvaAddress, jlong inAddress) {
    float *hsva = (float *)(intptr_t)hsvaAddress;
    struct nk_colorf *in = (struct nk_colorf *)(intptr_t)inAddress;
    nk_colorf_hsva_fv(hsva, *in);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1colorf_1hsva_1fv__JJ(JNIEnv *__env, jclass clazz, jlong hsvaAddress, jlong inAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1colorf_1hsva_1fv__JJ(hsvaAddress, inAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsv(jint h, jint s, jint v, jlong __result) {
    *((struct nk_color*)(intptr_t)__result) = nk_hsv(h, s, v);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv(JNIEnv *__env, jclass clazz, jint h, jint s, jint v, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsv(h, s, v, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1iv__JJ(jlong hsvAddress, jlong __result) {
    int const *hsv = (int const *)(intptr_t)hsvAddress;
    *((struct nk_color*)(intptr_t)__result) = nk_hsv_iv(hsv);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1iv__JJ(JNIEnv *__env, jclass clazz, jlong hsvAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1iv__JJ(hsvAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1bv(jlong hsvAddress, jlong __result) {
    nk_byte const *hsv = (nk_byte const *)(intptr_t)hsvAddress;
    *((struct nk_color*)(intptr_t)__result) = nk_hsv_bv(hsv);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1bv(JNIEnv *__env, jclass clazz, jlong hsvAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1bv(hsvAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1f(jfloat h, jfloat s, jfloat v, jlong __result) {
    *((struct nk_color*)(intptr_t)__result) = nk_hsv_f(h, s, v);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1f(JNIEnv *__env, jclass clazz, jfloat h, jfloat s, jfloat v, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1f(h, s, v, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1fv__JJ(jlong hsvAddress, jlong __result) {
    float const *hsv = (float const *)(intptr_t)hsvAddress;
    *((struct nk_color*)(intptr_t)__result) = nk_hsv_fv(hsv);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1fv__JJ(JNIEnv *__env, jclass clazz, jlong hsvAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1fv__JJ(hsvAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva(jint h, jint s, jint v, jint a, jlong __result) {
    *((struct nk_color*)(intptr_t)__result) = nk_hsva(h, s, v, a);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva(JNIEnv *__env, jclass clazz, jint h, jint s, jint v, jint a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva(h, s, v, a, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1iv__JJ(jlong hsvaAddress, jlong __result) {
    int const *hsva = (int const *)(intptr_t)hsvaAddress;
    *((struct nk_color*)(intptr_t)__result) = nk_hsva_iv(hsva);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1iv__JJ(JNIEnv *__env, jclass clazz, jlong hsvaAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1iv__JJ(hsvaAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1bv(jlong hsvaAddress, jlong __result) {
    nk_byte const *hsva = (nk_byte const *)(intptr_t)hsvaAddress;
    *((struct nk_color*)(intptr_t)__result) = nk_hsva_bv(hsva);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1bv(JNIEnv *__env, jclass clazz, jlong hsvaAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1bv(hsvaAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1f(jfloat h, jfloat s, jfloat v, jfloat a, jlong __result) {
    *((struct nk_color*)(intptr_t)__result) = nk_hsva_f(h, s, v, a);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1f(JNIEnv *__env, jclass clazz, jfloat h, jfloat s, jfloat v, jfloat a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1f(h, s, v, a, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1fv__JJ(jlong hsvaAddress, jlong __result) {
    float const *hsva = (float const *)(intptr_t)hsvaAddress;
    *((struct nk_color*)(intptr_t)__result) = nk_hsva_fv(hsva);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1fv__JJ(JNIEnv *__env, jclass clazz, jlong hsvaAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1fv__JJ(hsvaAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1f__JJJJJ(jlong rAddress, jlong gAddress, jlong bAddress, jlong aAddress, jlong colorAddress) {
    float *r = (float *)(intptr_t)rAddress;
    float *g = (float *)(intptr_t)gAddress;
    float *b = (float *)(intptr_t)bAddress;
    float *a = (float *)(intptr_t)aAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_color_f(r, g, b, a, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1f__JJJJJ(JNIEnv *__env, jclass clazz, jlong rAddress, jlong gAddress, jlong bAddress, jlong aAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1f__JJJJJ(rAddress, gAddress, bAddress, aAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1fv__JJ(jlong rgba_outAddress, jlong colorAddress) {
    float *rgba_out = (float *)(intptr_t)rgba_outAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_color_fv(rgba_out, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1fv__JJ(JNIEnv *__env, jclass clazz, jlong rgba_outAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1fv__JJ(rgba_outAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1cf(jlong colorAddress, jlong __result) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    *((struct nk_colorf*)(intptr_t)__result) = nk_color_cf(*color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1cf(JNIEnv *__env, jclass clazz, jlong colorAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1cf(colorAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1d__JJJJJ(jlong rAddress, jlong gAddress, jlong bAddress, jlong aAddress, jlong colorAddress) {
    double *r = (double *)(intptr_t)rAddress;
    double *g = (double *)(intptr_t)gAddress;
    double *b = (double *)(intptr_t)bAddress;
    double *a = (double *)(intptr_t)aAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_color_d(r, g, b, a, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1d__JJJJJ(JNIEnv *__env, jclass clazz, jlong rAddress, jlong gAddress, jlong bAddress, jlong aAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1d__JJJJJ(rAddress, gAddress, bAddress, aAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1dv__JJ(jlong rgba_outAddress, jlong colorAddress) {
    double *rgba_out = (double *)(intptr_t)rgba_outAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_color_dv(rgba_out, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1dv__JJ(JNIEnv *__env, jclass clazz, jlong rgba_outAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1dv__JJ(rgba_outAddress, colorAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1u32(jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    return (jint)nk_color_u32(*color);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1u32(JNIEnv *__env, jclass clazz, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1u32(colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hex_1rgba(jlong outputAddress, jlong colorAddress) {
    char *output = (char *)(intptr_t)outputAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_color_hex_rgba(output, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hex_1rgba(JNIEnv *__env, jclass clazz, jlong outputAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hex_1rgba(outputAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hex_1rgb(jlong outputAddress, jlong colorAddress) {
    char *output = (char *)(intptr_t)outputAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_color_hex_rgb(output, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hex_1rgb(JNIEnv *__env, jclass clazz, jlong outputAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hex_1rgb(outputAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1i__JJJJ(jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong colorAddress) {
    int *out_h = (int *)(intptr_t)out_hAddress;
    int *out_s = (int *)(intptr_t)out_sAddress;
    int *out_v = (int *)(intptr_t)out_vAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_color_hsv_i(out_h, out_s, out_v, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1i__JJJJ(JNIEnv *__env, jclass clazz, jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1i__JJJJ(out_hAddress, out_sAddress, out_vAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1b(jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong colorAddress) {
    nk_byte *out_h = (nk_byte *)(intptr_t)out_hAddress;
    nk_byte *out_s = (nk_byte *)(intptr_t)out_sAddress;
    nk_byte *out_v = (nk_byte *)(intptr_t)out_vAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_color_hsv_b(out_h, out_s, out_v, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1b(JNIEnv *__env, jclass clazz, jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1b(out_hAddress, out_sAddress, out_vAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1iv__JJ(jlong hsv_outAddress, jlong colorAddress) {
    int *hsv_out = (int *)(intptr_t)hsv_outAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_color_hsv_iv(hsv_out, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1iv__JJ(JNIEnv *__env, jclass clazz, jlong hsv_outAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1iv__JJ(hsv_outAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1bv(jlong hsv_outAddress, jlong colorAddress) {
    nk_byte *hsv_out = (nk_byte *)(intptr_t)hsv_outAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_color_hsv_bv(hsv_out, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1bv(JNIEnv *__env, jclass clazz, jlong hsv_outAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1bv(hsv_outAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1f__JJJJ(jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong colorAddress) {
    float *out_h = (float *)(intptr_t)out_hAddress;
    float *out_s = (float *)(intptr_t)out_sAddress;
    float *out_v = (float *)(intptr_t)out_vAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_color_hsv_f(out_h, out_s, out_v, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1f__JJJJ(JNIEnv *__env, jclass clazz, jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1f__JJJJ(out_hAddress, out_sAddress, out_vAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1fv__JJ(jlong hsv_outAddress, jlong colorAddress) {
    float *hsv_out = (float *)(intptr_t)hsv_outAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_color_hsv_fv(hsv_out, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1fv__JJ(JNIEnv *__env, jclass clazz, jlong hsv_outAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1fv__JJ(hsv_outAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1i__JJJJJ(jlong hAddress, jlong sAddress, jlong vAddress, jlong aAddress, jlong colorAddress) {
    int *h = (int *)(intptr_t)hAddress;
    int *s = (int *)(intptr_t)sAddress;
    int *v = (int *)(intptr_t)vAddress;
    int *a = (int *)(intptr_t)aAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_color_hsva_i(h, s, v, a, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1i__JJJJJ(JNIEnv *__env, jclass clazz, jlong hAddress, jlong sAddress, jlong vAddress, jlong aAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1i__JJJJJ(hAddress, sAddress, vAddress, aAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1b(jlong hAddress, jlong sAddress, jlong vAddress, jlong aAddress, jlong colorAddress) {
    nk_byte *h = (nk_byte *)(intptr_t)hAddress;
    nk_byte *s = (nk_byte *)(intptr_t)sAddress;
    nk_byte *v = (nk_byte *)(intptr_t)vAddress;
    nk_byte *a = (nk_byte *)(intptr_t)aAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_color_hsva_b(h, s, v, a, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1b(JNIEnv *__env, jclass clazz, jlong hAddress, jlong sAddress, jlong vAddress, jlong aAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1b(hAddress, sAddress, vAddress, aAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1iv__JJ(jlong hsva_outAddress, jlong colorAddress) {
    int *hsva_out = (int *)(intptr_t)hsva_outAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_color_hsva_iv(hsva_out, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1iv__JJ(JNIEnv *__env, jclass clazz, jlong hsva_outAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1iv__JJ(hsva_outAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1bv(jlong hsva_outAddress, jlong colorAddress) {
    nk_byte *hsva_out = (nk_byte *)(intptr_t)hsva_outAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_color_hsva_bv(hsva_out, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1bv(JNIEnv *__env, jclass clazz, jlong hsva_outAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1bv(hsva_outAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1f__JJJJJ(jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong out_aAddress, jlong colorAddress) {
    float *out_h = (float *)(intptr_t)out_hAddress;
    float *out_s = (float *)(intptr_t)out_sAddress;
    float *out_v = (float *)(intptr_t)out_vAddress;
    float *out_a = (float *)(intptr_t)out_aAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_color_hsva_f(out_h, out_s, out_v, out_a, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1f__JJJJJ(JNIEnv *__env, jclass clazz, jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong out_aAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1f__JJJJJ(out_hAddress, out_sAddress, out_vAddress, out_aAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1fv__JJ(jlong hsva_outAddress, jlong colorAddress) {
    float *hsva_out = (float *)(intptr_t)hsva_outAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_color_hsva_fv(hsva_out, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1fv__JJ(JNIEnv *__env, jclass clazz, jlong hsva_outAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1fv__JJ(hsva_outAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1handle_1ptr(jlong ptrAddress, jlong __result) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    *((nk_handle*)(intptr_t)__result) = nk_handle_ptr(ptr);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1handle_1ptr(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1handle_1ptr(ptrAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1handle_1id(jint id, jlong __result) {
    *((nk_handle*)(intptr_t)__result) = nk_handle_id(id);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1handle_1id(JNIEnv *__env, jclass clazz, jint id, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1handle_1id(id, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1image_1handle(jlong handleAddress, jlong __result) {
    nk_handle *handle = (nk_handle *)(intptr_t)handleAddress;
    *((struct nk_image*)(intptr_t)__result) = nk_image_handle(*handle);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1image_1handle(JNIEnv *__env, jclass clazz, jlong handleAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1image_1handle(handleAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1image_1ptr(jlong ptrAddress, jlong __result) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    *((struct nk_image*)(intptr_t)__result) = nk_image_ptr(ptr);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1image_1ptr(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1image_1ptr(ptrAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1image_1id(jint id, jlong __result) {
    *((struct nk_image*)(intptr_t)__result) = nk_image_id(id);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1image_1id(JNIEnv *__env, jclass clazz, jint id, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1image_1id(id, __result);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1image_1is_1subimage(jlong imgAddress) {
    struct nk_image const *img = (struct nk_image const *)(intptr_t)imgAddress;
    return (jint)nk_image_is_subimage(img);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1image_1is_1subimage(JNIEnv *__env, jclass clazz, jlong imgAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1image_1is_1subimage(imgAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1subimage_1ptr(jlong ptrAddress, jshort w, jshort h, jlong sub_regionAddress, jlong __result) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    struct nk_rect *sub_region = (struct nk_rect *)(intptr_t)sub_regionAddress;
    *((struct nk_image*)(intptr_t)__result) = nk_subimage_ptr(ptr, (unsigned short)w, (unsigned short)h, *sub_region);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1subimage_1ptr(JNIEnv *__env, jclass clazz, jlong ptrAddress, jshort w, jshort h, jlong sub_regionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1subimage_1ptr(ptrAddress, w, h, sub_regionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1subimage_1id(jint id, jshort w, jshort h, jlong sub_regionAddress, jlong __result) {
    struct nk_rect *sub_region = (struct nk_rect *)(intptr_t)sub_regionAddress;
    *((struct nk_image*)(intptr_t)__result) = nk_subimage_id(id, (unsigned short)w, (unsigned short)h, *sub_region);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1subimage_1id(JNIEnv *__env, jclass clazz, jint id, jshort w, jshort h, jlong sub_regionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1subimage_1id(id, w, h, sub_regionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1subimage_1handle(jlong handleAddress, jshort w, jshort h, jlong sub_regionAddress, jlong __result) {
    nk_handle *handle = (nk_handle *)(intptr_t)handleAddress;
    struct nk_rect *sub_region = (struct nk_rect *)(intptr_t)sub_regionAddress;
    *((struct nk_image*)(intptr_t)__result) = nk_subimage_handle(*handle, (unsigned short)w, (unsigned short)h, *sub_region);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1subimage_1handle(JNIEnv *__env, jclass clazz, jlong handleAddress, jshort w, jshort h, jlong sub_regionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1subimage_1handle(handleAddress, w, h, sub_regionAddress, __result);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1murmur_1hash(jlong keyAddress, jint len, jint seed) {
    void const *key = (void const *)(intptr_t)keyAddress;
    return (jint)nk_murmur_hash(key, len, (nk_hash)seed);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1murmur_1hash(JNIEnv *__env, jclass clazz, jlong keyAddress, jint len, jint seed) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1murmur_1hash(keyAddress, len, seed);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1triangle_1from_1direction(jlong resultAddress, jlong rAddress, jfloat pad_x, jfloat pad_y, jint direction) {
    struct nk_vec2 *result = (struct nk_vec2 *)(intptr_t)resultAddress;
    struct nk_rect *r = (struct nk_rect *)(intptr_t)rAddress;
    nk_triangle_from_direction(result, *r, pad_x, pad_y, (enum nk_heading)direction);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1triangle_1from_1direction(JNIEnv *__env, jclass clazz, jlong resultAddress, jlong rAddress, jfloat pad_x, jfloat pad_y, jint direction) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1triangle_1from_1direction(resultAddress, rAddress, pad_x, pad_y, direction);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1vec2(jfloat x, jfloat y, jlong __result) {
    *((struct nk_vec2*)(intptr_t)__result) = nk_vec2(x, y);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1vec2(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1vec2(x, y, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1vec2i(jint x, jint y, jlong __result) {
    *((struct nk_vec2*)(intptr_t)__result) = nk_vec2i(x, y);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1vec2i(JNIEnv *__env, jclass clazz, jint x, jint y, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1vec2i(x, y, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1vec2v__JJ(jlong xyAddress, jlong __result) {
    float const *xy = (float const *)(intptr_t)xyAddress;
    *((struct nk_vec2*)(intptr_t)__result) = nk_vec2v(xy);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1vec2v__JJ(JNIEnv *__env, jclass clazz, jlong xyAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1vec2v__JJ(xyAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1vec2iv__JJ(jlong xyAddress, jlong __result) {
    int const *xy = (int const *)(intptr_t)xyAddress;
    *((struct nk_vec2*)(intptr_t)__result) = nk_vec2iv(xy);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1vec2iv__JJ(JNIEnv *__env, jclass clazz, jlong xyAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1vec2iv__JJ(xyAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1get_1null_1rect(jlong __result) {
    *((struct nk_rect*)(intptr_t)__result) = nk_get_null_rect();
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1get_1null_1rect(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1get_1null_1rect(__result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rect(jfloat x, jfloat y, jfloat w, jfloat h, jlong __result) {
    *((struct nk_rect*)(intptr_t)__result) = nk_rect(x, y, w, h);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rect(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat w, jfloat h, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rect(x, y, w, h, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1recti(jint x, jint y, jint w, jint h, jlong __result) {
    *((struct nk_rect*)(intptr_t)__result) = nk_recti(x, y, w, h);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1recti(JNIEnv *__env, jclass clazz, jint x, jint y, jint w, jint h, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1recti(x, y, w, h, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1recta(jlong posAddress, jlong sizeAddress, jlong __result) {
    struct nk_vec2 *pos = (struct nk_vec2 *)(intptr_t)posAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    *((struct nk_rect*)(intptr_t)__result) = nk_recta(*pos, *size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1recta(JNIEnv *__env, jclass clazz, jlong posAddress, jlong sizeAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1recta(posAddress, sizeAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rectv__JJ(jlong xywhAddress, jlong __result) {
    float const *xywh = (float const *)(intptr_t)xywhAddress;
    *((struct nk_rect*)(intptr_t)__result) = nk_rectv(xywh);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rectv__JJ(JNIEnv *__env, jclass clazz, jlong xywhAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rectv__JJ(xywhAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rectiv__JJ(jlong xywhAddress, jlong __result) {
    int const *xywh = (int const *)(intptr_t)xywhAddress;
    *((struct nk_rect*)(intptr_t)__result) = nk_rectiv(xywh);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rectiv__JJ(JNIEnv *__env, jclass clazz, jlong xywhAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rectiv__JJ(xywhAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rect_1pos(jlong rAddress, jlong __result) {
    struct nk_rect *r = (struct nk_rect *)(intptr_t)rAddress;
    *((struct nk_vec2*)(intptr_t)__result) = nk_rect_pos(*r);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rect_1pos(JNIEnv *__env, jclass clazz, jlong rAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rect_1pos(rAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rect_1size(jlong rAddress, jlong __result) {
    struct nk_rect *r = (struct nk_rect *)(intptr_t)rAddress;
    *((struct nk_vec2*)(intptr_t)__result) = nk_rect_size(*r);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rect_1size(JNIEnv *__env, jclass clazz, jlong rAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rect_1size(rAddress, __result);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strlen(jlong strAddress) {
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_strlen(str);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strlen(JNIEnv *__env, jclass clazz, jlong strAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strlen(strAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stricmp(jlong s1Address, jlong s2Address) {
    char const *s1 = (char const *)(intptr_t)s1Address;
    char const *s2 = (char const *)(intptr_t)s2Address;
    return (jint)nk_stricmp(s1, s2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stricmp(JNIEnv *__env, jclass clazz, jlong s1Address, jlong s2Address) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stricmp(s1Address, s2Address);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stricmpn(jlong s1Address, jlong s2Address, jint n) {
    char const *s1 = (char const *)(intptr_t)s1Address;
    char const *s2 = (char const *)(intptr_t)s2Address;
    return (jint)nk_stricmpn(s1, s2, n);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stricmpn(JNIEnv *__env, jclass clazz, jlong s1Address, jlong s2Address, jint n) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stricmpn(s1Address, s2Address, n);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strtoi(jlong strAddress, jlong endptrAddress) {
    char const *str = (char const *)(intptr_t)strAddress;
    char const **endptr = (char const **)(intptr_t)endptrAddress;
    return (jint)nk_strtoi(str, endptr);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strtoi(JNIEnv *__env, jclass clazz, jlong strAddress, jlong endptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strtoi(strAddress, endptrAddress);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strtof(jlong strAddress, jlong endptrAddress) {
    char const *str = (char const *)(intptr_t)strAddress;
    char const **endptr = (char const **)(intptr_t)endptrAddress;
    return (jfloat)nk_strtof(str, endptr);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strtof(JNIEnv *__env, jclass clazz, jlong strAddress, jlong endptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strtof(strAddress, endptrAddress);
}

JNIEXPORT jdouble JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strtod(jlong strAddress, jlong endptrAddress) {
    char const *str = (char const *)(intptr_t)strAddress;
    char const **endptr = (char const **)(intptr_t)endptrAddress;
    return (jdouble)nk_strtod(str, endptr);
}
JNIEXPORT jdouble JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strtod(JNIEnv *__env, jclass clazz, jlong strAddress, jlong endptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strtod(strAddress, endptrAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strfilter(jlong strAddress, jlong regexpAddress) {
    char const *str = (char const *)(intptr_t)strAddress;
    char const *regexp = (char const *)(intptr_t)regexpAddress;
    return (jint)nk_strfilter(str, regexp);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strfilter(JNIEnv *__env, jclass clazz, jlong strAddress, jlong regexpAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strfilter(strAddress, regexpAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1string__JJJ(jlong strAddress, jlong patternAddress, jlong out_scoreAddress) {
    char const *str = (char const *)(intptr_t)strAddress;
    char const *pattern = (char const *)(intptr_t)patternAddress;
    int *out_score = (int *)(intptr_t)out_scoreAddress;
    return (jint)nk_strmatch_fuzzy_string(str, pattern, out_score);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1string__JJJ(JNIEnv *__env, jclass clazz, jlong strAddress, jlong patternAddress, jlong out_scoreAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1string__JJJ(strAddress, patternAddress, out_scoreAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1text__JIJJ(jlong txtAddress, jint txt_len, jlong patternAddress, jlong out_scoreAddress) {
    char const *txt = (char const *)(intptr_t)txtAddress;
    char const *pattern = (char const *)(intptr_t)patternAddress;
    int *out_score = (int *)(intptr_t)out_scoreAddress;
    return (jint)nk_strmatch_fuzzy_text(txt, txt_len, pattern, out_score);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1text__JIJJ(JNIEnv *__env, jclass clazz, jlong txtAddress, jint txt_len, jlong patternAddress, jlong out_scoreAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1text__JIJJ(txtAddress, txt_len, patternAddress, out_scoreAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1utf_1decode__JJI(jlong cAddress, jlong uAddress, jint clen) {
    char const *c = (char const *)(intptr_t)cAddress;
    nk_rune *u = (nk_rune *)(intptr_t)uAddress;
    return (jint)nk_utf_decode(c, u, clen);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1utf_1decode__JJI(JNIEnv *__env, jclass clazz, jlong cAddress, jlong uAddress, jint clen) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1utf_1decode__JJI(cAddress, uAddress, clen);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1utf_1encode(jint u, jlong cAddress, jint clen) {
    char *c = (char *)(intptr_t)cAddress;
    return (jint)nk_utf_encode((nk_rune)u, c, clen);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1utf_1encode(JNIEnv *__env, jclass clazz, jint u, jlong cAddress, jint clen) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1utf_1encode(u, cAddress, clen);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1utf_1len(jlong strAddress, jint byte_len) {
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_utf_len(str, byte_len);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1utf_1len(JNIEnv *__env, jclass clazz, jlong strAddress, jint byte_len) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1utf_1len(strAddress, byte_len);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1utf_1at__JIIJJ(jlong bufferAddress, jint length, jint index, jlong unicodeAddress, jlong lenAddress) {
    char const *buffer = (char const *)(intptr_t)bufferAddress;
    nk_rune *unicode = (nk_rune *)(intptr_t)unicodeAddress;
    int *len = (int *)(intptr_t)lenAddress;
    return (jlong)(intptr_t)nk_utf_at(buffer, length, index, unicode, len);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1utf_1at__JIIJJ(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint length, jint index, jlong unicodeAddress, jlong lenAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1utf_1at__JIIJJ(bufferAddress, length, index, unicodeAddress, lenAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1init(jlong bufferAddress, jlong allocatorAddress, jlong size) {
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    struct nk_allocator const *allocator = (struct nk_allocator const *)(intptr_t)allocatorAddress;
    nk_buffer_init(buffer, allocator, (nk_size)size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1init(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong allocatorAddress, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1init(bufferAddress, allocatorAddress, size);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1init_1fixed(jlong bufferAddress, jlong memoryAddress, jlong size) {
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    void *memory = (void *)(intptr_t)memoryAddress;
    nk_buffer_init_fixed(buffer, memory, (nk_size)size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1init_1fixed(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong memoryAddress, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1init_1fixed(bufferAddress, memoryAddress, size);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1info(jlong statusAddress, jlong bufferAddress) {
    struct nk_memory_status *status = (struct nk_memory_status *)(intptr_t)statusAddress;
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    nk_buffer_info(status, buffer);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1info(JNIEnv *__env, jclass clazz, jlong statusAddress, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1info(statusAddress, bufferAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1push(jlong bufferAddress, jint type, jlong memoryAddress, jlong size, jlong align) {
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    void const *memory = (void const *)(intptr_t)memoryAddress;
    nk_buffer_push(buffer, (enum nk_buffer_allocation_type)type, memory, (nk_size)size, (nk_size)align);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1push(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint type, jlong memoryAddress, jlong size, jlong align) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1push(bufferAddress, type, memoryAddress, size, align);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1mark(jlong bufferAddress, jint type) {
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    nk_buffer_mark(buffer, (enum nk_buffer_allocation_type)type);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1mark(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint type) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1mark(bufferAddress, type);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1reset(jlong bufferAddress, jint type) {
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    nk_buffer_reset(buffer, (enum nk_buffer_allocation_type)type);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1reset(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint type) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1reset(bufferAddress, type);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1clear(jlong bufferAddress) {
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    nk_buffer_clear(buffer);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1clear(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1clear(bufferAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1free(jlong bufferAddress) {
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    nk_buffer_free(buffer);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1free(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1free(bufferAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1memory(jlong bufferAddress) {
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    return (jlong)(intptr_t)nk_buffer_memory(buffer);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1memory(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1memory(bufferAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1memory_1const(jlong bufferAddress) {
    struct nk_buffer const *buffer = (struct nk_buffer const *)(intptr_t)bufferAddress;
    return (jlong)(intptr_t)nk_buffer_memory_const(buffer);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1memory_1const(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1memory_1const(bufferAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1total(jlong bufferAddress) {
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    return (jlong)nk_buffer_total(buffer);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1total(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1total(bufferAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1init(jlong strAddress, jlong allocatorAddress, jlong size) {
    struct nk_str *str = (struct nk_str *)(intptr_t)strAddress;
    struct nk_allocator const *allocator = (struct nk_allocator const *)(intptr_t)allocatorAddress;
    nk_str_init(str, allocator, (nk_size)size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1init(JNIEnv *__env, jclass clazz, jlong strAddress, jlong allocatorAddress, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1init(strAddress, allocatorAddress, size);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1init_1fixed(jlong strAddress, jlong memoryAddress, jlong size) {
    struct nk_str *str = (struct nk_str *)(intptr_t)strAddress;
    void *memory = (void *)(intptr_t)memoryAddress;
    nk_str_init_fixed(str, memory, (nk_size)size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1init_1fixed(JNIEnv *__env, jclass clazz, jlong strAddress, jlong memoryAddress, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1init_1fixed(strAddress, memoryAddress, size);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1clear(jlong strAddress) {
    struct nk_str *str = (struct nk_str *)(intptr_t)strAddress;
    nk_str_clear(str);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1clear(JNIEnv *__env, jclass clazz, jlong strAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1clear(strAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1free(jlong strAddress) {
    struct nk_str *str = (struct nk_str *)(intptr_t)strAddress;
    nk_str_free(str);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1free(JNIEnv *__env, jclass clazz, jlong strAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1free(strAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1char(jlong sAddress, jlong strAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_str_append_text_char(s, str, len);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1char(JNIEnv *__env, jclass clazz, jlong sAddress, jlong strAddress, jint len) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1char(sAddress, strAddress, len);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1char(jlong sAddress, jlong strAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_str_append_str_char(s, str);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1char(JNIEnv *__env, jclass clazz, jlong sAddress, jlong strAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1char(sAddress, strAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1utf8(jlong sAddress, jlong strAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_str_append_text_utf8(s, str, len);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1utf8(JNIEnv *__env, jclass clazz, jlong sAddress, jlong strAddress, jint len) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1utf8(sAddress, strAddress, len);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1utf8(jlong sAddress, jlong strAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_str_append_str_utf8(s, str);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1utf8(JNIEnv *__env, jclass clazz, jlong sAddress, jlong strAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1utf8(sAddress, strAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1runes__JJI(jlong sAddress, jlong runesAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    nk_rune const *runes = (nk_rune const *)(intptr_t)runesAddress;
    return (jint)nk_str_append_text_runes(s, runes, len);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1runes__JJI(JNIEnv *__env, jclass clazz, jlong sAddress, jlong runesAddress, jint len) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1runes__JJI(sAddress, runesAddress, len);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1runes__JJ(jlong sAddress, jlong runesAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    nk_rune const *runes = (nk_rune const *)(intptr_t)runesAddress;
    return (jint)nk_str_append_str_runes(s, runes);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1runes__JJ(JNIEnv *__env, jclass clazz, jlong sAddress, jlong runesAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1runes__JJ(sAddress, runesAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1at_1char(jlong sAddress, jint pos, jlong strAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_str_insert_at_char(s, pos, str, len);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1at_1char(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong strAddress, jint len) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1at_1char(sAddress, pos, strAddress, len);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1at_1rune(jlong sAddress, jint pos, jlong strAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_str_insert_at_rune(s, pos, str, len);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1at_1rune(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong strAddress, jint len) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1at_1rune(sAddress, pos, strAddress, len);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1char(jlong sAddress, jint pos, jlong strAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_str_insert_text_char(s, pos, str, len);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1char(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong strAddress, jint len) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1char(sAddress, pos, strAddress, len);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1char(jlong sAddress, jint pos, jlong strAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_str_insert_str_char(s, pos, str);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1char(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong strAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1char(sAddress, pos, strAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1utf8(jlong sAddress, jint pos, jlong strAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_str_insert_text_utf8(s, pos, str, len);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1utf8(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong strAddress, jint len) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1utf8(sAddress, pos, strAddress, len);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1utf8(jlong sAddress, jint pos, jlong strAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    char const *str = (char const *)(intptr_t)strAddress;
    return (jint)nk_str_insert_str_utf8(s, pos, str);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1utf8(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong strAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1utf8(sAddress, pos, strAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1runes__JIJI(jlong sAddress, jint pos, jlong runesAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    nk_rune const *runes = (nk_rune const *)(intptr_t)runesAddress;
    return (jint)nk_str_insert_text_runes(s, pos, runes, len);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1runes__JIJI(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong runesAddress, jint len) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1runes__JIJI(sAddress, pos, runesAddress, len);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1runes__JIJ(jlong sAddress, jint pos, jlong runesAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    nk_rune const *runes = (nk_rune const *)(intptr_t)runesAddress;
    return (jint)nk_str_insert_str_runes(s, pos, runes);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1runes__JIJ(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong runesAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1runes__JIJ(sAddress, pos, runesAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1remove_1chars(jlong sAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    nk_str_remove_chars(s, len);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1remove_1chars(JNIEnv *__env, jclass clazz, jlong sAddress, jint len) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1remove_1chars(sAddress, len);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1remove_1runes(jlong strAddress, jint len) {
    struct nk_str *str = (struct nk_str *)(intptr_t)strAddress;
    nk_str_remove_runes(str, len);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1remove_1runes(JNIEnv *__env, jclass clazz, jlong strAddress, jint len) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1remove_1runes(strAddress, len);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1delete_1chars(jlong sAddress, jint pos, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    nk_str_delete_chars(s, pos, len);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1delete_1chars(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jint len) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1delete_1chars(sAddress, pos, len);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1delete_1runes(jlong sAddress, jint pos, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    nk_str_delete_runes(s, pos, len);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1delete_1runes(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jint len) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1delete_1runes(sAddress, pos, len);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1char(jlong sAddress, jint pos) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    return (jlong)(intptr_t)nk_str_at_char(s, pos);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1char(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1char(sAddress, pos);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1rune__JIJJ(jlong sAddress, jint pos, jlong unicodeAddress, jlong lenAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    nk_rune *unicode = (nk_rune *)(intptr_t)unicodeAddress;
    int *len = (int *)(intptr_t)lenAddress;
    return (jlong)(intptr_t)nk_str_at_rune(s, pos, unicode, len);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1rune__JIJJ(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong unicodeAddress, jlong lenAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1rune__JIJJ(sAddress, pos, unicodeAddress, lenAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1rune_1at(jlong sAddress, jint pos) {
    struct nk_str const *s = (struct nk_str const *)(intptr_t)sAddress;
    return (jint)nk_str_rune_at(s, pos);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1rune_1at(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1rune_1at(sAddress, pos);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1char_1const(jlong sAddress, jint pos) {
    struct nk_str const *s = (struct nk_str const *)(intptr_t)sAddress;
    return (jlong)(intptr_t)nk_str_at_char_const(s, pos);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1char_1const(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1char_1const(sAddress, pos);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1const__JIJJ(jlong sAddress, jint pos, jlong unicodeAddress, jlong lenAddress) {
    struct nk_str const *s = (struct nk_str const *)(intptr_t)sAddress;
    nk_rune *unicode = (nk_rune *)(intptr_t)unicodeAddress;
    int *len = (int *)(intptr_t)lenAddress;
    return (jlong)(intptr_t)nk_str_at_const(s, pos, unicode, len);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1const__JIJJ(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong unicodeAddress, jlong lenAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1const__JIJJ(sAddress, pos, unicodeAddress, lenAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1get(jlong sAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    return (jlong)(intptr_t)nk_str_get(s);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1get(JNIEnv *__env, jclass clazz, jlong sAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1get(sAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1get_1const(jlong sAddress) {
    struct nk_str const *s = (struct nk_str const *)(intptr_t)sAddress;
    return (jlong)(intptr_t)nk_str_get_const(s);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1get_1const(JNIEnv *__env, jclass clazz, jlong sAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1get_1const(sAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1len(jlong sAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    return (jint)nk_str_len(s);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1len(JNIEnv *__env, jclass clazz, jlong sAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1len(sAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1len_1char(jlong sAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    return (jint)nk_str_len_char(s);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1len_1char(JNIEnv *__env, jclass clazz, jlong sAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1len_1char(sAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1filter_1default(jlong editAddress, jint unicode) {
    struct nk_text_edit const *edit = (struct nk_text_edit const *)(intptr_t)editAddress;
    return (jint)nk_filter_default(edit, (nk_rune)unicode);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1default(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1filter_1default(editAddress, unicode);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1filter_1ascii(jlong editAddress, jint unicode) {
    struct nk_text_edit const *edit = (struct nk_text_edit const *)(intptr_t)editAddress;
    return (jint)nk_filter_ascii(edit, (nk_rune)unicode);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1ascii(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1filter_1ascii(editAddress, unicode);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1filter_1float(jlong editAddress, jint unicode) {
    struct nk_text_edit const *edit = (struct nk_text_edit const *)(intptr_t)editAddress;
    return (jint)nk_filter_float(edit, (nk_rune)unicode);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1float(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1filter_1float(editAddress, unicode);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1filter_1decimal(jlong editAddress, jint unicode) {
    struct nk_text_edit const *edit = (struct nk_text_edit const *)(intptr_t)editAddress;
    return (jint)nk_filter_decimal(edit, (nk_rune)unicode);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1decimal(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1filter_1decimal(editAddress, unicode);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1filter_1hex(jlong editAddress, jint unicode) {
    struct nk_text_edit const *edit = (struct nk_text_edit const *)(intptr_t)editAddress;
    return (jint)nk_filter_hex(edit, (nk_rune)unicode);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1hex(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1filter_1hex(editAddress, unicode);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1filter_1oct(jlong editAddress, jint unicode) {
    struct nk_text_edit const *edit = (struct nk_text_edit const *)(intptr_t)editAddress;
    return (jint)nk_filter_oct(edit, (nk_rune)unicode);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1oct(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1filter_1oct(editAddress, unicode);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1filter_1binary(jlong editAddress, jint unicode) {
    struct nk_text_edit const *edit = (struct nk_text_edit const *)(intptr_t)editAddress;
    return (jint)nk_filter_binary(edit, (nk_rune)unicode);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1binary(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1filter_1binary(editAddress, unicode);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1init(jlong boxAddress, jlong allocatorAddress, jlong size) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    struct nk_allocator *allocator = (struct nk_allocator *)(intptr_t)allocatorAddress;
    nk_textedit_init(box, allocator, (nk_size)size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1init(JNIEnv *__env, jclass clazz, jlong boxAddress, jlong allocatorAddress, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1init(boxAddress, allocatorAddress, size);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1init_1fixed(jlong boxAddress, jlong memoryAddress, jlong size) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    void *memory = (void *)(intptr_t)memoryAddress;
    nk_textedit_init_fixed(box, memory, (nk_size)size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1init_1fixed(JNIEnv *__env, jclass clazz, jlong boxAddress, jlong memoryAddress, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1init_1fixed(boxAddress, memoryAddress, size);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1free(jlong boxAddress) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    nk_textedit_free(box);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1free(JNIEnv *__env, jclass clazz, jlong boxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1free(boxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1text(jlong boxAddress, jlong textAddress, jint total_len) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    nk_textedit_text(box, text, total_len);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1text(JNIEnv *__env, jclass clazz, jlong boxAddress, jlong textAddress, jint total_len) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1text(boxAddress, textAddress, total_len);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1delete(jlong boxAddress, jint where, jint len) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    nk_textedit_delete(box, where, len);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1delete(JNIEnv *__env, jclass clazz, jlong boxAddress, jint where, jint len) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1delete(boxAddress, where, len);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1delete_1selection(jlong boxAddress) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    nk_textedit_delete_selection(box);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1delete_1selection(JNIEnv *__env, jclass clazz, jlong boxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1delete_1selection(boxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1select_1all(jlong boxAddress) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    nk_textedit_select_all(box);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1select_1all(JNIEnv *__env, jclass clazz, jlong boxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1select_1all(boxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1cut(jlong boxAddress) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    return (jint)nk_textedit_cut(box);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1cut(JNIEnv *__env, jclass clazz, jlong boxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1cut(boxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1paste(jlong boxAddress, jlong ctextAddress, jint len) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    char const *ctext = (char const *)(intptr_t)ctextAddress;
    return (jint)nk_textedit_paste(box, ctext, len);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1paste(JNIEnv *__env, jclass clazz, jlong boxAddress, jlong ctextAddress, jint len) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1paste(boxAddress, ctextAddress, len);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1undo(jlong boxAddress) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    nk_textedit_undo(box);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1undo(JNIEnv *__env, jclass clazz, jlong boxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1undo(boxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1redo(jlong boxAddress) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    nk_textedit_redo(box);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1redo(JNIEnv *__env, jclass clazz, jlong boxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1redo(boxAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1stroke_1line)(jlong bAddress, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_stroke_line(b, x0, y0, x1, y1, line_thickness, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1line(JNIEnv *__env, jclass clazz, jlong bAddress, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jfloat line_thickness, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1stroke_1line)(bAddress, x0, y0, x1, y1, line_thickness, colorAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1stroke_1curve)(jlong bAddress, jfloat ax, jfloat ay, jfloat ctrl0x, jfloat ctrl0y, jfloat ctrl1x, jfloat ctrl1y, jfloat bx, jfloat by, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_stroke_curve(b, ax, ay, ctrl0x, ctrl0y, ctrl1x, ctrl1y, bx, by, line_thickness, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1curve(JNIEnv *__env, jclass clazz, jlong bAddress, jfloat ax, jfloat ay, jfloat ctrl0x, jfloat ctrl0y, jfloat ctrl1x, jfloat ctrl1y, jfloat bx, jfloat by, jfloat line_thickness, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1stroke_1curve)(bAddress, ax, ay, ctrl0x, ctrl0y, ctrl1x, ctrl1y, bx, by, line_thickness, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1rect(jlong bAddress, jlong rectAddress, jfloat rounding, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_stroke_rect(b, *rect, rounding, line_thickness, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1rect(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jfloat rounding, jfloat line_thickness, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1rect(bAddress, rectAddress, rounding, line_thickness, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1circle(jlong bAddress, jlong rectAddress, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_stroke_circle(b, *rect, line_thickness, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1circle(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jfloat line_thickness, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1circle(bAddress, rectAddress, line_thickness, colorAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1stroke_1arc)(jlong bAddress, jfloat cx, jfloat cy, jfloat radius, jfloat a_min, jfloat a_max, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_stroke_arc(b, cx, cy, radius, a_min, a_max, line_thickness, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1arc(JNIEnv *__env, jclass clazz, jlong bAddress, jfloat cx, jfloat cy, jfloat radius, jfloat a_min, jfloat a_max, jfloat line_thickness, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1stroke_1arc)(bAddress, cx, cy, radius, a_min, a_max, line_thickness, colorAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1stroke_1triangle)(jlong bAddress, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jfloat x2, jfloat y2, jfloat line_thichness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_stroke_triangle(b, x0, y0, x1, y1, x2, y2, line_thichness, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1triangle(JNIEnv *__env, jclass clazz, jlong bAddress, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jfloat x2, jfloat y2, jfloat line_thichness, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1stroke_1triangle)(bAddress, x0, y0, x1, y1, x2, y2, line_thichness, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polyline__JJIFJ(jlong bAddress, jlong pointsAddress, jint point_count, jfloat line_thickness, jlong colAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    float *points = (float *)(intptr_t)pointsAddress;
    struct nk_color *col = (struct nk_color *)(intptr_t)colAddress;
    nk_stroke_polyline(b, points, point_count, line_thickness, *col);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polyline__JJIFJ(JNIEnv *__env, jclass clazz, jlong bAddress, jlong pointsAddress, jint point_count, jfloat line_thickness, jlong colAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polyline__JJIFJ(bAddress, pointsAddress, point_count, line_thickness, colAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polygon__JJIFJ(jlong bAddress, jlong pointsAddress, jint point_count, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    float *points = (float *)(intptr_t)pointsAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_stroke_polygon(b, points, point_count, line_thickness, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polygon__JJIFJ(JNIEnv *__env, jclass clazz, jlong bAddress, jlong pointsAddress, jint point_count, jfloat line_thickness, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polygon__JJIFJ(bAddress, pointsAddress, point_count, line_thickness, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1fill_1rect(jlong bAddress, jlong rectAddress, jfloat rounding, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_fill_rect(b, *rect, rounding, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1rect(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jfloat rounding, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1fill_1rect(bAddress, rectAddress, rounding, colorAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1fill_1rect_1multi_1color)(jlong bAddress, jlong rectAddress, jlong leftAddress, jlong topAddress, jlong rightAddress, jlong bottomAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_color *left = (struct nk_color *)(intptr_t)leftAddress;
    struct nk_color *top = (struct nk_color *)(intptr_t)topAddress;
    struct nk_color *right = (struct nk_color *)(intptr_t)rightAddress;
    struct nk_color *bottom = (struct nk_color *)(intptr_t)bottomAddress;
    nk_fill_rect_multi_color(b, *rect, *left, *top, *right, *bottom);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1rect_1multi_1color(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jlong leftAddress, jlong topAddress, jlong rightAddress, jlong bottomAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1fill_1rect_1multi_1color)(bAddress, rectAddress, leftAddress, topAddress, rightAddress, bottomAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1fill_1circle(jlong bAddress, jlong rectAddress, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_fill_circle(b, *rect, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1circle(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1fill_1circle(bAddress, rectAddress, colorAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1fill_1arc)(jlong bAddress, jfloat cx, jfloat cy, jfloat radius, jfloat a_min, jfloat a_max, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_fill_arc(b, cx, cy, radius, a_min, a_max, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1arc(JNIEnv *__env, jclass clazz, jlong bAddress, jfloat cx, jfloat cy, jfloat radius, jfloat a_min, jfloat a_max, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1fill_1arc)(bAddress, cx, cy, radius, a_min, a_max, colorAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1fill_1triangle)(jlong bAddress, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jfloat x2, jfloat y2, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_fill_triangle(b, x0, y0, x1, y1, x2, y2, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1triangle(JNIEnv *__env, jclass clazz, jlong bAddress, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jfloat x2, jfloat y2, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1fill_1triangle)(bAddress, x0, y0, x1, y1, x2, y2, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1fill_1polygon__JJIJ(jlong bAddress, jlong pointsAddress, jint point_count, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    float *points = (float *)(intptr_t)pointsAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_fill_polygon(b, points, point_count, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1polygon__JJIJ(JNIEnv *__env, jclass clazz, jlong bAddress, jlong pointsAddress, jint point_count, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1fill_1polygon__JJIJ(bAddress, pointsAddress, point_count, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1image(jlong bAddress, jlong rectAddress, jlong imgAddress, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_image const *img = (struct nk_image const *)(intptr_t)imgAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_draw_image(b, *rect, img, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1image(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jlong imgAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1image(bAddress, rectAddress, imgAddress, colorAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1draw_1text)(jlong bAddress, jlong rectAddress, jlong stringAddress, jint length, jlong fontAddress, jlong bgAddress, jlong fgAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    char const *string = (char const *)(intptr_t)stringAddress;
    struct nk_user_font const *font = (struct nk_user_font const *)(intptr_t)fontAddress;
    struct nk_color *bg = (struct nk_color *)(intptr_t)bgAddress;
    struct nk_color *fg = (struct nk_color *)(intptr_t)fgAddress;
    nk_draw_text(b, *rect, string, length, font, *bg, *fg);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1text(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jlong stringAddress, jint length, jlong fontAddress, jlong bgAddress, jlong fgAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1draw_1text)(bAddress, rectAddress, stringAddress, length, fontAddress, bgAddress, fgAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1push_1scissor(jlong bAddress, jlong rectAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    nk_push_scissor(b, *rect);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1push_1scissor(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1push_1scissor(bAddress, rectAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1push_1custom(jlong bAddress, jlong rectAddress, jlong callbackAddress, jlong usrAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    nk_command_custom_callback callback = (nk_command_custom_callback)(intptr_t)callbackAddress;
    nk_handle *usr = (nk_handle *)(intptr_t)usrAddress;
    nk_push_custom(b, *rect, callback, *usr);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1push_1custom(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jlong callbackAddress, jlong usrAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1push_1custom(bAddress, rectAddress, callbackAddress, usrAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1_1next(jlong ctxAddress, jlong cmdAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_command const *cmd = (struct nk_command const *)(intptr_t)cmdAddress;
    return (jlong)(intptr_t)nk__next(ctx, cmd);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1next(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong cmdAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1_1next(ctxAddress, cmdAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1_1begin(jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    return (jlong)(intptr_t)nk__begin(ctx);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1_1begin(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1has_1mouse_1click(jlong iAddress, jint id) {
    struct nk_input const *i = (struct nk_input const *)(intptr_t)iAddress;
    return (jint)nk_input_has_mouse_click(i, (enum nk_buttons)id);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1has_1mouse_1click(JNIEnv *__env, jclass clazz, jlong iAddress, jint id) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1has_1mouse_1click(iAddress, id);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1has_1mouse_1click_1in_1rect(jlong iAddress, jint id, jlong rectAddress) {
    struct nk_input const *i = (struct nk_input const *)(intptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    return (jint)nk_input_has_mouse_click_in_rect(i, (enum nk_buttons)id, *rect);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1has_1mouse_1click_1in_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jint id, jlong rectAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1has_1mouse_1click_1in_1rect(iAddress, id, rectAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1has_1mouse_1click_1down_1in_1rect(jlong iAddress, jint id, jlong rectAddress, jint down) {
    struct nk_input const *i = (struct nk_input const *)(intptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    return (jint)nk_input_has_mouse_click_down_in_rect(i, (enum nk_buttons)id, *rect, down);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1has_1mouse_1click_1down_1in_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jint id, jlong rectAddress, jint down) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1has_1mouse_1click_1down_1in_1rect(iAddress, id, rectAddress, down);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1click_1in_1rect(jlong iAddress, jint id, jlong rectAddress) {
    struct nk_input const *i = (struct nk_input const *)(intptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    return (jint)nk_input_is_mouse_click_in_rect(i, (enum nk_buttons)id, *rect);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1click_1in_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jint id, jlong rectAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1click_1in_1rect(iAddress, id, rectAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1click_1down_1in_1rect(jlong iAddress, jint id, jlong bAddress, jint down) {
    struct nk_input const *i = (struct nk_input const *)(intptr_t)iAddress;
    struct nk_rect *b = (struct nk_rect *)(intptr_t)bAddress;
    return (jint)nk_input_is_mouse_click_down_in_rect(i, (enum nk_buttons)id, *b, down);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1click_1down_1in_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jint id, jlong bAddress, jint down) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1click_1down_1in_1rect(iAddress, id, bAddress, down);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1any_1mouse_1click_1in_1rect(jlong iAddress, jlong rectAddress) {
    struct nk_input const *i = (struct nk_input const *)(intptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    return (jint)nk_input_any_mouse_click_in_rect(i, *rect);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1any_1mouse_1click_1in_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jlong rectAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1any_1mouse_1click_1in_1rect(iAddress, rectAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1prev_1hovering_1rect(jlong iAddress, jlong rectAddress) {
    struct nk_input const *i = (struct nk_input const *)(intptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    return (jint)nk_input_is_mouse_prev_hovering_rect(i, *rect);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1prev_1hovering_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jlong rectAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1prev_1hovering_1rect(iAddress, rectAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1hovering_1rect(jlong iAddress, jlong rectAddress) {
    struct nk_input const *i = (struct nk_input const *)(intptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    return (jint)nk_input_is_mouse_hovering_rect(i, *rect);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1hovering_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jlong rectAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1hovering_1rect(iAddress, rectAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1mouse_1clicked(jlong iAddress, jint id, jlong rectAddress) {
    struct nk_input const *i = (struct nk_input const *)(intptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    return (jint)nk_input_mouse_clicked(i, (enum nk_buttons)id, *rect);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1mouse_1clicked(JNIEnv *__env, jclass clazz, jlong iAddress, jint id, jlong rectAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1mouse_1clicked(iAddress, id, rectAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1down(jlong iAddress, jint id) {
    struct nk_input const *i = (struct nk_input const *)(intptr_t)iAddress;
    return (jint)nk_input_is_mouse_down(i, (enum nk_buttons)id);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1down(JNIEnv *__env, jclass clazz, jlong iAddress, jint id) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1down(iAddress, id);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1pressed(jlong iAddress, jint id) {
    struct nk_input const *i = (struct nk_input const *)(intptr_t)iAddress;
    return (jint)nk_input_is_mouse_pressed(i, (enum nk_buttons)id);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1pressed(JNIEnv *__env, jclass clazz, jlong iAddress, jint id) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1pressed(iAddress, id);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1released(jlong iAddress, jint id) {
    struct nk_input const *i = (struct nk_input const *)(intptr_t)iAddress;
    return (jint)nk_input_is_mouse_released(i, (enum nk_buttons)id);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1released(JNIEnv *__env, jclass clazz, jlong iAddress, jint id) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1released(iAddress, id);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1key_1pressed(jlong iAddress, jint key) {
    struct nk_input const *i = (struct nk_input const *)(intptr_t)iAddress;
    return (jint)nk_input_is_key_pressed(i, (enum nk_keys)key);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1key_1pressed(JNIEnv *__env, jclass clazz, jlong iAddress, jint key) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1key_1pressed(iAddress, key);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1key_1released(jlong iAddress, jint key) {
    struct nk_input const *i = (struct nk_input const *)(intptr_t)iAddress;
    return (jint)nk_input_is_key_released(i, (enum nk_keys)key);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1key_1released(JNIEnv *__env, jclass clazz, jlong iAddress, jint key) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1key_1released(iAddress, key);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1key_1down(jlong iAddress, jint key) {
    struct nk_input const *i = (struct nk_input const *)(intptr_t)iAddress;
    return (jint)nk_input_is_key_down(i, (enum nk_keys)key);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1key_1down(JNIEnv *__env, jclass clazz, jlong iAddress, jint key) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1key_1down(iAddress, key);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1init(jlong listAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    nk_draw_list_init(list);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1init(JNIEnv *__env, jclass clazz, jlong listAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1init(listAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1setup)(jlong canvasAddress, jlong configAddress, jlong cmdsAddress, jlong verticesAddress, jlong elementsAddress, jint line_aa, jint shape_aa) {
    struct nk_draw_list *canvas = (struct nk_draw_list *)(intptr_t)canvasAddress;
    struct nk_convert_config const *config = (struct nk_convert_config const *)(intptr_t)configAddress;
    struct nk_buffer *cmds = (struct nk_buffer *)(intptr_t)cmdsAddress;
    struct nk_buffer *vertices = (struct nk_buffer *)(intptr_t)verticesAddress;
    struct nk_buffer *elements = (struct nk_buffer *)(intptr_t)elementsAddress;
    nk_draw_list_setup(canvas, config, cmds, vertices, elements, (enum nk_anti_aliasing)line_aa, (enum nk_anti_aliasing)shape_aa);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1setup(JNIEnv *__env, jclass clazz, jlong canvasAddress, jlong configAddress, jlong cmdsAddress, jlong verticesAddress, jlong elementsAddress, jint line_aa, jint shape_aa) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1setup)(canvasAddress, configAddress, cmdsAddress, verticesAddress, elementsAddress, line_aa, shape_aa);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1list_1begin(jlong listAddress, jlong bufferAddress) {
    struct nk_draw_list const *list = (struct nk_draw_list const *)(intptr_t)listAddress;
    struct nk_buffer const *buffer = (struct nk_buffer const *)(intptr_t)bufferAddress;
    return (jlong)(intptr_t)nk__draw_list_begin(list, buffer);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1list_1begin(JNIEnv *__env, jclass clazz, jlong listAddress, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1list_1begin(listAddress, bufferAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1list_1next(jlong cmdAddress, jlong bufferAddress, jlong listAddress) {
    struct nk_draw_command const *cmd = (struct nk_draw_command const *)(intptr_t)cmdAddress;
    struct nk_buffer const *buffer = (struct nk_buffer const *)(intptr_t)bufferAddress;
    struct nk_draw_list const *list = (struct nk_draw_list const *)(intptr_t)listAddress;
    return (jlong)(intptr_t)nk__draw_list_next(cmd, buffer, list);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1list_1next(JNIEnv *__env, jclass clazz, jlong cmdAddress, jlong bufferAddress, jlong listAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1list_1next(cmdAddress, bufferAddress, listAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1begin(jlong ctxAddress, jlong bufferAddress) {
    struct nk_context const *ctx = (struct nk_context const *)(intptr_t)ctxAddress;
    struct nk_buffer const *buffer = (struct nk_buffer const *)(intptr_t)bufferAddress;
    return (jlong)(intptr_t)nk__draw_begin(ctx, buffer);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1begin(ctxAddress, bufferAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1end(jlong ctxAddress, jlong bufferAddress) {
    struct nk_context const *ctx = (struct nk_context const *)(intptr_t)ctxAddress;
    struct nk_buffer const *buffer = (struct nk_buffer const *)(intptr_t)bufferAddress;
    return (jlong)(intptr_t)nk__draw_end(ctx, buffer);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1end(ctxAddress, bufferAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1next(jlong cmdAddress, jlong bufferAddress, jlong ctxAddress) {
    struct nk_draw_command const *cmd = (struct nk_draw_command const *)(intptr_t)cmdAddress;
    struct nk_buffer const *buffer = (struct nk_buffer const *)(intptr_t)bufferAddress;
    struct nk_context const *ctx = (struct nk_context const *)(intptr_t)ctxAddress;
    return (jlong)(intptr_t)nk__draw_next(cmd, buffer, ctx);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1next(JNIEnv *__env, jclass clazz, jlong cmdAddress, jlong bufferAddress, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1next(cmdAddress, bufferAddress, ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1clear(jlong listAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    nk_draw_list_path_clear(list);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1clear(JNIEnv *__env, jclass clazz, jlong listAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1clear(listAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1line_1to(jlong listAddress, jlong posAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *pos = (struct nk_vec2 *)(intptr_t)posAddress;
    nk_draw_list_path_line_to(list, *pos);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1line_1to(JNIEnv *__env, jclass clazz, jlong listAddress, jlong posAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1line_1to(listAddress, posAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1arc_1to_1fast(jlong listAddress, jlong centerAddress, jfloat radius, jint a_min, jint a_max) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *center = (struct nk_vec2 *)(intptr_t)centerAddress;
    nk_draw_list_path_arc_to_fast(list, *center, radius, a_min, a_max);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1arc_1to_1fast(JNIEnv *__env, jclass clazz, jlong listAddress, jlong centerAddress, jfloat radius, jint a_min, jint a_max) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1arc_1to_1fast(listAddress, centerAddress, radius, a_min, a_max);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1arc_1to)(jlong listAddress, jlong centerAddress, jfloat radius, jfloat a_min, jfloat a_max, jint segments) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *center = (struct nk_vec2 *)(intptr_t)centerAddress;
    nk_draw_list_path_arc_to(list, *center, radius, a_min, a_max, (unsigned int)segments);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1arc_1to(JNIEnv *__env, jclass clazz, jlong listAddress, jlong centerAddress, jfloat radius, jfloat a_min, jfloat a_max, jint segments) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1arc_1to)(listAddress, centerAddress, radius, a_min, a_max, segments);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1rect_1to(jlong listAddress, jlong aAddress, jlong bAddress, jfloat rounding) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *a = (struct nk_vec2 *)(intptr_t)aAddress;
    struct nk_vec2 *b = (struct nk_vec2 *)(intptr_t)bAddress;
    nk_draw_list_path_rect_to(list, *a, *b, rounding);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1rect_1to(JNIEnv *__env, jclass clazz, jlong listAddress, jlong aAddress, jlong bAddress, jfloat rounding) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1rect_1to(listAddress, aAddress, bAddress, rounding);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1curve_1to(jlong listAddress, jlong p2Address, jlong p3Address, jlong p4Address, jint num_segments) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *p2 = (struct nk_vec2 *)(intptr_t)p2Address;
    struct nk_vec2 *p3 = (struct nk_vec2 *)(intptr_t)p3Address;
    struct nk_vec2 *p4 = (struct nk_vec2 *)(intptr_t)p4Address;
    nk_draw_list_path_curve_to(list, *p2, *p3, *p4, (unsigned int)num_segments);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1curve_1to(JNIEnv *__env, jclass clazz, jlong listAddress, jlong p2Address, jlong p3Address, jlong p4Address, jint num_segments) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1curve_1to(listAddress, p2Address, p3Address, p4Address, num_segments);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1fill(jlong listAddress, jlong colorAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_draw_list_path_fill(list, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1fill(JNIEnv *__env, jclass clazz, jlong listAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1fill(listAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1stroke(jlong listAddress, jlong colorAddress, jint closed, jfloat thickness) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_draw_list_path_stroke(list, *color, (enum nk_draw_list_stroke)closed, thickness);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1stroke(JNIEnv *__env, jclass clazz, jlong listAddress, jlong colorAddress, jint closed, jfloat thickness) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1stroke(listAddress, colorAddress, closed, thickness);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1line(jlong listAddress, jlong aAddress, jlong bAddress, jlong colorAddress, jfloat thickness) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *a = (struct nk_vec2 *)(intptr_t)aAddress;
    struct nk_vec2 *b = (struct nk_vec2 *)(intptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_draw_list_stroke_line(list, *a, *b, *color, thickness);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1line(JNIEnv *__env, jclass clazz, jlong listAddress, jlong aAddress, jlong bAddress, jlong colorAddress, jfloat thickness) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1line(listAddress, aAddress, bAddress, colorAddress, thickness);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1rect(jlong listAddress, jlong rectAddress, jlong colorAddress, jfloat rounding, jfloat thickness) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_draw_list_stroke_rect(list, *rect, *color, rounding, thickness);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1rect(JNIEnv *__env, jclass clazz, jlong listAddress, jlong rectAddress, jlong colorAddress, jfloat rounding, jfloat thickness) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1rect(listAddress, rectAddress, colorAddress, rounding, thickness);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1triangle)(jlong listAddress, jlong aAddress, jlong bAddress, jlong cAddress, jlong colorAddress, jfloat thickness) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *a = (struct nk_vec2 *)(intptr_t)aAddress;
    struct nk_vec2 *b = (struct nk_vec2 *)(intptr_t)bAddress;
    struct nk_vec2 *c = (struct nk_vec2 *)(intptr_t)cAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_draw_list_stroke_triangle(list, *a, *b, *c, *color, thickness);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1triangle(JNIEnv *__env, jclass clazz, jlong listAddress, jlong aAddress, jlong bAddress, jlong cAddress, jlong colorAddress, jfloat thickness) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1triangle)(listAddress, aAddress, bAddress, cAddress, colorAddress, thickness);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1circle)(jlong listAddress, jlong centerAddress, jfloat radius, jlong colorAddress, jint segs, jfloat thickness) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *center = (struct nk_vec2 *)(intptr_t)centerAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_draw_list_stroke_circle(list, *center, radius, *color, (unsigned int)segs, thickness);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1circle(JNIEnv *__env, jclass clazz, jlong listAddress, jlong centerAddress, jfloat radius, jlong colorAddress, jint segs, jfloat thickness) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1circle)(listAddress, centerAddress, radius, colorAddress, segs, thickness);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1curve)(jlong listAddress, jlong p0Address, jlong cp0Address, jlong cp1Address, jlong p1Address, jlong colorAddress, jint segments, jfloat thickness) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *p0 = (struct nk_vec2 *)(intptr_t)p0Address;
    struct nk_vec2 *cp0 = (struct nk_vec2 *)(intptr_t)cp0Address;
    struct nk_vec2 *cp1 = (struct nk_vec2 *)(intptr_t)cp1Address;
    struct nk_vec2 *p1 = (struct nk_vec2 *)(intptr_t)p1Address;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_draw_list_stroke_curve(list, *p0, *cp0, *cp1, *p1, *color, (unsigned int)segments, thickness);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1curve(JNIEnv *__env, jclass clazz, jlong listAddress, jlong p0Address, jlong cp0Address, jlong cp1Address, jlong p1Address, jlong colorAddress, jint segments, jfloat thickness) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1curve)(listAddress, p0Address, cp0Address, cp1Address, p1Address, colorAddress, segments, thickness);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1poly_1line)(jlong listAddress, jlong pntsAddress, jint cnt, jlong colorAddress, jint closed, jfloat thickness, jint aliasing) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 const *pnts = (struct nk_vec2 const *)(intptr_t)pntsAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_draw_list_stroke_poly_line(list, pnts, (unsigned int)cnt, *color, (enum nk_draw_list_stroke)closed, thickness, (enum nk_anti_aliasing)aliasing);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1poly_1line(JNIEnv *__env, jclass clazz, jlong listAddress, jlong pntsAddress, jint cnt, jlong colorAddress, jint closed, jfloat thickness, jint aliasing) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1poly_1line)(listAddress, pntsAddress, cnt, colorAddress, closed, thickness, aliasing);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1rect(jlong listAddress, jlong rectAddress, jlong colorAddress, jfloat rounding) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_draw_list_fill_rect(list, *rect, *color, rounding);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1rect(JNIEnv *__env, jclass clazz, jlong listAddress, jlong rectAddress, jlong colorAddress, jfloat rounding) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1rect(listAddress, rectAddress, colorAddress, rounding);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1rect_1multi_1color)(jlong listAddress, jlong rectAddress, jlong leftAddress, jlong topAddress, jlong rightAddress, jlong bottomAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_color *left = (struct nk_color *)(intptr_t)leftAddress;
    struct nk_color *top = (struct nk_color *)(intptr_t)topAddress;
    struct nk_color *right = (struct nk_color *)(intptr_t)rightAddress;
    struct nk_color *bottom = (struct nk_color *)(intptr_t)bottomAddress;
    nk_draw_list_fill_rect_multi_color(list, *rect, *left, *top, *right, *bottom);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1rect_1multi_1color(JNIEnv *__env, jclass clazz, jlong listAddress, jlong rectAddress, jlong leftAddress, jlong topAddress, jlong rightAddress, jlong bottomAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1rect_1multi_1color)(listAddress, rectAddress, leftAddress, topAddress, rightAddress, bottomAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1triangle(jlong listAddress, jlong aAddress, jlong bAddress, jlong cAddress, jlong colorAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *a = (struct nk_vec2 *)(intptr_t)aAddress;
    struct nk_vec2 *b = (struct nk_vec2 *)(intptr_t)bAddress;
    struct nk_vec2 *c = (struct nk_vec2 *)(intptr_t)cAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_draw_list_fill_triangle(list, *a, *b, *c, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1triangle(JNIEnv *__env, jclass clazz, jlong listAddress, jlong aAddress, jlong bAddress, jlong cAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1triangle(listAddress, aAddress, bAddress, cAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1circle(jlong listAddress, jlong centerAddress, jfloat radius, jlong colAddress, jint segs) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *center = (struct nk_vec2 *)(intptr_t)centerAddress;
    struct nk_color *col = (struct nk_color *)(intptr_t)colAddress;
    nk_draw_list_fill_circle(list, *center, radius, *col, (unsigned int)segs);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1circle(JNIEnv *__env, jclass clazz, jlong listAddress, jlong centerAddress, jfloat radius, jlong colAddress, jint segs) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1circle(listAddress, centerAddress, radius, colAddress, segs);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1poly_1convex(jlong listAddress, jlong pointsAddress, jint count, jlong colorAddress, jint aliasing) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 const *points = (struct nk_vec2 const *)(intptr_t)pointsAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_draw_list_fill_poly_convex(list, points, (unsigned int)count, *color, (enum nk_anti_aliasing)aliasing);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1poly_1convex(JNIEnv *__env, jclass clazz, jlong listAddress, jlong pointsAddress, jint count, jlong colorAddress, jint aliasing) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1poly_1convex(listAddress, pointsAddress, count, colorAddress, aliasing);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1add_1image(jlong listAddress, jlong textureAddress, jlong rectAddress, jlong colorAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_image *texture = (struct nk_image *)(intptr_t)textureAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_draw_list_add_image(list, *texture, *rect, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1add_1image(JNIEnv *__env, jclass clazz, jlong listAddress, jlong textureAddress, jlong rectAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1add_1image(listAddress, textureAddress, rectAddress, colorAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1add_1text)(jlong listAddress, jlong fontAddress, jlong rectAddress, jlong textAddress, jint len, jfloat font_height, jlong colorAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_user_font const *font = (struct nk_user_font const *)(intptr_t)fontAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    nk_draw_list_add_text(list, font, *rect, text, len, font_height, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1add_1text(JNIEnv *__env, jclass clazz, jlong listAddress, jlong fontAddress, jlong rectAddress, jlong textAddress, jint len, jfloat font_height, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1add_1text)(listAddress, fontAddress, rectAddress, textAddress, len, font_height, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1push_1userdata(jlong listAddress, jlong userdataAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    nk_handle *userdata = (nk_handle *)(intptr_t)userdataAddress;
    nk_draw_list_push_userdata(list, *userdata);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1push_1userdata(JNIEnv *__env, jclass clazz, jlong listAddress, jlong userdataAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1push_1userdata(listAddress, userdataAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1item_1image(jlong imgAddress, jlong __result) {
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    *((struct nk_style_item*)(intptr_t)__result) = nk_style_item_image(*img);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1item_1image(JNIEnv *__env, jclass clazz, jlong imgAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1item_1image(imgAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1item_1color(jlong colorAddress, jlong __result) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    *((struct nk_style_item*)(intptr_t)__result) = nk_style_item_color(*color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1item_1color(JNIEnv *__env, jclass clazz, jlong colorAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1item_1color(colorAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1item_1hide(jlong __result) {
    *((struct nk_style_item*)(intptr_t)__result) = nk_style_item_hide();
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1item_1hide(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1item_1hide(__result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row__JIFI_3F(jlong ctxAddress, jint fmt, jfloat height, jint cols, jint ratio__length, jfloat* ratio) {
    UNUSED_PARAM(ratio__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row__JIFIJ(ctxAddress, fmt, height, cols, (intptr_t)ratio);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row__JIFI_3F(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint fmt, jfloat height, jint cols, jfloatArray ratioAddress) {
    jfloat *ratio = (*__env)->GetPrimitiveArrayCritical(__env, ratioAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row__JIFIJ(ctxAddress, fmt, height, cols, (intptr_t)ratio);
    (*__env)->ReleasePrimitiveArrayCritical(__env, ratioAddress, ratio, 0);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1offset_1begin__J_3I_3IJI(jlong ctxAddress, jint x_offset__length, jint* x_offset, jint y_offset__length, jint* y_offset, jlong titleAddress, jint flags) {
    UNUSED_PARAM(x_offset__length)
    UNUSED_PARAM(y_offset__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1offset_1begin__JJJJI(ctxAddress, (intptr_t)x_offset, (intptr_t)y_offset, titleAddress, flags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1offset_1begin__J_3I_3IJI(JNIEnv *__env, jclass clazz, jlong ctxAddress, jintArray x_offsetAddress, jintArray y_offsetAddress, jlong titleAddress, jint flags) {
    jint __result;
    jint *x_offset = (*__env)->GetPrimitiveArrayCritical(__env, x_offsetAddress, 0);
    jint *y_offset = (*__env)->GetPrimitiveArrayCritical(__env, y_offsetAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1offset_1begin__JJJJI(ctxAddress, (intptr_t)x_offset, (intptr_t)y_offset, titleAddress, flags);
    (*__env)->ReleasePrimitiveArrayCritical(__env, y_offsetAddress, y_offset, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, x_offsetAddress, x_offset, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1push__JIJ_3I(jlong ctxAddress, jint type, jlong titleAddress, jint state__length, jint* state) {
    UNUSED_PARAM(state__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1push__JIJJ(ctxAddress, type, titleAddress, (intptr_t)state);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1push__JIJ_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong titleAddress, jintArray stateAddress) {
    jint __result;
    jint *state = (*__env)->GetPrimitiveArrayCritical(__env, stateAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1push__JIJJ(ctxAddress, type, titleAddress, (intptr_t)state);
    (*__env)->ReleasePrimitiveArrayCritical(__env, stateAddress, state, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1image_1push__JIJJ_3I(jlong ctxAddress, jint type, jlong imageAddress, jlong titleAddress, jint state__length, jint* state) {
    UNUSED_PARAM(state__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1image_1push__JIJJJ(ctxAddress, type, imageAddress, titleAddress, (intptr_t)state);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1image_1push__JIJJ_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong imageAddress, jlong titleAddress, jintArray stateAddress) {
    jint __result;
    jint *state = (*__env)->GetPrimitiveArrayCritical(__env, stateAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1image_1push__JIJJJ(ctxAddress, type, imageAddress, titleAddress, (intptr_t)state);
    (*__env)->ReleasePrimitiveArrayCritical(__env, stateAddress, state, 0);
    return __result;
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1push_1hashed__JIJI_3IJII)(jlong ctxAddress, jint type, jlong titleAddress, jint initial_state, jint selected__length, jint* selected, jlong hashAddress, jint len, jint seed) {
    UNUSED_PARAM(selected__length)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1push_1hashed__JIJIJJII)(ctxAddress, type, titleAddress, initial_state, (intptr_t)selected, hashAddress, len, seed);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1push_1hashed__JIJI_3IJII(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong titleAddress, jint initial_state, jintArray selectedAddress, jlong hashAddress, jint len, jint seed) {
    jint __result;
    jint *selected = (*__env)->GetPrimitiveArrayCritical(__env, selectedAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1push_1hashed__JIJIJJII)(ctxAddress, type, titleAddress, initial_state, (intptr_t)selected, hashAddress, len, seed);
    (*__env)->ReleasePrimitiveArrayCritical(__env, selectedAddress, selected, 0);
    return __result;
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1image_1push_1hashed__JIJJI_3IJII)(jlong ctxAddress, jint type, jlong imgAddress, jlong titleAddress, jint initial_state, jint selected__length, jint* selected, jlong hashAddress, jint len, jint seed) {
    UNUSED_PARAM(selected__length)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1image_1push_1hashed__JIJJIJJII)(ctxAddress, type, imgAddress, titleAddress, initial_state, (intptr_t)selected, hashAddress, len, seed);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1image_1push_1hashed__JIJJI_3IJII(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong imgAddress, jlong titleAddress, jint initial_state, jintArray selectedAddress, jlong hashAddress, jint len, jint seed) {
    jint __result;
    jint *selected = (*__env)->GetPrimitiveArrayCritical(__env, selectedAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1image_1push_1hashed__JIJJIJJII)(ctxAddress, type, imgAddress, titleAddress, initial_state, (intptr_t)selected, hashAddress, len, seed);
    (*__env)->ReleasePrimitiveArrayCritical(__env, selectedAddress, selected, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1label__JJ_3I(jlong ctxAddress, jlong strAddress, jint active__length, jint* active) {
    UNUSED_PARAM(active__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1label__JJJ(ctxAddress, strAddress, (intptr_t)active);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1label__JJ_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jintArray activeAddress) {
    jint __result;
    jint *active = (*__env)->GetPrimitiveArrayCritical(__env, activeAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1label__JJJ(ctxAddress, strAddress, (intptr_t)active);
    (*__env)->ReleasePrimitiveArrayCritical(__env, activeAddress, active, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1text__JJI_3I(jlong ctxAddress, jlong strAddress, jint len, jint active__length, jint* active) {
    UNUSED_PARAM(active__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1text__JJIJ(ctxAddress, strAddress, len, (intptr_t)active);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1text__JJI_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jintArray activeAddress) {
    jint __result;
    jint *active = (*__env)->GetPrimitiveArrayCritical(__env, activeAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1text__JJIJ(ctxAddress, strAddress, len, (intptr_t)active);
    (*__env)->ReleasePrimitiveArrayCritical(__env, activeAddress, active, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1label__JJ_3II(jlong ctxAddress, jlong strAddress, jint flags__length, jint* flags, jint value) {
    UNUSED_PARAM(flags__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1label__JJJI(ctxAddress, strAddress, (intptr_t)flags, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1label__JJ_3II(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jintArray flagsAddress, jint value) {
    jint __result;
    jint *flags = (*__env)->GetPrimitiveArrayCritical(__env, flagsAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1label__JJJI(ctxAddress, strAddress, (intptr_t)flags, value);
    (*__env)->ReleasePrimitiveArrayCritical(__env, flagsAddress, flags, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1text__JJI_3II(jlong ctxAddress, jlong strAddress, jint len, jint flags__length, jint* flags, jint value) {
    UNUSED_PARAM(flags__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1text__JJIJI(ctxAddress, strAddress, len, (intptr_t)flags, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1text__JJI_3II(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jintArray flagsAddress, jint value) {
    jint __result;
    jint *flags = (*__env)->GetPrimitiveArrayCritical(__env, flagsAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1text__JJIJI(ctxAddress, strAddress, len, (intptr_t)flags, value);
    (*__env)->ReleasePrimitiveArrayCritical(__env, flagsAddress, flags, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1radio_1label__JJ_3I(jlong ctxAddress, jlong strAddress, jint active__length, jint* active) {
    UNUSED_PARAM(active__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1radio_1label__JJJ(ctxAddress, strAddress, (intptr_t)active);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1radio_1label__JJ_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jintArray activeAddress) {
    jint __result;
    jint *active = (*__env)->GetPrimitiveArrayCritical(__env, activeAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1radio_1label__JJJ(ctxAddress, strAddress, (intptr_t)active);
    (*__env)->ReleasePrimitiveArrayCritical(__env, activeAddress, active, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1radio_1text__JJI_3I(jlong ctxAddress, jlong strAddress, jint len, jint active__length, jint* active) {
    UNUSED_PARAM(active__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1radio_1text__JJIJ(ctxAddress, strAddress, len, (intptr_t)active);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1radio_1text__JJI_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jintArray activeAddress) {
    jint __result;
    jint *active = (*__env)->GetPrimitiveArrayCritical(__env, activeAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1radio_1text__JJIJ(ctxAddress, strAddress, len, (intptr_t)active);
    (*__env)->ReleasePrimitiveArrayCritical(__env, activeAddress, active, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1label__JJI_3I(jlong ctxAddress, jlong strAddress, jint align, jint value__length, jint* value) {
    UNUSED_PARAM(value__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1label__JJIJ(ctxAddress, strAddress, align, (intptr_t)value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1label__JJI_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint align, jintArray valueAddress) {
    jint __result;
    jint *value = (*__env)->GetPrimitiveArrayCritical(__env, valueAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1label__JJIJ(ctxAddress, strAddress, align, (intptr_t)value);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valueAddress, value, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1text__JJII_3I(jlong ctxAddress, jlong strAddress, jint len, jint align, jint value__length, jint* value) {
    UNUSED_PARAM(value__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1text__JJIIJ(ctxAddress, strAddress, len, align, (intptr_t)value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1text__JJII_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint align, jintArray valueAddress) {
    jint __result;
    jint *value = (*__env)->GetPrimitiveArrayCritical(__env, valueAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1text__JJIIJ(ctxAddress, strAddress, len, align, (intptr_t)value);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valueAddress, value, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1label__JJJI_3I(jlong ctxAddress, jlong imgAddress, jlong strAddress, jint align, jint value__length, jint* value) {
    UNUSED_PARAM(value__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1label__JJJIJ(ctxAddress, imgAddress, strAddress, align, (intptr_t)value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1label__JJJI_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong strAddress, jint align, jintArray valueAddress) {
    jint __result;
    jint *value = (*__env)->GetPrimitiveArrayCritical(__env, valueAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1label__JJJIJ(ctxAddress, imgAddress, strAddress, align, (intptr_t)value);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valueAddress, value, 0);
    return __result;
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1text__JJJII_3I)(jlong ctxAddress, jlong imgAddress, jlong strAddress, jint len, jint align, jint value__length, jint* value) {
    UNUSED_PARAM(value__length)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1text__JJJIIJ)(ctxAddress, imgAddress, strAddress, len, align, (intptr_t)value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1text__JJJII_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong strAddress, jint len, jint align, jintArray valueAddress) {
    jint __result;
    jint *value = (*__env)->GetPrimitiveArrayCritical(__env, valueAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1text__JJJIIJ)(ctxAddress, imgAddress, strAddress, len, align, (intptr_t)value);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valueAddress, value, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1symbol_1label__JIJI_3I(jlong ctxAddress, jint symbol, jlong strAddress, jint align, jint value__length, jint* value) {
    UNUSED_PARAM(value__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1symbol_1label__JIJIJ(ctxAddress, symbol, strAddress, align, (intptr_t)value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1symbol_1label__JIJI_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong strAddress, jint align, jintArray valueAddress) {
    jint __result;
    jint *value = (*__env)->GetPrimitiveArrayCritical(__env, valueAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1symbol_1label__JIJIJ(ctxAddress, symbol, strAddress, align, (intptr_t)value);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valueAddress, value, 0);
    return __result;
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1selectable_1symbol_1text__JIJII_3I)(jlong ctxAddress, jint symbol, jlong strAddress, jint len, jint align, jint value__length, jint* value) {
    UNUSED_PARAM(value__length)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1selectable_1symbol_1text__JIJIIJ)(ctxAddress, symbol, strAddress, len, align, (intptr_t)value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1symbol_1text__JIJII_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong strAddress, jint len, jint align, jintArray valueAddress) {
    jint __result;
    jint *value = (*__env)->GetPrimitiveArrayCritical(__env, valueAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1selectable_1symbol_1text__JIJIIJ)(ctxAddress, symbol, strAddress, len, align, (intptr_t)value);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valueAddress, value, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1slider_1float__JF_3FFF(jlong ctxAddress, jfloat min, jint val__length, jfloat* val, jfloat max, jfloat step) {
    UNUSED_PARAM(val__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1slider_1float__JFJFF(ctxAddress, min, (intptr_t)val, max, step);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1slider_1float__JF_3FFF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat min, jfloatArray valAddress, jfloat max, jfloat step) {
    jint __result;
    jfloat *val = (*__env)->GetPrimitiveArrayCritical(__env, valAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1slider_1float__JFJFF(ctxAddress, min, (intptr_t)val, max, step);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valAddress, val, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1slider_1int__JI_3III(jlong ctxAddress, jint min, jint val__length, jint* val, jint max, jint step) {
    UNUSED_PARAM(val__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1slider_1int__JIJII(ctxAddress, min, (intptr_t)val, max, step);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1slider_1int__JI_3III(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint min, jintArray valAddress, jint max, jint step) {
    jint __result;
    jint *val = (*__env)->GetPrimitiveArrayCritical(__env, valAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1slider_1int__JIJII(ctxAddress, min, (intptr_t)val, max, step);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valAddress, val, 0);
    return __result;
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1property_1int__JJI_3IIIF)(jlong ctxAddress, jlong nameAddress, jint min, jint val__length, jint* val, jint max, jint step, jfloat inc_per_pixel) {
    UNUSED_PARAM(val__length)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1property_1int__JJIJIIF)(ctxAddress, nameAddress, min, (intptr_t)val, max, step, inc_per_pixel);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1property_1int__JJI_3IIIF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint min, jintArray valAddress, jint max, jint step, jfloat inc_per_pixel) {
    jint *val = (*__env)->GetPrimitiveArrayCritical(__env, valAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1property_1int__JJIJIIF)(ctxAddress, nameAddress, min, (intptr_t)val, max, step, inc_per_pixel);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valAddress, val, 0);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1property_1float__JJF_3FFFF)(jlong ctxAddress, jlong nameAddress, jfloat min, jint val__length, jfloat* val, jfloat max, jfloat step, jfloat inc_per_pixel) {
    UNUSED_PARAM(val__length)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1property_1float__JJFJFFF)(ctxAddress, nameAddress, min, (intptr_t)val, max, step, inc_per_pixel);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1property_1float__JJF_3FFFF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jfloat min, jfloatArray valAddress, jfloat max, jfloat step, jfloat inc_per_pixel) {
    jfloat *val = (*__env)->GetPrimitiveArrayCritical(__env, valAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1property_1float__JJFJFFF)(ctxAddress, nameAddress, min, (intptr_t)val, max, step, inc_per_pixel);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valAddress, val, 0);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1property_1double__JJD_3DDDF)(jlong ctxAddress, jlong nameAddress, jdouble min, jint val__length, jdouble* val, jdouble max, jdouble step, jfloat inc_per_pixel) {
    UNUSED_PARAM(val__length)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1property_1double__JJDJDDF)(ctxAddress, nameAddress, min, (intptr_t)val, max, step, inc_per_pixel);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1property_1double__JJD_3DDDF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jdouble min, jdoubleArray valAddress, jdouble max, jdouble step, jfloat inc_per_pixel) {
    jdouble *val = (*__env)->GetPrimitiveArrayCritical(__env, valAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1property_1double__JJDJDDF)(ctxAddress, nameAddress, min, (intptr_t)val, max, step, inc_per_pixel);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valAddress, val, 0);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1edit_1string__JIJ_3IIJ)(jlong ctxAddress, jint flags, jlong memoryAddress, jint len__length, jint* len, jint max, jlong filterAddress) {
    UNUSED_PARAM(len__length)
    return CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1edit_1string__JIJJIJ)(ctxAddress, flags, memoryAddress, (intptr_t)len, max, filterAddress);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1edit_1string__JIJ_3IIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint flags, jlong memoryAddress, jintArray lenAddress, jint max, jlong filterAddress) {
    jint __result;
    jint *len = (*__env)->GetPrimitiveArrayCritical(__env, lenAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1edit_1string__JIJJIJ)(ctxAddress, flags, memoryAddress, (intptr_t)len, max, filterAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, lenAddress, len, 0);
    return __result;
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1plot__JI_3FII(jlong ctxAddress, jint type, jint values__length, jfloat* values, jint count, jint offset) {
    UNUSED_PARAM(values__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1plot__JIJII(ctxAddress, type, (intptr_t)values, count, offset);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1plot__JI_3FII(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jfloatArray valuesAddress, jint count, jint offset) {
    jfloat *values = (*__env)->GetPrimitiveArrayCritical(__env, valuesAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1plot__JIJII(ctxAddress, type, (intptr_t)values, count, offset);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valuesAddress, values, 0);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox__JJI_3IIJ)(jlong ctxAddress, jlong itemsAddress, jint count, jint selected__length, jint* selected, jint item_height, jlong sizeAddress) {
    UNUSED_PARAM(selected__length)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox__JJIJIJ)(ctxAddress, itemsAddress, count, (intptr_t)selected, item_height, sizeAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox__JJI_3IIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong itemsAddress, jint count, jintArray selectedAddress, jint item_height, jlong sizeAddress) {
    jint *selected = (*__env)->GetPrimitiveArrayCritical(__env, selectedAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox__JJIJIJ)(ctxAddress, itemsAddress, count, (intptr_t)selected, item_height, sizeAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, selectedAddress, selected, 0);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox_1string__JJ_3IIIJ)(jlong ctxAddress, jlong items_separated_by_zerosAddress, jint selected__length, jint* selected, jint count, jint item_height, jlong sizeAddress) {
    UNUSED_PARAM(selected__length)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox_1string__JJJIIJ)(ctxAddress, items_separated_by_zerosAddress, (intptr_t)selected, count, item_height, sizeAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1string__JJ_3IIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong items_separated_by_zerosAddress, jintArray selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    jint *selected = (*__env)->GetPrimitiveArrayCritical(__env, selectedAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox_1string__JJJIIJ)(ctxAddress, items_separated_by_zerosAddress, (intptr_t)selected, count, item_height, sizeAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, selectedAddress, selected, 0);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox_1separator__JJI_3IIIJ)(jlong ctxAddress, jlong items_separated_by_separatorAddress, jint separator, jint selected__length, jint* selected, jint count, jint item_height, jlong sizeAddress) {
    UNUSED_PARAM(selected__length)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox_1separator__JJIJIIJ)(ctxAddress, items_separated_by_separatorAddress, separator, (intptr_t)selected, count, item_height, sizeAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1separator__JJI_3IIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong items_separated_by_separatorAddress, jint separator, jintArray selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    jint *selected = (*__env)->GetPrimitiveArrayCritical(__env, selectedAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox_1separator__JJIJIIJ)(ctxAddress, items_separated_by_separatorAddress, separator, (intptr_t)selected, count, item_height, sizeAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, selectedAddress, selected, 0);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox_1callback__JJJ_3IIIJ)(jlong ctxAddress, jlong item_getterAddress, jlong userdataAddress, jint selected__length, jint* selected, jint count, jint item_height, jlong sizeAddress) {
    UNUSED_PARAM(selected__length)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox_1callback__JJJJIIJ)(ctxAddress, item_getterAddress, userdataAddress, (intptr_t)selected, count, item_height, sizeAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1callback__JJJ_3IIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong item_getterAddress, jlong userdataAddress, jintArray selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    jint *selected = (*__env)->GetPrimitiveArrayCritical(__env, selectedAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nuklear_Nuklear_nnk_1combobox_1callback__JJJJIIJ)(ctxAddress, item_getterAddress, userdataAddress, (intptr_t)selected, count, item_height, sizeAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, selectedAddress, selected, 0);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1float__J_3FF(jlong ctxAddress, jint address__length, jfloat* address, jfloat value) {
    UNUSED_PARAM(address__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1float__JJF(ctxAddress, (intptr_t)address, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1float__J_3FF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloatArray addressAddress, jfloat value) {
    jint __result;
    jfloat *address = (*__env)->GetPrimitiveArrayCritical(__env, addressAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1float__JJF(ctxAddress, (intptr_t)address, value);
    (*__env)->ReleasePrimitiveArrayCritical(__env, addressAddress, address, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1flags__J_3II(jlong ctxAddress, jint address__length, jint* address, jint value) {
    UNUSED_PARAM(address__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1flags__JJI(ctxAddress, (intptr_t)address, value);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1flags__J_3II(JNIEnv *__env, jclass clazz, jlong ctxAddress, jintArray addressAddress, jint value) {
    jint __result;
    jint *address = (*__env)->GetPrimitiveArrayCritical(__env, addressAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1flags__JJI(ctxAddress, (intptr_t)address, value);
    (*__env)->ReleasePrimitiveArrayCritical(__env, addressAddress, address, 0);
    return __result;
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1iv___3IJ(jint rgb__length, jint* rgb, jlong __result) {
    UNUSED_PARAM(rgb__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1iv__JJ((intptr_t)rgb, __result);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1iv___3IJ(JNIEnv *__env, jclass clazz, jintArray rgbAddress, jlong __result) {
    jint *rgb = (*__env)->GetPrimitiveArrayCritical(__env, rgbAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1iv__JJ((intptr_t)rgb, __result);
    (*__env)->ReleasePrimitiveArrayCritical(__env, rgbAddress, rgb, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1fv___3FJ(jint rgb__length, jfloat* rgb, jlong __result) {
    UNUSED_PARAM(rgb__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1fv__JJ((intptr_t)rgb, __result);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray rgbAddress, jlong __result) {
    jfloat *rgb = (*__env)->GetPrimitiveArrayCritical(__env, rgbAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1fv__JJ((intptr_t)rgb, __result);
    (*__env)->ReleasePrimitiveArrayCritical(__env, rgbAddress, rgb, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1iv___3IJ(jint rgba__length, jint* rgba, jlong __result) {
    UNUSED_PARAM(rgba__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1iv__JJ((intptr_t)rgba, __result);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1iv___3IJ(JNIEnv *__env, jclass clazz, jintArray rgbaAddress, jlong __result) {
    jint *rgba = (*__env)->GetPrimitiveArrayCritical(__env, rgbaAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1iv__JJ((intptr_t)rgba, __result);
    (*__env)->ReleasePrimitiveArrayCritical(__env, rgbaAddress, rgba, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1fv___3FJ(jint rgba__length, jfloat* rgba, jlong __result) {
    UNUSED_PARAM(rgba__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1fv__JJ((intptr_t)rgba, __result);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray rgbaAddress, jlong __result) {
    jfloat *rgba = (*__env)->GetPrimitiveArrayCritical(__env, rgbaAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1fv__JJ((intptr_t)rgba, __result);
    (*__env)->ReleasePrimitiveArrayCritical(__env, rgbaAddress, rgba, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1colorfv___3FJ(jint c__length, jfloat* c, jlong __result) {
    UNUSED_PARAM(c__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1colorfv__JJ((intptr_t)c, __result);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1colorfv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray cAddress, jlong __result) {
    jfloat *c = (*__env)->GetPrimitiveArrayCritical(__env, cAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1colorfv__JJ((intptr_t)c, __result);
    (*__env)->ReleasePrimitiveArrayCritical(__env, cAddress, c, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1colorf_1hsva_1f___3F_3F_3F_3FJ(jint out_h__length, jfloat* out_h, jint out_s__length, jfloat* out_s, jint out_v__length, jfloat* out_v, jint out_a__length, jfloat* out_a, jlong inAddress) {
    UNUSED_PARAM(out_h__length)
    UNUSED_PARAM(out_s__length)
    UNUSED_PARAM(out_v__length)
    UNUSED_PARAM(out_a__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1colorf_1hsva_1f__JJJJJ((intptr_t)out_h, (intptr_t)out_s, (intptr_t)out_v, (intptr_t)out_a, inAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1colorf_1hsva_1f___3F_3F_3F_3FJ(JNIEnv *__env, jclass clazz, jfloatArray out_hAddress, jfloatArray out_sAddress, jfloatArray out_vAddress, jfloatArray out_aAddress, jlong inAddress) {
    jfloat *out_h = (*__env)->GetPrimitiveArrayCritical(__env, out_hAddress, 0);
    jfloat *out_s = (*__env)->GetPrimitiveArrayCritical(__env, out_sAddress, 0);
    jfloat *out_v = (*__env)->GetPrimitiveArrayCritical(__env, out_vAddress, 0);
    jfloat *out_a = (*__env)->GetPrimitiveArrayCritical(__env, out_aAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1colorf_1hsva_1f__JJJJJ((intptr_t)out_h, (intptr_t)out_s, (intptr_t)out_v, (intptr_t)out_a, inAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_aAddress, out_a, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_vAddress, out_v, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_sAddress, out_s, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_hAddress, out_h, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1colorf_1hsva_1fv___3FJ(jint hsva__length, jfloat* hsva, jlong inAddress) {
    UNUSED_PARAM(hsva__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1colorf_1hsva_1fv__JJ((intptr_t)hsva, inAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1colorf_1hsva_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray hsvaAddress, jlong inAddress) {
    jfloat *hsva = (*__env)->GetPrimitiveArrayCritical(__env, hsvaAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1colorf_1hsva_1fv__JJ((intptr_t)hsva, inAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hsvaAddress, hsva, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1iv___3IJ(jint hsv__length, jint* hsv, jlong __result) {
    UNUSED_PARAM(hsv__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1iv__JJ((intptr_t)hsv, __result);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1iv___3IJ(JNIEnv *__env, jclass clazz, jintArray hsvAddress, jlong __result) {
    jint *hsv = (*__env)->GetPrimitiveArrayCritical(__env, hsvAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1iv__JJ((intptr_t)hsv, __result);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hsvAddress, hsv, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1fv___3FJ(jint hsv__length, jfloat* hsv, jlong __result) {
    UNUSED_PARAM(hsv__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1fv__JJ((intptr_t)hsv, __result);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray hsvAddress, jlong __result) {
    jfloat *hsv = (*__env)->GetPrimitiveArrayCritical(__env, hsvAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1fv__JJ((intptr_t)hsv, __result);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hsvAddress, hsv, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1iv___3IJ(jint hsva__length, jint* hsva, jlong __result) {
    UNUSED_PARAM(hsva__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1iv__JJ((intptr_t)hsva, __result);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1iv___3IJ(JNIEnv *__env, jclass clazz, jintArray hsvaAddress, jlong __result) {
    jint *hsva = (*__env)->GetPrimitiveArrayCritical(__env, hsvaAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1iv__JJ((intptr_t)hsva, __result);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hsvaAddress, hsva, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1fv___3FJ(jint hsva__length, jfloat* hsva, jlong __result) {
    UNUSED_PARAM(hsva__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1fv__JJ((intptr_t)hsva, __result);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray hsvaAddress, jlong __result) {
    jfloat *hsva = (*__env)->GetPrimitiveArrayCritical(__env, hsvaAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1fv__JJ((intptr_t)hsva, __result);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hsvaAddress, hsva, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1f___3F_3F_3F_3FJ(jint r__length, jfloat* r, jint g__length, jfloat* g, jint b__length, jfloat* b, jint a__length, jfloat* a, jlong colorAddress) {
    UNUSED_PARAM(r__length)
    UNUSED_PARAM(g__length)
    UNUSED_PARAM(b__length)
    UNUSED_PARAM(a__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1f__JJJJJ((intptr_t)r, (intptr_t)g, (intptr_t)b, (intptr_t)a, colorAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1f___3F_3F_3F_3FJ(JNIEnv *__env, jclass clazz, jfloatArray rAddress, jfloatArray gAddress, jfloatArray bAddress, jfloatArray aAddress, jlong colorAddress) {
    jfloat *r = (*__env)->GetPrimitiveArrayCritical(__env, rAddress, 0);
    jfloat *g = (*__env)->GetPrimitiveArrayCritical(__env, gAddress, 0);
    jfloat *b = (*__env)->GetPrimitiveArrayCritical(__env, bAddress, 0);
    jfloat *a = (*__env)->GetPrimitiveArrayCritical(__env, aAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1f__JJJJJ((intptr_t)r, (intptr_t)g, (intptr_t)b, (intptr_t)a, colorAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, aAddress, a, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, bAddress, b, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, gAddress, g, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, rAddress, r, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1fv___3FJ(jint rgba_out__length, jfloat* rgba_out, jlong colorAddress) {
    UNUSED_PARAM(rgba_out__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1fv__JJ((intptr_t)rgba_out, colorAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray rgba_outAddress, jlong colorAddress) {
    jfloat *rgba_out = (*__env)->GetPrimitiveArrayCritical(__env, rgba_outAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1fv__JJ((intptr_t)rgba_out, colorAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, rgba_outAddress, rgba_out, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1d___3D_3D_3D_3DJ(jint r__length, jdouble* r, jint g__length, jdouble* g, jint b__length, jdouble* b, jint a__length, jdouble* a, jlong colorAddress) {
    UNUSED_PARAM(r__length)
    UNUSED_PARAM(g__length)
    UNUSED_PARAM(b__length)
    UNUSED_PARAM(a__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1d__JJJJJ((intptr_t)r, (intptr_t)g, (intptr_t)b, (intptr_t)a, colorAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1d___3D_3D_3D_3DJ(JNIEnv *__env, jclass clazz, jdoubleArray rAddress, jdoubleArray gAddress, jdoubleArray bAddress, jdoubleArray aAddress, jlong colorAddress) {
    jdouble *r = (*__env)->GetPrimitiveArrayCritical(__env, rAddress, 0);
    jdouble *g = (*__env)->GetPrimitiveArrayCritical(__env, gAddress, 0);
    jdouble *b = (*__env)->GetPrimitiveArrayCritical(__env, bAddress, 0);
    jdouble *a = (*__env)->GetPrimitiveArrayCritical(__env, aAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1d__JJJJJ((intptr_t)r, (intptr_t)g, (intptr_t)b, (intptr_t)a, colorAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, aAddress, a, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, bAddress, b, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, gAddress, g, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, rAddress, r, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1dv___3DJ(jint rgba_out__length, jdouble* rgba_out, jlong colorAddress) {
    UNUSED_PARAM(rgba_out__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1dv__JJ((intptr_t)rgba_out, colorAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1dv___3DJ(JNIEnv *__env, jclass clazz, jdoubleArray rgba_outAddress, jlong colorAddress) {
    jdouble *rgba_out = (*__env)->GetPrimitiveArrayCritical(__env, rgba_outAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1dv__JJ((intptr_t)rgba_out, colorAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, rgba_outAddress, rgba_out, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1i___3I_3I_3IJ(jint out_h__length, jint* out_h, jint out_s__length, jint* out_s, jint out_v__length, jint* out_v, jlong colorAddress) {
    UNUSED_PARAM(out_h__length)
    UNUSED_PARAM(out_s__length)
    UNUSED_PARAM(out_v__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1i__JJJJ((intptr_t)out_h, (intptr_t)out_s, (intptr_t)out_v, colorAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1i___3I_3I_3IJ(JNIEnv *__env, jclass clazz, jintArray out_hAddress, jintArray out_sAddress, jintArray out_vAddress, jlong colorAddress) {
    jint *out_h = (*__env)->GetPrimitiveArrayCritical(__env, out_hAddress, 0);
    jint *out_s = (*__env)->GetPrimitiveArrayCritical(__env, out_sAddress, 0);
    jint *out_v = (*__env)->GetPrimitiveArrayCritical(__env, out_vAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1i__JJJJ((intptr_t)out_h, (intptr_t)out_s, (intptr_t)out_v, colorAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_vAddress, out_v, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_sAddress, out_s, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_hAddress, out_h, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1iv___3IJ(jint hsv_out__length, jint* hsv_out, jlong colorAddress) {
    UNUSED_PARAM(hsv_out__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1iv__JJ((intptr_t)hsv_out, colorAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1iv___3IJ(JNIEnv *__env, jclass clazz, jintArray hsv_outAddress, jlong colorAddress) {
    jint *hsv_out = (*__env)->GetPrimitiveArrayCritical(__env, hsv_outAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1iv__JJ((intptr_t)hsv_out, colorAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hsv_outAddress, hsv_out, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1f___3F_3F_3FJ(jint out_h__length, jfloat* out_h, jint out_s__length, jfloat* out_s, jint out_v__length, jfloat* out_v, jlong colorAddress) {
    UNUSED_PARAM(out_h__length)
    UNUSED_PARAM(out_s__length)
    UNUSED_PARAM(out_v__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1f__JJJJ((intptr_t)out_h, (intptr_t)out_s, (intptr_t)out_v, colorAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1f___3F_3F_3FJ(JNIEnv *__env, jclass clazz, jfloatArray out_hAddress, jfloatArray out_sAddress, jfloatArray out_vAddress, jlong colorAddress) {
    jfloat *out_h = (*__env)->GetPrimitiveArrayCritical(__env, out_hAddress, 0);
    jfloat *out_s = (*__env)->GetPrimitiveArrayCritical(__env, out_sAddress, 0);
    jfloat *out_v = (*__env)->GetPrimitiveArrayCritical(__env, out_vAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1f__JJJJ((intptr_t)out_h, (intptr_t)out_s, (intptr_t)out_v, colorAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_vAddress, out_v, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_sAddress, out_s, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_hAddress, out_h, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1fv___3FJ(jint hsv_out__length, jfloat* hsv_out, jlong colorAddress) {
    UNUSED_PARAM(hsv_out__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1fv__JJ((intptr_t)hsv_out, colorAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray hsv_outAddress, jlong colorAddress) {
    jfloat *hsv_out = (*__env)->GetPrimitiveArrayCritical(__env, hsv_outAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1fv__JJ((intptr_t)hsv_out, colorAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hsv_outAddress, hsv_out, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1i___3I_3I_3I_3IJ(jint h__length, jint* h, jint s__length, jint* s, jint v__length, jint* v, jint a__length, jint* a, jlong colorAddress) {
    UNUSED_PARAM(h__length)
    UNUSED_PARAM(s__length)
    UNUSED_PARAM(v__length)
    UNUSED_PARAM(a__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1i__JJJJJ((intptr_t)h, (intptr_t)s, (intptr_t)v, (intptr_t)a, colorAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1i___3I_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jintArray hAddress, jintArray sAddress, jintArray vAddress, jintArray aAddress, jlong colorAddress) {
    jint *h = (*__env)->GetPrimitiveArrayCritical(__env, hAddress, 0);
    jint *s = (*__env)->GetPrimitiveArrayCritical(__env, sAddress, 0);
    jint *v = (*__env)->GetPrimitiveArrayCritical(__env, vAddress, 0);
    jint *a = (*__env)->GetPrimitiveArrayCritical(__env, aAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1i__JJJJJ((intptr_t)h, (intptr_t)s, (intptr_t)v, (intptr_t)a, colorAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, aAddress, a, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, vAddress, v, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, sAddress, s, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hAddress, h, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1iv___3IJ(jint hsva_out__length, jint* hsva_out, jlong colorAddress) {
    UNUSED_PARAM(hsva_out__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1iv__JJ((intptr_t)hsva_out, colorAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1iv___3IJ(JNIEnv *__env, jclass clazz, jintArray hsva_outAddress, jlong colorAddress) {
    jint *hsva_out = (*__env)->GetPrimitiveArrayCritical(__env, hsva_outAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1iv__JJ((intptr_t)hsva_out, colorAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hsva_outAddress, hsva_out, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1f___3F_3F_3F_3FJ(jint out_h__length, jfloat* out_h, jint out_s__length, jfloat* out_s, jint out_v__length, jfloat* out_v, jint out_a__length, jfloat* out_a, jlong colorAddress) {
    UNUSED_PARAM(out_h__length)
    UNUSED_PARAM(out_s__length)
    UNUSED_PARAM(out_v__length)
    UNUSED_PARAM(out_a__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1f__JJJJJ((intptr_t)out_h, (intptr_t)out_s, (intptr_t)out_v, (intptr_t)out_a, colorAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1f___3F_3F_3F_3FJ(JNIEnv *__env, jclass clazz, jfloatArray out_hAddress, jfloatArray out_sAddress, jfloatArray out_vAddress, jfloatArray out_aAddress, jlong colorAddress) {
    jfloat *out_h = (*__env)->GetPrimitiveArrayCritical(__env, out_hAddress, 0);
    jfloat *out_s = (*__env)->GetPrimitiveArrayCritical(__env, out_sAddress, 0);
    jfloat *out_v = (*__env)->GetPrimitiveArrayCritical(__env, out_vAddress, 0);
    jfloat *out_a = (*__env)->GetPrimitiveArrayCritical(__env, out_aAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1f__JJJJJ((intptr_t)out_h, (intptr_t)out_s, (intptr_t)out_v, (intptr_t)out_a, colorAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_aAddress, out_a, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_vAddress, out_v, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_sAddress, out_s, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_hAddress, out_h, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1fv___3FJ(jint hsva_out__length, jfloat* hsva_out, jlong colorAddress) {
    UNUSED_PARAM(hsva_out__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1fv__JJ((intptr_t)hsva_out, colorAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray hsva_outAddress, jlong colorAddress) {
    jfloat *hsva_out = (*__env)->GetPrimitiveArrayCritical(__env, hsva_outAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1fv__JJ((intptr_t)hsva_out, colorAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hsva_outAddress, hsva_out, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1vec2v___3FJ(jint xy__length, jfloat* xy, jlong __result) {
    UNUSED_PARAM(xy__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1vec2v__JJ((intptr_t)xy, __result);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1vec2v___3FJ(JNIEnv *__env, jclass clazz, jfloatArray xyAddress, jlong __result) {
    jfloat *xy = (*__env)->GetPrimitiveArrayCritical(__env, xyAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1vec2v__JJ((intptr_t)xy, __result);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xyAddress, xy, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1vec2iv___3IJ(jint xy__length, jint* xy, jlong __result) {
    UNUSED_PARAM(xy__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1vec2iv__JJ((intptr_t)xy, __result);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1vec2iv___3IJ(JNIEnv *__env, jclass clazz, jintArray xyAddress, jlong __result) {
    jint *xy = (*__env)->GetPrimitiveArrayCritical(__env, xyAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1vec2iv__JJ((intptr_t)xy, __result);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xyAddress, xy, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rectv___3FJ(jint xywh__length, jfloat* xywh, jlong __result) {
    UNUSED_PARAM(xywh__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rectv__JJ((intptr_t)xywh, __result);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rectv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray xywhAddress, jlong __result) {
    jfloat *xywh = (*__env)->GetPrimitiveArrayCritical(__env, xywhAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rectv__JJ((intptr_t)xywh, __result);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xywhAddress, xywh, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rectiv___3IJ(jint xywh__length, jint* xywh, jlong __result) {
    UNUSED_PARAM(xywh__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rectiv__JJ((intptr_t)xywh, __result);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rectiv___3IJ(JNIEnv *__env, jclass clazz, jintArray xywhAddress, jlong __result) {
    jint *xywh = (*__env)->GetPrimitiveArrayCritical(__env, xywhAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rectiv__JJ((intptr_t)xywh, __result);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xywhAddress, xywh, 0);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1string__JJ_3I(jlong strAddress, jlong patternAddress, jint out_score__length, jint* out_score) {
    UNUSED_PARAM(out_score__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1string__JJJ(strAddress, patternAddress, (intptr_t)out_score);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1string__JJ_3I(JNIEnv *__env, jclass clazz, jlong strAddress, jlong patternAddress, jintArray out_scoreAddress) {
    jint __result;
    jint *out_score = (*__env)->GetPrimitiveArrayCritical(__env, out_scoreAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1string__JJJ(strAddress, patternAddress, (intptr_t)out_score);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_scoreAddress, out_score, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1text__JIJ_3I(jlong txtAddress, jint txt_len, jlong patternAddress, jint out_score__length, jint* out_score) {
    UNUSED_PARAM(out_score__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1text__JIJJ(txtAddress, txt_len, patternAddress, (intptr_t)out_score);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1text__JIJ_3I(JNIEnv *__env, jclass clazz, jlong txtAddress, jint txt_len, jlong patternAddress, jintArray out_scoreAddress) {
    jint __result;
    jint *out_score = (*__env)->GetPrimitiveArrayCritical(__env, out_scoreAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1text__JIJJ(txtAddress, txt_len, patternAddress, (intptr_t)out_score);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_scoreAddress, out_score, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1utf_1decode__J_3II(jlong cAddress, jint u__length, jint* u, jint clen) {
    UNUSED_PARAM(u__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1utf_1decode__JJI(cAddress, (intptr_t)u, clen);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1utf_1decode__J_3II(JNIEnv *__env, jclass clazz, jlong cAddress, jintArray uAddress, jint clen) {
    jint __result;
    jint *u = (*__env)->GetPrimitiveArrayCritical(__env, uAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1utf_1decode__JJI(cAddress, (intptr_t)u, clen);
    (*__env)->ReleasePrimitiveArrayCritical(__env, uAddress, u, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1utf_1at__JII_3IJ(jlong bufferAddress, jint length, jint index, jint unicode__length, jint* unicode, jlong lenAddress) {
    UNUSED_PARAM(unicode__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1utf_1at__JIIJJ(bufferAddress, length, index, (intptr_t)unicode, lenAddress);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1utf_1at__JII_3IJ(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint length, jint index, jintArray unicodeAddress, jlong lenAddress) {
    jlong __result;
    jint *unicode = (*__env)->GetPrimitiveArrayCritical(__env, unicodeAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1utf_1at__JIIJJ(bufferAddress, length, index, (intptr_t)unicode, lenAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, unicodeAddress, unicode, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1runes__J_3II(jlong sAddress, jint runes__length, jint* runes, jint len) {
    UNUSED_PARAM(runes__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1runes__JJI(sAddress, (intptr_t)runes, len);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1runes__J_3II(JNIEnv *__env, jclass clazz, jlong sAddress, jintArray runesAddress, jint len) {
    jint __result;
    jint *runes = (*__env)->GetPrimitiveArrayCritical(__env, runesAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1runes__JJI(sAddress, (intptr_t)runes, len);
    (*__env)->ReleasePrimitiveArrayCritical(__env, runesAddress, runes, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1runes__J_3I(jlong sAddress, jint runes__length, jint* runes) {
    UNUSED_PARAM(runes__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1runes__JJ(sAddress, (intptr_t)runes);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1runes__J_3I(JNIEnv *__env, jclass clazz, jlong sAddress, jintArray runesAddress) {
    jint __result;
    jint *runes = (*__env)->GetPrimitiveArrayCritical(__env, runesAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1runes__JJ(sAddress, (intptr_t)runes);
    (*__env)->ReleasePrimitiveArrayCritical(__env, runesAddress, runes, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1runes__JI_3II(jlong sAddress, jint pos, jint runes__length, jint* runes, jint len) {
    UNUSED_PARAM(runes__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1runes__JIJI(sAddress, pos, (intptr_t)runes, len);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1runes__JI_3II(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jintArray runesAddress, jint len) {
    jint __result;
    jint *runes = (*__env)->GetPrimitiveArrayCritical(__env, runesAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1runes__JIJI(sAddress, pos, (intptr_t)runes, len);
    (*__env)->ReleasePrimitiveArrayCritical(__env, runesAddress, runes, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1runes__JI_3I(jlong sAddress, jint pos, jint runes__length, jint* runes) {
    UNUSED_PARAM(runes__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1runes__JIJ(sAddress, pos, (intptr_t)runes);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1runes__JI_3I(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jintArray runesAddress) {
    jint __result;
    jint *runes = (*__env)->GetPrimitiveArrayCritical(__env, runesAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1runes__JIJ(sAddress, pos, (intptr_t)runes);
    (*__env)->ReleasePrimitiveArrayCritical(__env, runesAddress, runes, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1rune__JI_3IJ(jlong sAddress, jint pos, jint unicode__length, jint* unicode, jlong lenAddress) {
    UNUSED_PARAM(unicode__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1rune__JIJJ(sAddress, pos, (intptr_t)unicode, lenAddress);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1rune__JI_3IJ(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jintArray unicodeAddress, jlong lenAddress) {
    jlong __result;
    jint *unicode = (*__env)->GetPrimitiveArrayCritical(__env, unicodeAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1rune__JIJJ(sAddress, pos, (intptr_t)unicode, lenAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, unicodeAddress, unicode, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1const__JI_3IJ(jlong sAddress, jint pos, jint unicode__length, jint* unicode, jlong lenAddress) {
    UNUSED_PARAM(unicode__length)
    return JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1const__JIJJ(sAddress, pos, (intptr_t)unicode, lenAddress);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1const__JI_3IJ(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jintArray unicodeAddress, jlong lenAddress) {
    jlong __result;
    jint *unicode = (*__env)->GetPrimitiveArrayCritical(__env, unicodeAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1const__JIJJ(sAddress, pos, (intptr_t)unicode, lenAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, unicodeAddress, unicode, 0);
    return __result;
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polyline__J_3FIFJ(jlong bAddress, jint points__length, jfloat* points, jint point_count, jfloat line_thickness, jlong colAddress) {
    UNUSED_PARAM(points__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polyline__JJIFJ(bAddress, (intptr_t)points, point_count, line_thickness, colAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polyline__J_3FIFJ(JNIEnv *__env, jclass clazz, jlong bAddress, jfloatArray pointsAddress, jint point_count, jfloat line_thickness, jlong colAddress) {
    jfloat *points = (*__env)->GetPrimitiveArrayCritical(__env, pointsAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polyline__JJIFJ(bAddress, (intptr_t)points, point_count, line_thickness, colAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, pointsAddress, points, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polygon__J_3FIFJ(jlong bAddress, jint points__length, jfloat* points, jint point_count, jfloat line_thickness, jlong colorAddress) {
    UNUSED_PARAM(points__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polygon__JJIFJ(bAddress, (intptr_t)points, point_count, line_thickness, colorAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polygon__J_3FIFJ(JNIEnv *__env, jclass clazz, jlong bAddress, jfloatArray pointsAddress, jint point_count, jfloat line_thickness, jlong colorAddress) {
    jfloat *points = (*__env)->GetPrimitiveArrayCritical(__env, pointsAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polygon__JJIFJ(bAddress, (intptr_t)points, point_count, line_thickness, colorAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, pointsAddress, points, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1fill_1polygon__J_3FIJ(jlong bAddress, jint points__length, jfloat* points, jint point_count, jlong colorAddress) {
    UNUSED_PARAM(points__length)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1fill_1polygon__JJIJ(bAddress, (intptr_t)points, point_count, colorAddress);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1polygon__J_3FIJ(JNIEnv *__env, jclass clazz, jlong bAddress, jfloatArray pointsAddress, jint point_count, jlong colorAddress) {
    jfloat *points = (*__env)->GetPrimitiveArrayCritical(__env, pointsAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1fill_1polygon__JJIJ(bAddress, (intptr_t)points, point_count, colorAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, pointsAddress, points, 0);
}

EXTERN_C_EXIT
