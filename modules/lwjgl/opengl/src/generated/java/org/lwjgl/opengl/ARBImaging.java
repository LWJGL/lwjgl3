/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the OpenGL 1.2 optional imaging subset. */
public class ARBImaging {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev, and by the {@code target} parameter of ColorTable, CopyColorTable, ColorTableParameteriv, ColorTableParameterfv,
     * GetColorTable, GetColorTableParameteriv, and GetColorTableParameterfv.
     */
    public static final int
        GL_COLOR_TABLE                   = 0x80D0,
        GL_POST_CONVOLUTION_COLOR_TABLE  = 0x80D1,
        GL_POST_COLOR_MATRIX_COLOR_TABLE = 0x80D2;

    /** Accepted by the {@code target} parameter of ColorTable, GetColorTableParameteriv, and GetColorTableParameterfv. */
    public static final int
        GL_PROXY_COLOR_TABLE                   = 0x80D3,
        GL_PROXY_POST_CONVOLUTION_COLOR_TABLE  = 0x80D4,
        GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE = 0x80D5;

    /**
     * Accepted by the {@code pname} parameter of ColorTableParameteriv, ColorTableParameterfv, GetColorTableParameteriv, and
     * GetColorTableParameterfv.
     */
    public static final int
        GL_COLOR_TABLE_SCALE = 0x80D6,
        GL_COLOR_TABLE_BIAS  = 0x80D7;

    /** Accepted by the {@code pname} parameter of GetColorTableParameteriv and GetColorTableParameterfv. */
    public static final int
        GL_COLOR_TABLE_FORMAT         = 0x80D8,
        GL_COLOR_TABLE_WIDTH          = 0x80D9,
        GL_COLOR_TABLE_RED_SIZE       = 0x80DA,
        GL_COLOR_TABLE_GREEN_SIZE     = 0x80DB,
        GL_COLOR_TABLE_BLUE_SIZE      = 0x80DC,
        GL_COLOR_TABLE_ALPHA_SIZE     = 0x80DD,
        GL_COLOR_TABLE_LUMINANCE_SIZE = 0x80DE,
        GL_COLOR_TABLE_INTENSITY_SIZE = 0x80DF;

    /** ErrorCode */
    public static final int GL_TABLE_TOO_LARGE = 0x8031;

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev, and by the {@code target} parameter of ConvolutionFilter1D, CopyConvolutionFilter1D, GetConvolutionFilter, ConvolutionParameteri,
     * ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.
     */
    public static final int GL_CONVOLUTION_1D = 0x8010;

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev, and by the {@code target} parameter of ConvolutionFilter2D, CopyConvolutionFilter2D, GetConvolutionFilter, ConvolutionParameteri,
     * ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.
     */
    public static final int GL_CONVOLUTION_2D = 0x8011;

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev, and by the {@code target} parameter of SeparableFilter2D, SeparableFilter2D, GetSeparableFilter, ConvolutionParameteri,
     * ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.
     */
    public static final int GL_SEPARABLE_2D = 0x8012;

    /**
     * Accepted by the {@code pname} parameter of ConvolutionParameteri, ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv,
     * GetConvolutionParameteriv, and GetConvolutionParameterfv.
     */
    public static final int GL_CONVOLUTION_BORDER_MODE = 0x8013;

    /** Accepted by the {@code pname} parameter of ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv. */
    public static final int
        GL_CONVOLUTION_FILTER_SCALE = 0x8014,
        GL_CONVOLUTION_FILTER_BIAS  = 0x8015;

    /**
     * Accepted by the {@code param} parameter of ConvolutionParameteri, and ConvolutionParameterf, and by the {@code params} parameter of
     * ConvolutionParameteriv and ConvolutionParameterfv, when the {@code pname} parameter is CONVOLUTION_BORDER_MODE.
     */
    public static final int GL_REDUCE = 0x8016;

    /** Accepted by the {@code pname} parameter of GetConvolutionParameteriv and GetConvolutionParameterfv. */
    public static final int
        GL_CONVOLUTION_FORMAT     = 0x8017,
        GL_CONVOLUTION_WIDTH      = 0x8018,
        GL_CONVOLUTION_HEIGHT     = 0x8019,
        GL_MAX_CONVOLUTION_WIDTH  = 0x801A,
        GL_MAX_CONVOLUTION_HEIGHT = 0x801B;

    /**
     * Accepted by the {@code pname} parameter of PixelTransferi, PixelTransferf, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv,
     * and GetDoublev.
     */
    public static final int
        GL_POST_CONVOLUTION_RED_SCALE   = 0x801C,
        GL_POST_CONVOLUTION_GREEN_SCALE = 0x801D,
        GL_POST_CONVOLUTION_BLUE_SCALE  = 0x801E,
        GL_POST_CONVOLUTION_ALPHA_SCALE = 0x801F,
        GL_POST_CONVOLUTION_RED_BIAS    = 0x8020,
        GL_POST_CONVOLUTION_GREEN_BIAS  = 0x8021,
        GL_POST_CONVOLUTION_BLUE_BIAS   = 0x8022,
        GL_POST_CONVOLUTION_ALPHA_BIAS  = 0x8023;

    /**
     * Accepted by the {@code param} parameter of ConvolutionParameteri, and ConvolutionParameterf, and by the {@code params} parameter of
     * ConvolutionParameteriv and ConvolutionParameterfv, when the {@code pname} parameter is CONVOLUTION_BORDER_MODE.
     */
    public static final int
        GL_CONSTANT_BORDER  = 0x8151,
        GL_REPLICATE_BORDER = 0x8153;

    /** Accepted by the {@code pname} parameter of ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv. */
    public static final int GL_CONVOLUTION_BORDER_COLOR = 0x8154;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_COLOR_MATRIX                 = 0x80B1,
        GL_COLOR_MATRIX_STACK_DEPTH     = 0x80B2,
        GL_MAX_COLOR_MATRIX_STACK_DEPTH = 0x80B3;

    /** Accepted by the {@code pname} parameter of PixelTransfer*, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_POST_COLOR_MATRIX_RED_SCALE   = 0x80B4,
        GL_POST_COLOR_MATRIX_GREEN_SCALE = 0x80B5,
        GL_POST_COLOR_MATRIX_BLUE_SCALE  = 0x80B6,
        GL_POST_COLOR_MATRIX_ALPHA_SCALE = 0x80B7,
        GL_POST_COLOR_MATRIX_RED_BIAS    = 0x80B8,
        GL_POST_COLOR_MATRIX_GREEN_BIAS  = 0x80B9,
        GL_POST_COLOR_MATRIX_BLUE_BIAS   = 0x80BA,
        GL_POST_COLOR_MATRIX_ALPHA_BIAS  = 0x80BB;

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev, and by the {@code target} parameter of Histogram, ResetHistogram, GetHistogram, GetHistogramParameteriv, and
     * GetHistogramParameterfv.
     */
    public static final int GL_HISTOGRAM = 0x8024;

    /** Accepted by the {@code target} parameter of Histogram, GetHistogramParameteriv, and GetHistogramParameterfv. */
    public static final int GL_PROXY_HISTOGRAM = 0x8025;

    /** Accepted by the {@code pname} parameter of GetHistogramParameteriv and GetHistogramParameterfv. */
    public static final int
        GL_HISTOGRAM_WIDTH          = 0x8026,
        GL_HISTOGRAM_FORMAT         = 0x8027,
        GL_HISTOGRAM_RED_SIZE       = 0x8028,
        GL_HISTOGRAM_GREEN_SIZE     = 0x8029,
        GL_HISTOGRAM_BLUE_SIZE      = 0x802A,
        GL_HISTOGRAM_ALPHA_SIZE     = 0x802B,
        GL_HISTOGRAM_LUMINANCE_SIZE = 0x802C,
        GL_HISTOGRAM_SINK           = 0x802D;

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev, and by the {@code target} parameter of Minmax, ResetMinmax, GetMinmax, GetMinmaxParameteriv, and GetMinmaxParameterfv.
     */
    public static final int GL_MINMAX = 0x802E;

    /** Accepted by the {@code pname} parameter of GetMinmaxParameteriv and GetMinmaxParameterfv. */
    public static final int
        GL_MINMAX_FORMAT = 0x802F,
        GL_MINMAX_SINK   = 0x8030;

    /** Accepted by the {@code sfactor} and {@code dfactor} parameters of BlendFunc. */
    public static final int
        GL_CONSTANT_COLOR           = 0x8001,
        GL_ONE_MINUS_CONSTANT_COLOR = 0x8002,
        GL_CONSTANT_ALPHA           = 0x8003,
        GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_BLEND_COLOR = 0x8005;

    /** Accepted by the {@code mode} parameter of BlendEquation. */
    public static final int
        GL_FUNC_ADD = 0x8006,
        GL_MIN      = 0x8007,
        GL_MAX      = 0x8008;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_BLEND_EQUATION = 0x8009;

    /** Accepted by the {@code mode} parameter of BlendEquation. */
    public static final int
        GL_FUNC_SUBTRACT         = 0x800A,
        GL_FUNC_REVERSE_SUBTRACT = 0x800B;

    protected ARBImaging() {
        throw new UnsupportedOperationException();
    }

    // --- [ glColorTable ] ---

    /** Unsafe version of: {@link #glColorTable ColorTable} */
    public static native void nglColorTable(int target, int internalformat, int width, int format, int type, long table);

    /**
     * Specifies a color lookup table.
     *
     * @param target         the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr><tr><td>{@link #GL_PROXY_COLOR_TABLE PROXY_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_CONVOLUTION_COLOR_TABLE PROXY_POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE PROXY_POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param internalformat the color table internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
     * @param width          the color table width
     * @param format         the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param table          the color table data
     */
    public static void glColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer table) {
        nglColorTable(target, internalformat, width, format, type, memAddress(table));
    }

    /**
     * Specifies a color lookup table.
     *
     * @param target         the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr><tr><td>{@link #GL_PROXY_COLOR_TABLE PROXY_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_CONVOLUTION_COLOR_TABLE PROXY_POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE PROXY_POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param internalformat the color table internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
     * @param width          the color table width
     * @param format         the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param table          the color table data
     */
    public static void glColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long table) {
        nglColorTable(target, internalformat, width, format, type, table);
    }

    /**
     * Specifies a color lookup table.
     *
     * @param target         the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr><tr><td>{@link #GL_PROXY_COLOR_TABLE PROXY_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_CONVOLUTION_COLOR_TABLE PROXY_POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE PROXY_POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param internalformat the color table internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
     * @param width          the color table width
     * @param format         the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param table          the color table data
     */
    public static void glColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer table) {
        nglColorTable(target, internalformat, width, format, type, memAddress(table));
    }

    /**
     * Specifies a color lookup table.
     *
     * @param target         the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr><tr><td>{@link #GL_PROXY_COLOR_TABLE PROXY_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_CONVOLUTION_COLOR_TABLE PROXY_POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE PROXY_POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param internalformat the color table internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
     * @param width          the color table width
     * @param format         the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param table          the color table data
     */
    public static void glColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer table) {
        nglColorTable(target, internalformat, width, format, type, memAddress(table));
    }

    /**
     * Specifies a color lookup table.
     *
     * @param target         the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr><tr><td>{@link #GL_PROXY_COLOR_TABLE PROXY_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_CONVOLUTION_COLOR_TABLE PROXY_POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE PROXY_POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param internalformat the color table internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
     * @param width          the color table width
     * @param format         the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param table          the color table data
     */
    public static void glColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer table) {
        nglColorTable(target, internalformat, width, format, type, memAddress(table));
    }

    // --- [ glCopyColorTable ] ---

    /**
     * Defines a color table in exactly the manner of {@link #glColorTable ColorTable}, except that the image data are taken from the framebuffer rather than from client memory.
     *
     * @param target         the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param internalformat the color table internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
     * @param x              the left framebuffer pixel coordinate
     * @param y              the lower framebuffer pixel coordinate
     * @param width          the color table width
     */
    public static native void glCopyColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width);

    // --- [ glColorTableParameteriv ] ---

    /** Unsafe version of: {@link #glColorTableParameteriv ColorTableParameteriv} */
    public static native void nglColorTableParameteriv(int target, int pname, long params);

    /**
     * Specifies the scale and bias parameters for a color table.
     *
     * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param pname  the parameter to set. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE_SCALE COLOR_TABLE_SCALE}</td><td>{@link #GL_COLOR_TABLE_BIAS COLOR_TABLE_BIAS}</td></tr></table>
     * @param params the parameter value
     */
    public static void glColorTableParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglColorTableParameteriv(target, pname, memAddress(params));
    }

    // --- [ glColorTableParameterfv ] ---

    /** Unsafe version of: {@link #glColorTableParameterfv ColorTableParameterfv} */
    public static native void nglColorTableParameterfv(int target, int pname, long params);

    /**
     * Float version of {@link #glColorTableParameteriv ColorTableParameteriv}.
     *
     * @param target the color table target
     * @param pname  the parameter to set
     * @param params the parameter value
     */
    public static void glColorTableParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglColorTableParameterfv(target, pname, memAddress(params));
    }

    // --- [ glGetColorTable ] ---

    /** Unsafe version of: {@link #glGetColorTable GetColorTable} */
    public static native void nglGetColorTable(int target, int format, int type, long table);

    /**
     * Returns the current contents of a color table.
     *
     * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param format the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param table  the color table data
     */
    public static void glGetColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer table) {
        nglGetColorTable(target, format, type, memAddress(table));
    }

    /**
     * Returns the current contents of a color table.
     *
     * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param format the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param table  the color table data
     */
    public static void glGetColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long table) {
        nglGetColorTable(target, format, type, table);
    }

    /**
     * Returns the current contents of a color table.
     *
     * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param format the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param table  the color table data
     */
    public static void glGetColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer table) {
        nglGetColorTable(target, format, type, memAddress(table));
    }

    /**
     * Returns the current contents of a color table.
     *
     * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param format the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param table  the color table data
     */
    public static void glGetColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer table) {
        nglGetColorTable(target, format, type, memAddress(table));
    }

    /**
     * Returns the current contents of a color table.
     *
     * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param format the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param table  the color table data
     */
    public static void glGetColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer table) {
        nglGetColorTable(target, format, type, memAddress(table));
    }

    // --- [ glGetColorTableParameteriv ] ---

    /** Unsafe version of: {@link #glGetColorTableParameteriv GetColorTableParameteriv} */
    public static native void nglGetColorTableParameteriv(int target, int pname, long params);

    /**
     * Returns the integer value of the specified color table parameter.
     *
     * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr><tr><td>{@link #GL_PROXY_COLOR_TABLE PROXY_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_CONVOLUTION_COLOR_TABLE PROXY_POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE PROXY_POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE_SCALE COLOR_TABLE_SCALE}</td><td>{@link #GL_COLOR_TABLE_BIAS COLOR_TABLE_BIAS}</td><td>{@link #GL_COLOR_TABLE_FORMAT COLOR_TABLE_FORMAT}</td></tr><tr><td>{@link #GL_COLOR_TABLE_WIDTH COLOR_TABLE_WIDTH}</td><td>{@link #GL_COLOR_TABLE_RED_SIZE COLOR_TABLE_RED_SIZE}</td><td>{@link #GL_COLOR_TABLE_GREEN_SIZE COLOR_TABLE_GREEN_SIZE}</td></tr><tr><td>{@link #GL_COLOR_TABLE_BLUE_SIZE COLOR_TABLE_BLUE_SIZE}</td><td>{@link #GL_COLOR_TABLE_ALPHA_SIZE COLOR_TABLE_ALPHA_SIZE}</td><td>{@link #GL_COLOR_TABLE_LUMINANCE_SIZE COLOR_TABLE_LUMINANCE_SIZE}</td></tr><tr><td>{@link #GL_COLOR_TABLE_INTENSITY_SIZE COLOR_TABLE_INTENSITY_SIZE}</td></tr></table>
     * @param params a buffer in which to place the returned value
     */
    public static void glGetColorTableParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetColorTableParameteriv(target, pname, memAddress(params));
    }

    /**
     * Returns the integer value of the specified color table parameter.
     *
     * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr><tr><td>{@link #GL_PROXY_COLOR_TABLE PROXY_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_CONVOLUTION_COLOR_TABLE PROXY_POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE PROXY_POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE_SCALE COLOR_TABLE_SCALE}</td><td>{@link #GL_COLOR_TABLE_BIAS COLOR_TABLE_BIAS}</td><td>{@link #GL_COLOR_TABLE_FORMAT COLOR_TABLE_FORMAT}</td></tr><tr><td>{@link #GL_COLOR_TABLE_WIDTH COLOR_TABLE_WIDTH}</td><td>{@link #GL_COLOR_TABLE_RED_SIZE COLOR_TABLE_RED_SIZE}</td><td>{@link #GL_COLOR_TABLE_GREEN_SIZE COLOR_TABLE_GREEN_SIZE}</td></tr><tr><td>{@link #GL_COLOR_TABLE_BLUE_SIZE COLOR_TABLE_BLUE_SIZE}</td><td>{@link #GL_COLOR_TABLE_ALPHA_SIZE COLOR_TABLE_ALPHA_SIZE}</td><td>{@link #GL_COLOR_TABLE_LUMINANCE_SIZE COLOR_TABLE_LUMINANCE_SIZE}</td></tr><tr><td>{@link #GL_COLOR_TABLE_INTENSITY_SIZE COLOR_TABLE_INTENSITY_SIZE}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetColorTableParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetColorTableParameteriv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetColorTableParameterfv ] ---

    /** Unsafe version of: {@link #glGetColorTableParameterfv GetColorTableParameterfv} */
    public static native void nglGetColorTableParameterfv(int target, int pname, long params);

    /**
     * Float version of {@link #glGetColorTableParameteriv GetColorTableParameteriv}.
     *
     * @param target the color table target
     * @param pname  the parameter to query
     * @param params a buffer in which to place the returned value
     */
    public static void glGetColorTableParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetColorTableParameterfv(target, pname, memAddress(params));
    }

    /**
     * Float version of {@link #glGetColorTableParameteriv GetColorTableParameteriv}.
     *
     * @param target the color table target
     * @param pname  the parameter to query
     */
    @NativeType("void")
    public static float glGetColorTableParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetColorTableParameterfv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glColorSubTable ] ---

    /** Unsafe version of: {@link #glColorSubTable ColorSubTable} */
    public static native void nglColorSubTable(int target, int start, int count, int format, int type, long data);

    /**
     * Respecifies a portion of an existing color table.
     *
     * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param start  the starting index of the subregion to respecify
     * @param count  the number of colors in the subregion to respecify
     * @param format the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param data   the color table data
     */
    public static void glColorSubTable(@NativeType("GLenum") int target, @NativeType("GLsizei") int start, @NativeType("GLsizei") int count, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer data) {
        nglColorSubTable(target, start, count, format, type, memAddress(data));
    }

    /**
     * Respecifies a portion of an existing color table.
     *
     * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param start  the starting index of the subregion to respecify
     * @param count  the number of colors in the subregion to respecify
     * @param format the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param data   the color table data
     */
    public static void glColorSubTable(@NativeType("GLenum") int target, @NativeType("GLsizei") int start, @NativeType("GLsizei") int count, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long data) {
        nglColorSubTable(target, start, count, format, type, data);
    }

    // --- [ glCopyColorSubTable ] ---

    /**
     * Respecifies a portion of an existing color table using image taken from the framebuffer.
     *
     * @param target the color table target. One of:<br><table><tr><td>{@link #GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link #GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link #GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param start  the start index of the subregion to respecify
     * @param x      the left framebuffer pixel coordinate
     * @param y      the lower framebuffer pixel coordinate
     * @param width  the number of colors in the subregion to respecify
     */
    public static native void glCopyColorSubTable(@NativeType("GLenum") int target, @NativeType("GLsizei") int start, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width);

    // --- [ glConvolutionFilter1D ] ---

    /** Unsafe version of: {@link #glConvolutionFilter1D ConvolutionFilter1D} */
    public static native void nglConvolutionFilter1D(int target, int internalformat, int width, int format, int type, long data);

    /**
     * Defines a one-dimensional convolution filter.
     *
     * @param target         the convolution target. Must be:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td></tr></table>
     * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
     * @param width          the filter width
     * @param format         the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param data           the filter data
     */
    public static void glConvolutionFilter1D(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer data) {
        nglConvolutionFilter1D(target, internalformat, width, format, type, memAddress(data));
    }

    /**
     * Defines a one-dimensional convolution filter.
     *
     * @param target         the convolution target. Must be:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td></tr></table>
     * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
     * @param width          the filter width
     * @param format         the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param data           the filter data
     */
    public static void glConvolutionFilter1D(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long data) {
        nglConvolutionFilter1D(target, internalformat, width, format, type, data);
    }

    // --- [ glConvolutionFilter2D ] ---

    /** Unsafe version of: {@link #glConvolutionFilter2D ConvolutionFilter2D} */
    public static native void nglConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, long data);

    /**
     * Defines a two-dimensional convolution filter.
     *
     * @param target         the convolution target. Must be:<br><table><tr><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td></tr></table>
     * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
     * @param width          the filter width
     * @param height         the filter height
     * @param format         the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param data           the filter data
     */
    public static void glConvolutionFilter2D(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer data) {
        nglConvolutionFilter2D(target, internalformat, width, height, format, type, memAddress(data));
    }

    /**
     * Defines a two-dimensional convolution filter.
     *
     * @param target         the convolution target. Must be:<br><table><tr><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td></tr></table>
     * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
     * @param width          the filter width
     * @param height         the filter height
     * @param format         the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param data           the filter data
     */
    public static void glConvolutionFilter2D(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long data) {
        nglConvolutionFilter2D(target, internalformat, width, height, format, type, data);
    }

    // --- [ glCopyConvolutionFilter1D ] ---

    /**
     * Defines a one-dimensional filter in exactly the manner of {@link #glConvolutionFilter1D ConvolutionFilter1D}, except that image data are taken from the framebuffer, rather than from
     * client memory.
     *
     * @param target         the convolution target. Must be:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td></tr></table>
     * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
     * @param x              the left framebuffer pixel coordinate
     * @param y              the lower framebuffer pixel coordinate
     * @param width          the filter width
     */
    public static native void glCopyConvolutionFilter1D(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width);

    // --- [ glCopyConvolutionFilter2D ] ---

    /**
     * Defines a two-dimensional filter in exactly the manner of {@link #glConvolutionFilter1D ConvolutionFilter1D}, except that image data are taken from the framebuffer, rather than from
     * client memory.
     *
     * @param target         the convolution target. Must be:<br><table><tr><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td></tr></table>
     * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
     * @param x              the left framebuffer pixel coordinate
     * @param y              the lower framebuffer pixel coordinate
     * @param width          the filter width
     * @param height         the filter height
     */
    public static native void glCopyConvolutionFilter2D(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glGetConvolutionFilter ] ---

    /** Unsafe version of: {@link #glGetConvolutionFilter GetConvolutionFilter} */
    public static native void nglGetConvolutionFilter(int target, int format, int type, long image);

    /**
     * Returns the contents of a convolution filter.
     *
     * @param target the convolution target. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td></tr></table>
     * @param format the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param image  the filter data
     */
    public static void glGetConvolutionFilter(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer image) {
        nglGetConvolutionFilter(target, format, type, memAddress(image));
    }

    /**
     * Returns the contents of a convolution filter.
     *
     * @param target the convolution target. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td></tr></table>
     * @param format the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param image  the filter data
     */
    public static void glGetConvolutionFilter(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long image) {
        nglGetConvolutionFilter(target, format, type, image);
    }

    // --- [ glSeparableFilter2D ] ---

    /** Unsafe version of: {@link #glSeparableFilter2D SeparableFilter2D} */
    public static native void nglSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, long row, long column);

    /**
     * Specifies a two-dimensional separable convolution filter.
     *
     * @param target         the filter target. Must be:<br><table><tr><td>{@link #GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
     * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
     * @param width          the filter width
     * @param height         the filter height
     * @param format         the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param row            the horizontal filter data
     * @param column         the vertical filter data
     */
    public static void glSeparableFilter2D(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer row, @NativeType("void const *") ByteBuffer column) {
        nglSeparableFilter2D(target, internalformat, width, height, format, type, memAddress(row), memAddress(column));
    }

    /**
     * Specifies a two-dimensional separable convolution filter.
     *
     * @param target         the filter target. Must be:<br><table><tr><td>{@link #GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
     * @param internalformat the filter internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
     * @param width          the filter width
     * @param height         the filter height
     * @param format         the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param row            the horizontal filter data
     * @param column         the vertical filter data
     */
    public static void glSeparableFilter2D(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long row, @NativeType("void const *") long column) {
        nglSeparableFilter2D(target, internalformat, width, height, format, type, row, column);
    }

    // --- [ glGetSeparableFilter ] ---

    /** Unsafe version of: {@link #glGetSeparableFilter GetSeparableFilter} */
    public static native void nglGetSeparableFilter(int target, int format, int type, long row, long column, long span);

    /**
     * Returns the current contents of a separable convolution filter.
     *
     * @param target the filter target. Must be:<br><table><tr><td>{@link #GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
     * @param format the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param row    a buffer in which to return the filter row
     * @param column a buffer in which to return the filter column
     * @param span   unused
     */
    public static void glGetSeparableFilter(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer row, @NativeType("void *") ByteBuffer column, @Nullable @NativeType("void *") ByteBuffer span) {
        nglGetSeparableFilter(target, format, type, memAddress(row), memAddress(column), memAddressSafe(span));
    }

    /**
     * Returns the current contents of a separable convolution filter.
     *
     * @param target the filter target. Must be:<br><table><tr><td>{@link #GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
     * @param format the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param row    a buffer in which to return the filter row
     * @param column a buffer in which to return the filter column
     * @param span   unused
     */
    public static void glGetSeparableFilter(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long row, @NativeType("void *") long column, @Nullable @NativeType("void *") ByteBuffer span) {
        nglGetSeparableFilter(target, format, type, row, column, memAddressSafe(span));
    }

    // --- [ glConvolutionParameteri ] ---

    /**
     * Specifies the scale and bias of a convolution filter.
     *
     * @param target the filter target. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td><td>{@link #GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
     * @param pname  the parameter to set. Must be:<br><table><tr><td>{@link #GL_CONVOLUTION_BORDER_MODE CONVOLUTION_BORDER_MODE}</td></tr></table>
     * @param param  the parameter value
     */
    public static native void glConvolutionParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glConvolutionParameteriv ] ---

    /** Unsafe version of: {@link #glConvolutionParameteriv ConvolutionParameteriv} */
    public static native void nglConvolutionParameteriv(int target, int pname, long params);

    /**
     * Pointer version of {@link #glConvolutionParameteri ConvolutionParameteri}.
     *
     * @param target the filter target
     * @param pname  the parameter to set. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_FILTER_SCALE CONVOLUTION_FILTER_SCALE}</td><td>{@link #GL_CONVOLUTION_FILTER_BIAS CONVOLUTION_FILTER_BIAS}</td><td>{@link #GL_CONVOLUTION_BORDER_COLOR CONVOLUTION_BORDER_COLOR}</td></tr></table>
     * @param params the parameter value
     */
    public static void glConvolutionParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglConvolutionParameteriv(target, pname, memAddress(params));
    }

    // --- [ glConvolutionParameterf ] ---

    /**
     * Float version of {@link #glConvolutionParameteri ConvolutionParameteri}
     *
     * @param target the filter target
     * @param pname  the parameter to set
     * @param param  the parameter value
     */
    public static native void glConvolutionParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glConvolutionParameterfv ] ---

    /** Unsafe version of: {@link #glConvolutionParameterfv ConvolutionParameterfv} */
    public static native void nglConvolutionParameterfv(int target, int pname, long params);

    /**
     * Pointer version of {@link #glConvolutionParameterf ConvolutionParameterf}.
     *
     * @param target the filter target
     * @param pname  the parameter to set. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_FILTER_SCALE CONVOLUTION_FILTER_SCALE}</td><td>{@link #GL_CONVOLUTION_FILTER_BIAS CONVOLUTION_FILTER_BIAS}</td><td>{@link #GL_CONVOLUTION_BORDER_COLOR CONVOLUTION_BORDER_COLOR}</td></tr></table>
     * @param params the parameter value
     */
    public static void glConvolutionParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglConvolutionParameterfv(target, pname, memAddress(params));
    }

    // --- [ glGetConvolutionParameteriv ] ---

    /** Unsafe version of: {@link #glGetConvolutionParameteriv GetConvolutionParameteriv} */
    public static native void nglGetConvolutionParameteriv(int target, int pname, long params);

    /**
     * Returns the value of a convolution filter parameter.
     *
     * @param target the filter target. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td><td>{@link #GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
     * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_FORMAT CONVOLUTION_FORMAT}</td><td>{@link #GL_CONVOLUTION_WIDTH CONVOLUTION_WIDTH}</td><td>{@link #GL_CONVOLUTION_HEIGHT CONVOLUTION_HEIGHT}</td><td>{@link #GL_MAX_CONVOLUTION_WIDTH MAX_CONVOLUTION_WIDTH}</td></tr><tr><td>{@link #GL_MAX_CONVOLUTION_HEIGHT MAX_CONVOLUTION_HEIGHT}</td></tr></table>
     * @param params a buffer in which to return the parameter value
     */
    public static void glGetConvolutionParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetConvolutionParameteriv(target, pname, memAddress(params));
    }

    /**
     * Returns the value of a convolution filter parameter.
     *
     * @param target the filter target. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_1D CONVOLUTION_1D}</td><td>{@link #GL_CONVOLUTION_2D CONVOLUTION_2D}</td><td>{@link #GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
     * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_CONVOLUTION_FORMAT CONVOLUTION_FORMAT}</td><td>{@link #GL_CONVOLUTION_WIDTH CONVOLUTION_WIDTH}</td><td>{@link #GL_CONVOLUTION_HEIGHT CONVOLUTION_HEIGHT}</td><td>{@link #GL_MAX_CONVOLUTION_WIDTH MAX_CONVOLUTION_WIDTH}</td></tr><tr><td>{@link #GL_MAX_CONVOLUTION_HEIGHT MAX_CONVOLUTION_HEIGHT}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetConvolutionParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetConvolutionParameteriv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetConvolutionParameterfv ] ---

    /** Unsafe version of: {@link #glGetConvolutionParameterfv GetConvolutionParameterfv} */
    public static native void nglGetConvolutionParameterfv(int target, int pname, long params);

    /**
     * Float version of {@link #glGetConvolutionParameteriv GetConvolutionParameteriv}.
     *
     * @param target the filter target
     * @param pname  the parameter to query
     * @param params a buffer in which to return the parameter value
     */
    public static void glGetConvolutionParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetConvolutionParameterfv(target, pname, memAddress(params));
    }

    /**
     * Float version of {@link #glGetConvolutionParameteriv GetConvolutionParameteriv}.
     *
     * @param target the filter target
     * @param pname  the parameter to query
     */
    @NativeType("void")
    public static float glGetConvolutionParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetConvolutionParameterfv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glHistogram ] ---

    /**
     * Specifies the histogram table.
     *
     * @param target         the histogram target. One of:<br><table><tr><td>{@link #GL_HISTOGRAM HISTOGRAM}</td><td>{@link #GL_PROXY_HISTOGRAM PROXY_HISTOGRAM}</td></tr></table>
     * @param width          the histogram width
     * @param internalformat the histogram internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
     * @param sink           whether pixel groups will be consumed by the histogram operation ({@link GL11#GL_TRUE TRUE}) or passed on to the minmax operation ({@link GL11#GL_FALSE FALSE})
     */
    public static native void glHistogram(@NativeType("GLenum") int target, @NativeType("GLsizei") int width, @NativeType("GLenum") int internalformat, @NativeType("GLboolean") boolean sink);

    // --- [ glResetHistogram ] ---

    /**
     * Resets all counters of all elements of the histogram table to zero.
     *
     * @param target the histogram target. Must be:<br><table><tr><td>{@link #GL_HISTOGRAM HISTOGRAM}</td></tr></table>
     */
    public static native void glResetHistogram(@NativeType("GLenum") int target);

    // --- [ glGetHistogram ] ---

    /** Unsafe version of: {@link #glGetHistogram GetHistogram} */
    public static native void nglGetHistogram(int target, boolean reset, int format, int type, long values);

    /**
     * Returns the current contents of the histogram table.
     *
     * @param target the histogram target. Must be:<br><table><tr><td>{@link #GL_HISTOGRAM HISTOGRAM}</td></tr></table>
     * @param reset  if {@link GL11#GL_TRUE TRUE}, then all counters of all elements of the histogram are reset to zero. Counters are reset whether returned or not.
     * @param format the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the pixel data types. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param values the pixel data
     */
    public static void glGetHistogram(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer values) {
        nglGetHistogram(target, reset, format, type, memAddress(values));
    }

    /**
     * Returns the current contents of the histogram table.
     *
     * @param target the histogram target. Must be:<br><table><tr><td>{@link #GL_HISTOGRAM HISTOGRAM}</td></tr></table>
     * @param reset  if {@link GL11#GL_TRUE TRUE}, then all counters of all elements of the histogram are reset to zero. Counters are reset whether returned or not.
     * @param format the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the pixel data types. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param values the pixel data
     */
    public static void glGetHistogram(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long values) {
        nglGetHistogram(target, reset, format, type, values);
    }

    // --- [ glGetHistogramParameteriv ] ---

    /** Unsafe version of: {@link #glGetHistogramParameteriv GetHistogramParameteriv} */
    public static native void nglGetHistogramParameteriv(int target, int pname, long params);

    /**
     * Returns the integer values of the specified histogram parameter
     *
     * @param target the histogram target. Must be:<br><table><tr><td>{@link #GL_HISTOGRAM HISTOGRAM}</td></tr></table>
     * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_HISTOGRAM_WIDTH HISTOGRAM_WIDTH}</td><td>{@link #GL_HISTOGRAM_FORMAT HISTOGRAM_FORMAT}</td><td>{@link #GL_HISTOGRAM_RED_SIZE HISTOGRAM_RED_SIZE}</td><td>{@link #GL_HISTOGRAM_GREEN_SIZE HISTOGRAM_GREEN_SIZE}</td></tr><tr><td>{@link #GL_HISTOGRAM_BLUE_SIZE HISTOGRAM_BLUE_SIZE}</td><td>{@link #GL_HISTOGRAM_ALPHA_SIZE HISTOGRAM_ALPHA_SIZE}</td><td>{@link #GL_HISTOGRAM_LUMINANCE_SIZE HISTOGRAM_LUMINANCE_SIZE}</td><td>{@link #GL_HISTOGRAM_SINK HISTOGRAM_SINK}</td></tr></table>
     * @param params a buffer in which to return the parameter values
     */
    public static void glGetHistogramParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetHistogramParameteriv(target, pname, memAddress(params));
    }

    /**
     * Returns the integer values of the specified histogram parameter
     *
     * @param target the histogram target. Must be:<br><table><tr><td>{@link #GL_HISTOGRAM HISTOGRAM}</td></tr></table>
     * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_HISTOGRAM_WIDTH HISTOGRAM_WIDTH}</td><td>{@link #GL_HISTOGRAM_FORMAT HISTOGRAM_FORMAT}</td><td>{@link #GL_HISTOGRAM_RED_SIZE HISTOGRAM_RED_SIZE}</td><td>{@link #GL_HISTOGRAM_GREEN_SIZE HISTOGRAM_GREEN_SIZE}</td></tr><tr><td>{@link #GL_HISTOGRAM_BLUE_SIZE HISTOGRAM_BLUE_SIZE}</td><td>{@link #GL_HISTOGRAM_ALPHA_SIZE HISTOGRAM_ALPHA_SIZE}</td><td>{@link #GL_HISTOGRAM_LUMINANCE_SIZE HISTOGRAM_LUMINANCE_SIZE}</td><td>{@link #GL_HISTOGRAM_SINK HISTOGRAM_SINK}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetHistogramParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetHistogramParameteriv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetHistogramParameterfv ] ---

    /** Unsafe version of: {@link #glGetHistogramParameterfv GetHistogramParameterfv} */
    public static native void nglGetHistogramParameterfv(int target, int pname, long params);

    /**
     * Float version of {@link #glGetHistogramParameteriv GetHistogramParameteriv}.
     *
     * @param target the histogram target
     * @param pname  the parameter to query
     * @param params a buffer in which to place the returned value
     */
    public static void glGetHistogramParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetHistogramParameterfv(target, pname, memAddress(params));
    }

    /**
     * Float version of {@link #glGetHistogramParameteriv GetHistogramParameteriv}.
     *
     * @param target the histogram target
     * @param pname  the parameter to query
     */
    @NativeType("void")
    public static float glGetHistogramParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetHistogramParameterfv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMinmax ] ---

    /**
     * Specifies the minmax table.
     *
     * @param target         the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
     * @param internalformat the minmax table internal format. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td><td>{@link GL11#GL_R3_G3_B2 R3_G3_B2}</td><td>{@link GL11#GL_RGB4 RGB4}</td><td>{@link GL11#GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link GL11#GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link GL11#GL_RGB10 RGB10}</td><td>{@link GL11#GL_RGB12 RGB12}</td><td>{@link GL11#GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td><td>{@link GL11#GL_RGBA2 RGBA2}</td><td>{@link GL11#GL_RGBA4 RGBA4}</td></tr><tr><td>{@link GL11#GL_RGB5_A1 RGB5_A1}</td><td>{@link GL11#GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link GL11#GL_RGB10_A2 RGB10_A2}</td><td>{@link GL11#GL_RGBA12 RGBA12}</td><td>{@link GL11#GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td></tr><tr><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td></tr><tr><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL11#GL_INTENSITY INTENSITY}</td><td>{@link GL11#GL_ALPHA4 ALPHA4}</td><td>{@link GL11#GL_ALPHA8 ALPHA8}</td><td>{@link GL11#GL_ALPHA12 ALPHA12}</td><td>{@link GL11#GL_ALPHA16 ALPHA16}</td><td>{@link GL11#GL_LUMINANCE4 LUMINANCE4}</td><td>{@link GL11#GL_LUMINANCE8 LUMINANCE8}</td></tr><tr><td>{@link GL11#GL_LUMINANCE12 LUMINANCE12}</td><td>{@link GL11#GL_LUMINANCE16 LUMINANCE16}</td><td>{@link GL11#GL_LUMINANCE4_ALPHA4 LUMINANCE4_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE6_ALPHA2 LUMINANCE6_ALPHA2}</td><td>{@link GL11#GL_LUMINANCE8_ALPHA8 LUMINANCE8_ALPHA8}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA4 LUMINANCE12_ALPHA4}</td><td>{@link GL11#GL_LUMINANCE12_ALPHA12 LUMINANCE12_ALPHA12}</td><td>{@link GL11#GL_LUMINANCE16_ALPHA16 LUMINANCE16_ALPHA16}</td></tr><tr><td>{@link GL11#GL_INTENSITY4 INTENSITY4}</td><td>{@link GL11#GL_INTENSITY8 INTENSITY8}</td><td>{@link GL11#GL_INTENSITY12 INTENSITY12}</td><td>{@link GL11#GL_INTENSITY16 INTENSITY16}</td><td>{@link GL21#GL_SLUMINANCE SLUMINANCE}</td><td>{@link GL21#GL_SLUMINANCE8_ALPHA8 SLUMINANCE8_ALPHA8}</td></tr></table>
     * @param sink           whether pixel groups will be consumed by the minmax operation ({@link GL11#GL_TRUE TRUE}) or passed on to final conversion ({@link GL11#GL_FALSE FALSE})
     */
    public static native void glMinmax(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLboolean") boolean sink);

    // --- [ glResetMinmax ] ---

    /**
     * Resets all minimum and maximum values of {@code target} to to their maximum and minimum representable values, respectively.
     *
     * @param target the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
     */
    public static native void glResetMinmax(@NativeType("GLenum") int target);

    // --- [ glGetMinmax ] ---

    /** Unsafe version of: {@link #glGetMinmax GetMinmax} */
    public static native void nglGetMinmax(int target, boolean reset, int format, int type, long values);

    /**
     * Returns the current contents of the minmax table.
     *
     * @param target the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
     * @param reset  If {@link GL11#GL_TRUE TRUE}, then each minimum value is reset to the maximum representable value, and each maximum value is reset to the minimum
     *               representable value. All values are reset, whether returned or not.
     * @param format the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param values a buffer in which to place the minmax values
     */
    public static void glGetMinmax(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer values) {
        nglGetMinmax(target, reset, format, type, memAddress(values));
    }

    /**
     * Returns the current contents of the minmax table.
     *
     * @param target the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
     * @param reset  If {@link GL11#GL_TRUE TRUE}, then each minimum value is reset to the maximum representable value, and each maximum value is reset to the minimum
     *               representable value. All values are reset, whether returned or not.
     * @param format the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param values a buffer in which to place the minmax values
     */
    public static void glGetMinmax(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long values) {
        nglGetMinmax(target, reset, format, type, values);
    }

    // --- [ glGetMinmaxParameteriv ] ---

    /** Unsafe version of: {@link #glGetMinmaxParameteriv GetMinmaxParameteriv} */
    public static native void nglGetMinmaxParameteriv(int target, int pname, long params);

    /**
     * Returns the integer value of the specified minmax parameter.
     *
     * @param target the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
     * @param pname  the parameter to query
     * @param params a buffer in which to place the returned value
     */
    public static void glGetMinmaxParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMinmaxParameteriv(target, pname, memAddress(params));
    }

    /**
     * Returns the integer value of the specified minmax parameter.
     *
     * @param target the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
     * @param pname  the parameter to query
     */
    @NativeType("void")
    public static int glGetMinmaxParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMinmaxParameteriv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMinmaxParameterfv ] ---

    /** Unsafe version of: {@link #glGetMinmaxParameterfv GetMinmaxParameterfv} */
    public static native void nglGetMinmaxParameterfv(int target, int pname, long params);

    /**
     * Float version of {@link #glGetMinmaxParameteriv GetMinmaxParameteriv}.
     *
     * @param target the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
     * @param pname  the parameter to query
     * @param params a buffer in which to place the returned value
     */
    public static void glGetMinmaxParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMinmaxParameterfv(target, pname, memAddress(params));
    }

    /**
     * Float version of {@link #glGetMinmaxParameteriv GetMinmaxParameteriv}.
     *
     * @param target the minmax target. Must be:<br><table><tr><td>{@link #GL_MINMAX MINMAX}</td></tr></table>
     * @param pname  the parameter to query
     */
    @NativeType("void")
    public static float glGetMinmaxParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetMinmaxParameterfv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glBlendColor ] ---

    /**
     * Specifies the constant color C<sub>c</sub> to be used in blending.
     *
     * @param red   the red color component
     * @param green the green color component
     * @param blue  the blue color component
     * @param alpha the alpha color component
     */
    public static void glBlendColor(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha) {
        GL14C.glBlendColor(red, green, blue, alpha);
    }

    // --- [ glBlendEquation ] ---

    /**
     * Controls the blend equations used for per-fragment blending.
     *
     * @param mode the blend equation. One of:<br><table><tr><td>{@link GL14C#GL_FUNC_ADD FUNC_ADD}</td><td>{@link GL14C#GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link GL14C#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link GL14C#GL_MIN MIN}</td><td>{@link GL14C#GL_MAX MAX}</td></tr></table>
     */
    public static void glBlendEquation(@NativeType("GLenum") int mode) {
        GL14C.glBlendEquation(mode);
    }

    /** Array version of: {@link #glColorTable ColorTable} */
    public static void glColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] table) {
        long __functionAddress = GL.getICD().glColorTable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, width, format, type, table, __functionAddress);
    }

    /** Array version of: {@link #glColorTable ColorTable} */
    public static void glColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] table) {
        long __functionAddress = GL.getICD().glColorTable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, width, format, type, table, __functionAddress);
    }

    /** Array version of: {@link #glColorTable ColorTable} */
    public static void glColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] table) {
        long __functionAddress = GL.getICD().glColorTable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, width, format, type, table, __functionAddress);
    }

    /** Array version of: {@link #glColorTableParameteriv ColorTableParameteriv} */
    public static void glColorTableParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glColorTableParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glColorTableParameterfv ColorTableParameterfv} */
    public static void glColorTableParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glColorTableParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetColorTable GetColorTable} */
    public static void glGetColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] table) {
        long __functionAddress = GL.getICD().glGetColorTable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, type, table, __functionAddress);
    }

    /** Array version of: {@link #glGetColorTable GetColorTable} */
    public static void glGetColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] table) {
        long __functionAddress = GL.getICD().glGetColorTable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, type, table, __functionAddress);
    }

    /** Array version of: {@link #glGetColorTable GetColorTable} */
    public static void glGetColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] table) {
        long __functionAddress = GL.getICD().glGetColorTable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, type, table, __functionAddress);
    }

    /** Array version of: {@link #glGetColorTableParameteriv GetColorTableParameteriv} */
    public static void glGetColorTableParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetColorTableParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetColorTableParameterfv GetColorTableParameterfv} */
    public static void glGetColorTableParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetColorTableParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glConvolutionParameteriv ConvolutionParameteriv} */
    public static void glConvolutionParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glConvolutionParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glConvolutionParameterfv ConvolutionParameterfv} */
    public static void glConvolutionParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glConvolutionParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetConvolutionParameteriv GetConvolutionParameteriv} */
    public static void glGetConvolutionParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetConvolutionParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetConvolutionParameterfv GetConvolutionParameterfv} */
    public static void glGetConvolutionParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetConvolutionParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetHistogramParameteriv GetHistogramParameteriv} */
    public static void glGetHistogramParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetHistogramParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetHistogramParameterfv GetHistogramParameterfv} */
    public static void glGetHistogramParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetHistogramParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetMinmaxParameteriv GetMinmaxParameteriv} */
    public static void glGetMinmaxParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetMinmaxParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetMinmaxParameterfv GetMinmaxParameterfv} */
    public static void glGetMinmaxParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetMinmaxParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

}