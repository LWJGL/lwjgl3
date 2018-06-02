/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*) (
 *     void *mm_context,
 *     rmtU32 size
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("rmtMallocPtr")
public interface RMTMallocI extends CallbackI.P {

    String SIGNATURE = "(pi)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgInt(args)
        );
    }

    @NativeType("void *") long invoke(@NativeType("void *") long mm_context, @NativeType("rmtU32") int size);

}