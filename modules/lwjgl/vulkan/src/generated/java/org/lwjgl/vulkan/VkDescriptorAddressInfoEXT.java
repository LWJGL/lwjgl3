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
 * struct VkDescriptorAddressInfoEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDeviceAddress address;
 *     VkDeviceSize range;
 *     VkFormat format;
 * }}</pre>
 */
public class VkDescriptorAddressInfoEXT extends Struct<VkDescriptorAddressInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ADDRESS,
        RANGE,
        FORMAT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ADDRESS = layout.offsetof(2);
        RANGE = layout.offsetof(3);
        FORMAT = layout.offsetof(4);
    }

    protected VkDescriptorAddressInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorAddressInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorAddressInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkDescriptorAddressInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorAddressInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code address} field. */
    @NativeType("VkDeviceAddress")
    public long address$() { return naddress$(address()); }
    /** @return the value of the {@code range} field. */
    @NativeType("VkDeviceSize")
    public long range() { return nrange(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDescriptorAddressInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT} value to the {@code sType} field. */
    public VkDescriptorAddressInfoEXT sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDescriptorAddressInfoEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code address} field. */
    public VkDescriptorAddressInfoEXT address$(@NativeType("VkDeviceAddress") long value) { naddress$(address(), value); return this; }
    /** Sets the specified value to the {@code range} field. */
    public VkDescriptorAddressInfoEXT range(@NativeType("VkDeviceSize") long value) { nrange(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public VkDescriptorAddressInfoEXT format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorAddressInfoEXT set(
        int sType,
        long pNext,
        long address$,
        long range,
        int format
    ) {
        sType(sType);
        pNext(pNext);
        address$(address$);
        range(range);
        format(format);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorAddressInfoEXT set(VkDescriptorAddressInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorAddressInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorAddressInfoEXT malloc() {
        return new VkDescriptorAddressInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorAddressInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorAddressInfoEXT calloc() {
        return new VkDescriptorAddressInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorAddressInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorAddressInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorAddressInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorAddressInfoEXT} instance for the specified memory address. */
    public static VkDescriptorAddressInfoEXT create(long address) {
        return new VkDescriptorAddressInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorAddressInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkDescriptorAddressInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorAddressInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAddressInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorAddressInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAddressInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorAddressInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAddressInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorAddressInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAddressInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorAddressInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorAddressInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorAddressInfoEXT malloc(MemoryStack stack) {
        return new VkDescriptorAddressInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorAddressInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorAddressInfoEXT calloc(MemoryStack stack) {
        return new VkDescriptorAddressInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorAddressInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAddressInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorAddressInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAddressInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDescriptorAddressInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorAddressInfoEXT.PNEXT); }
    /** Unsafe version of {@link #address$}. */
    public static long naddress$(long struct) { return memGetLong(struct + VkDescriptorAddressInfoEXT.ADDRESS); }
    /** Unsafe version of {@link #range}. */
    public static long nrange(long struct) { return memGetLong(struct + VkDescriptorAddressInfoEXT.RANGE); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkDescriptorAddressInfoEXT.FORMAT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDescriptorAddressInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorAddressInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #address$(long) address$}. */
    public static void naddress$(long struct, long value) { memPutLong(struct + VkDescriptorAddressInfoEXT.ADDRESS, value); }
    /** Unsafe version of {@link #range(long) range}. */
    public static void nrange(long struct, long value) { memPutLong(struct + VkDescriptorAddressInfoEXT.RANGE, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + VkDescriptorAddressInfoEXT.FORMAT, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorAddressInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorAddressInfoEXT, Buffer> implements NativeResource {

        private static final VkDescriptorAddressInfoEXT ELEMENT_FACTORY = VkDescriptorAddressInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorAddressInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorAddressInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorAddressInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorAddressInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDescriptorAddressInfoEXT.npNext(address()); }
        /** @return the value of the {@code address} field. */
        @NativeType("VkDeviceAddress")
        public long address$() { return VkDescriptorAddressInfoEXT.naddress$(address()); }
        /** @return the value of the {@code range} field. */
        @NativeType("VkDeviceSize")
        public long range() { return VkDescriptorAddressInfoEXT.nrange(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkDescriptorAddressInfoEXT.nformat(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDescriptorAddressInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorAddressInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT} value to the {@code sType} field. */
        public VkDescriptorAddressInfoEXT.Buffer sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDescriptorAddressInfoEXT.Buffer pNext(@NativeType("void *") long value) { VkDescriptorAddressInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code address} field. */
        public VkDescriptorAddressInfoEXT.Buffer address$(@NativeType("VkDeviceAddress") long value) { VkDescriptorAddressInfoEXT.naddress$(address(), value); return this; }
        /** Sets the specified value to the {@code range} field. */
        public VkDescriptorAddressInfoEXT.Buffer range(@NativeType("VkDeviceSize") long value) { VkDescriptorAddressInfoEXT.nrange(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public VkDescriptorAddressInfoEXT.Buffer format(@NativeType("VkFormat") int value) { VkDescriptorAddressInfoEXT.nformat(address(), value); return this; }

    }

}