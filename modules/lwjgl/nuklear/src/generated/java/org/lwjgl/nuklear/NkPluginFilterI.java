/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@link NkTextEdit} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * nk_bool (*) (
 *     struct nk_text_edit const *edit,
 *     nk_rune unicode
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("nk_plugin_filter")
public interface NkPluginFilterI extends CallbackI.Z {

    String SIGNATURE = "(pi)B";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default boolean callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgInt(args)
        );
    }

    @NativeType("nk_bool") boolean invoke(@NativeType("struct nk_text_edit const *") long edit, @NativeType("nk_rune") int unicode);

}