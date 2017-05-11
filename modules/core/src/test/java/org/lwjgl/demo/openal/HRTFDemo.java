/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.openal;

import org.lwjgl.*;
import org.lwjgl.openal.*;
import org.lwjgl.stb.*;

import java.nio.*;

import static java.lang.Math.*;
import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.openal.EXTThreadLocalContext.*;
import static org.lwjgl.openal.SOFTHRTF.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Simple HRTF demo. Ported from <a href="https://github.com/kcat/openal-soft/blob/master/examples/alhrtf.c">alhrtf.c</a>. */
public final class HRTFDemo {

    private HRTFDemo() {
    }

    public static void main(String[] args) {
        /* Print out usage if no file was specified */
        if (args.length < 1 || ("-hrtf".equals(args[0]) && args.length < 3)) {
            System.err.format("Usage: %s [-hrtf <name>] <soundfile>\n", HRTFDemo.class.getName());
            return;
        }

        long device = alcOpenDevice((ByteBuffer)null);
        if (device == NULL) {
            throw new IllegalStateException("Failed to open the default device.");
        }

        ALCCapabilities deviceCaps = ALC.createCapabilities(device);

        if (!deviceCaps.ALC_SOFT_HRTF) {
            throw new IllegalStateException("Error: ALC_SOFT_HRTF not supported");
        }

        long context = alcCreateContext(device, (IntBuffer)null);
        if (context == NULL) {
            throw new IllegalStateException("Failed to create an OpenAL context.");
        }

        alcSetThreadContext(context);
        AL.createCapabilities(deviceCaps);

        String soundname;
        String hrtfname;

        if ("-hrtf".equals(args[0])) {
            hrtfname = args[1];
            soundname = args[2];
        } else {
            hrtfname = null;
            soundname = args[0];
        }

		/* Enumerate available HRTFs, and reset the device using one. */
        int num_hrtf = alcGetInteger(device, ALC_NUM_HRTF_SPECIFIERS_SOFT);
        if (num_hrtf == 0) {
            System.out.println("No HRTFs found");
        } else {
            int index = -1;

            System.out.println("Available HRTFs:");
            for (int i = 0; i < num_hrtf; i++) {
                String name = alcGetStringiSOFT(device, ALC_HRTF_SPECIFIER_SOFT, i);
                System.out.format("    %d: %s\n", i, name);

				/* Check if this is the HRTF the user requested. */
                if (hrtfname != null && name.equals(hrtfname)) {
                    index = i;
                }
            }

            IntBuffer attr = BufferUtils.createIntBuffer(10)
                .put(ALC_HRTF_SOFT)
                .put(ALC_TRUE);

            if (index == -1) {
                if (hrtfname != null) {
                    System.out.format("HRTF \"%s\" not found\n", hrtfname);
                }
                System.out.format("Using default HRTF...\n");
            } else {
                System.out.format("Selecting HRTF %d...\n", index);
                attr
                    .put(ALC_HRTF_ID_SOFT)
                    .put(index);
            }
            attr.put(0);
            attr.flip();

            if (!alcResetDeviceSOFT(device, attr)) {
                System.out.format("Failed to reset device: %s\n", alcGetString(device, alcGetError(device)));
            }

			 /* Check if HRTF is enabled, and show which is being used. */
            int hrtf_state = alcGetInteger(device, ALC_HRTF_SOFT);
            if (hrtf_state == 0) {
                System.out.format("HRTF not enabled!\n");
            } else {
                String name = alcGetString(device, ALC_HRTF_SPECIFIER_SOFT);
                System.out.format("HRTF enabled, using %s\n", name);
            }

			/* Load the sound into a buffer. */
            int buffer = alGenBuffers();
            try (STBVorbisInfo info = STBVorbisInfo.malloc()) {
                ShortBuffer pcm = ALCDemo.readVorbis(soundname, 32 * 1024, info);
                alBufferData(buffer, AL_FORMAT_MONO16, pcm, info.sample_rate());
            }

			 /* Create the source to play the sound with. */
            int source = alGenSources();
            alSourcei(source, AL_SOURCE_RELATIVE, AL_TRUE);
            alSource3f(source, AL_POSITION, 0.0f, 0.0f, -1.0f);
            alSourcei(source, AL_BUFFER, buffer);
            alSourcei(source, AL_LOOPING, AL_TRUE);
            if (alGetError() != AL_NO_ERROR) {
                throw new IllegalStateException("Failed to setup sound source");
            }

			/* Play the sound until it finishes. */
            double angle = 0.0;
            alSourcePlay(source);
            int state;
            do {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

				/* Rotate the source around the listener by about 1/8th cycle per second.
                 * Only affects mono sounds.
				 */
                angle += (Math.PI / 4 / 100);
                alSource3f(source, AL_POSITION, (float)sin(angle), 0.0f, -(float)cos(angle));

                state = alGetSourcei(source, AL_SOURCE_STATE);
            } while (alGetError() == AL_NO_ERROR && state == AL_PLAYING);

		    /* All done. Delete resources, and close OpenAL. */
            alDeleteSources(source);
            alDeleteBuffers(buffer);

            alcSetThreadContext(NULL);
            alcDestroyContext(context);
            alcCloseDevice(device);
        }
    }

}