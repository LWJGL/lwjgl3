/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke nk_plugin_alloc} */
public abstract class NkPluginAlloc extends Callback implements NkPluginAllocI {

    /**
     * Creates a {@code NkPluginAlloc} instance from the specified function pointer.
     *
     * @return the new {@code NkPluginAlloc}
     */
    public static NkPluginAlloc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable NkPluginAlloc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code NkPluginAlloc} instance that delegates to the specified {@code NkPluginAllocI} instance. */
    public static NkPluginAlloc create(NkPluginAllocI instance) { return create(instance, instance.address()); }

    private static NkPluginAlloc create(NkPluginAllocI instance, long functionPointer) {
        return instance instanceof NkPluginAlloc
            ? (NkPluginAlloc)instance
            : new NkPluginAlloc(functionPointer) {
                @Override public long invoke(long handle, long old, long size) {
                    return instance.invoke(handle, old, size);
                }
            };
    }

    protected NkPluginAlloc() {
        super(DESCRIPTOR);
    }

    NkPluginAlloc(long functionPointer) {
        super(functionPointer);
    }

}