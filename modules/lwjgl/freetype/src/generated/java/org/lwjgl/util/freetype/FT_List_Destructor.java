/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     FT_Memory memory,
 *     void *data,
 *     void *user
 * )</code></pre>
 */
public abstract class FT_List_Destructor extends Callback implements FT_List_DestructorI {

    /**
     * Creates a {@code FT_List_Destructor} instance from the specified function pointer.
     *
     * @return the new {@code FT_List_Destructor}
     */
    public static FT_List_Destructor create(long functionPointer) {
        FT_List_DestructorI instance = Callback.get(functionPointer);
        return instance instanceof FT_List_Destructor
            ? (FT_List_Destructor)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_List_Destructor createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_List_Destructor} instance that delegates to the specified {@code FT_List_DestructorI} instance. */
    public static FT_List_Destructor create(FT_List_DestructorI instance) {
        return instance instanceof FT_List_Destructor
            ? (FT_List_Destructor)instance
            : new Container(instance.address(), instance);
    }

    protected FT_List_Destructor() {
        super(CIF);
    }

    FT_List_Destructor(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_List_Destructor {

        private final FT_List_DestructorI delegate;

        Container(long functionPointer, FT_List_DestructorI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long memory, long data, long user) {
            delegate.invoke(memory, data, user);
        }

    }

}