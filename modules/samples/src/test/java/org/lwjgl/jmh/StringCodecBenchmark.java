/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.openjdk.jmh.annotations.*;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;

/*
ant demo -Dclass=org.lwjgl.jmh.Bench -Dargs=StringCodecBenchmark

Testing all benchmarks/parameters/JDK versions/memory backends takes too long.

It is recommended to disable most @Benchmark methods and test one/few at a time.
The @Param fields in the @State classes can also be restricted to specific workloads
(e.g. UTF-8 only, null-terminated only).
 */
public class StringCodecBenchmark {

    static {
        // warm-up both sides of charAt, otherwise we get unfortunate compilation
        String latin1 = "this is weird, I know";
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < latin1.length(); j++) {
                latin1.charAt(j);
            }
        }

        String utf16 = "δις ις γουίρντ, Ι νόου";
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < utf16.length(); j++) {
                utf16.charAt(j);
            }
        }
    }

    @State(Scope.Thread)
    public static class ASCIIEncode {

        @Param({"32", "256", "4096"})
        public int chars;

        @Param({"true", "false"})
        public boolean nullTerminated;

        String       text;
        CharSequence sequence;
        ByteBuffer   target;

        @Setup
        public void setup() {
            text = repeatPattern("the quick brown fox jumps over the lazy dog.", chars);
            sequence = new StringBuilder(text);
            target = memAlloc(memLengthASCII(text, nullTerminated));
        }

        @TearDown
        public void tearDown() {
            memFree(target);
        }

    }

    @State(Scope.Thread)
    public static class UTF8Encode {

        @Param({"ascii", "latin1", "bmp", "supplementary"})
        public String kind;

        @Param({"32", "256", "4096"})
        public int chars;

        @Param({"true", "false"})
        public boolean nullTerminated;

        String       text;
        CharSequence sequence;
        ByteBuffer   target;

        @Setup
        public void setup() {
            text = repeatPattern(pattern(kind), chars);
            sequence = new StringBuilder(text);
            target = memAlloc(memLengthUTF8(text, nullTerminated));
        }

        @TearDown
        public void tearDown() {
            memFree(target);
        }

    }

    @State(Scope.Thread)
    public static class UTF16Encode {

        @Param({"ascii", "latin1", "bmp", "supplementary"})
        public String kind;

        @Param({"32", "256", "4096"})
        public int chars;

        @Param({"true", "false"})
        public boolean nullTerminated;

        String       text;
        CharSequence sequence;
        ByteBuffer   target;

        @Setup
        public void setup() {
            text = repeatPattern(pattern(kind), chars);
            sequence = new StringBuilder(text);
            target = memAlloc(memLengthUTF16(text, nullTerminated));
        }

        @TearDown
        public void tearDown() {
            memFree(target);
        }

    }

    @State(Scope.Thread)
    public static class ASCIIDecode {

        @Param({"32", "256", "4096"})
        public int chars;

        ByteBuffer ntText;
        ByteBuffer text;
        long       ntAddress;
        long       address;
        int        bytes;

        @Setup
        public void setup() {
            String value = repeatPattern("the quick brown fox jumps over the lazy dog.", chars);

            ntText = memASCII(value, true);
            text = memASCII(value, false);

            ntAddress = memAddress(ntText);
            address = memAddress(text);
            bytes = text.remaining();
        }

        @TearDown
        public void tearDown() {
            memFree(ntText);
            memFree(text);
        }

    }

    @State(Scope.Thread)
    public static class UTF8Decode {

        @Param({"ascii", "latin1", "bmp", "supplementary"})
        public String kind;

        @Param({"32", "256", "4096"})
        public int chars;

        ByteBuffer ntText;
        ByteBuffer text;
        long       ntAddress;
        long       address;
        int        bytes;

        @Setup
        public void setup() {
            String value = repeatPattern(pattern(kind), chars);

            ntText = memUTF8(value, true);
            text = memUTF8(value, false);

            ntAddress = memAddress(ntText);
            address = memAddress(text);
            bytes = text.remaining();
        }

        @TearDown
        public void tearDown() {
            memFree(ntText);
            memFree(text);
        }

    }

    @State(Scope.Thread)
    public static class UTF16Decode {

        @Param({"ascii", "latin1", "bmp", "supplementary"})
        public String kind;

        @Param({"32", "256", "4096"})
        public int chars;

        ByteBuffer ntText;
        ByteBuffer text;
        long       ntAddress;
        long       address;
        int        length;

        @Setup
        public void setup() {
            String value = repeatPattern(pattern(kind), chars);

            ntText = memUTF16(value, true);
            text = memUTF16(value, false);

            ntAddress = memAddress(ntText);
            address = memAddress(text);
            length = value.length();
        }

        @TearDown
        public void tearDown() {
            memFree(ntText);
            memFree(text);
        }

    }

    @Benchmark
    public int ascii_encode_allocate(ASCIIEncode state) {
        return capacityAndFree(memASCII(state.text, state.nullTerminated));
    }

    @Benchmark
    @Fork(jvmArgsAppend = "-XX:LogFile=string.xml")
    public int ascii_encode_target_string(ASCIIEncode state) {
        return memASCII(state.text, state.nullTerminated, state.target);
    }

    @Benchmark
    @Fork(jvmArgsAppend = "-XX:LogFile=charsequence.xml")
    public int ascii_encode_target_sequence(ASCIIEncode state) {
        return memASCII(state.sequence, state.nullTerminated, state.target);
    }

    @Benchmark
    public String ascii_decode_nt_address(ASCIIDecode state) {
        return memASCII(state.ntAddress);
    }

    @Benchmark
    public String ascii_decode_length_address(ASCIIDecode state) {
        return memASCII(state.address, state.bytes);
    }

    @Benchmark
    public String ascii_decode_buffer(ASCIIDecode state) {
        return memASCII(state.text);
    }

    @Benchmark
    public int ascii_decode_nt_buffer(ASCIIDecode state) {
        return memByteBufferNT1(state.ntAddress).remaining();
    }

    @Benchmark
    public int utf8_encode_allocate(UTF8Encode state) {
        return capacityAndFree(memUTF8(state.text, state.nullTerminated));
    }

    @Benchmark
    public int utf8_encode_target_string(UTF8Encode state) {
        return memUTF8(state.text, state.nullTerminated, state.target);
    }

    @Benchmark
    public int utf8_encode_target_sequence(UTF8Encode state) {
        return memUTF8(state.sequence, state.nullTerminated, state.target);
    }

    @Benchmark
    public String utf8_decode_nt_address(UTF8Decode state) {
        return memUTF8(state.ntAddress);
    }

    @Benchmark
    public String utf8_decode_length_address(UTF8Decode state) {
        return memUTF8(state.address, state.bytes);
    }

    @Benchmark
    public String utf8_decode_buffer(UTF8Decode state) {
        return memUTF8(state.text);
    }

    @Benchmark
    public int utf8_decode_nt_buffer(UTF8Decode state) {
        return memByteBufferNT1(state.ntAddress).remaining();
    }

    @Benchmark
    public int utf16_encode_allocate(UTF16Encode state) {
        return capacityAndFree(memUTF16(state.text, state.nullTerminated));
    }

    @Benchmark
    public int utf16_encode_target_string(UTF16Encode state) {
        return memUTF16(state.text, state.nullTerminated, state.target);
    }

    @Benchmark
    public int utf16_encode_target_sequence(UTF16Encode state) {
        return memUTF16(state.sequence, state.nullTerminated, state.target);
    }

    @Benchmark
    public String utf16_decode_nt_address(UTF16Decode state) {
        return memUTF16(state.ntAddress);
    }

    @Benchmark
    public String utf16_decode_length_address(UTF16Decode state) {
        return memUTF16(state.address, state.length);
    }

    @Benchmark
    public String utf16_decode_buffer(UTF16Decode state) {
        return memUTF16(state.text);
    }

    @Benchmark
    public int utf16_decode_nt_buffer(UTF16Decode state) {
        return memByteBufferNT2(state.ntAddress).remaining();
    }

    private static int capacityAndFree(ByteBuffer buffer) {
        int capacity = buffer.capacity();
        memFree(buffer);
        return capacity;
    }

    private static String pattern(String kind) {
        if ("ascii".equals(kind)) {
            return "the quick brown fox jumps over the lazy dog.";
        }
        if ("latin1".equals(kind)) {
            return "caf\u00E9 jalape\u00F1o pi\u00F1ata ";
        }
        if ("bmp".equals(kind)) {
            return "\u0397 \u03B3\u03C1\u03AE\u03B3\u03BF\u03C1\u03B7 \u03BA\u03B1\u03C6\u03AD \u03B1\u03BB\u03B5\u03C0\u03BF\u03CD ";
        }
        if ("supplementary".equals(kind)) {
            return "emoji \uD83D\uDE00 musical \uD834\uDD1E ";
        }
        throw new IllegalArgumentException(kind);
    }

    private static String repeatPattern(String pattern, int minChars) {
        StringBuilder text = new StringBuilder(minChars + pattern.length());
        while (text.length() < minChars) {
            text.append(pattern);
        }

        int length = minChars;
        if (Character.isHighSurrogate(text.charAt(length - 1)) && length < text.length()) {
            length++;
        }

        return text.substring(0, length);
    }

}
