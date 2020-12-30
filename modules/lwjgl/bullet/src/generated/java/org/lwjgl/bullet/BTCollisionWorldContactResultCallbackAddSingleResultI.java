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
 *     void *cp,
 *     void *colObj0Wrap,
 *     int partId0,
 *     int index0,
 *     void *colObj1Wrap,
 *     int partId1,
 *     int index1
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("p_btCollisionWorld_ContactResultCallback_addSingleResult")
public interface BTCollisionWorldContactResultCallbackAddSingleResultI extends CallbackI.F {

    String SIGNATURE = "(ppiipii)f";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default float callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgInt(args),
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgInt(args)
        );
    }

    @NativeType("btScalar") float invoke(@NativeType("void *") long cp, @NativeType("void *") long colObj0Wrap, int partId0, int index0, @NativeType("void *") long colObj1Wrap, int partId1, int index1);

}