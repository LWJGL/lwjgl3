/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to stb_image_resize.h from the <a href="https://github.com/nothings/stb">stb library</a>.
 * 
 * <p>Written with emphasis on usability, portability, and efficiency. (No SIMD or threads, so it be easily outperformed by libs that use those.) Only
 * scaling and translation is supported, no rotations or shears. Easy API downsamples w/Mitchell filter, upsamples w/cubic interpolation.</p>
 * 
 * <h3>QUICKSTART</h3>
 * 
 * <pre><code>
 * stbir_resize_uint8(      input_pixels , in_w , in_h , 0,
 *                          output_pixels, out_w, out_h, 0, num_channels)
 * stbir_resize_float(...)
 * stbir_resize_uint8_srgb( input_pixels , in_w , in_h , 0,
 *                          output_pixels, out_w, out_h, 0,
 *                          num_channels , alpha_chan  , 0)
 * stbir_resize_uint8_srgb_edgemode(
 *                          input_pixels , in_w , in_h , 0,
 *                          output_pixels, out_w, out_h, 0,
 *                          num_channels , alpha_chan  , 0, STBIR_EDGE_CLAMP)
 *                                                       // WRAP/REFLECT/ZERO</code></pre>
 * 
 * <h3>ALPHA CHANNEL</h3>
 * 
 * <p>Most of the resizing functions provide the ability to control how the alpha channel of an image is processed. The important things to know about this:</p>
 * 
 * <ol>
 * <li>The best mathematically-behaved version of alpha to use is called "premultiplied alpha", in which the other color channels have had the alpha value
 * multiplied in. If you use premultiplied alpha, linear filtering (such as image resampling done by this library, or performed in texture units on
 * GPUs) does the "right thing". While premultiplied alpha is standard in the movie CGI industry, it is still uncommon in the videogame/real-time
 * world. If you linearly filter non-premultiplied alpha, strange effects occur. (For example, the average of 1% opaque bright green and 99% opaque
 * black produces 50% transparent dark green when non-premultiplied, whereas premultiplied it produces 50% transparent near-black. The former
 * introduces green energy that doesn't exist in the source image.)</li>
 * <li>Artists should not edit premultiplied-alpha images; artists want non-premultiplied alpha images. Thus, art tools generally output non-premultiplied
 * alpha images.</li>
 * <li>You will get best results in most cases by converting images to premultiplied alpha before processing them mathematically.</li>
 * <li>If you pass the flag {@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}, the resizer does not do anything special for the alpha channel; it is resampled identically to
 * other channels. This produces the correct results for premultiplied-alpha images, but produces less-than-ideal results for non-premultiplied-alpha
 * images.</li>
 * <li>If you do not pass the flag {@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}, then the resizer weights the contribution of input pixels based on their alpha values, or,
 * equivalently, it multiplies the alpha value into the color channels, resamples, then divides by the resultant alpha value. Input pixels which have
 * {@code alpha=0} do not contribute at all to output pixels unless <b>all</b> of the input pixels affecting that output pixel have {@code alpha=0},
 * in which case the result for that pixel is the same as it would be without {@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}. However, this is only true for input images
 * in integer formats. For input images in float format, input pixels with {@code alpha=0} have no effect, and output pixels which have
 * {@code alpha=0} will be 0 in all channels. (For float images, you can manually achieve the same result by adding a tiny epsilon value to the alpha
 * channel of every image, and then subtracting or clamping it at the end.)</li>
 * <li>You can separately control whether the alpha channel is interpreted as linear or affected by the colorspace. By default it is linear; you almost
 * never want to apply the colorspace. (For example, graphics hardware does not apply sRGB conversion to the alpha channel.)</li>
 * </ol>
 */
public class STBImageResize {

    static { LibSTB.initialize(); }

    /** Set this flag if you have no alpha channel, or otherwise provide the index of the alpha channel. */
    public static final int STBIR_ALPHA_CHANNEL_NONE = -1;

    /**
     * Set this flag if your texture has premultiplied alpha. Otherwise, stbir will use alpha-weighted resampling (effectively premultiplying, resampling,
     * then unpremultiplying).
     */
    public static final int STBIR_FLAG_ALPHA_PREMULTIPLIED = 1 << 0;

    /** The specified alpha channel should be handled as gamma-corrected value even when doing sRGB operations. */
    public static final int STBIR_FLAG_ALPHA_USES_COLORSPACE = 1 << 1;

    /**
     * Edge wrap mode.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STBIR_EDGE_CLAMP EDGE_CLAMP}</li>
     * <li>{@link #STBIR_EDGE_REFLECT EDGE_REFLECT}</li>
     * <li>{@link #STBIR_EDGE_WRAP EDGE_WRAP}</li>
     * <li>{@link #STBIR_EDGE_ZERO EDGE_ZERO}</li>
     * </ul>
     */
    public static final int
        STBIR_EDGE_CLAMP   = 0x1,
        STBIR_EDGE_REFLECT = 0x2,
        STBIR_EDGE_WRAP    = 0x3,
        STBIR_EDGE_ZERO    = 0x4;

    /**
     * Filters.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STBIR_FILTER_DEFAULT FILTER_DEFAULT} - Use same filter type that easy-to-use API chooses.</li>
     * <li>{@link #STBIR_FILTER_BOX FILTER_BOX} - A trapezoid w/1-pixel wide ramps, same result as box for integer scale ratios.</li>
     * <li>{@link #STBIR_FILTER_TRIANGLE FILTER_TRIANGLE} - On upsampling, produces same results as bilinear texture filtering.</li>
     * <li>{@link #STBIR_FILTER_CUBICBSPLINE FILTER_CUBICBSPLINE} - The cubic b-spline (aka Mitchell-Netrevalli with B=1,C=0), gaussian-esque.</li>
     * <li>{@link #STBIR_FILTER_CATMULLROM FILTER_CATMULLROM} - An interpolating cubic spline.</li>
     * <li>{@link #STBIR_FILTER_MITCHELL FILTER_MITCHELL} - Mitchell-Netrevalli filter with B=1/3, C=1/3.</li>
     * </ul>
     */
    public static final int
        STBIR_FILTER_DEFAULT      = 0,
        STBIR_FILTER_BOX          = 1,
        STBIR_FILTER_TRIANGLE     = 2,
        STBIR_FILTER_CUBICBSPLINE = 3,
        STBIR_FILTER_CATMULLROM   = 4,
        STBIR_FILTER_MITCHELL     = 5;

    /**
     * Colorspace.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STBIR_COLORSPACE_LINEAR COLORSPACE_LINEAR}</li>
     * <li>{@link #STBIR_COLORSPACE_SRGB COLORSPACE_SRGB}</li>
     * </ul>
     */
    public static final int
        STBIR_COLORSPACE_LINEAR = 0,
        STBIR_COLORSPACE_SRGB   = 1;

    /**
     * Data type.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STBIR_TYPE_UINT8 TYPE_UINT8}</li>
     * <li>{@link #STBIR_TYPE_UINT16 TYPE_UINT16}</li>
     * <li>{@link #STBIR_TYPE_UINT32 TYPE_UINT32}</li>
     * <li>{@link #STBIR_TYPE_FLOAT TYPE_FLOAT}</li>
     * </ul>
     */
    public static final int
        STBIR_TYPE_UINT8  = 0,
        STBIR_TYPE_UINT16 = 1,
        STBIR_TYPE_UINT32 = 2,
        STBIR_TYPE_FLOAT  = 3;

    protected STBImageResize() {
        throw new UnsupportedOperationException();
    }

    // --- [ stbir_resize_uint8 ] ---

    /** Unsafe version of: {@link #stbir_resize_uint8 resize_uint8} */
    public static native int nstbir_resize_uint8(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels);

    /**
     * Easy-to-use API for resizing images.
     * 
     * <ul>
     * <li>The colorspace is linear.</li>
     * <li>The alpha channel is treated identically to other channels.</li>
     * <li>Memory required grows approximately linearly with input and output size, but with discontinuities at {@code input_w == output_w} and
     * {@code input_h == output_h}.</li>
     * </ul>
     * 
     * <p>This function uses the default resampling filter defined at compile time. For a different filter, use the medium-complexity API.</p>
     *
     * @param input_pixels           the source image data
     * @param input_w                the source image width
     * @param input_h                the source image height
     * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param output_pixels          returns the scaled image data
     * @param output_w               the resized image width
     * @param output_h               the resized image height
     * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbir_resize_uint8(@NativeType("unsigned char const *") ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("unsigned char *") ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels) {
        if (CHECKS) {
            check(input_pixels, input_h * (input_stride_in_bytes == 0 ? input_w * num_channels : input_stride_in_bytes));
            check(output_pixels, output_h * (output_stride_in_bytes == 0 ? output_w * num_channels : output_stride_in_bytes));
        }
        return nstbir_resize_uint8(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, num_channels) != 0;
    }

    // --- [ stbir_resize_float ] ---

    /** Unsafe version of: {@link #stbir_resize_float resize_float} */
    public static native int nstbir_resize_float(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels);

    /**
     * Float version of {@link #stbir_resize_uint8 resize_uint8}.
     *
     * @param input_pixels           the source image data
     * @param input_w                the source image width
     * @param input_h                the source image height
     * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param output_pixels          returns the scaled image data
     * @param output_w               the resized image width
     * @param output_h               the resized image height
     * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbir_resize_float(@NativeType("float const *") FloatBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("float *") FloatBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels) {
        if (CHECKS) {
            check(input_pixels, input_h * (input_stride_in_bytes == 0 ? input_w * num_channels : (input_stride_in_bytes >> 2)));
            check(output_pixels, output_h * (output_stride_in_bytes == 0 ? output_w * num_channels : (output_stride_in_bytes >> 2)));
        }
        return nstbir_resize_float(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, num_channels) != 0;
    }

    // --- [ stbir_resize_uint8_srgb ] ---

    /** Unsafe version of: {@link #stbir_resize_uint8_srgb resize_uint8_srgb} */
    public static native int nstbir_resize_uint8_srgb(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags);

    /**
     * Easy-to-use API for resizing images.
     * 
     * <ul>
     * <li>The image data is interpreted as gamma-corrected sRGB.</li>
     * <li>Memory required grows approximately linearly with input and output size, but with discontinuities at {@code input_w == output_w} and
     * {@code input_h == output_h}.</li>
     * </ul>
     * 
     * <p>This function uses the default resampling filter defined at compile time. For a different filter, use the medium-complexity API.</p>
     *
     * @param input_pixels           the source image data
     * @param input_w                the source image width
     * @param input_h                the source image height
     * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param output_pixels          returns the scaled image data
     * @param output_w               the resized image width
     * @param output_h               the resized image height
     * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
     * @param alpha_channel          the alpha channel index, or {@link #STBIR_ALPHA_CHANNEL_NONE ALPHA_CHANNEL_NONE} if there is no alpha channel
     * @param flags                  the alpha channel flags. 0 will propably do the right thing if you're not sure what the flags mean. One of:<br><table><tr><td>{@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}</td><td>{@link #STBIR_FLAG_ALPHA_USES_COLORSPACE FLAG_ALPHA_USES_COLORSPACE}</td></tr></table>
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbir_resize_uint8_srgb(@NativeType("unsigned char const *") ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("unsigned char *") ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags) {
        if (CHECKS) {
            check(input_pixels, input_h * (input_stride_in_bytes == 0 ? input_w * num_channels : input_stride_in_bytes));
            check(output_pixels, output_h * (output_stride_in_bytes == 0 ? output_w * num_channels : output_stride_in_bytes));
        }
        return nstbir_resize_uint8_srgb(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags) != 0;
    }

    // --- [ stbir_resize_uint8_srgb_edgemode ] ---

    /** Unsafe version of: {@link #stbir_resize_uint8_srgb_edgemode resize_uint8_srgb_edgemode} */
    public static native int nstbir_resize_uint8_srgb_edgemode(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, int edge_wrap_mode);

    /**
     * Same as {@link #stbir_resize_uint8_srgb resize_uint8_srgb}, but adds the ability to specify how requests to sample off the edge of the image are handled.
     *
     * @param input_pixels           the source image data
     * @param input_w                the source image width
     * @param input_h                the source image height
     * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param output_pixels          returns the scaled image data
     * @param output_w               the resized image width
     * @param output_h               the resized image height
     * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
     * @param alpha_channel          the alpha channel index, or {@link #STBIR_ALPHA_CHANNEL_NONE ALPHA_CHANNEL_NONE} if there is no alpha channel
     * @param flags                  the alpha channel flags. 0 will propably do the right thing if you're not sure what the flags mean. One of:<br><table><tr><td>{@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}</td><td>{@link #STBIR_FLAG_ALPHA_USES_COLORSPACE FLAG_ALPHA_USES_COLORSPACE}</td></tr></table>
     * @param edge_wrap_mode         the edge wrap mode. One of:<br><table><tr><td>{@link #STBIR_EDGE_CLAMP EDGE_CLAMP}</td><td>{@link #STBIR_EDGE_REFLECT EDGE_REFLECT}</td><td>{@link #STBIR_EDGE_WRAP EDGE_WRAP}</td><td>{@link #STBIR_EDGE_ZERO EDGE_ZERO}</td></tr></table>
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbir_resize_uint8_srgb_edgemode(@NativeType("unsigned char const *") ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("unsigned char *") ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, @NativeType("stbir_edge") int edge_wrap_mode) {
        if (CHECKS) {
            check(input_pixels, input_h * (input_stride_in_bytes == 0 ? input_w * num_channels : input_stride_in_bytes));
            check(output_pixels, output_h * (output_stride_in_bytes == 0 ? output_w * num_channels : output_stride_in_bytes));
        }
        return nstbir_resize_uint8_srgb_edgemode(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, edge_wrap_mode) != 0;
    }

    // --- [ stbir_resize_uint8_generic ] ---

    /** Unsafe version of: {@link #stbir_resize_uint8_generic resize_uint8_generic} */
    public static native int nstbir_resize_uint8_generic(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, int edge_wrap_mode, int filter, int space, long alloc_context);

    /**
     * Medium-complexity version of {@link #stbir_resize_uint8 resize_uint8}.
     *
     * @param input_pixels           the source image data
     * @param input_w                the source image width
     * @param input_h                the source image height
     * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param output_pixels          returns the scaled image data
     * @param output_w               the resized image width
     * @param output_h               the resized image height
     * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
     * @param alpha_channel          the alpha channel index, or {@link #STBIR_ALPHA_CHANNEL_NONE ALPHA_CHANNEL_NONE} if there is no alpha channel
     * @param flags                  the alpha channel flags. 0 will propably do the right thing if you're not sure what the flags mean. One of:<br><table><tr><td>{@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}</td><td>{@link #STBIR_FLAG_ALPHA_USES_COLORSPACE FLAG_ALPHA_USES_COLORSPACE}</td></tr></table>
     * @param edge_wrap_mode         the edge wrap mode. One of:<br><table><tr><td>{@link #STBIR_EDGE_CLAMP EDGE_CLAMP}</td><td>{@link #STBIR_EDGE_REFLECT EDGE_REFLECT}</td><td>{@link #STBIR_EDGE_WRAP EDGE_WRAP}</td><td>{@link #STBIR_EDGE_ZERO EDGE_ZERO}</td></tr></table>
     * @param filter                 the scale filter. One of:<br><table><tr><td>{@link #STBIR_FILTER_DEFAULT FILTER_DEFAULT}</td><td>{@link #STBIR_FILTER_BOX FILTER_BOX}</td><td>{@link #STBIR_FILTER_TRIANGLE FILTER_TRIANGLE}</td><td>{@link #STBIR_FILTER_CUBICBSPLINE FILTER_CUBICBSPLINE}</td><td>{@link #STBIR_FILTER_CATMULLROM FILTER_CATMULLROM}</td></tr><tr><td>{@link #STBIR_FILTER_MITCHELL FILTER_MITCHELL}</td></tr></table>
     * @param space                  the image colorspace. One of:<br><table><tr><td>{@link #STBIR_COLORSPACE_LINEAR COLORSPACE_LINEAR}</td><td>{@link #STBIR_COLORSPACE_SRGB COLORSPACE_SRGB}</td></tr></table>
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbir_resize_uint8_generic(@NativeType("unsigned char const *") ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("unsigned char *") ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, @NativeType("stbir_edge") int edge_wrap_mode, @NativeType("stbir_filter") int filter, @NativeType("stbir_colorspace") int space) {
        if (CHECKS) {
            check(input_pixels, input_h * (input_stride_in_bytes == 0 ? input_w * num_channels : input_stride_in_bytes));
            check(output_pixels, output_h * (output_stride_in_bytes == 0 ? output_w * num_channels : output_stride_in_bytes));
        }
        return nstbir_resize_uint8_generic(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, edge_wrap_mode, filter, space, NULL) != 0;
    }

    // --- [ stbir_resize_uint16_generic ] ---

    /** Unsafe version of: {@link #stbir_resize_uint16_generic resize_uint16_generic} */
    public static native int nstbir_resize_uint16_generic(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, int edge_wrap_mode, int filter, int space, long alloc_context);

    /**
     * Short version of {@link #stbir_resize_uint8_generic resize_uint8_generic}.
     *
     * @param input_pixels           the source image data
     * @param input_w                the source image width
     * @param input_h                the source image height
     * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param output_pixels          returns the scaled image data
     * @param output_w               the resized image width
     * @param output_h               the resized image height
     * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
     * @param alpha_channel          the alpha channel index, or {@link #STBIR_ALPHA_CHANNEL_NONE ALPHA_CHANNEL_NONE} if there is no alpha channel
     * @param flags                  the alpha channel flags. 0 will propably do the right thing if you're not sure what the flags mean. One of:<br><table><tr><td>{@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}</td><td>{@link #STBIR_FLAG_ALPHA_USES_COLORSPACE FLAG_ALPHA_USES_COLORSPACE}</td></tr></table>
     * @param edge_wrap_mode         the edge wrap mode. One of:<br><table><tr><td>{@link #STBIR_EDGE_CLAMP EDGE_CLAMP}</td><td>{@link #STBIR_EDGE_REFLECT EDGE_REFLECT}</td><td>{@link #STBIR_EDGE_WRAP EDGE_WRAP}</td><td>{@link #STBIR_EDGE_ZERO EDGE_ZERO}</td></tr></table>
     * @param filter                 the scale filter. One of:<br><table><tr><td>{@link #STBIR_FILTER_DEFAULT FILTER_DEFAULT}</td><td>{@link #STBIR_FILTER_BOX FILTER_BOX}</td><td>{@link #STBIR_FILTER_TRIANGLE FILTER_TRIANGLE}</td><td>{@link #STBIR_FILTER_CUBICBSPLINE FILTER_CUBICBSPLINE}</td><td>{@link #STBIR_FILTER_CATMULLROM FILTER_CATMULLROM}</td></tr><tr><td>{@link #STBIR_FILTER_MITCHELL FILTER_MITCHELL}</td></tr></table>
     * @param space                  the image colorspace. One of:<br><table><tr><td>{@link #STBIR_COLORSPACE_LINEAR COLORSPACE_LINEAR}</td><td>{@link #STBIR_COLORSPACE_SRGB COLORSPACE_SRGB}</td></tr></table>
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbir_resize_uint16_generic(@NativeType("stbir_uint16 const *") ShortBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("stbir_uint16 *") ShortBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, @NativeType("stbir_edge") int edge_wrap_mode, @NativeType("stbir_filter") int filter, @NativeType("stbir_colorspace") int space) {
        if (CHECKS) {
            check(input_pixels, input_h * (input_stride_in_bytes == 0 ? input_w * num_channels : (input_stride_in_bytes >> 1)));
            check(output_pixels, output_h * (output_stride_in_bytes == 0 ? output_w * num_channels : (output_stride_in_bytes >> 1)));
        }
        return nstbir_resize_uint16_generic(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, edge_wrap_mode, filter, space, NULL) != 0;
    }

    // --- [ stbir_resize_float_generic ] ---

    /** Unsafe version of: {@link #stbir_resize_float_generic resize_float_generic} */
    public static native int nstbir_resize_float_generic(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, int edge_wrap_mode, int filter, int space, long alloc_context);

    /**
     * Float version of {@link #stbir_resize_uint8_generic resize_uint8_generic}.
     *
     * @param input_pixels           the source image data
     * @param input_w                the source image width
     * @param input_h                the source image height
     * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param output_pixels          returns the scaled image data
     * @param output_w               the resized image width
     * @param output_h               the resized image height
     * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
     * @param alpha_channel          the alpha channel index, or {@link #STBIR_ALPHA_CHANNEL_NONE ALPHA_CHANNEL_NONE} if there is no alpha channel
     * @param flags                  the alpha channel flags. 0 will propably do the right thing if you're not sure what the flags mean. One of:<br><table><tr><td>{@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}</td><td>{@link #STBIR_FLAG_ALPHA_USES_COLORSPACE FLAG_ALPHA_USES_COLORSPACE}</td></tr></table>
     * @param edge_wrap_mode         the edge wrap mode. One of:<br><table><tr><td>{@link #STBIR_EDGE_CLAMP EDGE_CLAMP}</td><td>{@link #STBIR_EDGE_REFLECT EDGE_REFLECT}</td><td>{@link #STBIR_EDGE_WRAP EDGE_WRAP}</td><td>{@link #STBIR_EDGE_ZERO EDGE_ZERO}</td></tr></table>
     * @param filter                 the scale filter. One of:<br><table><tr><td>{@link #STBIR_FILTER_DEFAULT FILTER_DEFAULT}</td><td>{@link #STBIR_FILTER_BOX FILTER_BOX}</td><td>{@link #STBIR_FILTER_TRIANGLE FILTER_TRIANGLE}</td><td>{@link #STBIR_FILTER_CUBICBSPLINE FILTER_CUBICBSPLINE}</td><td>{@link #STBIR_FILTER_CATMULLROM FILTER_CATMULLROM}</td></tr><tr><td>{@link #STBIR_FILTER_MITCHELL FILTER_MITCHELL}</td></tr></table>
     * @param space                  the image colorspace. One of:<br><table><tr><td>{@link #STBIR_COLORSPACE_LINEAR COLORSPACE_LINEAR}</td><td>{@link #STBIR_COLORSPACE_SRGB COLORSPACE_SRGB}</td></tr></table>
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbir_resize_float_generic(@NativeType("float const *") FloatBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("float *") FloatBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, @NativeType("stbir_edge") int edge_wrap_mode, @NativeType("stbir_filter") int filter, @NativeType("stbir_colorspace") int space) {
        if (CHECKS) {
            check(input_pixels, input_h * (input_stride_in_bytes == 0 ? input_w * num_channels : (input_stride_in_bytes >> 2)));
            check(output_pixels, output_h * (output_stride_in_bytes == 0 ? output_w * num_channels : (output_stride_in_bytes >> 2)));
        }
        return nstbir_resize_float_generic(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, edge_wrap_mode, filter, space, NULL) != 0;
    }

    // --- [ stbir_resize ] ---

    /** Unsafe version of: {@link #stbir_resize resize} */
    public static native int nstbir_resize(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int datatype, int num_channels, int alpha_channel, int flags, int edge_mode_horizontal, int edge_mode_vertical, int filter_horizontal, int filter_vertical, int space, long alloc_context);

    /**
     * Full-complexity version of {@link #stbir_resize_uint8_generic resize_uint8_generic}.
     *
     * @param input_pixels           the source image data
     * @param input_w                the source image width
     * @param input_h                the source image height
     * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param output_pixels          returns the scaled image data
     * @param output_w               the resized image width
     * @param output_h               the resized image height
     * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param datatype               the image data type. One of:<br><table><tr><td>{@link #STBIR_TYPE_UINT8 TYPE_UINT8}</td><td>{@link #STBIR_TYPE_UINT16 TYPE_UINT16}</td><td>{@link #STBIR_TYPE_UINT32 TYPE_UINT32}</td><td>{@link #STBIR_TYPE_FLOAT TYPE_FLOAT}</td></tr></table>
     * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
     * @param alpha_channel          the alpha channel index, or {@link #STBIR_ALPHA_CHANNEL_NONE ALPHA_CHANNEL_NONE} if there is no alpha channel
     * @param flags                  the alpha channel flags. 0 will propably do the right thing if you're not sure what the flags mean. One of:<br><table><tr><td>{@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}</td><td>{@link #STBIR_FLAG_ALPHA_USES_COLORSPACE FLAG_ALPHA_USES_COLORSPACE}</td></tr></table>
     * @param edge_mode_horizontal   the horizontal edge wrap mode
     * @param edge_mode_vertical     the vertical edge wrap mode
     * @param filter_horizontal      the horizontal scale filter
     * @param filter_vertical        the vertical scale filter
     * @param space                  the image colorspace. One of:<br><table><tr><td>{@link #STBIR_COLORSPACE_LINEAR COLORSPACE_LINEAR}</td><td>{@link #STBIR_COLORSPACE_SRGB COLORSPACE_SRGB}</td></tr></table>
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbir_resize(@NativeType("void const *") ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("void *") ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, @NativeType("stbir_datatype") int datatype, int num_channels, int alpha_channel, int flags, @NativeType("stbir_edge") int edge_mode_horizontal, @NativeType("stbir_edge") int edge_mode_vertical, @NativeType("stbir_filter") int filter_horizontal, @NativeType("stbir_filter") int filter_vertical, @NativeType("stbir_colorspace") int space) {
        if (CHECKS) {
            check(input_pixels, input_h * (input_stride_in_bytes == 0 ? (input_w * num_channels) << getTypeShift(datatype) : input_stride_in_bytes));
            check(output_pixels, output_h * (output_stride_in_bytes == 0 ? (output_w * num_channels) << getTypeShift(datatype) : output_stride_in_bytes));
        }
        return nstbir_resize(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, datatype, num_channels, alpha_channel, flags, edge_mode_horizontal, edge_mode_vertical, filter_horizontal, filter_vertical, space, NULL) != 0;
    }

    // --- [ stbir_resize_subpixel ] ---

    /** Unsafe version of: {@link #stbir_resize_subpixel resize_subpixel} */
    public static native int nstbir_resize_subpixel(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int datatype, int num_channels, int alpha_channel, int flags, int edge_mode_horizontal, int edge_mode_vertical, int filter_horizontal, int filter_vertical, int space, long alloc_context, float x_scale, float y_scale, float x_offset, float y_offset);

    /**
     * Subpixel version of {@link #stbir_resize resize}.
     *
     * @param input_pixels           the source image data
     * @param input_w                the source image width
     * @param input_h                the source image height
     * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param output_pixels          returns the scaled image data
     * @param output_w               the resized image width
     * @param output_h               the resized image height
     * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param datatype               the image data type. One of:<br><table><tr><td>{@link #STBIR_TYPE_UINT8 TYPE_UINT8}</td><td>{@link #STBIR_TYPE_UINT16 TYPE_UINT16}</td><td>{@link #STBIR_TYPE_UINT32 TYPE_UINT32}</td><td>{@link #STBIR_TYPE_FLOAT TYPE_FLOAT}</td></tr></table>
     * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
     * @param alpha_channel          the alpha channel index, or {@link #STBIR_ALPHA_CHANNEL_NONE ALPHA_CHANNEL_NONE} if there is no alpha channel
     * @param flags                  the alpha channel flags. 0 will propably do the right thing if you're not sure what the flags mean. One of:<br><table><tr><td>{@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}</td><td>{@link #STBIR_FLAG_ALPHA_USES_COLORSPACE FLAG_ALPHA_USES_COLORSPACE}</td></tr></table>
     * @param edge_mode_horizontal   the horizontal edge wrap mode
     * @param edge_mode_vertical     the vertical edge wrap mode
     * @param filter_horizontal      the horizontal scale filter
     * @param filter_vertical        the vertical scale filter
     * @param space                  the image colorspace. One of:<br><table><tr><td>{@link #STBIR_COLORSPACE_LINEAR COLORSPACE_LINEAR}</td><td>{@link #STBIR_COLORSPACE_SRGB COLORSPACE_SRGB}</td></tr></table>
     * @param x_scale                horizontal scale for subpixel correctness
     * @param y_scale                vertical scale for subpixel correctness
     * @param x_offset               horizontal offset for subpixel correctness
     * @param y_offset               vertical offset for subpixel correctness
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbir_resize_subpixel(@NativeType("void const *") ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("void *") ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, @NativeType("stbir_datatype") int datatype, int num_channels, int alpha_channel, int flags, @NativeType("stbir_edge") int edge_mode_horizontal, @NativeType("stbir_edge") int edge_mode_vertical, @NativeType("stbir_filter") int filter_horizontal, @NativeType("stbir_filter") int filter_vertical, @NativeType("stbir_colorspace") int space, float x_scale, float y_scale, float x_offset, float y_offset) {
        if (CHECKS) {
            check(input_pixels, input_h * (input_stride_in_bytes == 0 ? (input_w * num_channels) << getTypeShift(datatype) : input_stride_in_bytes));
            check(output_pixels, output_h * (output_stride_in_bytes == 0 ? (output_w * num_channels) << getTypeShift(datatype) : output_stride_in_bytes));
        }
        return nstbir_resize_subpixel(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, datatype, num_channels, alpha_channel, flags, edge_mode_horizontal, edge_mode_vertical, filter_horizontal, filter_vertical, space, NULL, x_scale, y_scale, x_offset, y_offset) != 0;
    }

    // --- [ stbir_resize_region ] ---

    /** Unsafe version of: {@link #stbir_resize_region resize_region} */
    public static native int nstbir_resize_region(long input_pixels, int input_w, int input_h, int input_stride_in_bytes, long output_pixels, int output_w, int output_h, int output_stride_in_bytes, int datatype, int num_channels, int alpha_channel, int flags, int edge_mode_horizontal, int edge_mode_vertical, int filter_horizontal, int filter_vertical, int space, long alloc_context, float s0, float t0, float s1, float t1);

    /**
     * Region version of {@link #stbir_resize resize}, using texture coordinates.
     *
     * @param input_pixels           the source image data
     * @param input_w                the source image width
     * @param input_h                the source image height
     * @param input_stride_in_bytes  the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param output_pixels          returns the scaled image data
     * @param output_w               the resized image width
     * @param output_h               the resized image height
     * @param output_stride_in_bytes the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory
     * @param datatype               the image data type. One of:<br><table><tr><td>{@link #STBIR_TYPE_UINT8 TYPE_UINT8}</td><td>{@link #STBIR_TYPE_UINT16 TYPE_UINT16}</td><td>{@link #STBIR_TYPE_UINT32 TYPE_UINT32}</td><td>{@link #STBIR_TYPE_FLOAT TYPE_FLOAT}</td></tr></table>
     * @param num_channels           the number of channels in the image (e.g. RGB=3, RGBA=4)
     * @param alpha_channel          the alpha channel index, or {@link #STBIR_ALPHA_CHANNEL_NONE ALPHA_CHANNEL_NONE} if there is no alpha channel
     * @param flags                  the alpha channel flags. 0 will propably do the right thing if you're not sure what the flags mean. One of:<br><table><tr><td>{@link #STBIR_FLAG_ALPHA_PREMULTIPLIED FLAG_ALPHA_PREMULTIPLIED}</td><td>{@link #STBIR_FLAG_ALPHA_USES_COLORSPACE FLAG_ALPHA_USES_COLORSPACE}</td></tr></table>
     * @param edge_mode_horizontal   the horizontal edge wrap mode
     * @param edge_mode_vertical     the vertical edge wrap mode
     * @param filter_horizontal      the horizontal scale filter
     * @param filter_vertical        the vertical scale filter
     * @param space                  the image colorspace. One of:<br><table><tr><td>{@link #STBIR_COLORSPACE_LINEAR COLORSPACE_LINEAR}</td><td>{@link #STBIR_COLORSPACE_SRGB COLORSPACE_SRGB}</td></tr></table>
     * @param s0                     the left texture coordinate of the region to scale
     * @param t0                     the top texture coordinate of the region to scale
     * @param s1                     the right texture coordinate of the region to scale
     * @param t1                     the bottom texture coordinate of the region to scale
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbir_resize_region(@NativeType("void const *") ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("void *") ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, @NativeType("stbir_datatype") int datatype, int num_channels, int alpha_channel, int flags, @NativeType("stbir_edge") int edge_mode_horizontal, @NativeType("stbir_edge") int edge_mode_vertical, @NativeType("stbir_filter") int filter_horizontal, @NativeType("stbir_filter") int filter_vertical, @NativeType("stbir_colorspace") int space, float s0, float t0, float s1, float t1) {
        if (CHECKS) {
            check(input_pixels, input_h * (input_stride_in_bytes == 0 ? (input_w * num_channels) << getTypeShift(datatype) : input_stride_in_bytes));
            check(output_pixels, output_h * (output_stride_in_bytes == 0 ? (output_w * num_channels) << getTypeShift(datatype) : output_stride_in_bytes));
        }
        return nstbir_resize_region(memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, memAddress(output_pixels), output_w, output_h, output_stride_in_bytes, datatype, num_channels, alpha_channel, flags, edge_mode_horizontal, edge_mode_vertical, filter_horizontal, filter_vertical, space, NULL, s0, t0, s1, t1) != 0;
    }

    /** Array version of: {@link #nstbir_resize_float} */
    public static native int nstbir_resize_float(float[] input_pixels, int input_w, int input_h, int input_stride_in_bytes, float[] output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels);

    /** Array version of: {@link #stbir_resize_float resize_float} */
    @NativeType("int")
    public static boolean stbir_resize_float(@NativeType("float const *") float[] input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("float *") float[] output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels) {
        if (CHECKS) {
            check(input_pixels, input_h * (input_stride_in_bytes == 0 ? input_w * num_channels : (input_stride_in_bytes >> 2)));
            check(output_pixels, output_h * (output_stride_in_bytes == 0 ? output_w * num_channels : (output_stride_in_bytes >> 2)));
        }
        return nstbir_resize_float(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, num_channels) != 0;
    }

    /** Array version of: {@link #nstbir_resize_uint16_generic} */
    public static native int nstbir_resize_uint16_generic(short[] input_pixels, int input_w, int input_h, int input_stride_in_bytes, short[] output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, int edge_wrap_mode, int filter, int space, long alloc_context);

    /** Array version of: {@link #stbir_resize_uint16_generic resize_uint16_generic} */
    @NativeType("int")
    public static boolean stbir_resize_uint16_generic(@NativeType("stbir_uint16 const *") short[] input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("stbir_uint16 *") short[] output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, @NativeType("stbir_edge") int edge_wrap_mode, @NativeType("stbir_filter") int filter, @NativeType("stbir_colorspace") int space) {
        if (CHECKS) {
            check(input_pixels, input_h * (input_stride_in_bytes == 0 ? input_w * num_channels : (input_stride_in_bytes >> 1)));
            check(output_pixels, output_h * (output_stride_in_bytes == 0 ? output_w * num_channels : (output_stride_in_bytes >> 1)));
        }
        return nstbir_resize_uint16_generic(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, edge_wrap_mode, filter, space, NULL) != 0;
    }

    /** Array version of: {@link #nstbir_resize_float_generic} */
    public static native int nstbir_resize_float_generic(float[] input_pixels, int input_w, int input_h, int input_stride_in_bytes, float[] output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, int edge_wrap_mode, int filter, int space, long alloc_context);

    /** Array version of: {@link #stbir_resize_float_generic resize_float_generic} */
    @NativeType("int")
    public static boolean stbir_resize_float_generic(@NativeType("float const *") float[] input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("float *") float[] output_pixels, int output_w, int output_h, int output_stride_in_bytes, int num_channels, int alpha_channel, int flags, @NativeType("stbir_edge") int edge_wrap_mode, @NativeType("stbir_filter") int filter, @NativeType("stbir_colorspace") int space) {
        if (CHECKS) {
            check(input_pixels, input_h * (input_stride_in_bytes == 0 ? input_w * num_channels : (input_stride_in_bytes >> 2)));
            check(output_pixels, output_h * (output_stride_in_bytes == 0 ? output_w * num_channels : (output_stride_in_bytes >> 2)));
        }
        return nstbir_resize_float_generic(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, edge_wrap_mode, filter, space, NULL) != 0;
    }

    private static int getTypeShift(int type) {
        switch (type) {
            case STBIR_TYPE_UINT8:
                return 0;
            case STBIR_TYPE_UINT16:
                return 1;
            default:
                return 2;
        }
    }

}