/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ZSTD_sequenceProducer_F} */
public abstract class ZSTDSequenceProducer extends Callback implements ZSTDSequenceProducerI {

    /**
     * Creates a {@code ZSTDSequenceProducer} instance from the specified function pointer.
     *
     * @return the new {@code ZSTDSequenceProducer}
     */
    public static ZSTDSequenceProducer create(long functionPointer) {
        ZSTDSequenceProducerI instance = Callback.get(functionPointer);
        return instance instanceof ZSTDSequenceProducer
            ? (ZSTDSequenceProducer)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ZSTDSequenceProducer createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ZSTDSequenceProducer} instance that delegates to the specified {@code ZSTDSequenceProducerI} instance. */
    public static ZSTDSequenceProducer create(ZSTDSequenceProducerI instance) {
        return instance instanceof ZSTDSequenceProducer
            ? (ZSTDSequenceProducer)instance
            : new Container(instance.address(), instance);
    }

    protected ZSTDSequenceProducer() {
        super(CIF);
    }

    ZSTDSequenceProducer(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ZSTDSequenceProducer {

        private final ZSTDSequenceProducerI delegate;

        Container(long functionPointer, ZSTDSequenceProducerI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long sequenceProducerState, long outSeqs, long outSeqsCapacity, long src, long srcSize, long dict, long dictSize, int compressionLevel, long windowSize) {
            return delegate.invoke(sequenceProducerState, outSeqs, outSeqsCapacity, src, srcSize, dict, dictSize, compressionLevel, windowSize);
        }

    }

}