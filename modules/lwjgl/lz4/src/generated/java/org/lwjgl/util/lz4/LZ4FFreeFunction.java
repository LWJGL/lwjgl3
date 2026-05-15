/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LZ4F_FreeFunction} */
public abstract class LZ4FFreeFunction extends Callback implements LZ4FFreeFunctionI {

    /**
     * Creates a {@code LZ4FFreeFunction} instance from the specified function pointer.
     *
     * @return the new {@code LZ4FFreeFunction}
     */
    public static LZ4FFreeFunction create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LZ4FFreeFunction createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LZ4FFreeFunction} instance that delegates to the specified {@code LZ4FFreeFunctionI} instance. */
    public static LZ4FFreeFunction create(LZ4FFreeFunctionI instance) { return create(instance, instance.address()); }

    private static LZ4FFreeFunction create(LZ4FFreeFunctionI instance, long functionPointer) {
        return instance instanceof LZ4FFreeFunction
            ? (LZ4FFreeFunction)instance
            : new LZ4FFreeFunction(functionPointer) {
                @Override public long invoke(long opaqueState, long address) {
                    return instance.invoke(opaqueState, address);
                }
            };
    }

    protected LZ4FFreeFunction() {
        super(DESCRIPTOR);
    }

    LZ4FFreeFunction(long functionPointer) {
        super(functionPointer);
    }

}