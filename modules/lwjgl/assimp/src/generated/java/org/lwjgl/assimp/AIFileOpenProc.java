/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke aiFileOpenProc} */
public abstract class AIFileOpenProc extends Callback implements AIFileOpenProcI {

    /**
     * Creates a {@code AIFileOpenProc} instance from the specified function pointer.
     *
     * @return the new {@code AIFileOpenProc}
     */
    public static AIFileOpenProc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable AIFileOpenProc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code AIFileOpenProc} instance that delegates to the specified {@code AIFileOpenProcI} instance. */
    public static AIFileOpenProc create(AIFileOpenProcI instance) { return create(instance, instance.address()); }

    private static AIFileOpenProc create(AIFileOpenProcI instance, long functionPointer) {
        return instance instanceof AIFileOpenProc
            ? (AIFileOpenProc)instance
            : new AIFileOpenProc(functionPointer) {
                @Override public long invoke(long pFileIO, long fileName, long openMode) {
                    return instance.invoke(pFileIO, fileName, openMode);
                }
            };
    }

    protected AIFileOpenProc() {
        super(DESCRIPTOR);
    }

    AIFileOpenProc(long functionPointer) {
        super(functionPointer);
    }

}