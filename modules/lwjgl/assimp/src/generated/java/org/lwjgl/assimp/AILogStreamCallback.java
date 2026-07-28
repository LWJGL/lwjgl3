/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke aiLogStreamCallback} */
public abstract class AILogStreamCallback extends Callback implements AILogStreamCallbackI {

    /**
     * Creates a {@code AILogStreamCallback} instance from the specified function pointer.
     *
     * @return the new {@code AILogStreamCallback}
     */
    public static AILogStreamCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable AILogStreamCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code AILogStreamCallback} instance that delegates to the specified {@code AILogStreamCallbackI} instance. */
    public static AILogStreamCallback create(AILogStreamCallbackI instance) { return create(instance, instance.address()); }

    private static AILogStreamCallback create(AILogStreamCallbackI instance, long functionPointer) {
        return instance instanceof AILogStreamCallback
            ? (AILogStreamCallback)instance
            : new AILogStreamCallback(functionPointer) {
                @Override public void invoke(long message, long user) {
                    instance.invoke(message, user);
                }
            };
    }

    protected AILogStreamCallback() {
        super(DESCRIPTOR);
    }

    AILogStreamCallback(long functionPointer) {
        super(functionPointer);
    }

}