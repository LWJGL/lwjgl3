/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke aiFileTellProc} */
public abstract class AIFileTellProc extends Callback implements AIFileTellProcI {

    /**
     * Creates a {@code AIFileTellProc} instance from the specified function pointer.
     *
     * @return the new {@code AIFileTellProc}
     */
    public static AIFileTellProc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable AIFileTellProc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code AIFileTellProc} instance that delegates to the specified {@code AIFileTellProcI} instance. */
    public static AIFileTellProc create(AIFileTellProcI instance) { return create(instance, instance.address()); }

    private static AIFileTellProc create(AIFileTellProcI instance, long functionPointer) {
        return instance instanceof AIFileTellProc
            ? (AIFileTellProc)instance
            : new AIFileTellProc(functionPointer) {
                @Override public long invoke(long pFile) {
                    return instance.invoke(pFile);
                }
            };
    }

    protected AIFileTellProc() {
        super(DESCRIPTOR);
    }

    AIFileTellProc(long functionPointer) {
        super(functionPointer);
    }

}