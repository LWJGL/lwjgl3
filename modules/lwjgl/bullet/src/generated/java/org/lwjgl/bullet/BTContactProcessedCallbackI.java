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
 *     btManifoldPoint *cp,
 *     void *body0,
 *     void *body1
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ContactProcessedCallback")
public interface BTContactProcessedCallbackI extends CallbackI.Z {

    String SIGNATURE = "(ppp)B";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default boolean callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    @NativeType("bool") boolean invoke(@NativeType("btManifoldPoint *") long cp, @NativeType("void *") long body0, @NativeType("void *") long body1);

}