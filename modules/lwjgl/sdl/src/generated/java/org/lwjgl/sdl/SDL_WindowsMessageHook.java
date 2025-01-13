/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_WindowsMessageHook} */
public abstract class SDL_WindowsMessageHook extends Callback implements SDL_WindowsMessageHookI {

    /**
     * Creates a {@code SDL_WindowsMessageHook} instance from the specified function pointer.
     *
     * @return the new {@code SDL_WindowsMessageHook}
     */
    public static SDL_WindowsMessageHook create(long functionPointer) {
        SDL_WindowsMessageHookI instance = Callback.get(functionPointer);
        return instance instanceof SDL_WindowsMessageHook
            ? (SDL_WindowsMessageHook)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_WindowsMessageHook createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_WindowsMessageHook} instance that delegates to the specified {@code SDL_WindowsMessageHookI} instance. */
    public static SDL_WindowsMessageHook create(SDL_WindowsMessageHookI instance) {
        return instance instanceof SDL_WindowsMessageHook
            ? (SDL_WindowsMessageHook)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_WindowsMessageHook() {
        super(CIF);
    }

    SDL_WindowsMessageHook(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_WindowsMessageHook {

        private final SDL_WindowsMessageHookI delegate;

        Container(long functionPointer, SDL_WindowsMessageHookI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata, long msg) {
            return delegate.invoke(userdata, msg);
        }

    }

}