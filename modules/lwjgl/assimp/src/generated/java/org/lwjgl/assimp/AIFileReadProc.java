/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * size_t (*) (
 *     struct aiFile *pFile,
 *     char *pBuffer,
 *     size_t size,
 *     size_t count
 * )</code></pre>
 */
public abstract class AIFileReadProc extends Callback implements AIFileReadProcI {

    /**
     * Creates a {@code AIFileReadProc} instance from the specified function pointer.
     *
     * @return the new {@code AIFileReadProc}
     */
    public static AIFileReadProc create(long functionPointer) {
        AIFileReadProcI instance = Callback.get(functionPointer);
        return instance instanceof AIFileReadProc
            ? (AIFileReadProc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static AIFileReadProc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code AIFileReadProc} instance that delegates to the specified {@code AIFileReadProcI} instance. */
    public static AIFileReadProc create(AIFileReadProcI instance) {
        return instance instanceof AIFileReadProc
            ? (AIFileReadProc)instance
            : new Container(instance.address(), instance);
    }

    protected AIFileReadProc() {
        super(CIF);
    }

    AIFileReadProc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends AIFileReadProc {

        private final AIFileReadProcI delegate;

        Container(long functionPointer, AIFileReadProcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long pFile, long pBuffer, long size, long count) {
            return delegate.invoke(pFile, pBuffer, size, count);
        }

    }

}