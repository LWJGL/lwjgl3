/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link ClangIndex#clang_executeOnThread executeOnThread} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     void *user_data
 * )</code></pre>
 */
public abstract class CXExecuteOnThread extends Callback implements CXExecuteOnThreadI {

    /**
     * Creates a {@code CXExecuteOnThread} instance from the specified function pointer.
     *
     * @return the new {@code CXExecuteOnThread}
     */
    public static CXExecuteOnThread create(long functionPointer) {
        CXExecuteOnThreadI instance = Callback.get(functionPointer);
        return instance instanceof CXExecuteOnThread
            ? (CXExecuteOnThread)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static CXExecuteOnThread createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code CXExecuteOnThread} instance that delegates to the specified {@code CXExecuteOnThreadI} instance. */
    public static CXExecuteOnThread create(CXExecuteOnThreadI instance) {
        return instance instanceof CXExecuteOnThread
            ? (CXExecuteOnThread)instance
            : new Container(instance.address(), instance);
    }

    protected CXExecuteOnThread() {
        super(CIF);
    }

    CXExecuteOnThread(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends CXExecuteOnThread {

        private final CXExecuteOnThreadI delegate;

        Container(long functionPointer, CXExecuteOnThreadI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long user_data) {
            delegate.invoke(user_data);
        }

    }

}