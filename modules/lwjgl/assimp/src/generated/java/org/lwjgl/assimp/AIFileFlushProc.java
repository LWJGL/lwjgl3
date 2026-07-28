/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke aiFileFlushProc} */
public abstract class AIFileFlushProc extends Callback implements AIFileFlushProcI {

    /**
     * Creates a {@code AIFileFlushProc} instance from the specified function pointer.
     *
     * @return the new {@code AIFileFlushProc}
     */
    public static AIFileFlushProc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable AIFileFlushProc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code AIFileFlushProc} instance that delegates to the specified {@code AIFileFlushProcI} instance. */
    public static AIFileFlushProc create(AIFileFlushProcI instance) { return create(instance, instance.address()); }

    private static AIFileFlushProc create(AIFileFlushProcI instance, long functionPointer) {
        return instance instanceof AIFileFlushProc
            ? (AIFileFlushProc)instance
            : new AIFileFlushProc(functionPointer) {
                @Override public void invoke(long pFile) {
                    instance.invoke(pFile);
                }
            };
    }

    protected AIFileFlushProc() {
        super(DESCRIPTOR);
    }

    AIFileFlushProc(long functionPointer) {
        super(functionPointer);
    }

}