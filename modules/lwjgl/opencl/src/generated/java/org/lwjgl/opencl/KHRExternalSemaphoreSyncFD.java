/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRExternalSemaphoreSyncFD {

    public static final int CL_SEMAPHORE_HANDLE_SYNC_FD_KHR = 0x2058;

    protected KHRExternalSemaphoreSyncFD() {
        throw new UnsupportedOperationException();
    }

    // --- [ clReImportSemaphoreSyncFdKHR ] ---

    /** {@code cl_int clReImportSemaphoreSyncFdKHR(cl_semaphore_khr sema_object, cl_semaphore_reimport_properties_khr * reimport_props, int fd)} */
    public static int nclReImportSemaphoreSyncFdKHR(long sema_object, long reimport_props, int fd) {
        long __functionAddress = CL.getICD().clReImportSemaphoreSyncFdKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(sema_object);
        }
        return callPPI(sema_object, reimport_props, fd, __functionAddress);
    }

    /** {@code cl_int clReImportSemaphoreSyncFdKHR(cl_semaphore_khr sema_object, cl_semaphore_reimport_properties_khr * reimport_props, int fd)} */
    @NativeType("cl_int")
    public static int clReImportSemaphoreSyncFdKHR(@NativeType("cl_semaphore_khr") long sema_object, @NativeType("cl_semaphore_reimport_properties_khr *") @Nullable LongBuffer reimport_props, int fd) {
        if (CHECKS) {
            checkNTSafe(reimport_props);
        }
        return nclReImportSemaphoreSyncFdKHR(sema_object, memAddressSafe(reimport_props), fd);
    }

    /** {@code cl_int clReImportSemaphoreSyncFdKHR(cl_semaphore_khr sema_object, cl_semaphore_reimport_properties_khr * reimport_props, int fd)} */
    @NativeType("cl_int")
    public static int clReImportSemaphoreSyncFdKHR(@NativeType("cl_semaphore_khr") long sema_object, @NativeType("cl_semaphore_reimport_properties_khr *") long @Nullable [] reimport_props, int fd) {
        long __functionAddress = CL.getICD().clReImportSemaphoreSyncFdKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(sema_object);
            checkNTSafe(reimport_props);
        }
        return callPPI(sema_object, reimport_props, fd, __functionAddress);
    }

}