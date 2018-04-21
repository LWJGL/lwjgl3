/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@link RPMallocConfig} struct.
 * 
 * <h3>Type</h3>
 * 
 * <code><pre>
 * void (*) (
 *     void *address
 * )</pre></code>
 */
@FunctionalInterface
@NativeType("void (*) (void *)")
public interface RPMemoryOverwriteCallbackI extends CallbackI.V {

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
     * Debug callback if memory guards are enabled. Called if a memory overwrite is detected before or after the allocated memory block.
     *
     * @param address the allocated block around which memory overwrite was detected
     */
    void invoke(@NativeType("void *") long address);

}