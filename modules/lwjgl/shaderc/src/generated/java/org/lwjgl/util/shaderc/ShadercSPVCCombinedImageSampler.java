/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct shaderc_spvc_combined_image_sampler {
 *     uint32_t combined_id;
 *     uint32_t image_id;
 *     uint32_t sampler_id;
 * }</code></pre>
 */
@NativeType("struct shaderc_spvc_combined_image_sampler")
public class ShadercSPVCCombinedImageSampler extends Struct implements NativeResource {

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

    /**
     * Creates a {@code ShadercSPVCCombinedImageSampler} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ShadercSPVCCombinedImageSampler(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code combined_id} field. */
    @NativeType("uint32_t")
    public int combined_id() { return ncombined_id(address()); }
    /** Returns the value of the {@code image_id} field. */
    @NativeType("uint32_t")
    public int image_id() { return nimage_id(address()); }
    /** Returns the value of the {@code sampler_id} field. */
    @NativeType("uint32_t")
    public int sampler_id() { return nsampler_id(address()); }

    // -----------------------------------

    /** Returns a new {@code ShadercSPVCCombinedImageSampler} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ShadercSPVCCombinedImageSampler malloc() {
        return wrap(ShadercSPVCCombinedImageSampler.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ShadercSPVCCombinedImageSampler} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ShadercSPVCCombinedImageSampler calloc() {
        return wrap(ShadercSPVCCombinedImageSampler.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ShadercSPVCCombinedImageSampler} instance allocated with {@link BufferUtils}. */
    public static ShadercSPVCCombinedImageSampler create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ShadercSPVCCombinedImageSampler.class, memAddress(container), container);
    }

    /** Returns a new {@code ShadercSPVCCombinedImageSampler} instance for the specified memory address. */
    public static ShadercSPVCCombinedImageSampler create(long address) {
        return wrap(ShadercSPVCCombinedImageSampler.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ShadercSPVCCombinedImageSampler createSafe(long address) {
        return address == NULL ? null : wrap(ShadercSPVCCombinedImageSampler.class, address);
    }

    /**
     * Returns a new {@link ShadercSPVCCombinedImageSampler.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCCombinedImageSampler.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ShadercSPVCCombinedImageSampler.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCCombinedImageSampler.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ShadercSPVCCombinedImageSampler.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCCombinedImageSampler.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ShadercSPVCCombinedImageSampler.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCCombinedImageSampler.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ShadercSPVCCombinedImageSampler.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code ShadercSPVCCombinedImageSampler} instance allocated on the thread-local {@link MemoryStack}. */
    public static ShadercSPVCCombinedImageSampler mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code ShadercSPVCCombinedImageSampler} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ShadercSPVCCombinedImageSampler callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code ShadercSPVCCombinedImageSampler} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ShadercSPVCCombinedImageSampler mallocStack(MemoryStack stack) {
        return wrap(ShadercSPVCCombinedImageSampler.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ShadercSPVCCombinedImageSampler} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ShadercSPVCCombinedImageSampler callocStack(MemoryStack stack) {
        return wrap(ShadercSPVCCombinedImageSampler.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ShadercSPVCCombinedImageSampler.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCCombinedImageSampler.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ShadercSPVCCombinedImageSampler.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCCombinedImageSampler.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ShadercSPVCCombinedImageSampler.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCCombinedImageSampler.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ShadercSPVCCombinedImageSampler.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCCombinedImageSampler.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #combined_id}. */
    public static int ncombined_id(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCCombinedImageSampler.COMBINED_ID); }
    /** Unsafe version of {@link #image_id}. */
    public static int nimage_id(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCCombinedImageSampler.IMAGE_ID); }
    /** Unsafe version of {@link #sampler_id}. */
    public static int nsampler_id(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCCombinedImageSampler.SAMPLER_ID); }

    // -----------------------------------

    /** An array of {@link ShadercSPVCCombinedImageSampler} structs. */
    public static class Buffer extends StructBuffer<ShadercSPVCCombinedImageSampler, Buffer> implements NativeResource {

        private static final ShadercSPVCCombinedImageSampler ELEMENT_FACTORY = ShadercSPVCCombinedImageSampler.create(-1L);

        /**
         * Creates a new {@code ShadercSPVCCombinedImageSampler.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ShadercSPVCCombinedImageSampler#SIZEOF}, and its mark will be undefined.
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
        protected ShadercSPVCCombinedImageSampler getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code combined_id} field. */
        @NativeType("uint32_t")
        public int combined_id() { return ShadercSPVCCombinedImageSampler.ncombined_id(address()); }
        /** Returns the value of the {@code image_id} field. */
        @NativeType("uint32_t")
        public int image_id() { return ShadercSPVCCombinedImageSampler.nimage_id(address()); }
        /** Returns the value of the {@code sampler_id} field. */
        @NativeType("uint32_t")
        public int sampler_id() { return ShadercSPVCCombinedImageSampler.nsampler_id(address()); }

    }

}