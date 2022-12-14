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
 * FT_Error (*{@link #invoke}) (
 *     FTC_FaceID face_id,
 *     FT_Library library,
 *     FT_Pointer req_data,
 *     FT_Face *aface
 * )</code></pre>
 */
public abstract class FTC_Face_Requester extends Callback implements FTC_Face_RequesterI {

    /**
     * Creates a {@code FTC_Face_Requester} instance from the specified function pointer.
     *
     * @return the new {@code FTC_Face_Requester}
     */
    public static FTC_Face_Requester create(long functionPointer) {
        FTC_Face_RequesterI instance = Callback.get(functionPointer);
        return instance instanceof FTC_Face_Requester
            ? (FTC_Face_Requester)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FTC_Face_Requester createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FTC_Face_Requester} instance that delegates to the specified {@code FTC_Face_RequesterI} instance. */
    public static FTC_Face_Requester create(FTC_Face_RequesterI instance) {
        return instance instanceof FTC_Face_Requester
            ? (FTC_Face_Requester)instance
            : new Container(instance.address(), instance);
    }

    protected FTC_Face_Requester() {
        super(CIF);
    }

    FTC_Face_Requester(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FTC_Face_Requester {

        private final FTC_Face_RequesterI delegate;

        Container(long functionPointer, FTC_Face_RequesterI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long face_id, long library, long req_data, long aface) {
            return delegate.invoke(face_id, library, req_data, aface);
        }

    }

}