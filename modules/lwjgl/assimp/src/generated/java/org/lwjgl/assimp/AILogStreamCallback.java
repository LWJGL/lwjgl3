/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     char const *message,
 *     char *user
 * )</code></pre>
 */
public abstract class AILogStreamCallback extends Callback implements AILogStreamCallbackI {

    /**
     * Creates a {@code AILogStreamCallback} instance from the specified function pointer.
     *
     * @return the new {@code AILogStreamCallback}
     */
    public static AILogStreamCallback create(long functionPointer) {
        AILogStreamCallbackI instance = Callback.get(functionPointer);
        return instance instanceof AILogStreamCallback
            ? (AILogStreamCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static AILogStreamCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code AILogStreamCallback} instance that delegates to the specified {@code AILogStreamCallbackI} instance. */
    public static AILogStreamCallback create(AILogStreamCallbackI instance) {
        return instance instanceof AILogStreamCallback
            ? (AILogStreamCallback)instance
            : new Container(instance.address(), instance);
    }

    protected AILogStreamCallback() {
        super(CIF);
    }

    AILogStreamCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends AILogStreamCallback {

        private final AILogStreamCallbackI delegate;

        Container(long functionPointer, AILogStreamCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long message, long user) {
            delegate.invoke(message, user);
        }

    }

}