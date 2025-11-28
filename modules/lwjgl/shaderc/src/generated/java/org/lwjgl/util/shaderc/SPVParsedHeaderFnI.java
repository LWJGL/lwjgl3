/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke spv_parsed_header_fn_t} */
@FunctionalInterface
@NativeType("spv_parsed_header_fn_t")
public interface SPVParsedHeaderFnI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_uint32,
            ffi_type_pointer, ffi_type_uint32, ffi_type_uint32, ffi_type_uint32, ffi_type_uint32, ffi_type_uint32, ffi_type_uint32
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 6 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code spv_result_t (* spv_parsed_header_fn_t) (void * user_data, spv_endianness_t endian, uint32_t magic, uint32_t version, uint32_t generator, uint32_t id_bound, uint32_t reserved)} */
    @NativeType("spv_result_t") int invoke(@NativeType("void *") long user_data, @NativeType("spv_endianness_t") int endian, @NativeType("uint32_t") int magic, @NativeType("uint32_t") int version, @NativeType("uint32_t") int generator, @NativeType("uint32_t") int id_bound, @NativeType("uint32_t") int reserved);

}