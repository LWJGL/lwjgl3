/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke nk_plugin_free} */
public abstract class NkPluginFree extends Callback implements NkPluginFreeI {

    /**
     * Creates a {@code NkPluginFree} instance from the specified function pointer.
     *
     * @return the new {@code NkPluginFree}
     */
    public static NkPluginFree create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable NkPluginFree createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code NkPluginFree} instance that delegates to the specified {@code NkPluginFreeI} instance. */
    public static NkPluginFree create(NkPluginFreeI instance) { return create(instance, instance.address()); }

    private static NkPluginFree create(NkPluginFreeI instance, long functionPointer) {
        return instance instanceof NkPluginFree
            ? (NkPluginFree)instance
            : new NkPluginFree(functionPointer) {
                @Override public void invoke(long handle, long old) {
                    instance.invoke(handle, old);
                }
            };
    }

    protected NkPluginFree() {
        super(DESCRIPTOR);
    }

    NkPluginFree(long functionPointer) {
        super(functionPointer);
    }

}