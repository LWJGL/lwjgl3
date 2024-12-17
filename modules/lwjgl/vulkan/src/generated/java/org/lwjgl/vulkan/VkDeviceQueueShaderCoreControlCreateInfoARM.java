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
 * struct VkDeviceQueueShaderCoreControlCreateInfoARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t shaderCoreCount;
 * }}</pre>
 */
public class VkDeviceQueueShaderCoreControlCreateInfoARM extends Struct<VkDeviceQueueShaderCoreControlCreateInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERCORECOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERCORECOUNT = layout.offsetof(2);
    }

    protected VkDeviceQueueShaderCoreControlCreateInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceQueueShaderCoreControlCreateInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceQueueShaderCoreControlCreateInfoARM(address, container);
    }

    /**
     * Creates a {@code VkDeviceQueueShaderCoreControlCreateInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceQueueShaderCoreControlCreateInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code shaderCoreCount} field. */
    @NativeType("uint32_t")
    public int shaderCoreCount() { return nshaderCoreCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceQueueShaderCoreControlCreateInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMSchedulingControls#VK_STRUCTURE_TYPE_DEVICE_QUEUE_SHADER_CORE_CONTROL_CREATE_INFO_ARM STRUCTURE_TYPE_DEVICE_QUEUE_SHADER_CORE_CONTROL_CREATE_INFO_ARM} value to the {@code sType} field. */
    public VkDeviceQueueShaderCoreControlCreateInfoARM sType$Default() { return sType(ARMSchedulingControls.VK_STRUCTURE_TYPE_DEVICE_QUEUE_SHADER_CORE_CONTROL_CREATE_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceQueueShaderCoreControlCreateInfoARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderCoreCount} field. */
    public VkDeviceQueueShaderCoreControlCreateInfoARM shaderCoreCount(@NativeType("uint32_t") int value) { nshaderCoreCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceQueueShaderCoreControlCreateInfoARM set(
        int sType,
        long pNext,
        int shaderCoreCount
    ) {
        sType(sType);
        pNext(pNext);
        shaderCoreCount(shaderCoreCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceQueueShaderCoreControlCreateInfoARM set(VkDeviceQueueShaderCoreControlCreateInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceQueueShaderCoreControlCreateInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceQueueShaderCoreControlCreateInfoARM malloc() {
        return new VkDeviceQueueShaderCoreControlCreateInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceQueueShaderCoreControlCreateInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceQueueShaderCoreControlCreateInfoARM calloc() {
        return new VkDeviceQueueShaderCoreControlCreateInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceQueueShaderCoreControlCreateInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkDeviceQueueShaderCoreControlCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceQueueShaderCoreControlCreateInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceQueueShaderCoreControlCreateInfoARM} instance for the specified memory address. */
    public static VkDeviceQueueShaderCoreControlCreateInfoARM create(long address) {
        return new VkDeviceQueueShaderCoreControlCreateInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceQueueShaderCoreControlCreateInfoARM createSafe(long address) {
        return address == NULL ? null : new VkDeviceQueueShaderCoreControlCreateInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkDeviceQueueShaderCoreControlCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueShaderCoreControlCreateInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueShaderCoreControlCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueShaderCoreControlCreateInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueShaderCoreControlCreateInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueShaderCoreControlCreateInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceQueueShaderCoreControlCreateInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueShaderCoreControlCreateInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceQueueShaderCoreControlCreateInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceQueueShaderCoreControlCreateInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceQueueShaderCoreControlCreateInfoARM malloc(MemoryStack stack) {
        return new VkDeviceQueueShaderCoreControlCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceQueueShaderCoreControlCreateInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceQueueShaderCoreControlCreateInfoARM calloc(MemoryStack stack) {
        return new VkDeviceQueueShaderCoreControlCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceQueueShaderCoreControlCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueShaderCoreControlCreateInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueShaderCoreControlCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueShaderCoreControlCreateInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceQueueShaderCoreControlCreateInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceQueueShaderCoreControlCreateInfoARM.PNEXT); }
    /** Unsafe version of {@link #shaderCoreCount}. */
    public static int nshaderCoreCount(long struct) { return memGetInt(struct + VkDeviceQueueShaderCoreControlCreateInfoARM.SHADERCORECOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceQueueShaderCoreControlCreateInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceQueueShaderCoreControlCreateInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #shaderCoreCount(int) shaderCoreCount}. */
    public static void nshaderCoreCount(long struct, int value) { memPutInt(struct + VkDeviceQueueShaderCoreControlCreateInfoARM.SHADERCORECOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceQueueShaderCoreControlCreateInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkDeviceQueueShaderCoreControlCreateInfoARM, Buffer> implements NativeResource {

        private static final VkDeviceQueueShaderCoreControlCreateInfoARM ELEMENT_FACTORY = VkDeviceQueueShaderCoreControlCreateInfoARM.create(-1L);

        /**
         * Creates a new {@code VkDeviceQueueShaderCoreControlCreateInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceQueueShaderCoreControlCreateInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceQueueShaderCoreControlCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceQueueShaderCoreControlCreateInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDeviceQueueShaderCoreControlCreateInfoARM.npNext(address()); }
        /** @return the value of the {@code shaderCoreCount} field. */
        @NativeType("uint32_t")
        public int shaderCoreCount() { return VkDeviceQueueShaderCoreControlCreateInfoARM.nshaderCoreCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceQueueShaderCoreControlCreateInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceQueueShaderCoreControlCreateInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMSchedulingControls#VK_STRUCTURE_TYPE_DEVICE_QUEUE_SHADER_CORE_CONTROL_CREATE_INFO_ARM STRUCTURE_TYPE_DEVICE_QUEUE_SHADER_CORE_CONTROL_CREATE_INFO_ARM} value to the {@code sType} field. */
        public VkDeviceQueueShaderCoreControlCreateInfoARM.Buffer sType$Default() { return sType(ARMSchedulingControls.VK_STRUCTURE_TYPE_DEVICE_QUEUE_SHADER_CORE_CONTROL_CREATE_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceQueueShaderCoreControlCreateInfoARM.Buffer pNext(@NativeType("void *") long value) { VkDeviceQueueShaderCoreControlCreateInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderCoreCount} field. */
        public VkDeviceQueueShaderCoreControlCreateInfoARM.Buffer shaderCoreCount(@NativeType("uint32_t") int value) { VkDeviceQueueShaderCoreControlCreateInfoARM.nshaderCoreCount(address(), value); return this; }

    }

}