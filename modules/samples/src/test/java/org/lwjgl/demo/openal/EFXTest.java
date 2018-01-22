/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.openal;

import org.lwjgl.*;
import org.lwjgl.openal.*;
import org.lwjgl.stb.*;

import java.nio.*;

import static org.lwjgl.demo.openal.OpenALInfo.*;
import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.AL11.*;
import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.openal.EXTEfx.*;
import static org.lwjgl.openal.EXTThreadLocalContext.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Class with a few examples testing and demonstrating the use of the OpenAL extension EXTEfx.
 *
 * @author Ciardhubh <ciardhubh[at]ciardhubh.de>
 * @author Brian Matzon <brian@matzon.dk>
 */
public final class EFXTest {

    public static void main(String[] args) throws Exception {
        silentTests();
        playbackTest();
        efxUtilTest();
    }

    /**
     * Runs a series of API calls similar to the tutorials in the Effects Extension Guide of the
     * OpenAL SDK. Nothing is played in this method.
     */
    private static void silentTests() throws Exception {
        long device = alcOpenDevice((ByteBuffer)null);
        if (device == NULL) {
            throw new IllegalStateException("Failed to open the default device.");
        }

        ALCCapabilities deviceCaps = ALC.createCapabilities(device);

        // Create context (only necessary if LWJGL context isn't sufficient, done as example)
        IntBuffer contextAttribList = BufferUtils.createIntBuffer(16);

        contextAttribList.put(ALC_REFRESH);
        contextAttribList.put(60);

        contextAttribList.put(ALC_SYNC);
        contextAttribList.put(ALC_FALSE);

        // ALC_MAX_AUXILIARY_SENDS won't go above compile-time max. Set to compile-time max if greater.
        contextAttribList.put(ALC_MAX_AUXILIARY_SENDS);
        contextAttribList.put(2);

        contextAttribList.put(0);
        contextAttribList.flip();

        long newContext = alcCreateContext(device, contextAttribList);

        boolean makeCurrentFailed = !alcSetThreadContext(newContext);
        if (makeCurrentFailed) {
            throw new Exception("Failed to make context current.");
        }
        AL.createCapabilities(deviceCaps);

        // Query EFX ALC values
        System.out.println("AL_VERSION: " + alGetString(AL_VERSION));
        int efxMajor = alcGetInteger(device, ALC_EFX_MAJOR_VERSION);
        System.out.println("ALC_EFX_MAJOR_VERSION: " + efxMajor);

        int efxMinor = alcGetInteger(device, ALC_EFX_MINOR_VERSION);
        System.out.println("ALC_EFX_MINOR_VERSION: " + efxMinor);

        int auxSends = alcGetInteger(device, ALC_MAX_AUXILIARY_SENDS);
        System.out.println("ALC_MAX_AUXILIARY_SENDS: " + auxSends);

        // Try to create 4 Auxiliary Effect Slots
        int   numAuxSlots;
        int[] auxEffectSlots = new int[4]; // try more to test
        alGetError();
        for (numAuxSlots = 0; numAuxSlots < 4; numAuxSlots++) {
            auxEffectSlots[numAuxSlots] = alGenAuxiliaryEffectSlots();
            if (alGetError() != AL_NO_ERROR) {
                break;
            }
        }
        System.out.println("Created " + numAuxSlots + " aux effect slots.");

        // Try to create 2 Effects
        int   numEffects;
        int[] effects = new int[2];
        for (numEffects = 0; numEffects < 2; numEffects++) {
            effects[numEffects] = alGenEffects();
            if (alGetError() != AL_NO_ERROR) {
                break;
            }
        }
        System.out.println("Created " + numEffects + " effects.");

        // Set first Effect Type to Reverb and change Decay Time
        alGetError();
        if (alIsEffect(effects[0])) {
            alEffecti(effects[0], AL_EFFECT_TYPE, AL_EFFECT_REVERB);
            if (alGetError() != AL_NO_ERROR) {
                System.out.println("Reverb effect not supported.");
            } else {
                alEffectf(effects[0], AL_REVERB_DECAY_TIME, 5.0f);
                System.out.println("Reverb effect created.");
            }
        } else {
            throw new Exception("First effect not a valid effect.");
        }

        // Set second Effect Type to Flanger and change Phase
        alGetError();
        if (alIsEffect(effects[1])) {
            alEffecti(effects[1], AL_EFFECT_TYPE, AL_EFFECT_FLANGER);
            if (alGetError() != AL_NO_ERROR) {
                System.out.println("Flanger effect not support.");
            } else {
                alEffecti(effects[1], AL_FLANGER_PHASE, 180);
                System.out.println("Flanger effect created.");
            }
        } else {
            throw new Exception("Second effect not a valid effect.");
        }

        // Try to create a Filter
        alGetError();
        int filter = alGenFilters();
        if (alGetError() != AL_NO_ERROR) {
            throw new Exception("Failed to create filter.");
        }
        System.out.println("Generated a filter.");
        if (alIsFilter(filter)) {
            // Set Filter type to Low-Pass and set parameters
            alFilteri(filter, AL_FILTER_TYPE, AL_FILTER_LOWPASS);
            if (alGetError() != AL_NO_ERROR) {
                System.out.println("Low pass filter not supported.");
            } else {
                alFilterf(filter, AL_LOWPASS_GAIN, 0.5f);
                alFilterf(filter, AL_LOWPASS_GAINHF, 0.5f);
                System.out.println("Low pass filter created.");
            }
        }

        // Attach Effect to Auxiliary Effect Slot
        alGetError();
        alAuxiliaryEffectSloti(auxEffectSlots[0], AL_EFFECTSLOT_EFFECT, effects[0]);
        if (alGetError() != AL_NO_ERROR) {
            throw new Exception("Failed to attach effect to aux effect slot.");
        }
        System.out.println("Successfully loaded effect into effect slot.");

        // Configure Source Auxiliary Effect Slot Sends
        int source = alGenSources();
        // Set Source Send 0 to feed auxEffectSlots[0] without filtering
        alSource3i(source, AL_AUXILIARY_SEND_FILTER, auxEffectSlots[0], 0, AL_FILTER_NULL);
        int error = alGetError();
        if (error != AL_NO_ERROR) {
            throw new Exception("Failed to configure Source Send 0");
        }
        System.out.println("Linked aux effect slot to source slot 0");
        if (auxSends > 1) {
            // Set Source Send 1 to feed uiEffectSlot[1] with filter filter
            alSource3i(source, AL_AUXILIARY_SEND_FILTER, auxEffectSlots[1], 1, filter);
            checkALError();
            if (alGetError() != AL_NO_ERROR) {
                // e.g. if only 1 send per source is available
                throw new Exception("Failed to configure Source Send 1");
            }
            System.out.println("Linked aux effect slot to source slot 1");
        }

        // Disable Send 0
        alSource3i(source, AL_AUXILIARY_SEND_FILTER, AL_EFFECTSLOT_NULL, 0, AL_FILTER_NULL);
        if (alGetError() != AL_NO_ERROR) {
            throw new Exception("Failed to disable Source Send 0");
        }
        System.out.println("Disabled source send 0");
        if (auxSends > 1) {
            // Disable Send 1
            alSource3i(source, AL_AUXILIARY_SEND_FILTER, AL_EFFECTSLOT_NULL, 1, AL_FILTER_NULL);
            if (alGetError() != AL_NO_ERROR) {
                throw new Exception("Failed to disable Source Send 1");
            }
            System.out.println("Disabled source send 1");
        }

        // Filter 'source', a generated Source
        alSourcei(source, AL_DIRECT_FILTER, filter);
        if (alGetError() == AL_NO_ERROR) {
            {
                System.out.println("Successfully applied a direct path filter");
                // Remove filter from 'source'
                alSourcei(source, AL_DIRECT_FILTER, AL_FILTER_NULL);
                if (alGetError() == AL_NO_ERROR) {
                    System.out.println("Successfully removed direct filter");
                }
            }
            // Filter the Source send 0 from 'source' to Auxiliary Effect Slot auxEffectSlot[0]
            // using Filter uiFilter[0]
            alSource3i(source, AL_AUXILIARY_SEND_FILTER, auxEffectSlots[0], 0, filter);
            if (alGetError() == AL_NO_ERROR) {
                {
                    System.out.println("Successfully applied aux send filter");
                    // Remove Filter from Source Auxiliary Send
                    alSource3i(source, AL_AUXILIARY_SEND_FILTER, auxEffectSlots[0], 0, AL_FILTER_NULL);
                    if (alGetError() == AL_NO_ERROR) {
                        System.out.println("Successfully removed filter");
                    }
                }
            }
        }

        // Set Source Cone Outer Gain HF value
        alSourcef(source, AL_CONE_OUTER_GAINHF, 0.5f);
        if (alGetError() == AL_NO_ERROR) {
            System.out.println("Successfully set cone outside gain filter");
        }

        // Set distance units to be in feet
        alListenerf(AL_METERS_PER_UNIT, 0.3f);
        if (alGetError() == AL_NO_ERROR) {
            System.out.println("Successfully set distance units");
        }

        // Cleanup
        IntBuffer auxEffectSlotsBuf = (IntBuffer)BufferUtils.createIntBuffer(auxEffectSlots.length).put(auxEffectSlots).rewind();
        alDeleteAuxiliaryEffectSlots(auxEffectSlotsBuf);
        IntBuffer effectsBuf = (IntBuffer)BufferUtils.createIntBuffer(effects.length).put(effects).rewind();
        alDeleteEffects(effectsBuf);
        alDeleteFilters(filter);

        alcSetThreadContext(NULL);
        alcDestroyContext(newContext);
        alcCloseDevice(device);
    }

    /** Plays a sound with various effects applied to it. */
    private static void playbackTest() throws Exception {
        long device = alcOpenDevice((ByteBuffer)null);
        if (device == NULL) {
            throw new IllegalStateException("Failed to open the default device.");
        }

        ALCCapabilities deviceCaps = ALC.createCapabilities(device);
        // Query for Effect Extension
        if (!deviceCaps.ALC_EXT_EFX) {
            alcCloseDevice(device);
            throw new Exception("No EXTEfx supported by driver.");
        }
        System.out.println("EXTEfx found.");

        long alContext = alcCreateContext(device, (IntBuffer)null);
        alcSetThreadContext(alContext);
        AL.createCapabilities(deviceCaps);

        // Create a source and buffer audio data
        int source = alGenSources();
        int buffer = alGenBuffers();

        try (STBVorbisInfo info = STBVorbisInfo.malloc()) {
            ShortBuffer pcm = ALCDemo.readVorbis("demo/footsteps.ogg", 32 * 1024, info);
            alBufferData(buffer, AL_FORMAT_MONO16, pcm, info.sample_rate());
        }
        alSourcei(source, AL_BUFFER, buffer);
        alSourcei(source, AL_LOOPING, AL_TRUE);

        System.out.println("Playing sound unaffected by EFX ...");
        alSourcePlay(source);
        Thread.sleep(7500);

        // Add reverb effect
        int effectSlot   = alGenAuxiliaryEffectSlots();
        int reverbEffect = alGenEffects();
        alEffecti(reverbEffect, AL_EFFECT_TYPE, AL_EFFECT_REVERB);
        alEffectf(reverbEffect, AL_REVERB_DECAY_TIME, 5.0f);
        alAuxiliaryEffectSloti(effectSlot, AL_EFFECTSLOT_EFFECT, reverbEffect);
        alSource3i(source, AL_AUXILIARY_SEND_FILTER, effectSlot, 0, AL_FILTER_NULL);

        System.out.println("Playing sound with reverb ...");
        alSourcePlay(source);
        Thread.sleep(7500);

        // Add low-pass filter directly to source
        int filter = alGenFilters();
        alFilteri(filter, AL_FILTER_TYPE, AL_FILTER_LOWPASS);
        alFilterf(filter, AL_LOWPASS_GAIN, 0.5f);
        alFilterf(filter, AL_LOWPASS_GAINHF, 0.5f);
        alSourcei(source, AL_DIRECT_FILTER, filter);

        System.out.println("Playing sound with reverb and direct low pass filter ...");
        alSourcePlay(source);
        Thread.sleep(7500);
        alSourcei(source, AL_DIRECT_FILTER, AL_FILTER_NULL);

        // Add low-pass filter to source send
        //AL11.alSource3i(source, EXTEfx.AL_AUXILIARY_SEND_FILTER, effectSlot, 0, filter);
        //
        //System.out.println("Playing sound with reverb and aux send low pass filter ...");
        //AL10.alSourcePlay(source);
        //Thread.sleep(7500);

        // Cleanup
        alSource3i(source, AL_AUXILIARY_SEND_FILTER, AL_EFFECTSLOT_NULL, 0, AL_FILTER_NULL);
        alAuxiliaryEffectSloti(effectSlot, AL_EFFECTSLOT_EFFECT, AL_EFFECT_NULL);
        alDeleteEffects(reverbEffect);
        alDeleteFilters(filter);

        // Echo effect
        int echoEffect = alGenEffects();
        alEffecti(echoEffect, AL_EFFECT_TYPE, AL_EFFECT_ECHO);
        //EXTEfx.alEffectf(echoEffect, EXTEfx.AL_ECHO_DELAY, 5.0f);
        alAuxiliaryEffectSloti(effectSlot, AL_EFFECTSLOT_EFFECT, echoEffect);
        alSource3i(source, AL_AUXILIARY_SEND_FILTER, effectSlot, 0, AL_FILTER_NULL);

        System.out.println("Playing sound with echo effect ...");
        alSourcePlay(source);
        Thread.sleep(7500);

        alcSetThreadContext(NULL);
        alcDestroyContext(alContext);
        alcCloseDevice(device);
    }

    /** Checks OpenAL for every EFX 1.0 effect and filter and prints the result to the console. */
    private static void efxUtilTest() throws Exception {
        long device = alcOpenDevice((ByteBuffer)null);
        if (device == NULL) {
            throw new IllegalStateException("Failed to open the default device.");
        }

        ALCCapabilities deviceCaps = ALC.createCapabilities(device);
        // Query for Effect Extension
        if (!deviceCaps.ALC_EXT_EFX) {
            alcCloseDevice(device);
            throw new Exception("No EXTEfx supported by driver.");
        }
        System.out.println("EXTEfx found.");

        long alContext = alcCreateContext(device, (IntBuffer)null);
        alcSetThreadContext(alContext);
        AL.createCapabilities(deviceCaps);

        System.out.println();
        System.out.println("Checking supported effects ...");
        check("AL_EFFECT_NULL", EFXUtil.isEffectSupported(AL_EFFECT_NULL));
        check("AL_EFFECT_EAXREVERB", EFXUtil.isEffectSupported(AL_EFFECT_EAXREVERB));
        check("AL_EFFECT_REVERB", EFXUtil.isEffectSupported(AL_EFFECT_REVERB));
        check("AL_EFFECT_CHORUS", EFXUtil.isEffectSupported(AL_EFFECT_CHORUS));
        check("AL_EFFECT_DISTORTION", EFXUtil.isEffectSupported(AL_EFFECT_DISTORTION));
        check("AL_EFFECT_ECHO", EFXUtil.isEffectSupported(AL_EFFECT_ECHO));
        check("AL_EFFECT_FLANGER", EFXUtil.isEffectSupported(AL_EFFECT_FLANGER));
        check("AL_EFFECT_FREQUENCY_SHIFTER", EFXUtil.isEffectSupported(AL_EFFECT_FREQUENCY_SHIFTER));
        check("AL_EFFECT_VOCAL_MORPHER", EFXUtil.isEffectSupported(AL_EFFECT_VOCAL_MORPHER));
        check("AL_EFFECT_PITCH_SHIFTER", EFXUtil.isEffectSupported(AL_EFFECT_PITCH_SHIFTER));
        check("AL_EFFECT_RING_MODULATOR", EFXUtil.isEffectSupported(AL_EFFECT_RING_MODULATOR));
        check("AL_EFFECT_AUTOWAH", EFXUtil.isEffectSupported(AL_EFFECT_AUTOWAH));
        check("AL_EFFECT_COMPRESSOR", EFXUtil.isEffectSupported(AL_EFFECT_COMPRESSOR));
        check("AL_EFFECT_EQUALIZER", EFXUtil.isEffectSupported(AL_EFFECT_EQUALIZER));

        System.out.println();
        System.out.println("Checking supported filters ...");
        check("AL_FILTER_NULL", EFXUtil.isFilterSupported(AL_FILTER_NULL));
        check("AL_FILTER_LOWPASS", EFXUtil.isFilterSupported(AL_FILTER_LOWPASS));
        check("AL_FILTER_HIGHPASS", EFXUtil.isFilterSupported(AL_FILTER_HIGHPASS));
        check("AL_FILTER_BANDPASS", EFXUtil.isFilterSupported(AL_FILTER_BANDPASS));

        alcSetThreadContext(NULL);
        alcDestroyContext(alContext);
        alcCloseDevice(device);
    }

    private static void check(String name, boolean supported) {
        System.out.println(name + (supported ? " is supported." : " is NOT supported."));
    }

}