/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke nk_plugin_filter} */
public abstract class NkPluginFilter extends Callback implements NkPluginFilterI {

    /**
     * Creates a {@code NkPluginFilter} instance from the specified function pointer.
     *
     * @return the new {@code NkPluginFilter}
     */
    public static NkPluginFilter create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable NkPluginFilter createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code NkPluginFilter} instance that delegates to the specified {@code NkPluginFilterI} instance. */
    public static NkPluginFilter create(NkPluginFilterI instance) { return create(instance, instance.address()); }

    private static NkPluginFilter create(NkPluginFilterI instance, long functionPointer) {
        return instance instanceof NkPluginFilter
            ? (NkPluginFilter)instance
            : new NkPluginFilter(functionPointer) {
                @Override public boolean invoke(long edit, int unicode) {
                    return instance.invoke(edit, unicode);
                }
            };
    }

    protected NkPluginFilter() {
        super(DESCRIPTOR);
    }

    NkPluginFilter(long functionPointer) {
        super(functionPointer);
    }

}