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
public abstract class SDL_IOStreamInterfaceFlushCallback extends Callback implements SDL_IOStreamInterfaceFlushCallbackI {

    /**
     * Creates a {@code SDL_IOStreamInterfaceFlushCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_IOStreamInterfaceFlushCallback}
     */
    public static SDL_IOStreamInterfaceFlushCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_IOStreamInterfaceFlushCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_IOStreamInterfaceFlushCallback} instance that delegates to the specified {@code SDL_IOStreamInterfaceFlushCallbackI} instance. */
    public static SDL_IOStreamInterfaceFlushCallback create(SDL_IOStreamInterfaceFlushCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_IOStreamInterfaceFlushCallback create(SDL_IOStreamInterfaceFlushCallbackI instance, long functionPointer) {
        return instance instanceof SDL_IOStreamInterfaceFlushCallback
            ? (SDL_IOStreamInterfaceFlushCallback)instance
            : new SDL_IOStreamInterfaceFlushCallback(functionPointer) {
                @Override public boolean invoke(long userdata, long status) {
                    return instance.invoke(userdata, status);
                }
            };
    }

    protected SDL_IOStreamInterfaceFlushCallback() {
        super(DESCRIPTOR);
    }

    SDL_IOStreamInterfaceFlushCallback(long functionPointer) {
        super(functionPointer);
    }

}