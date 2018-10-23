/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

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
public interface CUstreamCallbackI extends CallbackI.V {

    String SIGNATURE = Callback.__stdcall("(pip)v");

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgPointer(args)
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