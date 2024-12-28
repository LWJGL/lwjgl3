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
 * struct SDL_HapticCondition {
 *     Uint16 type;
 *     {@link SDL_HapticDirection SDL_HapticDirection} direction;
 *     Uint32 length;
 *     Uint16 delay;
 *     Uint16 button;
 *     Uint16 interval;
 *     Uint16 right_sat[3];
 *     Uint16 left_sat[3];
 *     Sint16 right_coeff[3];
 *     Sint16 left_coeff[3];
 *     Uint16 deadband[3];
 *     Sint16 center[3];
 * }}</pre>
 */
public class SDL_HapticCondition extends Struct<SDL_HapticCondition> implements NativeResource {

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
        RIGHT_SAT,
        LEFT_SAT,
        RIGHT_COEFF,
        LEFT_COEFF,
        DEADBAND,
        CENTER;

    static {
        Layout layout = __struct(
            __member(2),
            __member(SDL_HapticDirection.SIZEOF, SDL_HapticDirection.ALIGNOF),
            __member(4),
            __member(2),
            __member(2),
            __member(2),
            __array(2, 3),
            __array(2, 3),
            __array(2, 3),
            __array(2, 3),
            __array(2, 3),
            __array(2, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        DIRECTION = layout.offsetof(1);
        LENGTH = layout.offsetof(2);
        DELAY = layout.offsetof(3);
        BUTTON = layout.offsetof(4);
        INTERVAL = layout.offsetof(5);
        RIGHT_SAT = layout.offsetof(6);
        LEFT_SAT = layout.offsetof(7);
        RIGHT_COEFF = layout.offsetof(8);
        LEFT_COEFF = layout.offsetof(9);
        DEADBAND = layout.offsetof(10);
        CENTER = layout.offsetof(11);
    }

    protected SDL_HapticCondition(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_HapticCondition create(long address, @Nullable ByteBuffer container) {
        return new SDL_HapticCondition(address, container);
    }

    /**
     * Creates a {@code SDL_HapticCondition} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_HapticCondition(ByteBuffer container) {
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
    /** @return a {@link ShortBuffer} view of the {@code right_sat} field. */
    @NativeType("Uint16[3]")
    public ShortBuffer right_sat() { return nright_sat(address()); }
    /** @return the value at the specified index of the {@code right_sat} field. */
    @NativeType("Uint16")
    public short right_sat(int index) { return nright_sat(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code left_sat} field. */
    @NativeType("Uint16[3]")
    public ShortBuffer left_sat() { return nleft_sat(address()); }
    /** @return the value at the specified index of the {@code left_sat} field. */
    @NativeType("Uint16")
    public short left_sat(int index) { return nleft_sat(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code right_coeff} field. */
    @NativeType("Sint16[3]")
    public ShortBuffer right_coeff() { return nright_coeff(address()); }
    /** @return the value at the specified index of the {@code right_coeff} field. */
    @NativeType("Sint16")
    public short right_coeff(int index) { return nright_coeff(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code left_coeff} field. */
    @NativeType("Sint16[3]")
    public ShortBuffer left_coeff() { return nleft_coeff(address()); }
    /** @return the value at the specified index of the {@code left_coeff} field. */
    @NativeType("Sint16")
    public short left_coeff(int index) { return nleft_coeff(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code deadband} field. */
    @NativeType("Uint16[3]")
    public ShortBuffer deadband() { return ndeadband(address()); }
    /** @return the value at the specified index of the {@code deadband} field. */
    @NativeType("Uint16")
    public short deadband(int index) { return ndeadband(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code center} field. */
    @NativeType("Sint16[3]")
    public ShortBuffer center() { return ncenter(address()); }
    /** @return the value at the specified index of the {@code center} field. */
    @NativeType("Sint16")
    public short center(int index) { return ncenter(address(), index); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_HapticCondition type(@NativeType("Uint16") short value) { ntype(address(), value); return this; }
    /** Copies the specified {@link SDL_HapticDirection} to the {@code direction} field. */
    public SDL_HapticCondition direction(SDL_HapticDirection value) { ndirection(address(), value); return this; }
    /** Passes the {@code direction} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_HapticCondition direction(java.util.function.Consumer<SDL_HapticDirection> consumer) { consumer.accept(direction()); return this; }
    /** Sets the specified value to the {@code length} field. */
    public SDL_HapticCondition length(@NativeType("Uint32") int value) { nlength(address(), value); return this; }
    /** Sets the specified value to the {@code delay} field. */
    public SDL_HapticCondition delay(@NativeType("Uint16") short value) { ndelay(address(), value); return this; }
    /** Sets the specified value to the {@code button} field. */
    public SDL_HapticCondition button(@NativeType("Uint16") short value) { nbutton(address(), value); return this; }
    /** Sets the specified value to the {@code interval} field. */
    public SDL_HapticCondition interval(@NativeType("Uint16") short value) { ninterval(address(), value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code right_sat} field. */
    public SDL_HapticCondition right_sat(@NativeType("Uint16[3]") ShortBuffer value) { nright_sat(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code right_sat} field. */
    public SDL_HapticCondition right_sat(int index, @NativeType("Uint16") short value) { nright_sat(address(), index, value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code left_sat} field. */
    public SDL_HapticCondition left_sat(@NativeType("Uint16[3]") ShortBuffer value) { nleft_sat(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code left_sat} field. */
    public SDL_HapticCondition left_sat(int index, @NativeType("Uint16") short value) { nleft_sat(address(), index, value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code right_coeff} field. */
    public SDL_HapticCondition right_coeff(@NativeType("Sint16[3]") ShortBuffer value) { nright_coeff(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code right_coeff} field. */
    public SDL_HapticCondition right_coeff(int index, @NativeType("Sint16") short value) { nright_coeff(address(), index, value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code left_coeff} field. */
    public SDL_HapticCondition left_coeff(@NativeType("Sint16[3]") ShortBuffer value) { nleft_coeff(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code left_coeff} field. */
    public SDL_HapticCondition left_coeff(int index, @NativeType("Sint16") short value) { nleft_coeff(address(), index, value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code deadband} field. */
    public SDL_HapticCondition deadband(@NativeType("Uint16[3]") ShortBuffer value) { ndeadband(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code deadband} field. */
    public SDL_HapticCondition deadband(int index, @NativeType("Uint16") short value) { ndeadband(address(), index, value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code center} field. */
    public SDL_HapticCondition center(@NativeType("Sint16[3]") ShortBuffer value) { ncenter(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code center} field. */
    public SDL_HapticCondition center(int index, @NativeType("Sint16") short value) { ncenter(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_HapticCondition set(
        short type,
        SDL_HapticDirection direction,
        int length,
        short delay,
        short button,
        short interval,
        ShortBuffer right_sat,
        ShortBuffer left_sat,
        ShortBuffer right_coeff,
        ShortBuffer left_coeff,
        ShortBuffer deadband,
        ShortBuffer center
    ) {
        type(type);
        direction(direction);
        length(length);
        delay(delay);
        button(button);
        interval(interval);
        right_sat(right_sat);
        left_sat(left_sat);
        right_coeff(right_coeff);
        left_coeff(left_coeff);
        deadband(deadband);
        center(center);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_HapticCondition set(SDL_HapticCondition src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_HapticCondition} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_HapticCondition malloc() {
        return new SDL_HapticCondition(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_HapticCondition} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_HapticCondition calloc() {
        return new SDL_HapticCondition(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_HapticCondition} instance allocated with {@link BufferUtils}. */
    public static SDL_HapticCondition create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_HapticCondition(memAddress(container), container);
    }

    /** Returns a new {@code SDL_HapticCondition} instance for the specified memory address. */
    public static SDL_HapticCondition create(long address) {
        return new SDL_HapticCondition(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_HapticCondition createSafe(long address) {
        return address == NULL ? null : new SDL_HapticCondition(address, null);
    }

    /**
     * Returns a new {@link SDL_HapticCondition.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_HapticCondition.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_HapticCondition.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_HapticCondition.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_HapticCondition.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_HapticCondition.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_HapticCondition.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_HapticCondition.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_HapticCondition.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_HapticCondition} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_HapticCondition malloc(MemoryStack stack) {
        return new SDL_HapticCondition(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_HapticCondition} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_HapticCondition calloc(MemoryStack stack) {
        return new SDL_HapticCondition(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_HapticCondition.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_HapticCondition.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_HapticCondition.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_HapticCondition.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static short ntype(long struct) { return memGetShort(struct + SDL_HapticCondition.TYPE); }
    /** Unsafe version of {@link #direction}. */
    public static SDL_HapticDirection ndirection(long struct) { return SDL_HapticDirection.create(struct + SDL_HapticCondition.DIRECTION); }
    /** Unsafe version of {@link #length}. */
    public static int nlength(long struct) { return memGetInt(struct + SDL_HapticCondition.LENGTH); }
    /** Unsafe version of {@link #delay}. */
    public static short ndelay(long struct) { return memGetShort(struct + SDL_HapticCondition.DELAY); }
    /** Unsafe version of {@link #button}. */
    public static short nbutton(long struct) { return memGetShort(struct + SDL_HapticCondition.BUTTON); }
    /** Unsafe version of {@link #interval}. */
    public static short ninterval(long struct) { return memGetShort(struct + SDL_HapticCondition.INTERVAL); }
    /** Unsafe version of {@link #right_sat}. */
    public static ShortBuffer nright_sat(long struct) { return memShortBuffer(struct + SDL_HapticCondition.RIGHT_SAT, 3); }
    /** Unsafe version of {@link #right_sat(int) right_sat}. */
    public static short nright_sat(long struct, int index) {
        return memGetShort(struct + SDL_HapticCondition.RIGHT_SAT + check(index, 3) * 2);
    }
    /** Unsafe version of {@link #left_sat}. */
    public static ShortBuffer nleft_sat(long struct) { return memShortBuffer(struct + SDL_HapticCondition.LEFT_SAT, 3); }
    /** Unsafe version of {@link #left_sat(int) left_sat}. */
    public static short nleft_sat(long struct, int index) {
        return memGetShort(struct + SDL_HapticCondition.LEFT_SAT + check(index, 3) * 2);
    }
    /** Unsafe version of {@link #right_coeff}. */
    public static ShortBuffer nright_coeff(long struct) { return memShortBuffer(struct + SDL_HapticCondition.RIGHT_COEFF, 3); }
    /** Unsafe version of {@link #right_coeff(int) right_coeff}. */
    public static short nright_coeff(long struct, int index) {
        return memGetShort(struct + SDL_HapticCondition.RIGHT_COEFF + check(index, 3) * 2);
    }
    /** Unsafe version of {@link #left_coeff}. */
    public static ShortBuffer nleft_coeff(long struct) { return memShortBuffer(struct + SDL_HapticCondition.LEFT_COEFF, 3); }
    /** Unsafe version of {@link #left_coeff(int) left_coeff}. */
    public static short nleft_coeff(long struct, int index) {
        return memGetShort(struct + SDL_HapticCondition.LEFT_COEFF + check(index, 3) * 2);
    }
    /** Unsafe version of {@link #deadband}. */
    public static ShortBuffer ndeadband(long struct) { return memShortBuffer(struct + SDL_HapticCondition.DEADBAND, 3); }
    /** Unsafe version of {@link #deadband(int) deadband}. */
    public static short ndeadband(long struct, int index) {
        return memGetShort(struct + SDL_HapticCondition.DEADBAND + check(index, 3) * 2);
    }
    /** Unsafe version of {@link #center}. */
    public static ShortBuffer ncenter(long struct) { return memShortBuffer(struct + SDL_HapticCondition.CENTER, 3); }
    /** Unsafe version of {@link #center(int) center}. */
    public static short ncenter(long struct, int index) {
        return memGetShort(struct + SDL_HapticCondition.CENTER + check(index, 3) * 2);
    }

    /** Unsafe version of {@link #type(short) type}. */
    public static void ntype(long struct, short value) { memPutShort(struct + SDL_HapticCondition.TYPE, value); }
    /** Unsafe version of {@link #direction(SDL_HapticDirection) direction}. */
    public static void ndirection(long struct, SDL_HapticDirection value) { memCopy(value.address(), struct + SDL_HapticCondition.DIRECTION, SDL_HapticDirection.SIZEOF); }
    /** Unsafe version of {@link #length(int) length}. */
    public static void nlength(long struct, int value) { memPutInt(struct + SDL_HapticCondition.LENGTH, value); }
    /** Unsafe version of {@link #delay(short) delay}. */
    public static void ndelay(long struct, short value) { memPutShort(struct + SDL_HapticCondition.DELAY, value); }
    /** Unsafe version of {@link #button(short) button}. */
    public static void nbutton(long struct, short value) { memPutShort(struct + SDL_HapticCondition.BUTTON, value); }
    /** Unsafe version of {@link #interval(short) interval}. */
    public static void ninterval(long struct, short value) { memPutShort(struct + SDL_HapticCondition.INTERVAL, value); }
    /** Unsafe version of {@link #right_sat(ShortBuffer) right_sat}. */
    public static void nright_sat(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + SDL_HapticCondition.RIGHT_SAT, value.remaining() * 2);
    }
    /** Unsafe version of {@link #right_sat(int, short) right_sat}. */
    public static void nright_sat(long struct, int index, short value) {
        memPutShort(struct + SDL_HapticCondition.RIGHT_SAT + check(index, 3) * 2, value);
    }
    /** Unsafe version of {@link #left_sat(ShortBuffer) left_sat}. */
    public static void nleft_sat(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + SDL_HapticCondition.LEFT_SAT, value.remaining() * 2);
    }
    /** Unsafe version of {@link #left_sat(int, short) left_sat}. */
    public static void nleft_sat(long struct, int index, short value) {
        memPutShort(struct + SDL_HapticCondition.LEFT_SAT + check(index, 3) * 2, value);
    }
    /** Unsafe version of {@link #right_coeff(ShortBuffer) right_coeff}. */
    public static void nright_coeff(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + SDL_HapticCondition.RIGHT_COEFF, value.remaining() * 2);
    }
    /** Unsafe version of {@link #right_coeff(int, short) right_coeff}. */
    public static void nright_coeff(long struct, int index, short value) {
        memPutShort(struct + SDL_HapticCondition.RIGHT_COEFF + check(index, 3) * 2, value);
    }
    /** Unsafe version of {@link #left_coeff(ShortBuffer) left_coeff}. */
    public static void nleft_coeff(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + SDL_HapticCondition.LEFT_COEFF, value.remaining() * 2);
    }
    /** Unsafe version of {@link #left_coeff(int, short) left_coeff}. */
    public static void nleft_coeff(long struct, int index, short value) {
        memPutShort(struct + SDL_HapticCondition.LEFT_COEFF + check(index, 3) * 2, value);
    }
    /** Unsafe version of {@link #deadband(ShortBuffer) deadband}. */
    public static void ndeadband(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + SDL_HapticCondition.DEADBAND, value.remaining() * 2);
    }
    /** Unsafe version of {@link #deadband(int, short) deadband}. */
    public static void ndeadband(long struct, int index, short value) {
        memPutShort(struct + SDL_HapticCondition.DEADBAND + check(index, 3) * 2, value);
    }
    /** Unsafe version of {@link #center(ShortBuffer) center}. */
    public static void ncenter(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + SDL_HapticCondition.CENTER, value.remaining() * 2);
    }
    /** Unsafe version of {@link #center(int, short) center}. */
    public static void ncenter(long struct, int index, short value) {
        memPutShort(struct + SDL_HapticCondition.CENTER + check(index, 3) * 2, value);
    }

    // -----------------------------------

    /** An array of {@link SDL_HapticCondition} structs. */
    public static class Buffer extends StructBuffer<SDL_HapticCondition, Buffer> implements NativeResource {

        private static final SDL_HapticCondition ELEMENT_FACTORY = SDL_HapticCondition.create(-1L);

        /**
         * Creates a new {@code SDL_HapticCondition.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_HapticCondition#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_HapticCondition getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("Uint16")
        public short type() { return SDL_HapticCondition.ntype(address()); }
        /** @return a {@link SDL_HapticDirection} view of the {@code direction} field. */
        public SDL_HapticDirection direction() { return SDL_HapticCondition.ndirection(address()); }
        /** @return the value of the {@code length} field. */
        @NativeType("Uint32")
        public int length() { return SDL_HapticCondition.nlength(address()); }
        /** @return the value of the {@code delay} field. */
        @NativeType("Uint16")
        public short delay() { return SDL_HapticCondition.ndelay(address()); }
        /** @return the value of the {@code button} field. */
        @NativeType("Uint16")
        public short button() { return SDL_HapticCondition.nbutton(address()); }
        /** @return the value of the {@code interval} field. */
        @NativeType("Uint16")
        public short interval() { return SDL_HapticCondition.ninterval(address()); }
        /** @return a {@link ShortBuffer} view of the {@code right_sat} field. */
        @NativeType("Uint16[3]")
        public ShortBuffer right_sat() { return SDL_HapticCondition.nright_sat(address()); }
        /** @return the value at the specified index of the {@code right_sat} field. */
        @NativeType("Uint16")
        public short right_sat(int index) { return SDL_HapticCondition.nright_sat(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code left_sat} field. */
        @NativeType("Uint16[3]")
        public ShortBuffer left_sat() { return SDL_HapticCondition.nleft_sat(address()); }
        /** @return the value at the specified index of the {@code left_sat} field. */
        @NativeType("Uint16")
        public short left_sat(int index) { return SDL_HapticCondition.nleft_sat(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code right_coeff} field. */
        @NativeType("Sint16[3]")
        public ShortBuffer right_coeff() { return SDL_HapticCondition.nright_coeff(address()); }
        /** @return the value at the specified index of the {@code right_coeff} field. */
        @NativeType("Sint16")
        public short right_coeff(int index) { return SDL_HapticCondition.nright_coeff(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code left_coeff} field. */
        @NativeType("Sint16[3]")
        public ShortBuffer left_coeff() { return SDL_HapticCondition.nleft_coeff(address()); }
        /** @return the value at the specified index of the {@code left_coeff} field. */
        @NativeType("Sint16")
        public short left_coeff(int index) { return SDL_HapticCondition.nleft_coeff(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code deadband} field. */
        @NativeType("Uint16[3]")
        public ShortBuffer deadband() { return SDL_HapticCondition.ndeadband(address()); }
        /** @return the value at the specified index of the {@code deadband} field. */
        @NativeType("Uint16")
        public short deadband(int index) { return SDL_HapticCondition.ndeadband(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code center} field. */
        @NativeType("Sint16[3]")
        public ShortBuffer center() { return SDL_HapticCondition.ncenter(address()); }
        /** @return the value at the specified index of the {@code center} field. */
        @NativeType("Sint16")
        public short center(int index) { return SDL_HapticCondition.ncenter(address(), index); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_HapticCondition.Buffer type(@NativeType("Uint16") short value) { SDL_HapticCondition.ntype(address(), value); return this; }
        /** Copies the specified {@link SDL_HapticDirection} to the {@code direction} field. */
        public SDL_HapticCondition.Buffer direction(SDL_HapticDirection value) { SDL_HapticCondition.ndirection(address(), value); return this; }
        /** Passes the {@code direction} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_HapticCondition.Buffer direction(java.util.function.Consumer<SDL_HapticDirection> consumer) { consumer.accept(direction()); return this; }
        /** Sets the specified value to the {@code length} field. */
        public SDL_HapticCondition.Buffer length(@NativeType("Uint32") int value) { SDL_HapticCondition.nlength(address(), value); return this; }
        /** Sets the specified value to the {@code delay} field. */
        public SDL_HapticCondition.Buffer delay(@NativeType("Uint16") short value) { SDL_HapticCondition.ndelay(address(), value); return this; }
        /** Sets the specified value to the {@code button} field. */
        public SDL_HapticCondition.Buffer button(@NativeType("Uint16") short value) { SDL_HapticCondition.nbutton(address(), value); return this; }
        /** Sets the specified value to the {@code interval} field. */
        public SDL_HapticCondition.Buffer interval(@NativeType("Uint16") short value) { SDL_HapticCondition.ninterval(address(), value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code right_sat} field. */
        public SDL_HapticCondition.Buffer right_sat(@NativeType("Uint16[3]") ShortBuffer value) { SDL_HapticCondition.nright_sat(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code right_sat} field. */
        public SDL_HapticCondition.Buffer right_sat(int index, @NativeType("Uint16") short value) { SDL_HapticCondition.nright_sat(address(), index, value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code left_sat} field. */
        public SDL_HapticCondition.Buffer left_sat(@NativeType("Uint16[3]") ShortBuffer value) { SDL_HapticCondition.nleft_sat(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code left_sat} field. */
        public SDL_HapticCondition.Buffer left_sat(int index, @NativeType("Uint16") short value) { SDL_HapticCondition.nleft_sat(address(), index, value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code right_coeff} field. */
        public SDL_HapticCondition.Buffer right_coeff(@NativeType("Sint16[3]") ShortBuffer value) { SDL_HapticCondition.nright_coeff(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code right_coeff} field. */
        public SDL_HapticCondition.Buffer right_coeff(int index, @NativeType("Sint16") short value) { SDL_HapticCondition.nright_coeff(address(), index, value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code left_coeff} field. */
        public SDL_HapticCondition.Buffer left_coeff(@NativeType("Sint16[3]") ShortBuffer value) { SDL_HapticCondition.nleft_coeff(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code left_coeff} field. */
        public SDL_HapticCondition.Buffer left_coeff(int index, @NativeType("Sint16") short value) { SDL_HapticCondition.nleft_coeff(address(), index, value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code deadband} field. */
        public SDL_HapticCondition.Buffer deadband(@NativeType("Uint16[3]") ShortBuffer value) { SDL_HapticCondition.ndeadband(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code deadband} field. */
        public SDL_HapticCondition.Buffer deadband(int index, @NativeType("Uint16") short value) { SDL_HapticCondition.ndeadband(address(), index, value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code center} field. */
        public SDL_HapticCondition.Buffer center(@NativeType("Sint16[3]") ShortBuffer value) { SDL_HapticCondition.ncenter(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code center} field. */
        public SDL_HapticCondition.Buffer center(int index, @NativeType("Sint16") short value) { SDL_HapticCondition.ncenter(address(), index, value); return this; }

    }

}