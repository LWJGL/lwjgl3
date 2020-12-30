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
 *     btBroadphasePair *collisionPair,
 *     btCollisionDispatcher *dispatcher,
 *     btDispatcherInfo *dispatchInfo
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("btNearCallback")
public interface BTNearCallbackI extends CallbackI.V {

    String SIGNATURE = "(ppp)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    void invoke(@NativeType("btBroadphasePair *") long collisionPair, @NativeType("btCollisionDispatcher *") long dispatcher, @NativeType("btDispatcherInfo *") long dispatchInfo);

}