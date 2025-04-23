/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class IMGCancelCommand {

    public static final int CL_CANCELLED_IMG = -1126;

    protected IMGCancelCommand() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCancelCommandsIMG ] ---

    /** {@code cl_int clCancelCommandsIMG(cl_event const * event_list, size_t num_events_in_list)} */
    public static int nclCancelCommandsIMG(long event_list, long num_events_in_list) {
        long __functionAddress = CL.getICD().clCancelCommandsIMG;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(event_list, num_events_in_list, __functionAddress);
    }

    /** {@code cl_int clCancelCommandsIMG(cl_event const * event_list, size_t num_events_in_list)} */
    @NativeType("cl_int")
    public static int clCancelCommandsIMG(@NativeType("cl_event const *") @Nullable PointerBuffer event_list) {
        return nclCancelCommandsIMG(memAddressSafe(event_list), remainingSafe(event_list));
    }

}