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
#define NK_INCLUDE_STANDARD_BOOL
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
#define NK_INV_SQRT(expr) (1.0f / sqrt(expr))
#define NK_SIN sinf
#define NK_COS cosf
#include <math.h>
#include <string.h>
#include "nuklear.h"
typedef float(*nk_value_getter)(void* user, int index);
typedef void(*nk_item_getter)(void*, int, const char**);
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1init_1fixed(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong memoryAddress, jlong size, jlong fontAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    void *memory = (void *)(uintptr_t)memoryAddress;
    struct nk_user_font const *font = (struct nk_user_font const *)(uintptr_t)fontAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_init_fixed(ctx, memory, (nk_size)size, font);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1init(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong allocatorAddress, jlong fontAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_allocator *allocator = (struct nk_allocator *)(uintptr_t)allocatorAddress;
    struct nk_user_font const *font = (struct nk_user_font const *)(uintptr_t)fontAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_init(ctx, allocator, font);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1init_1custom(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong cmdsAddress, jlong poolAddress, jlong fontAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_buffer *cmds = (struct nk_buffer *)(uintptr_t)cmdsAddress;
    struct nk_buffer *pool = (struct nk_buffer *)(uintptr_t)poolAddress;
    struct nk_user_font const *font = (struct nk_user_font const *)(uintptr_t)fontAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_init_custom(ctx, cmds, pool, font);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1clear(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_clear(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1free(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_free(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1set_1user_1data(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong handleAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    nk_handle *handle = (nk_handle *)(uintptr_t)handleAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_set_user_data(ctx, *handle);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong titleAddress, jlong boundsAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    struct nk_rect *bounds = (struct nk_rect *)(uintptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_begin(ctx, title, *bounds, (nk_flags)flags);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1begin_1titled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jlong titleAddress, jlong boundsAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    struct nk_rect *bounds = (struct nk_rect *)(uintptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_begin_titled(ctx, name, title, *bounds, (nk_flags)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_end(ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1find(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk_window_find(ctx, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1bounds(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context const *ctx = (struct nk_context const *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(uintptr_t)__result) = nk_window_get_bounds(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1position(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context const *ctx = (struct nk_context const *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(uintptr_t)__result) = nk_window_get_position(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1size(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context const *ctx = (struct nk_context const *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(uintptr_t)__result) = nk_window_get_size(ctx);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1width(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context const *ctx = (struct nk_context const *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nk_window_get_width(ctx);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1height(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context const *ctx = (struct nk_context const *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nk_window_get_height(ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1panel(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk_window_get_panel(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(uintptr_t)__result) = nk_window_get_content_region(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region_1min(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(uintptr_t)__result) = nk_window_get_content_region_min(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region_1max(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(uintptr_t)__result) = nk_window_get_content_region_max(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region_1size(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(uintptr_t)__result) = nk_window_get_content_region_size(ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1canvas(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk_window_get_canvas(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1scroll__JJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong offset_xAddress, jlong offset_yAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    nk_uint *offset_x = (nk_uint *)(uintptr_t)offset_xAddress;
    nk_uint *offset_y = (nk_uint *)(uintptr_t)offset_yAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_get_scroll(ctx, offset_x, offset_y);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1has_1focus(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context const *ctx = (struct nk_context const *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_window_has_focus(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1collapsed(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_window_is_collapsed(ctx, name);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1closed(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_window_is_closed(ctx, name);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1hidden(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_window_is_hidden(ctx, name);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1active(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_window_is_active(ctx, name);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1hovered(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_window_is_hovered(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1any_1hovered(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_window_is_any_hovered(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1item_1is_1any_1active(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_item_is_any_active(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1bounds(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jlong boundsAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    struct nk_rect *bounds = (struct nk_rect *)(uintptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_set_bounds(ctx, name, *bounds);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1position(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jlong positionAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    struct nk_vec2 *position = (struct nk_vec2 *)(uintptr_t)positionAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_set_position(ctx, name, *position);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1size(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_set_size(ctx, name, *size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1focus(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_set_focus(ctx, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1scroll(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint offset_x, jint offset_y) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_set_scroll(ctx, (nk_uint)offset_x, (nk_uint)offset_y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1close(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_close(ctx, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1collapse(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint c) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_collapse(ctx, name, (enum nk_collapse_states)c);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1collapse_1if(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint c, jboolean cond) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_collapse_if(ctx, name, (enum nk_collapse_states)c, (nk_bool)cond);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1show(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint s) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_show(ctx, name, (enum nk_show_states)s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1show_1if(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint s, jboolean cond) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_show_if(ctx, name, (enum nk_show_states)s, (nk_bool)cond);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1set_1min_1row_1height(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat height) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_set_min_row_height(ctx, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1reset_1min_1row_1height(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_reset_min_row_height(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1widget_1bounds(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(uintptr_t)__result) = nk_layout_widget_bounds(ctx);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1ratio_1from_1pixel(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat pixel_width) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nk_layout_ratio_from_pixel(ctx, pixel_width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1dynamic(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat height, jint cols) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_dynamic(ctx, height, (nk_int)cols);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1static(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat height, jint item_width, jint cols) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_static(ctx, height, (nk_int)item_width, (nk_int)cols);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint fmt, jfloat row_height, jint cols) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_begin(ctx, (enum nk_layout_format)fmt, row_height, (nk_int)cols);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1push(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_push(ctx, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_end(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row__JIFIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint fmt, jfloat height, jint cols, jlong ratioAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    float const *ratio = (float const *)(uintptr_t)ratioAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row(ctx, (enum nk_layout_format)fmt, height, (nk_int)cols, ratio);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat height) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_template_begin(ctx, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1push_1dynamic(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_template_push_dynamic(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1push_1variable(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat min_width) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_template_push_variable(ctx, min_width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1push_1static(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat width) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_template_push_static(ctx, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_template_end(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint fmt, jfloat height, jint widget_count) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_space_begin(ctx, (enum nk_layout_format)fmt, height, (nk_int)widget_count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1push(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong rectAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_space_push(ctx, *rect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_space_end(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1bounds(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(uintptr_t)__result) = nk_layout_space_bounds(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1to_1screen(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong retAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_vec2 *ret = (struct nk_vec2 *)(uintptr_t)retAddress;
    UNUSED_PARAMS(__env, clazz)
    *ret = nk_layout_space_to_screen(ctx, *ret);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1to_1local(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong retAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_vec2 *ret = (struct nk_vec2 *)(uintptr_t)retAddress;
    UNUSED_PARAMS(__env, clazz)
    *ret = nk_layout_space_to_local(ctx, *ret);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1rect_1to_1screen(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong retAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_rect *ret = (struct nk_rect *)(uintptr_t)retAddress;
    UNUSED_PARAMS(__env, clazz)
    *ret = nk_layout_space_rect_to_screen(ctx, *ret);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1rect_1to_1local(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong retAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_rect *ret = (struct nk_rect *)(uintptr_t)retAddress;
    UNUSED_PARAMS(__env, clazz)
    *ret = nk_layout_space_rect_to_local(ctx, *ret);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1spacer(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_spacer(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong titleAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_group_begin(ctx, title, (nk_flags)flags);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1begin_1titled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jlong titleAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_group_begin_titled(ctx, name, title, (nk_flags)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_group_end(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1offset_1begin__JJJJI(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong x_offsetAddress, jlong y_offsetAddress, jlong titleAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    nk_uint *x_offset = (nk_uint *)(uintptr_t)x_offsetAddress;
    nk_uint *y_offset = (nk_uint *)(uintptr_t)y_offsetAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_group_scrolled_offset_begin(ctx, x_offset, y_offset, title, (nk_flags)flags);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong scrollAddress, jlong titleAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_scroll *scroll = (struct nk_scroll *)(uintptr_t)scrollAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_group_scrolled_begin(ctx, scroll, title, (nk_flags)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_group_scrolled_end(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1get_1scroll__JJJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong idAddress, jlong x_offsetAddress, jlong y_offsetAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *id = (char const *)(uintptr_t)idAddress;
    nk_uint *x_offset = (nk_uint *)(uintptr_t)x_offsetAddress;
    nk_uint *y_offset = (nk_uint *)(uintptr_t)y_offsetAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_group_get_scroll(ctx, id, x_offset, y_offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1set_1scroll(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong idAddress, jint x_offset, jint y_offset) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *id = (char const *)(uintptr_t)idAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_group_set_scroll(ctx, id, (nk_uint)x_offset, (nk_uint)y_offset);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1list_1view_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong viewAddress, jlong titleAddress, jint flags, jint row_height, jint row_count) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_list_view *view = (struct nk_list_view *)(uintptr_t)viewAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_list_view_begin(ctx, view, title, (nk_flags)flags, row_height, row_count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1list_1view_1end(JNIEnv *__env, jclass clazz, jlong viewAddress) {
    struct nk_list_view *view = (struct nk_list_view *)(uintptr_t)viewAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_list_view_end(view);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1push_1hashed(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong titleAddress, jint initial_state, jlong hashAddress, jint len, jint seed) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    char const *hash = (char const *)(uintptr_t)hashAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_tree_push_hashed(ctx, (enum nk_tree_type)type, title, (enum nk_collapse_states)initial_state, hash, (nk_int)len, (nk_int)seed);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1image_1push_1hashed(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong imgAddress, jlong titleAddress, jint initial_state, jlong hashAddress, jint len, jint seed) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    char const *hash = (char const *)(uintptr_t)hashAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_tree_image_push_hashed(ctx, (enum nk_tree_type)type, *img, title, (enum nk_collapse_states)initial_state, hash, (nk_int)len, (nk_int)seed);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1pop(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_tree_pop(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1push__JIJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong titleAddress, jlong stateAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    enum nk_collapse_states *state = (enum nk_collapse_states *)(uintptr_t)stateAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_tree_state_push(ctx, (enum nk_tree_type)type, title, state);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1image_1push__JIJJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong imageAddress, jlong titleAddress, jlong stateAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *image = (struct nk_image *)(uintptr_t)imageAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    enum nk_collapse_states *state = (enum nk_collapse_states *)(uintptr_t)stateAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_tree_state_image_push(ctx, (enum nk_tree_type)type, *image, title, state);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1pop(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_tree_state_pop(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1push_1hashed(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong titleAddress, jint initial_state, jlong selectedAddress, jlong hashAddress, jint len, jint seed) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    nk_bool *selected = (nk_bool *)(uintptr_t)selectedAddress;
    char const *hash = (char const *)(uintptr_t)hashAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_tree_element_push_hashed(ctx, (enum nk_tree_type)type, title, (enum nk_collapse_states)initial_state, selected, hash, len, seed);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1image_1push_1hashed(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong imgAddress, jlong titleAddress, jint initial_state, jlong selectedAddress, jlong hashAddress, jint len, jint seed) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    nk_bool *selected = (nk_bool *)(uintptr_t)selectedAddress;
    char const *hash = (char const *)(uintptr_t)hashAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_tree_element_image_push_hashed(ctx, (enum nk_tree_type)type, *img, title, (enum nk_collapse_states)initial_state, selected, hash, len, seed);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1element_1pop(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_tree_element_pop(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_text(ctx, str, (nk_int)len, (nk_flags)alignment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1text_1colored(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint alignment, jlong colorAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_text_colored(ctx, str, (nk_int)len, (nk_flags)alignment, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1text_1wrap(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_text_wrap(ctx, str, (nk_int)len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1text_1wrap_1colored(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jlong colorAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_text_wrap_colored(ctx, str, (nk_int)len, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint align) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_label(ctx, str, (nk_flags)align);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1label_1colored(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint align, jlong colorAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_label_colored(ctx, str, (nk_flags)align, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1label_1wrap(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_label_wrap(ctx, str);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1label_1colored_1wrap(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jlong colorAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_label_colored_wrap(ctx, str, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1image(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_image(ctx, *img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1image_1color(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong colorAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_image_color(ctx, *img, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1set_1behavior(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint behavior) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_button_set_behavior(ctx, (enum nk_button_behavior)behavior);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1push_1behavior(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint behavior) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_push_behavior(ctx, (enum nk_button_behavior)behavior);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1pop_1behavior(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_pop_behavior(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong titleAddress, jint len) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_text(ctx, title, (nk_int)len);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong titleAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_label(ctx, title);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1color(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong colorAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_color(ctx, *color);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_symbol(ctx, (enum nk_symbol_type)symbol);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1image(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_image(ctx, *img);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint text_alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_symbol_label(ctx, (enum nk_symbol_type)symbol, text, (nk_flags)text_alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_symbol_text(ctx, (enum nk_symbol_type)symbol, text, (nk_int)len, (nk_flags)alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint text_alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_image_label(ctx, *img, text, (nk_flags)text_alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_image_text(ctx, *img, text, (nk_int)len, (nk_flags)alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1text_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jlong titleAddress, jint len) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_style_button const *style = (struct nk_style_button const *)(uintptr_t)styleAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_text_styled(ctx, style, title, len);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1label_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jlong titleAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_style_button const *style = (struct nk_style_button const *)(uintptr_t)styleAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_label_styled(ctx, style, title);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jint symbol) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_style_button const *style = (struct nk_style_button const *)(uintptr_t)styleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_symbol_styled(ctx, style, (enum nk_symbol_type)symbol);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jlong imgAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_style_button const *style = (struct nk_style_button const *)(uintptr_t)styleAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_image_styled(ctx, style, *img);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1text_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jint symbol, jlong titleAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_style_button const *style = (struct nk_style_button const *)(uintptr_t)styleAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_symbol_text_styled(ctx, style, (enum nk_symbol_type)symbol, title, len, (nk_flags)alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1label_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jint symbol, jlong titleAddress, jint text_alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_style_button const *style = (struct nk_style_button const *)(uintptr_t)styleAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_symbol_label_styled(ctx, style, (enum nk_symbol_type)symbol, title, (nk_flags)text_alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1label_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jlong imgAddress, jlong titleAddress, jint text_alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_style_button const *style = (struct nk_style_button const *)(uintptr_t)styleAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_image_label_styled(ctx, style, *img, title, (nk_flags)text_alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1text_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jlong imgAddress, jlong titleAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_style_button const *style = (struct nk_style_button const *)(uintptr_t)styleAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_button_image_text_styled(ctx, style, *img, title, len, (nk_flags)alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1check_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jboolean active) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_check_label(ctx, str, (nk_bool)active);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1check_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jboolean active) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_check_text(ctx, str, len, (nk_bool)active);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1check_1flags_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint flags, jint value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_check_flags_label(ctx, str, (unsigned int)flags, (unsigned int)value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1check_1flags_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint flags, jint value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_check_flags_text(ctx, str, len, (unsigned int)flags, (unsigned int)value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jlong activeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    nk_bool *active = (nk_bool *)(uintptr_t)activeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_checkbox_label(ctx, str, active);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jlong activeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    nk_bool *active = (nk_bool *)(uintptr_t)activeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_checkbox_text(ctx, str, len, active);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1label__JJJI(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jlong flagsAddress, jint value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    unsigned int *flags = (unsigned int *)(uintptr_t)flagsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_checkbox_flags_label(ctx, str, flags, (unsigned int)value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1text__JJIJI(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jlong flagsAddress, jint value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    unsigned int *flags = (unsigned int *)(uintptr_t)flagsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_checkbox_flags_text(ctx, str, len, flags, (unsigned int)value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1radio_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jlong activeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    nk_bool *active = (nk_bool *)(uintptr_t)activeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_radio_label(ctx, str, active);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1radio_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jlong activeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    nk_bool *active = (nk_bool *)(uintptr_t)activeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_radio_text(ctx, str, len, active);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1option_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jboolean active) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_option_label(ctx, str, (nk_bool)active);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1option_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jboolean active) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_option_text(ctx, str, len, (nk_bool)active);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint align, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    nk_bool *value = (nk_bool *)(uintptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_selectable_label(ctx, str, (nk_flags)align, value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint align, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    nk_bool *value = (nk_bool *)(uintptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_selectable_text(ctx, str, len, (nk_flags)align, value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong strAddress, jint align, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    nk_bool *value = (nk_bool *)(uintptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_selectable_image_label(ctx, *img, str, (nk_flags)align, value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong strAddress, jint len, jint align, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    nk_bool *value = (nk_bool *)(uintptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_selectable_image_text(ctx, *img, str, len, (nk_flags)align, value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong strAddress, jint align, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    nk_bool *value = (nk_bool *)(uintptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_selectable_symbol_label(ctx, (enum nk_symbol_type)symbol, str, (nk_flags)align, value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong strAddress, jint len, jint align, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    nk_bool *value = (nk_bool *)(uintptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_selectable_symbol_text(ctx, (enum nk_symbol_type)symbol, str, len, (nk_flags)align, value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1select_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint align, jboolean value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_select_label(ctx, str, (nk_flags)align, (nk_bool)value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1select_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint align, jboolean value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_select_text(ctx, str, len, (nk_flags)align, (nk_bool)value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1select_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong strAddress, jint align, jboolean value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_select_image_label(ctx, *img, str, (nk_flags)align, (nk_bool)value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1select_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong strAddress, jint len, jint align, jboolean value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_select_image_text(ctx, *img, str, len, (nk_flags)align, (nk_bool)value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1select_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong strAddress, jint align, jboolean value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_select_symbol_label(ctx, (enum nk_symbol_type)symbol, str, (nk_flags)align, (nk_bool)value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1select_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong strAddress, jint len, jint align, jboolean value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_select_symbol_text(ctx, (enum nk_symbol_type)symbol, str, len, (nk_flags)align, (nk_bool)value);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1slide_1float(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat min, jfloat val, jfloat max, jfloat step) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nk_slide_float(ctx, min, val, max, step);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1slide_1int(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint min, jint val, jint max, jint step) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_slide_int(ctx, min, val, max, step);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1slider_1float__JFJFF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat min, jlong valAddress, jfloat max, jfloat step) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    float *val = (float *)(uintptr_t)valAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_slider_float(ctx, min, val, max, step);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1slider_1int__JIJII(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint min, jlong valAddress, jint max, jint step) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    int *val = (int *)(uintptr_t)valAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_slider_int(ctx, min, val, max, step);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1progress(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong curAddress, jlong max, jboolean modifyable) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    nk_size *cur = (nk_size *)(uintptr_t)curAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_progress(ctx, cur, (nk_size)max, (nk_bool)modifyable);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1prog(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong cur, jlong max, jboolean modifyable) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)nk_prog(ctx, (nk_size)cur, (nk_size)max, (nk_bool)modifyable);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1picker(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong colorAddress, jint fmt) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_colorf *color = (struct nk_colorf *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    *color = nk_color_picker(ctx, *color, (enum nk_color_format)fmt);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1pick(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong colorAddress, jint fmt) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_colorf *color = (struct nk_colorf *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_color_pick(ctx, color, (enum nk_color_format)fmt);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1property_1int__JJIJIIF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint min, jlong valAddress, jint max, jint step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    int *val = (int *)(uintptr_t)valAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_property_int(ctx, name, min, val, max, step, inc_per_pixel);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1property_1float__JJFJFFF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jfloat min, jlong valAddress, jfloat max, jfloat step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    float *val = (float *)(uintptr_t)valAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_property_float(ctx, name, min, val, max, step, inc_per_pixel);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1property_1double__JJDJDDF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jdouble min, jlong valAddress, jdouble max, jdouble step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    double *val = (double *)(uintptr_t)valAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_property_double(ctx, name, min, val, max, step, inc_per_pixel);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1propertyi(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint min, jint val, jint max, jint step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_propertyi(ctx, name, min, val, max, step, inc_per_pixel);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1propertyf(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jfloat min, jfloat val, jfloat max, jfloat step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nk_propertyf(ctx, name, min, val, max, step, inc_per_pixel);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1propertyd(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jdouble min, jdouble val, jdouble max, jdouble step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jdouble)nk_propertyd(ctx, name, min, val, max, step, inc_per_pixel);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1edit_1focus(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_edit_focus(ctx, (nk_flags)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1edit_1unfocus(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_edit_unfocus(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1edit_1string__JIJJIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint flags, jlong memoryAddress, jlong lenAddress, jint max, jlong filterAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char *memory = (char *)(uintptr_t)memoryAddress;
    int *len = (int *)(uintptr_t)lenAddress;
    nk_plugin_filter filter = (nk_plugin_filter)(uintptr_t)filterAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_edit_string(ctx, (nk_flags)flags, memory, len, max, filter);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1edit_1buffer(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint flags, jlong editAddress, jlong filterAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_text_edit *edit = (struct nk_text_edit *)(uintptr_t)editAddress;
    nk_plugin_filter filter = (nk_plugin_filter)(uintptr_t)filterAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_edit_buffer(ctx, (nk_flags)flags, edit, filter);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1edit_1string_1zero_1terminated(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint flags, jlong bufferAddress, jint max, jlong filterAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char *buffer = (char *)(uintptr_t)bufferAddress;
    nk_plugin_filter filter = (nk_plugin_filter)(uintptr_t)filterAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_edit_string_zero_terminated(ctx, (nk_flags)flags, buffer, max, filter);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jint num, jfloat min, jfloat max) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_chart_begin(ctx, (enum nk_chart_type)type, num, min, max);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1begin_1colored(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong colorAddress, jlong activeAddress, jint num, jfloat min, jfloat max) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    struct nk_color *active = (struct nk_color *)(uintptr_t)activeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_chart_begin_colored(ctx, (enum nk_chart_type)type, *color, *active, num, min, max);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1add_1slot(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jint count, jfloat min_value, jfloat max_value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_chart_add_slot(ctx, (enum nk_chart_type)type, count, min_value, max_value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1add_1slot_1colored(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong colorAddress, jlong activeAddress, jint count, jfloat min_value, jfloat max_value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    struct nk_color *active = (struct nk_color *)(uintptr_t)activeAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_chart_add_slot_colored(ctx, (enum nk_chart_type)type, *color, *active, count, min_value, max_value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1push(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_chart_push(ctx, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1push_1slot(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat value, jint slot) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_chart_push_slot(ctx, value, slot);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_chart_end(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1plot__JIJII(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong valuesAddress, jint count, jint offset) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    float const *values = (float const *)(uintptr_t)valuesAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_plot(ctx, (enum nk_chart_type)type, values, count, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1plot_1function(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong userdataAddress, jlong value_getterAddress, jint count, jint offset) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    void *userdata = (void *)(uintptr_t)userdataAddress;
    nk_value_getter value_getter = (nk_value_getter)(uintptr_t)value_getterAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_plot_function(ctx, (enum nk_chart_type)type, userdata, value_getter, count, offset);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1popup_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong titleAddress, jint flags, jlong rectAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_popup_begin(ctx, (enum nk_popup_type)type, title, (nk_flags)flags, *rect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1popup_1close(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_popup_close(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1popup_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_popup_end(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1popup_1get_1scroll__JJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong offset_xAddress, jlong offset_yAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    nk_uint *offset_x = (nk_uint *)(uintptr_t)offset_xAddress;
    nk_uint *offset_y = (nk_uint *)(uintptr_t)offset_yAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_popup_get_scroll(ctx, offset_x, offset_y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1popup_1set_1scroll(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint offset_x, jint offset_y) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_popup_set_scroll(ctx, (nk_uint)offset_x, (nk_uint)offset_y);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong itemsAddress, jint count, jint selected, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const **items = (char const **)(uintptr_t)itemsAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo(ctx, items, count, selected, item_height, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1separator(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong items_separated_by_separatorAddress, jint separator, jint selected, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *items_separated_by_separator = (char const *)(uintptr_t)items_separated_by_separatorAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_separator(ctx, items_separated_by_separator, separator, selected, count, item_height, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1string(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong items_separated_by_zerosAddress, jint selected, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *items_separated_by_zeros = (char const *)(uintptr_t)items_separated_by_zerosAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_string(ctx, items_separated_by_zeros, selected, count, item_height, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1callback(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong item_getterAddress, jlong userdataAddress, jint selected, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    nk_item_getter item_getter = (nk_item_getter)(uintptr_t)item_getterAddress;
    void *userdata = (void *)(uintptr_t)userdataAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_callback(ctx, item_getter, userdata, selected, count, item_height, *size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox__JJIJIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong itemsAddress, jint count, jlong selectedAddress, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const **items = (char const **)(uintptr_t)itemsAddress;
    int *selected = (int *)(uintptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_combobox(ctx, items, count, selected, item_height, *size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1string__JJJIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong items_separated_by_zerosAddress, jlong selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *items_separated_by_zeros = (char const *)(uintptr_t)items_separated_by_zerosAddress;
    int *selected = (int *)(uintptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_combobox_string(ctx, items_separated_by_zeros, selected, count, item_height, *size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1separator__JJIJIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong items_separated_by_separatorAddress, jint separator, jlong selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *items_separated_by_separator = (char const *)(uintptr_t)items_separated_by_separatorAddress;
    int *selected = (int *)(uintptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_combobox_separator(ctx, items_separated_by_separator, separator, selected, count, item_height, *size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1callback__JJJJIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong item_getterAddress, jlong userdataAddress, jlong selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    nk_item_getter item_getter = (nk_item_getter)(uintptr_t)item_getterAddress;
    void *userdata = (void *)(uintptr_t)userdataAddress;
    int *selected = (int *)(uintptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_combobox_callback(ctx, item_getter, userdata, selected, count, item_height, *size);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong selectedAddress, jint len, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *selected = (char const *)(uintptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_combo_begin_text(ctx, selected, len, *size);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong selectedAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *selected = (char const *)(uintptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_combo_begin_label(ctx, selected, *size);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1color(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong colorAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_combo_begin_color(ctx, *color, *size);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1symbol(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_combo_begin_symbol(ctx, (enum nk_symbol_type)symbol, *size);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong selectedAddress, jint symbol, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *selected = (char const *)(uintptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_combo_begin_symbol_label(ctx, selected, (enum nk_symbol_type)symbol, *size);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong selectedAddress, jint len, jint symbol, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *selected = (char const *)(uintptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_combo_begin_symbol_text(ctx, selected, len, (enum nk_symbol_type)symbol, *size);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1image(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_combo_begin_image(ctx, *img, *size);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong selectedAddress, jlong imgAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *selected = (char const *)(uintptr_t)selectedAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_combo_begin_image_label(ctx, selected, *img, *size);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong selectedAddress, jint len, jlong imgAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *selected = (char const *)(uintptr_t)selectedAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_combo_begin_image_text(ctx, selected, len, *img, *size);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_combo_item_label(ctx, text, (nk_flags)alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_combo_item_text(ctx, text, len, (nk_flags)alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_combo_item_image_label(ctx, *img, text, (nk_flags)alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_combo_item_image_text(ctx, *img, text, len, (nk_flags)alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_combo_item_symbol_label(ctx, (enum nk_symbol_type)symbol, text, (nk_flags)alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_combo_item_symbol_text(ctx, (enum nk_symbol_type)symbol, text, len, (nk_flags)alignment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1close(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_combo_close(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_combo_end(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint flags, jlong sizeAddress, jlong trigger_boundsAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    struct nk_rect *trigger_bounds = (struct nk_rect *)(uintptr_t)trigger_boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_contextual_begin(ctx, (nk_flags)flags, *size, *trigger_bounds);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint len, jint align) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_contextual_item_text(ctx, text, len, (nk_flags)align);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint align) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_contextual_item_label(ctx, text, (nk_flags)align);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_contextual_item_image_label(ctx, *img, text, (nk_flags)alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_contextual_item_image_text(ctx, *img, text, len, (nk_flags)alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_contextual_item_symbol_label(ctx, (enum nk_symbol_type)symbol, text, (nk_flags)alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_contextual_item_symbol_text(ctx, (enum nk_symbol_type)symbol, text, len, (nk_flags)alignment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1close(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_contextual_close(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_contextual_end(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tooltip(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_tooltip(ctx, text);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tooltip_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat width) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_tooltip_begin(ctx, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tooltip_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_tooltip_end(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menubar_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_menubar_begin(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menubar_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_menubar_end(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint len, jint align, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_menu_begin_text(ctx, text, len, (nk_flags)align, *size);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint align, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_menu_begin_label(ctx, text, (nk_flags)align, *size);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1image(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jlong imgAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_menu_begin_image(ctx, text, *img, *size);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint len, jint align, jlong imgAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_menu_begin_image_text(ctx, text, len, (nk_flags)align, *img, *size);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint align, jlong imgAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_menu_begin_image_label(ctx, text, (nk_flags)align, *img, *size);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1symbol(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint symbol, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_menu_begin_symbol(ctx, text, (enum nk_symbol_type)symbol, *size);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint len, jint align, jint symbol, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_menu_begin_symbol_text(ctx, text, len, (nk_flags)align, (enum nk_symbol_type)symbol, *size);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint align, jint symbol, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_menu_begin_symbol_label(ctx, text, (nk_flags)align, (enum nk_symbol_type)symbol, *size);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint len, jint align) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_menu_item_text(ctx, text, len, (nk_flags)align);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_menu_item_label(ctx, text, (nk_flags)alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_menu_item_image_label(ctx, *img, text, (nk_flags)alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_menu_item_image_text(ctx, *img, text, len, (nk_flags)alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_menu_item_symbol_text(ctx, (enum nk_symbol_type)symbol, text, len, (nk_flags)alignment);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_menu_item_symbol_label(ctx, (enum nk_symbol_type)symbol, text, (nk_flags)alignment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1close(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_menu_close(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_menu_end(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1convert(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong cmdsAddress, jlong verticesAddress, jlong elementsAddress, jlong configAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_buffer *cmds = (struct nk_buffer *)(uintptr_t)cmdsAddress;
    struct nk_buffer *vertices = (struct nk_buffer *)(uintptr_t)verticesAddress;
    struct nk_buffer *elements = (struct nk_buffer *)(uintptr_t)elementsAddress;
    struct nk_convert_config const *config = (struct nk_convert_config const *)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_convert(ctx, cmds, vertices, elements, config);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_input_begin(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1motion(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint x, jint y) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_input_motion(ctx, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1key(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint key, jboolean down) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_input_key(ctx, (enum nk_keys)key, (nk_bool)down);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1button(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint id, jint x, jint y, jboolean down) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_input_button(ctx, (enum nk_buttons)id, x, y, (nk_bool)down);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1scroll(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong valAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_vec2 *val = (struct nk_vec2 *)(uintptr_t)valAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_input_scroll(ctx, *val);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1char(JNIEnv *__env, jclass clazz, jlong ctxAddress, jbyte c) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_input_char(ctx, (char)c);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1glyph(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong glyphAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char *glyph = (char *)(uintptr_t)glyphAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_input_glyph(ctx, glyph);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1unicode(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint unicode) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_input_unicode(ctx, (nk_rune)unicode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_input_end(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1default(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_style_default(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1from_1table(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong tableAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_color const *table = (struct nk_color const *)(uintptr_t)tableAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_style_from_table(ctx, table);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1load_1cursor(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint style, jlong cursorAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_cursor *cursor = (struct nk_cursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_style_load_cursor(ctx, (enum nk_style_cursor)style, cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1load_1all_1cursors(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong cursorsAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_cursor *cursors = (struct nk_cursor *)(uintptr_t)cursorsAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_style_load_all_cursors(ctx, cursors);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1get_1color_1by_1name(JNIEnv *__env, jclass clazz, jint c) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk_style_get_color_by_name((enum nk_style_colors)c);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1set_1font(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong fontAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_user_font const *font = (struct nk_user_font const *)(uintptr_t)fontAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_style_set_font(ctx, font);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1set_1cursor(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint style) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_style_set_cursor(ctx, (enum nk_style_cursor)style);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1show_1cursor(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_style_show_cursor(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1hide_1cursor(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_style_hide_cursor(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1font(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong fontAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_user_font const *font = (struct nk_user_font const *)(uintptr_t)fontAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_style_push_font(ctx, font);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1float__JJF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong addressAddress, jfloat value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    float *address = (float *)(uintptr_t)addressAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_style_push_float(ctx, address, value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1vec2(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong addressAddress, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_vec2 *address = (struct nk_vec2 *)(uintptr_t)addressAddress;
    struct nk_vec2 *value = (struct nk_vec2 *)(uintptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_style_push_vec2(ctx, address, *value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1style_1item(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong addressAddress, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_style_item *address = (struct nk_style_item *)(uintptr_t)addressAddress;
    struct nk_style_item *value = (struct nk_style_item *)(uintptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_style_push_style_item(ctx, address, *value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1flags__JJI(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong addressAddress, jint value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    nk_flags *address = (nk_flags *)(uintptr_t)addressAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_style_push_flags(ctx, address, (nk_flags)value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1color(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong addressAddress, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_color *address = (struct nk_color *)(uintptr_t)addressAddress;
    struct nk_color *value = (struct nk_color *)(uintptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_style_push_color(ctx, address, *value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1font(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_style_pop_font(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1float(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_style_pop_float(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1vec2(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_style_pop_vec2(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1style_1item(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_style_pop_style_item(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1flags(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_style_pop_flags(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1color(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_style_pop_color(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1bounds(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(uintptr_t)__result) = nk_widget_bounds(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1position(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(uintptr_t)__result) = nk_widget_position(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1size(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(uintptr_t)__result) = nk_widget_size(ctx);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1width(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nk_widget_width(ctx);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1height(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nk_widget_height(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1is_1hovered(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_widget_is_hovered(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1is_1mouse_1clicked(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint btn) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_widget_is_mouse_clicked(ctx, (enum nk_buttons)btn);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1has_1mouse_1click_1down(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint btn, jboolean down) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_widget_has_mouse_click_down(ctx, (enum nk_buttons)btn, (nk_bool)down);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1spacing(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint cols) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_spacing(ctx, cols);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget(JNIEnv *__env, jclass clazz, jlong boundsAddress, jlong ctxAddress) {
    struct nk_rect *bounds = (struct nk_rect *)(uintptr_t)boundsAddress;
    struct nk_context const *ctx = (struct nk_context const *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_widget(bounds, ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1fitting(JNIEnv *__env, jclass clazz, jlong boundsAddress, jlong ctxAddress, jlong item_paddingAddress) {
    struct nk_rect *bounds = (struct nk_rect *)(uintptr_t)boundsAddress;
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_vec2 *item_padding = (struct nk_vec2 *)(uintptr_t)item_paddingAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_widget_fitting(bounds, ctx, *item_padding);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb(JNIEnv *__env, jclass clazz, jint r, jint g, jint b, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgb(r, g, b);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1iv__JJ(JNIEnv *__env, jclass clazz, jlong rgbAddress, jlong __result) {
    int const *rgb = (int const *)(uintptr_t)rgbAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgb_iv(rgb);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1bv(JNIEnv *__env, jclass clazz, jlong rgbAddress, jlong __result) {
    nk_byte const *rgb = (nk_byte const *)(uintptr_t)rgbAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgb_bv(rgb);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1f(JNIEnv *__env, jclass clazz, jfloat r, jfloat g, jfloat b, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgb_f(r, g, b);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1fv__JJ(JNIEnv *__env, jclass clazz, jlong rgbAddress, jlong __result) {
    float const *rgb = (float const *)(uintptr_t)rgbAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgb_fv(rgb);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1cf(JNIEnv *__env, jclass clazz, jlong cAddress, jlong __result) {
    struct nk_colorf *c = (struct nk_colorf *)(uintptr_t)cAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgb_cf(*c);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1hex(JNIEnv *__env, jclass clazz, jlong rgbAddress, jlong __result) {
    char const *rgb = (char const *)(uintptr_t)rgbAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgb_hex(rgb);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba(JNIEnv *__env, jclass clazz, jint r, jint g, jint b, jint a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgba(r, g, b, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1u32(JNIEnv *__env, jclass clazz, jint in, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgba_u32((nk_uint)in);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1iv__JJ(JNIEnv *__env, jclass clazz, jlong rgbaAddress, jlong __result) {
    int const *rgba = (int const *)(uintptr_t)rgbaAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgba_iv(rgba);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1bv(JNIEnv *__env, jclass clazz, jlong rgbaAddress, jlong __result) {
    nk_byte const *rgba = (nk_byte const *)(uintptr_t)rgbaAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgba_bv(rgba);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1f(JNIEnv *__env, jclass clazz, jfloat r, jfloat g, jfloat b, jfloat a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgba_f(r, g, b, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1fv__JJ(JNIEnv *__env, jclass clazz, jlong rgbaAddress, jlong __result) {
    float const *rgba = (float const *)(uintptr_t)rgbaAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgba_fv(rgba);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1cf(JNIEnv *__env, jclass clazz, jlong cAddress, jlong __result) {
    struct nk_colorf *c = (struct nk_colorf *)(uintptr_t)cAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgba_cf(*c);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1hex(JNIEnv *__env, jclass clazz, jlong rgbaAddress, jlong __result) {
    char const *rgba = (char const *)(uintptr_t)rgbaAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgba_hex(rgba);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1colorf(JNIEnv *__env, jclass clazz, jfloat h, jfloat s, jfloat v, jfloat a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_colorf*)(uintptr_t)__result) = nk_hsva_colorf(h, s, v, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1colorfv__JJ(JNIEnv *__env, jclass clazz, jlong cAddress, jlong __result) {
    float *c = (float *)(uintptr_t)cAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_colorf*)(uintptr_t)__result) = nk_hsva_colorfv(c);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1colorf_1hsva_1f__JJJJJ(JNIEnv *__env, jclass clazz, jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong out_aAddress, jlong inAddress) {
    float *out_h = (float *)(uintptr_t)out_hAddress;
    float *out_s = (float *)(uintptr_t)out_sAddress;
    float *out_v = (float *)(uintptr_t)out_vAddress;
    float *out_a = (float *)(uintptr_t)out_aAddress;
    struct nk_colorf *in = (struct nk_colorf *)(uintptr_t)inAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_colorf_hsva_f(out_h, out_s, out_v, out_a, *in);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1colorf_1hsva_1fv__JJ(JNIEnv *__env, jclass clazz, jlong hsvaAddress, jlong inAddress) {
    float *hsva = (float *)(uintptr_t)hsvaAddress;
    struct nk_colorf *in = (struct nk_colorf *)(uintptr_t)inAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_colorf_hsva_fv(hsva, *in);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv(JNIEnv *__env, jclass clazz, jint h, jint s, jint v, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_hsv(h, s, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1iv__JJ(JNIEnv *__env, jclass clazz, jlong hsvAddress, jlong __result) {
    int const *hsv = (int const *)(uintptr_t)hsvAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_hsv_iv(hsv);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1bv(JNIEnv *__env, jclass clazz, jlong hsvAddress, jlong __result) {
    nk_byte const *hsv = (nk_byte const *)(uintptr_t)hsvAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_hsv_bv(hsv);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1f(JNIEnv *__env, jclass clazz, jfloat h, jfloat s, jfloat v, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_hsv_f(h, s, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1fv__JJ(JNIEnv *__env, jclass clazz, jlong hsvAddress, jlong __result) {
    float const *hsv = (float const *)(uintptr_t)hsvAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_hsv_fv(hsv);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva(JNIEnv *__env, jclass clazz, jint h, jint s, jint v, jint a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_hsva(h, s, v, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1iv__JJ(JNIEnv *__env, jclass clazz, jlong hsvaAddress, jlong __result) {
    int const *hsva = (int const *)(uintptr_t)hsvaAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_hsva_iv(hsva);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1bv(JNIEnv *__env, jclass clazz, jlong hsvaAddress, jlong __result) {
    nk_byte const *hsva = (nk_byte const *)(uintptr_t)hsvaAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_hsva_bv(hsva);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1f(JNIEnv *__env, jclass clazz, jfloat h, jfloat s, jfloat v, jfloat a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_hsva_f(h, s, v, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1fv__JJ(JNIEnv *__env, jclass clazz, jlong hsvaAddress, jlong __result) {
    float const *hsva = (float const *)(uintptr_t)hsvaAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_hsva_fv(hsva);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1f__JJJJJ(JNIEnv *__env, jclass clazz, jlong rAddress, jlong gAddress, jlong bAddress, jlong aAddress, jlong colorAddress) {
    float *r = (float *)(uintptr_t)rAddress;
    float *g = (float *)(uintptr_t)gAddress;
    float *b = (float *)(uintptr_t)bAddress;
    float *a = (float *)(uintptr_t)aAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_f(r, g, b, a, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1fv__JJ(JNIEnv *__env, jclass clazz, jlong rgba_outAddress, jlong colorAddress) {
    float *rgba_out = (float *)(uintptr_t)rgba_outAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_fv(rgba_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1cf(JNIEnv *__env, jclass clazz, jlong colorAddress, jlong __result) {
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_colorf*)(uintptr_t)__result) = nk_color_cf(*color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1d__JJJJJ(JNIEnv *__env, jclass clazz, jlong rAddress, jlong gAddress, jlong bAddress, jlong aAddress, jlong colorAddress) {
    double *r = (double *)(uintptr_t)rAddress;
    double *g = (double *)(uintptr_t)gAddress;
    double *b = (double *)(uintptr_t)bAddress;
    double *a = (double *)(uintptr_t)aAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_d(r, g, b, a, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1dv__JJ(JNIEnv *__env, jclass clazz, jlong rgba_outAddress, jlong colorAddress) {
    double *rgba_out = (double *)(uintptr_t)rgba_outAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_dv(rgba_out, *color);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1u32(JNIEnv *__env, jclass clazz, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_color_u32(*color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hex_1rgba(JNIEnv *__env, jclass clazz, jlong outputAddress, jlong colorAddress) {
    char *output = (char *)(uintptr_t)outputAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hex_rgba(output, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hex_1rgb(JNIEnv *__env, jclass clazz, jlong outputAddress, jlong colorAddress) {
    char *output = (char *)(uintptr_t)outputAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hex_rgb(output, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1i__JJJJ(JNIEnv *__env, jclass clazz, jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong colorAddress) {
    int *out_h = (int *)(uintptr_t)out_hAddress;
    int *out_s = (int *)(uintptr_t)out_sAddress;
    int *out_v = (int *)(uintptr_t)out_vAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_i(out_h, out_s, out_v, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1b(JNIEnv *__env, jclass clazz, jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong colorAddress) {
    nk_byte *out_h = (nk_byte *)(uintptr_t)out_hAddress;
    nk_byte *out_s = (nk_byte *)(uintptr_t)out_sAddress;
    nk_byte *out_v = (nk_byte *)(uintptr_t)out_vAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_b(out_h, out_s, out_v, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1iv__JJ(JNIEnv *__env, jclass clazz, jlong hsv_outAddress, jlong colorAddress) {
    int *hsv_out = (int *)(uintptr_t)hsv_outAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_iv(hsv_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1bv(JNIEnv *__env, jclass clazz, jlong hsv_outAddress, jlong colorAddress) {
    nk_byte *hsv_out = (nk_byte *)(uintptr_t)hsv_outAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_bv(hsv_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1f__JJJJ(JNIEnv *__env, jclass clazz, jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong colorAddress) {
    float *out_h = (float *)(uintptr_t)out_hAddress;
    float *out_s = (float *)(uintptr_t)out_sAddress;
    float *out_v = (float *)(uintptr_t)out_vAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_f(out_h, out_s, out_v, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1fv__JJ(JNIEnv *__env, jclass clazz, jlong hsv_outAddress, jlong colorAddress) {
    float *hsv_out = (float *)(uintptr_t)hsv_outAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_fv(hsv_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1i__JJJJJ(JNIEnv *__env, jclass clazz, jlong hAddress, jlong sAddress, jlong vAddress, jlong aAddress, jlong colorAddress) {
    int *h = (int *)(uintptr_t)hAddress;
    int *s = (int *)(uintptr_t)sAddress;
    int *v = (int *)(uintptr_t)vAddress;
    int *a = (int *)(uintptr_t)aAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_i(h, s, v, a, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1b(JNIEnv *__env, jclass clazz, jlong hAddress, jlong sAddress, jlong vAddress, jlong aAddress, jlong colorAddress) {
    nk_byte *h = (nk_byte *)(uintptr_t)hAddress;
    nk_byte *s = (nk_byte *)(uintptr_t)sAddress;
    nk_byte *v = (nk_byte *)(uintptr_t)vAddress;
    nk_byte *a = (nk_byte *)(uintptr_t)aAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_b(h, s, v, a, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1iv__JJ(JNIEnv *__env, jclass clazz, jlong hsva_outAddress, jlong colorAddress) {
    int *hsva_out = (int *)(uintptr_t)hsva_outAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_iv(hsva_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1bv(JNIEnv *__env, jclass clazz, jlong hsva_outAddress, jlong colorAddress) {
    nk_byte *hsva_out = (nk_byte *)(uintptr_t)hsva_outAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_bv(hsva_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1f__JJJJJ(JNIEnv *__env, jclass clazz, jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong out_aAddress, jlong colorAddress) {
    float *out_h = (float *)(uintptr_t)out_hAddress;
    float *out_s = (float *)(uintptr_t)out_sAddress;
    float *out_v = (float *)(uintptr_t)out_vAddress;
    float *out_a = (float *)(uintptr_t)out_aAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_f(out_h, out_s, out_v, out_a, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1fv__JJ(JNIEnv *__env, jclass clazz, jlong hsva_outAddress, jlong colorAddress) {
    float *hsva_out = (float *)(uintptr_t)hsva_outAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_fv(hsva_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1handle_1ptr(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong __result) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    *((nk_handle*)(uintptr_t)__result) = nk_handle_ptr(ptr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1handle_1id(JNIEnv *__env, jclass clazz, jint id, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((nk_handle*)(uintptr_t)__result) = nk_handle_id(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1image_1handle(JNIEnv *__env, jclass clazz, jlong handleAddress, jlong __result) {
    nk_handle *handle = (nk_handle *)(uintptr_t)handleAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_image*)(uintptr_t)__result) = nk_image_handle(*handle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1image_1ptr(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong __result) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_image*)(uintptr_t)__result) = nk_image_ptr(ptr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1image_1id(JNIEnv *__env, jclass clazz, jint id, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_image*)(uintptr_t)__result) = nk_image_id(id);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1image_1is_1subimage(JNIEnv *__env, jclass clazz, jlong imgAddress) {
    struct nk_image const *img = (struct nk_image const *)(uintptr_t)imgAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_image_is_subimage(img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1subimage_1ptr(JNIEnv *__env, jclass clazz, jlong ptrAddress, jshort w, jshort h, jlong sub_regionAddress, jlong __result) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    struct nk_rect *sub_region = (struct nk_rect *)(uintptr_t)sub_regionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_image*)(uintptr_t)__result) = nk_subimage_ptr(ptr, (nk_ushort)w, (nk_ushort)h, *sub_region);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1subimage_1id(JNIEnv *__env, jclass clazz, jint id, jshort w, jshort h, jlong sub_regionAddress, jlong __result) {
    struct nk_rect *sub_region = (struct nk_rect *)(uintptr_t)sub_regionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_image*)(uintptr_t)__result) = nk_subimage_id(id, (nk_ushort)w, (nk_ushort)h, *sub_region);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1subimage_1handle(JNIEnv *__env, jclass clazz, jlong handleAddress, jshort w, jshort h, jlong sub_regionAddress, jlong __result) {
    nk_handle *handle = (nk_handle *)(uintptr_t)handleAddress;
    struct nk_rect *sub_region = (struct nk_rect *)(uintptr_t)sub_regionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_image*)(uintptr_t)__result) = nk_subimage_handle(*handle, (nk_ushort)w, (nk_ushort)h, *sub_region);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1nine_1slice_1handle(JNIEnv *__env, jclass clazz, jlong handleAddress, jshort l, jshort t, jshort r, jshort b, jlong __result) {
    nk_handle *handle = (nk_handle *)(uintptr_t)handleAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_nine_slice*)(uintptr_t)__result) = nk_nine_slice_handle(*handle, (nk_ushort)l, (nk_ushort)t, (nk_ushort)r, (nk_ushort)b);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1nine_1slice_1ptr(JNIEnv *__env, jclass clazz, jlong ptrAddress, jshort l, jshort t, jshort r, jshort b, jlong __result) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_nine_slice*)(uintptr_t)__result) = nk_nine_slice_ptr(ptr, (nk_ushort)l, (nk_ushort)t, (nk_ushort)r, (nk_ushort)b);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1nine_1slice_1id(JNIEnv *__env, jclass clazz, jint id, jshort l, jshort t, jshort r, jshort b, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_nine_slice*)(uintptr_t)__result) = nk_nine_slice_id(id, (nk_ushort)l, (nk_ushort)t, (nk_ushort)r, (nk_ushort)b);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1nine_1slice_1is_1sub9slice(JNIEnv *__env, jclass clazz, jlong imgAddress) {
    struct nk_nine_slice const *img = (struct nk_nine_slice const *)(uintptr_t)imgAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_nine_slice_is_sub9slice(img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1sub9slice_1ptr(JNIEnv *__env, jclass clazz, jlong ptrAddress, jshort w, jshort h, jlong sub_regionAddress, jshort l, jshort t, jshort r, jshort b, jlong __result) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    struct nk_rect *sub_region = (struct nk_rect *)(uintptr_t)sub_regionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_nine_slice*)(uintptr_t)__result) = nk_sub9slice_ptr(ptr, (nk_ushort)w, (nk_ushort)h, *sub_region, (nk_ushort)l, (nk_ushort)t, (nk_ushort)r, (nk_ushort)b);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1sub9slice_1id(JNIEnv *__env, jclass clazz, jint id, jshort w, jshort h, jlong sub_regionAddress, jshort l, jshort t, jshort r, jshort b, jlong __result) {
    struct nk_rect *sub_region = (struct nk_rect *)(uintptr_t)sub_regionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_nine_slice*)(uintptr_t)__result) = nk_sub9slice_id(id, (nk_ushort)w, (nk_ushort)h, *sub_region, (nk_ushort)l, (nk_ushort)t, (nk_ushort)r, (nk_ushort)b);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1sub9slice_1handle(JNIEnv *__env, jclass clazz, jlong handleAddress, jshort w, jshort h, jlong sub_regionAddress, jshort l, jshort t, jshort r, jshort b, jlong __result) {
    nk_handle *handle = (nk_handle *)(uintptr_t)handleAddress;
    struct nk_rect *sub_region = (struct nk_rect *)(uintptr_t)sub_regionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_nine_slice*)(uintptr_t)__result) = nk_sub9slice_handle(*handle, (nk_ushort)w, (nk_ushort)h, *sub_region, (nk_ushort)l, (nk_ushort)t, (nk_ushort)r, (nk_ushort)b);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1murmur_1hash(JNIEnv *__env, jclass clazz, jlong keyAddress, jint len, jint seed) {
    void const *key = (void const *)(uintptr_t)keyAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_murmur_hash(key, len, (nk_hash)seed);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1triangle_1from_1direction(JNIEnv *__env, jclass clazz, jlong resultAddress, jlong rAddress, jfloat pad_x, jfloat pad_y, jint direction) {
    struct nk_vec2 *result = (struct nk_vec2 *)(uintptr_t)resultAddress;
    struct nk_rect *r = (struct nk_rect *)(uintptr_t)rAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_triangle_from_direction(result, *r, pad_x, pad_y, (enum nk_heading)direction);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1vec2(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(uintptr_t)__result) = nk_vec2(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1vec2i(JNIEnv *__env, jclass clazz, jint x, jint y, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(uintptr_t)__result) = nk_vec2i(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1vec2v__JJ(JNIEnv *__env, jclass clazz, jlong xyAddress, jlong __result) {
    float const *xy = (float const *)(uintptr_t)xyAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(uintptr_t)__result) = nk_vec2v(xy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1vec2iv__JJ(JNIEnv *__env, jclass clazz, jlong xyAddress, jlong __result) {
    int const *xy = (int const *)(uintptr_t)xyAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(uintptr_t)__result) = nk_vec2iv(xy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1get_1null_1rect(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(uintptr_t)__result) = nk_get_null_rect();
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rect(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat w, jfloat h, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(uintptr_t)__result) = nk_rect(x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1recti(JNIEnv *__env, jclass clazz, jint x, jint y, jint w, jint h, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(uintptr_t)__result) = nk_recti(x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1recta(JNIEnv *__env, jclass clazz, jlong posAddress, jlong sizeAddress, jlong __result) {
    struct nk_vec2 *pos = (struct nk_vec2 *)(uintptr_t)posAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(uintptr_t)__result) = nk_recta(*pos, *size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rectv__JJ(JNIEnv *__env, jclass clazz, jlong xywhAddress, jlong __result) {
    float const *xywh = (float const *)(uintptr_t)xywhAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(uintptr_t)__result) = nk_rectv(xywh);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rectiv__JJ(JNIEnv *__env, jclass clazz, jlong xywhAddress, jlong __result) {
    int const *xywh = (int const *)(uintptr_t)xywhAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(uintptr_t)__result) = nk_rectiv(xywh);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rect_1pos(JNIEnv *__env, jclass clazz, jlong rAddress, jlong __result) {
    struct nk_rect *r = (struct nk_rect *)(uintptr_t)rAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(uintptr_t)__result) = nk_rect_pos(*r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rect_1size(JNIEnv *__env, jclass clazz, jlong rAddress, jlong __result) {
    struct nk_rect *r = (struct nk_rect *)(uintptr_t)rAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(uintptr_t)__result) = nk_rect_size(*r);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strlen(JNIEnv *__env, jclass clazz, jlong strAddress) {
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_strlen(str);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stricmp(JNIEnv *__env, jclass clazz, jlong s1Address, jlong s2Address) {
    char const *s1 = (char const *)(uintptr_t)s1Address;
    char const *s2 = (char const *)(uintptr_t)s2Address;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_stricmp(s1, s2);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stricmpn(JNIEnv *__env, jclass clazz, jlong s1Address, jlong s2Address, jint n) {
    char const *s1 = (char const *)(uintptr_t)s1Address;
    char const *s2 = (char const *)(uintptr_t)s2Address;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_stricmpn(s1, s2, n);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strtoi(JNIEnv *__env, jclass clazz, jlong strAddress, jlong endptrAddress) {
    char const *str = (char const *)(uintptr_t)strAddress;
    char const **endptr = (char const **)(uintptr_t)endptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_strtoi(str, endptr);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strtof(JNIEnv *__env, jclass clazz, jlong strAddress, jlong endptrAddress) {
    char const *str = (char const *)(uintptr_t)strAddress;
    char const **endptr = (char const **)(uintptr_t)endptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nk_strtof(str, endptr);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strtod(JNIEnv *__env, jclass clazz, jlong strAddress, jlong endptrAddress) {
    char const *str = (char const *)(uintptr_t)strAddress;
    char const **endptr = (char const **)(uintptr_t)endptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jdouble)nk_strtod(str, endptr);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strfilter(JNIEnv *__env, jclass clazz, jlong strAddress, jlong regexpAddress) {
    char const *str = (char const *)(uintptr_t)strAddress;
    char const *regexp = (char const *)(uintptr_t)regexpAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_strfilter(str, regexp);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1string__JJJ(JNIEnv *__env, jclass clazz, jlong strAddress, jlong patternAddress, jlong out_scoreAddress) {
    char const *str = (char const *)(uintptr_t)strAddress;
    char const *pattern = (char const *)(uintptr_t)patternAddress;
    int *out_score = (int *)(uintptr_t)out_scoreAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_strmatch_fuzzy_string(str, pattern, out_score);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1text__JIJJ(JNIEnv *__env, jclass clazz, jlong txtAddress, jint txt_len, jlong patternAddress, jlong out_scoreAddress) {
    char const *txt = (char const *)(uintptr_t)txtAddress;
    char const *pattern = (char const *)(uintptr_t)patternAddress;
    int *out_score = (int *)(uintptr_t)out_scoreAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_strmatch_fuzzy_text(txt, txt_len, pattern, out_score);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1utf_1decode__JJI(JNIEnv *__env, jclass clazz, jlong cAddress, jlong uAddress, jint clen) {
    char const *c = (char const *)(uintptr_t)cAddress;
    nk_rune *u = (nk_rune *)(uintptr_t)uAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_utf_decode(c, u, clen);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1utf_1encode(JNIEnv *__env, jclass clazz, jint u, jlong cAddress, jint clen) {
    char *c = (char *)(uintptr_t)cAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_utf_encode((nk_rune)u, c, clen);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1utf_1len(JNIEnv *__env, jclass clazz, jlong strAddress, jint byte_len) {
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_utf_len(str, byte_len);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1utf_1at__JIIJJ(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint length, jint index, jlong unicodeAddress, jlong lenAddress) {
    char const *buffer = (char const *)(uintptr_t)bufferAddress;
    nk_rune *unicode = (nk_rune *)(uintptr_t)unicodeAddress;
    int *len = (int *)(uintptr_t)lenAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk_utf_at(buffer, length, index, unicode, len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1init(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong allocatorAddress, jlong size) {
    struct nk_buffer *buffer = (struct nk_buffer *)(uintptr_t)bufferAddress;
    struct nk_allocator const *allocator = (struct nk_allocator const *)(uintptr_t)allocatorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_buffer_init(buffer, allocator, (nk_size)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1init_1fixed(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong memoryAddress, jlong size) {
    struct nk_buffer *buffer = (struct nk_buffer *)(uintptr_t)bufferAddress;
    void *memory = (void *)(uintptr_t)memoryAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_buffer_init_fixed(buffer, memory, (nk_size)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1info(JNIEnv *__env, jclass clazz, jlong statusAddress, jlong bufferAddress) {
    struct nk_memory_status *status = (struct nk_memory_status *)(uintptr_t)statusAddress;
    struct nk_buffer *buffer = (struct nk_buffer *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_buffer_info(status, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1push(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint type, jlong memoryAddress, jlong size, jlong align) {
    struct nk_buffer *buffer = (struct nk_buffer *)(uintptr_t)bufferAddress;
    void const *memory = (void const *)(uintptr_t)memoryAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_buffer_push(buffer, (enum nk_buffer_allocation_type)type, memory, (nk_size)size, (nk_size)align);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1mark(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint type) {
    struct nk_buffer *buffer = (struct nk_buffer *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_buffer_mark(buffer, (enum nk_buffer_allocation_type)type);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1reset(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint type) {
    struct nk_buffer *buffer = (struct nk_buffer *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_buffer_reset(buffer, (enum nk_buffer_allocation_type)type);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1clear(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    struct nk_buffer *buffer = (struct nk_buffer *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_buffer_clear(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1free(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    struct nk_buffer *buffer = (struct nk_buffer *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_buffer_free(buffer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1memory(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    struct nk_buffer *buffer = (struct nk_buffer *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk_buffer_memory(buffer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1memory_1const(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    struct nk_buffer const *buffer = (struct nk_buffer const *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk_buffer_memory_const(buffer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1total(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    struct nk_buffer *buffer = (struct nk_buffer *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)nk_buffer_total(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1init(JNIEnv *__env, jclass clazz, jlong strAddress, jlong allocatorAddress, jlong size) {
    struct nk_str *str = (struct nk_str *)(uintptr_t)strAddress;
    struct nk_allocator const *allocator = (struct nk_allocator const *)(uintptr_t)allocatorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_str_init(str, allocator, (nk_size)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1init_1fixed(JNIEnv *__env, jclass clazz, jlong strAddress, jlong memoryAddress, jlong size) {
    struct nk_str *str = (struct nk_str *)(uintptr_t)strAddress;
    void *memory = (void *)(uintptr_t)memoryAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_str_init_fixed(str, memory, (nk_size)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1clear(JNIEnv *__env, jclass clazz, jlong strAddress) {
    struct nk_str *str = (struct nk_str *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_str_clear(str);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1free(JNIEnv *__env, jclass clazz, jlong strAddress) {
    struct nk_str *str = (struct nk_str *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_str_free(str);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1char(JNIEnv *__env, jclass clazz, jlong sAddress, jlong strAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_append_text_char(s, str, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1char(JNIEnv *__env, jclass clazz, jlong sAddress, jlong strAddress) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_append_str_char(s, str);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1utf8(JNIEnv *__env, jclass clazz, jlong sAddress, jlong strAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_append_text_utf8(s, str, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1utf8(JNIEnv *__env, jclass clazz, jlong sAddress, jlong strAddress) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_append_str_utf8(s, str);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1runes__JJI(JNIEnv *__env, jclass clazz, jlong sAddress, jlong runesAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    nk_rune const *runes = (nk_rune const *)(uintptr_t)runesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_append_text_runes(s, runes, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1runes__JJ(JNIEnv *__env, jclass clazz, jlong sAddress, jlong runesAddress) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    nk_rune const *runes = (nk_rune const *)(uintptr_t)runesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_append_str_runes(s, runes);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1at_1char(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong strAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_insert_at_char(s, pos, str, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1at_1rune(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong strAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_insert_at_rune(s, pos, str, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1char(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong strAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_insert_text_char(s, pos, str, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1char(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong strAddress) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_insert_str_char(s, pos, str);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1utf8(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong strAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_insert_text_utf8(s, pos, str, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1utf8(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong strAddress) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_insert_str_utf8(s, pos, str);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1runes__JIJI(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong runesAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    nk_rune const *runes = (nk_rune const *)(uintptr_t)runesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_insert_text_runes(s, pos, runes, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1runes__JIJ(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong runesAddress) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    nk_rune const *runes = (nk_rune const *)(uintptr_t)runesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_insert_str_runes(s, pos, runes);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1remove_1chars(JNIEnv *__env, jclass clazz, jlong sAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_str_remove_chars(s, len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1remove_1runes(JNIEnv *__env, jclass clazz, jlong strAddress, jint len) {
    struct nk_str *str = (struct nk_str *)(uintptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_str_remove_runes(str, len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1delete_1chars(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jint len) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_str_delete_chars(s, pos, len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1delete_1runes(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jint len) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_str_delete_runes(s, pos, len);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1char(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk_str_at_char(s, pos);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1rune__JIJJ(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong unicodeAddress, jlong lenAddress) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    nk_rune *unicode = (nk_rune *)(uintptr_t)unicodeAddress;
    int *len = (int *)(uintptr_t)lenAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk_str_at_rune(s, pos, unicode, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1rune_1at(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos) {
    struct nk_str const *s = (struct nk_str const *)(uintptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_rune_at(s, pos);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1char_1const(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos) {
    struct nk_str const *s = (struct nk_str const *)(uintptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk_str_at_char_const(s, pos);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1const__JIJJ(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong unicodeAddress, jlong lenAddress) {
    struct nk_str const *s = (struct nk_str const *)(uintptr_t)sAddress;
    nk_rune *unicode = (nk_rune *)(uintptr_t)unicodeAddress;
    int *len = (int *)(uintptr_t)lenAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk_str_at_const(s, pos, unicode, len);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1get(JNIEnv *__env, jclass clazz, jlong sAddress) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk_str_get(s);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1get_1const(JNIEnv *__env, jclass clazz, jlong sAddress) {
    struct nk_str const *s = (struct nk_str const *)(uintptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk_str_get_const(s);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1len(JNIEnv *__env, jclass clazz, jlong sAddress) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_len(s);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1len_1char(JNIEnv *__env, jclass clazz, jlong sAddress) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_len_char(s);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1default(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    struct nk_text_edit const *edit = (struct nk_text_edit const *)(uintptr_t)editAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_filter_default(edit, (nk_rune)unicode);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1ascii(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    struct nk_text_edit const *edit = (struct nk_text_edit const *)(uintptr_t)editAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_filter_ascii(edit, (nk_rune)unicode);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1float(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    struct nk_text_edit const *edit = (struct nk_text_edit const *)(uintptr_t)editAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_filter_float(edit, (nk_rune)unicode);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1decimal(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    struct nk_text_edit const *edit = (struct nk_text_edit const *)(uintptr_t)editAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_filter_decimal(edit, (nk_rune)unicode);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1hex(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    struct nk_text_edit const *edit = (struct nk_text_edit const *)(uintptr_t)editAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_filter_hex(edit, (nk_rune)unicode);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1oct(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    struct nk_text_edit const *edit = (struct nk_text_edit const *)(uintptr_t)editAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_filter_oct(edit, (nk_rune)unicode);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1binary(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    struct nk_text_edit const *edit = (struct nk_text_edit const *)(uintptr_t)editAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_filter_binary(edit, (nk_rune)unicode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1init(JNIEnv *__env, jclass clazz, jlong boxAddress, jlong allocatorAddress, jlong size) {
    struct nk_text_edit *box = (struct nk_text_edit *)(uintptr_t)boxAddress;
    struct nk_allocator *allocator = (struct nk_allocator *)(uintptr_t)allocatorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_textedit_init(box, allocator, (nk_size)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1init_1fixed(JNIEnv *__env, jclass clazz, jlong boxAddress, jlong memoryAddress, jlong size) {
    struct nk_text_edit *box = (struct nk_text_edit *)(uintptr_t)boxAddress;
    void *memory = (void *)(uintptr_t)memoryAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_textedit_init_fixed(box, memory, (nk_size)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1free(JNIEnv *__env, jclass clazz, jlong boxAddress) {
    struct nk_text_edit *box = (struct nk_text_edit *)(uintptr_t)boxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_textedit_free(box);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1text(JNIEnv *__env, jclass clazz, jlong boxAddress, jlong textAddress, jint total_len) {
    struct nk_text_edit *box = (struct nk_text_edit *)(uintptr_t)boxAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_textedit_text(box, text, total_len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1delete(JNIEnv *__env, jclass clazz, jlong boxAddress, jint where, jint len) {
    struct nk_text_edit *box = (struct nk_text_edit *)(uintptr_t)boxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_textedit_delete(box, where, len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1delete_1selection(JNIEnv *__env, jclass clazz, jlong boxAddress) {
    struct nk_text_edit *box = (struct nk_text_edit *)(uintptr_t)boxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_textedit_delete_selection(box);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1select_1all(JNIEnv *__env, jclass clazz, jlong boxAddress) {
    struct nk_text_edit *box = (struct nk_text_edit *)(uintptr_t)boxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_textedit_select_all(box);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1cut(JNIEnv *__env, jclass clazz, jlong boxAddress) {
    struct nk_text_edit *box = (struct nk_text_edit *)(uintptr_t)boxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_textedit_cut(box);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1paste(JNIEnv *__env, jclass clazz, jlong boxAddress, jlong ctextAddress, jint len) {
    struct nk_text_edit *box = (struct nk_text_edit *)(uintptr_t)boxAddress;
    char const *ctext = (char const *)(uintptr_t)ctextAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_textedit_paste(box, ctext, len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1undo(JNIEnv *__env, jclass clazz, jlong boxAddress) {
    struct nk_text_edit *box = (struct nk_text_edit *)(uintptr_t)boxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_textedit_undo(box);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1redo(JNIEnv *__env, jclass clazz, jlong boxAddress) {
    struct nk_text_edit *box = (struct nk_text_edit *)(uintptr_t)boxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_textedit_redo(box);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1line(JNIEnv *__env, jclass clazz, jlong bAddress, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_line(b, x0, y0, x1, y1, line_thickness, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1curve(JNIEnv *__env, jclass clazz, jlong bAddress, jfloat ax, jfloat ay, jfloat ctrl0x, jfloat ctrl0y, jfloat ctrl1x, jfloat ctrl1y, jfloat bx, jfloat by, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_curve(b, ax, ay, ctrl0x, ctrl0y, ctrl1x, ctrl1y, bx, by, line_thickness, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1rect(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jfloat rounding, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_rect(b, *rect, rounding, line_thickness, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1circle(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_circle(b, *rect, line_thickness, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1arc(JNIEnv *__env, jclass clazz, jlong bAddress, jfloat cx, jfloat cy, jfloat radius, jfloat a_min, jfloat a_max, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_arc(b, cx, cy, radius, a_min, a_max, line_thickness, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1triangle(JNIEnv *__env, jclass clazz, jlong bAddress, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jfloat x2, jfloat y2, jfloat line_thichness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_triangle(b, x0, y0, x1, y1, x2, y2, line_thichness, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polyline__JJIFJ(JNIEnv *__env, jclass clazz, jlong bAddress, jlong pointsAddress, jint point_count, jfloat line_thickness, jlong colAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    float *points = (float *)(uintptr_t)pointsAddress;
    struct nk_color *col = (struct nk_color *)(uintptr_t)colAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_polyline(b, points, point_count, line_thickness, *col);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polygon__JJIFJ(JNIEnv *__env, jclass clazz, jlong bAddress, jlong pointsAddress, jint point_count, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    float *points = (float *)(uintptr_t)pointsAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_polygon(b, points, point_count, line_thickness, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1rect(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jfloat rounding, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_fill_rect(b, *rect, rounding, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1rect_1multi_1color(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jlong leftAddress, jlong topAddress, jlong rightAddress, jlong bottomAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    struct nk_color *left = (struct nk_color *)(uintptr_t)leftAddress;
    struct nk_color *top = (struct nk_color *)(uintptr_t)topAddress;
    struct nk_color *right = (struct nk_color *)(uintptr_t)rightAddress;
    struct nk_color *bottom = (struct nk_color *)(uintptr_t)bottomAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_fill_rect_multi_color(b, *rect, *left, *top, *right, *bottom);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1circle(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_fill_circle(b, *rect, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1arc(JNIEnv *__env, jclass clazz, jlong bAddress, jfloat cx, jfloat cy, jfloat radius, jfloat a_min, jfloat a_max, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_fill_arc(b, cx, cy, radius, a_min, a_max, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1triangle(JNIEnv *__env, jclass clazz, jlong bAddress, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jfloat x2, jfloat y2, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_fill_triangle(b, x0, y0, x1, y1, x2, y2, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1polygon__JJIJ(JNIEnv *__env, jclass clazz, jlong bAddress, jlong pointsAddress, jint point_count, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    float *points = (float *)(uintptr_t)pointsAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_fill_polygon(b, points, point_count, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1image(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jlong imgAddress, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    struct nk_image const *img = (struct nk_image const *)(uintptr_t)imgAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_image(b, *rect, img, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1nine_1slice(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jlong slcAddress, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    struct nk_nine_slice const *slc = (struct nk_nine_slice const *)(uintptr_t)slcAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_nine_slice(b, *rect, slc, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1text(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jlong stringAddress, jint length, jlong fontAddress, jlong bgAddress, jlong fgAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    char const *string = (char const *)(uintptr_t)stringAddress;
    struct nk_user_font const *font = (struct nk_user_font const *)(uintptr_t)fontAddress;
    struct nk_color *bg = (struct nk_color *)(uintptr_t)bgAddress;
    struct nk_color *fg = (struct nk_color *)(uintptr_t)fgAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_text(b, *rect, string, length, font, *bg, *fg);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1push_1scissor(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_push_scissor(b, *rect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1push_1custom(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jlong callbackAddress, jlong usrAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    nk_command_custom_callback callback = (nk_command_custom_callback)(uintptr_t)callbackAddress;
    nk_handle *usr = (nk_handle *)(uintptr_t)usrAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_push_custom(b, *rect, callback, *usr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1next(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong cmdAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_command const *cmd = (struct nk_command const *)(uintptr_t)cmdAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk__next(ctx, cmd);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk__begin(ctx);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1has_1mouse_1click(JNIEnv *__env, jclass clazz, jlong iAddress, jint id) {
    struct nk_input const *i = (struct nk_input const *)(uintptr_t)iAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_input_has_mouse_click(i, (enum nk_buttons)id);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1has_1mouse_1click_1in_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jint id, jlong rectAddress) {
    struct nk_input const *i = (struct nk_input const *)(uintptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_input_has_mouse_click_in_rect(i, (enum nk_buttons)id, *rect);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1has_1mouse_1click_1down_1in_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jint id, jlong rectAddress, jboolean down) {
    struct nk_input const *i = (struct nk_input const *)(uintptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_input_has_mouse_click_down_in_rect(i, (enum nk_buttons)id, *rect, (nk_bool)down);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1click_1in_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jint id, jlong rectAddress) {
    struct nk_input const *i = (struct nk_input const *)(uintptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_input_is_mouse_click_in_rect(i, (enum nk_buttons)id, *rect);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1click_1down_1in_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jint id, jlong bAddress, jboolean down) {
    struct nk_input const *i = (struct nk_input const *)(uintptr_t)iAddress;
    struct nk_rect *b = (struct nk_rect *)(uintptr_t)bAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_input_is_mouse_click_down_in_rect(i, (enum nk_buttons)id, *b, (nk_bool)down);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1any_1mouse_1click_1in_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jlong rectAddress) {
    struct nk_input const *i = (struct nk_input const *)(uintptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_input_any_mouse_click_in_rect(i, *rect);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1prev_1hovering_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jlong rectAddress) {
    struct nk_input const *i = (struct nk_input const *)(uintptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_input_is_mouse_prev_hovering_rect(i, *rect);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1hovering_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jlong rectAddress) {
    struct nk_input const *i = (struct nk_input const *)(uintptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_input_is_mouse_hovering_rect(i, *rect);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1mouse_1clicked(JNIEnv *__env, jclass clazz, jlong iAddress, jint id, jlong rectAddress) {
    struct nk_input const *i = (struct nk_input const *)(uintptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_input_mouse_clicked(i, (enum nk_buttons)id, *rect);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1down(JNIEnv *__env, jclass clazz, jlong iAddress, jint id) {
    struct nk_input const *i = (struct nk_input const *)(uintptr_t)iAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_input_is_mouse_down(i, (enum nk_buttons)id);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1pressed(JNIEnv *__env, jclass clazz, jlong iAddress, jint id) {
    struct nk_input const *i = (struct nk_input const *)(uintptr_t)iAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_input_is_mouse_pressed(i, (enum nk_buttons)id);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1released(JNIEnv *__env, jclass clazz, jlong iAddress, jint id) {
    struct nk_input const *i = (struct nk_input const *)(uintptr_t)iAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_input_is_mouse_released(i, (enum nk_buttons)id);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1key_1pressed(JNIEnv *__env, jclass clazz, jlong iAddress, jint key) {
    struct nk_input const *i = (struct nk_input const *)(uintptr_t)iAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_input_is_key_pressed(i, (enum nk_keys)key);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1key_1released(JNIEnv *__env, jclass clazz, jlong iAddress, jint key) {
    struct nk_input const *i = (struct nk_input const *)(uintptr_t)iAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_input_is_key_released(i, (enum nk_keys)key);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1key_1down(JNIEnv *__env, jclass clazz, jlong iAddress, jint key) {
    struct nk_input const *i = (struct nk_input const *)(uintptr_t)iAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)nk_input_is_key_down(i, (enum nk_keys)key);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1init(JNIEnv *__env, jclass clazz, jlong listAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_init(list);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1setup(JNIEnv *__env, jclass clazz, jlong canvasAddress, jlong configAddress, jlong cmdsAddress, jlong verticesAddress, jlong elementsAddress, jint line_aa, jint shape_aa) {
    struct nk_draw_list *canvas = (struct nk_draw_list *)(uintptr_t)canvasAddress;
    struct nk_convert_config const *config = (struct nk_convert_config const *)(uintptr_t)configAddress;
    struct nk_buffer *cmds = (struct nk_buffer *)(uintptr_t)cmdsAddress;
    struct nk_buffer *vertices = (struct nk_buffer *)(uintptr_t)verticesAddress;
    struct nk_buffer *elements = (struct nk_buffer *)(uintptr_t)elementsAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_setup(canvas, config, cmds, vertices, elements, (enum nk_anti_aliasing)line_aa, (enum nk_anti_aliasing)shape_aa);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1list_1begin(JNIEnv *__env, jclass clazz, jlong listAddress, jlong bufferAddress) {
    struct nk_draw_list const *list = (struct nk_draw_list const *)(uintptr_t)listAddress;
    struct nk_buffer const *buffer = (struct nk_buffer const *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk__draw_list_begin(list, buffer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1list_1next(JNIEnv *__env, jclass clazz, jlong cmdAddress, jlong bufferAddress, jlong listAddress) {
    struct nk_draw_command const *cmd = (struct nk_draw_command const *)(uintptr_t)cmdAddress;
    struct nk_buffer const *buffer = (struct nk_buffer const *)(uintptr_t)bufferAddress;
    struct nk_draw_list const *list = (struct nk_draw_list const *)(uintptr_t)listAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk__draw_list_next(cmd, buffer, list);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong bufferAddress) {
    struct nk_context const *ctx = (struct nk_context const *)(uintptr_t)ctxAddress;
    struct nk_buffer const *buffer = (struct nk_buffer const *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk__draw_begin(ctx, buffer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong bufferAddress) {
    struct nk_context const *ctx = (struct nk_context const *)(uintptr_t)ctxAddress;
    struct nk_buffer const *buffer = (struct nk_buffer const *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk__draw_end(ctx, buffer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1next(JNIEnv *__env, jclass clazz, jlong cmdAddress, jlong bufferAddress, jlong ctxAddress) {
    struct nk_draw_command const *cmd = (struct nk_draw_command const *)(uintptr_t)cmdAddress;
    struct nk_buffer const *buffer = (struct nk_buffer const *)(uintptr_t)bufferAddress;
    struct nk_context const *ctx = (struct nk_context const *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)nk__draw_next(cmd, buffer, ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1clear(JNIEnv *__env, jclass clazz, jlong listAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_path_clear(list);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1line_1to(JNIEnv *__env, jclass clazz, jlong listAddress, jlong posAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_vec2 *pos = (struct nk_vec2 *)(uintptr_t)posAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_path_line_to(list, *pos);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1arc_1to_1fast(JNIEnv *__env, jclass clazz, jlong listAddress, jlong centerAddress, jfloat radius, jint a_min, jint a_max) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_vec2 *center = (struct nk_vec2 *)(uintptr_t)centerAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_path_arc_to_fast(list, *center, radius, a_min, a_max);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1arc_1to(JNIEnv *__env, jclass clazz, jlong listAddress, jlong centerAddress, jfloat radius, jfloat a_min, jfloat a_max, jint segments) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_vec2 *center = (struct nk_vec2 *)(uintptr_t)centerAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_path_arc_to(list, *center, radius, a_min, a_max, (unsigned int)segments);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1rect_1to(JNIEnv *__env, jclass clazz, jlong listAddress, jlong aAddress, jlong bAddress, jfloat rounding) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_vec2 *a = (struct nk_vec2 *)(uintptr_t)aAddress;
    struct nk_vec2 *b = (struct nk_vec2 *)(uintptr_t)bAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_path_rect_to(list, *a, *b, rounding);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1curve_1to(JNIEnv *__env, jclass clazz, jlong listAddress, jlong p2Address, jlong p3Address, jlong p4Address, jint num_segments) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_vec2 *p2 = (struct nk_vec2 *)(uintptr_t)p2Address;
    struct nk_vec2 *p3 = (struct nk_vec2 *)(uintptr_t)p3Address;
    struct nk_vec2 *p4 = (struct nk_vec2 *)(uintptr_t)p4Address;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_path_curve_to(list, *p2, *p3, *p4, (unsigned int)num_segments);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1fill(JNIEnv *__env, jclass clazz, jlong listAddress, jlong colorAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_path_fill(list, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1stroke(JNIEnv *__env, jclass clazz, jlong listAddress, jlong colorAddress, jint closed, jfloat thickness) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_path_stroke(list, *color, (enum nk_draw_list_stroke)closed, thickness);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1line(JNIEnv *__env, jclass clazz, jlong listAddress, jlong aAddress, jlong bAddress, jlong colorAddress, jfloat thickness) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_vec2 *a = (struct nk_vec2 *)(uintptr_t)aAddress;
    struct nk_vec2 *b = (struct nk_vec2 *)(uintptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_stroke_line(list, *a, *b, *color, thickness);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1rect(JNIEnv *__env, jclass clazz, jlong listAddress, jlong rectAddress, jlong colorAddress, jfloat rounding, jfloat thickness) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_stroke_rect(list, *rect, *color, rounding, thickness);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1triangle(JNIEnv *__env, jclass clazz, jlong listAddress, jlong aAddress, jlong bAddress, jlong cAddress, jlong colorAddress, jfloat thickness) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_vec2 *a = (struct nk_vec2 *)(uintptr_t)aAddress;
    struct nk_vec2 *b = (struct nk_vec2 *)(uintptr_t)bAddress;
    struct nk_vec2 *c = (struct nk_vec2 *)(uintptr_t)cAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_stroke_triangle(list, *a, *b, *c, *color, thickness);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1circle(JNIEnv *__env, jclass clazz, jlong listAddress, jlong centerAddress, jfloat radius, jlong colorAddress, jint segs, jfloat thickness) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_vec2 *center = (struct nk_vec2 *)(uintptr_t)centerAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_stroke_circle(list, *center, radius, *color, (unsigned int)segs, thickness);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1curve(JNIEnv *__env, jclass clazz, jlong listAddress, jlong p0Address, jlong cp0Address, jlong cp1Address, jlong p1Address, jlong colorAddress, jint segments, jfloat thickness) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_vec2 *p0 = (struct nk_vec2 *)(uintptr_t)p0Address;
    struct nk_vec2 *cp0 = (struct nk_vec2 *)(uintptr_t)cp0Address;
    struct nk_vec2 *cp1 = (struct nk_vec2 *)(uintptr_t)cp1Address;
    struct nk_vec2 *p1 = (struct nk_vec2 *)(uintptr_t)p1Address;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_stroke_curve(list, *p0, *cp0, *cp1, *p1, *color, (unsigned int)segments, thickness);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1poly_1line(JNIEnv *__env, jclass clazz, jlong listAddress, jlong pntsAddress, jint cnt, jlong colorAddress, jint closed, jfloat thickness, jint aliasing) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_vec2 const *pnts = (struct nk_vec2 const *)(uintptr_t)pntsAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_stroke_poly_line(list, pnts, (unsigned int)cnt, *color, (enum nk_draw_list_stroke)closed, thickness, (enum nk_anti_aliasing)aliasing);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1rect(JNIEnv *__env, jclass clazz, jlong listAddress, jlong rectAddress, jlong colorAddress, jfloat rounding) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_fill_rect(list, *rect, *color, rounding);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1rect_1multi_1color(JNIEnv *__env, jclass clazz, jlong listAddress, jlong rectAddress, jlong leftAddress, jlong topAddress, jlong rightAddress, jlong bottomAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    struct nk_color *left = (struct nk_color *)(uintptr_t)leftAddress;
    struct nk_color *top = (struct nk_color *)(uintptr_t)topAddress;
    struct nk_color *right = (struct nk_color *)(uintptr_t)rightAddress;
    struct nk_color *bottom = (struct nk_color *)(uintptr_t)bottomAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_fill_rect_multi_color(list, *rect, *left, *top, *right, *bottom);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1triangle(JNIEnv *__env, jclass clazz, jlong listAddress, jlong aAddress, jlong bAddress, jlong cAddress, jlong colorAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_vec2 *a = (struct nk_vec2 *)(uintptr_t)aAddress;
    struct nk_vec2 *b = (struct nk_vec2 *)(uintptr_t)bAddress;
    struct nk_vec2 *c = (struct nk_vec2 *)(uintptr_t)cAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_fill_triangle(list, *a, *b, *c, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1circle(JNIEnv *__env, jclass clazz, jlong listAddress, jlong centerAddress, jfloat radius, jlong colAddress, jint segs) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_vec2 *center = (struct nk_vec2 *)(uintptr_t)centerAddress;
    struct nk_color *col = (struct nk_color *)(uintptr_t)colAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_fill_circle(list, *center, radius, *col, (unsigned int)segs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1poly_1convex(JNIEnv *__env, jclass clazz, jlong listAddress, jlong pointsAddress, jint count, jlong colorAddress, jint aliasing) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_vec2 const *points = (struct nk_vec2 const *)(uintptr_t)pointsAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_fill_poly_convex(list, points, (unsigned int)count, *color, (enum nk_anti_aliasing)aliasing);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1add_1image(JNIEnv *__env, jclass clazz, jlong listAddress, jlong textureAddress, jlong rectAddress, jlong colorAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_image *texture = (struct nk_image *)(uintptr_t)textureAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_add_image(list, *texture, *rect, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1add_1text(JNIEnv *__env, jclass clazz, jlong listAddress, jlong fontAddress, jlong rectAddress, jlong textAddress, jint len, jfloat font_height, jlong colorAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    struct nk_user_font const *font = (struct nk_user_font const *)(uintptr_t)fontAddress;
    struct nk_rect *rect = (struct nk_rect *)(uintptr_t)rectAddress;
    char const *text = (char const *)(uintptr_t)textAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_add_text(list, font, *rect, text, len, font_height, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1push_1userdata(JNIEnv *__env, jclass clazz, jlong listAddress, jlong userdataAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(uintptr_t)listAddress;
    nk_handle *userdata = (nk_handle *)(uintptr_t)userdataAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_push_userdata(list, *userdata);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1item_1color(JNIEnv *__env, jclass clazz, jlong colorAddress, jlong __result) {
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_style_item*)(uintptr_t)__result) = nk_style_item_color(*color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1item_1image(JNIEnv *__env, jclass clazz, jlong imgAddress, jlong __result) {
    struct nk_image *img = (struct nk_image *)(uintptr_t)imgAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_style_item*)(uintptr_t)__result) = nk_style_item_image(*img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1item_1nine_1slice(JNIEnv *__env, jclass clazz, jlong sliceAddress, jlong __result) {
    struct nk_nine_slice *slice = (struct nk_nine_slice *)(uintptr_t)sliceAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_style_item*)(uintptr_t)__result) = nk_style_item_nine_slice(*slice);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1item_1hide(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_style_item*)(uintptr_t)__result) = nk_style_item_hide();
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1scroll__J_3I_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jintArray offset_xAddress, jintArray offset_yAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    jint *offset_x = offset_xAddress == NULL ? NULL : (*__env)->GetIntArrayElements(__env, offset_xAddress, NULL);
    jint *offset_y = offset_yAddress == NULL ? NULL : (*__env)->GetIntArrayElements(__env, offset_yAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_window_get_scroll(ctx, (nk_uint *)offset_x, (nk_uint *)offset_y);
    if (offset_y != NULL) { (*__env)->ReleaseIntArrayElements(__env, offset_yAddress, offset_y, 0); }
    if (offset_x != NULL) { (*__env)->ReleaseIntArrayElements(__env, offset_xAddress, offset_x, 0); }
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row__JIFI_3F(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint fmt, jfloat height, jint cols, jfloatArray ratioAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    jfloat *ratio = (*__env)->GetFloatArrayElements(__env, ratioAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row(ctx, (enum nk_layout_format)fmt, height, (nk_int)cols, (float const *)ratio);
    (*__env)->ReleaseFloatArrayElements(__env, ratioAddress, ratio, 0);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1offset_1begin__J_3I_3IJI(JNIEnv *__env, jclass clazz, jlong ctxAddress, jintArray x_offsetAddress, jintArray y_offsetAddress, jlong titleAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    jboolean __result;
    jint *x_offset = (*__env)->GetIntArrayElements(__env, x_offsetAddress, NULL);
    jint *y_offset = (*__env)->GetIntArrayElements(__env, y_offsetAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jboolean)nk_group_scrolled_offset_begin(ctx, (nk_uint *)x_offset, (nk_uint *)y_offset, title, (nk_flags)flags);
    (*__env)->ReleaseIntArrayElements(__env, y_offsetAddress, y_offset, 0);
    (*__env)->ReleaseIntArrayElements(__env, x_offsetAddress, x_offset, 0);
    return __result;
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1get_1scroll__JJ_3I_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong idAddress, jintArray x_offsetAddress, jintArray y_offsetAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *id = (char const *)(uintptr_t)idAddress;
    jint *x_offset = x_offsetAddress == NULL ? NULL : (*__env)->GetIntArrayElements(__env, x_offsetAddress, NULL);
    jint *y_offset = y_offsetAddress == NULL ? NULL : (*__env)->GetIntArrayElements(__env, y_offsetAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_group_get_scroll(ctx, id, (nk_uint *)x_offset, (nk_uint *)y_offset);
    if (y_offset != NULL) { (*__env)->ReleaseIntArrayElements(__env, y_offsetAddress, y_offset, 0); }
    if (x_offset != NULL) { (*__env)->ReleaseIntArrayElements(__env, x_offsetAddress, x_offset, 0); }
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1push__JIJ_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong titleAddress, jintArray stateAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    jboolean __result;
    jint *state = (*__env)->GetIntArrayElements(__env, stateAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jboolean)nk_tree_state_push(ctx, (enum nk_tree_type)type, title, (enum nk_collapse_states *)state);
    (*__env)->ReleaseIntArrayElements(__env, stateAddress, state, 0);
    return __result;
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1image_1push__JIJJ_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong imageAddress, jlong titleAddress, jintArray stateAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    struct nk_image *image = (struct nk_image *)(uintptr_t)imageAddress;
    char const *title = (char const *)(uintptr_t)titleAddress;
    jboolean __result;
    jint *state = (*__env)->GetIntArrayElements(__env, stateAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jboolean)nk_tree_state_image_push(ctx, (enum nk_tree_type)type, *image, title, (enum nk_collapse_states *)state);
    (*__env)->ReleaseIntArrayElements(__env, stateAddress, state, 0);
    return __result;
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1label__JJ_3II(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jintArray flagsAddress, jint value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    jboolean __result;
    jint *flags = (*__env)->GetIntArrayElements(__env, flagsAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jboolean)nk_checkbox_flags_label(ctx, str, (unsigned int *)flags, (unsigned int)value);
    (*__env)->ReleaseIntArrayElements(__env, flagsAddress, flags, 0);
    return __result;
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1text__JJI_3II(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jintArray flagsAddress, jint value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *str = (char const *)(uintptr_t)strAddress;
    jboolean __result;
    jint *flags = (*__env)->GetIntArrayElements(__env, flagsAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jboolean)nk_checkbox_flags_text(ctx, str, len, (unsigned int *)flags, (unsigned int)value);
    (*__env)->ReleaseIntArrayElements(__env, flagsAddress, flags, 0);
    return __result;
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1slider_1float__JF_3FFF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat min, jfloatArray valAddress, jfloat max, jfloat step) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    jboolean __result;
    jfloat *val = (*__env)->GetFloatArrayElements(__env, valAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jboolean)nk_slider_float(ctx, min, (float *)val, max, step);
    (*__env)->ReleaseFloatArrayElements(__env, valAddress, val, 0);
    return __result;
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1slider_1int__JI_3III(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint min, jintArray valAddress, jint max, jint step) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    jboolean __result;
    jint *val = (*__env)->GetIntArrayElements(__env, valAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jboolean)nk_slider_int(ctx, min, (int *)val, max, step);
    (*__env)->ReleaseIntArrayElements(__env, valAddress, val, 0);
    return __result;
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1property_1int__JJI_3IIIF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint min, jintArray valAddress, jint max, jint step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    jint *val = (*__env)->GetIntArrayElements(__env, valAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_property_int(ctx, name, min, (int *)val, max, step, inc_per_pixel);
    (*__env)->ReleaseIntArrayElements(__env, valAddress, val, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1property_1float__JJF_3FFFF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jfloat min, jfloatArray valAddress, jfloat max, jfloat step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    jfloat *val = (*__env)->GetFloatArrayElements(__env, valAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_property_float(ctx, name, min, (float *)val, max, step, inc_per_pixel);
    (*__env)->ReleaseFloatArrayElements(__env, valAddress, val, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1property_1double__JJD_3DDDF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jdouble min, jdoubleArray valAddress, jdouble max, jdouble step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    jdouble *val = (*__env)->GetDoubleArrayElements(__env, valAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_property_double(ctx, name, min, (double *)val, max, step, inc_per_pixel);
    (*__env)->ReleaseDoubleArrayElements(__env, valAddress, val, 0);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1edit_1string__JIJ_3IIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint flags, jlong memoryAddress, jintArray lenAddress, jint max, jlong filterAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char *memory = (char *)(uintptr_t)memoryAddress;
    nk_plugin_filter filter = (nk_plugin_filter)(uintptr_t)filterAddress;
    jint __result;
    jint *len = (*__env)->GetIntArrayElements(__env, lenAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_edit_string(ctx, (nk_flags)flags, memory, (int *)len, max, filter);
    (*__env)->ReleaseIntArrayElements(__env, lenAddress, len, 0);
    return __result;
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1plot__JI_3FII(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jfloatArray valuesAddress, jint count, jint offset) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    jfloat *values = (*__env)->GetFloatArrayElements(__env, valuesAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_plot(ctx, (enum nk_chart_type)type, (float const *)values, count, offset);
    (*__env)->ReleaseFloatArrayElements(__env, valuesAddress, values, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1popup_1get_1scroll__J_3I_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jintArray offset_xAddress, jintArray offset_yAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    jint *offset_x = offset_xAddress == NULL ? NULL : (*__env)->GetIntArrayElements(__env, offset_xAddress, NULL);
    jint *offset_y = offset_yAddress == NULL ? NULL : (*__env)->GetIntArrayElements(__env, offset_yAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_popup_get_scroll(ctx, (nk_uint *)offset_x, (nk_uint *)offset_y);
    if (offset_y != NULL) { (*__env)->ReleaseIntArrayElements(__env, offset_yAddress, offset_y, 0); }
    if (offset_x != NULL) { (*__env)->ReleaseIntArrayElements(__env, offset_xAddress, offset_x, 0); }
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox__JJI_3IIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong itemsAddress, jint count, jintArray selectedAddress, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const **items = (char const **)(uintptr_t)itemsAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    jint *selected = (*__env)->GetIntArrayElements(__env, selectedAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_combobox(ctx, items, count, (int *)selected, item_height, *size);
    (*__env)->ReleaseIntArrayElements(__env, selectedAddress, selected, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1string__JJ_3IIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong items_separated_by_zerosAddress, jintArray selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *items_separated_by_zeros = (char const *)(uintptr_t)items_separated_by_zerosAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    jint *selected = (*__env)->GetIntArrayElements(__env, selectedAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_combobox_string(ctx, items_separated_by_zeros, (int *)selected, count, item_height, *size);
    (*__env)->ReleaseIntArrayElements(__env, selectedAddress, selected, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1separator__JJI_3IIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong items_separated_by_separatorAddress, jint separator, jintArray selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    char const *items_separated_by_separator = (char const *)(uintptr_t)items_separated_by_separatorAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    jint *selected = (*__env)->GetIntArrayElements(__env, selectedAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_combobox_separator(ctx, items_separated_by_separator, separator, (int *)selected, count, item_height, *size);
    (*__env)->ReleaseIntArrayElements(__env, selectedAddress, selected, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1callback__JJJ_3IIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong item_getterAddress, jlong userdataAddress, jintArray selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    nk_item_getter item_getter = (nk_item_getter)(uintptr_t)item_getterAddress;
    void *userdata = (void *)(uintptr_t)userdataAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(uintptr_t)sizeAddress;
    jint *selected = (*__env)->GetIntArrayElements(__env, selectedAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_combobox_callback(ctx, item_getter, userdata, (int *)selected, count, item_height, *size);
    (*__env)->ReleaseIntArrayElements(__env, selectedAddress, selected, 0);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1float__J_3FF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloatArray addressAddress, jfloat value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    jboolean __result;
    jfloat *address = (*__env)->GetFloatArrayElements(__env, addressAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jboolean)nk_style_push_float(ctx, (float *)address, value);
    (*__env)->ReleaseFloatArrayElements(__env, addressAddress, address, 0);
    return __result;
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1flags__J_3II(JNIEnv *__env, jclass clazz, jlong ctxAddress, jintArray addressAddress, jint value) {
    struct nk_context *ctx = (struct nk_context *)(uintptr_t)ctxAddress;
    jboolean __result;
    jint *address = (*__env)->GetIntArrayElements(__env, addressAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jboolean)nk_style_push_flags(ctx, (nk_flags *)address, (nk_flags)value);
    (*__env)->ReleaseIntArrayElements(__env, addressAddress, address, 0);
    return __result;
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1iv___3IJ(JNIEnv *__env, jclass clazz, jintArray rgbAddress, jlong __result) {
    jint *rgb = (*__env)->GetIntArrayElements(__env, rgbAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgb_iv((int const *)rgb);
    (*__env)->ReleaseIntArrayElements(__env, rgbAddress, rgb, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray rgbAddress, jlong __result) {
    jfloat *rgb = (*__env)->GetFloatArrayElements(__env, rgbAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgb_fv((float const *)rgb);
    (*__env)->ReleaseFloatArrayElements(__env, rgbAddress, rgb, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1iv___3IJ(JNIEnv *__env, jclass clazz, jintArray rgbaAddress, jlong __result) {
    jint *rgba = (*__env)->GetIntArrayElements(__env, rgbaAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgba_iv((int const *)rgba);
    (*__env)->ReleaseIntArrayElements(__env, rgbaAddress, rgba, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray rgbaAddress, jlong __result) {
    jfloat *rgba = (*__env)->GetFloatArrayElements(__env, rgbaAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_rgba_fv((float const *)rgba);
    (*__env)->ReleaseFloatArrayElements(__env, rgbaAddress, rgba, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1colorfv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray cAddress, jlong __result) {
    jfloat *c = (*__env)->GetFloatArrayElements(__env, cAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_colorf*)(uintptr_t)__result) = nk_hsva_colorfv((float *)c);
    (*__env)->ReleaseFloatArrayElements(__env, cAddress, c, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1colorf_1hsva_1f___3F_3F_3F_3FJ(JNIEnv *__env, jclass clazz, jfloatArray out_hAddress, jfloatArray out_sAddress, jfloatArray out_vAddress, jfloatArray out_aAddress, jlong inAddress) {
    struct nk_colorf *in = (struct nk_colorf *)(uintptr_t)inAddress;
    jfloat *out_h = (*__env)->GetFloatArrayElements(__env, out_hAddress, NULL);
    jfloat *out_s = (*__env)->GetFloatArrayElements(__env, out_sAddress, NULL);
    jfloat *out_v = (*__env)->GetFloatArrayElements(__env, out_vAddress, NULL);
    jfloat *out_a = (*__env)->GetFloatArrayElements(__env, out_aAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_colorf_hsva_f((float *)out_h, (float *)out_s, (float *)out_v, (float *)out_a, *in);
    (*__env)->ReleaseFloatArrayElements(__env, out_aAddress, out_a, 0);
    (*__env)->ReleaseFloatArrayElements(__env, out_vAddress, out_v, 0);
    (*__env)->ReleaseFloatArrayElements(__env, out_sAddress, out_s, 0);
    (*__env)->ReleaseFloatArrayElements(__env, out_hAddress, out_h, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1colorf_1hsva_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray hsvaAddress, jlong inAddress) {
    struct nk_colorf *in = (struct nk_colorf *)(uintptr_t)inAddress;
    jfloat *hsva = (*__env)->GetFloatArrayElements(__env, hsvaAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_colorf_hsva_fv((float *)hsva, *in);
    (*__env)->ReleaseFloatArrayElements(__env, hsvaAddress, hsva, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1iv___3IJ(JNIEnv *__env, jclass clazz, jintArray hsvAddress, jlong __result) {
    jint *hsv = (*__env)->GetIntArrayElements(__env, hsvAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_hsv_iv((int const *)hsv);
    (*__env)->ReleaseIntArrayElements(__env, hsvAddress, hsv, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray hsvAddress, jlong __result) {
    jfloat *hsv = (*__env)->GetFloatArrayElements(__env, hsvAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_hsv_fv((float const *)hsv);
    (*__env)->ReleaseFloatArrayElements(__env, hsvAddress, hsv, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1iv___3IJ(JNIEnv *__env, jclass clazz, jintArray hsvaAddress, jlong __result) {
    jint *hsva = (*__env)->GetIntArrayElements(__env, hsvaAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_hsva_iv((int const *)hsva);
    (*__env)->ReleaseIntArrayElements(__env, hsvaAddress, hsva, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray hsvaAddress, jlong __result) {
    jfloat *hsva = (*__env)->GetFloatArrayElements(__env, hsvaAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(uintptr_t)__result) = nk_hsva_fv((float const *)hsva);
    (*__env)->ReleaseFloatArrayElements(__env, hsvaAddress, hsva, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1f___3F_3F_3F_3FJ(JNIEnv *__env, jclass clazz, jfloatArray rAddress, jfloatArray gAddress, jfloatArray bAddress, jfloatArray aAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    jfloat *r = (*__env)->GetFloatArrayElements(__env, rAddress, NULL);
    jfloat *g = (*__env)->GetFloatArrayElements(__env, gAddress, NULL);
    jfloat *b = (*__env)->GetFloatArrayElements(__env, bAddress, NULL);
    jfloat *a = (*__env)->GetFloatArrayElements(__env, aAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_color_f((float *)r, (float *)g, (float *)b, (float *)a, *color);
    (*__env)->ReleaseFloatArrayElements(__env, aAddress, a, 0);
    (*__env)->ReleaseFloatArrayElements(__env, bAddress, b, 0);
    (*__env)->ReleaseFloatArrayElements(__env, gAddress, g, 0);
    (*__env)->ReleaseFloatArrayElements(__env, rAddress, r, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray rgba_outAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    jfloat *rgba_out = (*__env)->GetFloatArrayElements(__env, rgba_outAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_color_fv((float *)rgba_out, *color);
    (*__env)->ReleaseFloatArrayElements(__env, rgba_outAddress, rgba_out, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1d___3D_3D_3D_3DJ(JNIEnv *__env, jclass clazz, jdoubleArray rAddress, jdoubleArray gAddress, jdoubleArray bAddress, jdoubleArray aAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    jdouble *r = (*__env)->GetDoubleArrayElements(__env, rAddress, NULL);
    jdouble *g = (*__env)->GetDoubleArrayElements(__env, gAddress, NULL);
    jdouble *b = (*__env)->GetDoubleArrayElements(__env, bAddress, NULL);
    jdouble *a = (*__env)->GetDoubleArrayElements(__env, aAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_color_d((double *)r, (double *)g, (double *)b, (double *)a, *color);
    (*__env)->ReleaseDoubleArrayElements(__env, aAddress, a, 0);
    (*__env)->ReleaseDoubleArrayElements(__env, bAddress, b, 0);
    (*__env)->ReleaseDoubleArrayElements(__env, gAddress, g, 0);
    (*__env)->ReleaseDoubleArrayElements(__env, rAddress, r, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1dv___3DJ(JNIEnv *__env, jclass clazz, jdoubleArray rgba_outAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    jdouble *rgba_out = (*__env)->GetDoubleArrayElements(__env, rgba_outAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_color_dv((double *)rgba_out, *color);
    (*__env)->ReleaseDoubleArrayElements(__env, rgba_outAddress, rgba_out, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1i___3I_3I_3IJ(JNIEnv *__env, jclass clazz, jintArray out_hAddress, jintArray out_sAddress, jintArray out_vAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    jint *out_h = (*__env)->GetIntArrayElements(__env, out_hAddress, NULL);
    jint *out_s = (*__env)->GetIntArrayElements(__env, out_sAddress, NULL);
    jint *out_v = (*__env)->GetIntArrayElements(__env, out_vAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_i((int *)out_h, (int *)out_s, (int *)out_v, *color);
    (*__env)->ReleaseIntArrayElements(__env, out_vAddress, out_v, 0);
    (*__env)->ReleaseIntArrayElements(__env, out_sAddress, out_s, 0);
    (*__env)->ReleaseIntArrayElements(__env, out_hAddress, out_h, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1iv___3IJ(JNIEnv *__env, jclass clazz, jintArray hsv_outAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    jint *hsv_out = (*__env)->GetIntArrayElements(__env, hsv_outAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_iv((int *)hsv_out, *color);
    (*__env)->ReleaseIntArrayElements(__env, hsv_outAddress, hsv_out, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1f___3F_3F_3FJ(JNIEnv *__env, jclass clazz, jfloatArray out_hAddress, jfloatArray out_sAddress, jfloatArray out_vAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    jfloat *out_h = (*__env)->GetFloatArrayElements(__env, out_hAddress, NULL);
    jfloat *out_s = (*__env)->GetFloatArrayElements(__env, out_sAddress, NULL);
    jfloat *out_v = (*__env)->GetFloatArrayElements(__env, out_vAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_f((float *)out_h, (float *)out_s, (float *)out_v, *color);
    (*__env)->ReleaseFloatArrayElements(__env, out_vAddress, out_v, 0);
    (*__env)->ReleaseFloatArrayElements(__env, out_sAddress, out_s, 0);
    (*__env)->ReleaseFloatArrayElements(__env, out_hAddress, out_h, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray hsv_outAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    jfloat *hsv_out = (*__env)->GetFloatArrayElements(__env, hsv_outAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_fv((float *)hsv_out, *color);
    (*__env)->ReleaseFloatArrayElements(__env, hsv_outAddress, hsv_out, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1i___3I_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jintArray hAddress, jintArray sAddress, jintArray vAddress, jintArray aAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    jint *h = (*__env)->GetIntArrayElements(__env, hAddress, NULL);
    jint *s = (*__env)->GetIntArrayElements(__env, sAddress, NULL);
    jint *v = (*__env)->GetIntArrayElements(__env, vAddress, NULL);
    jint *a = (*__env)->GetIntArrayElements(__env, aAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_i((int *)h, (int *)s, (int *)v, (int *)a, *color);
    (*__env)->ReleaseIntArrayElements(__env, aAddress, a, 0);
    (*__env)->ReleaseIntArrayElements(__env, vAddress, v, 0);
    (*__env)->ReleaseIntArrayElements(__env, sAddress, s, 0);
    (*__env)->ReleaseIntArrayElements(__env, hAddress, h, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1iv___3IJ(JNIEnv *__env, jclass clazz, jintArray hsva_outAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    jint *hsva_out = (*__env)->GetIntArrayElements(__env, hsva_outAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_iv((int *)hsva_out, *color);
    (*__env)->ReleaseIntArrayElements(__env, hsva_outAddress, hsva_out, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1f___3F_3F_3F_3FJ(JNIEnv *__env, jclass clazz, jfloatArray out_hAddress, jfloatArray out_sAddress, jfloatArray out_vAddress, jfloatArray out_aAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    jfloat *out_h = (*__env)->GetFloatArrayElements(__env, out_hAddress, NULL);
    jfloat *out_s = (*__env)->GetFloatArrayElements(__env, out_sAddress, NULL);
    jfloat *out_v = (*__env)->GetFloatArrayElements(__env, out_vAddress, NULL);
    jfloat *out_a = (*__env)->GetFloatArrayElements(__env, out_aAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_f((float *)out_h, (float *)out_s, (float *)out_v, (float *)out_a, *color);
    (*__env)->ReleaseFloatArrayElements(__env, out_aAddress, out_a, 0);
    (*__env)->ReleaseFloatArrayElements(__env, out_vAddress, out_v, 0);
    (*__env)->ReleaseFloatArrayElements(__env, out_sAddress, out_s, 0);
    (*__env)->ReleaseFloatArrayElements(__env, out_hAddress, out_h, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray hsva_outAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    jfloat *hsva_out = (*__env)->GetFloatArrayElements(__env, hsva_outAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_fv((float *)hsva_out, *color);
    (*__env)->ReleaseFloatArrayElements(__env, hsva_outAddress, hsva_out, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1vec2v___3FJ(JNIEnv *__env, jclass clazz, jfloatArray xyAddress, jlong __result) {
    jfloat *xy = (*__env)->GetFloatArrayElements(__env, xyAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(uintptr_t)__result) = nk_vec2v((float const *)xy);
    (*__env)->ReleaseFloatArrayElements(__env, xyAddress, xy, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1vec2iv___3IJ(JNIEnv *__env, jclass clazz, jintArray xyAddress, jlong __result) {
    jint *xy = (*__env)->GetIntArrayElements(__env, xyAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(uintptr_t)__result) = nk_vec2iv((int const *)xy);
    (*__env)->ReleaseIntArrayElements(__env, xyAddress, xy, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rectv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray xywhAddress, jlong __result) {
    jfloat *xywh = (*__env)->GetFloatArrayElements(__env, xywhAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(uintptr_t)__result) = nk_rectv((float const *)xywh);
    (*__env)->ReleaseFloatArrayElements(__env, xywhAddress, xywh, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rectiv___3IJ(JNIEnv *__env, jclass clazz, jintArray xywhAddress, jlong __result) {
    jint *xywh = (*__env)->GetIntArrayElements(__env, xywhAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(uintptr_t)__result) = nk_rectiv((int const *)xywh);
    (*__env)->ReleaseIntArrayElements(__env, xywhAddress, xywh, 0);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1string__JJ_3I(JNIEnv *__env, jclass clazz, jlong strAddress, jlong patternAddress, jintArray out_scoreAddress) {
    char const *str = (char const *)(uintptr_t)strAddress;
    char const *pattern = (char const *)(uintptr_t)patternAddress;
    jboolean __result;
    jint *out_score = (*__env)->GetIntArrayElements(__env, out_scoreAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jboolean)nk_strmatch_fuzzy_string(str, pattern, (int *)out_score);
    (*__env)->ReleaseIntArrayElements(__env, out_scoreAddress, out_score, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1text__JIJ_3I(JNIEnv *__env, jclass clazz, jlong txtAddress, jint txt_len, jlong patternAddress, jintArray out_scoreAddress) {
    char const *txt = (char const *)(uintptr_t)txtAddress;
    char const *pattern = (char const *)(uintptr_t)patternAddress;
    jint __result;
    jint *out_score = (*__env)->GetIntArrayElements(__env, out_scoreAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_strmatch_fuzzy_text(txt, txt_len, pattern, (int *)out_score);
    (*__env)->ReleaseIntArrayElements(__env, out_scoreAddress, out_score, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1utf_1decode__J_3II(JNIEnv *__env, jclass clazz, jlong cAddress, jintArray uAddress, jint clen) {
    char const *c = (char const *)(uintptr_t)cAddress;
    jint __result;
    jint *u = (*__env)->GetIntArrayElements(__env, uAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_utf_decode(c, (nk_rune *)u, clen);
    (*__env)->ReleaseIntArrayElements(__env, uAddress, u, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1utf_1at__JII_3IJ(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint length, jint index, jintArray unicodeAddress, jlong lenAddress) {
    char const *buffer = (char const *)(uintptr_t)bufferAddress;
    int *len = (int *)(uintptr_t)lenAddress;
    jlong __result;
    jint *unicode = (*__env)->GetIntArrayElements(__env, unicodeAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(uintptr_t)nk_utf_at(buffer, length, index, (nk_rune *)unicode, len);
    (*__env)->ReleaseIntArrayElements(__env, unicodeAddress, unicode, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1runes__J_3II(JNIEnv *__env, jclass clazz, jlong sAddress, jintArray runesAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    jint __result;
    jint *runes = (*__env)->GetIntArrayElements(__env, runesAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_str_append_text_runes(s, (nk_rune const *)runes, len);
    (*__env)->ReleaseIntArrayElements(__env, runesAddress, runes, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1runes__J_3I(JNIEnv *__env, jclass clazz, jlong sAddress, jintArray runesAddress) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    jint __result;
    jint *runes = (*__env)->GetIntArrayElements(__env, runesAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_str_append_str_runes(s, (nk_rune const *)runes);
    (*__env)->ReleaseIntArrayElements(__env, runesAddress, runes, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1runes__JI_3II(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jintArray runesAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    jint __result;
    jint *runes = (*__env)->GetIntArrayElements(__env, runesAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_str_insert_text_runes(s, pos, (nk_rune const *)runes, len);
    (*__env)->ReleaseIntArrayElements(__env, runesAddress, runes, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1runes__JI_3I(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jintArray runesAddress) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    jint __result;
    jint *runes = (*__env)->GetIntArrayElements(__env, runesAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_str_insert_str_runes(s, pos, (nk_rune const *)runes);
    (*__env)->ReleaseIntArrayElements(__env, runesAddress, runes, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1rune__JI_3IJ(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jintArray unicodeAddress, jlong lenAddress) {
    struct nk_str *s = (struct nk_str *)(uintptr_t)sAddress;
    int *len = (int *)(uintptr_t)lenAddress;
    jlong __result;
    jint *unicode = (*__env)->GetIntArrayElements(__env, unicodeAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(uintptr_t)nk_str_at_rune(s, pos, (nk_rune *)unicode, len);
    (*__env)->ReleaseIntArrayElements(__env, unicodeAddress, unicode, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1const__JI_3IJ(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jintArray unicodeAddress, jlong lenAddress) {
    struct nk_str const *s = (struct nk_str const *)(uintptr_t)sAddress;
    int *len = (int *)(uintptr_t)lenAddress;
    jlong __result;
    jint *unicode = (*__env)->GetIntArrayElements(__env, unicodeAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(uintptr_t)nk_str_at_const(s, pos, (nk_rune *)unicode, len);
    (*__env)->ReleaseIntArrayElements(__env, unicodeAddress, unicode, 0);
    return __result;
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polyline__J_3FIFJ(JNIEnv *__env, jclass clazz, jlong bAddress, jfloatArray pointsAddress, jint point_count, jfloat line_thickness, jlong colAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_color *col = (struct nk_color *)(uintptr_t)colAddress;
    jfloat *points = (*__env)->GetFloatArrayElements(__env, pointsAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_polyline(b, (float *)points, point_count, line_thickness, *col);
    (*__env)->ReleaseFloatArrayElements(__env, pointsAddress, points, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polygon__J_3FIFJ(JNIEnv *__env, jclass clazz, jlong bAddress, jfloatArray pointsAddress, jint point_count, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    jfloat *points = (*__env)->GetFloatArrayElements(__env, pointsAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_polygon(b, (float *)points, point_count, line_thickness, *color);
    (*__env)->ReleaseFloatArrayElements(__env, pointsAddress, points, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1polygon__J_3FIJ(JNIEnv *__env, jclass clazz, jlong bAddress, jfloatArray pointsAddress, jint point_count, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(uintptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(uintptr_t)colorAddress;
    jfloat *points = (*__env)->GetFloatArrayElements(__env, pointsAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    nk_fill_polygon(b, (float *)points, point_count, *color);
    (*__env)->ReleaseFloatArrayElements(__env, pointsAddress, points, 0);
}

EXTERN_C_EXIT
