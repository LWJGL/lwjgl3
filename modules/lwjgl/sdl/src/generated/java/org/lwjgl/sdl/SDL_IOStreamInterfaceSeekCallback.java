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
public abstract class SDL_IOStreamInterfaceSeekCallback extends Callback implements SDL_IOStreamInterfaceSeekCallbackI {

    /**
     * Creates a {@code SDL_IOStreamInterfaceSeekCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_IOStreamInterfaceSeekCallback}
     */
    public static SDL_IOStreamInterfaceSeekCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_IOStreamInterfaceSeekCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_IOStreamInterfaceSeekCallback} instance that delegates to the specified {@code SDL_IOStreamInterfaceSeekCallbackI} instance. */
    public static SDL_IOStreamInterfaceSeekCallback create(SDL_IOStreamInterfaceSeekCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_IOStreamInterfaceSeekCallback create(SDL_IOStreamInterfaceSeekCallbackI instance, long functionPointer) {
        return instance instanceof SDL_IOStreamInterfaceSeekCallback
            ? (SDL_IOStreamInterfaceSeekCallback)instance
            : new SDL_IOStreamInterfaceSeekCallback(functionPointer) {
                @Override public long invoke(long userdata, long offset, int whence) {
                    return instance.invoke(userdata, offset, whence);
                }
            };
    }

    protected SDL_IOStreamInterfaceSeekCallback() {
        super(DESCRIPTOR);
    }

    SDL_IOStreamInterfaceSeekCallback(long functionPointer) {
        super(functionPointer);
    }

}