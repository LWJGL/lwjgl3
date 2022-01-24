/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spvc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Maps to the sampler Y'CbCr conversion-related portions of {@code MSLConstexprSampler}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct spvc_msl_sampler_ycbcr_conversion {
 *     unsigned int planes;
 *     spvc_msl_format_resolution resolution;
 *     spvc_msl_sampler_filter chroma_filter;
 *     spvc_msl_chroma_location x_chroma_offset;
 *     spvc_msl_chroma_location y_chroma_offset;
 *     spvc_msl_component_swizzle swizzle[4];
 *     spvc_msl_sampler_ycbcr_model_conversion ycbcr_model;
 *     spvc_msl_sampler_ycbcr_range ycbcr_range;
 *     unsigned int bpc;
 * }</code></pre>
 */
@NativeType("struct spvc_msl_sampler_ycbcr_conversion")
public class SpvcMslSamplerYcbcrConversion extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PLANES,
        RESOLUTION,
        CHROMA_FILTER,
        X_CHROMA_OFFSET,
        Y_CHROMA_OFFSET,
        SWIZZLE,
        YCBCR_MODEL,
        YCBCR_RANGE,
        BPC;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PLANES = layout.offsetof(0);
        RESOLUTION = layout.offsetof(1);
        CHROMA_FILTER = layout.offsetof(2);
        X_CHROMA_OFFSET = layout.offsetof(3);
        Y_CHROMA_OFFSET = layout.offsetof(4);
        SWIZZLE = layout.offsetof(5);
        YCBCR_MODEL = layout.offsetof(6);
        YCBCR_RANGE = layout.offsetof(7);
        BPC = layout.offsetof(8);
    }

    /**
     * Creates a {@code SpvcMslSamplerYcbcrConversion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpvcMslSamplerYcbcrConversion(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code planes} field. */
    @NativeType("unsigned int")
    public int planes() { return nplanes(address()); }
    /** @return the value of the {@code resolution} field. */
    @NativeType("spvc_msl_format_resolution")
    public int resolution() { return nresolution(address()); }
    /** @return the value of the {@code chroma_filter} field. */
    @NativeType("spvc_msl_sampler_filter")
    public int chroma_filter() { return nchroma_filter(address()); }
    /** @return the value of the {@code x_chroma_offset} field. */
    @NativeType("spvc_msl_chroma_location")
    public int x_chroma_offset() { return nx_chroma_offset(address()); }
    /** @return the value of the {@code y_chroma_offset} field. */
    @NativeType("spvc_msl_chroma_location")
    public int y_chroma_offset() { return ny_chroma_offset(address()); }
    /** @return a {@link IntBuffer} view of the {@code swizzle} field. */
    @NativeType("spvc_msl_component_swizzle[4]")
    public IntBuffer swizzle() { return nswizzle(address()); }
    /** @return the value at the specified index of the {@code swizzle} field. */
    @NativeType("spvc_msl_component_swizzle")
    public int swizzle(int index) { return nswizzle(address(), index); }
    /** @return the value of the {@code ycbcr_model} field. */
    @NativeType("spvc_msl_sampler_ycbcr_model_conversion")
    public int ycbcr_model() { return nycbcr_model(address()); }
    /** @return the value of the {@code ycbcr_range} field. */
    @NativeType("spvc_msl_sampler_ycbcr_range")
    public int ycbcr_range() { return nycbcr_range(address()); }
    /** @return the value of the {@code bpc} field. */
    @NativeType("unsigned int")
    public int bpc() { return nbpc(address()); }

    /** Sets the specified value to the {@code planes} field. */
    public SpvcMslSamplerYcbcrConversion planes(@NativeType("unsigned int") int value) { nplanes(address(), value); return this; }
    /** Sets the specified value to the {@code resolution} field. */
    public SpvcMslSamplerYcbcrConversion resolution(@NativeType("spvc_msl_format_resolution") int value) { nresolution(address(), value); return this; }
    /** Sets the specified value to the {@code chroma_filter} field. */
    public SpvcMslSamplerYcbcrConversion chroma_filter(@NativeType("spvc_msl_sampler_filter") int value) { nchroma_filter(address(), value); return this; }
    /** Sets the specified value to the {@code x_chroma_offset} field. */
    public SpvcMslSamplerYcbcrConversion x_chroma_offset(@NativeType("spvc_msl_chroma_location") int value) { nx_chroma_offset(address(), value); return this; }
    /** Sets the specified value to the {@code y_chroma_offset} field. */
    public SpvcMslSamplerYcbcrConversion y_chroma_offset(@NativeType("spvc_msl_chroma_location") int value) { ny_chroma_offset(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code swizzle} field. */
    public SpvcMslSamplerYcbcrConversion swizzle(@NativeType("spvc_msl_component_swizzle[4]") IntBuffer value) { nswizzle(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code swizzle} field. */
    public SpvcMslSamplerYcbcrConversion swizzle(int index, @NativeType("spvc_msl_component_swizzle") int value) { nswizzle(address(), index, value); return this; }
    /** Sets the specified value to the {@code ycbcr_model} field. */
    public SpvcMslSamplerYcbcrConversion ycbcr_model(@NativeType("spvc_msl_sampler_ycbcr_model_conversion") int value) { nycbcr_model(address(), value); return this; }
    /** Sets the specified value to the {@code ycbcr_range} field. */
    public SpvcMslSamplerYcbcrConversion ycbcr_range(@NativeType("spvc_msl_sampler_ycbcr_range") int value) { nycbcr_range(address(), value); return this; }
    /** Sets the specified value to the {@code bpc} field. */
    public SpvcMslSamplerYcbcrConversion bpc(@NativeType("unsigned int") int value) { nbpc(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpvcMslSamplerYcbcrConversion set(
        int planes,
        int resolution,
        int chroma_filter,
        int x_chroma_offset,
        int y_chroma_offset,
        IntBuffer swizzle,
        int ycbcr_model,
        int ycbcr_range,
        int bpc
    ) {
        planes(planes);
        resolution(resolution);
        chroma_filter(chroma_filter);
        x_chroma_offset(x_chroma_offset);
        y_chroma_offset(y_chroma_offset);
        swizzle(swizzle);
        ycbcr_model(ycbcr_model);
        ycbcr_range(ycbcr_range);
        bpc(bpc);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpvcMslSamplerYcbcrConversion set(SpvcMslSamplerYcbcrConversion src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpvcMslSamplerYcbcrConversion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpvcMslSamplerYcbcrConversion malloc() {
        return wrap(SpvcMslSamplerYcbcrConversion.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code SpvcMslSamplerYcbcrConversion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpvcMslSamplerYcbcrConversion calloc() {
        return wrap(SpvcMslSamplerYcbcrConversion.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code SpvcMslSamplerYcbcrConversion} instance allocated with {@link BufferUtils}. */
    public static SpvcMslSamplerYcbcrConversion create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(SpvcMslSamplerYcbcrConversion.class, memAddress(container), container);
    }

    /** Returns a new {@code SpvcMslSamplerYcbcrConversion} instance for the specified memory address. */
    public static SpvcMslSamplerYcbcrConversion create(long address) {
        return wrap(SpvcMslSamplerYcbcrConversion.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcMslSamplerYcbcrConversion createSafe(long address) {
        return address == NULL ? null : wrap(SpvcMslSamplerYcbcrConversion.class, address);
    }

    /**
     * Returns a new {@link SpvcMslSamplerYcbcrConversion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslSamplerYcbcrConversion.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpvcMslSamplerYcbcrConversion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslSamplerYcbcrConversion.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcMslSamplerYcbcrConversion.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslSamplerYcbcrConversion.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link SpvcMslSamplerYcbcrConversion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpvcMslSamplerYcbcrConversion.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcMslSamplerYcbcrConversion.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code SpvcMslSamplerYcbcrConversion} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcMslSamplerYcbcrConversion malloc(MemoryStack stack) {
        return wrap(SpvcMslSamplerYcbcrConversion.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code SpvcMslSamplerYcbcrConversion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcMslSamplerYcbcrConversion calloc(MemoryStack stack) {
        return wrap(SpvcMslSamplerYcbcrConversion.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SpvcMslSamplerYcbcrConversion.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcMslSamplerYcbcrConversion.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcMslSamplerYcbcrConversion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcMslSamplerYcbcrConversion.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #planes}. */
    public static int nplanes(long struct) { return UNSAFE.getInt(null, struct + SpvcMslSamplerYcbcrConversion.PLANES); }
    /** Unsafe version of {@link #resolution}. */
    public static int nresolution(long struct) { return UNSAFE.getInt(null, struct + SpvcMslSamplerYcbcrConversion.RESOLUTION); }
    /** Unsafe version of {@link #chroma_filter}. */
    public static int nchroma_filter(long struct) { return UNSAFE.getInt(null, struct + SpvcMslSamplerYcbcrConversion.CHROMA_FILTER); }
    /** Unsafe version of {@link #x_chroma_offset}. */
    public static int nx_chroma_offset(long struct) { return UNSAFE.getInt(null, struct + SpvcMslSamplerYcbcrConversion.X_CHROMA_OFFSET); }
    /** Unsafe version of {@link #y_chroma_offset}. */
    public static int ny_chroma_offset(long struct) { return UNSAFE.getInt(null, struct + SpvcMslSamplerYcbcrConversion.Y_CHROMA_OFFSET); }
    /** Unsafe version of {@link #swizzle}. */
    public static IntBuffer nswizzle(long struct) { return memIntBuffer(struct + SpvcMslSamplerYcbcrConversion.SWIZZLE, 4); }
    /** Unsafe version of {@link #swizzle(int) swizzle}. */
    public static int nswizzle(long struct, int index) {
        return UNSAFE.getInt(null, struct + SpvcMslSamplerYcbcrConversion.SWIZZLE + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #ycbcr_model}. */
    public static int nycbcr_model(long struct) { return UNSAFE.getInt(null, struct + SpvcMslSamplerYcbcrConversion.YCBCR_MODEL); }
    /** Unsafe version of {@link #ycbcr_range}. */
    public static int nycbcr_range(long struct) { return UNSAFE.getInt(null, struct + SpvcMslSamplerYcbcrConversion.YCBCR_RANGE); }
    /** Unsafe version of {@link #bpc}. */
    public static int nbpc(long struct) { return UNSAFE.getInt(null, struct + SpvcMslSamplerYcbcrConversion.BPC); }

    /** Unsafe version of {@link #planes(int) planes}. */
    public static void nplanes(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslSamplerYcbcrConversion.PLANES, value); }
    /** Unsafe version of {@link #resolution(int) resolution}. */
    public static void nresolution(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslSamplerYcbcrConversion.RESOLUTION, value); }
    /** Unsafe version of {@link #chroma_filter(int) chroma_filter}. */
    public static void nchroma_filter(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslSamplerYcbcrConversion.CHROMA_FILTER, value); }
    /** Unsafe version of {@link #x_chroma_offset(int) x_chroma_offset}. */
    public static void nx_chroma_offset(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslSamplerYcbcrConversion.X_CHROMA_OFFSET, value); }
    /** Unsafe version of {@link #y_chroma_offset(int) y_chroma_offset}. */
    public static void ny_chroma_offset(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslSamplerYcbcrConversion.Y_CHROMA_OFFSET, value); }
    /** Unsafe version of {@link #swizzle(IntBuffer) swizzle}. */
    public static void nswizzle(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + SpvcMslSamplerYcbcrConversion.SWIZZLE, value.remaining() * 4);
    }
    /** Unsafe version of {@link #swizzle(int, int) swizzle}. */
    public static void nswizzle(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + SpvcMslSamplerYcbcrConversion.SWIZZLE + check(index, 4) * 4, value);
    }
    /** Unsafe version of {@link #ycbcr_model(int) ycbcr_model}. */
    public static void nycbcr_model(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslSamplerYcbcrConversion.YCBCR_MODEL, value); }
    /** Unsafe version of {@link #ycbcr_range(int) ycbcr_range}. */
    public static void nycbcr_range(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslSamplerYcbcrConversion.YCBCR_RANGE, value); }
    /** Unsafe version of {@link #bpc(int) bpc}. */
    public static void nbpc(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslSamplerYcbcrConversion.BPC, value); }

    // -----------------------------------

    /** An array of {@link SpvcMslSamplerYcbcrConversion} structs. */
    public static class Buffer extends StructBuffer<SpvcMslSamplerYcbcrConversion, Buffer> implements NativeResource {

        private static final SpvcMslSamplerYcbcrConversion ELEMENT_FACTORY = SpvcMslSamplerYcbcrConversion.create(-1L);

        /**
         * Creates a new {@code SpvcMslSamplerYcbcrConversion.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpvcMslSamplerYcbcrConversion#SIZEOF}, and its mark will be undefined.
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
        protected SpvcMslSamplerYcbcrConversion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code planes} field. */
        @NativeType("unsigned int")
        public int planes() { return SpvcMslSamplerYcbcrConversion.nplanes(address()); }
        /** @return the value of the {@code resolution} field. */
        @NativeType("spvc_msl_format_resolution")
        public int resolution() { return SpvcMslSamplerYcbcrConversion.nresolution(address()); }
        /** @return the value of the {@code chroma_filter} field. */
        @NativeType("spvc_msl_sampler_filter")
        public int chroma_filter() { return SpvcMslSamplerYcbcrConversion.nchroma_filter(address()); }
        /** @return the value of the {@code x_chroma_offset} field. */
        @NativeType("spvc_msl_chroma_location")
        public int x_chroma_offset() { return SpvcMslSamplerYcbcrConversion.nx_chroma_offset(address()); }
        /** @return the value of the {@code y_chroma_offset} field. */
        @NativeType("spvc_msl_chroma_location")
        public int y_chroma_offset() { return SpvcMslSamplerYcbcrConversion.ny_chroma_offset(address()); }
        /** @return a {@link IntBuffer} view of the {@code swizzle} field. */
        @NativeType("spvc_msl_component_swizzle[4]")
        public IntBuffer swizzle() { return SpvcMslSamplerYcbcrConversion.nswizzle(address()); }
        /** @return the value at the specified index of the {@code swizzle} field. */
        @NativeType("spvc_msl_component_swizzle")
        public int swizzle(int index) { return SpvcMslSamplerYcbcrConversion.nswizzle(address(), index); }
        /** @return the value of the {@code ycbcr_model} field. */
        @NativeType("spvc_msl_sampler_ycbcr_model_conversion")
        public int ycbcr_model() { return SpvcMslSamplerYcbcrConversion.nycbcr_model(address()); }
        /** @return the value of the {@code ycbcr_range} field. */
        @NativeType("spvc_msl_sampler_ycbcr_range")
        public int ycbcr_range() { return SpvcMslSamplerYcbcrConversion.nycbcr_range(address()); }
        /** @return the value of the {@code bpc} field. */
        @NativeType("unsigned int")
        public int bpc() { return SpvcMslSamplerYcbcrConversion.nbpc(address()); }

        /** Sets the specified value to the {@code planes} field. */
        public SpvcMslSamplerYcbcrConversion.Buffer planes(@NativeType("unsigned int") int value) { SpvcMslSamplerYcbcrConversion.nplanes(address(), value); return this; }
        /** Sets the specified value to the {@code resolution} field. */
        public SpvcMslSamplerYcbcrConversion.Buffer resolution(@NativeType("spvc_msl_format_resolution") int value) { SpvcMslSamplerYcbcrConversion.nresolution(address(), value); return this; }
        /** Sets the specified value to the {@code chroma_filter} field. */
        public SpvcMslSamplerYcbcrConversion.Buffer chroma_filter(@NativeType("spvc_msl_sampler_filter") int value) { SpvcMslSamplerYcbcrConversion.nchroma_filter(address(), value); return this; }
        /** Sets the specified value to the {@code x_chroma_offset} field. */
        public SpvcMslSamplerYcbcrConversion.Buffer x_chroma_offset(@NativeType("spvc_msl_chroma_location") int value) { SpvcMslSamplerYcbcrConversion.nx_chroma_offset(address(), value); return this; }
        /** Sets the specified value to the {@code y_chroma_offset} field. */
        public SpvcMslSamplerYcbcrConversion.Buffer y_chroma_offset(@NativeType("spvc_msl_chroma_location") int value) { SpvcMslSamplerYcbcrConversion.ny_chroma_offset(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code swizzle} field. */
        public SpvcMslSamplerYcbcrConversion.Buffer swizzle(@NativeType("spvc_msl_component_swizzle[4]") IntBuffer value) { SpvcMslSamplerYcbcrConversion.nswizzle(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code swizzle} field. */
        public SpvcMslSamplerYcbcrConversion.Buffer swizzle(int index, @NativeType("spvc_msl_component_swizzle") int value) { SpvcMslSamplerYcbcrConversion.nswizzle(address(), index, value); return this; }
        /** Sets the specified value to the {@code ycbcr_model} field. */
        public SpvcMslSamplerYcbcrConversion.Buffer ycbcr_model(@NativeType("spvc_msl_sampler_ycbcr_model_conversion") int value) { SpvcMslSamplerYcbcrConversion.nycbcr_model(address(), value); return this; }
        /** Sets the specified value to the {@code ycbcr_range} field. */
        public SpvcMslSamplerYcbcrConversion.Buffer ycbcr_range(@NativeType("spvc_msl_sampler_ycbcr_range") int value) { SpvcMslSamplerYcbcrConversion.nycbcr_range(address(), value); return this; }
        /** Sets the specified value to the {@code bpc} field. */
        public SpvcMslSamplerYcbcrConversion.Buffer bpc(@NativeType("unsigned int") int value) { SpvcMslSamplerYcbcrConversion.nbpc(address(), value); return this; }

    }

}