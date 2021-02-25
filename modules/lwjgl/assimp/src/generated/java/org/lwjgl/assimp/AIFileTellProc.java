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
 *     struct aiFile *pFile
 * )</code></pre>
 */
public abstract class AIFileTellProc extends Callback implements AIFileTellProcI {

    /**
     * Creates a {@code AIFileTellProc} instance from the specified function pointer.
     *
     * @return the new {@code AIFileTellProc}
     */
    public static AIFileTellProc create(long functionPointer) {
        AIFileTellProcI instance = Callback.get(functionPointer);
        return instance instanceof AIFileTellProc
            ? (AIFileTellProc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static AIFileTellProc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code AIFileTellProc} instance that delegates to the specified {@code AIFileTellProcI} instance. */
    public static AIFileTellProc create(AIFileTellProcI instance) {
        return instance instanceof AIFileTellProc
            ? (AIFileTellProc)instance
            : new Container(instance.address(), instance);
    }

    protected AIFileTellProc() {
        super(CIF);
    }

    AIFileTellProc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends AIFileTellProc {

        private final AIFileTellProcI delegate;

        Container(long functionPointer, AIFileTellProcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long pFile) {
            return delegate.invoke(pFile);
        }

    }

}