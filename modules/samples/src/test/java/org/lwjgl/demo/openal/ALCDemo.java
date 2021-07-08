/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.openal;

import org.lwjgl.*;
import org.lwjgl.openal.*;
import org.lwjgl.stb.*;
import org.lwjgl.system.*;

import java.io.*;
import java.nio.*;
import java.util.*;

import static org.lwjgl.demo.openal.OpenALInfo.*;
import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.ALC11.*;
import static org.lwjgl.openal.EXTThreadLocalContext.*;
import static org.lwjgl.stb.STBVorbis.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class ALCDemo {

    private ALCDemo() {
    }

    public static void main(String[] args) {
        long device = alcOpenDevice(args.length == 0 ? null : args[0]);
        if (device == NULL) {
            throw new IllegalStateException("Failed to open an OpenAL device.");
        }

        ALCCapabilities deviceCaps = ALC.createCapabilities(device);

        if (!deviceCaps.OpenALC10) {
            throw new IllegalStateException();
        }

        System.out.println("OpenALC10  : " + deviceCaps.OpenALC10);
        System.out.println("OpenALC11  : " + deviceCaps.OpenALC11);
        System.out.println("ALC_EXT_EFX: " + deviceCaps.ALC_EXT_EFX);

        if (deviceCaps.OpenALC11) {
            List<String> devices = ALUtil.getStringList(NULL, ALC_ALL_DEVICES_SPECIFIER);
            if (devices == null) {
                checkALCError(NULL);
            } else {
                for (int i = 0; i < devices.size(); i++) {
                    System.out.println(i + ": " + devices.get(i));
                }
            }
        }

        String defaultDeviceSpecifier = Objects.requireNonNull(alcGetString(NULL, ALC_DEFAULT_DEVICE_SPECIFIER));
        System.out.println("Default device: " + defaultDeviceSpecifier);

        System.out.println("ALC device specifier: " + alcGetString(device, ALC_DEVICE_SPECIFIER));

        long context = alcCreateContext(device, (IntBuffer)null);
        checkALCError(device);

        boolean useTLC = deviceCaps.ALC_EXT_thread_local_context && alcSetThreadContext(context);
        if (!useTLC) {
            if (!alcMakeContextCurrent(context)) {
                throw new IllegalStateException();
            }
        }
        checkALCError(device);

        ALCapabilities caps = AL.createCapabilities(deviceCaps, MemoryUtil::memCallocPointer);

        System.out.println("ALC_FREQUENCY     : " + alcGetInteger(device, ALC_FREQUENCY) + "Hz");
        System.out.println("ALC_REFRESH       : " + alcGetInteger(device, ALC_REFRESH) + "Hz");
        System.out.println("ALC_SYNC          : " + (alcGetInteger(device, ALC_SYNC) == ALC_TRUE));
        System.out.println("ALC_MONO_SOURCES  : " + alcGetInteger(device, ALC_MONO_SOURCES));
        System.out.println("ALC_STEREO_SOURCES: " + alcGetInteger(device, ALC_STEREO_SOURCES));

        try {
            testPlayback();
        } finally {
            alcMakeContextCurrent(NULL);
            if (useTLC) {
                AL.setCurrentThread(null);
            } else {
                AL.setCurrentProcess(null);
            }
            memFree(caps.getAddressBuffer());

            alcDestroyContext(context);
            alcCloseDevice(device);
        }
    }

    private static void testPlayback() {
        // generate buffers and sources
        int buffer = alGenBuffers();
        checkALError();

        int source = alGenSources();
        checkALError();

        try (STBVorbisInfo info = STBVorbisInfo.malloc()) {
            ShortBuffer pcm = readVorbis("demo/footsteps.ogg", 32 * 1024, info);

            //copy to buffer
            alBufferData(buffer, info.channels() == 1 ? AL_FORMAT_MONO16 : AL_FORMAT_STEREO16, pcm, info.sample_rate());
            checkALError();
        }

        //set up source input
        alSourcei(source, AL_BUFFER, buffer);
        checkALError();

        //play source
        alSourcePlay(source);
        checkALError();

        //wait
        System.out.println("Waiting for sound to complete...");
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
                break;
            }
            if (alGetSourcei(source, AL_SOURCE_STATE) == AL_STOPPED) {
                break;
            }
            System.out.println(".");
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

    static ShortBuffer readVorbis(String resource, int bufferSize, STBVorbisInfo info) {
        ByteBuffer vorbis;
        try {
            vorbis = ioResourceToByteBuffer(resource, bufferSize);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        IntBuffer error   = BufferUtils.createIntBuffer(1);
        long      decoder = stb_vorbis_open_memory(vorbis, error, null);
        if (decoder == NULL) {
            throw new RuntimeException("Failed to open Ogg Vorbis file. Error: " + error.get(0));
        }

        stb_vorbis_get_info(decoder, info);

        int channels = info.channels();

        ShortBuffer pcm = BufferUtils.createShortBuffer(stb_vorbis_stream_length_in_samples(decoder) * channels);

        stb_vorbis_get_samples_short_interleaved(decoder, channels, pcm);
        stb_vorbis_close(decoder);

        return pcm;
    }

}