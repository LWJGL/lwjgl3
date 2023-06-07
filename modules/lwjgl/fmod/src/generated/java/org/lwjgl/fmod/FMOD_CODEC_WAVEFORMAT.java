/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FMOD_CODEC_WAVEFORMAT {
 *     char const * name;
 *     FMOD_SOUND_FORMAT format;
 *     int channels;
 *     int frequency;
 *     unsigned int lengthbytes;
 *     unsigned int lengthpcm;
 *     unsigned int pcmblocksize;
 *     int loopstart;
 *     int loopend;
 *     FMOD_MODE mode;
 *     FMOD_CHANNELMASK channelmask;
 *     FMOD_CHANNELORDER channelorder;
 *     float peakvolume;
 * }</code></pre>
 */
@NativeType("struct FMOD_CODEC_WAVEFORMAT")
public class FMOD_CODEC_WAVEFORMAT extends Struct<FMOD_CODEC_WAVEFORMAT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        FORMAT,
        CHANNELS,
        FREQUENCY,
        LENGTHBYTES,
        LENGTHPCM,
        PCMBLOCKSIZE,
        LOOPSTART,
        LOOPEND,
        MODE,
        CHANNELMASK,
        CHANNELORDER,
        PEAKVOLUME;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        FORMAT = layout.offsetof(1);
        CHANNELS = layout.offsetof(2);
        FREQUENCY = layout.offsetof(3);
        LENGTHBYTES = layout.offsetof(4);
        LENGTHPCM = layout.offsetof(5);
        PCMBLOCKSIZE = layout.offsetof(6);
        LOOPSTART = layout.offsetof(7);
        LOOPEND = layout.offsetof(8);
        MODE = layout.offsetof(9);
        CHANNELMASK = layout.offsetof(10);
        CHANNELORDER = layout.offsetof(11);
        PEAKVOLUME = layout.offsetof(12);
    }

    protected FMOD_CODEC_WAVEFORMAT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_CODEC_WAVEFORMAT create(long address, @Nullable ByteBuffer container) {
        return new FMOD_CODEC_WAVEFORMAT(address, container);
    }

    /**
     * Creates a {@code FMOD_CODEC_WAVEFORMAT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_CODEC_WAVEFORMAT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @Nullable
    @NativeType("char const *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @Nullable
    @NativeType("char const *")
    public String nameString() { return nnameString(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("FMOD_SOUND_FORMAT")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code channels} field. */
    public int channels() { return nchannels(address()); }
    /** @return the value of the {@code frequency} field. */
    public int frequency() { return nfrequency(address()); }
    /** @return the value of the {@code lengthbytes} field. */
    @NativeType("unsigned int")
    public int lengthbytes() { return nlengthbytes(address()); }
    /** @return the value of the {@code lengthpcm} field. */
    @NativeType("unsigned int")
    public int lengthpcm() { return nlengthpcm(address()); }
    /** @return the value of the {@code pcmblocksize} field. */
    @NativeType("unsigned int")
    public int pcmblocksize() { return npcmblocksize(address()); }
    /** @return the value of the {@code loopstart} field. */
    public int loopstart() { return nloopstart(address()); }
    /** @return the value of the {@code loopend} field. */
    public int loopend() { return nloopend(address()); }
    /** @return the value of the {@code mode} field. */
    @NativeType("FMOD_MODE")
    public int mode() { return nmode(address()); }
    /** @return the value of the {@code channelmask} field. */
    @NativeType("FMOD_CHANNELMASK")
    public int channelmask() { return nchannelmask(address()); }
    /** @return the value of the {@code channelorder} field. */
    @NativeType("FMOD_CHANNELORDER")
    public int channelorder() { return nchannelorder(address()); }
    /** @return the value of the {@code peakvolume} field. */
    public float peakvolume() { return npeakvolume(address()); }

    /** Sets the address of the specified encoded string to the {@code name} field. */
    public FMOD_CODEC_WAVEFORMAT name(@Nullable @NativeType("char const *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public FMOD_CODEC_WAVEFORMAT format(@NativeType("FMOD_SOUND_FORMAT") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code channels} field. */
    public FMOD_CODEC_WAVEFORMAT channels(int value) { nchannels(address(), value); return this; }
    /** Sets the specified value to the {@code frequency} field. */
    public FMOD_CODEC_WAVEFORMAT frequency(int value) { nfrequency(address(), value); return this; }
    /** Sets the specified value to the {@code lengthbytes} field. */
    public FMOD_CODEC_WAVEFORMAT lengthbytes(@NativeType("unsigned int") int value) { nlengthbytes(address(), value); return this; }
    /** Sets the specified value to the {@code lengthpcm} field. */
    public FMOD_CODEC_WAVEFORMAT lengthpcm(@NativeType("unsigned int") int value) { nlengthpcm(address(), value); return this; }
    /** Sets the specified value to the {@code pcmblocksize} field. */
    public FMOD_CODEC_WAVEFORMAT pcmblocksize(@NativeType("unsigned int") int value) { npcmblocksize(address(), value); return this; }
    /** Sets the specified value to the {@code loopstart} field. */
    public FMOD_CODEC_WAVEFORMAT loopstart(int value) { nloopstart(address(), value); return this; }
    /** Sets the specified value to the {@code loopend} field. */
    public FMOD_CODEC_WAVEFORMAT loopend(int value) { nloopend(address(), value); return this; }
    /** Sets the specified value to the {@code mode} field. */
    public FMOD_CODEC_WAVEFORMAT mode(@NativeType("FMOD_MODE") int value) { nmode(address(), value); return this; }
    /** Sets the specified value to the {@code channelmask} field. */
    public FMOD_CODEC_WAVEFORMAT channelmask(@NativeType("FMOD_CHANNELMASK") int value) { nchannelmask(address(), value); return this; }
    /** Sets the specified value to the {@code channelorder} field. */
    public FMOD_CODEC_WAVEFORMAT channelorder(@NativeType("FMOD_CHANNELORDER") int value) { nchannelorder(address(), value); return this; }
    /** Sets the specified value to the {@code peakvolume} field. */
    public FMOD_CODEC_WAVEFORMAT peakvolume(float value) { npeakvolume(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_CODEC_WAVEFORMAT set(
        @Nullable ByteBuffer name,
        int format,
        int channels,
        int frequency,
        int lengthbytes,
        int lengthpcm,
        int pcmblocksize,
        int loopstart,
        int loopend,
        int mode,
        int channelmask,
        int channelorder,
        float peakvolume
    ) {
        name(name);
        format(format);
        channels(channels);
        frequency(frequency);
        lengthbytes(lengthbytes);
        lengthpcm(lengthpcm);
        pcmblocksize(pcmblocksize);
        loopstart(loopstart);
        loopend(loopend);
        mode(mode);
        channelmask(channelmask);
        channelorder(channelorder);
        peakvolume(peakvolume);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_CODEC_WAVEFORMAT set(FMOD_CODEC_WAVEFORMAT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_CODEC_WAVEFORMAT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_CODEC_WAVEFORMAT malloc() {
        return new FMOD_CODEC_WAVEFORMAT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_CODEC_WAVEFORMAT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_CODEC_WAVEFORMAT calloc() {
        return new FMOD_CODEC_WAVEFORMAT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_CODEC_WAVEFORMAT} instance allocated with {@link BufferUtils}. */
    public static FMOD_CODEC_WAVEFORMAT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_CODEC_WAVEFORMAT(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_CODEC_WAVEFORMAT} instance for the specified memory address. */
    public static FMOD_CODEC_WAVEFORMAT create(long address) {
        return new FMOD_CODEC_WAVEFORMAT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_CODEC_WAVEFORMAT createSafe(long address) {
        return address == NULL ? null : new FMOD_CODEC_WAVEFORMAT(address, null);
    }

    /**
     * Returns a new {@link FMOD_CODEC_WAVEFORMAT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_WAVEFORMAT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_CODEC_WAVEFORMAT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_WAVEFORMAT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_CODEC_WAVEFORMAT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_WAVEFORMAT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_CODEC_WAVEFORMAT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_WAVEFORMAT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_CODEC_WAVEFORMAT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_CODEC_WAVEFORMAT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_CODEC_WAVEFORMAT malloc(MemoryStack stack) {
        return new FMOD_CODEC_WAVEFORMAT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_CODEC_WAVEFORMAT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_CODEC_WAVEFORMAT calloc(MemoryStack stack) {
        return new FMOD_CODEC_WAVEFORMAT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_CODEC_WAVEFORMAT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_WAVEFORMAT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_CODEC_WAVEFORMAT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_WAVEFORMAT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    @Nullable public static ByteBuffer nname(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + FMOD_CODEC_WAVEFORMAT.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    @Nullable public static String nnameString(long struct) { return memUTF8Safe(memGetAddress(struct + FMOD_CODEC_WAVEFORMAT.NAME)); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + FMOD_CODEC_WAVEFORMAT.FORMAT); }
    /** Unsafe version of {@link #channels}. */
    public static int nchannels(long struct) { return UNSAFE.getInt(null, struct + FMOD_CODEC_WAVEFORMAT.CHANNELS); }
    /** Unsafe version of {@link #frequency}. */
    public static int nfrequency(long struct) { return UNSAFE.getInt(null, struct + FMOD_CODEC_WAVEFORMAT.FREQUENCY); }
    /** Unsafe version of {@link #lengthbytes}. */
    public static int nlengthbytes(long struct) { return UNSAFE.getInt(null, struct + FMOD_CODEC_WAVEFORMAT.LENGTHBYTES); }
    /** Unsafe version of {@link #lengthpcm}. */
    public static int nlengthpcm(long struct) { return UNSAFE.getInt(null, struct + FMOD_CODEC_WAVEFORMAT.LENGTHPCM); }
    /** Unsafe version of {@link #pcmblocksize}. */
    public static int npcmblocksize(long struct) { return UNSAFE.getInt(null, struct + FMOD_CODEC_WAVEFORMAT.PCMBLOCKSIZE); }
    /** Unsafe version of {@link #loopstart}. */
    public static int nloopstart(long struct) { return UNSAFE.getInt(null, struct + FMOD_CODEC_WAVEFORMAT.LOOPSTART); }
    /** Unsafe version of {@link #loopend}. */
    public static int nloopend(long struct) { return UNSAFE.getInt(null, struct + FMOD_CODEC_WAVEFORMAT.LOOPEND); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return UNSAFE.getInt(null, struct + FMOD_CODEC_WAVEFORMAT.MODE); }
    /** Unsafe version of {@link #channelmask}. */
    public static int nchannelmask(long struct) { return UNSAFE.getInt(null, struct + FMOD_CODEC_WAVEFORMAT.CHANNELMASK); }
    /** Unsafe version of {@link #channelorder}. */
    public static int nchannelorder(long struct) { return UNSAFE.getInt(null, struct + FMOD_CODEC_WAVEFORMAT.CHANNELORDER); }
    /** Unsafe version of {@link #peakvolume}. */
    public static float npeakvolume(long struct) { return UNSAFE.getFloat(null, struct + FMOD_CODEC_WAVEFORMAT.PEAKVOLUME); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + FMOD_CODEC_WAVEFORMAT.NAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CODEC_WAVEFORMAT.FORMAT, value); }
    /** Unsafe version of {@link #channels(int) channels}. */
    public static void nchannels(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CODEC_WAVEFORMAT.CHANNELS, value); }
    /** Unsafe version of {@link #frequency(int) frequency}. */
    public static void nfrequency(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CODEC_WAVEFORMAT.FREQUENCY, value); }
    /** Unsafe version of {@link #lengthbytes(int) lengthbytes}. */
    public static void nlengthbytes(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CODEC_WAVEFORMAT.LENGTHBYTES, value); }
    /** Unsafe version of {@link #lengthpcm(int) lengthpcm}. */
    public static void nlengthpcm(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CODEC_WAVEFORMAT.LENGTHPCM, value); }
    /** Unsafe version of {@link #pcmblocksize(int) pcmblocksize}. */
    public static void npcmblocksize(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CODEC_WAVEFORMAT.PCMBLOCKSIZE, value); }
    /** Unsafe version of {@link #loopstart(int) loopstart}. */
    public static void nloopstart(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CODEC_WAVEFORMAT.LOOPSTART, value); }
    /** Unsafe version of {@link #loopend(int) loopend}. */
    public static void nloopend(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CODEC_WAVEFORMAT.LOOPEND, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CODEC_WAVEFORMAT.MODE, value); }
    /** Unsafe version of {@link #channelmask(int) channelmask}. */
    public static void nchannelmask(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CODEC_WAVEFORMAT.CHANNELMASK, value); }
    /** Unsafe version of {@link #channelorder(int) channelorder}. */
    public static void nchannelorder(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CODEC_WAVEFORMAT.CHANNELORDER, value); }
    /** Unsafe version of {@link #peakvolume(float) peakvolume}. */
    public static void npeakvolume(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_CODEC_WAVEFORMAT.PEAKVOLUME, value); }

    // -----------------------------------

    /** An array of {@link FMOD_CODEC_WAVEFORMAT} structs. */
    public static class Buffer extends StructBuffer<FMOD_CODEC_WAVEFORMAT, Buffer> implements NativeResource {

        private static final FMOD_CODEC_WAVEFORMAT ELEMENT_FACTORY = FMOD_CODEC_WAVEFORMAT.create(-1L);

        /**
         * Creates a new {@code FMOD_CODEC_WAVEFORMAT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_CODEC_WAVEFORMAT#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected FMOD_CODEC_WAVEFORMAT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @Nullable
        @NativeType("char const *")
        public ByteBuffer name() { return FMOD_CODEC_WAVEFORMAT.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @Nullable
        @NativeType("char const *")
        public String nameString() { return FMOD_CODEC_WAVEFORMAT.nnameString(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("FMOD_SOUND_FORMAT")
        public int format() { return FMOD_CODEC_WAVEFORMAT.nformat(address()); }
        /** @return the value of the {@code channels} field. */
        public int channels() { return FMOD_CODEC_WAVEFORMAT.nchannels(address()); }
        /** @return the value of the {@code frequency} field. */
        public int frequency() { return FMOD_CODEC_WAVEFORMAT.nfrequency(address()); }
        /** @return the value of the {@code lengthbytes} field. */
        @NativeType("unsigned int")
        public int lengthbytes() { return FMOD_CODEC_WAVEFORMAT.nlengthbytes(address()); }
        /** @return the value of the {@code lengthpcm} field. */
        @NativeType("unsigned int")
        public int lengthpcm() { return FMOD_CODEC_WAVEFORMAT.nlengthpcm(address()); }
        /** @return the value of the {@code pcmblocksize} field. */
        @NativeType("unsigned int")
        public int pcmblocksize() { return FMOD_CODEC_WAVEFORMAT.npcmblocksize(address()); }
        /** @return the value of the {@code loopstart} field. */
        public int loopstart() { return FMOD_CODEC_WAVEFORMAT.nloopstart(address()); }
        /** @return the value of the {@code loopend} field. */
        public int loopend() { return FMOD_CODEC_WAVEFORMAT.nloopend(address()); }
        /** @return the value of the {@code mode} field. */
        @NativeType("FMOD_MODE")
        public int mode() { return FMOD_CODEC_WAVEFORMAT.nmode(address()); }
        /** @return the value of the {@code channelmask} field. */
        @NativeType("FMOD_CHANNELMASK")
        public int channelmask() { return FMOD_CODEC_WAVEFORMAT.nchannelmask(address()); }
        /** @return the value of the {@code channelorder} field. */
        @NativeType("FMOD_CHANNELORDER")
        public int channelorder() { return FMOD_CODEC_WAVEFORMAT.nchannelorder(address()); }
        /** @return the value of the {@code peakvolume} field. */
        public float peakvolume() { return FMOD_CODEC_WAVEFORMAT.npeakvolume(address()); }

        /** Sets the address of the specified encoded string to the {@code name} field. */
        public FMOD_CODEC_WAVEFORMAT.Buffer name(@Nullable @NativeType("char const *") ByteBuffer value) { FMOD_CODEC_WAVEFORMAT.nname(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public FMOD_CODEC_WAVEFORMAT.Buffer format(@NativeType("FMOD_SOUND_FORMAT") int value) { FMOD_CODEC_WAVEFORMAT.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code channels} field. */
        public FMOD_CODEC_WAVEFORMAT.Buffer channels(int value) { FMOD_CODEC_WAVEFORMAT.nchannels(address(), value); return this; }
        /** Sets the specified value to the {@code frequency} field. */
        public FMOD_CODEC_WAVEFORMAT.Buffer frequency(int value) { FMOD_CODEC_WAVEFORMAT.nfrequency(address(), value); return this; }
        /** Sets the specified value to the {@code lengthbytes} field. */
        public FMOD_CODEC_WAVEFORMAT.Buffer lengthbytes(@NativeType("unsigned int") int value) { FMOD_CODEC_WAVEFORMAT.nlengthbytes(address(), value); return this; }
        /** Sets the specified value to the {@code lengthpcm} field. */
        public FMOD_CODEC_WAVEFORMAT.Buffer lengthpcm(@NativeType("unsigned int") int value) { FMOD_CODEC_WAVEFORMAT.nlengthpcm(address(), value); return this; }
        /** Sets the specified value to the {@code pcmblocksize} field. */
        public FMOD_CODEC_WAVEFORMAT.Buffer pcmblocksize(@NativeType("unsigned int") int value) { FMOD_CODEC_WAVEFORMAT.npcmblocksize(address(), value); return this; }
        /** Sets the specified value to the {@code loopstart} field. */
        public FMOD_CODEC_WAVEFORMAT.Buffer loopstart(int value) { FMOD_CODEC_WAVEFORMAT.nloopstart(address(), value); return this; }
        /** Sets the specified value to the {@code loopend} field. */
        public FMOD_CODEC_WAVEFORMAT.Buffer loopend(int value) { FMOD_CODEC_WAVEFORMAT.nloopend(address(), value); return this; }
        /** Sets the specified value to the {@code mode} field. */
        public FMOD_CODEC_WAVEFORMAT.Buffer mode(@NativeType("FMOD_MODE") int value) { FMOD_CODEC_WAVEFORMAT.nmode(address(), value); return this; }
        /** Sets the specified value to the {@code channelmask} field. */
        public FMOD_CODEC_WAVEFORMAT.Buffer channelmask(@NativeType("FMOD_CHANNELMASK") int value) { FMOD_CODEC_WAVEFORMAT.nchannelmask(address(), value); return this; }
        /** Sets the specified value to the {@code channelorder} field. */
        public FMOD_CODEC_WAVEFORMAT.Buffer channelorder(@NativeType("FMOD_CHANNELORDER") int value) { FMOD_CODEC_WAVEFORMAT.nchannelorder(address(), value); return this; }
        /** Sets the specified value to the {@code peakvolume} field. */
        public FMOD_CODEC_WAVEFORMAT.Buffer peakvolume(float value) { FMOD_CODEC_WAVEFORMAT.npeakvolume(address(), value); return this; }

    }

}