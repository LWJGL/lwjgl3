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

public class IMGGenerateMipmap {

    public static final int
        CL_MIPMAP_FILTER_ANY_IMG = 0x0,
        CL_MIPMAP_FILTER_BOX_IMG = 0x1;

    public static final int CL_COMMAND_GENERATE_MIPMAP_IMG = 0x40D6;

    protected IMGGenerateMipmap() {
        throw new UnsupportedOperationException();
    }

    // --- [ clEnqueueGenerateMipmapIMG ] ---

    /** {@code cl_int clEnqueueGenerateMipmapIMG(cl_command_queue command_queue, cl_mem src_image, cl_mem dst_image, cl_mipmap_filter_mode_img mipmap_filter_mode, size_t const * array_region, size_t const * mip_region, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueGenerateMipmapIMG(long command_queue, long src_image, long dst_image, int mipmap_filter_mode, long array_region, long mip_region, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueGenerateMipmapIMG;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(src_image);
            check(dst_image);
        }
        return callPPPPPPPI(command_queue, src_image, dst_image, mipmap_filter_mode, array_region, mip_region, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueGenerateMipmapIMG(cl_command_queue command_queue, cl_mem src_image, cl_mem dst_image, cl_mipmap_filter_mode_img mipmap_filter_mode, size_t const * array_region, size_t const * mip_region, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueGenerateMipmapIMG(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_image, @NativeType("cl_mem") long dst_image, @NativeType("cl_mipmap_filter_mode_img") int mipmap_filter_mode, @NativeType("size_t const *") @Nullable PointerBuffer array_region, @NativeType("size_t const *") @Nullable PointerBuffer mip_region, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(array_region, 2);
            checkSafe(mip_region, 2);
            checkSafe(event, 1);
        }
        return nclEnqueueGenerateMipmapIMG(command_queue, src_image, dst_image, mipmap_filter_mode, memAddressSafe(array_region), memAddressSafe(mip_region), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

}