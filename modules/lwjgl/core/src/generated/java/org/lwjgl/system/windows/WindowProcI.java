/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * An application-defined function that processes messages sent to a window.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * LRESULT (*) (
 *     HWND hwnd,
 *     UINT uMsg,
 *     WPARAM wParam,
 *     LPARAM lParam
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("WNDPROC")
public interface WindowProcI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /**
     * Will be called for each message sent to the window.
     *
     * @param hwnd   a handle to the window procedure that received the message
     * @param uMsg   the message
     * @param wParam additional message information. The content of this parameter depends on the value of the {@code uMsg} parameter.
     * @param lParam additional message information. The content of this parameter depends on the value of the {@code uMsg} parameter.
     */
    @NativeType("LRESULT") long invoke(@NativeType("HWND") long hwnd, @NativeType("UINT") int uMsg, @NativeType("WPARAM") long wParam, @NativeType("LPARAM") long lParam);

}