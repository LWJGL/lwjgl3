/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class CXExecuteOnThread extends Callback implements CXExecuteOnThreadI {

    /**
     * Creates a {@code CXExecuteOnThread} instance from the specified function pointer.
     *
     * @return the new {@code CXExecuteOnThread}
     */
    public static CXExecuteOnThread create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CXExecuteOnThread createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code CXExecuteOnThread} instance that delegates to the specified {@code CXExecuteOnThreadI} instance. */
    public static CXExecuteOnThread create(CXExecuteOnThreadI instance) { return create(instance, instance.address()); }

    private static CXExecuteOnThread create(CXExecuteOnThreadI instance, long functionPointer) {
        return instance instanceof CXExecuteOnThread
            ? (CXExecuteOnThread)instance
            : new CXExecuteOnThread(functionPointer) {
                @Override public void invoke(long user_data) {
                    instance.invoke(user_data);
                }
            };
    }

    protected CXExecuteOnThread() {
        super(DESCRIPTOR);
    }

    CXExecuteOnThread(long functionPointer) {
        super(functionPointer);
    }

}