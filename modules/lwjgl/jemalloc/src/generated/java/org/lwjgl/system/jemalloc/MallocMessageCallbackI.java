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
 * Instances of this interface may be passed to the {@link JEmalloc#je_malloc_usable_size malloc_usable_size} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     void *cbopaque,
 *     char const *s
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (void *, char const *)")
public interface MallocMessageCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
    }

    /**
     * Will be called by the {@link JEmalloc#je_malloc_usable_size malloc_usable_size} method.
     *
     * @param cbopaque the opaque pointer passed to {@link JEmalloc#je_malloc_usable_size malloc_usable_size}
     * @param s        the message
     */
    void invoke(@NativeType("void *") long cbopaque, @NativeType("char const *") long s);

}