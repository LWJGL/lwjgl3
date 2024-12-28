/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_DialogFileCallback} */
public abstract class SDL_DialogFileCallback extends Callback implements SDL_DialogFileCallbackI {

    /**
     * Creates a {@code SDL_DialogFileCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_DialogFileCallback}
     */
    public static SDL_DialogFileCallback create(long functionPointer) {
        SDL_DialogFileCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_DialogFileCallback
            ? (SDL_DialogFileCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_DialogFileCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_DialogFileCallback} instance that delegates to the specified {@code SDL_DialogFileCallbackI} instance. */
    public static SDL_DialogFileCallback create(SDL_DialogFileCallbackI instance) {
        return instance instanceof SDL_DialogFileCallback
            ? (SDL_DialogFileCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_DialogFileCallback() {
        super(CIF);
    }

    SDL_DialogFileCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_DialogFileCallback {

        private final SDL_DialogFileCallbackI delegate;

        Container(long functionPointer, SDL_DialogFileCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userdata, long filelist, int filter) {
            delegate.invoke(userdata, filelist, filter);
        }

    }

}