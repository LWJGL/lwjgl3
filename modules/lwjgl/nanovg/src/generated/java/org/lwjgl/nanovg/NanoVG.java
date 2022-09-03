/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * NanoVG is a small antialiased vector graphics rendering library for OpenGL. It has lean API modeled after HTML5 canvas API. It is aimed to be a
 * practical and fun toolset for building scalable user interfaces and visualizations.
 * 
 * <h3>Color utils</h3>
 * 
 * <p>Colors in NanoVG are stored as unsigned ints in ABGR format.</p>
 * 
 * <h3>State Handling</h3>
 * 
 * <p>NanoVG contains state which represents how paths will be rendered. The state contains transform, fill and stroke styles, text and font styles, and
 * scissor clipping.</p>
 * 
 * <h3>Render styles</h3>
 * 
 * <p>Fill and stroke render style can be either a solid color or a paint which is a gradient or a pattern. Solid color is simply defined as a color value,
 * different kinds of paints can be created using {@link #nvgLinearGradient LinearGradient}, {@link #nvgBoxGradient BoxGradient}, {@link #nvgRadialGradient RadialGradient} and {@link #nvgImagePattern ImagePattern}.</p>
 * 
 * <p>Current render style can be saved and restored using {@link #nvgSave Save} and {@link #nvgRestore Restore}.</p>
 * 
 * <h3>Transforms</h3>
 * 
 * <p>The paths, gradients, patterns and scissor region are transformed by an transformation matrix at the time when they are passed to the API. The current
 * transformation matrix is a affine matrix:</p>
 * 
 * <pre><code>
 * [sx kx tx]
 * [ky sy ty]
 * [ 0  0  1]</code></pre>
 * 
 * <p>Where: {@code sx,sy} define scaling, {@code kx,ky} skewing, and {@code tx,ty} translation. The last row is assumed to be {@code 0,0,1} and is not
 * stored.</p>
 * 
 * <p>Apart from {@link #nvgResetTransform ResetTransform}, each transformation function first creates specific transformation matrix and pre-multiplies the current transformation
 * by it.</p>
 * 
 * <p>Current coordinate system (transformation) can be saved and restored using {@link #nvgSave Save} and {@link #nvgRestore Restore}.</p>
 * 
 * <h3>Images</h3>
 * 
 * <p>NanoVG allows you to load jpg, png, psd, tga, pic and gif files to be used for rendering. In addition you can upload your own image. The image loading
 * is provided by {@code stb_image}.</p>
 * 
 * <h3>Paints</h3>
 * 
 * <p>NanoVG supports four types of paints: linear gradient, box gradient, radial gradient and image pattern. These can be used as paints for strokes and
 * fills.</p>
 * 
 * <h3>Scissoring</h3>
 * 
 * <p>Scissoring allows you to clip the rendering into a rectangle. This is useful for various user interface cases like rendering a text edit or a timeline.</p>
 * 
 * <h3>Paths</h3>
 * 
 * <p>Drawing a new shape starts with {@link #nvgBeginPath BeginPath}, it clears all the currently defined paths. Then you define one or more paths and sub-paths which describe
 * the shape. The are functions to draw common shapes like rectangles and circles, and lower level step-by-step functions, which allow to define a path
 * curve by curve.</p>
 * 
 * <p>NanoVG uses even-odd fill rule to draw the shapes. Solid shapes should have counter clockwise winding and holes should have counter clockwise order. To
 * specify winding of a path you can call {@link #nvgPathWinding PathWinding}. This is useful especially for the common shapes, which are drawn {@link #NVG_CCW CCW}.</p>
 * 
 * <p>Finally you can fill the path using current fill style by calling {@link #nvgFill Fill}, and stroke it with current stroke style by calling {@link #nvgStroke Stroke}.</p>
 * 
 * <p>The curve segments and sub-paths are transformed by the current transform.</p>
 * 
 * <h3>Text</h3>
 * 
 * <p>NanoVG allows you to load .ttf files and use the font to render text.</p>
 * 
 * <p>The appearance of the text can be defined by setting the current text style and by specifying the fill color. Common text and font settings such as
 * font size, letter spacing and text align are supported. Font blur allows you to create simple text effects such as drop shadows.</p>
 * 
 * <p>At render time the font face can be set based on the font handles or name.</p>
 * 
 * <p>Font measure functions return values in local space, the calculations are carried in the same resolution as the final rendering. This is done because
 * the text glyph positions are snapped to the nearest pixels sharp rendering.</p>
 * 
 * <p>The local space means that values are not rotated or scale as per the current transformation. For example if you set font size to 12, which would mean
 * that line height is 16, then regardless of the current scaling and rotation, the returned line height is always 16. Some measures may vary because of
 * the scaling since aforementioned pixel snapping.</p>
 * 
 * <p>While this may sound a little odd, the setup allows you to always render the same way regardless of scaling. I.e. following works regardless of scaling:</p>
 * 
 * <pre><code>
 * const char* txt = "Text me up.";
 * nvgTextBounds(vg, x,y, txt, NULL, bounds);
 * nvgBeginPath(vg);
 * nvgRoundedRect(vg, bounds[0],bounds[1], bounds[2]-bounds[0], bounds[3]-bounds[1]);
 * nvgFill(vg);</code></pre>
 * 
 * <p>Note: currently only solid color fill is supported for text.</p>
 */
public class NanoVG {

    static { LibNanoVG.initialize(); }

    /** PI */
    public static final float NVG_PI = 3.1415927f;

    /**
     * Winding order.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NVG_CCW CCW} - Winding for solid shapes</li>
     * <li>{@link #NVG_CW CW} - Winding for holes</li>
     * </ul>
     */
    public static final int
        NVG_CCW = 0x1,
        NVG_CW  = 0x2;

    /**
     * Solidity.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NVG_SOLID SOLID} - CCW</li>
     * <li>{@link #NVG_HOLE HOLE} - CW</li>
     * </ul>
     */
    public static final int
        NVG_SOLID = 0x1,
        NVG_HOLE  = 0x2;

    /**
     * Line caps and joins.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NVG_BUTT BUTT}</li>
     * <li>{@link #NVG_ROUND ROUND}</li>
     * <li>{@link #NVG_SQUARE SQUARE}</li>
     * <li>{@link #NVG_BEVEL BEVEL}</li>
     * <li>{@link #NVG_MITER MITER}</li>
     * </ul>
     */
    public static final int
        NVG_BUTT   = 0,
        NVG_ROUND  = 1,
        NVG_SQUARE = 2,
        NVG_BEVEL  = 3,
        NVG_MITER  = 4;

    /**
     * Alignments.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NVG_ALIGN_LEFT ALIGN_LEFT} - Default, align text horizontally to left.</li>
     * <li>{@link #NVG_ALIGN_CENTER ALIGN_CENTER} - Align text horizontally to center.</li>
     * <li>{@link #NVG_ALIGN_RIGHT ALIGN_RIGHT} - Align text horizontally to right.</li>
     * <li>{@link #NVG_ALIGN_TOP ALIGN_TOP} - Align text vertically to top.</li>
     * <li>{@link #NVG_ALIGN_MIDDLE ALIGN_MIDDLE} - Align text vertically to middle.</li>
     * <li>{@link #NVG_ALIGN_BOTTOM ALIGN_BOTTOM} - Align text vertically to bottom.</li>
     * <li>{@link #NVG_ALIGN_BASELINE ALIGN_BASELINE} - Default, align text vertically to baseline.</li>
     * </ul>
     */
    public static final int
        NVG_ALIGN_LEFT     = 1<<0,
        NVG_ALIGN_CENTER   = 1<<1,
        NVG_ALIGN_RIGHT    = 1<<2,
        NVG_ALIGN_TOP      = 1<<3,
        NVG_ALIGN_MIDDLE   = 1<<4,
        NVG_ALIGN_BOTTOM   = 1<<5,
        NVG_ALIGN_BASELINE = 1<<6;

    /**
     * Blend factors.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NVG_ZERO ZERO}</li>
     * <li>{@link #NVG_ONE ONE}</li>
     * <li>{@link #NVG_SRC_COLOR SRC_COLOR}</li>
     * <li>{@link #NVG_ONE_MINUS_SRC_COLOR ONE_MINUS_SRC_COLOR}</li>
     * <li>{@link #NVG_DST_COLOR DST_COLOR}</li>
     * <li>{@link #NVG_ONE_MINUS_DST_COLOR ONE_MINUS_DST_COLOR}</li>
     * <li>{@link #NVG_SRC_ALPHA SRC_ALPHA}</li>
     * <li>{@link #NVG_ONE_MINUS_SRC_ALPHA ONE_MINUS_SRC_ALPHA}</li>
     * <li>{@link #NVG_DST_ALPHA DST_ALPHA}</li>
     * <li>{@link #NVG_ONE_MINUS_DST_ALPHA ONE_MINUS_DST_ALPHA}</li>
     * <li>{@link #NVG_SRC_ALPHA_SATURATE SRC_ALPHA_SATURATE}</li>
     * </ul>
     */
    public static final int
        NVG_ZERO                = 1<<0,
        NVG_ONE                 = 1<<1,
        NVG_SRC_COLOR           = 1<<2,
        NVG_ONE_MINUS_SRC_COLOR = 1<<3,
        NVG_DST_COLOR           = 1<<4,
        NVG_ONE_MINUS_DST_COLOR = 1<<5,
        NVG_SRC_ALPHA           = 1<<6,
        NVG_ONE_MINUS_SRC_ALPHA = 1<<7,
        NVG_DST_ALPHA           = 1<<8,
        NVG_ONE_MINUS_DST_ALPHA = 1<<9,
        NVG_SRC_ALPHA_SATURATE  = 1<<10;

    /**
     * Composite operations.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NVG_SOURCE_OVER SOURCE_OVER}</li>
     * <li>{@link #NVG_SOURCE_IN SOURCE_IN}</li>
     * <li>{@link #NVG_SOURCE_OUT SOURCE_OUT}</li>
     * <li>{@link #NVG_ATOP ATOP}</li>
     * <li>{@link #NVG_DESTINATION_OVER DESTINATION_OVER}</li>
     * <li>{@link #NVG_DESTINATION_IN DESTINATION_IN}</li>
     * <li>{@link #NVG_DESTINATION_OUT DESTINATION_OUT}</li>
     * <li>{@link #NVG_DESTINATION_ATOP DESTINATION_ATOP}</li>
     * <li>{@link #NVG_LIGHTER LIGHTER}</li>
     * <li>{@link #NVG_COPY COPY}</li>
     * <li>{@link #NVG_XOR XOR}</li>
     * </ul>
     */
    public static final int
        NVG_SOURCE_OVER      = 0,
        NVG_SOURCE_IN        = 1,
        NVG_SOURCE_OUT       = 2,
        NVG_ATOP             = 3,
        NVG_DESTINATION_OVER = 4,
        NVG_DESTINATION_IN   = 5,
        NVG_DESTINATION_OUT  = 6,
        NVG_DESTINATION_ATOP = 7,
        NVG_LIGHTER          = 8,
        NVG_COPY             = 9,
        NVG_XOR              = 10;

    /**
     * Image flags.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NVG_IMAGE_GENERATE_MIPMAPS IMAGE_GENERATE_MIPMAPS} - Generate mipmaps during creation of the image.</li>
     * <li>{@link #NVG_IMAGE_REPEATX IMAGE_REPEATX} - Repeat image in X direction.</li>
     * <li>{@link #NVG_IMAGE_REPEATY IMAGE_REPEATY} - Repeat image in Y direction.</li>
     * <li>{@link #NVG_IMAGE_FLIPY IMAGE_FLIPY} - Flips (inverses) image in Y direction when rendered.</li>
     * <li>{@link #NVG_IMAGE_PREMULTIPLIED IMAGE_PREMULTIPLIED} - Image data has premultiplied alpha.</li>
     * <li>{@link #NVG_IMAGE_NEAREST IMAGE_NEAREST} - Image interpolation is Nearest instead Linear.</li>
     * </ul>
     */
    public static final int
        NVG_IMAGE_GENERATE_MIPMAPS = 1<<0,
        NVG_IMAGE_REPEATX          = 1<<1,
        NVG_IMAGE_REPEATY          = 1<<2,
        NVG_IMAGE_FLIPY            = 1<<3,
        NVG_IMAGE_PREMULTIPLIED    = 1<<4,
        NVG_IMAGE_NEAREST          = 1<<5;

    protected NanoVG() {
        throw new UnsupportedOperationException();
    }

    // --- [ nvgBeginFrame ] ---

    /** Unsafe version of: {@link #nvgBeginFrame BeginFrame} */
    public static native void nnvgBeginFrame(long ctx, float windowWidth, float windowHeight, float devicePixelRatio);

    /**
     * Begins drawing a new frame.
     * 
     * <p>Calls to nanovg drawing API should be wrapped in {@link #nvgBeginFrame BeginFrame} &amp; {@link #nvgEndFrame EndFrame}. {@link #nvgBeginFrame BeginFrame} defines the size of the window to render to in relation
     * currently set viewport (i.e. {@code glViewport} on GL backends). Device pixel ration allows to control the rendering on Hi-DPI devices. For example,
     * GLFW returns two dimension for an opened window: window size and frame buffer size. In that case you would set {@code windowWidth/Height} to the window
     * size {@code devicePixelRatio} to: {@code frameBufferWidth / windowWidth}.</p>
     *
     * @param ctx              the NanoVG context
     * @param windowWidth      the window width
     * @param windowHeight     the window height
     * @param devicePixelRatio the device pixel ratio
     */
    public static void nvgBeginFrame(@NativeType("NVGcontext *") long ctx, float windowWidth, float windowHeight, float devicePixelRatio) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgBeginFrame(ctx, windowWidth, windowHeight, devicePixelRatio);
    }

    // --- [ nvgCancelFrame ] ---

    /** Unsafe version of: {@link #nvgCancelFrame CancelFrame} */
    public static native void nnvgCancelFrame(long ctx);

    /**
     * Cancels drawing the current frame.
     *
     * @param ctx the NanoVG context
     */
    public static void nvgCancelFrame(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgCancelFrame(ctx);
    }

    // --- [ nvgEndFrame ] ---

    /** Unsafe version of: {@link #nvgEndFrame EndFrame} */
    public static native void nnvgEndFrame(long ctx);

    /**
     * Ends drawing flushing remaining render state.
     *
     * @param ctx the NanoVG context
     */
    public static void nvgEndFrame(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgEndFrame(ctx);
    }

    // --- [ nvgGlobalCompositeOperation ] ---

    /** Unsafe version of: {@link #nvgGlobalCompositeOperation GlobalCompositeOperation} */
    public static native void nnvgGlobalCompositeOperation(long ctx, int op);

    /**
     * Sets the composite operation.
     *
     * @param ctx the NanoVG context
     * @param op  the composite operation. One of:<br><table><tr><td>{@link #NVG_SOURCE_OVER SOURCE_OVER}</td><td>{@link #NVG_SOURCE_IN SOURCE_IN}</td><td>{@link #NVG_SOURCE_OUT SOURCE_OUT}</td><td>{@link #NVG_ATOP ATOP}</td><td>{@link #NVG_DESTINATION_OVER DESTINATION_OVER}</td><td>{@link #NVG_DESTINATION_IN DESTINATION_IN}</td><td>{@link #NVG_DESTINATION_OUT DESTINATION_OUT}</td><td>{@link #NVG_DESTINATION_ATOP DESTINATION_ATOP}</td></tr><tr><td>{@link #NVG_LIGHTER LIGHTER}</td><td>{@link #NVG_COPY COPY}</td><td>{@link #NVG_XOR XOR}</td></tr></table>
     */
    public static void nvgGlobalCompositeOperation(@NativeType("NVGcontext *") long ctx, int op) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgGlobalCompositeOperation(ctx, op);
    }

    // --- [ nvgGlobalCompositeBlendFunc ] ---

    /** Unsafe version of: {@link #nvgGlobalCompositeBlendFunc GlobalCompositeBlendFunc} */
    public static native void nnvgGlobalCompositeBlendFunc(long ctx, int sfactor, int dfactor);

    /**
     * Sets the composite operation with custom pixel arithmetic.
     *
     * @param ctx     the NanoVG context
     * @param sfactor the source blend factor. One of:<br><table><tr><td>{@link #NVG_ZERO ZERO}</td><td>{@link #NVG_ONE ONE}</td><td>{@link #NVG_SRC_COLOR SRC_COLOR}</td><td>{@link #NVG_ONE_MINUS_SRC_COLOR ONE_MINUS_SRC_COLOR}</td><td>{@link #NVG_DST_COLOR DST_COLOR}</td><td>{@link #NVG_ONE_MINUS_DST_COLOR ONE_MINUS_DST_COLOR}</td></tr><tr><td>{@link #NVG_SRC_ALPHA SRC_ALPHA}</td><td>{@link #NVG_ONE_MINUS_SRC_ALPHA ONE_MINUS_SRC_ALPHA}</td><td>{@link #NVG_DST_ALPHA DST_ALPHA}</td><td>{@link #NVG_ONE_MINUS_DST_ALPHA ONE_MINUS_DST_ALPHA}</td><td>{@link #NVG_SRC_ALPHA_SATURATE SRC_ALPHA_SATURATE}</td></tr></table>
     * @param dfactor the destination blend factor. One of:<br><table><tr><td>{@link #NVG_ZERO ZERO}</td><td>{@link #NVG_ONE ONE}</td><td>{@link #NVG_SRC_COLOR SRC_COLOR}</td><td>{@link #NVG_ONE_MINUS_SRC_COLOR ONE_MINUS_SRC_COLOR}</td><td>{@link #NVG_DST_COLOR DST_COLOR}</td><td>{@link #NVG_ONE_MINUS_DST_COLOR ONE_MINUS_DST_COLOR}</td></tr><tr><td>{@link #NVG_SRC_ALPHA SRC_ALPHA}</td><td>{@link #NVG_ONE_MINUS_SRC_ALPHA ONE_MINUS_SRC_ALPHA}</td><td>{@link #NVG_DST_ALPHA DST_ALPHA}</td><td>{@link #NVG_ONE_MINUS_DST_ALPHA ONE_MINUS_DST_ALPHA}</td><td>{@link #NVG_SRC_ALPHA_SATURATE SRC_ALPHA_SATURATE}</td></tr></table>
     */
    public static void nvgGlobalCompositeBlendFunc(@NativeType("NVGcontext *") long ctx, int sfactor, int dfactor) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgGlobalCompositeBlendFunc(ctx, sfactor, dfactor);
    }

    // --- [ nvgGlobalCompositeBlendFuncSeparate ] ---

    /** Unsafe version of: {@link #nvgGlobalCompositeBlendFuncSeparate GlobalCompositeBlendFuncSeparate} */
    public static native void nnvgGlobalCompositeBlendFuncSeparate(long ctx, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);

    /**
     * Sets the composite operation with custom pixel arithmetic for RGB and alpha components separately.
     *
     * @param ctx      the NanoVG context
     * @param srcRGB   the source RGB blend factor. One of:<br><table><tr><td>{@link #NVG_ZERO ZERO}</td><td>{@link #NVG_ONE ONE}</td><td>{@link #NVG_SRC_COLOR SRC_COLOR}</td><td>{@link #NVG_ONE_MINUS_SRC_COLOR ONE_MINUS_SRC_COLOR}</td><td>{@link #NVG_DST_COLOR DST_COLOR}</td><td>{@link #NVG_ONE_MINUS_DST_COLOR ONE_MINUS_DST_COLOR}</td></tr><tr><td>{@link #NVG_SRC_ALPHA SRC_ALPHA}</td><td>{@link #NVG_ONE_MINUS_SRC_ALPHA ONE_MINUS_SRC_ALPHA}</td><td>{@link #NVG_DST_ALPHA DST_ALPHA}</td><td>{@link #NVG_ONE_MINUS_DST_ALPHA ONE_MINUS_DST_ALPHA}</td><td>{@link #NVG_SRC_ALPHA_SATURATE SRC_ALPHA_SATURATE}</td></tr></table>
     * @param dstRGB   the destination RGB blend factor. One of:<br><table><tr><td>{@link #NVG_ZERO ZERO}</td><td>{@link #NVG_ONE ONE}</td><td>{@link #NVG_SRC_COLOR SRC_COLOR}</td><td>{@link #NVG_ONE_MINUS_SRC_COLOR ONE_MINUS_SRC_COLOR}</td><td>{@link #NVG_DST_COLOR DST_COLOR}</td><td>{@link #NVG_ONE_MINUS_DST_COLOR ONE_MINUS_DST_COLOR}</td></tr><tr><td>{@link #NVG_SRC_ALPHA SRC_ALPHA}</td><td>{@link #NVG_ONE_MINUS_SRC_ALPHA ONE_MINUS_SRC_ALPHA}</td><td>{@link #NVG_DST_ALPHA DST_ALPHA}</td><td>{@link #NVG_ONE_MINUS_DST_ALPHA ONE_MINUS_DST_ALPHA}</td><td>{@link #NVG_SRC_ALPHA_SATURATE SRC_ALPHA_SATURATE}</td></tr></table>
     * @param srcAlpha the source alpha blend factor. One of:<br><table><tr><td>{@link #NVG_ZERO ZERO}</td><td>{@link #NVG_ONE ONE}</td><td>{@link #NVG_SRC_COLOR SRC_COLOR}</td><td>{@link #NVG_ONE_MINUS_SRC_COLOR ONE_MINUS_SRC_COLOR}</td><td>{@link #NVG_DST_COLOR DST_COLOR}</td><td>{@link #NVG_ONE_MINUS_DST_COLOR ONE_MINUS_DST_COLOR}</td></tr><tr><td>{@link #NVG_SRC_ALPHA SRC_ALPHA}</td><td>{@link #NVG_ONE_MINUS_SRC_ALPHA ONE_MINUS_SRC_ALPHA}</td><td>{@link #NVG_DST_ALPHA DST_ALPHA}</td><td>{@link #NVG_ONE_MINUS_DST_ALPHA ONE_MINUS_DST_ALPHA}</td><td>{@link #NVG_SRC_ALPHA_SATURATE SRC_ALPHA_SATURATE}</td></tr></table>
     * @param dstAlpha the destination alpha blend factor. One of:<br><table><tr><td>{@link #NVG_ZERO ZERO}</td><td>{@link #NVG_ONE ONE}</td><td>{@link #NVG_SRC_COLOR SRC_COLOR}</td><td>{@link #NVG_ONE_MINUS_SRC_COLOR ONE_MINUS_SRC_COLOR}</td><td>{@link #NVG_DST_COLOR DST_COLOR}</td><td>{@link #NVG_ONE_MINUS_DST_COLOR ONE_MINUS_DST_COLOR}</td></tr><tr><td>{@link #NVG_SRC_ALPHA SRC_ALPHA}</td><td>{@link #NVG_ONE_MINUS_SRC_ALPHA ONE_MINUS_SRC_ALPHA}</td><td>{@link #NVG_DST_ALPHA DST_ALPHA}</td><td>{@link #NVG_ONE_MINUS_DST_ALPHA ONE_MINUS_DST_ALPHA}</td><td>{@link #NVG_SRC_ALPHA_SATURATE SRC_ALPHA_SATURATE}</td></tr></table>
     */
    public static void nvgGlobalCompositeBlendFuncSeparate(@NativeType("NVGcontext *") long ctx, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgGlobalCompositeBlendFuncSeparate(ctx, srcRGB, dstRGB, srcAlpha, dstAlpha);
    }

    // --- [ nvgRGB ] ---

    /** Unsafe version of: {@link #nvgRGB RGB} */
    public static native void nnvgRGB(byte r, byte g, byte b, long __result);

    /**
     * Returns a color value from red, green, blue values. Alpha will be set to 255 (1.0f).
     *
     * @param r the red value
     * @param g the green value
     * @param b the blue value
     */
    @NativeType("NVGcolor")
    public static NVGColor nvgRGB(@NativeType("unsigned char") byte r, @NativeType("unsigned char") byte g, @NativeType("unsigned char") byte b, @NativeType("NVGcolor") NVGColor __result) {
        nnvgRGB(r, g, b, __result.address());
        return __result;
    }

    // --- [ nvgRGBf ] ---

    /** Unsafe version of: {@link #nvgRGBf RGBf} */
    public static native void nnvgRGBf(float r, float g, float b, long __result);

    /**
     * Returns a color value from red, green, blue values. Alpha will be set to 1.0f.
     *
     * @param r the red value
     * @param g the green value
     * @param b the blue value
     */
    @NativeType("NVGcolor")
    public static NVGColor nvgRGBf(float r, float g, float b, @NativeType("NVGcolor") NVGColor __result) {
        nnvgRGBf(r, g, b, __result.address());
        return __result;
    }

    // --- [ nvgRGBA ] ---

    /** Unsafe version of: {@link #nvgRGBA RGBA} */
    public static native void nnvgRGBA(byte r, byte g, byte b, byte a, long __result);

    /**
     * Returns a color value from red, green, blue and alpha values.
     *
     * @param r the red value
     * @param g the green value
     * @param b the blue value
     * @param a the alpha value
     */
    @NativeType("NVGcolor")
    public static NVGColor nvgRGBA(@NativeType("unsigned char") byte r, @NativeType("unsigned char") byte g, @NativeType("unsigned char") byte b, @NativeType("unsigned char") byte a, @NativeType("NVGcolor") NVGColor __result) {
        nnvgRGBA(r, g, b, a, __result.address());
        return __result;
    }

    // --- [ nvgRGBAf ] ---

    /** Unsafe version of: {@link #nvgRGBAf RGBAf} */
    public static native void nnvgRGBAf(float r, float g, float b, float a, long __result);

    /**
     * Returns a color value from red, green, blue and alpha values.
     *
     * @param r the red value
     * @param g the green value
     * @param b the blue value
     * @param a the alpha value
     */
    @NativeType("NVGcolor")
    public static NVGColor nvgRGBAf(float r, float g, float b, float a, @NativeType("NVGcolor") NVGColor __result) {
        nnvgRGBAf(r, g, b, a, __result.address());
        return __result;
    }

    // --- [ nvgLerpRGBA ] ---

    /** Unsafe version of: {@link #nvgLerpRGBA LerpRGBA} */
    public static native void nnvgLerpRGBA(long c0, long c1, float u, long __result);

    /**
     * Linearly interpolates from color {@code c0} to {@code c1}, and returns resulting color value.
     *
     * @param c0 the first color
     * @param c1 the second color
     * @param u  the interpolation factor
     */
    @NativeType("NVGcolor")
    public static NVGColor nvgLerpRGBA(@NativeType("NVGcolor") NVGColor c0, @NativeType("NVGcolor") NVGColor c1, float u, @NativeType("NVGcolor") NVGColor __result) {
        nnvgLerpRGBA(c0.address(), c1.address(), u, __result.address());
        return __result;
    }

    // --- [ nvgTransRGBA ] ---

    /** Unsafe version of: {@link #nvgTransRGBA TransRGBA} */
    public static native void nnvgTransRGBA(long c0, byte a, long __result);

    /**
     * Sets transparency of a color value.
     *
     * @param c0 the color
     * @param a  the alpha value
     */
    @NativeType("NVGcolor")
    public static NVGColor nvgTransRGBA(@NativeType("NVGcolor") NVGColor c0, @NativeType("unsigned char") byte a, @NativeType("NVGcolor") NVGColor __result) {
        nnvgTransRGBA(c0.address(), a, __result.address());
        return __result;
    }

    // --- [ nvgTransRGBAf ] ---

    /** Unsafe version of: {@link #nvgTransRGBAf TransRGBAf} */
    public static native void nnvgTransRGBAf(long c0, float a, long __result);

    /**
     * Sets transparency of a color value.
     *
     * @param c0 the color
     * @param a  the alpha value
     */
    @NativeType("NVGcolor")
    public static NVGColor nvgTransRGBAf(@NativeType("NVGcolor") NVGColor c0, float a, @NativeType("NVGcolor") NVGColor __result) {
        nnvgTransRGBAf(c0.address(), a, __result.address());
        return __result;
    }

    // --- [ nvgHSL ] ---

    /** Unsafe version of: {@link #nvgHSL HSL} */
    public static native void nnvgHSL(float h, float s, float l, long __result);

    /**
     * Returns color value specified by hue, saturation and lightness.
     * 
     * <p>HSL values are all in range {@code [0..1]}, alpha will be set to 255.</p>
     *
     * @param h the hue value
     * @param s the saturation value
     * @param l the lightness value
     */
    @NativeType("NVGcolor")
    public static NVGColor nvgHSL(float h, float s, float l, @NativeType("NVGcolor") NVGColor __result) {
        nnvgHSL(h, s, l, __result.address());
        return __result;
    }

    // --- [ nvgHSLA ] ---

    /** Unsafe version of: {@link #nvgHSLA HSLA} */
    public static native void nnvgHSLA(float h, float s, float l, byte a, long __result);

    /**
     * Returns color value specified by hue, saturation and lightness and alpha.
     * 
     * <p>HSL values are all in range {@code [0..1]}, alpha in range {@code [0..255]}</p>
     *
     * @param h the hue value
     * @param s the saturation value
     * @param l the lightness value
     * @param a the alpha value
     */
    @NativeType("NVGcolor")
    public static NVGColor nvgHSLA(float h, float s, float l, @NativeType("unsigned char") byte a, @NativeType("NVGcolor") NVGColor __result) {
        nnvgHSLA(h, s, l, a, __result.address());
        return __result;
    }

    // --- [ nvgSave ] ---

    /** Unsafe version of: {@link #nvgSave Save} */
    public static native void nnvgSave(long ctx);

    /**
     * Pushes and saves the current render state into a state stack. A matching {@link #nvgRestore Restore} must be used to restore the state.
     *
     * @param ctx the NanoVG context
     */
    public static void nvgSave(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgSave(ctx);
    }

    // --- [ nvgRestore ] ---

    /** Unsafe version of: {@link #nvgRestore Restore} */
    public static native void nnvgRestore(long ctx);

    /**
     * Pops and restores current render state.
     *
     * @param ctx the NanoVG context
     */
    public static void nvgRestore(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgRestore(ctx);
    }

    // --- [ nvgReset ] ---

    /** Unsafe version of: {@link #nvgReset Reset} */
    public static native void nnvgReset(long ctx);

    /**
     * Resets current render state to default values. Does not affect the render state stack.
     *
     * @param ctx the NanoVG context
     */
    public static void nvgReset(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgReset(ctx);
    }

    // --- [ nvgShapeAntiAlias ] ---

    /** Unsafe version of: {@link #nvgShapeAntiAlias ShapeAntiAlias} */
    public static native void nnvgShapeAntiAlias(long ctx, int enabled);

    /**
     * Sets whether to draw antialias for {@link #nvgStroke Stroke} and {@link #nvgFill Fill}. It's enabled by default.
     *
     * @param ctx     the NanoVG context
     * @param enabled the flag to set
     */
    public static void nvgShapeAntiAlias(@NativeType("NVGcontext *") long ctx, @NativeType("int") boolean enabled) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgShapeAntiAlias(ctx, enabled ? 1 : 0);
    }

    // --- [ nvgStrokeColor ] ---

    /** Unsafe version of: {@link #nvgStrokeColor StrokeColor} */
    public static native void nnvgStrokeColor(long ctx, long color);

    /**
     * Sets current stroke style to a solid color.
     *
     * @param ctx   the NanoVG context
     * @param color the color to set
     */
    public static void nvgStrokeColor(@NativeType("NVGcontext *") long ctx, @NativeType("NVGcolor") NVGColor color) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgStrokeColor(ctx, color.address());
    }

    // --- [ nvgStrokePaint ] ---

    /** Unsafe version of: {@link #nvgStrokePaint StrokePaint} */
    public static native void nnvgStrokePaint(long ctx, long paint);

    /**
     * Sets current stroke style to a paint, which can be a one of the gradients or a pattern.
     *
     * @param ctx   the NanoVG context
     * @param paint the paint to set
     */
    public static void nvgStrokePaint(@NativeType("NVGcontext *") long ctx, @NativeType("NVGpaint") NVGPaint paint) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgStrokePaint(ctx, paint.address());
    }

    // --- [ nvgFillColor ] ---

    /** Unsafe version of: {@link #nvgFillColor FillColor} */
    public static native void nnvgFillColor(long ctx, long color);

    /**
     * Sets current fill style to a solid color.
     *
     * @param ctx   the NanoVG context
     * @param color the color to set
     */
    public static void nvgFillColor(@NativeType("NVGcontext *") long ctx, @NativeType("NVGcolor") NVGColor color) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgFillColor(ctx, color.address());
    }

    // --- [ nvgFillPaint ] ---

    /** Unsafe version of: {@link #nvgFillPaint FillPaint} */
    public static native void nnvgFillPaint(long ctx, long paint);

    /**
     * Sets current fill style to a paint, which can be a one of the gradients or a pattern.
     *
     * @param ctx   the NanoVG context
     * @param paint the paint to set
     */
    public static void nvgFillPaint(@NativeType("NVGcontext *") long ctx, @NativeType("NVGpaint") NVGPaint paint) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgFillPaint(ctx, paint.address());
    }

    // --- [ nvgMiterLimit ] ---

    /** Unsafe version of: {@link #nvgMiterLimit MiterLimit} */
    public static native void nnvgMiterLimit(long ctx, float limit);

    /**
     * Sets the miter limit of the stroke style. Miter limit controls when a sharp corner is beveled.
     *
     * @param ctx   the NanoVG context
     * @param limit the miter limit to set
     */
    public static void nvgMiterLimit(@NativeType("NVGcontext *") long ctx, float limit) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgMiterLimit(ctx, limit);
    }

    // --- [ nvgStrokeWidth ] ---

    /** Unsafe version of: {@link #nvgStrokeWidth StrokeWidth} */
    public static native void nnvgStrokeWidth(long ctx, float size);

    /**
     * Sets the stroke width of the stroke style.
     *
     * @param ctx  the NanoVG context
     * @param size the stroke width to set
     */
    public static void nvgStrokeWidth(@NativeType("NVGcontext *") long ctx, float size) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgStrokeWidth(ctx, size);
    }

    // --- [ nvgLineCap ] ---

    /** Unsafe version of: {@link #nvgLineCap LineCap} */
    public static native void nnvgLineCap(long ctx, int cap);

    /**
     * Sets how the end of the line (cap) is drawn.
     * 
     * <p>The default line cap is {@link #NVG_BUTT BUTT}.</p>
     *
     * @param ctx the NanoVG context
     * @param cap the line cap to set. One of:<br><table><tr><td>{@link #NVG_BUTT BUTT}</td><td>{@link #NVG_ROUND ROUND}</td><td>{@link #NVG_SQUARE SQUARE}</td></tr></table>
     */
    public static void nvgLineCap(@NativeType("NVGcontext *") long ctx, int cap) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgLineCap(ctx, cap);
    }

    // --- [ nvgLineJoin ] ---

    /** Unsafe version of: {@link #nvgLineJoin LineJoin} */
    public static native void nnvgLineJoin(long ctx, int join);

    /**
     * Sets how sharp path corners are drawn.
     * 
     * <p>The default line join is {@link #NVG_MITER MITER}.</p>
     *
     * @param ctx  the NanoVG context
     * @param join the line join to set. One of:<br><table><tr><td>{@link #NVG_MITER MITER}</td><td>{@link #NVG_ROUND ROUND}</td><td>{@link #NVG_BEVEL BEVEL}</td></tr></table>
     */
    public static void nvgLineJoin(@NativeType("NVGcontext *") long ctx, int join) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgLineJoin(ctx, join);
    }

    // --- [ nvgGlobalAlpha ] ---

    /** Unsafe version of: {@link #nvgGlobalAlpha GlobalAlpha} */
    public static native void nnvgGlobalAlpha(long ctx, float alpha);

    /**
     * Sets the transparency applied to all rendered shapes.
     * 
     * <p>Already transparent paths will get proportionally more transparent as well.</p>
     *
     * @param ctx   the NanoVG context
     * @param alpha the alpha value to set
     */
    public static void nvgGlobalAlpha(@NativeType("NVGcontext *") long ctx, float alpha) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgGlobalAlpha(ctx, alpha);
    }

    // --- [ nvgResetTransform ] ---

    /** Unsafe version of: {@link #nvgResetTransform ResetTransform} */
    public static native void nnvgResetTransform(long ctx);

    /**
     * Resets current transform to an identity matrix.
     *
     * @param ctx the NanoVG context
     */
    public static void nvgResetTransform(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgResetTransform(ctx);
    }

    // --- [ nvgTransform ] ---

    /** Unsafe version of: {@link #nvgTransform Transform} */
    public static native void nnvgTransform(long ctx, float a, float b, float c, float d, float e, float f);

    /**
     * Premultiplies current coordinate system by specified matrix. The parameters are interpreted as matrix as follows:
     * 
     * <pre><code>
     * [a c e]
     * [b d f]
     * [0 0 1]</code></pre>
     *
     * @param ctx the NanoVG context
     * @param a   the a value
     * @param b   the b value
     * @param c   the c value
     * @param d   the d value
     * @param e   the e value
     * @param f   the f value
     */
    public static void nvgTransform(@NativeType("NVGcontext *") long ctx, float a, float b, float c, float d, float e, float f) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgTransform(ctx, a, b, c, d, e, f);
    }

    // --- [ nvgTranslate ] ---

    /** Unsafe version of: {@link #nvgTranslate Translate} */
    public static native void nnvgTranslate(long ctx, float x, float y);

    /**
     * Translates current coordinate system.
     *
     * @param ctx the NanoVG context
     * @param x   the X axis translation amount
     * @param y   the Y axis translation amount
     */
    public static void nvgTranslate(@NativeType("NVGcontext *") long ctx, float x, float y) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgTranslate(ctx, x, y);
    }

    // --- [ nvgRotate ] ---

    /** Unsafe version of: {@link #nvgRotate Rotate} */
    public static native void nnvgRotate(long ctx, float angle);

    /**
     * Rotates current coordinate system.
     *
     * @param ctx   the NanoVG context
     * @param angle the rotation angle, in radians
     */
    public static void nvgRotate(@NativeType("NVGcontext *") long ctx, float angle) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgRotate(ctx, angle);
    }

    // --- [ nvgSkewX ] ---

    /** Unsafe version of: {@link #nvgSkewX SkewX} */
    public static native void nnvgSkewX(long ctx, float angle);

    /**
     * Skews the current coordinate system along X axis.
     *
     * @param ctx   the NanoVG context
     * @param angle the skew angle, in radians
     */
    public static void nvgSkewX(@NativeType("NVGcontext *") long ctx, float angle) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgSkewX(ctx, angle);
    }

    // --- [ nvgSkewY ] ---

    /** Unsafe version of: {@link #nvgSkewY SkewY} */
    public static native void nnvgSkewY(long ctx, float angle);

    /**
     * Skews the current coordinate system along Y axis.
     *
     * @param ctx   the NanoVG context
     * @param angle the skew angle, in radians
     */
    public static void nvgSkewY(@NativeType("NVGcontext *") long ctx, float angle) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgSkewY(ctx, angle);
    }

    // --- [ nvgScale ] ---

    /** Unsafe version of: {@link #nvgScale Scale} */
    public static native void nnvgScale(long ctx, float x, float y);

    /**
     * Scales the current coordinate system.
     *
     * @param ctx the NanoVG context
     * @param x   the X axis scale factor
     * @param y   the Y axis scale factor
     */
    public static void nvgScale(@NativeType("NVGcontext *") long ctx, float x, float y) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgScale(ctx, x, y);
    }

    // --- [ nvgCurrentTransform ] ---

    /** Unsafe version of: {@link #nvgCurrentTransform CurrentTransform} */
    public static native void nnvgCurrentTransform(long ctx, long xform);

    /**
     * Stores the top part (a-f) of the current transformation matrix in to the specified buffer.
     * 
     * <pre><code>
     * [a c e]
     * [b d f]
     * [0 0 1]</code></pre>
     * 
     * <p>There should be space for 6 floats in the return buffer for the values {@code a-f}.</p>
     *
     * @param ctx   the NanoVG context
     * @param xform the destination buffer
     */
    public static void nvgCurrentTransform(@NativeType("NVGcontext *") long ctx, @NativeType("float *") FloatBuffer xform) {
        if (CHECKS) {
            check(ctx);
            check(xform, 6);
        }
        nnvgCurrentTransform(ctx, memAddress(xform));
    }

    // --- [ nvgTransformIdentity ] ---

    /** Unsafe version of: {@link #nvgTransformIdentity TransformIdentity} */
    public static native void nnvgTransformIdentity(long dst);

    /**
     * Sets the transform to identity matrix.
     *
     * @param dst the destination buffer
     */
    public static void nvgTransformIdentity(@NativeType("float *") FloatBuffer dst) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformIdentity(memAddress(dst));
    }

    // --- [ nvgTransformTranslate ] ---

    /** Unsafe version of: {@link #nvgTransformTranslate TransformTranslate} */
    public static native void nnvgTransformTranslate(long dst, float tx, float ty);

    /**
     * Sets the transform to translation matrix matrix.
     *
     * @param dst the destination buffer
     * @param tx  the X axis translation amount
     * @param ty  the Y axis translation amount
     */
    public static void nvgTransformTranslate(@NativeType("float *") FloatBuffer dst, float tx, float ty) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformTranslate(memAddress(dst), tx, ty);
    }

    // --- [ nvgTransformScale ] ---

    /** Unsafe version of: {@link #nvgTransformScale TransformScale} */
    public static native void nnvgTransformScale(long dst, float sx, float sy);

    /**
     * Sets the transform to scale matrix.
     *
     * @param dst the destination buffer
     * @param sx  the X axis scale factor
     * @param sy  the Y axis scale factor
     */
    public static void nvgTransformScale(@NativeType("float *") FloatBuffer dst, float sx, float sy) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformScale(memAddress(dst), sx, sy);
    }

    // --- [ nvgTransformRotate ] ---

    /** Unsafe version of: {@link #nvgTransformRotate TransformRotate} */
    public static native void nnvgTransformRotate(long dst, float a);

    /**
     * Sets the transform to rotate matrix.
     *
     * @param dst the destination buffer
     * @param a   the rotation angle, in radians
     */
    public static void nvgTransformRotate(@NativeType("float *") FloatBuffer dst, float a) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformRotate(memAddress(dst), a);
    }

    // --- [ nvgTransformSkewX ] ---

    /** Unsafe version of: {@link #nvgTransformSkewX TransformSkewX} */
    public static native void nnvgTransformSkewX(long dst, float a);

    /**
     * Sets the transform to skew-x matrix.
     *
     * @param dst the destination buffer
     * @param a   the skew angle, in radians
     */
    public static void nvgTransformSkewX(@NativeType("float *") FloatBuffer dst, float a) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformSkewX(memAddress(dst), a);
    }

    // --- [ nvgTransformSkewY ] ---

    /** Unsafe version of: {@link #nvgTransformSkewY TransformSkewY} */
    public static native void nnvgTransformSkewY(long dst, float a);

    /**
     * Sets the transform to skew-y matrix.
     *
     * @param dst the destination buffer
     * @param a   the skew angle, in radians
     */
    public static void nvgTransformSkewY(@NativeType("float *") FloatBuffer dst, float a) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformSkewY(memAddress(dst), a);
    }

    // --- [ nvgTransformMultiply ] ---

    /** Unsafe version of: {@link #nvgTransformMultiply TransformMultiply} */
    public static native void nnvgTransformMultiply(long dst, long src);

    /**
     * Sets the transform to the result of multiplication of two transforms, of {@code A = A*B}.
     *
     * @param dst the destination buffer
     * @param src the {@code B} transformation matrix
     */
    public static void nvgTransformMultiply(@NativeType("float *") FloatBuffer dst, @NativeType("float const *") FloatBuffer src) {
        if (CHECKS) {
            check(dst, 6);
            check(src, 6);
        }
        nnvgTransformMultiply(memAddress(dst), memAddress(src));
    }

    // --- [ nvgTransformPremultiply ] ---

    /** Unsafe version of: {@link #nvgTransformPremultiply TransformPremultiply} */
    public static native void nnvgTransformPremultiply(long dst, long src);

    /**
     * Sets the transform to the result of multiplication of two transforms, of {@code A = B*A}.
     *
     * @param dst the destination buffer
     * @param src the {@code B} transformation matrix
     */
    public static void nvgTransformPremultiply(@NativeType("float *") FloatBuffer dst, @NativeType("float const *") FloatBuffer src) {
        if (CHECKS) {
            check(dst, 6);
            check(src, 6);
        }
        nnvgTransformPremultiply(memAddress(dst), memAddress(src));
    }

    // --- [ nvgTransformInverse ] ---

    /** Unsafe version of: {@link #nvgTransformInverse TransformInverse} */
    public static native int nnvgTransformInverse(long dst, long src);

    /**
     * Sets the destination to inverse of specified transform.
     *
     * @param dst the destination buffer
     * @param src the transformation matrix to inverse
     *
     * @return 1 if the inverse could be calculated, else 0
     */
    @NativeType("int")
    public static boolean nvgTransformInverse(@NativeType("float *") FloatBuffer dst, @NativeType("float const *") FloatBuffer src) {
        if (CHECKS) {
            check(dst, 6);
            check(src, 6);
        }
        return nnvgTransformInverse(memAddress(dst), memAddress(src)) != 0;
    }

    // --- [ nvgTransformPoint ] ---

    /** Unsafe version of: {@link #nvgTransformPoint TransformPoint} */
    public static native void nnvgTransformPoint(long dstx, long dsty, long xform, float srcx, float srcy);

    /**
     * Transform a point by given transform.
     *
     * @param dstx  returns the transformed X axis coordinate
     * @param dsty  returns the transformed Y axis coordinate
     * @param xform the transformation matrix
     * @param srcx  the point X axis coordinate
     * @param srcy  the point Y axis coordinate
     */
    public static void nvgTransformPoint(@NativeType("float *") FloatBuffer dstx, @NativeType("float *") FloatBuffer dsty, @NativeType("float const *") FloatBuffer xform, float srcx, float srcy) {
        if (CHECKS) {
            check(dstx, 1);
            check(dsty, 1);
            check(xform, 6);
        }
        nnvgTransformPoint(memAddress(dstx), memAddress(dsty), memAddress(xform), srcx, srcy);
    }

    // --- [ nvgDegToRad ] ---

    /**
     * Converts degrees to radians.
     *
     * @param deg the rotation value, in degrees
     */
    public static native float nvgDegToRad(float deg);

    // --- [ nvgRadToDeg ] ---

    /**
     * Converts radians to degrees.
     *
     * @param rad the rotation value, in radians
     */
    public static native float nvgRadToDeg(float rad);

    // --- [ nvgCreateImage ] ---

    /** Unsafe version of: {@link #nvgCreateImage CreateImage} */
    public static native int nnvgCreateImage(long ctx, long filename, int imageFlags);

    /**
     * Creates image by loading it from the disk from specified file name.
     *
     * @param ctx        the NanoVG context
     * @param filename   the image file name
     * @param imageFlags the image flags. One of:<br><table><tr><td>{@link #NVG_IMAGE_GENERATE_MIPMAPS IMAGE_GENERATE_MIPMAPS}</td><td>{@link #NVG_IMAGE_REPEATX IMAGE_REPEATX}</td><td>{@link #NVG_IMAGE_REPEATY IMAGE_REPEATY}</td><td>{@link #NVG_IMAGE_FLIPY IMAGE_FLIPY}</td><td>{@link #NVG_IMAGE_PREMULTIPLIED IMAGE_PREMULTIPLIED}</td></tr><tr><td>{@link #NVG_IMAGE_NEAREST IMAGE_NEAREST}</td></tr></table>
     *
     * @return a handle to the image
     */
    public static int nvgCreateImage(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer filename, int imageFlags) {
        if (CHECKS) {
            check(ctx);
            checkNT1(filename);
        }
        return nnvgCreateImage(ctx, memAddress(filename), imageFlags);
    }

    /**
     * Creates image by loading it from the disk from specified file name.
     *
     * @param ctx        the NanoVG context
     * @param filename   the image file name
     * @param imageFlags the image flags. One of:<br><table><tr><td>{@link #NVG_IMAGE_GENERATE_MIPMAPS IMAGE_GENERATE_MIPMAPS}</td><td>{@link #NVG_IMAGE_REPEATX IMAGE_REPEATX}</td><td>{@link #NVG_IMAGE_REPEATY IMAGE_REPEATY}</td><td>{@link #NVG_IMAGE_FLIPY IMAGE_FLIPY}</td><td>{@link #NVG_IMAGE_PREMULTIPLIED IMAGE_PREMULTIPLIED}</td></tr><tr><td>{@link #NVG_IMAGE_NEAREST IMAGE_NEAREST}</td></tr></table>
     *
     * @return a handle to the image
     */
    public static int nvgCreateImage(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence filename, int imageFlags) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nnvgCreateImage(ctx, filenameEncoded, imageFlags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgCreateImageMem ] ---

    /**
     * Unsafe version of: {@link #nvgCreateImageMem CreateImageMem}
     *
     * @param ndata the image data size, in bytes
     */
    public static native int nnvgCreateImageMem(long ctx, int imageFlags, long data, int ndata);

    /**
     * Creates image by loading it from the specified chunk of memory.
     *
     * @param ctx        the NanoVG context
     * @param imageFlags the image flags. One of:<br><table><tr><td>{@link #NVG_IMAGE_GENERATE_MIPMAPS IMAGE_GENERATE_MIPMAPS}</td><td>{@link #NVG_IMAGE_REPEATX IMAGE_REPEATX}</td><td>{@link #NVG_IMAGE_REPEATY IMAGE_REPEATY}</td><td>{@link #NVG_IMAGE_FLIPY IMAGE_FLIPY}</td><td>{@link #NVG_IMAGE_PREMULTIPLIED IMAGE_PREMULTIPLIED}</td></tr><tr><td>{@link #NVG_IMAGE_NEAREST IMAGE_NEAREST}</td></tr></table>
     * @param data       the image data
     *
     * @return a handle to the image
     */
    public static int nvgCreateImageMem(@NativeType("NVGcontext *") long ctx, int imageFlags, @NativeType("unsigned char *") ByteBuffer data) {
        if (CHECKS) {
            check(ctx);
        }
        return nnvgCreateImageMem(ctx, imageFlags, memAddress(data), data.remaining());
    }

    // --- [ nvgCreateImageRGBA ] ---

    /** Unsafe version of: {@link #nvgCreateImageRGBA CreateImageRGBA} */
    public static native int nnvgCreateImageRGBA(long ctx, int w, int h, int imageFlags, long data);

    /**
     * Creates image from specified image data.
     *
     * @param ctx        the NanoVG context
     * @param w          the image width
     * @param h          the image height
     * @param imageFlags the image flags. One of:<br><table><tr><td>{@link #NVG_IMAGE_GENERATE_MIPMAPS IMAGE_GENERATE_MIPMAPS}</td><td>{@link #NVG_IMAGE_REPEATX IMAGE_REPEATX}</td><td>{@link #NVG_IMAGE_REPEATY IMAGE_REPEATY}</td><td>{@link #NVG_IMAGE_FLIPY IMAGE_FLIPY}</td><td>{@link #NVG_IMAGE_PREMULTIPLIED IMAGE_PREMULTIPLIED}</td></tr><tr><td>{@link #NVG_IMAGE_NEAREST IMAGE_NEAREST}</td></tr></table>
     * @param data       the image data
     *
     * @return a handle to the image
     */
    public static int nvgCreateImageRGBA(@NativeType("NVGcontext *") long ctx, int w, int h, int imageFlags, @NativeType("unsigned char const *") ByteBuffer data) {
        if (CHECKS) {
            check(ctx);
            check(data, w * h * 4);
        }
        return nnvgCreateImageRGBA(ctx, w, h, imageFlags, memAddress(data));
    }

    // --- [ nvgUpdateImage ] ---

    /** Unsafe version of: {@link #nvgUpdateImage UpdateImage} */
    public static native void nnvgUpdateImage(long ctx, int image, long data);

    /**
     * Updates image data specified by image handle.
     *
     * @param ctx   the NanoVG context
     * @param image the image handle
     * @param data  the image data
     */
    public static void nvgUpdateImage(@NativeType("NVGcontext *") long ctx, int image, @NativeType("unsigned char const *") ByteBuffer data) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgUpdateImage(ctx, image, memAddress(data));
    }

    // --- [ nvgImageSize ] ---

    /** Unsafe version of: {@link #nvgImageSize ImageSize} */
    public static native void nnvgImageSize(long ctx, int image, long w, long h);

    /**
     * Returns the dimensions of a created image.
     *
     * @param ctx   the NanoVG context
     * @param image the image handle
     * @param w     returns the image width
     * @param h     returns the image height
     */
    public static void nvgImageSize(@NativeType("NVGcontext *") long ctx, int image, @NativeType("int *") IntBuffer w, @NativeType("int *") IntBuffer h) {
        if (CHECKS) {
            check(ctx);
            check(w, 1);
            check(h, 1);
        }
        nnvgImageSize(ctx, image, memAddress(w), memAddress(h));
    }

    // --- [ nvgDeleteImage ] ---

    /** Unsafe version of: {@link #nvgDeleteImage DeleteImage} */
    public static native void nnvgDeleteImage(long ctx, int image);

    /**
     * Deletes created image.
     *
     * @param ctx   the NanoVG context
     * @param image the image handle to delete
     */
    public static void nvgDeleteImage(@NativeType("NVGcontext *") long ctx, int image) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgDeleteImage(ctx, image);
    }

    // --- [ nvgLinearGradient ] ---

    /** Unsafe version of: {@link #nvgLinearGradient LinearGradient} */
    public static native void nnvgLinearGradient(long ctx, float sx, float sy, float ex, float ey, long icol, long ocol, long __result);

    /**
     * Creates and returns a linear gradient.
     * 
     * <p>The gradient is transformed by the current transform when it is passed to {@link #nvgFillPaint FillPaint} or {@link #nvgStrokePaint StrokePaint}.</p>
     *
     * @param ctx  the NanoVG context
     * @param sx   the X axis start coordinate
     * @param sy   the Y axis start coordinate
     * @param ex   the X axis end coordinate
     * @param ey   the Y axis end coordinate
     * @param icol the start color
     * @param ocol the end color
     */
    @NativeType("NVGpaint")
    public static NVGPaint nvgLinearGradient(@NativeType("NVGcontext *") long ctx, float sx, float sy, float ex, float ey, @NativeType("NVGcolor") NVGColor icol, @NativeType("NVGcolor") NVGColor ocol, @NativeType("NVGpaint") NVGPaint __result) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgLinearGradient(ctx, sx, sy, ex, ey, icol.address(), ocol.address(), __result.address());
        return __result;
    }

    // --- [ nvgBoxGradient ] ---

    /** Unsafe version of: {@link #nvgBoxGradient BoxGradient} */
    public static native void nnvgBoxGradient(long ctx, float x, float y, float w, float h, float r, float f, long icol, long ocol, long __result);

    /**
     * Creates and returns a box gradient. Box gradient is a feathered rounded rectangle, it is useful for rendering drop shadows or highlights for boxes.
     * 
     * <p>The gradient is transformed by the current transform when it is passed to {@link #nvgFillPaint FillPaint} or {@link #nvgStrokePaint StrokePaint}.</p>
     *
     * @param ctx  the NanoVG context
     * @param x    the rectangle left coordinate
     * @param y    the rectangle top coordinate
     * @param w    the rectangle width
     * @param h    the rectangle height
     * @param r    the corner radius
     * @param f    the feather value. Feather defines how blurry the border of the rectangle is.
     * @param icol the inner color
     * @param ocol the outer color
     */
    @NativeType("NVGpaint")
    public static NVGPaint nvgBoxGradient(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float r, float f, @NativeType("NVGcolor") NVGColor icol, @NativeType("NVGcolor") NVGColor ocol, @NativeType("NVGpaint") NVGPaint __result) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgBoxGradient(ctx, x, y, w, h, r, f, icol.address(), ocol.address(), __result.address());
        return __result;
    }

    // --- [ nvgRadialGradient ] ---

    /** Unsafe version of: {@link #nvgRadialGradient RadialGradient} */
    public static native void nnvgRadialGradient(long ctx, float cx, float cy, float inr, float outr, long icol, long ocol, long __result);

    /**
     * Creates and returns a radial gradient.
     * 
     * <p>The gradient is transformed by the current transform when it is passed to {@link #nvgFillPaint FillPaint} or {@link #nvgStrokePaint StrokePaint}.</p>
     *
     * @param ctx  the NanoVG context
     * @param cx   the X axis center coordinate
     * @param cy   the Y axis center coordinate
     * @param inr  the inner radius
     * @param outr the outer radius
     * @param icol the start color
     * @param ocol the end color
     */
    @NativeType("NVGpaint")
    public static NVGPaint nvgRadialGradient(@NativeType("NVGcontext *") long ctx, float cx, float cy, float inr, float outr, @NativeType("NVGcolor") NVGColor icol, @NativeType("NVGcolor") NVGColor ocol, @NativeType("NVGpaint") NVGPaint __result) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgRadialGradient(ctx, cx, cy, inr, outr, icol.address(), ocol.address(), __result.address());
        return __result;
    }

    // --- [ nvgImagePattern ] ---

    /** Unsafe version of: {@link #nvgImagePattern ImagePattern} */
    public static native void nnvgImagePattern(long ctx, float ox, float oy, float ex, float ey, float angle, int image, float alpha, long __result);

    /**
     * Creates and returns an image patter.
     * 
     * <p>The gradient is transformed by the current transform when it is passed to {@link #nvgFillPaint FillPaint} or {@link #nvgStrokePaint StrokePaint}.</p>
     *
     * @param ctx   the NanoVG context
     * @param ox    the image pattern left coordinate
     * @param oy    the image pattern top coordinate
     * @param ex    the image width
     * @param ey    the image height
     * @param angle the rotation angle around the top-left corner
     * @param image the image to render
     * @param alpha the alpha value
     */
    @NativeType("NVGpaint")
    public static NVGPaint nvgImagePattern(@NativeType("NVGcontext *") long ctx, float ox, float oy, float ex, float ey, float angle, int image, float alpha, @NativeType("NVGpaint") NVGPaint __result) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgImagePattern(ctx, ox, oy, ex, ey, angle, image, alpha, __result.address());
        return __result;
    }

    // --- [ nvgScissor ] ---

    /** Unsafe version of: {@link #nvgScissor Scissor} */
    public static native void nnvgScissor(long ctx, float x, float y, float w, float h);

    /**
     * Sets the current scissor rectangle.
     * 
     * <p>The scissor rectangle is transformed by the current transform.</p>
     *
     * @param ctx the NanoVG context
     * @param x   the rectangle X axis coordinate
     * @param y   the rectangle Y axis coordinate
     * @param w   the rectangle width
     * @param h   the rectangle height
     */
    public static void nvgScissor(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgScissor(ctx, x, y, w, h);
    }

    // --- [ nvgIntersectScissor ] ---

    /** Unsafe version of: {@link #nvgIntersectScissor IntersectScissor} */
    public static native void nnvgIntersectScissor(long ctx, float x, float y, float w, float h);

    /**
     * Intersects current scissor rectangle with the specified rectangle.
     * 
     * <p>The scissor rectangle is transformed by the current transform.</p>
     * 
     * <p>Note: in case the rotation of previous scissor rect differs from the current one, the intersection will be done between the specified rectangle and the
     * previous scissor rectangle transformed in the current transform space. The resulting shape is always rectangle.</p>
     *
     * @param ctx the NanoVG context
     * @param x   the rectangle X axis coordinate
     * @param y   the rectangle Y axis coordinate
     * @param w   the rectangle width
     * @param h   the rectangle height
     */
    public static void nvgIntersectScissor(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgIntersectScissor(ctx, x, y, w, h);
    }

    // --- [ nvgResetScissor ] ---

    /** Unsafe version of: {@link #nvgResetScissor ResetScissor} */
    public static native void nnvgResetScissor(long ctx);

    /**
     * Resets and disables scissoring.
     *
     * @param ctx the NanoVG context
     */
    public static void nvgResetScissor(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgResetScissor(ctx);
    }

    // --- [ nvgBeginPath ] ---

    /** Unsafe version of: {@link #nvgBeginPath BeginPath} */
    public static native void nnvgBeginPath(long ctx);

    /**
     * Clears the current path and sub-paths.
     *
     * @param ctx the NanoVG context
     */
    public static void nvgBeginPath(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgBeginPath(ctx);
    }

    // --- [ nvgMoveTo ] ---

    /** Unsafe version of: {@link #nvgMoveTo MoveTo} */
    public static native void nnvgMoveTo(long ctx, float x, float y);

    /**
     * Starts new sub-path with specified point as first point.
     *
     * @param ctx the NanoVG context
     * @param x   the point X axis coordinate
     * @param y   the point Y axis coordinate
     */
    public static void nvgMoveTo(@NativeType("NVGcontext *") long ctx, float x, float y) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgMoveTo(ctx, x, y);
    }

    // --- [ nvgLineTo ] ---

    /** Unsafe version of: {@link #nvgLineTo LineTo} */
    public static native void nnvgLineTo(long ctx, float x, float y);

    /**
     * Adds line segment from the last point in the path to the specified point.
     *
     * @param ctx the NanoVG context
     * @param x   the point X axis coordinate
     * @param y   the point Y axis coordinate
     */
    public static void nvgLineTo(@NativeType("NVGcontext *") long ctx, float x, float y) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgLineTo(ctx, x, y);
    }

    // --- [ nvgBezierTo ] ---

    /** Unsafe version of: {@link #nvgBezierTo BezierTo} */
    public static native void nnvgBezierTo(long ctx, float c1x, float c1y, float c2x, float c2y, float x, float y);

    /**
     * Adds cubic bezier segment from last point in the path via two control points to the specified point.
     *
     * @param ctx the NanoVG context
     * @param c1x the first control point X axis coordinate
     * @param c1y the first control point Y axis coordinate
     * @param c2x the second control point X axis coordinate
     * @param c2y the second control point Y axis coordinate
     * @param x   the point X axis coordinate
     * @param y   the point Y axis coordinate
     */
    public static void nvgBezierTo(@NativeType("NVGcontext *") long ctx, float c1x, float c1y, float c2x, float c2y, float x, float y) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgBezierTo(ctx, c1x, c1y, c2x, c2y, x, y);
    }

    // --- [ nvgQuadTo ] ---

    /** Unsafe version of: {@link #nvgQuadTo QuadTo} */
    public static native void nnvgQuadTo(long ctx, float cx, float cy, float x, float y);

    /**
     * Adds quadratic bezier segment from last point in the path via a control point to the specified point.
     *
     * @param ctx the NanoVG context
     * @param cx  the control point X axis coordinate
     * @param cy  the control point Y axis coordinate
     * @param x   the point X axis coordinate
     * @param y   the point Y axis coordinate
     */
    public static void nvgQuadTo(@NativeType("NVGcontext *") long ctx, float cx, float cy, float x, float y) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgQuadTo(ctx, cx, cy, x, y);
    }

    // --- [ nvgArcTo ] ---

    /** Unsafe version of: {@link #nvgArcTo ArcTo} */
    public static native void nnvgArcTo(long ctx, float x1, float y1, float x2, float y2, float radius);

    /**
     * Adds an arc segment at the corner defined by the last path point, and two specified points.
     *
     * @param ctx    the NanoVG context
     * @param x1     the first point X axis coordinate
     * @param y1     the first point Y axis coordinate
     * @param x2     the second point X axis coordinate
     * @param y2     the second point Y axis coordinate
     * @param radius the arc radius, in radians
     */
    public static void nvgArcTo(@NativeType("NVGcontext *") long ctx, float x1, float y1, float x2, float y2, float radius) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgArcTo(ctx, x1, y1, x2, y2, radius);
    }

    // --- [ nvgClosePath ] ---

    /** Unsafe version of: {@link #nvgClosePath ClosePath} */
    public static native void nnvgClosePath(long ctx);

    /**
     * Closes current sub-path with a line segment.
     *
     * @param ctx the NanoVG context
     */
    public static void nvgClosePath(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgClosePath(ctx);
    }

    // --- [ nvgPathWinding ] ---

    /** Unsafe version of: {@link #nvgPathWinding PathWinding} */
    public static native void nnvgPathWinding(long ctx, int dir);

    /**
     * Sets the current sub-path winding.
     *
     * @param ctx the NanoVG context
     * @param dir the sub-path winding. One of:<br><table><tr><td>{@link #NVG_CCW CCW}</td><td>{@link #NVG_CW CW}</td></tr></table>
     */
    public static void nvgPathWinding(@NativeType("NVGcontext *") long ctx, int dir) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgPathWinding(ctx, dir);
    }

    // --- [ nvgArc ] ---

    /** Unsafe version of: {@link #nvgArc Arc} */
    public static native void nnvgArc(long ctx, float cx, float cy, float r, float a0, float a1, int dir);

    /**
     * Creates new circle arc shaped sub-path.
     *
     * @param ctx the NanoVG context
     * @param cx  the arc center X axis coordinate
     * @param cy  the arc center Y axis coordinate
     * @param r   the arc radius
     * @param a0  the arc starting angle, in radians
     * @param a1  the arc ending angle, in radians
     * @param dir the arc direction. One of:<br><table><tr><td>{@link #NVG_CCW CCW}</td><td>{@link #NVG_CW CW}</td></tr></table>
     */
    public static void nvgArc(@NativeType("NVGcontext *") long ctx, float cx, float cy, float r, float a0, float a1, int dir) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgArc(ctx, cx, cy, r, a0, a1, dir);
    }

    // --- [ nvgRect ] ---

    /** Unsafe version of: {@link #nvgRect Rect} */
    public static native void nnvgRect(long ctx, float x, float y, float w, float h);

    /**
     * Creates new rectangle shaped sub-path.
     *
     * @param ctx the NanoVG context
     * @param x   the rectangle X axis coordinate
     * @param y   the rectangle Y axis coordinate
     * @param w   the rectangle width
     * @param h   the rectangle height
     */
    public static void nvgRect(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgRect(ctx, x, y, w, h);
    }

    // --- [ nvgRoundedRect ] ---

    /** Unsafe version of: {@link #nvgRoundedRect RoundedRect} */
    public static native void nnvgRoundedRect(long ctx, float x, float y, float w, float h, float r);

    /**
     * Creates new rounded rectangle shaped sub-path.
     *
     * @param ctx the NanoVG context
     * @param x   the rectangle X axis coordinate
     * @param y   the rectangle Y axis coordinate
     * @param w   the rectangle width
     * @param h   the rectangle height
     * @param r   the corner radius
     */
    public static void nvgRoundedRect(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float r) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgRoundedRect(ctx, x, y, w, h, r);
    }

    // --- [ nvgRoundedRectVarying ] ---

    /** Unsafe version of: {@link #nvgRoundedRectVarying RoundedRectVarying} */
    public static native void nnvgRoundedRectVarying(long ctx, float x, float y, float w, float h, float radTopLeft, float radTopRight, float radBottomRight, float radBottomLeft);

    /**
     * Creates new rounded rectangle shaped sub-path with varying radii for each corner.
     *
     * @param ctx            the NanoVG context
     * @param x              the rectangle X axis coordinate
     * @param y              the rectangle Y axis coordinate
     * @param w              the rectangle width
     * @param h              the rectangle height
     * @param radTopLeft     the top-left corner radius
     * @param radTopRight    the top-right corner radius
     * @param radBottomRight the bottom-right corner radius
     * @param radBottomLeft  the bottom-left corner radius
     */
    public static void nvgRoundedRectVarying(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float radTopLeft, float radTopRight, float radBottomRight, float radBottomLeft) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgRoundedRectVarying(ctx, x, y, w, h, radTopLeft, radTopRight, radBottomRight, radBottomLeft);
    }

    // --- [ nvgEllipse ] ---

    /** Unsafe version of: {@link #nvgEllipse Ellipse} */
    public static native void nnvgEllipse(long ctx, float cx, float cy, float rx, float ry);

    /**
     * Creates new ellipse shaped sub-path.
     *
     * @param ctx the NanoVG context
     * @param cx  the ellipse center X axis coordinate
     * @param cy  the ellipse center Y axis coordinate
     * @param rx  the ellipse X axis radius
     * @param ry  the ellipse Y axis radius
     */
    public static void nvgEllipse(@NativeType("NVGcontext *") long ctx, float cx, float cy, float rx, float ry) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgEllipse(ctx, cx, cy, rx, ry);
    }

    // --- [ nvgCircle ] ---

    /** Unsafe version of: {@link #nvgCircle Circle} */
    public static native void nnvgCircle(long ctx, float cx, float cy, float r);

    /**
     * Creates new circle shaped sub-path.
     *
     * @param ctx the NanoVG context
     * @param cx  the circle center X axis coordinate
     * @param cy  the circle center Y axis coordinate
     * @param r   the circle radius
     */
    public static void nvgCircle(@NativeType("NVGcontext *") long ctx, float cx, float cy, float r) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgCircle(ctx, cx, cy, r);
    }

    // --- [ nvgFill ] ---

    /** Unsafe version of: {@link #nvgFill Fill} */
    public static native void nnvgFill(long ctx);

    /**
     * Fills the current path with current fill style.
     *
     * @param ctx the NanoVG context
     */
    public static void nvgFill(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgFill(ctx);
    }

    // --- [ nvgStroke ] ---

    /** Unsafe version of: {@link #nvgStroke Stroke} */
    public static native void nnvgStroke(long ctx);

    /**
     * Fills the current path with current stroke style.
     *
     * @param ctx the NanoVG context
     */
    public static void nvgStroke(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgStroke(ctx);
    }

    // --- [ nvgCreateFont ] ---

    /** Unsafe version of: {@link #nvgCreateFont CreateFont} */
    public static native int nnvgCreateFont(long ctx, long name, long filename);

    /**
     * Creates font by loading it from the disk from specified file name.
     *
     * @param ctx      the NanoVG context
     * @param name     the font name
     * @param filename the font file name
     *
     * @return a handle to the font
     */
    public static int nvgCreateFont(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer filename) {
        if (CHECKS) {
            check(ctx);
            checkNT1(name);
            checkNT1(filename);
        }
        return nnvgCreateFont(ctx, memAddress(name), memAddress(filename));
    }

    /**
     * Creates font by loading it from the disk from specified file name.
     *
     * @param ctx      the NanoVG context
     * @param name     the font name
     * @param filename the font file name
     *
     * @return a handle to the font
     */
    public static int nvgCreateFont(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence filename) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nnvgCreateFont(ctx, nameEncoded, filenameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgCreateFontAtIndex ] ---

    /** Unsafe version of: {@link #nvgCreateFontAtIndex CreateFontAtIndex} */
    public static native int nnvgCreateFontAtIndex(long ctx, long name, long filename, int fontIndex);

    /**
     * Creates font by loading it from the disk from specified file name.
     *
     * @param ctx       the NanoVG context
     * @param name      the font name
     * @param filename  the font file name
     * @param fontIndex specifies which font face to load from a .ttf/.ttc file
     *
     * @return a handle to the font
     */
    public static int nvgCreateFontAtIndex(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer filename, int fontIndex) {
        if (CHECKS) {
            check(ctx);
            checkNT1(name);
            checkNT1(filename);
        }
        return nnvgCreateFontAtIndex(ctx, memAddress(name), memAddress(filename), fontIndex);
    }

    /**
     * Creates font by loading it from the disk from specified file name.
     *
     * @param ctx       the NanoVG context
     * @param name      the font name
     * @param filename  the font file name
     * @param fontIndex specifies which font face to load from a .ttf/.ttc file
     *
     * @return a handle to the font
     */
    public static int nvgCreateFontAtIndex(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence filename, int fontIndex) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nnvgCreateFontAtIndex(ctx, nameEncoded, filenameEncoded, fontIndex);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgCreateFontMem ] ---

    /**
     * Unsafe version of: {@link #nvgCreateFontMem CreateFontMem}
     *
     * @param ndata the font data size, in bytes
     */
    public static native int nnvgCreateFontMem(long ctx, long name, long data, int ndata, int freeData);

    /**
     * Creates font by loading it from the specified memory chunk.
     * 
     * <p>The memory chunk must remain valid for as long as the font is used by NanoVG.</p>
     *
     * @param ctx      the NanoVG context
     * @param name     the font name
     * @param data     the font data
     * @param freeData 1 if the font data should be freed automatically, 0 otherwise
     *
     * @return a handle to the font
     */
    public static int nvgCreateFontMem(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer name, @NativeType("unsigned char *") ByteBuffer data, @NativeType("int") boolean freeData) {
        if (CHECKS) {
            check(ctx);
            checkNT1(name);
        }
        return nnvgCreateFontMem(ctx, memAddress(name), memAddress(data), data.remaining(), freeData ? 1 : 0);
    }

    /**
     * Creates font by loading it from the specified memory chunk.
     * 
     * <p>The memory chunk must remain valid for as long as the font is used by NanoVG.</p>
     *
     * @param ctx      the NanoVG context
     * @param name     the font name
     * @param data     the font data
     * @param freeData 1 if the font data should be freed automatically, 0 otherwise
     *
     * @return a handle to the font
     */
    public static int nvgCreateFontMem(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence name, @NativeType("unsigned char *") ByteBuffer data, @NativeType("int") boolean freeData) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nnvgCreateFontMem(ctx, nameEncoded, memAddress(data), data.remaining(), freeData ? 1 : 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgCreateFontMemAtIndex ] ---

    /**
     * Unsafe version of: {@link #nvgCreateFontMemAtIndex CreateFontMemAtIndex}
     *
     * @param ndata the font data size, in bytes
     */
    public static native int nnvgCreateFontMemAtIndex(long ctx, long name, long data, int ndata, int freeData, int fontIndex);

    /**
     * Creates font by loading it from the specified memory chunk.
     * 
     * <p>The memory chunk must remain valid for as long as the font is used by NanoVG.</p>
     *
     * @param ctx       the NanoVG context
     * @param name      the font name
     * @param data      the font data
     * @param freeData  1 if the font data should be freed automatically, 0 otherwise
     * @param fontIndex specifies which font face to load from a .ttf/.ttc file
     *
     * @return a handle to the font
     */
    public static int nvgCreateFontMemAtIndex(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer name, @NativeType("unsigned char *") ByteBuffer data, @NativeType("int") boolean freeData, int fontIndex) {
        if (CHECKS) {
            check(ctx);
            checkNT1(name);
        }
        return nnvgCreateFontMemAtIndex(ctx, memAddress(name), memAddress(data), data.remaining(), freeData ? 1 : 0, fontIndex);
    }

    /**
     * Creates font by loading it from the specified memory chunk.
     * 
     * <p>The memory chunk must remain valid for as long as the font is used by NanoVG.</p>
     *
     * @param ctx       the NanoVG context
     * @param name      the font name
     * @param data      the font data
     * @param freeData  1 if the font data should be freed automatically, 0 otherwise
     * @param fontIndex specifies which font face to load from a .ttf/.ttc file
     *
     * @return a handle to the font
     */
    public static int nvgCreateFontMemAtIndex(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence name, @NativeType("unsigned char *") ByteBuffer data, @NativeType("int") boolean freeData, int fontIndex) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nnvgCreateFontMemAtIndex(ctx, nameEncoded, memAddress(data), data.remaining(), freeData ? 1 : 0, fontIndex);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgFindFont ] ---

    /** Unsafe version of: {@link #nvgFindFont FindFont} */
    public static native int nnvgFindFont(long ctx, long name);

    /**
     * Finds a loaded font of specified name, and returns handle to it, or -1 if the font is not found.
     *
     * @param ctx  the NanoVG context
     * @param name the font name
     */
    public static int nvgFindFont(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            check(ctx);
            checkNT1(name);
        }
        return nnvgFindFont(ctx, memAddress(name));
    }

    /**
     * Finds a loaded font of specified name, and returns handle to it, or -1 if the font is not found.
     *
     * @param ctx  the NanoVG context
     * @param name the font name
     */
    public static int nvgFindFont(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence name) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nnvgFindFont(ctx, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgAddFallbackFontId ] ---

    /** Unsafe version of: {@link #nvgAddFallbackFontId AddFallbackFontId} */
    public static native int nnvgAddFallbackFontId(long ctx, int baseFont, int fallbackFont);

    /**
     * Adds fallback font by handle.
     *
     * @param ctx the NanoVG context
     */
    public static int nvgAddFallbackFontId(@NativeType("NVGcontext *") long ctx, int baseFont, int fallbackFont) {
        if (CHECKS) {
            check(ctx);
        }
        return nnvgAddFallbackFontId(ctx, baseFont, fallbackFont);
    }

    // --- [ nvgAddFallbackFont ] ---

    /** Unsafe version of: {@link #nvgAddFallbackFont AddFallbackFont} */
    public static native int nnvgAddFallbackFont(long ctx, long baseFont, long fallbackFont);

    /**
     * Adds fallback font by name.
     *
     * @param ctx the NanoVG context
     */
    public static int nvgAddFallbackFont(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer baseFont, @NativeType("char const *") ByteBuffer fallbackFont) {
        if (CHECKS) {
            check(ctx);
            checkNT1(baseFont);
            checkNT1(fallbackFont);
        }
        return nnvgAddFallbackFont(ctx, memAddress(baseFont), memAddress(fallbackFont));
    }

    /**
     * Adds fallback font by name.
     *
     * @param ctx the NanoVG context
     */
    public static int nvgAddFallbackFont(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence baseFont, @NativeType("char const *") CharSequence fallbackFont) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(baseFont, true);
            long baseFontEncoded = stack.getPointerAddress();
            stack.nASCII(fallbackFont, true);
            long fallbackFontEncoded = stack.getPointerAddress();
            return nnvgAddFallbackFont(ctx, baseFontEncoded, fallbackFontEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgResetFallbackFontsId ] ---

    /** Unsafe version of: {@link #nvgResetFallbackFontsId ResetFallbackFontsId} */
    public static native void nnvgResetFallbackFontsId(long ctx, int baseFont);

    /**
     * Resets fallback fonts by handle.
     *
     * @param ctx the NanoVG context
     */
    public static void nvgResetFallbackFontsId(@NativeType("NVGcontext *") long ctx, int baseFont) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgResetFallbackFontsId(ctx, baseFont);
    }

    // --- [ nvgResetFallbackFonts ] ---

    /** Unsafe version of: {@link #nvgResetFallbackFonts ResetFallbackFonts} */
    public static native void nnvgResetFallbackFonts(long ctx, long baseFont);

    /**
     * Resets fallback fonts by name.
     *
     * @param ctx the NanoVG context
     */
    public static void nvgResetFallbackFonts(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer baseFont) {
        if (CHECKS) {
            check(ctx);
            checkNT1(baseFont);
        }
        nnvgResetFallbackFonts(ctx, memAddress(baseFont));
    }

    /**
     * Resets fallback fonts by name.
     *
     * @param ctx the NanoVG context
     */
    public static void nvgResetFallbackFonts(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence baseFont) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(baseFont, true);
            long baseFontEncoded = stack.getPointerAddress();
            nnvgResetFallbackFonts(ctx, baseFontEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgFontSize ] ---

    /** Unsafe version of: {@link #nvgFontSize FontSize} */
    public static native void nnvgFontSize(long ctx, float size);

    /**
     * Sets the font size of current text style.
     *
     * @param ctx  the NanoVG context
     * @param size the font size to set
     */
    public static void nvgFontSize(@NativeType("NVGcontext *") long ctx, float size) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgFontSize(ctx, size);
    }

    // --- [ nvgFontBlur ] ---

    /** Unsafe version of: {@link #nvgFontBlur FontBlur} */
    public static native void nnvgFontBlur(long ctx, float blur);

    /**
     * Sets the blur of current text style.
     *
     * @param ctx  the NanoVG context
     * @param blur the blur amount to set
     */
    public static void nvgFontBlur(@NativeType("NVGcontext *") long ctx, float blur) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgFontBlur(ctx, blur);
    }

    // --- [ nvgTextLetterSpacing ] ---

    /** Unsafe version of: {@link #nvgTextLetterSpacing TextLetterSpacing} */
    public static native void nnvgTextLetterSpacing(long ctx, float spacing);

    /**
     * Sets the letter spacing of current text style.
     *
     * @param ctx     the NanoVG context
     * @param spacing the letter spacing amount to set
     */
    public static void nvgTextLetterSpacing(@NativeType("NVGcontext *") long ctx, float spacing) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgTextLetterSpacing(ctx, spacing);
    }

    // --- [ nvgTextLineHeight ] ---

    /** Unsafe version of: {@link #nvgTextLineHeight TextLineHeight} */
    public static native void nnvgTextLineHeight(long ctx, float lineHeight);

    /**
     * Sets the proportional line height of current text style. The line height is specified as multiple of font size.
     *
     * @param ctx        the NanoVG context
     * @param lineHeight the line height to set
     */
    public static void nvgTextLineHeight(@NativeType("NVGcontext *") long ctx, float lineHeight) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgTextLineHeight(ctx, lineHeight);
    }

    // --- [ nvgTextAlign ] ---

    /** Unsafe version of: {@link #nvgTextAlign TextAlign} */
    public static native void nnvgTextAlign(long ctx, int align);

    /**
     * Sets the text align of current text style.
     *
     * @param ctx   the NanoVG context
     * @param align the text align to set. One of:<br><table><tr><td>{@link #NVG_ALIGN_LEFT ALIGN_LEFT}</td><td>{@link #NVG_ALIGN_CENTER ALIGN_CENTER}</td><td>{@link #NVG_ALIGN_RIGHT ALIGN_RIGHT}</td><td>{@link #NVG_ALIGN_TOP ALIGN_TOP}</td><td>{@link #NVG_ALIGN_MIDDLE ALIGN_MIDDLE}</td><td>{@link #NVG_ALIGN_BOTTOM ALIGN_BOTTOM}</td><td>{@link #NVG_ALIGN_BASELINE ALIGN_BASELINE}</td></tr></table>
     */
    public static void nvgTextAlign(@NativeType("NVGcontext *") long ctx, int align) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgTextAlign(ctx, align);
    }

    // --- [ nvgFontFaceId ] ---

    /** Unsafe version of: {@link #nvgFontFaceId FontFaceId} */
    public static native void nnvgFontFaceId(long ctx, int font);

    /**
     * Sets the font face based on specified id of current text style.
     *
     * @param ctx  the NanoVG context
     * @param font the font id
     */
    public static void nvgFontFaceId(@NativeType("NVGcontext *") long ctx, int font) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgFontFaceId(ctx, font);
    }

    // --- [ nvgFontFace ] ---

    /** Unsafe version of: {@link #nvgFontFace FontFace} */
    public static native void nnvgFontFace(long ctx, long font);

    /**
     * Sets the font face based on specified name of current text style.
     *
     * @param ctx  the NanoVG context
     * @param font the font name
     */
    public static void nvgFontFace(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer font) {
        if (CHECKS) {
            check(ctx);
            checkNT1(font);
        }
        nnvgFontFace(ctx, memAddress(font));
    }

    /**
     * Sets the font face based on specified name of current text style.
     *
     * @param ctx  the NanoVG context
     * @param font the font name
     */
    public static void nvgFontFace(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence font) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(font, true);
            long fontEncoded = stack.getPointerAddress();
            nnvgFontFace(ctx, fontEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgText ] ---

    /**
     * Unsafe version of: {@link #nvgText Text}
     *
     * @param end a pointer to the end of the sub-string to draw, or {@code NULL}
     */
    public static native float nnvgText(long ctx, float x, float y, long string, long end);

    /**
     * Draws text string at specified location. If {@code end} is specified only the sub-string up to the {@code end} is drawn.
     *
     * @param ctx    the NanoVG context
     * @param x      the text X axis coordinate
     * @param y      the text Y axis coordinate
     * @param string the text string to draw
     */
    public static float nvgText(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") ByteBuffer string) {
        if (CHECKS) {
            check(ctx);
        }
        return nnvgText(ctx, x, y, memAddress(string), memAddress(string) + string.remaining());
    }

    /**
     * Draws text string at specified location. If {@code end} is specified only the sub-string up to the {@code end} is drawn.
     *
     * @param ctx    the NanoVG context
     * @param x      the text X axis coordinate
     * @param y      the text Y axis coordinate
     * @param string the text string to draw
     */
    public static float nvgText(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") CharSequence string) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            return nnvgText(ctx, x, y, stringEncoded, stringEncoded + stringEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgTextBox ] ---

    /**
     * Unsafe version of: {@link #nvgTextBox TextBox}
     *
     * @param end a pointer to the end of the sub-string to draw, or {@code NULL}
     */
    public static native void nnvgTextBox(long ctx, float x, float y, float breakRowWidth, long string, long end);

    /**
     * Draws multi-line text string at specified location wrapped at the specified width. If {@code end} is specified only the sub-string up to the
     * {@code end} is drawn.
     * 
     * <p>White space is stripped at the beginning of the rows, the text is split at word boundaries or when new-line characters are encountered. Words longer
     * than the max width are slit at nearest character (i.e. no hyphenation).</p>
     *
     * @param ctx           the NanoVG context
     * @param x             the text box X axis coordinate
     * @param y             the text box Y axis coordinate
     * @param breakRowWidth the maximum row width
     * @param string        the text string to draw
     */
    public static void nvgTextBox(@NativeType("NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType("char const *") ByteBuffer string) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgTextBox(ctx, x, y, breakRowWidth, memAddress(string), memAddress(string) + string.remaining());
    }

    /**
     * Draws multi-line text string at specified location wrapped at the specified width. If {@code end} is specified only the sub-string up to the
     * {@code end} is drawn.
     * 
     * <p>White space is stripped at the beginning of the rows, the text is split at word boundaries or when new-line characters are encountered. Words longer
     * than the max width are slit at nearest character (i.e. no hyphenation).</p>
     *
     * @param ctx           the NanoVG context
     * @param x             the text box X axis coordinate
     * @param y             the text box Y axis coordinate
     * @param breakRowWidth the maximum row width
     * @param string        the text string to draw
     */
    public static void nvgTextBox(@NativeType("NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType("char const *") CharSequence string) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            nnvgTextBox(ctx, x, y, breakRowWidth, stringEncoded, stringEncoded + stringEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgTextBounds ] ---

    /**
     * Unsafe version of: {@link #nvgTextBounds TextBounds}
     *
     * @param end a pointer to the end of the sub-string to measure, or {@code NULL}
     */
    public static native float nnvgTextBounds(long ctx, float x, float y, long string, long end, long bounds);

    /**
     * Measures the specified text string.
     * 
     * <p>Parameter {@code bounds} should be a pointer to {@code float[4]}, if the bounding box of the text should be returned. The bounds value are
     * {@code [xmin,ymin, xmax,ymax]}.</p>
     * 
     * <p>Measured values are returned in local coordinate space.</p>
     *
     * @param ctx    the NanoVG context
     * @param x      the text X axis coordinate
     * @param y      the text Y axis coordinate
     * @param string the text string to measure
     * @param bounds returns the bounding box of the text
     *
     * @return the horizontal advance of the measured text (i.e. where the next character should drawn)
     */
    public static float nvgTextBounds(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") ByteBuffer string, @Nullable @NativeType("float *") FloatBuffer bounds) {
        if (CHECKS) {
            check(ctx);
            checkSafe(bounds, 4);
        }
        return nnvgTextBounds(ctx, x, y, memAddress(string), memAddress(string) + string.remaining(), memAddressSafe(bounds));
    }

    /**
     * Measures the specified text string.
     * 
     * <p>Parameter {@code bounds} should be a pointer to {@code float[4]}, if the bounding box of the text should be returned. The bounds value are
     * {@code [xmin,ymin, xmax,ymax]}.</p>
     * 
     * <p>Measured values are returned in local coordinate space.</p>
     *
     * @param ctx    the NanoVG context
     * @param x      the text X axis coordinate
     * @param y      the text Y axis coordinate
     * @param string the text string to measure
     * @param bounds returns the bounding box of the text
     *
     * @return the horizontal advance of the measured text (i.e. where the next character should drawn)
     */
    public static float nvgTextBounds(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") CharSequence string, @Nullable @NativeType("float *") FloatBuffer bounds) {
        if (CHECKS) {
            check(ctx);
            checkSafe(bounds, 4);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            return nnvgTextBounds(ctx, x, y, stringEncoded, stringEncoded + stringEncodedLength, memAddressSafe(bounds));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgTextBoxBounds ] ---

    /**
     * Unsafe version of: {@link #nvgTextBoxBounds TextBoxBounds}
     *
     * @param end a pointer to the end of the sub-string to measure, or {@code NULL}
     */
    public static native void nnvgTextBoxBounds(long ctx, float x, float y, float breakRowWidth, long string, long end, long bounds);

    /**
     * Measures the specified multi-text string.
     * 
     * <p>Parameter {@code bounds} should be a pointer to {@code float[4]}, if the bounding box of the text should be returned. The bounds value are
     * {@code [xmin,ymin, xmax,ymax]}.</p>
     * 
     * <p>Measured values are returned in local coordinate space.</p>
     *
     * @param ctx           the NanoVG context
     * @param x             the text box X axis coordinate
     * @param y             the text box Y axis coordinate
     * @param breakRowWidth the maximum row width
     * @param string        the text string to measure
     * @param bounds        returns the bounding box of the text box
     */
    public static void nvgTextBoxBounds(@NativeType("NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType("char const *") ByteBuffer string, @Nullable @NativeType("float *") FloatBuffer bounds) {
        if (CHECKS) {
            check(ctx);
            checkSafe(bounds, 4);
        }
        nnvgTextBoxBounds(ctx, x, y, breakRowWidth, memAddress(string), memAddress(string) + string.remaining(), memAddressSafe(bounds));
    }

    /**
     * Measures the specified multi-text string.
     * 
     * <p>Parameter {@code bounds} should be a pointer to {@code float[4]}, if the bounding box of the text should be returned. The bounds value are
     * {@code [xmin,ymin, xmax,ymax]}.</p>
     * 
     * <p>Measured values are returned in local coordinate space.</p>
     *
     * @param ctx           the NanoVG context
     * @param x             the text box X axis coordinate
     * @param y             the text box Y axis coordinate
     * @param breakRowWidth the maximum row width
     * @param string        the text string to measure
     * @param bounds        returns the bounding box of the text box
     */
    public static void nvgTextBoxBounds(@NativeType("NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType("char const *") CharSequence string, @Nullable @NativeType("float *") FloatBuffer bounds) {
        if (CHECKS) {
            check(ctx);
            checkSafe(bounds, 4);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            nnvgTextBoxBounds(ctx, x, y, breakRowWidth, stringEncoded, stringEncoded + stringEncodedLength, memAddressSafe(bounds));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgTextGlyphPositions ] ---

    /**
     * Unsafe version of: {@link #nvgTextGlyphPositions TextGlyphPositions}
     *
     * @param end          a pointer to the end of the sub-string to measure, or {@code NULL}
     * @param maxPositions the maximum number of glyph positions to return
     */
    public static native int nnvgTextGlyphPositions(long ctx, float x, float y, long string, long end, long positions, int maxPositions);

    /**
     * Calculates the glyph x positions of the specified text. If {@code end} is specified only the sub-string will be used.
     * 
     * <p>Measured values are returned in local coordinate space.</p>
     *
     * @param ctx       the NanoVG context
     * @param x         the text X axis coordinate
     * @param y         the text Y axis coordinate
     * @param string    the text string to measure
     * @param positions returns the glyph x positions
     */
    public static int nvgTextGlyphPositions(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") ByteBuffer string, @NativeType("NVGglyphPosition *") NVGGlyphPosition.Buffer positions) {
        if (CHECKS) {
            check(ctx);
        }
        return nnvgTextGlyphPositions(ctx, x, y, memAddress(string), memAddress(string) + string.remaining(), positions.address(), positions.remaining());
    }

    /**
     * Calculates the glyph x positions of the specified text. If {@code end} is specified only the sub-string will be used.
     * 
     * <p>Measured values are returned in local coordinate space.</p>
     *
     * @param ctx       the NanoVG context
     * @param x         the text X axis coordinate
     * @param y         the text Y axis coordinate
     * @param string    the text string to measure
     * @param positions returns the glyph x positions
     */
    public static int nvgTextGlyphPositions(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") CharSequence string, @NativeType("NVGglyphPosition *") NVGGlyphPosition.Buffer positions) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            return nnvgTextGlyphPositions(ctx, x, y, stringEncoded, stringEncoded + stringEncodedLength, positions.address(), positions.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgTextMetrics ] ---

    /** Unsafe version of: {@link #nvgTextMetrics TextMetrics} */
    public static native void nnvgTextMetrics(long ctx, long ascender, long descender, long lineh);

    /**
     * Returns the vertical metrics based on the current text style.
     * 
     * <p>Measured values are returned in local coordinate space.</p>
     *
     * @param ctx       the NanoVG context
     * @param ascender  the line ascend
     * @param descender the line descend
     * @param lineh     the line height
     */
    public static void nvgTextMetrics(@NativeType("NVGcontext *") long ctx, @Nullable @NativeType("float *") FloatBuffer ascender, @Nullable @NativeType("float *") FloatBuffer descender, @Nullable @NativeType("float *") FloatBuffer lineh) {
        if (CHECKS) {
            check(ctx);
            checkSafe(ascender, 1);
            checkSafe(descender, 1);
            checkSafe(lineh, 1);
        }
        nnvgTextMetrics(ctx, memAddressSafe(ascender), memAddressSafe(descender), memAddressSafe(lineh));
    }

    // --- [ nvgTextBreakLines ] ---

    /**
     * Unsafe version of: {@link #nvgTextBreakLines TextBreakLines}
     *
     * @param end     a pointer to the end of the sub-string to measure, or {@code NULL}
     * @param maxRows the maximum number of text rows to return
     */
    public static native int nnvgTextBreakLines(long ctx, long string, long end, float breakRowWidth, long rows, int maxRows);

    /**
     * Breaks the specified text into lines. If {@code end} is specified only the sub-string will be used.
     * 
     * <p>White space is stripped at the beginning of the rows, the text is split at word boundaries or when new-line characters are encountered. Words longer
     * than the max width are slit at nearest character (i.e. no hyphenation).</p>
     *
     * @param ctx           the NanoVG context
     * @param string        the text string to measure
     * @param breakRowWidth the maximum row width
     * @param rows          returns the text rows
     */
    public static int nvgTextBreakLines(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer string, float breakRowWidth, @NativeType("NVGtextRow *") NVGTextRow.Buffer rows) {
        if (CHECKS) {
            check(ctx);
        }
        return nnvgTextBreakLines(ctx, memAddress(string), memAddress(string) + string.remaining(), breakRowWidth, rows.address(), rows.remaining());
    }

    /**
     * Breaks the specified text into lines. If {@code end} is specified only the sub-string will be used.
     * 
     * <p>White space is stripped at the beginning of the rows, the text is split at word boundaries or when new-line characters are encountered. Words longer
     * than the max width are slit at nearest character (i.e. no hyphenation).</p>
     *
     * @param ctx           the NanoVG context
     * @param string        the text string to measure
     * @param breakRowWidth the maximum row width
     * @param rows          returns the text rows
     */
    public static int nvgTextBreakLines(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence string, float breakRowWidth, @NativeType("NVGtextRow *") NVGTextRow.Buffer rows) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            return nnvgTextBreakLines(ctx, stringEncoded, stringEncoded + stringEncodedLength, breakRowWidth, rows.address(), rows.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgCreateInternal ] ---

    @NativeType("void *")
    private static native long nvgCreateInternal();

    static final long nvgCreateInternal = nvgCreateInternal();

    // --- [ nvgInternalParams ] ---

    @NativeType("void *")
    private static native long nvgInternalParams();

    static final long nvgInternalParams = nvgInternalParams();

    // --- [ nvgDeleteInternal ] ---

    @NativeType("void *")
    private static native long nvgDeleteInternal();

    static final long nvgDeleteInternal = nvgDeleteInternal();

    /** Array version of: {@link #nnvgCurrentTransform} */
    public static native void nnvgCurrentTransform(long ctx, float[] xform);

    /** Array version of: {@link #nvgCurrentTransform CurrentTransform} */
    public static void nvgCurrentTransform(@NativeType("NVGcontext *") long ctx, @NativeType("float *") float[] xform) {
        if (CHECKS) {
            check(ctx);
            check(xform, 6);
        }
        nnvgCurrentTransform(ctx, xform);
    }

    /** Array version of: {@link #nnvgTransformIdentity} */
    public static native void nnvgTransformIdentity(float[] dst);

    /** Array version of: {@link #nvgTransformIdentity TransformIdentity} */
    public static void nvgTransformIdentity(@NativeType("float *") float[] dst) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformIdentity(dst);
    }

    /** Array version of: {@link #nnvgTransformTranslate} */
    public static native void nnvgTransformTranslate(float[] dst, float tx, float ty);

    /** Array version of: {@link #nvgTransformTranslate TransformTranslate} */
    public static void nvgTransformTranslate(@NativeType("float *") float[] dst, float tx, float ty) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformTranslate(dst, tx, ty);
    }

    /** Array version of: {@link #nnvgTransformScale} */
    public static native void nnvgTransformScale(float[] dst, float sx, float sy);

    /** Array version of: {@link #nvgTransformScale TransformScale} */
    public static void nvgTransformScale(@NativeType("float *") float[] dst, float sx, float sy) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformScale(dst, sx, sy);
    }

    /** Array version of: {@link #nnvgTransformRotate} */
    public static native void nnvgTransformRotate(float[] dst, float a);

    /** Array version of: {@link #nvgTransformRotate TransformRotate} */
    public static void nvgTransformRotate(@NativeType("float *") float[] dst, float a) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformRotate(dst, a);
    }

    /** Array version of: {@link #nnvgTransformSkewX} */
    public static native void nnvgTransformSkewX(float[] dst, float a);

    /** Array version of: {@link #nvgTransformSkewX TransformSkewX} */
    public static void nvgTransformSkewX(@NativeType("float *") float[] dst, float a) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformSkewX(dst, a);
    }

    /** Array version of: {@link #nnvgTransformSkewY} */
    public static native void nnvgTransformSkewY(float[] dst, float a);

    /** Array version of: {@link #nvgTransformSkewY TransformSkewY} */
    public static void nvgTransformSkewY(@NativeType("float *") float[] dst, float a) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformSkewY(dst, a);
    }

    /** Array version of: {@link #nnvgTransformMultiply} */
    public static native void nnvgTransformMultiply(float[] dst, float[] src);

    /** Array version of: {@link #nvgTransformMultiply TransformMultiply} */
    public static void nvgTransformMultiply(@NativeType("float *") float[] dst, @NativeType("float const *") float[] src) {
        if (CHECKS) {
            check(dst, 6);
            check(src, 6);
        }
        nnvgTransformMultiply(dst, src);
    }

    /** Array version of: {@link #nnvgTransformPremultiply} */
    public static native void nnvgTransformPremultiply(float[] dst, float[] src);

    /** Array version of: {@link #nvgTransformPremultiply TransformPremultiply} */
    public static void nvgTransformPremultiply(@NativeType("float *") float[] dst, @NativeType("float const *") float[] src) {
        if (CHECKS) {
            check(dst, 6);
            check(src, 6);
        }
        nnvgTransformPremultiply(dst, src);
    }

    /** Array version of: {@link #nnvgTransformInverse} */
    public static native int nnvgTransformInverse(float[] dst, float[] src);

    /** Array version of: {@link #nvgTransformInverse TransformInverse} */
    @NativeType("int")
    public static boolean nvgTransformInverse(@NativeType("float *") float[] dst, @NativeType("float const *") float[] src) {
        if (CHECKS) {
            check(dst, 6);
            check(src, 6);
        }
        return nnvgTransformInverse(dst, src) != 0;
    }

    /** Array version of: {@link #nnvgTransformPoint} */
    public static native void nnvgTransformPoint(float[] dstx, float[] dsty, float[] xform, float srcx, float srcy);

    /** Array version of: {@link #nvgTransformPoint TransformPoint} */
    public static void nvgTransformPoint(@NativeType("float *") float[] dstx, @NativeType("float *") float[] dsty, @NativeType("float const *") float[] xform, float srcx, float srcy) {
        if (CHECKS) {
            check(dstx, 1);
            check(dsty, 1);
            check(xform, 6);
        }
        nnvgTransformPoint(dstx, dsty, xform, srcx, srcy);
    }

    /** Array version of: {@link #nnvgImageSize} */
    public static native void nnvgImageSize(long ctx, int image, int[] w, int[] h);

    /** Array version of: {@link #nvgImageSize ImageSize} */
    public static void nvgImageSize(@NativeType("NVGcontext *") long ctx, int image, @NativeType("int *") int[] w, @NativeType("int *") int[] h) {
        if (CHECKS) {
            check(ctx);
            check(w, 1);
            check(h, 1);
        }
        nnvgImageSize(ctx, image, w, h);
    }

    /** Array version of: {@link #nnvgTextBounds} */
    public static native float nnvgTextBounds(long ctx, float x, float y, long string, long end, float[] bounds);

    /** Array version of: {@link #nvgTextBounds TextBounds} */
    public static float nvgTextBounds(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") ByteBuffer string, @Nullable @NativeType("float *") float[] bounds) {
        if (CHECKS) {
            check(ctx);
            checkSafe(bounds, 4);
        }
        return nnvgTextBounds(ctx, x, y, memAddress(string), memAddress(string) + string.remaining(), bounds);
    }

    /** Array version of: {@link #nvgTextBounds TextBounds} */
    public static float nvgTextBounds(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") CharSequence string, @Nullable @NativeType("float *") float[] bounds) {
        if (CHECKS) {
            check(ctx);
            checkSafe(bounds, 4);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            return nnvgTextBounds(ctx, x, y, stringEncoded, stringEncoded + stringEncodedLength, bounds);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnvgTextBoxBounds} */
    public static native void nnvgTextBoxBounds(long ctx, float x, float y, float breakRowWidth, long string, long end, float[] bounds);

    /** Array version of: {@link #nvgTextBoxBounds TextBoxBounds} */
    public static void nvgTextBoxBounds(@NativeType("NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType("char const *") ByteBuffer string, @Nullable @NativeType("float *") float[] bounds) {
        if (CHECKS) {
            check(ctx);
            checkSafe(bounds, 4);
        }
        nnvgTextBoxBounds(ctx, x, y, breakRowWidth, memAddress(string), memAddress(string) + string.remaining(), bounds);
    }

    /** Array version of: {@link #nvgTextBoxBounds TextBoxBounds} */
    public static void nvgTextBoxBounds(@NativeType("NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType("char const *") CharSequence string, @Nullable @NativeType("float *") float[] bounds) {
        if (CHECKS) {
            check(ctx);
            checkSafe(bounds, 4);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            nnvgTextBoxBounds(ctx, x, y, breakRowWidth, stringEncoded, stringEncoded + stringEncodedLength, bounds);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnvgTextMetrics} */
    public static native void nnvgTextMetrics(long ctx, float[] ascender, float[] descender, float[] lineh);

    /** Array version of: {@link #nvgTextMetrics TextMetrics} */
    public static void nvgTextMetrics(@NativeType("NVGcontext *") long ctx, @Nullable @NativeType("float *") float[] ascender, @Nullable @NativeType("float *") float[] descender, @Nullable @NativeType("float *") float[] lineh) {
        if (CHECKS) {
            check(ctx);
            checkSafe(ascender, 1);
            checkSafe(descender, 1);
            checkSafe(lineh, 1);
        }
        nnvgTextMetrics(ctx, ascender, descender, lineh);
    }

}