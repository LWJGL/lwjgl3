/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link CU100#cuLaunchHostFunc LaunchHostFunc} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     void *userData
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (void *)")
public interface CUhostFnI extends CallbackI.V {

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
     * CUDA host function.
     *
     * @param userData argument value passed to the function
     */
    void invoke(@NativeType("void *") long userData);

}