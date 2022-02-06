/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "lwjgl_malloc.h"
#define PAR_MALLOC(T, N) ((T*) org_lwjgl_malloc(N * sizeof(T)))
#define PAR_CALLOC(T, N) ((T*) org_lwjgl_calloc(N, sizeof(T)))
#define PAR_REALLOC(T, BUF, N) ((T*) org_lwjgl_realloc(BUF, sizeof(T) * N))
#define PAR_FREE(BUF) org_lwjgl_free(BUF)
DISABLE_WARNINGS()
#define PAR_STREAMLINES_IMPLEMENTATION
#include "par_streamlines.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParStreamlines_nparsl_1create_1context(JNIEnv *__env, jclass clazz, jlong configAddress) {
    parsl_config *config = (parsl_config *)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)parsl_create_context(*config);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParStreamlines_nparsl_1destroy_1context(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    parsl_context *ctx = (parsl_context *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    parsl_destroy_context(ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParStreamlines_nparsl_1mesh_1from_1lines(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong spinesAddress) {
    parsl_context *ctx = (parsl_context *)(uintptr_t)ctxAddress;
    parsl_spine_list *spines = (parsl_spine_list *)(uintptr_t)spinesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)parsl_mesh_from_lines(ctx, *spines);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParStreamlines_nparsl_1mesh_1from_1streamlines(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong advectAddress, jint first_tick, jint num_ticks, jlong userdataAddress) {
    parsl_context *context = (parsl_context *)(uintptr_t)contextAddress;
    parsl_advection_callback advect = (parsl_advection_callback)(uintptr_t)advectAddress;
    void *userdata = (void *)(uintptr_t)userdataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)parsl_mesh_from_streamlines(context, advect, (uint32_t)first_tick, (uint32_t)num_ticks, userdata);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParStreamlines_nparsl_1mesh_1from_1curves_1cubic(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong spinesAddress) {
    parsl_context *context = (parsl_context *)(uintptr_t)contextAddress;
    parsl_spine_list *spines = (parsl_spine_list *)(uintptr_t)spinesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)parsl_mesh_from_curves_cubic(context, *spines);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParStreamlines_nparsl_1mesh_1from_1curves_1quadratic(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong spinesAddress) {
    parsl_context *context = (parsl_context *)(uintptr_t)contextAddress;
    parsl_spine_list *spines = (parsl_spine_list *)(uintptr_t)spinesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)parsl_mesh_from_curves_quadratic(context, *spines);
}

EXTERN_C_EXIT
