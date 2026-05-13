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
 * struct VkPhysicalDeviceShaderSplitBarrierPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t splitBarrierReservedSharedMemory;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderSplitBarrierPropertiesEXT extends Struct<VkPhysicalDeviceShaderSplitBarrierPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SPLITBARRIERRESERVEDSHAREDMEMORY;

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
        SPLITBARRIERRESERVEDSHAREDMEMORY = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderSplitBarrierPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderSplitBarrierPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderSplitBarrierPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderSplitBarrierPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderSplitBarrierPropertiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code splitBarrierReservedSharedMemory} field. */
    @NativeType("uint32_t")
    public int splitBarrierReservedSharedMemory() { return nsplitBarrierReservedSharedMemory(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderSplitBarrierPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderSplitBarrier#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SPLIT_BARRIER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SPLIT_BARRIER_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderSplitBarrierPropertiesEXT sType$Default() { return sType(EXTShaderSplitBarrier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SPLIT_BARRIER_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderSplitBarrierPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderSplitBarrierPropertiesEXT set(
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
    public VkPhysicalDeviceShaderSplitBarrierPropertiesEXT set(VkPhysicalDeviceShaderSplitBarrierPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderSplitBarrierPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSplitBarrierPropertiesEXT malloc() {
        return new VkPhysicalDeviceShaderSplitBarrierPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSplitBarrierPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSplitBarrierPropertiesEXT calloc() {
        return new VkPhysicalDeviceShaderSplitBarrierPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSplitBarrierPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderSplitBarrierPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderSplitBarrierPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSplitBarrierPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderSplitBarrierPropertiesEXT create(long address) {
        return new VkPhysicalDeviceShaderSplitBarrierPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderSplitBarrierPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderSplitBarrierPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSplitBarrierPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSplitBarrierPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSplitBarrierPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSplitBarrierPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSplitBarrierPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSplitBarrierPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #splitBarrierReservedSharedMemory}. */
    public static int nsplitBarrierReservedSharedMemory(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.SPLITBARRIERRESERVEDSHAREDMEMORY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderSplitBarrierPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderSplitBarrierPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderSplitBarrierPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderSplitBarrierPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderSplitBarrierPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.npNext(address()); }
        /** @return the value of the {@code splitBarrierReservedSharedMemory} field. */
        @NativeType("uint32_t")
        public int splitBarrierReservedSharedMemory() { return VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.nsplitBarrierReservedSharedMemory(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderSplitBarrier#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SPLIT_BARRIER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SPLIT_BARRIER_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.Buffer sType$Default() { return sType(EXTShaderSplitBarrier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SPLIT_BARRIER_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderSplitBarrierPropertiesEXT.npNext(address(), value); return this; }

    }

}