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
    public static SDL_StorageInterfaceRenameCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceRenameCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_StorageInterfaceRenameCallback} instance that delegates to the specified {@code SDL_StorageInterfaceRenameCallbackI} instance. */
    public static SDL_StorageInterfaceRenameCallback create(SDL_StorageInterfaceRenameCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_StorageInterfaceRenameCallback create(SDL_StorageInterfaceRenameCallbackI instance, long functionPointer) {
        return instance instanceof SDL_StorageInterfaceRenameCallback
            ? (SDL_StorageInterfaceRenameCallback)instance
            : new SDL_StorageInterfaceRenameCallback(functionPointer) {
                @Override public boolean invoke(long userdata, long oldpath, long newpath) {
                    return instance.invoke(userdata, oldpath, newpath);
                }
            };
    }

    protected SDL_StorageInterfaceRenameCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceRenameCallback(long functionPointer) {
        super(functionPointer);
    }

}