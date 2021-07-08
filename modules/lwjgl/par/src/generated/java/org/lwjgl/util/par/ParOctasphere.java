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

/**
 * Bindings to <a target="_blank" href="https://prideout.net/blog/octasphere">par_octasphere.h</a>, a tiny malloc-free library that generates triangle meshes for spheres,
 * rounded boxes, and capsules.
 * 
 * <p>Usage example:</p>
 * 
 * <pre><code>
 * // Specify a 100x100x20 rounded box.
 * const par_octasphere_config cfg = {
 *   .corner_radius = 5,
 *   .width = 100,
 *   .height = 100,
 *   .depth = 20,
 *   .num_subdivisions = 3,
 * };
 * 
 * // Allocate memory for the mesh and opt-out of normals.
 * uint32_t num_indices;
 * uint32_t num_vertices;
 * par_octasphere_get_counts(&amp;cfg, &amp;num_indices, &amp;num_vertices);
 * par_octasphere_mesh mesh = {
 *   .positions = malloc(sizeof(float) * 3 * num_vertices),
 *   .normals = NULL,
 *   .texcoords = malloc(sizeof(float) * 2 * num_vertices),
 *   .indices = malloc(sizeof(uint16_t) * num_indices),
 * };
 * 
 * // Generate vertex coordinates, UV's, and triangle indices.
 * par_octasphere_populate(&amp;cfg, &amp;mesh);</code></pre>
 * 
 * <p>To generate a sphere: set width, height, and depth to 0 in your configuration. To generate a capsule shape: set only two of these dimensions to 0.</p>
 */
public class ParOctasphere {

    static { LibPar.initialize(); }

    public static final int par_octasphere_PAR_OCTASPHERE_MAX_SUBDIVISIONS = 5;

    /** {@code par_octasphere_uv_mode} */
    public static final int par_octasphere_UV_LATLONG = 0;

    /** {@code par_octasphere_normals_mode} */
    public static final int par_octasphere_NORMALS_SMOOTH = 0;

    protected ParOctasphere() {
        throw new UnsupportedOperationException();
    }

    // --- [ par_octasphere_get_counts ] ---

    /** Unsafe version of: {@link #par_octasphere_get_counts get_counts} */
    public static native void npar_octasphere_get_counts(long config, long num_indices, long num_vertices);

    /** Computes the maximum possible number of indices and vertices for the given octasphere config. */
    public static void par_octasphere_get_counts(@NativeType("par_octasphere_config const *") ParOctasphereConfig config, @NativeType("uint32_t *") IntBuffer num_indices, @NativeType("uint32_t *") IntBuffer num_vertices) {
        if (CHECKS) {
            check(num_indices, 1);
            check(num_vertices, 1);
        }
        npar_octasphere_get_counts(config.address(), memAddress(num_indices), memAddress(num_vertices));
    }

    // --- [ par_octasphere_populate ] ---

    /** Unsafe version of: {@link #par_octasphere_populate populate} */
    public static native void npar_octasphere_populate(long config, long mesh);

    /** Populates a pre-allocated mesh structure with indices and vertices. */
    public static void par_octasphere_populate(@NativeType("par_octasphere_config const *") ParOctasphereConfig config, @NativeType("par_octasphere_mesh *") ParOctasphereMesh mesh) {
        npar_octasphere_populate(config.address(), mesh.address());
    }

    /** Array version of: {@link #npar_octasphere_get_counts} */
    public static native void npar_octasphere_get_counts(long config, int[] num_indices, int[] num_vertices);

    /** Array version of: {@link #par_octasphere_get_counts get_counts} */
    public static void par_octasphere_get_counts(@NativeType("par_octasphere_config const *") ParOctasphereConfig config, @NativeType("uint32_t *") int[] num_indices, @NativeType("uint32_t *") int[] num_vertices) {
        if (CHECKS) {
            check(num_indices, 1);
            check(num_vertices, 1);
        }
        npar_octasphere_get_counts(config.address(), num_indices, num_vertices);
    }

}