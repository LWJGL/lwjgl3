/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Module_Constructor} */
public abstract class FT_Module_Constructor extends Callback implements FT_Module_ConstructorI {

    /**
     * Creates a {@code FT_Module_Constructor} instance from the specified function pointer.
     *
     * @return the new {@code FT_Module_Constructor}
     */
    public static FT_Module_Constructor create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Module_Constructor createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Module_Constructor} instance that delegates to the specified {@code FT_Module_ConstructorI} instance. */
    public static FT_Module_Constructor create(FT_Module_ConstructorI instance) { return create(instance, instance.address()); }

    private static FT_Module_Constructor create(FT_Module_ConstructorI instance, long functionPointer) {
        return instance instanceof FT_Module_Constructor
            ? (FT_Module_Constructor)instance
            : new FT_Module_Constructor(functionPointer) {
                @Override public int invoke(long module) {
                    return instance.invoke(module);
                }
            };
    }

    protected FT_Module_Constructor() {
        super(DESCRIPTOR);
    }

    FT_Module_Constructor(long functionPointer) {
        super(functionPointer);
    }

}