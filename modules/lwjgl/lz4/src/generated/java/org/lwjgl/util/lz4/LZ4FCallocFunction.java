/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LZ4F_CallocFunction} */
public abstract class LZ4FCallocFunction extends Callback implements LZ4FCallocFunctionI {

    /**
     * Creates a {@code LZ4FCallocFunction} instance from the specified function pointer.
     *
     * @return the new {@code LZ4FCallocFunction}
     */
    public static LZ4FCallocFunction create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LZ4FCallocFunction createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LZ4FCallocFunction} instance that delegates to the specified {@code LZ4FCallocFunctionI} instance. */
    public static LZ4FCallocFunction create(LZ4FCallocFunctionI instance) { return create(instance, instance.address()); }

    private static LZ4FCallocFunction create(LZ4FCallocFunctionI instance, long functionPointer) {
        return instance instanceof LZ4FCallocFunction
            ? (LZ4FCallocFunction)instance
            : new LZ4FCallocFunction(functionPointer) {
                @Override public long invoke(long opaqueState, long size) {
                    return instance.invoke(opaqueState, size);
                }
            };
    }

    protected LZ4FCallocFunction() {
        super(DESCRIPTOR);
    }

    LZ4FCallocFunction(long functionPointer) {
        super(functionPointer);
    }

}