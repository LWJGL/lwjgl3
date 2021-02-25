/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * A callback function used to print a message from the library.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * int (*) (
 *     char const *msg,
 *     void *ctx
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("MDB_msg_func *")
public interface MDBMsgFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_sint32,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * A callback function used to print a message from the library.
     *
     * @param msg the string to be printed
     * @param ctx an arbitrary context pointer for the callback
     *
     * @return &lt; 0 on failure, &ge; 0 on success
     */
    int invoke(@NativeType("char const *") long msg, @NativeType("void *") long ctx);

}