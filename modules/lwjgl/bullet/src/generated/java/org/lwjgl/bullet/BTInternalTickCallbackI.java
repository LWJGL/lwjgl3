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
 * void (*) (
 *     void *world,
 *     btScalar timeStep
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("btInternalTickCallback")
public interface BTInternalTickCallbackI extends CallbackI.V {

    String SIGNATURE = "(pf)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgFloat(args)
        );
    }

    void invoke(@NativeType("void *") long world, @NativeType("btScalar") float timeStep);

}