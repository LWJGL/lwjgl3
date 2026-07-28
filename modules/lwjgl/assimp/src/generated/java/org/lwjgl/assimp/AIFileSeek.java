/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke aiFileSeek} */
public abstract class AIFileSeek extends Callback implements AIFileSeekI {

    /**
     * Creates a {@code AIFileSeek} instance from the specified function pointer.
     *
     * @return the new {@code AIFileSeek}
     */
    public static AIFileSeek create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable AIFileSeek createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code AIFileSeek} instance that delegates to the specified {@code AIFileSeekI} instance. */
    public static AIFileSeek create(AIFileSeekI instance) { return create(instance, instance.address()); }

    private static AIFileSeek create(AIFileSeekI instance, long functionPointer) {
        return instance instanceof AIFileSeek
            ? (AIFileSeek)instance
            : new AIFileSeek(functionPointer) {
                @Override public int invoke(long pFile, long offset, int origin) {
                    return instance.invoke(pFile, offset, origin);
                }
            };
    }

    protected AIFileSeek() {
        super(DESCRIPTOR);
    }

    AIFileSeek(long functionPointer) {
        super(functionPointer);
    }

}