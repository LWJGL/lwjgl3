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
    public static SDL_StorageInterfaceEnumerateCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceEnumerateCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_StorageInterfaceEnumerateCallback} instance that delegates to the specified {@code SDL_StorageInterfaceEnumerateCallbackI} instance. */
    public static SDL_StorageInterfaceEnumerateCallback create(SDL_StorageInterfaceEnumerateCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_StorageInterfaceEnumerateCallback create(SDL_StorageInterfaceEnumerateCallbackI instance, long functionPointer) {
        return instance instanceof SDL_StorageInterfaceEnumerateCallback
            ? (SDL_StorageInterfaceEnumerateCallback)instance
            : new SDL_StorageInterfaceEnumerateCallback(functionPointer) {
                @Override public boolean invoke(long userdata, long path, long callback, long callback_userdata) {
                    return instance.invoke(userdata, path, callback, callback_userdata);
                }
            };
    }

    protected SDL_StorageInterfaceEnumerateCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceEnumerateCallback(long functionPointer) {
        super(functionPointer);
    }

}