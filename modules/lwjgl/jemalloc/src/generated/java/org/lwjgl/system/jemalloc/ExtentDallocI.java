/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@link ExtentHooks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * bool (*) (
 *     extent_hooks_t *extent_hooks,
 *     void *addr,
 *     size_t size,
 *     bool committed,
 *     unsigned int arena_ind
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("extent_dalloc_t")
public interface ExtentDallocI extends CallbackI.Z {

    String SIGNATURE = "(pppBi)B";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default boolean callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgBool(args),
            dcbArgInt(args)
        );
    }

    /**
     * Extent deallocation hook.
     * 
     * <p>An extent deallocation function conforms to the {@code extent_dalloc_t} type and deallocates an extent at given {@code addr} and {@code size} with
     * {@code committed}/decommited memory as indicated, on behalf of arena {@code arena_ind}, returning false upon success. If the function returns true, this
     * indicates opt-out from deallocation; the virtual memory mapping associated with the extent remains mapped, in the same commit state, and available for
     * future use, in which case it will be automatically retained for later reuse.</p>
     */
    @NativeType("bool") boolean invoke(@NativeType("extent_hooks_t *") long extent_hooks, @NativeType("void *") long addr, @NativeType("size_t") long size, @NativeType("bool") boolean committed, @NativeType("unsigned int") int arena_ind);

}