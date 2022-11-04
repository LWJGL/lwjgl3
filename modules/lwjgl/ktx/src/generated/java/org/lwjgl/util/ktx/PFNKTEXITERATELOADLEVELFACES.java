/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * KTX_error_code (*{@link #invoke}) (
 *     ktxTexture *This,
 *     PFNKTXITERCB iterCb,
 *     void *userdata
 * )</code></pre>
 */
public abstract class PFNKTEXITERATELOADLEVELFACES extends Callback implements PFNKTEXITERATELOADLEVELFACESI {

    /**
     * Creates a {@code PFNKTEXITERATELOADLEVELFACES} instance from the specified function pointer.
     *
     * @return the new {@code PFNKTEXITERATELOADLEVELFACES}
     */
    public static PFNKTEXITERATELOADLEVELFACES create(long functionPointer) {
        PFNKTEXITERATELOADLEVELFACESI instance = Callback.get(functionPointer);
        return instance instanceof PFNKTEXITERATELOADLEVELFACES
            ? (PFNKTEXITERATELOADLEVELFACES)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static PFNKTEXITERATELOADLEVELFACES createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code PFNKTEXITERATELOADLEVELFACES} instance that delegates to the specified {@code PFNKTEXITERATELOADLEVELFACESI} instance. */
    public static PFNKTEXITERATELOADLEVELFACES create(PFNKTEXITERATELOADLEVELFACESI instance) {
        return instance instanceof PFNKTEXITERATELOADLEVELFACES
            ? (PFNKTEXITERATELOADLEVELFACES)instance
            : new Container(instance.address(), instance);
    }

    protected PFNKTEXITERATELOADLEVELFACES() {
        super(CIF);
    }

    PFNKTEXITERATELOADLEVELFACES(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends PFNKTEXITERATELOADLEVELFACES {

        private final PFNKTEXITERATELOADLEVELFACESI delegate;

        Container(long functionPointer, PFNKTEXITERATELOADLEVELFACESI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long This, long iterCb, long userdata) {
            return delegate.invoke(This, iterCb, userdata);
        }

    }

}