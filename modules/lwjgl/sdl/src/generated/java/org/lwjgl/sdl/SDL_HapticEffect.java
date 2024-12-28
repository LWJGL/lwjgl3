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
 * union SDL_HapticEffect {
 *     Uint16 type;
 *     {@link SDL_HapticConstant SDL_HapticConstant} constant;
 *     {@link SDL_HapticPeriodic SDL_HapticPeriodic} periodic;
 *     {@link SDL_HapticCondition SDL_HapticCondition} condition;
 *     {@link SDL_HapticRamp SDL_HapticRamp} ramp;
 *     {@link SDL_HapticLeftRight SDL_HapticLeftRight} leftright;
 *     {@link SDL_HapticCustom SDL_HapticCustom} custom;
 * }}</pre>
 */
public class SDL_HapticEffect extends Struct<SDL_HapticEffect> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        CONSTANT,
        PERIODIC,
        CONDITION,
        RAMP,
        LEFTRIGHT,
        CUSTOM;

    static {
        Layout layout = __union(
            __member(2),
            __member(SDL_HapticConstant.SIZEOF, SDL_HapticConstant.ALIGNOF),
            __member(SDL_HapticPeriodic.SIZEOF, SDL_HapticPeriodic.ALIGNOF),
            __member(SDL_HapticCondition.SIZEOF, SDL_HapticCondition.ALIGNOF),
            __member(SDL_HapticRamp.SIZEOF, SDL_HapticRamp.ALIGNOF),
            __member(SDL_HapticLeftRight.SIZEOF, SDL_HapticLeftRight.ALIGNOF),
            __member(SDL_HapticCustom.SIZEOF, SDL_HapticCustom.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        CONSTANT = layout.offsetof(1);
        PERIODIC = layout.offsetof(2);
        CONDITION = layout.offsetof(3);
        RAMP = layout.offsetof(4);
        LEFTRIGHT = layout.offsetof(5);
        CUSTOM = layout.offsetof(6);
    }

    protected SDL_HapticEffect(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_HapticEffect create(long address, @Nullable ByteBuffer container) {
        return new SDL_HapticEffect(address, container);
    }

    /**
     * Creates a {@code SDL_HapticEffect} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_HapticEffect(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("Uint16")
    public short type() { return ntype(address()); }
    /** @return a {@link SDL_HapticConstant} view of the {@code constant} field. */
    public SDL_HapticConstant constant() { return nconstant(address()); }
    /** @return a {@link SDL_HapticPeriodic} view of the {@code periodic} field. */
    public SDL_HapticPeriodic periodic() { return nperiodic(address()); }
    /** @return a {@link SDL_HapticCondition} view of the {@code condition} field. */
    public SDL_HapticCondition condition() { return ncondition(address()); }
    /** @return a {@link SDL_HapticRamp} view of the {@code ramp} field. */
    public SDL_HapticRamp ramp() { return nramp(address()); }
    /** @return a {@link SDL_HapticLeftRight} view of the {@code leftright} field. */
    public SDL_HapticLeftRight leftright() { return nleftright(address()); }
    /** @return a {@link SDL_HapticCustom} view of the {@code custom} field. */
    public SDL_HapticCustom custom() { return ncustom(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_HapticEffect type(@NativeType("Uint16") short value) { ntype(address(), value); return this; }
    /** Copies the specified {@link SDL_HapticConstant} to the {@code constant} field. */
    public SDL_HapticEffect constant(SDL_HapticConstant value) { nconstant(address(), value); return this; }
    /** Passes the {@code constant} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_HapticEffect constant(java.util.function.Consumer<SDL_HapticConstant> consumer) { consumer.accept(constant()); return this; }
    /** Copies the specified {@link SDL_HapticPeriodic} to the {@code periodic} field. */
    public SDL_HapticEffect periodic(SDL_HapticPeriodic value) { nperiodic(address(), value); return this; }
    /** Passes the {@code periodic} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_HapticEffect periodic(java.util.function.Consumer<SDL_HapticPeriodic> consumer) { consumer.accept(periodic()); return this; }
    /** Copies the specified {@link SDL_HapticCondition} to the {@code condition} field. */
    public SDL_HapticEffect condition(SDL_HapticCondition value) { ncondition(address(), value); return this; }
    /** Passes the {@code condition} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_HapticEffect condition(java.util.function.Consumer<SDL_HapticCondition> consumer) { consumer.accept(condition()); return this; }
    /** Copies the specified {@link SDL_HapticRamp} to the {@code ramp} field. */
    public SDL_HapticEffect ramp(SDL_HapticRamp value) { nramp(address(), value); return this; }
    /** Passes the {@code ramp} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_HapticEffect ramp(java.util.function.Consumer<SDL_HapticRamp> consumer) { consumer.accept(ramp()); return this; }
    /** Copies the specified {@link SDL_HapticLeftRight} to the {@code leftright} field. */
    public SDL_HapticEffect leftright(SDL_HapticLeftRight value) { nleftright(address(), value); return this; }
    /** Passes the {@code leftright} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_HapticEffect leftright(java.util.function.Consumer<SDL_HapticLeftRight> consumer) { consumer.accept(leftright()); return this; }
    /** Copies the specified {@link SDL_HapticCustom} to the {@code custom} field. */
    public SDL_HapticEffect custom(SDL_HapticCustom value) { ncustom(address(), value); return this; }
    /** Passes the {@code custom} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_HapticEffect custom(java.util.function.Consumer<SDL_HapticCustom> consumer) { consumer.accept(custom()); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_HapticEffect set(SDL_HapticEffect src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_HapticEffect} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_HapticEffect malloc() {
        return new SDL_HapticEffect(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_HapticEffect} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_HapticEffect calloc() {
        return new SDL_HapticEffect(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_HapticEffect} instance allocated with {@link BufferUtils}. */
    public static SDL_HapticEffect create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_HapticEffect(memAddress(container), container);
    }

    /** Returns a new {@code SDL_HapticEffect} instance for the specified memory address. */
    public static SDL_HapticEffect create(long address) {
        return new SDL_HapticEffect(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_HapticEffect createSafe(long address) {
        return address == NULL ? null : new SDL_HapticEffect(address, null);
    }

    /**
     * Returns a new {@link SDL_HapticEffect.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_HapticEffect.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_HapticEffect.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_HapticEffect.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_HapticEffect.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_HapticEffect.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_HapticEffect.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_HapticEffect.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_HapticEffect.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_HapticEffect} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_HapticEffect malloc(MemoryStack stack) {
        return new SDL_HapticEffect(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_HapticEffect} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_HapticEffect calloc(MemoryStack stack) {
        return new SDL_HapticEffect(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_HapticEffect.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_HapticEffect.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_HapticEffect.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_HapticEffect.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static short ntype(long struct) { return memGetShort(struct + SDL_HapticEffect.TYPE); }
    /** Unsafe version of {@link #constant}. */
    public static SDL_HapticConstant nconstant(long struct) { return SDL_HapticConstant.create(struct + SDL_HapticEffect.CONSTANT); }
    /** Unsafe version of {@link #periodic}. */
    public static SDL_HapticPeriodic nperiodic(long struct) { return SDL_HapticPeriodic.create(struct + SDL_HapticEffect.PERIODIC); }
    /** Unsafe version of {@link #condition}. */
    public static SDL_HapticCondition ncondition(long struct) { return SDL_HapticCondition.create(struct + SDL_HapticEffect.CONDITION); }
    /** Unsafe version of {@link #ramp}. */
    public static SDL_HapticRamp nramp(long struct) { return SDL_HapticRamp.create(struct + SDL_HapticEffect.RAMP); }
    /** Unsafe version of {@link #leftright}. */
    public static SDL_HapticLeftRight nleftright(long struct) { return SDL_HapticLeftRight.create(struct + SDL_HapticEffect.LEFTRIGHT); }
    /** Unsafe version of {@link #custom}. */
    public static SDL_HapticCustom ncustom(long struct) { return SDL_HapticCustom.create(struct + SDL_HapticEffect.CUSTOM); }

    /** Unsafe version of {@link #type(short) type}. */
    public static void ntype(long struct, short value) { memPutShort(struct + SDL_HapticEffect.TYPE, value); }
    /** Unsafe version of {@link #constant(SDL_HapticConstant) constant}. */
    public static void nconstant(long struct, SDL_HapticConstant value) { memCopy(value.address(), struct + SDL_HapticEffect.CONSTANT, SDL_HapticConstant.SIZEOF); }
    /** Unsafe version of {@link #periodic(SDL_HapticPeriodic) periodic}. */
    public static void nperiodic(long struct, SDL_HapticPeriodic value) { memCopy(value.address(), struct + SDL_HapticEffect.PERIODIC, SDL_HapticPeriodic.SIZEOF); }
    /** Unsafe version of {@link #condition(SDL_HapticCondition) condition}. */
    public static void ncondition(long struct, SDL_HapticCondition value) { memCopy(value.address(), struct + SDL_HapticEffect.CONDITION, SDL_HapticCondition.SIZEOF); }
    /** Unsafe version of {@link #ramp(SDL_HapticRamp) ramp}. */
    public static void nramp(long struct, SDL_HapticRamp value) { memCopy(value.address(), struct + SDL_HapticEffect.RAMP, SDL_HapticRamp.SIZEOF); }
    /** Unsafe version of {@link #leftright(SDL_HapticLeftRight) leftright}. */
    public static void nleftright(long struct, SDL_HapticLeftRight value) { memCopy(value.address(), struct + SDL_HapticEffect.LEFTRIGHT, SDL_HapticLeftRight.SIZEOF); }
    /** Unsafe version of {@link #custom(SDL_HapticCustom) custom}. */
    public static void ncustom(long struct, SDL_HapticCustom value) { memCopy(value.address(), struct + SDL_HapticEffect.CUSTOM, SDL_HapticCustom.SIZEOF); }

    // -----------------------------------

    /** An array of {@link SDL_HapticEffect} structs. */
    public static class Buffer extends StructBuffer<SDL_HapticEffect, Buffer> implements NativeResource {

        private static final SDL_HapticEffect ELEMENT_FACTORY = SDL_HapticEffect.create(-1L);

        /**
         * Creates a new {@code SDL_HapticEffect.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_HapticEffect#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_HapticEffect getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("Uint16")
        public short type() { return SDL_HapticEffect.ntype(address()); }
        /** @return a {@link SDL_HapticConstant} view of the {@code constant} field. */
        public SDL_HapticConstant constant() { return SDL_HapticEffect.nconstant(address()); }
        /** @return a {@link SDL_HapticPeriodic} view of the {@code periodic} field. */
        public SDL_HapticPeriodic periodic() { return SDL_HapticEffect.nperiodic(address()); }
        /** @return a {@link SDL_HapticCondition} view of the {@code condition} field. */
        public SDL_HapticCondition condition() { return SDL_HapticEffect.ncondition(address()); }
        /** @return a {@link SDL_HapticRamp} view of the {@code ramp} field. */
        public SDL_HapticRamp ramp() { return SDL_HapticEffect.nramp(address()); }
        /** @return a {@link SDL_HapticLeftRight} view of the {@code leftright} field. */
        public SDL_HapticLeftRight leftright() { return SDL_HapticEffect.nleftright(address()); }
        /** @return a {@link SDL_HapticCustom} view of the {@code custom} field. */
        public SDL_HapticCustom custom() { return SDL_HapticEffect.ncustom(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_HapticEffect.Buffer type(@NativeType("Uint16") short value) { SDL_HapticEffect.ntype(address(), value); return this; }
        /** Copies the specified {@link SDL_HapticConstant} to the {@code constant} field. */
        public SDL_HapticEffect.Buffer constant(SDL_HapticConstant value) { SDL_HapticEffect.nconstant(address(), value); return this; }
        /** Passes the {@code constant} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_HapticEffect.Buffer constant(java.util.function.Consumer<SDL_HapticConstant> consumer) { consumer.accept(constant()); return this; }
        /** Copies the specified {@link SDL_HapticPeriodic} to the {@code periodic} field. */
        public SDL_HapticEffect.Buffer periodic(SDL_HapticPeriodic value) { SDL_HapticEffect.nperiodic(address(), value); return this; }
        /** Passes the {@code periodic} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_HapticEffect.Buffer periodic(java.util.function.Consumer<SDL_HapticPeriodic> consumer) { consumer.accept(periodic()); return this; }
        /** Copies the specified {@link SDL_HapticCondition} to the {@code condition} field. */
        public SDL_HapticEffect.Buffer condition(SDL_HapticCondition value) { SDL_HapticEffect.ncondition(address(), value); return this; }
        /** Passes the {@code condition} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_HapticEffect.Buffer condition(java.util.function.Consumer<SDL_HapticCondition> consumer) { consumer.accept(condition()); return this; }
        /** Copies the specified {@link SDL_HapticRamp} to the {@code ramp} field. */
        public SDL_HapticEffect.Buffer ramp(SDL_HapticRamp value) { SDL_HapticEffect.nramp(address(), value); return this; }
        /** Passes the {@code ramp} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_HapticEffect.Buffer ramp(java.util.function.Consumer<SDL_HapticRamp> consumer) { consumer.accept(ramp()); return this; }
        /** Copies the specified {@link SDL_HapticLeftRight} to the {@code leftright} field. */
        public SDL_HapticEffect.Buffer leftright(SDL_HapticLeftRight value) { SDL_HapticEffect.nleftright(address(), value); return this; }
        /** Passes the {@code leftright} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_HapticEffect.Buffer leftright(java.util.function.Consumer<SDL_HapticLeftRight> consumer) { consumer.accept(leftright()); return this; }
        /** Copies the specified {@link SDL_HapticCustom} to the {@code custom} field. */
        public SDL_HapticEffect.Buffer custom(SDL_HapticCustom value) { SDL_HapticEffect.ncustom(address(), value); return this; }
        /** Passes the {@code custom} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_HapticEffect.Buffer custom(java.util.function.Consumer<SDL_HapticCustom> consumer) { consumer.accept(custom()); return this; }

    }

}