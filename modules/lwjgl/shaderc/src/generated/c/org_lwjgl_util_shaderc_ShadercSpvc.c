/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

typedef jint (*shaderc_spvc_add_msl_resource_bindingPROC) (intptr_t, shaderc_spvc_msl_resource_binding const);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_shaderc_ShadercSpvc_nshaderc_1spvc_1add_1msl_1resource_1binding(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong bindingAddress, jlong __functionAddress) {
    shaderc_spvc_add_msl_resource_bindingPROC shaderc_spvc_add_msl_resource_binding = (shaderc_spvc_add_msl_resource_bindingPROC)(intptr_t)__functionAddress;
    intptr_t context = (intptr_t)contextAddress;
    shaderc_spvc_msl_resource_binding const *binding = (shaderc_spvc_msl_resource_binding const *)(intptr_t)bindingAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)shaderc_spvc_add_msl_resource_binding(context, *binding);
}

EXTERN_C_EXIT
