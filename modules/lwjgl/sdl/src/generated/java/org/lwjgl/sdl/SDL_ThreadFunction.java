/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_ThreadFunction} */
public abstract class SDL_ThreadFunction extends Callback implements SDL_ThreadFunctionI {

    /**
     * Creates a {@code SDL_ThreadFunction} instance from the specified function pointer.
     *
     * @return the new {@code SDL_ThreadFunction}
     */
    public static SDL_ThreadFunction create(long functionPointer) {
        SDL_ThreadFunctionI instance = Callback.get(functionPointer);
        return instance instanceof SDL_ThreadFunction
            ? (SDL_ThreadFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_ThreadFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_ThreadFunction} instance that delegates to the specified {@code SDL_ThreadFunctionI} instance. */
    public static SDL_ThreadFunction create(SDL_ThreadFunctionI instance) {
        return instance instanceof SDL_ThreadFunction
            ? (SDL_ThreadFunction)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_ThreadFunction() {
        super(CIF);
    }

    SDL_ThreadFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_ThreadFunction {

        private final SDL_ThreadFunctionI delegate;

        Container(long functionPointer, SDL_ThreadFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long data) {
            return delegate.invoke(data);
        }

    }

}