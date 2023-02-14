/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*{@link #invoke}) (
 *     void *sequenceProducerState,
 *     ZSTD_Sequence *outSeqs,
 *     size_t outSeqsCapacity,
 *     void const *src,
 *     size_t srcSize,
 *     void const *dict,
 *     size_t dictSize,
 *     int compressionLevel,
 *     size_t windowSize
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ZSTD_sequenceProducer_F *")
public interface ZSTDSequenceProducerI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_sint32, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 6 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 7 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 8 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    @NativeType("void *") long invoke(@NativeType("void *") long sequenceProducerState, @NativeType("ZSTD_Sequence *") long outSeqs, @NativeType("size_t") long outSeqsCapacity, @NativeType("void const *") long src, @NativeType("size_t") long srcSize, @NativeType("void const *") long dict, @NativeType("size_t") long dictSize, int compressionLevel, @NativeType("size_t") long windowSize);

}