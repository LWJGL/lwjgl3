/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Bindings to <a target="_blank" href="https://github.com/prideout/par/blob/master/par_streamlines.h">par_streamlines.h</a>, a single-file, zero-dependency, C99 library
 * that can triangulate wide lines and curves.
 */
public class ParStreamlines {

    static { LibPar.initialize(); }

    /**
     * Configures how the library assigns UV coordinates.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #PAR_U_MODE_NORMALIZED_DISTANCE PAR_U_MODE_NORMALIZED_DISTANCE} - This is the default.</li>
     * <li>{@link #PAR_U_MODE_DISTANCE PAR_U_MODE_DISTANCE} - Non-normalized distance along the curve.</li>
     * <li>{@link #PAR_U_MODE_SEGMENT_INDEX PAR_U_MODE_SEGMENT_INDEX} - Starts at zero for each curve, counts up.</li>
     * <li>{@link #PAR_U_MODE_SEGMENT_FRACTION PAR_U_MODE_SEGMENT_FRACTION} - 0.0, 1.0 / COUNT, 2.0 / COUNT, etc...</li>
     * </ul>
     */
    public static final int
        PAR_U_MODE_NORMALIZED_DISTANCE = 0,
        PAR_U_MODE_DISTANCE            = 1,
        PAR_U_MODE_SEGMENT_INDEX       = 2,
        PAR_U_MODE_SEGMENT_FRACTION    = 3;

    /** Enables 4 indices per triangle */
    public static final int PARSL_FLAG_WIREFRAME = 1 << 0;

    /** Populates {@code mesh.annotations} */
    public static final int PARSL_FLAG_ANNOTATIONS = 1 << 1;

    /** Populates {@code mesh.lengths} */
    public static final int PARSL_FLAG_SPINE_LENGTHS = 1 << 2;

    /** Populates {@code mesh.random_offsets} */
    public static final int PARSL_FLAG_RANDOM_OFFSETS = 1 << 3;

    /** Draws control points */
    public static final int PARSL_FLAG_CURVE_GUIPARSL_FLAG_DES = 1 << 4;

    protected ParStreamlines() {
        throw new UnsupportedOperationException();
    }

    // --- [ parsl_create_context ] ---

    public static native long nparsl_create_context(long config);

    @NativeType("parsl_context *")
    public static long parsl_create_context(@NativeType("parsl_config") ParSLConfig config) {
        return nparsl_create_context(config.address());
    }

    // --- [ parsl_destroy_context ] ---

    public static native void nparsl_destroy_context(long ctx);

    public static void parsl_destroy_context(@NativeType("parsl_context *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nparsl_destroy_context(ctx);
    }

    // --- [ parsl_mesh_from_lines ] ---

    /** Unsafe version of: {@link #parsl_mesh_from_lines mesh_from_lines} */
    public static native long nparsl_mesh_from_lines(long ctx, long spines);

    /** Low-level function that generates two triangles for each line segment. */
    @Nullable
    @NativeType("parsl_mesh *")
    public static ParSLMesh parsl_mesh_from_lines(@NativeType("parsl_context *") long ctx, @NativeType("parsl_spine_list") ParSLSpineList spines) {
        if (CHECKS) {
            check(ctx);
            ParSLSpineList.validate(spines.address());
        }
        long __result = nparsl_mesh_from_lines(ctx, spines.address());
        return ParSLMesh.createSafe(__result);
    }

    // --- [ parsl_mesh_from_streamlines ] ---

    /** Unsafe version of: {@link #parsl_mesh_from_streamlines mesh_from_streamlines} */
    public static native long nparsl_mesh_from_streamlines(long context, long advect, int first_tick, int num_ticks, long userdata);

    /** High-level function that can be used to visualize a vector field. */
    @Nullable
    @NativeType("parsl_mesh *")
    public static ParSLMesh parsl_mesh_from_streamlines(@NativeType("parsl_context *") long context, @NativeType("parsl_advection_callback") ParSLAdvectionCallbackI advect, @NativeType("uint32_t") int first_tick, @NativeType("uint32_t") int num_ticks, @NativeType("void *") long userdata) {
        if (CHECKS) {
            check(context);
            check(userdata);
        }
        long __result = nparsl_mesh_from_streamlines(context, advect.address(), first_tick, num_ticks, userdata);
        return ParSLMesh.createSafe(__result);
    }

    // --- [ parsl_mesh_from_curves_cubic ] ---

    /** Unsafe version of: {@link #parsl_mesh_from_curves_cubic mesh_from_curves_cubic} */
    public static native long nparsl_mesh_from_curves_cubic(long context, long spines);

    /**
     * High-level function that tessellates a series of curves into triangles, where each spine is a series of chained cubic Bézier curves.
     * 
     * <p>The first curve of each spine is defined by an endpoint, followed by two control points, followed by an endpoint. Every subsequent curve in the spine
     * is defined by a single control point followed by an endpoint. Only one control point is required because the first control point is computed via
     * reflection over the endpoint.</p>
     * 
     * <p>The number of vertices in each spine should be {@code 4+(n-1)*2} where {@code n} is the number of piecewise curves.</p>
     * 
     * <p>Each spine is equivalent to an SVG path that looks like {@code M C S S S}.</p>
     */
    @Nullable
    @NativeType("parsl_mesh *")
    public static ParSLMesh parsl_mesh_from_curves_cubic(@NativeType("parsl_context *") long context, @NativeType("parsl_spine_list") ParSLSpineList spines) {
        if (CHECKS) {
            check(context);
            ParSLSpineList.validate(spines.address());
        }
        long __result = nparsl_mesh_from_curves_cubic(context, spines.address());
        return ParSLMesh.createSafe(__result);
    }

    // --- [ parsl_mesh_from_curves_quadratic ] ---

    /** Unsafe version of: {@link #parsl_mesh_from_curves_quadratic mesh_from_curves_quadratic} */
    public static native long nparsl_mesh_from_curves_quadratic(long context, long spines);

    /**
     * High-level function that tessellates a series of curves into triangles, where each spine is a series of chained quadratic Bézier curves.
     * 
     * <p>The first curve of each spine is defined by an endpoint, followed by one control point, followed by an endpoint. Every subsequent curve in the spine is
     * defined by a single control point followed by an endpoint.</p>
     * 
     * <p>The number of vertices in each spine should be {@code 3+(n-1)*2} where {@code n} is the number of piecewise curves.</p>
     * 
     * <p>Each spine is equivalent to an SVG path that looks like {@code M Q M Q M Q}.</p>
     */
    @Nullable
    @NativeType("parsl_mesh *")
    public static ParSLMesh parsl_mesh_from_curves_quadratic(@NativeType("parsl_context *") long context, @NativeType("parsl_spine_list") ParSLSpineList spines) {
        if (CHECKS) {
            check(context);
            ParSLSpineList.validate(spines.address());
        }
        long __result = nparsl_mesh_from_curves_quadratic(context, spines.address());
        return ParSLMesh.createSafe(__result);
    }

}