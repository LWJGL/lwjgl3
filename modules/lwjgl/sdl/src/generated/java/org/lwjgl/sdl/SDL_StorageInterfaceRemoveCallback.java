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
public abstract class SDL_StorageInterfaceRemoveCallback extends Callback implements SDL_StorageInterfaceRemoveCallbackI {

    /**
     * Creates a {@code SDL_StorageInterfaceRemoveCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_StorageInterfaceRemoveCallback}
     */
    public static SDL_StorageInterfaceRemoveCallback create(long functionPointer) {
        SDL_StorageInterfaceRemoveCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_StorageInterfaceRemoveCallback
            ? (SDL_StorageInterfaceRemoveCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceRemoveCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_StorageInterfaceRemoveCallback} instance that delegates to the specified {@code SDL_StorageInterfaceRemoveCallbackI} instance. */
    public static SDL_StorageInterfaceRemoveCallback create(SDL_StorageInterfaceRemoveCallbackI instance) {
        return instance instanceof SDL_StorageInterfaceRemoveCallback
            ? (SDL_StorageInterfaceRemoveCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceRemoveCallback() {
        super(CIF);
    }

    SDL_StorageInterfaceRemoveCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_StorageInterfaceRemoveCallback {

        private final SDL_StorageInterfaceRemoveCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceRemoveCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata, long path) {
            return delegate.invoke(userdata, path);
        }

    }

}