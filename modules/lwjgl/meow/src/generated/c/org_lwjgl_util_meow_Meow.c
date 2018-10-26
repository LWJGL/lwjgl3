/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#ifdef LWJGL_WINDOWS
    #include <intrin.h>
#else
    #include <x86intrin.h>
#endif
#include "meow_hash.h"

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_util_meow_Meow_nMeowHash1__JJJJ(JNIEnv *__env, jclass clazz, jlong Seed, jlong TotalLengthInBytes, jlong SourceInitAddress, jlong __result) {
    void *SourceInit = (void *)(intptr_t)SourceInitAddress;
    UNUSED_PARAMS(__env, clazz)
    *((meow_hash*)(intptr_t)__result) = MeowHash1((meow_u64)Seed, (meow_u64)TotalLengthInBytes, SourceInit);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_meow_Meow_nMeowHashesAreEqual(JNIEnv *__env, jclass clazz, jlong AAddress, jlong BAddress) {
    meow_hash *A = (meow_hash *)(intptr_t)AAddress;
    meow_hash *B = (meow_hash *)(intptr_t)BAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)MeowHashesAreEqual(*A, *B);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meow_Meow_nMeowSourceBlocksFor__JJJ(JNIEnv *__env, jclass clazz, jlong TotalLengthInBytes, jlong SourceAddress, jlong __result) {
    void *Source = (void *)(intptr_t)SourceAddress;
    UNUSED_PARAMS(__env, clazz)
    *((meow_source_blocks*)(intptr_t)__result) = MeowSourceBlocksFor((meow_u64)TotalLengthInBytes, Source);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meow_Meow_nMeowGetMacroblock(JNIEnv *__env, jclass clazz, jlong BlocksAddress, jlong Index, jlong __result) {
    meow_source_blocks *Blocks = (meow_source_blocks *)(intptr_t)BlocksAddress;
    UNUSED_PARAMS(__env, clazz)
    *((meow_macroblock*)(intptr_t)__result) = MeowGetMacroblock(Blocks, (meow_u64)Index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meow_Meow_nMeowHashMerge(JNIEnv *__env, jclass clazz, jlong AAddress, jlong BAddress) {
    meow_macroblock_result *A = (meow_macroblock_result *)(intptr_t)AAddress;
    meow_macroblock_result *B = (meow_macroblock_result *)(intptr_t)BAddress;
    UNUSED_PARAMS(__env, clazz)
    MeowHashMerge(A, B);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meow_Meow_nMeowHashFinish(JNIEnv *__env, jclass clazz, jlong StateAddress, jlong Seed, jlong TotalLengthInBytes, jint Overhang, jlong OverhangStartAddress, jlong __result) {
    meow_macroblock_result *State = (meow_macroblock_result *)(intptr_t)StateAddress;
    meow_u8 *OverhangStart = (meow_u8 *)(intptr_t)OverhangStartAddress;
    UNUSED_PARAMS(__env, clazz)
    *((meow_hash*)(intptr_t)__result) = MeowHashFinish(State, (meow_u64)Seed, (meow_u64)TotalLengthInBytes, Overhang, OverhangStart);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meow_Meow_nMeowHashMergeArray(JNIEnv *__env, jclass clazz, jlong MacroBlockCount, jlong MacroBlockHashesAddress, jlong __result) {
    meow_macroblock_result *MacroBlockHashes = (meow_macroblock_result *)(intptr_t)MacroBlockHashesAddress;
    UNUSED_PARAMS(__env, clazz)
    *((meow_macroblock_result*)(intptr_t)__result) = MeowHashMergeArray((meow_u64)MacroBlockCount, MacroBlockHashes);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meow_Meow_nMeowHash1Op(JNIEnv *__env, jclass clazz, jint BlockCount, jlong SourceAddress, jlong __result) {
    meow_u8 *Source = (meow_u8 *)(intptr_t)SourceAddress;
    UNUSED_PARAMS(__env, clazz)
    *((meow_macroblock_result*)(intptr_t)__result) = MeowHash1Op(BlockCount, Source);
}

EXTERN_C_EXIT
