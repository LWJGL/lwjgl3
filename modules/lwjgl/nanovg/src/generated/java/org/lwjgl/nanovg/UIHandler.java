/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke UIhandler} */
public abstract class UIHandler extends Callback implements UIHandlerI {

    /**
     * Creates a {@code UIHandler} instance from the specified function pointer.
     *
     * @return the new {@code UIHandler}
     */
    public static UIHandler create(long functionPointer) {
        UIHandlerI instance = Callback.get(functionPointer);
        return instance instanceof UIHandler
            ? (UIHandler)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable UIHandler createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code UIHandler} instance that delegates to the specified {@code UIHandlerI} instance. */
    public static UIHandler create(UIHandlerI instance) {
        return instance instanceof UIHandler
            ? (UIHandler)instance
            : new Container(instance.address(), instance);
    }

    protected UIHandler() {
        super(CIF);
    }

    UIHandler(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends UIHandler {

        private final UIHandlerI delegate;

        Container(long functionPointer, UIHandlerI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int item, int event) {
            delegate.invoke(item, event);
        }

    }

}