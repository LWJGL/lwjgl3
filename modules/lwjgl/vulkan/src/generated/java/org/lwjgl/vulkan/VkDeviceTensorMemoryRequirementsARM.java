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
 * struct VkDeviceTensorMemoryRequirementsARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkTensorCreateInfoARM VkTensorCreateInfoARM} const * pCreateInfo;
 * }}</pre>
 */
public class VkDeviceTensorMemoryRequirementsARM extends Struct<VkDeviceTensorMemoryRequirementsARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PCREATEINFO;

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
        PCREATEINFO = layout.offsetof(2);
    }

    protected VkDeviceTensorMemoryRequirementsARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceTensorMemoryRequirementsARM create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceTensorMemoryRequirementsARM(address, container);
    }

    /**
     * Creates a {@code VkDeviceTensorMemoryRequirementsARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceTensorMemoryRequirementsARM(ByteBuffer container) {
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
    /** @return a {@link VkTensorCreateInfoARM} view of the struct pointed to by the {@code pCreateInfo} field. */
    @NativeType("VkTensorCreateInfoARM const *")
    public VkTensorCreateInfoARM pCreateInfo() { return npCreateInfo(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceTensorMemoryRequirementsARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_DEVICE_TENSOR_MEMORY_REQUIREMENTS_ARM STRUCTURE_TYPE_DEVICE_TENSOR_MEMORY_REQUIREMENTS_ARM} value to the {@code sType} field. */
    public VkDeviceTensorMemoryRequirementsARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_DEVICE_TENSOR_MEMORY_REQUIREMENTS_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceTensorMemoryRequirementsARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkTensorCreateInfoARM} to the {@code pCreateInfo} field. */
    public VkDeviceTensorMemoryRequirementsARM pCreateInfo(@NativeType("VkTensorCreateInfoARM const *") VkTensorCreateInfoARM value) { npCreateInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceTensorMemoryRequirementsARM set(
        int sType,
        long pNext,
        VkTensorCreateInfoARM pCreateInfo
    ) {
        sType(sType);
        pNext(pNext);
        pCreateInfo(pCreateInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceTensorMemoryRequirementsARM set(VkDeviceTensorMemoryRequirementsARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceTensorMemoryRequirementsARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceTensorMemoryRequirementsARM malloc() {
        return new VkDeviceTensorMemoryRequirementsARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceTensorMemoryRequirementsARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceTensorMemoryRequirementsARM calloc() {
        return new VkDeviceTensorMemoryRequirementsARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceTensorMemoryRequirementsARM} instance allocated with {@link BufferUtils}. */
    public static VkDeviceTensorMemoryRequirementsARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceTensorMemoryRequirementsARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceTensorMemoryRequirementsARM} instance for the specified memory address. */
    public static VkDeviceTensorMemoryRequirementsARM create(long address) {
        return new VkDeviceTensorMemoryRequirementsARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceTensorMemoryRequirementsARM createSafe(long address) {
        return address == NULL ? null : new VkDeviceTensorMemoryRequirementsARM(address, null);
    }

    /**
     * Returns a new {@link VkDeviceTensorMemoryRequirementsARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceTensorMemoryRequirementsARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceTensorMemoryRequirementsARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceTensorMemoryRequirementsARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceTensorMemoryRequirementsARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceTensorMemoryRequirementsARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceTensorMemoryRequirementsARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceTensorMemoryRequirementsARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceTensorMemoryRequirementsARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceTensorMemoryRequirementsARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceTensorMemoryRequirementsARM malloc(MemoryStack stack) {
        return new VkDeviceTensorMemoryRequirementsARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceTensorMemoryRequirementsARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceTensorMemoryRequirementsARM calloc(MemoryStack stack) {
        return new VkDeviceTensorMemoryRequirementsARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceTensorMemoryRequirementsARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceTensorMemoryRequirementsARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceTensorMemoryRequirementsARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceTensorMemoryRequirementsARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceTensorMemoryRequirementsARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceTensorMemoryRequirementsARM.PNEXT); }
    /** Unsafe version of {@link #pCreateInfo}. */
    public static VkTensorCreateInfoARM npCreateInfo(long struct) { return VkTensorCreateInfoARM.create(memGetAddress(struct + VkDeviceTensorMemoryRequirementsARM.PCREATEINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceTensorMemoryRequirementsARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceTensorMemoryRequirementsARM.PNEXT, value); }
    /** Unsafe version of {@link #pCreateInfo(VkTensorCreateInfoARM) pCreateInfo}. */
    public static void npCreateInfo(long struct, VkTensorCreateInfoARM value) { memPutAddress(struct + VkDeviceTensorMemoryRequirementsARM.PCREATEINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pCreateInfo = memGetAddress(struct + VkDeviceTensorMemoryRequirementsARM.PCREATEINFO);
        check(pCreateInfo);
        VkTensorCreateInfoARM.validate(pCreateInfo);
    }

    // -----------------------------------

    /** An array of {@link VkDeviceTensorMemoryRequirementsARM} structs. */
    public static class Buffer extends StructBuffer<VkDeviceTensorMemoryRequirementsARM, Buffer> implements NativeResource {

        private static final VkDeviceTensorMemoryRequirementsARM ELEMENT_FACTORY = VkDeviceTensorMemoryRequirementsARM.create(-1L);

        /**
         * Creates a new {@code VkDeviceTensorMemoryRequirementsARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceTensorMemoryRequirementsARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceTensorMemoryRequirementsARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceTensorMemoryRequirementsARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceTensorMemoryRequirementsARM.npNext(address()); }
        /** @return a {@link VkTensorCreateInfoARM} view of the struct pointed to by the {@code pCreateInfo} field. */
        @NativeType("VkTensorCreateInfoARM const *")
        public VkTensorCreateInfoARM pCreateInfo() { return VkDeviceTensorMemoryRequirementsARM.npCreateInfo(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceTensorMemoryRequirementsARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceTensorMemoryRequirementsARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_DEVICE_TENSOR_MEMORY_REQUIREMENTS_ARM STRUCTURE_TYPE_DEVICE_TENSOR_MEMORY_REQUIREMENTS_ARM} value to the {@code sType} field. */
        public VkDeviceTensorMemoryRequirementsARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_DEVICE_TENSOR_MEMORY_REQUIREMENTS_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceTensorMemoryRequirementsARM.Buffer pNext(@NativeType("void const *") long value) { VkDeviceTensorMemoryRequirementsARM.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkTensorCreateInfoARM} to the {@code pCreateInfo} field. */
        public VkDeviceTensorMemoryRequirementsARM.Buffer pCreateInfo(@NativeType("VkTensorCreateInfoARM const *") VkTensorCreateInfoARM value) { VkDeviceTensorMemoryRequirementsARM.npCreateInfo(address(), value); return this; }

    }

}