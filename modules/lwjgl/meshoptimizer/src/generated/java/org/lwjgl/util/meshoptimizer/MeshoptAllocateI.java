/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meshoptimizer;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link MeshOptimizer#meshopt_setAllocator setAllocator} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*) (
 *     size_t size
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void * (*) (size_t)")
public interface MeshoptAllocateI extends CallbackI.P {

    String SIGNATURE = "(p)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args)
        );
    }

    @NativeType("void *") long invoke(@NativeType("size_t") long size);

}