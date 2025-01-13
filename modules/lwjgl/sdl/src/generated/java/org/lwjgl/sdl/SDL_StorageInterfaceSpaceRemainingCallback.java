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
public abstract class SDL_StorageInterfaceSpaceRemainingCallback extends Callback implements SDL_StorageInterfaceSpaceRemainingCallbackI {

    /**
     * Creates a {@code SDL_StorageInterfaceSpaceRemainingCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_StorageInterfaceSpaceRemainingCallback}
     */
    public static SDL_StorageInterfaceSpaceRemainingCallback create(long functionPointer) {
        SDL_StorageInterfaceSpaceRemainingCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_StorageInterfaceSpaceRemainingCallback
            ? (SDL_StorageInterfaceSpaceRemainingCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceSpaceRemainingCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_StorageInterfaceSpaceRemainingCallback} instance that delegates to the specified {@code SDL_StorageInterfaceSpaceRemainingCallbackI} instance. */
    public static SDL_StorageInterfaceSpaceRemainingCallback create(SDL_StorageInterfaceSpaceRemainingCallbackI instance) {
        return instance instanceof SDL_StorageInterfaceSpaceRemainingCallback
            ? (SDL_StorageInterfaceSpaceRemainingCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceSpaceRemainingCallback() {
        super(CIF);
    }

    SDL_StorageInterfaceSpaceRemainingCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_StorageInterfaceSpaceRemainingCallback {

        private final SDL_StorageInterfaceSpaceRemainingCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceSpaceRemainingCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long userdata) {
            return delegate.invoke(userdata);
        }

    }

}