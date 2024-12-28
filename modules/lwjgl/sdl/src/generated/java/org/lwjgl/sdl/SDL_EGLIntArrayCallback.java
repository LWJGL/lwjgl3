/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_EGLIntArrayCallback} */
public abstract class SDL_EGLIntArrayCallback extends Callback implements SDL_EGLIntArrayCallbackI {

    /**
     * Creates a {@code SDL_EGLIntArrayCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_EGLIntArrayCallback}
     */
    public static SDL_EGLIntArrayCallback create(long functionPointer) {
        SDL_EGLIntArrayCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_EGLIntArrayCallback
            ? (SDL_EGLIntArrayCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_EGLIntArrayCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_EGLIntArrayCallback} instance that delegates to the specified {@code SDL_EGLIntArrayCallbackI} instance. */
    public static SDL_EGLIntArrayCallback create(SDL_EGLIntArrayCallbackI instance) {
        return instance instanceof SDL_EGLIntArrayCallback
            ? (SDL_EGLIntArrayCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_EGLIntArrayCallback() {
        super(CIF);
    }

    SDL_EGLIntArrayCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_EGLIntArrayCallback {

        private final SDL_EGLIntArrayCallbackI delegate;

        Container(long functionPointer, SDL_EGLIntArrayCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long userdata, long display, long config) {
            return delegate.invoke(userdata, display, config);
        }

    }

}