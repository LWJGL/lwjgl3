/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

public class ParStreamlines {

    static { LibPar.initialize(); }

    public static final int
        PAR_U_MODE_NORMALIZED_DISTANCE = 0,
        PAR_U_MODE_DISTANCE            = 1,
        PAR_U_MODE_SEGMENT_INDEX       = 2,
        PAR_U_MODE_SEGMENT_FRACTION    = 3;

    public static final int
        PARSL_FLAG_WIREFRAME               = 1 << 0,
        PARSL_FLAG_ANNOTATIONS             = 1 << 1,
        PARSL_FLAG_SPINE_LENGTHS           = 1 << 2,
        PARSL_FLAG_RANDOM_OFFSETS          = 1 << 3,
        PARSL_FLAG_CURVE_GUIPARSL_FLAG_DES = 1 << 4;

    protected ParStreamlines() {
        throw new UnsupportedOperationException();
    }

    // --- [ parsl_create_context ] ---

    /** {@code parsl_context * parsl_create_context(parsl_config config)} */
    public static native long nparsl_create_context(long config);

    /** {@code parsl_context * parsl_create_context(parsl_config config)} */
    @NativeType("parsl_context *")
    public static long parsl_create_context(@NativeType("parsl_config") ParSLConfig config) {
        return nparsl_create_context(config.address());
    }

    // --- [ parsl_destroy_context ] ---

    /** {@code void parsl_destroy_context(parsl_context * ctx)} */
    public static native void nparsl_destroy_context(long ctx);

    /** {@code void parsl_destroy_context(parsl_context * ctx)} */
    public static void parsl_destroy_context(@NativeType("parsl_context *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nparsl_destroy_context(ctx);
    }

    // --- [ parsl_mesh_from_lines ] ---

    /** {@code parsl_mesh * parsl_mesh_from_lines(parsl_context * ctx, parsl_spine_list spines)} */
    public static native long nparsl_mesh_from_lines(long ctx, long spines);

    /** {@code parsl_mesh * parsl_mesh_from_lines(parsl_context * ctx, parsl_spine_list spines)} */
    @NativeType("parsl_mesh *")
    public static @Nullable ParSLMesh parsl_mesh_from_lines(@NativeType("parsl_context *") long ctx, @NativeType("parsl_spine_list") ParSLSpineList spines) {
        if (CHECKS) {
            check(ctx);
            ParSLSpineList.validate(spines.address());
        }
        long __result = nparsl_mesh_from_lines(ctx, spines.address());
        return ParSLMesh.createSafe(__result);
    }

    // --- [ parsl_mesh_from_streamlines ] ---

    /** {@code parsl_mesh * parsl_mesh_from_streamlines(parsl_context * context, parsl_advection_callback advect, uint32_t first_tick, uint32_t num_ticks, void * userdata)} */
    public static native long nparsl_mesh_from_streamlines(long context, long advect, int first_tick, int num_ticks, long userdata);

    /** {@code parsl_mesh * parsl_mesh_from_streamlines(parsl_context * context, parsl_advection_callback advect, uint32_t first_tick, uint32_t num_ticks, void * userdata)} */
    @NativeType("parsl_mesh *")
    public static @Nullable ParSLMesh parsl_mesh_from_streamlines(@NativeType("parsl_context *") long context, @NativeType("parsl_advection_callback") ParSLAdvectionCallbackI advect, @NativeType("uint32_t") int first_tick, @NativeType("uint32_t") int num_ticks, @NativeType("void *") long userdata) {
        if (CHECKS) {
            check(context);
            check(userdata);
        }
        long __result = nparsl_mesh_from_streamlines(context, advect.address(), first_tick, num_ticks, userdata);
        return ParSLMesh.createSafe(__result);
    }

    // --- [ parsl_mesh_from_curves_cubic ] ---

    /** {@code parsl_mesh * parsl_mesh_from_curves_cubic(parsl_context * context, parsl_spine_list spines)} */
    public static native long nparsl_mesh_from_curves_cubic(long context, long spines);

    /** {@code parsl_mesh * parsl_mesh_from_curves_cubic(parsl_context * context, parsl_spine_list spines)} */
    @NativeType("parsl_mesh *")
    public static @Nullable ParSLMesh parsl_mesh_from_curves_cubic(@NativeType("parsl_context *") long context, @NativeType("parsl_spine_list") ParSLSpineList spines) {
        if (CHECKS) {
            check(context);
            ParSLSpineList.validate(spines.address());
        }
        long __result = nparsl_mesh_from_curves_cubic(context, spines.address());
        return ParSLMesh.createSafe(__result);
    }

    // --- [ parsl_mesh_from_curves_quadratic ] ---

    /** {@code parsl_mesh * parsl_mesh_from_curves_quadratic(parsl_context * context, parsl_spine_list spines)} */
    public static native long nparsl_mesh_from_curves_quadratic(long context, long spines);

    /** {@code parsl_mesh * parsl_mesh_from_curves_quadratic(parsl_context * context, parsl_spine_list spines)} */
    @NativeType("parsl_mesh *")
    public static @Nullable ParSLMesh parsl_mesh_from_curves_quadratic(@NativeType("parsl_context *") long context, @NativeType("parsl_spine_list") ParSLSpineList spines) {
        if (CHECKS) {
            check(context);
            ParSLSpineList.validate(spines.address());
        }
        long __result = nparsl_mesh_from_curves_quadratic(context, spines.address());
        return ParSLMesh.createSafe(__result);
    }

}