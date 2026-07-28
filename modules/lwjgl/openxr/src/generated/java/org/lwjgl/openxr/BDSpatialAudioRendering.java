/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BDSpatialAudioRendering {

    public static final int XR_BD_spatial_audio_rendering_SPEC_VERSION = 1;

    public static final String XR_BD_SPATIAL_AUDIO_RENDERING_EXTENSION_NAME = "XR_BD_spatial_audio_rendering";

    public static final int
        XR_TYPE_SPATIAL_AUDIO_RENDERER_CREATE_INFO_BD      = 1000409000,
        XR_TYPE_AUDIO_BUFFER_BD                            = 1000409001,
        XR_TYPE_SOUND_OBJECT_DIRECTIVITY_CARDIOID_BD       = 1000409003,
        XR_TYPE_SOUND_OBJECT_SHAPE_SPHERE_BD               = 1000409004,
        XR_TYPE_SOUND_OBJECT_DISTANCE_ATTENUATION_BD       = 1000409005,
        XR_TYPE_SOUND_OBJECT_DISTANCE_ATTENUATION_CURVE_BD = 1000409006,
        XR_TYPE_SOUND_OBJECT_CONFIG_BD                     = 1000409007,
        XR_TYPE_SOUND_FIELD_CONFIG_BD                      = 1000409008,
        XR_TYPE_SOUND_FIELD_CHANNEL_DEFINITION_SURROUND_BD = 1000409009,
        XR_TYPE_SOUND_FIELD_CHANNEL_DEFINITION_AMBIX_BD    = 1000409010,
        XR_TYPE_SOUND_FIELD_CHANNEL_DEFINITION_FUMA_BD     = 1000409011,
        XR_TYPE_SOUND_TRIANGLE_MESH_BD                     = 1000409012,
        XR_TYPE_SOUND_OBSTACLE_CONFIG_BD                   = 1000409013,
        XR_TYPE_SOUND_OBSTACLE_MATERIAL_CONFIG_BD          = 1000409014;

    public static final int
        XR_OBJECT_TYPE_SPATIAL_AUDIO_RENDERER_BD  = 1000409000,
        XR_OBJECT_TYPE_SOUND_FIELD_BD             = 1000409001,
        XR_OBJECT_TYPE_SOUND_OBJECT_BD            = 1000409002,
        XR_OBJECT_TYPE_SOUND_OBSTACLE_BD          = 1000409003,
        XR_OBJECT_TYPE_SOUND_OBSTACLE_MATERIAL_BD = 1000409004;

    public static final int
        XR_AUDIO_SAMPLE_RATE_192000_HZ_BD = 1,
        XR_AUDIO_SAMPLE_RATE_96000_HZ_BD  = 2,
        XR_AUDIO_SAMPLE_RATE_48000_HZ_BD  = 3,
        XR_AUDIO_SAMPLE_RATE_44100_HZ_BD  = 4,
        XR_AUDIO_SAMPLE_RATE_32000_HZ_BD  = 5,
        XR_AUDIO_SAMPLE_RATE_24000_HZ_BD  = 6,
        XR_AUDIO_SAMPLE_RATE_22050_HZ_BD  = 7,
        XR_AUDIO_SAMPLE_RATE_16000_HZ_BD  = 8,
        XR_AUDIO_SAMPLE_RATE_12000_HZ_BD  = 9,
        XR_AUDIO_SAMPLE_RATE_11025_HZ_BD  = 10,
        XR_AUDIO_SAMPLE_RATE_8000_HZ_BD   = 11;

    public static final int
        XR_AUDIO_BUFFER_CHANNEL_LAYOUT_INTERLEAVED_BD = 0,
        XR_AUDIO_BUFFER_CHANNEL_LAYOUT_PLANAR_BD      = 1;

    public static final int
        XR_SOUND_OBJECT_DISTANCE_ATTENUATION_TYPE_NONE_BD           = 0,
        XR_SOUND_OBJECT_DISTANCE_ATTENUATION_TYPE_INVERSE_SQUARE_BD = 1,
        XR_SOUND_OBJECT_DISTANCE_ATTENUATION_TYPE_ROLLOFF_BD        = 2,
        XR_SOUND_OBJECT_DISTANCE_ATTENUATION_TYPE_CUSTOMIZED_BD     = 100;

    public static final int
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_FRONT_LEFT_BD          = 1,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_FRONT_RIGHT_BD         = 2,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_STEREO_BD        = 3,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_FRONT_CENTER_BD        = 4,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_3_0_BD           = 7,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_LOW_FREQUENCY_BD       = 8,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_2_1_BD           = 11,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_3_1_BD           = 15,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_BACK_LEFT_BD           = 16,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_BACK_RIGHT_BD          = 32,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_BACK_SURROUND_BD = 48,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_QUAD_BD          = 51,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_5_0_BD           = 55,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_5_1_BD           = 63,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SIDE_LEFT_BD           = 64,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SIDE_RIGHT_BD          = 128,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_SIDE_SURROUND_BD = 192,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_5_0_SIDE_BD      = 199,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_5_1_SIDE_BD      = 207,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_7_0_BD           = 247,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_7_1_BD           = 255,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_TOP_FRONT_LEFT_BD      = 256,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_TOP_FRONT_RIGHT_BD     = 512,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_5_1_2_BD         = 831,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_TOP_BACK_LEFT_BD       = 1024,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_TOP_BACK_RIGHT_BD      = 2048,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_5_1_4_BD         = 3903,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_7_1_4_BD         = 4095,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_BACK_CENTER_BD         = 4096,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_4_0_BD           = 4099,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_TOP_SIDE_LEFT_BD       = 8192,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_TOP_SIDE_RIGHT_BD      = 16384,
        XR_SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_7_1_2_BD         = 24831;

    public static final int
        XR_SOUND_FIELD_CHANNEL_MASK_AMBIX_1ST_ORDER_BD = 1,
        XR_SOUND_FIELD_CHANNEL_MASK_AMBIX_2ND_ORDER_BD = 2,
        XR_SOUND_FIELD_CHANNEL_MASK_AMBIX_3RD_ORDER_BD = 3,
        XR_SOUND_FIELD_CHANNEL_MASK_AMBIX_4TH_ORDER_BD = 4,
        XR_SOUND_FIELD_CHANNEL_MASK_AMBIX_5TH_ORDER_BD = 5,
        XR_SOUND_FIELD_CHANNEL_MASK_AMBIX_6TH_ORDER_BD = 6,
        XR_SOUND_FIELD_CHANNEL_MASK_AMBIX_7TH_ORDER_BD = 7;

    public static final int XR_SOUND_FIELD_CHANNEL_MASK_FUMA_1ST_ORDER_BD = 1;

    public static final int
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_ACOUSTIC_TILE_BD             = 0,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_BRICK_BD                     = 1,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_BRICK_PAINTED_BD             = 2,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_CARPET_BD                    = 3,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_CARPET_HEAVY_BD              = 4,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_CARPET_HEAVY_PADDED_BD       = 5,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_CERAMIC_TILE_BD              = 6,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_CONCRETE_BD                  = 7,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_CONCRETE_ROUGH_BD            = 8,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_CONCRETE_BLOCK_BD            = 9,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_CONCRETE_BLOCK_PAINTED_BD    = 10,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_CURTAIN_BD                   = 11,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_FOLIAGE_BD                   = 12,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_GLASS_BD                     = 13,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_GLASS_HEAVY_BD               = 14,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_GRASS_BD                     = 15,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_GRAVEL_BD                    = 16,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_GYPSUM_BOARD_BD              = 17,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_PLASTER_ON_BRICK_BD          = 18,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_PLASTER_ON_CONCRETE_BLOCK_BD = 19,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_SOIL_BD                      = 20,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_SOUND_PROOF_BD               = 21,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_SNOW_BD                      = 22,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_STEEL_BD                     = 23,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_WATER_BD                     = 24,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_WOOD_THIN_BD                 = 25,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_WOOD_THICK_BD                = 26,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_WOOD_FLOOR_BD                = 27,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_WOOD_ON_CONCRETE_BD          = 28,
        XR_SOUND_OBSTACLE_MATERIAL_TYPE_CUSTOM_BD                    = 29;

    public static final int
        XR_SOUND_OBSTACLE_ENABLED_BIT_BD   = 0x1,
        XR_SOUND_OBSTACLE_POSE_BIT_BD      = 0x2,
        XR_SOUND_OBSTACLE_MESH_BIT_BD      = 0x4,
        XR_SOUND_OBSTACLE_MATERIALS_BIT_BD = 0x8;

    public static final int
        XR_SOUND_OBJECT_ENABLED_BIT_BD                    = 0x1,
        XR_SOUND_OBJECT_POSE_BIT_BD                       = 0x2,
        XR_SOUND_OBJECT_DIRECTIVITY_BIT_BD                = 0x4,
        XR_SOUND_OBJECT_SHAPE_BIT_BD                      = 0x8,
        XR_SOUND_OBJECT_MAIN_VOLUME_BIT_BD                = 0x10,
        XR_SOUND_OBJECT_REFLECTION_GAIN_BIT_BD            = 0x20,
        XR_SOUND_OBJECT_ENABLE_DOPPLER_BIT_BD             = 0x40,
        XR_SOUND_OBJECT_DIRECT_SOUND_ATTENUATION_BIT_BD   = 0x80,
        XR_SOUND_OBJECT_INDIRECT_SOUND_ATTENUATION_BIT_BD = 0x100;

    public static final int
        XR_SOUND_FIELD_ENABLED_BIT_BD     = 0x1,
        XR_SOUND_FIELD_ORIENTATION_BIT_BD = 0x2,
        XR_SOUND_FIELD_MAIN_VOLUME_BIT_BD = 0x4,
        XR_SOUND_FIELD_LFE_GAIN_BIT_BD    = 0x8;

    protected BDSpatialAudioRendering() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateSupportedAudioSampleRateBD ] ---

    /** {@code XrResult xrEnumerateSupportedAudioSampleRateBD(XrSession session, uint32_t sampleRateCapacityInput, uint32_t * sampleRateCountOutput, XrAudioSampleRateBD * sampleRates)} */
    public static int nxrEnumerateSupportedAudioSampleRateBD(XrSession session, int sampleRateCapacityInput, long sampleRateCountOutput, long sampleRates) {
        long __functionAddress = session.getCapabilities().xrEnumerateSupportedAudioSampleRateBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), sampleRateCapacityInput, sampleRateCountOutput, sampleRates, __functionAddress);
    }

    /** {@code XrResult xrEnumerateSupportedAudioSampleRateBD(XrSession session, uint32_t sampleRateCapacityInput, uint32_t * sampleRateCountOutput, XrAudioSampleRateBD * sampleRates)} */
    @NativeType("XrResult")
    public static int xrEnumerateSupportedAudioSampleRateBD(XrSession session, @NativeType("uint32_t *") IntBuffer sampleRateCountOutput, @NativeType("XrAudioSampleRateBD *") @Nullable IntBuffer sampleRates) {
        if (CHECKS) {
            check(sampleRateCountOutput, 1);
        }
        return nxrEnumerateSupportedAudioSampleRateBD(session, remainingSafe(sampleRates), memAddress(sampleRateCountOutput), memAddressSafe(sampleRates));
    }

    // --- [ xrQueryFramesPerBufferRangeBD ] ---

    /** {@code XrResult xrQueryFramesPerBufferRangeBD(XrSession session, XrAudioSampleRateBD sampleRate, uint32_t * min, uint32_t * max)} */
    public static int nxrQueryFramesPerBufferRangeBD(XrSession session, int sampleRate, long min, long max) {
        long __functionAddress = session.getCapabilities().xrQueryFramesPerBufferRangeBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), sampleRate, min, max, __functionAddress);
    }

    /** {@code XrResult xrQueryFramesPerBufferRangeBD(XrSession session, XrAudioSampleRateBD sampleRate, uint32_t * min, uint32_t * max)} */
    @NativeType("XrResult")
    public static int xrQueryFramesPerBufferRangeBD(XrSession session, @NativeType("XrAudioSampleRateBD") int sampleRate, @NativeType("uint32_t *") IntBuffer min, @NativeType("uint32_t *") IntBuffer max) {
        if (CHECKS) {
            check(min, 1);
            check(max, 1);
        }
        return nxrQueryFramesPerBufferRangeBD(session, sampleRate, memAddress(min), memAddress(max));
    }

    // --- [ xrCreateSpatialAudioRendererBD ] ---

    /** {@code XrResult xrCreateSpatialAudioRendererBD(XrSession session, XrSpatialAudioRendererCreateInfoBD const * createInfo, XrSpatialAudioRendererBD * renderer)} */
    public static int nxrCreateSpatialAudioRendererBD(XrSession session, long createInfo, long renderer) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAudioRendererBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, renderer, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialAudioRendererBD(XrSession session, XrSpatialAudioRendererCreateInfoBD const * createInfo, XrSpatialAudioRendererBD * renderer)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialAudioRendererBD(XrSession session, @NativeType("XrSpatialAudioRendererCreateInfoBD const *") XrSpatialAudioRendererCreateInfoBD createInfo, @NativeType("XrSpatialAudioRendererBD *") PointerBuffer renderer) {
        if (CHECKS) {
            check(renderer, 1);
        }
        return nxrCreateSpatialAudioRendererBD(session, createInfo.address(), memAddress(renderer));
    }

    // --- [ xrDestroySpatialAudioRendererBD ] ---

    /** {@code XrResult xrDestroySpatialAudioRendererBD(XrSpatialAudioRendererBD renderer)} */
    @NativeType("XrResult")
    public static int xrDestroySpatialAudioRendererBD(XrSpatialAudioRendererBD renderer) {
        long __functionAddress = renderer.getCapabilities().xrDestroySpatialAudioRendererBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(renderer.address(), __functionAddress);
    }

    // --- [ xrCreateSoundObstacleMaterialBD ] ---

    /** {@code XrResult xrCreateSoundObstacleMaterialBD(XrSpatialAudioRendererBD renderer, XrSoundObstacleMaterialConfigBD const * config, XrSoundObstacleMaterialBD * material)} */
    public static int nxrCreateSoundObstacleMaterialBD(XrSpatialAudioRendererBD renderer, long config, long material) {
        long __functionAddress = renderer.getCapabilities().xrCreateSoundObstacleMaterialBD;
        if (CHECKS) {
            check(__functionAddress);
            XrSoundObstacleMaterialConfigBD.validate(config);
        }
        return callPPPI(renderer.address(), config, material, __functionAddress);
    }

    /** {@code XrResult xrCreateSoundObstacleMaterialBD(XrSpatialAudioRendererBD renderer, XrSoundObstacleMaterialConfigBD const * config, XrSoundObstacleMaterialBD * material)} */
    @NativeType("XrResult")
    public static int xrCreateSoundObstacleMaterialBD(XrSpatialAudioRendererBD renderer, @NativeType("XrSoundObstacleMaterialConfigBD const *") XrSoundObstacleMaterialConfigBD config, @NativeType("XrSoundObstacleMaterialBD *") PointerBuffer material) {
        if (CHECKS) {
            check(material, 1);
        }
        return nxrCreateSoundObstacleMaterialBD(renderer, config.address(), memAddress(material));
    }

    // --- [ xrUpdateSoundObstacleMaterialConfigBD ] ---

    /** {@code XrResult xrUpdateSoundObstacleMaterialConfigBD(XrSoundObstacleMaterialBD material, XrSoundObstacleMaterialConfigBD const * config)} */
    public static int nxrUpdateSoundObstacleMaterialConfigBD(XrSoundObstacleMaterialBD material, long config) {
        long __functionAddress = material.getCapabilities().xrUpdateSoundObstacleMaterialConfigBD;
        if (CHECKS) {
            check(__functionAddress);
            XrSoundObstacleMaterialConfigBD.validate(config);
        }
        return callPPI(material.address(), config, __functionAddress);
    }

    /** {@code XrResult xrUpdateSoundObstacleMaterialConfigBD(XrSoundObstacleMaterialBD material, XrSoundObstacleMaterialConfigBD const * config)} */
    @NativeType("XrResult")
    public static int xrUpdateSoundObstacleMaterialConfigBD(XrSoundObstacleMaterialBD material, @NativeType("XrSoundObstacleMaterialConfigBD const *") XrSoundObstacleMaterialConfigBD config) {
        return nxrUpdateSoundObstacleMaterialConfigBD(material, config.address());
    }

    // --- [ xrDestroySoundObstacleMaterialBD ] ---

    /** {@code XrResult xrDestroySoundObstacleMaterialBD(XrSoundObstacleMaterialBD material)} */
    @NativeType("XrResult")
    public static int xrDestroySoundObstacleMaterialBD(XrSoundObstacleMaterialBD material) {
        long __functionAddress = material.getCapabilities().xrDestroySoundObstacleMaterialBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(material.address(), __functionAddress);
    }

    // --- [ xrCreateSoundObstacleBD ] ---

    /** {@code XrResult xrCreateSoundObstacleBD(XrSpatialAudioRendererBD renderer, XrSoundObstacleConfigBD const * config, XrSoundTriangleMeshBD const * mesh, XrSoundObstacleBD * soundObstacle)} */
    public static int nxrCreateSoundObstacleBD(XrSpatialAudioRendererBD renderer, long config, long mesh, long soundObstacle) {
        long __functionAddress = renderer.getCapabilities().xrCreateSoundObstacleBD;
        if (CHECKS) {
            check(__functionAddress);
            XrSoundObstacleConfigBD.validate(config);
            XrSoundTriangleMeshBD.validate(mesh);
        }
        return callPPPPI(renderer.address(), config, mesh, soundObstacle, __functionAddress);
    }

    /** {@code XrResult xrCreateSoundObstacleBD(XrSpatialAudioRendererBD renderer, XrSoundObstacleConfigBD const * config, XrSoundTriangleMeshBD const * mesh, XrSoundObstacleBD * soundObstacle)} */
    @NativeType("XrResult")
    public static int xrCreateSoundObstacleBD(XrSpatialAudioRendererBD renderer, @NativeType("XrSoundObstacleConfigBD const *") XrSoundObstacleConfigBD config, @NativeType("XrSoundTriangleMeshBD const *") XrSoundTriangleMeshBD mesh, @NativeType("XrSoundObstacleBD *") PointerBuffer soundObstacle) {
        if (CHECKS) {
            check(soundObstacle, 1);
        }
        return nxrCreateSoundObstacleBD(renderer, config.address(), mesh.address(), memAddress(soundObstacle));
    }

    // --- [ xrUpdateSoundObstacleConfigBD ] ---

    /** {@code XrResult xrUpdateSoundObstacleConfigBD(XrSoundObstacleBD soundObstacle, XrSoundObstacleConfigBD const * config, XrSoundTriangleMeshBD const * mesh, XrSoundObstacleFlagsBD flags)} */
    public static int nxrUpdateSoundObstacleConfigBD(XrSoundObstacleBD soundObstacle, long config, long mesh, long flags) {
        long __functionAddress = soundObstacle.getCapabilities().xrUpdateSoundObstacleConfigBD;
        if (CHECKS) {
            check(__functionAddress);
            if (config != NULL) { XrSoundObstacleConfigBD.validate(config); }
            if (mesh != NULL) { XrSoundTriangleMeshBD.validate(mesh); }
        }
        return callPPPJI(soundObstacle.address(), config, mesh, flags, __functionAddress);
    }

    /** {@code XrResult xrUpdateSoundObstacleConfigBD(XrSoundObstacleBD soundObstacle, XrSoundObstacleConfigBD const * config, XrSoundTriangleMeshBD const * mesh, XrSoundObstacleFlagsBD flags)} */
    @NativeType("XrResult")
    public static int xrUpdateSoundObstacleConfigBD(XrSoundObstacleBD soundObstacle, @NativeType("XrSoundObstacleConfigBD const *") @Nullable XrSoundObstacleConfigBD config, @NativeType("XrSoundTriangleMeshBD const *") @Nullable XrSoundTriangleMeshBD mesh, @NativeType("XrSoundObstacleFlagsBD") long flags) {
        return nxrUpdateSoundObstacleConfigBD(soundObstacle, memAddressSafe(config), memAddressSafe(mesh), flags);
    }

    // --- [ xrDestroySoundObstacleBD ] ---

    /** {@code XrResult xrDestroySoundObstacleBD(XrSoundObstacleBD soundObstacle)} */
    @NativeType("XrResult")
    public static int xrDestroySoundObstacleBD(XrSoundObstacleBD soundObstacle) {
        long __functionAddress = soundObstacle.getCapabilities().xrDestroySoundObstacleBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(soundObstacle.address(), __functionAddress);
    }

    // --- [ xrCreateSoundObjectBD ] ---

    /** {@code XrResult xrCreateSoundObjectBD(XrSpatialAudioRendererBD renderer, XrSoundObjectConfigBD const * config, XrSoundObjectBD * soundObject)} */
    public static int nxrCreateSoundObjectBD(XrSpatialAudioRendererBD renderer, long config, long soundObject) {
        long __functionAddress = renderer.getCapabilities().xrCreateSoundObjectBD;
        if (CHECKS) {
            check(__functionAddress);
            XrSoundObjectConfigBD.validate(config);
        }
        return callPPPI(renderer.address(), config, soundObject, __functionAddress);
    }

    /** {@code XrResult xrCreateSoundObjectBD(XrSpatialAudioRendererBD renderer, XrSoundObjectConfigBD const * config, XrSoundObjectBD * soundObject)} */
    @NativeType("XrResult")
    public static int xrCreateSoundObjectBD(XrSpatialAudioRendererBD renderer, @NativeType("XrSoundObjectConfigBD const *") XrSoundObjectConfigBD config, @NativeType("XrSoundObjectBD *") PointerBuffer soundObject) {
        if (CHECKS) {
            check(soundObject, 1);
        }
        return nxrCreateSoundObjectBD(renderer, config.address(), memAddress(soundObject));
    }

    // --- [ xrUpdateSoundObjectConfigBD ] ---

    /** {@code XrResult xrUpdateSoundObjectConfigBD(XrSoundObjectBD soundObject, XrSoundObjectConfigBD const * config, XrSoundObjectFlagsBD flags)} */
    public static int nxrUpdateSoundObjectConfigBD(XrSoundObjectBD soundObject, long config, long flags) {
        long __functionAddress = soundObject.getCapabilities().xrUpdateSoundObjectConfigBD;
        if (CHECKS) {
            check(__functionAddress);
            XrSoundObjectConfigBD.validate(config);
        }
        return callPPJI(soundObject.address(), config, flags, __functionAddress);
    }

    /** {@code XrResult xrUpdateSoundObjectConfigBD(XrSoundObjectBD soundObject, XrSoundObjectConfigBD const * config, XrSoundObjectFlagsBD flags)} */
    @NativeType("XrResult")
    public static int xrUpdateSoundObjectConfigBD(XrSoundObjectBD soundObject, @NativeType("XrSoundObjectConfigBD const *") XrSoundObjectConfigBD config, @NativeType("XrSoundObjectFlagsBD") long flags) {
        return nxrUpdateSoundObjectConfigBD(soundObject, config.address(), flags);
    }

    // --- [ xrSubmitSoundObjectBufferBD ] ---

    /** {@code XrResult xrSubmitSoundObjectBufferBD(XrSoundObjectBD soundObject, XrAudioBufferBD const * buffer)} */
    public static int nxrSubmitSoundObjectBufferBD(XrSoundObjectBD soundObject, long buffer) {
        long __functionAddress = soundObject.getCapabilities().xrSubmitSoundObjectBufferBD;
        if (CHECKS) {
            check(__functionAddress);
            XrAudioBufferBD.validate(buffer);
        }
        return callPPI(soundObject.address(), buffer, __functionAddress);
    }

    /** {@code XrResult xrSubmitSoundObjectBufferBD(XrSoundObjectBD soundObject, XrAudioBufferBD const * buffer)} */
    @NativeType("XrResult")
    public static int xrSubmitSoundObjectBufferBD(XrSoundObjectBD soundObject, @NativeType("XrAudioBufferBD const *") XrAudioBufferBD buffer) {
        return nxrSubmitSoundObjectBufferBD(soundObject, buffer.address());
    }

    // --- [ xrDestroySoundObjectBD ] ---

    /** {@code XrResult xrDestroySoundObjectBD(XrSoundObjectBD soundObject)} */
    @NativeType("XrResult")
    public static int xrDestroySoundObjectBD(XrSoundObjectBD soundObject) {
        long __functionAddress = soundObject.getCapabilities().xrDestroySoundObjectBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(soundObject.address(), __functionAddress);
    }

    // --- [ xrCreateSoundFieldBD ] ---

    /** {@code XrResult xrCreateSoundFieldBD(XrSpatialAudioRendererBD renderer, XrSoundFieldConfigBD const * config, XrSoundFieldBD * soundField)} */
    public static int nxrCreateSoundFieldBD(XrSpatialAudioRendererBD renderer, long config, long soundField) {
        long __functionAddress = renderer.getCapabilities().xrCreateSoundFieldBD;
        if (CHECKS) {
            check(__functionAddress);
            XrSoundFieldConfigBD.validate(config);
        }
        return callPPPI(renderer.address(), config, soundField, __functionAddress);
    }

    /** {@code XrResult xrCreateSoundFieldBD(XrSpatialAudioRendererBD renderer, XrSoundFieldConfigBD const * config, XrSoundFieldBD * soundField)} */
    @NativeType("XrResult")
    public static int xrCreateSoundFieldBD(XrSpatialAudioRendererBD renderer, @NativeType("XrSoundFieldConfigBD const *") XrSoundFieldConfigBD config, @NativeType("XrSoundFieldBD *") PointerBuffer soundField) {
        if (CHECKS) {
            check(soundField, 1);
        }
        return nxrCreateSoundFieldBD(renderer, config.address(), memAddress(soundField));
    }

    // --- [ xrUpdateSoundFieldConfigBD ] ---

    /** {@code XrResult xrUpdateSoundFieldConfigBD(XrSoundFieldBD soundField, XrSoundFieldConfigBD const * config, XrSoundFieldFlagsBD flags)} */
    public static int nxrUpdateSoundFieldConfigBD(XrSoundFieldBD soundField, long config, long flags) {
        long __functionAddress = soundField.getCapabilities().xrUpdateSoundFieldConfigBD;
        if (CHECKS) {
            check(__functionAddress);
            if (config != NULL) { XrSoundFieldConfigBD.validate(config); }
        }
        return callPPJI(soundField.address(), config, flags, __functionAddress);
    }

    /** {@code XrResult xrUpdateSoundFieldConfigBD(XrSoundFieldBD soundField, XrSoundFieldConfigBD const * config, XrSoundFieldFlagsBD flags)} */
    @NativeType("XrResult")
    public static int xrUpdateSoundFieldConfigBD(XrSoundFieldBD soundField, @NativeType("XrSoundFieldConfigBD const *") @Nullable XrSoundFieldConfigBD config, @NativeType("XrSoundFieldFlagsBD") long flags) {
        return nxrUpdateSoundFieldConfigBD(soundField, memAddressSafe(config), flags);
    }

    // --- [ xrSubmitSoundFieldBufferBD ] ---

    /** {@code XrResult xrSubmitSoundFieldBufferBD(XrSoundFieldBD soundField, XrAudioBufferBD const * buffer)} */
    public static int nxrSubmitSoundFieldBufferBD(XrSoundFieldBD soundField, long buffer) {
        long __functionAddress = soundField.getCapabilities().xrSubmitSoundFieldBufferBD;
        if (CHECKS) {
            check(__functionAddress);
            XrAudioBufferBD.validate(buffer);
        }
        return callPPI(soundField.address(), buffer, __functionAddress);
    }

    /** {@code XrResult xrSubmitSoundFieldBufferBD(XrSoundFieldBD soundField, XrAudioBufferBD const * buffer)} */
    @NativeType("XrResult")
    public static int xrSubmitSoundFieldBufferBD(XrSoundFieldBD soundField, @NativeType("XrAudioBufferBD const *") XrAudioBufferBD buffer) {
        return nxrSubmitSoundFieldBufferBD(soundField, buffer.address());
    }

    // --- [ xrDestroySoundFieldBD ] ---

    /** {@code XrResult xrDestroySoundFieldBD(XrSoundFieldBD soundField)} */
    @NativeType("XrResult")
    public static int xrDestroySoundFieldBD(XrSoundFieldBD soundField) {
        long __functionAddress = soundField.getCapabilities().xrDestroySoundFieldBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(soundField.address(), __functionAddress);
    }

    // --- [ xrWaitAudioPeriodBD ] ---

    /** {@code XrResult xrWaitAudioPeriodBD(XrSpatialAudioRendererBD renderer, XrDuration timeout)} */
    @NativeType("XrResult")
    public static int xrWaitAudioPeriodBD(XrSpatialAudioRendererBD renderer, @NativeType("XrDuration") long timeout) {
        long __functionAddress = renderer.getCapabilities().xrWaitAudioPeriodBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(renderer.address(), timeout, __functionAddress);
    }

    // --- [ xrEndAudioPeriodBD ] ---

    /** {@code XrResult xrEndAudioPeriodBD(XrSpatialAudioRendererBD renderer)} */
    @NativeType("XrResult")
    public static int xrEndAudioPeriodBD(XrSpatialAudioRendererBD renderer) {
        long __functionAddress = renderer.getCapabilities().xrEndAudioPeriodBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(renderer.address(), __functionAddress);
    }

}