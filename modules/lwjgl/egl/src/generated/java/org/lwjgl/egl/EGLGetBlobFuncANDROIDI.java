/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

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
public interface EGLGetBlobFuncANDROIDI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    @NativeType("EGLsizeiANDROID") long invoke(@NativeType("void const *") long key, @NativeType("EGLsizeiANDROID") long keySize, @NativeType("void *") long value, @NativeType("EGLsizeiANDROID") long valueSize);

}