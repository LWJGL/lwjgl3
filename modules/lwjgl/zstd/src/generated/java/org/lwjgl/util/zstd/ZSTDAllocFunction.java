/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ZSTD_allocFunction} */
public abstract class ZSTDAllocFunction extends Callback implements ZSTDAllocFunctionI {

    /**
     * Creates a {@code ZSTDAllocFunction} instance from the specified function pointer.
     *
     * @return the new {@code ZSTDAllocFunction}
     */
    public static ZSTDAllocFunction create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ZSTDAllocFunction createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ZSTDAllocFunction} instance that delegates to the specified {@code ZSTDAllocFunctionI} instance. */
    public static ZSTDAllocFunction create(ZSTDAllocFunctionI instance) { return create(instance, instance.address()); }

    private static ZSTDAllocFunction create(ZSTDAllocFunctionI instance, long functionPointer) {
        return instance instanceof ZSTDAllocFunction
            ? (ZSTDAllocFunction)instance
            : new ZSTDAllocFunction(functionPointer) {
                @Override public long invoke(long opaque, long size) {
                    return instance.invoke(opaque, size);
                }
            };
    }

    protected ZSTDAllocFunction() {
        super(DESCRIPTOR);
    }

    ZSTDAllocFunction(long functionPointer) {
        super(functionPointer);
    }

}