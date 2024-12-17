/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkMultisampledRenderToSingleSampledInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 multisampledRenderToSingleSampledEnable;
 *     VkSampleCountFlagBits rasterizationSamples;
 * }}</pre>
 */
public class VkMultisampledRenderToSingleSampledInfoEXT extends Struct<VkMultisampledRenderToSingleSampledInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MULTISAMPLEDRENDERTOSINGLESAMPLEDENABLE,
        RASTERIZATIONSAMPLES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MULTISAMPLEDRENDERTOSINGLESAMPLEDENABLE = layout.offsetof(2);
        RASTERIZATIONSAMPLES = layout.offsetof(3);
    }

    protected VkMultisampledRenderToSingleSampledInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMultisampledRenderToSingleSampledInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkMultisampledRenderToSingleSampledInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkMultisampledRenderToSingleSampledInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMultisampledRenderToSingleSampledInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code multisampledRenderToSingleSampledEnable} field. */
    @NativeType("VkBool32")
    public boolean multisampledRenderToSingleSampledEnable() { return nmultisampledRenderToSingleSampledEnable(address()) != 0; }
    /** @return the value of the {@code rasterizationSamples} field. */
    @NativeType("VkSampleCountFlagBits")
    public int rasterizationSamples() { return nrasterizationSamples(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMultisampledRenderToSingleSampledInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMultisampledRenderToSingleSampled#VK_STRUCTURE_TYPE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_INFO_EXT STRUCTURE_TYPE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_INFO_EXT} value to the {@code sType} field. */
    public VkMultisampledRenderToSingleSampledInfoEXT sType$Default() { return sType(EXTMultisampledRenderToSingleSampled.VK_STRUCTURE_TYPE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMultisampledRenderToSingleSampledInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code multisampledRenderToSingleSampledEnable} field. */
    public VkMultisampledRenderToSingleSampledInfoEXT multisampledRenderToSingleSampledEnable(@NativeType("VkBool32") boolean value) { nmultisampledRenderToSingleSampledEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code rasterizationSamples} field. */
    public VkMultisampledRenderToSingleSampledInfoEXT rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) { nrasterizationSamples(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMultisampledRenderToSingleSampledInfoEXT set(
        int sType,
        long pNext,
        boolean multisampledRenderToSingleSampledEnable,
        int rasterizationSamples
    ) {
        sType(sType);
        pNext(pNext);
        multisampledRenderToSingleSampledEnable(multisampledRenderToSingleSampledEnable);
        rasterizationSamples(rasterizationSamples);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMultisampledRenderToSingleSampledInfoEXT set(VkMultisampledRenderToSingleSampledInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMultisampledRenderToSingleSampledInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMultisampledRenderToSingleSampledInfoEXT malloc() {
        return new VkMultisampledRenderToSingleSampledInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMultisampledRenderToSingleSampledInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMultisampledRenderToSingleSampledInfoEXT calloc() {
        return new VkMultisampledRenderToSingleSampledInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMultisampledRenderToSingleSampledInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkMultisampledRenderToSingleSampledInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMultisampledRenderToSingleSampledInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkMultisampledRenderToSingleSampledInfoEXT} instance for the specified memory address. */
    public static VkMultisampledRenderToSingleSampledInfoEXT create(long address) {
        return new VkMultisampledRenderToSingleSampledInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMultisampledRenderToSingleSampledInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkMultisampledRenderToSingleSampledInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkMultisampledRenderToSingleSampledInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultisampledRenderToSingleSampledInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMultisampledRenderToSingleSampledInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultisampledRenderToSingleSampledInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMultisampledRenderToSingleSampledInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultisampledRenderToSingleSampledInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMultisampledRenderToSingleSampledInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMultisampledRenderToSingleSampledInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMultisampledRenderToSingleSampledInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMultisampledRenderToSingleSampledInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMultisampledRenderToSingleSampledInfoEXT malloc(MemoryStack stack) {
        return new VkMultisampledRenderToSingleSampledInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMultisampledRenderToSingleSampledInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMultisampledRenderToSingleSampledInfoEXT calloc(MemoryStack stack) {
        return new VkMultisampledRenderToSingleSampledInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMultisampledRenderToSingleSampledInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMultisampledRenderToSingleSampledInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMultisampledRenderToSingleSampledInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMultisampledRenderToSingleSampledInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMultisampledRenderToSingleSampledInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMultisampledRenderToSingleSampledInfoEXT.PNEXT); }
    /** Unsafe version of {@link #multisampledRenderToSingleSampledEnable}. */
    public static int nmultisampledRenderToSingleSampledEnable(long struct) { return memGetInt(struct + VkMultisampledRenderToSingleSampledInfoEXT.MULTISAMPLEDRENDERTOSINGLESAMPLEDENABLE); }
    /** Unsafe version of {@link #rasterizationSamples}. */
    public static int nrasterizationSamples(long struct) { return memGetInt(struct + VkMultisampledRenderToSingleSampledInfoEXT.RASTERIZATIONSAMPLES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMultisampledRenderToSingleSampledInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMultisampledRenderToSingleSampledInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #multisampledRenderToSingleSampledEnable(boolean) multisampledRenderToSingleSampledEnable}. */
    public static void nmultisampledRenderToSingleSampledEnable(long struct, int value) { memPutInt(struct + VkMultisampledRenderToSingleSampledInfoEXT.MULTISAMPLEDRENDERTOSINGLESAMPLEDENABLE, value); }
    /** Unsafe version of {@link #rasterizationSamples(int) rasterizationSamples}. */
    public static void nrasterizationSamples(long struct, int value) { memPutInt(struct + VkMultisampledRenderToSingleSampledInfoEXT.RASTERIZATIONSAMPLES, value); }

    // -----------------------------------

    /** An array of {@link VkMultisampledRenderToSingleSampledInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkMultisampledRenderToSingleSampledInfoEXT, Buffer> implements NativeResource {

        private static final VkMultisampledRenderToSingleSampledInfoEXT ELEMENT_FACTORY = VkMultisampledRenderToSingleSampledInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkMultisampledRenderToSingleSampledInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMultisampledRenderToSingleSampledInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMultisampledRenderToSingleSampledInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMultisampledRenderToSingleSampledInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMultisampledRenderToSingleSampledInfoEXT.npNext(address()); }
        /** @return the value of the {@code multisampledRenderToSingleSampledEnable} field. */
        @NativeType("VkBool32")
        public boolean multisampledRenderToSingleSampledEnable() { return VkMultisampledRenderToSingleSampledInfoEXT.nmultisampledRenderToSingleSampledEnable(address()) != 0; }
        /** @return the value of the {@code rasterizationSamples} field. */
        @NativeType("VkSampleCountFlagBits")
        public int rasterizationSamples() { return VkMultisampledRenderToSingleSampledInfoEXT.nrasterizationSamples(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMultisampledRenderToSingleSampledInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkMultisampledRenderToSingleSampledInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMultisampledRenderToSingleSampled#VK_STRUCTURE_TYPE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_INFO_EXT STRUCTURE_TYPE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_INFO_EXT} value to the {@code sType} field. */
        public VkMultisampledRenderToSingleSampledInfoEXT.Buffer sType$Default() { return sType(EXTMultisampledRenderToSingleSampled.VK_STRUCTURE_TYPE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMultisampledRenderToSingleSampledInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkMultisampledRenderToSingleSampledInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code multisampledRenderToSingleSampledEnable} field. */
        public VkMultisampledRenderToSingleSampledInfoEXT.Buffer multisampledRenderToSingleSampledEnable(@NativeType("VkBool32") boolean value) { VkMultisampledRenderToSingleSampledInfoEXT.nmultisampledRenderToSingleSampledEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code rasterizationSamples} field. */
        public VkMultisampledRenderToSingleSampledInfoEXT.Buffer rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) { VkMultisampledRenderToSingleSampledInfoEXT.nrasterizationSamples(address(), value); return this; }

    }

}