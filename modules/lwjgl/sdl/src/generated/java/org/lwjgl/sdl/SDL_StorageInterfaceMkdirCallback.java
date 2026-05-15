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
    public static SDL_StorageInterfaceMkdirCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceMkdirCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_StorageInterfaceMkdirCallback} instance that delegates to the specified {@code SDL_StorageInterfaceMkdirCallbackI} instance. */
    public static SDL_StorageInterfaceMkdirCallback create(SDL_StorageInterfaceMkdirCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_StorageInterfaceMkdirCallback create(SDL_StorageInterfaceMkdirCallbackI instance, long functionPointer) {
        return instance instanceof SDL_StorageInterfaceMkdirCallback
            ? (SDL_StorageInterfaceMkdirCallback)instance
            : new SDL_StorageInterfaceMkdirCallback(functionPointer) {
                @Override public boolean invoke(long userdata, long path) {
                    return instance.invoke(userdata, path);
                }
            };
    }

    protected SDL_StorageInterfaceMkdirCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceMkdirCallback(long functionPointer) {
        super(functionPointer);
    }

}