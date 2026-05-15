/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ZSTD_freeFunction} */
public abstract class ZSTDFreeFunction extends Callback implements ZSTDFreeFunctionI {

    /**
     * Creates a {@code ZSTDFreeFunction} instance from the specified function pointer.
     *
     * @return the new {@code ZSTDFreeFunction}
     */
    public static ZSTDFreeFunction create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ZSTDFreeFunction createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ZSTDFreeFunction} instance that delegates to the specified {@code ZSTDFreeFunctionI} instance. */
    public static ZSTDFreeFunction create(ZSTDFreeFunctionI instance) { return create(instance, instance.address()); }

    private static ZSTDFreeFunction create(ZSTDFreeFunctionI instance, long functionPointer) {
        return instance instanceof ZSTDFreeFunction
            ? (ZSTDFreeFunction)instance
            : new ZSTDFreeFunction(functionPointer) {
                @Override public void invoke(long opaque, long address) {
                    instance.invoke(opaque, address);
                }
            };
    }

    protected ZSTDFreeFunction() {
        super(DESCRIPTOR);
    }

    ZSTDFreeFunction(long functionPointer) {
        super(functionPointer);
    }

}