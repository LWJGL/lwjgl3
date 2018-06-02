/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

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
public interface WindowProcI extends CallbackI.P {

    String SIGNATURE = Callback.__stdcall("(pipp)p");

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
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