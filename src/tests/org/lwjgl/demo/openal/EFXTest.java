/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.openal;

import org.lwjgl.BufferUtils;
import org.lwjgl.openal.*;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

import com.sun.media.sound.WaveFileReader;

import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.AL10.alSourcei;
import static org.lwjgl.openal.AL11.*;
import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.openal.EXTEfx.*;

/**
 * Class with a few examples testing and demonstrating the use of the OpenAL extension EXTEfx.
 * <p/>
 * This class is not compatible with the LWJGL debug build (lwjgl-debug.jar), as the debug build
 * throws exceptions instead of alGetError checks. The redundant exception handling code was not
 * added in order to keep these examples simple.
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

	/** Loads OpenAL and makes sure EXTEfx is supported. */
	private static ALContext setupEfx() throws Exception {
		ALContext context = ALContext.create();

		// Query for Effect Extension
		if ( !ALC.getCapabilities().ALC_EXT_EFX ) {
			AL.destroy(context);
			throw new Exception("No EXTEfx supported by driver.");
		}
		System.out.println("EXTEfx found.");

		return context;
	}

	/**
	 * Runs a series of API calls similar to the tutorials in the Effects Extension Guide of the
	 * OpenAL SDK. Nothing is played in this method.
	 */
	private static void silentTests() throws Exception {
		ALDevice device = ALDevice.create(null);

		// Create context (only necessary if LWJGL context isn't sufficient, done as example)
		IntBuffer contextAttribList = BufferUtils.createIntBuffer(16);
		contextAttribList.put(ALC10.ALC_FREQUENCY);
		contextAttribList.put(44100);

		contextAttribList.put(ALC10.ALC_REFRESH);
		contextAttribList.put(60);

		contextAttribList.put(ALC10.ALC_SYNC);
		contextAttribList.put(ALC10.ALC_FALSE);

		// ALC_MAX_AUXILIARY_SENDS won't go above compile-time max. Set to compile-time max if
		// greater.
		contextAttribList.put(ALC_MAX_AUXILIARY_SENDS);
		contextAttribList.put(2);

		contextAttribList.put(0);
		contextAttribList.flip();

		long contextHandle = alcCreateContext(device.getPointer(), contextAttribList);
		ALContext newContext = new ALContext(device, contextHandle);

		boolean makeCurrentFailed = !alcMakeContextCurrent(newContext.getPointer());
		if ( makeCurrentFailed ) {
			throw new Exception("Failed to make context current.");
		}

		// Query EFX ALC values
		System.out.println("AL_VERSION: " + alGetString(AL_VERSION));
		int efxMajor = ALC10.alcGetInteger(device.getPointer(), ALC_EFX_MAJOR_VERSION);
		System.out.println("ALC_EFX_MAJOR_VERSION: " + efxMajor);

		int efxMinor = ALC10.alcGetInteger(device.getPointer(), ALC_EFX_MINOR_VERSION);
		System.out.println("ALC_EFX_MINOR_VERSION: " + efxMinor);

		int auxSends = ALC10.alcGetInteger(device.getPointer(), ALC_MAX_AUXILIARY_SENDS);
		System.out.println("ALC_MAX_AUXILIARY_SENDS: " + auxSends);

		// Try to create 4 Auxiliary Effect Slots
		int numAuxSlots;
		int[] auxEffectSlots = new int[4]; // try more to test
		alGetError();
		for ( numAuxSlots = 0; numAuxSlots < 4; numAuxSlots++ ) {
			auxEffectSlots[numAuxSlots] = alGenAuxiliaryEffectSlots();
			if ( alGetError() != AL_NO_ERROR ) {
				break;
			}
		}
		System.out.println("Created " + numAuxSlots + " aux effect slots.");

		// Try to create 2 Effects
		int numEffects;
		int[] effects = new int[2];
		for ( numEffects = 0; numEffects < 2; numEffects++ ) {
			effects[numEffects] = alGenEffects();
			if ( alGetError() != AL_NO_ERROR ) {
				break;
			}
		}
		System.out.println("Created " + numEffects + " effects.");

		// Set first Effect Type to Reverb and change Decay Time
		alGetError();
		if ( alIsEffect(effects[0]) ) {
			alEffecti(effects[0], AL_EFFECT_TYPE, AL_EFFECT_REVERB);
			if ( alGetError() != AL_NO_ERROR ) {
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
		if ( alIsEffect(effects[1]) ) {
			alEffecti(effects[1], AL_EFFECT_TYPE, AL_EFFECT_FLANGER);
			if ( alGetError() != AL_NO_ERROR ) {
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
		if ( alGetError() != AL_NO_ERROR ) {
			throw new Exception("Failed to create filter.");
		}
		System.out.println("Generated a filter.");
		if ( alIsFilter(filter) ) {
			// Set Filter type to Low-Pass and set parameters
			alFilteri(filter, AL_FILTER_TYPE, AL_FILTER_LOWPASS);
			if ( alGetError() != AL_NO_ERROR ) {
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
		if ( alGetError() != AL_NO_ERROR ) {
			throw new Exception("Failed to attach effect to aux effect slot.");
		}
		System.out.println("Successfully loaded effect into effect slot.");

		// Configure Source Auxiliary Effect Slot Sends
		int source = alGenSources();
		// Set Source Send 0 to feed auxEffectSlots[0] without filtering
		alSource3i(source, AL_AUXILIARY_SEND_FILTER, auxEffectSlots[0], 0, AL_FILTER_NULL);
		int error = alGetError();
		if ( error != AL_NO_ERROR ) {
			throw new Exception("Failed to configure Source Send 0");
		}
		System.out.println("Linked aux effect slot to soutce slot 0");
		// Set Source Send 1 to feed uiEffectSlot[1] with filter filter
		alSource3i(source, AL_AUXILIARY_SEND_FILTER, auxEffectSlots[1], 1, filter);
		if ( alGetError() != AL_NO_ERROR ) {
			// e.g. if only 1 send per source is available
			throw new Exception("Failed to configure Source Send 1");
		}
		System.out.println("Linked aux effect slot to soutce slot 1");
		// Disable Send 0
		alSource3i(source, AL_AUXILIARY_SEND_FILTER, AL_EFFECTSLOT_NULL, 0,
		           AL_FILTER_NULL);
		if ( alGetError() != AL_NO_ERROR ) {
			throw new Exception("Failed to disable Source Send 0");
		}
		System.out.println("Disabled source send 0");
		// Disable Send 1
		alSource3i(source, AL_AUXILIARY_SEND_FILTER, AL_EFFECTSLOT_NULL, 1,
		           AL_FILTER_NULL);
		if ( alGetError() != AL_NO_ERROR ) {
			throw new Exception("Failed to disable Source Send 1");
		}
		System.out.println("Disabled source send 1");

		// Filter 'source', a generated Source
		alSourcei(source, AL_DIRECT_FILTER, filter);
		if ( alGetError() == AL_NO_ERROR ) {
			{
				System.out.println("Successfully applied a direct path filter");
				// Remove filter from 'source'
				alSourcei(source, AL_DIRECT_FILTER, AL_FILTER_NULL);
				if ( alGetError() == AL_NO_ERROR ) {
					System.out.println("Successfully removed direct filter");
				}
			}
			// Filter the Source send 0 from 'source' to Auxiliary Effect Slot auxEffectSlot[0]
			// using Filter uiFilter[0]
			alSource3i(source, AL_AUXILIARY_SEND_FILTER, auxEffectSlots[0], 0, filter);
			if ( alGetError() == AL_NO_ERROR ) {
				{
					System.out.println("Successfully applied aux send filter");
					// Remove Filter from Source Auxiliary Send
					alSource3i(source, AL_AUXILIARY_SEND_FILTER, auxEffectSlots[0], 0,
					           AL_FILTER_NULL);
					if ( alGetError() == AL_NO_ERROR ) {
						System.out.println("Successfully removed filter");
					}
				}
			}
		}

		// Set Source Cone Outer Gain HF value
		alSourcef(source, AL_CONE_OUTER_GAINHF, 0.5f);
		if ( alGetError() == AL_NO_ERROR ) {
			System.out.println("Successfully set cone outside gain filter");
		}

		// Set distance units to be in feet
		alListenerf(AL_METERS_PER_UNIT, 0.3f);
		if ( alGetError() == AL_NO_ERROR ) {
			System.out.println("Successfully set distance units");
		}

		// Cleanup
		IntBuffer auxEffectSlotsBuf = (IntBuffer)BufferUtils.createIntBuffer(
			auxEffectSlots.length).put(auxEffectSlots).rewind();
		alDeleteAuxiliaryEffectSlots(auxEffectSlotsBuf);
		IntBuffer effectsBuf = (IntBuffer)BufferUtils.createIntBuffer(
			effects.length).put(effects).rewind();
		alDeleteEffects(effectsBuf);
		alDeleteFilters(filter);
		AL.destroy(newContext);
	}

	/** Plays a sound with various effects applied to it. */
	private static void playbackTest() throws Exception {
		ALContext alContext = setupEfx();

		// Create a source and buffer audio data
		int source = alGenSources();
		int buffer = alGenBuffers();
		WaveData waveFile = WaveData.create("Footsteps.wav");
		if ( waveFile == null ) {
			System.out.println("Failed to load Footsteps.wav! Skipping playback test.");
			AL.destroy(alContext);
			return;
		}
		alBufferData(buffer, waveFile.format, waveFile.data, waveFile.samplerate);
		waveFile.dispose();
		alSourcei(source, AL_BUFFER, buffer);
		alSourcei(source, AL_LOOPING, AL_TRUE);

		System.out.println("Playing sound unaffected by EFX ...");
		alSourcePlay(source);
		Thread.sleep(7500);

		// Add reverb effect
		int effectSlot = alGenAuxiliaryEffectSlots();
		int reverbEffect = alGenEffects();
		alEffecti(reverbEffect, AL_EFFECT_TYPE, AL_EFFECT_REVERB);
		alEffectf(reverbEffect, AL_REVERB_DECAY_TIME, 5.0f);
		alAuxiliaryEffectSloti(effectSlot, AL_EFFECTSLOT_EFFECT, reverbEffect);
		alSource3i(source, AL_AUXILIARY_SEND_FILTER, effectSlot, 0,
		           AL_FILTER_NULL);

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
		alSource3i(source, AL_AUXILIARY_SEND_FILTER, AL_EFFECTSLOT_NULL, 0,
		           AL_FILTER_NULL);
		alAuxiliaryEffectSloti(effectSlot, AL_EFFECTSLOT_EFFECT, AL_EFFECT_NULL);
		alDeleteEffects(reverbEffect);
		alDeleteFilters(filter);

		// Echo effect
		int echoEffect = alGenEffects();
		alEffecti(echoEffect, AL_EFFECT_TYPE, AL_EFFECT_ECHO);
		//EXTEfx.alEffectf(echoEffect, EXTEfx.AL_ECHO_DELAY, 5.0f);
		alAuxiliaryEffectSloti(effectSlot, AL_EFFECTSLOT_EFFECT, echoEffect);
		alSource3i(source, AL_AUXILIARY_SEND_FILTER, effectSlot, 0,
		           AL_FILTER_NULL);

		System.out.println("Playing sound with echo effect ...");
		alSourcePlay(source);
		Thread.sleep(7500);

		AL.destroy(alContext);
	}

	/** Checks OpenAL for every EFX 1.0 effect and filter and prints the result to the console. */
	private static void efxUtilTest() throws Exception {
		ALContext alContext = setupEfx();

		System.out.println();
		System.out.println("Checking supported effects ...");
		if ( EFXUtil.isEffectSupported(AL_EFFECT_NULL) ) {
			System.out.println("AL_EFFECT_NULL is supported.");
		} else {
			System.out.println("AL_EFFECT_NULL is NOT supported.");
		}
		if ( EFXUtil.isEffectSupported(AL_EFFECT_EAXREVERB) ) {
			System.out.println("AL_EFFECT_EAXREVERB is supported.");
		} else {
			System.out.println("AL_EFFECT_EAXREVERB is NOT supported.");
		}
		if ( EFXUtil.isEffectSupported(AL_EFFECT_REVERB) ) {
			System.out.println("AL_EFFECT_REVERB is supported.");
		} else {
			System.out.println("AL_EFFECT_REVERB is NOT supported.");
		}
		if ( EFXUtil.isEffectSupported(AL_EFFECT_CHORUS) ) {
			System.out.println("AL_EFFECT_CHORUS is supported.");
		} else {
			System.out.println("AL_EFFECT_CHORUS is NOT supported.");
		}
		if ( EFXUtil.isEffectSupported(AL_EFFECT_DISTORTION) ) {
			System.out.println("AL_EFFECT_DISTORTION is supported.");
		} else {
			System.out.println("AL_EFFECT_DISTORTION is NOT supported.");
		}
		if ( EFXUtil.isEffectSupported(AL_EFFECT_ECHO) ) {
			System.out.println("AL_EFFECT_ECHO is supported.");
		} else {
			System.out.println("AL_EFFECT_ECHO is NOT supported.");
		}
		if ( EFXUtil.isEffectSupported(AL_EFFECT_FLANGER) ) {
			System.out.println("AL_EFFECT_FLANGER is supported.");
		} else {
			System.out.println("AL_EFFECT_FLANGER is NOT supported.");
		}
		if ( EFXUtil.isEffectSupported(AL_EFFECT_FREQUENCY_SHIFTER) ) {
			System.out.println("AL_EFFECT_FREQUENCY_SHIFTER is supported.");
		} else {
			System.out.println("AL_EFFECT_FREQUENCY_SHIFTER is NOT supported.");
		}
		if ( EFXUtil.isEffectSupported(AL_EFFECT_VOCAL_MORPHER) ) {
			System.out.println("AL_EFFECT_VOCAL_MORPHER is supported.");
		} else {
			System.out.println("AL_EFFECT_VOCAL_MORPHER is NOT supported.");
		}
		if ( EFXUtil.isEffectSupported(AL_EFFECT_PITCH_SHIFTER) ) {
			System.out.println("AL_EFFECT_PITCH_SHIFTER is supported.");
		} else {
			System.out.println("AL_EFFECT_PITCH_SHIFTER is NOT supported.");
		}
		if ( EFXUtil.isEffectSupported(AL_EFFECT_RING_MODULATOR) ) {
			System.out.println("AL_EFFECT_RING_MODULATOR is supported.");
		} else {
			System.out.println("AL_EFFECT_RING_MODULATOR is NOT supported.");
		}
		if ( EFXUtil.isEffectSupported(AL_EFFECT_AUTOWAH) ) {
			System.out.println("AL_EFFECT_AUTOWAH is supported.");
		} else {
			System.out.println("AL_EFFECT_AUTOWAH is NOT supported.");
		}
		if ( EFXUtil.isEffectSupported(AL_EFFECT_COMPRESSOR) ) {
			System.out.println("AL_EFFECT_COMPRESSOR is supported.");
		} else {
			System.out.println("AL_EFFECT_COMPRESSOR is NOT supported.");
		}
		if ( EFXUtil.isEffectSupported(AL_EFFECT_EQUALIZER) ) {
			System.out.println("AL_EFFECT_EQUALIZER is supported.");
		} else {
			System.out.println("AL_EFFECT_EQUALIZER is NOT supported.");
		}

		System.out.println();
		System.out.println("Checking supported filters ...");
		if ( EFXUtil.isFilterSupported(AL_FILTER_NULL) ) {
			System.out.println("AL_FILTER_NULL is supported.");
		} else {
			System.out.println("AL_FILTER_NULL is NOT supported.");
		}
		if ( EFXUtil.isFilterSupported(AL_FILTER_LOWPASS) ) {
			System.out.println("AL_FILTER_LOWPASS is supported.");
		} else {
			System.out.println("AL_FILTER_LOWPASS is NOT supported.");
		}
		if ( EFXUtil.isFilterSupported(AL_FILTER_HIGHPASS) ) {
			System.out.println("AL_FILTER_HIGHPASS is supported.");
		} else {
			System.out.println("AL_FILTER_HIGHPASS is NOT supported.");
		}
		if ( EFXUtil.isFilterSupported(AL_FILTER_BANDPASS) ) {
			System.out.println("AL_FILTER_BANDPASS is supported.");
		} else {
			System.out.println("AL_FILTER_BANDPASS is NOT supported.");
		}

		AL.destroy(alContext);
	}

	// TODO: Move to utils?
	private static class WaveData {

		/** actual wave data */
		public final ByteBuffer data;

		/** format type of data */
		public final int format;

		/** sample rate of data */
		public final int samplerate;

		/**
		 * Creates a new WaveData
		 *
		 * @param data       actual wavedata
		 * @param format     format of wave data
		 * @param samplerate sample rate of data
		 */
		private WaveData(ByteBuffer data, int format, int samplerate) {
			this.data = data;
			this.format = format;
			this.samplerate = samplerate;
		}

		/** Disposes the wavedata */
		public void dispose() {
			data.clear();
		}

		/**
		 * Creates a WaveData container from the specified url
		 *
		 * @param path URL to file
		 *
		 * @return WaveData containing data, or null if a failure occured
		 */
		public static WaveData create(URL path) {
			try {
				// due to an issue with AudioSystem.getAudioInputStream
				// and mixing unsigned and signed code
				// we will use the reader directly
				WaveFileReader wfr = new WaveFileReader();
				return create(wfr.getAudioInputStream(new BufferedInputStream(path.openStream())));
			} catch (Exception e) {
				org.lwjgl.LWJGLUtil.log("Unable to create from: " + path + ", " + e.getMessage());
				return null;
			}
		}

		/**
		 * Creates a WaveData container from the specified in the classpath
		 *
		 * @param path path to file (relative, and in classpath)
		 *
		 * @return WaveData containing data, or null if a failure occured
		 */
		public static WaveData create(String path) {
			return create(Thread.currentThread().getContextClassLoader().getResource(path));
		}

		/**
		 * Creates a WaveData container from the specified inputstream
		 *
		 * @param is InputStream to read from
		 *
		 * @return WaveData containing data, or null if a failure occured
		 */
		public static WaveData create(InputStream is) {
			try {
				return create(
					AudioSystem.getAudioInputStream(is));
			} catch (Exception e) {
				org.lwjgl.LWJGLUtil.log("Unable to create from inputstream, " + e.getMessage());
				return null;
			}
		}

		/**
		 * Creates a WaveData container from the specified bytes
		 *
		 * @param buffer array of bytes containing the complete wave file
		 *
		 * @return WaveData containing data, or null if a failure occured
		 */
		public static WaveData create(byte[] buffer) {
			try {
				return create(
					AudioSystem.getAudioInputStream(
						new BufferedInputStream(new ByteArrayInputStream(buffer))));
			} catch (Exception e) {
				org.lwjgl.LWJGLUtil.log("Unable to create from byte array, " + e.getMessage());
				return null;
			}
		}

		/**
		 * Creates a WaveData container from the specified ByetBuffer.
		 * If the buffer is backed by an array, it will be used directly,
		 * else the contents of the buffer will be copied using get(byte[]).
		 *
		 * @param buffer ByteBuffer containing sound file
		 *
		 * @return WaveData containing data, or null if a failure occured
		 */
		public static WaveData create(ByteBuffer buffer) {
			try {
				byte[] bytes;

				if ( buffer.hasArray() ) {
					bytes = buffer.array();
				} else {
					bytes = new byte[buffer.capacity()];
					buffer.get(bytes);
				}
				return create(bytes);
			} catch (Exception e) {
				org.lwjgl.LWJGLUtil.log("Unable to create from ByteBuffer, " + e.getMessage());
				return null;
			}
		}

		/**
		 * Creates a WaveData container from the specified stream
		 *
		 * @param ais AudioInputStream to read from
		 *
		 * @return WaveData containing data, or null if a failure occured
		 */
		public static WaveData create(AudioInputStream ais) {
			//get format of data
			AudioFormat audioformat = ais.getFormat();

			// get channels
			int channels = 0;
			if ( audioformat.getChannels() == 1 ) {
				if ( audioformat.getSampleSizeInBits() == 8 ) {
					channels = AL_FORMAT_MONO8;
				} else if ( audioformat.getSampleSizeInBits() == 16 ) {
					channels = AL_FORMAT_MONO16;
				} else {
					assert false : "Illegal sample size";
				}
			} else if ( audioformat.getChannels() == 2 ) {
				if ( audioformat.getSampleSizeInBits() == 8 ) {
					channels = AL_FORMAT_STEREO8;
				} else if ( audioformat.getSampleSizeInBits() == 16 ) {
					channels = AL_FORMAT_STEREO16;
				} else {
					throw new RuntimeException("Illegal sample size: " + audioformat.getSampleSizeInBits());
				}
			} else {
				throw new IllegalStateException("Only mono or stereo is supported");
			}

			//read data into buffer
			ByteBuffer buffer;
			try {
				int available = ais.available();
				if ( available <= 0 )
					available = ais.getFormat().getChannels() * (int)ais.getFrameLength() * ais.getFormat().getSampleSizeInBits() / 8;

				byte[] buf = new byte[available];
				int read, total = 0;

				while ( (read = ais.read(buf, total, buf.length - total)) != -1 && total < buf.length )
					total += read;

				buffer = convertAudioBytes(buf, audioformat.getSampleSizeInBits() == 16);
			} catch (IOException ioe) {
				return null;
			}

			//create our result
			WaveData wavedata = new WaveData(buffer, channels, (int)audioformat.getSampleRate());

			//close stream
			try {
				ais.close();
			} catch (IOException ioe) {
			}

			return wavedata;
		}

		private static ByteBuffer convertAudioBytes(byte[] audio_bytes, boolean two_bytes_data) {
			ByteBuffer dest = ByteBuffer.allocateDirect(audio_bytes.length);
			dest.order(ByteOrder.nativeOrder());
			ByteBuffer src = ByteBuffer.wrap(audio_bytes);
			src.order(ByteOrder.LITTLE_ENDIAN);
			if ( two_bytes_data ) {
				ShortBuffer dest_short = dest.asShortBuffer();
				ShortBuffer src_short = src.asShortBuffer();
				while ( src_short.hasRemaining() )
					dest_short.put(src_short.get());
			} else {
				while ( src.hasRemaining() )
					dest.put(src.get());
			}
			dest.rewind();
			return dest;
		}
	}
}