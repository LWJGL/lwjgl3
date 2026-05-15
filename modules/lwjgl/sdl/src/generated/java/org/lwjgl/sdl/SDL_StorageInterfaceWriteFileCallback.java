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
public abstract class SDL_StorageInterfaceWriteFileCallback extends Callback implements SDL_StorageInterfaceWriteFileCallbackI {

    /**
     * Creates a {@code SDL_StorageInterfaceWriteFileCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_StorageInterfaceWriteFileCallback}
     */
    public static SDL_StorageInterfaceWriteFileCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceWriteFileCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_StorageInterfaceWriteFileCallback} instance that delegates to the specified {@code SDL_StorageInterfaceWriteFileCallbackI} instance. */
    public static SDL_StorageInterfaceWriteFileCallback create(SDL_StorageInterfaceWriteFileCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_StorageInterfaceWriteFileCallback create(SDL_StorageInterfaceWriteFileCallbackI instance, long functionPointer) {
        return instance instanceof SDL_StorageInterfaceWriteFileCallback
            ? (SDL_StorageInterfaceWriteFileCallback)instance
            : new SDL_StorageInterfaceWriteFileCallback(functionPointer) {
                @Override public boolean invoke(long userdata, long path, long source, long length) {
                    return instance.invoke(userdata, path, source, length);
                }
            };
    }

    protected SDL_StorageInterfaceWriteFileCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceWriteFileCallback(long functionPointer) {
        super(functionPointer);
    }

}