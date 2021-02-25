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
 * void (*) (
 *     struct aiFile *pFile
 * )</code></pre>
 */
public abstract class AIFileFlushProc extends Callback implements AIFileFlushProcI {

    /**
     * Creates a {@code AIFileFlushProc} instance from the specified function pointer.
     *
     * @return the new {@code AIFileFlushProc}
     */
    public static AIFileFlushProc create(long functionPointer) {
        AIFileFlushProcI instance = Callback.get(functionPointer);
        return instance instanceof AIFileFlushProc
            ? (AIFileFlushProc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static AIFileFlushProc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code AIFileFlushProc} instance that delegates to the specified {@code AIFileFlushProcI} instance. */
    public static AIFileFlushProc create(AIFileFlushProcI instance) {
        return instance instanceof AIFileFlushProc
            ? (AIFileFlushProc)instance
            : new Container(instance.address(), instance);
    }

    protected AIFileFlushProc() {
        super(CIF);
    }

    AIFileFlushProc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends AIFileFlushProc {

        private final AIFileFlushProcI delegate;

        Container(long functionPointer, AIFileFlushProcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long pFile) {
            delegate.invoke(pFile);
        }

    }

}