/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GLES32 extends GLES31 {

    static { GLES.initialize(); }

    public static final int
        GL_MULTISAMPLE_LINE_WIDTH_RANGE_ARB       = 0x9381,
        GL_MULTISAMPLE_LINE_WIDTH_GRANULARITY_ARB = 0x9382;

    public static final int
        GL_MULTIPLY       = 0x9294,
        GL_SCREEN         = 0x9295,
        GL_OVERLAY        = 0x9296,
        GL_DARKEN         = 0x9297,
        GL_LIGHTEN        = 0x9298,
        GL_COLORDODGE     = 0x9299,
        GL_COLORBURN      = 0x929A,
        GL_HARDLIGHT      = 0x929B,
        GL_SOFTLIGHT      = 0x929C,
        GL_DIFFERENCE     = 0x929E,
        GL_EXCLUSION      = 0x92A0,
        GL_HSL_HUE        = 0x92AD,
        GL_HSL_SATURATION = 0x92AE,
        GL_HSL_COLOR      = 0x92AF,
        GL_HSL_LUMINOSITY = 0x92B0;

    public static final int
        GL_DEBUG_OUTPUT             = 0x92E0,
        GL_DEBUG_OUTPUT_SYNCHRONOUS = 0x8242;

    public static final int GL_CONTEXT_FLAG_DEBUG_BIT = 0x2;

    public static final int
        GL_MAX_DEBUG_MESSAGE_LENGTH         = 0x9143,
        GL_MAX_DEBUG_LOGGED_MESSAGES        = 0x9144,
        GL_DEBUG_LOGGED_MESSAGES            = 0x9145,
        GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = 0x8243,
        GL_MAX_DEBUG_GROUP_STACK_DEPTH      = 0x826C,
        GL_DEBUG_GROUP_STACK_DEPTH          = 0x826D,
        GL_MAX_LABEL_LENGTH                 = 0x82E8;

    public static final int
        GL_DEBUG_CALLBACK_FUNCTION   = 0x8244,
        GL_DEBUG_CALLBACK_USER_PARAM = 0x8245;

    public static final int
        GL_DEBUG_SOURCE_API             = 0x8246,
        GL_DEBUG_SOURCE_WINDOW_SYSTEM   = 0x8247,
        GL_DEBUG_SOURCE_SHADER_COMPILER = 0x8248,
        GL_DEBUG_SOURCE_THIRD_PARTY     = 0x8249,
        GL_DEBUG_SOURCE_APPLICATION     = 0x824A,
        GL_DEBUG_SOURCE_OTHER           = 0x824B;

    public static final int
        GL_DEBUG_TYPE_ERROR               = 0x824C,
        GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR = 0x824D,
        GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR  = 0x824E,
        GL_DEBUG_TYPE_PORTABILITY         = 0x824F,
        GL_DEBUG_TYPE_PERFORMANCE         = 0x8250,
        GL_DEBUG_TYPE_OTHER               = 0x8251,
        GL_DEBUG_TYPE_MARKER              = 0x8268;

    public static final int
        GL_DEBUG_TYPE_PUSH_GROUP = 0x8269,
        GL_DEBUG_TYPE_POP_GROUP  = 0x826A;

    public static final int
        GL_DEBUG_SEVERITY_HIGH         = 0x9146,
        GL_DEBUG_SEVERITY_MEDIUM       = 0x9147,
        GL_DEBUG_SEVERITY_LOW          = 0x9148,
        GL_DEBUG_SEVERITY_NOTIFICATION = 0x826B;

    public static final int
        GL_STACK_UNDERFLOW = 0x504,
        GL_STACK_OVERFLOW  = 0x503;

    public static final int
        GL_BUFFER           = 0x82E0,
        GL_SHADER           = 0x82E1,
        GL_PROGRAM          = 0x82E2,
        GL_QUERY            = 0x82E3,
        GL_PROGRAM_PIPELINE = 0x82E4,
        GL_SAMPLER          = 0x82E6;

    public static final int GL_GEOMETRY_SHADER = 0x8DD9;

    public static final int GL_GEOMETRY_SHADER_BIT = 0x4;

    public static final int
        GL_GEOMETRY_LINKED_VERTICES_OUT = 0x8916,
        GL_GEOMETRY_LINKED_INPUT_TYPE   = 0x8917,
        GL_GEOMETRY_LINKED_OUTPUT_TYPE  = 0x8918,
        GL_GEOMETRY_SHADER_INVOCATIONS  = 0x887F;

    public static final int
        GL_LAYER_PROVOKING_VERTEX                   = 0x825E,
        GL_MAX_GEOMETRY_UNIFORM_COMPONENTS          = 0x8DDF,
        GL_MAX_GEOMETRY_UNIFORM_BLOCKS              = 0x8A2C,
        GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 0x8A32,
        GL_MAX_GEOMETRY_INPUT_COMPONENTS            = 0x9123,
        GL_MAX_GEOMETRY_OUTPUT_COMPONENTS           = 0x9124,
        GL_MAX_GEOMETRY_OUTPUT_VERTICES             = 0x8DE0,
        GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS     = 0x8DE1,
        GL_MAX_GEOMETRY_SHADER_INVOCATIONS          = 0x8E5A,
        GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS         = 0x8C29,
        GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS      = 0x92CF,
        GL_MAX_GEOMETRY_ATOMIC_COUNTERS             = 0x92D5,
        GL_MAX_GEOMETRY_IMAGE_UNIFORMS              = 0x90CD,
        GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS       = 0x90D7;

    public static final int
        GL_FIRST_VERTEX_CONVENTION = 0x8E4D,
        GL_LAST_VERTEX_CONVENTION  = 0x8E4E,
        GL_UNDEFINED_VERTEX        = 0x8260;

    public static final int GL_PRIMITIVES_GENERATED = 0x8C87;

    public static final int
        GL_LINES_ADJACENCY          = 0xA,
        GL_LINE_STRIP_ADJACENCY     = 0xB,
        GL_TRIANGLES_ADJACENCY      = 0xC,
        GL_TRIANGLE_STRIP_ADJACENCY = 0xD;

    public static final int GL_FRAMEBUFFER_DEFAULT_LAYERS = 0x9312;

    public static final int GL_MAX_FRAMEBUFFER_LAYERS = 0x9317;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = 0x8DA8;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED = 0x8DA7;

    public static final int GL_REFERENCED_BY_GEOMETRY_SHADER = 0x9309;

    public static final int GL_PRIMITIVE_BOUNDING_BOX_ARB = 0x92BE;

    public static final int
        GL_GUILTY_CONTEXT_RESET   = 0x8253,
        GL_INNOCENT_CONTEXT_RESET = 0x8254,
        GL_UNKNOWN_CONTEXT_RESET  = 0x8255;

    public static final int
        GL_CONTEXT_ROBUST_ACCESS       = 0x90F3,
        GL_RESET_NOTIFICATION_STRATEGY = 0x8256;

    public static final int
        GL_LOSE_CONTEXT_ON_RESET = 0x8252,
        GL_NO_RESET_NOTIFICATION = 0x8261;

    public static final int GL_CONTEXT_LOST = 0x507;

    public static final int GL_SAMPLE_SHADING = 0x8C36;

    public static final int GL_MIN_SAMPLE_SHADING_VALUE = 0x8C37;

    public static final int
        GL_MIN_FRAGMENT_INTERPOLATION_OFFSET  = 0x8E5B,
        GL_MAX_FRAGMENT_INTERPOLATION_OFFSET  = 0x8E5C,
        GL_FRAGMENT_INTERPOLATION_OFFSET_BITS = 0x8E5D;

    public static final int GL_PATCHES = 0xE;

    public static final int GL_PATCH_VERTICES = 0x8E72;

    public static final int
        GL_TESS_CONTROL_OUTPUT_VERTICES = 0x8E75,
        GL_TESS_GEN_MODE                = 0x8E76,
        GL_TESS_GEN_SPACING             = 0x8E77,
        GL_TESS_GEN_VERTEX_ORDER        = 0x8E78,
        GL_TESS_GEN_POINT_MODE          = 0x8E79;

    public static final int
        GL_ISOLINES = 0x8E7A,
        GL_QUADS    = 0x7;

    public static final int
        GL_FRACTIONAL_ODD  = 0x8E7B,
        GL_FRACTIONAL_EVEN = 0x8E7C;

    public static final int
        GL_MAX_PATCH_VERTICES                              = 0x8E7D,
        GL_MAX_TESS_GEN_LEVEL                              = 0x8E7E,
        GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS             = 0x8E7F,
        GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS          = 0x8E80,
        GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS            = 0x8E81,
        GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS         = 0x8E82,
        GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS              = 0x8E83,
        GL_MAX_TESS_PATCH_COMPONENTS                       = 0x8E84,
        GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS        = 0x8E85,
        GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS           = 0x8E86,
        GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS                 = 0x8E89,
        GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS              = 0x8E8A,
        GL_MAX_TESS_CONTROL_INPUT_COMPONENTS               = 0x886C,
        GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS            = 0x886D,
        GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS    = 0x8E1E,
        GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E1F,
        GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS         = 0x92CD,
        GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS      = 0x92CE,
        GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS                = 0x92D3,
        GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS             = 0x92D4,
        GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS                 = 0x90CB,
        GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS              = 0x90CC,
        GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS          = 0x90D8,
        GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS       = 0x90D9,
        GL_PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED         = 0x8221;

    public static final int
        GL_IS_PER_PATCH                         = 0x92E7,
        GL_REFERENCED_BY_TESS_CONTROL_SHADER    = 0x9307,
        GL_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x9308;

    public static final int
        GL_TESS_EVALUATION_SHADER = 0x8E87,
        GL_TESS_CONTROL_SHADER    = 0x8E88;

    public static final int
        GL_TESS_CONTROL_SHADER_BIT    = 0x8,
        GL_TESS_EVALUATION_SHADER_BIT = 0x10;

    public static final int GL_TEXTURE_BORDER_COLOR = 0x1004;

    public static final int GL_CLAMP_TO_BORDER = 0x812D;

    public static final int GL_TEXTURE_BUFFER = 0x8C2A;

    public static final int GL_TEXTURE_BUFFER_BINDING = 0x8C2A;

    public static final int
        GL_SAMPLER_BUFFER              = 0x8DC2,
        GL_INT_SAMPLER_BUFFER          = 0x8DD0,
        GL_UNSIGNED_INT_SAMPLER_BUFFER = 0x8DD8,
        GL_IMAGE_BUFFER                = 0x9051,
        GL_INT_IMAGE_BUFFER            = 0x905C,
        GL_UNSIGNED_INT_IMAGE_BUFFER   = 0x9067;

    public static final int
        GL_TEXTURE_BUFFER_DATA_STORE_BINDING = 0x8C2D,
        GL_TEXTURE_BUFFER_OFFSET             = 0x919D,
        GL_TEXTURE_BUFFER_SIZE               = 0x919E;

    public static final int
        GL_COMPRESSED_RGBA_ASTC_4x4           = 0x93B0,
        GL_COMPRESSED_RGBA_ASTC_5x4           = 0x93B1,
        GL_COMPRESSED_RGBA_ASTC_5x5           = 0x93B2,
        GL_COMPRESSED_RGBA_ASTC_6x5           = 0x93B3,
        GL_COMPRESSED_RGBA_ASTC_6x6           = 0x93B4,
        GL_COMPRESSED_RGBA_ASTC_8x5           = 0x93B5,
        GL_COMPRESSED_RGBA_ASTC_8x6           = 0x93B6,
        GL_COMPRESSED_RGBA_ASTC_8x8           = 0x93B7,
        GL_COMPRESSED_RGBA_ASTC_10x5          = 0x93B8,
        GL_COMPRESSED_RGBA_ASTC_10x6          = 0x93B9,
        GL_COMPRESSED_RGBA_ASTC_10x8          = 0x93BA,
        GL_COMPRESSED_RGBA_ASTC_10x10         = 0x93BB,
        GL_COMPRESSED_RGBA_ASTC_12x10         = 0x93BC,
        GL_COMPRESSED_RGBA_ASTC_12x12         = 0x93BD,
        GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4   = 0x93D0,
        GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4   = 0x93D1,
        GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5   = 0x93D2,
        GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5   = 0x93D3,
        GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6   = 0x93D4,
        GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5   = 0x93D5,
        GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6   = 0x93D6,
        GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8   = 0x93D7,
        GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5  = 0x93D8,
        GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6  = 0x93D9,
        GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8  = 0x93DA,
        GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10 = 0x93DB,
        GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10 = 0x93DC,
        GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12 = 0x93DD;

    public static final int GL_TEXTURE_CUBE_MAP_ARRAY = 0x9009;

    public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY = 0x900A;

    public static final int
        GL_SAMPLER_CUBE_MAP_ARRAY              = 0x900C,
        GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW       = 0x900D,
        GL_INT_SAMPLER_CUBE_MAP_ARRAY          = 0x900E,
        GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY = 0x900F,
        GL_IMAGE_CUBE_MAP_ARRAY                = 0x9054,
        GL_INT_IMAGE_CUBE_MAP_ARRAY            = 0x905F,
        GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY   = 0x906A;

    public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;

    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 0x9105;

    public static final int
        GL_SAMPLER_2D_MULTISAMPLE_ARRAY              = 0x910B,
        GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY          = 0x910C,
        GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910D;

    protected GLES32() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendBarrier ] ---

    /** {@code void glBlendBarrier(void)} */
    public static native void glBlendBarrier();

    // --- [ glCopyImageSubData ] ---

    /** {@code void glCopyImageSubData(GLuint srcName, GLenum srcTarget, GLint srcLevel, GLint srcX, GLint srcY, GLint srcZ, GLuint dstName, GLenum dstTarget, GLint dstLevel, GLint dstX, GLint dstY, GLint dstZ, GLsizei srcWidth, GLsizei srcHeight, GLsizei srcDepth)} */
    public static native void glCopyImageSubData(@NativeType("GLuint") int srcName, @NativeType("GLenum") int srcTarget, @NativeType("GLint") int srcLevel, @NativeType("GLint") int srcX, @NativeType("GLint") int srcY, @NativeType("GLint") int srcZ, @NativeType("GLuint") int dstName, @NativeType("GLenum") int dstTarget, @NativeType("GLint") int dstLevel, @NativeType("GLint") int dstX, @NativeType("GLint") int dstY, @NativeType("GLint") int dstZ, @NativeType("GLsizei") int srcWidth, @NativeType("GLsizei") int srcHeight, @NativeType("GLsizei") int srcDepth);

    // --- [ glDebugMessageControl ] ---

    /** {@code void glDebugMessageControl(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static native void nglDebugMessageControl(int source, int type, int severity, int count, long ids, boolean enabled);

    /** {@code void glDebugMessageControl(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageControl(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") IntBuffer ids, @NativeType("GLboolean") boolean enabled) {
        nglDebugMessageControl(source, type, severity, ids.remaining(), memAddress(ids), enabled);
    }

    /** {@code void glDebugMessageControl(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageControl(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") int id, @NativeType("GLboolean") boolean enabled) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.ints(id);
            nglDebugMessageControl(source, type, severity, 1, memAddress(ids), enabled);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDebugMessageInsert ] ---

    /** {@code void glDebugMessageInsert(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar const * message)} */
    public static native void nglDebugMessageInsert(int source, int type, int id, int severity, int length, long message);

    /** {@code void glDebugMessageInsert(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar const * message)} */
    public static void glDebugMessageInsert(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLuint") int id, @NativeType("GLenum") int severity, @NativeType("GLchar const *") ByteBuffer message) {
        nglDebugMessageInsert(source, type, id, severity, message.remaining(), memAddress(message));
    }

    /** {@code void glDebugMessageInsert(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar const * message)} */
    public static void glDebugMessageInsert(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLuint") int id, @NativeType("GLenum") int severity, @NativeType("GLchar const *") CharSequence message) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int messageEncodedLength = stack.nUTF8(message, false);
            long messageEncoded = stack.getPointerAddress();
            nglDebugMessageInsert(source, type, id, severity, messageEncodedLength, messageEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDebugMessageCallback ] ---

    /** {@code void glDebugMessageCallback(GLDEBUGPROC callback, void const * userParam)} */
    public static native void nglDebugMessageCallback(long callback, long userParam);

    /** {@code void glDebugMessageCallback(GLDEBUGPROC callback, void const * userParam)} */
    public static void glDebugMessageCallback(@NativeType("GLDEBUGPROC") @Nullable GLDebugMessageCallbackI callback, @NativeType("void const *") long userParam) {
        nglDebugMessageCallback(memAddressSafe(callback), userParam);
    }

    // --- [ glGetDebugMessageLog ] ---

    /** {@code GLuint glGetDebugMessageLog(GLuint count, GLsizei bufsize, GLenum * sources, GLenum * types, GLuint * ids, GLenum * severities, GLsizei * lengths, GLchar * messageLog)} */
    public static native int nglGetDebugMessageLog(int count, int bufsize, long sources, long types, long ids, long severities, long lengths, long messageLog);

    /** {@code GLuint glGetDebugMessageLog(GLuint count, GLsizei bufsize, GLenum * sources, GLenum * types, GLuint * ids, GLenum * severities, GLsizei * lengths, GLchar * messageLog)} */
    @NativeType("GLuint")
    public static int glGetDebugMessageLog(@NativeType("GLuint") int count, @NativeType("GLenum *") @Nullable IntBuffer sources, @NativeType("GLenum *") @Nullable IntBuffer types, @NativeType("GLuint *") @Nullable IntBuffer ids, @NativeType("GLenum *") @Nullable IntBuffer severities, @NativeType("GLsizei *") @Nullable IntBuffer lengths, @NativeType("GLchar *") @Nullable ByteBuffer messageLog) {
        if (CHECKS) {
            checkSafe(sources, count);
            checkSafe(types, count);
            checkSafe(ids, count);
            checkSafe(severities, count);
            checkSafe(lengths, count);
        }
        return nglGetDebugMessageLog(count, remainingSafe(messageLog), memAddressSafe(sources), memAddressSafe(types), memAddressSafe(ids), memAddressSafe(severities), memAddressSafe(lengths), memAddressSafe(messageLog));
    }

    // --- [ glGetPointerv ] ---

    /** {@code void glGetPointerv(GLenum pname, void ** params)} */
    public static native void nglGetPointerv(int pname, long params);

    /** {@code void glGetPointerv(GLenum pname, void ** params)} */
    public static void glGetPointerv(@NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetPointerv(pname, memAddress(params));
    }

    /** {@code void glGetPointerv(GLenum pname, void ** params)} */
    @NativeType("void")
    public static long glGetPointer(@NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetPointerv(pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glPushDebugGroup ] ---

    /** {@code void glPushDebugGroup(GLenum source, GLuint id, GLsizei length, GLchar const * message)} */
    public static native void nglPushDebugGroup(int source, int id, int length, long message);

    /** {@code void glPushDebugGroup(GLenum source, GLuint id, GLsizei length, GLchar const * message)} */
    public static void glPushDebugGroup(@NativeType("GLenum") int source, @NativeType("GLuint") int id, @NativeType("GLchar const *") ByteBuffer message) {
        nglPushDebugGroup(source, id, message.remaining(), memAddress(message));
    }

    /** {@code void glPushDebugGroup(GLenum source, GLuint id, GLsizei length, GLchar const * message)} */
    public static void glPushDebugGroup(@NativeType("GLenum") int source, @NativeType("GLuint") int id, @NativeType("GLchar const *") CharSequence message) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int messageEncodedLength = stack.nUTF8(message, false);
            long messageEncoded = stack.getPointerAddress();
            nglPushDebugGroup(source, id, messageEncodedLength, messageEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glPopDebugGroup ] ---

    /** {@code void glPopDebugGroup(void)} */
    public static native void glPopDebugGroup();

    // --- [ glObjectLabel ] ---

    /** {@code void glObjectLabel(GLenum identifier, GLuint name, GLsizei length, GLchar const * label)} */
    public static native void nglObjectLabel(int identifier, int name, int length, long label);

    /** {@code void glObjectLabel(GLenum identifier, GLuint name, GLsizei length, GLchar const * label)} */
    public static void glObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLchar const *") ByteBuffer label) {
        nglObjectLabel(identifier, name, label.remaining(), memAddress(label));
    }

    /** {@code void glObjectLabel(GLenum identifier, GLuint name, GLsizei length, GLchar const * label)} */
    public static void glObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLchar const *") CharSequence label) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int labelEncodedLength = stack.nUTF8(label, false);
            long labelEncoded = stack.getPointerAddress();
            nglObjectLabel(identifier, name, labelEncodedLength, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetObjectLabel ] ---

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static native void nglGetObjectLabel(int identifier, int name, int bufSize, long length, long label);

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer label) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetObjectLabel(identifier, name, label.remaining(), memAddressSafe(length), memAddress(label));
    }

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer label = stack.malloc(bufSize);
            nglGetObjectLabel(identifier, name, bufSize, memAddress(length), memAddress(label));
            return memUTF8(label, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name) {
        return glGetObjectLabel(identifier, name, GLES20.glGetInteger(GL_MAX_LABEL_LENGTH));
    }

    // --- [ glObjectPtrLabel ] ---

    /** {@code void glObjectPtrLabel(void * ptr, GLsizei length, GLchar const * label)} */
    public static native void nglObjectPtrLabel(long ptr, int length, long label);

    /** {@code void glObjectPtrLabel(void * ptr, GLsizei length, GLchar const * label)} */
    public static void glObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLchar const *") ByteBuffer label) {
        if (CHECKS) {
            check(ptr);
        }
        nglObjectPtrLabel(ptr, label.remaining(), memAddress(label));
    }

    /** {@code void glObjectPtrLabel(void * ptr, GLsizei length, GLchar const * label)} */
    public static void glObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLchar const *") CharSequence label) {
        if (CHECKS) {
            check(ptr);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int labelEncodedLength = stack.nUTF8(label, false);
            long labelEncoded = stack.getPointerAddress();
            nglObjectPtrLabel(ptr, labelEncodedLength, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetObjectPtrLabel ] ---

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static native void nglGetObjectPtrLabel(long ptr, int bufSize, long length, long label);

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer label) {
        if (CHECKS) {
            check(ptr);
            checkSafe(length, 1);
        }
        nglGetObjectPtrLabel(ptr, label.remaining(), memAddressSafe(length), memAddress(label));
    }

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLsizei") int bufSize) {
        if (CHECKS) {
            check(ptr);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer label = stack.malloc(bufSize);
            nglGetObjectPtrLabel(ptr, bufSize, memAddress(length), memAddress(label));
            return memUTF8(label, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectPtrLabel(@NativeType("void *") long ptr) {
        return glGetObjectPtrLabel(ptr, GLES20.glGetInteger(GL_MAX_LABEL_LENGTH));
    }

    // --- [ glEnablei ] ---

    /** {@code void glEnablei(GLenum target, GLuint index)} */
    public static native void glEnablei(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glDisablei ] ---

    /** {@code void glDisablei(GLenum target, GLuint index)} */
    public static native void glDisablei(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glBlendEquationi ] ---

    /** {@code void glBlendEquationi(GLuint buf, GLenum mode)} */
    public static native void glBlendEquationi(@NativeType("GLuint") int buf, @NativeType("GLenum") int mode);

    // --- [ glBlendEquationSeparatei ] ---

    /** {@code void glBlendEquationSeparatei(GLuint buf, GLenum modeRGB, GLenum modeAlpha)} */
    public static native void glBlendEquationSeparatei(@NativeType("GLuint") int buf, @NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha);

    // --- [ glBlendFunci ] ---

    /** {@code void glBlendFunci(GLuint buf, GLenum src, GLenum dst)} */
    public static native void glBlendFunci(@NativeType("GLuint") int buf, @NativeType("GLenum") int src, @NativeType("GLenum") int dst);

    // --- [ glBlendFuncSeparatei ] ---

    /** {@code void glBlendFuncSeparatei(GLuint buf, GLenum srcRGB, GLenum dstRGB, GLenum srcAlpha, GLenum dstAlpha)} */
    public static native void glBlendFuncSeparatei(@NativeType("GLuint") int buf, @NativeType("GLenum") int srcRGB, @NativeType("GLenum") int dstRGB, @NativeType("GLenum") int srcAlpha, @NativeType("GLenum") int dstAlpha);

    // --- [ glColorMaski ] ---

    /** {@code void glColorMaski(GLuint index, GLboolean r, GLboolean g, GLboolean b, GLboolean a)} */
    public static native void glColorMaski(@NativeType("GLuint") int index, @NativeType("GLboolean") boolean r, @NativeType("GLboolean") boolean g, @NativeType("GLboolean") boolean b, @NativeType("GLboolean") boolean a);

    // --- [ glIsEnabledi ] ---

    /** {@code GLboolean glIsEnabledi(GLenum target, GLuint index)} */
    @NativeType("GLboolean")
    public static native boolean glIsEnabledi(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glDrawElementsBaseVertex ] ---

    /** {@code void glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static native void nglDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex);

    /** {@code void glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    /** {@code void glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertex(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), basevertex);
    }

    /** {@code void glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertex(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
    }

    /** {@code void glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertex(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
    }

    /** {@code void glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertex(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), basevertex);
    }

    // --- [ glDrawRangeElementsBaseVertex ] ---

    /** {@code void glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static native void nglDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex);

    /** {@code void glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
    }

    /** {@code void glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), basevertex);
    }

    /** {@code void glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
    }

    /** {@code void glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ShortBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
    }

    /** {@code void glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") IntBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), basevertex);
    }

    // --- [ glDrawElementsInstancedBaseVertex ] ---

    /** {@code void glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLint basevertex)} */
    public static native void nglDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int instancecount, int basevertex);

    /** {@code void glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertex(mode, count, type, indices, instancecount, basevertex);
    }

    /** {@code void glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertex(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), instancecount, basevertex);
    }

    /** {@code void glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), instancecount, basevertex);
    }

    /** {@code void glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), instancecount, basevertex);
    }

    /** {@code void glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), instancecount, basevertex);
    }

    // --- [ glFramebufferTexture ] ---

    /** {@code void glFramebufferTexture(GLenum target, GLenum attachment, GLuint texture, GLint level)} */
    public static native void glFramebufferTexture(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glPrimitiveBoundingBox ] ---

    /** {@code void glPrimitiveBoundingBox(GLfloat minX, GLfloat minY, GLfloat minZ, GLfloat minW, GLfloat maxX, GLfloat maxY, GLfloat maxZ, GLfloat maxW)} */
    public static native void glPrimitiveBoundingBox(@NativeType("GLfloat") float minX, @NativeType("GLfloat") float minY, @NativeType("GLfloat") float minZ, @NativeType("GLfloat") float minW, @NativeType("GLfloat") float maxX, @NativeType("GLfloat") float maxY, @NativeType("GLfloat") float maxZ, @NativeType("GLfloat") float maxW);

    // --- [ glGetGraphicsResetStatus ] ---

    /** {@code GLenum glGetGraphicsResetStatus(void)} */
    @NativeType("GLenum")
    public static native int glGetGraphicsResetStatus();

    // --- [ glReadnPixels ] ---

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static native void nglReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels);

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        nglReadnPixels(x, y, width, height, format, type, bufSize, pixels);
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        nglReadnPixels(x, y, width, height, format, type, pixels.remaining(), memAddress(pixels));
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 1, memAddress(pixels));
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
    }

    // --- [ glGetnUniformfv ] ---

    /** {@code void glGetnUniformfv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static native void nglGetnUniformfv(int program, int location, int bufSize, long params);

    /** {@code void glGetnUniformfv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        nglGetnUniformfv(program, location, params.remaining(), memAddress(params));
    }

    /** {@code void glGetnUniformfv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    @NativeType("void")
    public static float glGetnUniformf(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetnUniformfv(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformiv ] ---

    /** {@code void glGetnUniformiv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static native void nglGetnUniformiv(int program, int location, int bufSize, long params);

    /** {@code void glGetnUniformiv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        nglGetnUniformiv(program, location, params.remaining(), memAddress(params));
    }

    /** {@code void glGetnUniformiv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    @NativeType("void")
    public static float glGetnUniformi(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetnUniformiv(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformuiv ] ---

    /** {@code void glGetnUniformuiv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static native void nglGetnUniformuiv(int program, int location, int bufSize, long params);

    /** {@code void glGetnUniformuiv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        nglGetnUniformuiv(program, location, params.remaining(), memAddress(params));
    }

    /** {@code void glGetnUniformuiv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    @NativeType("void")
    public static float glGetnUniformui(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetnUniformuiv(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMinSampleShading ] ---

    /** {@code void glMinSampleShading(GLfloat value)} */
    public static native void glMinSampleShading(@NativeType("GLfloat") float value);

    // --- [ glPatchParameteri ] ---

    /** {@code void glPatchParameteri(GLenum pname, GLint value)} */
    public static native void glPatchParameteri(@NativeType("GLenum") int pname, @NativeType("GLint") int value);

    // --- [ glTexParameterIiv ] ---

    /** {@code void glTexParameterIiv(GLenum target, GLenum pname, GLint const * params)} */
    public static native void nglTexParameterIiv(int target, int pname, long params);

    /** {@code void glTexParameterIiv(GLenum target, GLenum pname, GLint const * params)} */
    public static void glTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTexParameterIiv(target, pname, memAddress(params));
    }

    /** {@code void glTexParameterIiv(GLenum target, GLenum pname, GLint const * params)} */
    public static void glTexParameterIi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglTexParameterIiv(target, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTexParameterIuiv ] ---

    /** {@code void glTexParameterIuiv(GLenum target, GLenum pname, GLuint const * params)} */
    public static native void nglTexParameterIuiv(int target, int pname, long params);

    /** {@code void glTexParameterIuiv(GLenum target, GLenum pname, GLuint const * params)} */
    public static void glTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTexParameterIuiv(target, pname, memAddress(params));
    }

    /** {@code void glTexParameterIuiv(GLenum target, GLenum pname, GLuint const * params)} */
    public static void glTexParameterIui(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglTexParameterIuiv(target, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTexParameterIiv ] ---

    /** {@code void glGetTexParameterIiv(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetTexParameterIiv(int target, int pname, long params);

    /** {@code void glGetTexParameterIiv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameterIiv(target, pname, memAddress(params));
    }

    /** {@code void glGetTexParameterIiv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetTexParameterIi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTexParameterIiv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTexParameterIuiv ] ---

    /** {@code void glGetTexParameterIuiv(GLenum target, GLenum pname, GLuint * params)} */
    public static native void nglGetTexParameterIuiv(int target, int pname, long params);

    /** {@code void glGetTexParameterIuiv(GLenum target, GLenum pname, GLuint * params)} */
    public static void glGetTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameterIuiv(target, pname, memAddress(params));
    }

    /** {@code void glGetTexParameterIuiv(GLenum target, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetTexParameterIui(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTexParameterIuiv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glSamplerParameterIiv ] ---

    /** {@code void glSamplerParameterIiv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static native void nglSamplerParameterIiv(int sampler, int pname, long params);

    /** {@code void glSamplerParameterIiv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void glSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameterIiv(sampler, pname, memAddress(params));
    }

    /** {@code void glSamplerParameterIiv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void glSamplerParameterIi(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglSamplerParameterIiv(sampler, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glSamplerParameterIuiv ] ---

    /** {@code void glSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint const * params)} */
    public static native void nglSamplerParameterIuiv(int sampler, int pname, long params);

    /** {@code void glSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint const * params)} */
    public static void glSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameterIuiv(sampler, pname, memAddress(params));
    }

    /** {@code void glSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint const * params)} */
    public static void glSamplerParameterIui(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglSamplerParameterIuiv(sampler, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSamplerParameterIiv ] ---

    /** {@code void glGetSamplerParameterIiv(GLuint sampler, GLenum pname, GLint * params)} */
    public static native void nglGetSamplerParameterIiv(int sampler, int pname, long params);

    /** {@code void glGetSamplerParameterIiv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterIiv(sampler, pname, memAddress(params));
    }

    /** {@code void glGetSamplerParameterIiv(GLuint sampler, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetSamplerParameterIi(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetSamplerParameterIiv(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSamplerParameterIuiv ] ---

    /** {@code void glGetSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint * params)} */
    public static native void nglGetSamplerParameterIuiv(int sampler, int pname, long params);

    /** {@code void glGetSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint * params)} */
    public static void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterIuiv(sampler, pname, memAddress(params));
    }

    /** {@code void glGetSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetSamplerParameterIui(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetSamplerParameterIuiv(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTexBuffer ] ---

    /** {@code void glTexBuffer(GLenum target, GLenum internalformat, GLuint buffer)} */
    public static native void glTexBuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer);

    // --- [ glTexBufferRange ] ---

    /** {@code void glTexBufferRange(GLenum target, GLenum internalformat, GLuint buffer, GLintptr offset, GLsizeiptr size)} */
    public static native void glTexBufferRange(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size);

    // --- [ glTexStorage3DMultisample ] ---

    /** {@code void glTexStorage3DMultisample(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedsamplelocations)} */
    public static native void glTexStorage3DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations);

    /** {@code void glDebugMessageControl(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageControl(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") int[] ids, @NativeType("GLboolean") boolean enabled) {
        long __functionAddress = GLES.getICD().glDebugMessageControl;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(source, type, severity, ids.length, ids, enabled, __functionAddress);
    }

    /** {@code GLuint glGetDebugMessageLog(GLuint count, GLsizei bufsize, GLenum * sources, GLenum * types, GLuint * ids, GLenum * severities, GLsizei * lengths, GLchar * messageLog)} */
    @NativeType("GLuint")
    public static int glGetDebugMessageLog(@NativeType("GLuint") int count, @NativeType("GLenum *") int @Nullable [] sources, @NativeType("GLenum *") int @Nullable [] types, @NativeType("GLuint *") int @Nullable [] ids, @NativeType("GLenum *") int @Nullable [] severities, @NativeType("GLsizei *") int @Nullable [] lengths, @NativeType("GLchar *") @Nullable ByteBuffer messageLog) {
        long __functionAddress = GLES.getICD().glGetDebugMessageLog;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(sources, count);
            checkSafe(types, count);
            checkSafe(ids, count);
            checkSafe(severities, count);
            checkSafe(lengths, count);
        }
        return callPPPPPPI(count, remainingSafe(messageLog), sources, types, ids, severities, lengths, memAddressSafe(messageLog), __functionAddress);
    }

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer label) {
        long __functionAddress = GLES.getICD().glGetObjectLabel;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(identifier, name, label.remaining(), length, memAddress(label), __functionAddress);
    }

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer label) {
        long __functionAddress = GLES.getICD().glGetObjectPtrLabel;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
            checkSafe(length, 1);
        }
        callPPPV(ptr, label.remaining(), length, memAddress(label), __functionAddress);
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        long __functionAddress = GLES.getICD().glReadnPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels.length << 1, pixels, __functionAddress);
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        long __functionAddress = GLES.getICD().glReadnPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels.length << 2, pixels, __functionAddress);
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        long __functionAddress = GLES.getICD().glReadnPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels.length << 2, pixels, __functionAddress);
    }

    /** {@code void glGetnUniformfv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GLES.getICD().glGetnUniformfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** {@code void glGetnUniformiv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GLES.getICD().glGetnUniformiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** {@code void glGetnUniformuiv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GLES.getICD().glGetnUniformuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** {@code void glTexParameterIiv(GLenum target, GLenum pname, GLint const * params)} */
    public static void glTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GLES.getICD().glTexParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glTexParameterIuiv(GLenum target, GLenum pname, GLuint const * params)} */
    public static void glTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GLES.getICD().glTexParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetTexParameterIiv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetTexParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetTexParameterIuiv(GLenum target, GLenum pname, GLuint * params)} */
    public static void glGetTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetTexParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glSamplerParameterIiv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void glSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GLES.getICD().glSamplerParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** {@code void glSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint const * params)} */
    public static void glSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GLES.getICD().glSamplerParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** {@code void glGetSamplerParameterIiv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetSamplerParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** {@code void glGetSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint * params)} */
    public static void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetSamplerParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

}