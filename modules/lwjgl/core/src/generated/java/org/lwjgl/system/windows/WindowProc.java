/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke WNDPROC} */
public abstract class WindowProc extends Callback implements WindowProcI {

    /**
     * Creates a {@code WindowProc} instance from the specified function pointer.
     *
     * @return the new {@code WindowProc}
     */
    public static WindowProc create(long functionPointer) {
        WindowProcI instance = Callback.get(functionPointer);
        return instance instanceof WindowProc
            ? (WindowProc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable WindowProc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code WindowProc} instance that delegates to the specified {@code WindowProcI} instance. */
    public static WindowProc create(WindowProcI instance) {
        return instance instanceof WindowProc
            ? (WindowProc)instance
            : new Container(instance.address(), instance);
    }

    protected WindowProc() {
        super(CIF);
    }

    WindowProc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends WindowProc {

        private final WindowProcI delegate;

        Container(long functionPointer, WindowProcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long hwnd, int uMsg, long wParam, long lParam) {
            return delegate.invoke(hwnd, uMsg, wParam, lParam);
        }

    }

}