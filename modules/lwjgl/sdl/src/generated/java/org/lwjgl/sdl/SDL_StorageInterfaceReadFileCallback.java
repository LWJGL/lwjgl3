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
public abstract class SDL_StorageInterfaceReadFileCallback extends Callback implements SDL_StorageInterfaceReadFileCallbackI {

    /**
     * Creates a {@code SDL_StorageInterfaceReadFileCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_StorageInterfaceReadFileCallback}
     */
    public static SDL_StorageInterfaceReadFileCallback create(long functionPointer) {
        SDL_StorageInterfaceReadFileCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_StorageInterfaceReadFileCallback
            ? (SDL_StorageInterfaceReadFileCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceReadFileCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_StorageInterfaceReadFileCallback} instance that delegates to the specified {@code SDL_StorageInterfaceReadFileCallbackI} instance. */
    public static SDL_StorageInterfaceReadFileCallback create(SDL_StorageInterfaceReadFileCallbackI instance) {
        return instance instanceof SDL_StorageInterfaceReadFileCallback
            ? (SDL_StorageInterfaceReadFileCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceReadFileCallback() {
        super(CIF);
    }

    SDL_StorageInterfaceReadFileCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_StorageInterfaceReadFileCallback {

        private final SDL_StorageInterfaceReadFileCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceReadFileCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata, long path, long destination, long length) {
            return delegate.invoke(userdata, path, destination, length);
        }

    }

}