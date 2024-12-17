/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_EXT_EFX = "EXTEfx".nativeClassAL("EXT_EFX", prefixTemplate = ALC) {
    IntConstant(
        "ALC_EFX_MAJOR_VERSION"..0x20001,
        "ALC_EFX_MINOR_VERSION"..0x20002,
        "ALC_MAX_AUXILIARY_SENDS"..0x20003
    ).noPrefix()

    IntConstant(
        "METERS_PER_UNIT"..0x20004
    )

    IntConstant(
        "DIRECT_FILTER"..0x20005,
        "AUXILIARY_SEND_FILTER"..0x20006,
        "AIR_ABSORPTION_FACTOR"..0x20007,
        "ROOM_ROLLOFF_FACTOR"..0x20008,
        "CONE_OUTER_GAINHF"..0x20009,
        "DIRECT_FILTER_GAINHF_AUTO"..0x2000A,
        "AUXILIARY_SEND_FILTER_GAIN_AUTO"..0x2000B,
        "AUXILIARY_SEND_FILTER_GAINHF_AUTO"..0x2000C
    )

    IntConstant(
        "EFFECTSLOT_NULL"..0x0000,
        "EFFECTSLOT_EFFECT"..0x0001,
        "EFFECTSLOT_GAIN"..0x0002,
        "EFFECTSLOT_AUXILIARY_SEND_AUTO"..0x0003
    )

    IntConstant(
        "REVERB_DENSITY"..0x0001,
        "REVERB_DIFFUSION"..0x0002,
        "REVERB_GAIN"..0x0003,
        "REVERB_GAINHF"..0x0004,
        "REVERB_DECAY_TIME"..0x0005,
        "REVERB_DECAY_HFRATIO"..0x0006,
        "REVERB_REFLECTIONS_GAIN"..0x0007,
        "REVERB_REFLECTIONS_DELAY"..0x0008,
        "REVERB_LATE_REVERB_GAIN"..0x0009,
        "REVERB_LATE_REVERB_DELAY"..0x000A,
        "REVERB_AIR_ABSORPTION_GAINHF"..0x000B,
        "REVERB_ROOM_ROLLOFF_FACTOR"..0x000C,
        "REVERB_DECAY_HFLIMIT"..0x000D
    )

    IntConstant(
        "EAXREVERB_DENSITY"..0x0001,
        "EAXREVERB_DIFFUSION"..0x0002,
        "EAXREVERB_GAIN"..0x0003,
        "EAXREVERB_GAINHF"..0x0004,
        "EAXREVERB_GAINLF"..0x0005,
        "EAXREVERB_DECAY_TIME"..0x0006,
        "EAXREVERB_DECAY_HFRATIO"..0x0007,
        "EAXREVERB_DECAY_LFRATIO"..0x0008,
        "EAXREVERB_REFLECTIONS_GAIN"..0x0009,
        "EAXREVERB_REFLECTIONS_DELAY"..0x000A,
        "EAXREVERB_REFLECTIONS_PAN"..0x000B,
        "EAXREVERB_LATE_REVERB_GAIN"..0x000C,
        "EAXREVERB_LATE_REVERB_DELAY"..0x000D,
        "EAXREVERB_LATE_REVERB_PAN"..0x000E,
        "EAXREVERB_ECHO_TIME"..0x000F,
        "EAXREVERB_ECHO_DEPTH"..0x0010,
        "EAXREVERB_MODULATION_TIME"..0x0011,
        "EAXREVERB_MODULATION_DEPTH"..0x0012,
        "EAXREVERB_AIR_ABSORPTION_GAINHF"..0x0013,
        "EAXREVERB_HFREFERENCE"..0x0014,
        "EAXREVERB_LFREFERENCE"..0x0015,
        "EAXREVERB_ROOM_ROLLOFF_FACTOR"..0x0016,
        "EAXREVERB_DECAY_HFLIMIT"..0x0017
    )

    IntConstant(
        "CHORUS_WAVEFORM"..0x0001,
        "CHORUS_PHASE"..0x0002,
        "CHORUS_RATE"..0x0003,
        "CHORUS_DEPTH"..0x0004,
        "CHORUS_FEEDBACK"..0x0005,
        "CHORUS_DELAY"..0x0006
    )

    IntConstant(
        "DISTORTION_EDGE"..0x0001,
        "DISTORTION_GAIN"..0x0002,
        "DISTORTION_LOWPASS_CUTOFF"..0x0003,
        "DISTORTION_EQCENTER"..0x0004,
        "DISTORTION_EQBANDWIDTH"..0x0005
    )

    IntConstant(
        "ECHO_DELAY"..0x0001,
        "ECHO_LRDELAY"..0x0002,
        "ECHO_DAMPING"..0x0003,
        "ECHO_FEEDBACK"..0x0004,
        "ECHO_SPREAD"..0x0005
    )

    IntConstant(
        "FLANGER_WAVEFORM"..0x0001,
        "FLANGER_PHASE"..0x0002,
        "FLANGER_RATE"..0x0003,
        "FLANGER_DEPTH"..0x0004,
        "FLANGER_FEEDBACK"..0x0005,
        "FLANGER_DELAY"..0x0006
    )

    IntConstant(
        "FREQUENCY_SHIFTER_FREQUENCY"..0x0001,
        "FREQUENCY_SHIFTER_LEFT_DIRECTION"..0x0002,
        "FREQUENCY_SHIFTER_RIGHT_DIRECTION"..0x0003
    )

    IntConstant(
        "VOCMORPHER_PHONEMEA"..0x0001,
        "VOCMORPHER_PHONEMEA_COARSE_TUNING"..0x0002,
        "VOCMORPHER_PHONEMEB"..0x0003,
        "VOCMORPHER_PHONEMEB_COARSE_TUNING"..0x0004,
        "VOCMORPHER_WAVEFORM"..0x0005,
        "VOCMORPHER_RATE"..0x0006
    )

    IntConstant(
        "PITCH_SHIFTER_COARSE_TUNE"..0x0001,
        "PITCH_SHIFTER_FINE_TUNE"..0x0002
    )

    IntConstant(
        "RING_MODULATOR_FREQUENCY"..0x0001,
        "RING_MODULATOR_HIGHPASS_CUTOFF"..0x0002,
        "RING_MODULATOR_WAVEFORM"..0x0003
    )

    IntConstant(
        "AUTOWAH_ATTACK_TIME"..0x0001,
        "AUTOWAH_RELEASE_TIME"..0x0002,
        "AUTOWAH_RESONANCE"..0x0003,
        "AUTOWAH_PEAK_GAIN"..0x0004
    )

    IntConstant(
        "COMPRESSOR_ONOFF"..0x0001
    )

    IntConstant(
        "EQUALIZER_LOW_GAIN"..0x0001,
        "EQUALIZER_LOW_CUTOFF"..0x0002,
        "EQUALIZER_MID1_GAIN"..0x0003,
        "EQUALIZER_MID1_CENTER"..0x0004,
        "EQUALIZER_MID1_WIDTH"..0x0005,
        "EQUALIZER_MID2_GAIN"..0x0006,
        "EQUALIZER_MID2_CENTER"..0x0007,
        "EQUALIZER_MID2_WIDTH"..0x0008,
        "EQUALIZER_HIGH_GAIN"..0x0009,
        "EQUALIZER_HIGH_CUTOFF"..0x000A
    )

    IntConstant(
        "EFFECT_FIRST_PARAMETER"..0x0000,
        "EFFECT_LAST_PARAMETER"..0x8000,
        "EFFECT_TYPE"..0x8001
    )

    IntConstant(
        "EFFECT_NULL"..0x0000,
        "EFFECT_REVERB"..0x0001,
        "EFFECT_CHORUS"..0x0002,
        "EFFECT_DISTORTION"..0x0003,
        "EFFECT_ECHO"..0x0004,
        "EFFECT_FLANGER"..0x0005,
        "EFFECT_FREQUENCY_SHIFTER"..0x0006,
        "EFFECT_VOCAL_MORPHER"..0x0007,
        "EFFECT_PITCH_SHIFTER"..0x0008,
        "EFFECT_RING_MODULATOR"..0x0009,
        "EFFECT_AUTOWAH"..0x000A,
        "EFFECT_COMPRESSOR"..0x000B,
        "EFFECT_EQUALIZER"..0x000C,
        "EFFECT_EAXREVERB"..0x8000
    )

    IntConstant(
        "LOWPASS_GAIN"..0x0001,
        "LOWPASS_GAINHF"..0x0002
    )

    IntConstant(
        "HIGHPASS_GAIN"..0x0001,
        "HIGHPASS_GAINLF"..0x0002
    )

    IntConstant(
        "BANDPASS_GAIN"..0x0001,
        "BANDPASS_GAINLF"..0x0002,
        "BANDPASS_GAINHF"..0x0003
    )

    IntConstant(
        "FILTER_FIRST_PARAMETER"..0x0000,
        "FILTER_LAST_PARAMETER"..0x8000,
        "FILTER_TYPE"..0x8001
    )

    IntConstant(
        "FILTER_NULL"..0x0000,
        "FILTER_LOWPASS"..0x0001,
        "FILTER_HIGHPASS"..0x0002,
        "FILTER_BANDPASS"..0x0003
    )

    FloatConstant(
        "MIN_AIR_ABSORPTION_FACTOR"..0.0f,
        "MAX_AIR_ABSORPTION_FACTOR"..10.0f,
        "DEFAULT_AIR_ABSORPTION_FACTOR"..0.0f,
        "MIN_ROOM_ROLLOFF_FACTOR"..0.0f,
        "MAX_ROOM_ROLLOFF_FACTOR"..10.0f,
        "DEFAULT_ROOM_ROLLOFF_FACTOR"..0.0f,
        "MIN_CONE_OUTER_GAINHF"..0.0f,
        "MAX_CONE_OUTER_GAINHF"..1.0f,
        "DEFAULT_CONE_OUTER_GAINHF"..1.0f
    )

    IntConstant(
        "MIN_DIRECT_FILTER_GAINHF_AUTO"..0x0,
        "MAX_DIRECT_FILTER_GAINHF_AUTO"..0x1,
        "DEFAULT_DIRECT_FILTER_GAINHF_AUTO"..0x1,
        "MIN_AUXILIARY_SEND_FILTER_GAIN_AUTO"..0x0,
        "MAX_AUXILIARY_SEND_FILTER_GAIN_AUTO"..0x1,
        "DEFAULT_AUXILIARY_SEND_FILTER_GAIN_AUTO"..0x1,
        "MIN_AUXILIARY_SEND_FILTER_GAINHF_AUTO"..0x0,
        "MAX_AUXILIARY_SEND_FILTER_GAINHF_AUTO"..0x1,
        "DEFAULT_AUXILIARY_SEND_FILTER_GAINHF_AUTO"..0x1
    )

    FloatConstant(
        "MIN_METERS_PER_UNIT".."0x0.000002P-126f",
        "MAX_METERS_PER_UNIT".."0x1.fffffeP+127f",
        "DEFAULT_METERS_PER_UNIT"..1.0f
    )

    FloatConstant(
        "REVERB_MIN_DENSITY"..0.0f,
        "REVERB_MAX_DENSITY"..1.0f,
        "REVERB_DEFAULT_DENSITY"..1.0f,
        "REVERB_MIN_DIFFUSION"..0.0f,
        "REVERB_MAX_DIFFUSION"..1.0f,
        "REVERB_DEFAULT_DIFFUSION"..1.0f,
        "REVERB_MIN_GAIN"..0.0f,
        "REVERB_MAX_GAIN"..1.0f,
        "REVERB_DEFAULT_GAIN"..0.32f,
        "REVERB_MIN_GAINHF"..0.0f,
        "REVERB_MAX_GAINHF"..1.0f,
        "REVERB_DEFAULT_GAINHF"..0.89f,
        "REVERB_MIN_DECAY_TIME"..0.1f,
        "REVERB_MAX_DECAY_TIME"..20.0f,
        "REVERB_DEFAULT_DECAY_TIME"..1.49f,
        "REVERB_MIN_DECAY_HFRATIO"..0.1f,
        "REVERB_MAX_DECAY_HFRATIO"..2.0f,
        "REVERB_DEFAULT_DECAY_HFRATIO"..0.83f,
        "REVERB_MIN_REFLECTIONS_GAIN"..0.0f,
        "REVERB_MAX_REFLECTIONS_GAIN"..3.16f,
        "REVERB_DEFAULT_REFLECTIONS_GAIN"..0.05f,
        "REVERB_MIN_REFLECTIONS_DELAY"..0.0f,
        "REVERB_MAX_REFLECTIONS_DELAY"..0.3f,
        "REVERB_DEFAULT_REFLECTIONS_DELAY"..0.007f,
        "REVERB_MIN_LATE_REVERB_GAIN"..0.0f,
        "REVERB_MAX_LATE_REVERB_GAIN"..10.0f,
        "REVERB_DEFAULT_LATE_REVERB_GAIN"..1.26f,
        "REVERB_MIN_LATE_REVERB_DELAY"..0.0f,
        "REVERB_MAX_LATE_REVERB_DELAY"..0.1f,
        "REVERB_DEFAULT_LATE_REVERB_DELAY"..0.011f,
        "REVERB_MIN_AIR_ABSORPTION_GAINHF"..0.892f,
        "REVERB_MAX_AIR_ABSORPTION_GAINHF"..1.0f,
        "REVERB_DEFAULT_AIR_ABSORPTION_GAINHF"..0.994f,
        "REVERB_MIN_ROOM_ROLLOFF_FACTOR"..0.0f,
        "REVERB_MAX_ROOM_ROLLOFF_FACTOR"..10.0f,
        "REVERB_DEFAULT_ROOM_ROLLOFF_FACTOR"..0.0f
    )

    IntConstant(
        "REVERB_MIN_DECAY_HFLIMIT"..0x0,
        "REVERB_MAX_DECAY_HFLIMIT"..0x1,
        "REVERB_DEFAULT_DECAY_HFLIMIT"..0x1
    )

    FloatConstant(
        "EAXREVERB_MIN_DENSITY"..0.0f,
        "EAXREVERB_MAX_DENSITY"..1.0f,
        "EAXREVERB_DEFAULT_DENSITY"..1.0f,
        "EAXREVERB_MIN_DIFFUSION"..0.0f,
        "EAXREVERB_MAX_DIFFUSION"..1.0f,
        "EAXREVERB_DEFAULT_DIFFUSION"..1.0f,
        "EAXREVERB_MIN_GAIN"..0.0f,
        "EAXREVERB_MAX_GAIN"..1.0f,
        "EAXREVERB_DEFAULT_GAIN"..0.32f,
        "EAXREVERB_MIN_GAINHF"..0.0f,
        "EAXREVERB_MAX_GAINHF"..1.0f,
        "EAXREVERB_DEFAULT_GAINHF"..0.89f,
        "EAXREVERB_MIN_GAINLF"..0.0f,
        "EAXREVERB_MAX_GAINLF"..1.0f,
        "EAXREVERB_DEFAULT_GAINLF"..1.0f,
        "EAXREVERB_MIN_DECAY_TIME"..0.1f,
        "EAXREVERB_MAX_DECAY_TIME"..20.0f,
        "EAXREVERB_DEFAULT_DECAY_TIME"..1.49f,
        "EAXREVERB_MIN_DECAY_HFRATIO"..0.1f,
        "EAXREVERB_MAX_DECAY_HFRATIO"..2.0f,
        "EAXREVERB_DEFAULT_DECAY_HFRATIO"..0.83f,
        "EAXREVERB_MIN_DECAY_LFRATIO"..0.1f,
        "EAXREVERB_MAX_DECAY_LFRATIO"..2.0f,
        "EAXREVERB_DEFAULT_DECAY_LFRATIO"..1.0f,
        "EAXREVERB_MIN_REFLECTIONS_GAIN"..0.0f,
        "EAXREVERB_MAX_REFLECTIONS_GAIN"..3.16f,
        "EAXREVERB_DEFAULT_REFLECTIONS_GAIN"..0.05f,
        "EAXREVERB_MIN_REFLECTIONS_DELAY"..0.0f,
        "EAXREVERB_MAX_REFLECTIONS_DELAY"..0.3f,
        "EAXREVERB_DEFAULT_REFLECTIONS_DELAY"..0.007f,
        "EAXREVERB_DEFAULT_REFLECTIONS_PAN_XYZ"..0.0f,
        "EAXREVERB_MIN_LATE_REVERB_GAIN"..0.0f,
        "EAXREVERB_MAX_LATE_REVERB_GAIN"..10.0f,
        "EAXREVERB_DEFAULT_LATE_REVERB_GAIN"..1.26f,
        "EAXREVERB_MIN_LATE_REVERB_DELAY"..0.0f,
        "EAXREVERB_MAX_LATE_REVERB_DELAY"..0.1f,
        "EAXREVERB_DEFAULT_LATE_REVERB_DELAY"..0.011f,
        "EAXREVERB_DEFAULT_LATE_REVERB_PAN_XYZ"..0.0f,
        "EAXREVERB_MIN_ECHO_TIME"..0.075f,
        "EAXREVERB_MAX_ECHO_TIME"..0.25f,
        "EAXREVERB_DEFAULT_ECHO_TIME"..0.25f,
        "EAXREVERB_MIN_ECHO_DEPTH"..0.0f,
        "EAXREVERB_MAX_ECHO_DEPTH"..1.0f,
        "EAXREVERB_DEFAULT_ECHO_DEPTH"..0.0f,
        "EAXREVERB_MIN_MODULATION_TIME"..0.04f,
        "EAXREVERB_MAX_MODULATION_TIME"..4.0f,
        "EAXREVERB_DEFAULT_MODULATION_TIME"..0.25f,
        "EAXREVERB_MIN_MODULATION_DEPTH"..0.0f,
        "EAXREVERB_MAX_MODULATION_DEPTH"..1.0f,
        "EAXREVERB_DEFAULT_MODULATION_DEPTH"..0.0f,
        "EAXREVERB_MIN_AIR_ABSORPTION_GAINHF"..0.892f,
        "EAXREVERB_MAX_AIR_ABSORPTION_GAINHF"..1.0f,
        "EAXREVERB_DEFAULT_AIR_ABSORPTION_GAINHF"..0.994f,
        "EAXREVERB_MIN_HFREFERENCE"..1000.0f,
        "EAXREVERB_MAX_HFREFERENCE"..20000.0f,
        "EAXREVERB_DEFAULT_HFREFERENCE"..5000.0f,
        "EAXREVERB_MIN_LFREFERENCE"..20.0f,
        "EAXREVERB_MAX_LFREFERENCE"..1000.0f,
        "EAXREVERB_DEFAULT_LFREFERENCE"..250.0f,
        "EAXREVERB_MIN_ROOM_ROLLOFF_FACTOR"..0.0f,
        "EAXREVERB_MAX_ROOM_ROLLOFF_FACTOR"..10.0f,
        "EAXREVERB_DEFAULT_ROOM_ROLLOFF_FACTOR"..0.0f
    )

    IntConstant(
        "EAXREVERB_MIN_DECAY_HFLIMIT"..0x0,
        "EAXREVERB_MAX_DECAY_HFLIMIT"..0x1,
        "EAXREVERB_DEFAULT_DECAY_HFLIMIT"..0x1
    )

    IntConstant(
        "CHORUS_WAVEFORM_SINUSOID".."0",
        "CHORUS_WAVEFORM_TRIANGLE".."1",
        "CHORUS_MIN_WAVEFORM".."0",
        "CHORUS_MAX_WAVEFORM".."1",
        "CHORUS_DEFAULT_WAVEFORM".."1",
        "CHORUS_MIN_PHASE".."-180",
        "CHORUS_MAX_PHASE".."180",
        "CHORUS_DEFAULT_PHASE".."90"
    )

    FloatConstant(
        "CHORUS_MIN_RATE"..0.0f,
        "CHORUS_MAX_RATE"..10.0f,
        "CHORUS_DEFAULT_RATE"..1.1f,
        "CHORUS_MIN_DEPTH"..0.0f,
        "CHORUS_MAX_DEPTH"..1.0f,
        "CHORUS_DEFAULT_DEPTH"..0.1f,
        "CHORUS_MIN_FEEDBACK"..-1.0f,
        "CHORUS_MAX_FEEDBACK"..1.0f,
        "CHORUS_DEFAULT_FEEDBACK"..0.25f,
        "CHORUS_MIN_DELAY"..0.0f,
        "CHORUS_MAX_DELAY"..0.016f,
        "CHORUS_DEFAULT_DELAY"..0.016f
    )

    FloatConstant(
        "DISTORTION_MIN_EDGE"..0.0f,
        "DISTORTION_MAX_EDGE"..1.0f,
        "DISTORTION_DEFAULT_EDGE"..0.2f,
        "DISTORTION_MIN_GAIN"..0.01f,
        "DISTORTION_MAX_GAIN"..1.0f,
        "DISTORTION_DEFAULT_GAIN"..0.05f,
        "DISTORTION_MIN_LOWPASS_CUTOFF"..80.0f,
        "DISTORTION_MAX_LOWPASS_CUTOFF"..24000.0f,
        "DISTORTION_DEFAULT_LOWPASS_CUTOFF"..8000.0f,
        "DISTORTION_MIN_EQCENTER"..80.0f,
        "DISTORTION_MAX_EQCENTER"..24000.0f,
        "DISTORTION_DEFAULT_EQCENTER"..3600.0f,
        "DISTORTION_MIN_EQBANDWIDTH"..80.0f,
        "DISTORTION_MAX_EQBANDWIDTH"..24000.0f,
        "DISTORTION_DEFAULT_EQBANDWIDTH"..3600.0f
    )

    FloatConstant(
        "ECHO_MIN_DELAY"..0.0f,
        "ECHO_MAX_DELAY"..0.207f,
        "ECHO_DEFAULT_DELAY"..0.1f,
        "ECHO_MIN_LRDELAY"..0.0f,
        "ECHO_MAX_LRDELAY"..0.404f,
        "ECHO_DEFAULT_LRDELAY"..0.1f,
        "ECHO_MIN_DAMPING"..0.0f,
        "ECHO_MAX_DAMPING"..0.99f,
        "ECHO_DEFAULT_DAMPING"..0.5f,
        "ECHO_MIN_FEEDBACK"..0.0f,
        "ECHO_MAX_FEEDBACK"..1.0f,
        "ECHO_DEFAULT_FEEDBACK"..0.5f,
        "ECHO_MIN_SPREAD"..-1.0f,
        "ECHO_MAX_SPREAD"..1.0f,
        "ECHO_DEFAULT_SPREAD"..-1.0f
    )

    IntConstant(
        "FLANGER_WAVEFORM_SINUSOID".."0",
        "FLANGER_WAVEFORM_TRIANGLE".."1",
        "FLANGER_MIN_WAVEFORM".."0",
        "FLANGER_MAX_WAVEFORM".."1",
        "FLANGER_DEFAULT_WAVEFORM".."1",
        "FLANGER_MIN_PHASE".."-180",
        "FLANGER_MAX_PHASE".."180",
        "FLANGER_DEFAULT_PHASE".."0"
    )

    FloatConstant(
        "FLANGER_MIN_RATE"..0.0f,
        "FLANGER_MAX_RATE"..10.0f,
        "FLANGER_DEFAULT_RATE"..0.27f,
        "FLANGER_MIN_DEPTH"..0.0f,
        "FLANGER_MAX_DEPTH"..1.0f,
        "FLANGER_DEFAULT_DEPTH"..1.0f,
        "FLANGER_MIN_FEEDBACK"..-1.0f,
        "FLANGER_MAX_FEEDBACK"..1.0f,
        "FLANGER_DEFAULT_FEEDBACK"..-0.5f,
        "FLANGER_MIN_DELAY"..0.0f,
        "FLANGER_MAX_DELAY"..0.004f,
        "FLANGER_DEFAULT_DELAY"..0.002f
    )

    FloatConstant(
        "FREQUENCY_SHIFTER_MIN_FREQUENCY"..0.0f,
        "FREQUENCY_SHIFTER_MAX_FREQUENCY"..24000.0f,
        "FREQUENCY_SHIFTER_DEFAULT_FREQUENCY"..0.0f
    )

    IntConstant(
        "FREQUENCY_SHIFTER_MIN_LEFT_DIRECTION".."0",
        "FREQUENCY_SHIFTER_MAX_LEFT_DIRECTION".."2",
        "FREQUENCY_SHIFTER_DEFAULT_LEFT_DIRECTION".."0",
        "FREQUENCY_SHIFTER_DIRECTION_DOWN".."0",
        "FREQUENCY_SHIFTER_DIRECTION_UP".."1",
        "FREQUENCY_SHIFTER_DIRECTION_OFF".."2",
        "FREQUENCY_SHIFTER_MIN_RIGHT_DIRECTION".."0",
        "FREQUENCY_SHIFTER_MAX_RIGHT_DIRECTION".."2",
        "FREQUENCY_SHIFTER_DEFAULT_RIGHT_DIRECTION".."0"
    )

    IntConstant(
        "VOCAL_MORPHER_MIN_PHONEMEA".."0",
        "VOCAL_MORPHER_MAX_PHONEMEA".."29",
        "VOCAL_MORPHER_DEFAULT_PHONEMEA".."0",
        "VOCAL_MORPHER_MIN_PHONEMEA_COARSE_TUNING".."-24",
        "VOCAL_MORPHER_MAX_PHONEMEA_COARSE_TUNING".."24",
        "VOCAL_MORPHER_DEFAULT_PHONEMEA_COARSE_TUNING".."0",
        "VOCAL_MORPHER_MIN_PHONEMEB".."0",
        "VOCAL_MORPHER_MAX_PHONEMEB".."29",
        "VOCAL_MORPHER_DEFAULT_PHONEMEB".."10",
        "VOCAL_MORPHER_MIN_PHONEMEB_COARSE_TUNING".."-24",
        "VOCAL_MORPHER_MAX_PHONEMEB_COARSE_TUNING".."24",
        "VOCAL_MORPHER_DEFAULT_PHONEMEB_COARSE_TUNING".."0",
        "VOCAL_MORPHER_PHONEME_A".."0",
        "VOCAL_MORPHER_PHONEME_E".."1",
        "VOCAL_MORPHER_PHONEME_I".."2",
        "VOCAL_MORPHER_PHONEME_O".."3",
        "VOCAL_MORPHER_PHONEME_U".."4",
        "VOCAL_MORPHER_PHONEME_AA".."5",
        "VOCAL_MORPHER_PHONEME_AE".."6",
        "VOCAL_MORPHER_PHONEME_AH".."7",
        "VOCAL_MORPHER_PHONEME_AO".."8",
        "VOCAL_MORPHER_PHONEME_EH".."9",
        "VOCAL_MORPHER_PHONEME_ER".."10",
        "VOCAL_MORPHER_PHONEME_IH".."11",
        "VOCAL_MORPHER_PHONEME_IY".."12",
        "VOCAL_MORPHER_PHONEME_UH".."13",
        "VOCAL_MORPHER_PHONEME_UW".."14",
        "VOCAL_MORPHER_PHONEME_B".."15",
        "VOCAL_MORPHER_PHONEME_D".."16",
        "VOCAL_MORPHER_PHONEME_F".."17",
        "VOCAL_MORPHER_PHONEME_G".."18",
        "VOCAL_MORPHER_PHONEME_J".."19",
        "VOCAL_MORPHER_PHONEME_K".."20",
        "VOCAL_MORPHER_PHONEME_L".."21",
        "VOCAL_MORPHER_PHONEME_M".."22",
        "VOCAL_MORPHER_PHONEME_N".."23",
        "VOCAL_MORPHER_PHONEME_P".."24",
        "VOCAL_MORPHER_PHONEME_R".."25",
        "VOCAL_MORPHER_PHONEME_S".."26",
        "VOCAL_MORPHER_PHONEME_T".."27",
        "VOCAL_MORPHER_PHONEME_V".."28",
        "VOCAL_MORPHER_PHONEME_Z".."29",
        "VOCAL_MORPHER_WAVEFORM_SINUSOID".."0",
        "VOCAL_MORPHER_WAVEFORM_TRIANGLE".."1",
        "VOCAL_MORPHER_WAVEFORM_SAWTOOTH".."2",
        "VOCAL_MORPHER_MIN_WAVEFORM".."0",
        "VOCAL_MORPHER_MAX_WAVEFORM".."2",
        "VOCAL_MORPHER_DEFAULT_WAVEFORM".."0"
    )

    FloatConstant(
        "VOCAL_MORPHER_MIN_RATE"..0.0f,
        "VOCAL_MORPHER_MAX_RATE"..10.0f,
        "VOCAL_MORPHER_DEFAULT_RATE"..1.41f
    )

    IntConstant(
        "PITCH_SHIFTER_MIN_COARSE_TUNE".."-12",
        "PITCH_SHIFTER_MAX_COARSE_TUNE".."12",
        "PITCH_SHIFTER_DEFAULT_COARSE_TUNE".."12",
        "PITCH_SHIFTER_MIN_FINE_TUNE".."-50",
        "PITCH_SHIFTER_MAX_FINE_TUNE".."50",
        "PITCH_SHIFTER_DEFAULT_FINE_TUNE".."0"
    )

    FloatConstant(
        "RING_MODULATOR_MIN_FREQUENCY"..0.0f,
        "RING_MODULATOR_MAX_FREQUENCY"..8000.0f,
        "RING_MODULATOR_DEFAULT_FREQUENCY"..440.0f,
        "RING_MODULATOR_MIN_HIGHPASS_CUTOFF"..0.0f,
        "RING_MODULATOR_MAX_HIGHPASS_CUTOFF"..24000.0f,
        "RING_MODULATOR_DEFAULT_HIGHPASS_CUTOFF"..800.0f
    )

    IntConstant(
        "RING_MODULATOR_SINUSOID".."0",
        "RING_MODULATOR_SAWTOOTH".."1",
        "RING_MODULATOR_SQUARE".."2",
        "RING_MODULATOR_MIN_WAVEFORM".."0",
        "RING_MODULATOR_MAX_WAVEFORM".."2",
        "RING_MODULATOR_DEFAULT_WAVEFORM".."0"
    )

    FloatConstant(
        "AUTOWAH_MIN_ATTACK_TIME"..0.0001f,
        "AUTOWAH_MAX_ATTACK_TIME"..1.0f,
        "AUTOWAH_DEFAULT_ATTACK_TIME"..0.06f,
        "AUTOWAH_MIN_RELEASE_TIME"..0.0001f,
        "AUTOWAH_MAX_RELEASE_TIME"..1.0f,
        "AUTOWAH_DEFAULT_RELEASE_TIME"..0.06f,
        "AUTOWAH_MIN_RESONANCE"..2.0f,
        "AUTOWAH_MAX_RESONANCE"..1000.0f,
        "AUTOWAH_DEFAULT_RESONANCE"..1000.0f,
        "AUTOWAH_MIN_PEAK_GAIN"..0.00003f,
        "AUTOWAH_MAX_PEAK_GAIN"..31621.0f,
        "AUTOWAH_DEFAULT_PEAK_GAIN"..11.22f
    )

    IntConstant(
        "COMPRESSOR_MIN_ONOFF".."0",
        "COMPRESSOR_MAX_ONOFF".."1",
        "COMPRESSOR_DEFAULT_ONOFF".."1"
    )

    FloatConstant(
        "EQUALIZER_MIN_LOW_GAIN"..0.126f,
        "EQUALIZER_MAX_LOW_GAIN"..7.943f,
        "EQUALIZER_DEFAULT_LOW_GAIN"..1.0f,
        "EQUALIZER_MIN_LOW_CUTOFF"..50.0f,
        "EQUALIZER_MAX_LOW_CUTOFF"..800.0f,
        "EQUALIZER_DEFAULT_LOW_CUTOFF"..200.0f,
        "EQUALIZER_MIN_MID1_GAIN"..0.126f,
        "EQUALIZER_MAX_MID1_GAIN"..7.943f,
        "EQUALIZER_DEFAULT_MID1_GAIN"..1.0f,
        "EQUALIZER_MIN_MID1_CENTER"..200.0f,
        "EQUALIZER_MAX_MID1_CENTER"..3000.0f,
        "EQUALIZER_DEFAULT_MID1_CENTER"..500.0f,
        "EQUALIZER_MIN_MID1_WIDTH"..0.01f,
        "EQUALIZER_MAX_MID1_WIDTH"..1.0f,
        "EQUALIZER_DEFAULT_MID1_WIDTH"..1.0f,
        "EQUALIZER_MIN_MID2_GAIN"..0.126f,
        "EQUALIZER_MAX_MID2_GAIN"..7.943f,
        "EQUALIZER_DEFAULT_MID2_GAIN"..1.0f,
        "EQUALIZER_MIN_MID2_CENTER"..1000.0f,
        "EQUALIZER_MAX_MID2_CENTER"..8000.0f,
        "EQUALIZER_DEFAULT_MID2_CENTER"..3000.0f,
        "EQUALIZER_MIN_MID2_WIDTH"..0.01f,
        "EQUALIZER_MAX_MID2_WIDTH"..1.0f,
        "EQUALIZER_DEFAULT_MID2_WIDTH"..1.0f,
        "EQUALIZER_MIN_HIGH_GAIN"..0.126f,
        "EQUALIZER_MAX_HIGH_GAIN"..7.943f,
        "EQUALIZER_DEFAULT_HIGH_GAIN"..1.0f,
        "EQUALIZER_MIN_HIGH_CUTOFF"..4000.0f,
        "EQUALIZER_MAX_HIGH_CUTOFF"..16000.0f,
        "EQUALIZER_DEFAULT_HIGH_CUTOFF"..6000.0f
    )

    FloatConstant(
        "LOWPASS_MIN_GAIN"..0.0f,
        "LOWPASS_MAX_GAIN"..1.0f,
        "LOWPASS_DEFAULT_GAIN"..1.0f,
        "LOWPASS_MIN_GAINHF"..0.0f,
        "LOWPASS_MAX_GAINHF"..1.0f,
        "LOWPASS_DEFAULT_GAINHF"..1.0f
    )

    FloatConstant(
        "HIGHPASS_MIN_GAIN"..0.0f,
        "HIGHPASS_MAX_GAIN"..1.0f,
        "HIGHPASS_DEFAULT_GAIN"..1.0f,
        "HIGHPASS_MIN_GAINLF"..0.0f,
        "HIGHPASS_MAX_GAINLF"..1.0f,
        "HIGHPASS_DEFAULT_GAINLF"..1.0f
    )

    FloatConstant(
        "BANDPASS_MIN_GAIN"..0.0f,
        "BANDPASS_MAX_GAIN"..1.0f,
        "BANDPASS_DEFAULT_GAIN"..1.0f,
        "BANDPASS_MIN_GAINHF"..0.0f,
        "BANDPASS_MAX_GAINHF"..1.0f,
        "BANDPASS_DEFAULT_GAINHF"..1.0f,
        "BANDPASS_MIN_GAINLF"..0.0f,
        "BANDPASS_MAX_GAINLF"..1.0f,
        "BANDPASS_DEFAULT_GAINLF"..1.0f
    )

    ALvoid(
        "GenEffects",

        AutoSize("effects")..ALsizei("n"),
        ReturnParam..ALuint.p("effects")
    ).directContext()

    ALvoid(
        "DeleteEffects",

        AutoSize("effects")..ALsizei("n"),
        SingleValue("effect")..ALuint.p("effects")
    ).directContext()

    ALboolean(
        "IsEffect",

        ALuint("effect")
    ).directContext()

    ALvoid(
        "Effecti",

        ALuint("effect"),
        ALenum("param"),
        ALint("value")
    ).directContext()

    ALvoid(
        "Effectiv",

        ALuint("effect"),
        ALenum("param"),
        Check(1)..ALint.const.p("values")
    ).directContext()

    ALvoid(
        "Effectf",

        ALuint("effect"),
        ALenum("param"),
        ALfloat("value")
    ).directContext()

    ALvoid(
        "Effectfv",

        ALuint("effect"),
        ALenum("param"),
        Check(1)..ALfloat.const.p("values")
    ).directContext()

    ALvoid(
        "GetEffecti",

        ALuint("effect"),
        ALenum("param"),
        Check(1)..ReturnParam..ALint.p("value")
    ).directContext()

    ALvoid(
        "GetEffectiv",

        ALuint("effect"),
        ALenum("param"),
        Check(1)..ALint.p("values")
    ).directContext()

    ALvoid(
        "GetEffectf",

        ALuint("effect"),
        ALenum("param"),
        Check(1)..ReturnParam..ALfloat.p("value")
    ).directContext()

    ALvoid(
        "GetEffectfv",

        ALuint("effect"),
        ALenum("param"),
        Check(1)..ALfloat.p("values")
    ).directContext()

    ALvoid(
        "GenFilters",

        AutoSize("filters")..ALsizei("n"),
        ReturnParam..ALuint.p("filters")
    ).directContext()

    ALvoid(
        "DeleteFilters",

        AutoSize("filters")..ALsizei("n"),
        SingleValue("filter")..ALuint.p("filters")
    ).directContext()

    ALboolean(
        "IsFilter",

        ALuint("filter")
    ).directContext()

    ALvoid(
        "Filteri",

        ALuint("filter"),
        ALenum("param"),
        ALint("value")
    ).directContext()

    ALvoid(
        "Filteriv",

        ALuint("filter"),
        ALenum("param"),
        Check(1)..ALint.const.p("values")
    ).directContext()

    ALvoid(
        "Filterf",

        ALuint("filter"),
        ALenum("param"),
        ALfloat("value")
    ).directContext()

    ALvoid(
        "Filterfv",

        ALuint("filter"),
        ALenum("param"),
        Check(1)..ALfloat.const.p("values")
    ).directContext()

    ALvoid(
        "GetFilteri",

        ALuint("filter"),
        ALenum("param"),
        Check(1)..ReturnParam..ALint.p("value")
    ).directContext()

    ALvoid(
        "GetFilteriv",

        ALuint("filter"),
        ALenum("param"),
        Check(1)..ALint.p("values")
    ).directContext()

    ALvoid(
        "GetFilterf",

        ALuint("filter"),
        ALenum("param"),
        Check(1)..ReturnParam..ALfloat.p("value")
    ).directContext()

    ALvoid(
        "GetFilterfv",

        ALuint("filter"),
        ALenum("param"),
        Check(1)..ALfloat.p("values")
    ).directContext()

    ALvoid(
        "GenAuxiliaryEffectSlots",

        AutoSize("effectSlots")..ALsizei("n"),
        ReturnParam..ALuint.p("effectSlots")
    ).directContext()

    ALvoid(
        "DeleteAuxiliaryEffectSlots",

        AutoSize("effectSlots")..ALsizei("n"),
        SingleValue("effectSlot")..ALuint.p("effectSlots")
    ).directContext()

    ALboolean(
        "IsAuxiliaryEffectSlot",

        ALuint("effectSlot")
    ).directContext()

    ALvoid(
        "AuxiliaryEffectSloti",

        ALuint("effectSlot"),
        ALenum("param"),
        ALint("value")
    ).directContext()

    ALvoid(
        "AuxiliaryEffectSlotiv",

        ALuint("effectSlot"),
        ALenum("param"),
        Check(1)..ALint.const.p("values")
    ).directContext()

    ALvoid(
        "AuxiliaryEffectSlotf",

        ALuint("effectSlot"),
        ALenum("param"),
        ALfloat("value")
    ).directContext()

    ALvoid(
        "AuxiliaryEffectSlotfv",

        ALuint("effectSlot"),
        ALenum("param"),
        Check(1)..ALfloat.const.p("values")
    ).directContext()

    ALvoid(
        "GetAuxiliaryEffectSloti",

        ALuint("effectSlot"),
        ALenum("param"),
        Check(1)..ReturnParam..ALint.p("value")
    ).directContext()

    ALvoid(
        "GetAuxiliaryEffectSlotiv",

        ALuint("effectSlot"),
        ALenum("param"),
        Check(1)..ALint.p("values")
    ).directContext()

    ALvoid(
        "GetAuxiliaryEffectSlotf",

        ALuint("effectSlot"),
        ALenum("param"),
        Check(1)..ReturnParam..ALfloat.p("value")
    ).directContext()

    ALvoid(
        "GetAuxiliaryEffectSlotfv",

        ALuint("effectSlot"),
        ALenum("param"),
        Check(1)..ALfloat.p("values")
    ).directContext()

    ALCBinding.addClass(this)
}