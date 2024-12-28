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
public abstract class SDL_StorageInterfaceReadyCallback extends Callback implements SDL_StorageInterfaceReadyCallbackI {

    /**
     * Creates a {@code SDL_StorageInterfaceReadyCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_StorageInterfaceReadyCallback}
     */
    public static SDL_StorageInterfaceReadyCallback create(long functionPointer) {
        SDL_StorageInterfaceReadyCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_StorageInterfaceReadyCallback
            ? (SDL_StorageInterfaceReadyCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceReadyCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_StorageInterfaceReadyCallback} instance that delegates to the specified {@code SDL_StorageInterfaceReadyCallbackI} instance. */
    public static SDL_StorageInterfaceReadyCallback create(SDL_StorageInterfaceReadyCallbackI instance) {
        return instance instanceof SDL_StorageInterfaceReadyCallback
            ? (SDL_StorageInterfaceReadyCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceReadyCallback() {
        super(CIF);
    }

    SDL_StorageInterfaceReadyCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_StorageInterfaceReadyCallback {

        private final SDL_StorageInterfaceReadyCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceReadyCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata) {
            return delegate.invoke(userdata);
        }

    }

}