/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.msdfgen;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct msdf_transform {
 *     {@link MSDFGenVector2 struct msdf_vector2} scale;
 *     {@link MSDFGenVector2 struct msdf_vector2} translation;
 *     {@link MSDFGenRange struct msdf_range} distance_mapping;
 * }}</pre>
 */
@NativeType("struct msdf_transform")
public class MSDFGenTransform extends Struct<MSDFGenTransform> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SCALE,
        TRANSLATION,
        DISTANCE_MAPPING;

    static {
        Layout layout = __struct(
            __member(MSDFGenVector2.SIZEOF, MSDFGenVector2.ALIGNOF),
            __member(MSDFGenVector2.SIZEOF, MSDFGenVector2.ALIGNOF),
            __member(MSDFGenRange.SIZEOF, MSDFGenRange.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SCALE = layout.offsetof(0);
        TRANSLATION = layout.offsetof(1);
        DISTANCE_MAPPING = layout.offsetof(2);
    }

    protected MSDFGenTransform(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MSDFGenTransform create(long address, @Nullable ByteBuffer container) {
        return new MSDFGenTransform(address, container);
    }

    /**
     * Creates a {@code MSDFGenTransform} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MSDFGenTransform(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link MSDFGenVector2} view of the {@code scale} field. */
    @NativeType("struct msdf_vector2")
    public MSDFGenVector2 scale() { return nscale(address()); }
    /** @return a {@link MSDFGenVector2} view of the {@code translation} field. */
    @NativeType("struct msdf_vector2")
    public MSDFGenVector2 translation() { return ntranslation(address()); }
    /** @return a {@link MSDFGenRange} view of the {@code distance_mapping} field. */
    @NativeType("struct msdf_range")
    public MSDFGenRange distance_mapping() { return ndistance_mapping(address()); }

    /** Copies the specified {@link MSDFGenVector2} to the {@code scale} field. */
    public MSDFGenTransform scale(@NativeType("struct msdf_vector2") MSDFGenVector2 value) { nscale(address(), value); return this; }
    /** Passes the {@code scale} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MSDFGenTransform scale(java.util.function.Consumer<MSDFGenVector2> consumer) { consumer.accept(scale()); return this; }
    /** Copies the specified {@link MSDFGenVector2} to the {@code translation} field. */
    public MSDFGenTransform translation(@NativeType("struct msdf_vector2") MSDFGenVector2 value) { ntranslation(address(), value); return this; }
    /** Passes the {@code translation} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MSDFGenTransform translation(java.util.function.Consumer<MSDFGenVector2> consumer) { consumer.accept(translation()); return this; }
    /** Copies the specified {@link MSDFGenRange} to the {@code distance_mapping} field. */
    public MSDFGenTransform distance_mapping(@NativeType("struct msdf_range") MSDFGenRange value) { ndistance_mapping(address(), value); return this; }
    /** Passes the {@code distance_mapping} field to the specified {@link java.util.function.Consumer Consumer}. */
    public MSDFGenTransform distance_mapping(java.util.function.Consumer<MSDFGenRange> consumer) { consumer.accept(distance_mapping()); return this; }

    /** Initializes this struct with the specified values. */
    public MSDFGenTransform set(
        MSDFGenVector2 scale,
        MSDFGenVector2 translation,
        MSDFGenRange distance_mapping
    ) {
        scale(scale);
        translation(translation);
        distance_mapping(distance_mapping);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public MSDFGenTransform set(MSDFGenTransform src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MSDFGenTransform} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MSDFGenTransform malloc() {
        return new MSDFGenTransform(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MSDFGenTransform} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MSDFGenTransform calloc() {
        return new MSDFGenTransform(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MSDFGenTransform} instance allocated with {@link BufferUtils}. */
    public static MSDFGenTransform create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MSDFGenTransform(memAddress(container), container);
    }

    /** Returns a new {@code MSDFGenTransform} instance for the specified memory address. */
    public static MSDFGenTransform create(long address) {
        return new MSDFGenTransform(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable MSDFGenTransform createSafe(long address) {
        return address == NULL ? null : new MSDFGenTransform(address, null);
    }

    /**
     * Returns a new {@link MSDFGenTransform.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenTransform.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MSDFGenTransform.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenTransform.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MSDFGenTransform.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenTransform.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MSDFGenTransform.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MSDFGenTransform.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static MSDFGenTransform.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code MSDFGenTransform} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MSDFGenTransform malloc(MemoryStack stack) {
        return new MSDFGenTransform(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MSDFGenTransform} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MSDFGenTransform calloc(MemoryStack stack) {
        return new MSDFGenTransform(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MSDFGenTransform.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MSDFGenTransform.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MSDFGenTransform.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MSDFGenTransform.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #scale}. */
    public static MSDFGenVector2 nscale(long struct) { return MSDFGenVector2.create(struct + MSDFGenTransform.SCALE); }
    /** Unsafe version of {@link #translation}. */
    public static MSDFGenVector2 ntranslation(long struct) { return MSDFGenVector2.create(struct + MSDFGenTransform.TRANSLATION); }
    /** Unsafe version of {@link #distance_mapping}. */
    public static MSDFGenRange ndistance_mapping(long struct) { return MSDFGenRange.create(struct + MSDFGenTransform.DISTANCE_MAPPING); }

    /** Unsafe version of {@link #scale(MSDFGenVector2) scale}. */
    public static void nscale(long struct, MSDFGenVector2 value) { memCopy(value.address(), struct + MSDFGenTransform.SCALE, MSDFGenVector2.SIZEOF); }
    /** Unsafe version of {@link #translation(MSDFGenVector2) translation}. */
    public static void ntranslation(long struct, MSDFGenVector2 value) { memCopy(value.address(), struct + MSDFGenTransform.TRANSLATION, MSDFGenVector2.SIZEOF); }
    /** Unsafe version of {@link #distance_mapping(MSDFGenRange) distance_mapping}. */
    public static void ndistance_mapping(long struct, MSDFGenRange value) { memCopy(value.address(), struct + MSDFGenTransform.DISTANCE_MAPPING, MSDFGenRange.SIZEOF); }

    // -----------------------------------

    /** An array of {@link MSDFGenTransform} structs. */
    public static class Buffer extends StructBuffer<MSDFGenTransform, Buffer> implements NativeResource {

        private static final MSDFGenTransform ELEMENT_FACTORY = MSDFGenTransform.create(-1L);

        /**
         * Creates a new {@code MSDFGenTransform.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MSDFGenTransform#SIZEOF}, and its mark will be undefined.</p>
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
        protected MSDFGenTransform getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link MSDFGenVector2} view of the {@code scale} field. */
        @NativeType("struct msdf_vector2")
        public MSDFGenVector2 scale() { return MSDFGenTransform.nscale(address()); }
        /** @return a {@link MSDFGenVector2} view of the {@code translation} field. */
        @NativeType("struct msdf_vector2")
        public MSDFGenVector2 translation() { return MSDFGenTransform.ntranslation(address()); }
        /** @return a {@link MSDFGenRange} view of the {@code distance_mapping} field. */
        @NativeType("struct msdf_range")
        public MSDFGenRange distance_mapping() { return MSDFGenTransform.ndistance_mapping(address()); }

        /** Copies the specified {@link MSDFGenVector2} to the {@code scale} field. */
        public MSDFGenTransform.Buffer scale(@NativeType("struct msdf_vector2") MSDFGenVector2 value) { MSDFGenTransform.nscale(address(), value); return this; }
        /** Passes the {@code scale} field to the specified {@link java.util.function.Consumer Consumer}. */
        public MSDFGenTransform.Buffer scale(java.util.function.Consumer<MSDFGenVector2> consumer) { consumer.accept(scale()); return this; }
        /** Copies the specified {@link MSDFGenVector2} to the {@code translation} field. */
        public MSDFGenTransform.Buffer translation(@NativeType("struct msdf_vector2") MSDFGenVector2 value) { MSDFGenTransform.ntranslation(address(), value); return this; }
        /** Passes the {@code translation} field to the specified {@link java.util.function.Consumer Consumer}. */
        public MSDFGenTransform.Buffer translation(java.util.function.Consumer<MSDFGenVector2> consumer) { consumer.accept(translation()); return this; }
        /** Copies the specified {@link MSDFGenRange} to the {@code distance_mapping} field. */
        public MSDFGenTransform.Buffer distance_mapping(@NativeType("struct msdf_range") MSDFGenRange value) { MSDFGenTransform.ndistance_mapping(address(), value); return this; }
        /** Passes the {@code distance_mapping} field to the specified {@link java.util.function.Consumer Consumer}. */
        public MSDFGenTransform.Buffer distance_mapping(java.util.function.Consumer<MSDFGenRange> consumer) { consumer.accept(distance_mapping()); return this; }

    }

}