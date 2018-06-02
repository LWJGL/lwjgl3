/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link Nuklear#nk_plot_function plot_function} function.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * float (*) (
 *     void *userdata,
 *     int index
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("nk_value_getter")
public interface NkValueGetterI extends CallbackI.F {

    String SIGNATURE = "(pi)f";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default float callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgInt(args)
        );
    }

    float invoke(@NativeType("void *") long userdata, int index);

}