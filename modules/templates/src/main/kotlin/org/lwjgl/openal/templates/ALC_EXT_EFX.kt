/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val ALC_EXT_EFX = "EXTEfx".nativeClassAL("EXT_EFX", prefixTemplate = ALC) {
	nativeImport (
		"OpenAL.h"
	)

	documentation = "bindings to ALC_EXT_EFX extension."

	IntConstant(
		"ALC tokens.",

		"ALC_EFX_MAJOR_VERSION" _ 0x20001,
		"ALC_EFX_MINOR_VERSION" _ 0x20002,
		"ALC_MAX_AUXILIARY_SENDS" _ 0x20003
	).noPrefix()

	IntConstant(
		"Listener properties.",

		"METERS_PER_UNIT " _ 0x20004
	)

	IntConstant(
		"Source properties.",

		"DIRECT_FILTER" _ 0x20005,
		"AUXILIARY_SEND_FILTER" _ 0x20006,
		"AIR_ABSORPTION_FACTOR" _ 0x20007,
		"ROOM_ROLLOFF_FACTOR" _ 0x20008,
		"CONE_OUTER_GAINHF" _ 0x20009,
		"DIRECT_FILTER_GAINHF_AUTO" _ 0x2000A,
		"AUXILIARY_SEND_FILTER_GAIN_AUTO" _ 0x2000B,
		"AUXILIARY_SEND_FILTER_GAINHF_AUTO" _ 0x2000C
	)

	IntConstant(
		"Auxiliary effect slot properties.",

		"EFFECTSLOT_NULL" _ 0x0000,
		"EFFECTSLOT_EFFECT" _ 0x0001,
		"EFFECTSLOT_GAIN" _ 0x0002,
		"EFFECTSLOT_AUXILIARY_SEND_AUTO" _ 0x0003
	)

	IntConstant(
		"Reverb effect parameters.",

		"REVERB_DENSITY" _ 0x0001,
		"REVERB_DIFFUSION" _ 0x0002,
		"REVERB_GAIN" _ 0x0003,
		"REVERB_GAINHF" _ 0x0004,
		"REVERB_DECAY_TIME" _ 0x0005,
		"REVERB_DECAY_HFRATIO" _ 0x0006,
		"REVERB_REFLECTIONS_GAIN" _ 0x0007,
		"REVERB_REFLECTIONS_DELAY" _ 0x0008,
		"REVERB_LATE_REVERB_GAIN" _ 0x0009,
		"REVERB_LATE_REVERB_DELAY" _ 0x000A,
		"REVERB_AIR_ABSORPTION_GAINHF" _ 0x000B,
		"REVERB_ROOM_ROLLOFF_FACTOR" _ 0x000C,
		"REVERB_DECAY_HFLIMIT" _ 0x000D
	)

	IntConstant(
		"EAX Reverb effect parameters.",

		"EAXREVERB_DENSITY" _ 0x0001,
		"EAXREVERB_DIFFUSION" _ 0x0002,
		"EAXREVERB_GAIN" _ 0x0003,
		"EAXREVERB_GAINHF" _ 0x0004,
		"EAXREVERB_GAINLF" _ 0x0005,
		"EAXREVERB_DECAY_TIME" _ 0x0006,
		"EAXREVERB_DECAY_HFRATIO" _ 0x0007,
		"EAXREVERB_DECAY_LFRATIO" _ 0x0008,
		"EAXREVERB_REFLECTIONS_GAIN" _ 0x0009,
		"EAXREVERB_REFLECTIONS_DELAY" _ 0x000A,
		"EAXREVERB_REFLECTIONS_PAN" _ 0x000B,
		"EAXREVERB_LATE_REVERB_GAIN" _ 0x000C,
		"EAXREVERB_LATE_REVERB_DELAY" _ 0x000D,
		"EAXREVERB_LATE_REVERB_PAN" _ 0x000E,
		"EAXREVERB_ECHO_TIME" _ 0x000F,
		"EAXREVERB_ECHO_DEPTH" _ 0x0010,
		"EAXREVERB_MODULATION_TIME" _ 0x0011,
		"EAXREVERB_MODULATION_DEPTH" _ 0x0012,
		"EAXREVERB_AIR_ABSORPTION_GAINHF" _ 0x0013,
		"EAXREVERB_HFREFERENCE" _ 0x0014,
		"EAXREVERB_LFREFERENCE" _ 0x0015,
		"EAXREVERB_ROOM_ROLLOFF_FACTOR" _ 0x0016,
		"EAXREVERB_DECAY_HFLIMIT" _ 0x0017
	)

	IntConstant(
		"Chorus effect parameters.",

		"CHORUS_WAVEFORM" _ 0x0001,
		"CHORUS_PHASE" _ 0x0002,
		"CHORUS_RATE" _ 0x0003,
		"CHORUS_DEPTH" _ 0x0004,
		"CHORUS_FEEDBACK" _ 0x0005,
		"CHORUS_DELAY" _ 0x0006
	)

	IntConstant(
		"Distortion effect parameters.",

		"DISTORTION_EDGE" _ 0x0001,
		"DISTORTION_GAIN" _ 0x0002,
		"DISTORTION_LOWPASS_CUTOFF" _ 0x0003,
		"DISTORTION_EQCENTER" _ 0x0004,
		"DISTORTION_EQBANDWIDTH" _ 0x0005
	)

	IntConstant(
		"Echo effect parameters.",

		"ECHO_DELAY" _ 0x0001,
		"ECHO_LRDELAY" _ 0x0002,
		"ECHO_DAMPING" _ 0x0003,
		"ECHO_FEEDBACK" _ 0x0004,
		"ECHO_SPREAD" _ 0x0005
	)

	IntConstant(
		"Flanger effect parameters.",

		"FLANGER_WAVEFORM" _ 0x0001,
		"FLANGER_PHASE" _ 0x0002,
		"FLANGER_RATE" _ 0x0003,
		"FLANGER_DEPTH" _ 0x0004,
		"FLANGER_FEEDBACK" _ 0x0005,
		"FLANGER_DELAY" _ 0x0006
	)

	IntConstant(
		"Frequency shifter effect parameters.",

		"FREQUENCY_SHIFTER_FREQUENCY" _ 0x0001,
		"FREQUENCY_SHIFTER_LEFT_DIRECTION" _ 0x0002,
		"FREQUENCY_SHIFTER_RIGHT_DIRECTION" _ 0x0003
	)

	IntConstant(
		"Vocal morpher effect parameters.",

		"VOCMORPHER_PHONEMEA" _ 0x0001,
		"VOCMORPHER_PHONEMEA_COARSE_TUNING" _ 0x0002,
		"VOCMORPHER_PHONEMEB" _ 0x0003,
		"VOCMORPHER_PHONEMEB_COARSE_TUNING" _ 0x0004,
		"VOCMORPHER_WAVEFORM" _ 0x0005,
		"VOCMORPHER_RATE" _ 0x0006
	)

	IntConstant(
		"Pitch shifter effect parameters.",

		"PITCH_SHIFTER_COARSE_TUNE" _ 0x0001,
		"PITCH_SHIFTER_FINE_TUNE" _ 0x0002
	)

	IntConstant(
		"Ring modulator effect parameters.",

		"RING_MODULATOR_FREQUENCY" _ 0x0001,
		"RING_MODULATOR_HIGHPASS_CUTOFF" _ 0x0002,
		"RING_MODULATOR_WAVEFORM" _ 0x0003
	)

	IntConstant(
		"Autowah effect parameters.",

		"AUTOWAH_ATTACK_TIME" _ 0x0001,
		"AUTOWAH_RELEASE_TIME" _ 0x0002,
		"AUTOWAH_RESONANCE" _ 0x0003,
		"AUTOWAH_PEAK_GAIN" _ 0x0004
	)

	IntConstant(
		"Compressor effect parameters.",

		"COMPRESSOR_ONOFF" _ 0x0001
	)

	IntConstant(
		"Equalizer effect parameters.",

		"EQUALIZER_LOW_GAIN" _ 0x0001,
		"EQUALIZER_LOW_CUTOFF" _ 0x0002,
		"EQUALIZER_MID1_GAIN" _ 0x0003,
		"EQUALIZER_MID1_CENTER" _ 0x0004,
		"EQUALIZER_MID1_WIDTH" _ 0x0005,
		"EQUALIZER_MID2_GAIN" _ 0x0006,
		"EQUALIZER_MID2_CENTER" _ 0x0007,
		"EQUALIZER_MID2_WIDTH" _ 0x0008,
		"EQUALIZER_HIGH_GAIN" _ 0x0009,
		"EQUALIZER_HIGH_CUTOFF" _ 0x000A
	)

	IntConstant(
		"Effect type effect parameters.",

		"EFFECT_FIRST_PARAMETER" _ 0x0000,
		"EFFECT_LAST_PARAMETER" _ 0x8000,
		"EFFECT_TYPE" _ 0x8001
	)

	IntConstant(
		"Effect types",

		"EFFECT_NULL" _ 0x0000,
		"EFFECT_REVERB" _ 0x0001,
		"EFFECT_CHORUS" _ 0x0002,
		"EFFECT_DISTORTION" _ 0x0003,
		"EFFECT_ECHO" _ 0x0004,
		"EFFECT_FLANGER" _ 0x0005,
		"EFFECT_FREQUENCY_SHIFTER" _ 0x0006,
		"EFFECT_VOCAL_MORPHER" _ 0x0007,
		"EFFECT_PITCH_SHIFTER" _ 0x0008,
		"EFFECT_RING_MODULATOR" _ 0x0009,
		"EFFECT_AUTOWAH" _ 0x000A,
		"EFFECT_COMPRESSOR" _ 0x000B,
		"EFFECT_EQUALIZER" _ 0x000C,
		"EFFECT_EAXREVERB" _ 0x8000
	)

	IntConstant(
		"Lowpass filter properties",

		"LOWPASS_GAIN" _ 0x0001,
		"LOWPASS_GAINHF" _ 0x0002
	)

	IntConstant(
		"Highpass filter properties",

		"HIGHPASS_GAIN" _ 0x0001,
		"HIGHPASS_GAINLF" _ 0x0002
	)

	IntConstant(
		"Bandpass filter properties",

		"BANDPASS_GAIN" _ 0x0001,
		"BANDPASS_GAINLF" _ 0x0002,
		"BANDPASS_GAINHF" _ 0x0003
	)

	IntConstant(
		"Filter type",

		"FILTER_FIRST_PARAMETER" _ 0x0000,
		"FILTER_LAST_PARAMETER" _ 0x8000,
		"FILTER_TYPE" _ 0x8001
	)

	IntConstant(
		"Filter types.",

		"FILTER_NULL" _ 0x0000,
		"FILTER_LOWPASS" _ 0x0001,
		"FILTER_HIGHPASS" _ 0x0002,
		"FILTER_BANDPASS" _ 0x0003
	)

	FloatConstant(
		"Source property value ranges and defaults",

		"MIN_AIR_ABSORPTION_FACTOR" _ 0.0f,
		"MAX_AIR_ABSORPTION_FACTOR" _ 10.0f,
		"DEFAULT_AIR_ABSORPTION_FACTOR" _ 0.0f,
		"MIN_ROOM_ROLLOFF_FACTOR" _ 0.0f,
		"MAX_ROOM_ROLLOFF_FACTOR" _ 10.0f,
		"DEFAULT_ROOM_ROLLOFF_FACTOR" _ 0.0f,
		"MIN_CONE_OUTER_GAINHF" _ 0.0f,
		"MAX_CONE_OUTER_GAINHF" _ 1.0f,
		"DEFAULT_CONE_OUTER_GAINHF" _ 1.0f
	)

	IntConstant(
		"Source property value ranges and defaults",

		"MIN_DIRECT_FILTER_GAINHF_AUTO" _ 0x0,
		"MAX_DIRECT_FILTER_GAINHF_AUTO" _ 0x1,
		"DEFAULT_DIRECT_FILTER_GAINHF_AUTO" _ 0x1,
		"MIN_AUXILIARY_SEND_FILTER_GAIN_AUTO" _ 0x0,
		"MAX_AUXILIARY_SEND_FILTER_GAIN_AUTO" _ 0x1,
		"DEFAULT_AUXILIARY_SEND_FILTER_GAIN_AUTO" _ 0x1,
		"MIN_AUXILIARY_SEND_FILTER_GAINHF_AUTO" _ 0x0,
		"MAX_AUXILIARY_SEND_FILTER_GAINHF_AUTO" _ 0x1,
		"DEFAULT_AUXILIARY_SEND_FILTER_GAINHF_AUTO" _ 0x1
	)

	FloatConstant(
		"Listener property value ranges and defaults.",

		"MIN_METERS_PER_UNIT" expr "0x0.000002P-126f",
		"MAX_METERS_PER_UNIT" expr "0x1.fffffeP+127f",
		"DEFAULT_METERS_PER_UNIT" _ 1.0f
	)

	FloatConstant(
		"Reverb effect parameter ranges and defaults",

		"REVERB_MIN_DENSITY" _ 0.0f,
		"REVERB_MAX_DENSITY" _ 1.0f,
		"REVERB_DEFAULT_DENSITY" _ 1.0f,
		"REVERB_MIN_DIFFUSION" _ 0.0f,
		"REVERB_MAX_DIFFUSION" _ 1.0f,
		"REVERB_DEFAULT_DIFFUSION" _ 1.0f,
		"REVERB_MIN_GAIN" _ 0.0f,
		"REVERB_MAX_GAIN" _ 1.0f,
		"REVERB_DEFAULT_GAIN" _ 0.32f,
		"REVERB_MIN_GAINHF" _ 0.0f,
		"REVERB_MAX_GAINHF" _ 1.0f,
		"REVERB_DEFAULT_GAINHF" _ 0.89f,
		"REVERB_MIN_DECAY_TIME" _ 0.1f,
		"REVERB_MAX_DECAY_TIME" _ 20.0f,
		"REVERB_DEFAULT_DECAY_TIME" _ 1.49f,
		"REVERB_MIN_DECAY_HFRATIO" _ 0.1f,
		"REVERB_MAX_DECAY_HFRATIO" _ 2.0f,
		"REVERB_DEFAULT_DECAY_HFRATIO" _ 0.83f,
		"REVERB_MIN_REFLECTIONS_GAIN" _ 0.0f,
		"REVERB_MAX_REFLECTIONS_GAIN" _ 3.16f,
		"REVERB_DEFAULT_REFLECTIONS_GAIN" _ 0.05f,
		"REVERB_MIN_REFLECTIONS_DELAY" _ 0.0f,
		"REVERB_MAX_REFLECTIONS_DELAY" _ 0.3f,
		"REVERB_DEFAULT_REFLECTIONS_DELAY" _ 0.007f,
		"REVERB_MIN_LATE_REVERB_GAIN" _ 0.0f,
		"REVERB_MAX_LATE_REVERB_GAIN" _ 10.0f,
		"REVERB_DEFAULT_LATE_REVERB_GAIN" _ 1.26f,
		"REVERB_MIN_LATE_REVERB_DELAY" _ 0.0f,
		"REVERB_MAX_LATE_REVERB_DELAY" _ 0.1f,
		"REVERB_DEFAULT_LATE_REVERB_DELAY" _ 0.011f,
		"REVERB_MIN_AIR_ABSORPTION_GAINHF" _ 0.892f,
		"REVERB_MAX_AIR_ABSORPTION_GAINHF" _ 1.0f,
		"REVERB_DEFAULT_AIR_ABSORPTION_GAINHF" _ 0.994f,
		"REVERB_MIN_ROOM_ROLLOFF_FACTOR" _ 0.0f,
		"REVERB_MAX_ROOM_ROLLOFF_FACTOR" _ 10.0f,
		"REVERB_DEFAULT_ROOM_ROLLOFF_FACTOR" _ 0.0f
	)

	IntConstant(
		"Reverb effect parameter ranges and defaults",

		"REVERB_MIN_DECAY_HFLIMIT" _ 0x0,
		"REVERB_MAX_DECAY_HFLIMIT" _ 0x1,
		"REVERB_DEFAULT_DECAY_HFLIMIT" _ 0x1
	)

	FloatConstant(
		"EAX reverb effect parameter ranges and defaults",

		"EAXREVERB_MIN_DENSITY" _ 0.0f,
		"EAXREVERB_MAX_DENSITY" _ 1.0f,
		"EAXREVERB_DEFAULT_DENSITY" _ 1.0f,
		"EAXREVERB_MIN_DIFFUSION" _ 0.0f,
		"EAXREVERB_MAX_DIFFUSION" _ 1.0f,
		"EAXREVERB_DEFAULT_DIFFUSION" _ 1.0f,
		"EAXREVERB_MIN_GAIN" _ 0.0f,
		"EAXREVERB_MAX_GAIN" _ 1.0f,
		"EAXREVERB_DEFAULT_GAIN" _ 0.32f,
		"EAXREVERB_MIN_GAINHF" _ 0.0f,
		"EAXREVERB_MAX_GAINHF" _ 1.0f,
		"EAXREVERB_DEFAULT_GAINHF" _ 0.89f,
		"EAXREVERB_MIN_GAINLF" _ 0.0f,
		"EAXREVERB_MAX_GAINLF" _ 1.0f,
		"EAXREVERB_DEFAULT_GAINLF" _ 1.0f,
		"EAXREVERB_MIN_DECAY_TIME" _ 0.1f,
		"EAXREVERB_MAX_DECAY_TIME" _ 20.0f,
		"EAXREVERB_DEFAULT_DECAY_TIME" _ 1.49f,
		"EAXREVERB_MIN_DECAY_HFRATIO" _ 0.1f,
		"EAXREVERB_MAX_DECAY_HFRATIO" _ 2.0f,
		"EAXREVERB_DEFAULT_DECAY_HFRATIO" _ 0.83f,
		"EAXREVERB_MIN_DECAY_LFRATIO" _ 0.1f,
		"EAXREVERB_MAX_DECAY_LFRATIO" _ 2.0f,
		"EAXREVERB_DEFAULT_DECAY_LFRATIO" _ 1.0f,
		"EAXREVERB_MIN_REFLECTIONS_GAIN" _ 0.0f,
		"EAXREVERB_MAX_REFLECTIONS_GAIN" _ 3.16f,
		"EAXREVERB_DEFAULT_REFLECTIONS_GAIN" _ 0.05f,
		"EAXREVERB_MIN_REFLECTIONS_DELAY" _ 0.0f,
		"EAXREVERB_MAX_REFLECTIONS_DELAY" _ 0.3f,
		"EAXREVERB_DEFAULT_REFLECTIONS_DELAY" _ 0.007f,
		"EAXREVERB_DEFAULT_REFLECTIONS_PAN_XYZ" _ 0.0f,
		"EAXREVERB_MIN_LATE_REVERB_GAIN" _ 0.0f,
		"EAXREVERB_MAX_LATE_REVERB_GAIN" _ 10.0f,
		"EAXREVERB_DEFAULT_LATE_REVERB_GAIN" _ 1.26f,
		"EAXREVERB_MIN_LATE_REVERB_DELAY" _ 0.0f,
		"EAXREVERB_MAX_LATE_REVERB_DELAY" _ 0.1f,
		"EAXREVERB_DEFAULT_LATE_REVERB_DELAY" _ 0.011f,
		"EAXREVERB_DEFAULT_LATE_REVERB_PAN_XYZ" _ 0.0f,
		"EAXREVERB_MIN_ECHO_TIME" _ 0.075f,
		"EAXREVERB_MAX_ECHO_TIME" _ 0.25f,
		"EAXREVERB_DEFAULT_ECHO_TIME" _ 0.25f,
		"EAXREVERB_MIN_ECHO_DEPTH" _ 0.0f,
		"EAXREVERB_MAX_ECHO_DEPTH" _ 1.0f,
		"EAXREVERB_DEFAULT_ECHO_DEPTH" _ 0.0f,
		"EAXREVERB_MIN_MODULATION_TIME" _ 0.04f,
		"EAXREVERB_MAX_MODULATION_TIME" _ 4.0f,
		"EAXREVERB_DEFAULT_MODULATION_TIME" _ 0.25f,
		"EAXREVERB_MIN_MODULATION_DEPTH" _ 0.0f,
		"EAXREVERB_MAX_MODULATION_DEPTH" _ 1.0f,
		"EAXREVERB_DEFAULT_MODULATION_DEPTH" _ 0.0f,
		"EAXREVERB_MIN_AIR_ABSORPTION_GAINHF" _ 0.892f,
		"EAXREVERB_MAX_AIR_ABSORPTION_GAINHF" _ 1.0f,
		"EAXREVERB_DEFAULT_AIR_ABSORPTION_GAINHF" _ 0.994f,
		"EAXREVERB_MIN_HFREFERENCE" _ 1000.0f,
		"EAXREVERB_MAX_HFREFERENCE" _ 20000.0f,
		"EAXREVERB_DEFAULT_HFREFERENCE" _ 5000.0f,
		"EAXREVERB_MIN_LFREFERENCE" _ 20.0f,
		"EAXREVERB_MAX_LFREFERENCE" _ 1000.0f,
		"EAXREVERB_DEFAULT_LFREFERENCE" _ 250.0f,
		"EAXREVERB_MIN_ROOM_ROLLOFF_FACTOR" _ 0.0f,
		"EAXREVERB_MAX_ROOM_ROLLOFF_FACTOR" _ 10.0f,
		"EAXREVERB_DEFAULT_ROOM_ROLLOFF_FACTOR" _ 0.0f
	)

	IntConstant(
		"EAX reverb effect parameter ranges and defaults",

		"EAXREVERB_MIN_DECAY_HFLIMIT" _ 0x0,
		"EAXREVERB_MAX_DECAY_HFLIMIT" _ 0x1,
		"EAXREVERB_DEFAULT_DECAY_HFLIMIT" _ 0x1
	)

	IntConstant(
		"Chorus effect parameter ranges and defaults",

		"CHORUS_WAVEFORM_SINUSOID" _ 0,
		"CHORUS_WAVEFORM_TRIANGLE" _ 1,
		"CHORUS_MIN_WAVEFORM" _ 0,
		"CHORUS_MAX_WAVEFORM" _ 1,
		"CHORUS_DEFAULT_WAVEFORM" _ 1,
		"CHORUS_MIN_PHASE" _ -180,
		"CHORUS_MAX_PHASE" _ 180,
		"CHORUS_DEFAULT_PHASE" _ 90
	)

	FloatConstant(
		"Chorus effect parameter ranges and defaults",

		"CHORUS_MIN_RATE" _ 0.0f,
		"CHORUS_MAX_RATE" _ 10.0f,
		"CHORUS_DEFAULT_RATE" _ 1.1f,
		"CHORUS_MIN_DEPTH" _ 0.0f,
		"CHORUS_MAX_DEPTH" _ 1.0f,
		"CHORUS_DEFAULT_DEPTH" _ 0.1f,
		"CHORUS_MIN_FEEDBACK" _ -1.0f,
		"CHORUS_MAX_FEEDBACK" _ 1.0f,
		"CHORUS_DEFAULT_FEEDBACK" _ 0.25f,
		"CHORUS_MIN_DELAY" _ 0.0f,
		"CHORUS_MAX_DELAY" _ 0.016f,
		"CHORUS_DEFAULT_DELAY" _ 0.016f
	)

	FloatConstant(
		"Distortion effect parameter ranges and defaults",

		"DISTORTION_MIN_EDGE" _ 0.0f,
		"DISTORTION_MAX_EDGE" _ 1.0f,
		"DISTORTION_DEFAULT_EDGE" _ 0.2f,
		"DISTORTION_MIN_GAIN" _ 0.01f,
		"DISTORTION_MAX_GAIN" _ 1.0f,
		"DISTORTION_DEFAULT_GAIN" _ 0.05f,
		"DISTORTION_MIN_LOWPASS_CUTOFF" _ 80.0f,
		"DISTORTION_MAX_LOWPASS_CUTOFF" _ 24000.0f,
		"DISTORTION_DEFAULT_LOWPASS_CUTOFF" _ 8000.0f,
		"DISTORTION_MIN_EQCENTER" _ 80.0f,
		"DISTORTION_MAX_EQCENTER" _ 24000.0f,
		"DISTORTION_DEFAULT_EQCENTER" _ 3600.0f,
		"DISTORTION_MIN_EQBANDWIDTH" _ 80.0f,
		"DISTORTION_MAX_EQBANDWIDTH" _ 24000.0f,
		"DISTORTION_DEFAULT_EQBANDWIDTH" _ 3600.0f
	)

	FloatConstant(
		"Echo effect parameter ranges and defaults",

		"ECHO_MIN_DELAY" _ 0.0f,
		"ECHO_MAX_DELAY" _ 0.207f,
		"ECHO_DEFAULT_DELAY" _ 0.1f,
		"ECHO_MIN_LRDELAY" _ 0.0f,
		"ECHO_MAX_LRDELAY" _ 0.404f,
		"ECHO_DEFAULT_LRDELAY" _ 0.1f,
		"ECHO_MIN_DAMPING" _ 0.0f,
		"ECHO_MAX_DAMPING" _ 0.99f,
		"ECHO_DEFAULT_DAMPING" _ 0.5f,
		"ECHO_MIN_FEEDBACK" _ 0.0f,
		"ECHO_MAX_FEEDBACK" _ 1.0f,
		"ECHO_DEFAULT_FEEDBACK" _ 0.5f,
		"ECHO_MIN_SPREAD" _ -1.0f,
		"ECHO_MAX_SPREAD" _ 1.0f,
		"ECHO_DEFAULT_SPREAD" _ -1.0f
	)

	IntConstant(
		"Flanger effect parameter ranges and defaults",

		"FLANGER_WAVEFORM_SINUSOID" _ 0,
		"FLANGER_WAVEFORM_TRIANGLE" _ 1,
		"FLANGER_MIN_WAVEFORM" _ 0,
		"FLANGER_MAX_WAVEFORM" _ 1,
		"FLANGER_DEFAULT_WAVEFORM" _ 1,
		"FLANGER_MIN_PHASE" _ -180,
		"FLANGER_MAX_PHASE" _ 180,
		"FLANGER_DEFAULT_PHASE" _ 0
	)

	FloatConstant(
		"Flanger effect parameter ranges and defaults",

		"FLANGER_MIN_RATE" _ 0.0f,
		"FLANGER_MAX_RATE" _ 10.0f,
		"FLANGER_DEFAULT_RATE" _ 0.27f,
		"FLANGER_MIN_DEPTH" _ 0.0f,
		"FLANGER_MAX_DEPTH" _ 1.0f,
		"FLANGER_DEFAULT_DEPTH" _ 1.0f,
		"FLANGER_MIN_FEEDBACK" _ -1.0f,
		"FLANGER_MAX_FEEDBACK" _ 1.0f,
		"FLANGER_DEFAULT_FEEDBACK" _ -0.5f,
		"FLANGER_MIN_DELAY" _ 0.0f,
		"FLANGER_MAX_DELAY" _ 0.004f,
		"FLANGER_DEFAULT_DELAY" _ 0.002f
	)

	FloatConstant(
		"Frequency shifter effect parameter ranges and defaults",

		"FREQUENCY_SHIFTER_MIN_FREQUENCY" _ 0.0f,
		"FREQUENCY_SHIFTER_MAX_FREQUENCY" _ 24000.0f,
		"FREQUENCY_SHIFTER_DEFAULT_FREQUENCY" _ 0.0f
	)

	IntConstant(
		"Frequency shifter effect parameter ranges and defaults",

		"FREQUENCY_SHIFTER_MIN_LEFT_DIRECTION" _ 0,
		"FREQUENCY_SHIFTER_MAX_LEFT_DIRECTION" _ 2,
		"FREQUENCY_SHIFTER_DEFAULT_LEFT_DIRECTION" _ 0,
		"FREQUENCY_SHIFTER_DIRECTION_DOWN" _ 0,
		"FREQUENCY_SHIFTER_DIRECTION_UP" _ 1,
		"FREQUENCY_SHIFTER_DIRECTION_OFF" _ 2,
		"FREQUENCY_SHIFTER_MIN_RIGHT_DIRECTION" _ 0,
		"FREQUENCY_SHIFTER_MAX_RIGHT_DIRECTION" _ 2,
		"FREQUENCY_SHIFTER_DEFAULT_RIGHT_DIRECTION" _ 0
	)

	IntConstant(
		"Vocal morpher effect parameter ranges and defaults",

		"VOCAL_MORPHER_MIN_PHONEMEA" _ 0,
		"VOCAL_MORPHER_MAX_PHONEMEA" _ 29,
		"VOCAL_MORPHER_DEFAULT_PHONEMEA" _ 0,
		"VOCAL_MORPHER_MIN_PHONEMEA_COARSE_TUNING" _ -24,
		"VOCAL_MORPHER_MAX_PHONEMEA_COARSE_TUNING" _ 24,
		"VOCAL_MORPHER_DEFAULT_PHONEMEA_COARSE_TUNING" _ 0,
		"VOCAL_MORPHER_MIN_PHONEMEB" _ 0,
		"VOCAL_MORPHER_MAX_PHONEMEB" _ 29,
		"VOCAL_MORPHER_DEFAULT_PHONEMEB" _ 10,
		"VOCAL_MORPHER_MIN_PHONEMEB_COARSE_TUNING" _ -24,
		"VOCAL_MORPHER_MAX_PHONEMEB_COARSE_TUNING" _ 24,
		"VOCAL_MORPHER_DEFAULT_PHONEMEB_COARSE_TUNING" _ 0,
		"VOCAL_MORPHER_PHONEME_A" _ 0,
		"VOCAL_MORPHER_PHONEME_E" _ 1,
		"VOCAL_MORPHER_PHONEME_I" _ 2,
		"VOCAL_MORPHER_PHONEME_O" _ 3,
		"VOCAL_MORPHER_PHONEME_U" _ 4,
		"VOCAL_MORPHER_PHONEME_AA" _ 5,
		"VOCAL_MORPHER_PHONEME_AE" _ 6,
		"VOCAL_MORPHER_PHONEME_AH" _ 7,
		"VOCAL_MORPHER_PHONEME_AO" _ 8,
		"VOCAL_MORPHER_PHONEME_EH" _ 9,
		"VOCAL_MORPHER_PHONEME_ER" _ 10,
		"VOCAL_MORPHER_PHONEME_IH" _ 11,
		"VOCAL_MORPHER_PHONEME_IY" _ 12,
		"VOCAL_MORPHER_PHONEME_UH" _ 13,
		"VOCAL_MORPHER_PHONEME_UW" _ 14,
		"VOCAL_MORPHER_PHONEME_B" _ 15,
		"VOCAL_MORPHER_PHONEME_D" _ 16,
		"VOCAL_MORPHER_PHONEME_F" _ 17,
		"VOCAL_MORPHER_PHONEME_G" _ 18,
		"VOCAL_MORPHER_PHONEME_J" _ 19,
		"VOCAL_MORPHER_PHONEME_K" _ 20,
		"VOCAL_MORPHER_PHONEME_L" _ 21,
		"VOCAL_MORPHER_PHONEME_M" _ 22,
		"VOCAL_MORPHER_PHONEME_N" _ 23,
		"VOCAL_MORPHER_PHONEME_P" _ 24,
		"VOCAL_MORPHER_PHONEME_R" _ 25,
		"VOCAL_MORPHER_PHONEME_S" _ 26,
		"VOCAL_MORPHER_PHONEME_T" _ 27,
		"VOCAL_MORPHER_PHONEME_V" _ 28,
		"VOCAL_MORPHER_PHONEME_Z" _ 29,
		"VOCAL_MORPHER_WAVEFORM_SINUSOID" _ 0,
		"VOCAL_MORPHER_WAVEFORM_TRIANGLE" _ 1,
		"VOCAL_MORPHER_WAVEFORM_SAWTOOTH" _ 2,
		"VOCAL_MORPHER_MIN_WAVEFORM" _ 0,
		"VOCAL_MORPHER_MAX_WAVEFORM" _ 2,
		"VOCAL_MORPHER_DEFAULT_WAVEFORM" _ 0
	)

	FloatConstant(
		"Vocal morpher effect parameter ranges and defaults",

		"VOCAL_MORPHER_MIN_RATE" _ 0.0f,
		"VOCAL_MORPHER_MAX_RATE" _ 10.0f,
		"VOCAL_MORPHER_DEFAULT_RATE" _ 1.41f
	)

	IntConstant(
		"Pitch shifter effect parameter ranges and defaults",

		"PITCH_SHIFTER_MIN_COARSE_TUNE" _ -12,
		"PITCH_SHIFTER_MAX_COARSE_TUNE" _ 12,
		"PITCH_SHIFTER_DEFAULT_COARSE_TUNE" _ 12,
		"PITCH_SHIFTER_MIN_FINE_TUNE" _ -50,
		"PITCH_SHIFTER_MAX_FINE_TUNE" _ 50,
		"PITCH_SHIFTER_DEFAULT_FINE_TUNE" _ 0
	)

	FloatConstant(
		"Ring modulator effect parameter ranges and defaults",

		"RING_MODULATOR_MIN_FREQUENCY" _ 0.0f,
		"RING_MODULATOR_MAX_FREQUENCY" _ 8000.0f,
		"RING_MODULATOR_DEFAULT_FREQUENCY" _ 440.0f,
		"RING_MODULATOR_MIN_HIGHPASS_CUTOFF" _ 0.0f,
		"RING_MODULATOR_MAX_HIGHPASS_CUTOFF" _ 24000.0f,
		"RING_MODULATOR_DEFAULT_HIGHPASS_CUTOFF" _ 800.0f
	)

	IntConstant(
		"Ring modulator effect parameter ranges and defaults",

		"RING_MODULATOR_SINUSOID" _ 0,
		"RING_MODULATOR_SAWTOOTH" _ 1,
		"RING_MODULATOR_SQUARE" _ 2,
		"RING_MODULATOR_MIN_WAVEFORM" _ 0,
		"RING_MODULATOR_MAX_WAVEFORM" _ 2,
		"RING_MODULATOR_DEFAULT_WAVEFORM" _ 0
	)

	FloatConstant(
		"Autowah effect parameter ranges and defaults",

		"AUTOWAH_MIN_ATTACK_TIME" _ 0.0001f,
		"AUTOWAH_MAX_ATTACK_TIME" _ 1.0f,
		"AUTOWAH_DEFAULT_ATTACK_TIME" _ 0.06f,
		"AUTOWAH_MIN_RELEASE_TIME" _ 0.0001f,
		"AUTOWAH_MAX_RELEASE_TIME" _ 1.0f,
		"AUTOWAH_DEFAULT_RELEASE_TIME" _ 0.06f,
		"AUTOWAH_MIN_RESONANCE" _ 2.0f,
		"AUTOWAH_MAX_RESONANCE" _ 1000.0f,
		"AUTOWAH_DEFAULT_RESONANCE" _ 1000.0f,
		"AUTOWAH_MIN_PEAK_GAIN" _ 0.00003f,
		"AUTOWAH_MAX_PEAK_GAIN" _ 31621.0f,
		"AUTOWAH_DEFAULT_PEAK_GAIN" _ 11.22f
	)

	IntConstant(
		"Compressor effect parameter ranges and defaults",

		"COMPRESSOR_MIN_ONOFF" _ 0,
		"COMPRESSOR_MAX_ONOFF" _ 1,
		"COMPRESSOR_DEFAULT_ONOFF" _ 1
	)

	FloatConstant(
		"Equalizer effect parameter ranges and defaults",

		"EQUALIZER_MIN_LOW_GAIN" _ 0.126f,
		"EQUALIZER_MAX_LOW_GAIN" _ 7.943f,
		"EQUALIZER_DEFAULT_LOW_GAIN" _ 1.0f,
		"EQUALIZER_MIN_LOW_CUTOFF" _ 50.0f,
		"EQUALIZER_MAX_LOW_CUTOFF" _ 800.0f,
		"EQUALIZER_DEFAULT_LOW_CUTOFF" _ 200.0f,
		"EQUALIZER_MIN_MID1_GAIN" _ 0.126f,
		"EQUALIZER_MAX_MID1_GAIN" _ 7.943f,
		"EQUALIZER_DEFAULT_MID1_GAIN" _ 1.0f,
		"EQUALIZER_MIN_MID1_CENTER" _ 200.0f,
		"EQUALIZER_MAX_MID1_CENTER" _ 3000.0f,
		"EQUALIZER_DEFAULT_MID1_CENTER" _ 500.0f,
		"EQUALIZER_MIN_MID1_WIDTH" _ 0.01f,
		"EQUALIZER_MAX_MID1_WIDTH" _ 1.0f,
		"EQUALIZER_DEFAULT_MID1_WIDTH" _ 1.0f,
		"EQUALIZER_MIN_MID2_GAIN" _ 0.126f,
		"EQUALIZER_MAX_MID2_GAIN" _ 7.943f,
		"EQUALIZER_DEFAULT_MID2_GAIN" _ 1.0f,
		"EQUALIZER_MIN_MID2_CENTER" _ 1000.0f,
		"EQUALIZER_MAX_MID2_CENTER" _ 8000.0f,
		"EQUALIZER_DEFAULT_MID2_CENTER" _ 3000.0f,
		"EQUALIZER_MIN_MID2_WIDTH" _ 0.01f,
		"EQUALIZER_MAX_MID2_WIDTH" _ 1.0f,
		"EQUALIZER_DEFAULT_MID2_WIDTH" _ 1.0f,
		"EQUALIZER_MIN_HIGH_GAIN" _ 0.126f,
		"EQUALIZER_MAX_HIGH_GAIN" _ 7.943f,
		"EQUALIZER_DEFAULT_HIGH_GAIN" _ 1.0f,
		"EQUALIZER_MIN_HIGH_CUTOFF" _ 4000.0f,
		"EQUALIZER_MAX_HIGH_CUTOFF" _ 16000.0f,
		"EQUALIZER_DEFAULT_HIGH_CUTOFF" _ 6000.0f
	)

	FloatConstant(
		"Lowpass filter parameter ranges and defaults",

		"LOWPASS_MIN_GAIN" _ 0.0f,
		"LOWPASS_MAX_GAIN" _ 1.0f,
		"LOWPASS_DEFAULT_GAIN" _ 1.0f,
		"LOWPASS_MIN_GAINHF" _ 0.0f,
		"LOWPASS_MAX_GAINHF" _ 1.0f,
		"LOWPASS_DEFAULT_GAINHF" _ 1.0f
	)

	FloatConstant(
		"Highpass filter parameter ranges and defaults",

		"HIGHPASS_MIN_GAIN" _ 0.0f,
		"HIGHPASS_MAX_GAIN" _ 1.0f,
		"HIGHPASS_DEFAULT_GAIN" _ 1.0f,
		"HIGHPASS_MIN_GAINLF" _ 0.0f,
		"HIGHPASS_MAX_GAINLF" _ 1.0f,
		"HIGHPASS_DEFAULT_GAINLF" _ 1.0f
	)

	FloatConstant(
		"Bandpass filter parameter ranges and defaults",

		"BANDPASS_MIN_GAIN" _ 0.0f,
		"BANDPASS_MAX_GAIN" _ 1.0f,
		"BANDPASS_DEFAULT_GAIN" _ 1.0f,
		"BANDPASS_MIN_GAINHF" _ 0.0f,
		"BANDPASS_MAX_GAINHF" _ 1.0f,
		"BANDPASS_DEFAULT_GAINHF" _ 1.0f,
		"BANDPASS_MIN_GAINLF" _ 0.0f,
		"BANDPASS_MAX_GAINLF" _ 1.0f,
		"BANDPASS_DEFAULT_GAINLF" _ 1.0f
	)

	ALvoid(
		"GenEffects",
		"Requests a number of effects.",

		AutoSize("effects") _ ALsizei.IN("n", "the number of effects be to generated"),
		returnValue _ ALuint_p.OUT("effects", "the buffer that will receive the effects")
	)

	ALvoid(
		"DeleteEffects",
		"Deletes a number of effects.",

		AutoSize("effects") _ ALsizei.IN("n", "the number of effects be to deleted"),
		SingleValue("effect") _ ALuint_p.IN("effects", "the effect to delete")
	)

	ALboolean(
		"IsEffect",
		"Verifies whether the given object name is an effect.",

		ALuint.IN("effect", "a value that may be a effect name")
	)

	ALvoid(
		"Effecti",
		"Sets the integer value of an effect parameter.",

		ALuint.IN("effect", "the effect to modify"),
		ALenum.IN("param", "the parameter to modify"),
		ALint.IN("value", "the parameter value")
	)

	ALvoid(
		"Effectiv",
		"Pointer version of #Effecti().",

		ALuint.IN("effect", "the effect to modify"),
		ALenum.IN("param", "the parameter to modify"),
		const _ ALint_p.IN("values", "the parameter values")
	)

	ALvoid(
		"Effectf",
		"Sets the float value of an effect parameter.",

		ALuint.IN("effect", "the effect to modify"),
		ALenum.IN("param", "the parameter to modify"),
		ALfloat.IN("value", "the parameter value")
	)

	ALvoid(
		"Effectfv",
		"Pointer version of #Effectf().",

		ALuint.IN("effect", "the effect to modify"),
		ALenum.IN("param", "the parameter to modify"),
		const _ ALfloat_p.IN("values", "the parameter values")
	)

	ALvoid(
		"GetEffecti",
		"Returns the integer value of the specified effect parameter.",

		ALuint.IN("effect", "the effect to query"),
		ALenum.IN("param", "the parameter to query"),
		Check(1) _ returnValue _ ALint_p.OUT("value", "the parameter value")
	)

	ALvoid(
		"GetEffectiv",
		"Returns the integer values of the specified effect parameter.",

		ALuint.IN("effect", "the effect to query"),
		ALenum.IN("param", "the parameter to query"),
		Check(1) _ ALint_p.OUT("values", "the parameter values")
	)

	ALvoid(
		"GetEffectf",
		"Returns the float value of the specified effect parameter.",

		ALuint.IN("effect", "the effect to query"),
		ALenum.IN("param", "the parameter to query"),
		Check(1) _ returnValue _ ALfloat_p.OUT("value", "the parameter value")
	)

	ALvoid(
		"GetEffectfv",
		"Returns the float values of the specified effect parameter.",

		ALuint.IN("effect", "the effect to query"),
		ALenum.IN("param", "the parameter to query"),
		Check(1) _ ALfloat_p.OUT("values", "the parameter values")
	)

	ALvoid(
		"GenFilters",
		"Requests a number of filters.",

		AutoSize("filters") _ ALsizei.IN("n", "the number of filters be to generated"),
		returnValue _ ALuint_p.OUT("filters", "the buffer that will receive the filters")
	)

	ALvoid(
		"DeleteFilters",
		"Deletes a number of filters.",

		AutoSize("filters") _ ALsizei.IN("n", "the number of filters be to deleted"),
		SingleValue("filter") _ ALuint_p.IN("filters", "the filter to delete")
	)

	ALboolean(
		"IsFilter",
		"Verifies whether the given object name is a filter.",

		ALuint.IN("filter", "a value that may be a filter name")
	)

	ALvoid(
		"Filteri",
		"Sets the integer value of a filter parameter.",

		ALuint.IN("filter", "the filter to modify"),
		ALenum.IN("param", "the parameter to modify"),
		ALint.IN("value", "the parameter value")
	)

	ALvoid(
		"Filteriv",
		"Pointer version of #Filteri().",

		ALuint.IN("filter", "the filter to modify"),
		ALenum.IN("param", "the parameter to modify"),
		const _ ALint_p.IN("values", "the parameter values")
	)

	ALvoid(
		"Filterf",
		"Sets the float value of a filter parameter.",

		ALuint.IN("filter", "the filter to modify"),
		ALenum.IN("param", "the parameter to modify"),
		ALfloat.IN("value", "the parameter value")
	)

	ALvoid(
		"Filterfv",
		"Pointer version of #Filterf().",

		ALuint.IN("filter", "the filter to modify"),
		ALenum.IN("param", "the parameter to modify"),
		const _ ALfloat_p.IN("values", "the parameter values")
	)

	ALvoid(
		"GetFilteri",
		"Returns the integer value of the specified filter parameter.",

		ALuint.IN("filter", "the filter to query"),
		ALenum.IN("param", "the parameter to query"),
		Check(1) _ returnValue _ ALint_p.OUT("value", "the parameter value")
	)

	ALvoid(
		"GetFilteriv",
		"Returns the integer values of the specified filter parameter.",

		ALuint.IN("filter", "the filter to query"),
		ALenum.IN("param", "the parameter to query"),
		Check(1) _ ALint_p.OUT("values", "the parameter values")
	)

	ALvoid(
		"GetFilterf",
		"Returns the float value of the specified filter parameter.",

		ALuint.IN("filter", "the effect to query"),
		ALenum.IN("param", "the parameter to query"),
		Check(1) _ returnValue _ ALfloat_p.OUT("value", "the parameter value")
	)

	ALvoid(
		"GetFilterfv",
		"Returns the float values of the specified filter parameter.",

		ALuint.IN("filter", "the effect to query"),
		ALenum.IN("param", "the parameter to query"),
		Check(1) _ ALfloat_p.OUT("values", "the parameter values")
	)

	ALvoid(
		"GenAuxiliaryEffectSlots",
		"Requests a number of effect slots.",

		AutoSize("effectSlots") _ ALsizei.IN("n", "the number of effect slots be to generated"),
		returnValue _ ALuint_p.OUT("effectSlots", "the buffer that will receive the effect slots")
	)

	ALvoid(
		"DeleteAuxiliaryEffectSlots",
		"Deletes a number of effect slots.",

		AutoSize("effectSlots") _ ALsizei.IN("n", "the number of effect slots be to deleted"),
		SingleValue("effectSlot") _ ALuint_p.IN("effectSlots", "the effectSlot to delete")
	)

	ALboolean(
		"IsAuxiliaryEffectSlot",
		"Verifies whether the given object name is an effect slot.",

		ALuint.IN("effectSlot", "a value that may be an effect slot name")
	)

	ALvoid(
		"AuxiliaryEffectSloti",
		"Sets the integer value of an effect slot parameter.",

		ALuint.IN("effectSlot", "the effect slot to modify"),
		ALenum.IN("param", "the parameter to modify"),
		ALint.IN("value", "the parameter value")
	)

	ALvoid(
		"AuxiliaryEffectSlotiv",
		"Pointer version of #AuxiliaryEffectSloti().",

		ALuint.IN("effectSlot", "the effect slot to modify"),
		ALenum.IN("param", "the parameter to modify"),
		const _ ALint_p.IN("values", "the parameter values")
	)

	ALvoid(
		"AuxiliaryEffectSlotf",
		"Sets the float value of an effect slot parameter.",

		ALuint.IN("effectSlot", "the effect slot to modify"),
		ALenum.IN("param", "the parameter to modify"),
		ALfloat.IN("value", "the parameter value")
	)

	ALvoid(
		"AuxiliaryEffectSlotfv",
		"Pointer version of #AuxiliaryEffectSlotf().",

		ALuint.IN("effectSlot", "the effect slot to modify"),
		ALenum.IN("param", "the parameter to modify"),
		const _ ALfloat_p.IN("values", "the parameter values")
	)

	ALvoid(
		"GetAuxiliaryEffectSloti",
		"Returns the integer value of the specified effect slot parameter.",

		ALuint.IN("effectSlot", "the effect slot to query"),
		ALenum.IN("param", "the parameter to query"),
		Check(1) _ returnValue _ ALint_p.OUT("value", "the parameter value")
	)

	ALvoid(
		"GetAuxiliaryEffectSlotiv",
		"Returns the integer values of the specified effect slot parameter.",

		ALuint.IN("effectSlot", "the effect slot to query"),
		ALenum.IN("param", "the parameter to query"),
		Check(1) _ ALint_p.OUT("values", "the parameter values")
	)

	ALvoid(
		"GetAuxiliaryEffectSlotf",
		"Returns the float value of the specified filter parameter.",

		ALuint.IN("effectSlot", "the effect slot to query"),
		ALenum.IN("param", "the parameter to query"),
		Check(1) _ returnValue _ ALfloat_p.OUT("value", "the parameter value")
	)

	ALvoid(
		"GetAuxiliaryEffectSlotfv",
		"Returns the float values of the specified effect slot parameter.",

		ALuint.IN("effectSlot", "the effect to query"),
		ALenum.IN("param", "the parameter to query"),
		Check(1) _ ALfloat_p.OUT("values", "the parameter values")
	)

	FunctionProviderALC.addCapabilities(this)
}