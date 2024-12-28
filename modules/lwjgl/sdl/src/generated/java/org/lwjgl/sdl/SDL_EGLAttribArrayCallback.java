/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_EGLAttribArrayCallback} */
public abstract class SDL_EGLAttribArrayCallback extends Callback implements SDL_EGLAttribArrayCallbackI {

    /**
     * Creates a {@code SDL_EGLAttribArrayCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_EGLAttribArrayCallback}
     */
    public static SDL_EGLAttribArrayCallback create(long functionPointer) {
        SDL_EGLAttribArrayCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_EGLAttribArrayCallback
            ? (SDL_EGLAttribArrayCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_EGLAttribArrayCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_EGLAttribArrayCallback} instance that delegates to the specified {@code SDL_EGLAttribArrayCallbackI} instance. */
    public static SDL_EGLAttribArrayCallback create(SDL_EGLAttribArrayCallbackI instance) {
        return instance instanceof SDL_EGLAttribArrayCallback
            ? (SDL_EGLAttribArrayCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_EGLAttribArrayCallback() {
        super(CIF);
    }

    SDL_EGLAttribArrayCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_EGLAttribArrayCallback {

        private final SDL_EGLAttribArrayCallbackI delegate;

        Container(long functionPointer, SDL_EGLAttribArrayCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long userdata) {
            return delegate.invoke(userdata);
        }

    }

}