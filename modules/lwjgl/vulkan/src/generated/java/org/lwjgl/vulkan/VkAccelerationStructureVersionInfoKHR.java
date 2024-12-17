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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkAccelerationStructureVersionInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint8_t const * pVersionData;
 * }}</pre>
 */
public class VkAccelerationStructureVersionInfoKHR extends Struct<VkAccelerationStructureVersionInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PVERSIONDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PVERSIONDATA = layout.offsetof(2);
    }

    protected VkAccelerationStructureVersionInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureVersionInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureVersionInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureVersionInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureVersionInfoKHR(ByteBuffer container) {
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
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pVersionData} field. */
    @NativeType("uint8_t const *")
    public ByteBuffer pVersionData(int capacity) { return npVersionData(address(), capacity); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAccelerationStructureVersionInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR} value to the {@code sType} field. */
    public VkAccelerationStructureVersionInfoKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAccelerationStructureVersionInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pVersionData} field. */
    public VkAccelerationStructureVersionInfoKHR pVersionData(@NativeType("uint8_t const *") ByteBuffer value) { npVersionData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureVersionInfoKHR set(
        int sType,
        long pNext,
        ByteBuffer pVersionData
    ) {
        sType(sType);
        pNext(pNext);
        pVersionData(pVersionData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureVersionInfoKHR set(VkAccelerationStructureVersionInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureVersionInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureVersionInfoKHR malloc() {
        return new VkAccelerationStructureVersionInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureVersionInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureVersionInfoKHR calloc() {
        return new VkAccelerationStructureVersionInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureVersionInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureVersionInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureVersionInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureVersionInfoKHR} instance for the specified memory address. */
    public static VkAccelerationStructureVersionInfoKHR create(long address) {
        return new VkAccelerationStructureVersionInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureVersionInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureVersionInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureVersionInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureVersionInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureVersionInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureVersionInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureVersionInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureVersionInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureVersionInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureVersionInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureVersionInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureVersionInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureVersionInfoKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureVersionInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureVersionInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureVersionInfoKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureVersionInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureVersionInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureVersionInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureVersionInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureVersionInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureVersionInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureVersionInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pVersionData(int) pVersionData}. */
    public static ByteBuffer npVersionData(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + VkAccelerationStructureVersionInfoKHR.PVERSIONDATA), capacity); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureVersionInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureVersionInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pVersionData(ByteBuffer) pVersionData}. */
    public static void npVersionData(long struct, ByteBuffer value) { memPutAddress(struct + VkAccelerationStructureVersionInfoKHR.PVERSIONDATA, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkAccelerationStructureVersionInfoKHR.PVERSIONDATA));
    }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureVersionInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureVersionInfoKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureVersionInfoKHR ELEMENT_FACTORY = VkAccelerationStructureVersionInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureVersionInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureVersionInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureVersionInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureVersionInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureVersionInfoKHR.npNext(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pVersionData} field. */
        @NativeType("uint8_t const *")
        public ByteBuffer pVersionData(int capacity) { return VkAccelerationStructureVersionInfoKHR.npVersionData(address(), capacity); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAccelerationStructureVersionInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureVersionInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR} value to the {@code sType} field. */
        public VkAccelerationStructureVersionInfoKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAccelerationStructureVersionInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureVersionInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pVersionData} field. */
        public VkAccelerationStructureVersionInfoKHR.Buffer pVersionData(@NativeType("uint8_t const *") ByteBuffer value) { VkAccelerationStructureVersionInfoKHR.npVersionData(address(), value); return this; }

    }

}