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
@NativeType("ContactAddedCallback")
public interface BTContactAddedCallbackI extends CallbackI.Z {

    String SIGNATURE = "(ppiipii)B";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default boolean callback(long args) {
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

    @NativeType("bool") boolean invoke(@NativeType("void *") long cp, @NativeType("void *") long colObj0Wrap, int partId0, int index0, @NativeType("void *") long colObj1Wrap, int partId1, int index1);

}