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
 *     void *addr,
 *     size_t size,
 *     size_t size_a,
 *     size_t size_b,
 *     bool committed,
 *     unsigned int arena_ind
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("extent_split_t")
public interface ExtentSplitI extends CallbackI {

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
     * Extent split hook.
     * 
     * <p>An extent split function conforms to the {@code extent_split_t} type and optionally splits an extent at given {@code addr} and {@code size} into two
     * adjacent extents, the first of {@code size_a} bytes, and the second of {@code size_b} bytes, operating on {@code committed}/decommitted memory as
     * indicated, on behalf of arena {@code arena_ind}, returning false upon success. If the function returns true, this indicates that the extent remains unsplit
     * and therefore should continue to be operated on as a whole.</p>
     */
    @NativeType("bool") boolean invoke(@NativeType("extent_hooks_t *") long extent_hooks, @NativeType("void *") long addr, @NativeType("size_t") long size, @NativeType("size_t") long size_a, @NativeType("size_t") long size_b, @NativeType("bool") boolean committed, @NativeType("unsigned int") int arena_ind);

}