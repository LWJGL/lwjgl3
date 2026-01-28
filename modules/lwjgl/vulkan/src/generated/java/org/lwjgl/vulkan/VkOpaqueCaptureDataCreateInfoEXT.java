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
 * struct VkOpaqueCaptureDataCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkHostAddressRangeConstEXT VkHostAddressRangeConstEXT} const * pData;
 * }</code></pre>
 */
public class VkOpaqueCaptureDataCreateInfoEXT extends Struct<VkOpaqueCaptureDataCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PDATA;

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
        PDATA = layout.offsetof(2);
    }

    protected VkOpaqueCaptureDataCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkOpaqueCaptureDataCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkOpaqueCaptureDataCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkOpaqueCaptureDataCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkOpaqueCaptureDataCreateInfoEXT(ByteBuffer container) {
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
    /** @return a {@link VkHostAddressRangeConstEXT} view of the struct pointed to by the {@code pData} field. */
    @NativeType("VkHostAddressRangeConstEXT const *")
    public @Nullable VkHostAddressRangeConstEXT pData() { return npData(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkOpaqueCaptureDataCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DATA_CREATE_INFO_EXT STRUCTURE_TYPE_OPAQUE_CAPTURE_DATA_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkOpaqueCaptureDataCreateInfoEXT sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DATA_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkOpaqueCaptureDataCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkHostAddressRangeConstEXT} to the {@code pData} field. */
    public VkOpaqueCaptureDataCreateInfoEXT pData(@Nullable @NativeType("VkHostAddressRangeConstEXT const *") VkHostAddressRangeConstEXT value) { npData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkOpaqueCaptureDataCreateInfoEXT set(
        int sType,
        long pNext,
        @Nullable VkHostAddressRangeConstEXT pData
    ) {
        sType(sType);
        pNext(pNext);
        pData(pData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkOpaqueCaptureDataCreateInfoEXT set(VkOpaqueCaptureDataCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkOpaqueCaptureDataCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkOpaqueCaptureDataCreateInfoEXT malloc() {
        return new VkOpaqueCaptureDataCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkOpaqueCaptureDataCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkOpaqueCaptureDataCreateInfoEXT calloc() {
        return new VkOpaqueCaptureDataCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkOpaqueCaptureDataCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkOpaqueCaptureDataCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkOpaqueCaptureDataCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkOpaqueCaptureDataCreateInfoEXT} instance for the specified memory address. */
    public static VkOpaqueCaptureDataCreateInfoEXT create(long address) {
        return new VkOpaqueCaptureDataCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkOpaqueCaptureDataCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkOpaqueCaptureDataCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkOpaqueCaptureDataCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpaqueCaptureDataCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkOpaqueCaptureDataCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpaqueCaptureDataCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOpaqueCaptureDataCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpaqueCaptureDataCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkOpaqueCaptureDataCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkOpaqueCaptureDataCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkOpaqueCaptureDataCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkOpaqueCaptureDataCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOpaqueCaptureDataCreateInfoEXT malloc(MemoryStack stack) {
        return new VkOpaqueCaptureDataCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkOpaqueCaptureDataCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOpaqueCaptureDataCreateInfoEXT calloc(MemoryStack stack) {
        return new VkOpaqueCaptureDataCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkOpaqueCaptureDataCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkOpaqueCaptureDataCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOpaqueCaptureDataCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkOpaqueCaptureDataCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkOpaqueCaptureDataCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkOpaqueCaptureDataCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #pData}. */
    public static @Nullable VkHostAddressRangeConstEXT npData(long struct) { return VkHostAddressRangeConstEXT.createSafe(memGetAddress(struct + VkOpaqueCaptureDataCreateInfoEXT.PDATA)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkOpaqueCaptureDataCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkOpaqueCaptureDataCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #pData(VkHostAddressRangeConstEXT) pData}. */
    public static void npData(long struct, @Nullable VkHostAddressRangeConstEXT value) { memPutAddress(struct + VkOpaqueCaptureDataCreateInfoEXT.PDATA, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pData = memGetAddress(struct + VkOpaqueCaptureDataCreateInfoEXT.PDATA);
        if (pData != NULL) {
            VkHostAddressRangeConstEXT.validate(pData);
        }
    }

    // -----------------------------------

    /** An array of {@link VkOpaqueCaptureDataCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkOpaqueCaptureDataCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkOpaqueCaptureDataCreateInfoEXT ELEMENT_FACTORY = VkOpaqueCaptureDataCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkOpaqueCaptureDataCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkOpaqueCaptureDataCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkOpaqueCaptureDataCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkOpaqueCaptureDataCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkOpaqueCaptureDataCreateInfoEXT.npNext(address()); }
        /** @return a {@link VkHostAddressRangeConstEXT} view of the struct pointed to by the {@code pData} field. */
        @NativeType("VkHostAddressRangeConstEXT const *")
        public @Nullable VkHostAddressRangeConstEXT pData() { return VkOpaqueCaptureDataCreateInfoEXT.npData(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkOpaqueCaptureDataCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkOpaqueCaptureDataCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DATA_CREATE_INFO_EXT STRUCTURE_TYPE_OPAQUE_CAPTURE_DATA_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkOpaqueCaptureDataCreateInfoEXT.Buffer sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DATA_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkOpaqueCaptureDataCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkOpaqueCaptureDataCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkHostAddressRangeConstEXT} to the {@code pData} field. */
        public VkOpaqueCaptureDataCreateInfoEXT.Buffer pData(@Nullable @NativeType("VkHostAddressRangeConstEXT const *") VkHostAddressRangeConstEXT value) { VkOpaqueCaptureDataCreateInfoEXT.npData(address(), value); return this; }

    }

}