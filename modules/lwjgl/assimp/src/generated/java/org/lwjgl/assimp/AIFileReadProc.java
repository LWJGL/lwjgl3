/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke aiFileReadProc} */
public abstract class AIFileReadProc extends Callback implements AIFileReadProcI {

    /**
     * Creates a {@code AIFileReadProc} instance from the specified function pointer.
     *
     * @return the new {@code AIFileReadProc}
     */
    public static AIFileReadProc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable AIFileReadProc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code AIFileReadProc} instance that delegates to the specified {@code AIFileReadProcI} instance. */
    public static AIFileReadProc create(AIFileReadProcI instance) { return create(instance, instance.address()); }

    private static AIFileReadProc create(AIFileReadProcI instance, long functionPointer) {
        return instance instanceof AIFileReadProc
            ? (AIFileReadProc)instance
            : new AIFileReadProc(functionPointer) {
                @Override public long invoke(long pFile, long pBuffer, long size, long count) {
                    return instance.invoke(pFile, pBuffer, size, count);
                }
            };
    }

    protected AIFileReadProc() {
        super(DESCRIPTOR);
    }

    AIFileReadProc(long functionPointer) {
        super(functionPointer);
    }

}