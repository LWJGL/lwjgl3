/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.opus;

import org.lwjgl.system.*;
import org.testng.annotations.*;

import java.nio.*;
import java.util.function.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.opus.Opus.*;
import static org.lwjgl.util.opus.OpusCustom.*;
import static org.lwjgl.util.opus.OpusMultistream.*;
import static org.testng.Assert.*;

@Test
public class OpusTest {

    public void testchannels() {
        try (MemoryStack stack = stackPush()) {
            IntBuffer error = stack.callocInt(1);

            int application = OPUS_APPLICATION_AUDIO;

            testChannels(opus_encoder_create(48000, 1, application, error), error, 8, 1, Opus::opus_encoder_destroy);
            testChannels(opus_encoder_create(48000, 2, application, error), error, 8, 2, Opus::opus_encoder_destroy);
            testChannels(opus_decoder_create(48000, 1, error), error, 8, 1, Opus::opus_decoder_destroy);
            testChannels(opus_decoder_create(48000, 2, error), error, 8, 2, Opus::opus_decoder_destroy);

            testChannels(
                opus_multistream_encoder_create(48000, 1, 0, stack.malloc(1), application, error),
                error, 0, 1, OpusMultistream::opus_multistream_encoder_destroy
            );
            testChannels(
                opus_multistream_encoder_create(48000, 254, 1, stack.malloc(255), application, error),
                error, 0, 255, OpusMultistream::opus_multistream_encoder_destroy
            );

            long mode = opus_custom_mode_create(48000, 64, error);
            check(error);
            testChannels(opus_custom_encoder_create(mode, 1, error), error, POINTER_SIZE, 1, OpusCustom::opus_custom_encoder_destroy);
            testChannels(opus_custom_encoder_create(mode, 2, error), error, POINTER_SIZE, 2, OpusCustom::opus_custom_encoder_destroy);
            testChannels(opus_custom_decoder_create(mode, 1, error), error, POINTER_SIZE + 4, 1, OpusCustom::opus_custom_decoder_destroy);
            testChannels(opus_custom_decoder_create(mode, 2, error), error, POINTER_SIZE + 4, 2, OpusCustom::opus_custom_decoder_destroy);
        }
    }

    private static void testChannels(long codec, IntBuffer error, int offset, int channels, LongConsumer destroyer) {
        check(error);
        assertNotEquals(codec, NULL);
        try {
            if (memGetInt(codec + offset) != channels) {
                throw new IllegalStateException();
            }
        } finally {
            destroyer.accept(codec);
        }
    }

    private static void check(IntBuffer error) {
        check(error.get(0));
    }

    private static void check(int error) {
        if (error != 0) {
            throw new IllegalStateException(opus_strerror(error));
        }
    }

    public void testEncoderCTL() {
        try (MemoryStack stack = stackPush()) {
            IntBuffer error = stack.callocInt(1);
            IntBuffer pi    = stack.callocInt(1);

            long st = opus_encoder_create(48000, 2, OPUS_APPLICATION_AUDIO, error);
            check(error);

            pi.put(0, -1);
            check(opus_encoder_ctl(st, OPUS_GET_COMPLEXITY(pi)));
            assertNotEquals(pi.get(0), -1);

            check(opus_encoder_ctl(st, OPUS_SET_COMPLEXITY(1)));

            pi.put(0, -1);
            check(opus_encoder_ctl(st, OPUS_GET_COMPLEXITY(pi)));
            assertEquals(pi.get(0), 1);

            check(opus_encoder_ctl(st, OPUS_GET_SAMPLE_RATE(pi)));
            assertNotEquals(opus_encoder_ctl(st, OPUS_GET_GAIN(pi)), 0);

            check(opus_encoder_ctl(st, OPUS_RESET_STATE));

            opus_encoder_destroy(st);
        }
    }

    public void testDecoderCTL() {
        try (MemoryStack stack = stackPush()) {
            IntBuffer error = stack.callocInt(1);
            IntBuffer pi    = stack.callocInt(1);

            long st = opus_decoder_create(48000, 2, error);

            check(opus_decoder_ctl(st, OPUS_RESET_STATE));
            check(opus_decoder_ctl(st, OPUS_GET_SAMPLE_RATE(pi)));
            check(opus_decoder_ctl(st, OPUS_GET_GAIN(pi)));

            opus_decoder_destroy(st);
        }
    }

}