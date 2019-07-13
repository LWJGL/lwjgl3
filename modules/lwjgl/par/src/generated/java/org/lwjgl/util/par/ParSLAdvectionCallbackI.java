/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link ParStreamlines#parsl_mesh_from_streamlines mesh_from_streamlines} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     parsl_position *point,
 *     void *userdata
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("parsl_advection_callback")
public interface ParSLAdvectionCallbackI extends CallbackI.V {

    String SIGNATURE = "(pp)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    /** Client function that moves a streamline particle by a single time step. */
    void invoke(@NativeType("parsl_position *") long point, @NativeType("void *") long userdata);

}