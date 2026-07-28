/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LZ4F_AllocFunction} */
public abstract class LZ4FAllocFunction extends Callback implements LZ4FAllocFunctionI {

    /**
     * Creates a {@code LZ4FAllocFunction} instance from the specified function pointer.
     *
     * @return the new {@code LZ4FAllocFunction}
     */
    public static LZ4FAllocFunction create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LZ4FAllocFunction createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LZ4FAllocFunction} instance that delegates to the specified {@code LZ4FAllocFunctionI} instance. */
    public static LZ4FAllocFunction create(LZ4FAllocFunctionI instance) { return create(instance, instance.address()); }

    private static LZ4FAllocFunction create(LZ4FAllocFunctionI instance, long functionPointer) {
        return instance instanceof LZ4FAllocFunction
            ? (LZ4FAllocFunction)instance
            : new LZ4FAllocFunction(functionPointer) {
                @Override public long invoke(long opaqueState, long size) {
                    return instance.invoke(opaqueState, size);
                }
            };
    }

    protected LZ4FAllocFunction() {
        super(DESCRIPTOR);
    }

    LZ4FAllocFunction(long functionPointer) {
        super(functionPointer);
    }

}