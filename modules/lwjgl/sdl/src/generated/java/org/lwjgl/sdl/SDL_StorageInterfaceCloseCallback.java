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
public abstract class SDL_StorageInterfaceCloseCallback extends Callback implements SDL_StorageInterfaceCloseCallbackI {

    /**
     * Creates a {@code SDL_StorageInterfaceCloseCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_StorageInterfaceCloseCallback}
     */
    public static SDL_StorageInterfaceCloseCallback create(long functionPointer) {
        SDL_StorageInterfaceCloseCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_StorageInterfaceCloseCallback
            ? (SDL_StorageInterfaceCloseCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceCloseCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_StorageInterfaceCloseCallback} instance that delegates to the specified {@code SDL_StorageInterfaceCloseCallbackI} instance. */
    public static SDL_StorageInterfaceCloseCallback create(SDL_StorageInterfaceCloseCallbackI instance) {
        return instance instanceof SDL_StorageInterfaceCloseCallback
            ? (SDL_StorageInterfaceCloseCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceCloseCallback() {
        super(CIF);
    }

    SDL_StorageInterfaceCloseCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_StorageInterfaceCloseCallback {

        private final SDL_StorageInterfaceCloseCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceCloseCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata) {
            return delegate.invoke(userdata);
        }

    }

}