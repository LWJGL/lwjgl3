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
 * bool (*) (
 *     btBroadphaseProxy *proxy
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("p_btBroadphaseAabbCallback_process")
public interface BTBroadphaseAabbCallbackProcessI extends CallbackI.Z {

    String SIGNATURE = "(p)B";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default boolean callback(long args) {
        return invoke(
            dcbArgPointer(args)
        );
    }

    @NativeType("bool") boolean invoke(@NativeType("btBroadphaseProxy *") long proxy);

}