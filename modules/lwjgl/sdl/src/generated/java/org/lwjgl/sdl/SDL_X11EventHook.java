/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_X11EventHook} */
public abstract class SDL_X11EventHook extends Callback implements SDL_X11EventHookI {

    /**
     * Creates a {@code SDL_X11EventHook} instance from the specified function pointer.
     *
     * @return the new {@code SDL_X11EventHook}
     */
    public static SDL_X11EventHook create(long functionPointer) {
        SDL_X11EventHookI instance = Callback.get(functionPointer);
        return instance instanceof SDL_X11EventHook
            ? (SDL_X11EventHook)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_X11EventHook createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_X11EventHook} instance that delegates to the specified {@code SDL_X11EventHookI} instance. */
    public static SDL_X11EventHook create(SDL_X11EventHookI instance) {
        return instance instanceof SDL_X11EventHook
            ? (SDL_X11EventHook)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_X11EventHook() {
        super(CIF);
    }

    SDL_X11EventHook(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_X11EventHook {

        private final SDL_X11EventHookI delegate;

        Container(long functionPointer, SDL_X11EventHookI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata, long xevent) {
            return delegate.invoke(userdata, xevent);
        }

    }

}