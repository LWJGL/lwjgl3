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
public abstract class SDL_StorageInterfaceMkdirCallback extends Callback implements SDL_StorageInterfaceMkdirCallbackI {

    /**
     * Creates a {@code SDL_StorageInterfaceMkdirCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_StorageInterfaceMkdirCallback}
     */
    public static SDL_StorageInterfaceMkdirCallback create(long functionPointer) {
        SDL_StorageInterfaceMkdirCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_StorageInterfaceMkdirCallback
            ? (SDL_StorageInterfaceMkdirCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceMkdirCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_StorageInterfaceMkdirCallback} instance that delegates to the specified {@code SDL_StorageInterfaceMkdirCallbackI} instance. */
    public static SDL_StorageInterfaceMkdirCallback create(SDL_StorageInterfaceMkdirCallbackI instance) {
        return instance instanceof SDL_StorageInterfaceMkdirCallback
            ? (SDL_StorageInterfaceMkdirCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceMkdirCallback() {
        super(CIF);
    }

    SDL_StorageInterfaceMkdirCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_StorageInterfaceMkdirCallback {

        private final SDL_StorageInterfaceMkdirCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceMkdirCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata, long path) {
            return delegate.invoke(userdata, path);
        }

    }

}