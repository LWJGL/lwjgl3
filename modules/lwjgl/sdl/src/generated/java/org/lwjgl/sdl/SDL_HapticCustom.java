/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_HapticCustom {
 *     Uint16 type;
 *     {@link SDL_HapticDirection SDL_HapticDirection} direction;
 *     Uint32 length;
 *     Uint16 delay;
 *     Uint16 button;
 *     Uint16 interval;
 *     Uint8 channels;
 *     Uint16 period;
 *     Uint16 samples;
 *     Uint16 * data;
 *     Uint16 attack_length;
 *     Uint16 attack_level;
 *     Uint16 fade_length;
 *     Uint16 fade_level;
 * }}</pre>
 */
public class SDL_HapticCustom extends Struct<SDL_HapticCustom> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        DIRECTION,
        LENGTH,
        DELAY,
        BUTTON,
        INTERVAL,
        CHANNELS,
        PERIOD,
        SAMPLES,
        DATA,
        ATTACK_LENGTH,
        ATTACK_LEVEL,
        FADE_LENGTH,
        FADE_LEVEL;

    static {
        Layout layout = __struct(
            __member(2),
            __member(SDL_HapticDirection.SIZEOF, SDL_HapticDirection.ALIGNOF),
            __member(4),
            __member(2),
            __member(2),
            __member(2),
            __member(1),
            __member(2),
            __member(2),
            __member(POINTER_SIZE),
            __member(2),
            __member(2),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        DIRECTION = layout.offsetof(1);
        LENGTH = layout.offsetof(2);
        DELAY = layout.offsetof(3);
        BUTTON = layout.offsetof(4);
        INTERVAL = layout.offsetof(5);
        CHANNELS = layout.offsetof(6);
        PERIOD = layout.offsetof(7);
        SAMPLES = layout.offsetof(8);
        DATA = layout.offsetof(9);
        ATTACK_LENGTH = layout.offsetof(10);
        ATTACK_LEVEL = layout.offsetof(11);
        FADE_LENGTH = layout.offsetof(12);
        FADE_LEVEL = layout.offsetof(13);
    }

    protected SDL_HapticCustom(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_HapticCustom create(long address, @Nullable ByteBuffer container) {
        return new SDL_HapticCustom(address, container);
    }

    /**
     * Creates a {@code SDL_HapticCustom} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_HapticCustom(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("Uint16")
    public short type() { return ntype(address()); }
    /** @return a {@link SDL_HapticDirection} view of the {@code direction} field. */
    public SDL_HapticDirection direction() { return ndirection(address()); }
    /** @return the value of the {@code length} field. */
    @NativeType("Uint32")
    public int length() { return nlength(address()); }
    /** @return the value of the {@code delay} field. */
    @NativeType("Uint16")
    public short delay() { return ndelay(address()); }
    /** @return the value of the {@code button} field. */
    @NativeType("Uint16")
    public short button() { return nbutton(address()); }
    /** @return the value of the {@code interval} field. */
    @NativeType("Uint16")
    public short interval() { return ninterval(address()); }
    /** @return the value of the {@code channels} field. */
    @NativeType("Uint8")
    public byte channels() { return nchannels(address()); }
    /** @return the value of the {@code period} field. */
    @NativeType("Uint16")
    public short period() { return nperiod(address()); }
    /** @return the value of the {@code samples} field. */
    @NativeType("Uint16")
    public short samples() { return nsamples(address()); }
    /** @return a {@link ShortBuffer} view of the data pointed to by the {@code data} field. */
    @NativeType("Uint16 *")
    public ShortBuffer data() { return ndata(address()); }
    /** @return the value of the {@code attack_length} field. */
    @NativeType("Uint16")
    public short attack_length() { return nattack_length(address()); }
    /** @return the value of the {@code attack_level} field. */
    @NativeType("Uint16")
    public short attack_level() { return nattack_level(address()); }
    /** @return the value of the {@code fade_length} field. */
    @NativeType("Uint16")
    public short fade_length() { return nfade_length(address()); }
    /** @return the value of the {@code fade_level} field. */
    @NativeType("Uint16")
    public short fade_level() { return nfade_level(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_HapticCustom type(@NativeType("Uint16") short value) { ntype(address(), value); return this; }
    /** Copies the specified {@link SDL_HapticDirection} to the {@code direction} field. */
    public SDL_HapticCustom direction(SDL_HapticDirection value) { ndirection(address(), value); return this; }
    /** Passes the {@code direction} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_HapticCustom direction(java.util.function.Consumer<SDL_HapticDirection> consumer) { consumer.accept(direction()); return this; }
    /** Sets the specified value to the {@code length} field. */
    public SDL_HapticCustom length(@NativeType("Uint32") int value) { nlength(address(), value); return this; }
    /** Sets the specified value to the {@code delay} field. */
    public SDL_HapticCustom delay(@NativeType("Uint16") short value) { ndelay(address(), value); return this; }
    /** Sets the specified value to the {@code button} field. */
    public SDL_HapticCustom button(@NativeType("Uint16") short value) { nbutton(address(), value); return this; }
    /** Sets the specified value to the {@code interval} field. */
    public SDL_HapticCustom interval(@NativeType("Uint16") short value) { ninterval(address(), value); return this; }
    /** Sets the specified value to the {@code channels} field. */
    public SDL_HapticCustom channels(@NativeType("Uint8") byte value) { nchannels(address(), value); return this; }
    /** Sets the specified value to the {@code period} field. */
    public SDL_HapticCustom period(@NativeType("Uint16") short value) { nperiod(address(), value); return this; }
    /** Sets the specified value to the {@code samples} field. */
    public SDL_HapticCustom samples(@NativeType("Uint16") short value) { nsamples(address(), value); return this; }
    /** Sets the address of the specified {@link ShortBuffer} to the {@code data} field. */
    public SDL_HapticCustom data(@NativeType("Uint16 *") ShortBuffer value) { ndata(address(), value); return this; }
    /** Sets the specified value to the {@code attack_length} field. */
    public SDL_HapticCustom attack_length(@NativeType("Uint16") short value) { nattack_length(address(), value); return this; }
    /** Sets the specified value to the {@code attack_level} field. */
    public SDL_HapticCustom attack_level(@NativeType("Uint16") short value) { nattack_level(address(), value); return this; }
    /** Sets the specified value to the {@code fade_length} field. */
    public SDL_HapticCustom fade_length(@NativeType("Uint16") short value) { nfade_length(address(), value); return this; }
    /** Sets the specified value to the {@code fade_level} field. */
    public SDL_HapticCustom fade_level(@NativeType("Uint16") short value) { nfade_level(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_HapticCustom set(
        short type,
        SDL_HapticDirection direction,
        int length,
        short delay,
        short button,
        short interval,
        byte channels,
        short period,
        short samples,
        ShortBuffer data,
        short attack_length,
        short attack_level,
        short fade_length,
        short fade_level
    ) {
        type(type);
        direction(direction);
        length(length);
        delay(delay);
        button(button);
        interval(interval);
        channels(channels);
        period(period);
        samples(samples);
        data(data);
        attack_length(attack_length);
        attack_level(attack_level);
        fade_length(fade_length);
        fade_level(fade_level);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_HapticCustom set(SDL_HapticCustom src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_HapticCustom} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_HapticCustom malloc() {
        return new SDL_HapticCustom(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_HapticCustom} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_HapticCustom calloc() {
        return new SDL_HapticCustom(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_HapticCustom} instance allocated with {@link BufferUtils}. */
    public static SDL_HapticCustom create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_HapticCustom(memAddress(container), container);
    }

    /** Returns a new {@code SDL_HapticCustom} instance for the specified memory address. */
    public static SDL_HapticCustom create(long address) {
        return new SDL_HapticCustom(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_HapticCustom createSafe(long address) {
        return address == NULL ? null : new SDL_HapticCustom(address, null);
    }

    /**
     * Returns a new {@link SDL_HapticCustom.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_HapticCustom.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_HapticCustom.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_HapticCustom.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_HapticCustom.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_HapticCustom.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_HapticCustom.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_HapticCustom.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_HapticCustom.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_HapticCustom} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_HapticCustom malloc(MemoryStack stack) {
        return new SDL_HapticCustom(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_HapticCustom} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_HapticCustom calloc(MemoryStack stack) {
        return new SDL_HapticCustom(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_HapticCustom.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_HapticCustom.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_HapticCustom.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_HapticCustom.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static short ntype(long struct) { return memGetShort(struct + SDL_HapticCustom.TYPE); }
    /** Unsafe version of {@link #direction}. */
    public static SDL_HapticDirection ndirection(long struct) { return SDL_HapticDirection.create(struct + SDL_HapticCustom.DIRECTION); }
    /** Unsafe version of {@link #length}. */
    public static int nlength(long struct) { return memGetInt(struct + SDL_HapticCustom.LENGTH); }
    /** Unsafe version of {@link #delay}. */
    public static short ndelay(long struct) { return memGetShort(struct + SDL_HapticCustom.DELAY); }
    /** Unsafe version of {@link #button}. */
    public static short nbutton(long struct) { return memGetShort(struct + SDL_HapticCustom.BUTTON); }
    /** Unsafe version of {@link #interval}. */
    public static short ninterval(long struct) { return memGetShort(struct + SDL_HapticCustom.INTERVAL); }
    /** Unsafe version of {@link #channels}. */
    public static byte nchannels(long struct) { return memGetByte(struct + SDL_HapticCustom.CHANNELS); }
    /** Unsafe version of {@link #period}. */
    public static short nperiod(long struct) { return memGetShort(struct + SDL_HapticCustom.PERIOD); }
    /** Unsafe version of {@link #samples}. */
    public static short nsamples(long struct) { return memGetShort(struct + SDL_HapticCustom.SAMPLES); }
    /** Unsafe version of {@link #data() data}. */
    public static ShortBuffer ndata(long struct) { return memShortBuffer(memGetAddress(struct + SDL_HapticCustom.DATA), Byte.toUnsignedInt(nchannels(struct)) * Short.toUnsignedInt(nsamples(struct))); }
    /** Unsafe version of {@link #attack_length}. */
    public static short nattack_length(long struct) { return memGetShort(struct + SDL_HapticCustom.ATTACK_LENGTH); }
    /** Unsafe version of {@link #attack_level}. */
    public static short nattack_level(long struct) { return memGetShort(struct + SDL_HapticCustom.ATTACK_LEVEL); }
    /** Unsafe version of {@link #fade_length}. */
    public static short nfade_length(long struct) { return memGetShort(struct + SDL_HapticCustom.FADE_LENGTH); }
    /** Unsafe version of {@link #fade_level}. */
    public static short nfade_level(long struct) { return memGetShort(struct + SDL_HapticCustom.FADE_LEVEL); }

    /** Unsafe version of {@link #type(short) type}. */
    public static void ntype(long struct, short value) { memPutShort(struct + SDL_HapticCustom.TYPE, value); }
    /** Unsafe version of {@link #direction(SDL_HapticDirection) direction}. */
    public static void ndirection(long struct, SDL_HapticDirection value) { memCopy(value.address(), struct + SDL_HapticCustom.DIRECTION, SDL_HapticDirection.SIZEOF); }
    /** Unsafe version of {@link #length(int) length}. */
    public static void nlength(long struct, int value) { memPutInt(struct + SDL_HapticCustom.LENGTH, value); }
    /** Unsafe version of {@link #delay(short) delay}. */
    public static void ndelay(long struct, short value) { memPutShort(struct + SDL_HapticCustom.DELAY, value); }
    /** Unsafe version of {@link #button(short) button}. */
    public static void nbutton(long struct, short value) { memPutShort(struct + SDL_HapticCustom.BUTTON, value); }
    /** Unsafe version of {@link #interval(short) interval}. */
    public static void ninterval(long struct, short value) { memPutShort(struct + SDL_HapticCustom.INTERVAL, value); }
    /** Unsafe version of {@link #channels(byte) channels}. */
    public static void nchannels(long struct, byte value) { memPutByte(struct + SDL_HapticCustom.CHANNELS, value); }
    /** Unsafe version of {@link #period(short) period}. */
    public static void nperiod(long struct, short value) { memPutShort(struct + SDL_HapticCustom.PERIOD, value); }
    /** Unsafe version of {@link #samples(short) samples}. */
    public static void nsamples(long struct, short value) { memPutShort(struct + SDL_HapticCustom.SAMPLES, value); }
    /** Unsafe version of {@link #data(ShortBuffer) data}. */
    public static void ndata(long struct, ShortBuffer value) { memPutAddress(struct + SDL_HapticCustom.DATA, memAddress(value)); }
    /** Unsafe version of {@link #attack_length(short) attack_length}. */
    public static void nattack_length(long struct, short value) { memPutShort(struct + SDL_HapticCustom.ATTACK_LENGTH, value); }
    /** Unsafe version of {@link #attack_level(short) attack_level}. */
    public static void nattack_level(long struct, short value) { memPutShort(struct + SDL_HapticCustom.ATTACK_LEVEL, value); }
    /** Unsafe version of {@link #fade_length(short) fade_length}. */
    public static void nfade_length(long struct, short value) { memPutShort(struct + SDL_HapticCustom.FADE_LENGTH, value); }
    /** Unsafe version of {@link #fade_level(short) fade_level}. */
    public static void nfade_level(long struct, short value) { memPutShort(struct + SDL_HapticCustom.FADE_LEVEL, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_HapticCustom.DATA));
    }

    // -----------------------------------

    /** An array of {@link SDL_HapticCustom} structs. */
    public static class Buffer extends StructBuffer<SDL_HapticCustom, Buffer> implements NativeResource {

        private static final SDL_HapticCustom ELEMENT_FACTORY = SDL_HapticCustom.create(-1L);

        /**
         * Creates a new {@code SDL_HapticCustom.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_HapticCustom#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected SDL_HapticCustom getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("Uint16")
        public short type() { return SDL_HapticCustom.ntype(address()); }
        /** @return a {@link SDL_HapticDirection} view of the {@code direction} field. */
        public SDL_HapticDirection direction() { return SDL_HapticCustom.ndirection(address()); }
        /** @return the value of the {@code length} field. */
        @NativeType("Uint32")
        public int length() { return SDL_HapticCustom.nlength(address()); }
        /** @return the value of the {@code delay} field. */
        @NativeType("Uint16")
        public short delay() { return SDL_HapticCustom.ndelay(address()); }
        /** @return the value of the {@code button} field. */
        @NativeType("Uint16")
        public short button() { return SDL_HapticCustom.nbutton(address()); }
        /** @return the value of the {@code interval} field. */
        @NativeType("Uint16")
        public short interval() { return SDL_HapticCustom.ninterval(address()); }
        /** @return the value of the {@code channels} field. */
        @NativeType("Uint8")
        public byte channels() { return SDL_HapticCustom.nchannels(address()); }
        /** @return the value of the {@code period} field. */
        @NativeType("Uint16")
        public short period() { return SDL_HapticCustom.nperiod(address()); }
        /** @return the value of the {@code samples} field. */
        @NativeType("Uint16")
        public short samples() { return SDL_HapticCustom.nsamples(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@code data} field. */
        @NativeType("Uint16 *")
        public ShortBuffer data() { return SDL_HapticCustom.ndata(address()); }
        /** @return the value of the {@code attack_length} field. */
        @NativeType("Uint16")
        public short attack_length() { return SDL_HapticCustom.nattack_length(address()); }
        /** @return the value of the {@code attack_level} field. */
        @NativeType("Uint16")
        public short attack_level() { return SDL_HapticCustom.nattack_level(address()); }
        /** @return the value of the {@code fade_length} field. */
        @NativeType("Uint16")
        public short fade_length() { return SDL_HapticCustom.nfade_length(address()); }
        /** @return the value of the {@code fade_level} field. */
        @NativeType("Uint16")
        public short fade_level() { return SDL_HapticCustom.nfade_level(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_HapticCustom.Buffer type(@NativeType("Uint16") short value) { SDL_HapticCustom.ntype(address(), value); return this; }
        /** Copies the specified {@link SDL_HapticDirection} to the {@code direction} field. */
        public SDL_HapticCustom.Buffer direction(SDL_HapticDirection value) { SDL_HapticCustom.ndirection(address(), value); return this; }
        /** Passes the {@code direction} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_HapticCustom.Buffer direction(java.util.function.Consumer<SDL_HapticDirection> consumer) { consumer.accept(direction()); return this; }
        /** Sets the specified value to the {@code length} field. */
        public SDL_HapticCustom.Buffer length(@NativeType("Uint32") int value) { SDL_HapticCustom.nlength(address(), value); return this; }
        /** Sets the specified value to the {@code delay} field. */
        public SDL_HapticCustom.Buffer delay(@NativeType("Uint16") short value) { SDL_HapticCustom.ndelay(address(), value); return this; }
        /** Sets the specified value to the {@code button} field. */
        public SDL_HapticCustom.Buffer button(@NativeType("Uint16") short value) { SDL_HapticCustom.nbutton(address(), value); return this; }
        /** Sets the specified value to the {@code interval} field. */
        public SDL_HapticCustom.Buffer interval(@NativeType("Uint16") short value) { SDL_HapticCustom.ninterval(address(), value); return this; }
        /** Sets the specified value to the {@code channels} field. */
        public SDL_HapticCustom.Buffer channels(@NativeType("Uint8") byte value) { SDL_HapticCustom.nchannels(address(), value); return this; }
        /** Sets the specified value to the {@code period} field. */
        public SDL_HapticCustom.Buffer period(@NativeType("Uint16") short value) { SDL_HapticCustom.nperiod(address(), value); return this; }
        /** Sets the specified value to the {@code samples} field. */
        public SDL_HapticCustom.Buffer samples(@NativeType("Uint16") short value) { SDL_HapticCustom.nsamples(address(), value); return this; }
        /** Sets the address of the specified {@link ShortBuffer} to the {@code data} field. */
        public SDL_HapticCustom.Buffer data(@NativeType("Uint16 *") ShortBuffer value) { SDL_HapticCustom.ndata(address(), value); return this; }
        /** Sets the specified value to the {@code attack_length} field. */
        public SDL_HapticCustom.Buffer attack_length(@NativeType("Uint16") short value) { SDL_HapticCustom.nattack_length(address(), value); return this; }
        /** Sets the specified value to the {@code attack_level} field. */
        public SDL_HapticCustom.Buffer attack_level(@NativeType("Uint16") short value) { SDL_HapticCustom.nattack_level(address(), value); return this; }
        /** Sets the specified value to the {@code fade_length} field. */
        public SDL_HapticCustom.Buffer fade_length(@NativeType("Uint16") short value) { SDL_HapticCustom.nfade_length(address(), value); return this; }
        /** Sets the specified value to the {@code fade_level} field. */
        public SDL_HapticCustom.Buffer fade_level(@NativeType("Uint16") short value) { SDL_HapticCustom.nfade_level(address(), value); return this; }

    }

}