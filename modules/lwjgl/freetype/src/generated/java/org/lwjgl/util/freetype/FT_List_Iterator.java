/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_List_Iterator} */
public abstract class FT_List_Iterator extends Callback implements FT_List_IteratorI {

    /**
     * Creates a {@code FT_List_Iterator} instance from the specified function pointer.
     *
     * @return the new {@code FT_List_Iterator}
     */
    public static FT_List_Iterator create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_List_Iterator createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_List_Iterator} instance that delegates to the specified {@code FT_List_IteratorI} instance. */
    public static FT_List_Iterator create(FT_List_IteratorI instance) { return create(instance, instance.address()); }

    private static FT_List_Iterator create(FT_List_IteratorI instance, long functionPointer) {
        return instance instanceof FT_List_Iterator
            ? (FT_List_Iterator)instance
            : new FT_List_Iterator(functionPointer) {
                @Override public int invoke(long node, long user) {
                    return instance.invoke(node, user);
                }
            };
    }

    protected FT_List_Iterator() {
        super(DESCRIPTOR);
    }

    FT_List_Iterator(long functionPointer) {
        super(functionPointer);
    }

}