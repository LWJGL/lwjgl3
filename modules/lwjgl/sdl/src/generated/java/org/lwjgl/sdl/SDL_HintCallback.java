/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_HintCallback} */
public abstract class SDL_HintCallback extends Callback implements SDL_HintCallbackI {

    /**
     * Creates a {@code SDL_HintCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_HintCallback}
     */
    public static SDL_HintCallback create(long functionPointer) {
        SDL_HintCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_HintCallback
            ? (SDL_HintCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_HintCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_HintCallback} instance that delegates to the specified {@code SDL_HintCallbackI} instance. */
    public static SDL_HintCallback create(SDL_HintCallbackI instance) {
        return instance instanceof SDL_HintCallback
            ? (SDL_HintCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_HintCallback() {
        super(CIF);
    }

    SDL_HintCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_HintCallback {

        private final SDL_HintCallbackI delegate;

        Container(long functionPointer, SDL_HintCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userdata, long name, long oldValue, long newValue) {
            delegate.invoke(userdata, name, oldValue, newValue);
        }

    }

}