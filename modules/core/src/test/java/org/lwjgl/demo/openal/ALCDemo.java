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
import org.lwjgl.stb.STBVorbisInfo;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.List;

import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.openal.ALC11.*;
import static org.lwjgl.openal.ALUtil.*;
import static org.lwjgl.stb.STBVorbis.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.testng.Assert.*;

public final class ALCDemo {

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

		ALContext context = ALContext.create(device);

		System.out.println("ALC_FREQUENCY: " + alcGetInteger(device.getPointer(), ALC_FREQUENCY) + "Hz");
		System.out.println("ALC_REFRESH: " + alcGetInteger(device.getPointer(), ALC_REFRESH) + "Hz");
		System.out.println("ALC_SYNC: " + (alcGetInteger(device.getPointer(), ALC_SYNC) == ALC_TRUE));
		System.out.println("ALC_MONO_SOURCES: " + alcGetInteger(device.getPointer(), ALC_MONO_SOURCES));
		System.out.println("ALC_STEREO_SOURCES: " + alcGetInteger(device.getPointer(), ALC_STEREO_SOURCES));

		try {
			testPlayback();
		} finally {
			context.destroy();
			device.destroy();
		}
	}

	private static void testPlayback() {
		STBVorbisInfo info = new STBVorbisInfo();
		ByteBuffer pcm = readVorbis("demo/footsteps.ogg", 32 * 1024, info);

		// generate buffers and sources
		int buffer = alGenBuffers();
		checkALError();

		int source = alGenSources();
		checkALError();

		//copy to buffer
		alBufferData(buffer, AL_FORMAT_MONO16, pcm, info.getSampleRate());
		checkALError();

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

	static ByteBuffer readVorbis(String resource, int bufferSize, STBVorbisInfo info) {
		ByteBuffer vorbis;
		try {
			vorbis = ioResourceToByteBuffer(resource, bufferSize);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		IntBuffer error = BufferUtils.createIntBuffer(1);
		long decoder = stb_vorbis_open_memory(vorbis, error, null);
		if ( decoder == NULL )
			throw new RuntimeException("Failed to open Ogg Vorbis file. Error: " + error.get(0));

		stb_vorbis_get_info(decoder, info.buffer());

		int channels = info.getChannels();

		int lengthSamples = stb_vorbis_stream_length_in_samples(decoder);

		ByteBuffer pcm = BufferUtils.createByteBuffer(lengthSamples * 2);

		stb_vorbis_get_samples_short_interleaved(decoder, channels, pcm, lengthSamples);
		stb_vorbis_close(decoder);

		return pcm;
	}

}