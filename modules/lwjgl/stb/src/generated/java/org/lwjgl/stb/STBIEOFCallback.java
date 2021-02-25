/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set to the {@code eof} field of the {@link STBIIOCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * int (*) (
 *     void *user
 * )</code></pre>
 */
public abstract class STBIEOFCallback extends Callback implements STBIEOFCallbackI {

    /**
     * Creates a {@code STBIEOFCallback} instance from the specified function pointer.
     *
     * @return the new {@code STBIEOFCallback}
     */
    public static STBIEOFCallback create(long functionPointer) {
        STBIEOFCallbackI instance = Callback.get(functionPointer);
        return instance instanceof STBIEOFCallback
            ? (STBIEOFCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static STBIEOFCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code STBIEOFCallback} instance that delegates to the specified {@code STBIEOFCallbackI} instance. */
    public static STBIEOFCallback create(STBIEOFCallbackI instance) {
        return instance instanceof STBIEOFCallback
            ? (STBIEOFCallback)instance
            : new Container(instance.address(), instance);
    }

    protected STBIEOFCallback() {
        super(CIF);
    }

    STBIEOFCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends STBIEOFCallback {

        private final STBIEOFCallbackI delegate;

        Container(long functionPointer, STBIEOFCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long user) {
            return delegate.invoke(user);
        }

    }

}