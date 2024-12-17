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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTEfx {

    public static final int
        ALC_EFX_MAJOR_VERSION   = 0x20001,
        ALC_EFX_MINOR_VERSION   = 0x20002,
        ALC_MAX_AUXILIARY_SENDS = 0x20003;

    public static final int AL_METERS_PER_UNIT = 0x20004;

    public static final int
        AL_DIRECT_FILTER                     = 0x20005,
        AL_AUXILIARY_SEND_FILTER             = 0x20006,
        AL_AIR_ABSORPTION_FACTOR             = 0x20007,
        AL_ROOM_ROLLOFF_FACTOR               = 0x20008,
        AL_CONE_OUTER_GAINHF                 = 0x20009,
        AL_DIRECT_FILTER_GAINHF_AUTO         = 0x2000A,
        AL_AUXILIARY_SEND_FILTER_GAIN_AUTO   = 0x2000B,
        AL_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 0x2000C;

    public static final int
        AL_EFFECTSLOT_NULL                = 0x0,
        AL_EFFECTSLOT_EFFECT              = 0x1,
        AL_EFFECTSLOT_GAIN                = 0x2,
        AL_EFFECTSLOT_AUXILIARY_SEND_AUTO = 0x3;

    public static final int
        AL_REVERB_DENSITY               = 0x1,
        AL_REVERB_DIFFUSION             = 0x2,
        AL_REVERB_GAIN                  = 0x3,
        AL_REVERB_GAINHF                = 0x4,
        AL_REVERB_DECAY_TIME            = 0x5,
        AL_REVERB_DECAY_HFRATIO         = 0x6,
        AL_REVERB_REFLECTIONS_GAIN      = 0x7,
        AL_REVERB_REFLECTIONS_DELAY     = 0x8,
        AL_REVERB_LATE_REVERB_GAIN      = 0x9,
        AL_REVERB_LATE_REVERB_DELAY     = 0xA,
        AL_REVERB_AIR_ABSORPTION_GAINHF = 0xB,
        AL_REVERB_ROOM_ROLLOFF_FACTOR   = 0xC,
        AL_REVERB_DECAY_HFLIMIT         = 0xD;

    public static final int
        AL_EAXREVERB_DENSITY               = 0x1,
        AL_EAXREVERB_DIFFUSION             = 0x2,
        AL_EAXREVERB_GAIN                  = 0x3,
        AL_EAXREVERB_GAINHF                = 0x4,
        AL_EAXREVERB_GAINLF                = 0x5,
        AL_EAXREVERB_DECAY_TIME            = 0x6,
        AL_EAXREVERB_DECAY_HFRATIO         = 0x7,
        AL_EAXREVERB_DECAY_LFRATIO         = 0x8,
        AL_EAXREVERB_REFLECTIONS_GAIN      = 0x9,
        AL_EAXREVERB_REFLECTIONS_DELAY     = 0xA,
        AL_EAXREVERB_REFLECTIONS_PAN       = 0xB,
        AL_EAXREVERB_LATE_REVERB_GAIN      = 0xC,
        AL_EAXREVERB_LATE_REVERB_DELAY     = 0xD,
        AL_EAXREVERB_LATE_REVERB_PAN       = 0xE,
        AL_EAXREVERB_ECHO_TIME             = 0xF,
        AL_EAXREVERB_ECHO_DEPTH            = 0x10,
        AL_EAXREVERB_MODULATION_TIME       = 0x11,
        AL_EAXREVERB_MODULATION_DEPTH      = 0x12,
        AL_EAXREVERB_AIR_ABSORPTION_GAINHF = 0x13,
        AL_EAXREVERB_HFREFERENCE           = 0x14,
        AL_EAXREVERB_LFREFERENCE           = 0x15,
        AL_EAXREVERB_ROOM_ROLLOFF_FACTOR   = 0x16,
        AL_EAXREVERB_DECAY_HFLIMIT         = 0x17;

    public static final int
        AL_CHORUS_WAVEFORM = 0x1,
        AL_CHORUS_PHASE    = 0x2,
        AL_CHORUS_RATE     = 0x3,
        AL_CHORUS_DEPTH    = 0x4,
        AL_CHORUS_FEEDBACK = 0x5,
        AL_CHORUS_DELAY    = 0x6;

    public static final int
        AL_DISTORTION_EDGE           = 0x1,
        AL_DISTORTION_GAIN           = 0x2,
        AL_DISTORTION_LOWPASS_CUTOFF = 0x3,
        AL_DISTORTION_EQCENTER       = 0x4,
        AL_DISTORTION_EQBANDWIDTH    = 0x5;

    public static final int
        AL_ECHO_DELAY    = 0x1,
        AL_ECHO_LRDELAY  = 0x2,
        AL_ECHO_DAMPING  = 0x3,
        AL_ECHO_FEEDBACK = 0x4,
        AL_ECHO_SPREAD   = 0x5;

    public static final int
        AL_FLANGER_WAVEFORM = 0x1,
        AL_FLANGER_PHASE    = 0x2,
        AL_FLANGER_RATE     = 0x3,
        AL_FLANGER_DEPTH    = 0x4,
        AL_FLANGER_FEEDBACK = 0x5,
        AL_FLANGER_DELAY    = 0x6;

    public static final int
        AL_FREQUENCY_SHIFTER_FREQUENCY       = 0x1,
        AL_FREQUENCY_SHIFTER_LEFT_DIRECTION  = 0x2,
        AL_FREQUENCY_SHIFTER_RIGHT_DIRECTION = 0x3;

    public static final int
        AL_VOCMORPHER_PHONEMEA               = 0x1,
        AL_VOCMORPHER_PHONEMEA_COARSE_TUNING = 0x2,
        AL_VOCMORPHER_PHONEMEB               = 0x3,
        AL_VOCMORPHER_PHONEMEB_COARSE_TUNING = 0x4,
        AL_VOCMORPHER_WAVEFORM               = 0x5,
        AL_VOCMORPHER_RATE                   = 0x6;

    public static final int
        AL_PITCH_SHIFTER_COARSE_TUNE = 0x1,
        AL_PITCH_SHIFTER_FINE_TUNE   = 0x2;

    public static final int
        AL_RING_MODULATOR_FREQUENCY       = 0x1,
        AL_RING_MODULATOR_HIGHPASS_CUTOFF = 0x2,
        AL_RING_MODULATOR_WAVEFORM        = 0x3;

    public static final int
        AL_AUTOWAH_ATTACK_TIME  = 0x1,
        AL_AUTOWAH_RELEASE_TIME = 0x2,
        AL_AUTOWAH_RESONANCE    = 0x3,
        AL_AUTOWAH_PEAK_GAIN    = 0x4;

    public static final int AL_COMPRESSOR_ONOFF = 0x1;

    public static final int
        AL_EQUALIZER_LOW_GAIN    = 0x1,
        AL_EQUALIZER_LOW_CUTOFF  = 0x2,
        AL_EQUALIZER_MID1_GAIN   = 0x3,
        AL_EQUALIZER_MID1_CENTER = 0x4,
        AL_EQUALIZER_MID1_WIDTH  = 0x5,
        AL_EQUALIZER_MID2_GAIN   = 0x6,
        AL_EQUALIZER_MID2_CENTER = 0x7,
        AL_EQUALIZER_MID2_WIDTH  = 0x8,
        AL_EQUALIZER_HIGH_GAIN   = 0x9,
        AL_EQUALIZER_HIGH_CUTOFF = 0xA;

    public static final int
        AL_EFFECT_FIRST_PARAMETER = 0x0,
        AL_EFFECT_LAST_PARAMETER  = 0x8000,
        AL_EFFECT_TYPE            = 0x8001;

    public static final int
        AL_EFFECT_NULL              = 0x0,
        AL_EFFECT_REVERB            = 0x1,
        AL_EFFECT_CHORUS            = 0x2,
        AL_EFFECT_DISTORTION        = 0x3,
        AL_EFFECT_ECHO              = 0x4,
        AL_EFFECT_FLANGER           = 0x5,
        AL_EFFECT_FREQUENCY_SHIFTER = 0x6,
        AL_EFFECT_VOCAL_MORPHER     = 0x7,
        AL_EFFECT_PITCH_SHIFTER     = 0x8,
        AL_EFFECT_RING_MODULATOR    = 0x9,
        AL_EFFECT_AUTOWAH           = 0xA,
        AL_EFFECT_COMPRESSOR        = 0xB,
        AL_EFFECT_EQUALIZER         = 0xC,
        AL_EFFECT_EAXREVERB         = 0x8000;

    public static final int
        AL_LOWPASS_GAIN   = 0x1,
        AL_LOWPASS_GAINHF = 0x2;

    public static final int
        AL_HIGHPASS_GAIN   = 0x1,
        AL_HIGHPASS_GAINLF = 0x2;

    public static final int
        AL_BANDPASS_GAIN   = 0x1,
        AL_BANDPASS_GAINLF = 0x2,
        AL_BANDPASS_GAINHF = 0x3;

    public static final int
        AL_FILTER_FIRST_PARAMETER = 0x0,
        AL_FILTER_LAST_PARAMETER  = 0x8000,
        AL_FILTER_TYPE            = 0x8001;

    public static final int
        AL_FILTER_NULL     = 0x0,
        AL_FILTER_LOWPASS  = 0x1,
        AL_FILTER_HIGHPASS = 0x2,
        AL_FILTER_BANDPASS = 0x3;

    public static final float
        AL_MIN_AIR_ABSORPTION_FACTOR     = 0.0f,
        AL_MAX_AIR_ABSORPTION_FACTOR     = 10.0f,
        AL_DEFAULT_AIR_ABSORPTION_FACTOR = 0.0f,
        AL_MIN_ROOM_ROLLOFF_FACTOR       = 0.0f,
        AL_MAX_ROOM_ROLLOFF_FACTOR       = 10.0f,
        AL_DEFAULT_ROOM_ROLLOFF_FACTOR   = 0.0f,
        AL_MIN_CONE_OUTER_GAINHF         = 0.0f,
        AL_MAX_CONE_OUTER_GAINHF         = 1.0f,
        AL_DEFAULT_CONE_OUTER_GAINHF     = 1.0f;

    public static final int
        AL_MIN_DIRECT_FILTER_GAINHF_AUTO             = 0x0,
        AL_MAX_DIRECT_FILTER_GAINHF_AUTO             = 0x1,
        AL_DEFAULT_DIRECT_FILTER_GAINHF_AUTO         = 0x1,
        AL_MIN_AUXILIARY_SEND_FILTER_GAIN_AUTO       = 0x0,
        AL_MAX_AUXILIARY_SEND_FILTER_GAIN_AUTO       = 0x1,
        AL_DEFAULT_AUXILIARY_SEND_FILTER_GAIN_AUTO   = 0x1,
        AL_MIN_AUXILIARY_SEND_FILTER_GAINHF_AUTO     = 0x0,
        AL_MAX_AUXILIARY_SEND_FILTER_GAINHF_AUTO     = 0x1,
        AL_DEFAULT_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 0x1;

    public static final float
        AL_MIN_METERS_PER_UNIT     = 0x0.000002P-126f,
        AL_MAX_METERS_PER_UNIT     = 0x1.fffffeP+127f,
        AL_DEFAULT_METERS_PER_UNIT = 1.0f;

    public static final float
        AL_REVERB_MIN_DENSITY                   = 0.0f,
        AL_REVERB_MAX_DENSITY                   = 1.0f,
        AL_REVERB_DEFAULT_DENSITY               = 1.0f,
        AL_REVERB_MIN_DIFFUSION                 = 0.0f,
        AL_REVERB_MAX_DIFFUSION                 = 1.0f,
        AL_REVERB_DEFAULT_DIFFUSION             = 1.0f,
        AL_REVERB_MIN_GAIN                      = 0.0f,
        AL_REVERB_MAX_GAIN                      = 1.0f,
        AL_REVERB_DEFAULT_GAIN                  = 0.32f,
        AL_REVERB_MIN_GAINHF                    = 0.0f,
        AL_REVERB_MAX_GAINHF                    = 1.0f,
        AL_REVERB_DEFAULT_GAINHF                = 0.89f,
        AL_REVERB_MIN_DECAY_TIME                = 0.1f,
        AL_REVERB_MAX_DECAY_TIME                = 20.0f,
        AL_REVERB_DEFAULT_DECAY_TIME            = 1.49f,
        AL_REVERB_MIN_DECAY_HFRATIO             = 0.1f,
        AL_REVERB_MAX_DECAY_HFRATIO             = 2.0f,
        AL_REVERB_DEFAULT_DECAY_HFRATIO         = 0.83f,
        AL_REVERB_MIN_REFLECTIONS_GAIN          = 0.0f,
        AL_REVERB_MAX_REFLECTIONS_GAIN          = 3.16f,
        AL_REVERB_DEFAULT_REFLECTIONS_GAIN      = 0.05f,
        AL_REVERB_MIN_REFLECTIONS_DELAY         = 0.0f,
        AL_REVERB_MAX_REFLECTIONS_DELAY         = 0.3f,
        AL_REVERB_DEFAULT_REFLECTIONS_DELAY     = 0.007f,
        AL_REVERB_MIN_LATE_REVERB_GAIN          = 0.0f,
        AL_REVERB_MAX_LATE_REVERB_GAIN          = 10.0f,
        AL_REVERB_DEFAULT_LATE_REVERB_GAIN      = 1.26f,
        AL_REVERB_MIN_LATE_REVERB_DELAY         = 0.0f,
        AL_REVERB_MAX_LATE_REVERB_DELAY         = 0.1f,
        AL_REVERB_DEFAULT_LATE_REVERB_DELAY     = 0.011f,
        AL_REVERB_MIN_AIR_ABSORPTION_GAINHF     = 0.892f,
        AL_REVERB_MAX_AIR_ABSORPTION_GAINHF     = 1.0f,
        AL_REVERB_DEFAULT_AIR_ABSORPTION_GAINHF = 0.994f,
        AL_REVERB_MIN_ROOM_ROLLOFF_FACTOR       = 0.0f,
        AL_REVERB_MAX_ROOM_ROLLOFF_FACTOR       = 10.0f,
        AL_REVERB_DEFAULT_ROOM_ROLLOFF_FACTOR   = 0.0f;

    public static final int
        AL_REVERB_MIN_DECAY_HFLIMIT     = 0x0,
        AL_REVERB_MAX_DECAY_HFLIMIT     = 0x1,
        AL_REVERB_DEFAULT_DECAY_HFLIMIT = 0x1;

    public static final float
        AL_EAXREVERB_MIN_DENSITY                   = 0.0f,
        AL_EAXREVERB_MAX_DENSITY                   = 1.0f,
        AL_EAXREVERB_DEFAULT_DENSITY               = 1.0f,
        AL_EAXREVERB_MIN_DIFFUSION                 = 0.0f,
        AL_EAXREVERB_MAX_DIFFUSION                 = 1.0f,
        AL_EAXREVERB_DEFAULT_DIFFUSION             = 1.0f,
        AL_EAXREVERB_MIN_GAIN                      = 0.0f,
        AL_EAXREVERB_MAX_GAIN                      = 1.0f,
        AL_EAXREVERB_DEFAULT_GAIN                  = 0.32f,
        AL_EAXREVERB_MIN_GAINHF                    = 0.0f,
        AL_EAXREVERB_MAX_GAINHF                    = 1.0f,
        AL_EAXREVERB_DEFAULT_GAINHF                = 0.89f,
        AL_EAXREVERB_MIN_GAINLF                    = 0.0f,
        AL_EAXREVERB_MAX_GAINLF                    = 1.0f,
        AL_EAXREVERB_DEFAULT_GAINLF                = 1.0f,
        AL_EAXREVERB_MIN_DECAY_TIME                = 0.1f,
        AL_EAXREVERB_MAX_DECAY_TIME                = 20.0f,
        AL_EAXREVERB_DEFAULT_DECAY_TIME            = 1.49f,
        AL_EAXREVERB_MIN_DECAY_HFRATIO             = 0.1f,
        AL_EAXREVERB_MAX_DECAY_HFRATIO             = 2.0f,
        AL_EAXREVERB_DEFAULT_DECAY_HFRATIO         = 0.83f,
        AL_EAXREVERB_MIN_DECAY_LFRATIO             = 0.1f,
        AL_EAXREVERB_MAX_DECAY_LFRATIO             = 2.0f,
        AL_EAXREVERB_DEFAULT_DECAY_LFRATIO         = 1.0f,
        AL_EAXREVERB_MIN_REFLECTIONS_GAIN          = 0.0f,
        AL_EAXREVERB_MAX_REFLECTIONS_GAIN          = 3.16f,
        AL_EAXREVERB_DEFAULT_REFLECTIONS_GAIN      = 0.05f,
        AL_EAXREVERB_MIN_REFLECTIONS_DELAY         = 0.0f,
        AL_EAXREVERB_MAX_REFLECTIONS_DELAY         = 0.3f,
        AL_EAXREVERB_DEFAULT_REFLECTIONS_DELAY     = 0.007f,
        AL_EAXREVERB_DEFAULT_REFLECTIONS_PAN_XYZ   = 0.0f,
        AL_EAXREVERB_MIN_LATE_REVERB_GAIN          = 0.0f,
        AL_EAXREVERB_MAX_LATE_REVERB_GAIN          = 10.0f,
        AL_EAXREVERB_DEFAULT_LATE_REVERB_GAIN      = 1.26f,
        AL_EAXREVERB_MIN_LATE_REVERB_DELAY         = 0.0f,
        AL_EAXREVERB_MAX_LATE_REVERB_DELAY         = 0.1f,
        AL_EAXREVERB_DEFAULT_LATE_REVERB_DELAY     = 0.011f,
        AL_EAXREVERB_DEFAULT_LATE_REVERB_PAN_XYZ   = 0.0f,
        AL_EAXREVERB_MIN_ECHO_TIME                 = 0.075f,
        AL_EAXREVERB_MAX_ECHO_TIME                 = 0.25f,
        AL_EAXREVERB_DEFAULT_ECHO_TIME             = 0.25f,
        AL_EAXREVERB_MIN_ECHO_DEPTH                = 0.0f,
        AL_EAXREVERB_MAX_ECHO_DEPTH                = 1.0f,
        AL_EAXREVERB_DEFAULT_ECHO_DEPTH            = 0.0f,
        AL_EAXREVERB_MIN_MODULATION_TIME           = 0.04f,
        AL_EAXREVERB_MAX_MODULATION_TIME           = 4.0f,
        AL_EAXREVERB_DEFAULT_MODULATION_TIME       = 0.25f,
        AL_EAXREVERB_MIN_MODULATION_DEPTH          = 0.0f,
        AL_EAXREVERB_MAX_MODULATION_DEPTH          = 1.0f,
        AL_EAXREVERB_DEFAULT_MODULATION_DEPTH      = 0.0f,
        AL_EAXREVERB_MIN_AIR_ABSORPTION_GAINHF     = 0.892f,
        AL_EAXREVERB_MAX_AIR_ABSORPTION_GAINHF     = 1.0f,
        AL_EAXREVERB_DEFAULT_AIR_ABSORPTION_GAINHF = 0.994f,
        AL_EAXREVERB_MIN_HFREFERENCE               = 1000.0f,
        AL_EAXREVERB_MAX_HFREFERENCE               = 20000.0f,
        AL_EAXREVERB_DEFAULT_HFREFERENCE           = 5000.0f,
        AL_EAXREVERB_MIN_LFREFERENCE               = 20.0f,
        AL_EAXREVERB_MAX_LFREFERENCE               = 1000.0f,
        AL_EAXREVERB_DEFAULT_LFREFERENCE           = 250.0f,
        AL_EAXREVERB_MIN_ROOM_ROLLOFF_FACTOR       = 0.0f,
        AL_EAXREVERB_MAX_ROOM_ROLLOFF_FACTOR       = 10.0f,
        AL_EAXREVERB_DEFAULT_ROOM_ROLLOFF_FACTOR   = 0.0f;

    public static final int
        AL_EAXREVERB_MIN_DECAY_HFLIMIT     = 0x0,
        AL_EAXREVERB_MAX_DECAY_HFLIMIT     = 0x1,
        AL_EAXREVERB_DEFAULT_DECAY_HFLIMIT = 0x1;

    public static final int
        AL_CHORUS_WAVEFORM_SINUSOID = 0,
        AL_CHORUS_WAVEFORM_TRIANGLE = 1,
        AL_CHORUS_MIN_WAVEFORM      = 0,
        AL_CHORUS_MAX_WAVEFORM      = 1,
        AL_CHORUS_DEFAULT_WAVEFORM  = 1,
        AL_CHORUS_MIN_PHASE         = -180,
        AL_CHORUS_MAX_PHASE         = 180,
        AL_CHORUS_DEFAULT_PHASE     = 90;

    public static final float
        AL_CHORUS_MIN_RATE         = 0.0f,
        AL_CHORUS_MAX_RATE         = 10.0f,
        AL_CHORUS_DEFAULT_RATE     = 1.1f,
        AL_CHORUS_MIN_DEPTH        = 0.0f,
        AL_CHORUS_MAX_DEPTH        = 1.0f,
        AL_CHORUS_DEFAULT_DEPTH    = 0.1f,
        AL_CHORUS_MIN_FEEDBACK     = -1.0f,
        AL_CHORUS_MAX_FEEDBACK     = 1.0f,
        AL_CHORUS_DEFAULT_FEEDBACK = 0.25f,
        AL_CHORUS_MIN_DELAY        = 0.0f,
        AL_CHORUS_MAX_DELAY        = 0.016f,
        AL_CHORUS_DEFAULT_DELAY    = 0.016f;

    public static final float
        AL_DISTORTION_MIN_EDGE               = 0.0f,
        AL_DISTORTION_MAX_EDGE               = 1.0f,
        AL_DISTORTION_DEFAULT_EDGE           = 0.2f,
        AL_DISTORTION_MIN_GAIN               = 0.01f,
        AL_DISTORTION_MAX_GAIN               = 1.0f,
        AL_DISTORTION_DEFAULT_GAIN           = 0.05f,
        AL_DISTORTION_MIN_LOWPASS_CUTOFF     = 80.0f,
        AL_DISTORTION_MAX_LOWPASS_CUTOFF     = 24000.0f,
        AL_DISTORTION_DEFAULT_LOWPASS_CUTOFF = 8000.0f,
        AL_DISTORTION_MIN_EQCENTER           = 80.0f,
        AL_DISTORTION_MAX_EQCENTER           = 24000.0f,
        AL_DISTORTION_DEFAULT_EQCENTER       = 3600.0f,
        AL_DISTORTION_MIN_EQBANDWIDTH        = 80.0f,
        AL_DISTORTION_MAX_EQBANDWIDTH        = 24000.0f,
        AL_DISTORTION_DEFAULT_EQBANDWIDTH    = 3600.0f;

    public static final float
        AL_ECHO_MIN_DELAY        = 0.0f,
        AL_ECHO_MAX_DELAY        = 0.207f,
        AL_ECHO_DEFAULT_DELAY    = 0.1f,
        AL_ECHO_MIN_LRDELAY      = 0.0f,
        AL_ECHO_MAX_LRDELAY      = 0.404f,
        AL_ECHO_DEFAULT_LRDELAY  = 0.1f,
        AL_ECHO_MIN_DAMPING      = 0.0f,
        AL_ECHO_MAX_DAMPING      = 0.99f,
        AL_ECHO_DEFAULT_DAMPING  = 0.5f,
        AL_ECHO_MIN_FEEDBACK     = 0.0f,
        AL_ECHO_MAX_FEEDBACK     = 1.0f,
        AL_ECHO_DEFAULT_FEEDBACK = 0.5f,
        AL_ECHO_MIN_SPREAD       = -1.0f,
        AL_ECHO_MAX_SPREAD       = 1.0f,
        AL_ECHO_DEFAULT_SPREAD   = -1.0f;

    public static final int
        AL_FLANGER_WAVEFORM_SINUSOID = 0,
        AL_FLANGER_WAVEFORM_TRIANGLE = 1,
        AL_FLANGER_MIN_WAVEFORM      = 0,
        AL_FLANGER_MAX_WAVEFORM      = 1,
        AL_FLANGER_DEFAULT_WAVEFORM  = 1,
        AL_FLANGER_MIN_PHASE         = -180,
        AL_FLANGER_MAX_PHASE         = 180,
        AL_FLANGER_DEFAULT_PHASE     = 0;

    public static final float
        AL_FLANGER_MIN_RATE         = 0.0f,
        AL_FLANGER_MAX_RATE         = 10.0f,
        AL_FLANGER_DEFAULT_RATE     = 0.27f,
        AL_FLANGER_MIN_DEPTH        = 0.0f,
        AL_FLANGER_MAX_DEPTH        = 1.0f,
        AL_FLANGER_DEFAULT_DEPTH    = 1.0f,
        AL_FLANGER_MIN_FEEDBACK     = -1.0f,
        AL_FLANGER_MAX_FEEDBACK     = 1.0f,
        AL_FLANGER_DEFAULT_FEEDBACK = -0.5f,
        AL_FLANGER_MIN_DELAY        = 0.0f,
        AL_FLANGER_MAX_DELAY        = 0.004f,
        AL_FLANGER_DEFAULT_DELAY    = 0.002f;

    public static final float
        AL_FREQUENCY_SHIFTER_MIN_FREQUENCY     = 0.0f,
        AL_FREQUENCY_SHIFTER_MAX_FREQUENCY     = 24000.0f,
        AL_FREQUENCY_SHIFTER_DEFAULT_FREQUENCY = 0.0f;

    public static final int
        AL_FREQUENCY_SHIFTER_MIN_LEFT_DIRECTION      = 0,
        AL_FREQUENCY_SHIFTER_MAX_LEFT_DIRECTION      = 2,
        AL_FREQUENCY_SHIFTER_DEFAULT_LEFT_DIRECTION  = 0,
        AL_FREQUENCY_SHIFTER_DIRECTION_DOWN          = 0,
        AL_FREQUENCY_SHIFTER_DIRECTION_UP            = 1,
        AL_FREQUENCY_SHIFTER_DIRECTION_OFF           = 2,
        AL_FREQUENCY_SHIFTER_MIN_RIGHT_DIRECTION     = 0,
        AL_FREQUENCY_SHIFTER_MAX_RIGHT_DIRECTION     = 2,
        AL_FREQUENCY_SHIFTER_DEFAULT_RIGHT_DIRECTION = 0;

    public static final int
        AL_VOCAL_MORPHER_MIN_PHONEMEA                   = 0,
        AL_VOCAL_MORPHER_MAX_PHONEMEA                   = 29,
        AL_VOCAL_MORPHER_DEFAULT_PHONEMEA               = 0,
        AL_VOCAL_MORPHER_MIN_PHONEMEA_COARSE_TUNING     = -24,
        AL_VOCAL_MORPHER_MAX_PHONEMEA_COARSE_TUNING     = 24,
        AL_VOCAL_MORPHER_DEFAULT_PHONEMEA_COARSE_TUNING = 0,
        AL_VOCAL_MORPHER_MIN_PHONEMEB                   = 0,
        AL_VOCAL_MORPHER_MAX_PHONEMEB                   = 29,
        AL_VOCAL_MORPHER_DEFAULT_PHONEMEB               = 10,
        AL_VOCAL_MORPHER_MIN_PHONEMEB_COARSE_TUNING     = -24,
        AL_VOCAL_MORPHER_MAX_PHONEMEB_COARSE_TUNING     = 24,
        AL_VOCAL_MORPHER_DEFAULT_PHONEMEB_COARSE_TUNING = 0,
        AL_VOCAL_MORPHER_PHONEME_A                      = 0,
        AL_VOCAL_MORPHER_PHONEME_E                      = 1,
        AL_VOCAL_MORPHER_PHONEME_I                      = 2,
        AL_VOCAL_MORPHER_PHONEME_O                      = 3,
        AL_VOCAL_MORPHER_PHONEME_U                      = 4,
        AL_VOCAL_MORPHER_PHONEME_AA                     = 5,
        AL_VOCAL_MORPHER_PHONEME_AE                     = 6,
        AL_VOCAL_MORPHER_PHONEME_AH                     = 7,
        AL_VOCAL_MORPHER_PHONEME_AO                     = 8,
        AL_VOCAL_MORPHER_PHONEME_EH                     = 9,
        AL_VOCAL_MORPHER_PHONEME_ER                     = 10,
        AL_VOCAL_MORPHER_PHONEME_IH                     = 11,
        AL_VOCAL_MORPHER_PHONEME_IY                     = 12,
        AL_VOCAL_MORPHER_PHONEME_UH                     = 13,
        AL_VOCAL_MORPHER_PHONEME_UW                     = 14,
        AL_VOCAL_MORPHER_PHONEME_B                      = 15,
        AL_VOCAL_MORPHER_PHONEME_D                      = 16,
        AL_VOCAL_MORPHER_PHONEME_F                      = 17,
        AL_VOCAL_MORPHER_PHONEME_G                      = 18,
        AL_VOCAL_MORPHER_PHONEME_J                      = 19,
        AL_VOCAL_MORPHER_PHONEME_K                      = 20,
        AL_VOCAL_MORPHER_PHONEME_L                      = 21,
        AL_VOCAL_MORPHER_PHONEME_M                      = 22,
        AL_VOCAL_MORPHER_PHONEME_N                      = 23,
        AL_VOCAL_MORPHER_PHONEME_P                      = 24,
        AL_VOCAL_MORPHER_PHONEME_R                      = 25,
        AL_VOCAL_MORPHER_PHONEME_S                      = 26,
        AL_VOCAL_MORPHER_PHONEME_T                      = 27,
        AL_VOCAL_MORPHER_PHONEME_V                      = 28,
        AL_VOCAL_MORPHER_PHONEME_Z                      = 29,
        AL_VOCAL_MORPHER_WAVEFORM_SINUSOID              = 0,
        AL_VOCAL_MORPHER_WAVEFORM_TRIANGLE              = 1,
        AL_VOCAL_MORPHER_WAVEFORM_SAWTOOTH              = 2,
        AL_VOCAL_MORPHER_MIN_WAVEFORM                   = 0,
        AL_VOCAL_MORPHER_MAX_WAVEFORM                   = 2,
        AL_VOCAL_MORPHER_DEFAULT_WAVEFORM               = 0;

    public static final float
        AL_VOCAL_MORPHER_MIN_RATE     = 0.0f,
        AL_VOCAL_MORPHER_MAX_RATE     = 10.0f,
        AL_VOCAL_MORPHER_DEFAULT_RATE = 1.41f;

    public static final int
        AL_PITCH_SHIFTER_MIN_COARSE_TUNE     = -12,
        AL_PITCH_SHIFTER_MAX_COARSE_TUNE     = 12,
        AL_PITCH_SHIFTER_DEFAULT_COARSE_TUNE = 12,
        AL_PITCH_SHIFTER_MIN_FINE_TUNE       = -50,
        AL_PITCH_SHIFTER_MAX_FINE_TUNE       = 50,
        AL_PITCH_SHIFTER_DEFAULT_FINE_TUNE   = 0;

    public static final float
        AL_RING_MODULATOR_MIN_FREQUENCY           = 0.0f,
        AL_RING_MODULATOR_MAX_FREQUENCY           = 8000.0f,
        AL_RING_MODULATOR_DEFAULT_FREQUENCY       = 440.0f,
        AL_RING_MODULATOR_MIN_HIGHPASS_CUTOFF     = 0.0f,
        AL_RING_MODULATOR_MAX_HIGHPASS_CUTOFF     = 24000.0f,
        AL_RING_MODULATOR_DEFAULT_HIGHPASS_CUTOFF = 800.0f;

    public static final int
        AL_RING_MODULATOR_SINUSOID         = 0,
        AL_RING_MODULATOR_SAWTOOTH         = 1,
        AL_RING_MODULATOR_SQUARE           = 2,
        AL_RING_MODULATOR_MIN_WAVEFORM     = 0,
        AL_RING_MODULATOR_MAX_WAVEFORM     = 2,
        AL_RING_MODULATOR_DEFAULT_WAVEFORM = 0;

    public static final float
        AL_AUTOWAH_MIN_ATTACK_TIME      = 1.0E-4f,
        AL_AUTOWAH_MAX_ATTACK_TIME      = 1.0f,
        AL_AUTOWAH_DEFAULT_ATTACK_TIME  = 0.06f,
        AL_AUTOWAH_MIN_RELEASE_TIME     = 1.0E-4f,
        AL_AUTOWAH_MAX_RELEASE_TIME     = 1.0f,
        AL_AUTOWAH_DEFAULT_RELEASE_TIME = 0.06f,
        AL_AUTOWAH_MIN_RESONANCE        = 2.0f,
        AL_AUTOWAH_MAX_RESONANCE        = 1000.0f,
        AL_AUTOWAH_DEFAULT_RESONANCE    = 1000.0f,
        AL_AUTOWAH_MIN_PEAK_GAIN        = 3.0E-5f,
        AL_AUTOWAH_MAX_PEAK_GAIN        = 31621.0f,
        AL_AUTOWAH_DEFAULT_PEAK_GAIN    = 11.22f;

    public static final int
        AL_COMPRESSOR_MIN_ONOFF     = 0,
        AL_COMPRESSOR_MAX_ONOFF     = 1,
        AL_COMPRESSOR_DEFAULT_ONOFF = 1;

    public static final float
        AL_EQUALIZER_MIN_LOW_GAIN        = 0.126f,
        AL_EQUALIZER_MAX_LOW_GAIN        = 7.943f,
        AL_EQUALIZER_DEFAULT_LOW_GAIN    = 1.0f,
        AL_EQUALIZER_MIN_LOW_CUTOFF      = 50.0f,
        AL_EQUALIZER_MAX_LOW_CUTOFF      = 800.0f,
        AL_EQUALIZER_DEFAULT_LOW_CUTOFF  = 200.0f,
        AL_EQUALIZER_MIN_MID1_GAIN       = 0.126f,
        AL_EQUALIZER_MAX_MID1_GAIN       = 7.943f,
        AL_EQUALIZER_DEFAULT_MID1_GAIN   = 1.0f,
        AL_EQUALIZER_MIN_MID1_CENTER     = 200.0f,
        AL_EQUALIZER_MAX_MID1_CENTER     = 3000.0f,
        AL_EQUALIZER_DEFAULT_MID1_CENTER = 500.0f,
        AL_EQUALIZER_MIN_MID1_WIDTH      = 0.01f,
        AL_EQUALIZER_MAX_MID1_WIDTH      = 1.0f,
        AL_EQUALIZER_DEFAULT_MID1_WIDTH  = 1.0f,
        AL_EQUALIZER_MIN_MID2_GAIN       = 0.126f,
        AL_EQUALIZER_MAX_MID2_GAIN       = 7.943f,
        AL_EQUALIZER_DEFAULT_MID2_GAIN   = 1.0f,
        AL_EQUALIZER_MIN_MID2_CENTER     = 1000.0f,
        AL_EQUALIZER_MAX_MID2_CENTER     = 8000.0f,
        AL_EQUALIZER_DEFAULT_MID2_CENTER = 3000.0f,
        AL_EQUALIZER_MIN_MID2_WIDTH      = 0.01f,
        AL_EQUALIZER_MAX_MID2_WIDTH      = 1.0f,
        AL_EQUALIZER_DEFAULT_MID2_WIDTH  = 1.0f,
        AL_EQUALIZER_MIN_HIGH_GAIN       = 0.126f,
        AL_EQUALIZER_MAX_HIGH_GAIN       = 7.943f,
        AL_EQUALIZER_DEFAULT_HIGH_GAIN   = 1.0f,
        AL_EQUALIZER_MIN_HIGH_CUTOFF     = 4000.0f,
        AL_EQUALIZER_MAX_HIGH_CUTOFF     = 16000.0f,
        AL_EQUALIZER_DEFAULT_HIGH_CUTOFF = 6000.0f;

    public static final float
        AL_LOWPASS_MIN_GAIN       = 0.0f,
        AL_LOWPASS_MAX_GAIN       = 1.0f,
        AL_LOWPASS_DEFAULT_GAIN   = 1.0f,
        AL_LOWPASS_MIN_GAINHF     = 0.0f,
        AL_LOWPASS_MAX_GAINHF     = 1.0f,
        AL_LOWPASS_DEFAULT_GAINHF = 1.0f;

    public static final float
        AL_HIGHPASS_MIN_GAIN       = 0.0f,
        AL_HIGHPASS_MAX_GAIN       = 1.0f,
        AL_HIGHPASS_DEFAULT_GAIN   = 1.0f,
        AL_HIGHPASS_MIN_GAINLF     = 0.0f,
        AL_HIGHPASS_MAX_GAINLF     = 1.0f,
        AL_HIGHPASS_DEFAULT_GAINLF = 1.0f;

    public static final float
        AL_BANDPASS_MIN_GAIN       = 0.0f,
        AL_BANDPASS_MAX_GAIN       = 1.0f,
        AL_BANDPASS_DEFAULT_GAIN   = 1.0f,
        AL_BANDPASS_MIN_GAINHF     = 0.0f,
        AL_BANDPASS_MAX_GAINHF     = 1.0f,
        AL_BANDPASS_DEFAULT_GAINHF = 1.0f,
        AL_BANDPASS_MIN_GAINLF     = 0.0f,
        AL_BANDPASS_MAX_GAINLF     = 1.0f,
        AL_BANDPASS_DEFAULT_GAINLF = 1.0f;

    protected EXTEfx() {
        throw new UnsupportedOperationException();
    }

    // --- [ alGenEffects ] ---

    /** {@code ALvoid alGenEffects(ALsizei n, ALuint * effects)} */
    public static void nalGenEffects(int n, long effects) {
        long __functionAddress = AL.getICD().alGenEffects;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(n, effects, __functionAddress);
    }

    /** {@code ALvoid alGenEffects(ALsizei n, ALuint * effects)} */
    @NativeType("ALvoid")
    public static void alGenEffects(@NativeType("ALuint *") IntBuffer effects) {
        nalGenEffects(effects.remaining(), memAddress(effects));
    }

    /** {@code ALvoid alGenEffects(ALsizei n, ALuint * effects)} */
    @NativeType("ALvoid")
    public static int alGenEffects() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer effects = stack.callocInt(1);
            nalGenEffects(1, memAddress(effects));
            return effects.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGenEffectsDirect ] ---

    /** {@code ALvoid alGenEffectsDirect(ALCcontext * context, ALsizei n, ALuint * effects)} */
    public static void nalGenEffectsDirect(long context, int n, long effects) {
        long __functionAddress = AL.getICD().alGenEffectsDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, n, effects, __functionAddress);
    }

    /** {@code ALvoid alGenEffectsDirect(ALCcontext * context, ALsizei n, ALuint * effects)} */
    @NativeType("ALvoid")
    public static void alGenEffectsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") IntBuffer effects) {
        nalGenEffectsDirect(context, effects.remaining(), memAddress(effects));
    }

    /** {@code ALvoid alGenEffectsDirect(ALCcontext * context, ALsizei n, ALuint * effects)} */
    @NativeType("ALvoid")
    public static int alGenEffectsDirect(@NativeType("ALCcontext *") long context) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer effects = stack.callocInt(1);
            nalGenEffectsDirect(context, 1, memAddress(effects));
            return effects.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alDeleteEffects ] ---

    /** {@code ALvoid alDeleteEffects(ALsizei n, ALuint * effects)} */
    public static void nalDeleteEffects(int n, long effects) {
        long __functionAddress = AL.getICD().alDeleteEffects;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(n, effects, __functionAddress);
    }

    /** {@code ALvoid alDeleteEffects(ALsizei n, ALuint * effects)} */
    @NativeType("ALvoid")
    public static void alDeleteEffects(@NativeType("ALuint *") IntBuffer effects) {
        nalDeleteEffects(effects.remaining(), memAddress(effects));
    }

    /** {@code ALvoid alDeleteEffects(ALsizei n, ALuint * effects)} */
    @NativeType("ALvoid")
    public static void alDeleteEffects(@NativeType("ALuint *") int effect) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer effects = stack.ints(effect);
            nalDeleteEffects(1, memAddress(effects));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alDeleteEffectsDirect ] ---

    /** {@code ALvoid alDeleteEffectsDirect(ALCcontext * context, ALsizei n, ALuint * effects)} */
    public static void nalDeleteEffectsDirect(long context, int n, long effects) {
        long __functionAddress = AL.getICD().alDeleteEffectsDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, n, effects, __functionAddress);
    }

    /** {@code ALvoid alDeleteEffectsDirect(ALCcontext * context, ALsizei n, ALuint * effects)} */
    @NativeType("ALvoid")
    public static void alDeleteEffectsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") IntBuffer effects) {
        nalDeleteEffectsDirect(context, effects.remaining(), memAddress(effects));
    }

    /** {@code ALvoid alDeleteEffectsDirect(ALCcontext * context, ALsizei n, ALuint * effects)} */
    @NativeType("ALvoid")
    public static void alDeleteEffectsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int effect) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer effects = stack.ints(effect);
            nalDeleteEffectsDirect(context, 1, memAddress(effects));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alIsEffect ] ---

    /** {@code ALboolean alIsEffect(ALuint effect)} */
    @NativeType("ALboolean")
    public static boolean alIsEffect(@NativeType("ALuint") int effect) {
        long __functionAddress = AL.getICD().alIsEffect;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeZ(effect, __functionAddress);
    }

    // --- [ alIsEffectDirect ] ---

    /** {@code ALboolean alIsEffectDirect(ALCcontext * context, ALuint effect)} */
    @NativeType("ALboolean")
    public static boolean alIsEffectDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect) {
        long __functionAddress = AL.getICD().alIsEffectDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePZ(context, effect, __functionAddress);
    }

    // --- [ alEffecti ] ---

    /** {@code ALvoid alEffecti(ALuint effect, ALenum param, ALint value)} */
    @NativeType("ALvoid")
    public static void alEffecti(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint") int value) {
        long __functionAddress = AL.getICD().alEffecti;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(effect, param, value, __functionAddress);
    }

    // --- [ alEffectiDirect ] ---

    /** {@code ALvoid alEffectiDirect(ALCcontext * context, ALuint effect, ALenum param, ALint value)} */
    @NativeType("ALvoid")
    public static void alEffectiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint") int value) {
        long __functionAddress = AL.getICD().alEffectiDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, effect, param, value, __functionAddress);
    }

    // --- [ alEffectiv ] ---

    /** {@code ALvoid alEffectiv(ALuint effect, ALenum param, ALint const * values)} */
    public static void nalEffectiv(int effect, int param, long values) {
        long __functionAddress = AL.getICD().alEffectiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(effect, param, values, __functionAddress);
    }

    /** {@code ALvoid alEffectiv(ALuint effect, ALenum param, ALint const * values)} */
    @NativeType("ALvoid")
    public static void alEffectiv(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint const *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalEffectiv(effect, param, memAddress(values));
    }

    // --- [ alEffectivDirect ] ---

    /** {@code ALvoid alEffectivDirect(ALCcontext * context, ALuint effect, ALenum param, ALint const * values)} */
    public static void nalEffectivDirect(long context, int effect, int param, long values) {
        long __functionAddress = AL.getICD().alEffectivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, effect, param, values, __functionAddress);
    }

    /** {@code ALvoid alEffectivDirect(ALCcontext * context, ALuint effect, ALenum param, ALint const * values)} */
    @NativeType("ALvoid")
    public static void alEffectivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint const *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalEffectivDirect(context, effect, param, memAddress(values));
    }

    // --- [ alEffectf ] ---

    /** {@code ALvoid alEffectf(ALuint effect, ALenum param, ALfloat value)} */
    @NativeType("ALvoid")
    public static void alEffectf(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alEffectf;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(effect, param, value, __functionAddress);
    }

    // --- [ alEffectfDirect ] ---

    /** {@code ALvoid alEffectfDirect(ALCcontext * context, ALuint effect, ALenum param, ALfloat value)} */
    @NativeType("ALvoid")
    public static void alEffectfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alEffectfDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, effect, param, value, __functionAddress);
    }

    // --- [ alEffectfv ] ---

    /** {@code ALvoid alEffectfv(ALuint effect, ALenum param, ALfloat const * values)} */
    public static void nalEffectfv(int effect, int param, long values) {
        long __functionAddress = AL.getICD().alEffectfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(effect, param, values, __functionAddress);
    }

    /** {@code ALvoid alEffectfv(ALuint effect, ALenum param, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alEffectfv(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat const *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalEffectfv(effect, param, memAddress(values));
    }

    // --- [ alEffectfvDirect ] ---

    /** {@code ALvoid alEffectfvDirect(ALCcontext * context, ALuint effect, ALenum param, ALfloat const * values)} */
    public static void nalEffectfvDirect(long context, int effect, int param, long values) {
        long __functionAddress = AL.getICD().alEffectfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, effect, param, values, __functionAddress);
    }

    /** {@code ALvoid alEffectfvDirect(ALCcontext * context, ALuint effect, ALenum param, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alEffectfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat const *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalEffectfvDirect(context, effect, param, memAddress(values));
    }

    // --- [ alGetEffecti ] ---

    /** {@code ALvoid alGetEffecti(ALuint effect, ALenum param, ALint * value)} */
    public static void nalGetEffecti(int effect, int param, long value) {
        long __functionAddress = AL.getICD().alGetEffecti;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(effect, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetEffecti(ALuint effect, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetEffecti(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetEffecti(effect, param, memAddress(value));
    }

    /** {@code ALvoid alGetEffecti(ALuint effect, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static int alGetEffecti(@NativeType("ALuint") int effect, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nalGetEffecti(effect, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetEffectiDirect ] ---

    /** {@code ALvoid alGetEffectiDirect(ALCcontext * context, ALuint effect, ALenum param, ALint * value)} */
    public static void nalGetEffectiDirect(long context, int effect, int param, long value) {
        long __functionAddress = AL.getICD().alGetEffectiDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, effect, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetEffectiDirect(ALCcontext * context, ALuint effect, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetEffectiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetEffectiDirect(context, effect, param, memAddress(value));
    }

    /** {@code ALvoid alGetEffectiDirect(ALCcontext * context, ALuint effect, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static int alGetEffectiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nalGetEffectiDirect(context, effect, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetEffectiv ] ---

    /** {@code ALvoid alGetEffectiv(ALuint effect, ALenum param, ALint * values)} */
    public static void nalGetEffectiv(int effect, int param, long values) {
        long __functionAddress = AL.getICD().alGetEffectiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(effect, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetEffectiv(ALuint effect, ALenum param, ALint * values)} */
    @NativeType("ALvoid")
    public static void alGetEffectiv(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetEffectiv(effect, param, memAddress(values));
    }

    // --- [ alGetEffectivDirect ] ---

    /** {@code ALvoid alGetEffectivDirect(ALCcontext * context, ALuint effect, ALenum param, ALint * values)} */
    public static void nalGetEffectivDirect(long context, int effect, int param, long values) {
        long __functionAddress = AL.getICD().alGetEffectivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, effect, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetEffectivDirect(ALCcontext * context, ALuint effect, ALenum param, ALint * values)} */
    @NativeType("ALvoid")
    public static void alGetEffectivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetEffectivDirect(context, effect, param, memAddress(values));
    }

    // --- [ alGetEffectf ] ---

    /** {@code ALvoid alGetEffectf(ALuint effect, ALenum param, ALfloat * value)} */
    public static void nalGetEffectf(int effect, int param, long value) {
        long __functionAddress = AL.getICD().alGetEffectf;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(effect, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetEffectf(ALuint effect, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetEffectf(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetEffectf(effect, param, memAddress(value));
    }

    /** {@code ALvoid alGetEffectf(ALuint effect, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static float alGetEffectf(@NativeType("ALuint") int effect, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nalGetEffectf(effect, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetEffectfDirect ] ---

    /** {@code ALvoid alGetEffectfDirect(ALCcontext * context, ALuint effect, ALenum param, ALfloat * value)} */
    public static void nalGetEffectfDirect(long context, int effect, int param, long value) {
        long __functionAddress = AL.getICD().alGetEffectfDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, effect, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetEffectfDirect(ALCcontext * context, ALuint effect, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetEffectfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetEffectfDirect(context, effect, param, memAddress(value));
    }

    /** {@code ALvoid alGetEffectfDirect(ALCcontext * context, ALuint effect, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static float alGetEffectfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nalGetEffectfDirect(context, effect, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetEffectfv ] ---

    /** {@code ALvoid alGetEffectfv(ALuint effect, ALenum param, ALfloat * values)} */
    public static void nalGetEffectfv(int effect, int param, long values) {
        long __functionAddress = AL.getICD().alGetEffectfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(effect, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetEffectfv(ALuint effect, ALenum param, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetEffectfv(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetEffectfv(effect, param, memAddress(values));
    }

    // --- [ alGetEffectfvDirect ] ---

    /** {@code ALvoid alGetEffectfvDirect(ALCcontext * context, ALuint effect, ALenum param, ALfloat * values)} */
    public static void nalGetEffectfvDirect(long context, int effect, int param, long values) {
        long __functionAddress = AL.getICD().alGetEffectfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, effect, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetEffectfvDirect(ALCcontext * context, ALuint effect, ALenum param, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetEffectfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetEffectfvDirect(context, effect, param, memAddress(values));
    }

    // --- [ alGenFilters ] ---

    /** {@code ALvoid alGenFilters(ALsizei n, ALuint * filters)} */
    public static void nalGenFilters(int n, long filters) {
        long __functionAddress = AL.getICD().alGenFilters;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(n, filters, __functionAddress);
    }

    /** {@code ALvoid alGenFilters(ALsizei n, ALuint * filters)} */
    @NativeType("ALvoid")
    public static void alGenFilters(@NativeType("ALuint *") IntBuffer filters) {
        nalGenFilters(filters.remaining(), memAddress(filters));
    }

    /** {@code ALvoid alGenFilters(ALsizei n, ALuint * filters)} */
    @NativeType("ALvoid")
    public static int alGenFilters() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer filters = stack.callocInt(1);
            nalGenFilters(1, memAddress(filters));
            return filters.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGenFiltersDirect ] ---

    /** {@code ALvoid alGenFiltersDirect(ALCcontext * context, ALsizei n, ALuint * filters)} */
    public static void nalGenFiltersDirect(long context, int n, long filters) {
        long __functionAddress = AL.getICD().alGenFiltersDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, n, filters, __functionAddress);
    }

    /** {@code ALvoid alGenFiltersDirect(ALCcontext * context, ALsizei n, ALuint * filters)} */
    @NativeType("ALvoid")
    public static void alGenFiltersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") IntBuffer filters) {
        nalGenFiltersDirect(context, filters.remaining(), memAddress(filters));
    }

    /** {@code ALvoid alGenFiltersDirect(ALCcontext * context, ALsizei n, ALuint * filters)} */
    @NativeType("ALvoid")
    public static int alGenFiltersDirect(@NativeType("ALCcontext *") long context) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer filters = stack.callocInt(1);
            nalGenFiltersDirect(context, 1, memAddress(filters));
            return filters.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alDeleteFilters ] ---

    /** {@code ALvoid alDeleteFilters(ALsizei n, ALuint * filters)} */
    public static void nalDeleteFilters(int n, long filters) {
        long __functionAddress = AL.getICD().alDeleteFilters;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(n, filters, __functionAddress);
    }

    /** {@code ALvoid alDeleteFilters(ALsizei n, ALuint * filters)} */
    @NativeType("ALvoid")
    public static void alDeleteFilters(@NativeType("ALuint *") IntBuffer filters) {
        nalDeleteFilters(filters.remaining(), memAddress(filters));
    }

    /** {@code ALvoid alDeleteFilters(ALsizei n, ALuint * filters)} */
    @NativeType("ALvoid")
    public static void alDeleteFilters(@NativeType("ALuint *") int filter) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer filters = stack.ints(filter);
            nalDeleteFilters(1, memAddress(filters));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alDeleteFiltersDirect ] ---

    /** {@code ALvoid alDeleteFiltersDirect(ALCcontext * context, ALsizei n, ALuint * filters)} */
    public static void nalDeleteFiltersDirect(long context, int n, long filters) {
        long __functionAddress = AL.getICD().alDeleteFiltersDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, n, filters, __functionAddress);
    }

    /** {@code ALvoid alDeleteFiltersDirect(ALCcontext * context, ALsizei n, ALuint * filters)} */
    @NativeType("ALvoid")
    public static void alDeleteFiltersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") IntBuffer filters) {
        nalDeleteFiltersDirect(context, filters.remaining(), memAddress(filters));
    }

    /** {@code ALvoid alDeleteFiltersDirect(ALCcontext * context, ALsizei n, ALuint * filters)} */
    @NativeType("ALvoid")
    public static void alDeleteFiltersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int filter) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer filters = stack.ints(filter);
            nalDeleteFiltersDirect(context, 1, memAddress(filters));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alIsFilter ] ---

    /** {@code ALboolean alIsFilter(ALuint filter)} */
    @NativeType("ALboolean")
    public static boolean alIsFilter(@NativeType("ALuint") int filter) {
        long __functionAddress = AL.getICD().alIsFilter;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeZ(filter, __functionAddress);
    }

    // --- [ alIsFilterDirect ] ---

    /** {@code ALboolean alIsFilterDirect(ALCcontext * context, ALuint filter)} */
    @NativeType("ALboolean")
    public static boolean alIsFilterDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter) {
        long __functionAddress = AL.getICD().alIsFilterDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePZ(context, filter, __functionAddress);
    }

    // --- [ alFilteri ] ---

    /** {@code ALvoid alFilteri(ALuint filter, ALenum param, ALint value)} */
    @NativeType("ALvoid")
    public static void alFilteri(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint") int value) {
        long __functionAddress = AL.getICD().alFilteri;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(filter, param, value, __functionAddress);
    }

    // --- [ alFilteriDirect ] ---

    /** {@code ALvoid alFilteriDirect(ALCcontext * context, ALuint filter, ALenum param, ALint value)} */
    @NativeType("ALvoid")
    public static void alFilteriDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint") int value) {
        long __functionAddress = AL.getICD().alFilteriDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, filter, param, value, __functionAddress);
    }

    // --- [ alFilteriv ] ---

    /** {@code ALvoid alFilteriv(ALuint filter, ALenum param, ALint const * values)} */
    public static void nalFilteriv(int filter, int param, long values) {
        long __functionAddress = AL.getICD().alFilteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(filter, param, values, __functionAddress);
    }

    /** {@code ALvoid alFilteriv(ALuint filter, ALenum param, ALint const * values)} */
    @NativeType("ALvoid")
    public static void alFilteriv(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint const *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalFilteriv(filter, param, memAddress(values));
    }

    // --- [ alFilterivDirect ] ---

    /** {@code ALvoid alFilterivDirect(ALCcontext * context, ALuint filter, ALenum param, ALint const * values)} */
    public static void nalFilterivDirect(long context, int filter, int param, long values) {
        long __functionAddress = AL.getICD().alFilterivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, filter, param, values, __functionAddress);
    }

    /** {@code ALvoid alFilterivDirect(ALCcontext * context, ALuint filter, ALenum param, ALint const * values)} */
    @NativeType("ALvoid")
    public static void alFilterivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint const *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalFilterivDirect(context, filter, param, memAddress(values));
    }

    // --- [ alFilterf ] ---

    /** {@code ALvoid alFilterf(ALuint filter, ALenum param, ALfloat value)} */
    @NativeType("ALvoid")
    public static void alFilterf(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alFilterf;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(filter, param, value, __functionAddress);
    }

    // --- [ alFilterfDirect ] ---

    /** {@code ALvoid alFilterfDirect(ALCcontext * context, ALuint filter, ALenum param, ALfloat value)} */
    @NativeType("ALvoid")
    public static void alFilterfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alFilterfDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, filter, param, value, __functionAddress);
    }

    // --- [ alFilterfv ] ---

    /** {@code ALvoid alFilterfv(ALuint filter, ALenum param, ALfloat const * values)} */
    public static void nalFilterfv(int filter, int param, long values) {
        long __functionAddress = AL.getICD().alFilterfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(filter, param, values, __functionAddress);
    }

    /** {@code ALvoid alFilterfv(ALuint filter, ALenum param, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alFilterfv(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat const *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalFilterfv(filter, param, memAddress(values));
    }

    // --- [ alFilterfvDirect ] ---

    /** {@code ALvoid alFilterfvDirect(ALCcontext * context, ALuint filter, ALenum param, ALfloat const * values)} */
    public static void nalFilterfvDirect(long context, int filter, int param, long values) {
        long __functionAddress = AL.getICD().alFilterfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, filter, param, values, __functionAddress);
    }

    /** {@code ALvoid alFilterfvDirect(ALCcontext * context, ALuint filter, ALenum param, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alFilterfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat const *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalFilterfvDirect(context, filter, param, memAddress(values));
    }

    // --- [ alGetFilteri ] ---

    /** {@code ALvoid alGetFilteri(ALuint filter, ALenum param, ALint * value)} */
    public static void nalGetFilteri(int filter, int param, long value) {
        long __functionAddress = AL.getICD().alGetFilteri;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(filter, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetFilteri(ALuint filter, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetFilteri(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetFilteri(filter, param, memAddress(value));
    }

    /** {@code ALvoid alGetFilteri(ALuint filter, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static int alGetFilteri(@NativeType("ALuint") int filter, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nalGetFilteri(filter, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetFilteriDirect ] ---

    /** {@code ALvoid alGetFilteriDirect(ALCcontext * context, ALuint filter, ALenum param, ALint * value)} */
    public static void nalGetFilteriDirect(long context, int filter, int param, long value) {
        long __functionAddress = AL.getICD().alGetFilteriDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, filter, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetFilteriDirect(ALCcontext * context, ALuint filter, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetFilteriDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetFilteriDirect(context, filter, param, memAddress(value));
    }

    /** {@code ALvoid alGetFilteriDirect(ALCcontext * context, ALuint filter, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static int alGetFilteriDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nalGetFilteriDirect(context, filter, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetFilteriv ] ---

    /** {@code ALvoid alGetFilteriv(ALuint filter, ALenum param, ALint * values)} */
    public static void nalGetFilteriv(int filter, int param, long values) {
        long __functionAddress = AL.getICD().alGetFilteriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(filter, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetFilteriv(ALuint filter, ALenum param, ALint * values)} */
    @NativeType("ALvoid")
    public static void alGetFilteriv(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetFilteriv(filter, param, memAddress(values));
    }

    // --- [ alGetFilterivDirect ] ---

    /** {@code ALvoid alGetFilterivDirect(ALCcontext * context, ALuint filter, ALenum param, ALint * values)} */
    public static void nalGetFilterivDirect(long context, int filter, int param, long values) {
        long __functionAddress = AL.getICD().alGetFilterivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, filter, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetFilterivDirect(ALCcontext * context, ALuint filter, ALenum param, ALint * values)} */
    @NativeType("ALvoid")
    public static void alGetFilterivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetFilterivDirect(context, filter, param, memAddress(values));
    }

    // --- [ alGetFilterf ] ---

    /** {@code ALvoid alGetFilterf(ALuint filter, ALenum param, ALfloat * value)} */
    public static void nalGetFilterf(int filter, int param, long value) {
        long __functionAddress = AL.getICD().alGetFilterf;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(filter, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetFilterf(ALuint filter, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetFilterf(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetFilterf(filter, param, memAddress(value));
    }

    /** {@code ALvoid alGetFilterf(ALuint filter, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static float alGetFilterf(@NativeType("ALuint") int filter, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nalGetFilterf(filter, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetFilterfDirect ] ---

    /** {@code ALvoid alGetFilterfDirect(ALCcontext * context, ALuint filter, ALenum param, ALfloat * value)} */
    public static void nalGetFilterfDirect(long context, int filter, int param, long value) {
        long __functionAddress = AL.getICD().alGetFilterfDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, filter, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetFilterfDirect(ALCcontext * context, ALuint filter, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetFilterfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetFilterfDirect(context, filter, param, memAddress(value));
    }

    /** {@code ALvoid alGetFilterfDirect(ALCcontext * context, ALuint filter, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static float alGetFilterfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nalGetFilterfDirect(context, filter, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetFilterfv ] ---

    /** {@code ALvoid alGetFilterfv(ALuint filter, ALenum param, ALfloat * values)} */
    public static void nalGetFilterfv(int filter, int param, long values) {
        long __functionAddress = AL.getICD().alGetFilterfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(filter, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetFilterfv(ALuint filter, ALenum param, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetFilterfv(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetFilterfv(filter, param, memAddress(values));
    }

    // --- [ alGetFilterfvDirect ] ---

    /** {@code ALvoid alGetFilterfvDirect(ALCcontext * context, ALuint filter, ALenum param, ALfloat * values)} */
    public static void nalGetFilterfvDirect(long context, int filter, int param, long values) {
        long __functionAddress = AL.getICD().alGetFilterfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, filter, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetFilterfvDirect(ALCcontext * context, ALuint filter, ALenum param, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetFilterfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetFilterfvDirect(context, filter, param, memAddress(values));
    }

    // --- [ alGenAuxiliaryEffectSlots ] ---

    /** {@code ALvoid alGenAuxiliaryEffectSlots(ALsizei n, ALuint * effectSlots)} */
    public static void nalGenAuxiliaryEffectSlots(int n, long effectSlots) {
        long __functionAddress = AL.getICD().alGenAuxiliaryEffectSlots;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(n, effectSlots, __functionAddress);
    }

    /** {@code ALvoid alGenAuxiliaryEffectSlots(ALsizei n, ALuint * effectSlots)} */
    @NativeType("ALvoid")
    public static void alGenAuxiliaryEffectSlots(@NativeType("ALuint *") IntBuffer effectSlots) {
        nalGenAuxiliaryEffectSlots(effectSlots.remaining(), memAddress(effectSlots));
    }

    /** {@code ALvoid alGenAuxiliaryEffectSlots(ALsizei n, ALuint * effectSlots)} */
    @NativeType("ALvoid")
    public static int alGenAuxiliaryEffectSlots() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer effectSlots = stack.callocInt(1);
            nalGenAuxiliaryEffectSlots(1, memAddress(effectSlots));
            return effectSlots.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGenAuxiliaryEffectSlotsDirect ] ---

    /** {@code ALvoid alGenAuxiliaryEffectSlotsDirect(ALCcontext * context, ALsizei n, ALuint * effectSlots)} */
    public static void nalGenAuxiliaryEffectSlotsDirect(long context, int n, long effectSlots) {
        long __functionAddress = AL.getICD().alGenAuxiliaryEffectSlotsDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, n, effectSlots, __functionAddress);
    }

    /** {@code ALvoid alGenAuxiliaryEffectSlotsDirect(ALCcontext * context, ALsizei n, ALuint * effectSlots)} */
    @NativeType("ALvoid")
    public static void alGenAuxiliaryEffectSlotsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") IntBuffer effectSlots) {
        nalGenAuxiliaryEffectSlotsDirect(context, effectSlots.remaining(), memAddress(effectSlots));
    }

    /** {@code ALvoid alGenAuxiliaryEffectSlotsDirect(ALCcontext * context, ALsizei n, ALuint * effectSlots)} */
    @NativeType("ALvoid")
    public static int alGenAuxiliaryEffectSlotsDirect(@NativeType("ALCcontext *") long context) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer effectSlots = stack.callocInt(1);
            nalGenAuxiliaryEffectSlotsDirect(context, 1, memAddress(effectSlots));
            return effectSlots.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alDeleteAuxiliaryEffectSlots ] ---

    /** {@code ALvoid alDeleteAuxiliaryEffectSlots(ALsizei n, ALuint * effectSlots)} */
    public static void nalDeleteAuxiliaryEffectSlots(int n, long effectSlots) {
        long __functionAddress = AL.getICD().alDeleteAuxiliaryEffectSlots;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(n, effectSlots, __functionAddress);
    }

    /** {@code ALvoid alDeleteAuxiliaryEffectSlots(ALsizei n, ALuint * effectSlots)} */
    @NativeType("ALvoid")
    public static void alDeleteAuxiliaryEffectSlots(@NativeType("ALuint *") IntBuffer effectSlots) {
        nalDeleteAuxiliaryEffectSlots(effectSlots.remaining(), memAddress(effectSlots));
    }

    /** {@code ALvoid alDeleteAuxiliaryEffectSlots(ALsizei n, ALuint * effectSlots)} */
    @NativeType("ALvoid")
    public static void alDeleteAuxiliaryEffectSlots(@NativeType("ALuint *") int effectSlot) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer effectSlots = stack.ints(effectSlot);
            nalDeleteAuxiliaryEffectSlots(1, memAddress(effectSlots));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alDeleteAuxiliaryEffectSlotsDirect ] ---

    /** {@code ALvoid alDeleteAuxiliaryEffectSlotsDirect(ALCcontext * context, ALsizei n, ALuint * effectSlots)} */
    public static void nalDeleteAuxiliaryEffectSlotsDirect(long context, int n, long effectSlots) {
        long __functionAddress = AL.getICD().alDeleteAuxiliaryEffectSlotsDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, n, effectSlots, __functionAddress);
    }

    /** {@code ALvoid alDeleteAuxiliaryEffectSlotsDirect(ALCcontext * context, ALsizei n, ALuint * effectSlots)} */
    @NativeType("ALvoid")
    public static void alDeleteAuxiliaryEffectSlotsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") IntBuffer effectSlots) {
        nalDeleteAuxiliaryEffectSlotsDirect(context, effectSlots.remaining(), memAddress(effectSlots));
    }

    /** {@code ALvoid alDeleteAuxiliaryEffectSlotsDirect(ALCcontext * context, ALsizei n, ALuint * effectSlots)} */
    @NativeType("ALvoid")
    public static void alDeleteAuxiliaryEffectSlotsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int effectSlot) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer effectSlots = stack.ints(effectSlot);
            nalDeleteAuxiliaryEffectSlotsDirect(context, 1, memAddress(effectSlots));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alIsAuxiliaryEffectSlot ] ---

    /** {@code ALboolean alIsAuxiliaryEffectSlot(ALuint effectSlot)} */
    @NativeType("ALboolean")
    public static boolean alIsAuxiliaryEffectSlot(@NativeType("ALuint") int effectSlot) {
        long __functionAddress = AL.getICD().alIsAuxiliaryEffectSlot;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeZ(effectSlot, __functionAddress);
    }

    // --- [ alIsAuxiliaryEffectSlotDirect ] ---

    /** {@code ALboolean alIsAuxiliaryEffectSlotDirect(ALCcontext * context, ALuint effectSlot)} */
    @NativeType("ALboolean")
    public static boolean alIsAuxiliaryEffectSlotDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot) {
        long __functionAddress = AL.getICD().alIsAuxiliaryEffectSlotDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePZ(context, effectSlot, __functionAddress);
    }

    // --- [ alAuxiliaryEffectSloti ] ---

    /** {@code ALvoid alAuxiliaryEffectSloti(ALuint effectSlot, ALenum param, ALint value)} */
    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSloti(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint") int value) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSloti;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(effectSlot, param, value, __functionAddress);
    }

    // --- [ alAuxiliaryEffectSlotiDirect ] ---

    /** {@code ALvoid alAuxiliaryEffectSlotiDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALint value)} */
    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint") int value) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotiDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, effectSlot, param, value, __functionAddress);
    }

    // --- [ alAuxiliaryEffectSlotiv ] ---

    /** {@code ALvoid alAuxiliaryEffectSlotiv(ALuint effectSlot, ALenum param, ALint const * values)} */
    public static void nalAuxiliaryEffectSlotiv(int effectSlot, int param, long values) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(effectSlot, param, values, __functionAddress);
    }

    /** {@code ALvoid alAuxiliaryEffectSlotiv(ALuint effectSlot, ALenum param, ALint const * values)} */
    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotiv(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint const *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalAuxiliaryEffectSlotiv(effectSlot, param, memAddress(values));
    }

    // --- [ alAuxiliaryEffectSlotivDirect ] ---

    /** {@code ALvoid alAuxiliaryEffectSlotivDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALint const * values)} */
    public static void nalAuxiliaryEffectSlotivDirect(long context, int effectSlot, int param, long values) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, effectSlot, param, values, __functionAddress);
    }

    /** {@code ALvoid alAuxiliaryEffectSlotivDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALint const * values)} */
    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint const *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalAuxiliaryEffectSlotivDirect(context, effectSlot, param, memAddress(values));
    }

    // --- [ alAuxiliaryEffectSlotf ] ---

    /** {@code ALvoid alAuxiliaryEffectSlotf(ALuint effectSlot, ALenum param, ALfloat value)} */
    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotf(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotf;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(effectSlot, param, value, __functionAddress);
    }

    // --- [ alAuxiliaryEffectSlotfDirect ] ---

    /** {@code ALvoid alAuxiliaryEffectSlotfDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALfloat value)} */
    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotfDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, effectSlot, param, value, __functionAddress);
    }

    // --- [ alAuxiliaryEffectSlotfv ] ---

    /** {@code ALvoid alAuxiliaryEffectSlotfv(ALuint effectSlot, ALenum param, ALfloat const * values)} */
    public static void nalAuxiliaryEffectSlotfv(int effectSlot, int param, long values) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(effectSlot, param, values, __functionAddress);
    }

    /** {@code ALvoid alAuxiliaryEffectSlotfv(ALuint effectSlot, ALenum param, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotfv(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat const *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalAuxiliaryEffectSlotfv(effectSlot, param, memAddress(values));
    }

    // --- [ alAuxiliaryEffectSlotfvDirect ] ---

    /** {@code ALvoid alAuxiliaryEffectSlotfvDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALfloat const * values)} */
    public static void nalAuxiliaryEffectSlotfvDirect(long context, int effectSlot, int param, long values) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, effectSlot, param, values, __functionAddress);
    }

    /** {@code ALvoid alAuxiliaryEffectSlotfvDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat const *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalAuxiliaryEffectSlotfvDirect(context, effectSlot, param, memAddress(values));
    }

    // --- [ alGetAuxiliaryEffectSloti ] ---

    /** {@code ALvoid alGetAuxiliaryEffectSloti(ALuint effectSlot, ALenum param, ALint * value)} */
    public static void nalGetAuxiliaryEffectSloti(int effectSlot, int param, long value) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSloti;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(effectSlot, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetAuxiliaryEffectSloti(ALuint effectSlot, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSloti(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetAuxiliaryEffectSloti(effectSlot, param, memAddress(value));
    }

    /** {@code ALvoid alGetAuxiliaryEffectSloti(ALuint effectSlot, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static int alGetAuxiliaryEffectSloti(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nalGetAuxiliaryEffectSloti(effectSlot, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetAuxiliaryEffectSlotiDirect ] ---

    /** {@code ALvoid alGetAuxiliaryEffectSlotiDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALint * value)} */
    public static void nalGetAuxiliaryEffectSlotiDirect(long context, int effectSlot, int param, long value) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotiDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, effectSlot, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetAuxiliaryEffectSlotiDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetAuxiliaryEffectSlotiDirect(context, effectSlot, param, memAddress(value));
    }

    /** {@code ALvoid alGetAuxiliaryEffectSlotiDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static int alGetAuxiliaryEffectSlotiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nalGetAuxiliaryEffectSlotiDirect(context, effectSlot, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetAuxiliaryEffectSlotiv ] ---

    /** {@code ALvoid alGetAuxiliaryEffectSlotiv(ALuint effectSlot, ALenum param, ALint * values)} */
    public static void nalGetAuxiliaryEffectSlotiv(int effectSlot, int param, long values) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(effectSlot, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetAuxiliaryEffectSlotiv(ALuint effectSlot, ALenum param, ALint * values)} */
    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotiv(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetAuxiliaryEffectSlotiv(effectSlot, param, memAddress(values));
    }

    // --- [ alGetAuxiliaryEffectSlotivDirect ] ---

    /** {@code ALvoid alGetAuxiliaryEffectSlotivDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALint * values)} */
    public static void nalGetAuxiliaryEffectSlotivDirect(long context, int effectSlot, int param, long values) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, effectSlot, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetAuxiliaryEffectSlotivDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALint * values)} */
    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetAuxiliaryEffectSlotivDirect(context, effectSlot, param, memAddress(values));
    }

    // --- [ alGetAuxiliaryEffectSlotf ] ---

    /** {@code ALvoid alGetAuxiliaryEffectSlotf(ALuint effectSlot, ALenum param, ALfloat * value)} */
    public static void nalGetAuxiliaryEffectSlotf(int effectSlot, int param, long value) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotf;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(effectSlot, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetAuxiliaryEffectSlotf(ALuint effectSlot, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotf(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetAuxiliaryEffectSlotf(effectSlot, param, memAddress(value));
    }

    /** {@code ALvoid alGetAuxiliaryEffectSlotf(ALuint effectSlot, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static float alGetAuxiliaryEffectSlotf(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nalGetAuxiliaryEffectSlotf(effectSlot, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetAuxiliaryEffectSlotfDirect ] ---

    /** {@code ALvoid alGetAuxiliaryEffectSlotfDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALfloat * value)} */
    public static void nalGetAuxiliaryEffectSlotfDirect(long context, int effectSlot, int param, long value) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotfDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, effectSlot, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetAuxiliaryEffectSlotfDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetAuxiliaryEffectSlotfDirect(context, effectSlot, param, memAddress(value));
    }

    /** {@code ALvoid alGetAuxiliaryEffectSlotfDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static float alGetAuxiliaryEffectSlotfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nalGetAuxiliaryEffectSlotfDirect(context, effectSlot, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetAuxiliaryEffectSlotfv ] ---

    /** {@code ALvoid alGetAuxiliaryEffectSlotfv(ALuint effectSlot, ALenum param, ALfloat * values)} */
    public static void nalGetAuxiliaryEffectSlotfv(int effectSlot, int param, long values) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(effectSlot, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetAuxiliaryEffectSlotfv(ALuint effectSlot, ALenum param, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotfv(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetAuxiliaryEffectSlotfv(effectSlot, param, memAddress(values));
    }

    // --- [ alGetAuxiliaryEffectSlotfvDirect ] ---

    /** {@code ALvoid alGetAuxiliaryEffectSlotfvDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALfloat * values)} */
    public static void nalGetAuxiliaryEffectSlotfvDirect(long context, int effectSlot, int param, long values) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, effectSlot, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetAuxiliaryEffectSlotfvDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetAuxiliaryEffectSlotfvDirect(context, effectSlot, param, memAddress(values));
    }

    /** {@code ALvoid alGenEffects(ALsizei n, ALuint * effects)} */
    @NativeType("ALvoid")
    public static void alGenEffects(@NativeType("ALuint *") int[] effects) {
        long __functionAddress = AL.getICD().alGenEffects;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(effects.length, effects, __functionAddress);
    }

    /** {@code ALvoid alGenEffectsDirect(ALCcontext * context, ALsizei n, ALuint * effects)} */
    @NativeType("ALvoid")
    public static void alGenEffectsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int[] effects) {
        long __functionAddress = AL.getICD().alGenEffectsDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, effects.length, effects, __functionAddress);
    }

    /** {@code ALvoid alDeleteEffects(ALsizei n, ALuint * effects)} */
    @NativeType("ALvoid")
    public static void alDeleteEffects(@NativeType("ALuint *") int[] effects) {
        long __functionAddress = AL.getICD().alDeleteEffects;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(effects.length, effects, __functionAddress);
    }

    /** {@code ALvoid alDeleteEffectsDirect(ALCcontext * context, ALsizei n, ALuint * effects)} */
    @NativeType("ALvoid")
    public static void alDeleteEffectsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int[] effects) {
        long __functionAddress = AL.getICD().alDeleteEffectsDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, effects.length, effects, __functionAddress);
    }

    /** {@code ALvoid alEffectiv(ALuint effect, ALenum param, ALint const * values)} */
    @NativeType("ALvoid")
    public static void alEffectiv(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint const *") int[] values) {
        long __functionAddress = AL.getICD().alEffectiv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(effect, param, values, __functionAddress);
    }

    /** {@code ALvoid alEffectivDirect(ALCcontext * context, ALuint effect, ALenum param, ALint const * values)} */
    @NativeType("ALvoid")
    public static void alEffectivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint const *") int[] values) {
        long __functionAddress = AL.getICD().alEffectivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, effect, param, values, __functionAddress);
    }

    /** {@code ALvoid alEffectfv(ALuint effect, ALenum param, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alEffectfv(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat const *") float[] values) {
        long __functionAddress = AL.getICD().alEffectfv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(effect, param, values, __functionAddress);
    }

    /** {@code ALvoid alEffectfvDirect(ALCcontext * context, ALuint effect, ALenum param, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alEffectfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat const *") float[] values) {
        long __functionAddress = AL.getICD().alEffectfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, effect, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetEffecti(ALuint effect, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetEffecti(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value) {
        long __functionAddress = AL.getICD().alGetEffecti;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(effect, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetEffectiDirect(ALCcontext * context, ALuint effect, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetEffectiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value) {
        long __functionAddress = AL.getICD().alGetEffectiDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, effect, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetEffectiv(ALuint effect, ALenum param, ALint * values)} */
    @NativeType("ALvoid")
    public static void alGetEffectiv(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetEffectiv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(effect, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetEffectivDirect(ALCcontext * context, ALuint effect, ALenum param, ALint * values)} */
    @NativeType("ALvoid")
    public static void alGetEffectivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetEffectivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, effect, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetEffectf(ALuint effect, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetEffectf(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] value) {
        long __functionAddress = AL.getICD().alGetEffectf;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(effect, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetEffectfDirect(ALCcontext * context, ALuint effect, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetEffectfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] value) {
        long __functionAddress = AL.getICD().alGetEffectfDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, effect, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetEffectfv(ALuint effect, ALenum param, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetEffectfv(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetEffectfv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(effect, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetEffectfvDirect(ALCcontext * context, ALuint effect, ALenum param, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetEffectfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetEffectfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, effect, param, values, __functionAddress);
    }

    /** {@code ALvoid alGenFilters(ALsizei n, ALuint * filters)} */
    @NativeType("ALvoid")
    public static void alGenFilters(@NativeType("ALuint *") int[] filters) {
        long __functionAddress = AL.getICD().alGenFilters;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(filters.length, filters, __functionAddress);
    }

    /** {@code ALvoid alGenFiltersDirect(ALCcontext * context, ALsizei n, ALuint * filters)} */
    @NativeType("ALvoid")
    public static void alGenFiltersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int[] filters) {
        long __functionAddress = AL.getICD().alGenFiltersDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, filters.length, filters, __functionAddress);
    }

    /** {@code ALvoid alDeleteFilters(ALsizei n, ALuint * filters)} */
    @NativeType("ALvoid")
    public static void alDeleteFilters(@NativeType("ALuint *") int[] filters) {
        long __functionAddress = AL.getICD().alDeleteFilters;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(filters.length, filters, __functionAddress);
    }

    /** {@code ALvoid alDeleteFiltersDirect(ALCcontext * context, ALsizei n, ALuint * filters)} */
    @NativeType("ALvoid")
    public static void alDeleteFiltersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int[] filters) {
        long __functionAddress = AL.getICD().alDeleteFiltersDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, filters.length, filters, __functionAddress);
    }

    /** {@code ALvoid alFilteriv(ALuint filter, ALenum param, ALint const * values)} */
    @NativeType("ALvoid")
    public static void alFilteriv(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint const *") int[] values) {
        long __functionAddress = AL.getICD().alFilteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(filter, param, values, __functionAddress);
    }

    /** {@code ALvoid alFilterivDirect(ALCcontext * context, ALuint filter, ALenum param, ALint const * values)} */
    @NativeType("ALvoid")
    public static void alFilterivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint const *") int[] values) {
        long __functionAddress = AL.getICD().alFilterivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, filter, param, values, __functionAddress);
    }

    /** {@code ALvoid alFilterfv(ALuint filter, ALenum param, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alFilterfv(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat const *") float[] values) {
        long __functionAddress = AL.getICD().alFilterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(filter, param, values, __functionAddress);
    }

    /** {@code ALvoid alFilterfvDirect(ALCcontext * context, ALuint filter, ALenum param, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alFilterfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat const *") float[] values) {
        long __functionAddress = AL.getICD().alFilterfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, filter, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetFilteri(ALuint filter, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetFilteri(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value) {
        long __functionAddress = AL.getICD().alGetFilteri;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(filter, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetFilteriDirect(ALCcontext * context, ALuint filter, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetFilteriDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value) {
        long __functionAddress = AL.getICD().alGetFilteriDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, filter, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetFilteriv(ALuint filter, ALenum param, ALint * values)} */
    @NativeType("ALvoid")
    public static void alGetFilteriv(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetFilteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(filter, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetFilterivDirect(ALCcontext * context, ALuint filter, ALenum param, ALint * values)} */
    @NativeType("ALvoid")
    public static void alGetFilterivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetFilterivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, filter, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetFilterf(ALuint filter, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetFilterf(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] value) {
        long __functionAddress = AL.getICD().alGetFilterf;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(filter, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetFilterfDirect(ALCcontext * context, ALuint filter, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetFilterfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] value) {
        long __functionAddress = AL.getICD().alGetFilterfDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, filter, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetFilterfv(ALuint filter, ALenum param, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetFilterfv(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetFilterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(filter, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetFilterfvDirect(ALCcontext * context, ALuint filter, ALenum param, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetFilterfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetFilterfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, filter, param, values, __functionAddress);
    }

    /** {@code ALvoid alGenAuxiliaryEffectSlots(ALsizei n, ALuint * effectSlots)} */
    @NativeType("ALvoid")
    public static void alGenAuxiliaryEffectSlots(@NativeType("ALuint *") int[] effectSlots) {
        long __functionAddress = AL.getICD().alGenAuxiliaryEffectSlots;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(effectSlots.length, effectSlots, __functionAddress);
    }

    /** {@code ALvoid alGenAuxiliaryEffectSlotsDirect(ALCcontext * context, ALsizei n, ALuint * effectSlots)} */
    @NativeType("ALvoid")
    public static void alGenAuxiliaryEffectSlotsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int[] effectSlots) {
        long __functionAddress = AL.getICD().alGenAuxiliaryEffectSlotsDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, effectSlots.length, effectSlots, __functionAddress);
    }

    /** {@code ALvoid alDeleteAuxiliaryEffectSlots(ALsizei n, ALuint * effectSlots)} */
    @NativeType("ALvoid")
    public static void alDeleteAuxiliaryEffectSlots(@NativeType("ALuint *") int[] effectSlots) {
        long __functionAddress = AL.getICD().alDeleteAuxiliaryEffectSlots;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(effectSlots.length, effectSlots, __functionAddress);
    }

    /** {@code ALvoid alDeleteAuxiliaryEffectSlotsDirect(ALCcontext * context, ALsizei n, ALuint * effectSlots)} */
    @NativeType("ALvoid")
    public static void alDeleteAuxiliaryEffectSlotsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int[] effectSlots) {
        long __functionAddress = AL.getICD().alDeleteAuxiliaryEffectSlotsDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, effectSlots.length, effectSlots, __functionAddress);
    }

    /** {@code ALvoid alAuxiliaryEffectSlotiv(ALuint effectSlot, ALenum param, ALint const * values)} */
    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotiv(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint const *") int[] values) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotiv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(effectSlot, param, values, __functionAddress);
    }

    /** {@code ALvoid alAuxiliaryEffectSlotivDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALint const * values)} */
    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint const *") int[] values) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, effectSlot, param, values, __functionAddress);
    }

    /** {@code ALvoid alAuxiliaryEffectSlotfv(ALuint effectSlot, ALenum param, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotfv(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat const *") float[] values) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotfv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(effectSlot, param, values, __functionAddress);
    }

    /** {@code ALvoid alAuxiliaryEffectSlotfvDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat const *") float[] values) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, effectSlot, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetAuxiliaryEffectSloti(ALuint effectSlot, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSloti(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSloti;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(effectSlot, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetAuxiliaryEffectSlotiDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotiDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, effectSlot, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetAuxiliaryEffectSlotiv(ALuint effectSlot, ALenum param, ALint * values)} */
    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotiv(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotiv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(effectSlot, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetAuxiliaryEffectSlotivDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALint * values)} */
    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, effectSlot, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetAuxiliaryEffectSlotf(ALuint effectSlot, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotf(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] value) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotf;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(effectSlot, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetAuxiliaryEffectSlotfDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] value) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotfDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, effectSlot, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetAuxiliaryEffectSlotfv(ALuint effectSlot, ALenum param, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotfv(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotfv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(effectSlot, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetAuxiliaryEffectSlotfvDirect(ALCcontext * context, ALuint effectSlot, ALenum param, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, effectSlot, param, values, __functionAddress);
    }

}