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

/** Callback function: {@link #invoke stbi_write_func *} */
public abstract class STBIWriteCallback extends Callback implements STBIWriteCallbackI {

    /**
     * Creates a {@code STBIWriteCallback} instance from the specified function pointer.
     *
     * @return the new {@code STBIWriteCallback}
     */
    public static STBIWriteCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable STBIWriteCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code STBIWriteCallback} instance that delegates to the specified {@code STBIWriteCallbackI} instance. */
    public static STBIWriteCallback create(STBIWriteCallbackI instance) { return create(instance, instance.address()); }

    private static STBIWriteCallback create(STBIWriteCallbackI instance, long functionPointer) {
        return instance instanceof STBIWriteCallback
            ? (STBIWriteCallback)instance
            : new STBIWriteCallback(functionPointer) {
                @Override public void invoke(long context, long data, int size) {
                    instance.invoke(context, data, size);
                }
            };
    }

    protected STBIWriteCallback() {
        super(DESCRIPTOR);
    }

    STBIWriteCallback(long functionPointer) {
        super(functionPointer);
    }

    /**
     * Converts the specified {@link STBIWriteCallback} arguments to a ByteBuffer.
     *
     * <p>This method may only be used inside a STBIWriteCallback invocation.</p>
     *
     * @param data the STBIWriteCallback {@code data} argument
     * @param size the STBIWriteCallback {@code size} argument
     *
     * @return the data as a ByteBuffer
     */
    public static ByteBuffer getData(long data, int size) {
        return memByteBuffer(data, size);
    }

}