/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*{@link #invoke}) (
 *     ALvoid *userptr,
 *     ALvoid *sampledata,
 *     ALsizei numbytes
 * )</code></pre>
 */
public abstract class SOFTCallbackBufferType extends Callback implements SOFTCallbackBufferTypeI {

    /**
     * Creates a {@code SOFTCallbackBufferType} instance from the specified function pointer.
     *
     * @return the new {@code SOFTCallbackBufferType}
     */
    public static SOFTCallbackBufferType create(long functionPointer) {
        SOFTCallbackBufferTypeI instance = Callback.get(functionPointer);
        return instance instanceof SOFTCallbackBufferType
            ? (SOFTCallbackBufferType)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static SOFTCallbackBufferType createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SOFTCallbackBufferType} instance that delegates to the specified {@code SOFTCallbackBufferTypeI} instance. */
    public static SOFTCallbackBufferType create(SOFTCallbackBufferTypeI instance) {
        return instance instanceof SOFTCallbackBufferType
            ? (SOFTCallbackBufferType)instance
            : new Container(instance.address(), instance);
    }

    protected SOFTCallbackBufferType() {
        super(CIF);
    }

    SOFTCallbackBufferType(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SOFTCallbackBufferType {

        private final SOFTCallbackBufferTypeI delegate;

        Container(long functionPointer, SOFTCallbackBufferTypeI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long userptr, long sampledata, int numbytes) {
            return delegate.invoke(userptr, sampledata, numbytes);
        }

    }

}