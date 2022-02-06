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

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1free_1mesh(JNIEnv *__env, jclass clazz, jlong meshAddress) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(uintptr_t)meshAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_free_mesh(mesh);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1cylinder(JNIEnv *__env, jclass clazz, jint slices, jint stacks) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_cylinder(slices, stacks);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1cone(JNIEnv *__env, jclass clazz, jint slices, jint stacks) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_cone(slices, stacks);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1parametric_1disk(JNIEnv *__env, jclass clazz, jint slices, jint stacks) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_parametric_disk(slices, stacks);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1torus(JNIEnv *__env, jclass clazz, jint slices, jint stacks, jfloat radius) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_torus(slices, stacks, radius);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1parametric_1sphere(JNIEnv *__env, jclass clazz, jint slices, jint stacks) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_parametric_sphere(slices, stacks);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1subdivided_1sphere(JNIEnv *__env, jclass clazz, jint nsubdivisions) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_subdivided_sphere(nsubdivisions);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1klein_1bottle(JNIEnv *__env, jclass clazz, jint slices, jint stacks) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_klein_bottle(slices, stacks);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1trefoil_1knot(JNIEnv *__env, jclass clazz, jint slices, jint stacks, jfloat radius) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_trefoil_knot(slices, stacks, radius);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1hemisphere(JNIEnv *__env, jclass clazz, jint slices, jint stacks) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_hemisphere(slices, stacks);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1plane(JNIEnv *__env, jclass clazz, jint slices, jint stacks) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_plane(slices, stacks);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1icosahedron(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_icosahedron();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1dodecahedron(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_dodecahedron();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1octahedron(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_octahedron();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1tetrahedron(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_tetrahedron();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1cube(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_cube();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1disk__FIJJ(JNIEnv *__env, jclass clazz, jfloat radius, jint slices, jlong centerAddress, jlong normalAddress) {
    float const *center = (float const *)(uintptr_t)centerAddress;
    float const *normal = (float const *)(uintptr_t)normalAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_disk(radius, slices, center, normal);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1empty(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_empty();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1rock(JNIEnv *__env, jclass clazz, jint seed, jint nsubdivisions) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_rock(seed, nsubdivisions);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1lsystem(JNIEnv *__env, jclass clazz, jlong programAddress, jint slices, jint maxdepth, jlong rand_fnAddress, jlong contextAddress) {
    char const *program = (char const *)(uintptr_t)programAddress;
    par_shapes_rand_fn rand_fn = (par_shapes_rand_fn)(uintptr_t)rand_fnAddress;
    void *context = (void *)(uintptr_t)contextAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_create_lsystem(program, slices, maxdepth, rand_fn, context);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1export(JNIEnv *__env, jclass clazz, jlong meshAddress, jlong objfileAddress) {
    par_shapes_mesh const *mesh = (par_shapes_mesh const *)(uintptr_t)meshAddress;
    char const *objfile = (char const *)(uintptr_t)objfileAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_export(mesh, objfile);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1compute_1aabb__JJ(JNIEnv *__env, jclass clazz, jlong meshAddress, jlong aabbAddress) {
    par_shapes_mesh const *mesh = (par_shapes_mesh const *)(uintptr_t)meshAddress;
    float *aabb = (float *)(uintptr_t)aabbAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_compute_aabb(mesh, aabb);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1clone(JNIEnv *__env, jclass clazz, jlong meshAddress, jlong targetAddress) {
    par_shapes_mesh const *mesh = (par_shapes_mesh const *)(uintptr_t)meshAddress;
    par_shapes_mesh *target = (par_shapes_mesh *)(uintptr_t)targetAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_clone(mesh, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1merge(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong srcAddress) {
    par_shapes_mesh *dst = (par_shapes_mesh *)(uintptr_t)dstAddress;
    par_shapes_mesh const *src = (par_shapes_mesh const *)(uintptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_merge(dst, src);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1translate(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat x, jfloat y, jfloat z) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(uintptr_t)meshAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_translate(mesh, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1rotate__JFJ(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat radians, jlong axisAddress) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(uintptr_t)meshAddress;
    float const *axis = (float const *)(uintptr_t)axisAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_rotate(mesh, radians, axis);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1scale(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat x, jfloat y, jfloat z) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(uintptr_t)meshAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_scale(mesh, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1merge_1and_1free(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong srcAddress) {
    par_shapes_mesh *dst = (par_shapes_mesh *)(uintptr_t)dstAddress;
    par_shapes_mesh *src = (par_shapes_mesh *)(uintptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_merge_and_free(dst, src);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1invert(JNIEnv *__env, jclass clazz, jlong meshAddress, jint startface, jint nfaces) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(uintptr_t)meshAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_invert(mesh, startface, nfaces);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1remove_1degenerate(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat minarea) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(uintptr_t)meshAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_remove_degenerate(mesh, minarea);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1unweld(JNIEnv *__env, jclass clazz, jlong meshAddress, jboolean create_indices) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(uintptr_t)meshAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_unweld(mesh, (bool)create_indices);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1weld__JFJ(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat epsilon, jlong mappingAddress) {
    par_shapes_mesh const *mesh = (par_shapes_mesh const *)(uintptr_t)meshAddress;
    PAR_SHAPES_T *mapping = (PAR_SHAPES_T *)(uintptr_t)mappingAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)par_shapes_weld(mesh, epsilon, mapping);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1compute_1normals(JNIEnv *__env, jclass clazz, jlong meshAddress) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(uintptr_t)meshAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes_compute_normals(mesh);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_par_1shapes_1set_1epsilon_1welded_1normals(JNIEnv *__env, jclass clazz, jfloat epsilon) {
    UNUSED_PARAMS(__env, clazz)
    par_shapes_set_epsilon_welded_normals(epsilon);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_par_1shapes_1set_1epsilon_1degenerate_1sphere(JNIEnv *__env, jclass clazz, jfloat epsilon) {
    UNUSED_PARAMS(__env, clazz)
    par_shapes_set_epsilon_degenerate_sphere(epsilon);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1_1compute_1welded_1normals(JNIEnv *__env, jclass clazz, jlong mAddress) {
    par_shapes_mesh *m = (par_shapes_mesh *)(uintptr_t)mAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes__compute_welded_normals(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1_1connect(JNIEnv *__env, jclass clazz, jlong sceneAddress, jlong cylinderAddress, jint slices) {
    par_shapes_mesh *scene = (par_shapes_mesh *)(uintptr_t)sceneAddress;
    par_shapes_mesh *cylinder = (par_shapes_mesh *)(uintptr_t)cylinderAddress;
    UNUSED_PARAMS(__env, clazz)
    par_shapes__connect(scene, cylinder, slices);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1create_1disk__FI_3F_3F(JNIEnv *__env, jclass clazz, jfloat radius, jint slices, jfloatArray centerAddress, jfloatArray normalAddress) {
    jlong __result;
    jfloat *center = (*__env)->GetFloatArrayElements(__env, centerAddress, NULL);
    jfloat *normal = (*__env)->GetFloatArrayElements(__env, normalAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(uintptr_t)par_shapes_create_disk(radius, slices, (float const *)center, (float const *)normal);
    (*__env)->ReleaseFloatArrayElements(__env, normalAddress, normal, 0);
    (*__env)->ReleaseFloatArrayElements(__env, centerAddress, center, 0);
    return __result;
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1compute_1aabb__J_3F(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloatArray aabbAddress) {
    par_shapes_mesh const *mesh = (par_shapes_mesh const *)(uintptr_t)meshAddress;
    jfloat *aabb = (*__env)->GetFloatArrayElements(__env, aabbAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    par_shapes_compute_aabb(mesh, (float *)aabb);
    (*__env)->ReleaseFloatArrayElements(__env, aabbAddress, aabb, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1rotate__JF_3F(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat radians, jfloatArray axisAddress) {
    par_shapes_mesh *mesh = (par_shapes_mesh *)(uintptr_t)meshAddress;
    jfloat *axis = (*__env)->GetFloatArrayElements(__env, axisAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    par_shapes_rotate(mesh, radians, (float const *)axis);
    (*__env)->ReleaseFloatArrayElements(__env, axisAddress, axis, 0);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_par_ParShapes_npar_1shapes_1weld__JF_3I(JNIEnv *__env, jclass clazz, jlong meshAddress, jfloat epsilon, jintArray mappingAddress) {
    par_shapes_mesh const *mesh = (par_shapes_mesh const *)(uintptr_t)meshAddress;
    jlong __result;
    jint *mapping = mappingAddress == NULL ? NULL : (*__env)->GetIntArrayElements(__env, mappingAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(uintptr_t)par_shapes_weld(mesh, epsilon, (PAR_SHAPES_T *)mapping);
    if (mapping != NULL) { (*__env)->ReleaseIntArrayElements(__env, mappingAddress, mapping, 0); }
    return __result;
}

EXTERN_C_EXIT
