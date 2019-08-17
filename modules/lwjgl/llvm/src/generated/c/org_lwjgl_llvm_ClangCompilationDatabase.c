/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "clang-c/CXCompilationDatabase.h"

typedef CXString (*clang_CompileCommand_getDirectoryPROC) (intptr_t);
typedef CXString (*clang_CompileCommand_getFilenamePROC) (intptr_t);
typedef CXString (*clang_CompileCommand_getArgPROC) (intptr_t, jint);
typedef CXString (*clang_CompileCommand_getMappedSourcePathPROC) (intptr_t, jint);
typedef CXString (*clang_CompileCommand_getMappedSourceContentPROC) (intptr_t, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangCompilationDatabase_nclang_1CompileCommand_1getDirectory(JNIEnv *__env, jclass clazz, jlong commandAddress, jlong __functionAddress, jlong __result) {
    clang_CompileCommand_getDirectoryPROC clang_CompileCommand_getDirectory = (clang_CompileCommand_getDirectoryPROC)(intptr_t)__functionAddress;
    intptr_t command = (intptr_t)commandAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_CompileCommand_getDirectory(command);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangCompilationDatabase_nclang_1CompileCommand_1getFilename(JNIEnv *__env, jclass clazz, jlong commandAddress, jlong __functionAddress, jlong __result) {
    clang_CompileCommand_getFilenamePROC clang_CompileCommand_getFilename = (clang_CompileCommand_getFilenamePROC)(intptr_t)__functionAddress;
    intptr_t command = (intptr_t)commandAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_CompileCommand_getFilename(command);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangCompilationDatabase_nclang_1CompileCommand_1getArg(JNIEnv *__env, jclass clazz, jlong commandAddress, jint I, jlong __functionAddress, jlong __result) {
    clang_CompileCommand_getArgPROC clang_CompileCommand_getArg = (clang_CompileCommand_getArgPROC)(intptr_t)__functionAddress;
    intptr_t command = (intptr_t)commandAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_CompileCommand_getArg(command, I);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangCompilationDatabase_nclang_1CompileCommand_1getMappedSourcePath(JNIEnv *__env, jclass clazz, jlong commandAddress, jint I, jlong __functionAddress, jlong __result) {
    clang_CompileCommand_getMappedSourcePathPROC clang_CompileCommand_getMappedSourcePath = (clang_CompileCommand_getMappedSourcePathPROC)(intptr_t)__functionAddress;
    intptr_t command = (intptr_t)commandAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_CompileCommand_getMappedSourcePath(command, I);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangCompilationDatabase_nclang_1CompileCommand_1getMappedSourceContent(JNIEnv *__env, jclass clazz, jlong commandAddress, jint I, jlong __functionAddress, jlong __result) {
    clang_CompileCommand_getMappedSourceContentPROC clang_CompileCommand_getMappedSourceContent = (clang_CompileCommand_getMappedSourceContentPROC)(intptr_t)__functionAddress;
    intptr_t command = (intptr_t)commandAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_CompileCommand_getMappedSourceContent(command, I);
}

EXTERN_C_EXIT
