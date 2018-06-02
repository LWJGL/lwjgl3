/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link ANDROIDBlobCache#eglSetBlobCacheFuncsANDROID SetBlobCacheFuncsANDROID} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     void const *key,
 *     EGLsizeiANDROID keySize,
 *     void const *value,
 *     EGLsizeiANDROID valueSize
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("EGLSetBlobFuncANDROID")
public interface EGLSetBlobFuncANDROIDI extends CallbackI.V {

    String SIGNATURE = Callback.__stdcall("(pppp)v");

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    void invoke(@NativeType("void const *") long key, @NativeType("EGLsizeiANDROID") long keySize, @NativeType("void const *") long value, @NativeType("EGLsizeiANDROID") long valueSize);

}