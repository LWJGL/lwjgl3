/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_TLSDestructorCallback} */
public abstract class SDL_TLSDestructorCallback extends Callback implements SDL_TLSDestructorCallbackI {

    /**
     * Creates a {@code SDL_TLSDestructorCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_TLSDestructorCallback}
     */
    public static SDL_TLSDestructorCallback create(long functionPointer) {
        SDL_TLSDestructorCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_TLSDestructorCallback
            ? (SDL_TLSDestructorCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_TLSDestructorCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_TLSDestructorCallback} instance that delegates to the specified {@code SDL_TLSDestructorCallbackI} instance. */
    public static SDL_TLSDestructorCallback create(SDL_TLSDestructorCallbackI instance) {
        return instance instanceof SDL_TLSDestructorCallback
            ? (SDL_TLSDestructorCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_TLSDestructorCallback() {
        super(CIF);
    }

    SDL_TLSDestructorCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_TLSDestructorCallback {

        private final SDL_TLSDestructorCallbackI delegate;

        Container(long functionPointer, SDL_TLSDestructorCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long value) {
            delegate.invoke(value);
        }

    }

}