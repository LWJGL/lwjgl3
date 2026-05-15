/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke aiFileCloseProc} */
public abstract class AIFileCloseProc extends Callback implements AIFileCloseProcI {

    /**
     * Creates a {@code AIFileCloseProc} instance from the specified function pointer.
     *
     * @return the new {@code AIFileCloseProc}
     */
    public static AIFileCloseProc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable AIFileCloseProc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code AIFileCloseProc} instance that delegates to the specified {@code AIFileCloseProcI} instance. */
    public static AIFileCloseProc create(AIFileCloseProcI instance) { return create(instance, instance.address()); }

    private static AIFileCloseProc create(AIFileCloseProcI instance, long functionPointer) {
        return instance instanceof AIFileCloseProc
            ? (AIFileCloseProc)instance
            : new AIFileCloseProc(functionPointer) {
                @Override public void invoke(long pFileIO, long pFile) {
                    instance.invoke(pFileIO, pFile);
                }
            };
    }

    protected AIFileCloseProc() {
        super(DESCRIPTOR);
    }

    AIFileCloseProc(long functionPointer) {
        super(functionPointer);
    }

}