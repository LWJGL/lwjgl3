/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class XrVoidFunction extends Callback implements XrVoidFunctionI {

    /**
     * Creates a {@code XrVoidFunction} instance from the specified function pointer.
     *
     * @return the new {@code XrVoidFunction}
     */
    public static XrVoidFunction create(long functionPointer) {
        XrVoidFunctionI instance = Callback.get(functionPointer);
        return instance instanceof XrVoidFunction
            ? (XrVoidFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static XrVoidFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code XrVoidFunction} instance that delegates to the specified {@code XrVoidFunctionI} instance. */
    public static XrVoidFunction create(XrVoidFunctionI instance) {
        return instance instanceof XrVoidFunction
            ? (XrVoidFunction)instance
            : new Container(instance.address(), instance);
    }

    protected XrVoidFunction() {
        super(SIGNATURE);
    }

    XrVoidFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends XrVoidFunction {

        private final XrVoidFunctionI delegate;

        Container(long functionPointer, XrVoidFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke() {
            delegate.invoke();
        }

    }

}