/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_CleanupPropertyCallback} */
public abstract class SDL_CleanupPropertyCallback extends Callback implements SDL_CleanupPropertyCallbackI {

    /**
     * Creates a {@code SDL_CleanupPropertyCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_CleanupPropertyCallback}
     */
    public static SDL_CleanupPropertyCallback create(long functionPointer) {
        SDL_CleanupPropertyCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_CleanupPropertyCallback
            ? (SDL_CleanupPropertyCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_CleanupPropertyCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_CleanupPropertyCallback} instance that delegates to the specified {@code SDL_CleanupPropertyCallbackI} instance. */
    public static SDL_CleanupPropertyCallback create(SDL_CleanupPropertyCallbackI instance) {
        return instance instanceof SDL_CleanupPropertyCallback
            ? (SDL_CleanupPropertyCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_CleanupPropertyCallback() {
        super(CIF);
    }

    SDL_CleanupPropertyCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_CleanupPropertyCallback {

        private final SDL_CleanupPropertyCallbackI delegate;

        Container(long functionPointer, SDL_CleanupPropertyCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userdata, long value) {
            delegate.invoke(userdata, value);
        }

    }

}