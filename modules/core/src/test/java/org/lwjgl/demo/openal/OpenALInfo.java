/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.openal;

import org.lwjgl.openal.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.openal.ALC11.*;
import static org.lwjgl.openal.EXTEfx.*;
import static org.lwjgl.openal.EXTThreadLocalContext.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * idea from openal-info
 *
 * @author Brian Matzon <brian@matzon.dk>
 */
public class OpenALInfo {

    /** Creates an instance of OpenALInfo */
    public OpenALInfo() {
    }

    public static void main(String[] args) {
        long device = alcOpenDevice(args.length == 0 ? null : args[0]);

        ALCCapabilities deviceCaps = ALC.createCapabilities(device);

        long alContext = alcCreateContext(device, (IntBuffer)null);
        checkALCError(device);

        alcSetThreadContext(alContext);
        ALCapabilities contextCaps = AL.createCapabilities(deviceCaps);

        printALCInfo(device, deviceCaps);
        printALInfo();
        if (deviceCaps.ALC_EXT_EFX) {
            printEFXInfo(device);
        }

        alcSetThreadContext(NULL);
        alcDestroyContext(alContext);
        alcCloseDevice(device);
    }

    private static void printALCInfo(long device, ALCCapabilities caps) {
        // we're running 1.1, so really no need to query for the 'ALC_ENUMERATION_EXT' extension
        if (caps.ALC_ENUMERATION_EXT) {
            if (caps.ALC_ENUMERATE_ALL_EXT) {
                printDevices(EnumerateAllExt.ALC_ALL_DEVICES_SPECIFIER, "playback");
            } else {
                printDevices(ALC_DEVICE_SPECIFIER, "playback");
            }
            printDevices(ALC_CAPTURE_DEVICE_SPECIFIER, "capture");
        } else {
            System.out.println("No device enumeration available");
        }

        if (caps.ALC_ENUMERATE_ALL_EXT) {
            System.out.println("Default playback device: " + alcGetString(0, EnumerateAllExt.ALC_DEFAULT_ALL_DEVICES_SPECIFIER));
        } else {
            System.out.println("Default playback device: " + alcGetString(0, ALC_DEFAULT_DEVICE_SPECIFIER));
        }

        System.out.println("Default capture device: " + alcGetString(0, ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER));

        int majorVersion = alcGetInteger(device, ALC_MAJOR_VERSION);
        int minorVersion = alcGetInteger(device, ALC_MINOR_VERSION);
        checkALCError(device);

        System.out.println("ALC version: " + majorVersion + "." + minorVersion);

        System.out.println("ALC extensions:");
        String[] extensions = alcGetString(device, ALC_EXTENSIONS).split(" ");
        checkALCError(device);
        for (String extension : extensions) {
            if (extension.trim().isEmpty()) {
                continue;
            }
            System.out.println("    " + extension);
        }
    }

    private static void printALInfo() {
        System.out.println("OpenAL vendor string: " + alGetString(AL_VENDOR));
        System.out.println("OpenAL renderer string: " + alGetString(AL_RENDERER));
        System.out.println("OpenAL version string: " + alGetString(AL_VERSION));
        System.out.println("AL extensions:");
        String[] extensions = alGetString(AL_EXTENSIONS).split(" ");
        for (String extension : extensions) {
            if (extension.trim().isEmpty()) {
                continue;
            }
            System.out.println("    " + extension);
        }
        checkALError();
    }

    private static void printEFXInfo(long device) {
        int efxMajor = alcGetInteger(device, ALC_EFX_MAJOR_VERSION);
        int efxMinor = alcGetInteger(device, ALC_EFX_MINOR_VERSION);
        if (alcGetError(device) == ALC_NO_ERROR) {
            System.out.println("EFX version: " + efxMajor + "." + efxMinor);
        }

        int auxSends = alcGetInteger(device, ALC_MAX_AUXILIARY_SENDS);
        if (alcGetError(device) == ALC_NO_ERROR) {
            System.out.println("Max auxiliary sends: " + auxSends);
        }

        System.out.println("Supported filters: ");
        HashMap<String, Integer> filters = new HashMap<>();
        filters.put("Low-pass", AL_FILTER_LOWPASS);
        filters.put("High-pass", AL_FILTER_HIGHPASS);
        filters.put("Band-pass", AL_FILTER_BANDPASS);

        filters.entrySet().stream()
            .filter(entry -> EFXUtil.isFilterSupported(entry.getValue()))
            .forEach(entry -> System.out.println("    " + entry.getKey()));

        System.out.println("Supported effects: ");
        HashMap<String, Integer> effects = new HashMap<>();
        effects.put("EAX Reverb", AL_EFFECT_EAXREVERB);
        effects.put("Reverb", AL_EFFECT_REVERB);
        effects.put("Chorus", AL_EFFECT_CHORUS);
        effects.put("Distortion", AL_EFFECT_DISTORTION);
        effects.put("Echo", AL_EFFECT_ECHO);
        effects.put("Flanger", AL_EFFECT_FLANGER);
        effects.put("Frequency Shifter", AL_EFFECT_FREQUENCY_SHIFTER);
        effects.put("Vocal Morpher", AL_EFFECT_VOCAL_MORPHER);
        effects.put("Pitch Shifter", AL_EFFECT_PITCH_SHIFTER);
        effects.put("Ring Modulator", AL_EFFECT_RING_MODULATOR);
        effects.put("Autowah", AL_EFFECT_AUTOWAH);
        effects.put("Compressor", AL_EFFECT_COMPRESSOR);
        effects.put("Equalizer", AL_EFFECT_EQUALIZER);

        effects.entrySet().stream()
            .filter(e -> EFXUtil.isEffectSupported(e.getValue()))
            .forEach(e -> System.out.println("    " + e.getKey()));
    }

    private static void printDevices(int which, String kind) {
        List<String> devices = ALUtil.getStringList(NULL, which);
        System.out.println("Available " + kind + " devices: ");
        for (String d : devices) {
            System.out.println("    " + d);
        }
    }

    static void checkALCError(long device) {
        int err = alcGetError(device);
        if (err != ALC_NO_ERROR) {
            throw new RuntimeException(alcGetString(device, err));
        }
    }

    static void checkALError() {
        int err = alGetError();
        if (err != AL_NO_ERROR) {
            throw new RuntimeException(alGetString(err));
        }
    }

}