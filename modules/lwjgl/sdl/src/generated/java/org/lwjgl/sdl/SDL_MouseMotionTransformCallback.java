/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_MouseMotionTransformCallback} */
public abstract class SDL_MouseMotionTransformCallback extends Callback implements SDL_MouseMotionTransformCallbackI {

    /**
     * Creates a {@code SDL_MouseMotionTransformCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_MouseMotionTransformCallback}
     */
    public static SDL_MouseMotionTransformCallback create(long functionPointer) {
        SDL_MouseMotionTransformCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_MouseMotionTransformCallback
            ? (SDL_MouseMotionTransformCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_MouseMotionTransformCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_MouseMotionTransformCallback} instance that delegates to the specified {@code SDL_MouseMotionTransformCallbackI} instance. */
    public static SDL_MouseMotionTransformCallback create(SDL_MouseMotionTransformCallbackI instance) {
        return instance instanceof SDL_MouseMotionTransformCallback
            ? (SDL_MouseMotionTransformCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_MouseMotionTransformCallback() {
        super(DESCRIPTOR);
    }

    SDL_MouseMotionTransformCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_MouseMotionTransformCallback {

        private final SDL_MouseMotionTransformCallbackI delegate;

        Container(long functionPointer, SDL_MouseMotionTransformCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userdata, long timestamp, long window, int mouseID, long x, long y) {
            delegate.invoke(userdata, timestamp, window, mouseID, x, y);
        }

    }

}