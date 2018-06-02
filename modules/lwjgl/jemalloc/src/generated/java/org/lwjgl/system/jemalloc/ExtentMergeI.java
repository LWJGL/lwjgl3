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
 *     void *addr_a,
 *     size_t size_a,
 *     void *addr_b,
 *     size_t size_b,
 *     bool committed,
 *     unsigned int arena_ind
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("extent_merge_t")
public interface ExtentMergeI extends CallbackI.Z {

    String SIGNATURE = "(pppppBi)B";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default boolean callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgBool(args),
            dcbArgInt(args)
        );
    }

    /**
     * Extent merge hook.
     * 
     * <p>An extent merge function conforms to the {@code extent_merge_t} type and optionally merges adjacent extents, at given {@code addr_a} and {@code size_a}
     * with given {@code addr_b} and {@code size_b} into one contiguous extent, operating on {@code committed}/decommitted memory as indicated, on behalf of arena
     * {@code arena_ind}, returning false upon success. If the function returns true, this indicates that the extents remain distinct mappings and therefore
     * should continue to be operated on independently.</p>
     */
    @NativeType("bool") boolean invoke(@NativeType("extent_hooks_t *") long extent_hooks, @NativeType("void *") long addr_a, @NativeType("size_t") long size_a, @NativeType("void *") long addr_b, @NativeType("size_t") long size_b, @NativeType("bool") boolean committed, @NativeType("unsigned int") int arena_ind);

}