/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

public class ARBCLEvent {

    static { GL.initialize(); }

    public static final int GL_SYNC_CL_EVENT_ARB = 0x8240;

    public static final int GL_SYNC_CL_EVENT_COMPLETE_ARB = 0x8241;

    protected ARBCLEvent() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCreateSyncFromCLeventARB ] ---

    /** {@code GLsync glCreateSyncFromCLeventARB(cl_context context, cl_event event, GLbitfield flags)} */
    public static native long nglCreateSyncFromCLeventARB(long context, long event, int flags);

    /** {@code GLsync glCreateSyncFromCLeventARB(cl_context context, cl_event event, GLbitfield flags)} */
    @NativeType("GLsync")
    public static long glCreateSyncFromCLeventARB(@NativeType("cl_context") long context, @NativeType("cl_event") long event, @NativeType("GLbitfield") int flags) {
        if (CHECKS) {
            check(context);
            check(event);
        }
        return nglCreateSyncFromCLeventARB(context, event, flags);
    }

}