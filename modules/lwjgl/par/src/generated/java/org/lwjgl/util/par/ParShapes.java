/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ParShapes {

    static { LibPar.initialize(); }

    protected ParShapes() {
        throw new UnsupportedOperationException();
    }

    // --- [ par_shapes_free_mesh ] ---

    /** {@code void par_shapes_free_mesh(par_shapes_mesh * mesh)} */
    public static native void npar_shapes_free_mesh(long mesh);

    /** {@code void par_shapes_free_mesh(par_shapes_mesh * mesh)} */
    public static void par_shapes_free_mesh(@NativeType("par_shapes_mesh *") ParShapesMesh mesh) {
        npar_shapes_free_mesh(mesh.address());
    }

    // --- [ par_shapes_create_cylinder ] ---

    /** {@code par_shapes_mesh * par_shapes_create_cylinder(int slices, int stacks)} */
    public static native long npar_shapes_create_cylinder(int slices, int stacks);

    /** {@code par_shapes_mesh * par_shapes_create_cylinder(int slices, int stacks)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_cylinder(int slices, int stacks) {
        long __result = npar_shapes_create_cylinder(slices, stacks);
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_create_cone ] ---

    /** {@code par_shapes_mesh * par_shapes_create_cone(int slices, int stacks)} */
    public static native long npar_shapes_create_cone(int slices, int stacks);

    /** {@code par_shapes_mesh * par_shapes_create_cone(int slices, int stacks)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_cone(int slices, int stacks) {
        long __result = npar_shapes_create_cone(slices, stacks);
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_create_parametric_disk ] ---

    /** {@code par_shapes_mesh * par_shapes_create_parametric_disk(int slices, int stacks)} */
    public static native long npar_shapes_create_parametric_disk(int slices, int stacks);

    /** {@code par_shapes_mesh * par_shapes_create_parametric_disk(int slices, int stacks)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_parametric_disk(int slices, int stacks) {
        long __result = npar_shapes_create_parametric_disk(slices, stacks);
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_create_torus ] ---

    /** {@code par_shapes_mesh * par_shapes_create_torus(int slices, int stacks, float radius)} */
    public static native long npar_shapes_create_torus(int slices, int stacks, float radius);

    /** {@code par_shapes_mesh * par_shapes_create_torus(int slices, int stacks, float radius)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_torus(int slices, int stacks, float radius) {
        long __result = npar_shapes_create_torus(slices, stacks, radius);
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_create_parametric_sphere ] ---

    /** {@code par_shapes_mesh * par_shapes_create_parametric_sphere(int slices, int stacks)} */
    public static native long npar_shapes_create_parametric_sphere(int slices, int stacks);

    /** {@code par_shapes_mesh * par_shapes_create_parametric_sphere(int slices, int stacks)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_parametric_sphere(int slices, int stacks) {
        long __result = npar_shapes_create_parametric_sphere(slices, stacks);
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_create_subdivided_sphere ] ---

    /** {@code par_shapes_mesh * par_shapes_create_subdivided_sphere(int nsubdivisions)} */
    public static native long npar_shapes_create_subdivided_sphere(int nsubdivisions);

    /** {@code par_shapes_mesh * par_shapes_create_subdivided_sphere(int nsubdivisions)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_subdivided_sphere(int nsubdivisions) {
        long __result = npar_shapes_create_subdivided_sphere(nsubdivisions);
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_create_klein_bottle ] ---

    /** {@code par_shapes_mesh * par_shapes_create_klein_bottle(int slices, int stacks)} */
    public static native long npar_shapes_create_klein_bottle(int slices, int stacks);

    /** {@code par_shapes_mesh * par_shapes_create_klein_bottle(int slices, int stacks)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_klein_bottle(int slices, int stacks) {
        long __result = npar_shapes_create_klein_bottle(slices, stacks);
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_create_trefoil_knot ] ---

    /** {@code par_shapes_mesh * par_shapes_create_trefoil_knot(int slices, int stacks, float radius)} */
    public static native long npar_shapes_create_trefoil_knot(int slices, int stacks, float radius);

    /** {@code par_shapes_mesh * par_shapes_create_trefoil_knot(int slices, int stacks, float radius)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_trefoil_knot(int slices, int stacks, float radius) {
        long __result = npar_shapes_create_trefoil_knot(slices, stacks, radius);
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_create_hemisphere ] ---

    /** {@code par_shapes_mesh * par_shapes_create_hemisphere(int slices, int stacks)} */
    public static native long npar_shapes_create_hemisphere(int slices, int stacks);

    /** {@code par_shapes_mesh * par_shapes_create_hemisphere(int slices, int stacks)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_hemisphere(int slices, int stacks) {
        long __result = npar_shapes_create_hemisphere(slices, stacks);
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_create_plane ] ---

    /** {@code par_shapes_mesh * par_shapes_create_plane(int slices, int stacks)} */
    public static native long npar_shapes_create_plane(int slices, int stacks);

    /** {@code par_shapes_mesh * par_shapes_create_plane(int slices, int stacks)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_plane(int slices, int stacks) {
        long __result = npar_shapes_create_plane(slices, stacks);
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_create_icosahedron ] ---

    /** {@code par_shapes_mesh * par_shapes_create_icosahedron(void)} */
    public static native long npar_shapes_create_icosahedron();

    /** {@code par_shapes_mesh * par_shapes_create_icosahedron(void)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_icosahedron() {
        long __result = npar_shapes_create_icosahedron();
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_create_dodecahedron ] ---

    /** {@code par_shapes_mesh * par_shapes_create_dodecahedron(void)} */
    public static native long npar_shapes_create_dodecahedron();

    /** {@code par_shapes_mesh * par_shapes_create_dodecahedron(void)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_dodecahedron() {
        long __result = npar_shapes_create_dodecahedron();
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_create_octahedron ] ---

    /** {@code par_shapes_mesh * par_shapes_create_octahedron(void)} */
    public static native long npar_shapes_create_octahedron();

    /** {@code par_shapes_mesh * par_shapes_create_octahedron(void)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_octahedron() {
        long __result = npar_shapes_create_octahedron();
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_create_tetrahedron ] ---

    /** {@code par_shapes_mesh * par_shapes_create_tetrahedron(void)} */
    public static native long npar_shapes_create_tetrahedron();

    /** {@code par_shapes_mesh * par_shapes_create_tetrahedron(void)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_tetrahedron() {
        long __result = npar_shapes_create_tetrahedron();
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_create_cube ] ---

    /** {@code par_shapes_mesh * par_shapes_create_cube(void)} */
    public static native long npar_shapes_create_cube();

    /** {@code par_shapes_mesh * par_shapes_create_cube(void)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_cube() {
        long __result = npar_shapes_create_cube();
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_create_disk ] ---

    /** {@code par_shapes_mesh * par_shapes_create_disk(float radius, int slices, float const * center, float const * normal)} */
    public static native long npar_shapes_create_disk(float radius, int slices, long center, long normal);

    /** {@code par_shapes_mesh * par_shapes_create_disk(float radius, int slices, float const * center, float const * normal)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_disk(float radius, int slices, @NativeType("float const *") FloatBuffer center, @NativeType("float const *") FloatBuffer normal) {
        if (CHECKS) {
            check(center, 3);
            check(normal, 3);
        }
        long __result = npar_shapes_create_disk(radius, slices, memAddress(center), memAddress(normal));
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_create_empty ] ---

    /** {@code par_shapes_mesh * par_shapes_create_empty(void)} */
    public static native long npar_shapes_create_empty();

    /** {@code par_shapes_mesh * par_shapes_create_empty(void)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_empty() {
        long __result = npar_shapes_create_empty();
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_create_rock ] ---

    /** {@code par_shapes_mesh * par_shapes_create_rock(int seed, int nsubdivisions)} */
    public static native long npar_shapes_create_rock(int seed, int nsubdivisions);

    /** {@code par_shapes_mesh * par_shapes_create_rock(int seed, int nsubdivisions)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_rock(int seed, int nsubdivisions) {
        long __result = npar_shapes_create_rock(seed, nsubdivisions);
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_create_lsystem ] ---

    /** {@code par_shapes_mesh * par_shapes_create_lsystem(char const * program, int slices, int maxdepth, par_shapes_rand_fn rand_fn, void * context)} */
    public static native long npar_shapes_create_lsystem(long program, int slices, int maxdepth, long rand_fn, long context);

    /** {@code par_shapes_mesh * par_shapes_create_lsystem(char const * program, int slices, int maxdepth, par_shapes_rand_fn rand_fn, void * context)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_lsystem(@NativeType("char const *") ByteBuffer program, int slices, int maxdepth, @NativeType("par_shapes_rand_fn") @Nullable ParShapesRandFnI rand_fn, @NativeType("void *") long context) {
        if (CHECKS) {
            checkNT1(program);
        }
        long __result = npar_shapes_create_lsystem(memAddress(program), slices, maxdepth, memAddressSafe(rand_fn), context);
        return ParShapesMesh.createSafe(__result);
    }

    /** {@code par_shapes_mesh * par_shapes_create_lsystem(char const * program, int slices, int maxdepth, par_shapes_rand_fn rand_fn, void * context)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_lsystem(@NativeType("char const *") CharSequence program, int slices, int maxdepth, @NativeType("par_shapes_rand_fn") @Nullable ParShapesRandFnI rand_fn, @NativeType("void *") long context) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(program, true);
            long programEncoded = stack.getPointerAddress();
            long __result = npar_shapes_create_lsystem(programEncoded, slices, maxdepth, memAddressSafe(rand_fn), context);
            return ParShapesMesh.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ par_shapes_export ] ---

    /** {@code void par_shapes_export(par_shapes_mesh const * mesh, char const * objfile)} */
    public static native void npar_shapes_export(long mesh, long objfile);

    /** {@code void par_shapes_export(par_shapes_mesh const * mesh, char const * objfile)} */
    public static void par_shapes_export(@NativeType("par_shapes_mesh const *") ParShapesMesh mesh, @NativeType("char const *") ByteBuffer objfile) {
        if (CHECKS) {
            checkNT1(objfile);
        }
        npar_shapes_export(mesh.address(), memAddress(objfile));
    }

    /** {@code void par_shapes_export(par_shapes_mesh const * mesh, char const * objfile)} */
    public static void par_shapes_export(@NativeType("par_shapes_mesh const *") ParShapesMesh mesh, @NativeType("char const *") CharSequence objfile) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(objfile, true);
            long objfileEncoded = stack.getPointerAddress();
            npar_shapes_export(mesh.address(), objfileEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ par_shapes_compute_aabb ] ---

    /** {@code void par_shapes_compute_aabb(par_shapes_mesh const * mesh, float * aabb)} */
    public static native void npar_shapes_compute_aabb(long mesh, long aabb);

    /** {@code void par_shapes_compute_aabb(par_shapes_mesh const * mesh, float * aabb)} */
    public static void par_shapes_compute_aabb(@NativeType("par_shapes_mesh const *") ParShapesMesh mesh, @NativeType("float *") FloatBuffer aabb) {
        if (CHECKS) {
            check(aabb, 6);
        }
        npar_shapes_compute_aabb(mesh.address(), memAddress(aabb));
    }

    // --- [ par_shapes_clone ] ---

    /** {@code par_shapes_mesh * par_shapes_clone(par_shapes_mesh const * mesh, par_shapes_mesh * target)} */
    public static native long npar_shapes_clone(long mesh, long target);

    /** {@code par_shapes_mesh * par_shapes_clone(par_shapes_mesh const * mesh, par_shapes_mesh * target)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_clone(@NativeType("par_shapes_mesh const *") ParShapesMesh mesh, @NativeType("par_shapes_mesh *") @Nullable ParShapesMesh target) {
        long __result = npar_shapes_clone(mesh.address(), memAddressSafe(target));
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_merge ] ---

    /** {@code void par_shapes_merge(par_shapes_mesh * dst, par_shapes_mesh const * src)} */
    public static native void npar_shapes_merge(long dst, long src);

    /** {@code void par_shapes_merge(par_shapes_mesh * dst, par_shapes_mesh const * src)} */
    public static void par_shapes_merge(@NativeType("par_shapes_mesh *") ParShapesMesh dst, @NativeType("par_shapes_mesh const *") ParShapesMesh src) {
        npar_shapes_merge(dst.address(), src.address());
    }

    // --- [ par_shapes_translate ] ---

    /** {@code void par_shapes_translate(par_shapes_mesh * mesh, float x, float y, float z)} */
    public static native void npar_shapes_translate(long mesh, float x, float y, float z);

    /** {@code void par_shapes_translate(par_shapes_mesh * mesh, float x, float y, float z)} */
    public static void par_shapes_translate(@NativeType("par_shapes_mesh *") ParShapesMesh mesh, float x, float y, float z) {
        npar_shapes_translate(mesh.address(), x, y, z);
    }

    // --- [ par_shapes_rotate ] ---

    /** {@code void par_shapes_rotate(par_shapes_mesh * mesh, float radians, float const * axis)} */
    public static native void npar_shapes_rotate(long mesh, float radians, long axis);

    /** {@code void par_shapes_rotate(par_shapes_mesh * mesh, float radians, float const * axis)} */
    public static void par_shapes_rotate(@NativeType("par_shapes_mesh *") ParShapesMesh mesh, float radians, @NativeType("float const *") FloatBuffer axis) {
        if (CHECKS) {
            check(axis, 3);
        }
        npar_shapes_rotate(mesh.address(), radians, memAddress(axis));
    }

    // --- [ par_shapes_scale ] ---

    /** {@code void par_shapes_scale(par_shapes_mesh * mesh, float x, float y, float z)} */
    public static native void npar_shapes_scale(long mesh, float x, float y, float z);

    /** {@code void par_shapes_scale(par_shapes_mesh * mesh, float x, float y, float z)} */
    public static void par_shapes_scale(@NativeType("par_shapes_mesh *") ParShapesMesh mesh, float x, float y, float z) {
        npar_shapes_scale(mesh.address(), x, y, z);
    }

    // --- [ par_shapes_merge_and_free ] ---

    /** {@code void par_shapes_merge_and_free(par_shapes_mesh * dst, par_shapes_mesh * src)} */
    public static native void npar_shapes_merge_and_free(long dst, long src);

    /** {@code void par_shapes_merge_and_free(par_shapes_mesh * dst, par_shapes_mesh * src)} */
    public static void par_shapes_merge_and_free(@NativeType("par_shapes_mesh *") ParShapesMesh dst, @NativeType("par_shapes_mesh *") ParShapesMesh src) {
        npar_shapes_merge_and_free(dst.address(), src.address());
    }

    // --- [ par_shapes_invert ] ---

    /** {@code void par_shapes_invert(par_shapes_mesh * mesh, int startface, int nfaces)} */
    public static native void npar_shapes_invert(long mesh, int startface, int nfaces);

    /** {@code void par_shapes_invert(par_shapes_mesh * mesh, int startface, int nfaces)} */
    public static void par_shapes_invert(@NativeType("par_shapes_mesh *") ParShapesMesh mesh, int startface, int nfaces) {
        npar_shapes_invert(mesh.address(), startface, nfaces);
    }

    // --- [ par_shapes_remove_degenerate ] ---

    /** {@code void par_shapes_remove_degenerate(par_shapes_mesh * mesh, float minarea)} */
    public static native void npar_shapes_remove_degenerate(long mesh, float minarea);

    /** {@code void par_shapes_remove_degenerate(par_shapes_mesh * mesh, float minarea)} */
    public static void par_shapes_remove_degenerate(@NativeType("par_shapes_mesh *") ParShapesMesh mesh, float minarea) {
        npar_shapes_remove_degenerate(mesh.address(), minarea);
    }

    // --- [ par_shapes_unweld ] ---

    /** {@code void par_shapes_unweld(par_shapes_mesh * mesh, bool create_indices)} */
    public static native void npar_shapes_unweld(long mesh, boolean create_indices);

    /** {@code void par_shapes_unweld(par_shapes_mesh * mesh, bool create_indices)} */
    public static void par_shapes_unweld(@NativeType("par_shapes_mesh *") ParShapesMesh mesh, @NativeType("bool") boolean create_indices) {
        npar_shapes_unweld(mesh.address(), create_indices);
    }

    // --- [ par_shapes_weld ] ---

    /** {@code par_shapes_mesh * par_shapes_weld(par_shapes_mesh const * mesh, float epsilon, PAR_SHAPES_T * mapping)} */
    public static native long npar_shapes_weld(long mesh, float epsilon, long mapping);

    /** {@code par_shapes_mesh * par_shapes_weld(par_shapes_mesh const * mesh, float epsilon, PAR_SHAPES_T * mapping)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_weld(@NativeType("par_shapes_mesh const *") ParShapesMesh mesh, float epsilon, @NativeType("PAR_SHAPES_T *") @Nullable IntBuffer mapping) {
        if (CHECKS) {
            checkSafe(mapping, mesh.npoints());
        }
        long __result = npar_shapes_weld(mesh.address(), epsilon, memAddressSafe(mapping));
        return ParShapesMesh.createSafe(__result);
    }

    // --- [ par_shapes_compute_normals ] ---

    /** {@code void par_shapes_compute_normals(par_shapes_mesh * mesh)} */
    public static native void npar_shapes_compute_normals(long mesh);

    /** {@code void par_shapes_compute_normals(par_shapes_mesh * mesh)} */
    public static void par_shapes_compute_normals(@NativeType("par_shapes_mesh *") ParShapesMesh mesh) {
        npar_shapes_compute_normals(mesh.address());
    }

    // --- [ par_shapes_set_epsilon_welded_normals ] ---

    /** {@code void par_shapes_set_epsilon_welded_normals(float epsilon)} */
    public static native void par_shapes_set_epsilon_welded_normals(float epsilon);

    // --- [ par_shapes_set_epsilon_degenerate_sphere ] ---

    /** {@code void par_shapes_set_epsilon_degenerate_sphere(float epsilon)} */
    public static native void par_shapes_set_epsilon_degenerate_sphere(float epsilon);

    // --- [ par_shapes__compute_welded_normals ] ---

    /** {@code void par_shapes__compute_welded_normals(par_shapes_mesh * m)} */
    public static native void npar_shapes__compute_welded_normals(long m);

    /** {@code void par_shapes__compute_welded_normals(par_shapes_mesh * m)} */
    public static void par_shapes__compute_welded_normals(@NativeType("par_shapes_mesh *") ParShapesMesh m) {
        npar_shapes__compute_welded_normals(m.address());
    }

    // --- [ par_shapes__connect ] ---

    /** {@code void par_shapes__connect(par_shapes_mesh * scene, par_shapes_mesh * cylinder, int slices)} */
    public static native void npar_shapes__connect(long scene, long cylinder, int slices);

    /** {@code void par_shapes__connect(par_shapes_mesh * scene, par_shapes_mesh * cylinder, int slices)} */
    public static void par_shapes__connect(@NativeType("par_shapes_mesh *") ParShapesMesh scene, @NativeType("par_shapes_mesh *") ParShapesMesh cylinder, int slices) {
        npar_shapes__connect(scene.address(), cylinder.address(), slices);
    }

    /** {@code par_shapes_mesh * par_shapes_create_disk(float radius, int slices, float const * center, float const * normal)} */
    public static native long npar_shapes_create_disk(float radius, int slices, float[] center, float[] normal);

    /** {@code par_shapes_mesh * par_shapes_create_disk(float radius, int slices, float const * center, float const * normal)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_create_disk(float radius, int slices, @NativeType("float const *") float[] center, @NativeType("float const *") float[] normal) {
        if (CHECKS) {
            check(center, 3);
            check(normal, 3);
        }
        long __result = npar_shapes_create_disk(radius, slices, center, normal);
        return ParShapesMesh.createSafe(__result);
    }

    /** {@code void par_shapes_compute_aabb(par_shapes_mesh const * mesh, float * aabb)} */
    public static native void npar_shapes_compute_aabb(long mesh, float[] aabb);

    /** {@code void par_shapes_compute_aabb(par_shapes_mesh const * mesh, float * aabb)} */
    public static void par_shapes_compute_aabb(@NativeType("par_shapes_mesh const *") ParShapesMesh mesh, @NativeType("float *") float[] aabb) {
        if (CHECKS) {
            check(aabb, 6);
        }
        npar_shapes_compute_aabb(mesh.address(), aabb);
    }

    /** {@code void par_shapes_rotate(par_shapes_mesh * mesh, float radians, float const * axis)} */
    public static native void npar_shapes_rotate(long mesh, float radians, float[] axis);

    /** {@code void par_shapes_rotate(par_shapes_mesh * mesh, float radians, float const * axis)} */
    public static void par_shapes_rotate(@NativeType("par_shapes_mesh *") ParShapesMesh mesh, float radians, @NativeType("float const *") float[] axis) {
        if (CHECKS) {
            check(axis, 3);
        }
        npar_shapes_rotate(mesh.address(), radians, axis);
    }

    /** {@code par_shapes_mesh * par_shapes_weld(par_shapes_mesh const * mesh, float epsilon, PAR_SHAPES_T * mapping)} */
    public static native long npar_shapes_weld(long mesh, float epsilon, int[] mapping);

    /** {@code par_shapes_mesh * par_shapes_weld(par_shapes_mesh const * mesh, float epsilon, PAR_SHAPES_T * mapping)} */
    @NativeType("par_shapes_mesh *")
    public static @Nullable ParShapesMesh par_shapes_weld(@NativeType("par_shapes_mesh const *") ParShapesMesh mesh, float epsilon, @NativeType("PAR_SHAPES_T *") int @Nullable [] mapping) {
        if (CHECKS) {
            checkSafe(mapping, mesh.npoints());
        }
        long __result = npar_shapes_weld(mesh.address(), epsilon, mapping);
        return ParShapesMesh.createSafe(__result);
    }

}