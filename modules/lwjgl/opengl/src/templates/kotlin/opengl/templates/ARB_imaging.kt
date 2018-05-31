/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_imaging = "ARBImaging".nativeClassGL("ARB_imaging") {
    documentation = "Native bindings to the OpenGL 1.2 optional imaging subset."

    val IMAGING_INTERNAL_FORMATS =
        """
        #RGB GL11#GL_RGBA
        #RG8 #RG8_SNORM #R3_G3_B2 #RGB4 #RGB5 #RGB565 #RGB8
        #RGB8_SNORM #RGB10 #RGB12 #RGB16 #RGB16_SNORM #RGBA2 #RGBA4 #RGB5_A1 #RGBA8 #RGBA8_SNORM #RGB10_A2
        #RGBA12 #RGBA16 #RGBA16_SNORM #SRGB8 #SRGB8_ALPHA8 #RGB16F #RGBA16F #RGB32F #RGBA32F
        #R11F_G11F_B10F

        #ALPHA #LUMINANCE #LUMINANCE_ALPHA #INTENSITY #ALPHA4 #ALPHA8 #ALPHA12 #ALPHA16 #LUMINANCE4 #LUMINANCE8
        #LUMINANCE12 #LUMINANCE16 #LUMINANCE4_ALPHA4 #LUMINANCE6_ALPHA2 #LUMINANCE8_ALPHA8 #LUMINANCE12_ALPHA4 #LUMINANCE12_ALPHA12
        #LUMINANCE16_ALPHA16 #INTENSITY4 #INTENSITY8 #INTENSITY12 #INTENSITY16 #SLUMINANCE #SLUMINANCE8_ALPHA8
        """

    val PIXEL_DATA_FORMATS =
        "#RED #GREEN #BLUE #ALPHA #RGB GL11#GL_RGBA #BGR #BGRA #LUMINANCE #LUMINANCE_ALPHA"

    val PIXEL_DATA_TYPES =
        """
        #UNSIGNED_BYTE #BYTE #UNSIGNED_SHORT #SHORT #UNSIGNED_INT #INT
        #UNSIGNED_BYTE_3_3_2 #UNSIGNED_BYTE_2_3_3_REV #UNSIGNED_SHORT_5_6_5 #UNSIGNED_SHORT_5_6_5_REV #UNSIGNED_SHORT_4_4_4_4
        #UNSIGNED_SHORT_4_4_4_4_REV #UNSIGNED_SHORT_5_5_5_1 #UNSIGNED_SHORT_1_5_5_5_REV #UNSIGNED_INT_8_8_8_8
        #UNSIGNED_INT_8_8_8_8_REV #UNSIGNED_INT_10_10_10_2 #UNSIGNED_INT_2_10_10_10_REV
        """

    // SGI_color_table

    val COLOR_TABLE_TARGETS = IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev, and by the {@code target} parameter of ColorTable, CopyColorTable, ColorTableParameteriv, ColorTableParameterfv,
        GetColorTable, GetColorTableParameteriv, and GetColorTableParameterfv.
        """,

        "COLOR_TABLE"..0x80D0,
        "POST_CONVOLUTION_COLOR_TABLE"..0x80D1,
        "POST_COLOR_MATRIX_COLOR_TABLE"..0x80D2
    ).javaDocLinks

    val PROXY_COLOR_TABLE_TARGETS = IntConstant(
        "Accepted by the {@code target} parameter of ColorTable, GetColorTableParameteriv, and GetColorTableParameterfv.",

        "PROXY_COLOR_TABLE"..0x80D3,
        "PROXY_POST_CONVOLUTION_COLOR_TABLE"..0x80D4,
        "PROXY_POST_COLOR_MATRIX_COLOR_TABLE"..0x80D5
    ).javaDocLinks

    val COLOR_TABLE_PARAMS = IntConstant(
        """
        Accepted by the {@code pname} parameter of ColorTableParameteriv, ColorTableParameterfv, GetColorTableParameteriv, and
        GetColorTableParameterfv.
        """,

        "COLOR_TABLE_SCALE"..0x80D6,
        "COLOR_TABLE_BIAS"..0x80D7
    ).javaDocLinks

    val COLOR_TABLE_PROPERTIES = IntConstant(
        "Accepted by the {@code pname} parameter of GetColorTableParameteriv and GetColorTableParameterfv.",

        "COLOR_TABLE_FORMAT"..0x80D8,
        "COLOR_TABLE_WIDTH"..0x80D9,
        "COLOR_TABLE_RED_SIZE"..0x80DA,
        "COLOR_TABLE_GREEN_SIZE"..0x80DB,
        "COLOR_TABLE_BLUE_SIZE"..0x80DC,
        "COLOR_TABLE_ALPHA_SIZE"..0x80DD,
        "COLOR_TABLE_LUMINANCE_SIZE"..0x80DE,
        "COLOR_TABLE_INTENSITY_SIZE"..0x80DF
    ).javaDocLinks

    IntConstant(
        "ErrorCode",

        "TABLE_TOO_LARGE"..0x8031
    )

    DeprecatedGL..void(
        "ColorTable",
        "Specifies a color lookup table.",

        GLenum.IN("target", "the color table target", "$COLOR_TABLE_TARGETS $PROXY_COLOR_TABLE_TARGETS"),
        GLenum.IN("internalformat", "the color table internal format", IMAGING_INTERNAL_FORMATS),
        GLsizei.IN("width", "the color table width"),
        GLenum.IN("format", "the color data format", PIXEL_DATA_FORMATS),
        GLenum.IN("type", "the color data type", PIXEL_DATA_TYPES),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..PIXEL_UNPACK_BUFFER..void.const.p.IN("table", "the color table data")
    )

    DeprecatedGL..void(
        "CopyColorTable",
        "Defines a color table in exactly the manner of #ColorTable(), except that the image data are taken from the framebuffer rather than from client memory.",

        GLenum.IN("target", "the color table target", COLOR_TABLE_TARGETS),
        GLenum.IN("internalformat", "the color table internal format", IMAGING_INTERNAL_FORMATS),
        GLint.IN("x", "the left framebuffer pixel coordinate"),
        GLint.IN("y", "the lower framebuffer pixel coordinate"),
        GLsizei.IN("width", "the color table width")
    )

    DeprecatedGL..void(
        "ColorTableParameteriv",
        "Specifies the scale and bias parameters for a color table.",

        GLenum.IN("target", "the color table target", COLOR_TABLE_TARGETS),
        GLenum.IN("pname", "the parameter to set", COLOR_TABLE_PARAMS),
        Check(4)..GLint.const.p.IN("params", "the parameter value")
    )

    DeprecatedGL..void(
        "ColorTableParameterfv",
        "Float version of #ColorTableParameteriv().",

        GLenum.IN("target", "the color table target"),
        GLenum.IN("pname", "the parameter to set"),
        Check(4)..GLfloat.const.p.IN("params", "the parameter value")
    )

    DeprecatedGL..void(
        "GetColorTable",
        "Returns the current contents of a color table.",

        GLenum.IN("target", "the color table target", COLOR_TABLE_TARGETS),
        GLenum.IN("format", "the color data format", PIXEL_DATA_FORMATS),
        GLenum.IN("type", "the color data type", PIXEL_DATA_TYPES),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..Unsafe..PIXEL_PACK_BUFFER..void.p.OUT("table", "the color table data")
    )

    DeprecatedGL..void(
        "GetColorTableParameteriv",
        "Returns the integer value of the specified color table parameter.",

        GLenum.IN("target", "the color table target", "$COLOR_TABLE_TARGETS $PROXY_COLOR_TABLE_TARGETS"),
        GLenum.IN("pname", "the parameter to query", "$COLOR_TABLE_PARAMS $COLOR_TABLE_PROPERTIES"),
        Check(4)..ReturnParam..GLint.p.OUT("params", "a buffer in which to place the returned value")
    )

    DeprecatedGL..void(
        "GetColorTableParameterfv",
        "Float version of #GetColorTableParameteriv().",

        GLenum.IN("target", "the color table target"),
        GLenum.IN("pname", "the parameter to query"),
        Check(4)..ReturnParam..GLfloat.p.OUT("params", "a buffer in which to place the returned value")
    )

    // EXT_color_subtable

    DeprecatedGL..void(
        "ColorSubTable",
        "Respecifies a portion of an existing color table.",

        GLenum.IN("target", "the color table target", COLOR_TABLE_TARGETS),
        GLsizei.IN("start", "the starting index of the subregion to respecify"),
        GLsizei.IN("count", "the number of colors in the subregion to respecify"),
        GLenum.IN("format", "the color data format", PIXEL_DATA_FORMATS),
        GLenum.IN("type", "the color data type", PIXEL_DATA_TYPES),
        Unsafe..PIXEL_UNPACK_BUFFER..void.const.p.IN("data", "the color table data")
    )

    DeprecatedGL..void(
        "CopyColorSubTable",
        "Respecifies a portion of an existing color table using image taken from the framebuffer.",

        GLenum.IN("target", "the color table target", COLOR_TABLE_TARGETS),
        GLsizei.IN("start", "the start index of the subregion to respecify"),
        GLint.IN("x", "the left framebuffer pixel coordinate"),
        GLint.IN("y", "the lower framebuffer pixel coordinate"),
        GLsizei.IN("width", "the number of colors in the subregion to respecify")
    )

    // EXT_convolution

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev, and by the {@code target} parameter of ConvolutionFilter1D, CopyConvolutionFilter1D, GetConvolutionFilter, ConvolutionParameteri,
        ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.
        """,

        "CONVOLUTION_1D"..0x8010
    )

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev, and by the {@code target} parameter of ConvolutionFilter2D, CopyConvolutionFilter2D, GetConvolutionFilter, ConvolutionParameteri,
        ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.
        """,

        "CONVOLUTION_2D"..0x8011
    )

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev, and by the {@code target} parameter of SeparableFilter2D, SeparableFilter2D, GetSeparableFilter, ConvolutionParameteri,
        ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.
        """,

        "SEPARABLE_2D"..0x8012
    )

    IntConstant(
        """
        Accepted by the {@code pname} parameter of ConvolutionParameteri, ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv,
        GetConvolutionParameteriv, and GetConvolutionParameterfv.
        """,

        "CONVOLUTION_BORDER_MODE"..0x8013
    )

    val CONVOLUTION_FILTER_PARAMS = IntConstant(
        "Accepted by the {@code pname} parameter of ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.",

        "CONVOLUTION_FILTER_SCALE"..0x8014,
        "CONVOLUTION_FILTER_BIAS"..0x8015
    ).javaDocLinks

    IntConstant(
        """
        Accepted by the {@code param} parameter of ConvolutionParameteri, and ConvolutionParameterf, and by the {@code params} parameter of
        ConvolutionParameteriv and ConvolutionParameterfv, when the {@code pname} parameter is CONVOLUTION_BORDER_MODE.
        """,

        "REDUCE"..0x8016
    )

    val CONVOLUTION_FILTER_PROPERTIES = IntConstant(
        "Accepted by the {@code pname} parameter of GetConvolutionParameteriv and GetConvolutionParameterfv.",

        "CONVOLUTION_FORMAT"..0x8017,
        "CONVOLUTION_WIDTH"..0x8018,
        "CONVOLUTION_HEIGHT"..0x8019,
        "MAX_CONVOLUTION_WIDTH"..0x801A,
        "MAX_CONVOLUTION_HEIGHT"..0x801B
    ).javaDocLinks

    IntConstant(
        """
        Accepted by the {@code pname} parameter of PixelTransferi, PixelTransferf, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv,
        and GetDoublev.
        """,

        "POST_CONVOLUTION_RED_SCALE"..0x801C,
        "POST_CONVOLUTION_GREEN_SCALE"..0x801D,
        "POST_CONVOLUTION_BLUE_SCALE"..0x801E,
        "POST_CONVOLUTION_ALPHA_SCALE"..0x801F,
        "POST_CONVOLUTION_RED_BIAS"..0x8020,
        "POST_CONVOLUTION_GREEN_BIAS"..0x8021,
        "POST_CONVOLUTION_BLUE_BIAS"..0x8022,
        "POST_CONVOLUTION_ALPHA_BIAS"..0x8023
    )

    DeprecatedGL..void(
        "ConvolutionFilter1D",
        "Defines a one-dimensional convolution filter.",

        GLenum.IN("target", "the convolution target", "#CONVOLUTION_1D"),
        GLenum.IN("internalformat", "the filter internal format", IMAGING_INTERNAL_FORMATS),
        GLsizei.IN("width", "the filter width"),
        GLenum.IN("format", "the filter data format", PIXEL_DATA_FORMATS),
        GLenum.IN("type", "the filter data type", PIXEL_DATA_TYPES),
        Unsafe..PIXEL_UNPACK_BUFFER..void.const.p.IN("data", "the filter data")
    )

    DeprecatedGL..void(
        "ConvolutionFilter2D",
        "Defines a two-dimensional convolution filter.",

        GLenum.IN("target", "the convolution target", "#CONVOLUTION_2D"),
        GLenum.IN("internalformat", "the filter internal format", IMAGING_INTERNAL_FORMATS),
        GLsizei.IN("width", "the filter width"),
        GLsizei.IN("height", "the filter height"),
        GLenum.IN("format", "the filter data format", PIXEL_DATA_FORMATS),
        GLenum.IN("type", "the filter data type", PIXEL_DATA_TYPES),
        Unsafe..PIXEL_UNPACK_BUFFER..void.const.p.IN("data", "the filter data")
    )

    DeprecatedGL..void(
        "CopyConvolutionFilter1D",
        """
        Defines a one-dimensional filter in exactly the manner of #ConvolutionFilter1D(), except that image data are taken from the framebuffer, rather than from
        client memory.
        """,

        GLenum.IN("target", "the convolution target", "#CONVOLUTION_1D"),
        GLenum.IN("internalformat", "the filter internal format", IMAGING_INTERNAL_FORMATS),
        GLint.IN("x", "the left framebuffer pixel coordinate"),
        GLint.IN("y", "the lower framebuffer pixel coordinate"),
        GLsizei.IN("width", "the filter width")
    )

    DeprecatedGL..void(
        "CopyConvolutionFilter2D",
        """
        Defines a two-dimensional filter in exactly the manner of #ConvolutionFilter1D(), except that image data are taken from the framebuffer, rather than from
        client memory.
        """,

        GLenum.IN("target", "the convolution target", "#CONVOLUTION_2D"),
        GLenum.IN("internalformat", "the filter internal format", IMAGING_INTERNAL_FORMATS),
        GLint.IN("x", "the left framebuffer pixel coordinate"),
        GLint.IN("y", "the lower framebuffer pixel coordinate"),
        GLsizei.IN("width", "the filter width"),
        GLsizei.IN("height", "the filter height")
    )

    DeprecatedGL..void(
        "GetConvolutionFilter",
        "Returns the contents of a convolution filter.",

        GLenum.IN("target", "the convolution target", "#CONVOLUTION_1D #CONVOLUTION_2D"),
        GLenum.IN("format", "the filter data format", PIXEL_DATA_FORMATS),
        GLenum.IN("type", "the filter data type", PIXEL_DATA_TYPES),
        Unsafe..PIXEL_PACK_BUFFER..void.p.OUT("image", "the filter data")
    )

    DeprecatedGL..void(
        "SeparableFilter2D",
        "Specifies a two-dimensional separable convolution filter.",

        GLenum.IN("target", "the filter target", "#SEPARABLE_2D"),
        GLenum.IN("internalformat", "the filter internal format", IMAGING_INTERNAL_FORMATS),
        GLsizei.IN("width", "the filter width"),
        GLsizei.IN("height", "the filter height"),
        GLenum.IN("format", "the filter data format", PIXEL_DATA_FORMATS),
        GLenum.IN("type", "the filter data type", PIXEL_DATA_TYPES),
        Unsafe..PIXEL_UNPACK_BUFFER..void.const.p.IN("row", "the horizontal filter data"),
        Unsafe..PIXEL_UNPACK_BUFFER..void.const.p.IN("column", "the vertical filter data")
    )

    DeprecatedGL..void(
        "GetSeparableFilter",
        "Returns the current contents of a separable convolution filter.",

        GLenum.IN("target", "the filter target", "#SEPARABLE_2D"),
        GLenum.IN("format", "the filter data format", PIXEL_DATA_FORMATS),
        GLenum.IN("type", "the filter data type", PIXEL_DATA_TYPES),
        Unsafe..PIXEL_PACK_BUFFER..void.p.OUT("row", "a buffer in which to return the filter row"),
        Unsafe..PIXEL_PACK_BUFFER..void.p.OUT("column", "a buffer in which to return the filter column"),
        Unsafe..nullable..void.p.IN("span", "unused")
    )

    DeprecatedGL..void(
        "ConvolutionParameteri",
        "Specifies the scale and bias of a convolution filter.",

        GLenum.IN("target", "the filter target", "#CONVOLUTION_1D #CONVOLUTION_2D #SEPARABLE_2D"),
        GLenum.IN("pname", "the parameter to set", "#CONVOLUTION_BORDER_MODE"),
        GLint.IN("param", "the parameter value")
    )

    DeprecatedGL..void(
        "ConvolutionParameteriv",
        "Pointer version of #ConvolutionParameteri().",

        GLenum.IN("target", "the filter target"),
        GLenum.IN("pname", "the parameter to set", "$CONVOLUTION_FILTER_PARAMS #CONVOLUTION_BORDER_COLOR"),
        Check(4)..GLint.const.p.IN("params", "the parameter value")
    )

    DeprecatedGL..void(
        "ConvolutionParameterf",
        "Float version of #ConvolutionParameteri()",

        GLenum.IN("target", "the filter target"),
        GLenum.IN("pname", "the parameter to set"),
        GLfloat.IN("param", "the parameter value")
    )

    DeprecatedGL..void(
        "ConvolutionParameterfv",
        "Pointer version of #ConvolutionParameterf().",

        GLenum.IN("target", "the filter target"),
        GLenum.IN("pname", "the parameter to set", "$CONVOLUTION_FILTER_PARAMS #CONVOLUTION_BORDER_COLOR"),
        Check(4)..GLfloat.const.p.IN("params", "the parameter value")
    )

    DeprecatedGL..void(
        "GetConvolutionParameteriv",
        "Returns the value of a convolution filter parameter.",

        GLenum.IN("target", "the filter target", "#CONVOLUTION_1D #CONVOLUTION_2D #SEPARABLE_2D"),
        GLenum.IN("pname", "the parameter to query", CONVOLUTION_FILTER_PROPERTIES),
        ReturnParam..Check(4)..GLint.p.OUT("params", "a buffer in which to return the parameter value")
    )

    DeprecatedGL..void(
        "GetConvolutionParameterfv",
        "Float version of #GetConvolutionParameteriv().",

        GLenum.IN("target", "the filter target"),
        GLenum.IN("pname", "the parameter to query"),
        ReturnParam..Check(4)..GLfloat.p.OUT("params", "a buffer in which to return the parameter value")
    )

    // HP_convolution_border_modes

    IntConstant(
        """
        Accepted by the {@code param} parameter of ConvolutionParameteri, and ConvolutionParameterf, and by the {@code params} parameter of
        ConvolutionParameteriv and ConvolutionParameterfv, when the {@code pname} parameter is CONVOLUTION_BORDER_MODE.
        """,

        //"IGNORE_BORDER"..0x8150,
        "CONSTANT_BORDER"..0x8151,
        "REPLICATE_BORDER"..0x8153
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.",

        "CONVOLUTION_BORDER_COLOR"..0x8154
    )

    // SGI_color_matrix

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "COLOR_MATRIX"..0x80B1,
        "COLOR_MATRIX_STACK_DEPTH"..0x80B2,
        "MAX_COLOR_MATRIX_STACK_DEPTH"..0x80B3
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of PixelTransfer*, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "POST_COLOR_MATRIX_RED_SCALE"..0x80B4,
        "POST_COLOR_MATRIX_GREEN_SCALE"..0x80B5,
        "POST_COLOR_MATRIX_BLUE_SCALE"..0x80B6,
        "POST_COLOR_MATRIX_ALPHA_SCALE"..0x80B7,
        "POST_COLOR_MATRIX_RED_BIAS"..0x80B8,
        "POST_COLOR_MATRIX_GREEN_BIAS"..0x80B9,
        "POST_COLOR_MATRIX_BLUE_BIAS"..0x80BA,
        "POST_COLOR_MATRIX_ALPHA_BIAS"..0x80BB
    )

    // EXT_histogram

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev, and by the {@code target} parameter of Histogram, ResetHistogram, GetHistogram, GetHistogramParameteriv, and
        GetHistogramParameterfv.
        """,

        "HISTOGRAM"..0x8024
    )

    IntConstant(
        "Accepted by the {@code target} parameter of Histogram, GetHistogramParameteriv, and GetHistogramParameterfv.",

        "PROXY_HISTOGRAM"..0x8025
    )

    val HISTOGRAM_PROPERTIES = IntConstant(
        "Accepted by the {@code pname} parameter of GetHistogramParameteriv and GetHistogramParameterfv.",

        "HISTOGRAM_WIDTH"..0x8026,
        "HISTOGRAM_FORMAT"..0x8027,
        "HISTOGRAM_RED_SIZE"..0x8028,
        "HISTOGRAM_GREEN_SIZE"..0x8029,
        "HISTOGRAM_BLUE_SIZE"..0x802A,
        "HISTOGRAM_ALPHA_SIZE"..0x802B,
        "HISTOGRAM_LUMINANCE_SIZE"..0x802C,
        "HISTOGRAM_SINK"..0x802D
    ).javaDocLinks

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev, and by the {@code target} parameter of Minmax, ResetMinmax, GetMinmax, GetMinmaxParameteriv, and GetMinmaxParameterfv.
        """,

        "MINMAX"..0x802E
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetMinmaxParameteriv and GetMinmaxParameterfv.",

        "MINMAX_FORMAT"..0x802F,
        "MINMAX_SINK"..0x8030
    )

    DeprecatedGL..void(
        "Histogram",
        "Specifies the histogram table.",

        GLenum.IN("target", "the histogram target", "#HISTOGRAM #PROXY_HISTOGRAM"),
        GLsizei.IN("width", "the histogram width"),
        GLenum.IN("internalformat", "the histogram internal format", IMAGING_INTERNAL_FORMATS),
        GLboolean.IN(
            "sink",
            """
            whether pixel groups will be consumed by the histogram operation (#TRUE) or passed on to the minmax operation (#FALSE)
            """
        )
    )

    DeprecatedGL..void(
        "ResetHistogram",
        "Resets all counters of all elements of the histogram table to zero.",

        GLenum.IN("target", "the histogram target", "#HISTOGRAM")
    )

    DeprecatedGL..void(
        "GetHistogram",
        "Returns the current contents of the histogram table.",

        GLenum.IN("target", "the histogram target", "#HISTOGRAM"),
        GLboolean.IN(
            "reset",
            "if #TRUE, then all counters of all elements of the histogram are reset to zero. Counters are reset whether returned or not."
        ),
        GLenum.IN("format", "the pixel data format", PIXEL_DATA_FORMATS),
        GLenum.IN("type", "the pixel data types", PIXEL_DATA_TYPES),
        Unsafe..PIXEL_PACK_BUFFER..void.p.OUT("values", "the pixel data")
    )

    DeprecatedGL..void(
        "GetHistogramParameteriv",
        "Returns the integer values of the specified histogram parameter",

        GLenum.IN("target", "the histogram target", "#HISTOGRAM"),
        GLenum.IN("pname", "the parameter to query", HISTOGRAM_PROPERTIES),
        ReturnParam..Check(1)..GLint.p.OUT("params", "a buffer in which to return the parameter values")
    )

    DeprecatedGL..void(
        "GetHistogramParameterfv",
        "Float version of #GetHistogramParameteriv().",

        GLenum.IN("target", "the histogram target"),
        GLenum.IN("pname", "the parameter to query"),
        ReturnParam..Check(1)..GLfloat.p.OUT("params", "a buffer in which to place the returned value")
    )

    DeprecatedGL..void(
        "Minmax",
        "Specifies the minmax table.",

        GLenum.IN("target", "the minmax target", "#MINMAX"),
        GLenum.IN("internalformat", "the minmax table internal format", IMAGING_INTERNAL_FORMATS),
        GLboolean.IN(
            "sink",
            "whether pixel groups will be consumed by the minmax operation (#TRUE) or passed on to final conversion (#FALSE)"
        )
    )

    DeprecatedGL..void(
        "ResetMinmax",
        "Resets all minimum and maximum values of {@code target} to to their maximum and minimum representable values, respectively.",

        GLenum.IN("target", "the minmax target", "#MINMAX")
    )

    DeprecatedGL..void(
        "GetMinmax",
        "Returns the current contents of the minmax table.",

        GLenum.IN("target", "the minmax target", "#MINMAX"),
        GLboolean.IN(
            "reset",
            """
            If #TRUE, then each minimum value is reset to the maximum representable value, and each maximum value is reset to the minimum
            representable value. All values are reset, whether returned or not.
            """
        ),
        GLenum.IN("format", "the pixel data format", PIXEL_DATA_FORMATS),
        GLenum.IN("type", "the pixel data type", PIXEL_DATA_TYPES),
        Unsafe..PIXEL_PACK_BUFFER..void.p.OUT("values", "a buffer in which to place the minmax values")
    )

    DeprecatedGL..void(
        "GetMinmaxParameteriv",
        "Returns the integer value of the specified minmax parameter.",

        GLenum.IN("target", "the minmax target", "#MINMAX"),
        GLenum.IN("pname", "the parameter to query"),
        ReturnParam..Check(1)..GLint.p.OUT("params", "a buffer in which to place the returned value")
    )

    DeprecatedGL..void(
        "GetMinmaxParameterfv",
        "Float version of #GetMinmaxParameteriv().",

        GLenum.IN("target", "the minmax target", "#MINMAX"),
        GLenum.IN("pname", "the parameter to query"),
        ReturnParam..Check(1)..GLfloat.p.OUT("params", "a buffer in which to place the returned value")
    )

    // EXT_blend_color

    IntConstant(
        "Accepted by the {@code sfactor} and {@code dfactor} parameters of BlendFunc.",

        "CONSTANT_COLOR"..0x8001,
        "ONE_MINUS_CONSTANT_COLOR"..0x8002,
        "CONSTANT_ALPHA"..0x8003,
        "ONE_MINUS_CONSTANT_ALPHA"..0x8004
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "BLEND_COLOR"..0x8005
    )

    GL14C reuse "BlendColor"

    // EXT_blend_minmax

    IntConstant(
        "Accepted by the {@code mode} parameter of BlendEquation.",

        "FUNC_ADD"..0x8006,
        "MIN"..0x8007,
        "MAX"..0x8008
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "BLEND_EQUATION"..0x8009
    )

    // EXT_blend_subtract

    IntConstant(
        "Accepted by the {@code mode} parameter of BlendEquation.",

        "FUNC_SUBTRACT"..0x800A,
        "FUNC_REVERSE_SUBTRACT"..0x800B
    )

    GL14C reuse "BlendEquation"
}