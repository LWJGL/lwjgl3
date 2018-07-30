/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

#ifdef LWJGL_WINDOWS
    #define APIENTRY __stdcall
#else
    #define APIENTRY
#endif

#define ARITY0(type, signature, expression) \
JNIEXPORT type JNICALL Java_org_lwjgl_system_JNI_##signature(JNIEnv *__env, jclass clazz, jlong __functionAddress) { \
    UNUSED_PARAMS(__env, clazz) \
    expression; \
}

#define ARITYn(type, signature, expression, ...) \
JNIEXPORT type JNICALL Java_org_lwjgl_system_JNI_##signature(JNIEnv *__env, jclass clazz, jlong __functionAddress, __VA_ARGS__) { \
    UNUSED_PARAMS(__env, clazz) \
    expression; \
}

ARITYn(jbyte, invokePB__JBJ, return ((jbyte (*) (jbyte, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1), jbyte param0, jlong param1)
ARITY0(jdouble, invokeD__J, return ((jdouble (*) ())(intptr_t)__functionAddress)())
ARITYn(jdouble, invokeD__JI, return ((jdouble (*) (jint))(intptr_t)__functionAddress)(param0), jint param0)
ARITYn(jfloat, invokeF__JF, return ((jfloat (*) (jfloat))(intptr_t)__functionAddress)(param0), jfloat param0)
ARITYn(jfloat, invokeF__JI, return ((jfloat (*) (jint))(intptr_t)__functionAddress)(param0), jint param0)
ARITYn(jfloat, invokePF__JJ, return ((jfloat (*) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0), jlong param0)
ARITYn(jfloat, invokePF__JJFF, return ((jfloat (*) (intptr_t, jfloat, jfloat))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2), jlong param0, jfloat param1, jfloat param2)
ARITYn(jfloat, invokePPF__JJFJI, return ((jfloat (*) (intptr_t, jfloat, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3), jlong param0, jfloat param1, jlong param2, jint param3)
ARITYn(jfloat, invokePF__JJI, return ((jfloat (*) (intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jint param1)
ARITYn(jfloat, invokePPF__JJIJ, return ((jfloat (*) (intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2), jlong param0, jint param1, jlong param2)
ARITYn(jfloat, invokePPF__JJJ, return ((jfloat (*) (intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1), jlong param0, jlong param1)
ARITY0(jint, invokeI__J, return ((jint (*) ())(intptr_t)__functionAddress)())
ARITYn(jint, invokeI__JI, return ((jint (*) (jint))(intptr_t)__functionAddress)(param0), jint param0)
ARITYn(jint, invokePI__JIJ, return ((jint (*) (jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1), jint param0, jlong param1)
ARITYn(jint, invokePPI__JIJIJIZ, return ((jint (*) (jint, intptr_t, jint, intptr_t, jint, jboolean))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, (intptr_t)param3, param4, param5), jint param0, jlong param1, jint param2, jlong param3, jint param4, jboolean param5)
ARITYn(jint, invokeI__JIS, return ((jint (*) (jint, jshort))(intptr_t)__functionAddress)(param0, param1), jint param0, jshort param1)
ARITYn(jint, invokePI__JJ, return ((jint (*) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0), jlong param0)
ARITYn(jint, invokePI__JJI, return ((jint (*) (intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jint param1)
ARITYn(jint, invokePPPPPPPPI__JJIIJJJJJJJ, return ((jint (*) (intptr_t, jint, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, (intptr_t)param8, (intptr_t)param9), jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9)
ARITYn(jint, invokePJI__JJJ, return ((jint (*) (intptr_t, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jlong param1)
ARITYn(jint, invokePPI__JJJ, return ((jint (*) (intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1), jlong param0, jlong param1)
ARITYn(jint, invokePPI__JJJI, return ((jint (*) (intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2), jlong param0, jlong param1, jint param2)
ARITYn(jint, invokePPPI__JJJIIJ, return ((jint (*) (intptr_t, intptr_t, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, (intptr_t)param4), jlong param0, jlong param1, jint param2, jint param3, jlong param4)
ARITYn(jint, invokePPPPI__JJJIIJJ, return ((jint (*) (intptr_t, intptr_t, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong param5)
ARITYn(jint, invokePPPPI__JJJIJJ, return ((jint (*) (intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jlong param1, jint param2, jlong param3, jlong param4)
ARITYn(jint, invokePPPI__JJJJ, return ((jint (*) (intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2), jlong param0, jlong param1, jlong param2)
ARITYn(jint, invokePPPI__JJJJI, return ((jint (*) (intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3), jlong param0, jlong param1, jlong param2, jint param3)
ARITYn(jint, invokePPPPI__JJJJJ, return ((jint (*) (intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3), jlong param0, jlong param1, jlong param2, jlong param3)
ARITYn(jint, invokePPPPI__JJJJJI, return ((jint (*) (intptr_t, intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, param4), jlong param0, jlong param1, jlong param2, jlong param3, jint param4)
ARITYn(jint, invokePPPPPI__JJJJJJ, return ((jint (*) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4)
ARITYn(jint, invokePPPPPPI__JJJJJJJ, return ((jint (*) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5)
ARITYn(jint, invokePPI__JJJS, return ((jint (*) (intptr_t, intptr_t, jshort))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2), jlong param0, jlong param1, jshort param2)
ARITYn(jint, invokePI__JJS, return ((jint (*) (intptr_t, jshort))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jshort param1)
ARITYn(jint, invokePI__JSJ, return ((jint (*) (jshort, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1), jshort param0, jlong param1)
ARITYn(jint, invokePI__JSJB, return ((jint (*) (jshort, intptr_t, jbyte))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2), jshort param0, jlong param1, jbyte param2)
ARITYn(jint, invokeI__JZ, return ((jint (*) (jboolean))(intptr_t)__functionAddress)(param0), jboolean param0)
ARITY0(jlong, invokeJ__J, return ((jlong (*) ())(intptr_t)__functionAddress)())
ARITYn(jlong, invokeJJ__JJ, return ((jlong (*) (jlong))(intptr_t)__functionAddress)(param0), jlong param0)
ARITYn(jlong, invokePJ__JJFIFI, return ((jlong (*) (intptr_t, jfloat, jint, jfloat, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4), jlong param0, jfloat param1, jint param2, jfloat param3, jint param4)
ARITYn(jlong, invokeJJJ__JJJ, return ((jlong (*) (jlong, jlong))(intptr_t)__functionAddress)(param0, param1), jlong param0, jlong param1)
ARITYn(jlong, invokeJJJJ__JJJJ, return ((jlong (*) (jlong, jlong, jlong))(intptr_t)__functionAddress)(param0, param1, param2), jlong param0, jlong param1, jlong param2)
ARITYn(jlong, invokeJJJJJ__JJJJJ, return ((jlong (*) (jlong, jlong, jlong, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3), jlong param0, jlong param1, jlong param2, jlong param3)
ARITY0(jlong, invokeP__J, return (jlong)((intptr_t (*) ())(intptr_t)__functionAddress)())
ARITYn(jlong, invokeP__JI, return (jlong)((intptr_t (*) (jint))(intptr_t)__functionAddress)(param0), jint param0)
ARITYn(jlong, invokeP__JII, return (jlong)((intptr_t (*) (jint, jint))(intptr_t)__functionAddress)(param0, param1), jint param0, jint param1)
ARITYn(jlong, invokePPPP__JIIJJJ, return (jlong)((intptr_t (*) (jint, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4), jint param0, jint param1, jlong param2, jlong param3, jlong param4)
ARITYn(jlong, invokePP__JIJ, return (jlong)((intptr_t (*) (jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1), jint param0, jlong param1)
ARITYn(jlong, invokePP__JJ, return (jlong)((intptr_t (*) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0), jlong param0)
ARITYn(jlong, invokePP__JJI, return (jlong)((intptr_t (*) (intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jint param1)
ARITYn(jlong, invokePP__JJII, return (jlong)((intptr_t (*) (intptr_t, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2), jlong param0, jint param1, jint param2)
ARITYn(jlong, invokePP__JJIII, return (jlong)((intptr_t (*) (intptr_t, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3), jlong param0, jint param1, jint param2, jint param3)
ARITYn(jlong, invokePPP__JJIIJ, return (jlong)((intptr_t (*) (intptr_t, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3), jlong param0, jint param1, jint param2, jlong param3)
ARITYn(jlong, invokePPPP__JJIIJJ, return (jlong)((intptr_t (*) (intptr_t, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jint param1, jint param2, jlong param3, jlong param4)
ARITYn(jlong, invokePPP__JJIJ, return (jlong)((intptr_t (*) (intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2), jlong param0, jint param1, jlong param2)
ARITYn(jlong, invokePPP__JJIJI, return (jlong)((intptr_t (*) (intptr_t, jint, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3), jlong param0, jint param1, jlong param2, jint param3)
ARITYn(jlong, invokePPPP__JJIJJ, return (jlong)((intptr_t (*) (intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3), jlong param0, jint param1, jlong param2, jlong param3)
ARITYn(jlong, invokePPP__JJJ, return (jlong)((intptr_t (*) (intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1), jlong param0, jlong param1)
ARITYn(jlong, invokePPP__JJJI, return (jlong)((intptr_t (*) (intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2), jlong param0, jlong param1, jint param2)
ARITYn(jlong, invokePPPPPP__JJJIIIIIIIJJJ, return (jlong)((intptr_t (*) (intptr_t, intptr_t, jint, jint, jint, jint, jint, jint, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9, (intptr_t)param10, (intptr_t)param11), jlong param0, jlong param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jlong param9, jlong param10, jlong param11)
ARITYn(jlong, invokePPPP__JJJJ, return (jlong)((intptr_t (*) (intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2), jlong param0, jlong param1, jlong param2)
ARITYn(jlong, invokePPPP__JJJJI, return (jlong)((intptr_t (*) (intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3), jlong param0, jlong param1, jlong param2, jint param3)
ARITYn(jlong, invokePPPPP__JJJJJ, return (jlong)((intptr_t (*) (intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3), jlong param0, jlong param1, jlong param2, jlong param3)
ARITYn(jlong, invokePPPPPP__JJJJJJI, return (jlong)((intptr_t (*) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, param5), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5)
ARITYn(jlong, invokePPPPPPP__JJJJJJJI, return (jlong)((intptr_t (*) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, param6), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jint param6)
ARITYn(jlong, invokePPP__JJJZZ, return (jlong)((intptr_t (*) (intptr_t, intptr_t, jboolean, jboolean))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3), jlong param0, jlong param1, jboolean param2, jboolean param3)
ARITYn(jlong, invokePPP__JJSSSSJ, return (jlong)((intptr_t (*) (intptr_t, jshort, jshort, jshort, jshort, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5), jlong param0, jshort param1, jshort param2, jshort param3, jshort param4, jlong param5)
ARITYn(jlong, invokePPP__JJZZJ, return (jlong)((intptr_t (*) (intptr_t, jboolean, jboolean, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3), jlong param0, jboolean param1, jboolean param2, jlong param3)
ARITYn(jlong, invokeP__JS, return (jlong)((intptr_t (*) (jshort))(intptr_t)__functionAddress)(param0), jshort param0)
ARITYn(jlong, invokePP__JSJ, return (jlong)((intptr_t (*) (jshort, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1), jshort param0, jlong param1)
ARITYn(jlong, invokeP__JSSSBII, return (jlong)((intptr_t (*) (jshort, jshort, jshort, jbyte, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5), jshort param0, jshort param1, jshort param2, jbyte param3, jint param4, jint param5)
ARITY0(jshort, invokeS__J, return ((jshort (*) ())(intptr_t)__functionAddress)())
ARITYn(jshort, invokePS__JBJZ, return ((jshort (*) (jbyte, intptr_t, jboolean))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2), jbyte param0, jlong param1, jboolean param2)
ARITYn(jshort, invokeS__JI, return ((jshort (*) (jint))(intptr_t)__functionAddress)(param0), jint param0)
ARITYn(jshort, invokeS__JIII, return ((jshort (*) (jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jint param1, jint param2)
ARITYn(jshort, invokePS__JIJS, return ((jshort (*) (jint, intptr_t, jshort))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2), jint param0, jlong param1, jshort param2)
ARITYn(jshort, invokeS__JIS, return ((jshort (*) (jint, jshort))(intptr_t)__functionAddress)(param0, param1), jint param0, jshort param1)
ARITYn(jshort, invokeS__JIZSII, return ((jshort (*) (jint, jboolean, jshort, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jint param0, jboolean param1, jshort param2, jint param3, jint param4)
ARITYn(jshort, invokePS__JJ, return ((jshort (*) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0), jlong param0)
ARITYn(jshort, invokePPS__JJIBJ, return ((jshort (*) (intptr_t, jint, jbyte, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3), jlong param0, jint param1, jbyte param2, jlong param3)
ARITYn(jshort, invokePS__JJIS, return ((jshort (*) (intptr_t, jint, jshort))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2), jlong param0, jint param1, jshort param2)
ARITYn(jshort, invokePPPS__JJJJSF, return ((jshort (*) (intptr_t, intptr_t, intptr_t, jshort, jfloat))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, param4), jlong param0, jlong param1, jlong param2, jshort param3, jfloat param4)
ARITYn(jshort, invokePPS__JJJS, return ((jshort (*) (intptr_t, intptr_t, jshort))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2), jlong param0, jlong param1, jshort param2)
ARITYn(jshort, invokePS__JJS, return ((jshort (*) (intptr_t, jshort))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jshort param1)
ARITYn(jshort, invokePS__JJSSI, return ((jshort (*) (intptr_t, jshort, jshort, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3), jlong param0, jshort param1, jshort param2, jint param3)
ARITYn(jshort, invokePS__JJSSSS, return ((jshort (*) (intptr_t, jshort, jshort, jshort, jshort))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4), jlong param0, jshort param1, jshort param2, jshort param3, jshort param4)
ARITYn(jshort, invokeS__JSB, return ((jshort (*) (jshort, jbyte))(intptr_t)__functionAddress)(param0, param1), jshort param0, jbyte param1)
ARITYn(jshort, invokePS__JSJS, return ((jshort (*) (jshort, intptr_t, jshort))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2), jshort param0, jlong param1, jshort param2)
ARITYn(jshort, invokeS__JSSII, return ((jshort (*) (jshort, jshort, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3), jshort param0, jshort param1, jint param2, jint param3)
ARITYn(jshort, invokeS__JSSSS, return ((jshort (*) (jshort, jshort, jshort, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3), jshort param0, jshort param1, jshort param2, jshort param3)
ARITYn(jshort, invokePS__JSSSZIIJ, return ((jshort (*) (jshort, jshort, jshort, jboolean, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (intptr_t)param6), jshort param0, jshort param1, jshort param2, jboolean param3, jint param4, jint param5, jlong param6)
ARITYn(jshort, invokeS__JSSZ, return ((jshort (*) (jshort, jshort, jboolean))(intptr_t)__functionAddress)(param0, param1, param2), jshort param0, jshort param1, jboolean param2)
ARITYn(jshort, invokePS__JSSZSIIJ, return ((jshort (*) (jshort, jshort, jboolean, jshort, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (intptr_t)param6), jshort param0, jshort param1, jboolean param2, jshort param3, jint param4, jint param5, jlong param6)
ARITYn(jshort, invokeS__JSZ, return ((jshort (*) (jshort, jboolean))(intptr_t)__functionAddress)(param0, param1), jshort param0, jboolean param1)
ARITYn(jshort, invokePS__JSZSIIJ, return ((jshort (*) (jshort, jboolean, jshort, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, (intptr_t)param5), jshort param0, jboolean param1, jshort param2, jint param3, jint param4, jlong param5)
ARITY0(void, invokeV__J, ((void (*) ())(intptr_t)__functionAddress)())
ARITYn(void, invokePV__JBJ, ((void (*) (jbyte, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1), jbyte param0, jlong param1)
ARITYn(void, invokePV__JBJII, ((void (*) (jbyte, intptr_t, jint, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, param3), jbyte param0, jlong param1, jint param2, jint param3)
ARITYn(void, invokeV__JBSBII, ((void (*) (jbyte, jshort, jbyte, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jbyte param0, jshort param1, jbyte param2, jint param3, jint param4)
ARITYn(void, invokeV__JBSI, ((void (*) (jbyte, jshort, jint))(intptr_t)__functionAddress)(param0, param1, param2), jbyte param0, jshort param1, jint param2)
ARITYn(void, invokeV__JBSII, ((void (*) (jbyte, jshort, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3), jbyte param0, jshort param1, jint param2, jint param3)
ARITYn(void, invokeV__JBSSI, ((void (*) (jbyte, jshort, jshort, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3), jbyte param0, jshort param1, jshort param2, jint param3)
ARITYn(void, invokeV__JBZ, ((void (*) (jbyte, jboolean))(intptr_t)__functionAddress)(param0, param1), jbyte param0, jboolean param1)
ARITYn(void, invokeV__JD, ((void (*) (jdouble))(intptr_t)__functionAddress)(param0), jdouble param0)
ARITYn(void, invokeV__JF, ((void (*) (jfloat))(intptr_t)__functionAddress)(param0), jfloat param0)
ARITYn(void, invokeV__JI, ((void (*) (jint))(intptr_t)__functionAddress)(param0), jint param0)
ARITYn(void, invokeV__JIF, ((void (*) (jint, jfloat))(intptr_t)__functionAddress)(param0, param1), jint param0, jfloat param1)
ARITYn(void, invokeV__JIFFF, ((void (*) (jint, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3), jint param0, jfloat param1, jfloat param2, jfloat param3)
ARITYn(void, invokeV__JII, ((void (*) (jint, jint))(intptr_t)__functionAddress)(param0, param1), jint param0, jint param1)
ARITYn(void, invokeV__JIID, ((void (*) (jint, jint, jdouble))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jint param1, jdouble param2)
ARITYn(void, invokeV__JIIDDD, ((void (*) (jint, jint, jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jint param0, jint param1, jdouble param2, jdouble param3, jdouble param4)
ARITYn(void, invokeV__JIIF, ((void (*) (jint, jint, jfloat))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jint param1, jfloat param2)
ARITYn(void, invokeV__JIIFFF, ((void (*) (jint, jint, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jint param0, jint param1, jfloat param2, jfloat param3, jfloat param4)
ARITYn(void, invokeV__JIII, ((void (*) (jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jint param1, jint param2)
ARITYn(void, invokeV__JIIIII, ((void (*) (jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jint param0, jint param1, jint param2, jint param3, jint param4)
ARITYn(void, invokePV__JIIJ, ((void (*) (jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2), jint param0, jint param1, jlong param2)
ARITYn(void, invokeJV__JIIJ, ((void (*) (jint, jint, jlong))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jint param1, jlong param2)
ARITYn(void, invokePV__JIIJII, ((void (*) (jint, jint, intptr_t, jint, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4), jint param0, jint param1, jlong param2, jint param3, jint param4)
ARITYn(void, invokePPPV__JIIJJJ, ((void (*) (jint, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4), jint param0, jint param1, jlong param2, jlong param3, jlong param4)
ARITYn(void, invokeJJJV__JIIJJJ, ((void (*) (jint, jint, jlong, jlong, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jint param0, jint param1, jlong param2, jlong param3, jlong param4)
ARITYn(void, invokePV__JIJ, ((void (*) (jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1), jint param0, jlong param1)
ARITYn(void, invokePPPPPV__JIJIJJJIJIZ, ((void (*) (jint, intptr_t, jint, intptr_t, intptr_t, intptr_t, jint, intptr_t, jint, jboolean))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, param6, (intptr_t)param7, param8, param9), jint param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jint param6, jlong param7, jint param8, jboolean param9)
ARITYn(void, invokePPPV__JIJJJ, ((void (*) (jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3), jint param0, jlong param1, jlong param2, jlong param3)
ARITYn(void, invokeV__JIS, ((void (*) (jint, jshort))(intptr_t)__functionAddress)(param0, param1), jint param0, jshort param1)
ARITYn(void, invokePV__JJ, ((void (*) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0), jlong param0)
ARITYn(void, invokePV__JJB, ((void (*) (intptr_t, jbyte))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jbyte param1)
ARITYn(void, invokePPV__JJBJII, ((void (*) (intptr_t, jbyte, intptr_t, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, param4), jlong param0, jbyte param1, jlong param2, jint param3, jint param4)
ARITYn(void, invokePV__JJBSBII, ((void (*) (intptr_t, jbyte, jshort, jbyte, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5), jlong param0, jbyte param1, jshort param2, jbyte param3, jint param4, jint param5)
ARITYn(void, invokePV__JJBSI, ((void (*) (intptr_t, jbyte, jshort, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3), jlong param0, jbyte param1, jshort param2, jint param3)
ARITYn(void, invokePV__JJBSII, ((void (*) (intptr_t, jbyte, jshort, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4), jlong param0, jbyte param1, jshort param2, jint param3, jint param4)
ARITYn(void, invokePV__JJBSSI, ((void (*) (intptr_t, jbyte, jshort, jshort, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4), jlong param0, jbyte param1, jshort param2, jshort param3, jint param4)
ARITYn(void, invokePV__JJDD, ((void (*) (intptr_t, jdouble, jdouble))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2), jlong param0, jdouble param1, jdouble param2)
ARITYn(void, invokePV__JJF, ((void (*) (intptr_t, jfloat))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jfloat param1)
ARITYn(void, invokePV__JJFF, ((void (*) (intptr_t, jfloat, jfloat))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2), jlong param0, jfloat param1, jfloat param2)
ARITYn(void, invokePPV__JJFJII, ((void (*) (intptr_t, jfloat, intptr_t, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, param4), jlong param0, jfloat param1, jlong param2, jint param3, jint param4)
ARITYn(void, invokePV__JJI, ((void (*) (intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jint param1)
ARITYn(void, invokeJV__JJI, ((void (*) (jlong, jint))(intptr_t)__functionAddress)(param0, param1), jlong param0, jint param1)
ARITYn(void, invokePV__JJIBIZZ, ((void (*) (intptr_t, jint, jbyte, jint, jboolean, jboolean))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5), jlong param0, jint param1, jbyte param2, jint param3, jboolean param4, jboolean param5)
ARITYn(void, invokePV__JJII, ((void (*) (intptr_t, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2), jlong param0, jint param1, jint param2)
ARITYn(void, invokePV__JJIII, ((void (*) (intptr_t, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3), jlong param0, jint param1, jint param2, jint param3)
ARITYn(void, invokePV__JJIIII, ((void (*) (intptr_t, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4), jlong param0, jint param1, jint param2, jint param3, jint param4)
ARITYn(void, invokePV__JJIIIIZ, ((void (*) (intptr_t, jint, jint, jint, jint, jboolean))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5), jlong param0, jint param1, jint param2, jint param3, jint param4, jboolean param5)
ARITYn(void, invokePPV__JJIIJ, ((void (*) (intptr_t, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3), jlong param0, jint param1, jint param2, jlong param3)
ARITYn(void, invokePPV__JJIJ, ((void (*) (intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2), jlong param0, jint param1, jlong param2)
ARITYn(void, invokePPPV__JJIJJ, ((void (*) (intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3), jlong param0, jint param1, jlong param2, jlong param3)
ARITYn(void, invokePJJV__JJIJJ, ((void (*) (intptr_t, jint, jlong, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3), jlong param0, jint param1, jlong param2, jlong param3)
ARITYn(void, invokePPPV__JJIJJI, ((void (*) (intptr_t, jint, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, param4), jlong param0, jint param1, jlong param2, jlong param3, jint param4)
ARITYn(void, invokePPPPPV__JJIJJJJ, ((void (*) (intptr_t, jint, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5)
ARITYn(void, invokePV__JJIS, ((void (*) (intptr_t, jint, jshort))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2), jlong param0, jint param1, jshort param2)
ARITYn(void, invokePPV__JJJ, ((void (*) (intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1), jlong param0, jlong param1)
ARITYn(void, invokePPV__JJJF, ((void (*) (intptr_t, intptr_t, jfloat))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2), jlong param0, jlong param1, jfloat param2)
ARITYn(void, invokePJV__JJJI, ((void (*) (intptr_t, jlong, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2), jlong param0, jlong param1, jint param2)
ARITYn(void, invokePPV__JJJI, ((void (*) (intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2), jlong param0, jlong param1, jint param2)
ARITYn(void, invokePPV__JJJII, ((void (*) (intptr_t, intptr_t, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3), jlong param0, jlong param1, jint param2, jint param3)
ARITYn(void, invokePPV__JJJIIIII, ((void (*) (intptr_t, intptr_t, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4, param5, param6), jlong param0, jlong param1, jint param2, jint param3, jint param4, jint param5, jint param6)
ARITYn(void, invokePPPV__JJJIIIJIZ, ((void (*) (intptr_t, intptr_t, jint, jint, jint, intptr_t, jint, jboolean))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4, (intptr_t)param5, param6, param7), jlong param0, jlong param1, jint param2, jint param3, jint param4, jlong param5, jint param6, jboolean param7)
ARITYn(void, invokePPPV__JJJIJS, ((void (*) (intptr_t, intptr_t, jint, intptr_t, jshort))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, param4), jlong param0, jlong param1, jint param2, jlong param3, jshort param4)
ARITYn(void, invokePPPV__JJJJ, ((void (*) (intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2), jlong param0, jlong param1, jlong param2)
ARITYn(void, invokePPPV__JJJJI, ((void (*) (intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3), jlong param0, jlong param1, jlong param2, jint param3)
ARITYn(void, invokePJPV__JJJJI, ((void (*) (intptr_t, jlong, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3), jlong param0, jlong param1, jlong param2, jint param3)
ARITYn(void, invokePPPV__JJJJIZZ, ((void (*) (intptr_t, intptr_t, intptr_t, jint, jboolean, jboolean))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, param4, param5), jlong param0, jlong param1, jlong param2, jint param3, jboolean param4, jboolean param5)
ARITYn(void, invokePPPPV__JJJJJ, ((void (*) (intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3), jlong param0, jlong param1, jlong param2, jlong param3)
ARITYn(void, invokePPPPV__JJJJJI, ((void (*) (intptr_t, intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, param4), jlong param0, jlong param1, jlong param2, jlong param3, jint param4)
ARITYn(void, invokePPPPPV__JJJJJJ, ((void (*) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4)
ARITYn(void, invokePPPV__JJJJZZ, ((void (*) (intptr_t, intptr_t, intptr_t, jboolean, jboolean))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, param4), jlong param0, jlong param1, jlong param2, jboolean param3, jboolean param4)
ARITYn(void, invokePPPPV__JJJSJJ, ((void (*) (intptr_t, intptr_t, jshort, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jlong param1, jshort param2, jlong param3, jlong param4)
ARITYn(void, invokePPV__JJJZ, ((void (*) (intptr_t, intptr_t, jboolean))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2), jlong param0, jlong param1, jboolean param2)
ARITYn(void, invokePV__JJS, ((void (*) (intptr_t, jshort))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jshort param1)
ARITYn(void, invokePV__JJSII, ((void (*) (intptr_t, jshort, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3), jlong param0, jshort param1, jint param2, jint param3)
ARITYn(void, invokePPV__JJSJS, ((void (*) (intptr_t, jshort, intptr_t, jshort))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3), jlong param0, jshort param1, jlong param2, jshort param3)
ARITYn(void, invokePV__JJSSBSSSSBSSSSSS, ((void (*) (intptr_t, jshort, jshort, jbyte, jshort, jshort, jshort, jshort, jbyte, jshort, jshort, jshort, jshort, jshort, jshort))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14), jlong param0, jshort param1, jshort param2, jbyte param3, jshort param4, jshort param5, jshort param6, jshort param7, jbyte param8, jshort param9, jshort param10, jshort param11, jshort param12, jshort param13, jshort param14)
ARITYn(void, invokePV__JJSSIIIB, ((void (*) (intptr_t, jshort, jshort, jint, jint, jint, jbyte))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, param6), jlong param0, jshort param1, jshort param2, jint param3, jint param4, jint param5, jbyte param6)
ARITYn(void, invokePV__JJSSIZ, ((void (*) (intptr_t, jshort, jshort, jint, jboolean))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4), jlong param0, jshort param1, jshort param2, jint param3, jboolean param4)
ARITYn(void, invokePV__JJSSSIZ, ((void (*) (intptr_t, jshort, jshort, jshort, jint, jboolean))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5), jlong param0, jshort param1, jshort param2, jshort param3, jint param4, jboolean param5)
ARITYn(void, invokePV__JJSSSSSB, ((void (*) (intptr_t, jshort, jshort, jshort, jshort, jshort, jbyte))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, param6), jlong param0, jshort param1, jshort param2, jshort param3, jshort param4, jshort param5, jbyte param6)
ARITYn(void, invokePV__JJSSSSSIZ, ((void (*) (intptr_t, jshort, jshort, jshort, jshort, jshort, jint, jboolean))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, param6, param7), jlong param0, jshort param1, jshort param2, jshort param3, jshort param4, jshort param5, jint param6, jboolean param7)
ARITYn(void, invokePV__JJSSSZZSI, ((void (*) (intptr_t, jshort, jshort, jshort, jboolean, jboolean, jshort, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, param6, param7), jlong param0, jshort param1, jshort param2, jshort param3, jboolean param4, jboolean param5, jshort param6, jint param7)
ARITYn(void, invokePV__JJSZ, ((void (*) (intptr_t, jshort, jboolean))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2), jlong param0, jshort param1, jboolean param2)
ARITYn(void, invokePPPV__JJZIJJI, ((void (*) (intptr_t, jboolean, jint, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, (intptr_t)param4, param5), jlong param0, jboolean param1, jint param2, jlong param3, jlong param4, jint param5)
ARITYn(void, invokeV__JS, ((void (*) (jshort))(intptr_t)__functionAddress)(param0), jshort param0)
ARITYn(void, invokePV__JSBSSSSSSJ, ((void (*) (jshort, jbyte, jshort, jshort, jshort, jshort, jshort, jshort, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8), jshort param0, jbyte param1, jshort param2, jshort param3, jshort param4, jshort param5, jshort param6, jshort param7, jlong param8)
ARITYn(void, invokeV__JSI, ((void (*) (jshort, jint))(intptr_t)__functionAddress)(param0, param1), jshort param0, jint param1)
ARITYn(void, invokeV__JSII, ((void (*) (jshort, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2), jshort param0, jint param1, jint param2)
ARITYn(void, invokePV__JSIJ, ((void (*) (jshort, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2), jshort param0, jint param1, jlong param2)
ARITYn(void, invokePV__JSJ, ((void (*) (jshort, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1), jshort param0, jlong param1)
ARITYn(void, invokePV__JSJI, ((void (*) (jshort, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2), jshort param0, jlong param1, jint param2)
ARITYn(void, invokePPV__JSJJ, ((void (*) (jshort, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2), jshort param0, jlong param1, jlong param2)
ARITYn(void, invokePPPV__JSJJBJ, ((void (*) (jshort, intptr_t, intptr_t, jbyte, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4), jshort param0, jlong param1, jlong param2, jbyte param3, jlong param4)
ARITYn(void, invokePV__JSJS, ((void (*) (jshort, intptr_t, jshort))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2), jshort param0, jlong param1, jshort param2)
ARITYn(void, invokeV__JSS, ((void (*) (jshort, jshort))(intptr_t)__functionAddress)(param0, param1), jshort param0, jshort param1)
ARITYn(void, invokePV__JSSBBSSSSJS, ((void (*) (jshort, jshort, jbyte, jbyte, jshort, jshort, jshort, jshort, intptr_t, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8, param9), jshort param0, jshort param1, jbyte param2, jbyte param3, jshort param4, jshort param5, jshort param6, jshort param7, jlong param8, jshort param9)
ARITYn(void, invokePV__JSSBJ, ((void (*) (jshort, jshort, jbyte, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3), jshort param0, jshort param1, jbyte param2, jlong param3)
ARITYn(void, invokePPV__JSSBJJ, ((void (*) (jshort, jshort, jbyte, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, (intptr_t)param4), jshort param0, jshort param1, jbyte param2, jlong param3, jlong param4)
ARITYn(void, invokeV__JSSBSSSSBSSSSSS, ((void (*) (jshort, jshort, jbyte, jshort, jshort, jshort, jshort, jbyte, jshort, jshort, jshort, jshort, jshort, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13), jshort param0, jshort param1, jbyte param2, jshort param3, jshort param4, jshort param5, jshort param6, jbyte param7, jshort param8, jshort param9, jshort param10, jshort param11, jshort param12, jshort param13)
ARITYn(void, invokePV__JSSBSSSSJS, ((void (*) (jshort, jshort, jbyte, jshort, jshort, jshort, jshort, intptr_t, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7, param8), jshort param0, jshort param1, jbyte param2, jshort param3, jshort param4, jshort param5, jshort param6, jlong param7, jshort param8)
ARITYn(void, invokeV__JSSFBBBBBBBBB, ((void (*) (jshort, jshort, jfloat, jbyte, jbyte, jbyte, jbyte, jbyte, jbyte, jbyte, jbyte, jbyte))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11), jshort param0, jshort param1, jfloat param2, jbyte param3, jbyte param4, jbyte param5, jbyte param6, jbyte param7, jbyte param8, jbyte param9, jbyte param10, jbyte param11)
ARITYn(void, invokeV__JSSIFB, ((void (*) (jshort, jshort, jint, jfloat, jbyte))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jshort param0, jshort param1, jint param2, jfloat param3, jbyte param4)
ARITYn(void, invokeV__JSSIIIB, ((void (*) (jshort, jshort, jint, jint, jint, jbyte))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5), jshort param0, jshort param1, jint param2, jint param3, jint param4, jbyte param5)
ARITYn(void, invokeV__JSSIZ, ((void (*) (jshort, jshort, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3), jshort param0, jshort param1, jint param2, jboolean param3)
ARITYn(void, invokePV__JSSJ, ((void (*) (jshort, jshort, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2), jshort param0, jshort param1, jlong param2)
ARITYn(void, invokeV__JSSSI, ((void (*) (jshort, jshort, jshort, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3), jshort param0, jshort param1, jshort param2, jint param3)
ARITYn(void, invokeV__JSSSIZ, ((void (*) (jshort, jshort, jshort, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jshort param0, jshort param1, jshort param2, jint param3, jboolean param4)
ARITYn(void, invokePV__JSSSSJS, ((void (*) (jshort, jshort, jshort, jshort, intptr_t, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4, param5), jshort param0, jshort param1, jshort param2, jshort param3, jlong param4, jshort param5)
ARITYn(void, invokeV__JSSSSS, ((void (*) (jshort, jshort, jshort, jshort, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jshort param0, jshort param1, jshort param2, jshort param3, jshort param4)
ARITYn(void, invokeV__JSSSSSB, ((void (*) (jshort, jshort, jshort, jshort, jshort, jbyte))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5), jshort param0, jshort param1, jshort param2, jshort param3, jshort param4, jbyte param5)
ARITYn(void, invokeV__JSSSSSIZ, ((void (*) (jshort, jshort, jshort, jshort, jshort, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6), jshort param0, jshort param1, jshort param2, jshort param3, jshort param4, jint param5, jboolean param6)
ARITYn(void, invokeV__JSZ, ((void (*) (jshort, jboolean))(intptr_t)__functionAddress)(param0, param1), jshort param0, jboolean param1)
ARITY0(jboolean, invokeZ__J, return ((jboolean (*) ())(intptr_t)__functionAddress)())
ARITYn(jboolean, invokeZ__JI, return ((jboolean (*) (jint))(intptr_t)__functionAddress)(param0), jint param0)
ARITYn(jboolean, invokePZ__JJ, return ((jboolean (*) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0), jlong param0)
ARITYn(jboolean, invokePZ__JJI, return ((jboolean (*) (intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jint param1)
ARITYn(jboolean, invokePZ__JJIII, return ((jboolean (*) (intptr_t, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3), jlong param0, jint param1, jint param2, jint param3)
ARITYn(jboolean, invokePPZ__JJJ, return ((jboolean (*) (intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1), jlong param0, jlong param1)
ARITYn(jboolean, invokePPPZ__JJJIJI, return ((jboolean (*) (intptr_t, intptr_t, jint, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, param4), jlong param0, jlong param1, jint param2, jlong param3, jint param4)
ARITYn(jboolean, invokePPPPZ__JJJJBJ, return ((jboolean (*) (intptr_t, intptr_t, intptr_t, jbyte, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4), jlong param0, jlong param1, jlong param2, jbyte param3, jlong param4)
ARITYn(jboolean, invokePPPZ__JJJJI, return ((jboolean (*) (intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3), jlong param0, jlong param1, jlong param2, jint param3)
ARITYn(jboolean, invokePJPZ__JJJJI, return ((jboolean (*) (intptr_t, jlong, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3), jlong param0, jlong param1, jlong param2, jint param3)
ARITYn(jboolean, invokePPPPZ__JJJJJ, return ((jboolean (*) (intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3), jlong param0, jlong param1, jlong param2, jlong param3)
ARITYn(jboolean, invokePPPPPZ__JJJJJJI, return ((jboolean (*) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, param5), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5)
ARITYn(jboolean, invokePPPPPZ__JJJJJJZI, return ((jboolean (*) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, jboolean, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, param5, param6), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jboolean param5, jint param6)
ARITYn(jboolean, invokePPPZ__JJJJZI, return ((jboolean (*) (intptr_t, intptr_t, intptr_t, jboolean, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, param4), jlong param0, jlong param1, jlong param2, jboolean param3, jint param4)
ARITYn(jboolean, invokeZ__JSZSII, return ((jboolean (*) (jshort, jboolean, jshort, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jshort param0, jboolean param1, jshort param2, jint param3, jint param4)
ARITY0(jfloat, callF__J, return ((jfloat (APIENTRY *) ())(intptr_t)__functionAddress)())
ARITYn(jfloat, callF__JIII, return ((jfloat (APIENTRY *) (jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jint param1, jint param2)
ARITYn(jfloat, callPF__JIIJ, return ((jfloat (APIENTRY *) (jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2), jint param0, jint param1, jlong param2)
ARITYn(jfloat, callPPPF__JJJJ, return ((jfloat (APIENTRY *) (intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2), jlong param0, jlong param1, jlong param2)
ARITY0(jint, callI__J, return ((jint (APIENTRY *) ())(intptr_t)__functionAddress)())
ARITYn(jint, callI__JI, return ((jint (APIENTRY *) (jint))(intptr_t)__functionAddress)(param0), jint param0)
ARITYn(jint, callI__JIF, return ((jint (APIENTRY *) (jint, jfloat))(intptr_t)__functionAddress)(param0, param1), jint param0, jfloat param1)
ARITYn(jint, callI__JII, return ((jint (APIENTRY *) (jint, jint))(intptr_t)__functionAddress)(param0, param1), jint param0, jint param1)
ARITYn(jint, callPI__JIIFFJ, return ((jint (APIENTRY *) (jint, jint, jfloat, jfloat, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4), jint param0, jint param1, jfloat param2, jfloat param3, jlong param4)
ARITYn(jint, callI__JIII, return ((jint (APIENTRY *) (jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jint param1, jint param2)
ARITYn(jint, callPI__JIIIIIJ, return ((jint (APIENTRY *) (jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, (intptr_t)param5), jint param0, jint param1, jint param2, jint param3, jint param4, jlong param5)
ARITYn(jint, callPI__JIIIIJ, return ((jint (APIENTRY *) (jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4), jint param0, jint param1, jint param2, jint param3, jlong param4)
ARITYn(jint, callPI__JIIIJ, return ((jint (APIENTRY *) (jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3), jint param0, jint param1, jint param2, jlong param3)
ARITYn(jint, callPPI__JIIIJIJ, return ((jint (APIENTRY *) (jint, jint, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4, (intptr_t)param5), jint param0, jint param1, jint param2, jlong param3, jint param4, jlong param5)
ARITYn(jint, callPI__JIIJ, return ((jint (APIENTRY *) (jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2), jint param0, jint param1, jlong param2)
ARITYn(jint, callPI__JIIJIIIIF, return ((jint (APIENTRY *) (jint, jint, intptr_t, jint, jint, jint, jint, jfloat))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4, param5, param6, param7), jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jfloat param7)
ARITYn(jint, callPPI__JIIJIJ, return ((jint (APIENTRY *) (jint, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, (intptr_t)param4), jint param0, jint param1, jlong param2, jint param3, jlong param4)
ARITYn(jint, callPPJI__JIIJIJZJ, return ((jint (APIENTRY *) (jint, jint, intptr_t, jint, intptr_t, jboolean, jlong))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, (intptr_t)param4, param5, param6), jint param0, jint param1, jlong param2, jint param3, jlong param4, jboolean param5, jlong param6)
ARITYn(jint, callPPI__JIIJJ, return ((jint (APIENTRY *) (jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3), jint param0, jint param1, jlong param2, jlong param3)
ARITYn(jint, callPPI__JIIJJIIIIF, return ((jint (APIENTRY *) (jint, jint, intptr_t, intptr_t, jint, jint, jint, jint, jfloat))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, param4, param5, param6, param7, param8), jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jint param6, jint param7, jfloat param8)
ARITYn(jint, callJPPPPI__JIIJJIJJJ, return ((jint (APIENTRY *) (jint, jint, jlong, intptr_t, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7), jint param0, jint param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong param7)
ARITYn(jint, callPPPI__JIIJJJ, return ((jint (APIENTRY *) (jint, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4), jint param0, jint param1, jlong param2, jlong param3, jlong param4)
ARITYn(jint, callPPPPPI__JIIJJJJJ, return ((jint (APIENTRY *) (jint, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6), jint param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6)
ARITYn(jint, callPPPPPPI__JIIJJJJJJ, return ((jint (APIENTRY *) (jint, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7), jint param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7)
ARITYn(jint, callJI__JIJ, return ((jint (APIENTRY *) (jint, jlong))(intptr_t)__functionAddress)(param0, param1), jint param0, jlong param1)
ARITYn(jint, callPI__JIJ, return ((jint (APIENTRY *) (jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1), jint param0, jlong param1)
ARITYn(jint, callPI__JIJI, return ((jint (APIENTRY *) (jint, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2), jint param0, jlong param1, jint param2)
ARITYn(jint, callPI__JIJII, return ((jint (APIENTRY *) (jint, intptr_t, jint, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, param3), jint param0, jlong param1, jint param2, jint param3)
ARITYn(jint, callPI__JIJIIFI, return ((jint (APIENTRY *) (jint, intptr_t, jint, jint, jfloat, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, param3, param4, param5), jint param0, jlong param1, jint param2, jint param3, jfloat param4, jint param5)
ARITYn(jint, callJJI__JIJJ, return ((jint (APIENTRY *) (jint, jlong, jlong))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jlong param1, jlong param2)
ARITYn(jint, callPPI__JIJJ, return ((jint (APIENTRY *) (jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2), jint param0, jlong param1, jlong param2)
ARITYn(jint, callPPI__JIJJI, return ((jint (APIENTRY *) (jint, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, param3), jint param0, jlong param1, jlong param2, jint param3)
ARITYn(jint, callPI__JJ, return ((jint (APIENTRY *) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0), jlong param0)
ARITYn(jint, callJI__JJ, return ((jint (APIENTRY *) (jlong))(intptr_t)__functionAddress)(param0), jlong param0)
ARITYn(jint, callJI__JJF, return ((jint (APIENTRY *) (jlong, jfloat))(intptr_t)__functionAddress)(param0, param1), jlong param0, jfloat param1)
ARITYn(jint, callPI__JJF, return ((jint (APIENTRY *) (intptr_t, jfloat))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jfloat param1)
ARITYn(jint, callJI__JJFF, return ((jint (APIENTRY *) (jlong, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2), jlong param0, jfloat param1, jfloat param2)
ARITYn(jint, callJI__JJFFF, return ((jint (APIENTRY *) (jlong, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3), jlong param0, jfloat param1, jfloat param2, jfloat param3)
ARITYn(jint, callJJI__JJFFFFJ, return ((jint (APIENTRY *) (jlong, jfloat, jfloat, jfloat, jfloat, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5), jlong param0, jfloat param1, jfloat param2, jfloat param3, jfloat param4, jlong param5)
ARITYn(jint, callJI__JJI, return ((jint (APIENTRY *) (jlong, jint))(intptr_t)__functionAddress)(param0, param1), jlong param0, jint param1)
ARITYn(jint, callPI__JJI, return ((jint (APIENTRY *) (intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jint param1)
ARITYn(jint, callJPJI__JJIFJIJ, return ((jint (APIENTRY *) (jlong, jint, jfloat, intptr_t, jint, jlong))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4, param5), jlong param0, jint param1, jfloat param2, jlong param3, jint param4, jlong param5)
ARITYn(jint, callPI__JJII, return ((jint (APIENTRY *) (intptr_t, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2), jlong param0, jint param1, jint param2)
ARITYn(jint, callPI__JJIIII, return ((jint (APIENTRY *) (intptr_t, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4), jlong param0, jint param1, jint param2, jint param3, jint param4)
ARITYn(jint, callPI__JJIIIIII, return ((jint (APIENTRY *) (intptr_t, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, param6), jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6)
ARITYn(jint, callPPI__JJIIIIIIJ, return ((jint (APIENTRY *) (intptr_t, jint, jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7), jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jlong param7)
ARITYn(jint, callPPI__JJIIIIIIJIIIIIIIII, return ((jint (APIENTRY *) (intptr_t, jint, jint, jint, jint, jint, jint, intptr_t, jint, jint, jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7, param8, param9, param10, param11, param12, param13, param14, param15, param16), jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jlong param7, jint param8, jint param9, jint param10, jint param11, jint param12, jint param13, jint param14, jint param15, jint param16)
ARITYn(jint, callPPI__JJIIIIIJ, return ((jint (APIENTRY *) (intptr_t, jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, (intptr_t)param6), jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong param6)
ARITYn(jint, callPPI__JJIIIJ, return ((jint (APIENTRY *) (intptr_t, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4), jlong param0, jint param1, jint param2, jint param3, jlong param4)
ARITYn(jint, callPPPI__JJIIIJJ, return ((jint (APIENTRY *) (intptr_t, jint, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jint param1, jint param2, jint param3, jlong param4, jlong param5)
ARITYn(jint, callPPI__JJIIJ, return ((jint (APIENTRY *) (intptr_t, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3), jlong param0, jint param1, jint param2, jlong param3)
ARITYn(jint, callPJI__JJIIJ, return ((jint (APIENTRY *) (intptr_t, jint, jint, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3), jlong param0, jint param1, jint param2, jlong param3)
ARITYn(jint, callJPJI__JJIIJIJ, return ((jint (APIENTRY *) (jlong, jint, jint, intptr_t, jint, jlong))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4, param5), jlong param0, jint param1, jint param2, jlong param3, jint param4, jlong param5)
ARITYn(jint, callJPPJI__JJIIJIJJ, return ((jint (APIENTRY *) (jlong, jint, jint, intptr_t, jint, intptr_t, jlong))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4, (intptr_t)param5, param6), jlong param0, jint param1, jint param2, jlong param3, jint param4, jlong param5, jlong param6)
ARITYn(jint, callJPPJI__JJIIJIJZJ, return ((jint (APIENTRY *) (jlong, jint, jint, intptr_t, jint, intptr_t, jboolean, jlong))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4, (intptr_t)param5, param6, param7), jlong param0, jint param1, jint param2, jlong param3, jint param4, jlong param5, jboolean param6, jlong param7)
ARITYn(jint, callPPPPI__JJIIJJJ, return ((jint (APIENTRY *) (intptr_t, jint, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5)
ARITYn(jint, callPPI__JJIJ, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2), jlong param0, jint param1, jlong param2)
ARITYn(jint, callJPI__JJIJ, return ((jint (APIENTRY *) (jlong, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2), jlong param0, jint param1, jlong param2)
ARITYn(jint, callPJI__JJIJ, return ((jint (APIENTRY *) (intptr_t, jint, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2), jlong param0, jint param1, jlong param2)
ARITYn(jint, callJPI__JJIJF, return ((jint (APIENTRY *) (jlong, jint, intptr_t, jfloat))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3), jlong param0, jint param1, jlong param2, jfloat param3)
ARITYn(jint, callPPI__JJIJI, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3), jlong param0, jint param1, jlong param2, jint param3)
ARITYn(jint, callPPPPI__JJIJIIJJ, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, param4, (intptr_t)param5, (intptr_t)param6), jlong param0, jint param1, jlong param2, jint param3, jint param4, jlong param5, jlong param6)
ARITYn(jint, callPPJI__JJIJIJ, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, jint, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, param4), jlong param0, jint param1, jlong param2, jint param3, jlong param4)
ARITYn(jint, callPPPI__JJIJIJ, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, (intptr_t)param4), jlong param0, jint param1, jlong param2, jint param3, jlong param4)
ARITYn(jint, callJPPI__JJIJIJI, return ((jint (APIENTRY *) (jlong, jint, intptr_t, jint, intptr_t, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, (intptr_t)param4, param5), jlong param0, jint param1, jlong param2, jint param3, jlong param4, jint param5)
ARITYn(jint, callPPPPPI__JJIJIJIJJ, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, jint, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, (intptr_t)param4, param5, (intptr_t)param6, (intptr_t)param7), jlong param0, jint param1, jlong param2, jint param3, jlong param4, jint param5, jlong param6, jlong param7)
ARITYn(jint, callPPPPI__JJIJIJJ, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jint param1, jlong param2, jint param3, jlong param4, jlong param5)
ARITYn(jint, callPJPI__JJIJJ, return ((jint (APIENTRY *) (intptr_t, jint, jlong, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3), jlong param0, jint param1, jlong param2, jlong param3)
ARITYn(jint, callPPJI__JJIJJ, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3), jlong param0, jint param1, jlong param2, jlong param3)
ARITYn(jint, callJPPI__JJIJJ, return ((jint (APIENTRY *) (jlong, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3), jlong param0, jint param1, jlong param2, jlong param3)
ARITYn(jint, callPPPI__JJIJJ, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3), jlong param0, jint param1, jlong param2, jlong param3)
ARITYn(jint, callPPPI__JJIJJI, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, param4), jlong param0, jint param1, jlong param2, jlong param3, jint param4)
ARITYn(jint, callJPPI__JJIJJI, return ((jint (APIENTRY *) (jlong, jint, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, param4), jlong param0, jint param1, jlong param2, jlong param3, jint param4)
ARITYn(jint, callPPJPPI__JJIJJIJJ, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, jlong, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, param4, (intptr_t)param5, (intptr_t)param6), jlong param0, jint param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6)
ARITYn(jint, callPPPPPPPI__JJIJJIJJJJ, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, (intptr_t)param8), jlong param0, jint param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong param7, jlong param8)
ARITYn(jint, callPPPPI__JJIJJJ, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jint param1, jlong param2, jlong param3, jlong param4)
ARITYn(jint, callJPPPI__JJIJJJI, return ((jint (APIENTRY *) (jlong, jint, intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, param5), jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jint param5)
ARITYn(jint, callPJPPPPI__JJIJJJIJJ, return ((jint (APIENTRY *) (intptr_t, jint, jlong, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, (intptr_t)param4, param5, (intptr_t)param6, (intptr_t)param7), jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7)
ARITYn(jint, callPPPPPPI__JJIJJJIJJ, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, param5, (intptr_t)param6, (intptr_t)param7), jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7)
ARITYn(jint, callPPPJPPI__JJIJJJIJJ, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, jlong, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, param4, param5, (intptr_t)param6, (intptr_t)param7), jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7)
ARITYn(jint, callPPPPPI__JJIJJJJ, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5)
ARITYn(jint, callJI__JJIZ, return ((jint (APIENTRY *) (jlong, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2), jlong param0, jint param1, jboolean param2)
ARITYn(jint, callPJI__JJJ, return ((jint (APIENTRY *) (intptr_t, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jlong param1)
ARITYn(jint, callJPI__JJJ, return ((jint (APIENTRY *) (jlong, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1), jlong param0, jlong param1)
ARITYn(jint, callJJI__JJJ, return ((jint (APIENTRY *) (jlong, jlong))(intptr_t)__functionAddress)(param0, param1), jlong param0, jlong param1)
ARITYn(jint, callPPI__JJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1), jlong param0, jlong param1)
ARITYn(jint, callPPI__JJJF, return ((jint (APIENTRY *) (intptr_t, intptr_t, jfloat))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2), jlong param0, jlong param1, jfloat param2)
ARITYn(jint, callPJI__JJJI, return ((jint (APIENTRY *) (intptr_t, jlong, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2), jlong param0, jlong param1, jint param2)
ARITYn(jint, callPPI__JJJI, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2), jlong param0, jlong param1, jint param2)
ARITYn(jint, callJPI__JJJI, return ((jint (APIENTRY *) (jlong, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2), jlong param0, jlong param1, jint param2)
ARITYn(jint, callJPI__JJJII, return ((jint (APIENTRY *) (jlong, intptr_t, jint, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, param3), jlong param0, jlong param1, jint param2, jint param3)
ARITYn(jint, callPPI__JJJII, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3), jlong param0, jlong param1, jint param2, jint param3)
ARITYn(jint, callPPI__JJJIII, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4), jlong param0, jlong param1, jint param2, jint param3, jint param4)
ARITYn(jint, callJPI__JJJIII, return ((jint (APIENTRY *) (jlong, intptr_t, jint, jint, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, param3, param4), jlong param0, jlong param1, jint param2, jint param3, jint param4)
ARITYn(jint, callPPI__JJJIIII, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4, param5), jlong param0, jlong param1, jint param2, jint param3, jint param4, jint param5)
ARITYn(jint, callPPPI__JJJIIIIJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4, param5, (intptr_t)param6), jlong param0, jlong param1, jint param2, jint param3, jint param4, jint param5, jlong param6)
ARITYn(jint, callPPPI__JJJIIIJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4, (intptr_t)param5), jlong param0, jlong param1, jint param2, jint param3, jint param4, jlong param5)
ARITYn(jint, callPPPPI__JJJIIJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong param5)
ARITYn(jint, callPJPPI__JJJIIJJ, return ((jint (APIENTRY *) (intptr_t, jlong, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong param5)
ARITYn(jint, callPJPPJI__JJJIIJJJI, return ((jint (APIENTRY *) (intptr_t, jlong, jint, jint, intptr_t, intptr_t, jlong, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5, param6, param7), jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong param5, jlong param6, jint param7)
ARITYn(jint, callPPJI__JJJIJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, jlong))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3), jlong param0, jlong param1, jint param2, jlong param3)
ARITYn(jint, callJPPI__JJJIJ, return ((jint (APIENTRY *) (jlong, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, (intptr_t)param3), jlong param0, jlong param1, jint param2, jlong param3)
ARITYn(jint, callJPJI__JJJIJ, return ((jint (APIENTRY *) (jlong, intptr_t, jint, jlong))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, param3), jlong param0, jlong param1, jint param2, jlong param3)
ARITYn(jint, callPPPI__JJJIJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3), jlong param0, jlong param1, jint param2, jlong param3)
ARITYn(jint, callPJPI__JJJIJ, return ((jint (APIENTRY *) (intptr_t, jlong, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3), jlong param0, jlong param1, jint param2, jlong param3)
ARITYn(jint, callPPJPPI__JJJIJIJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, jlong, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4, (intptr_t)param5, (intptr_t)param6), jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5, jlong param6)
ARITYn(jint, callJJPPPI__JJJIJIJJ, return ((jint (APIENTRY *) (jlong, jlong, jint, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4, (intptr_t)param5, (intptr_t)param6), jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5, jlong param6)
ARITYn(jint, callJPPPI__JJJIJJ, return ((jint (APIENTRY *) (jlong, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jlong param1, jint param2, jlong param3, jlong param4)
ARITYn(jint, callPJPPI__JJJIJJ, return ((jint (APIENTRY *) (intptr_t, jlong, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jlong param1, jint param2, jlong param3, jlong param4)
ARITYn(jint, callPPPPI__JJJIJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jlong param1, jint param2, jlong param3, jlong param4)
ARITYn(jint, callPJPPPI__JJJIJJJ, return ((jint (APIENTRY *) (intptr_t, jlong, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5)
ARITYn(jint, callPPPPPI__JJJIJJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5)
ARITYn(jint, callPPPPPPPI__JJJIJJJIJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, param6, (intptr_t)param7, (intptr_t)param8), jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jint param6, jlong param7, jlong param8)
ARITYn(jint, callPPPPPPPI__JJJIJJJJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7), jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7)
ARITYn(jint, callPPPPPPPPPI__JJJIJJJJJIJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, param8, (intptr_t)param9, (intptr_t)param10), jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jint param8, jlong param9, jlong param10)
ARITYn(jint, callPPPPPPPPPPPPI__JJJIJJJJJJJJIJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, (intptr_t)param8, (intptr_t)param9, (intptr_t)param10, param11, (intptr_t)param12, (intptr_t)param13), jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jlong param10, jint param11, jlong param12, jlong param13)
ARITYn(jint, callJPPI__JJJJ, return ((jint (APIENTRY *) (jlong, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2), jlong param0, jlong param1, jlong param2)
ARITYn(jint, callPJPI__JJJJ, return ((jint (APIENTRY *) (intptr_t, jlong, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2), jlong param0, jlong param1, jlong param2)
ARITYn(jint, callPPJI__JJJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, jlong))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2), jlong param0, jlong param1, jlong param2)
ARITYn(jint, callPPPI__JJJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2), jlong param0, jlong param1, jlong param2)
ARITYn(jint, callJJPI__JJJJ, return ((jint (APIENTRY *) (jlong, jlong, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2), jlong param0, jlong param1, jlong param2)
ARITYn(jint, callJJPI__JJJJI, return ((jint (APIENTRY *) (jlong, jlong, intptr_t, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3), jlong param0, jlong param1, jlong param2, jint param3)
ARITYn(jint, callJPPI__JJJJI, return ((jint (APIENTRY *) (jlong, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, param3), jlong param0, jlong param1, jlong param2, jint param3)
ARITYn(jint, callPPPI__JJJJI, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3), jlong param0, jlong param1, jlong param2, jint param3)
ARITYn(jint, callPPPPI__JJJJIJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4), jlong param0, jlong param1, jlong param2, jint param3, jlong param4)
ARITYn(jint, callPPPPPI__JJJJIJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong param5)
ARITYn(jint, callPJJJI__JJJJJ, return ((jint (APIENTRY *) (intptr_t, jlong, jlong, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3), jlong param0, jlong param1, jlong param2, jlong param3)
ARITYn(jint, callPPPPI__JJJJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3), jlong param0, jlong param1, jlong param2, jlong param3)
ARITYn(jint, callJPPPI__JJJJJ, return ((jint (APIENTRY *) (jlong, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3), jlong param0, jlong param1, jlong param2, jlong param3)
ARITYn(jint, callPJPPI__JJJJJ, return ((jint (APIENTRY *) (intptr_t, jlong, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3), jlong param0, jlong param1, jlong param2, jlong param3)
ARITYn(jint, callPJJJPI__JJJJJIJ, return ((jint (APIENTRY *) (intptr_t, jlong, jlong, jlong, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5), jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5)
ARITYn(jint, callPPPPPPPPI__JJJJJIJJIJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, param4, (intptr_t)param5, (intptr_t)param6, param7, (intptr_t)param8, (intptr_t)param9), jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jint param7, jlong param8, jlong param9)
ARITYn(jint, callPPPPPPPI__JJJJJIJJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7), jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong param7)
ARITYn(jint, callPJPPPI__JJJJJJ, return ((jint (APIENTRY *) (intptr_t, jlong, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4)
ARITYn(jint, callPPPPPI__JJJJJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4)
ARITYn(jint, callPPJPPI__JJJJJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, jlong, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4)
ARITYn(jint, callPPPPPPPI__JJJJJJIJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, param5, (intptr_t)param6, (intptr_t)param7), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7)
ARITYn(jint, callPJJJJPI__JJJJJJJ, return ((jint (APIENTRY *) (intptr_t, jlong, jlong, jlong, jlong, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5)
ARITYn(jint, callPPPPPPI__JJJJJJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5)
ARITYn(jint, callPPPPPPPPI__JJJJJJJIJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, param6, (intptr_t)param7, (intptr_t)param8), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jint param6, jlong param7, jlong param8)
ARITYn(jint, callJPPPPPPPPI__JJJJJJJJJJ, return ((jint (APIENTRY *) (jlong, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, (intptr_t)param8), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8)
ARITYn(jint, callPPPPPPPPPPPPI__JJJJJJJJJJJIJJ, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, (intptr_t)param8, (intptr_t)param9, param10, (intptr_t)param11, (intptr_t)param12), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jint param10, jlong param11, jlong param12)
ARITYn(jint, callPI__JJZ, return ((jint (APIENTRY *) (intptr_t, jboolean))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jboolean param1)
ARITY0(jlong, callJ__J, return ((jlong (APIENTRY *) ())(intptr_t)__functionAddress)())
ARITYn(jlong, callJ__JI, return ((jlong (APIENTRY *) (jint))(intptr_t)__functionAddress)(param0), jint param0)
ARITYn(jlong, callJ__JII, return ((jlong (APIENTRY *) (jint, jint))(intptr_t)__functionAddress)(param0, param1), jint param0, jint param1)
ARITYn(jlong, callPJ__JIIJ, return ((jlong (APIENTRY *) (jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2), jint param0, jint param1, jlong param2)
ARITYn(jlong, callJ__JIIZII, return ((jlong (APIENTRY *) (jint, jint, jboolean, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jint param0, jint param1, jboolean param2, jint param3, jint param4)
ARITYn(jlong, callJJ__JJ, return ((jlong (APIENTRY *) (jlong))(intptr_t)__functionAddress)(param0), jlong param0)
ARITYn(jlong, callPJ__JJ, return ((jlong (APIENTRY *) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0), jlong param0)
ARITYn(jlong, callPPJ__JJIJ, return ((jlong (APIENTRY *) (intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2), jlong param0, jint param1, jlong param2)
ARITYn(jlong, callPPJ__JJJ, return ((jlong (APIENTRY *) (intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1), jlong param0, jlong param1)
ARITY0(jlong, callP__J, return (jlong)((intptr_t (APIENTRY *) ())(intptr_t)__functionAddress)())
ARITYn(jlong, callP__JI, return (jlong)((intptr_t (APIENTRY *) (jint))(intptr_t)__functionAddress)(param0), jint param0)
ARITYn(jlong, callP__JIFFF, return (jlong)((intptr_t (APIENTRY *) (jint, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3), jint param0, jfloat param1, jfloat param2, jfloat param3)
ARITYn(jlong, callP__JII, return (jlong)((intptr_t (APIENTRY *) (jint, jint))(intptr_t)__functionAddress)(param0, param1), jint param0, jint param1)
ARITYn(jlong, callPPP__JIIIJJ, return (jlong)((intptr_t (APIENTRY *) (jint, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, (intptr_t)param4), jint param0, jint param1, jint param2, jlong param3, jlong param4)
ARITYn(jlong, callPP__JIJ, return (jlong)((intptr_t (APIENTRY *) (jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1), jint param0, jlong param1)
ARITYn(jlong, callPP__JIJI, return (jlong)((intptr_t (APIENTRY *) (jint, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2), jint param0, jlong param1, jint param2)
ARITYn(jlong, callPPP__JIJJ, return (jlong)((intptr_t (APIENTRY *) (jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2), jint param0, jlong param1, jlong param2)
ARITYn(jlong, callPPP__JIJJI, return (jlong)((intptr_t (APIENTRY *) (jint, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, param3), jint param0, jlong param1, jlong param2, jint param3)
ARITYn(jlong, callPP__JJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0), jlong param0)
ARITYn(jlong, callPP__JJI, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jint param1)
ARITYn(jlong, callPP__JJII, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2), jlong param0, jint param1, jint param2)
ARITYn(jlong, callPPP__JJIIIJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4), jlong param0, jint param1, jint param2, jint param3, jlong param4)
ARITYn(jlong, callPPP__JJIJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2), jlong param0, jint param1, jlong param2)
ARITYn(jlong, callPPPP__JJIJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3), jlong param0, jint param1, jlong param2, jlong param3)
ARITYn(jlong, callPPPPPPP__JJIJJIJJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7), jlong param0, jint param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong param7)
ARITYn(jlong, callPPPPP__JJIJJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jint param1, jlong param2, jlong param3, jlong param4)
ARITYn(jlong, callPPPPPP__JJIJJJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5)
ARITYn(jlong, callPPPPPPP__JJIJJJJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6), jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6)
ARITYn(jlong, callPPP__JJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1), jlong param0, jlong param1)
ARITYn(jlong, callPPP__JJJI, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2), jlong param0, jlong param1, jint param2)
ARITYn(jlong, callPPP__JJJIII, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4), jlong param0, jlong param1, jint param2, jint param3, jint param4)
ARITYn(jlong, callPJPP__JJJIIIJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5), jlong param0, jlong param1, jint param2, jint param3, jint param4, jlong param5)
ARITYn(jlong, callPPPP__JJJIIJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, (intptr_t)param4), jlong param0, jlong param1, jint param2, jint param3, jlong param4)
ARITYn(jlong, callPJPPP__JJJIIJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong param5)
ARITYn(jlong, callPPPP__JJJIJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3), jlong param0, jlong param1, jint param2, jlong param3)
ARITYn(jlong, callPJPP__JJJIJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3), jlong param0, jlong param1, jint param2, jlong param3)
ARITYn(jlong, callPPPP__JJJIJI, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, param4), jlong param0, jlong param1, jint param2, jlong param3, jint param4)
ARITYn(jlong, callPJPPP__JJJIJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jlong param1, jint param2, jlong param3, jlong param4)
ARITYn(jlong, callPPPPP__JJJIJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jlong param1, jint param2, jlong param3, jlong param4)
ARITYn(jlong, callPPJPPPPPP__JJJIJJJIJJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, jint, jlong, intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, (intptr_t)param4, (intptr_t)param5, param6, (intptr_t)param7, (intptr_t)param8, (intptr_t)param9), jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jint param6, jlong param7, jlong param8, jlong param9)
ARITYn(jlong, callPPJPPPPPPPP__JJJIJJJJJIJJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, jint, jlong, intptr_t, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, param8, (intptr_t)param9, (intptr_t)param10, (intptr_t)param11), jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jint param8, jlong param9, jlong param10, jlong param11)
ARITYn(jlong, callPPPP__JJJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2), jlong param0, jlong param1, jlong param2)
ARITYn(jlong, callPJPP__JJJJI, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3), jlong param0, jlong param1, jlong param2, jint param3)
ARITYn(jlong, callPPPP__JJJJI, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3), jlong param0, jlong param1, jlong param2, jint param3)
ARITYn(jlong, callPPPPP__JJJJIJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4), jlong param0, jlong param1, jlong param2, jint param3, jlong param4)
ARITYn(jlong, callPJPPP__JJJJIJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, (intptr_t)param4), jlong param0, jlong param1, jlong param2, jint param3, jlong param4)
ARITYn(jlong, callPPPPP__JJJJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3), jlong param0, jlong param1, jlong param2, jlong param3)
ARITYn(jlong, callPPJPP__JJJJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, jlong, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3), jlong param0, jlong param1, jlong param2, jlong param3)
ARITYn(jlong, callPPPPP__JJJJJI, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, param4), jlong param0, jlong param1, jlong param2, jlong param3, jint param4)
ARITYn(jlong, callPJPPPP__JJJJJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4)
ARITYn(jlong, callPJPPPPP__JJJJJJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5)
ARITYn(jlong, callPPPJPPP__JJJJJJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, intptr_t, jlong, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5)
ARITYn(jlong, callPJPPPPPPP__JJJJJJJJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7)
ARITYn(jlong, callPJPPPPPPPPP__JJJJJJJJJJJ, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, (intptr_t)param8, (intptr_t)param9), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9)
ARITYn(jshort, callS__JI, return ((jshort (APIENTRY *) (jint))(intptr_t)__functionAddress)(param0), jint param0)
ARITYn(jshort, callPS__JJ, return ((jshort (APIENTRY *) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0), jlong param0)
ARITYn(jshort, callPPS__JJIJI, return ((jshort (APIENTRY *) (intptr_t, jint, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3), jlong param0, jint param1, jlong param2, jint param3)
ARITYn(jshort, callPPPS__JJIJIJ, return ((jshort (APIENTRY *) (intptr_t, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, (intptr_t)param4), jlong param0, jint param1, jlong param2, jint param3, jlong param4)
ARITYn(jshort, callPPS__JJJ, return ((jshort (APIENTRY *) (intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1), jlong param0, jlong param1)
ARITYn(jshort, callPPS__JJJI, return ((jshort (APIENTRY *) (intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2), jlong param0, jlong param1, jint param2)
ARITYn(jshort, callPPPPS__JJJIJIJ, return ((jshort (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, param4, (intptr_t)param5), jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5)
ARITYn(jshort, callPPPS__JJJJ, return ((jshort (APIENTRY *) (intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2), jlong param0, jlong param1, jlong param2)
ARITYn(jshort, callPPPPPS__JJJJSJSJS, return ((jshort (APIENTRY *) (intptr_t, intptr_t, intptr_t, jshort, intptr_t, jshort, intptr_t, jshort))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4, param5, (intptr_t)param6, param7), jlong param0, jlong param1, jlong param2, jshort param3, jlong param4, jshort param5, jlong param6, jshort param7)
ARITYn(jshort, callPPS__JJJS, return ((jshort (APIENTRY *) (intptr_t, intptr_t, jshort))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2), jlong param0, jlong param1, jshort param2)
ARITYn(jshort, callPPPS__JJJSJ, return ((jshort (APIENTRY *) (intptr_t, intptr_t, jshort, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3), jlong param0, jlong param1, jshort param2, jlong param3)
ARITYn(jshort, callPPPPS__JJJSJSJ, return ((jshort (APIENTRY *) (intptr_t, intptr_t, jshort, intptr_t, jshort, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, param4, (intptr_t)param5), jlong param0, jlong param1, jshort param2, jlong param3, jshort param4, jlong param5)
ARITYn(jshort, callPPPPS__JJJSJSJS, return ((jshort (APIENTRY *) (intptr_t, intptr_t, jshort, intptr_t, jshort, intptr_t, jshort))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, param4, (intptr_t)param5, param6), jlong param0, jlong param1, jshort param2, jlong param3, jshort param4, jlong param5, jshort param6)
ARITYn(jshort, callPPPPPS__JJJSJSJSJS, return ((jshort (APIENTRY *) (intptr_t, intptr_t, jshort, intptr_t, jshort, intptr_t, jshort, intptr_t, jshort))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, param4, (intptr_t)param5, param6, (intptr_t)param7, param8), jlong param0, jlong param1, jshort param2, jlong param3, jshort param4, jlong param5, jshort param6, jlong param7, jshort param8)
ARITYn(jshort, callPPPPPPPS__JJJSJSJSJSJSJS, return ((jshort (APIENTRY *) (intptr_t, intptr_t, jshort, intptr_t, jshort, intptr_t, jshort, intptr_t, jshort, intptr_t, jshort, intptr_t, jshort))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, param4, (intptr_t)param5, param6, (intptr_t)param7, param8, (intptr_t)param9, param10, (intptr_t)param11, param12), jlong param0, jlong param1, jshort param2, jlong param3, jshort param4, jlong param5, jshort param6, jlong param7, jshort param8, jlong param9, jshort param10, jlong param11, jshort param12)
ARITYn(jshort, callPPPPS__JJJSJSJSSS, return ((jshort (APIENTRY *) (intptr_t, intptr_t, jshort, intptr_t, jshort, intptr_t, jshort, jshort, jshort))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, param4, (intptr_t)param5, param6, param7, param8), jlong param0, jlong param1, jshort param2, jlong param3, jshort param4, jlong param5, jshort param6, jshort param7, jshort param8)
ARITYn(jshort, callPJS__JJJSS, return ((jshort (APIENTRY *) (intptr_t, jlong, jshort, jshort))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3), jlong param0, jlong param1, jshort param2, jshort param3)
ARITYn(jshort, callPS__JJS, return ((jshort (APIENTRY *) (intptr_t, jshort))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jshort param1)
ARITYn(jshort, callPPS__JJSJ, return ((jshort (APIENTRY *) (intptr_t, jshort, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2), jlong param0, jshort param1, jlong param2)
ARITYn(jshort, callPPPPS__JJSJJJ, return ((jshort (APIENTRY *) (intptr_t, jshort, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jshort param1, jlong param2, jlong param3, jlong param4)
ARITYn(jshort, callPPPPPS__JJSJJJJ, return ((jshort (APIENTRY *) (intptr_t, jshort, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jshort param1, jlong param2, jlong param3, jlong param4, jlong param5)
ARITYn(jshort, callPPPS__JJSJSJ, return ((jshort (APIENTRY *) (intptr_t, jshort, intptr_t, jshort, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, (intptr_t)param4), jlong param0, jshort param1, jlong param2, jshort param3, jlong param4)
ARITYn(jshort, callPPPPPPPS__JJSJSJJJJJ, return ((jshort (APIENTRY *) (intptr_t, jshort, intptr_t, jshort, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, (intptr_t)param8), jlong param0, jshort param1, jlong param2, jshort param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8)
ARITYn(jshort, callPPPPPPPPPS__JJSJSJJJJJJJ, return ((jshort (APIENTRY *) (intptr_t, jshort, intptr_t, jshort, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, (intptr_t)param8, (intptr_t)param9, (intptr_t)param10), jlong param0, jshort param1, jlong param2, jshort param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jlong param10)
ARITYn(jshort, callPPPPPS__JJSJSJJSJ, return ((jshort (APIENTRY *) (intptr_t, jshort, intptr_t, jshort, intptr_t, intptr_t, jshort, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, (intptr_t)param4, (intptr_t)param5, param6, (intptr_t)param7), jlong param0, jshort param1, jlong param2, jshort param3, jlong param4, jlong param5, jshort param6, jlong param7)
ARITYn(jshort, callPPPPS__JJSJSJSJSSS, return ((jshort (APIENTRY *) (intptr_t, jshort, intptr_t, jshort, intptr_t, jshort, intptr_t, jshort, jshort, jshort))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, (intptr_t)param4, param5, (intptr_t)param6, param7, param8, param9), jlong param0, jshort param1, jlong param2, jshort param3, jlong param4, jshort param5, jlong param6, jshort param7, jshort param8, jshort param9)
ARITYn(jshort, callPPS__JJSSJI, return ((jshort (APIENTRY *) (intptr_t, jshort, jshort, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, param4), jlong param0, jshort param1, jshort param2, jlong param3, jint param4)
ARITYn(jshort, callPPPS__JJSSJIJ, return ((jshort (APIENTRY *) (intptr_t, jshort, jshort, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, param4, (intptr_t)param5), jlong param0, jshort param1, jshort param2, jlong param3, jint param4, jlong param5)
ARITYn(jshort, callPPPPS__JJSSJJJ, return ((jshort (APIENTRY *) (intptr_t, jshort, jshort, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5), jlong param0, jshort param1, jshort param2, jlong param3, jlong param4, jlong param5)
ARITYn(jshort, callPPPPS__JJSSJSJJ, return ((jshort (APIENTRY *) (intptr_t, jshort, jshort, intptr_t, jshort, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, param4, (intptr_t)param5, (intptr_t)param6), jlong param0, jshort param1, jshort param2, jlong param3, jshort param4, jlong param5, jlong param6)
ARITYn(jshort, callPPPPPS__JJSSSJSSJJJ, return ((jshort (APIENTRY *) (intptr_t, jshort, jshort, jshort, intptr_t, jshort, jshort, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4, param5, param6, (intptr_t)param7, (intptr_t)param8, (intptr_t)param9), jlong param0, jshort param1, jshort param2, jshort param3, jlong param4, jshort param5, jshort param6, jlong param7, jlong param8, jlong param9)
ARITYn(jshort, callPPPPPS__JJSSSSJSJJJ, return ((jshort (APIENTRY *) (intptr_t, jshort, jshort, jshort, jshort, intptr_t, jshort, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5, param6, (intptr_t)param7, (intptr_t)param8, (intptr_t)param9), jlong param0, jshort param1, jshort param2, jshort param3, jshort param4, jlong param5, jshort param6, jlong param7, jlong param8, jlong param9)
ARITYn(jshort, callPS__JSJ, return ((jshort (APIENTRY *) (jshort, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1), jshort param0, jlong param1)
ARITYn(jshort, callPPS__JSJJ, return ((jshort (APIENTRY *) (jshort, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2), jshort param0, jlong param1, jlong param2)
ARITYn(jshort, callPS__JSJS, return ((jshort (APIENTRY *) (jshort, intptr_t, jshort))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2), jshort param0, jlong param1, jshort param2)
ARITYn(jshort, callPPPPPS__JSJSJJJSJ, return ((jshort (APIENTRY *) (jshort, intptr_t, jshort, intptr_t, intptr_t, intptr_t, jshort, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, param6, (intptr_t)param7), jshort param0, jlong param1, jshort param2, jlong param3, jlong param4, jlong param5, jshort param6, jlong param7)
ARITYn(jshort, callPPPS__JSJSSJSJ, return ((jshort (APIENTRY *) (jshort, intptr_t, jshort, jshort, intptr_t, jshort, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, param3, (intptr_t)param4, param5, (intptr_t)param6), jshort param0, jlong param1, jshort param2, jshort param3, jlong param4, jshort param5, jlong param6)
ARITY0(void, callV__J, ((void (APIENTRY *) ())(intptr_t)__functionAddress)())
ARITYn(void, callV__JB, ((void (APIENTRY *) (jbyte))(intptr_t)__functionAddress)(param0), jbyte param0)
ARITYn(void, callV__JBBB, ((void (APIENTRY *) (jbyte, jbyte, jbyte))(intptr_t)__functionAddress)(param0, param1, param2), jbyte param0, jbyte param1, jbyte param2)
ARITYn(void, callV__JBBBB, ((void (APIENTRY *) (jbyte, jbyte, jbyte, jbyte))(intptr_t)__functionAddress)(param0, param1, param2, param3), jbyte param0, jbyte param1, jbyte param2, jbyte param3)
ARITYn(void, callV__JD, ((void (APIENTRY *) (jdouble))(intptr_t)__functionAddress)(param0), jdouble param0)
ARITYn(void, callV__JDD, ((void (APIENTRY *) (jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1), jdouble param0, jdouble param1)
ARITYn(void, callV__JDDD, ((void (APIENTRY *) (jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2), jdouble param0, jdouble param1, jdouble param2)
ARITYn(void, callV__JDDDD, ((void (APIENTRY *) (jdouble, jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3), jdouble param0, jdouble param1, jdouble param2, jdouble param3)
ARITYn(void, callV__JDDDDDD, ((void (APIENTRY *) (jdouble, jdouble, jdouble, jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5), jdouble param0, jdouble param1, jdouble param2, jdouble param3, jdouble param4, jdouble param5)
ARITYn(void, callV__JF, ((void (APIENTRY *) (jfloat))(intptr_t)__functionAddress)(param0), jfloat param0)
ARITYn(void, callV__JFF, ((void (APIENTRY *) (jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1), jfloat param0, jfloat param1)
ARITYn(void, callV__JFFF, ((void (APIENTRY *) (jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2), jfloat param0, jfloat param1, jfloat param2)
ARITYn(void, callV__JFFFF, ((void (APIENTRY *) (jfloat, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3), jfloat param0, jfloat param1, jfloat param2, jfloat param3)
ARITYn(void, callV__JFFFFFFFF, ((void (APIENTRY *) (jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7), jfloat param0, jfloat param1, jfloat param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jfloat param7)
ARITYn(void, callV__JFFFFFZ, ((void (APIENTRY *) (jfloat, jfloat, jfloat, jfloat, jfloat, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5), jfloat param0, jfloat param1, jfloat param2, jfloat param3, jfloat param4, jboolean param5)
ARITYn(void, callV__JFZ, ((void (APIENTRY *) (jfloat, jboolean))(intptr_t)__functionAddress)(param0, param1), jfloat param0, jboolean param1)
ARITYn(void, callV__JI, ((void (APIENTRY *) (jint))(intptr_t)__functionAddress)(param0), jint param0)
ARITYn(void, callV__JIBBBB, ((void (APIENTRY *) (jint, jbyte, jbyte, jbyte, jbyte))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jint param0, jbyte param1, jbyte param2, jbyte param3, jbyte param4)
ARITYn(void, callV__JID, ((void (APIENTRY *) (jint, jdouble))(intptr_t)__functionAddress)(param0, param1), jint param0, jdouble param1)
ARITYn(void, callV__JIDD, ((void (APIENTRY *) (jint, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jdouble param1, jdouble param2)
ARITYn(void, callV__JIDDD, ((void (APIENTRY *) (jint, jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3), jint param0, jdouble param1, jdouble param2, jdouble param3)
ARITYn(void, callV__JIDDDD, ((void (APIENTRY *) (jint, jdouble, jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jint param0, jdouble param1, jdouble param2, jdouble param3, jdouble param4)
ARITYn(void, callV__JIDDDDDD, ((void (APIENTRY *) (jint, jdouble, jdouble, jdouble, jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6), jint param0, jdouble param1, jdouble param2, jdouble param3, jdouble param4, jdouble param5, jdouble param6)
ARITYn(void, callV__JIDDIDD, ((void (APIENTRY *) (jint, jdouble, jdouble, jint, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5), jint param0, jdouble param1, jdouble param2, jint param3, jdouble param4, jdouble param5)
ARITYn(void, callPV__JIDDIIDDIIJ, ((void (APIENTRY *) (jint, jdouble, jdouble, jint, jint, jdouble, jdouble, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9), jint param0, jdouble param1, jdouble param2, jint param3, jint param4, jdouble param5, jdouble param6, jint param7, jint param8, jlong param9)
ARITYn(void, callPV__JIDDIIJ, ((void (APIENTRY *) (jint, jdouble, jdouble, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, (intptr_t)param5), jint param0, jdouble param1, jdouble param2, jint param3, jint param4, jlong param5)
ARITYn(void, callV__JIF, ((void (APIENTRY *) (jint, jfloat))(intptr_t)__functionAddress)(param0, param1), jint param0, jfloat param1)
ARITYn(void, callV__JIFF, ((void (APIENTRY *) (jint, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jfloat param1, jfloat param2)
ARITYn(void, callV__JIFFF, ((void (APIENTRY *) (jint, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3), jint param0, jfloat param1, jfloat param2, jfloat param3)
ARITYn(void, callV__JIFFFF, ((void (APIENTRY *) (jint, jfloat, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jint param0, jfloat param1, jfloat param2, jfloat param3, jfloat param4)
ARITYn(void, callV__JIFFIFF, ((void (APIENTRY *) (jint, jfloat, jfloat, jint, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5), jint param0, jfloat param1, jfloat param2, jint param3, jfloat param4, jfloat param5)
ARITYn(void, callPV__JIFFIIFFIIJ, ((void (APIENTRY *) (jint, jfloat, jfloat, jint, jint, jfloat, jfloat, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9), jint param0, jfloat param1, jfloat param2, jint param3, jint param4, jfloat param5, jfloat param6, jint param7, jint param8, jlong param9)
ARITYn(void, callPV__JIFFIIJ, ((void (APIENTRY *) (jint, jfloat, jfloat, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, (intptr_t)param5), jint param0, jfloat param1, jfloat param2, jint param3, jint param4, jlong param5)
ARITYn(void, callPV__JIFJI, ((void (APIENTRY *) (jint, jfloat, intptr_t, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3), jint param0, jfloat param1, jlong param2, jint param3)
ARITYn(void, callV__JII, ((void (APIENTRY *) (jint, jint))(intptr_t)__functionAddress)(param0, param1), jint param0, jint param1)
ARITYn(void, callV__JIID, ((void (APIENTRY *) (jint, jint, jdouble))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jint param1, jdouble param2)
ARITYn(void, callV__JIIDD, ((void (APIENTRY *) (jint, jint, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3), jint param0, jint param1, jdouble param2, jdouble param3)
ARITYn(void, callV__JIIDDD, ((void (APIENTRY *) (jint, jint, jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jint param0, jint param1, jdouble param2, jdouble param3, jdouble param4)
ARITYn(void, callV__JIIDDDD, ((void (APIENTRY *) (jint, jint, jdouble, jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5), jint param0, jint param1, jdouble param2, jdouble param3, jdouble param4, jdouble param5)
ARITYn(void, callV__JIIF, ((void (APIENTRY *) (jint, jint, jfloat))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jint param1, jfloat param2)
ARITYn(void, callV__JIIFF, ((void (APIENTRY *) (jint, jint, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3), jint param0, jint param1, jfloat param2, jfloat param3)
ARITYn(void, callV__JIIFFF, ((void (APIENTRY *) (jint, jint, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jint param0, jint param1, jfloat param2, jfloat param3, jfloat param4)
ARITYn(void, callV__JIIFFFF, ((void (APIENTRY *) (jint, jint, jfloat, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5), jint param0, jint param1, jfloat param2, jfloat param3, jfloat param4, jfloat param5)
ARITYn(void, callV__JIIFFFFFFFFF, ((void (APIENTRY *) (jint, jint, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10), jint param0, jint param1, jfloat param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jfloat param7, jfloat param8, jfloat param9, jfloat param10)
ARITYn(void, callPV__JIIFFFFJ, ((void (APIENTRY *) (jint, jint, jfloat, jfloat, jfloat, jfloat, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (intptr_t)param6), jint param0, jint param1, jfloat param2, jfloat param3, jfloat param4, jfloat param5, jlong param6)
ARITYn(void, callV__JIIFI, ((void (APIENTRY *) (jint, jint, jfloat, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3), jint param0, jint param1, jfloat param2, jint param3)
ARITYn(void, callV__JIII, ((void (APIENTRY *) (jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jint param1, jint param2)
ARITYn(void, callV__JIIID, ((void (APIENTRY *) (jint, jint, jint, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3), jint param0, jint param1, jint param2, jdouble param3)
ARITYn(void, callV__JIIIDDDD, ((void (APIENTRY *) (jint, jint, jint, jdouble, jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6), jint param0, jint param1, jint param2, jdouble param3, jdouble param4, jdouble param5, jdouble param6)
ARITYn(void, callV__JIIIF, ((void (APIENTRY *) (jint, jint, jint, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3), jint param0, jint param1, jint param2, jfloat param3)
ARITYn(void, callV__JIIIFFFF, ((void (APIENTRY *) (jint, jint, jint, jfloat, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6), jint param0, jint param1, jint param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6)
ARITYn(void, callV__JIIIFFFFF, ((void (APIENTRY *) (jint, jint, jint, jfloat, jfloat, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7), jint param0, jint param1, jint param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jfloat param7)
ARITYn(void, callV__JIIIFI, ((void (APIENTRY *) (jint, jint, jint, jfloat, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jint param0, jint param1, jint param2, jfloat param3, jint param4)
ARITYn(void, callV__JIIII, ((void (APIENTRY *) (jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3), jint param0, jint param1, jint param2, jint param3)
ARITYn(void, callV__JIIIII, ((void (APIENTRY *) (jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jint param0, jint param1, jint param2, jint param3, jint param4)
ARITYn(void, callV__JIIIIII, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5)
ARITYn(void, callV__JIIIIIII, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6)
ARITYn(void, callV__JIIIIIIII, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7)
ARITYn(void, callV__JIIIIIIIII, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8)
ARITYn(void, callV__JIIIIIIIIII, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9)
ARITYn(void, callV__JIIIIIIIIIIII, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jint param11)
ARITYn(void, callV__JIIIIIIIIIIIIIII, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jint param11, jint param12, jint param13, jint param14)
ARITYn(void, callV__JIIIIIIIIIIIIIIIII, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jint param11, jint param12, jint param13, jint param14, jint param15, jint param16)
ARITYn(void, callPV__JIIIIIIIIIIIJ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)param11), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jlong param11)
ARITYn(void, callPV__JIIIIIIIIIIJ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)param10), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jlong param10)
ARITYn(void, callPV__JIIIIIIIIIJ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jlong param9)
ARITYn(void, callPV__JIIIIIIIIJ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jlong param8)
ARITYn(void, callV__JIIIIIIIIZ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jboolean param8)
ARITYn(void, callJV__JIIIIIIIJ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jlong param7)
ARITYn(void, callPV__JIIIIIIIJ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jlong param7)
ARITYn(void, callV__JIIIIIIIZ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jboolean param7)
ARITYn(void, callJV__JIIIIIIJ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong param6)
ARITYn(void, callPV__JIIIIIIJ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (intptr_t)param6), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong param6)
ARITYn(void, callPPV__JIIIIIIJJ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (intptr_t)param6, (intptr_t)param7), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong param6, jlong param7)
ARITYn(void, callV__JIIIIIIZ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jboolean param6)
ARITYn(void, callJV__JIIIIIIZIJ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jboolean, jint, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8), jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jboolean param6, jint param7, jlong param8)
ARITYn(void, callJV__JIIIIIJ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5), jint param0, jint param1, jint param2, jint param3, jint param4, jlong param5)
ARITYn(void, callPV__JIIIIIJ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, (intptr_t)param5), jint param0, jint param1, jint param2, jint param3, jint param4, jlong param5)
ARITYn(void, callPV__JIIIIIJI, ((void (APIENTRY *) (jint, jint, jint, jint, jint, intptr_t, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, (intptr_t)param5, param6), jint param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jint param6)
ARITYn(void, callPPV__JIIIIIJJ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, (intptr_t)param5, (intptr_t)param6), jint param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jlong param6)
ARITYn(void, callV__JIIIIIZ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5), jint param0, jint param1, jint param2, jint param3, jint param4, jboolean param5)
ARITYn(void, callJV__JIIIIIZIJ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jboolean, jint, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7), jint param0, jint param1, jint param2, jint param3, jint param4, jboolean param5, jint param6, jlong param7)
ARITYn(void, callPV__JIIIIIZIJ, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jboolean, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7), jint param0, jint param1, jint param2, jint param3, jint param4, jboolean param5, jint param6, jlong param7)
ARITYn(void, callPV__JIIIIJ, ((void (APIENTRY *) (jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4), jint param0, jint param1, jint param2, jint param3, jlong param4)
ARITYn(void, callPPV__JIIIIJIIJ, ((void (APIENTRY *) (jint, jint, jint, jint, intptr_t, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4, param5, param6, (intptr_t)param7), jint param0, jint param1, jint param2, jint param3, jlong param4, jint param5, jint param6, jlong param7)
ARITYn(void, callPPPV__JIIIIJIJJ, ((void (APIENTRY *) (jint, jint, jint, jint, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4, param5, (intptr_t)param6, (intptr_t)param7), jint param0, jint param1, jint param2, jint param3, jlong param4, jint param5, jlong param6, jlong param7)
ARITYn(void, callPPV__JIIIIJJ, ((void (APIENTRY *) (jint, jint, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5), jint param0, jint param1, jint param2, jint param3, jlong param4, jlong param5)
ARITYn(void, callPPPV__JIIIIJJJ, ((void (APIENTRY *) (jint, jint, jint, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6), jint param0, jint param1, jint param2, jint param3, jlong param4, jlong param5, jlong param6)
ARITYn(void, callPV__JIIIIJZ, ((void (APIENTRY *) (jint, jint, jint, jint, intptr_t, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4, param5), jint param0, jint param1, jint param2, jint param3, jlong param4, jboolean param5)
ARITYn(void, callV__JIIIIZI, ((void (APIENTRY *) (jint, jint, jint, jint, jboolean, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5), jint param0, jint param1, jint param2, jint param3, jboolean param4, jint param5)
ARITYn(void, callPV__JIIIJ, ((void (APIENTRY *) (jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3), jint param0, jint param1, jint param2, jlong param3)
ARITYn(void, callPV__JIIIJI, ((void (APIENTRY *) (jint, jint, jint, intptr_t, jint))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4), jint param0, jint param1, jint param2, jlong param3, jint param4)
ARITYn(void, callPPV__JIIIJIFFIJ, ((void (APIENTRY *) (jint, jint, jint, intptr_t, jint, jfloat, jfloat, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4, param5, param6, param7, (intptr_t)param8), jint param0, jint param1, jint param2, jlong param3, jint param4, jfloat param5, jfloat param6, jint param7, jlong param8)
ARITYn(void, callPV__JIIIJII, ((void (APIENTRY *) (jint, jint, jint, intptr_t, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4, param5), jint param0, jint param1, jint param2, jlong param3, jint param4, jint param5)
ARITYn(void, callPV__JIIIJIII, ((void (APIENTRY *) (jint, jint, jint, intptr_t, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4, param5, param6), jint param0, jint param1, jint param2, jlong param3, jint param4, jint param5, jint param6)
ARITYn(void, callPPV__JIIIJIIJ, ((void (APIENTRY *) (jint, jint, jint, intptr_t, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4, param5, (intptr_t)param6), jint param0, jint param1, jint param2, jlong param3, jint param4, jint param5, jlong param6)
ARITYn(void, callPPPPPPPV__JIIIJIJJJJJJ, ((void (APIENTRY *) (jint, jint, jint, intptr_t, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, (intptr_t)param8, (intptr_t)param9, (intptr_t)param10), jint param0, jint param1, jint param2, jlong param3, jint param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jlong param10)
ARITYn(void, callPPV__JIIIJJ, ((void (APIENTRY *) (jint, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, (intptr_t)param4), jint param0, jint param1, jint param2, jlong param3, jlong param4)
ARITYn(void, callPPPV__JIIIJJJ, ((void (APIENTRY *) (jint, jint, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5), jint param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5)
ARITYn(void, callPPPPV__JIIIJJJJ, ((void (APIENTRY *) (jint, jint, jint, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6), jint param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6)
ARITYn(void, callPV__JIIIJZ, ((void (APIENTRY *) (jint, jint, jint, intptr_t, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4), jint param0, jint param1, jint param2, jlong param3, jboolean param4)
ARITYn(void, callV__JIIIZ, ((void (APIENTRY *) (jint, jint, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3), jint param0, jint param1, jint param2, jboolean param3)
ARITYn(void, callV__JIIIZI, ((void (APIENTRY *) (jint, jint, jint, jboolean, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jint param0, jint param1, jint param2, jboolean param3, jint param4)
ARITYn(void, callV__JIIIZIII, ((void (APIENTRY *) (jint, jint, jint, jboolean, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6), jint param0, jint param1, jint param2, jboolean param3, jint param4, jint param5, jint param6)
ARITYn(void, callPV__JIIIZIJ, ((void (APIENTRY *) (jint, jint, jint, jboolean, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, (intptr_t)param5), jint param0, jint param1, jint param2, jboolean param3, jint param4, jlong param5)
ARITYn(void, callPV__JIIIZJ, ((void (APIENTRY *) (jint, jint, jint, jboolean, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4), jint param0, jint param1, jint param2, jboolean param3, jlong param4)
ARITYn(void, callPV__JIIJ, ((void (APIENTRY *) (jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2), jint param0, jint param1, jlong param2)
ARITYn(void, callJV__JIIJ, ((void (APIENTRY *) (jint, jint, jlong))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jint param1, jlong param2)
ARITYn(void, callPV__JIIJI, ((void (APIENTRY *) (jint, jint, intptr_t, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3), jint param0, jint param1, jlong param2, jint param3)
ARITYn(void, callPV__JIIJII, ((void (APIENTRY *) (jint, jint, intptr_t, jint, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4), jint param0, jint param1, jlong param2, jint param3, jint param4)
ARITYn(void, callPV__JIIJIII, ((void (APIENTRY *) (jint, jint, intptr_t, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4, param5), jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5)
ARITYn(void, callPV__JIIJIIII, ((void (APIENTRY *) (jint, jint, intptr_t, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4, param5, param6), jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6)
ARITYn(void, callPV__JIIJIIIIIF, ((void (APIENTRY *) (jint, jint, intptr_t, jint, jint, jint, jint, jint, jfloat))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4, param5, param6, param7, param8), jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jint param7, jfloat param8)
ARITYn(void, callPPV__JIIJIIIIIJ, ((void (APIENTRY *) (jint, jint, intptr_t, jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4, param5, param6, param7, (intptr_t)param8), jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jint param7, jlong param8)
ARITYn(void, callPPV__JIIJIIIIJ, ((void (APIENTRY *) (jint, jint, intptr_t, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4, param5, param6, (intptr_t)param7), jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jlong param7)
ARITYn(void, callPPV__JIIJIIIJ, ((void (APIENTRY *) (jint, jint, intptr_t, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4, param5, (intptr_t)param6), jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jlong param6)
ARITYn(void, callPPV__JIIJIIIJIIF, ((void (APIENTRY *) (jint, jint, intptr_t, jint, jint, jint, intptr_t, jint, jint, jfloat))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4, param5, (intptr_t)param6, param7, param8, param9), jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jlong param6, jint param7, jint param8, jfloat param9)
ARITYn(void, callPPV__JIIJIIJ, ((void (APIENTRY *) (jint, jint, intptr_t, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4, (intptr_t)param5), jint param0, jint param1, jlong param2, jint param3, jint param4, jlong param5)
ARITYn(void, callPPV__JIIJIJ, ((void (APIENTRY *) (jint, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, (intptr_t)param4), jint param0, jint param1, jlong param2, jint param3, jlong param4)
ARITYn(void, callPPPV__JIIJIJJ, ((void (APIENTRY *) (jint, jint, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, (intptr_t)param4, (intptr_t)param5), jint param0, jint param1, jlong param2, jint param3, jlong param4, jlong param5)
ARITYn(void, callJJV__JIIJJ, ((void (APIENTRY *) (jint, jint, jlong, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3), jint param0, jint param1, jlong param2, jlong param3)
ARITYn(void, callPPV__JIIJJ, ((void (APIENTRY *) (jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3), jint param0, jint param1, jlong param2, jlong param3)
ARITYn(void, callJPV__JIIJJ, ((void (APIENTRY *) (jint, jint, jlong, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3), jint param0, jint param1, jlong param2, jlong param3)
ARITYn(void, callPPV__JIIJJI, ((void (APIENTRY *) (jint, jint, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, param4), jint param0, jint param1, jlong param2, jlong param3, jint param4)
ARITYn(void, callPPV__JIIJJII, ((void (APIENTRY *) (jint, jint, intptr_t, intptr_t, jint, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, param4, param5), jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5)
ARITYn(void, callPPV__JIIJJIII, ((void (APIENTRY *) (jint, jint, intptr_t, intptr_t, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, param4, param5, param6), jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jint param6)
ARITYn(void, callPPPV__JIIJJIIJ, ((void (APIENTRY *) (jint, jint, intptr_t, intptr_t, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, param4, param5, (intptr_t)param6), jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jlong param6)
ARITYn(void, callPPPV__JIIJJJ, ((void (APIENTRY *) (jint, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4), jint param0, jint param1, jlong param2, jlong param3, jlong param4)
ARITYn(void, callJJJV__JIIJJJ, ((void (APIENTRY *) (jint, jint, jlong, jlong, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jint param0, jint param1, jlong param2, jlong param3, jlong param4)
ARITYn(void, callJJJJV__JIIJJJJ, ((void (APIENTRY *) (jint, jint, jlong, jlong, jlong, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5), jint param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5)
ARITYn(void, callPPPPV__JIIJJJJI, ((void (APIENTRY *) (jint, jint, intptr_t, intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, param6), jint param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jint param6)
ARITYn(void, callPPPPPV__JIIJJJJJ, ((void (APIENTRY *) (jint, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6), jint param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6)
ARITYn(void, callV__JIIS, ((void (APIENTRY *) (jint, jint, jshort))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jint param1, jshort param2)
ARITYn(void, callV__JIIZ, ((void (APIENTRY *) (jint, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jint param1, jboolean param2)
ARITYn(void, callV__JIIZI, ((void (APIENTRY *) (jint, jint, jboolean, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3), jint param0, jint param1, jboolean param2, jint param3)
ARITYn(void, callPV__JIIZJ, ((void (APIENTRY *) (jint, jint, jboolean, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3), jint param0, jint param1, jboolean param2, jlong param3)
ARITYn(void, callPV__JIJ, ((void (APIENTRY *) (jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1), jint param0, jlong param1)
ARITYn(void, callJV__JIJ, ((void (APIENTRY *) (jint, jlong))(intptr_t)__functionAddress)(param0, param1), jint param0, jlong param1)
ARITYn(void, callPV__JIJI, ((void (APIENTRY *) (jint, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2), jint param0, jlong param1, jint param2)
ARITYn(void, callPV__JIJII, ((void (APIENTRY *) (jint, intptr_t, jint, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, param3), jint param0, jlong param1, jint param2, jint param3)
ARITYn(void, callJV__JIJII, ((void (APIENTRY *) (jint, jlong, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3), jint param0, jlong param1, jint param2, jint param3)
ARITYn(void, callPV__JIJIII, ((void (APIENTRY *) (jint, intptr_t, jint, jint, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, param3, param4), jint param0, jlong param1, jint param2, jint param3, jint param4)
ARITYn(void, callPPV__JIJIJ, ((void (APIENTRY *) (jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, (intptr_t)param3), jint param0, jlong param1, jint param2, jlong param3)
ARITYn(void, callPJV__JIJIJ, ((void (APIENTRY *) (jint, intptr_t, jint, jlong))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, param3), jint param0, jlong param1, jint param2, jlong param3)
ARITYn(void, callJPV__JIJIJ, ((void (APIENTRY *) (jint, jlong, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3), jint param0, jlong param1, jint param2, jlong param3)
ARITYn(void, callPPV__JIJIJI, ((void (APIENTRY *) (jint, intptr_t, jint, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, (intptr_t)param3, param4), jint param0, jlong param1, jint param2, jlong param3, jint param4)
ARITYn(void, callPPPV__JIJIJIJ, ((void (APIENTRY *) (jint, intptr_t, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, (intptr_t)param3, param4, (intptr_t)param5), jint param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5)
ARITYn(void, callPPPV__JIJIJJ, ((void (APIENTRY *) (jint, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4), jint param0, jlong param1, jint param2, jlong param3, jlong param4)
ARITYn(void, callPPPPV__JIJIJJJ, ((void (APIENTRY *) (jint, intptr_t, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5), jint param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5)
ARITYn(void, callPPV__JIJJ, ((void (APIENTRY *) (jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2), jint param0, jlong param1, jlong param2)
ARITYn(void, callJJV__JIJJ, ((void (APIENTRY *) (jint, jlong, jlong))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jlong param1, jlong param2)
ARITYn(void, callPPV__JIJJI, ((void (APIENTRY *) (jint, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, param3), jint param0, jlong param1, jlong param2, jint param3)
ARITYn(void, callPPV__JIJJII, ((void (APIENTRY *) (jint, intptr_t, intptr_t, jint, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, param3, param4), jint param0, jlong param1, jlong param2, jint param3, jint param4)
ARITYn(void, callPPV__JIJJIII, ((void (APIENTRY *) (jint, intptr_t, intptr_t, jint, jint, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, param3, param4, param5), jint param0, jlong param1, jlong param2, jint param3, jint param4, jint param5)
ARITYn(void, callPPPV__JIJJIJ, ((void (APIENTRY *) (jint, intptr_t, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4), jint param0, jlong param1, jlong param2, jint param3, jlong param4)
ARITYn(void, callPPPV__JIJJJ, ((void (APIENTRY *) (jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3), jint param0, jlong param1, jlong param2, jlong param3)
ARITYn(void, callJJJV__JIJJJ, ((void (APIENTRY *) (jint, jlong, jlong, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3), jint param0, jlong param1, jlong param2, jlong param3)
ARITYn(void, callPPPV__JIJJJI, ((void (APIENTRY *) (jint, intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, param4), jint param0, jlong param1, jlong param2, jlong param3, jint param4)
ARITYn(void, callJJJJV__JIJJJJ, ((void (APIENTRY *) (jint, jlong, jlong, jlong, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jint param0, jlong param1, jlong param2, jlong param3, jlong param4)
ARITYn(void, callPPPPV__JIJJJJ, ((void (APIENTRY *) (jint, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4), jint param0, jlong param1, jlong param2, jlong param3, jlong param4)
ARITYn(void, callPPPPV__JIJJJJI, ((void (APIENTRY *) (jint, intptr_t, intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, param5), jint param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5)
ARITYn(void, callPPV__JIJJZ, ((void (APIENTRY *) (jint, intptr_t, intptr_t, jboolean))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, param3), jint param0, jlong param1, jlong param2, jboolean param3)
ARITYn(void, callV__JIS, ((void (APIENTRY *) (jint, jshort))(intptr_t)__functionAddress)(param0, param1), jint param0, jshort param1)
ARITYn(void, callV__JISS, ((void (APIENTRY *) (jint, jshort, jshort))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jshort param1, jshort param2)
ARITYn(void, callV__JISSS, ((void (APIENTRY *) (jint, jshort, jshort, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3), jint param0, jshort param1, jshort param2, jshort param3)
ARITYn(void, callV__JISSSS, ((void (APIENTRY *) (jint, jshort, jshort, jshort, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jint param0, jshort param1, jshort param2, jshort param3, jshort param4)
ARITYn(void, callV__JIZ, ((void (APIENTRY *) (jint, jboolean))(intptr_t)__functionAddress)(param0, param1), jint param0, jboolean param1)
ARITYn(void, callPV__JIZIIIJ, ((void (APIENTRY *) (jint, jboolean, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, (intptr_t)param5), jint param0, jboolean param1, jint param2, jint param3, jint param4, jlong param5)
ARITYn(void, callPV__JIZIIJ, ((void (APIENTRY *) (jint, jboolean, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4), jint param0, jboolean param1, jint param2, jint param3, jlong param4)
ARITYn(void, callV__JIZZZZ, ((void (APIENTRY *) (jint, jboolean, jboolean, jboolean, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4), jint param0, jboolean param1, jboolean param2, jboolean param3, jboolean param4)
ARITYn(void, callJV__JJ, ((void (APIENTRY *) (jlong))(intptr_t)__functionAddress)(param0), jlong param0)
ARITYn(void, callPV__JJ, ((void (APIENTRY *) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0), jlong param0)
ARITYn(void, callPV__JJF, ((void (APIENTRY *) (intptr_t, jfloat))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jfloat param1)
ARITYn(void, callPV__JJFF, ((void (APIENTRY *) (intptr_t, jfloat, jfloat))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2), jlong param0, jfloat param1, jfloat param2)
ARITYn(void, callPV__JJFFF, ((void (APIENTRY *) (intptr_t, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3), jlong param0, jfloat param1, jfloat param2, jfloat param3)
ARITYn(void, callPV__JJI, ((void (APIENTRY *) (intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jint param1)
ARITYn(void, callJV__JJI, ((void (APIENTRY *) (jlong, jint))(intptr_t)__functionAddress)(param0, param1), jlong param0, jint param1)
ARITYn(void, callJV__JJIFFFFFFFFF, ((void (APIENTRY *) (jlong, jint, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10), jlong param0, jint param1, jfloat param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jfloat param7, jfloat param8, jfloat param9, jfloat param10)
ARITYn(void, callPPV__JJIFJ, ((void (APIENTRY *) (intptr_t, jint, jfloat, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3), jlong param0, jint param1, jfloat param2, jlong param3)
ARITYn(void, callPV__JJII, ((void (APIENTRY *) (intptr_t, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2), jlong param0, jint param1, jint param2)
ARITYn(void, callPV__JJIII, ((void (APIENTRY *) (intptr_t, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3), jlong param0, jint param1, jint param2, jint param3)
ARITYn(void, callPV__JJIIII, ((void (APIENTRY *) (intptr_t, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4), jlong param0, jint param1, jint param2, jint param3, jint param4)
ARITYn(void, callPV__JJIIIII, ((void (APIENTRY *) (intptr_t, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5), jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5)
ARITYn(void, callPV__JJIIIIII, ((void (APIENTRY *) (intptr_t, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, param6), jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6)
ARITYn(void, callPV__JJIIIIIIIIII, ((void (APIENTRY *) (intptr_t, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10), jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10)
ARITYn(void, callPPPV__JJIIIIIJJ, ((void (APIENTRY *) (intptr_t, jint, jint, jint, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, (intptr_t)param6, (intptr_t)param7), jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong param6, jlong param7)
ARITYn(void, callPPPPV__JJIIIIJIJIJ, ((void (APIENTRY *) (intptr_t, jint, jint, jint, jint, intptr_t, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5, param6, (intptr_t)param7, param8, (intptr_t)param9), jlong param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jint param6, jlong param7, jint param8, jlong param9)
ARITYn(void, callPPV__JJIIIJ, ((void (APIENTRY *) (intptr_t, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4), jlong param0, jint param1, jint param2, jint param3, jlong param4)
ARITYn(void, callPPV__JJIIJ, ((void (APIENTRY *) (intptr_t, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3), jlong param0, jint param1, jint param2, jlong param3)
ARITYn(void, callPPPV__JJIIJJ, ((void (APIENTRY *) (intptr_t, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jint param1, jint param2, jlong param3, jlong param4)
ARITYn(void, callPJPPPV__JJIIJJIJJ, ((void (APIENTRY *) (intptr_t, jint, jint, jlong, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4, param5, (intptr_t)param6, (intptr_t)param7), jlong param0, jint param1, jint param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7)
ARITYn(void, callPPV__JJIJ, ((void (APIENTRY *) (intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2), jlong param0, jint param1, jlong param2)
ARITYn(void, callPJV__JJIJ, ((void (APIENTRY *) (intptr_t, jint, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2), jlong param0, jint param1, jlong param2)
ARITYn(void, callPJV__JJIJI, ((void (APIENTRY *) (intptr_t, jint, jlong, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3), jlong param0, jint param1, jlong param2, jint param3)
ARITYn(void, callPPPPPV__JJIJIIIJIJIJ, ((void (APIENTRY *) (intptr_t, jint, intptr_t, jint, jint, jint, intptr_t, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, param4, param5, (intptr_t)param6, param7, (intptr_t)param8, param9, (intptr_t)param10), jlong param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jlong param6, jint param7, jlong param8, jint param9, jlong param10)
ARITYn(void, callPJPV__JJIJIIJ, ((void (APIENTRY *) (intptr_t, jint, jlong, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5), jlong param0, jint param1, jlong param2, jint param3, jint param4, jlong param5)
ARITYn(void, callPJPPV__JJIJIIJIJ, ((void (APIENTRY *) (intptr_t, jint, jlong, jint, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5, param6, (intptr_t)param7), jlong param0, jint param1, jlong param2, jint param3, jint param4, jlong param5, jint param6, jlong param7)
ARITYn(void, callPPPV__JJIJIJ, ((void (APIENTRY *) (intptr_t, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, (intptr_t)param4), jlong param0, jint param1, jlong param2, jint param3, jlong param4)
ARITYn(void, callPPPV__JJIJJ, ((void (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3), jlong param0, jint param1, jlong param2, jlong param3)
ARITYn(void, callPJJV__JJIJJI, ((void (APIENTRY *) (intptr_t, jint, jlong, jlong, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4), jlong param0, jint param1, jlong param2, jlong param3, jint param4)
ARITYn(void, callPPV__JJJ, ((void (APIENTRY *) (intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1), jlong param0, jlong param1)
ARITYn(void, callPJV__JJJ, ((void (APIENTRY *) (intptr_t, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jlong param1)
ARITYn(void, callJPV__JJJ, ((void (APIENTRY *) (jlong, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1), jlong param0, jlong param1)
ARITYn(void, callPPPV__JJJFJ, ((void (APIENTRY *) (intptr_t, intptr_t, jfloat, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3), jlong param0, jlong param1, jfloat param2, jlong param3)
ARITYn(void, callPPV__JJJI, ((void (APIENTRY *) (intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2), jlong param0, jlong param1, jint param2)
ARITYn(void, callPJV__JJJI, ((void (APIENTRY *) (intptr_t, jlong, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2), jlong param0, jlong param1, jint param2)
ARITYn(void, callPPV__JJJII, ((void (APIENTRY *) (intptr_t, intptr_t, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3), jlong param0, jlong param1, jint param2, jint param3)
ARITYn(void, callPJV__JJJII, ((void (APIENTRY *) (intptr_t, jlong, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3), jlong param0, jlong param1, jint param2, jint param3)
ARITYn(void, callPPPV__JJJIIIIIIJIIIIIIIII, ((void (APIENTRY *) (intptr_t, intptr_t, jint, jint, jint, jint, jint, jint, intptr_t, jint, jint, jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8, param9, param10, param11, param12, param13, param14, param15, param16, param17), jlong param0, jlong param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jlong param8, jint param9, jint param10, jint param11, jint param12, jint param13, jint param14, jint param15, jint param16, jint param17)
ARITYn(void, callPJPV__JJJIIIJ, ((void (APIENTRY *) (intptr_t, jlong, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5), jlong param0, jlong param1, jint param2, jint param3, jint param4, jlong param5)
ARITYn(void, callPJJJJV__JJJIIJJJI, ((void (APIENTRY *) (intptr_t, jlong, jint, jint, jlong, jlong, jlong, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, param6, param7), jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong param5, jlong param6, jint param7)
ARITYn(void, callPJPV__JJJIJ, ((void (APIENTRY *) (intptr_t, jlong, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3), jlong param0, jlong param1, jint param2, jlong param3)
ARITYn(void, callPPPV__JJJIJ, ((void (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3), jlong param0, jlong param1, jint param2, jlong param3)
ARITYn(void, callPJJPV__JJJIJIIJ, ((void (APIENTRY *) (intptr_t, jlong, jint, jlong, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, (intptr_t)param6), jlong param0, jlong param1, jint param2, jlong param3, jint param4, jint param5, jlong param6)
ARITYn(void, callPJJPV__JJJIJIIJI, ((void (APIENTRY *) (intptr_t, jlong, jint, jlong, jint, jint, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, (intptr_t)param6, param7), jlong param0, jlong param1, jint param2, jlong param3, jint param4, jint param5, jlong param6, jint param7)
ARITYn(void, callPJJPV__JJJIJIJ, ((void (APIENTRY *) (intptr_t, jlong, jint, jlong, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5), jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5)
ARITYn(void, callPJPPV__JJJIJIJ, ((void (APIENTRY *) (intptr_t, jlong, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, param4, (intptr_t)param5), jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5)
ARITYn(void, callPJPV__JJJJ, ((void (APIENTRY *) (intptr_t, jlong, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2), jlong param0, jlong param1, jlong param2)
ARITYn(void, callPPPV__JJJJ, ((void (APIENTRY *) (intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2), jlong param0, jlong param1, jlong param2)
ARITYn(void, callPJJV__JJJJ, ((void (APIENTRY *) (intptr_t, jlong, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2), jlong param0, jlong param1, jlong param2)
ARITYn(void, callPJJV__JJJJI, ((void (APIENTRY *) (intptr_t, jlong, jlong, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3), jlong param0, jlong param1, jlong param2, jint param3)
ARITYn(void, callPPPV__JJJJI, ((void (APIENTRY *) (intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3), jlong param0, jlong param1, jlong param2, jint param3)
ARITYn(void, callPJJV__JJJJII, ((void (APIENTRY *) (intptr_t, jlong, jlong, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4), jlong param0, jlong param1, jlong param2, jint param3, jint param4)
ARITYn(void, callPJJPV__JJJJIIJ, ((void (APIENTRY *) (intptr_t, jlong, jlong, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5), jlong param0, jlong param1, jlong param2, jint param3, jint param4, jlong param5)
ARITYn(void, callPPPPPPV__JJJJIIJJJ, ((void (APIENTRY *) (intptr_t, intptr_t, intptr_t, jint, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7), jlong param0, jlong param1, jlong param2, jint param3, jint param4, jlong param5, jlong param6, jlong param7)
ARITYn(void, callPJJPV__JJJJIJ, ((void (APIENTRY *) (intptr_t, jlong, jlong, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4), jlong param0, jlong param1, jlong param2, jint param3, jlong param4)
ARITYn(void, callPPPPV__JJJJIJ, ((void (APIENTRY *) (intptr_t, intptr_t, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4), jlong param0, jlong param1, jlong param2, jint param3, jlong param4)
ARITYn(void, callPJJPV__JJJJJ, ((void (APIENTRY *) (intptr_t, jlong, jlong, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3), jlong param0, jlong param1, jlong param2, jlong param3)
ARITYn(void, callPJPPV__JJJJJ, ((void (APIENTRY *) (intptr_t, jlong, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3), jlong param0, jlong param1, jlong param2, jlong param3)
ARITYn(void, callPPPPV__JJJJJ, ((void (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3), jlong param0, jlong param1, jlong param2, jlong param3)
ARITYn(void, callPJJJV__JJJJJI, ((void (APIENTRY *) (intptr_t, jlong, jlong, jlong, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4), jlong param0, jlong param1, jlong param2, jlong param3, jint param4)
ARITYn(void, callPPPPV__JJJJJI, ((void (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, param4), jlong param0, jlong param1, jlong param2, jlong param3, jint param4)
ARITYn(void, callPJJJPV__JJJJJJ, ((void (APIENTRY *) (intptr_t, jlong, jlong, jlong, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4)
ARITYn(void, callPJJJJV__JJJJJJII, ((void (APIENTRY *) (intptr_t, jlong, jlong, jlong, jlong, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, param6), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jint param6)
ARITYn(void, callPPPV__JJJZJ, ((void (APIENTRY *) (intptr_t, intptr_t, jboolean, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3), jlong param0, jlong param1, jboolean param2, jlong param3)
ARITYn(void, callV__JS, ((void (APIENTRY *) (jshort))(intptr_t)__functionAddress)(param0), jshort param0)
ARITYn(void, callV__JSS, ((void (APIENTRY *) (jshort, jshort))(intptr_t)__functionAddress)(param0, param1), jshort param0, jshort param1)
ARITYn(void, callV__JSSS, ((void (APIENTRY *) (jshort, jshort, jshort))(intptr_t)__functionAddress)(param0, param1, param2), jshort param0, jshort param1, jshort param2)
ARITYn(void, callV__JSSSS, ((void (APIENTRY *) (jshort, jshort, jshort, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3), jshort param0, jshort param1, jshort param2, jshort param3)
ARITYn(void, callV__JZ, ((void (APIENTRY *) (jboolean))(intptr_t)__functionAddress)(param0), jboolean param0)
ARITYn(void, callV__JZZZZ, ((void (APIENTRY *) (jboolean, jboolean, jboolean, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3), jboolean param0, jboolean param1, jboolean param2, jboolean param3)
ARITY0(jboolean, callZ__J, return ((jboolean (APIENTRY *) ())(intptr_t)__functionAddress)())
ARITYn(jboolean, callZ__JI, return ((jboolean (APIENTRY *) (jint))(intptr_t)__functionAddress)(param0), jint param0)
ARITYn(jboolean, callZ__JIFF, return ((jboolean (APIENTRY *) (jint, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jfloat param1, jfloat param2)
ARITYn(jboolean, callPZ__JIFFJ, return ((jboolean (APIENTRY *) (jint, jfloat, jfloat, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3), jint param0, jfloat param1, jfloat param2, jlong param3)
ARITYn(jboolean, callZ__JII, return ((jboolean (APIENTRY *) (jint, jint))(intptr_t)__functionAddress)(param0, param1), jint param0, jint param1)
ARITYn(jboolean, callZ__JIIFF, return ((jboolean (APIENTRY *) (jint, jint, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3), jint param0, jint param1, jfloat param2, jfloat param3)
ARITYn(jboolean, callPPPPZ__JIIIFJJJJ, return ((jboolean (APIENTRY *) (jint, jint, jint, jfloat, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7), jint param0, jint param1, jint param2, jfloat param3, jlong param4, jlong param5, jlong param6, jlong param7)
ARITYn(jboolean, callPZ__JIIJ, return ((jboolean (APIENTRY *) (jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2), jint param0, jint param1, jlong param2)
ARITYn(jboolean, callPPZ__JIIJIJ, return ((jboolean (APIENTRY *) (jint, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, (intptr_t)param4), jint param0, jint param1, jlong param2, jint param3, jlong param4)
ARITYn(jboolean, callPZ__JIJ, return ((jboolean (APIENTRY *) (jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1), jint param0, jlong param1)
ARITYn(jboolean, callJZ__JIJ, return ((jboolean (APIENTRY *) (jint, jlong))(intptr_t)__functionAddress)(param0, param1), jint param0, jlong param1)
ARITYn(jboolean, callPZ__JIJI, return ((jboolean (APIENTRY *) (jint, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2), jint param0, jlong param1, jint param2)
ARITYn(jboolean, callJZ__JIJI, return ((jboolean (APIENTRY *) (jint, jlong, jint))(intptr_t)__functionAddress)(param0, param1, param2), jint param0, jlong param1, jint param2)
ARITYn(jboolean, callPPZ__JIJIJ, return ((jboolean (APIENTRY *) (jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, (intptr_t)param3), jint param0, jlong param1, jint param2, jlong param3)
ARITYn(jboolean, callPPZ__JIJJ, return ((jboolean (APIENTRY *) (jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2), jint param0, jlong param1, jlong param2)
ARITYn(jboolean, callPZ__JJ, return ((jboolean (APIENTRY *) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0), jlong param0)
ARITYn(jboolean, callJZ__JJ, return ((jboolean (APIENTRY *) (jlong))(intptr_t)__functionAddress)(param0), jlong param0)
ARITYn(jboolean, callPZ__JJI, return ((jboolean (APIENTRY *) (intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1), jlong param0, jint param1)
ARITYn(jboolean, callPPZ__JJIJ, return ((jboolean (APIENTRY *) (intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2), jlong param0, jint param1, jlong param2)
ARITYn(jboolean, callPPZ__JJJ, return ((jboolean (APIENTRY *) (intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1), jlong param0, jlong param1)
ARITYn(jboolean, callPPZ__JJJI, return ((jboolean (APIENTRY *) (intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2), jlong param0, jlong param1, jint param2)
ARITYn(jboolean, callJPZ__JJJI, return ((jboolean (APIENTRY *) (jlong, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2), jlong param0, jlong param1, jint param2)
ARITYn(jboolean, callJPPZ__JJJJ, return ((jboolean (APIENTRY *) (jlong, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2), jlong param0, jlong param1, jlong param2)
ARITYn(jboolean, callPPPZ__JJJJ, return ((jboolean (APIENTRY *) (intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2), jlong param0, jlong param1, jlong param2)
ARITYn(jboolean, callPPPPPZ__JJJJJJ, return ((jboolean (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4), jlong param0, jlong param1, jlong param2, jlong param3, jlong param4)
ARITYn(jboolean, callZ__JZ, return ((jboolean (APIENTRY *) (jboolean))(intptr_t)__functionAddress)(param0), jboolean param0)
ARITYn(jboolean, callPZ__JZJ, return ((jboolean (APIENTRY *) (jboolean, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1), jboolean param0, jlong param1)

JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_JNI_invokePB__JB_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jbyte param0, jintArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    jbyte __result = Java_org_lwjgl_system_JNI_invokePB__JBJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jbyte JNICALL JavaCritical_org_lwjgl_system_JNI_invokePB__JB_3I(jlong __functionAddress, jbyte param0, jint length1, jint* param1) {
    UNUSED_PARAM(length1)
    return Java_org_lwjgl_system_JNI_invokePB__JBJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JI_3II_3IIZ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jint param2, jintArray param3, jint param4, jboolean param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_invokePPI__JIJIJIZ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2, (intptr_t)paramArray3, param4, param5);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPI__JI_3II_3IIZ(jlong __functionAddress, jint param0, jint length1, jint* param1, jint param2, jint length3, jint* param3, jint param4, jboolean param5) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_invokePPI__JIJIJIZ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, (intptr_t)param3, param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JI_3SI_3SIZ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jshortArray param1, jint param2, jshortArray param3, jint param4, jboolean param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_invokePPI__JIJIJIZ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2, (intptr_t)paramArray3, param4, param5);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPI__JI_3SI_3SIZ(jlong __functionAddress, jint param0, jint length1, jshort* param1, jint param2, jint length3, jshort* param3, jint param4, jboolean param5) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_invokePPI__JIJIJIZ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, (intptr_t)param3, param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPPI__JJIIJ_3I_3I_3F_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jlong param3, jintArray param4, jintArray param5, jfloatArray param6, jintArray param7, jintArray param8, jintArray param9) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
    jint __result = Java_org_lwjgl_system_JNI_invokePPPPPPPPI__JJIIJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5, (intptr_t)paramArray6, (intptr_t)paramArray7, (intptr_t)paramArray8, (intptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0); }
    if (param8 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0); }
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPPPPPPI__JJIIJ_3I_3I_3F_3I_3I_3I(jlong __functionAddress, jlong param0, jint param1, jint param2, jlong param3, jint length4, jint* param4, jint length5, jint* param5, jint length6, jfloat* param6, jint length7, jint* param7, jint length8, jint* param8, jint length9, jint* param9) {
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    UNUSED_PARAM(length6)
    UNUSED_PARAM(length7)
    UNUSED_PARAM(length8)
    UNUSED_PARAM(length9)
    return Java_org_lwjgl_system_JNI_invokePPPPPPPPI__JJIIJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, (intptr_t)param8, (intptr_t)param9);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJJII_3F_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jfloatArray param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jint __result = Java_org_lwjgl_system_JNI_invokePPPPI__JJJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPPI__JJJII_3F_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint length4, jfloat* param4, jint length5, jint* param5) {
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_invokePPPPI__JJJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJJII_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jintArray param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jint __result = Java_org_lwjgl_system_JNI_invokePPPPI__JJJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPPI__JJJII_3I_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint length4, jint* param4, jint length5, jint* param5) {
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_invokePPPPI__JJJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJJJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlongArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_invokePPPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPPI__JJJJ_3J(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint length3, jlong* param3) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_invokePPPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JJ_3FS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jfloatArray param1, jshort param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    jint __result = Java_org_lwjgl_system_JNI_invokePPI__JJJS(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPI__JJ_3FS(jlong __functionAddress, jlong param0, jint length1, jfloat* param1, jshort param2) {
    UNUSED_PARAM(length1)
    return Java_org_lwjgl_system_JNI_invokePPI__JJJS(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JS_3FB(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jfloatArray param1, jbyte param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    jint __result = Java_org_lwjgl_system_JNI_invokePI__JSJB(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePI__JS_3FB(jlong __functionAddress, jshort param0, jint length1, jfloat* param1, jbyte param2) {
    UNUSED_PARAM(length1)
    return Java_org_lwjgl_system_JNI_invokePI__JSJB(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JS_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jintArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    jint __result = Java_org_lwjgl_system_JNI_invokePI__JSJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePI__JS_3I(jlong __functionAddress, jshort param0, jint length1, jint* param1) {
    UNUSED_PARAM(length1)
    return Java_org_lwjgl_system_JNI_invokePI__JSJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JS_3IB(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jintArray param1, jbyte param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    jint __result = Java_org_lwjgl_system_JNI_invokePI__JSJB(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePI__JS_3IB(jlong __functionAddress, jshort param0, jint length1, jint* param1, jbyte param2) {
    UNUSED_PARAM(length1)
    return Java_org_lwjgl_system_JNI_invokePI__JSJB(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JS_3SB(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jshortArray param1, jbyte param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    jint __result = Java_org_lwjgl_system_JNI_invokePI__JSJB(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePI__JS_3SB(jlong __functionAddress, jshort param0, jint length1, jshort* param1, jbyte param2) {
    UNUSED_PARAM(length1)
    return Java_org_lwjgl_system_JNI_invokePI__JSJB(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__J_3FS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jfloatArray param0, jshort param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    jint __result = Java_org_lwjgl_system_JNI_invokePI__JJS(NULL, NULL, __functionAddress, (intptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePI__J_3FS(jlong __functionAddress, jint length0, jfloat* param0, jshort param1) {
    UNUSED_PARAM(length0)
    return Java_org_lwjgl_system_JNI_invokePI__JJS(NULL, NULL, __functionAddress, (intptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    jlong __result = Java_org_lwjgl_system_JNI_invokePPP__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPP__JJ_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1) {
    UNUSED_PARAM(length1)
    return Java_org_lwjgl_system_JNI_invokePPP__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__J_3DI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jdoubleArray param0, jint param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    jlong __result = Java_org_lwjgl_system_JNI_invokePP__JJI(NULL, NULL, __functionAddress, (intptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_invokePP__J_3DI(jlong __functionAddress, jint length0, jdouble* param0, jint param1) {
    UNUSED_PARAM(length0)
    return Java_org_lwjgl_system_JNI_invokePP__JJI(NULL, NULL, __functionAddress, (intptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__J_3FI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jfloatArray param0, jint param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    jlong __result = Java_org_lwjgl_system_JNI_invokePP__JJI(NULL, NULL, __functionAddress, (intptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_invokePP__J_3FI(jlong __functionAddress, jint length0, jfloat* param0, jint param1) {
    UNUSED_PARAM(length0)
    return Java_org_lwjgl_system_JNI_invokePP__JJI(NULL, NULL, __functionAddress, (intptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__J_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0, jint param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    jlong __result = Java_org_lwjgl_system_JNI_invokePP__JJI(NULL, NULL, __functionAddress, (intptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_invokePP__J_3II(jlong __functionAddress, jint length0, jint* param0, jint param1) {
    UNUSED_PARAM(length0)
    return Java_org_lwjgl_system_JNI_invokePP__JJI(NULL, NULL, __functionAddress, (intptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__J_3JI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlongArray param0, jint param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    jlong __result = Java_org_lwjgl_system_JNI_invokePP__JJI(NULL, NULL, __functionAddress, (intptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_invokePP__J_3JI(jlong __functionAddress, jint length0, jlong* param0, jint param1) {
    UNUSED_PARAM(length0)
    return Java_org_lwjgl_system_JNI_invokePP__JJI(NULL, NULL, __functionAddress, (intptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__J_3SI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshortArray param0, jint param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    jlong __result = Java_org_lwjgl_system_JNI_invokePP__JJI(NULL, NULL, __functionAddress, (intptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_invokePP__J_3SI(jlong __functionAddress, jint length0, jshort* param0, jint param1) {
    UNUSED_PARAM(length0)
    return Java_org_lwjgl_system_JNI_invokePP__JJI(NULL, NULL, __functionAddress, (intptr_t)param0, param1);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePS__JB_3SZ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jbyte param0, jshortArray param1, jboolean param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    jshort __result = Java_org_lwjgl_system_JNI_invokePS__JBJZ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jshort JNICALL JavaCritical_org_lwjgl_system_JNI_invokePS__JB_3SZ(jlong __functionAddress, jbyte param0, jint length1, jshort* param1, jboolean param2) {
    UNUSED_PARAM(length1)
    return Java_org_lwjgl_system_JNI_invokePS__JBJZ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePS__JS_3SS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jshortArray param1, jshort param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    jshort __result = Java_org_lwjgl_system_JNI_invokePS__JSJS(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jshort JNICALL JavaCritical_org_lwjgl_system_JNI_invokePS__JS_3SS(jlong __functionAddress, jshort param0, jint length1, jshort* param1, jshort param2) {
    UNUSED_PARAM(length1)
    return Java_org_lwjgl_system_JNI_invokePS__JSJS(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePPPS__J_3SJJSF(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshortArray param0, jlong param1, jlong param2, jshort param3, jfloat param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    jshort __result = Java_org_lwjgl_system_JNI_invokePPPS__JJJJSF(NULL, NULL, __functionAddress, (intptr_t)paramArray0, param1, param2, param3, param4);
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jshort JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPS__J_3SJJSF(jlong __functionAddress, jint length0, jshort* param0, jlong param1, jlong param2, jshort param3, jfloat param4) {
    UNUSED_PARAM(length0)
    return Java_org_lwjgl_system_JNI_invokePPPS__JJJJSF(NULL, NULL, __functionAddress, (intptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JB_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jbyte param0, jfloatArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_invokePV__JBJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JB_3F(jlong __functionAddress, jbyte param0, jint length1, jfloat* param1) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_invokePV__JBJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jdoubleArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_invokePV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JII_3D(jlong __functionAddress, jint param0, jint param1, jint length2, jdouble* param2) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_invokePV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JII_3D_3D_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jdoubleArray param2, jdoubleArray param3, jdoubleArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_invokePPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__JII_3D_3D_3D(jlong __functionAddress, jint param0, jint param1, jint length2, jdouble* param2, jint length3, jdouble* param3, jint length4, jdouble* param4) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_invokePPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jfloatArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_invokePV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JII_3F(jlong __functionAddress, jint param0, jint param1, jint length2, jfloat* param2) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_invokePV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JII_3FII(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jfloatArray param2, jint param3, jint param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_invokePV__JIIJII(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, param4);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JII_3FII(jlong __functionAddress, jint param0, jint param1, jint length2, jfloat* param2, jint param3, jint param4) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_invokePV__JIIJII(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JII_3F_3F_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jfloatArray param2, jfloatArray param3, jfloatArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_invokePPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__JII_3F_3F_3F(jlong __functionAddress, jint param0, jint param1, jint length2, jfloat* param2, jint length3, jfloat* param3, jint length4, jfloat* param4) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_invokePPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_invokePV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JII_3I(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_invokePV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JII_3III(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jint param3, jint param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_invokePV__JIIJII(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, param4);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JII_3III(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint param3, jint param4) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_invokePV__JIIJII(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JII_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlongArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_invokePV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JII_3J(jlong __functionAddress, jint param0, jint param1, jint length2, jlong* param2) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_invokePV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JII_3J_3J_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlongArray param2, jlongArray param3, jlongArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_invokePPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__JII_3J_3J_3J(jlong __functionAddress, jint param0, jint param1, jint length2, jlong* param2, jint length3, jlong* param3, jint length4, jlong* param4) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_invokePPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JII_3SII(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jshortArray param2, jint param3, jint param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_invokePV__JIIJII(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, param4);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JII_3SII(jlong __functionAddress, jint param0, jint param1, jint length2, jshort* param2, jint param3, jint param4) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_invokePV__JIIJII(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JIJI_3F_3FJIJIZ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jint param2, jfloatArray param3, jfloatArray param4, jlong param5, jint param6, jlong param7, jint param8, jboolean param9) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_invokePPPPPV__JIJIJJJIJIZ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4, param5, param6, param7, param8, param9);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPPPV__JIJI_3F_3FJIJIZ(jlong __functionAddress, jint param0, jlong param1, jint param2, jint length3, jfloat* param3, jint length4, jfloat* param4, jlong param5, jint param6, jlong param7, jint param8, jboolean param9) {
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_invokePPPPPV__JIJIJJJIJIZ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4, param5, param6, param7, param8, param9);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JI_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jdoubleArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_invokePV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JI_3D(jlong __functionAddress, jint param0, jint length1, jdouble* param1) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_invokePV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JI_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jfloatArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_invokePV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JI_3F(jlong __functionAddress, jint param0, jint length1, jfloat* param1) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_invokePV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JI_3F_3F_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jfloatArray param1, jfloatArray param2, jfloatArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_invokePPPV__JIJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__JI_3F_3F_3F(jlong __functionAddress, jint param0, jint length1, jfloat* param1, jint length2, jfloat* param2, jint length3, jfloat* param3) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_invokePPPV__JIJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_invokePV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JI_3I(jlong __functionAddress, jint param0, jint length1, jint* param1) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_invokePV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JI_3II_3F_3FJI_3IIZ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jint param2, jfloatArray param3, jfloatArray param4, jlong param5, jint param6, jintArray param7, jint param8, jboolean param9) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    Java_org_lwjgl_system_JNI_invokePPPPPV__JIJIJJJIJIZ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4, param5, param6, (intptr_t)paramArray7, param8, param9);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPPPV__JI_3II_3F_3FJI_3IIZ(jlong __functionAddress, jint param0, jint length1, jint* param1, jint param2, jint length3, jfloat* param3, jint length4, jfloat* param4, jlong param5, jint param6, jint length7, jint* param7, jint param8, jboolean param9) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length7)
    Java_org_lwjgl_system_JNI_invokePPPPPV__JIJIJJJIJIZ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4, param5, param6, (intptr_t)param7, param8, param9);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JI_3SI_3F_3FJI_3SIZ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jshortArray param1, jint param2, jfloatArray param3, jfloatArray param4, jlong param5, jint param6, jshortArray param7, jint param8, jboolean param9) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    Java_org_lwjgl_system_JNI_invokePPPPPV__JIJIJJJIJIZ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4, param5, param6, (intptr_t)paramArray7, param8, param9);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPPPV__JI_3SI_3F_3FJI_3SIZ(jlong __functionAddress, jint param0, jint length1, jshort* param1, jint param2, jint length3, jfloat* param3, jint length4, jfloat* param4, jlong param5, jint param6, jint length7, jshort* param7, jint param8, jboolean param9) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length7)
    Java_org_lwjgl_system_JNI_invokePPPPPV__JIJIJJJIJIZ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4, param5, param6, (intptr_t)param7, param8, param9);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_invokePPV__JJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPV__JJII_3I(jlong __functionAddress, jlong param0, jint param1, jint param2, jint length3, jint* param3) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_invokePPV__JJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JJIJ_3IJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jintArray param3, jlong param4, jlong param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_invokePPPPPV__JJIJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, param4, param5);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPPPV__JJIJ_3IJJ(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint length3, jint* param3, jlong param4, jlong param5) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_invokePPPPPV__JJIJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, param4, param5);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJS_3DS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jshort param1, jdoubleArray param2, jshort param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_invokePPV__JJSJS(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPV__JJS_3DS(jlong __functionAddress, jlong param0, jshort param1, jint length2, jdouble* param2, jshort param3) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_invokePPV__JJSJS(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJS_3FS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jshort param1, jfloatArray param2, jshort param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_invokePPV__JJSJS(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPV__JJS_3FS(jlong __functionAddress, jlong param0, jshort param1, jint length2, jfloat* param2, jshort param3) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_invokePPV__JJSJS(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJS_3IS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jshort param1, jintArray param2, jshort param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_invokePPV__JJSJS(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPV__JJS_3IS(jlong __functionAddress, jlong param0, jshort param1, jint length2, jint* param2, jshort param3) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_invokePPV__JJSJS(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJS_3JS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jshort param1, jlongArray param2, jshort param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_invokePPV__JJSJS(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPV__JJS_3JS(jlong __functionAddress, jlong param0, jshort param1, jint length2, jlong* param2, jshort param3) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_invokePPV__JJSJS(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJS_3SS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jshort param1, jshortArray param2, jshort param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_invokePPV__JJSJS(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPV__JJS_3SS(jlong __functionAddress, jlong param0, jshort param1, jint length2, jshort* param2, jshort param3) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_invokePPV__JJSJS(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJ_3D_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jdoubleArray param1, jdoubleArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_invokePPPV__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__JJ_3D_3D(jlong __functionAddress, jlong param0, jint length1, jdouble* param1, jint length2, jdouble* param2) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_invokePPPV__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJ_3FI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jfloatArray param1, jint param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_invokePPV__JJJI(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPV__JJ_3FI(jlong __functionAddress, jlong param0, jint length1, jfloat* param1, jint param2) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_invokePPV__JJJI(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJ_3F_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jfloatArray param1, jfloatArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_invokePPPV__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__JJ_3F_3F(jlong __functionAddress, jlong param0, jint length1, jfloat* param1, jint length2, jfloat* param2) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_invokePPPV__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJ_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jint param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_invokePPV__JJJI(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPV__JJ_3II(jlong __functionAddress, jlong param0, jint length1, jint* param1, jint param2) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_invokePPV__JJJI(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jintArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_invokePPPV__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__JJ_3I_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1, jint length2, jint* param2) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_invokePPPV__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JJ_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jintArray param2, jintArray param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_invokePPPPPV__JJJJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPPPV__JJ_3I_3I_3I_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1, jint length2, jint* param2, jint length3, jint* param3, jint length4, jint* param4) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_invokePPPPPV__JJJJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJ_3SI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jshortArray param1, jint param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_invokePPV__JJJI(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPV__JJ_3SI(jlong __functionAddress, jlong param0, jint length1, jshort* param1, jint param2) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_invokePPV__JJJI(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JSS_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jshort param1, jshortArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_invokePV__JSSJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JSS_3S(jlong __functionAddress, jshort param0, jshort param1, jint length2, jshort* param2) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_invokePV__JSSJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JS_3DS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jdoubleArray param1, jshort param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_invokePV__JSJS(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JS_3DS(jlong __functionAddress, jshort param0, jint length1, jdouble* param1, jshort param2) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_invokePV__JSJS(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JS_3FS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jfloatArray param1, jshort param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_invokePV__JSJS(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JS_3FS(jlong __functionAddress, jshort param0, jint length1, jfloat* param1, jshort param2) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_invokePV__JSJS(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JS_3F_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jfloatArray param1, jfloatArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_invokePPV__JSJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPV__JS_3F_3F(jlong __functionAddress, jshort param0, jint length1, jfloat* param1, jint length2, jfloat* param2) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_invokePPV__JSJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JS_3F_3FB_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jfloatArray param1, jfloatArray param2, jbyte param3, jfloatArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_invokePPPV__JSJJBJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__JS_3F_3FB_3F(jlong __functionAddress, jshort param0, jint length1, jfloat* param1, jint length2, jfloat* param2, jbyte param3, jint length4, jfloat* param4) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_invokePPPV__JSJJBJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JS_3IS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jintArray param1, jshort param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_invokePV__JSJS(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JS_3IS(jlong __functionAddress, jshort param0, jint length1, jint* param1, jshort param2) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_invokePV__JSJS(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JS_3JS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jlongArray param1, jshort param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_invokePV__JSJS(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JS_3JS(jlong __functionAddress, jshort param0, jint length1, jlong* param1, jshort param2) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_invokePV__JSJS(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JS_3SS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jshortArray param1, jshort param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_invokePV__JSJS(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JS_3SS(jlong __functionAddress, jshort param0, jint length1, jshort* param1, jshort param2) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_invokePV__JSJS(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__J_3FIJJI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jfloatArray param0, jint param1, jlong param2, jlong param3, jint param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    Java_org_lwjgl_system_JNI_invokePPPV__JJIJJI(NULL, NULL, __functionAddress, (intptr_t)paramArray0, param1, param2, param3, param4);
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__J_3FIJJI(jlong __functionAddress, jint length0, jfloat* param0, jint param1, jlong param2, jlong param3, jint param4) {
    UNUSED_PARAM(length0)
    Java_org_lwjgl_system_JNI_invokePPPV__JJIJJI(NULL, NULL, __functionAddress, (intptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__J_3FZIJJI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jfloatArray param0, jboolean param1, jint param2, jlong param3, jlong param4, jint param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    Java_org_lwjgl_system_JNI_invokePPPV__JJZIJJI(NULL, NULL, __functionAddress, (intptr_t)paramArray0, param1, param2, param3, param4, param5);
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__J_3FZIJJI(jlong __functionAddress, jint length0, jfloat* param0, jboolean param1, jint param2, jlong param3, jlong param4, jint param5) {
    UNUSED_PARAM(length0)
    Java_org_lwjgl_system_JNI_invokePPPV__JJZIJJI(NULL, NULL, __functionAddress, (intptr_t)param0, param1, param2, param3, param4, param5);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__J_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0, jintArray param1, jintArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_invokePPPV__JJJJ(NULL, NULL, __functionAddress, (intptr_t)paramArray0, (intptr_t)paramArray1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__J_3I_3I_3I(jlong __functionAddress, jint length0, jint* param0, jint length1, jint* param1, jint length2, jint* param2) {
    UNUSED_PARAM(length0)
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_invokePPPV__JJJJ(NULL, NULL, __functionAddress, (intptr_t)param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPZ__JJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    jboolean __result = Java_org_lwjgl_system_JNI_invokePPZ__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPZ__JJ_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1) {
    UNUSED_PARAM(length1)
    return Java_org_lwjgl_system_JNI_invokePPZ__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jfloatArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPI__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPI__JIIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jfloat* param4) {
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPI__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JIIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPI__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPI__JIIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jint* param4) {
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPI__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPI__JIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPI__JIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jint* param3) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPI__JIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPI__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPI__JII_3I(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2) {
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPI__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JII_3I_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jintArray param3, jintArray param4, jintArray param5, jlong param6) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPI__JIIJJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4, (intptr_t)paramArray5, param6);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPI__JII_3I_3I_3I_3IJ(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint length3, jint* param3, jint length4, jint* param4, jint length5, jint* param5, jlong param6) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPPPPPI__JIIJJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, param6);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPI__JII_3I_3I_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jintArray param3, jintArray param4, jintArray param5, jintArray param6, jlong param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPPI__JIIJJJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4, (intptr_t)paramArray5, (intptr_t)paramArray6, param7);
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPI__JII_3I_3I_3I_3I_3IJ(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint length3, jint* param3, jint length4, jint* param4, jint length5, jint* param5, jint length6, jint* param6, jlong param7) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    UNUSED_PARAM(length6)
    return Java_org_lwjgl_system_JNI_callPPPPPPI__JIIJJJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, param7);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jintArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPI__JIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPI__JIJ_3I(jlong __functionAddress, jint param0, jlong param1, jint length2, jint* param2) {
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPPI__JIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPI__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPI__JI_3I(jlong __functionAddress, jint param0, jint length1, jint* param1) {
    UNUSED_PARAM(length1)
    return Java_org_lwjgl_system_JNI_callPI__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JI_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jint param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPI__JIJI(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPI__JI_3II(jlong __functionAddress, jint param0, jint length1, jint* param1, jint param2) {
    UNUSED_PARAM(length1)
    return Java_org_lwjgl_system_JNI_callPI__JIJI(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJIII_3I_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jint param3, jintArray param4, jfloatArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJIII_3I_3F(jlong __functionAddress, jlong param0, jint param1, jint param2, jint param3, jint length4, jint* param4, jint length5, jfloat* param5) {
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPPPI__JJIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJIII_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jint param3, jintArray param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJIII_3I_3I(jlong __functionAddress, jlong param0, jint param1, jint param2, jint param3, jint length4, jint* param4, jint length5, jint* param5) {
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPPPI__JJIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJIIJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jlong param3, jintArray param4, jlong param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, param5);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJIIJ_3IJ(jlong __functionAddress, jlong param0, jint param1, jint param2, jlong param3, jint length4, jint* param4, jlong param5) {
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPPPPI__JJIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, param5);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJIIJ_3JJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jlong param3, jlongArray param4, jlong param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, param5);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJIIJ_3JJ(jlong __functionAddress, jlong param0, jint param1, jint param2, jlong param3, jint length4, jlong* param4, jlong param5) {
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPPPPI__JJIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, param5);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPI__JJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPI__JJII_3I(jlong __functionAddress, jlong param0, jint param1, jint param2, jint length3, jint* param3) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPI__JJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJII_3J_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jlongArray param3, jintArray param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJII_3J_3I_3I(jlong __functionAddress, jlong param0, jint param1, jint param2, jint length3, jlong* param3, jint length4, jint* param4, jint length5, jint* param5) {
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPPPPI__JJIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJIJIIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jint param3, jint param4, jlong param5, jintArray param6) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJIJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJIJIIJ_3I(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint param3, jint param4, jlong param5, jint length6, jint* param6) {
    UNUSED_PARAM(length6)
    return Java_org_lwjgl_system_JNI_callPPPPI__JJIJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJIJJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jlong param3, jlongArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJIJJ_3J(jlong __functionAddress, jlong param0, jint param1, jlong param2, jlong param3, jint length4, jlong* param4) {
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPPPPI__JJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJIJ_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jdoubleArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJIJ_3D(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint length3, jdouble* param3) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJIJ_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jfloatArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJIJ_3F(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint length3, jfloat* param3) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPI__JJIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPJPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPI__JJIJ_3I(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint length3, jint* param3) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPJPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJIJ_3I(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint length3, jint* param3) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJIJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jintArray param3, jlong param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, param4);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJIJ_3IJ(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint length3, jint* param3, jlong param4) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPPPI__JJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJIJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jlongArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJIJ_3J(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint length3, jlong* param3) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJIJ_3JJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jlongArray param3, jlong param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, param4);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJIJ_3JJ(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint length3, jlong* param3, jlong param4) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPPPI__JJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJIJ_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jshortArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJIJ_3S(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint length3, jshort* param3) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jintArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPI__JJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPI__JJI_3I(jlong __functionAddress, jlong param0, jint param1, jint length2, jint* param2) {
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPPI__JJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJI_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jintArray param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJI_3I_3I(jlong __functionAddress, jlong param0, jint param1, jint length2, jint* param2, jint length3, jint* param3) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJI_3I_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jintArray param2, jlongArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJI_3I_3J(jlong __functionAddress, jlong param0, jint param1, jint length2, jint* param2, jint length3, jlong* param3) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJI_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlongArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPI__JJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPI__JJI_3J(jlong __functionAddress, jlong param0, jint param1, jint length2, jlong* param2) {
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPPI__JJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPJI__JJI_3JIJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlongArray param2, jint param3, jlong param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPJI__JJIJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, param4);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPJI__JJI_3JIJ(jlong __functionAddress, jlong param0, jint param1, jint length2, jlong* param2, jint param3, jlong param4) {
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPPJI__JJIJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJJIIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPJPPI__JJJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPI__JJJIIJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jint length5, jint* param5) {
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPJPPI__JJJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPJI__JJJIIJ_3IJI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jintArray param5, jlong param6, jint param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPJPPJI__JJJIIJJJI(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5, param6, param7);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPJI__JJJIIJ_3IJI(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jint length5, jint* param5, jlong param6, jint param7) {
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPJPPJI__JJJIIJJJI(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5, param6, param7);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPJI__JJJIIJ_3JJI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlongArray param5, jlong param6, jint param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPJPPJI__JJJIIJJJI(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5, param6, param7);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPJI__JJJIIJ_3JJI(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jint length5, jlong* param5, jlong param6, jint param7) {
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPJPPJI__JJJIIJJJI(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5, param6, param7);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJ_3DIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jdoubleArray param10, jint param11, jlong param12, jlong param13) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param10, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)paramArray10, param11, param12, param13);
    if (param10 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param10, paramArray10, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJ_3DIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jint length10, jdouble* param10, jint param11, jlong param12, jlong param13) {
    UNUSED_PARAM(length10)
    return Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)param10, param11, param12, param13);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJ_3FIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jfloatArray param10, jint param11, jlong param12, jlong param13) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param10, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)paramArray10, param11, param12, param13);
    if (param10 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param10, paramArray10, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJ_3FIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jint length10, jfloat* param10, jint param11, jlong param12, jlong param13) {
    UNUSED_PARAM(length10)
    return Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)param10, param11, param12, param13);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJ_3IIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jintArray param10, jint param11, jlong param12, jlong param13) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param10, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)paramArray10, param11, param12, param13);
    if (param10 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param10, paramArray10, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJ_3IIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jint length10, jint* param10, jint param11, jlong param12, jlong param13) {
    UNUSED_PARAM(length10)
    return Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)param10, param11, param12, param13);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJ_3SIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jshortArray param10, jint param11, jlong param12, jlong param13) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param10, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)paramArray10, param11, param12, param13);
    if (param10 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param10, paramArray10, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJ_3SIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jint length10, jshort* param10, jint param11, jlong param12, jlong param13) {
    UNUSED_PARAM(length10)
    return Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)param10, param11, param12, param13);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJ_3DIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jdoubleArray param7, jint param8, jlong param9, jlong param10) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7, param8, param9, param10);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJ_3DIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jint length7, jdouble* param7, jint param8, jlong param9, jlong param10) {
    UNUSED_PARAM(length7)
    return Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7, param8, param9, param10);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJ_3FIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jfloatArray param7, jint param8, jlong param9, jlong param10) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7, param8, param9, param10);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJ_3FIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jint length7, jfloat* param7, jint param8, jlong param9, jlong param10) {
    UNUSED_PARAM(length7)
    return Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7, param8, param9, param10);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJ_3IIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jintArray param7, jint param8, jlong param9, jlong param10) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7, param8, param9, param10);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJ_3IIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jint length7, jint* param7, jint param8, jlong param9, jlong param10) {
    UNUSED_PARAM(length7)
    return Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7, param8, param9, param10);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJ_3SIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jshortArray param7, jint param8, jlong param9, jlong param10) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7, param8, param9, param10);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJ_3SIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jint length7, jshort* param7, jint param8, jlong param9, jlong param10) {
    UNUSED_PARAM(length7)
    return Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7, param8, param9, param10);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJ_3DIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jdoubleArray param5, jint param6, jlong param7, jlong param8) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5, param6, param7, param8);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJ_3DIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jint length5, jdouble* param5, jint param6, jlong param7, jlong param8) {
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5, param6, param7, param8);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJ_3FIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jfloatArray param5, jint param6, jlong param7, jlong param8) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5, param6, param7, param8);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJ_3FIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jint length5, jfloat* param5, jint param6, jlong param7, jlong param8) {
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5, param6, param7, param8);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJ_3IIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jintArray param5, jint param6, jlong param7, jlong param8) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5, param6, param7, param8);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJ_3IIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jint length5, jint* param5, jint param6, jlong param7, jlong param8) {
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5, param6, param7, param8);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPPI__JJJIJJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlongArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPJPPPI__JJJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPI__JJJIJJ_3J(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jint length5, jlong* param5) {
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPJPPPI__JJJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJ_3SIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jshortArray param5, jint param6, jlong param7, jlong param8) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5, param6, param7, param8);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJ_3SIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jint length5, jshort* param5, jint param6, jlong param7, jlong param8) {
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5, param6, param7, param8);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJJIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPJPPI__JJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPI__JJJIJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jint length4, jint* param4) {
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPJPPI__JJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJJIJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jint length4, jint* param4) {
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPPPPI__JJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJJIJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jintArray param4, jlong param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPI__JJJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, param5);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPI__JJJIJ_3IJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jint length4, jint* param4, jlong param5) {
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPPPPPI__JJJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, param5);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJJIJ_3JJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlongArray param4, jlong param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPI__JJJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, param5);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPI__JJJIJ_3JJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jint length4, jlong* param4, jlong param5) {
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPPPPPI__JJJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, param5);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJJI_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint length3, jint* param3) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPPI__JJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJJI_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jintArray param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPJPPI__JJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPI__JJJI_3I_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint length3, jint* param3, jint length4, jint* param4) {
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPJPPI__JJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJJI_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlongArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJJI_3J(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint length3, jlong* param3) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPPI__JJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPI__JJJI_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlongArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPJPI__JJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPI__JJJI_3J(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint length3, jlong* param3) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPJPI__JJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJJJI_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint param3, jint length4, jint* param4) {
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPPPPI__JJJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJJJIJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jintArray param6, jlong param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJJJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6, param7);
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPI__JJJJJIJ_3IJ(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jint length6, jint* param6, jlong param7) {
    UNUSED_PARAM(length6)
    return Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJJJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6, param7);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJJJJPI__JJJJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPJJJJPI__JJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJJJJPI__JJJJJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint length5, jint* param5) {
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPJJJJPI__JJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPPI__JJJJJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlongArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPJPPPI__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPI__JJJJJ_3J(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jlong* param4) {
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPJPPPI__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlongArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJJJ_3J(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint length3, jlong* param3) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJ_3FJJIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jfloatArray param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, param4, param5, param6, param7);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPI__JJJ_3FJJIJJ(jlong __functionAddress, jlong param0, jlong param1, jint length2, jfloat* param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7) {
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, param4, param5, param6, param7);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2) {
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPPPI__JJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPI__JJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPJPI__JJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPI__JJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2) {
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPJPI__JJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJJ_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jint param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJJ_3II(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jint param3) {
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPPPI__JJJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jlong param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJJ_3IJ(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jlong param3) {
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPPPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jlong param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPJPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPI__JJJ_3IJ(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jlong param3) {
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPJPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJ_3IJJIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, param4, param5, param6, param7);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPI__JJJ_3IJJIJJ(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7) {
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, param4, param5, param6, param7);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJJ_3I_3I(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jint length3, jint* param3) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPJPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPI__JJJ_3I_3I(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jint length3, jint* param3) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPJPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJJ_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jintArray param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPI__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPI__JJJ_3I_3I_3I(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jint length3, jint* param3, jint length4, jint* param4) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPPPPPI__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJJ_3I_3I_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jintArray param3, jlongArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPI__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPI__JJJ_3I_3I_3J(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jint length3, jint* param3, jint length4, jlong* param4) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPPPPPI__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJJ_3I_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jlongArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPJPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPI__JJJ_3I_3J(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jint length3, jlong* param3) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPJPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlongArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJJ_3J(jlong __functionAddress, jlong param0, jlong param1, jint length2, jlong* param2) {
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPPPI__JJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPI__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPI__JJ_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1) {
    UNUSED_PARAM(length1)
    return Java_org_lwjgl_system_JNI_callPPI__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jlong param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJ_3IJ(jlong __functionAddress, jlong param0, jint length1, jint* param1, jlong param2) {
    UNUSED_PARAM(length1)
    return Java_org_lwjgl_system_JNI_callPPPI__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJ_3IJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jlong param2, jint param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJJJIJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJ_3IJI_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1, jlong param2, jint param3, jint length4, jint* param4) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPPPPI__JJJJIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJ_3I_3FI_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jfloatArray param2, jint param3, jintArray param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPI__JJJJIJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPI__JJ_3I_3FI_3I_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1, jint length2, jfloat* param2, jint param3, jint length4, jint* param4, jint length5, jint* param5) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPPPPPI__JJJJIJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4, (intptr_t)param5);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jintArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJ_3I_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1, jint length2, jint* param2) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPPPI__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJ_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jintArray param2, jintArray param3, jlong param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPI__JJJJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2, (intptr_t)paramArray3, param4);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPI__JJ_3I_3I_3IJ(jlong __functionAddress, jlong param0, jint length1, jint* param1, jint length2, jint* param2, jint length3, jint* param3, jlong param4) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPPPPI__JJJJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPI__JJ_3I_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jintArray param2, jintArray param3, jintArray param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPPPI__JJJJJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPI__JJ_3I_3I_3I_3I_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1, jint length2, jint* param2, jint length3, jint* param3, jint length4, jint* param4, jint length5, jint* param5) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPPPPPPI__JJJJJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5);
}
#endif
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlongArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPI__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPI__JJ_3J(jlong __functionAddress, jlong param0, jint length1, jlong* param1) {
    UNUSED_PARAM(length1)
    return Java_org_lwjgl_system_JNI_callPPI__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJ_3JIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlongArray param1, jint param2, jlong param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJJIJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJ_3JIJ_3I(jlong __functionAddress, jlong param0, jint length1, jlong* param1, jint param2, jlong param3, jint length4, jint* param4) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPPPPI__JJJIJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJ_3J_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlongArray param1, jlongArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJ_3J_3J(jlong __functionAddress, jlong param0, jint length1, jlong* param1, jint length2, jlong* param2) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPPPI__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__J_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPI__JJ(NULL, NULL, __functionAddress, (intptr_t)paramArray0);
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPI__J_3I(jlong __functionAddress, jint length0, jint* param0) {
    UNUSED_PARAM(length0)
    return Java_org_lwjgl_system_JNI_callPI__JJ(NULL, NULL, __functionAddress, (intptr_t)param0);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__J_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0, jint param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPI__JJI(NULL, NULL, __functionAddress, (intptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPI__J_3II(jlong __functionAddress, jint length0, jint* param0, jint param1) {
    UNUSED_PARAM(length0)
    return Java_org_lwjgl_system_JNI_callPI__JJI(NULL, NULL, __functionAddress, (intptr_t)param0, param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__J_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0, jlong param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPI__JJJ(NULL, NULL, __functionAddress, (intptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPI__J_3IJ(jlong __functionAddress, jint length0, jint* param0, jlong param1) {
    UNUSED_PARAM(length0)
    return Java_org_lwjgl_system_JNI_callPPI__JJJ(NULL, NULL, __functionAddress, (intptr_t)param0, param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__J_3IJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0, jlong param1, jintArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJJJ(NULL, NULL, __functionAddress, (intptr_t)paramArray0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__J_3IJ_3I(jlong __functionAddress, jint length0, jint* param0, jlong param1, jint length2, jint* param2) {
    UNUSED_PARAM(length0)
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPPPI__JJJJ(NULL, NULL, __functionAddress, (intptr_t)param0, param1, (intptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__JIII_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jintArray param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPP__JIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPP__JIII_3I_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jint* param3, jint length4, jint* param4) {
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPPP__JIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__JIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jintArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPP__JIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPP__JIJ_3I(jlong __functionAddress, jint param0, jlong param1, jint length2, jint* param2) {
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPPP__JIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__JJIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jint param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPP__JJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPP__JJIII_3I(jlong __functionAddress, jlong param0, jint param1, jint param2, jint param3, jint length4, jint* param4) {
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPPP__JJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPPP__JJIJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPPPPP__JJIJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPP__JJIJJJ_3I(jlong __functionAddress, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jint length5, jint* param5) {
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPPPPPP__JJIJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPPPP__JJIJJJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jintArray param5, jintArray param6) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPPPPPP__JJIJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5, (intptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPP__JJIJJJ_3I_3I(jlong __functionAddress, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jint length5, jint* param5, jint length6, jint* param6) {
    UNUSED_PARAM(length5)
    UNUSED_PARAM(length6)
    return Java_org_lwjgl_system_JNI_callPPPPPPP__JJIJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5, (intptr_t)param6);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJIJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jlong param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPPPP__JJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPP__JJIJJ_3I(jlong __functionAddress, jlong param0, jint param1, jlong param2, jlong param3, jint length4, jint* param4) {
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPPPPP__JJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__JJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jintArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPP__JJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPP__JJI_3I(jlong __functionAddress, jlong param0, jint param1, jint length2, jint* param2) {
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPPP__JJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JJI_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jintArray param2, jlong param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPPP__JJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPP__JJI_3IJ(jlong __functionAddress, jlong param0, jint param1, jint length2, jint* param2, jlong param3) {
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPPPP__JJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPP__JJJIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPP__JJJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPP__JJJIII_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint length5, jint* param5) {
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPJPP__JJJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JJJII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPPP__JJJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPP__JJJII_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint length4, jint* param4) {
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPPPP__JJJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPP__JJJII_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jintArray param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPP__JJJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPP__JJJII_3I_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint length4, jint* param4, jint length5, jint* param5) {
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPJPPP__JJJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPPPP__JJJIJJJIJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jint param6, jlong param7, jlong param8, jintArray param9) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPJPPPPPP__JJJIJJJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPJPPPPPP__JJJIJJJIJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jint param6, jlong param7, jlong param8, jint length9, jint* param9) {
    UNUSED_PARAM(length9)
    return Java_org_lwjgl_system_JNI_callPPJPPPPPP__JJJIJJJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPPPPPP__JJJIJJJJJIJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jint param8, jlong param9, jlong param10, jintArray param11) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray11 = param11 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param11, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPJPPPPPPPP__JJJIJJJJJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)paramArray11);
    if (param11 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param11, paramArray11, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPJPPPPPPPP__JJJIJJJJJIJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jint param8, jlong param9, jlong param10, jint length11, jint* param11) {
    UNUSED_PARAM(length11)
    return Java_org_lwjgl_system_JNI_callPPJPPPPPPPP__JJJIJJJJJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)param11);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJJIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPPPP__JJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPP__JJJIJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jint length4, jint* param4) {
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPPPPP__JJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPP__JJJIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPP__JJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPP__JJJIJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jint length4, jint* param4) {
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPJPPP__JJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JJJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPPP__JJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPP__JJJI_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint length3, jint* param3) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPPP__JJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPP__JJJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPP__JJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPP__JJJI_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint length3, jint* param3) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPJPP__JJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJJJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPPPP__JJJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPP__JJJJI_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint param3, jint length4, jint* param4) {
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPPPPP__JJJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jintArray param9) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jint length9, jint* param9) {
    UNUSED_PARAM(length9)
    return Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJ_3F_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jfloatArray param8, jintArray param9) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)paramArray8, (intptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0); }
    if (param8 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJ_3F_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jint length8, jfloat* param8, jint length9, jint* param9) {
    UNUSED_PARAM(length8)
    UNUSED_PARAM(length9)
    return Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8, (intptr_t)param9);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jintArray param8, jintArray param9) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)paramArray8, (intptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0); }
    if (param8 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJ_3I_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jint length8, jint* param8, jint length9, jint* param9) {
    UNUSED_PARAM(length8)
    UNUSED_PARAM(length9)
    return Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8, (intptr_t)param9);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJ_3S_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jshortArray param8, jintArray param9) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)paramArray8, (intptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0); }
    if (param8 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJ_3S_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jint length8, jshort* param8, jint length9, jint* param9) {
    UNUSED_PARAM(length8)
    UNUSED_PARAM(length9)
    return Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8, (intptr_t)param9);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jintArray param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jint length7, jint* param7) {
    UNUSED_PARAM(length7)
    return Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJ_3F_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jfloatArray param6, jintArray param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6, (intptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJ_3F_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jint length6, jfloat* param6, jint length7, jint* param7) {
    UNUSED_PARAM(length6)
    UNUSED_PARAM(length7)
    return Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6, (intptr_t)param7);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jintArray param6, jintArray param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6, (intptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJ_3I_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jint length6, jint* param6, jint length7, jint* param7) {
    UNUSED_PARAM(length6)
    UNUSED_PARAM(length7)
    return Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6, (intptr_t)param7);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJ_3S_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jshortArray param6, jintArray param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6, (intptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJ_3S_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jint length6, jshort* param6, jint length7, jint* param7) {
    UNUSED_PARAM(length6)
    UNUSED_PARAM(length7)
    return Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6, (intptr_t)param7);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPJPPP__JJJJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPPJPPP__JJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPJPPP__JJJJJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint length5, jint* param5) {
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPPPJPPP__JJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint length5, jint* param5) {
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJ_3F_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jfloatArray param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPP__JJJJJ_3F_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jfloat* param4, jint length5, jint* param5) {
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPP__JJJJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jint* param4) {
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jintArray param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPP__JJJJJ_3I_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jint* param4, jint length5, jint* param5) {
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJ_3S_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jshortArray param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPP__JJJJJ_3S_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jshort* param4, jint length5, jint* param5) {
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    return Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5);
}
#endif
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPP__JJJJ_3D_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jdoubleArray param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPP__JJJJ_3D_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint length3, jdouble* param3, jint length4, jint* param4) {
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPP__JJJJ_3F_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jfloatArray param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPP__JJJJ_3F_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint length3, jfloat* param3, jint length4, jint* param4) {
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPPPP__JJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPP__JJJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint length3, jint* param3) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPPPP__JJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPP__JJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPJPP__JJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPJPP__JJJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint length3, jint* param3) {
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPJPP__JJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPP__JJJJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jintArray param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPP__JJJJ_3I_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint length3, jint* param3, jint length4, jint* param4) {
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPP__JJJJ_3S_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jshortArray param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPP__JJJJ_3S_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint length3, jshort* param3, jint length4, jint* param4) {
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPPP__JJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPP__JJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2) {
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPPPP__JJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPP__JJJ_3II_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jint param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPJPPP__JJJJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPP__JJJ_3II_3I(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jint param3, jint length4, jint* param4) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length4)
    return Java_org_lwjgl_system_JNI_callPJPPP__JJJJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJJ_3J_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlongArray param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPPPP__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPP__JJJ_3J_3I(jlong __functionAddress, jlong param0, jlong param1, jint length2, jlong* param2, jint length3, jint* param3) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    return Java_org_lwjgl_system_JNI_callPPPPP__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__JJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPP__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPP__JJ_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1) {
    UNUSED_PARAM(length1)
    return Java_org_lwjgl_system_JNI_callPPP__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jintArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPPPP__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPP__JJ_3I_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1, jint length2, jint* param2) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    return Java_org_lwjgl_system_JNI_callPPPP__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPP__J_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    jlong __result = Java_org_lwjgl_system_JNI_callPP__JJ(NULL, NULL, __functionAddress, (intptr_t)paramArray0);
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPP__J_3I(jlong __functionAddress, jint length0, jint* param0) {
    UNUSED_PARAM(length0)
    return Java_org_lwjgl_system_JNI_callPP__JJ(NULL, NULL, __functionAddress, (intptr_t)param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIDDIIDDII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jdouble param1, jdouble param2, jint param3, jint param4, jdouble param5, jdouble param6, jint param7, jint param8, jdoubleArray param9) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
    Java_org_lwjgl_system_JNI_callPV__JIDDIIDDIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIDDIIDDII_3D(jlong __functionAddress, jint param0, jdouble param1, jdouble param2, jint param3, jint param4, jdouble param5, jdouble param6, jint param7, jint param8, jint length9, jdouble* param9) {
    UNUSED_PARAM(length9)
    Java_org_lwjgl_system_JNI_callPV__JIDDIIDDIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIDDII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jdouble param1, jdouble param2, jint param3, jint param4, jdoubleArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPV__JIDDIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIDDII_3D(jlong __functionAddress, jint param0, jdouble param1, jdouble param2, jint param3, jint param4, jint length5, jdouble* param5) {
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPV__JIDDIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIFFIIFFII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jfloat param1, jfloat param2, jint param3, jint param4, jfloat param5, jfloat param6, jint param7, jint param8, jfloatArray param9) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
    Java_org_lwjgl_system_JNI_callPV__JIFFIIFFIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIFFIIFFII_3F(jlong __functionAddress, jint param0, jfloat param1, jfloat param2, jint param3, jint param4, jfloat param5, jfloat param6, jint param7, jint param8, jint length9, jfloat* param9) {
    UNUSED_PARAM(length9)
    Java_org_lwjgl_system_JNI_callPV__JIFFIIFFIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIFFII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jfloat param1, jfloat param2, jint param3, jint param4, jfloatArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPV__JIFFIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIFFII_3F(jlong __functionAddress, jint param0, jfloat param1, jfloat param2, jint param3, jint param4, jint length5, jfloat* param5) {
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPV__JIFFIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jdoubleArray param11) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray11 = param11 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param11, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)paramArray11);
    if (param11 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param11, paramArray11, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIIIII_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jint length11, jdouble* param11) {
    UNUSED_PARAM(length11)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)param11);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jfloatArray param11) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray11 = param11 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param11, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)paramArray11);
    if (param11 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param11, paramArray11, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIIIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jint length11, jfloat* param11) {
    UNUSED_PARAM(length11)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)param11);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jintArray param11) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray11 = param11 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param11, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)paramArray11);
    if (param11 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param11, paramArray11, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIIIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jint length11, jint* param11) {
    UNUSED_PARAM(length11)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)param11);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jshortArray param11) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray11 = param11 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param11, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)paramArray11);
    if (param11 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param11, paramArray11, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIIIII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jint length11, jshort* param11) {
    UNUSED_PARAM(length11)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)param11);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jdoubleArray param10) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param10, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)paramArray10);
    if (param10 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param10, paramArray10, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIIII_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint length10, jdouble* param10) {
    UNUSED_PARAM(length10)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)param10);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jfloatArray param10) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param10, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)paramArray10);
    if (param10 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param10, paramArray10, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint length10, jfloat* param10) {
    UNUSED_PARAM(length10)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)param10);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jintArray param10) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param10, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)paramArray10);
    if (param10 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param10, paramArray10, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint length10, jint* param10) {
    UNUSED_PARAM(length10)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)param10);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jshortArray param10) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param10, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)paramArray10);
    if (param10 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param10, paramArray10, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIIII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint length10, jshort* param10) {
    UNUSED_PARAM(length10)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)param10);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jdoubleArray param9) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIII_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint length9, jdouble* param9) {
    UNUSED_PARAM(length9)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jfloatArray param9) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint length9, jfloat* param9) {
    UNUSED_PARAM(length9)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jintArray param9) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint length9, jint* param9) {
    UNUSED_PARAM(length9)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jshortArray param9) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint length9, jshort* param9) {
    UNUSED_PARAM(length9)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jdoubleArray param8) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)paramArray8);
    if (param8 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIII_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint length8, jdouble* param8) {
    UNUSED_PARAM(length8)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jfloatArray param8) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)paramArray8);
    if (param8 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint length8, jfloat* param8) {
    UNUSED_PARAM(length8)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jintArray param8) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)paramArray8);
    if (param8 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint length8, jint* param8) {
    UNUSED_PARAM(length8)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jshortArray param8) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)paramArray8);
    if (param8 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint length8, jshort* param8) {
    UNUSED_PARAM(length8)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jdoubleArray param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIII_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint length7, jdouble* param7) {
    UNUSED_PARAM(length7)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jfloatArray param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint length7, jfloat* param7) {
    UNUSED_PARAM(length7)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jintArray param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint length7, jint* param7) {
    UNUSED_PARAM(length7)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jshortArray param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint length7, jshort* param7) {
    UNUSED_PARAM(length7)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jdoubleArray param6) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIII_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint length6, jdouble* param6) {
    UNUSED_PARAM(length6)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jfloatArray param6) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint length6, jfloat* param6) {
    UNUSED_PARAM(length6)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jintArray param6) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint length6, jint* param6) {
    UNUSED_PARAM(length6)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jshortArray param6) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint length6, jshort* param6) {
    UNUSED_PARAM(length6)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jdoubleArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIII_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint length5, jdouble* param5) {
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jfloatArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint length5, jfloat* param5) {
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint length5, jint* param5) {
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jshortArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint length5, jshort* param5) {
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPV__JIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIIIJII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jlong param4, jint param5, jint param6, jfloatArray param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIIIJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIIIJII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jlong param4, jint param5, jint param6, jint length7, jfloat* param7) {
    UNUSED_PARAM(length7)
    Java_org_lwjgl_system_JNI_callPPV__JIIIIJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIIIJII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jlong param4, jint param5, jint param6, jshortArray param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIIIJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIIIJII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jlong param4, jint param5, jint param6, jint length7, jshort* param7) {
    UNUSED_PARAM(length7)
    Java_org_lwjgl_system_JNI_callPPV__JIIIIJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jdoubleArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIII_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jdouble* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPV__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jfloatArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jfloat* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPV__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jint* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPV__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIII_3II_3I_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jintArray param4, jint param5, jintArray param6, jfloatArray param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIIIIJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, param5, (intptr_t)paramArray6, (intptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIIII_3II_3I_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jint* param4, jint param5, jint length6, jint* param6, jint length7, jfloat* param7) {
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length6)
    UNUSED_PARAM(length7)
    Java_org_lwjgl_system_JNI_callPPPV__JIIIIJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, param5, (intptr_t)param6, (intptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIII_3II_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jintArray param4, jint param5, jintArray param6, jintArray param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIIIIJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, param5, (intptr_t)paramArray6, (intptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIIII_3II_3I_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jint* param4, jint param5, jint length6, jint* param6, jint length7, jint* param7) {
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length6)
    UNUSED_PARAM(length7)
    Java_org_lwjgl_system_JNI_callPPPV__JIIIIJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, param5, (intptr_t)param6, (intptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIII_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jintArray param4, jlong param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, param5);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIII_3IJ(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jint* param4, jlong param5) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPPV__JIIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, param5);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIII_3IZ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jintArray param4, jboolean param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIJZ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, param5);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIII_3IZ(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jint* param4, jboolean param5) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPV__JIIIIJZ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIII_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jlongArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIII_3J(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jlong* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPV__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jshortArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jshort* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPV__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIIJIFFI_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jlong param3, jint param4, jfloat param5, jfloat param6, jint param7, jfloatArray param8) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIIJIFFIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)paramArray8);
    if (param8 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIIJIFFI_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jlong param3, jint param4, jfloat param5, jfloat param6, jint param7, jint length8, jfloat* param8) {
    UNUSED_PARAM(length8)
    Java_org_lwjgl_system_JNI_callPPV__JIIIJIFFIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIIJII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jlong param3, jint param4, jint param5, jfloatArray param6) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIIJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIIJII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jlong param3, jint param4, jint param5, jint length6, jfloat* param6) {
    UNUSED_PARAM(length6)
    Java_org_lwjgl_system_JNI_callPPV__JIIIJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPV__JIIIJIJ_3I_3I_3I_3I_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jlong param3, jint param4, jlong param5, jintArray param6, jintArray param7, jintArray param8, jintArray param9, jlongArray param10) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param10, 0);
    Java_org_lwjgl_system_JNI_callPPPPPPPV__JIIIJIJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6, (intptr_t)paramArray7, (intptr_t)paramArray8, (intptr_t)paramArray9, (intptr_t)paramArray10);
    if (param10 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param10, paramArray10, 0); }
    if (param9 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0); }
    if (param8 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0); }
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPV__JIIIJIJ_3I_3I_3I_3I_3J(jlong __functionAddress, jint param0, jint param1, jint param2, jlong param3, jint param4, jlong param5, jint length6, jint* param6, jint length7, jint* param7, jint length8, jint* param8, jint length9, jint* param9, jint length10, jlong* param10) {
    UNUSED_PARAM(length6)
    UNUSED_PARAM(length7)
    UNUSED_PARAM(length8)
    UNUSED_PARAM(length9)
    UNUSED_PARAM(length10)
    Java_org_lwjgl_system_JNI_callPPPPPPPV__JIIIJIJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6, (intptr_t)param7, (intptr_t)param8, (intptr_t)param9, (intptr_t)param10);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jlong param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIIJ_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jlong param3, jint length4, jint* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPPV__JIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIZI_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jint param4, jfloatArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIZIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIZI_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jint param4, jint length5, jfloat* param5) {
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPV__JIIIZIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIZI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jint param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIZIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIZI_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jint param4, jint length5, jint* param5) {
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPV__JIIIZIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIZI_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jint param4, jshortArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIZIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIZI_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jint param4, jint length5, jshort* param5) {
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPV__JIIIZIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIZ_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jdoubleArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIZJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIZ_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jint length4, jdouble* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPV__JIIIZJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIZ_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jfloatArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIZJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIZ_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jint length4, jfloat* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPV__JIIIZJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jdoubleArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIII_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jdouble* param3) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPV__JIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jfloatArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jfloat* param3) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPV__JIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jint* param3) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPV__JIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIII_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jintArray param3, jlong param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, param4);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIII_3IJ(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jint* param3, jlong param4) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPPV__JIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIII_3IJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jintArray param3, jlong param4, jlong param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, param4, param5);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIII_3IJJ(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jint* param3, jlong param4, jlong param5) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPPPV__JIIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, param4, param5);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIII_3IJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jintArray param3, jlong param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIII_3IJ_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jint* param3, jlong param4, jint length5, jint* param5) {
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPPPV__JIIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, param4, (intptr_t)param5);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIII_3IZ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jintArray param3, jboolean param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIJZ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, param4);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIII_3IZ(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jint* param3, jboolean param4) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPV__JIIIJZ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIII_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jintArray param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIII_3I_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jint* param3, jint length4, jint* param4) {
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPPV__JIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__JIII_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jintArray param3, jintArray param4, jintArray param5, jlong param6) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPPPPV__JIIIJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4, (intptr_t)paramArray5, param6);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPV__JIII_3I_3I_3IJ(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jint* param3, jint length4, jint* param4, jint length5, jint* param5, jlong param6) {
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPPPPV__JIIIJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, param6);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIII_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jlongArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIII_3J(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jlong* param3) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPV__JIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jshortArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jshort* param3) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPV__JIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIJIIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jint param7, jfloatArray param8) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIJIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)paramArray8);
    if (param8 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIJIIIII_3F(jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint length8, jfloat* param8) {
    UNUSED_PARAM(length8)
    Java_org_lwjgl_system_JNI_callPPV__JIIJIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIJIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jfloatArray param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIJIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIJIIII_3F(jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jint length7, jfloat* param7) {
    UNUSED_PARAM(length7)
    Java_org_lwjgl_system_JNI_callPPV__JIIJIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIJIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jfloatArray param6) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIJIII_3F(jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint length6, jfloat* param6) {
    UNUSED_PARAM(length6)
    Java_org_lwjgl_system_JNI_callPPV__JIIJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIJII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jfloatArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIJII_3F(jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jint length5, jfloat* param5) {
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPPV__JIIJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIJII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jshortArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIJII_3S(jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jint length5, jshort* param5) {
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPPV__JIIJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIJJII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jfloatArray param6) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIIJJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIIJJII_3F(jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jint length6, jfloat* param6) {
    UNUSED_PARAM(length6)
    Java_org_lwjgl_system_JNI_callPPPV__JIIJJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIJJII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jintArray param6) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIIJJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIIJJII_3I(jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jint length6, jint* param6) {
    UNUSED_PARAM(length6)
    Java_org_lwjgl_system_JNI_callPPPV__JIIJJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIJJII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jshortArray param6) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIIJJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIIJJII_3S(jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jint length6, jshort* param6) {
    UNUSED_PARAM(length6)
    Java_org_lwjgl_system_JNI_callPPPV__JIIJJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIJJ_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jdoubleArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIIJJ_3D(jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint length4, jdouble* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIJJ_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jfloatArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIIJJ_3F(jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint length4, jfloat* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIIJJ_3I(jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint length4, jint* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__JIIJJ_3I_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jintArray param4, jintArray param5, jint param6) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPPPPV__JIIJJJJI(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5, param6);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPV__JIIJJ_3I_3II(jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint length4, jint* param4, jint length5, jint* param5, jint param6) {
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPPPPV__JIIJJJJI(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5, param6);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIJJ_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jshortArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIIJJ_3S(jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint length4, jshort* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIJ_3I(jlong __functionAddress, jint param0, jint param1, jlong param2, jint length3, jint* param3) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPPV__JIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIJ_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jintArray param3, jint param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIJJI(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, param4);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIJ_3II(jlong __functionAddress, jint param0, jint param1, jlong param2, jint length3, jint* param3, jint param4) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPPV__JIIJJI(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPV__JIIJ_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jintArray param3, jintArray param4, jintArray param5, jintArray param6) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    Java_org_lwjgl_system_JNI_callPPPPPV__JIIJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4, (intptr_t)paramArray5, (intptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPV__JIIJ_3I_3I_3I_3I(jlong __functionAddress, jint param0, jint param1, jlong param2, jint length3, jint* param3, jint length4, jint* param4, jint length5, jint* param5, jint length6, jint* param6) {
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    UNUSED_PARAM(length6)
    Java_org_lwjgl_system_JNI_callPPPPPV__JIIJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIZ_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jboolean param2, jdoubleArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIZJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIZ_3D(jlong __functionAddress, jint param0, jint param1, jboolean param2, jint length3, jdouble* param3) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPV__JIIZJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIZ_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jboolean param2, jfloatArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIZJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIZ_3F(jlong __functionAddress, jint param0, jint param1, jboolean param2, jint length3, jfloat* param3) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPV__JIIZJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIZ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jboolean param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIZJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIZ_3I(jlong __functionAddress, jint param0, jint param1, jboolean param2, jint length3, jint* param3) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPV__JIIZJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jdoubleArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JII_3D(jlong __functionAddress, jint param0, jint param1, jint length2, jdouble* param2) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jfloatArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JII_3F(jlong __functionAddress, jint param0, jint param1, jint length2, jfloat* param2) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JII_3I(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JII_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jint param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JII_3II(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint param3) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPV__JIIJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JII_3III(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jint param3, jint param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIJII(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, param4);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JII_3III(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint param3, jint param4) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPV__JIIJII(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JII_3IIIII(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jint param3, jint param4, jint param5, jint param6) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIJIIII(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, param4, param5, param6);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JII_3IIIII(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint param3, jint param4, jint param5, jint param6) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPV__JIIJIIII(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JII_3II_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jint param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JII_3II_3I(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint param3, jint length4, jint* param4) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPPV__JIIJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JII_3II_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jint param3, jintArray param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIIJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JII_3II_3I_3I(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint param3, jint length4, jint* param4, jint length5, jint* param5) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPPPV__JIIJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, (intptr_t)param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JII_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jlong param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JII_3IJ(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jlong param3) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPPV__JIIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JII_3IJII(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jlong param3, jint param4, jint param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIJJII(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, param4, param5);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JII_3IJII(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jlong param3, jint param4, jint param5) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPPV__JIIJJII(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, param4, param5);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JII_3IJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jlong param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JII_3IJ_3I(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jlong param3, jint length4, jint* param4) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JII_3I_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jfloatArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JII_3I_3F(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint length3, jfloat* param3) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPPV__JIIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JII_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JII_3I_3I(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint length3, jint* param3) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPPV__JIIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JII_3I_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jintArray param3, jlong param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3, param4);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JII_3I_3IJ(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint length3, jint* param3, jlong param4) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JII_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlongArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JII_3J(jlong __functionAddress, jint param0, jint param1, jint length2, jlong* param2) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jshortArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JII_3S(jlong __functionAddress, jint param0, jint param1, jint length2, jshort* param2) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jint param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIJI_3I(jlong __functionAddress, jint param0, jlong param1, jint param2, jint length3, jint* param3) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPPV__JIJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIJI_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jint param2, jintArray param3, jlong param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, param4);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIJI_3IJ(jlong __functionAddress, jint param0, jlong param1, jint param2, jint length3, jint* param3, jlong param4) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPPPV__JIJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIJI_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jint param2, jintArray param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIJI_3I_3I(jlong __functionAddress, jint param0, jlong param1, jint param2, jint length3, jint* param3, jint length4, jint* param4) {
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPPPV__JIJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIJJ_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jlong param2, jdoubleArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIJJ_3D(jlong __functionAddress, jint param0, jlong param1, jlong param2, jint length3, jdouble* param3) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIJJ_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jlong param2, jfloatArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIJJ_3F(jlong __functionAddress, jint param0, jlong param1, jlong param2, jint length3, jfloat* param3) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jlong param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIJJ_3I(jlong __functionAddress, jint param0, jlong param1, jlong param2, jint length3, jint* param3) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIJJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jlong param2, jlongArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIJJ_3J(jlong __functionAddress, jint param0, jlong param1, jlong param2, jint length3, jlong* param3) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIJJ_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jlong param2, jshortArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIJJ_3S(jlong __functionAddress, jint param0, jlong param1, jlong param2, jint length3, jshort* param3) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIJ_3DI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jdoubleArray param2, jint param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIJ_3DI(jlong __functionAddress, jint param0, jlong param1, jint length2, jdouble* param2, jint param3) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIJ_3FI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jfloatArray param2, jint param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIJ_3FI(jlong __functionAddress, jint param0, jlong param1, jint length2, jfloat* param2, jint param3) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jintArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIJ_3I(jlong __functionAddress, jint param0, jlong param1, jint length2, jint* param2) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPPV__JIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIJ_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jintArray param2, jint param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIJ_3II(jlong __functionAddress, jint param0, jlong param1, jint length2, jint* param2, jint param3) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__JIJ_3I_3I_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jintArray param2, jintArray param3, jintArray param4, jint param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPPPPV__JIJJJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4, param5);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPV__JIJ_3I_3I_3II(jlong __functionAddress, jint param0, jlong param1, jint length2, jint* param2, jint length3, jint* param3, jint length4, jint* param4, jint param5) {
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPPPPV__JIJJJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, param5);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIJ_3JI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jlongArray param2, jint param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIJ_3JI(jlong __functionAddress, jint param0, jlong param1, jint length2, jlong* param2, jint param3) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIJ_3SI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jshortArray param2, jint param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIJ_3SI(jlong __functionAddress, jint param0, jlong param1, jint length2, jshort* param2, jint param3) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIZII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jboolean param1, jint param2, jint param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPV__JIZIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIZII_3I(jlong __functionAddress, jint param0, jboolean param1, jint param2, jint param3, jint length4, jint* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPV__JIZIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JI_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jdoubleArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_callPV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JI_3D(jlong __functionAddress, jint param0, jint length1, jdouble* param1) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_callPV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JI_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jfloatArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_callPV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JI_3F(jlong __functionAddress, jint param0, jint length1, jfloat* param1) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_callPV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_callPV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JI_3I(jlong __functionAddress, jint param0, jint length1, jint* param1) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_callPV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JI_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jint param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_callPV__JIJI(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JI_3II(jlong __functionAddress, jint param0, jint length1, jint* param1, jint param2) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_callPV__JIJI(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JI_3III(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jint param2, jint param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_callPV__JIJII(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2, param3);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JI_3III(jlong __functionAddress, jint param0, jint length1, jint* param1, jint param2, jint param3) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_callPV__JIJII(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JI_3IIJI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jint param2, jlong param3, jint param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIJIJI(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2, param3, param4);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JI_3IIJI(jlong __functionAddress, jint param0, jint length1, jint* param1, jint param2, jlong param3, jint param4) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_callPPV__JIJIJI(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JI_3IIJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jint param2, jlong param3, jint param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIJIJIJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JI_3IIJI_3I(jlong __functionAddress, jint param0, jint length1, jint* param1, jint param2, jlong param3, jint param4, jint length5, jint* param5) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPPPV__JIJIJIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, param3, param4, (intptr_t)param5);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JI_3II_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jint param2, jintArray param3, jint param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIJIJI(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2, (intptr_t)paramArray3, param4);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JI_3II_3II(jlong __functionAddress, jint param0, jint length1, jint* param1, jint param2, jint length3, jint* param3, jint param4) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPPV__JIJIJI(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, (intptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JI_3IJII(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jlong param2, jint param3, jint param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIJJII(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2, param3, param4);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JI_3IJII(jlong __functionAddress, jint param0, jint length1, jint* param1, jlong param2, jint param3, jint param4) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_callPPV__JIJJII(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JI_3I_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jfloatArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JI_3I_3F(jlong __functionAddress, jint param0, jint length1, jint* param1, jint length2, jfloat* param2) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPPV__JIJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JI_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jintArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JI_3I_3I(jlong __functionAddress, jint param0, jint length1, jint* param1, jint length2, jint* param2) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPPV__JIJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JI_3I_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jintArray param2, jint param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JI_3I_3II(jlong __functionAddress, jint param0, jint length1, jint* param1, jint length2, jint* param2, jint param3) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JI_3I_3II_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jintArray param2, jint param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JIJJIJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JI_3I_3II_3I(jlong __functionAddress, jint param0, jint length1, jint* param1, jint length2, jint* param2, jint param3, jint length4, jint* param4) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPPPV__JIJJIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JI_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlongArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_callPV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JI_3J(jlong __functionAddress, jint param0, jint length1, jlong* param1) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_callPV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JI_3J_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlongArray param1, jintArray param2, jint param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JI_3J_3II(jlong __functionAddress, jint param0, jint length1, jlong* param1, jint length2, jint* param2, jint param3) {
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JI_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jshortArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_callPV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JI_3S(jlong __functionAddress, jint param0, jint length1, jshort* param1) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_callPV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJIIIII_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jintArray param6, jlong param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JJIIIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6, param7);
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JJIIIII_3IJ(jlong __functionAddress, jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint length6, jint* param6, jlong param7) {
    UNUSED_PARAM(length6)
    Java_org_lwjgl_system_JNI_callPPPV__JJIIIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6, param7);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JJIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jint param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPPV__JJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JJIII_3I(jlong __functionAddress, jlong param0, jint param1, jint param2, jint param3, jint length4, jint* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPPV__JJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJII_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jintArray param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JJII_3I_3I(jlong __functionAddress, jlong param0, jint param1, jint param2, jint length3, jint* param3, jint length4, jint* param4) {
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPPPV__JJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJII_3J_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jlongArray param3, jlongArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JJII_3J_3J(jlong __functionAddress, jlong param0, jint param1, jint param2, jint length3, jlong* param3, jint length4, jlong* param4) {
    UNUSED_PARAM(length3)
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPPPV__JJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPPV__JJIJII_3JI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jint param3, jint param4, jlongArray param5, jint param6, jintArray param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    Java_org_lwjgl_system_JNI_callPJPPV__JJIJIIJIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5, param6, (intptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPV__JJIJII_3JI_3I(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint param3, jint param4, jint length5, jlong* param5, jint param6, jint length7, jint* param7) {
    UNUSED_PARAM(length5)
    UNUSED_PARAM(length7)
    Java_org_lwjgl_system_JNI_callPJPPV__JJIJIIJIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5, param6, (intptr_t)param7);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJI_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jintArray param2, jlong param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JJI_3IJ(jlong __functionAddress, jlong param0, jint param1, jint length2, jint* param2, jlong param3) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPPPV__JJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPV__JJI_3JIIIJIJIJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlongArray param2, jint param3, jint param4, jint param5, jlong param6, jint param7, jlong param8, jint param9, jlong param10) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPPPPPV__JJIJIIIJIJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, param4, param5, param6, param7, param8, param9, param10);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPV__JJI_3JIIIJIJIJ(jlong __functionAddress, jlong param0, jint param1, jint length2, jlong* param2, jint param3, jint param4, jint param5, jlong param6, jint param7, jlong param8, jint param9, jlong param10) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPPPPPV__JJIJIIIJIJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, param4, param5, param6, param7, param8, param9, param10);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJI_3JJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlongArray param2, jlong param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JJI_3JJ(jlong __functionAddress, jlong param0, jint param1, jint length2, jlong* param2, jlong param3) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPPPV__JJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJJIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jdoubleArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPV__JJJIII_3D(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint length5, jdouble* param5) {
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJJIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jfloatArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPV__JJJIII_3F(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint length5, jfloat* param5) {
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJJIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jintArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPV__JJJIII_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint length5, jint* param5) {
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJJIII_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jlongArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPV__JJJIII_3J(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint length5, jlong* param5) {
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJJIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jshortArray param5) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPV__JJJIII_3S(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint length5, jshort* param5) {
    UNUSED_PARAM(length5)
    Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
#endif
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jintArray param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JJJI_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint length3, jint* param3) {
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPPPV__JJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jdoubleArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3D(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jdouble* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jfloatArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3F(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jfloat* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jintArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jint* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlongArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3J(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jlong* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jshortArray param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3S(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jshort* param4) {
    UNUSED_PARAM(length4)
    Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__JJJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jlong param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPPPPV__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPV__JJJ_3IJ(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jlong param3) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPPPPV__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPPV__JJJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jlong param3) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPJPPV__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPV__JJJ_3IJ(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jlong param3) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPJPPV__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlongArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPJPV__JJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPV__JJJ_3J(jlong __functionAddress, jlong param0, jlong param1, jint length2, jlong* param2) {
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPJPV__JJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JJ_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jfloatArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_callPPV__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JJ_3F(jlong __functionAddress, jlong param0, jint length1, jfloat* param1) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_callPPV__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_callPPV__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JJ_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_callPPV__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jlong param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_callPPPV__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JJ_3IJ(jlong __functionAddress, jlong param0, jint length1, jint* param1, jlong param2) {
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_callPPPV__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__J_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jdoubleArray param0) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    Java_org_lwjgl_system_JNI_callPV__JJ(NULL, NULL, __functionAddress, (intptr_t)paramArray0);
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__J_3D(jlong __functionAddress, jint length0, jdouble* param0) {
    UNUSED_PARAM(length0)
    Java_org_lwjgl_system_JNI_callPV__JJ(NULL, NULL, __functionAddress, (intptr_t)param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__J_3D_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jdoubleArray param0, jdoubleArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_callPPV__JJJ(NULL, NULL, __functionAddress, (intptr_t)paramArray0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__J_3D_3D(jlong __functionAddress, jint length0, jdouble* param0, jint length1, jdouble* param1) {
    UNUSED_PARAM(length0)
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_callPPV__JJJ(NULL, NULL, __functionAddress, (intptr_t)param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__J_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jfloatArray param0) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    Java_org_lwjgl_system_JNI_callPV__JJ(NULL, NULL, __functionAddress, (intptr_t)paramArray0);
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__J_3F(jlong __functionAddress, jint length0, jfloat* param0) {
    UNUSED_PARAM(length0)
    Java_org_lwjgl_system_JNI_callPV__JJ(NULL, NULL, __functionAddress, (intptr_t)param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__J_3F_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jfloatArray param0, jfloatArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_callPPV__JJJ(NULL, NULL, __functionAddress, (intptr_t)paramArray0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__J_3F_3F(jlong __functionAddress, jint length0, jfloat* param0, jint length1, jfloat* param1) {
    UNUSED_PARAM(length0)
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_callPPV__JJJ(NULL, NULL, __functionAddress, (intptr_t)param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__J_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    Java_org_lwjgl_system_JNI_callPV__JJ(NULL, NULL, __functionAddress, (intptr_t)paramArray0);
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__J_3I(jlong __functionAddress, jint length0, jint* param0) {
    UNUSED_PARAM(length0)
    Java_org_lwjgl_system_JNI_callPV__JJ(NULL, NULL, __functionAddress, (intptr_t)param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__J_3II_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0, jint param1, jintArray param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    Java_org_lwjgl_system_JNI_callPPV__JJIJ(NULL, NULL, __functionAddress, (intptr_t)paramArray0, param1, (intptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__J_3II_3I(jlong __functionAddress, jint length0, jint* param0, jint param1, jint length2, jint* param2) {
    UNUSED_PARAM(length0)
    UNUSED_PARAM(length2)
    Java_org_lwjgl_system_JNI_callPPV__JJIJ(NULL, NULL, __functionAddress, (intptr_t)param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__J_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0, jintArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_callPPV__JJJ(NULL, NULL, __functionAddress, (intptr_t)paramArray0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__J_3I_3I(jlong __functionAddress, jint length0, jint* param0, jint length1, jint* param1) {
    UNUSED_PARAM(length0)
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_callPPV__JJJ(NULL, NULL, __functionAddress, (intptr_t)param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__J_3J_3I_3I_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlongArray param0, jintArray param1, jintArray param2, jintArray param3, jint param4) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
    Java_org_lwjgl_system_JNI_callPPPPV__JJJJJI(NULL, NULL, __functionAddress, (intptr_t)paramArray0, (intptr_t)paramArray1, (intptr_t)paramArray2, (intptr_t)paramArray3, param4);
    if (param3 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPV__J_3J_3I_3I_3II(jlong __functionAddress, jint length0, jlong* param0, jint length1, jint* param1, jint length2, jint* param2, jint length3, jint* param3, jint param4) {
    UNUSED_PARAM(length0)
    UNUSED_PARAM(length1)
    UNUSED_PARAM(length2)
    UNUSED_PARAM(length3)
    Java_org_lwjgl_system_JNI_callPPPPV__JJJJJI(NULL, NULL, __functionAddress, (intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__J_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshortArray param0) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    Java_org_lwjgl_system_JNI_callPV__JJ(NULL, NULL, __functionAddress, (intptr_t)paramArray0);
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__J_3S(jlong __functionAddress, jint length0, jshort* param0) {
    UNUSED_PARAM(length0)
    Java_org_lwjgl_system_JNI_callPV__JJ(NULL, NULL, __functionAddress, (intptr_t)param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__J_3S_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshortArray param0, jshortArray param1) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    Java_org_lwjgl_system_JNI_callPPV__JJJ(NULL, NULL, __functionAddress, (intptr_t)paramArray0, (intptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    if (param0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__J_3S_3S(jlong __functionAddress, jint length0, jshort* param0, jint length1, jshort* param1) {
    UNUSED_PARAM(length0)
    UNUSED_PARAM(length1)
    Java_org_lwjgl_system_JNI_callPPV__JJJ(NULL, NULL, __functionAddress, (intptr_t)param0, (intptr_t)param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_callPPPPZ__JIIIF_3F_3F_3F_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jfloat param3, jfloatArray param4, jfloatArray param5, jfloatArray param6, jfloatArray param7) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
    jboolean __result = Java_org_lwjgl_system_JNI_callPPPPZ__JIIIFJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5, (intptr_t)paramArray6, (intptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0); }
    if (param6 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPZ__JIIIF_3F_3F_3F_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jfloat param3, jint length4, jfloat* param4, jint length5, jfloat* param5, jint length6, jfloat* param6, jint length7, jfloat* param7) {
    UNUSED_PARAM(length4)
    UNUSED_PARAM(length5)
    UNUSED_PARAM(length6)
    UNUSED_PARAM(length7)
    return Java_org_lwjgl_system_JNI_callPPPPZ__JIIIFJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_callPPZ__JI_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jlong param2) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
    jboolean __result = Java_org_lwjgl_system_JNI_callPPZ__JIJJ(NULL, NULL, __functionAddress, param0, (intptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_system_JNI_callPPZ__JI_3IJ(jlong __functionAddress, jint param0, jint length1, jint* param1, jlong param2) {
    UNUSED_PARAM(length1)
    return Java_org_lwjgl_system_JNI_callPPZ__JIJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}

EXTERN_C_EXIT
