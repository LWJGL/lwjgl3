/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link ParShapes#par_shapes_create_lsystem create_lsystem} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * float (*) (
 *     void *context
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("par_shapes_rand_fn")
public interface ParShapesRandFnI extends CallbackI.F {

    String SIGNATURE = "(p)f";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default float callback(long args) {
        return invoke(
            dcbArgPointer(args)
        );
    }

    float invoke(@NativeType("void *") long context);

}