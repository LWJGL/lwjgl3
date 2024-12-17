/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke rmtSampleTreeHandlerPtr} */
public abstract class RMTSampleTreeHandler extends Callback implements RMTSampleTreeHandlerI {

    /**
     * Creates a {@code RMTSampleTreeHandler} instance from the specified function pointer.
     *
     * @return the new {@code RMTSampleTreeHandler}
     */
    public static RMTSampleTreeHandler create(long functionPointer) {
        RMTSampleTreeHandlerI instance = Callback.get(functionPointer);
        return instance instanceof RMTSampleTreeHandler
            ? (RMTSampleTreeHandler)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RMTSampleTreeHandler createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RMTSampleTreeHandler} instance that delegates to the specified {@code RMTSampleTreeHandlerI} instance. */
    public static RMTSampleTreeHandler create(RMTSampleTreeHandlerI instance) {
        return instance instanceof RMTSampleTreeHandler
            ? (RMTSampleTreeHandler)instance
            : new Container(instance.address(), instance);
    }

    protected RMTSampleTreeHandler() {
        super(CIF);
    }

    RMTSampleTreeHandler(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RMTSampleTreeHandler {

        private final RMTSampleTreeHandlerI delegate;

        Container(long functionPointer, RMTSampleTreeHandlerI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long cbk_context, long sample_tree) {
            delegate.invoke(cbk_context, sample_tree);
        }

    }

}