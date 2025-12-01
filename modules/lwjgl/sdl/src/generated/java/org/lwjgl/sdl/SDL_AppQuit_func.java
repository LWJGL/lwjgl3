/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_AppQuit_func} */
public abstract class SDL_AppQuit_func extends Callback implements SDL_AppQuit_funcI {

    /**
     * Creates a {@code SDL_AppQuit_func} instance from the specified function pointer.
     *
     * @return the new {@code SDL_AppQuit_func}
     */
    public static SDL_AppQuit_func create(long functionPointer) {
        SDL_AppQuit_funcI instance = Callback.get(functionPointer);
        return instance instanceof SDL_AppQuit_func
            ? (SDL_AppQuit_func)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_AppQuit_func createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_AppQuit_func} instance that delegates to the specified {@code SDL_AppQuit_funcI} instance. */
    public static SDL_AppQuit_func create(SDL_AppQuit_funcI instance) {
        return instance instanceof SDL_AppQuit_func
            ? (SDL_AppQuit_func)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_AppQuit_func() {
        super(DESCRIPTOR);
    }

    SDL_AppQuit_func(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_AppQuit_func {

        private final SDL_AppQuit_funcI delegate;

        Container(long functionPointer, SDL_AppQuit_funcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long appstate, int result) {
            delegate.invoke(appstate, result);
        }

    }

}