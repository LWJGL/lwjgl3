/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be passed to the {@link CU#cuStreamAddCallback StreamAddCallback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     CUstream hStream,
 *     CUresult status,
 *     void *userData
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (CUstream, CUresult, void *)")
public interface CUstreamCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_void,
        ffi_type_pointer, ffi_type_uint32, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
    }

    /**
     * CUDA stream callback.
     *
     * @param hStream  the stream the callback was added to, as passed to {@link CU#cuStreamAddCallback StreamAddCallback}. May be {@code NULL}.
     * @param status   CUDA_SUCCESS or any persistent error on the stream
     * @param userData user parameter provided at registration
     */
    void invoke(@NativeType("CUstream") long hStream, @NativeType("CUresult") int status, @NativeType("void *") long userData);

}