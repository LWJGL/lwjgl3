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
    public static RMTSampleTreeHandler create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RMTSampleTreeHandler createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code RMTSampleTreeHandler} instance that delegates to the specified {@code RMTSampleTreeHandlerI} instance. */
    public static RMTSampleTreeHandler create(RMTSampleTreeHandlerI instance) { return create(instance, instance.address()); }

    private static RMTSampleTreeHandler create(RMTSampleTreeHandlerI instance, long functionPointer) {
        return instance instanceof RMTSampleTreeHandler
            ? (RMTSampleTreeHandler)instance
            : new RMTSampleTreeHandler(functionPointer) {
                @Override public void invoke(long cbk_context, long sample_tree) {
                    instance.invoke(cbk_context, sample_tree);
                }
            };
    }

    protected RMTSampleTreeHandler() {
        super(DESCRIPTOR);
    }

    RMTSampleTreeHandler(long functionPointer) {
        super(functionPointer);
    }

}