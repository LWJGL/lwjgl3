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
public abstract class SDL_StorageInterfaceInfoCallback extends Callback implements SDL_StorageInterfaceInfoCallbackI {

    /**
     * Creates a {@code SDL_StorageInterfaceInfoCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_StorageInterfaceInfoCallback}
     */
    public static SDL_StorageInterfaceInfoCallback create(long functionPointer) {
        SDL_StorageInterfaceInfoCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_StorageInterfaceInfoCallback
            ? (SDL_StorageInterfaceInfoCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceInfoCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_StorageInterfaceInfoCallback} instance that delegates to the specified {@code SDL_StorageInterfaceInfoCallbackI} instance. */
    public static SDL_StorageInterfaceInfoCallback create(SDL_StorageInterfaceInfoCallbackI instance) {
        return instance instanceof SDL_StorageInterfaceInfoCallback
            ? (SDL_StorageInterfaceInfoCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceInfoCallback() {
        super(CIF);
    }

    SDL_StorageInterfaceInfoCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_StorageInterfaceInfoCallback {

        private final SDL_StorageInterfaceInfoCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceInfoCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata, long path, long info) {
            return delegate.invoke(userdata, path, info);
        }

    }

}