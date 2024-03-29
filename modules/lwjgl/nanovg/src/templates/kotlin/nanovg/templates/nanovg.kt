/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg.templates

import org.lwjgl.generator.*
import nanovg.*

val nanovg = "NanoVG".nativeClass(Module.NANOVG, prefix = "NVG") {
    includeNanoVGAPI("""#define STBI_MALLOC(sz)    org_lwjgl_malloc(sz)
#define STBI_REALLOC(p,sz) org_lwjgl_realloc(p,sz)
#define STBI_FREE(p)       org_lwjgl_free(p)
#define STBI_FAILURE_USERMSG
#define STBI_ASSERT(x)
#define STB_IMAGE_IMPLEMENTATION
#define STB_IMAGE_STATIC
#define STBTT_malloc(x,u)  ((void)(u),org_lwjgl_malloc(x))
#define STBTT_free(x,u)    ((void)(u),org_lwjgl_free(x))
#define STBTT_assert
#define STB_TRUETYPE_IMPLEMENTATION
#define STBTT_STATIC
#include "nanovg.c"""")

    documentation =
        """
        NanoVG is a small antialiased vector graphics rendering library for OpenGL. It has lean API modeled after HTML5 canvas API. It is aimed to be a
        practical and fun toolset for building scalable user interfaces and visualizations.

        <h3>Color utils</h3>

        Colors in NanoVG are stored as unsigned ints in ABGR format.

        <h3>State Handling</h3>

        NanoVG contains state which represents how paths will be rendered. The state contains transform, fill and stroke styles, text and font styles, and
        scissor clipping.

        <h3>Render styles</h3>

        Fill and stroke render style can be either a solid color or a paint which is a gradient or a pattern. Solid color is simply defined as a color value,
        different kinds of paints can be created using #LinearGradient(), #BoxGradient(), #RadialGradient() and #ImagePattern().

        Current render style can be saved and restored using #Save() and #Restore().

        <h3>Transforms</h3>

        The paths, gradients, patterns and scissor region are transformed by an transformation matrix at the time when they are passed to the API. The current
        transformation matrix is a affine matrix:
        ${codeBlock("""
[sx kx tx]
[ky sy ty]
[ 0  0  1]""")}

        Where: {@code sx,sy} define scaling, {@code kx,ky} skewing, and {@code tx,ty} translation. The last row is assumed to be {@code 0,0,1} and is not
        stored.

        Apart from #ResetTransform(), each transformation function first creates specific transformation matrix and pre-multiplies the current transformation
        by it.

        Current coordinate system (transformation) can be saved and restored using #Save() and #Restore().

        <h3>Images</h3>

        NanoVG allows you to load jpg, png, psd, tga, pic and gif files to be used for rendering. In addition you can upload your own image. The image loading
        is provided by {@code stb_image}.

        <h3>Paints</h3>

        NanoVG supports four types of paints: linear gradient, box gradient, radial gradient and image pattern. These can be used as paints for strokes and
        fills.

        <h3>Scissoring</h3>

        Scissoring allows you to clip the rendering into a rectangle. This is useful for various user interface cases like rendering a text edit or a timeline.

        <h3>Paths</h3>

        Drawing a new shape starts with #BeginPath(), it clears all the currently defined paths. Then you define one or more paths and sub-paths which describe
        the shape. The are functions to draw common shapes like rectangles and circles, and lower level step-by-step functions, which allow to define a path
        curve by curve.

        NanoVG uses even-odd fill rule to draw the shapes. Solid shapes should have counter clockwise winding and holes should have counter clockwise order. To
        specify winding of a path you can call #PathWinding(). This is useful especially for the common shapes, which are drawn #CCW.

        Finally you can fill the path using current fill style by calling #Fill(), and stroke it with current stroke style by calling #Stroke().

        The curve segments and sub-paths are transformed by the current transform.

        <h3>Text</h3>

        NanoVG allows you to load .ttf files and use the font to render text.

        The appearance of the text can be defined by setting the current text style and by specifying the fill color. Common text and font settings such as
        font size, letter spacing and text align are supported. Font blur allows you to create simple text effects such as drop shadows.

        At render time the font face can be set based on the font handles or name.

        Font measure functions return values in local space, the calculations are carried in the same resolution as the final rendering. This is done because
        the text glyph positions are snapped to the nearest pixels sharp rendering.

        The local space means that values are not rotated or scale as per the current transformation. For example if you set font size to 12, which would mean
        that line height is 16, then regardless of the current scaling and rotation, the returned line height is always 16. Some measures may vary because of
        the scaling since aforementioned pixel snapping.

        While this may sound a little odd, the setup allows you to always render the same way regardless of scaling. I.e. following works regardless of scaling:
        ${codeBlock("""
const char* txt = "Text me up.";
nvgTextBounds(vg, x,y, txt, NULL, bounds);
nvgBeginPath(vg);
nvgRect(vg, bounds[0],bounds[1], bounds[2]-bounds[0], bounds[3]-bounds[1]);
nvgFill(vg);""")}

        Note: currently only solid color fill is supported for text.
        """
    FloatConstant(
        "PI",

        "PI"..3.14159265358979323846264338327f
    )

    EnumConstant(
        "Winding order.",

        "CCW".enum("Winding for solid shapes", 1),
        "CW".enum("Winding for holes", 2)
    )

    EnumConstant(
        "Solidity.",

        "SOLID".enum("CCW", 1),
        "HOLE".enum("CW", 2)
    )

    EnumConstant(
        "Line caps and joins.",

        "BUTT".enum,
        "ROUND".enum,
        "SQUARE".enum,
        "BEVEL".enum,
        "MITER".enum
    )

    val TexAlign = EnumConstant(
        "Alignments.",

        "ALIGN_LEFT".enum("Default, align text horizontally to left.", "1<<0"),
        "ALIGN_CENTER".enum("Align text horizontally to center.", "1<<1"),
        "ALIGN_RIGHT".enum("Align text horizontally to right.", "1<<2"),

        "ALIGN_TOP".enum("Align text vertically to top.", "1<<3"),
        "ALIGN_MIDDLE".enum("Align text vertically to middle.", "1<<4"),
        "ALIGN_BOTTOM".enum("Align text vertically to bottom.", "1<<5"),
        "ALIGN_BASELINE".enum("Default, align text vertically to baseline.", "1<<6")
    ).javaDocLinks

    val BlendFactor = EnumConstant(
        "Blend factors.",

        "ZERO".enum("", "1<<0"),
        "ONE".enum("", "1<<1"),
        "SRC_COLOR".enum("", "1<<2"),
        "ONE_MINUS_SRC_COLOR".enum("", "1<<3"),
        "DST_COLOR".enum("", "1<<4"),
        "ONE_MINUS_DST_COLOR".enum("", "1<<5"),
        "SRC_ALPHA".enum("", "1<<6"),
        "ONE_MINUS_SRC_ALPHA".enum("", "1<<7"),
        "DST_ALPHA".enum("", "1<<8"),
        "ONE_MINUS_DST_ALPHA".enum("", "1<<9"),
        "SRC_ALPHA_SATURATE".enum("", "1<<10")
    ).javaDocLinks

    val CompositeOperation = EnumConstant(
        "Composite operations.",

        "SOURCE_OVER".enum,
        "SOURCE_IN".enum,
        "SOURCE_OUT".enum,
        "ATOP".enum,
        "DESTINATION_OVER".enum,
        "DESTINATION_IN".enum,
        "DESTINATION_OUT".enum,
        "DESTINATION_ATOP".enum,
        "LIGHTER".enum,
        "COPY".enum,
        "XOR".enum
    ).javaDocLinks

    val ImageFlags = EnumConstant(
        "Image flags.",

        "IMAGE_GENERATE_MIPMAPS".enum("Generate mipmaps during creation of the image.", "1<<0"),
        "IMAGE_REPEATX".enum("Repeat image in X direction.", "1<<1"),
        "IMAGE_REPEATY".enum("Repeat image in Y direction.", "1<<2"),
        "IMAGE_FLIPY".enum("Flips (inverses) image in Y direction when rendered.", "1<<3"),
        "IMAGE_PREMULTIPLIED".enum("Image data has premultiplied alpha.", "1<<4"),
        "IMAGE_NEAREST".enum("Image interpolation is Nearest instead Linear.", "1<<5")
    ).javaDocLinks

    val ctx = NVGcontext.p("ctx", "the NanoVG context")

    void(
        "BeginFrame",
        """
        Begins drawing a new frame.

        Calls to nanovg drawing API should be wrapped in #BeginFrame() &amp; #EndFrame(). #BeginFrame() defines the size of the window to render to in relation
        currently set viewport (i.e. {@code glViewport} on GL backends). Device pixel ration allows to control the rendering on Hi-DPI devices. For example,
        GLFW returns two dimension for an opened window: window size and frame buffer size. In that case you would set {@code windowWidth/Height} to the window
        size {@code devicePixelRatio} to: {@code frameBufferWidth / windowWidth}.
        """,

        ctx,
        float("windowWidth", "the window width"),
        float("windowHeight", "the window height"),
        float("devicePixelRatio", "the device pixel ratio")
    )

    void(
        "CancelFrame",
        "Cancels drawing the current frame.",

        ctx
    )

    void(
        "EndFrame",
        "Ends drawing flushing remaining render state.",

        ctx
    )

    // Composite operation

    void(
        "GlobalCompositeOperation",
        "Sets the composite operation.",

        ctx,
        int("op", "the composite operation", CompositeOperation)
    )

    void(
        "GlobalCompositeBlendFunc",
        "Sets the composite operation with custom pixel arithmetic.",

        ctx,
        int("sfactor", "the source blend factor", BlendFactor),
        int("dfactor", "the destination blend factor", BlendFactor)
    )

    void(
        "GlobalCompositeBlendFuncSeparate",
        "Sets the composite operation with custom pixel arithmetic for RGB and alpha components separately.",

        ctx,
        int("srcRGB", "the source RGB blend factor", BlendFactor),
        int("dstRGB", "the destination RGB blend factor", BlendFactor),
        int("srcAlpha", "the source alpha blend factor", BlendFactor),
        int("dstAlpha", "the destination alpha blend factor", BlendFactor)
    )

    // Color utils

    NVGcolor(
        "RGB",
        "Returns a color value from red, green, blue values. Alpha will be set to 255 (1.0f).",

        unsigned_char("r", "the red value"),
        unsigned_char("g", "the green value"),
        unsigned_char("b", "the blue value")
    )

    NVGcolor(
        "RGBf",
        "Returns a color value from red, green, blue values. Alpha will be set to 1.0f.",

        float("r", "the red value"),
        float("g", "the green value"),
        float("b", "the blue value")
    )

    NVGcolor(
        "RGBA",
        "Returns a color value from red, green, blue and alpha values.",

        unsigned_char("r", "the red value"),
        unsigned_char("g", "the green value"),
        unsigned_char("b", "the blue value"),
        unsigned_char("a", "the alpha value")
    )

    NVGcolor(
        "RGBAf",
        "Returns a color value from red, green, blue and alpha values.",

        float("r", "the red value"),
        float("g", "the green value"),
        float("b", "the blue value"),
        float("a", "the alpha value")
    )

    NVGcolor(
        "LerpRGBA",
        "Linearly interpolates from color {@code c0} to {@code c1}, and returns resulting color value.",

        NVGcolor("c0", "the first color"),
        NVGcolor("c1", "the second color"),
        float("u", "the interpolation factor")
    )

    NVGcolor(
        "TransRGBA",
        "Sets transparency of a color value.",

        NVGcolor("c0", "the color"),
        unsigned_char("a", "the alpha value")
    )

    NVGcolor(
        "TransRGBAf",
        "Sets transparency of a color value.",

        NVGcolor("c0", "the color"),
        float("a", "the alpha value")
    )

    NVGcolor(
        "HSL",
        """
        Returns color value specified by hue, saturation and lightness.

        HSL values are all in range {@code [0..1]}, alpha will be set to 255.
        """,

        float("h", "the hue value"),
        float("s", "the saturation value"),
        float("l", "the lightness value")
    )

    NVGcolor(
        "HSLA",
        """
        Returns color value specified by hue, saturation and lightness and alpha.

        HSL values are all in range {@code [0..1]}, alpha in range {@code [0..255]}
        """,

        float("h", "the hue value"),
        float("s", "the saturation value"),
        float("l", "the lightness value"),
        unsigned_char("a", "the alpha value")
    )

    // State Handling

    void(
        "Save",
        "Pushes and saves the current render state into a state stack. A matching #Restore() must be used to restore the state.",

        ctx
    )

    void(
        "Restore",
        "Pops and restores current render state.",

        ctx
    )

    void(
        "Reset",
        "Resets current render state to default values. Does not affect the render state stack.",

        ctx
    )

    // Render styles

    void(
        "ShapeAntiAlias",
        "Sets whether to draw antialias for #Stroke() and #Fill(). It's enabled by default.",

        ctx,
        intb("enabled", "the flag to set")
    )

    void(
        "StrokeColor",
        "Sets current stroke style to a solid color.",

        ctx,
        NVGcolor("color", "the color to set")
    )

    void(
        "StrokePaint",
        "Sets current stroke style to a paint, which can be a one of the gradients or a pattern.",

        ctx,
        NVGpaint("paint", "the paint to set")
    )

    void(
        "FillColor",
        "Sets current fill style to a solid color.",

        ctx,
        NVGcolor("color", "the color to set")
    )

    void(
        "FillPaint",
        "Sets current fill style to a paint, which can be a one of the gradients or a pattern.",

        ctx,
        NVGpaint("paint", "the paint to set")
    )

    void(
        "MiterLimit",
        "Sets the miter limit of the stroke style. Miter limit controls when a sharp corner is beveled.",

        ctx,
        float("limit", "the miter limit to set")
    )

    void(
        "StrokeWidth",
        "Sets the stroke width of the stroke style.",

        ctx,
        float("size", "the stroke width to set")
    )

    void(
        "LineCap",
        """
        Sets how the end of the line (cap) is drawn.

        The default line cap is #BUTT.
        """,

        ctx,
        int("cap", "the line cap to set", "#BUTT #ROUND #SQUARE")
    )

    void(
        "LineJoin",
        """
        Sets how sharp path corners are drawn.

        The default line join is #MITER.
        """,

        ctx,
        int("join", "the line join to set", "#MITER #ROUND #BEVEL")
    )

    void(
        "GlobalAlpha",
        """
        Sets the transparency applied to all rendered shapes.

        Already transparent paths will get proportionally more transparent as well.
        """,

        ctx,
        float("alpha", "the alpha value to set")
    )

    // Transforms

    void(
        "ResetTransform",
        "Resets current transform to an identity matrix.",

        ctx
    )

    void(
        "Transform",
        """
        Premultiplies current coordinate system by specified matrix. The parameters are interpreted as matrix as follows:
        ${codeBlock("""
[a c e]
[b d f]
[0 0 1]""")}
        """,

        ctx,
        float("a", "the a value"),
        float("b", "the b value"),
        float("c", "the c value"),
        float("d", "the d value"),
        float("e", "the e value"),
        float("f", "the f value")
    )

    void(
        "Translate",
        "Translates current coordinate system.",

        ctx,
        float("x", "the X axis translation amount"),
        float("y", "the Y axis translation amount")
    )

    void(
        "Rotate",
        "Rotates current coordinate system.",

        ctx,
        float("angle", "the rotation angle, in radians")
    )

    void(
        "SkewX",
        "Skews the current coordinate system along X axis.",

        ctx,
        float("angle", "the skew angle, in radians")
    )

    void(
        "SkewY",
        "Skews the current coordinate system along Y axis.",

        ctx,
        float("angle", "the skew angle, in radians")
    )

    void(
        "Scale",
        "Scales the current coordinate system.",

        ctx,
        float("x", "the X axis scale factor"),
        float("y", "the Y axis scale factor")
    )

    void(
        "CurrentTransform",
        """
        Stores the top part (a-f) of the current transformation matrix in to the specified buffer.
        ${codeBlock("""
[a c e]
[b d f]
[0 0 1]""")}

        There should be space for 6 floats in the return buffer for the values {@code a-f}.
        """,

        ctx,
        Check(6)..float.p("xform", "the destination buffer")
    )

    val TransformIdentity = void(
        "TransformIdentity",
        "Sets the transform to identity matrix.",

        Check(6)..float.p("dst", "the destination buffer")
    )

    void(
        "TransformTranslate",
        "Sets the transform to translation matrix matrix.",

        TransformIdentity["dst"],
        float("tx", "the X axis translation amount"),
        float("ty", "the Y axis translation amount")
    )

    void(
        "TransformScale",
        "Sets the transform to scale matrix.",

        TransformIdentity["dst"],
        float("sx", "the X axis scale factor"),
        float("sy", "the Y axis scale factor")
    )

    void(
        "TransformRotate",
        "Sets the transform to rotate matrix.",

        TransformIdentity["dst"],
        float("a", "the rotation angle, in radians")
    )

    void(
        "TransformSkewX",
        "Sets the transform to skew-x matrix.",

        TransformIdentity["dst"],
        float("a", "the skew angle, in radians")
    )

    void(
        "TransformSkewY",
        "Sets the transform to skew-y matrix.",

        TransformIdentity["dst"],
        float("a", "the skew angle, in radians")
    )

    void(
        "TransformMultiply",
        "Sets the transform to the result of multiplication of two transforms, of {@code A = A*B}.",

        TransformIdentity["dst"],
        Check(6)..float.const.p("src", "the {@code B} transformation matrix")
    )

    void(
        "TransformPremultiply",
        "Sets the transform to the result of multiplication of two transforms, of {@code A = B*A}.",

        TransformIdentity["dst"],
        Check(6)..float.const.p("src", "the {@code B} transformation matrix")
    )

    intb(
        "TransformInverse",
        "Sets the destination to inverse of specified transform.",

        TransformIdentity["dst"],
        Check(6)..float.const.p("src", "the transformation matrix to inverse"),

        returnDoc = "1 if the inverse could be calculated, else 0"
    )

    void(
        "TransformPoint",
        "Transform a point by given transform.",

        Check(1)..float.p("dstx", "returns the transformed X axis coordinate"),
        Check(1)..float.p("dsty", "returns the transformed Y axis coordinate"),
        Check(6)..float.const.p("xform", "the transformation matrix"),
        float("srcx", "the point X axis coordinate"),
        float("srcy", "the point Y axis coordinate")
    )

    float(
        "DegToRad",
        "Converts degrees to radians.",

        float("deg", "the rotation value, in degrees")
    )

    float(
        "RadToDeg",
        "Converts radians to degrees.",

        float("rad", "the rotation value, in radians")
    )

    // Images

    val imageFlags = int("imageFlags", "the image flags", ImageFlags)

    int(
        "CreateImage",
        "Creates image by loading it from the disk from specified file name.",

        ctx,
        charASCII.const.p("filename", "the image file name"),
        imageFlags,

        returnDoc = "a handle to the image"
    )

    int(
        "CreateImageMem",
        "Creates image by loading it from the specified chunk of memory.",

        ctx,
        imageFlags,
        unsigned_char.p("data", "the image data"),
        AutoSize("data")..int("ndata", "the image data size, in bytes"),

        returnDoc = "a handle to the image"
    )

    int(
        "CreateImageRGBA",
        "Creates image from specified image data.",

        ctx,
        int("w", "the image width"),
        int("h", "the image height"),
        imageFlags,
        Check("w * h * 4")..unsigned_char.const.p("data", "the image data"),

        returnDoc = "a handle to the image"
    )

    void(
        "UpdateImage",
        "Updates image data specified by image handle.",

        ctx,
        int("image", "the image handle"),
        Unsafe..unsigned_char.const.p("data", "the image data")
    )

    void(
        "ImageSize",
        "Returns the dimensions of a created image.",

        ctx,
        int("image", "the image handle"),
        Check(1)..int.p("w", "returns the image width"),
        Check(1)..int.p("h", "returns the image height")
    )

    void(
        "DeleteImage",
        "Deletes created image.",

        ctx,
        int("image", "the image handle to delete")
    )

    // Paints

    NVGpaint(
        "LinearGradient",
        """
        Creates and returns a linear gradient.

        The gradient is transformed by the current transform when it is passed to #FillPaint() or #StrokePaint().
        """,

        ctx,
        float("sx", "the X axis start coordinate"),
        float("sy", "the Y axis start coordinate"),
        float("ex", "the X axis end coordinate"),
        float("ey", "the Y axis end coordinate"),
        NVGcolor("icol", "the start color"),
        NVGcolor("ocol", "the end color")
    )

    NVGpaint(
        "BoxGradient",
        """
        Creates and returns a box gradient. Box gradient is a feathered rounded rectangle, it is useful for rendering drop shadows or highlights for boxes.

        The gradient is transformed by the current transform when it is passed to #FillPaint() or #StrokePaint().
        """,

        ctx,
        float("x", "the rectangle left coordinate"),
        float("y", "the rectangle top coordinate"),
        float("w", "the rectangle width"),
        float("h", "the rectangle height"),
        float("r", "the corner radius"),
        float("f", "the feather value. Feather defines how blurry the border of the rectangle is."),
        NVGcolor("icol", "the inner color"),
        NVGcolor("ocol", "the outer color")
    )

    NVGpaint(
        "RadialGradient",
        """
        Creates and returns a radial gradient.

        The gradient is transformed by the current transform when it is passed to #FillPaint() or #StrokePaint().
        """,

        ctx,
        float("cx", "the X axis center coordinate"),
        float("cy", "the Y axis center coordinate"),
        float("inr", "the inner radius"),
        float("outr", "the outer radius"),
        NVGcolor("icol", "the start color"),
        NVGcolor("ocol", "the end color")
    )

    NVGpaint(
        "ImagePattern",
        """
        Creates and returns an image patter.

        The gradient is transformed by the current transform when it is passed to #FillPaint() or #StrokePaint().
        """,

        ctx,
        float("ox", "the image pattern left coordinate"),
        float("oy", "the image pattern top coordinate"),
        float("ex", "the image width"),
        float("ey", "the image height"),
        float("angle", "the rotation angle around the top-left corner"),
        int("image", "the image to render"),
        float("alpha", "the alpha value")
    )

    // Scissoring

    void(
        "Scissor",
        """
        Sets the current scissor rectangle.

        The scissor rectangle is transformed by the current transform.
        """,

        ctx,
        float("x", "the rectangle X axis coordinate"),
        float("y", "the rectangle Y axis coordinate"),
        float("w", "the rectangle width"),
        float("h", "the rectangle height")
    )

    void(
        "IntersectScissor",
        """
        Intersects current scissor rectangle with the specified rectangle.

        The scissor rectangle is transformed by the current transform.

        Note: in case the rotation of previous scissor rect differs from the current one, the intersection will be done between the specified rectangle and the
        previous scissor rectangle transformed in the current transform space. The resulting shape is always rectangle.
        """,

        ctx,
        float("x", "the rectangle X axis coordinate"),
        float("y", "the rectangle Y axis coordinate"),
        float("w", "the rectangle width"),
        float("h", "the rectangle height")
    )

    void(
        "ResetScissor",
        "Resets and disables scissoring.",

        ctx
    )

    // Paths

    void(
        "BeginPath",
        "Clears the current path and sub-paths.",

        ctx
    )

    void(
        "MoveTo",
        "Starts new sub-path with specified point as first point.",

        ctx,
        float("x", "the point X axis coordinate"),
        float("y", "the point Y axis coordinate")
    )

    void(
        "LineTo",
        "Adds line segment from the last point in the path to the specified point.",

        ctx,
        float("x", "the point X axis coordinate"),
        float("y", "the point Y axis coordinate")
    )

    void(
        "BezierTo",
        "Adds cubic bezier segment from last point in the path via two control points to the specified point.",

        ctx,
        float("c1x", "the first control point X axis coordinate"),
        float("c1y", "the first control point Y axis coordinate"),
        float("c2x", "the second control point X axis coordinate"),
        float("c2y", "the second control point Y axis coordinate"),
        float("x", "the point X axis coordinate"),
        float("y", "the point Y axis coordinate")
    )

    void(
        "QuadTo",
        "Adds quadratic bezier segment from last point in the path via a control point to the specified point.",

        ctx,
        float("cx", "the control point X axis coordinate"),
        float("cy", "the control point Y axis coordinate"),
        float("x", "the point X axis coordinate"),
        float("y", "the point Y axis coordinate")
    )

    void(
        "ArcTo",
        "Adds an arc segment at the corner defined by the last path point, and two specified points.",

        ctx,
        float("x1", "the first point X axis coordinate"),
        float("y1", "the first point Y axis coordinate"),
        float("x2", "the second point X axis coordinate"),
        float("y2", "the second point Y axis coordinate"),
        float("radius", "the arc radius, in radians")
    )

    void(
        "ClosePath",
        "Closes current sub-path with a line segment.",

        ctx
    )

    void(
        "PathWinding",
        "Sets the current sub-path winding.",

        ctx,
        int("dir", "the sub-path winding", "#CCW #CW")
    )

    void(
        "Arc",
        "Creates new circle arc shaped sub-path.",

        ctx,
        float("cx", "the arc center X axis coordinate"),
        float("cy", "the arc center Y axis coordinate"),
        float("r", "the arc radius"),
        float("a0", "the arc starting angle, in radians"),
        float("a1", "the arc ending angle, in radians"),
        int("dir", "the arc direction", "#CCW #CW")
    )

    void(
        "Rect",
        "Creates new rectangle shaped sub-path.",

        ctx,
        float("x", "the rectangle X axis coordinate"),
        float("y", "the rectangle Y axis coordinate"),
        float("w", "the rectangle width"),
        float("h", "the rectangle height")
    )

    void(
        "RoundedRect",
        "Creates new rounded rectangle shaped sub-path.",

        ctx,
        float("x", "the rectangle X axis coordinate"),
        float("y", "the rectangle Y axis coordinate"),
        float("w", "the rectangle width"),
        float("h", "the rectangle height"),
        float("r", "the corner radius")
    )

    void(
        "RoundedRectVarying",
        "Creates new rounded rectangle shaped sub-path with varying radii for each corner.",

        ctx,
        float("x", "the rectangle X axis coordinate"),
        float("y", "the rectangle Y axis coordinate"),
        float("w", "the rectangle width"),
        float("h", "the rectangle height"),
        float("radTopLeft", "the top-left corner radius"),
        float("radTopRight", "the top-right corner radius"),
        float("radBottomRight", "the bottom-right corner radius"),
        float("radBottomLeft", "the bottom-left corner radius")
    )

    void(
        "Ellipse",
        "Creates new ellipse shaped sub-path.",

        ctx,
        float("cx", "the ellipse center X axis coordinate"),
        float("cy", "the ellipse center Y axis coordinate"),
        float("rx", "the ellipse X axis radius"),
        float("ry", "the ellipse Y axis radius")
    )

    void(
        "Circle",
        "Creates new circle shaped sub-path.",

        ctx,
        float("cx", "the circle center X axis coordinate"),
        float("cy", "the circle center Y axis coordinate"),
        float("r", "the circle radius")
    )

    void(
        "Fill",
        "Fills the current path with current fill style.",

        ctx
    )

    void(
        "Stroke",
        "Fills the current path with current stroke style.",

        ctx
    )

    // Text

    int(
        "CreateFont",
        "Creates font by loading it from the disk from specified file name.",

        ctx,
        charASCII.const.p("name", "the font name"),
        charASCII.const.p("filename", "the font file name"),

        returnDoc = "a handle to the font"
    )

    int(
        "CreateFontAtIndex",
        "Creates font by loading it from the disk from specified file name.",

        ctx,
        charASCII.const.p("name", "the font name"),
        charASCII.const.p("filename", "the font file name"),
        int("fontIndex", "specifies which font face to load from a .ttf/.ttc file"),

        returnDoc = "a handle to the font"
    )

    int(
        "CreateFontMem",
        """
        Creates font by loading it from the specified memory chunk.

        The memory chunk must remain valid for as long as the font is used by NanoVG.
        """,

        ctx,
        charASCII.const.p("name", "the font name"),
        unsigned_char.p("data", "the font data"),
        AutoSize("data")..int("ndata", "the font data size, in bytes"),
        intb("freeData", "1 if the font data should be freed automatically, 0 otherwise"),

        returnDoc = "a handle to the font"
    )

    int(
        "CreateFontMemAtIndex",
        """
        Creates font by loading it from the specified memory chunk.

        The memory chunk must remain valid for as long as the font is used by NanoVG.
        """,

        ctx,
        charASCII.const.p("name", "the font name"),
        unsigned_char.p("data", "the font data"),
        AutoSize("data")..int("ndata", "the font data size, in bytes"),
        intb("freeData", "1 if the font data should be freed automatically, 0 otherwise"),
        int("fontIndex", "specifies which font face to load from a .ttf/.ttc file"),

        returnDoc = "a handle to the font"
    )

    int(
        "FindFont",
        "Finds a loaded font of specified name, and returns handle to it, or -1 if the font is not found.",

        ctx,
        charASCII.const.p("name", "the font name")
    )

    int(
        "AddFallbackFontId",
        "Adds fallback font by handle.",

        ctx,
        int("baseFont", ""),
        int("fallbackFont", "")
    )

    int(
        "AddFallbackFont",
        "Adds fallback font by name.",

        ctx,
        charASCII.const.p("baseFont", ""),
        charASCII.const.p("fallbackFont", "")
    )

    void(
        "ResetFallbackFontsId",
        "Resets fallback fonts by handle.",

        ctx,
        int("baseFont", "")
    )

    void(
        "ResetFallbackFonts",
        "Resets fallback fonts by name.",

        ctx,
        charASCII.const.p("baseFont", "")
    )

    void(
        "FontSize",
        "Sets the font size of current text style.",

        ctx,
        float("size", "the font size to set")
    )

    void(
        "FontBlur",
        "Sets the blur of current text style.",

        ctx,
        float("blur", "the blur amount to set")
    )

    void(
        "TextLetterSpacing",
        "Sets the letter spacing of current text style.",

        ctx,
        float("spacing", "the letter spacing amount to set")
    )

    void(
        "TextLineHeight",
        "Sets the proportional line height of current text style. The line height is specified as multiple of font size.",

        ctx,
        float("lineHeight", "the line height to set")
    )

    void(
        "TextAlign",
        "Sets the text align of current text style.",

        ctx,
        int("align", "the text align to set", TexAlign)
    )

    void(
        "FontFaceId",
        "Sets the font face based on specified id of current text style.",

        ctx,
        int("font", "the font id")
    )

    void(
        "FontFace",
        "Sets the font face based on specified name of current text style.",

        ctx,
        charASCII.const.p("font", "the font name")
    )

    float(
        "Text",
        "Draws text string at specified location. If {@code end} is specified only the sub-string up to the {@code end} is drawn.",

        ctx,
        float("x", "the text X axis coordinate"),
        float("y", "the text Y axis coordinate"),
        charUTF8.const.p("string", "the text string to draw"),
        AutoSize("string")..nullable..charptr.const.p("end", "a pointer to the end of the sub-string to draw, or #NULL")
    )

    void(
        "TextBox",
        """
        Draws multi-line text string at specified location wrapped at the specified width. If {@code end} is specified only the sub-string up to the
        {@code end} is drawn.

        White space is stripped at the beginning of the rows, the text is split at word boundaries or when new-line characters are encountered. Words longer
        than the max width are slit at nearest character (i.e. no hyphenation).
        """,

        ctx,
        float("x", "the text box X axis coordinate"),
        float("y", "the text box Y axis coordinate"),
        float("breakRowWidth", "the maximum row width"),
        charUTF8.const.p("string", "the text string to draw"),
        AutoSize("string")..nullable..charptr.const.p("end", "a pointer to the end of the sub-string to draw, or #NULL")
    )

    float(
        "TextBounds",
        """
        Measures the specified text string.

        Parameter {@code bounds} should be a pointer to {@code float[4]}, if the bounding box of the text should be returned. The bounds value are
        {@code [xmin,ymin, xmax,ymax]}.

        Measured values are returned in local coordinate space.
        """,

        ctx,
        float("x", "the text X axis coordinate"),
        float("y", "the text Y axis coordinate"),
        charUTF8.const.p("string", "the text string to measure"),
        AutoSize("string")..nullable..charptr.const.p("end", "a pointer to the end of the sub-string to measure, or #NULL"),
        nullable..Check(4)..float.p("bounds", "returns the bounding box of the text"),

        returnDoc = "the horizontal advance of the measured text (i.e. where the next character should drawn)"
    )

    void(
        "TextBoxBounds",
        """
        Measures the specified multi-text string.

        Parameter {@code bounds} should be a pointer to {@code float[4]}, if the bounding box of the text should be returned. The bounds value are
        {@code [xmin,ymin, xmax,ymax]}.

        Measured values are returned in local coordinate space.
        """,

        ctx,
        float("x", "the text box X axis coordinate"),
        float("y", "the text box Y axis coordinate"),
        float("breakRowWidth", "the maximum row width"),
        charUTF8.const.p("string", "the text string to measure"),
        AutoSize("string")..nullable..charptr.const.p("end", "a pointer to the end of the sub-string to measure, or #NULL"),
        nullable..Check(4)..float.p("bounds", "returns the bounding box of the text box")
    )

    int(
        "TextGlyphPositions",
        """
        Calculates the glyph x positions of the specified text. If {@code end} is specified only the sub-string will be used.

        Measured values are returned in local coordinate space.
        """,

        ctx,
        float("x", "the text X axis coordinate"),
        float("y", "the text Y axis coordinate"),
        charUTF8.const.p("string", "the text string to measure"),
        AutoSize("string")..nullable..charptr.const.p("end", "a pointer to the end of the sub-string to measure, or #NULL"),
        NVGglyphPosition.p("positions", "returns the glyph x positions"),
        AutoSize("positions")..int("maxPositions", "the maximum number of glyph positions to return")
    )

    void(
        "TextMetrics",
        """
        Returns the vertical metrics based on the current text style.

        Measured values are returned in local coordinate space.
        """,

        ctx,
        nullable..Check(1)..float.p("ascender", "the line ascend"),
        nullable..Check(1)..float.p("descender", "the line descend"),
        nullable..Check(1)..float.p("lineh", "the line height")
    )

    int(
        "TextBreakLines",
        """
        Breaks the specified text into lines. If {@code end} is specified only the sub-string will be used.

        White space is stripped at the beginning of the rows, the text is split at word boundaries or when new-line characters are encountered. Words longer
        than the max width are slit at nearest character (i.e. no hyphenation).
        """,

        ctx,
        charUTF8.const.p("string", "the text string to measure"),
        AutoSize("string")..nullable..charptr.const.p("end", "a pointer to the end of the sub-string to measure, or #NULL"),
        float("breakRowWidth", "the maximum row width"),
        NVGtextRow.p("rows", "returns the text rows"),
        AutoSize("rows")..int("maxRows", "the maximum number of text rows to return")
    )

    // Rendering back-end integration

    internal..macro..Address..opaque_p("CreateInternal", "", void())
    internal..macro..Address..opaque_p("InternalParams", "", void())
    internal..macro..Address..opaque_p("DeleteInternal", "", void())


}