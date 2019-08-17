/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

typedef struct {
  const char *Buffer;
  size_t Size;
} LTOObjectBuffer;

typedef LTOObjectBuffer (*thinlto_module_get_objectPROC) (intptr_t, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_LLVMLTO_nthinlto_1module_1get_1object(JNIEnv *__env, jclass clazz, jlong cgAddress, jint index, jlong __functionAddress, jlong __result) {
    thinlto_module_get_objectPROC thinlto_module_get_object = (thinlto_module_get_objectPROC)(intptr_t)__functionAddress;
    intptr_t cg = (intptr_t)cgAddress;
    UNUSED_PARAMS(__env, clazz)
    *((LTOObjectBuffer*)(intptr_t)__result) = thinlto_module_get_object(cg, index);
}

EXTERN_C_EXIT
