/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * btScalar (*) (
 *     void *convexResult,
 *     bool normalInWorldSpace
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("p_btCollisionWorld_ConvexResultCallback_addSingleResult")
public interface BTCollisionWorldConvexResultCallbackAddSingleResultI extends CallbackI.F {

    String SIGNATURE = "(pB)f";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default float callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgBool(args)
        );
    }

    @NativeType("btScalar") float invoke(@NativeType("void *") long convexResult, @NativeType("bool") boolean normalInWorldSpace);

}