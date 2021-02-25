/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*) (
 *     char const *text,
 *     void *context
 * )</code></pre>
 */
public abstract class RMTInputHandler extends Callback implements RMTInputHandlerI {

    /**
     * Creates a {@code RMTInputHandler} instance from the specified function pointer.
     *
     * @return the new {@code RMTInputHandler}
     */
    public static RMTInputHandler create(long functionPointer) {
        RMTInputHandlerI instance = Callback.get(functionPointer);
        return instance instanceof RMTInputHandler
            ? (RMTInputHandler)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static RMTInputHandler createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RMTInputHandler} instance that delegates to the specified {@code RMTInputHandlerI} instance. */
    public static RMTInputHandler create(RMTInputHandlerI instance) {
        return instance instanceof RMTInputHandler
            ? (RMTInputHandler)instance
            : new Container(instance.address(), instance);
    }

    protected RMTInputHandler() {
        super(CIF);
    }

    RMTInputHandler(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RMTInputHandler {

        private final RMTInputHandlerI delegate;

        Container(long functionPointer, RMTInputHandlerI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long text, long context) {
            return delegate.invoke(text, context);
        }

    }

}