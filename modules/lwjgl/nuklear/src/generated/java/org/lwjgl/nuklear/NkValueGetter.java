/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke nk_value_getter} */
public abstract class NkValueGetter extends Callback implements NkValueGetterI {

    /**
     * Creates a {@code NkValueGetter} instance from the specified function pointer.
     *
     * @return the new {@code NkValueGetter}
     */
    public static NkValueGetter create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable NkValueGetter createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code NkValueGetter} instance that delegates to the specified {@code NkValueGetterI} instance. */
    public static NkValueGetter create(NkValueGetterI instance) { return create(instance, instance.address()); }

    private static NkValueGetter create(NkValueGetterI instance, long functionPointer) {
        return instance instanceof NkValueGetter
            ? (NkValueGetter)instance
            : new NkValueGetter(functionPointer) {
                @Override public float invoke(long userdata, int index) {
                    return instance.invoke(userdata, index);
                }
            };
    }

    protected NkValueGetter() {
        super(DESCRIPTOR);
    }

    NkValueGetter(long functionPointer) {
        super(functionPointer);
    }

}