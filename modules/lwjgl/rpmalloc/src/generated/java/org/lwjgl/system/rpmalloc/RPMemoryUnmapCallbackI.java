/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be set to the {@link RPMallocConfig} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     void *address,
 *     size_t size,
 *     size_t offset,
 *     int release
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (void *, size_t, size_t, int)")
public interface RPMemoryUnmapCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)) != 0
        );
    }

    /**
     * Unmap the memory pages starting at address and spanning the given number of bytes.
     * 
     * <p>If release is set to non-zero, the unmap is for an entire span range as returned by a previous call to {@code memory_map} and that the entire range
     * should be released. The release argument holds the size of the entire span range. If {@code release} is set to 0, the unmap is a partial decommit
     * of a subset of the mapped memory range.</p>
     * 
     * <p>If you set a {@code memory_unmap} function, you must also set a {@code memory_map} function or else the default implementation will be used for
     * both.</p>
     *
     * @param address the address to unmap
     * @param size    the size of the mapped pages, in bytes
     * @param offset  the alignment offset
     * @param release the release flag
     */
    void invoke(@NativeType("void *") long address, @NativeType("size_t") long size, @NativeType("size_t") long offset, @NativeType("int") boolean release);

}