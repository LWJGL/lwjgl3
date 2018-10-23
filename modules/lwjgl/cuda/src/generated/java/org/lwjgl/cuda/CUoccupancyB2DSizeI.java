/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link CU65#cuOccupancyMaxPotentialBlockSize OccupancyMaxPotentialBlockSize} and {@link CU65#cuOccupancyMaxPotentialBlockSizeWithFlags OccupancyMaxPotentialBlockSizeWithFlags} methods.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * size_t (*) (
 *     int blockSize
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("size_t (*) (int)")
public interface CUoccupancyB2DSizeI extends CallbackI.P {

    String SIGNATURE = Callback.__stdcall("(i)p");

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgInt(args)
        );
    }

    /**
     * Block size to per-block dynamic shared memory mapping for a certain kernel.
     *
     * @param blockSize block size of the kernel
     *
     * @return the dynamic shared memory needed by a block
     */
    @NativeType("size_t") long invoke(int blockSize);

}