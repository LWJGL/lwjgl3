/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * A mutation handler.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     id id
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("EnumerationMutationHandler")
public interface EnumerationMutationHandlerI extends CallbackI.V {

    String SIGNATURE = "(p)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args)
        );
    }

    /**
     * Will be called when an object is mutated during a foreach iteration.
     *
     * @param id the object that was mutated
     */
    void invoke(@NativeType("id") long id);

}