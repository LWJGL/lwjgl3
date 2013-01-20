/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.test.openal;

import org.lwjgl.openal.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/**
 * idea from openal-info
 *
 * @author Brian Matzon <brian@matzon.dk>
 */
public class OpenALInfo {

    /**
     * Creates an instance of OpenALInfo
     */
    public OpenALInfo() {
    }

    /**
     * Runs the actual test, using supplied arguments
     */
    protected void execute(String[] args) {
        try {
            AL.create(null, 44100, 60, false);
            checkForErrors();
        } catch (Exception e) {
            die("Init", e.getMessage());
        }

        printALCInfo();
        printALInfo();
        printEFXInfo();

        checkForErrors();

        AL.destroy();
    }

    private void printALCInfo() {
        ALContext alContext = AL.getCurrent();

        if (ALC.getCapabilities().ALC_ENUMERATION_EXT) {
            if (ALC.getCapabilities().ALC_ENUMERATE_ALL_EXT) {
                printDevices(0, EnumerateAllExt.ALC_ALL_DEVICES_SPECIFIER, "playback");
            } else {
                printDevices(0, ALC10.ALC_DEVICE_SPECIFIER, "playback");
            }
            printDevices(0, ALC11.ALC_CAPTURE_DEVICE_SPECIFIER, "capture");
        } else {
            System.out.println("No device enumeration available");
        }

        if (ALC.getCapabilities().ALC_ENUMERATE_ALL_EXT) {
            System.out.println("Default playback device: " + ALC10.alcGetString(0, EnumerateAllExt.ALC_DEFAULT_ALL_DEVICES_SPECIFIER));
        } else {
            System.out.println("Default playback device: " + ALC10.alcGetString(0, ALC10.ALC_DEFAULT_DEVICE_SPECIFIER));
        }

        System.out.println("Default capture device: " + ALC10.alcGetString(0, ALC11.ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER));

        int majorVersion = ALC10.alcGetInteger(0, ALC10.ALC_MAJOR_VERSION);
        int minorVersion = ALC10.alcGetInteger(0, ALC10.ALC_MINOR_VERSION);
        checkForErrors();

        System.out.println("ALC version: " + majorVersion + "." + minorVersion);

        System.out.println("ALC extensions:");
        String[] extensions = ALC10.alcGetString(alContext.getDeviceContext().getDevice(), ALC10.ALC_EXTENSIONS).split(" ");
        for (String extension : extensions) {
            if (extension.trim().length() == 0) {
                continue;
            }
            System.out.println("    " + extension);
        }
        checkForErrors();
    }

    private void printALInfo() {
        System.out.println("OpenAL vendor string: " + AL10.alGetString(AL10.AL_VENDOR));
        System.out.println("OpenAL renderer string: " + AL10.alGetString(AL10.AL_RENDERER));
        System.out.println("OpenAL version string: " + AL10.alGetString(AL10.AL_VERSION));
        System.out.println("AL extensions:");
        String[] extensions = AL10.alGetString(AL10.AL_EXTENSIONS).split(" ");
        for (String extension : extensions) {
            if (extension.trim().length() == 0) {
                continue;
            }
            System.out.println("    " + extension);
        }
        checkForErrors();
    }

    private void printEFXInfo() {
        if (!EFXUtil.isEfxSupported()) {
            System.out.println("EFX not available");
            return;
        }

        ALContext alContext = AL.getCurrent();
        int efxMajor = ALC10.alcGetInteger(alContext.getDeviceContext().getDevice(), EXTEfx.ALC_EFX_MAJOR_VERSION);
        int efxMinor = ALC10.alcGetInteger(alContext.getDeviceContext().getDevice(), EXTEfx.ALC_EFX_MINOR_VERSION);
        if (ALC10.alcGetError(alContext.getDeviceContext().getDevice()) == ALC10.ALC_NO_ERROR) {
            System.out.println("EFX version: " + efxMajor + "." + efxMinor);
        }

        int auxSends = ALC10.alcGetInteger(alContext.getDeviceContext().getDevice(), EXTEfx.ALC_MAX_AUXILIARY_SENDS);
        if (ALC10.alcGetError(alContext.getDeviceContext().getDevice()) == ALC10.ALC_NO_ERROR) {
            System.out.println("Max auxiliary sends: " + auxSends);
        }

        System.out.println("Supported filters: ");
        HashMap<String, Integer> filters = new HashMap<String, Integer>();
        filters.put("Low-pass", EXTEfx.AL_FILTER_LOWPASS);
        filters.put("High-pass", EXTEfx.AL_FILTER_HIGHPASS);
        filters.put("Band-pass", EXTEfx.AL_FILTER_BANDPASS);

        Set<Entry<String, Integer>> entries = filters.entrySet();
        for (final Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            if (EFXUtil.isFilterSupported(entry.getValue()))
                System.out.println("    " + entry.getKey());
        }

        System.out.println("Supported effects: ");
        HashMap<String, Integer> effects = new HashMap<String, Integer>();
        effects.put("EAX Reverb", EXTEfx.AL_EFFECT_EAXREVERB);
        effects.put("Reverb", EXTEfx.AL_EFFECT_REVERB);
        effects.put("Chorus", EXTEfx.AL_EFFECT_CHORUS);
        effects.put("Distortion", EXTEfx.AL_EFFECT_DISTORTION);
        effects.put("Echo", EXTEfx.AL_EFFECT_ECHO);
        effects.put("Flanger", EXTEfx.AL_EFFECT_FLANGER);
        effects.put("Frequency Shifter", EXTEfx.AL_EFFECT_FREQUENCY_SHIFTER);
        effects.put("Vocal Morpher", EXTEfx.AL_EFFECT_VOCAL_MORPHER);
        effects.put("Pitch Shifter", EXTEfx.AL_EFFECT_PITCH_SHIFTER);
        effects.put("Ring Modulator", EXTEfx.AL_EFFECT_RING_MODULATOR);
        effects.put("Autowah", EXTEfx.AL_EFFECT_AUTOWAH);
        effects.put("Compressor", EXTEfx.AL_EFFECT_COMPRESSOR);
        effects.put("Equalizer", EXTEfx.AL_EFFECT_EQUALIZER);

        entries = effects.entrySet();
        for (final Entry<String, Integer> entry : entries) {
            if (EFXUtil.isEffectSupported(entry.getValue()))
                System.out.println("    " + entry.getKey());
        }
    }

    private void printDevices(long contextDevice, int which, String kind) {
        List<String> devices = ALC.getStringList(contextDevice, which);
        checkForErrors();

        System.out.println("Available " + kind + " devices: ");
        for (String device : devices) {
            System.out.println("    " + device);
        }
    }

    private void die(String kind, String description) {
        System.out.println(kind + " error " + description + " occured");
    }

    private void checkForErrors() {
        {
            ALContext alContext = AL.getCurrent();
            int error = ALC10.alcGetError(alContext.getDeviceContext().getDevice());
            if (error != ALC10.ALC_NO_ERROR) {
                die("ALC", ALC10.alcGetString(alContext.getDeviceContext().getDevice(), error));
            }
        }
        {
            int error = AL10.alGetError();
            if (error != AL10.AL_NO_ERROR) {
                die("AL", AL10.alGetString(error));
            }
        }
    }

    /**
     * main entry point
     *
     * @param args String array containing arguments
     */
    public static void main(String[] args) {
        OpenALInfo openalInfo = new OpenALInfo();
        openalInfo.execute(args);
        System.exit(0);
    }
}