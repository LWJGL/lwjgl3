/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_MouseMotionTransformCallback} */
public abstract class SDL_MouseMotionTransformCallback extends Callback implements SDL_MouseMotionTransformCallbackI {

    /**
     * Creates a {@code SDL_MouseMotionTransformCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_MouseMotionTransformCallback}
     */
    public static SDL_MouseMotionTransformCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_MouseMotionTransformCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_MouseMotionTransformCallback} instance that delegates to the specified {@code SDL_MouseMotionTransformCallbackI} instance. */
    public static SDL_MouseMotionTransformCallback create(SDL_MouseMotionTransformCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_MouseMotionTransformCallback create(SDL_MouseMotionTransformCallbackI instance, long functionPointer) {
        return instance instanceof SDL_MouseMotionTransformCallback
            ? (SDL_MouseMotionTransformCallback)instance
            : new SDL_MouseMotionTransformCallback(functionPointer) {
                @Override public void invoke(long userdata, long timestamp, long window, int mouseID, long x, long y) {
                    instance.invoke(userdata, timestamp, window, mouseID, x, y);
                }
            };
    }

    protected SDL_MouseMotionTransformCallback() {
        super(DESCRIPTOR);
    }

    SDL_MouseMotionTransformCallback(long functionPointer) {
        super(functionPointer);
    }

}