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
 *     size_t offset,
 *     size_t length,
 *     unsigned int arena_ind
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("extent_commit_t")
public interface ExtentCommitI extends CallbackI.Z {

    String SIGNATURE = "(pppppi)B";

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
            dcbArgInt(args)
        );
    }

    /**
     * Extent commit hook.
     * 
     * <p>An extent commit function conforms to the {@code extent_commit_t} type and commits zeroed physical memory to back pages within an extent at given
     * {@code addr} and {@code size} at {@code offset} bytes, extending for {@code length} on behalf of arena {@code arena_ind}, returning false upon success.
     * Committed memory may be committed in absolute terms as on a system that does not overcommit, or in implicit terms as on a system that overcommits and
     * satisfies physical memory needs on demand via soft page faults. If the function returns true, this indicates insufficient physical memory to satisfy the
     * request.</p>
     */
    @NativeType("bool") boolean invoke(@NativeType("extent_hooks_t *") long extent_hooks, @NativeType("void *") long addr, @NativeType("size_t") long size, @NativeType("size_t") long offset, @NativeType("size_t") long length, @NativeType("unsigned int") int arena_ind);

}