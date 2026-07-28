/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import java.nio.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class STBIReadCallback extends Callback implements STBIReadCallbackI {

    /**
     * Creates a {@code STBIReadCallback} instance from the specified function pointer.
     *
     * @return the new {@code STBIReadCallback}
     */
    public static STBIReadCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable STBIReadCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code STBIReadCallback} instance that delegates to the specified {@code STBIReadCallbackI} instance. */
    public static STBIReadCallback create(STBIReadCallbackI instance) { return create(instance, instance.address()); }

    private static STBIReadCallback create(STBIReadCallbackI instance, long functionPointer) {
        return instance instanceof STBIReadCallback
            ? (STBIReadCallback)instance
            : new STBIReadCallback(functionPointer) {
                @Override public int invoke(long user, long data, int size) {
                    return instance.invoke(user, data, size);
                }
            };
    }

    protected STBIReadCallback() {
        super(DESCRIPTOR);
    }

    STBIReadCallback(long functionPointer) {
        super(functionPointer);
    }

    /**
     * Converts the specified {@link STBIReadCallback} arguments to a ByteBuffer.
     *
     * <p>This method may only be used inside a STBIReadCallback invocation.</p>
     *
     * @param data the STBIReadCallback {@code data} argument
     * @param size the STBIReadCallback {@code size} argument
     *
     * @return the data as a ByteBuffer
     */
    public static ByteBuffer getData(long data, int size) {
        return memByteBuffer(data, size);
    }

}