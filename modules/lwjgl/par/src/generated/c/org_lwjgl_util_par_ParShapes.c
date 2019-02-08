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
#define PAR_SHAPES_IMPLEMENTATION
#define PAR_SHAPES_T uint32_t
#include "par_shapes.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1free_1mesh(jlong meshAddress) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(intptr_t)meshAddress;
    par_shapes_free_mesh(mesh);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1free_1mesh(JNIEnv *__env, jclass clazz, jlong meshAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1free_1mesh(meshAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1cylinder(jint slices, jint stacks) {
    return (jlong)(intptr_t)par_shapes_create_cylinder(slices, stacks);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1cylinder(JNIEnv *__env, jclass clazz, jint slices, jint stacks) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1cylinder(slices, stacks);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1torus(jint slices, jint stacks, jfloat radius) {
    return (jlong)(intptr_t)par_shapes_create_torus(slices, stacks, radius);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1torus(JNIEnv *__env, jclass clazz, jint slices, jint stacks, jfloat radius) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1torus(slices, stacks, radius);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1parametric_1sphere(jint slices, jint stacks) {
    return (jlong)(intptr_t)par_shapes_create_parametric_sphere(slices, stacks);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1parametric_1sphere(JNIEnv *__env, jclass clazz, jint slices, jint stacks) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1parametric_1sphere(slices, stacks);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1subdivided_1sphere(jint nsubdivisions) {
    return (jlong)(intptr_t)par_shapes_create_subdivided_sphere(nsubdivisions);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1subdivided_1sphere(JNIEnv *__env, jclass clazz, jint nsubdivisions) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1subdivided_1sphere(nsubdivisions);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1klein_1bottle(jint slices, jint stacks) {
    return (jlong)(intptr_t)par_shapes_create_klein_bottle(slices, stacks);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1klein_1bottle(JNIEnv *__env, jclass clazz, jint slices, jint stacks) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1klein_1bottle(slices, stacks);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1trefoil_1knot(jint slices, jint stacks, jfloat radius) {
    return (jlong)(intptr_t)par_shapes_create_trefoil_knot(slices, stacks, radius);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1trefoil_1knot(JNIEnv *__env, jclass clazz, jint slices, jint stacks, jfloat radius) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1trefoil_1knot(slices, stacks, radius);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1hemisphere(jint slices, jint stacks) {
    return (jlong)(intptr_t)par_shapes_create_hemisphere(slices, stacks);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1hemisphere(JNIEnv *__env, jclass clazz, jint slices, jint stacks) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1hemisphere(slices, stacks);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1plane(jint slices, jint stacks) {
    return (jlong)(intptr_t)par_shapes_create_plane(slices, stacks);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1plane(JNIEnv *__env, jclass clazz, jint slices, jint stacks) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1plane(slices, stacks);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1icosahedron(void) {
    return (jlong)(intptr_t)par_shapes_create_icosahedron();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1icosahedron(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1icosahedron();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1dodecahedron(void) {
    return (jlong)(intptr_t)par_shapes_create_dodecahedron();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1dodecahedron(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1dodecahedron();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1octahedron(void) {
    return (jlong)(intptr_t)par_shapes_create_octahedron();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1octahedron(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1octahedron();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1tetrahedron(void) {
    return (jlong)(intptr_t)par_shapes_create_tetrahedron();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1tetrahedron(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1tetrahedron();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1cube(void) {
    return (jlong)(intptr_t)par_shapes_create_cube();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1cube(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1cube();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1disk__FIJJ(jfloat radius, jint slices, jlong centerAddress, jlong normalAddress) {
    float const *center = (float const *)(intptr_t)centerAddress;
    float const *normal = (float const *)(intptr_t)normalAddress;
    return (jlong)(intptr_t)par_shapes_create_disk(radius, slices, center, normal);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1disk__FIJJ(JNIEnv *__env, jclass clazz, jfloat radius, jint slices, jlong centerAddress, jlong normalAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1disk__FIJJ(radius, slices, centerAddress, normalAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1empty(void) {
    return (jlong)(intptr_t)par_shapes_create_empty();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1empty(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1empty();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1rock(jint seed, jint nsubdivisions) {
    return (jlong)(intptr_t)par_shapes_create_rock(seed, nsubdivisions);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1rock(JNIEnv *__env, jclass clazz, jint seed, jint nsubdivisions) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1rock(seed, nsubdivisions);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1lsystem(jlong programAddress, jint slices, jint maxdepth) {
    char const *program = (char const *)(intptr_t)programAddress;
    return (jlong)(intptr_t)par_shapes_create_lsystem(program, slices, maxdepth);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1lsystem(JNIEnv *__env, jclass clazz, jlong programAddress, jint slices, jint maxdepth) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1lsystem(programAddress, slices, maxdepth);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1export(jlong meshAddress, jlong objfileAddress) {
    par_shapes_mesh const *mesh = (par_shapes_mesh const *)(intptr_t)meshAddress;
    char const *objfile = (char const *)(intptr_t)objfileAddress;
    par_shapes_export(mesh, objfile);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1export(JNIEnv *__env, jclass clazz, jlong meshAddress, jlong objfileAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1export(meshAddress, objfileAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1compute_1aabb__JJ(jlong meshAddress, jlong aabbAddress) {
    par_shapes_mesh const *mesh = (par_shapes_mesh const *)(intptr_t)meshAddress;
    float *aabb = (float *)(intptr_t)aabbAddress;
    par_shapes_compute_aabb(mesh, aabb);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1compute_1aabb__JJ(JNIEnv *__env, jclass clazz, jlong meshAddress, jlong aabbAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1compute_1aabb__JJ(meshAddress, aabbAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1clone(jlong meshAddress, jlong targetAddress) {
    par_shapes_mesh const *mesh = (par_shapes_mesh const *)(intptr_t)meshAddress;
    par_shapes_mesh *target = (par_shapes_mesh *)(intptr_t)targetAddress;
    return (jlong)(intptr_t)par_shapes_clone(mesh, target);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1clone(JNIEnv *__env, jclass clazz, jlong meshAddress, jlong targetAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1clone(meshAddress, targetAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1merge(jlong dstAddress, jlong srcAddress) {
    par_shapes_mesh *dst = (par_shapes_mesh *)(intptr_t)dstAddress;
    par_shapes_mesh const *src = (par_shapes_mesh const *)(intptr_t)srcAddress;
    par_shapes_merge(dst, src);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1merge(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong srcAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1merge(dstAddress, srcAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1translate(jlong meshAddress, jfloat x, jfloat y, jfloat z) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(intptr_t)meshAddress;
    par_shapes_translate(mesh, x, y, z);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1translate(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat x, jfloat y, jfloat z) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1translate(meshAddress, x, y, z);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1rotate__JFJ(jlong meshAddress, jfloat radians, jlong axisAddress) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(intptr_t)meshAddress;
    float const *axis = (float const *)(intptr_t)axisAddress;
    par_shapes_rotate(mesh, radians, axis);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1rotate__JFJ(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat radians, jlong axisAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1rotate__JFJ(meshAddress, radians, axisAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1scale(jlong meshAddress, jfloat x, jfloat y, jfloat z) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(intptr_t)meshAddress;
    par_shapes_scale(mesh, x, y, z);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1scale(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat x, jfloat y, jfloat z) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1scale(meshAddress, x, y, z);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1merge_1and_1free(jlong dstAddress, jlong srcAddress) {
    par_shapes_mesh *dst = (par_shapes_mesh *)(intptr_t)dstAddress;
    par_shapes_mesh *src = (par_shapes_mesh *)(intptr_t)srcAddress;
    par_shapes_merge_and_free(dst, src);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1merge_1and_1free(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong srcAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1merge_1and_1free(dstAddress, srcAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1invert(jlong meshAddress, jint startface, jint nfaces) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(intptr_t)meshAddress;
    par_shapes_invert(mesh, startface, nfaces);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1invert(JNIEnv *__env, jclass clazz, jlong meshAddress, jint startface, jint nfaces) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1invert(meshAddress, startface, nfaces);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1remove_1degenerate(jlong meshAddress, jfloat minarea) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(intptr_t)meshAddress;
    par_shapes_remove_degenerate(mesh, minarea);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1remove_1degenerate(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat minarea) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1remove_1degenerate(meshAddress, minarea);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1unweld(jlong meshAddress, jboolean create_indices) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(intptr_t)meshAddress;
    par_shapes_unweld(mesh, (bool)create_indices);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1unweld(JNIEnv *__env, jclass clazz, jlong meshAddress, jboolean create_indices) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1unweld(meshAddress, create_indices);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1weld__JFJ(jlong meshAddress, jfloat epsilon, jlong mappingAddress) {
    par_shapes_mesh const *mesh = (par_shapes_mesh const *)(intptr_t)meshAddress;
    PAR_SHAPES_T *mapping = (PAR_SHAPES_T *)(intptr_t)mappingAddress;
    return (jlong)(intptr_t)par_shapes_weld(mesh, epsilon, mapping);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1weld__JFJ(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat epsilon, jlong mappingAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1weld__JFJ(meshAddress, epsilon, mappingAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1compute_1normals(jlong meshAddress) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(intptr_t)meshAddress;
    par_shapes_compute_normals(mesh);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1compute_1normals(JNIEnv *__env, jclass clazz, jlong meshAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1compute_1normals(meshAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1disk__FI_3F_3F(jfloat radius, jint slices, jint center__length, jfloat* center, jint normal__length, jfloat* normal) {
    UNUSED_PARAM(center__length)
    UNUSED_PARAM(normal__length)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1disk__FIJJ(radius, slices, (intptr_t)center, (intptr_t)normal);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1disk__FI_3F_3F(JNIEnv *__env, jclass clazz, jfloat radius, jint slices, jfloatArray centerAddress, jfloatArray normalAddress) {
    jlong __result;
    jfloat *center = (*__env)->GetPrimitiveArrayCritical(__env, centerAddress, 0);
    jfloat *normal = (*__env)->GetPrimitiveArrayCritical(__env, normalAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1disk__FIJJ(radius, slices, (intptr_t)center, (intptr_t)normal);
    (*__env)->ReleasePrimitiveArrayCritical(__env, normalAddress, normal, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, centerAddress, center, 0);
    return __result;
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1compute_1aabb__J_3F(jlong meshAddress, jint aabb__length, jfloat* aabb) {
    UNUSED_PARAM(aabb__length)
    JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1compute_1aabb__JJ(meshAddress, (intptr_t)aabb);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1compute_1aabb__J_3F(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloatArray aabbAddress) {
    jfloat *aabb = (*__env)->GetPrimitiveArrayCritical(__env, aabbAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1compute_1aabb__JJ(meshAddress, (intptr_t)aabb);
    (*__env)->ReleasePrimitiveArrayCritical(__env, aabbAddress, aabb, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1rotate__JF_3F(jlong meshAddress, jfloat radians, jint axis__length, jfloat* axis) {
    UNUSED_PARAM(axis__length)
    JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1rotate__JFJ(meshAddress, radians, (intptr_t)axis);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1rotate__JF_3F(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat radians, jfloatArray axisAddress) {
    jfloat *axis = (*__env)->GetPrimitiveArrayCritical(__env, axisAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1rotate__JFJ(meshAddress, radians, (intptr_t)axis);
    (*__env)->ReleasePrimitiveArrayCritical(__env, axisAddress, axis, 0);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1weld__JF_3I(jlong meshAddress, jfloat epsilon, jint mapping__length, jint* mapping) {
    UNUSED_PARAM(mapping__length)
    return JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1weld__JFJ(meshAddress, epsilon, (intptr_t)mapping);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1weld__JF_3I(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat epsilon, jintArray mappingAddress) {
    jlong __result;
    jint *mapping = mappingAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, mappingAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_util_par_ParShapes_npar_1shapes_1weld__JFJ(meshAddress, epsilon, (intptr_t)mapping);
    if (mapping != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, mappingAddress, mapping, 0); }
    return __result;
}

EXTERN_C_EXIT
