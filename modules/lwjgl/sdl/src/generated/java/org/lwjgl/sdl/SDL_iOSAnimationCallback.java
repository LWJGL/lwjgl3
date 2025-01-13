/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_iOSAnimationCallback} */
public abstract class SDL_iOSAnimationCallback extends Callback implements SDL_iOSAnimationCallbackI {

    /**
     * Creates a {@code SDL_iOSAnimationCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_iOSAnimationCallback}
     */
    public static SDL_iOSAnimationCallback create(long functionPointer) {
        SDL_iOSAnimationCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_iOSAnimationCallback
            ? (SDL_iOSAnimationCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_iOSAnimationCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_iOSAnimationCallback} instance that delegates to the specified {@code SDL_iOSAnimationCallbackI} instance. */
    public static SDL_iOSAnimationCallback create(SDL_iOSAnimationCallbackI instance) {
        return instance instanceof SDL_iOSAnimationCallback
            ? (SDL_iOSAnimationCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_iOSAnimationCallback() {
        super(CIF);
    }

    SDL_iOSAnimationCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_iOSAnimationCallback {

        private final SDL_iOSAnimationCallbackI delegate;

        Container(long functionPointer, SDL_iOSAnimationCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userdata) {
            delegate.invoke(userdata);
        }

    }

}