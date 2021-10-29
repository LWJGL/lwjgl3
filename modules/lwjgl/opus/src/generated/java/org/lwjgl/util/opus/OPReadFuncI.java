/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be set to {@link OpusFileCallbacks}.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * int (*{@link #invoke}) (
 *     void *_stream,
 *     unsigned char *_ptr,
 *     int _nbytes
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("op_read_func")
public interface OPReadFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_sint32,
        ffi_type_pointer, ffi_type_pointer, ffi_type_sint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * Reads up to {@code _nbytes} bytes of data from {@code _stream}.
     *
     * @param _stream the stream to read from
     * @param _ptr    the buffer to store the data in
     * @param _nbytes the maximum number of bytes to read. This function may return fewer, though it will not return zero unless it reaches end-of-file.
     *
     * @return the number of bytes successfully read, or a negative value on error
     */
    int invoke(@NativeType("void *") long _stream, @NativeType("unsigned char *") long _ptr, int _nbytes);

}