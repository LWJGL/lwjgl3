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
    public static SDL_StorageInterfaceCopyCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceCopyCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_StorageInterfaceCopyCallback} instance that delegates to the specified {@code SDL_StorageInterfaceCopyCallbackI} instance. */
    public static SDL_StorageInterfaceCopyCallback create(SDL_StorageInterfaceCopyCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_StorageInterfaceCopyCallback create(SDL_StorageInterfaceCopyCallbackI instance, long functionPointer) {
        return instance instanceof SDL_StorageInterfaceCopyCallback
            ? (SDL_StorageInterfaceCopyCallback)instance
            : new SDL_StorageInterfaceCopyCallback(functionPointer) {
                @Override public boolean invoke(long userdata, long oldpath, long newpath) {
                    return instance.invoke(userdata, oldpath, newpath);
                }
            };
    }

    protected SDL_StorageInterfaceCopyCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceCopyCallback(long functionPointer) {
        super(functionPointer);
    }

}