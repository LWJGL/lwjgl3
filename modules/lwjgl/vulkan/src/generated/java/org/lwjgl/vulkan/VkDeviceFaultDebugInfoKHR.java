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
 * struct VkDeviceFaultDebugInfoKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t vendorBinarySize;
 *     void * pVendorBinaryData;
 * }}</pre>
 */
public class VkDeviceFaultDebugInfoKHR extends Struct<VkDeviceFaultDebugInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VENDORBINARYSIZE,
        PVENDORBINARYDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VENDORBINARYSIZE = layout.offsetof(2);
        PVENDORBINARYDATA = layout.offsetof(3);
    }

    protected VkDeviceFaultDebugInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceFaultDebugInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceFaultDebugInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkDeviceFaultDebugInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceFaultDebugInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code vendorBinarySize} field. */
    @NativeType("uint32_t")
    public int vendorBinarySize() { return nvendorBinarySize(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pVendorBinaryData} field. */
    @NativeType("void *")
    public @Nullable ByteBuffer pVendorBinaryData() { return npVendorBinaryData(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceFaultDebugInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDeviceFault#VK_STRUCTURE_TYPE_DEVICE_FAULT_DEBUG_INFO_KHR STRUCTURE_TYPE_DEVICE_FAULT_DEBUG_INFO_KHR} value to the {@code sType} field. */
    public VkDeviceFaultDebugInfoKHR sType$Default() { return sType(KHRDeviceFault.VK_STRUCTURE_TYPE_DEVICE_FAULT_DEBUG_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceFaultDebugInfoKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDeviceFaultShaderAbortMessageInfoKHR} value to the {@code pNext} chain. */
    public VkDeviceFaultDebugInfoKHR pNext(VkDeviceFaultShaderAbortMessageInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkDeviceFaultDebugInfoKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceFaultDebugInfoKHR set(VkDeviceFaultDebugInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceFaultDebugInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultDebugInfoKHR malloc() {
        return new VkDeviceFaultDebugInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultDebugInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultDebugInfoKHR calloc() {
        return new VkDeviceFaultDebugInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultDebugInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceFaultDebugInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceFaultDebugInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceFaultDebugInfoKHR} instance for the specified memory address. */
    public static VkDeviceFaultDebugInfoKHR create(long address) {
        return new VkDeviceFaultDebugInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceFaultDebugInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkDeviceFaultDebugInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkDeviceFaultDebugInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultDebugInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultDebugInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultDebugInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultDebugInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultDebugInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceFaultDebugInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultDebugInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceFaultDebugInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceFaultDebugInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultDebugInfoKHR malloc(MemoryStack stack) {
        return new VkDeviceFaultDebugInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceFaultDebugInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultDebugInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceFaultDebugInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceFaultDebugInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultDebugInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultDebugInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultDebugInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceFaultDebugInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceFaultDebugInfoKHR.PNEXT); }
    /** Unsafe version of {@link #vendorBinarySize}. */
    public static int nvendorBinarySize(long struct) { return memGetInt(struct + VkDeviceFaultDebugInfoKHR.VENDORBINARYSIZE); }
    /** Unsafe version of {@link #pVendorBinaryData() pVendorBinaryData}. */
    public static @Nullable ByteBuffer npVendorBinaryData(long struct) { return memByteBufferSafe(memGetAddress(struct + VkDeviceFaultDebugInfoKHR.PVENDORBINARYDATA), nvendorBinarySize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceFaultDebugInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceFaultDebugInfoKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceFaultDebugInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDeviceFaultDebugInfoKHR, Buffer> implements NativeResource {

        private static final VkDeviceFaultDebugInfoKHR ELEMENT_FACTORY = VkDeviceFaultDebugInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceFaultDebugInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceFaultDebugInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceFaultDebugInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceFaultDebugInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDeviceFaultDebugInfoKHR.npNext(address()); }
        /** @return the value of the {@code vendorBinarySize} field. */
        @NativeType("uint32_t")
        public int vendorBinarySize() { return VkDeviceFaultDebugInfoKHR.nvendorBinarySize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pVendorBinaryData} field. */
        @NativeType("void *")
        public @Nullable ByteBuffer pVendorBinaryData() { return VkDeviceFaultDebugInfoKHR.npVendorBinaryData(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceFaultDebugInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceFaultDebugInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDeviceFault#VK_STRUCTURE_TYPE_DEVICE_FAULT_DEBUG_INFO_KHR STRUCTURE_TYPE_DEVICE_FAULT_DEBUG_INFO_KHR} value to the {@code sType} field. */
        public VkDeviceFaultDebugInfoKHR.Buffer sType$Default() { return sType(KHRDeviceFault.VK_STRUCTURE_TYPE_DEVICE_FAULT_DEBUG_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceFaultDebugInfoKHR.Buffer pNext(@NativeType("void *") long value) { VkDeviceFaultDebugInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDeviceFaultShaderAbortMessageInfoKHR} value to the {@code pNext} chain. */
        public VkDeviceFaultDebugInfoKHR.Buffer pNext(VkDeviceFaultShaderAbortMessageInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}