/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Module_Destructor} */
public abstract class FT_Module_Destructor extends Callback implements FT_Module_DestructorI {

    /**
     * Creates a {@code FT_Module_Destructor} instance from the specified function pointer.
     *
     * @return the new {@code FT_Module_Destructor}
     */
    public static FT_Module_Destructor create(long functionPointer) {
        FT_Module_DestructorI instance = Callback.get(functionPointer);
        return instance instanceof FT_Module_Destructor
            ? (FT_Module_Destructor)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Module_Destructor createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_Module_Destructor} instance that delegates to the specified {@code FT_Module_DestructorI} instance. */
    public static FT_Module_Destructor create(FT_Module_DestructorI instance) {
        return instance instanceof FT_Module_Destructor
            ? (FT_Module_Destructor)instance
            : new Container(instance.address(), instance);
    }

    protected FT_Module_Destructor() {
        super(CIF);
    }

    FT_Module_Destructor(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_Module_Destructor {

        private final FT_Module_DestructorI delegate;

        Container(long functionPointer, FT_Module_DestructorI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long module) {
            delegate.invoke(module);
        }

    }

}