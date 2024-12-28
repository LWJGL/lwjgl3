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
public abstract class SDL_StorageInterfaceEnumerateCallback extends Callback implements SDL_StorageInterfaceEnumerateCallbackI {

    /**
     * Creates a {@code SDL_StorageInterfaceEnumerateCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_StorageInterfaceEnumerateCallback}
     */
    public static SDL_StorageInterfaceEnumerateCallback create(long functionPointer) {
        SDL_StorageInterfaceEnumerateCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_StorageInterfaceEnumerateCallback
            ? (SDL_StorageInterfaceEnumerateCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceEnumerateCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_StorageInterfaceEnumerateCallback} instance that delegates to the specified {@code SDL_StorageInterfaceEnumerateCallbackI} instance. */
    public static SDL_StorageInterfaceEnumerateCallback create(SDL_StorageInterfaceEnumerateCallbackI instance) {
        return instance instanceof SDL_StorageInterfaceEnumerateCallback
            ? (SDL_StorageInterfaceEnumerateCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceEnumerateCallback() {
        super(CIF);
    }

    SDL_StorageInterfaceEnumerateCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_StorageInterfaceEnumerateCallback {

        private final SDL_StorageInterfaceEnumerateCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceEnumerateCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata, long path, long callback, long callback_userdata) {
            return delegate.invoke(userdata, path, callback, callback_userdata);
        }

    }

}