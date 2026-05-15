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
    public static SDL_StorageInterfaceReadyCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceReadyCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_StorageInterfaceReadyCallback} instance that delegates to the specified {@code SDL_StorageInterfaceReadyCallbackI} instance. */
    public static SDL_StorageInterfaceReadyCallback create(SDL_StorageInterfaceReadyCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_StorageInterfaceReadyCallback create(SDL_StorageInterfaceReadyCallbackI instance, long functionPointer) {
        return instance instanceof SDL_StorageInterfaceReadyCallback
            ? (SDL_StorageInterfaceReadyCallback)instance
            : new SDL_StorageInterfaceReadyCallback(functionPointer) {
                @Override public boolean invoke(long userdata) {
                    return instance.invoke(userdata);
                }
            };
    }

    protected SDL_StorageInterfaceReadyCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceReadyCallback(long functionPointer) {
        super(functionPointer);
    }

}