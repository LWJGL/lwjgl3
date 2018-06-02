/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link CL10#clEnqueueNativeKernel EnqueueNativeKernel} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     void *args
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (void *)")
public interface CLNativeKernelI extends CallbackI.V {

    String SIGNATURE = Callback.__stdcall("(p)v");

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args)
        );
    }

    /**
     * Will be called by the OpenCL using {@link CL10#clEnqueueNativeKernel EnqueueNativeKernel}.
     *
     * @param args a pointer to the arguments list
     */
    void invoke(@NativeType("void *") long args);

}