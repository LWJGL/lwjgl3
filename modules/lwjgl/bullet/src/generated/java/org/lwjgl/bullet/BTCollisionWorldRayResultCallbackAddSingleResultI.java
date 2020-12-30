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
 *     void *rayResult,
 *     bool normalInWorldSpace
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("p_btCollisionWorld_RayResultCallback_addSingleResult")
public interface BTCollisionWorldRayResultCallbackAddSingleResultI extends CallbackI.F {

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

    @NativeType("btScalar") float invoke(@NativeType("void *") long rayResult, @NativeType("bool") boolean normalInWorldSpace);

}