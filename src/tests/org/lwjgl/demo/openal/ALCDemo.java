/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.openal;

import org.lwjgl.BufferUtils;
import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.ALContext;
import org.lwjgl.openal.ALDevice;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.List;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

import com.sun.media.sound.WaveFileReader;

import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.openal.ALC11.*;
import static org.lwjgl.openal.Util.*;
import static org.testng.Assert.*;

public class ALCDemo {

	private ALCDemo() {
	}

	public static void main(String[] args) {
		ALDevice device = ALDevice.create(null);

		ALCCapabilities caps = device.getCapabilities();

		assertTrue(caps.OpenALC10);

		System.out.println("OpenALC10: " + caps.OpenALC10);
		System.out.println("OpenALC11: " + caps.OpenALC11);
		System.out.println("caps.ALC_EXT_EFX = " + caps.ALC_EXT_EFX);

		if ( caps.OpenALC11 ) {
			List<String> devices = ALC.getStringList(0L, ALC_ALL_DEVICES_SPECIFIER);
			for ( int i = 0; i < devices.size(); i++ ) {
				System.out.println(i + ": " + devices.get(i));
			}
		}

		String defaultDeviceSpecifier = alcGetString(0L, ALC_DEFAULT_DEVICE_SPECIFIER);
		assertTrue(defaultDeviceSpecifier != null);
		System.out.println("Default device: " + defaultDeviceSpecifier);

		IntBuffer attribs = BufferUtils.createIntBuffer(16);

		attribs.put(ALC_FREQUENCY);
		attribs.put(44100);

		attribs.put(ALC_REFRESH);
		attribs.put(60);

		attribs.put(ALC_SYNC);
		attribs.put(ALC_FALSE);

		attribs.put(0);
		attribs.flip();

		long contextHandle = alcCreateContext(device.getPointer(), attribs);
		assertTrue(contextHandle != 0L);

		ALContext context = new ALContext(device, contextHandle);

		try {
			testPlayback();
		} finally {
			context.destroy();
			device.destroy();
		}
	}

	private static void testPlayback() {
		// generate buffers and sources
		int buffer = alGenBuffers();
		checkALError();

		int source = alGenSources();
		checkALError();

		// load wave data from buffer
		WaveData wavefile = WaveData.create("demo/footsteps.wav");

		try {
			//copy to buffer
			alBufferData(buffer, wavefile.format, wavefile.data, wavefile.samplerate);
			checkALError();
		} finally {
			wavefile.dispose();
		}

		//set up source input
		alSourcei(source, AL_BUFFER, buffer);
		checkALError();

		//lets loop the sound
		alSourcei(source, AL_LOOPING, AL_TRUE);
		checkALError();

		//play source 0
		alSourcePlay(source);
		checkALError();

		//wait 5 secs
		try {
			System.out.println("Waiting 5 seconds for sound to complete");
			Thread.sleep(5000);
		} catch (InterruptedException inte) {
		}

		//stop source 0
		alSourceStop(source);
		checkALError();

		//delete buffers and sources
		alDeleteSources(source);
		checkALError();

		alDeleteBuffers(buffer);
		checkALError();
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