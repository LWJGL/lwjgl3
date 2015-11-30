/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.openal;

import org.lwjgl.openal.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.openal.ALC11.*;
import static org.lwjgl.openal.EXTEfx.*;

/**
 * idea from openal-info
 *
 * @author Brian Matzon <brian@matzon.dk>
 */
public class OpenALInfo {

	/** Creates an instance of OpenALInfo */
	public OpenALInfo() {
	}

	/** Runs the actual test, using supplied arguments */
	protected void execute(String[] args) {
		ALContext alContext = ALContext.create(ALDevice.create(args.length == 0 ? null : args[0]), 0, 60, false);
		checkForErrors(alContext);

		printALCInfo(alContext);
		printALInfo(alContext);
		printEFXInfo(alContext);

		checkForErrors(alContext);

		alContext.destroy();
		alContext.getDevice().close();
	}

	private static void printALCInfo(ALContext alContext) {
		// we're running 1.1, so really no need to query for the 'ALC_ENUMERATION_EXT' extension
		if ( ALC.getCapabilities().ALC_ENUMERATION_EXT ) {
			if ( ALC.getCapabilities().ALC_ENUMERATE_ALL_EXT ) {
				printDevices(alContext, 0, EnumerateAllExt.ALC_ALL_DEVICES_SPECIFIER, "playback");
			} else {
				printDevices(alContext, 0, ALC_DEVICE_SPECIFIER, "playback");
			}
			printDevices(alContext, 0, ALC_CAPTURE_DEVICE_SPECIFIER, "capture");
		} else {
			System.out.println("No device enumeration available");
		}

		if ( ALC.getCapabilities().ALC_ENUMERATE_ALL_EXT ) {
			System.out.println("Default playback device: " + alcGetString(0, EnumerateAllExt.ALC_DEFAULT_ALL_DEVICES_SPECIFIER));
		} else {
			System.out.println("Default playback device: " + alcGetString(0, ALC_DEFAULT_DEVICE_SPECIFIER));
		}

		System.out.println("Default capture device: " + alcGetString(0, ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER));

		System.out.println("alContext = " + alContext);
		System.out.println("alContext.getDevice() = " + alContext.getDevice());
		int majorVersion = alcGetInteger(alContext.getDevice().address(), ALC_MAJOR_VERSION);
		int minorVersion = alcGetInteger(alContext.getDevice().address(), ALC_MINOR_VERSION);
		checkForErrors(alContext);

		System.out.println("ALC version: " + majorVersion + "." + minorVersion);

		System.out.println("ALC extensions:");
		String[] extensions = alcGetString(alContext.getDevice().address(), ALC_EXTENSIONS).split(" ");
		for ( String extension : extensions ) {
			if ( extension.trim().isEmpty() ) {
				continue;
			}
			System.out.println("    " + extension);
		}
		checkForErrors(alContext);
	}

	private static void printALInfo(ALContext alContext) {
		System.out.println("OpenAL vendor string: " + alGetString(AL_VENDOR));
		System.out.println("OpenAL renderer string: " + alGetString(AL_RENDERER));
		System.out.println("OpenAL version string: " + alGetString(AL_VERSION));
		System.out.println("AL extensions:");
		String[] extensions = alGetString(AL_EXTENSIONS).split(" ");
		for ( String extension : extensions ) {
			if ( extension.trim().isEmpty() ) {
				continue;
			}
			System.out.println("    " + extension);
		}
		checkForErrors(alContext);
	}

	private static void printEFXInfo(ALContext alContext) {
		if ( !EFXUtil.isEfxSupported() ) {
			System.out.println("EFX not available");
			return;
		}

		long device = alContext.getDevice().address();

		int efxMajor = alcGetInteger(device, ALC_EFX_MAJOR_VERSION);
		int efxMinor = alcGetInteger(device, ALC_EFX_MINOR_VERSION);
		if ( alcGetError(device) == ALC_NO_ERROR ) {
			System.out.println("EFX version: " + efxMajor + "." + efxMinor);
		}

		int auxSends = alcGetInteger(device, ALC_MAX_AUXILIARY_SENDS);
		if ( alcGetError(device) == ALC_NO_ERROR ) {
			System.out.println("Max auxiliary sends: " + auxSends);
		}

		System.out.println("Supported filters: ");
		HashMap<String, Integer> filters = new HashMap<String, Integer>();
		filters.put("Low-pass", AL_FILTER_LOWPASS);
		filters.put("High-pass", AL_FILTER_HIGHPASS);
		filters.put("Band-pass", AL_FILTER_BANDPASS);

		Set<Entry<String, Integer>> entries = filters.entrySet();
		for ( Entry<String, Integer> entry : entries ) {
			if ( EFXUtil.isFilterSupported(entry.getValue()) )
				System.out.println("    " + entry.getKey());
		}

		System.out.println("Supported effects: ");
		HashMap<String, Integer> effects = new HashMap<String, Integer>();
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

		entries = effects.entrySet();
		for ( Entry<String, Integer> entry : entries ) {
			if ( EFXUtil.isEffectSupported(entry.getValue()) )
				System.out.println("    " + entry.getKey());
		}
	}

	private static void printDevices(ALContext alContext, long contextDevice, int which, String kind) {
		List<String> devices = ALUtil.getStringList(contextDevice, which);
		checkForErrors(alContext);

		System.out.println("Available " + kind + " devices: ");
		for ( String device : devices ) {
			System.out.println("    " + device);
		}
	}

	private static void checkForErrors(ALContext alContext) {
		ALUtil.checkALCError(alContext.getDevice().address());
		ALUtil.checkALError();
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