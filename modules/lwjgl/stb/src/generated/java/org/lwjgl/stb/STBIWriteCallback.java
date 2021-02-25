/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import java.nio.*;

/**
 * Instances of this class may be used with the {@link STBImageWrite} {@code write_type_to_func} functions.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     void *context,
 *     void *data,
 *     int size
 * )</code></pre>
 */
public abstract class STBIWriteCallback extends Callback implements STBIWriteCallbackI {

    /**
     * Creates a {@code STBIWriteCallback} instance from the specified function pointer.
     *
     * @return the new {@code STBIWriteCallback}
     */
    public static STBIWriteCallback create(long functionPointer) {
        STBIWriteCallbackI instance = Callback.get(functionPointer);
        return instance instanceof STBIWriteCallback
            ? (STBIWriteCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static STBIWriteCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code STBIWriteCallback} instance that delegates to the specified {@code STBIWriteCallbackI} instance. */
    public static STBIWriteCallback create(STBIWriteCallbackI instance) {
        return instance instanceof STBIWriteCallback
            ? (STBIWriteCallback)instance
            : new Container(instance.address(), instance);
    }

    protected STBIWriteCallback() {
        super(CIF);
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

    private static final class Container extends STBIWriteCallback {

        private final STBIWriteCallbackI delegate;

        Container(long functionPointer, STBIWriteCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long context, long data, int size) {
            delegate.invoke(context, data, size);
        }

    }

}