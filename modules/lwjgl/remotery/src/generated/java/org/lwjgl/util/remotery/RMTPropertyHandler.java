/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke rmtPropertyHandlerPtr} */
public abstract class RMTPropertyHandler extends Callback implements RMTPropertyHandlerI {

    /**
     * Creates a {@code RMTPropertyHandler} instance from the specified function pointer.
     *
     * @return the new {@code RMTPropertyHandler}
     */
    public static RMTPropertyHandler create(long functionPointer) {
        RMTPropertyHandlerI instance = Callback.get(functionPointer);
        return instance instanceof RMTPropertyHandler
            ? (RMTPropertyHandler)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RMTPropertyHandler createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RMTPropertyHandler} instance that delegates to the specified {@code RMTPropertyHandlerI} instance. */
    public static RMTPropertyHandler create(RMTPropertyHandlerI instance) {
        return instance instanceof RMTPropertyHandler
            ? (RMTPropertyHandler)instance
            : new Container(instance.address(), instance);
    }

    protected RMTPropertyHandler() {
        super(CIF);
    }

    RMTPropertyHandler(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RMTPropertyHandler {

        private final RMTPropertyHandlerI delegate;

        Container(long functionPointer, RMTPropertyHandlerI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long cbk_context, long root) {
            delegate.invoke(cbk_context, root);
        }

    }

}