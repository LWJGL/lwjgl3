/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class STBIZlibCompress extends Callback implements STBIZlibCompressI {

    /**
     * Creates a {@code STBIZlibCompress} instance from the specified function pointer.
     *
     * @return the new {@code STBIZlibCompress}
     */
    public static STBIZlibCompress create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable STBIZlibCompress createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code STBIZlibCompress} instance that delegates to the specified {@code STBIZlibCompressI} instance. */
    public static STBIZlibCompress create(STBIZlibCompressI instance) { return create(instance, instance.address()); }

    private static STBIZlibCompress create(STBIZlibCompressI instance, long functionPointer) {
        return instance instanceof STBIZlibCompress
            ? (STBIZlibCompress)instance
            : new STBIZlibCompress(functionPointer) {
                @Override public long invoke(long data, int data_len, long out_len, int quality) {
                    return instance.invoke(data, data_len, out_len, quality);
                }
            };
    }

    protected STBIZlibCompress() {
        super(DESCRIPTOR);
    }

    STBIZlibCompress(long functionPointer) {
        super(functionPointer);
    }

}