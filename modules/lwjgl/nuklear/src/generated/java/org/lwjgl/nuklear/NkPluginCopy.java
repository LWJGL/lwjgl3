/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke nk_plugin_copy} */
public abstract class NkPluginCopy extends Callback implements NkPluginCopyI {

    /**
     * Creates a {@code NkPluginCopy} instance from the specified function pointer.
     *
     * @return the new {@code NkPluginCopy}
     */
    public static NkPluginCopy create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable NkPluginCopy createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code NkPluginCopy} instance that delegates to the specified {@code NkPluginCopyI} instance. */
    public static NkPluginCopy create(NkPluginCopyI instance) { return create(instance, instance.address()); }

    private static NkPluginCopy create(NkPluginCopyI instance, long functionPointer) {
        return instance instanceof NkPluginCopy
            ? (NkPluginCopy)instance
            : new NkPluginCopy(functionPointer) {
                @Override public void invoke(long handle, long text, int len) {
                    instance.invoke(handle, text, len);
                }
            };
    }

    protected NkPluginCopy() {
        super(DESCRIPTOR);
    }

    NkPluginCopy(long functionPointer) {
        super(functionPointer);
    }

}