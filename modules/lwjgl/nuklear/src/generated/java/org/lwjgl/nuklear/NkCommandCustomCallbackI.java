/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*) (
 *     void *canvas,
 *     short x,
 *     short y,
 *     unsigned short w,
 *     unsigned short h,
 *     nk_handle callback_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("nk_command_custom_callback")
public interface NkCommandCustomCallbackI extends CallbackI.P {

    String SIGNATURE = "(pssssp)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgShort(args),
            dcbArgShort(args),
            dcbArgShort(args),
            dcbArgShort(args),
            dcbArgPointer(args)
        );
    }

    @NativeType("void *") long invoke(@NativeType("void *") long canvas, short x, short y, @NativeType("unsigned short") short w, @NativeType("unsigned short") short h, @NativeType("nk_handle") long callback_data);

}