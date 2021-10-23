/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val img_generate_mipmap = "IMGGenerateMipmap".nativeClassCL("img_generate_mipmap", IMG) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension adds the functionality to generate mipmap images from a source image and thus avoid having to generate and import mipmapped images from
        the host or through the {@code cl_khr_gl_sharing} extension.
        
        Requires ${khr_mipmap_image.link}.
        """

    IntConstant(
        "Values accepted with cl_mipmap_filter_mode_img.",

        "MIPMAP_FILTER_ANY_IMG"..0x0,
        "MIPMAP_FILTER_BOX_IMG"..0x1
    )

    IntConstant(
        "New command types cl_command_type.",

        "COMMAND_GENERATE_MIPMAP_IMG"..0x40D6
    )

    cl_int(
        "EnqueueGenerateMipmapIMG",
        """
        Generates mipmap levels from a source image to a destination image.
        
        This allows for seamless mipmap level generation without involving the host to generate them, as that would involve reading back the image, generate
        its mipmap levels and then upload it to the device again. This reduces bandwidth cost of generating mipmap levels as no host copy is needed and may
        improve the speed of generating mipmap levels. The source image and destination image can be the same image in order to reduce programming and memory
        overhead. As with the extension for mipmaps, the size of the image must be a power of 2.
        """,

        cl_command_queue("command_queue", "a valid command-queue"),
        cl_mem("src_image", "a valid 1D, 2D, 3D image or a 1D image array, 2D image array object"),
        cl_mem("dst_image", "a valid 1D, 2D, 3D image or a 1D image array, 2D image array object"),
        cl_mipmap_filter_mode_img("mipmap_filter_mode", "the filter mode to generate the mipmap levels with"),
        Check(2)..nullable..size_t.const.p("array_region", "the {@code (n,m)} image range in a 1D and 2D image array to generate"),
        Check(2)..nullable..size_t.const.p("mip_region", "the {@code (n,m)} region of mipmap levels to generate in {@code dst_image}"),
        NEWL,
        EWL,
        EVENT
    )
}