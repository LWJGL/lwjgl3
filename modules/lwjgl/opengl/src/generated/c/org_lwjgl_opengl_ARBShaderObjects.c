/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDeleteObjectARBPROC) (jint);
typedef jint (APIENTRY *glGetHandleARBPROC) (jint);
typedef void (APIENTRY *glDetachObjectARBPROC) (jint, jint);
typedef jint (APIENTRY *glCreateShaderObjectARBPROC) (jint);
typedef void (APIENTRY *glShaderSourceARBPROC) (jint, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glCompileShaderARBPROC) (jint);
typedef jint (APIENTRY *glCreateProgramObjectARBPROC) (void);
typedef void (APIENTRY *glAttachObjectARBPROC) (jint, jint);
typedef void (APIENTRY *glLinkProgramARBPROC) (jint);
typedef void (APIENTRY *glUseProgramObjectARBPROC) (jint);
typedef void (APIENTRY *glValidateProgramARBPROC) (jint);
typedef void (APIENTRY *glUniform1fARBPROC) (jint, jfloat);
typedef void (APIENTRY *glUniform2fARBPROC) (jint, jfloat, jfloat);
typedef void (APIENTRY *glUniform3fARBPROC) (jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glUniform4fARBPROC) (jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glUniform1iARBPROC) (jint, jint);
typedef void (APIENTRY *glUniform2iARBPROC) (jint, jint, jint);
typedef void (APIENTRY *glUniform3iARBPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glUniform4iARBPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glUniform1fvARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glUniform2fvARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glUniform3fvARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glUniform4fvARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glUniform1ivARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glUniform2ivARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glUniform3ivARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glUniform4ivARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glUniformMatrix2fvARBPROC) (jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glUniformMatrix3fvARBPROC) (jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glUniformMatrix4fvARBPROC) (jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glGetObjectParameterfvARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetObjectParameterivARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetInfoLogARBPROC) (jint, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glGetAttachedObjectsARBPROC) (jint, jint, uintptr_t, uintptr_t);
typedef jint (APIENTRY *glGetUniformLocationARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGetActiveUniformARBPROC) (jint, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t);
typedef void (APIENTRY *glGetUniformfvARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetUniformivARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetShaderSourceARBPROC) (jint, jint, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_glDeleteObjectARB(JNIEnv *__env, jclass clazz, jint obj) {
    glDeleteObjectARBPROC glDeleteObjectARB = (glDeleteObjectARBPROC)tlsGetFunction(1316);
    UNUSED_PARAM(clazz)
    glDeleteObjectARB(obj);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_glGetHandleARB(JNIEnv *__env, jclass clazz, jint pname) {
    glGetHandleARBPROC glGetHandleARB = (glGetHandleARBPROC)tlsGetFunction(1317);
    UNUSED_PARAM(clazz)
    return (jint)glGetHandleARB(pname);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_glDetachObjectARB(JNIEnv *__env, jclass clazz, jint containerObj, jint attachedObj) {
    glDetachObjectARBPROC glDetachObjectARB = (glDetachObjectARBPROC)tlsGetFunction(1318);
    UNUSED_PARAM(clazz)
    glDetachObjectARB(containerObj, attachedObj);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_glCreateShaderObjectARB(JNIEnv *__env, jclass clazz, jint shaderType) {
    glCreateShaderObjectARBPROC glCreateShaderObjectARB = (glCreateShaderObjectARBPROC)tlsGetFunction(1319);
    UNUSED_PARAM(clazz)
    return (jint)glCreateShaderObjectARB(shaderType);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglShaderSourceARB__IIJJ(JNIEnv *__env, jclass clazz, jint shaderObj, jint count, jlong stringAddress, jlong lengthAddress) {
    glShaderSourceARBPROC glShaderSourceARB = (glShaderSourceARBPROC)tlsGetFunction(1320);
    uintptr_t string = (uintptr_t)stringAddress;
    uintptr_t length = (uintptr_t)lengthAddress;
    UNUSED_PARAM(clazz)
    glShaderSourceARB(shaderObj, count, string, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_glCompileShaderARB(JNIEnv *__env, jclass clazz, jint shaderObj) {
    glCompileShaderARBPROC glCompileShaderARB = (glCompileShaderARBPROC)tlsGetFunction(1321);
    UNUSED_PARAM(clazz)
    glCompileShaderARB(shaderObj);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_glCreateProgramObjectARB(JNIEnv *__env, jclass clazz) {
    glCreateProgramObjectARBPROC glCreateProgramObjectARB = (glCreateProgramObjectARBPROC)tlsGetFunction(1322);
    UNUSED_PARAM(clazz)
    return (jint)glCreateProgramObjectARB();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_glAttachObjectARB(JNIEnv *__env, jclass clazz, jint containerObj, jint obj) {
    glAttachObjectARBPROC glAttachObjectARB = (glAttachObjectARBPROC)tlsGetFunction(1323);
    UNUSED_PARAM(clazz)
    glAttachObjectARB(containerObj, obj);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_glLinkProgramARB(JNIEnv *__env, jclass clazz, jint programObj) {
    glLinkProgramARBPROC glLinkProgramARB = (glLinkProgramARBPROC)tlsGetFunction(1324);
    UNUSED_PARAM(clazz)
    glLinkProgramARB(programObj);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_glUseProgramObjectARB(JNIEnv *__env, jclass clazz, jint programObj) {
    glUseProgramObjectARBPROC glUseProgramObjectARB = (glUseProgramObjectARBPROC)tlsGetFunction(1325);
    UNUSED_PARAM(clazz)
    glUseProgramObjectARB(programObj);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_glValidateProgramARB(JNIEnv *__env, jclass clazz, jint programObj) {
    glValidateProgramARBPROC glValidateProgramARB = (glValidateProgramARBPROC)tlsGetFunction(1326);
    UNUSED_PARAM(clazz)
    glValidateProgramARB(programObj);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_glUniform1fARB(JNIEnv *__env, jclass clazz, jint location, jfloat v0) {
    glUniform1fARBPROC glUniform1fARB = (glUniform1fARBPROC)tlsGetFunction(1327);
    UNUSED_PARAM(clazz)
    glUniform1fARB(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_glUniform2fARB(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1) {
    glUniform2fARBPROC glUniform2fARB = (glUniform2fARBPROC)tlsGetFunction(1328);
    UNUSED_PARAM(clazz)
    glUniform2fARB(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_glUniform3fARB(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jfloat v2) {
    glUniform3fARBPROC glUniform3fARB = (glUniform3fARBPROC)tlsGetFunction(1329);
    UNUSED_PARAM(clazz)
    glUniform3fARB(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_glUniform4fARB(JNIEnv *__env, jclass clazz, jint location, jfloat v0, jfloat v1, jfloat v2, jfloat v3) {
    glUniform4fARBPROC glUniform4fARB = (glUniform4fARBPROC)tlsGetFunction(1330);
    UNUSED_PARAM(clazz)
    glUniform4fARB(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_glUniform1iARB(JNIEnv *__env, jclass clazz, jint location, jint v0) {
    glUniform1iARBPROC glUniform1iARB = (glUniform1iARBPROC)tlsGetFunction(1331);
    UNUSED_PARAM(clazz)
    glUniform1iARB(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_glUniform2iARB(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1) {
    glUniform2iARBPROC glUniform2iARB = (glUniform2iARBPROC)tlsGetFunction(1332);
    UNUSED_PARAM(clazz)
    glUniform2iARB(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_glUniform3iARB(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2) {
    glUniform3iARBPROC glUniform3iARB = (glUniform3iARBPROC)tlsGetFunction(1333);
    UNUSED_PARAM(clazz)
    glUniform3iARB(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_glUniform4iARB(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jint v3) {
    glUniform4iARBPROC glUniform4iARB = (glUniform4iARBPROC)tlsGetFunction(1334);
    UNUSED_PARAM(clazz)
    glUniform4iARB(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform1fvARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform1fvARBPROC glUniform1fvARB = (glUniform1fvARBPROC)tlsGetFunction(1335);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform1fvARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform2fvARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform2fvARBPROC glUniform2fvARB = (glUniform2fvARBPROC)tlsGetFunction(1336);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform2fvARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform3fvARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform3fvARBPROC glUniform3fvARB = (glUniform3fvARBPROC)tlsGetFunction(1337);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform3fvARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform4fvARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform4fvARBPROC glUniform4fvARB = (glUniform4fvARBPROC)tlsGetFunction(1338);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform4fvARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform1ivARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform1ivARBPROC glUniform1ivARB = (glUniform1ivARBPROC)tlsGetFunction(1339);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform1ivARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform2ivARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform2ivARBPROC glUniform2ivARB = (glUniform2ivARBPROC)tlsGetFunction(1340);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform2ivARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform3ivARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform3ivARBPROC glUniform3ivARB = (glUniform3ivARBPROC)tlsGetFunction(1341);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform3ivARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniform4ivARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform4ivARBPROC glUniform4ivARB = (glUniform4ivARBPROC)tlsGetFunction(1342);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform4ivARB(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniformMatrix2fvARB__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix2fvARBPROC glUniformMatrix2fvARB = (glUniformMatrix2fvARBPROC)tlsGetFunction(1343);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix2fvARB(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniformMatrix3fvARB__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix3fvARBPROC glUniformMatrix3fvARB = (glUniformMatrix3fvARBPROC)tlsGetFunction(1344);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix3fvARB(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglUniformMatrix4fvARB__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix4fvARBPROC glUniformMatrix4fvARB = (glUniformMatrix4fvARBPROC)tlsGetFunction(1345);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix4fvARB(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetObjectParameterfvARB__IIJ(JNIEnv *__env, jclass clazz, jint obj, jint pname, jlong paramsAddress) {
    glGetObjectParameterfvARBPROC glGetObjectParameterfvARB = (glGetObjectParameterfvARBPROC)tlsGetFunction(1346);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetObjectParameterfvARB(obj, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetObjectParameterivARB__IIJ(JNIEnv *__env, jclass clazz, jint obj, jint pname, jlong paramsAddress) {
    glGetObjectParameterivARBPROC glGetObjectParameterivARB = (glGetObjectParameterivARBPROC)tlsGetFunction(1347);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetObjectParameterivARB(obj, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetInfoLogARB__IIJJ(JNIEnv *__env, jclass clazz, jint obj, jint maxLength, jlong lengthAddress, jlong infoLogAddress) {
    glGetInfoLogARBPROC glGetInfoLogARB = (glGetInfoLogARBPROC)tlsGetFunction(1348);
    uintptr_t length = (uintptr_t)lengthAddress;
    uintptr_t infoLog = (uintptr_t)infoLogAddress;
    UNUSED_PARAM(clazz)
    glGetInfoLogARB(obj, maxLength, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetAttachedObjectsARB__IIJJ(JNIEnv *__env, jclass clazz, jint containerObj, jint maxCount, jlong countAddress, jlong objAddress) {
    glGetAttachedObjectsARBPROC glGetAttachedObjectsARB = (glGetAttachedObjectsARBPROC)tlsGetFunction(1349);
    uintptr_t count = (uintptr_t)countAddress;
    uintptr_t obj = (uintptr_t)objAddress;
    UNUSED_PARAM(clazz)
    glGetAttachedObjectsARB(containerObj, maxCount, count, obj);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetUniformLocationARB(JNIEnv *__env, jclass clazz, jint programObj, jlong nameAddress) {
    glGetUniformLocationARBPROC glGetUniformLocationARB = (glGetUniformLocationARBPROC)tlsGetFunction(1350);
    uintptr_t name = (uintptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetUniformLocationARB(programObj, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetActiveUniformARB__IIIJJJJ(JNIEnv *__env, jclass clazz, jint programObj, jint index, jint maxLength, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress) {
    glGetActiveUniformARBPROC glGetActiveUniformARB = (glGetActiveUniformARBPROC)tlsGetFunction(1351);
    uintptr_t length = (uintptr_t)lengthAddress;
    uintptr_t size = (uintptr_t)sizeAddress;
    uintptr_t type = (uintptr_t)typeAddress;
    uintptr_t name = (uintptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glGetActiveUniformARB(programObj, index, maxLength, length, size, type, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetUniformfvARB__IIJ(JNIEnv *__env, jclass clazz, jint programObj, jint location, jlong paramsAddress) {
    glGetUniformfvARBPROC glGetUniformfvARB = (glGetUniformfvARBPROC)tlsGetFunction(1352);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetUniformfvARB(programObj, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetUniformivARB__IIJ(JNIEnv *__env, jclass clazz, jint programObj, jint location, jlong paramsAddress) {
    glGetUniformivARBPROC glGetUniformivARB = (glGetUniformivARBPROC)tlsGetFunction(1353);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetUniformivARB(programObj, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderObjects_nglGetShaderSourceARB__IIJJ(JNIEnv *__env, jclass clazz, jint obj, jint maxLength, jlong lengthAddress, jlong sourceAddress) {
    glGetShaderSourceARBPROC glGetShaderSourceARB = (glGetShaderSourceARBPROC)tlsGetFunction(1354);
    uintptr_t length = (uintptr_t)lengthAddress;
    uintptr_t source = (uintptr_t)sourceAddress;
    UNUSED_PARAM(clazz)
    glGetShaderSourceARB(obj, maxLength, length, source);
}

EXTERN_C_EXIT
