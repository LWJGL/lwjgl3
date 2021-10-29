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
 * Instances of this interface may be set with {@link OpusEnc#OPE_SET_PACKET_CALLBACK_REQUEST SET_PACKET_CALLBACK_REQUEST}.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     void *user_data,
 *     unsigned char const *packet_ptr,
 *     opus_int32 packet_len,
 *     opus_uint32 flags
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ope_packet_func")
public interface OPEPacketFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_sint32, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE))
        );
    }

    /**
     * Called on every packet encoded (including header).
     *
     * @param user_data  user-defined data passed to the callback
     * @param packet_ptr packet data
     * @param packet_len number of bytes in the packet
     * @param flags      optional flags (none defined for now so zero)
     */
    void invoke(@NativeType("void *") long user_data, @NativeType("unsigned char const *") long packet_ptr, @NativeType("opus_int32") int packet_len, @NativeType("opus_uint32") int flags);

}