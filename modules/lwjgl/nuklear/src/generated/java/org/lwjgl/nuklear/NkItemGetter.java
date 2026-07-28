/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke nk_item_getter} */
public abstract class NkItemGetter extends Callback implements NkItemGetterI {

    /**
     * Creates a {@code NkItemGetter} instance from the specified function pointer.
     *
     * @return the new {@code NkItemGetter}
     */
    public static NkItemGetter create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable NkItemGetter createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code NkItemGetter} instance that delegates to the specified {@code NkItemGetterI} instance. */
    public static NkItemGetter create(NkItemGetterI instance) { return create(instance, instance.address()); }

    private static NkItemGetter create(NkItemGetterI instance, long functionPointer) {
        return instance instanceof NkItemGetter
            ? (NkItemGetter)instance
            : new NkItemGetter(functionPointer) {
                @Override public float invoke(long userdata, int selected, long item) {
                    return instance.invoke(userdata, selected, item);
                }
            };
    }

    protected NkItemGetter() {
        super(DESCRIPTOR);
    }

    NkItemGetter(long functionPointer) {
        super(functionPointer);
    }

}