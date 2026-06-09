/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ExrProgressCallback} */
public abstract class ExrProgressCallback extends Callback implements ExrProgressCallbackI {

    /**
     * Creates a {@code ExrProgressCallback} instance from the specified function pointer.
     *
     * @return the new {@code ExrProgressCallback}
     */
    public static ExrProgressCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExrProgressCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ExrProgressCallback} instance that delegates to the specified {@code ExrProgressCallbackI} instance. */
    public static ExrProgressCallback create(ExrProgressCallbackI instance) { return create(instance, instance.address()); }

    private static ExrProgressCallback create(ExrProgressCallbackI instance, long functionPointer) {
        return instance instanceof ExrProgressCallback
            ? (ExrProgressCallback)instance
            : new ExrProgressCallback(functionPointer) {
                @Override public void invoke(long userdata, long info) {
                    instance.invoke(userdata, info);
                }
            };
    }

    protected ExrProgressCallback() {
        super(DESCRIPTOR);
    }

    ExrProgressCallback(long functionPointer) {
        super(functionPointer);
    }

}