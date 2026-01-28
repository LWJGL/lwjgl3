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
 * <pre><code>
 * struct VkTexelBufferDescriptorInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkFormat format;
 *     {@link VkDeviceAddressRangeEXT VkDeviceAddressRangeEXT} addressRange;
 * }</code></pre>
 */
public class VkTexelBufferDescriptorInfoEXT extends Struct<VkTexelBufferDescriptorInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FORMAT,
        ADDRESSRANGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkDeviceAddressRangeEXT.SIZEOF, VkDeviceAddressRangeEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
        ADDRESSRANGE = layout.offsetof(3);
    }

    protected VkTexelBufferDescriptorInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkTexelBufferDescriptorInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkTexelBufferDescriptorInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkTexelBufferDescriptorInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTexelBufferDescriptorInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** @return a {@link VkDeviceAddressRangeEXT} view of the {@code addressRange} field. */
    public VkDeviceAddressRangeEXT addressRange() { return naddressRange(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkTexelBufferDescriptorInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_TEXEL_BUFFER_DESCRIPTOR_INFO_EXT STRUCTURE_TYPE_TEXEL_BUFFER_DESCRIPTOR_INFO_EXT} value to the {@code sType} field. */
    public VkTexelBufferDescriptorInfoEXT sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_TEXEL_BUFFER_DESCRIPTOR_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkTexelBufferDescriptorInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public VkTexelBufferDescriptorInfoEXT format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Copies the specified {@link VkDeviceAddressRangeEXT} to the {@code addressRange} field. */
    public VkTexelBufferDescriptorInfoEXT addressRange(VkDeviceAddressRangeEXT value) { naddressRange(address(), value); return this; }
    /** Passes the {@code addressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkTexelBufferDescriptorInfoEXT addressRange(java.util.function.Consumer<VkDeviceAddressRangeEXT> consumer) { consumer.accept(addressRange()); return this; }

    /** Initializes this struct with the specified values. */
    public VkTexelBufferDescriptorInfoEXT set(
        int sType,
        long pNext,
        int format,
        VkDeviceAddressRangeEXT addressRange
    ) {
        sType(sType);
        pNext(pNext);
        format(format);
        addressRange(addressRange);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTexelBufferDescriptorInfoEXT set(VkTexelBufferDescriptorInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTexelBufferDescriptorInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTexelBufferDescriptorInfoEXT malloc() {
        return new VkTexelBufferDescriptorInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkTexelBufferDescriptorInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTexelBufferDescriptorInfoEXT calloc() {
        return new VkTexelBufferDescriptorInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkTexelBufferDescriptorInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkTexelBufferDescriptorInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTexelBufferDescriptorInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkTexelBufferDescriptorInfoEXT} instance for the specified memory address. */
    public static VkTexelBufferDescriptorInfoEXT create(long address) {
        return new VkTexelBufferDescriptorInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkTexelBufferDescriptorInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkTexelBufferDescriptorInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkTexelBufferDescriptorInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTexelBufferDescriptorInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTexelBufferDescriptorInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTexelBufferDescriptorInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTexelBufferDescriptorInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTexelBufferDescriptorInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkTexelBufferDescriptorInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTexelBufferDescriptorInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkTexelBufferDescriptorInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkTexelBufferDescriptorInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTexelBufferDescriptorInfoEXT malloc(MemoryStack stack) {
        return new VkTexelBufferDescriptorInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkTexelBufferDescriptorInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTexelBufferDescriptorInfoEXT calloc(MemoryStack stack) {
        return new VkTexelBufferDescriptorInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkTexelBufferDescriptorInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTexelBufferDescriptorInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTexelBufferDescriptorInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTexelBufferDescriptorInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkTexelBufferDescriptorInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTexelBufferDescriptorInfoEXT.PNEXT); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkTexelBufferDescriptorInfoEXT.FORMAT); }
    /** Unsafe version of {@link #addressRange}. */
    public static VkDeviceAddressRangeEXT naddressRange(long struct) { return VkDeviceAddressRangeEXT.create(struct + VkTexelBufferDescriptorInfoEXT.ADDRESSRANGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkTexelBufferDescriptorInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTexelBufferDescriptorInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + VkTexelBufferDescriptorInfoEXT.FORMAT, value); }
    /** Unsafe version of {@link #addressRange(VkDeviceAddressRangeEXT) addressRange}. */
    public static void naddressRange(long struct, VkDeviceAddressRangeEXT value) { memCopy(value.address(), struct + VkTexelBufferDescriptorInfoEXT.ADDRESSRANGE, VkDeviceAddressRangeEXT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkTexelBufferDescriptorInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkTexelBufferDescriptorInfoEXT, Buffer> implements NativeResource {

        private static final VkTexelBufferDescriptorInfoEXT ELEMENT_FACTORY = VkTexelBufferDescriptorInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkTexelBufferDescriptorInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTexelBufferDescriptorInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkTexelBufferDescriptorInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTexelBufferDescriptorInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkTexelBufferDescriptorInfoEXT.npNext(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkTexelBufferDescriptorInfoEXT.nformat(address()); }
        /** @return a {@link VkDeviceAddressRangeEXT} view of the {@code addressRange} field. */
        public VkDeviceAddressRangeEXT addressRange() { return VkTexelBufferDescriptorInfoEXT.naddressRange(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkTexelBufferDescriptorInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkTexelBufferDescriptorInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_TEXEL_BUFFER_DESCRIPTOR_INFO_EXT STRUCTURE_TYPE_TEXEL_BUFFER_DESCRIPTOR_INFO_EXT} value to the {@code sType} field. */
        public VkTexelBufferDescriptorInfoEXT.Buffer sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_TEXEL_BUFFER_DESCRIPTOR_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkTexelBufferDescriptorInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkTexelBufferDescriptorInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public VkTexelBufferDescriptorInfoEXT.Buffer format(@NativeType("VkFormat") int value) { VkTexelBufferDescriptorInfoEXT.nformat(address(), value); return this; }
        /** Copies the specified {@link VkDeviceAddressRangeEXT} to the {@code addressRange} field. */
        public VkTexelBufferDescriptorInfoEXT.Buffer addressRange(VkDeviceAddressRangeEXT value) { VkTexelBufferDescriptorInfoEXT.naddressRange(address(), value); return this; }
        /** Passes the {@code addressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkTexelBufferDescriptorInfoEXT.Buffer addressRange(java.util.function.Consumer<VkDeviceAddressRangeEXT> consumer) { consumer.accept(addressRange()); return this; }

    }

}