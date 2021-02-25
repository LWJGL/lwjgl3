/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * A mutation handler.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     id id
 * )</code></pre>
 */
public abstract class EnumerationMutationHandler extends Callback implements EnumerationMutationHandlerI {

    /**
     * Creates a {@code EnumerationMutationHandler} instance from the specified function pointer.
     *
     * @return the new {@code EnumerationMutationHandler}
     */
    public static EnumerationMutationHandler create(long functionPointer) {
        EnumerationMutationHandlerI instance = Callback.get(functionPointer);
        return instance instanceof EnumerationMutationHandler
            ? (EnumerationMutationHandler)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static EnumerationMutationHandler createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code EnumerationMutationHandler} instance that delegates to the specified {@code EnumerationMutationHandlerI} instance. */
    public static EnumerationMutationHandler create(EnumerationMutationHandlerI instance) {
        return instance instanceof EnumerationMutationHandler
            ? (EnumerationMutationHandler)instance
            : new Container(instance.address(), instance);
    }

    protected EnumerationMutationHandler() {
        super(CIF);
    }

    EnumerationMutationHandler(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends EnumerationMutationHandler {

        private final EnumerationMutationHandlerI delegate;

        Container(long functionPointer, EnumerationMutationHandlerI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long id) {
            delegate.invoke(id);
        }

    }

}