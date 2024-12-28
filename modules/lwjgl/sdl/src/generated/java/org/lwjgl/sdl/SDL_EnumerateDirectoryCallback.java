/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_EnumerateDirectoryCallback} */
public abstract class SDL_EnumerateDirectoryCallback extends Callback implements SDL_EnumerateDirectoryCallbackI {

    /**
     * Creates a {@code SDL_EnumerateDirectoryCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_EnumerateDirectoryCallback}
     */
    public static SDL_EnumerateDirectoryCallback create(long functionPointer) {
        SDL_EnumerateDirectoryCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_EnumerateDirectoryCallback
            ? (SDL_EnumerateDirectoryCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_EnumerateDirectoryCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_EnumerateDirectoryCallback} instance that delegates to the specified {@code SDL_EnumerateDirectoryCallbackI} instance. */
    public static SDL_EnumerateDirectoryCallback create(SDL_EnumerateDirectoryCallbackI instance) {
        return instance instanceof SDL_EnumerateDirectoryCallback
            ? (SDL_EnumerateDirectoryCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_EnumerateDirectoryCallback() {
        super(CIF);
    }

    SDL_EnumerateDirectoryCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_EnumerateDirectoryCallback {

        private final SDL_EnumerateDirectoryCallbackI delegate;

        Container(long functionPointer, SDL_EnumerateDirectoryCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long userdata, long dirname, long fname) {
            return delegate.invoke(userdata, dirname, fname);
        }

    }

}