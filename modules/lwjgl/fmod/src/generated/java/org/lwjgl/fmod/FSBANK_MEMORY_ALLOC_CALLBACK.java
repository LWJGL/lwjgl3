/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FSBANK_MEMORY_ALLOC_CALLBACK} */
public abstract class FSBANK_MEMORY_ALLOC_CALLBACK extends Callback implements FSBANK_MEMORY_ALLOC_CALLBACKI {

    /**
     * Creates a {@code FSBANK_MEMORY_ALLOC_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FSBANK_MEMORY_ALLOC_CALLBACK}
     */
    public static FSBANK_MEMORY_ALLOC_CALLBACK create(long functionPointer) {
        FSBANK_MEMORY_ALLOC_CALLBACKI instance = Callback.get(functionPointer);
        return instance instanceof FSBANK_MEMORY_ALLOC_CALLBACK
            ? (FSBANK_MEMORY_ALLOC_CALLBACK)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FSBANK_MEMORY_ALLOC_CALLBACK createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FSBANK_MEMORY_ALLOC_CALLBACK} instance that delegates to the specified {@code FSBANK_MEMORY_ALLOC_CALLBACKI} instance. */
    public static FSBANK_MEMORY_ALLOC_CALLBACK create(FSBANK_MEMORY_ALLOC_CALLBACKI instance) {
        return instance instanceof FSBANK_MEMORY_ALLOC_CALLBACK
            ? (FSBANK_MEMORY_ALLOC_CALLBACK)instance
            : new Container(instance.address(), instance);
    }

    protected FSBANK_MEMORY_ALLOC_CALLBACK() {
        super(CIF);
    }

    FSBANK_MEMORY_ALLOC_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FSBANK_MEMORY_ALLOC_CALLBACK {

        private final FSBANK_MEMORY_ALLOC_CALLBACKI delegate;

        Container(long functionPointer, FSBANK_MEMORY_ALLOC_CALLBACKI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(int size, int type, long sourceStr) {
            return delegate.invoke(size, type, sourceStr);
        }

    }

}