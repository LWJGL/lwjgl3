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
 *     char const *msg,
 *     double progress,
 *     double globalConcavity,
 *     size_t vertices
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("HACD_CallBackFunction")
public interface HACDCallBackFunctionI extends CallbackI.Z {

    String SIGNATURE = "(pddp)B";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default boolean callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgDouble(args),
            dcbArgDouble(args),
            dcbArgPointer(args)
        );
    }

    @NativeType("bool") boolean invoke(@NativeType("char const *") long msg, double progress, double globalConcavity, @NativeType("size_t") long vertices);

}