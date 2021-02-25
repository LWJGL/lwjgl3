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
 * aiReturn (*) (
 *     struct aiFile *pFile,
 *     size_t offset,
 *     aiOrigin origin
 * )</code></pre>
 */
public abstract class AIFileSeek extends Callback implements AIFileSeekI {

    /**
     * Creates a {@code AIFileSeek} instance from the specified function pointer.
     *
     * @return the new {@code AIFileSeek}
     */
    public static AIFileSeek create(long functionPointer) {
        AIFileSeekI instance = Callback.get(functionPointer);
        return instance instanceof AIFileSeek
            ? (AIFileSeek)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static AIFileSeek createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code AIFileSeek} instance that delegates to the specified {@code AIFileSeekI} instance. */
    public static AIFileSeek create(AIFileSeekI instance) {
        return instance instanceof AIFileSeek
            ? (AIFileSeek)instance
            : new Container(instance.address(), instance);
    }

    protected AIFileSeek() {
        super(CIF);
    }

    AIFileSeek(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends AIFileSeek {

        private final AIFileSeekI delegate;

        Container(long functionPointer, AIFileSeekI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long pFile, long offset, int origin) {
            return delegate.invoke(pFile, offset, origin);
        }

    }

}