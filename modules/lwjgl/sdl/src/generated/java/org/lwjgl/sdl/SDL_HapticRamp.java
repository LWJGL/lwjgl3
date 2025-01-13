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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_HapticRamp {
 *     Uint16 type;
 *     {@link SDL_HapticDirection SDL_HapticDirection} direction;
 *     Uint32 length;
 *     Uint16 delay;
 *     Uint16 button;
 *     Uint16 interval;
 *     Sint16 start;
 *     Sint16 end;
 *     Uint16 attack_length;
 *     Uint16 attack_level;
 *     Uint16 fade_length;
 *     Uint16 fade_level;
 * }}</pre>
 */
public class SDL_HapticRamp extends Struct<SDL_HapticRamp> implements NativeResource {

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
        START,
        END,
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
            __member(2),
            __member(2),
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
        START = layout.offsetof(6);
        END = layout.offsetof(7);
        ATTACK_LENGTH = layout.offsetof(8);
        ATTACK_LEVEL = layout.offsetof(9);
        FADE_LENGTH = layout.offsetof(10);
        FADE_LEVEL = layout.offsetof(11);
    }

    protected SDL_HapticRamp(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_HapticRamp create(long address, @Nullable ByteBuffer container) {
        return new SDL_HapticRamp(address, container);
    }

    /**
     * Creates a {@code SDL_HapticRamp} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_HapticRamp(ByteBuffer container) {
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
    /** @return the value of the {@code start} field. */
    @NativeType("Sint16")
    public short start() { return nstart(address()); }
    /** @return the value of the {@code end} field. */
    @NativeType("Sint16")
    public short end() { return nend(address()); }
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
    public SDL_HapticRamp type(@NativeType("Uint16") short value) { ntype(address(), value); return this; }
    /** Copies the specified {@link SDL_HapticDirection} to the {@code direction} field. */
    public SDL_HapticRamp direction(SDL_HapticDirection value) { ndirection(address(), value); return this; }
    /** Passes the {@code direction} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_HapticRamp direction(java.util.function.Consumer<SDL_HapticDirection> consumer) { consumer.accept(direction()); return this; }
    /** Sets the specified value to the {@code length} field. */
    public SDL_HapticRamp length(@NativeType("Uint32") int value) { nlength(address(), value); return this; }
    /** Sets the specified value to the {@code delay} field. */
    public SDL_HapticRamp delay(@NativeType("Uint16") short value) { ndelay(address(), value); return this; }
    /** Sets the specified value to the {@code button} field. */
    public SDL_HapticRamp button(@NativeType("Uint16") short value) { nbutton(address(), value); return this; }
    /** Sets the specified value to the {@code interval} field. */
    public SDL_HapticRamp interval(@NativeType("Uint16") short value) { ninterval(address(), value); return this; }
    /** Sets the specified value to the {@code start} field. */
    public SDL_HapticRamp start(@NativeType("Sint16") short value) { nstart(address(), value); return this; }
    /** Sets the specified value to the {@code end} field. */
    public SDL_HapticRamp end(@NativeType("Sint16") short value) { nend(address(), value); return this; }
    /** Sets the specified value to the {@code attack_length} field. */
    public SDL_HapticRamp attack_length(@NativeType("Uint16") short value) { nattack_length(address(), value); return this; }
    /** Sets the specified value to the {@code attack_level} field. */
    public SDL_HapticRamp attack_level(@NativeType("Uint16") short value) { nattack_level(address(), value); return this; }
    /** Sets the specified value to the {@code fade_length} field. */
    public SDL_HapticRamp fade_length(@NativeType("Uint16") short value) { nfade_length(address(), value); return this; }
    /** Sets the specified value to the {@code fade_level} field. */
    public SDL_HapticRamp fade_level(@NativeType("Uint16") short value) { nfade_level(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_HapticRamp set(
        short type,
        SDL_HapticDirection direction,
        int length,
        short delay,
        short button,
        short interval,
        short start,
        short end,
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
        start(start);
        end(end);
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
    public SDL_HapticRamp set(SDL_HapticRamp src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_HapticRamp} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_HapticRamp malloc() {
        return new SDL_HapticRamp(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_HapticRamp} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_HapticRamp calloc() {
        return new SDL_HapticRamp(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_HapticRamp} instance allocated with {@link BufferUtils}. */
    public static SDL_HapticRamp create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_HapticRamp(memAddress(container), container);
    }

    /** Returns a new {@code SDL_HapticRamp} instance for the specified memory address. */
    public static SDL_HapticRamp create(long address) {
        return new SDL_HapticRamp(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_HapticRamp createSafe(long address) {
        return address == NULL ? null : new SDL_HapticRamp(address, null);
    }

    /**
     * Returns a new {@link SDL_HapticRamp.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_HapticRamp.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_HapticRamp.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_HapticRamp.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_HapticRamp.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_HapticRamp.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_HapticRamp.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_HapticRamp.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_HapticRamp.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_HapticRamp} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_HapticRamp malloc(MemoryStack stack) {
        return new SDL_HapticRamp(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_HapticRamp} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_HapticRamp calloc(MemoryStack stack) {
        return new SDL_HapticRamp(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_HapticRamp.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_HapticRamp.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_HapticRamp.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_HapticRamp.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static short ntype(long struct) { return memGetShort(struct + SDL_HapticRamp.TYPE); }
    /** Unsafe version of {@link #direction}. */
    public static SDL_HapticDirection ndirection(long struct) { return SDL_HapticDirection.create(struct + SDL_HapticRamp.DIRECTION); }
    /** Unsafe version of {@link #length}. */
    public static int nlength(long struct) { return memGetInt(struct + SDL_HapticRamp.LENGTH); }
    /** Unsafe version of {@link #delay}. */
    public static short ndelay(long struct) { return memGetShort(struct + SDL_HapticRamp.DELAY); }
    /** Unsafe version of {@link #button}. */
    public static short nbutton(long struct) { return memGetShort(struct + SDL_HapticRamp.BUTTON); }
    /** Unsafe version of {@link #interval}. */
    public static short ninterval(long struct) { return memGetShort(struct + SDL_HapticRamp.INTERVAL); }
    /** Unsafe version of {@link #start}. */
    public static short nstart(long struct) { return memGetShort(struct + SDL_HapticRamp.START); }
    /** Unsafe version of {@link #end}. */
    public static short nend(long struct) { return memGetShort(struct + SDL_HapticRamp.END); }
    /** Unsafe version of {@link #attack_length}. */
    public static short nattack_length(long struct) { return memGetShort(struct + SDL_HapticRamp.ATTACK_LENGTH); }
    /** Unsafe version of {@link #attack_level}. */
    public static short nattack_level(long struct) { return memGetShort(struct + SDL_HapticRamp.ATTACK_LEVEL); }
    /** Unsafe version of {@link #fade_length}. */
    public static short nfade_length(long struct) { return memGetShort(struct + SDL_HapticRamp.FADE_LENGTH); }
    /** Unsafe version of {@link #fade_level}. */
    public static short nfade_level(long struct) { return memGetShort(struct + SDL_HapticRamp.FADE_LEVEL); }

    /** Unsafe version of {@link #type(short) type}. */
    public static void ntype(long struct, short value) { memPutShort(struct + SDL_HapticRamp.TYPE, value); }
    /** Unsafe version of {@link #direction(SDL_HapticDirection) direction}. */
    public static void ndirection(long struct, SDL_HapticDirection value) { memCopy(value.address(), struct + SDL_HapticRamp.DIRECTION, SDL_HapticDirection.SIZEOF); }
    /** Unsafe version of {@link #length(int) length}. */
    public static void nlength(long struct, int value) { memPutInt(struct + SDL_HapticRamp.LENGTH, value); }
    /** Unsafe version of {@link #delay(short) delay}. */
    public static void ndelay(long struct, short value) { memPutShort(struct + SDL_HapticRamp.DELAY, value); }
    /** Unsafe version of {@link #button(short) button}. */
    public static void nbutton(long struct, short value) { memPutShort(struct + SDL_HapticRamp.BUTTON, value); }
    /** Unsafe version of {@link #interval(short) interval}. */
    public static void ninterval(long struct, short value) { memPutShort(struct + SDL_HapticRamp.INTERVAL, value); }
    /** Unsafe version of {@link #start(short) start}. */
    public static void nstart(long struct, short value) { memPutShort(struct + SDL_HapticRamp.START, value); }
    /** Unsafe version of {@link #end(short) end}. */
    public static void nend(long struct, short value) { memPutShort(struct + SDL_HapticRamp.END, value); }
    /** Unsafe version of {@link #attack_length(short) attack_length}. */
    public static void nattack_length(long struct, short value) { memPutShort(struct + SDL_HapticRamp.ATTACK_LENGTH, value); }
    /** Unsafe version of {@link #attack_level(short) attack_level}. */
    public static void nattack_level(long struct, short value) { memPutShort(struct + SDL_HapticRamp.ATTACK_LEVEL, value); }
    /** Unsafe version of {@link #fade_length(short) fade_length}. */
    public static void nfade_length(long struct, short value) { memPutShort(struct + SDL_HapticRamp.FADE_LENGTH, value); }
    /** Unsafe version of {@link #fade_level(short) fade_level}. */
    public static void nfade_level(long struct, short value) { memPutShort(struct + SDL_HapticRamp.FADE_LEVEL, value); }

    // -----------------------------------

    /** An array of {@link SDL_HapticRamp} structs. */
    public static class Buffer extends StructBuffer<SDL_HapticRamp, Buffer> implements NativeResource {

        private static final SDL_HapticRamp ELEMENT_FACTORY = SDL_HapticRamp.create(-1L);

        /**
         * Creates a new {@code SDL_HapticRamp.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_HapticRamp#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_HapticRamp getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("Uint16")
        public short type() { return SDL_HapticRamp.ntype(address()); }
        /** @return a {@link SDL_HapticDirection} view of the {@code direction} field. */
        public SDL_HapticDirection direction() { return SDL_HapticRamp.ndirection(address()); }
        /** @return the value of the {@code length} field. */
        @NativeType("Uint32")
        public int length() { return SDL_HapticRamp.nlength(address()); }
        /** @return the value of the {@code delay} field. */
        @NativeType("Uint16")
        public short delay() { return SDL_HapticRamp.ndelay(address()); }
        /** @return the value of the {@code button} field. */
        @NativeType("Uint16")
        public short button() { return SDL_HapticRamp.nbutton(address()); }
        /** @return the value of the {@code interval} field. */
        @NativeType("Uint16")
        public short interval() { return SDL_HapticRamp.ninterval(address()); }
        /** @return the value of the {@code start} field. */
        @NativeType("Sint16")
        public short start() { return SDL_HapticRamp.nstart(address()); }
        /** @return the value of the {@code end} field. */
        @NativeType("Sint16")
        public short end() { return SDL_HapticRamp.nend(address()); }
        /** @return the value of the {@code attack_length} field. */
        @NativeType("Uint16")
        public short attack_length() { return SDL_HapticRamp.nattack_length(address()); }
        /** @return the value of the {@code attack_level} field. */
        @NativeType("Uint16")
        public short attack_level() { return SDL_HapticRamp.nattack_level(address()); }
        /** @return the value of the {@code fade_length} field. */
        @NativeType("Uint16")
        public short fade_length() { return SDL_HapticRamp.nfade_length(address()); }
        /** @return the value of the {@code fade_level} field. */
        @NativeType("Uint16")
        public short fade_level() { return SDL_HapticRamp.nfade_level(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_HapticRamp.Buffer type(@NativeType("Uint16") short value) { SDL_HapticRamp.ntype(address(), value); return this; }
        /** Copies the specified {@link SDL_HapticDirection} to the {@code direction} field. */
        public SDL_HapticRamp.Buffer direction(SDL_HapticDirection value) { SDL_HapticRamp.ndirection(address(), value); return this; }
        /** Passes the {@code direction} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_HapticRamp.Buffer direction(java.util.function.Consumer<SDL_HapticDirection> consumer) { consumer.accept(direction()); return this; }
        /** Sets the specified value to the {@code length} field. */
        public SDL_HapticRamp.Buffer length(@NativeType("Uint32") int value) { SDL_HapticRamp.nlength(address(), value); return this; }
        /** Sets the specified value to the {@code delay} field. */
        public SDL_HapticRamp.Buffer delay(@NativeType("Uint16") short value) { SDL_HapticRamp.ndelay(address(), value); return this; }
        /** Sets the specified value to the {@code button} field. */
        public SDL_HapticRamp.Buffer button(@NativeType("Uint16") short value) { SDL_HapticRamp.nbutton(address(), value); return this; }
        /** Sets the specified value to the {@code interval} field. */
        public SDL_HapticRamp.Buffer interval(@NativeType("Uint16") short value) { SDL_HapticRamp.ninterval(address(), value); return this; }
        /** Sets the specified value to the {@code start} field. */
        public SDL_HapticRamp.Buffer start(@NativeType("Sint16") short value) { SDL_HapticRamp.nstart(address(), value); return this; }
        /** Sets the specified value to the {@code end} field. */
        public SDL_HapticRamp.Buffer end(@NativeType("Sint16") short value) { SDL_HapticRamp.nend(address(), value); return this; }
        /** Sets the specified value to the {@code attack_length} field. */
        public SDL_HapticRamp.Buffer attack_length(@NativeType("Uint16") short value) { SDL_HapticRamp.nattack_length(address(), value); return this; }
        /** Sets the specified value to the {@code attack_level} field. */
        public SDL_HapticRamp.Buffer attack_level(@NativeType("Uint16") short value) { SDL_HapticRamp.nattack_level(address(), value); return this; }
        /** Sets the specified value to the {@code fade_length} field. */
        public SDL_HapticRamp.Buffer fade_length(@NativeType("Uint16") short value) { SDL_HapticRamp.nfade_length(address(), value); return this; }
        /** Sets the specified value to the {@code fade_level} field. */
        public SDL_HapticRamp.Buffer fade_level(@NativeType("Uint16") short value) { SDL_HapticRamp.nfade_level(address(), value); return this; }

    }

}