/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.mimalloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke mi_commit_fun_t} */
public abstract class mi_commit_fun_t extends Callback implements mi_commit_fun_tI {

    /**
     * Creates a {@code mi_commit_fun_t} instance from the specified function pointer.
     *
     * @return the new {@code mi_commit_fun_t}
     */
    public static mi_commit_fun_t create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable mi_commit_fun_t createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code mi_commit_fun_t} instance that delegates to the specified {@code mi_commit_fun_tI} instance. */
    public static mi_commit_fun_t create(mi_commit_fun_tI instance) { return create(instance, instance.address()); }

    private static mi_commit_fun_t create(mi_commit_fun_tI instance, long functionPointer) {
        return instance instanceof mi_commit_fun_t
            ? (mi_commit_fun_t)instance
            : new mi_commit_fun_t(functionPointer) {
                @Override public boolean invoke(boolean commit, long start, long size, long is_zero, long user_arg) {
                    return instance.invoke(commit, start, size, is_zero, user_arg);
                }
            };
    }

    protected mi_commit_fun_t() {
        super(DESCRIPTOR);
    }

    mi_commit_fun_t(long functionPointer) {
        super(functionPointer);
    }

}