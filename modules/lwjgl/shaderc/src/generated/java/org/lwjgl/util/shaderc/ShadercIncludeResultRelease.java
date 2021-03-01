/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link Shaderc#shaderc_compile_options_set_include_callbacks compile_options_set_include_callbacks} function.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     void *user_data,
 *     shaderc_include_result *include_result
 * )</code></pre>
 */
public abstract class ShadercIncludeResultRelease extends Callback implements ShadercIncludeResultReleaseI {

    /**
     * Creates a {@code ShadercIncludeResultRelease} instance from the specified function pointer.
     *
     * @return the new {@code ShadercIncludeResultRelease}
     */
    public static ShadercIncludeResultRelease create(long functionPointer) {
        ShadercIncludeResultReleaseI instance = Callback.get(functionPointer);
        return instance instanceof ShadercIncludeResultRelease
            ? (ShadercIncludeResultRelease)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ShadercIncludeResultRelease createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ShadercIncludeResultRelease} instance that delegates to the specified {@code ShadercIncludeResultReleaseI} instance. */
    public static ShadercIncludeResultRelease create(ShadercIncludeResultReleaseI instance) {
        return instance instanceof ShadercIncludeResultRelease
            ? (ShadercIncludeResultRelease)instance
            : new Container(instance.address(), instance);
    }

    protected ShadercIncludeResultRelease() {
        super(CIF);
    }

    ShadercIncludeResultRelease(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ShadercIncludeResultRelease {

        private final ShadercIncludeResultReleaseI delegate;

        Container(long functionPointer, ShadercIncludeResultReleaseI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long user_data, long include_result) {
            delegate.invoke(user_data, include_result);
        }

    }

}