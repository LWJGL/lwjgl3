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
 * EGLsizeiANDROID (*) (
 *     void const *key,
 *     EGLsizeiANDROID keySize,
 *     void *value,
 *     EGLsizeiANDROID valueSize
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("EGLGetBlobFuncANDROID")
public interface EGLGetBlobFuncANDROIDI extends CallbackI.P {

    String SIGNATURE = Callback.__stdcall("(pppp)p");

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    @NativeType("EGLsizeiANDROID") long invoke(@NativeType("void const *") long key, @NativeType("EGLsizeiANDROID") long keySize, @NativeType("void *") long value, @NativeType("EGLsizeiANDROID") long valueSize);

}