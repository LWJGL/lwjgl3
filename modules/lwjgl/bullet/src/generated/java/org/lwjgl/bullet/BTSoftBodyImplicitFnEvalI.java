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
 *     btVector3 const *x
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("p_btSoftBody_ImplicitFn_Eval")
public interface BTSoftBodyImplicitFnEvalI extends CallbackI.F {

    String SIGNATURE = "(p)f";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default float callback(long args) {
        return invoke(
            dcbArgPointer(args)
        );
    }

    @NativeType("btScalar") float invoke(@NativeType("btVector3 const *") long x);

}