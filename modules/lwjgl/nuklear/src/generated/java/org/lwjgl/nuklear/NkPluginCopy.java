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
    public static NkPluginCopy create(long functionPointer) {
        NkPluginCopyI instance = Callback.get(functionPointer);
        return instance instanceof NkPluginCopy
            ? (NkPluginCopy)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable NkPluginCopy createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code NkPluginCopy} instance that delegates to the specified {@code NkPluginCopyI} instance. */
    public static NkPluginCopy create(NkPluginCopyI instance) {
        return instance instanceof NkPluginCopy
            ? (NkPluginCopy)instance
            : new Container(instance.address(), instance);
    }

    protected NkPluginCopy() {
        super(CIF);
    }

    NkPluginCopy(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends NkPluginCopy {

        private final NkPluginCopyI delegate;

        Container(long functionPointer, NkPluginCopyI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long handle, long text, int len) {
            delegate.invoke(handle, text, len);
        }

    }

}