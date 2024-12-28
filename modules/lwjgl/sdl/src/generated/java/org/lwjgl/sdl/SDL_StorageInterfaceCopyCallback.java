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
public abstract class SDL_StorageInterfaceCopyCallback extends Callback implements SDL_StorageInterfaceCopyCallbackI {

    /**
     * Creates a {@code SDL_StorageInterfaceCopyCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_StorageInterfaceCopyCallback}
     */
    public static SDL_StorageInterfaceCopyCallback create(long functionPointer) {
        SDL_StorageInterfaceCopyCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_StorageInterfaceCopyCallback
            ? (SDL_StorageInterfaceCopyCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceCopyCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_StorageInterfaceCopyCallback} instance that delegates to the specified {@code SDL_StorageInterfaceCopyCallbackI} instance. */
    public static SDL_StorageInterfaceCopyCallback create(SDL_StorageInterfaceCopyCallbackI instance) {
        return instance instanceof SDL_StorageInterfaceCopyCallback
            ? (SDL_StorageInterfaceCopyCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceCopyCallback() {
        super(CIF);
    }

    SDL_StorageInterfaceCopyCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_StorageInterfaceCopyCallback {

        private final SDL_StorageInterfaceCopyCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceCopyCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata, long oldpath, long newpath) {
            return delegate.invoke(userdata, oldpath, newpath);
        }

    }

}