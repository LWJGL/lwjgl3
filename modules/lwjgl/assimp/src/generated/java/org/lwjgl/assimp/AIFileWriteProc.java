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
 *     char const *pBuffer,
 *     size_t memB,
 *     size_t count
 * )</code></pre>
 */
public abstract class AIFileWriteProc extends Callback implements AIFileWriteProcI {

    /**
     * Creates a {@code AIFileWriteProc} instance from the specified function pointer.
     *
     * @return the new {@code AIFileWriteProc}
     */
    public static AIFileWriteProc create(long functionPointer) {
        AIFileWriteProcI instance = Callback.get(functionPointer);
        return instance instanceof AIFileWriteProc
            ? (AIFileWriteProc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static AIFileWriteProc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code AIFileWriteProc} instance that delegates to the specified {@code AIFileWriteProcI} instance. */
    public static AIFileWriteProc create(AIFileWriteProcI instance) {
        return instance instanceof AIFileWriteProc
            ? (AIFileWriteProc)instance
            : new Container(instance.address(), instance);
    }

    protected AIFileWriteProc() {
        super(CIF);
    }

    AIFileWriteProc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends AIFileWriteProc {

        private final AIFileWriteProcI delegate;

        Container(long functionPointer, AIFileWriteProcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long pFile, long pBuffer, long memB, long count) {
            return delegate.invoke(pFile, pBuffer, memB, count);
        }

    }

}