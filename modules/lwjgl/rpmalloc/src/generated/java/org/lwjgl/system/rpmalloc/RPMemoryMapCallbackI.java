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
 * void * (*) (
 *     size_t size,
 *     size_t *offset
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void * (*) (size_t, size_t *)")
public interface RPMemoryMapCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /**
     * Map memory pages for the given number of bytes.
     * 
     * <p>The returned address MUST be aligned to the rpmalloc span size, which will always be a power of two. Optionally the function can store an alignment
     * offset in the offset variable in case it performs alignment and the returned pointer is offset from the actual start of the memory region due to this
     * alignment. The alignment offset will be passed to the memory unmap function. The alignment offset MUST NOT be larger than 65535 (storable in an
     * {@code uint16_t}), if it is you must use natural alignment to shift it into 16 bits.</p>
     * 
     * <p>If you set a {@code memory_map} function, you must also set a {@code memory_unmap} function or else the default implementation will be used for
     * both.</p>
     *
     * @param size   the number of bytes to map
     * @param offset the alignment offset
     */
    @NativeType("void *") long invoke(@NativeType("size_t") long size, @NativeType("size_t *") long offset);

}