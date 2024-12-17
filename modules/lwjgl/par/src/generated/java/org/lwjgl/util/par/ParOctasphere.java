/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ParOctasphere {

    static { LibPar.initialize(); }

    public static final int par_octasphere_PAR_OCTASPHERE_MAX_SUBDIVISIONS = 5;

    public static final int par_octasphere_UV_LATLONG = 0;

    public static final int par_octasphere_NORMALS_SMOOTH = 0;

    protected ParOctasphere() {
        throw new UnsupportedOperationException();
    }

    // --- [ par_octasphere_get_counts ] ---

    /** {@code void par_octasphere_get_counts(par_octasphere_config const * config, uint32_t * num_indices, uint32_t * num_vertices)} */
    public static native void npar_octasphere_get_counts(long config, long num_indices, long num_vertices);

    /** {@code void par_octasphere_get_counts(par_octasphere_config const * config, uint32_t * num_indices, uint32_t * num_vertices)} */
    public static void par_octasphere_get_counts(@NativeType("par_octasphere_config const *") ParOctasphereConfig config, @NativeType("uint32_t *") IntBuffer num_indices, @NativeType("uint32_t *") IntBuffer num_vertices) {
        if (CHECKS) {
            check(num_indices, 1);
            check(num_vertices, 1);
        }
        npar_octasphere_get_counts(config.address(), memAddress(num_indices), memAddress(num_vertices));
    }

    // --- [ par_octasphere_populate ] ---

    /** {@code void par_octasphere_populate(par_octasphere_config const * config, par_octasphere_mesh * mesh)} */
    public static native void npar_octasphere_populate(long config, long mesh);

    /** {@code void par_octasphere_populate(par_octasphere_config const * config, par_octasphere_mesh * mesh)} */
    public static void par_octasphere_populate(@NativeType("par_octasphere_config const *") ParOctasphereConfig config, @NativeType("par_octasphere_mesh *") ParOctasphereMesh mesh) {
        npar_octasphere_populate(config.address(), mesh.address());
    }

    /** {@code void par_octasphere_get_counts(par_octasphere_config const * config, uint32_t * num_indices, uint32_t * num_vertices)} */
    public static native void npar_octasphere_get_counts(long config, int[] num_indices, int[] num_vertices);

    /** {@code void par_octasphere_get_counts(par_octasphere_config const * config, uint32_t * num_indices, uint32_t * num_vertices)} */
    public static void par_octasphere_get_counts(@NativeType("par_octasphere_config const *") ParOctasphereConfig config, @NativeType("uint32_t *") int[] num_indices, @NativeType("uint32_t *") int[] num_vertices) {
        if (CHECKS) {
            check(num_indices, 1);
            check(num_vertices, 1);
        }
        npar_octasphere_get_counts(config.address(), num_indices, num_vertices);
    }

}