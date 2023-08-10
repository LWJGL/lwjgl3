/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to stb_image.h from the <a href="https://github.com/nothings/stb">stb library</a>.
 * 
 * <h3>Quick notes</h3>
 * 
 * <p>Primarily of interest to game developers and other people who can avoid problematic images and only need the trivial interface. Supported formats:</p>
 * 
 * <ul>
 * <li>JPEG baseline &amp; progressive (12 bpc/arithmetic not supported, same as stock IJG lib</li>
 * <li>PNG 1/2/4/8/16-bit-per-channel</li>
 * <li>TGA (not sure what subset, if a subset)</li>
 * <li>BMP non-1bpp, non-RLE</li>
 * <li>PSD (composited view only, no extra channels, 8/16 bit-per-channel)</li>
 * <li>GIF (*desired_channels always reports as 4-channel)</li>
 * <li>HDR (radiance rgbE format)</li>
 * <li>PIC (Softimage PIC)</li>
 * <li>PNM (PPM and PGM binary only)</li>
 * </ul>
 * 
 * <p>Animated GIF still needs a proper API, but <a href="https://gist.github.com/urraka/685d9a6340b26b830d49">here</a>'s one way to do it.</p>
 * 
 * <p>Features:</p>
 * 
 * <ul>
 * <li>decode from memory</li>
 * <li>decode from arbitrary I/O callbacks</li>
 * <li>SIMD acceleration on x86/x64 (SSE2) and ARM (NEON)</li>
 * </ul>
 * 
 * <p>Limitations:</p>
 * 
 * <ul>
 * <li>no 12-bit-per-channel JPEG</li>
 * <li>no JPEGs with arithmetic coding</li>
 * <li>GIF always returns *channels_in_file=4</li>
 * </ul>
 * 
 * <p>Basic usage (see HDR discussion below for HDR usage):</p>
 * 
 * <pre><code>
 * int x,y,n;
 * unsigned char *data = stbi_load(filename, &amp;x, &amp;y, &amp;n, 0);
 * // ... process data if not NULL ...
 * // ... x = width, y = height, n = # 8-bit components per pixel ...
 * // ... replace '0' with '1'..'4' to force that many components per pixel
 * // ... but 'n' will always be the number that it would have been if you said 0
 * stbi_image_free(data)</code></pre>
 * 
 * <h3>HDR image support</h3>
 * 
 * <p>stb_image supports loading HDR images in general, and currently the Radiance .HDR file format specifically. You can still load any file through the
 * existing interface; if you attempt to load an HDR file, it will be automatically remapped to LDR, assuming gamma 2.2 and an arbitrary scale factor
 * defaulting to 1; both of these constants can be reconfigured through this interface:</p>
 * 
 * <pre><code>
 * stbi_hdr_to_ldr_gamma(2.2f);
 * stbi_hdr_to_ldr_scale(1.0f);</code></pre>
 * 
 * <p>(note, do not use <em>inverse</em> constants; stbi_image will invert them appropriately).</p>
 * 
 * <p>Additionally, there is a new, parallel interface for loading files as (linear) floats to preserve the full dynamic range:</p>
 * 
 * <pre><code>
 * float *data = stbi_loadf(filename, &amp;x, &amp;y, &amp;n, 0);</code></pre>
 * 
 * <p>If you load LDR images through this interface, those images will be promoted to floating point values, run through the inverse of constants
 * corresponding to the above:</p>
 * 
 * <pre><code>
 * stbi_ldr_to_hdr_scale(1.0f);
 * stbi_ldr_to_hdr_gamma(2.2f);</code></pre>
 * 
 * <p>Finally, given a filename (or an open file or memory block) containing image data, you can query for the "most appropriate" interface to use (that is,
 * whether the image is HDR or not), using:</p>
 * 
 * <pre><code>
 * stbi_is_hdr(char *filename);</code></pre>
 * 
 * <h3>iPhone PNG support</h3>
 * 
 * <p>We optionally support converting iPhone-formatted PNGs (which store premultiplied BGRA) back to RGB, even though they're internally encoded
 * differently. To enable this conversion, call {@link #stbi_convert_iphone_png_to_rgb convert_iphone_png_to_rgb}(1).</p>
 * 
 * <p>Call {@link #stbi_set_unpremultiply_on_load set_unpremultiply_on_load}(1) as well to force a divide per pixel to remove any premultiplied alpha *only* if the image file explicitly says
 * there's premultiplied data (currently only happens in iPhone images, and only if iPhone convert-to-rgb processing is on).</p>
 */
public class STBImage {

    static { LibSTB.initialize(); }

    /**
     * Component count.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STBI_default default} - Default component count, used as an argument to {@code desired_channels}.</li>
     * <li>{@link #STBI_grey grey}</li>
     * <li>{@link #STBI_grey_alpha grey_alpha}</li>
     * <li>{@link #STBI_rgb rgb}</li>
     * <li>{@link #STBI_rgb_alpha rgb_alpha}</li>
     * </ul>
     */
    public static final int
        STBI_default    = 0,
        STBI_grey       = 1,
        STBI_grey_alpha = 2,
        STBI_rgb        = 3,
        STBI_rgb_alpha  = 4;

    protected STBImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ stbi_load ] ---

    /** Unsafe version of: {@link #stbi_load load} */
    public static native long nstbi_load(long filename, long x, long y, long channels_in_file, int desired_channels);

    /**
     * Loads an image from the specified file.
     * 
     * <p>The return value from an image loader is an {@code 'unsigned char *'} which points to the pixel data, or {@code NULL} on an allocation failure or if the image
     * is corrupt or invalid. The pixel data consists of {@code *y} scanlines of {@code *x} pixels, with each pixel consisting of N interleaved 8-bit
     * components; the first pixel pointed to is top-left-most in the image. There is no padding between image scanlines or between pixels, regardless of
     * format. The number of components N is {@code 'desired_channels'} if {@code desired_channels} is non-zero, or {@code *channels_in_file} otherwise. If
     * {@code desired_channels} is non-zero, {@code *channels_in_file} has the number of components that <i>would</i> have been output otherwise. E.g. if you
     * set {@code desired_channels} to 4, you will always get RGBA output, but you can check {@code *channels_in_file} to see if it's trivially opaque because
     * e.g. there were only 3 channels in the source image.</p>
     * 
     * <p>An output image with N components has the following components interleaved in this order in each pixel:</p>
     * 
     * <pre><code>
     * N=#channels_in_file     components
     *   1                     grey
     *   2                     grey, alpha
     *   3                     red, green, blue
     *   4                     red, green, blue, alpha</code></pre>
     * 
     * <p>If image loading fails for any reason, the return value will be {@code NULL}, and {@code *x}, {@code *y}, {@code *channels_in_file} will be unchanged. The
     * function {@link #stbi_failure_reason failure_reason} can be queried for an extremely brief, end-user unfriendly explanation of why the load failed.</p>
     * 
     * <p>Paletted PNG, BMP, GIF, and PIC images are automatically depalettized.</p>
     * 
     * <p>To query the width, height and component count of an image without having to decode the full file, you can use the {@code stbi_info} family of
     * functions:</p>
     * 
     * <pre><code>
     * int x,y,n,ok;
     * ok = stbi_info(filename, &amp;x, &amp;y, &amp;n);
     * // returns ok=1 and sets x, y, n if image is a supported format,
     * // 0 otherwise.</code></pre>
     * 
     * <p>Note that stb_image pervasively uses {@code ints} in its public API for sizes, including sizes of memory buffers. This is now part of the API and thus
     * hard to change without causing breakage. As a result, the various image loaders all have certain limits on image size; these differ somewhat by format
     * but generally boil down to either just under 2GB or just under 1GB. When the decoded image would be larger than this, stb_image decoding will fail.</p>
     * 
     * <p>Additionally, stb_image will reject image files that have any of their dimensions set to a larger value than the configurable
     * {@code STBI_MAX_DIMENSIONS}, which defaults to {@code 2**24 = 16777216} pixels. Due to the above memory limit, the only way to have an image with such
     * dimensions load correctly is for it to have a rather extreme aspect ratio. Either way, the assumption here is that such larger images are likely to be
     * malformed or malicious. If you do need to load an image with individual dimensions larger than that, and it still fits in the overall size limit, you
     * can {@code #define STBI_MAX_DIMENSIONS} on your own to be something larger.</p>
     *
     * @param filename         the file name
     * @param x                outputs the image width in pixels
     * @param y                outputs the image height in pixels
     * @param channels_in_file outputs number of components in image
     * @param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
     */
    @Nullable
    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            checkNT1(filename);
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load(memAddress(filename), memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
        return memByteBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    /**
     * Loads an image from the specified file.
     * 
     * <p>The return value from an image loader is an {@code 'unsigned char *'} which points to the pixel data, or {@code NULL} on an allocation failure or if the image
     * is corrupt or invalid. The pixel data consists of {@code *y} scanlines of {@code *x} pixels, with each pixel consisting of N interleaved 8-bit
     * components; the first pixel pointed to is top-left-most in the image. There is no padding between image scanlines or between pixels, regardless of
     * format. The number of components N is {@code 'desired_channels'} if {@code desired_channels} is non-zero, or {@code *channels_in_file} otherwise. If
     * {@code desired_channels} is non-zero, {@code *channels_in_file} has the number of components that <i>would</i> have been output otherwise. E.g. if you
     * set {@code desired_channels} to 4, you will always get RGBA output, but you can check {@code *channels_in_file} to see if it's trivially opaque because
     * e.g. there were only 3 channels in the source image.</p>
     * 
     * <p>An output image with N components has the following components interleaved in this order in each pixel:</p>
     * 
     * <pre><code>
     * N=#channels_in_file     components
     *   1                     grey
     *   2                     grey, alpha
     *   3                     red, green, blue
     *   4                     red, green, blue, alpha</code></pre>
     * 
     * <p>If image loading fails for any reason, the return value will be {@code NULL}, and {@code *x}, {@code *y}, {@code *channels_in_file} will be unchanged. The
     * function {@link #stbi_failure_reason failure_reason} can be queried for an extremely brief, end-user unfriendly explanation of why the load failed.</p>
     * 
     * <p>Paletted PNG, BMP, GIF, and PIC images are automatically depalettized.</p>
     * 
     * <p>To query the width, height and component count of an image without having to decode the full file, you can use the {@code stbi_info} family of
     * functions:</p>
     * 
     * <pre><code>
     * int x,y,n,ok;
     * ok = stbi_info(filename, &amp;x, &amp;y, &amp;n);
     * // returns ok=1 and sets x, y, n if image is a supported format,
     * // 0 otherwise.</code></pre>
     * 
     * <p>Note that stb_image pervasively uses {@code ints} in its public API for sizes, including sizes of memory buffers. This is now part of the API and thus
     * hard to change without causing breakage. As a result, the various image loaders all have certain limits on image size; these differ somewhat by format
     * but generally boil down to either just under 2GB or just under 1GB. When the decoded image would be larger than this, stb_image decoding will fail.</p>
     * 
     * <p>Additionally, stb_image will reject image files that have any of their dimensions set to a larger value than the configurable
     * {@code STBI_MAX_DIMENSIONS}, which defaults to {@code 2**24 = 16777216} pixels. Due to the above memory limit, the only way to have an image with such
     * dimensions load correctly is for it to have a rather extreme aspect ratio. Either way, the assumption here is that such larger images are likely to be
     * malformed or malicious. If you do need to load an image with individual dimensions larger than that, and it still fits in the overall size limit, you
     * can {@code #define STBI_MAX_DIMENSIONS} on your own to be something larger.</p>
     *
     * @param filename         the file name
     * @param x                outputs the image width in pixels
     * @param y                outputs the image height in pixels
     * @param channels_in_file outputs number of components in image
     * @param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
     */
    @Nullable
    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = nstbi_load(filenameEncoded, memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
            return memByteBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_load_from_memory ] ---

    /**
     * Unsafe version of: {@link #stbi_load_from_memory load_from_memory}
     *
     * @param len the buffer length, in bytes
     */
    public static native long nstbi_load_from_memory(long buffer, int len, long x, long y, long channels_in_file, int desired_channels);

    /**
     * In-memory version of {@link #stbi_load load}.
     *
     * @param buffer           the buffer from which to load the image data
     * @param x                outputs the image width in pixels
     * @param y                outputs the image height in pixels
     * @param channels_in_file outputs number of components in image
     * @param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
     */
    @Nullable
    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load_from_memory(memAddress(buffer), buffer.remaining(), memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
        return memByteBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    // --- [ stbi_load_from_callbacks ] ---

    /** Unsafe version of: {@link #stbi_load_from_callbacks load_from_callbacks} */
    public static native long nstbi_load_from_callbacks(long clbk, long user, long x, long y, long channels_in_file, int desired_channels);

    /**
     * Callback version of {@link #stbi_load load}.
     * 
     * <p>I/O callbacks allow you to read from arbitrary sources, like packaged files or some other source. Data read from callbacks are processed through a
     * small internal buffer (currently 128 bytes) to try to reduce overhead.</p>
     * 
     * <p>The three functions you must define are "read" (reads some bytes of data), "skip" (skips some bytes of data), "eof" (reports if the stream is at the
     * end).</p>
     *
     * @param clbk             an {@link STBIIOCallbacks} struct
     * @param user             a pointer to user data
     * @param x                outputs the image width in pixels
     * @param y                outputs the image height in pixels
     * @param channels_in_file outputs number of components in image
     * @param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
     */
    @Nullable
    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        long __result = nstbi_load_from_callbacks(clbk.address(), user, memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
        return memByteBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    // --- [ stbi_load_gif_from_memory ] ---

    /**
     * Unsafe version of: {@link #stbi_load_gif_from_memory load_gif_from_memory}
     *
     * @param len the buffer length, in bytes
     */
    public static native long nstbi_load_gif_from_memory(long buffer, int len, long delays, long x, long y, long z, long channels_in_file, int desired_channels);

    /**
     * gif version of {@link #stbi_load_from_memory load_from_memory}.
     *
     * @param buffer           the buffer from which to load the image data
     * @param delays           output the delays of each layer in the image
     * @param x                outputs the image width in pixels
     * @param y                outputs the image height in pixels
     * @param z                outputs the number of layers in the image
     * @param channels_in_file outputs number of components in image
     * @param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
     */
    @Nullable
    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load_gif_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int **") PointerBuffer delays, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer z, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(delays, 1);
            check(x, 1);
            check(y, 1);
            check(z, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load_gif_from_memory(memAddress(buffer), buffer.remaining(), memAddress(delays), memAddress(x), memAddress(y), memAddress(z), memAddress(channels_in_file), desired_channels);
        return memByteBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * z.get(z.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    // --- [ stbi_load_16 ] ---

    /** Unsafe version of: {@link #stbi_load_16 load_16} */
    public static native long nstbi_load_16(long filename, long x, long y, long channels_in_file, int desired_channels);

    /**
     * 16-bits-per-channel version of {@link #stbi_load load}.
     *
     * @param filename         the file name
     * @param x                outputs the image width in pixels
     * @param y                outputs the image height in pixels
     * @param channels_in_file outputs number of components in image
     * @param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
     */
    @Nullable
    @NativeType("stbi_us *")
    public static ShortBuffer stbi_load_16(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            checkNT1(filename);
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load_16(memAddress(filename), memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
        return memShortBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    /**
     * 16-bits-per-channel version of {@link #stbi_load load}.
     *
     * @param filename         the file name
     * @param x                outputs the image width in pixels
     * @param y                outputs the image height in pixels
     * @param channels_in_file outputs number of components in image
     * @param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
     */
    @Nullable
    @NativeType("stbi_us *")
    public static ShortBuffer stbi_load_16(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = nstbi_load_16(filenameEncoded, memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
            return memShortBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_load_16_from_memory ] ---

    /**
     * Unsafe version of: {@link #stbi_load_16_from_memory load_16_from_memory}
     *
     * @param len the buffer length, in bytes
     */
    public static native long nstbi_load_16_from_memory(long buffer, int len, long x, long y, long channels_in_file, int desired_channels);

    /**
     * In-memory version of {@link #stbi_load_16 load_16}.
     *
     * @param buffer           the buffer from which to load the image data
     * @param x                outputs the image width in pixels
     * @param y                outputs the image height in pixels
     * @param channels_in_file outputs number of components in image
     * @param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
     */
    @Nullable
    @NativeType("stbi_us *")
    public static ShortBuffer stbi_load_16_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load_16_from_memory(memAddress(buffer), buffer.remaining(), memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
        return memShortBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    // --- [ stbi_load_16_from_callbacks ] ---

    /** Unsafe version of: {@link #stbi_load_16_from_callbacks load_16_from_callbacks} */
    public static native long nstbi_load_16_from_callbacks(long clbk, long user, long x, long y, long channels_in_file, int desired_channels);

    /**
     * Callback version of {@link #stbi_load_16 load_16}.
     *
     * @param clbk             an {@link STBIIOCallbacks} struct
     * @param user             a pointer to user data
     * @param x                outputs the image width in pixels
     * @param y                outputs the image height in pixels
     * @param channels_in_file outputs number of components in image
     * @param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
     */
    @Nullable
    @NativeType("stbi_us *")
    public static ShortBuffer stbi_load_16_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        long __result = nstbi_load_16_from_callbacks(clbk.address(), user, memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
        return memShortBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    // --- [ stbi_loadf ] ---

    /** Unsafe version of: {@link #stbi_loadf loadf} */
    public static native long nstbi_loadf(long filename, long x, long y, long channels_in_file, int desired_channels);

    /**
     * Floating-point version of {@link #stbi_load load}.
     *
     * @param filename         the file name
     * @param x                outputs the image width in pixels
     * @param y                outputs the image height in pixels
     * @param channels_in_file outputs number of components in image
     * @param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
     */
    @Nullable
    @NativeType("float *")
    public static FloatBuffer stbi_loadf(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            checkNT1(filename);
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_loadf(memAddress(filename), memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
        return memFloatBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    /**
     * Floating-point version of {@link #stbi_load load}.
     *
     * @param filename         the file name
     * @param x                outputs the image width in pixels
     * @param y                outputs the image height in pixels
     * @param channels_in_file outputs number of components in image
     * @param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
     */
    @Nullable
    @NativeType("float *")
    public static FloatBuffer stbi_loadf(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = nstbi_loadf(filenameEncoded, memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
            return memFloatBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_loadf_from_memory ] ---

    /**
     * Unsafe version of: {@link #stbi_loadf_from_memory loadf_from_memory}
     *
     * @param len the buffer length, in bytes
     */
    public static native long nstbi_loadf_from_memory(long buffer, int len, long x, long y, long channels_in_file, int desired_channels);

    /**
     * Floating-point version of {@link #stbi_load_from_memory load_from_memory}.
     *
     * @param buffer           the buffer from which to load the image data
     * @param x                outputs the image width in pixels
     * @param y                outputs the image height in pixels
     * @param channels_in_file outputs number of components in image
     * @param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
     */
    @Nullable
    @NativeType("float *")
    public static FloatBuffer stbi_loadf_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_loadf_from_memory(memAddress(buffer), buffer.remaining(), memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
        return memFloatBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    // --- [ stbi_loadf_from_callbacks ] ---

    /** Unsafe version of: {@link #stbi_loadf_from_callbacks loadf_from_callbacks} */
    public static native long nstbi_loadf_from_callbacks(long clbk, long user, long x, long y, long channels_in_file, int desired_channels);

    /**
     * Floating-point version of {@link #stbi_load_from_callbacks load_from_callbacks}.
     *
     * @param clbk             an {@link STBIIOCallbacks} struct
     * @param user             a pointer to user data
     * @param x                outputs the image width in pixels
     * @param y                outputs the image height in pixels
     * @param channels_in_file outputs number of components in image
     * @param desired_channels 0 or 1..4 to force that many components per pixel. One of:<br><table><tr><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
     */
    @Nullable
    @NativeType("float *")
    public static FloatBuffer stbi_loadf_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        long __result = nstbi_loadf_from_callbacks(clbk.address(), user, memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
        return memFloatBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    // --- [ stbi_hdr_to_ldr_gamma ] ---

    /**
     * Changes the gamma value used when converting HDR images to LDR. The default value is 2.2f
     *
     * @param gamma the gamma value
     */
    public static native void stbi_hdr_to_ldr_gamma(float gamma);

    // --- [ stbi_hdr_to_ldr_scale ] ---

    /**
     * Changes the scale factor used when converting HDR images to LDR. The default value is 1.0f
     *
     * @param scale the scale factor
     */
    public static native void stbi_hdr_to_ldr_scale(float scale);

    // --- [ stbi_ldr_to_hdr_gamma ] ---

    /**
     * Changes the gamma value used when converting LDR images to HDR. The default value is 2.2f
     *
     * @param gamma the gamma value
     */
    public static native void stbi_ldr_to_hdr_gamma(float gamma);

    // --- [ stbi_ldr_to_hdr_scale ] ---

    /**
     * Changes the scale value used when converting LDR images to HDR. The default value is 1.0f
     *
     * @param scale the scale factor
     */
    public static native void stbi_ldr_to_hdr_scale(float scale);

    // --- [ stbi_is_hdr ] ---

    /** Unsafe version of: {@link #stbi_is_hdr is_hdr} */
    public static native int nstbi_is_hdr(long filename);

    /**
     * Checks if the specified file contains an HDR image.
     *
     * @param filename the file name
     *
     * @return 1 if the image is HDR, 0 otherwise
     */
    @NativeType("int")
    public static boolean stbi_is_hdr(@NativeType("char const *") ByteBuffer filename) {
        if (CHECKS) {
            checkNT1(filename);
        }
        return nstbi_is_hdr(memAddress(filename)) != 0;
    }

    /**
     * Checks if the specified file contains an HDR image.
     *
     * @param filename the file name
     *
     * @return 1 if the image is HDR, 0 otherwise
     */
    @NativeType("int")
    public static boolean stbi_is_hdr(@NativeType("char const *") CharSequence filename) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_is_hdr(filenameEncoded) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_is_hdr_from_memory ] ---

    /**
     * Unsafe version of: {@link #stbi_is_hdr_from_memory is_hdr_from_memory}
     *
     * @param len the buffer length, in bytes
     */
    public static native int nstbi_is_hdr_from_memory(long buffer, int len);

    /**
     * In-memory version of {@link #stbi_is_hdr is_hdr}.
     *
     * @param buffer the buffer from which to load the image data
     */
    @NativeType("int")
    public static boolean stbi_is_hdr_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer) {
        return nstbi_is_hdr_from_memory(memAddress(buffer), buffer.remaining()) != 0;
    }

    // --- [ stbi_is_hdr_from_callbacks ] ---

    /** Unsafe version of: {@link #stbi_is_hdr_from_callbacks is_hdr_from_callbacks} */
    public static native int nstbi_is_hdr_from_callbacks(long clbk, long user);

    /**
     * Callback version of {@link #stbi_is_hdr is_hdr}.
     *
     * @param clbk an {@link STBIIOCallbacks} struct
     * @param user a pointer to user data
     */
    @NativeType("int")
    public static boolean stbi_is_hdr_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user) {
        if (CHECKS) {
            STBIIOCallbacks.validate(clbk.address());
        }
        return nstbi_is_hdr_from_callbacks(clbk.address(), user) != 0;
    }

    // --- [ stbi_failure_reason ] ---

    /** Unsafe version of: {@link #stbi_failure_reason failure_reason} */
    public static native long nstbi_failure_reason();

    /** Returns a brief reason for failure. */
    @Nullable
    @NativeType("char const *")
    public static String stbi_failure_reason() {
        long __result = nstbi_failure_reason();
        return memASCIISafe(__result);
    }

    // --- [ stbi_image_free ] ---

    /** Unsafe version of: {@link #stbi_image_free image_free} */
    public static native void nstbi_image_free(long retval_from_stbi_load);

    /**
     * Frees a loaded image
     *
     * @param retval_from_stbi_load an stb image
     */
    public static void stbi_image_free(@NativeType("void *") ByteBuffer retval_from_stbi_load) {
        nstbi_image_free(memAddress(retval_from_stbi_load));
    }

    /**
     * Frees a loaded image
     *
     * @param retval_from_stbi_load an stb image
     */
    public static void stbi_image_free(@NativeType("void *") ShortBuffer retval_from_stbi_load) {
        nstbi_image_free(memAddress(retval_from_stbi_load));
    }

    /**
     * Frees a loaded image
     *
     * @param retval_from_stbi_load an stb image
     */
    public static void stbi_image_free(@NativeType("void *") FloatBuffer retval_from_stbi_load) {
        nstbi_image_free(memAddress(retval_from_stbi_load));
    }

    // --- [ stbi_info ] ---

    /** Unsafe version of: {@link #stbi_info info} */
    public static native int nstbi_info(long filename, long x, long y, long comp);

    /**
     * Returns image dimensions &amp; components without fully decoding the image.
     *
     * @param filename the file name
     * @param x        outputs the image width in pixels
     * @param y        outputs the image height in pixels
     * @param comp     outputs number of components in image
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbi_info(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer comp) {
        if (CHECKS) {
            checkNT1(filename);
            check(x, 1);
            check(y, 1);
            check(comp, 1);
        }
        return nstbi_info(memAddress(filename), memAddress(x), memAddress(y), memAddress(comp)) != 0;
    }

    /**
     * Returns image dimensions &amp; components without fully decoding the image.
     *
     * @param filename the file name
     * @param x        outputs the image width in pixels
     * @param y        outputs the image height in pixels
     * @param comp     outputs number of components in image
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbi_info(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer comp) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(comp, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_info(filenameEncoded, memAddress(x), memAddress(y), memAddress(comp)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_info_from_memory ] ---

    /**
     * Unsafe version of: {@link #stbi_info_from_memory info_from_memory}
     *
     * @param len the buffer length, in bytes
     */
    public static native int nstbi_info_from_memory(long buffer, int len, long x, long y, long comp);

    /**
     * In-memory version of {@link #stbi_info info}.
     *
     * @param buffer the buffer from which to load the image data
     * @param x      outputs the image width in pixels
     * @param y      outputs the image height in pixels
     * @param comp   outputs number of components in image
     */
    @NativeType("int")
    public static boolean stbi_info_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer comp) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(comp, 1);
        }
        return nstbi_info_from_memory(memAddress(buffer), buffer.remaining(), memAddress(x), memAddress(y), memAddress(comp)) != 0;
    }

    // --- [ stbi_info_from_callbacks ] ---

    /** Unsafe version of: {@link #stbi_info_from_callbacks info_from_callbacks} */
    public static native int nstbi_info_from_callbacks(long clbk, long user, long x, long y, long comp);

    /**
     * Callback version of {@link #stbi_info info}.
     *
     * @param clbk an {@link STBIIOCallbacks} struct
     * @param user a pointer to user data
     * @param x    outputs the image width in pixels
     * @param y    outputs the image height in pixels
     * @param comp outputs number of components in image
     */
    @NativeType("int")
    public static boolean stbi_info_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer comp) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(comp, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        return nstbi_info_from_callbacks(clbk.address(), user, memAddress(x), memAddress(y), memAddress(comp)) != 0;
    }

    // --- [ stbi_is_16_bit ] ---

    /** Unsafe version of: {@link #stbi_is_16_bit is_16_bit} */
    public static native int nstbi_is_16_bit(long filename);

    /**
     * Returns {@code true} if the file contains a 16-bit image.
     *
     * @param filename the file name
     */
    @NativeType("int")
    public static boolean stbi_is_16_bit(@NativeType("char const *") ByteBuffer filename) {
        if (CHECKS) {
            checkNT1(filename);
        }
        return nstbi_is_16_bit(memAddress(filename)) != 0;
    }

    /**
     * Returns {@code true} if the file contains a 16-bit image.
     *
     * @param filename the file name
     */
    @NativeType("int")
    public static boolean stbi_is_16_bit(@NativeType("char const *") CharSequence filename) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_is_16_bit(filenameEncoded) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_is_16_bit_from_memory ] ---

    /**
     * Unsafe version of: {@link #stbi_is_16_bit_from_memory is_16_bit_from_memory}
     *
     * @param len the buffer length, in bytes
     */
    public static native int nstbi_is_16_bit_from_memory(long buffer, int len);

    /**
     * In-memory version of {@link #stbi_is_16_bit is_16_bit}.
     *
     * @param buffer the buffer from which to load the image data
     */
    @NativeType("int")
    public static boolean stbi_is_16_bit_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer) {
        return nstbi_is_16_bit_from_memory(memAddress(buffer), buffer.remaining()) != 0;
    }

    // --- [ stbi_is_16_bit_from_callbacks ] ---

    /** Unsafe version of: {@link #stbi_is_16_bit_from_callbacks is_16_bit_from_callbacks} */
    public static native int nstbi_is_16_bit_from_callbacks(long clbk, long user);

    /**
     * Callback version of {@link #stbi_is_16_bit is_16_bit}.
     *
     * @param clbk an {@link STBIIOCallbacks} struct
     * @param user a pointer to user data
     */
    @NativeType("int")
    public static boolean stbi_is_16_bit_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user) {
        if (CHECKS) {
            STBIIOCallbacks.validate(clbk.address());
        }
        return nstbi_is_16_bit_from_callbacks(clbk.address(), user) != 0;
    }

    // --- [ stbi_set_unpremultiply_on_load ] ---

    /** Unsafe version of: {@link #stbi_set_unpremultiply_on_load set_unpremultiply_on_load} */
    public static native void nstbi_set_unpremultiply_on_load(int flag_true_if_should_unpremultiply);

    /**
     * For image formats that explicitly notate that they have premultiplied alpha, we just return the colors as stored in the file. Set this flag to force
     * unpremultiplication. Results are undefined if the unpremultiply overflows.
     *
     * @param flag_true_if_should_unpremultiply the unpremultiply flag
     */
    public static void stbi_set_unpremultiply_on_load(@NativeType("int") boolean flag_true_if_should_unpremultiply) {
        nstbi_set_unpremultiply_on_load(flag_true_if_should_unpremultiply ? 1 : 0);
    }

    // --- [ stbi_convert_iphone_png_to_rgb ] ---

    /** Unsafe version of: {@link #stbi_convert_iphone_png_to_rgb convert_iphone_png_to_rgb} */
    public static native void nstbi_convert_iphone_png_to_rgb(int flag_true_if_should_convert);

    /**
     * Indicate whether we should process iPhone images back to canonical format, or just pass them through "as-is".
     *
     * @param flag_true_if_should_convert the convert iPhone PNG to RGB flag
     */
    public static void stbi_convert_iphone_png_to_rgb(@NativeType("int") boolean flag_true_if_should_convert) {
        nstbi_convert_iphone_png_to_rgb(flag_true_if_should_convert ? 1 : 0);
    }

    // --- [ stbi_set_flip_vertically_on_load ] ---

    /** Unsafe version of: {@link #stbi_set_flip_vertically_on_load set_flip_vertically_on_load} */
    public static native void nstbi_set_flip_vertically_on_load(int flag_true_if_should_flip);

    /**
     * Flips the image vertically, so the first pixel in the output array is the bottom left.
     *
     * @param flag_true_if_should_flip the flip vertically on load flag
     */
    public static void stbi_set_flip_vertically_on_load(@NativeType("int") boolean flag_true_if_should_flip) {
        nstbi_set_flip_vertically_on_load(flag_true_if_should_flip ? 1 : 0);
    }

    // --- [ stbi_set_unpremultiply_on_load_thread ] ---

    /** Unsafe version of: {@link #stbi_set_unpremultiply_on_load_thread set_unpremultiply_on_load_thread} */
    public static native void nstbi_set_unpremultiply_on_load_thread(int flag_true_if_should_unpremultiply);

    /** As {@link #stbi_set_unpremultiply_on_load set_unpremultiply_on_load}, but only applies to images loaded on the thread that calls the function. */
    public static void stbi_set_unpremultiply_on_load_thread(@NativeType("int") boolean flag_true_if_should_unpremultiply) {
        nstbi_set_unpremultiply_on_load_thread(flag_true_if_should_unpremultiply ? 1 : 0);
    }

    // --- [ stbi_convert_iphone_png_to_rgb_thread ] ---

    /** Unsafe version of: {@link #stbi_convert_iphone_png_to_rgb_thread convert_iphone_png_to_rgb_thread} */
    public static native void nstbi_convert_iphone_png_to_rgb_thread(int flag_true_if_should_convert);

    /** As {@link #stbi_convert_iphone_png_to_rgb convert_iphone_png_to_rgb}, but only applies to images loaded on the thread that calls the function. */
    public static void stbi_convert_iphone_png_to_rgb_thread(@NativeType("int") boolean flag_true_if_should_convert) {
        nstbi_convert_iphone_png_to_rgb_thread(flag_true_if_should_convert ? 1 : 0);
    }

    // --- [ stbi_set_flip_vertically_on_load_thread ] ---

    /**
     * As {@link #stbi_set_flip_vertically_on_load set_flip_vertically_on_load}, but only applies to images loaded on the thread that calls the function.
     *
     * @param flag_true_if_should_flip the flip vertically on load flag
     */
    public static native void stbi_set_flip_vertically_on_load_thread(int flag_true_if_should_flip);

    // --- [ stbi_zlib_decode_malloc_guesssize ] ---

    /** Unsafe version of: {@link #stbi_zlib_decode_malloc_guesssize zlib_decode_malloc_guesssize} */
    public static native long nstbi_zlib_decode_malloc_guesssize(long buffer, int len, int initial_size, long outlen);

    /** ZLIB client - used by PNG, available for other purposes */
    @Nullable
    @NativeType("char *")
    public static ByteBuffer stbi_zlib_decode_malloc_guesssize(@NativeType("char const *") ByteBuffer buffer, int initial_size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer outlen = stack.callocInt(1);
            long __result = nstbi_zlib_decode_malloc_guesssize(memAddress(buffer), buffer.remaining(), initial_size, memAddress(outlen));
            return memByteBufferSafe(__result, outlen.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_zlib_decode_malloc_guesssize_headerflag ] ---

    /** Unsafe version of: {@link #stbi_zlib_decode_malloc_guesssize_headerflag zlib_decode_malloc_guesssize_headerflag} */
    public static native long nstbi_zlib_decode_malloc_guesssize_headerflag(long buffer, int len, int initial_size, long outlen, int parse_header);

    /** ZLIB client - used by PNG, available for other purposes */
    @Nullable
    @NativeType("char *")
    public static ByteBuffer stbi_zlib_decode_malloc_guesssize_headerflag(@NativeType("char const *") ByteBuffer buffer, int initial_size, @NativeType("int") boolean parse_header) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer outlen = stack.callocInt(1);
            long __result = nstbi_zlib_decode_malloc_guesssize_headerflag(memAddress(buffer), buffer.remaining(), initial_size, memAddress(outlen), parse_header ? 1 : 0);
            return memByteBufferSafe(__result, outlen.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_zlib_decode_malloc ] ---

    /** Unsafe version of: {@link #stbi_zlib_decode_malloc zlib_decode_malloc} */
    public static native long nstbi_zlib_decode_malloc(long buffer, int len, long outlen);

    /** ZLIB client - used by PNG, available for other purposes */
    @Nullable
    @NativeType("char *")
    public static ByteBuffer stbi_zlib_decode_malloc(@NativeType("char const *") ByteBuffer buffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer outlen = stack.callocInt(1);
            long __result = nstbi_zlib_decode_malloc(memAddress(buffer), buffer.remaining(), memAddress(outlen));
            return memByteBufferSafe(__result, outlen.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_zlib_decode_buffer ] ---

    /** Unsafe version of: {@link #stbi_zlib_decode_buffer zlib_decode_buffer} */
    public static native int nstbi_zlib_decode_buffer(long obuffer, int olen, long ibuffer, int ilen);

    /** ZLIB client - used by PNG, available for other purposes */
    public static int stbi_zlib_decode_buffer(@NativeType("char *") ByteBuffer obuffer, @NativeType("char const *") ByteBuffer ibuffer) {
        return nstbi_zlib_decode_buffer(memAddress(obuffer), obuffer.remaining(), memAddress(ibuffer), ibuffer.remaining());
    }

    // --- [ stbi_zlib_decode_noheader_malloc ] ---

    /** Unsafe version of: {@link #stbi_zlib_decode_noheader_malloc zlib_decode_noheader_malloc} */
    public static native long nstbi_zlib_decode_noheader_malloc(long buffer, int len, long outlen);

    /** ZLIB client - used by PNG, available for other purposes */
    @Nullable
    @NativeType("char *")
    public static ByteBuffer stbi_zlib_decode_noheader_malloc(@NativeType("char const *") ByteBuffer buffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer outlen = stack.callocInt(1);
            long __result = nstbi_zlib_decode_noheader_malloc(memAddress(buffer), buffer.remaining(), memAddress(outlen));
            return memByteBufferSafe(__result, outlen.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_zlib_decode_noheader_buffer ] ---

    /** Unsafe version of: {@link #stbi_zlib_decode_noheader_buffer zlib_decode_noheader_buffer} */
    public static native int nstbi_zlib_decode_noheader_buffer(long obuffer, int olen, long ibuffer, int ilen);

    /** ZLIB client - used by PNG, available for other purposes */
    public static int stbi_zlib_decode_noheader_buffer(@NativeType("char *") ByteBuffer obuffer, @NativeType("char const *") ByteBuffer ibuffer) {
        return nstbi_zlib_decode_noheader_buffer(memAddress(obuffer), obuffer.remaining(), memAddress(ibuffer), ibuffer.remaining());
    }

    /** Array version of: {@link #nstbi_load} */
    public static native long nstbi_load(long filename, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_load load} */
    @Nullable
    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            checkNT1(filename);
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load(memAddress(filename), x, y, channels_in_file, desired_channels);
        return memByteBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** Array version of: {@link #stbi_load load} */
    @Nullable
    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load(@NativeType("char const *") CharSequence filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = nstbi_load(filenameEncoded, x, y, channels_in_file, desired_channels);
            return memByteBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nstbi_load_from_memory} */
    public static native long nstbi_load_from_memory(long buffer, int len, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_load_from_memory load_from_memory} */
    @Nullable
    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load_from_memory(memAddress(buffer), buffer.remaining(), x, y, channels_in_file, desired_channels);
        return memByteBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** Array version of: {@link #nstbi_load_from_callbacks} */
    public static native long nstbi_load_from_callbacks(long clbk, long user, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_load_from_callbacks load_from_callbacks} */
    @Nullable
    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        long __result = nstbi_load_from_callbacks(clbk.address(), user, x, y, channels_in_file, desired_channels);
        return memByteBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** Array version of: {@link #nstbi_load_gif_from_memory} */
    public static native long nstbi_load_gif_from_memory(long buffer, int len, long delays, int[] x, int[] y, int[] z, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_load_gif_from_memory load_gif_from_memory} */
    @Nullable
    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load_gif_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int **") PointerBuffer delays, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] z, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(delays, 1);
            check(x, 1);
            check(y, 1);
            check(z, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load_gif_from_memory(memAddress(buffer), buffer.remaining(), memAddress(delays), x, y, z, channels_in_file, desired_channels);
        return memByteBufferSafe(__result, x[0] * y[0] * z[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** Array version of: {@link #nstbi_load_16} */
    public static native long nstbi_load_16(long filename, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_load_16 load_16} */
    @Nullable
    @NativeType("stbi_us *")
    public static ShortBuffer stbi_load_16(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            checkNT1(filename);
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load_16(memAddress(filename), x, y, channels_in_file, desired_channels);
        return memShortBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** Array version of: {@link #stbi_load_16 load_16} */
    @Nullable
    @NativeType("stbi_us *")
    public static ShortBuffer stbi_load_16(@NativeType("char const *") CharSequence filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = nstbi_load_16(filenameEncoded, x, y, channels_in_file, desired_channels);
            return memShortBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nstbi_load_16_from_memory} */
    public static native long nstbi_load_16_from_memory(long buffer, int len, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_load_16_from_memory load_16_from_memory} */
    @Nullable
    @NativeType("stbi_us *")
    public static ShortBuffer stbi_load_16_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load_16_from_memory(memAddress(buffer), buffer.remaining(), x, y, channels_in_file, desired_channels);
        return memShortBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** Array version of: {@link #nstbi_load_16_from_callbacks} */
    public static native long nstbi_load_16_from_callbacks(long clbk, long user, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_load_16_from_callbacks load_16_from_callbacks} */
    @Nullable
    @NativeType("stbi_us *")
    public static ShortBuffer stbi_load_16_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        long __result = nstbi_load_16_from_callbacks(clbk.address(), user, x, y, channels_in_file, desired_channels);
        return memShortBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** Array version of: {@link #nstbi_loadf} */
    public static native long nstbi_loadf(long filename, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_loadf loadf} */
    @Nullable
    @NativeType("float *")
    public static FloatBuffer stbi_loadf(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            checkNT1(filename);
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_loadf(memAddress(filename), x, y, channels_in_file, desired_channels);
        return memFloatBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** Array version of: {@link #stbi_loadf loadf} */
    @Nullable
    @NativeType("float *")
    public static FloatBuffer stbi_loadf(@NativeType("char const *") CharSequence filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = nstbi_loadf(filenameEncoded, x, y, channels_in_file, desired_channels);
            return memFloatBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nstbi_loadf_from_memory} */
    public static native long nstbi_loadf_from_memory(long buffer, int len, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_loadf_from_memory loadf_from_memory} */
    @Nullable
    @NativeType("float *")
    public static FloatBuffer stbi_loadf_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_loadf_from_memory(memAddress(buffer), buffer.remaining(), x, y, channels_in_file, desired_channels);
        return memFloatBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** Array version of: {@link #nstbi_loadf_from_callbacks} */
    public static native long nstbi_loadf_from_callbacks(long clbk, long user, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** Array version of: {@link #stbi_loadf_from_callbacks loadf_from_callbacks} */
    @Nullable
    @NativeType("float *")
    public static FloatBuffer stbi_loadf_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        long __result = nstbi_loadf_from_callbacks(clbk.address(), user, x, y, channels_in_file, desired_channels);
        return memFloatBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** Array version of: {@link #nstbi_info} */
    public static native int nstbi_info(long filename, int[] x, int[] y, int[] comp);

    /** Array version of: {@link #stbi_info info} */
    @NativeType("int")
    public static boolean stbi_info(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] comp) {
        if (CHECKS) {
            checkNT1(filename);
            check(x, 1);
            check(y, 1);
            check(comp, 1);
        }
        return nstbi_info(memAddress(filename), x, y, comp) != 0;
    }

    /** Array version of: {@link #stbi_info info} */
    @NativeType("int")
    public static boolean stbi_info(@NativeType("char const *") CharSequence filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] comp) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(comp, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_info(filenameEncoded, x, y, comp) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nstbi_info_from_memory} */
    public static native int nstbi_info_from_memory(long buffer, int len, int[] x, int[] y, int[] comp);

    /** Array version of: {@link #stbi_info_from_memory info_from_memory} */
    @NativeType("int")
    public static boolean stbi_info_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] comp) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(comp, 1);
        }
        return nstbi_info_from_memory(memAddress(buffer), buffer.remaining(), x, y, comp) != 0;
    }

    /** Array version of: {@link #nstbi_info_from_callbacks} */
    public static native int nstbi_info_from_callbacks(long clbk, long user, int[] x, int[] y, int[] comp);

    /** Array version of: {@link #stbi_info_from_callbacks info_from_callbacks} */
    @NativeType("int")
    public static boolean stbi_info_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] comp) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(comp, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        return nstbi_info_from_callbacks(clbk.address(), user, x, y, comp) != 0;
    }

}