/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spvc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct spvc_combined_image_sampler {
 *     spvc_variable_id {@link #combined_id};
 *     spvc_variable_id {@link #image_id};
 *     spvc_variable_id {@link #sampler_id};
 * }</code></pre>
 */
@NativeType("struct spvc_combined_image_sampler")
public class SpvcCombinedImageSampler extends Struct<SpvcCombinedImageSampler> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COMBINED_ID,
        IMAGE_ID,
        SAMPLER_ID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COMBINED_ID = layout.offsetof(0);
        IMAGE_ID = layout.offsetof(1);
        SAMPLER_ID = layout.offsetof(2);
    }

    protected SpvcCombinedImageSampler(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpvcCombinedImageSampler create(long address, @Nullable ByteBuffer container) {
        return new SpvcCombinedImageSampler(address, container);
    }

    /**
     * Creates a {@code SpvcCombinedImageSampler} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpvcCombinedImageSampler(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the ID of the {@code sampler2D} variable */
    @NativeType("spvc_variable_id")
    public int combined_id() { return ncombined_id(address()); }
    /** the ID of the {@code texture2D} variable */
    @NativeType("spvc_variable_id")
    public int image_id() { return nimage_id(address()); }
    /** the ID of the {@code sampler} variable */
    @NativeType("spvc_variable_id")
    public int sampler_id() { return nsampler_id(address()); }

    /** Sets the specified value to the {@link #combined_id} field. */
    public SpvcCombinedImageSampler combined_id(@NativeType("spvc_variable_id") int value) { ncombined_id(address(), value); return this; }
    /** Sets the specified value to the {@link #image_id} field. */
    public SpvcCombinedImageSampler image_id(@NativeType("spvc_variable_id") int value) { nimage_id(address(), value); return this; }
    /** Sets the specified value to the {@link #sampler_id} field. */
    public SpvcCombinedImageSampler sampler_id(@NativeType("spvc_variable_id") int value) { nsampler_id(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpvcCombinedImageSampler set(
        int combined_id,
        int image_id,
        int sampler_id
    ) {
        combined_id(combined_id);
        image_id(image_id);
        sampler_id(sampler_id);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpvcCombinedImageSampler set(SpvcCombinedImageSampler src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpvcCombinedImageSampler} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpvcCombinedImageSampler malloc() {
        return new SpvcCombinedImageSampler(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpvcCombinedImageSampler} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpvcCombinedImageSampler calloc() {
        return new SpvcCombinedImageSampler(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpvcCombinedImageSampler} instance allocated with {@link BufferUtils}. */
    public static SpvcCombinedImageSampler create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcCombinedImageSampler(memAddress(container), container);
    }

    /** Returns a new {@code SpvcCombinedImageSampler} instance for the specified memory address. */
    public static SpvcCombinedImageSampler create(long address) {
        return new SpvcCombinedImageSampler(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SpvcCombinedImageSampler createSafe(long address) {
        return address == NULL ? null : new SpvcCombinedImageSampler(address, null);
    }

    /**
     * Returns a new {@link SpvcCombinedImageSampler.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcCombinedImageSampler.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpvcCombinedImageSampler.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcCombinedImageSampler.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcCombinedImageSampler.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcCombinedImageSampler.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpvcCombinedImageSampler.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpvcCombinedImageSampler.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SpvcCombinedImageSampler.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpvcCombinedImageSampler} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcCombinedImageSampler malloc(MemoryStack stack) {
        return new SpvcCombinedImageSampler(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpvcCombinedImageSampler} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcCombinedImageSampler calloc(MemoryStack stack) {
        return new SpvcCombinedImageSampler(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpvcCombinedImageSampler.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcCombinedImageSampler.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcCombinedImageSampler.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcCombinedImageSampler.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #combined_id}. */
    public static int ncombined_id(long struct) { return memGetInt(struct + SpvcCombinedImageSampler.COMBINED_ID); }
    /** Unsafe version of {@link #image_id}. */
    public static int nimage_id(long struct) { return memGetInt(struct + SpvcCombinedImageSampler.IMAGE_ID); }
    /** Unsafe version of {@link #sampler_id}. */
    public static int nsampler_id(long struct) { return memGetInt(struct + SpvcCombinedImageSampler.SAMPLER_ID); }

    /** Unsafe version of {@link #combined_id(int) combined_id}. */
    public static void ncombined_id(long struct, int value) { memPutInt(struct + SpvcCombinedImageSampler.COMBINED_ID, value); }
    /** Unsafe version of {@link #image_id(int) image_id}. */
    public static void nimage_id(long struct, int value) { memPutInt(struct + SpvcCombinedImageSampler.IMAGE_ID, value); }
    /** Unsafe version of {@link #sampler_id(int) sampler_id}. */
    public static void nsampler_id(long struct, int value) { memPutInt(struct + SpvcCombinedImageSampler.SAMPLER_ID, value); }

    // -----------------------------------

    /** An array of {@link SpvcCombinedImageSampler} structs. */
    public static class Buffer extends StructBuffer<SpvcCombinedImageSampler, Buffer> implements NativeResource {

        private static final SpvcCombinedImageSampler ELEMENT_FACTORY = SpvcCombinedImageSampler.create(-1L);

        /**
         * Creates a new {@code SpvcCombinedImageSampler.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpvcCombinedImageSampler#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpvcCombinedImageSampler getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link SpvcCombinedImageSampler#combined_id} field. */
        @NativeType("spvc_variable_id")
        public int combined_id() { return SpvcCombinedImageSampler.ncombined_id(address()); }
        /** @return the value of the {@link SpvcCombinedImageSampler#image_id} field. */
        @NativeType("spvc_variable_id")
        public int image_id() { return SpvcCombinedImageSampler.nimage_id(address()); }
        /** @return the value of the {@link SpvcCombinedImageSampler#sampler_id} field. */
        @NativeType("spvc_variable_id")
        public int sampler_id() { return SpvcCombinedImageSampler.nsampler_id(address()); }

        /** Sets the specified value to the {@link SpvcCombinedImageSampler#combined_id} field. */
        public SpvcCombinedImageSampler.Buffer combined_id(@NativeType("spvc_variable_id") int value) { SpvcCombinedImageSampler.ncombined_id(address(), value); return this; }
        /** Sets the specified value to the {@link SpvcCombinedImageSampler#image_id} field. */
        public SpvcCombinedImageSampler.Buffer image_id(@NativeType("spvc_variable_id") int value) { SpvcCombinedImageSampler.nimage_id(address(), value); return this; }
        /** Sets the specified value to the {@link SpvcCombinedImageSampler#sampler_id} field. */
        public SpvcCombinedImageSampler.Buffer sampler_id(@NativeType("spvc_variable_id") int value) { SpvcCombinedImageSampler.nsampler_id(address(), value); return this; }

    }

}