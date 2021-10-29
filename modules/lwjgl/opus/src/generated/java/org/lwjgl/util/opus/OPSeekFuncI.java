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
 *     long long _offset,
 *     int _whence
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("op_seek_func")
public interface OPSeekFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_sint32,
        ffi_type_pointer, ffi_type_sint64, ffi_type_sint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetLong(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * Sets the position indicator for {@code _stream}.
     * 
     * <p>The new position, measured in bytes, is obtained by adding {@code _offset} bytes to the position specified by {@code _whence}. If {@code _whence} is
     * set to {@code SEEK_SET}, {@code SEEK_CUR}, or {@code SEEK_END}, the offset is relative to the start of the stream, the current position indicator, or
     * end-of-file, respectively.</p>
     *
     * @return {@code 0}: Success. {@code -1}: Seeking is not supported or an error occurred. {@code errno} need not be set.
     */
    int invoke(@NativeType("void *") long _stream, @NativeType("long long") long _offset, int _whence);

}