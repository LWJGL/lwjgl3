/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_TrayCallback} */
public abstract class SDL_TrayCallback extends Callback implements SDL_TrayCallbackI {

    /**
     * Creates a {@code SDL_TrayCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_TrayCallback}
     */
    public static SDL_TrayCallback create(long functionPointer) {
        SDL_TrayCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_TrayCallback
            ? (SDL_TrayCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_TrayCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_TrayCallback} instance that delegates to the specified {@code SDL_TrayCallbackI} instance. */
    public static SDL_TrayCallback create(SDL_TrayCallbackI instance) {
        return instance instanceof SDL_TrayCallback
            ? (SDL_TrayCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_TrayCallback() {
        super(CIF);
    }

    SDL_TrayCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_TrayCallback {

        private final SDL_TrayCallbackI delegate;

        Container(long functionPointer, SDL_TrayCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userdata, long entry) {
            delegate.invoke(userdata, entry);
        }

    }

}