/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

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
public interface ExtentMergeI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint8,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_uint8, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        boolean __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetByte(memGetAddress(args + 5 * POINTER_SIZE)) != 0,
            memGetInt(memGetAddress(args + 6 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
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