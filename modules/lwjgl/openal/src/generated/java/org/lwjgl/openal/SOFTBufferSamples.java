/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_buffer_samples.txt">SOFT_buffer_samples</a> extension.
 * 
 * <p>This extension provides a more flexible mechanism for loading buffer data, as well as a method to retrieve buffer data. Unextended OpenAL only provides
 * a method to specify a single buffer format when loading data, which defines the data given by the application. The AL is given leeway in converting the
 * data, so that it is possible or more efficient to use internally. However, there are some drawbacks to this approach:</p>
 * 
 * <ul>
 * <li>The conversion done by the implementation is hidden from the app. This makes it difficult for the app to know what kind of precision it will have,
 * and impossible to request a storage precision.</li>
 * <li>Conversion is not guaranteed, so the application can be restricted in the formats that can be loaded depending on the implementation.</li>
 * </ul>
 * 
 * <p>If the application could specify the internal storage format, as well as use a separate format to specify the incoming data's format, it would allow to
 * add more input formats (signed 8-bit, 32-bit int, and float, for example), with no undue burden placed on the implementation beyond needing some
 * conversion routines. The application can then be assured that many different formats can be loaded, even if storage is restricted to a comparatively
 * small subset.</p>
 * 
 * <p>In addition, unextended OpenAL does not have any methods for updating only a portion of a buffer, nor a method to retrieve the data from a buffer.</p>
 */
public class SOFTBufferSamples {

    /**
     * Accepted by the {@code internalformat} parameter of {@link #alBufferSamplesSOFT BufferSamplesSOFT} (values are shared with standard OpenAL, {@link EXTFloat32 EXT_FLOAT32}, and
     * {@link EXTMCFormats EXT_MCFORMATS}).
     */
    public static final int
        AL_MONO8_SOFT       = 0x1100,
        AL_MONO16_SOFT      = 0x1101,
        AL_MONO32F_SOFT     = 0x10010,
        AL_STEREO8_SOFT     = 0x1102,
        AL_STEREO16_SOFT    = 0x1103,
        AL_STEREO32F_SOFT   = 0x10011,
        AL_QUAD8_SOFT       = 0x1204,
        AL_QUAD16_SOFT      = 0x1205,
        AL_QUAD32F_SOFT     = 0x1206,
        AL_REAR8_SOFT       = 0x1207,
        AL_REAR16_SOFT      = 0x1208,
        AL_REAR32F_SOFT     = 0x1209,
        AL_5POINT1_8_SOFT   = 0x120A,
        AL_5POINT1_16_SOFT  = 0x120B,
        AL_5POINT1_32F_SOFT = 0x120C,
        AL_6POINT1_8_SOFT   = 0x120D,
        AL_6POINT1_16_SOFT  = 0x120E,
        AL_6POINT1_32F_SOFT = 0x120F,
        AL_7POINT1_8_SOFT   = 0x1210,
        AL_7POINT1_16_SOFT  = 0x1211,
        AL_7POINT1_32F_SOFT = 0x1212;

    /** Accepted by the {@code channels} parameter of {@link #alBufferSamplesSOFT BufferSamplesSOFT}, {@link #alBufferSubSamplesSOFT BufferSubSamplesSOFT}, and {@link #alGetBufferSamplesSOFT GetBufferSamplesSOFT}. */
    public static final int
        AL_MONO_SOFT    = 0x1500,
        AL_STEREO_SOFT  = 0x1501,
        AL_QUAD_SOFT    = 0x1502,
        AL_REAR_SOFT    = 0x1503,
        AL_5POINT1_SOFT = 0x1504,
        AL_6POINT1_SOFT = 0x1505,
        AL_7POINT1_SOFT = 0x1506;

    /** Accepted by the {@code type} parameter of {@link #alBufferSamplesSOFT BufferSamplesSOFT}, {@link #alBufferSubSamplesSOFT BufferSubSamplesSOFT}, and {@link #alGetBufferSamplesSOFT GetBufferSamplesSOFT}. */
    public static final int
        AL_BYTE_SOFT           = 0x1400,
        AL_UNSIGNED_BYTE_SOFT  = 0x1401,
        AL_SHORT_SOFT          = 0x1402,
        AL_UNSIGNED_SHORT_SOFT = 0x1403,
        AL_INT_SOFT            = 0x1404,
        AL_UNSIGNED_INT_SOFT   = 0x1405,
        AL_FLOAT_SOFT          = 0x1406,
        AL_DOUBLE_SOFT         = 0x1407,
        AL_BYTE3_SOFT          = 0x1408,
        AL_UNSIGNED_BYTE3_SOFT = 0x1409;

    /** Accepted by the {@code paramName} parameter of {@link AL10#alGetBufferi GetBufferi} and {@link AL11#alGetBufferiv GetBufferiv}. */
    public static final int
        AL_INTERNAL_FORMAT_SOFT = 0x2008,
        AL_BYTE_LENGTH_SOFT     = 0x2009,
        AL_SAMPLE_LENGTH_SOFT   = 0x200A;

    /** Accepted by the {@code paramName} parameter of {@link AL10#alGetBufferf GetBufferf} and {@link AL11#alGetBufferfv GetBufferfv}. */
    public static final int AL_SEC_LENGTH_SOFT = 0x200B;

    /** Accepted by the {@code paramName} parameter of {@link AL10#alGetSourceiv GetSourceiv} and {@link AL10#alGetSourcefv GetSourcefv} (these are the same as in {@link SOFTBufferSubData SOFT_buffer_sub_data}). */
    public static final int
        AL_BYTE_RW_OFFSETS_SOFT   = 0x1031,
        AL_SAMPLE_RW_OFFSETS_SOFT = 0x1032;

    protected SOFTBufferSamples() {
        throw new UnsupportedOperationException();
    }

    // --- [ alBufferSamplesSOFT ] ---

    /** Unsafe version of: {@link #alBufferSamplesSOFT BufferSamplesSOFT} */
    public static void nalBufferSamplesSOFT(int buffer, int samplerate, int internalformat, int samples, int channels, int type, long data) {
        long __functionAddress = AL.getICD().alBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, samplerate, internalformat, samples, channels, type, data, __functionAddress);
    }

    /**
     * @param internalformat one of:<br><table><tr><td>{@link #AL_MONO8_SOFT MONO8_SOFT}</td><td>{@link #AL_MONO16_SOFT MONO16_SOFT}</td><td>{@link #AL_MONO32F_SOFT MONO32F_SOFT}</td><td>{@link #AL_STEREO8_SOFT STEREO8_SOFT}</td><td>{@link #AL_STEREO16_SOFT STEREO16_SOFT}</td><td>{@link #AL_STEREO32F_SOFT STEREO32F_SOFT}</td></tr><tr><td>{@link #AL_QUAD8_SOFT QUAD8_SOFT}</td><td>{@link #AL_QUAD16_SOFT QUAD16_SOFT}</td><td>{@link #AL_QUAD32F_SOFT QUAD32F_SOFT}</td><td>{@link #AL_REAR8_SOFT REAR8_SOFT}</td><td>{@link #AL_REAR16_SOFT REAR16_SOFT}</td><td>{@link #AL_REAR32F_SOFT REAR32F_SOFT}</td></tr><tr><td>{@link #AL_5POINT1_8_SOFT 5POINT1_8_SOFT}</td><td>{@link #AL_5POINT1_16_SOFT 5POINT1_16_SOFT}</td><td>{@link #AL_5POINT1_32F_SOFT 5POINT1_32F_SOFT}</td><td>{@link #AL_6POINT1_8_SOFT 6POINT1_8_SOFT}</td><td>{@link #AL_6POINT1_16_SOFT 6POINT1_16_SOFT}</td><td>{@link #AL_6POINT1_32F_SOFT 6POINT1_32F_SOFT}</td></tr><tr><td>{@link #AL_7POINT1_8_SOFT 7POINT1_8_SOFT}</td><td>{@link #AL_7POINT1_16_SOFT 7POINT1_16_SOFT}</td><td>{@link #AL_7POINT1_32F_SOFT 7POINT1_32F_SOFT}</td></tr></table>
     * @param channels       one of:<br><table><tr><td>{@link #AL_MONO_SOFT MONO_SOFT}</td><td>{@link #AL_STEREO_SOFT STEREO_SOFT}</td><td>{@link #AL_QUAD_SOFT QUAD_SOFT}</td><td>{@link #AL_REAR_SOFT REAR_SOFT}</td><td>{@link #AL_5POINT1_SOFT 5POINT1_SOFT}</td><td>{@link #AL_6POINT1_SOFT 6POINT1_SOFT}</td><td>{@link #AL_7POINT1_SOFT 7POINT1_SOFT}</td></tr></table>
     * @param type           one of:<br><table><tr><td>{@link #AL_BYTE_SOFT BYTE_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}</td><td>{@link #AL_SHORT_SOFT SHORT_SOFT}</td><td>{@link #AL_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}</td><td>{@link #AL_INT_SOFT INT_SOFT}</td><td>{@link #AL_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}</td></tr><tr><td>{@link #AL_FLOAT_SOFT FLOAT_SOFT}</td><td>{@link #AL_DOUBLE_SOFT DOUBLE_SOFT}</td><td>{@link #AL_BYTE3_SOFT BYTE3_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE3_SOFT UNSIGNED_BYTE3_SOFT}</td></tr></table>
     */
    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") ByteBuffer data) {
        nalBufferSamplesSOFT(buffer, samplerate, internalformat, samples, channels, type, memAddress(data));
    }

    /**
     * @param internalformat one of:<br><table><tr><td>{@link #AL_MONO8_SOFT MONO8_SOFT}</td><td>{@link #AL_MONO16_SOFT MONO16_SOFT}</td><td>{@link #AL_MONO32F_SOFT MONO32F_SOFT}</td><td>{@link #AL_STEREO8_SOFT STEREO8_SOFT}</td><td>{@link #AL_STEREO16_SOFT STEREO16_SOFT}</td><td>{@link #AL_STEREO32F_SOFT STEREO32F_SOFT}</td></tr><tr><td>{@link #AL_QUAD8_SOFT QUAD8_SOFT}</td><td>{@link #AL_QUAD16_SOFT QUAD16_SOFT}</td><td>{@link #AL_QUAD32F_SOFT QUAD32F_SOFT}</td><td>{@link #AL_REAR8_SOFT REAR8_SOFT}</td><td>{@link #AL_REAR16_SOFT REAR16_SOFT}</td><td>{@link #AL_REAR32F_SOFT REAR32F_SOFT}</td></tr><tr><td>{@link #AL_5POINT1_8_SOFT 5POINT1_8_SOFT}</td><td>{@link #AL_5POINT1_16_SOFT 5POINT1_16_SOFT}</td><td>{@link #AL_5POINT1_32F_SOFT 5POINT1_32F_SOFT}</td><td>{@link #AL_6POINT1_8_SOFT 6POINT1_8_SOFT}</td><td>{@link #AL_6POINT1_16_SOFT 6POINT1_16_SOFT}</td><td>{@link #AL_6POINT1_32F_SOFT 6POINT1_32F_SOFT}</td></tr><tr><td>{@link #AL_7POINT1_8_SOFT 7POINT1_8_SOFT}</td><td>{@link #AL_7POINT1_16_SOFT 7POINT1_16_SOFT}</td><td>{@link #AL_7POINT1_32F_SOFT 7POINT1_32F_SOFT}</td></tr></table>
     * @param channels       one of:<br><table><tr><td>{@link #AL_MONO_SOFT MONO_SOFT}</td><td>{@link #AL_STEREO_SOFT STEREO_SOFT}</td><td>{@link #AL_QUAD_SOFT QUAD_SOFT}</td><td>{@link #AL_REAR_SOFT REAR_SOFT}</td><td>{@link #AL_5POINT1_SOFT 5POINT1_SOFT}</td><td>{@link #AL_6POINT1_SOFT 6POINT1_SOFT}</td><td>{@link #AL_7POINT1_SOFT 7POINT1_SOFT}</td></tr></table>
     * @param type           one of:<br><table><tr><td>{@link #AL_BYTE_SOFT BYTE_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}</td><td>{@link #AL_SHORT_SOFT SHORT_SOFT}</td><td>{@link #AL_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}</td><td>{@link #AL_INT_SOFT INT_SOFT}</td><td>{@link #AL_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}</td></tr><tr><td>{@link #AL_FLOAT_SOFT FLOAT_SOFT}</td><td>{@link #AL_DOUBLE_SOFT DOUBLE_SOFT}</td><td>{@link #AL_BYTE3_SOFT BYTE3_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE3_SOFT UNSIGNED_BYTE3_SOFT}</td></tr></table>
     */
    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") ShortBuffer data) {
        nalBufferSamplesSOFT(buffer, samplerate, internalformat, samples, channels, type, memAddress(data));
    }

    /**
     * @param internalformat one of:<br><table><tr><td>{@link #AL_MONO8_SOFT MONO8_SOFT}</td><td>{@link #AL_MONO16_SOFT MONO16_SOFT}</td><td>{@link #AL_MONO32F_SOFT MONO32F_SOFT}</td><td>{@link #AL_STEREO8_SOFT STEREO8_SOFT}</td><td>{@link #AL_STEREO16_SOFT STEREO16_SOFT}</td><td>{@link #AL_STEREO32F_SOFT STEREO32F_SOFT}</td></tr><tr><td>{@link #AL_QUAD8_SOFT QUAD8_SOFT}</td><td>{@link #AL_QUAD16_SOFT QUAD16_SOFT}</td><td>{@link #AL_QUAD32F_SOFT QUAD32F_SOFT}</td><td>{@link #AL_REAR8_SOFT REAR8_SOFT}</td><td>{@link #AL_REAR16_SOFT REAR16_SOFT}</td><td>{@link #AL_REAR32F_SOFT REAR32F_SOFT}</td></tr><tr><td>{@link #AL_5POINT1_8_SOFT 5POINT1_8_SOFT}</td><td>{@link #AL_5POINT1_16_SOFT 5POINT1_16_SOFT}</td><td>{@link #AL_5POINT1_32F_SOFT 5POINT1_32F_SOFT}</td><td>{@link #AL_6POINT1_8_SOFT 6POINT1_8_SOFT}</td><td>{@link #AL_6POINT1_16_SOFT 6POINT1_16_SOFT}</td><td>{@link #AL_6POINT1_32F_SOFT 6POINT1_32F_SOFT}</td></tr><tr><td>{@link #AL_7POINT1_8_SOFT 7POINT1_8_SOFT}</td><td>{@link #AL_7POINT1_16_SOFT 7POINT1_16_SOFT}</td><td>{@link #AL_7POINT1_32F_SOFT 7POINT1_32F_SOFT}</td></tr></table>
     * @param channels       one of:<br><table><tr><td>{@link #AL_MONO_SOFT MONO_SOFT}</td><td>{@link #AL_STEREO_SOFT STEREO_SOFT}</td><td>{@link #AL_QUAD_SOFT QUAD_SOFT}</td><td>{@link #AL_REAR_SOFT REAR_SOFT}</td><td>{@link #AL_5POINT1_SOFT 5POINT1_SOFT}</td><td>{@link #AL_6POINT1_SOFT 6POINT1_SOFT}</td><td>{@link #AL_7POINT1_SOFT 7POINT1_SOFT}</td></tr></table>
     * @param type           one of:<br><table><tr><td>{@link #AL_BYTE_SOFT BYTE_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}</td><td>{@link #AL_SHORT_SOFT SHORT_SOFT}</td><td>{@link #AL_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}</td><td>{@link #AL_INT_SOFT INT_SOFT}</td><td>{@link #AL_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}</td></tr><tr><td>{@link #AL_FLOAT_SOFT FLOAT_SOFT}</td><td>{@link #AL_DOUBLE_SOFT DOUBLE_SOFT}</td><td>{@link #AL_BYTE3_SOFT BYTE3_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE3_SOFT UNSIGNED_BYTE3_SOFT}</td></tr></table>
     */
    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") IntBuffer data) {
        nalBufferSamplesSOFT(buffer, samplerate, internalformat, samples, channels, type, memAddress(data));
    }

    /**
     * @param internalformat one of:<br><table><tr><td>{@link #AL_MONO8_SOFT MONO8_SOFT}</td><td>{@link #AL_MONO16_SOFT MONO16_SOFT}</td><td>{@link #AL_MONO32F_SOFT MONO32F_SOFT}</td><td>{@link #AL_STEREO8_SOFT STEREO8_SOFT}</td><td>{@link #AL_STEREO16_SOFT STEREO16_SOFT}</td><td>{@link #AL_STEREO32F_SOFT STEREO32F_SOFT}</td></tr><tr><td>{@link #AL_QUAD8_SOFT QUAD8_SOFT}</td><td>{@link #AL_QUAD16_SOFT QUAD16_SOFT}</td><td>{@link #AL_QUAD32F_SOFT QUAD32F_SOFT}</td><td>{@link #AL_REAR8_SOFT REAR8_SOFT}</td><td>{@link #AL_REAR16_SOFT REAR16_SOFT}</td><td>{@link #AL_REAR32F_SOFT REAR32F_SOFT}</td></tr><tr><td>{@link #AL_5POINT1_8_SOFT 5POINT1_8_SOFT}</td><td>{@link #AL_5POINT1_16_SOFT 5POINT1_16_SOFT}</td><td>{@link #AL_5POINT1_32F_SOFT 5POINT1_32F_SOFT}</td><td>{@link #AL_6POINT1_8_SOFT 6POINT1_8_SOFT}</td><td>{@link #AL_6POINT1_16_SOFT 6POINT1_16_SOFT}</td><td>{@link #AL_6POINT1_32F_SOFT 6POINT1_32F_SOFT}</td></tr><tr><td>{@link #AL_7POINT1_8_SOFT 7POINT1_8_SOFT}</td><td>{@link #AL_7POINT1_16_SOFT 7POINT1_16_SOFT}</td><td>{@link #AL_7POINT1_32F_SOFT 7POINT1_32F_SOFT}</td></tr></table>
     * @param channels       one of:<br><table><tr><td>{@link #AL_MONO_SOFT MONO_SOFT}</td><td>{@link #AL_STEREO_SOFT STEREO_SOFT}</td><td>{@link #AL_QUAD_SOFT QUAD_SOFT}</td><td>{@link #AL_REAR_SOFT REAR_SOFT}</td><td>{@link #AL_5POINT1_SOFT 5POINT1_SOFT}</td><td>{@link #AL_6POINT1_SOFT 6POINT1_SOFT}</td><td>{@link #AL_7POINT1_SOFT 7POINT1_SOFT}</td></tr></table>
     * @param type           one of:<br><table><tr><td>{@link #AL_BYTE_SOFT BYTE_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}</td><td>{@link #AL_SHORT_SOFT SHORT_SOFT}</td><td>{@link #AL_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}</td><td>{@link #AL_INT_SOFT INT_SOFT}</td><td>{@link #AL_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}</td></tr><tr><td>{@link #AL_FLOAT_SOFT FLOAT_SOFT}</td><td>{@link #AL_DOUBLE_SOFT DOUBLE_SOFT}</td><td>{@link #AL_BYTE3_SOFT BYTE3_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE3_SOFT UNSIGNED_BYTE3_SOFT}</td></tr></table>
     */
    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") FloatBuffer data) {
        nalBufferSamplesSOFT(buffer, samplerate, internalformat, samples, channels, type, memAddress(data));
    }

    /**
     * @param internalformat one of:<br><table><tr><td>{@link #AL_MONO8_SOFT MONO8_SOFT}</td><td>{@link #AL_MONO16_SOFT MONO16_SOFT}</td><td>{@link #AL_MONO32F_SOFT MONO32F_SOFT}</td><td>{@link #AL_STEREO8_SOFT STEREO8_SOFT}</td><td>{@link #AL_STEREO16_SOFT STEREO16_SOFT}</td><td>{@link #AL_STEREO32F_SOFT STEREO32F_SOFT}</td></tr><tr><td>{@link #AL_QUAD8_SOFT QUAD8_SOFT}</td><td>{@link #AL_QUAD16_SOFT QUAD16_SOFT}</td><td>{@link #AL_QUAD32F_SOFT QUAD32F_SOFT}</td><td>{@link #AL_REAR8_SOFT REAR8_SOFT}</td><td>{@link #AL_REAR16_SOFT REAR16_SOFT}</td><td>{@link #AL_REAR32F_SOFT REAR32F_SOFT}</td></tr><tr><td>{@link #AL_5POINT1_8_SOFT 5POINT1_8_SOFT}</td><td>{@link #AL_5POINT1_16_SOFT 5POINT1_16_SOFT}</td><td>{@link #AL_5POINT1_32F_SOFT 5POINT1_32F_SOFT}</td><td>{@link #AL_6POINT1_8_SOFT 6POINT1_8_SOFT}</td><td>{@link #AL_6POINT1_16_SOFT 6POINT1_16_SOFT}</td><td>{@link #AL_6POINT1_32F_SOFT 6POINT1_32F_SOFT}</td></tr><tr><td>{@link #AL_7POINT1_8_SOFT 7POINT1_8_SOFT}</td><td>{@link #AL_7POINT1_16_SOFT 7POINT1_16_SOFT}</td><td>{@link #AL_7POINT1_32F_SOFT 7POINT1_32F_SOFT}</td></tr></table>
     * @param channels       one of:<br><table><tr><td>{@link #AL_MONO_SOFT MONO_SOFT}</td><td>{@link #AL_STEREO_SOFT STEREO_SOFT}</td><td>{@link #AL_QUAD_SOFT QUAD_SOFT}</td><td>{@link #AL_REAR_SOFT REAR_SOFT}</td><td>{@link #AL_5POINT1_SOFT 5POINT1_SOFT}</td><td>{@link #AL_6POINT1_SOFT 6POINT1_SOFT}</td><td>{@link #AL_7POINT1_SOFT 7POINT1_SOFT}</td></tr></table>
     * @param type           one of:<br><table><tr><td>{@link #AL_BYTE_SOFT BYTE_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}</td><td>{@link #AL_SHORT_SOFT SHORT_SOFT}</td><td>{@link #AL_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}</td><td>{@link #AL_INT_SOFT INT_SOFT}</td><td>{@link #AL_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}</td></tr><tr><td>{@link #AL_FLOAT_SOFT FLOAT_SOFT}</td><td>{@link #AL_DOUBLE_SOFT DOUBLE_SOFT}</td><td>{@link #AL_BYTE3_SOFT BYTE3_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE3_SOFT UNSIGNED_BYTE3_SOFT}</td></tr></table>
     */
    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") DoubleBuffer data) {
        nalBufferSamplesSOFT(buffer, samplerate, internalformat, samples, channels, type, memAddress(data));
    }

    // --- [ alBufferSubSamplesSOFT ] ---

    /** Unsafe version of: {@link #alBufferSubSamplesSOFT BufferSubSamplesSOFT} */
    public static void nalBufferSubSamplesSOFT(int buffer, int offset, int samples, int channels, int type, long data) {
        long __functionAddress = AL.getICD().alBufferSubSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    /**
     * @param channels one of:<br><table><tr><td>{@link #AL_MONO_SOFT MONO_SOFT}</td><td>{@link #AL_STEREO_SOFT STEREO_SOFT}</td><td>{@link #AL_QUAD_SOFT QUAD_SOFT}</td><td>{@link #AL_REAR_SOFT REAR_SOFT}</td><td>{@link #AL_5POINT1_SOFT 5POINT1_SOFT}</td><td>{@link #AL_6POINT1_SOFT 6POINT1_SOFT}</td><td>{@link #AL_7POINT1_SOFT 7POINT1_SOFT}</td></tr></table>
     * @param type     one of:<br><table><tr><td>{@link #AL_BYTE_SOFT BYTE_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}</td><td>{@link #AL_SHORT_SOFT SHORT_SOFT}</td><td>{@link #AL_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}</td><td>{@link #AL_INT_SOFT INT_SOFT}</td><td>{@link #AL_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}</td></tr><tr><td>{@link #AL_FLOAT_SOFT FLOAT_SOFT}</td><td>{@link #AL_DOUBLE_SOFT DOUBLE_SOFT}</td><td>{@link #AL_BYTE3_SOFT BYTE3_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE3_SOFT UNSIGNED_BYTE3_SOFT}</td></tr></table>
     */
    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") ByteBuffer data) {
        nalBufferSubSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    /**
     * @param channels one of:<br><table><tr><td>{@link #AL_MONO_SOFT MONO_SOFT}</td><td>{@link #AL_STEREO_SOFT STEREO_SOFT}</td><td>{@link #AL_QUAD_SOFT QUAD_SOFT}</td><td>{@link #AL_REAR_SOFT REAR_SOFT}</td><td>{@link #AL_5POINT1_SOFT 5POINT1_SOFT}</td><td>{@link #AL_6POINT1_SOFT 6POINT1_SOFT}</td><td>{@link #AL_7POINT1_SOFT 7POINT1_SOFT}</td></tr></table>
     * @param type     one of:<br><table><tr><td>{@link #AL_BYTE_SOFT BYTE_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}</td><td>{@link #AL_SHORT_SOFT SHORT_SOFT}</td><td>{@link #AL_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}</td><td>{@link #AL_INT_SOFT INT_SOFT}</td><td>{@link #AL_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}</td></tr><tr><td>{@link #AL_FLOAT_SOFT FLOAT_SOFT}</td><td>{@link #AL_DOUBLE_SOFT DOUBLE_SOFT}</td><td>{@link #AL_BYTE3_SOFT BYTE3_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE3_SOFT UNSIGNED_BYTE3_SOFT}</td></tr></table>
     */
    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") ShortBuffer data) {
        nalBufferSubSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    /**
     * @param channels one of:<br><table><tr><td>{@link #AL_MONO_SOFT MONO_SOFT}</td><td>{@link #AL_STEREO_SOFT STEREO_SOFT}</td><td>{@link #AL_QUAD_SOFT QUAD_SOFT}</td><td>{@link #AL_REAR_SOFT REAR_SOFT}</td><td>{@link #AL_5POINT1_SOFT 5POINT1_SOFT}</td><td>{@link #AL_6POINT1_SOFT 6POINT1_SOFT}</td><td>{@link #AL_7POINT1_SOFT 7POINT1_SOFT}</td></tr></table>
     * @param type     one of:<br><table><tr><td>{@link #AL_BYTE_SOFT BYTE_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}</td><td>{@link #AL_SHORT_SOFT SHORT_SOFT}</td><td>{@link #AL_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}</td><td>{@link #AL_INT_SOFT INT_SOFT}</td><td>{@link #AL_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}</td></tr><tr><td>{@link #AL_FLOAT_SOFT FLOAT_SOFT}</td><td>{@link #AL_DOUBLE_SOFT DOUBLE_SOFT}</td><td>{@link #AL_BYTE3_SOFT BYTE3_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE3_SOFT UNSIGNED_BYTE3_SOFT}</td></tr></table>
     */
    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") IntBuffer data) {
        nalBufferSubSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    /**
     * @param channels one of:<br><table><tr><td>{@link #AL_MONO_SOFT MONO_SOFT}</td><td>{@link #AL_STEREO_SOFT STEREO_SOFT}</td><td>{@link #AL_QUAD_SOFT QUAD_SOFT}</td><td>{@link #AL_REAR_SOFT REAR_SOFT}</td><td>{@link #AL_5POINT1_SOFT 5POINT1_SOFT}</td><td>{@link #AL_6POINT1_SOFT 6POINT1_SOFT}</td><td>{@link #AL_7POINT1_SOFT 7POINT1_SOFT}</td></tr></table>
     * @param type     one of:<br><table><tr><td>{@link #AL_BYTE_SOFT BYTE_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}</td><td>{@link #AL_SHORT_SOFT SHORT_SOFT}</td><td>{@link #AL_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}</td><td>{@link #AL_INT_SOFT INT_SOFT}</td><td>{@link #AL_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}</td></tr><tr><td>{@link #AL_FLOAT_SOFT FLOAT_SOFT}</td><td>{@link #AL_DOUBLE_SOFT DOUBLE_SOFT}</td><td>{@link #AL_BYTE3_SOFT BYTE3_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE3_SOFT UNSIGNED_BYTE3_SOFT}</td></tr></table>
     */
    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") FloatBuffer data) {
        nalBufferSubSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    /**
     * @param channels one of:<br><table><tr><td>{@link #AL_MONO_SOFT MONO_SOFT}</td><td>{@link #AL_STEREO_SOFT STEREO_SOFT}</td><td>{@link #AL_QUAD_SOFT QUAD_SOFT}</td><td>{@link #AL_REAR_SOFT REAR_SOFT}</td><td>{@link #AL_5POINT1_SOFT 5POINT1_SOFT}</td><td>{@link #AL_6POINT1_SOFT 6POINT1_SOFT}</td><td>{@link #AL_7POINT1_SOFT 7POINT1_SOFT}</td></tr></table>
     * @param type     one of:<br><table><tr><td>{@link #AL_BYTE_SOFT BYTE_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}</td><td>{@link #AL_SHORT_SOFT SHORT_SOFT}</td><td>{@link #AL_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}</td><td>{@link #AL_INT_SOFT INT_SOFT}</td><td>{@link #AL_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}</td></tr><tr><td>{@link #AL_FLOAT_SOFT FLOAT_SOFT}</td><td>{@link #AL_DOUBLE_SOFT DOUBLE_SOFT}</td><td>{@link #AL_BYTE3_SOFT BYTE3_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE3_SOFT UNSIGNED_BYTE3_SOFT}</td></tr></table>
     */
    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") DoubleBuffer data) {
        nalBufferSubSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    // --- [ alGetBufferSamplesSOFT ] ---

    /** Unsafe version of: {@link #alGetBufferSamplesSOFT GetBufferSamplesSOFT} */
    public static void nalGetBufferSamplesSOFT(int buffer, int offset, int samples, int channels, int type, long data) {
        long __functionAddress = AL.getICD().alGetBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    /**
     * @param channels one of:<br><table><tr><td>{@link #AL_MONO_SOFT MONO_SOFT}</td><td>{@link #AL_STEREO_SOFT STEREO_SOFT}</td><td>{@link #AL_QUAD_SOFT QUAD_SOFT}</td><td>{@link #AL_REAR_SOFT REAR_SOFT}</td><td>{@link #AL_5POINT1_SOFT 5POINT1_SOFT}</td><td>{@link #AL_6POINT1_SOFT 6POINT1_SOFT}</td><td>{@link #AL_7POINT1_SOFT 7POINT1_SOFT}</td></tr></table>
     * @param type     one of:<br><table><tr><td>{@link #AL_BYTE_SOFT BYTE_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}</td><td>{@link #AL_SHORT_SOFT SHORT_SOFT}</td><td>{@link #AL_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}</td><td>{@link #AL_INT_SOFT INT_SOFT}</td><td>{@link #AL_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}</td></tr><tr><td>{@link #AL_FLOAT_SOFT FLOAT_SOFT}</td><td>{@link #AL_DOUBLE_SOFT DOUBLE_SOFT}</td><td>{@link #AL_BYTE3_SOFT BYTE3_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE3_SOFT UNSIGNED_BYTE3_SOFT}</td></tr></table>
     */
    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") ByteBuffer data) {
        nalGetBufferSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    /**
     * @param channels one of:<br><table><tr><td>{@link #AL_MONO_SOFT MONO_SOFT}</td><td>{@link #AL_STEREO_SOFT STEREO_SOFT}</td><td>{@link #AL_QUAD_SOFT QUAD_SOFT}</td><td>{@link #AL_REAR_SOFT REAR_SOFT}</td><td>{@link #AL_5POINT1_SOFT 5POINT1_SOFT}</td><td>{@link #AL_6POINT1_SOFT 6POINT1_SOFT}</td><td>{@link #AL_7POINT1_SOFT 7POINT1_SOFT}</td></tr></table>
     * @param type     one of:<br><table><tr><td>{@link #AL_BYTE_SOFT BYTE_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}</td><td>{@link #AL_SHORT_SOFT SHORT_SOFT}</td><td>{@link #AL_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}</td><td>{@link #AL_INT_SOFT INT_SOFT}</td><td>{@link #AL_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}</td></tr><tr><td>{@link #AL_FLOAT_SOFT FLOAT_SOFT}</td><td>{@link #AL_DOUBLE_SOFT DOUBLE_SOFT}</td><td>{@link #AL_BYTE3_SOFT BYTE3_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE3_SOFT UNSIGNED_BYTE3_SOFT}</td></tr></table>
     */
    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") ShortBuffer data) {
        nalGetBufferSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    /**
     * @param channels one of:<br><table><tr><td>{@link #AL_MONO_SOFT MONO_SOFT}</td><td>{@link #AL_STEREO_SOFT STEREO_SOFT}</td><td>{@link #AL_QUAD_SOFT QUAD_SOFT}</td><td>{@link #AL_REAR_SOFT REAR_SOFT}</td><td>{@link #AL_5POINT1_SOFT 5POINT1_SOFT}</td><td>{@link #AL_6POINT1_SOFT 6POINT1_SOFT}</td><td>{@link #AL_7POINT1_SOFT 7POINT1_SOFT}</td></tr></table>
     * @param type     one of:<br><table><tr><td>{@link #AL_BYTE_SOFT BYTE_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}</td><td>{@link #AL_SHORT_SOFT SHORT_SOFT}</td><td>{@link #AL_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}</td><td>{@link #AL_INT_SOFT INT_SOFT}</td><td>{@link #AL_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}</td></tr><tr><td>{@link #AL_FLOAT_SOFT FLOAT_SOFT}</td><td>{@link #AL_DOUBLE_SOFT DOUBLE_SOFT}</td><td>{@link #AL_BYTE3_SOFT BYTE3_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE3_SOFT UNSIGNED_BYTE3_SOFT}</td></tr></table>
     */
    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") IntBuffer data) {
        nalGetBufferSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    /**
     * @param channels one of:<br><table><tr><td>{@link #AL_MONO_SOFT MONO_SOFT}</td><td>{@link #AL_STEREO_SOFT STEREO_SOFT}</td><td>{@link #AL_QUAD_SOFT QUAD_SOFT}</td><td>{@link #AL_REAR_SOFT REAR_SOFT}</td><td>{@link #AL_5POINT1_SOFT 5POINT1_SOFT}</td><td>{@link #AL_6POINT1_SOFT 6POINT1_SOFT}</td><td>{@link #AL_7POINT1_SOFT 7POINT1_SOFT}</td></tr></table>
     * @param type     one of:<br><table><tr><td>{@link #AL_BYTE_SOFT BYTE_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}</td><td>{@link #AL_SHORT_SOFT SHORT_SOFT}</td><td>{@link #AL_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}</td><td>{@link #AL_INT_SOFT INT_SOFT}</td><td>{@link #AL_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}</td></tr><tr><td>{@link #AL_FLOAT_SOFT FLOAT_SOFT}</td><td>{@link #AL_DOUBLE_SOFT DOUBLE_SOFT}</td><td>{@link #AL_BYTE3_SOFT BYTE3_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE3_SOFT UNSIGNED_BYTE3_SOFT}</td></tr></table>
     */
    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") FloatBuffer data) {
        nalGetBufferSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    /**
     * @param channels one of:<br><table><tr><td>{@link #AL_MONO_SOFT MONO_SOFT}</td><td>{@link #AL_STEREO_SOFT STEREO_SOFT}</td><td>{@link #AL_QUAD_SOFT QUAD_SOFT}</td><td>{@link #AL_REAR_SOFT REAR_SOFT}</td><td>{@link #AL_5POINT1_SOFT 5POINT1_SOFT}</td><td>{@link #AL_6POINT1_SOFT 6POINT1_SOFT}</td><td>{@link #AL_7POINT1_SOFT 7POINT1_SOFT}</td></tr></table>
     * @param type     one of:<br><table><tr><td>{@link #AL_BYTE_SOFT BYTE_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}</td><td>{@link #AL_SHORT_SOFT SHORT_SOFT}</td><td>{@link #AL_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}</td><td>{@link #AL_INT_SOFT INT_SOFT}</td><td>{@link #AL_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}</td></tr><tr><td>{@link #AL_FLOAT_SOFT FLOAT_SOFT}</td><td>{@link #AL_DOUBLE_SOFT DOUBLE_SOFT}</td><td>{@link #AL_BYTE3_SOFT BYTE3_SOFT}</td><td>{@link #AL_UNSIGNED_BYTE3_SOFT UNSIGNED_BYTE3_SOFT}</td></tr></table>
     */
    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") DoubleBuffer data) {
        nalGetBufferSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    // --- [ alIsBufferFormatSupportedSOFT ] ---

    @NativeType("ALboolean")
    public static boolean alIsBufferFormatSupportedSOFT(@NativeType("ALenum") int format) {
        long __functionAddress = AL.getICD().alIsBufferFormatSupportedSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeZ(format, __functionAddress);
    }

    /** Array version of: {@link #alBufferSamplesSOFT BufferSamplesSOFT} */
    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") short[] data) {
        long __functionAddress = AL.getICD().alBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, samplerate, internalformat, samples, channels, type, data, __functionAddress);
    }

    /** Array version of: {@link #alBufferSamplesSOFT BufferSamplesSOFT} */
    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") int[] data) {
        long __functionAddress = AL.getICD().alBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, samplerate, internalformat, samples, channels, type, data, __functionAddress);
    }

    /** Array version of: {@link #alBufferSamplesSOFT BufferSamplesSOFT} */
    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") float[] data) {
        long __functionAddress = AL.getICD().alBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, samplerate, internalformat, samples, channels, type, data, __functionAddress);
    }

    /** Array version of: {@link #alBufferSamplesSOFT BufferSamplesSOFT} */
    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") double[] data) {
        long __functionAddress = AL.getICD().alBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, samplerate, internalformat, samples, channels, type, data, __functionAddress);
    }

    /** Array version of: {@link #alBufferSubSamplesSOFT BufferSubSamplesSOFT} */
    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") short[] data) {
        long __functionAddress = AL.getICD().alBufferSubSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    /** Array version of: {@link #alBufferSubSamplesSOFT BufferSubSamplesSOFT} */
    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") int[] data) {
        long __functionAddress = AL.getICD().alBufferSubSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    /** Array version of: {@link #alBufferSubSamplesSOFT BufferSubSamplesSOFT} */
    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") float[] data) {
        long __functionAddress = AL.getICD().alBufferSubSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    /** Array version of: {@link #alBufferSubSamplesSOFT BufferSubSamplesSOFT} */
    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") double[] data) {
        long __functionAddress = AL.getICD().alBufferSubSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    /** Array version of: {@link #alGetBufferSamplesSOFT GetBufferSamplesSOFT} */
    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") short[] data) {
        long __functionAddress = AL.getICD().alGetBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    /** Array version of: {@link #alGetBufferSamplesSOFT GetBufferSamplesSOFT} */
    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") int[] data) {
        long __functionAddress = AL.getICD().alGetBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    /** Array version of: {@link #alGetBufferSamplesSOFT GetBufferSamplesSOFT} */
    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") float[] data) {
        long __functionAddress = AL.getICD().alGetBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    /** Array version of: {@link #alGetBufferSamplesSOFT GetBufferSamplesSOFT} */
    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") double[] data) {
        long __functionAddress = AL.getICD().alGetBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

}