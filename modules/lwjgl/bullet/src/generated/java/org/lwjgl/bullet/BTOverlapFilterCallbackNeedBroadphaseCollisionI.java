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
 *     btBroadphaseProxy *proxy0,
 *     btBroadphaseProxy *proxy1
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("p_btOverlapFilterCallback_needBroadphaseCollision")
public interface BTOverlapFilterCallbackNeedBroadphaseCollisionI extends CallbackI.Z {

    String SIGNATURE = "(pp)B";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default boolean callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    @NativeType("bool") boolean invoke(@NativeType("btBroadphaseProxy *") long proxy0, @NativeType("btBroadphaseProxy *") long proxy1);

}