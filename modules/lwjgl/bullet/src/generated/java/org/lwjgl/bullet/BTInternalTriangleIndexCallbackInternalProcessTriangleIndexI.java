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
 *     btVector3 *triangle,
 *     int partId,
 *     int triangleIndex
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("p_btInternalTriangleIndexCallback_internalProcessTriangleIndex")
public interface BTInternalTriangleIndexCallbackInternalProcessTriangleIndexI extends CallbackI.V {

    String SIGNATURE = "(pii)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgInt(args)
        );
    }

    void invoke(@NativeType("btVector3 *") long triangle, int partId, int triangleIndex);

}