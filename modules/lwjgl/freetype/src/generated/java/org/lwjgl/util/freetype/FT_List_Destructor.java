/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_List_Destructor} */
public abstract class FT_List_Destructor extends Callback implements FT_List_DestructorI {

    /**
     * Creates a {@code FT_List_Destructor} instance from the specified function pointer.
     *
     * @return the new {@code FT_List_Destructor}
     */
    public static FT_List_Destructor create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_List_Destructor createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_List_Destructor} instance that delegates to the specified {@code FT_List_DestructorI} instance. */
    public static FT_List_Destructor create(FT_List_DestructorI instance) { return create(instance, instance.address()); }

    private static FT_List_Destructor create(FT_List_DestructorI instance, long functionPointer) {
        return instance instanceof FT_List_Destructor
            ? (FT_List_Destructor)instance
            : new FT_List_Destructor(functionPointer) {
                @Override public void invoke(long memory, long data, long user) {
                    instance.invoke(memory, data, user);
                }
            };
    }

    protected FT_List_Destructor() {
        super(DESCRIPTOR);
    }

    FT_List_Destructor(long functionPointer) {
        super(functionPointer);
    }

}