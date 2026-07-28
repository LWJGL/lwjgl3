/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke shaderc_include_result_release_fn} */
public abstract class ShadercIncludeResultRelease extends Callback implements ShadercIncludeResultReleaseI {

    /**
     * Creates a {@code ShadercIncludeResultRelease} instance from the specified function pointer.
     *
     * @return the new {@code ShadercIncludeResultRelease}
     */
    public static ShadercIncludeResultRelease create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ShadercIncludeResultRelease createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ShadercIncludeResultRelease} instance that delegates to the specified {@code ShadercIncludeResultReleaseI} instance. */
    public static ShadercIncludeResultRelease create(ShadercIncludeResultReleaseI instance) { return create(instance, instance.address()); }

    private static ShadercIncludeResultRelease create(ShadercIncludeResultReleaseI instance, long functionPointer) {
        return instance instanceof ShadercIncludeResultRelease
            ? (ShadercIncludeResultRelease)instance
            : new ShadercIncludeResultRelease(functionPointer) {
                @Override public void invoke(long user_data, long include_result) {
                    instance.invoke(user_data, include_result);
                }
            };
    }

    protected ShadercIncludeResultRelease() {
        super(DESCRIPTOR);
    }

    ShadercIncludeResultRelease(long functionPointer) {
        super(functionPointer);
    }

}