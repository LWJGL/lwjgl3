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
public abstract class SDL_StorageInterfaceRenameCallback extends Callback implements SDL_StorageInterfaceRenameCallbackI {

    /**
     * Creates a {@code SDL_StorageInterfaceRenameCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_StorageInterfaceRenameCallback}
     */
    public static SDL_StorageInterfaceRenameCallback create(long functionPointer) {
        SDL_StorageInterfaceRenameCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_StorageInterfaceRenameCallback
            ? (SDL_StorageInterfaceRenameCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceRenameCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_StorageInterfaceRenameCallback} instance that delegates to the specified {@code SDL_StorageInterfaceRenameCallbackI} instance. */
    public static SDL_StorageInterfaceRenameCallback create(SDL_StorageInterfaceRenameCallbackI instance) {
        return instance instanceof SDL_StorageInterfaceRenameCallback
            ? (SDL_StorageInterfaceRenameCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceRenameCallback() {
        super(CIF);
    }

    SDL_StorageInterfaceRenameCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_StorageInterfaceRenameCallback {

        private final SDL_StorageInterfaceRenameCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceRenameCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata, long oldpath, long newpath) {
            return delegate.invoke(userdata, oldpath, newpath);
        }

    }

}