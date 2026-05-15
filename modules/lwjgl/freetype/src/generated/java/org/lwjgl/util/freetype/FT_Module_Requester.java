/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Module_Requester} */
public abstract class FT_Module_Requester extends Callback implements FT_Module_RequesterI {

    /**
     * Creates a {@code FT_Module_Requester} instance from the specified function pointer.
     *
     * @return the new {@code FT_Module_Requester}
     */
    public static FT_Module_Requester create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Module_Requester createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Module_Requester} instance that delegates to the specified {@code FT_Module_RequesterI} instance. */
    public static FT_Module_Requester create(FT_Module_RequesterI instance) { return create(instance, instance.address()); }

    private static FT_Module_Requester create(FT_Module_RequesterI instance, long functionPointer) {
        return instance instanceof FT_Module_Requester
            ? (FT_Module_Requester)instance
            : new FT_Module_Requester(functionPointer) {
                @Override public long invoke(long module, long name) {
                    return instance.invoke(module, name);
                }
            };
    }

    protected FT_Module_Requester() {
        super(DESCRIPTOR);
    }

    FT_Module_Requester(long functionPointer) {
        super(functionPointer);
    }

}