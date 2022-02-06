/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#define PAR_OCTASPHERE_IMPLEMENTATION
DISABLE_WARNINGS()
#include "par_octasphere.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParOctasphere_npar_1octasphere_1get_1counts__JJJ(JNIEnv *__env, jclass clazz, jlong configAddress, jlong num_indicesAddress, jlong num_verticesAddress) {
    par_octasphere_config const *config = (par_octasphere_config const *)(uintptr_t)configAddress;
    uint32_t *num_indices = (uint32_t *)(uintptr_t)num_indicesAddress;
    uint32_t *num_vertices = (uint32_t *)(uintptr_t)num_verticesAddress;
    UNUSED_PARAMS(__env, clazz)
    par_octasphere_get_counts(config, num_indices, num_vertices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParOctasphere_npar_1octasphere_1populate(JNIEnv *__env, jclass clazz, jlong configAddress, jlong meshAddress) {
    par_octasphere_config const *config = (par_octasphere_config const *)(uintptr_t)configAddress;
    par_octasphere_mesh *mesh = (par_octasphere_mesh *)(uintptr_t)meshAddress;
    UNUSED_PARAMS(__env, clazz)
    par_octasphere_populate(config, mesh);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParOctasphere_npar_1octasphere_1get_1counts__J_3I_3I(JNIEnv *__env, jclass clazz, jlong configAddress, jintArray num_indicesAddress, jintArray num_verticesAddress) {
    par_octasphere_config const *config = (par_octasphere_config const *)(uintptr_t)configAddress;
    jint *num_indices = (*__env)->GetIntArrayElements(__env, num_indicesAddress, NULL);
    jint *num_vertices = (*__env)->GetIntArrayElements(__env, num_verticesAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    par_octasphere_get_counts(config, (uint32_t *)num_indices, (uint32_t *)num_vertices);
    (*__env)->ReleaseIntArrayElements(__env, num_verticesAddress, num_vertices, 0);
    (*__env)->ReleaseIntArrayElements(__env, num_indicesAddress, num_indices, 0);
}

EXTERN_C_EXIT
