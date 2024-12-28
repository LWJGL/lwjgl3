/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class SDL_IOStreamInterfaceCloseCallback extends Callback implements SDL_IOStreamInterfaceCloseCallbackI {

    /**
     * Creates a {@code SDL_IOStreamInterfaceCloseCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_IOStreamInterfaceCloseCallback}
     */
    public static SDL_IOStreamInterfaceCloseCallback create(long functionPointer) {
        SDL_IOStreamInterfaceCloseCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_IOStreamInterfaceCloseCallback
            ? (SDL_IOStreamInterfaceCloseCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_IOStreamInterfaceCloseCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_IOStreamInterfaceCloseCallback} instance that delegates to the specified {@code SDL_IOStreamInterfaceCloseCallbackI} instance. */
    public static SDL_IOStreamInterfaceCloseCallback create(SDL_IOStreamInterfaceCloseCallbackI instance) {
        return instance instanceof SDL_IOStreamInterfaceCloseCallback
            ? (SDL_IOStreamInterfaceCloseCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_IOStreamInterfaceCloseCallback() {
        super(CIF);
    }

    SDL_IOStreamInterfaceCloseCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_IOStreamInterfaceCloseCallback {

        private final SDL_IOStreamInterfaceCloseCallbackI delegate;

        Container(long functionPointer, SDL_IOStreamInterfaceCloseCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata) {
            return delegate.invoke(userdata);
        }

    }

}