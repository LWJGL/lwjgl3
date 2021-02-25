/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

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
public interface CUoccupancyB2DSizeI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_pointer,
        ffi_type_sint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetInt(memGetAddress(args))
        );
        apiClosureRetP(ret, __result);
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