/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@code nk_style_*} structs.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * float (*) (
 *     struct nk_command_buffer *buffer,
 *     nk_handle userdata
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("nk_draw_end")
public interface NkDrawEndCallbackI extends CallbackI.F {

    String SIGNATURE = "(pp)f";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default float callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    float invoke(@NativeType("struct nk_command_buffer *") long buffer, @NativeType("nk_handle") long userdata);

}