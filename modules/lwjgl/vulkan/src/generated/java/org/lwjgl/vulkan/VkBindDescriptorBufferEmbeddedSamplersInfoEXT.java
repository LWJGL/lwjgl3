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
 * struct VkBindDescriptorBufferEmbeddedSamplersInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkShaderStageFlags stageFlags;
 *     VkPipelineLayout layout;
 *     uint32_t set;
 * }}</pre>
 */
public class VkBindDescriptorBufferEmbeddedSamplersInfoEXT extends Struct<VkBindDescriptorBufferEmbeddedSamplersInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STAGEFLAGS,
        LAYOUT,
        SET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STAGEFLAGS = layout.offsetof(2);
        LAYOUT = layout.offsetof(3);
        SET = layout.offsetof(4);
    }

    protected VkBindDescriptorBufferEmbeddedSamplersInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindDescriptorBufferEmbeddedSamplersInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkBindDescriptorBufferEmbeddedSamplersInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code stageFlags} field. */
    @NativeType("VkShaderStageFlags")
    public int stageFlags() { return nstageFlags(address()); }
    /** @return the value of the {@code layout} field. */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** @return the value of the {@code set} field. */
    @NativeType("uint32_t")
    public int set() { return nset(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance6#VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT} value to the {@code sType} field. */
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT sType$Default() { return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code stageFlags} field. */
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT stageFlags(@NativeType("VkShaderStageFlags") int value) { nstageFlags(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code set} field. */
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT set(@NativeType("uint32_t") int value) { nset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT set(
        int sType,
        long pNext,
        int stageFlags,
        long layout,
        int set
    ) {
        sType(sType);
        pNext(pNext);
        stageFlags(stageFlags);
        layout(layout);
        set(set);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT set(VkBindDescriptorBufferEmbeddedSamplersInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindDescriptorBufferEmbeddedSamplersInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT malloc() {
        return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindDescriptorBufferEmbeddedSamplersInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT calloc() {
        return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindDescriptorBufferEmbeddedSamplersInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkBindDescriptorBufferEmbeddedSamplersInfoEXT} instance for the specified memory address. */
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT create(long address) {
        return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBindDescriptorBufferEmbeddedSamplersInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBindDescriptorBufferEmbeddedSamplersInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT malloc(MemoryStack stack) {
        return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindDescriptorBufferEmbeddedSamplersInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT calloc(MemoryStack stack) {
        return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBindDescriptorBufferEmbeddedSamplersInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindDescriptorBufferEmbeddedSamplersInfoEXT.PNEXT); }
    /** Unsafe version of {@link #stageFlags}. */
    public static int nstageFlags(long struct) { return memGetInt(struct + VkBindDescriptorBufferEmbeddedSamplersInfoEXT.STAGEFLAGS); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return memGetLong(struct + VkBindDescriptorBufferEmbeddedSamplersInfoEXT.LAYOUT); }
    /** Unsafe version of {@link #set}. */
    public static int nset(long struct) { return memGetInt(struct + VkBindDescriptorBufferEmbeddedSamplersInfoEXT.SET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBindDescriptorBufferEmbeddedSamplersInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindDescriptorBufferEmbeddedSamplersInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #stageFlags(int) stageFlags}. */
    public static void nstageFlags(long struct, int value) { memPutInt(struct + VkBindDescriptorBufferEmbeddedSamplersInfoEXT.STAGEFLAGS, value); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { memPutLong(struct + VkBindDescriptorBufferEmbeddedSamplersInfoEXT.LAYOUT, value); }
    /** Unsafe version of {@link #set(int) set}. */
    public static void nset(long struct, int value) { memPutInt(struct + VkBindDescriptorBufferEmbeddedSamplersInfoEXT.SET, value); }

    // -----------------------------------

    /** An array of {@link VkBindDescriptorBufferEmbeddedSamplersInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkBindDescriptorBufferEmbeddedSamplersInfoEXT, Buffer> implements NativeResource {

        private static final VkBindDescriptorBufferEmbeddedSamplersInfoEXT ELEMENT_FACTORY = VkBindDescriptorBufferEmbeddedSamplersInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindDescriptorBufferEmbeddedSamplersInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindDescriptorBufferEmbeddedSamplersInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.npNext(address()); }
        /** @return the value of the {@code stageFlags} field. */
        @NativeType("VkShaderStageFlags")
        public int stageFlags() { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.nstageFlags(address()); }
        /** @return the value of the {@code layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.nlayout(address()); }
        /** @return the value of the {@code set} field. */
        @NativeType("uint32_t")
        public int set() { return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.nset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance6#VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT} value to the {@code sType} field. */
        public VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer sType$Default() { return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
        public VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code stageFlags} field. */
        public VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.nstageFlags(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        public VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code set} field. */
        public VkBindDescriptorBufferEmbeddedSamplersInfoEXT.Buffer set(@NativeType("uint32_t") int value) { VkBindDescriptorBufferEmbeddedSamplersInfoEXT.nset(address(), value); return this; }

    }

}