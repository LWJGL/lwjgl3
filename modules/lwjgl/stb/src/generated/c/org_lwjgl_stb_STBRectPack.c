/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#define STBRP_ASSERT
#define STB_RECT_PACK_IMPLEMENTATION
#include "stb_rect_pack.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBRectPack_nstbrp_1pack_1rects(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong rectsAddress, jint num_rects) {
    stbrp_context *context = (stbrp_context *)(intptr_t)contextAddress;
    stbrp_rect *rects = (stbrp_rect *)(intptr_t)rectsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbrp_pack_rects(context, rects, num_rects);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBRectPack_nstbrp_1init_1target(JNIEnv *__env, jclass clazz, jlong contextAddress, jint width, jint height, jlong nodesAddress, jint num_nodes) {
    stbrp_context *context = (stbrp_context *)(intptr_t)contextAddress;
    stbrp_node *nodes = (stbrp_node *)(intptr_t)nodesAddress;
    UNUSED_PARAMS(__env, clazz)
    stbrp_init_target(context, width, height, nodes, num_nodes);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBRectPack_nstbrp_1setup_1allow_1out_1of_1mem(JNIEnv *__env, jclass clazz, jlong contextAddress, jint allow_out_of_mem) {
    stbrp_context *context = (stbrp_context *)(intptr_t)contextAddress;
    UNUSED_PARAMS(__env, clazz)
    stbrp_setup_allow_out_of_mem(context, allow_out_of_mem);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBRectPack_nstbrp_1setup_1heuristic(JNIEnv *__env, jclass clazz, jlong contextAddress, jint heuristic) {
    stbrp_context *context = (stbrp_context *)(intptr_t)contextAddress;
    UNUSED_PARAMS(__env, clazz)
    stbrp_setup_heuristic(context, heuristic);
}

EXTERN_C_EXIT
