/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glActiveTextureARBPROC) (jint);
typedef void (APIENTRY *glClientActiveTextureARBPROC) (jint);
typedef void (APIENTRY *glMultiTexCoord1fARBPROC) (jint, jfloat);
typedef void (APIENTRY *glMultiTexCoord1sARBPROC) (jint, jshort);
typedef void (APIENTRY *glMultiTexCoord1iARBPROC) (jint, jint);
typedef void (APIENTRY *glMultiTexCoord1dARBPROC) (jint, jdouble);
typedef void (APIENTRY *glMultiTexCoord1fvARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMultiTexCoord1svARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMultiTexCoord1ivARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMultiTexCoord1dvARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMultiTexCoord2fARBPROC) (jint, jfloat, jfloat);
typedef void (APIENTRY *glMultiTexCoord2sARBPROC) (jint, jshort, jshort);
typedef void (APIENTRY *glMultiTexCoord2iARBPROC) (jint, jint, jint);
typedef void (APIENTRY *glMultiTexCoord2dARBPROC) (jint, jdouble, jdouble);
typedef void (APIENTRY *glMultiTexCoord2fvARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMultiTexCoord2svARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMultiTexCoord2ivARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMultiTexCoord2dvARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMultiTexCoord3fARBPROC) (jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glMultiTexCoord3sARBPROC) (jint, jshort, jshort, jshort);
typedef void (APIENTRY *glMultiTexCoord3iARBPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glMultiTexCoord3dARBPROC) (jint, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glMultiTexCoord3fvARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMultiTexCoord3svARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMultiTexCoord3ivARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMultiTexCoord3dvARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMultiTexCoord4fARBPROC) (jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glMultiTexCoord4sARBPROC) (jint, jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glMultiTexCoord4iARBPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glMultiTexCoord4dARBPROC) (jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glMultiTexCoord4fvARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMultiTexCoord4svARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMultiTexCoord4ivARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMultiTexCoord4dvARBPROC) (jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_glActiveTextureARB(JNIEnv *__env, jclass clazz, jint texture) {
    glActiveTextureARBPROC glActiveTextureARB = (glActiveTextureARBPROC)tlsGetFunction(1247);
    UNUSED_PARAM(clazz)
    glActiveTextureARB(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_glClientActiveTextureARB(JNIEnv *__env, jclass clazz, jint texture) {
    glClientActiveTextureARBPROC glClientActiveTextureARB = (glClientActiveTextureARBPROC)tlsGetFunction(1248);
    UNUSED_PARAM(clazz)
    glClientActiveTextureARB(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_glMultiTexCoord1fARB(JNIEnv *__env, jclass clazz, jint texture, jfloat s) {
    glMultiTexCoord1fARBPROC glMultiTexCoord1fARB = (glMultiTexCoord1fARBPROC)tlsGetFunction(1249);
    UNUSED_PARAM(clazz)
    glMultiTexCoord1fARB(texture, s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_glMultiTexCoord1sARB(JNIEnv *__env, jclass clazz, jint texture, jshort s) {
    glMultiTexCoord1sARBPROC glMultiTexCoord1sARB = (glMultiTexCoord1sARBPROC)tlsGetFunction(1250);
    UNUSED_PARAM(clazz)
    glMultiTexCoord1sARB(texture, s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_glMultiTexCoord1iARB(JNIEnv *__env, jclass clazz, jint texture, jint s) {
    glMultiTexCoord1iARBPROC glMultiTexCoord1iARB = (glMultiTexCoord1iARBPROC)tlsGetFunction(1251);
    UNUSED_PARAM(clazz)
    glMultiTexCoord1iARB(texture, s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_glMultiTexCoord1dARB(JNIEnv *__env, jclass clazz, jint texture, jdouble s) {
    glMultiTexCoord1dARBPROC glMultiTexCoord1dARB = (glMultiTexCoord1dARBPROC)tlsGetFunction(1252);
    UNUSED_PARAM(clazz)
    glMultiTexCoord1dARB(texture, s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord1fvARB__IJ(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress) {
    glMultiTexCoord1fvARBPROC glMultiTexCoord1fvARB = (glMultiTexCoord1fvARBPROC)tlsGetFunction(1253);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord1fvARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord1svARB__IJ(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress) {
    glMultiTexCoord1svARBPROC glMultiTexCoord1svARB = (glMultiTexCoord1svARBPROC)tlsGetFunction(1254);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord1svARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord1ivARB__IJ(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress) {
    glMultiTexCoord1ivARBPROC glMultiTexCoord1ivARB = (glMultiTexCoord1ivARBPROC)tlsGetFunction(1255);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord1ivARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord1dvARB__IJ(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress) {
    glMultiTexCoord1dvARBPROC glMultiTexCoord1dvARB = (glMultiTexCoord1dvARBPROC)tlsGetFunction(1256);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord1dvARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_glMultiTexCoord2fARB(JNIEnv *__env, jclass clazz, jint texture, jfloat s, jfloat t) {
    glMultiTexCoord2fARBPROC glMultiTexCoord2fARB = (glMultiTexCoord2fARBPROC)tlsGetFunction(1257);
    UNUSED_PARAM(clazz)
    glMultiTexCoord2fARB(texture, s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_glMultiTexCoord2sARB(JNIEnv *__env, jclass clazz, jint texture, jshort s, jshort t) {
    glMultiTexCoord2sARBPROC glMultiTexCoord2sARB = (glMultiTexCoord2sARBPROC)tlsGetFunction(1258);
    UNUSED_PARAM(clazz)
    glMultiTexCoord2sARB(texture, s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_glMultiTexCoord2iARB(JNIEnv *__env, jclass clazz, jint texture, jint s, jint t) {
    glMultiTexCoord2iARBPROC glMultiTexCoord2iARB = (glMultiTexCoord2iARBPROC)tlsGetFunction(1259);
    UNUSED_PARAM(clazz)
    glMultiTexCoord2iARB(texture, s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_glMultiTexCoord2dARB(JNIEnv *__env, jclass clazz, jint texture, jdouble s, jdouble t) {
    glMultiTexCoord2dARBPROC glMultiTexCoord2dARB = (glMultiTexCoord2dARBPROC)tlsGetFunction(1260);
    UNUSED_PARAM(clazz)
    glMultiTexCoord2dARB(texture, s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord2fvARB__IJ(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress) {
    glMultiTexCoord2fvARBPROC glMultiTexCoord2fvARB = (glMultiTexCoord2fvARBPROC)tlsGetFunction(1261);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord2fvARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord2svARB__IJ(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress) {
    glMultiTexCoord2svARBPROC glMultiTexCoord2svARB = (glMultiTexCoord2svARBPROC)tlsGetFunction(1262);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord2svARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord2ivARB__IJ(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress) {
    glMultiTexCoord2ivARBPROC glMultiTexCoord2ivARB = (glMultiTexCoord2ivARBPROC)tlsGetFunction(1263);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord2ivARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord2dvARB__IJ(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress) {
    glMultiTexCoord2dvARBPROC glMultiTexCoord2dvARB = (glMultiTexCoord2dvARBPROC)tlsGetFunction(1264);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord2dvARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_glMultiTexCoord3fARB(JNIEnv *__env, jclass clazz, jint texture, jfloat s, jfloat t, jfloat r) {
    glMultiTexCoord3fARBPROC glMultiTexCoord3fARB = (glMultiTexCoord3fARBPROC)tlsGetFunction(1265);
    UNUSED_PARAM(clazz)
    glMultiTexCoord3fARB(texture, s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_glMultiTexCoord3sARB(JNIEnv *__env, jclass clazz, jint texture, jshort s, jshort t, jshort r) {
    glMultiTexCoord3sARBPROC glMultiTexCoord3sARB = (glMultiTexCoord3sARBPROC)tlsGetFunction(1266);
    UNUSED_PARAM(clazz)
    glMultiTexCoord3sARB(texture, s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_glMultiTexCoord3iARB(JNIEnv *__env, jclass clazz, jint texture, jint s, jint t, jint r) {
    glMultiTexCoord3iARBPROC glMultiTexCoord3iARB = (glMultiTexCoord3iARBPROC)tlsGetFunction(1267);
    UNUSED_PARAM(clazz)
    glMultiTexCoord3iARB(texture, s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_glMultiTexCoord3dARB(JNIEnv *__env, jclass clazz, jint texture, jdouble s, jdouble t, jdouble r) {
    glMultiTexCoord3dARBPROC glMultiTexCoord3dARB = (glMultiTexCoord3dARBPROC)tlsGetFunction(1268);
    UNUSED_PARAM(clazz)
    glMultiTexCoord3dARB(texture, s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord3fvARB__IJ(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress) {
    glMultiTexCoord3fvARBPROC glMultiTexCoord3fvARB = (glMultiTexCoord3fvARBPROC)tlsGetFunction(1269);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord3fvARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord3svARB__IJ(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress) {
    glMultiTexCoord3svARBPROC glMultiTexCoord3svARB = (glMultiTexCoord3svARBPROC)tlsGetFunction(1270);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord3svARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord3ivARB__IJ(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress) {
    glMultiTexCoord3ivARBPROC glMultiTexCoord3ivARB = (glMultiTexCoord3ivARBPROC)tlsGetFunction(1271);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord3ivARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord3dvARB__IJ(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress) {
    glMultiTexCoord3dvARBPROC glMultiTexCoord3dvARB = (glMultiTexCoord3dvARBPROC)tlsGetFunction(1272);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord3dvARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_glMultiTexCoord4fARB(JNIEnv *__env, jclass clazz, jint texture, jfloat s, jfloat t, jfloat r, jfloat q) {
    glMultiTexCoord4fARBPROC glMultiTexCoord4fARB = (glMultiTexCoord4fARBPROC)tlsGetFunction(1273);
    UNUSED_PARAM(clazz)
    glMultiTexCoord4fARB(texture, s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_glMultiTexCoord4sARB(JNIEnv *__env, jclass clazz, jint texture, jshort s, jshort t, jshort r, jshort q) {
    glMultiTexCoord4sARBPROC glMultiTexCoord4sARB = (glMultiTexCoord4sARBPROC)tlsGetFunction(1274);
    UNUSED_PARAM(clazz)
    glMultiTexCoord4sARB(texture, s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_glMultiTexCoord4iARB(JNIEnv *__env, jclass clazz, jint texture, jint s, jint t, jint r, jint q) {
    glMultiTexCoord4iARBPROC glMultiTexCoord4iARB = (glMultiTexCoord4iARBPROC)tlsGetFunction(1275);
    UNUSED_PARAM(clazz)
    glMultiTexCoord4iARB(texture, s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_glMultiTexCoord4dARB(JNIEnv *__env, jclass clazz, jint texture, jdouble s, jdouble t, jdouble r, jdouble q) {
    glMultiTexCoord4dARBPROC glMultiTexCoord4dARB = (glMultiTexCoord4dARBPROC)tlsGetFunction(1276);
    UNUSED_PARAM(clazz)
    glMultiTexCoord4dARB(texture, s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord4fvARB__IJ(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress) {
    glMultiTexCoord4fvARBPROC glMultiTexCoord4fvARB = (glMultiTexCoord4fvARBPROC)tlsGetFunction(1277);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord4fvARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord4svARB__IJ(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress) {
    glMultiTexCoord4svARBPROC glMultiTexCoord4svARB = (glMultiTexCoord4svARBPROC)tlsGetFunction(1278);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord4svARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord4ivARB__IJ(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress) {
    glMultiTexCoord4ivARBPROC glMultiTexCoord4ivARB = (glMultiTexCoord4ivARBPROC)tlsGetFunction(1279);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord4ivARB(texture, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultitexture_nglMultiTexCoord4dvARB__IJ(JNIEnv *__env, jclass clazz, jint texture, jlong vAddress) {
    glMultiTexCoord4dvARBPROC glMultiTexCoord4dvARB = (glMultiTexCoord4dvARBPROC)tlsGetFunction(1280);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoord4dvARB(texture, v);
}

EXTERN_C_EXIT
