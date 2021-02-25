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
 *     struct aiFileIO *pFileIO,
 *     struct aiFile *pFile
 * )</code></pre>
 */
public abstract class AIFileCloseProc extends Callback implements AIFileCloseProcI {

    /**
     * Creates a {@code AIFileCloseProc} instance from the specified function pointer.
     *
     * @return the new {@code AIFileCloseProc}
     */
    public static AIFileCloseProc create(long functionPointer) {
        AIFileCloseProcI instance = Callback.get(functionPointer);
        return instance instanceof AIFileCloseProc
            ? (AIFileCloseProc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static AIFileCloseProc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code AIFileCloseProc} instance that delegates to the specified {@code AIFileCloseProcI} instance. */
    public static AIFileCloseProc create(AIFileCloseProcI instance) {
        return instance instanceof AIFileCloseProc
            ? (AIFileCloseProc)instance
            : new Container(instance.address(), instance);
    }

    protected AIFileCloseProc() {
        super(CIF);
    }

    AIFileCloseProc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends AIFileCloseProc {

        private final AIFileCloseProcI delegate;

        Container(long functionPointer, AIFileCloseProcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long pFileIO, long pFile) {
            delegate.invoke(pFileIO, pFile);
        }

    }

}