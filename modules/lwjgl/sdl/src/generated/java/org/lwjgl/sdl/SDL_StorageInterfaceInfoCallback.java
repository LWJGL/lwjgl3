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
    public static SDL_StorageInterfaceInfoCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceInfoCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_StorageInterfaceInfoCallback} instance that delegates to the specified {@code SDL_StorageInterfaceInfoCallbackI} instance. */
    public static SDL_StorageInterfaceInfoCallback create(SDL_StorageInterfaceInfoCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_StorageInterfaceInfoCallback create(SDL_StorageInterfaceInfoCallbackI instance, long functionPointer) {
        return instance instanceof SDL_StorageInterfaceInfoCallback
            ? (SDL_StorageInterfaceInfoCallback)instance
            : new SDL_StorageInterfaceInfoCallback(functionPointer) {
                @Override public boolean invoke(long userdata, long path, long info) {
                    return instance.invoke(userdata, path, info);
                }
            };
    }

    protected SDL_StorageInterfaceInfoCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceInfoCallback(long functionPointer) {
        super(functionPointer);
    }

}