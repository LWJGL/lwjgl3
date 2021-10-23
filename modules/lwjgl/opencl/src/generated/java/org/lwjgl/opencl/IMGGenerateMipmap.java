/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/img/cl_img_generate_mipmap.txt">img_generate_mipmap</a> extension.
 * 
 * <p>This extension adds the functionality to generate mipmap images from a source image and thus avoid having to generate and import mipmapped images from
 * the host or through the {@code cl_khr_gl_sharing} extension.</p>
 * 
 * <p>Requires {@link KHRMipmapImage khr_mipmap_image}.</p>
 */
public class IMGGenerateMipmap {

    /** Values accepted with cl_mipmap_filter_mode_img. */
    public static final int
        CL_MIPMAP_FILTER_ANY_IMG = 0x0,
        CL_MIPMAP_FILTER_BOX_IMG = 0x1;

    /** New command types cl_command_type. */
    public static final int CL_COMMAND_GENERATE_MIPMAP_IMG = 0x40D6;

    protected IMGGenerateMipmap() {
        throw new UnsupportedOperationException();
    }

    // --- [ clEnqueueGenerateMipmapIMG ] ---

    /**
     * Unsafe version of: {@link #clEnqueueGenerateMipmapIMG EnqueueGenerateMipmapIMG}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
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

    /**
     * Generates mipmap levels from a source image to a destination image.
     * 
     * <p>This allows for seamless mipmap level generation without involving the host to generate them, as that would involve reading back the image, generate
     * its mipmap levels and then upload it to the device again. This reduces bandwidth cost of generating mipmap levels as no host copy is needed and may
     * improve the speed of generating mipmap levels. The source image and destination image can be the same image in order to reduce programming and memory
     * overhead. As with the extension for mipmaps, the size of the image must be a power of 2.</p>
     *
     * @param command_queue      a valid command-queue
     * @param src_image          a valid 1D, 2D, 3D image or a 1D image array, 2D image array object
     * @param dst_image          a valid 1D, 2D, 3D image or a 1D image array, 2D image array object
     * @param mipmap_filter_mode the filter mode to generate the mipmap levels with
     * @param array_region       the {@code (n,m)} image range in a 1D and 2D image array to generate
     * @param mip_region         the {@code (n,m)} region of mipmap levels to generate in {@code dst_image}
     * @param event_wait_list    a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                           does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                           {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event              Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                           {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                           complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                           {@code event_wait_list} array.
     */
    @NativeType("cl_int")
    public static int clEnqueueGenerateMipmapIMG(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_image, @NativeType("cl_mem") long dst_image, @NativeType("cl_mipmap_filter_mode_img") int mipmap_filter_mode, @Nullable @NativeType("size_t const *") PointerBuffer array_region, @Nullable @NativeType("size_t const *") PointerBuffer mip_region, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(array_region, 2);
            checkSafe(mip_region, 2);
            checkSafe(event, 1);
        }
        return nclEnqueueGenerateMipmapIMG(command_queue, src_image, dst_image, mipmap_filter_mode, memAddressSafe(array_region), memAddressSafe(mip_region), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

}