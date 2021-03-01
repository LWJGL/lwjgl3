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
 * Instances of this class may be set to the {@code read} field of the {@link STBIIOCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * int (*{@link #invoke}) (
 *     void *user,
 *     char *data,
 *     int size
 * )</code></pre>
 */
public abstract class STBIReadCallback extends Callback implements STBIReadCallbackI {

    /**
     * Creates a {@code STBIReadCallback} instance from the specified function pointer.
     *
     * @return the new {@code STBIReadCallback}
     */
    public static STBIReadCallback create(long functionPointer) {
        STBIReadCallbackI instance = Callback.get(functionPointer);
        return instance instanceof STBIReadCallback
            ? (STBIReadCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static STBIReadCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code STBIReadCallback} instance that delegates to the specified {@code STBIReadCallbackI} instance. */
    public static STBIReadCallback create(STBIReadCallbackI instance) {
        return instance instanceof STBIReadCallback
            ? (STBIReadCallback)instance
            : new Container(instance.address(), instance);
    }

    protected STBIReadCallback() {
        super(CIF);
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

    private static final class Container extends STBIReadCallback {

        private final STBIReadCallbackI delegate;

        Container(long functionPointer, STBIReadCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long user, long data, int size) {
            return delegate.invoke(user, data, size);
        }

    }

}