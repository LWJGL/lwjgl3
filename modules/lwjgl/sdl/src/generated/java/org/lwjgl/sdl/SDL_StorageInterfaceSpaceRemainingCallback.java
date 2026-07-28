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
    public static SDL_StorageInterfaceSpaceRemainingCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceSpaceRemainingCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_StorageInterfaceSpaceRemainingCallback} instance that delegates to the specified {@code SDL_StorageInterfaceSpaceRemainingCallbackI} instance. */
    public static SDL_StorageInterfaceSpaceRemainingCallback create(SDL_StorageInterfaceSpaceRemainingCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_StorageInterfaceSpaceRemainingCallback create(SDL_StorageInterfaceSpaceRemainingCallbackI instance, long functionPointer) {
        return instance instanceof SDL_StorageInterfaceSpaceRemainingCallback
            ? (SDL_StorageInterfaceSpaceRemainingCallback)instance
            : new SDL_StorageInterfaceSpaceRemainingCallback(functionPointer) {
                @Override public long invoke(long userdata) {
                    return instance.invoke(userdata);
                }
            };
    }

    protected SDL_StorageInterfaceSpaceRemainingCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceSpaceRemainingCallback(long functionPointer) {
        super(functionPointer);
    }

}