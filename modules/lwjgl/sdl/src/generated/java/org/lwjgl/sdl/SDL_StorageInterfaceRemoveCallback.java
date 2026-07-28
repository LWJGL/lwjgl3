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
    public static SDL_StorageInterfaceRemoveCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceRemoveCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_StorageInterfaceRemoveCallback} instance that delegates to the specified {@code SDL_StorageInterfaceRemoveCallbackI} instance. */
    public static SDL_StorageInterfaceRemoveCallback create(SDL_StorageInterfaceRemoveCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_StorageInterfaceRemoveCallback create(SDL_StorageInterfaceRemoveCallbackI instance, long functionPointer) {
        return instance instanceof SDL_StorageInterfaceRemoveCallback
            ? (SDL_StorageInterfaceRemoveCallback)instance
            : new SDL_StorageInterfaceRemoveCallback(functionPointer) {
                @Override public boolean invoke(long userdata, long path) {
                    return instance.invoke(userdata, path);
                }
            };
    }

    protected SDL_StorageInterfaceRemoveCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceRemoveCallback(long functionPointer) {
        super(functionPointer);
    }

}