/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_LogOutputFunction} */
public abstract class SDL_LogOutputFunction extends Callback implements SDL_LogOutputFunctionI {

    /**
     * Creates a {@code SDL_LogOutputFunction} instance from the specified function pointer.
     *
     * @return the new {@code SDL_LogOutputFunction}
     */
    public static SDL_LogOutputFunction create(long functionPointer) {
        SDL_LogOutputFunctionI instance = Callback.get(functionPointer);
        return instance instanceof SDL_LogOutputFunction
            ? (SDL_LogOutputFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_LogOutputFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_LogOutputFunction} instance that delegates to the specified {@code SDL_LogOutputFunctionI} instance. */
    public static SDL_LogOutputFunction create(SDL_LogOutputFunctionI instance) {
        return instance instanceof SDL_LogOutputFunction
            ? (SDL_LogOutputFunction)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_LogOutputFunction() {
        super(CIF);
    }

    SDL_LogOutputFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_LogOutputFunction {

        private final SDL_LogOutputFunctionI delegate;

        Container(long functionPointer, SDL_LogOutputFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userdata, int category, int priority, long message) {
            delegate.invoke(userdata, category, priority, message);
        }

    }

}