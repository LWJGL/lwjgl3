/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_cl_event.txt">ARB_cl_event</a> extension.
 * 
 * <p>This extension allows creating OpenGL sync objects linked to OpenCL event objects, potentially improving efficiency of sharing images and buffers
 * between the two APIs. The companion {@code cl_khr_gl_event} OpenCL extension provides the complementary functionality of creating an OpenCL event
 * object from an OpenGL fence sync object.</p>
 * 
 * <p>Requires {@link GL32 OpenGL 3.2} or {@link ARBSync ARB_sync}. Requires an OpenCL implementation supporting sharing event objects with OpenGL.</p>
 */
public class ARBCLEvent {

    static { GL.initialize(); }

    /** Returned in {@code values} for {@link GL32C#glGetSynciv GetSynciv} {@code pname} {@link GL32#GL_OBJECT_TYPE OBJECT_TYPE}. */
    public static final int GL_SYNC_CL_EVENT_ARB = 0x8240;

    /** Returned in {@code values} for {@link GL32C#glGetSynciv GetSynciv} {@code pname} {@link GL32#GL_SYNC_CONDITION SYNC_CONDITION}. */
    public static final int GL_SYNC_CL_EVENT_COMPLETE_ARB = 0x8241;

    protected ARBCLEvent() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCreateSyncFromCLeventARB ] ---

    /** Unsafe version of: {@link #glCreateSyncFromCLeventARB CreateSyncFromCLeventARB} */
    public static native long nglCreateSyncFromCLeventARB(long context, long event, int flags);

    /**
     * Creates a linked sync object. {@code context} and {@code event} must be handles to a valid OpenCL context and a valid event in that context,
     * respectively. {@code context} must support sharing with GL, and must have been created with respect to the current GL context, or to a share group
     * including the current GL context.
     * 
     * <p>The status of such a sync object depends on {@code event}. When the status of {@code event} is {@code CL_QUEUED}, {@code CL_SUBMITTED}, or
     * {@code CL_RUNNING}, the status of the linked sync object will be {@link GL32#GL_UNSIGNALED UNSIGNALED}. When the status of {@code event} changes to {@code CL_COMPLETE}, the
     * status of the linked sync object will become {@link GL32#GL_SIGNALED SIGNALED}.</p>
     * 
     * <p>Creating a linked sync object places a reference on the linked OpenCL event object. When the sync object is deleted, the reference will be removed from
     * the event object.</p>
     *
     * @param context a valid OpenCL context
     * @param event   a valid OpenCL event
     * @param flags   must be 0 (placeholder for anticipated future extensions of sync object capabilities)
     */
    @NativeType("GLsync")
    public static long glCreateSyncFromCLeventARB(@NativeType("cl_context") long context, @NativeType("cl_event") long event, @NativeType("GLbitfield") int flags) {
        if (CHECKS) {
            check(context);
            check(event);
        }
        return nglCreateSyncFromCLeventARB(context, event, flags);
    }

}