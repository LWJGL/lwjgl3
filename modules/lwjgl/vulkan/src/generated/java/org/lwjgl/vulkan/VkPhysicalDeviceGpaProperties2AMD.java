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
 * struct VkPhysicalDeviceGpaProperties2AMD {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t revisionId;
 * }}</pre>
 */
public class VkPhysicalDeviceGpaProperties2AMD extends Struct<VkPhysicalDeviceGpaProperties2AMD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        REVISIONID;

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
        REVISIONID = layout.offsetof(2);
    }

    protected VkPhysicalDeviceGpaProperties2AMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceGpaProperties2AMD create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceGpaProperties2AMD(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceGpaProperties2AMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceGpaProperties2AMD(ByteBuffer container) {
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
    /** @return the value of the {@code revisionId} field. */
    @NativeType("uint32_t")
    public int revisionId() { return nrevisionId(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceGpaProperties2AMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDGpaInterface#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GPA_PROPERTIES_2_AMD STRUCTURE_TYPE_PHYSICAL_DEVICE_GPA_PROPERTIES_2_AMD} value to the {@code sType} field. */
    public VkPhysicalDeviceGpaProperties2AMD sType$Default() { return sType(AMDGpaInterface.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GPA_PROPERTIES_2_AMD); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceGpaProperties2AMD pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceGpaProperties2AMD set(
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
    public VkPhysicalDeviceGpaProperties2AMD set(VkPhysicalDeviceGpaProperties2AMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceGpaProperties2AMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGpaProperties2AMD malloc() {
        return new VkPhysicalDeviceGpaProperties2AMD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceGpaProperties2AMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGpaProperties2AMD calloc() {
        return new VkPhysicalDeviceGpaProperties2AMD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceGpaProperties2AMD} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceGpaProperties2AMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceGpaProperties2AMD(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceGpaProperties2AMD} instance for the specified memory address. */
    public static VkPhysicalDeviceGpaProperties2AMD create(long address) {
        return new VkPhysicalDeviceGpaProperties2AMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceGpaProperties2AMD createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceGpaProperties2AMD(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGpaProperties2AMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGpaProperties2AMD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGpaProperties2AMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGpaProperties2AMD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGpaProperties2AMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGpaProperties2AMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceGpaProperties2AMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGpaProperties2AMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceGpaProperties2AMD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceGpaProperties2AMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGpaProperties2AMD malloc(MemoryStack stack) {
        return new VkPhysicalDeviceGpaProperties2AMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceGpaProperties2AMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGpaProperties2AMD calloc(MemoryStack stack) {
        return new VkPhysicalDeviceGpaProperties2AMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGpaProperties2AMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGpaProperties2AMD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGpaProperties2AMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGpaProperties2AMD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceGpaProperties2AMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceGpaProperties2AMD.PNEXT); }
    /** Unsafe version of {@link #revisionId}. */
    public static int nrevisionId(long struct) { return memGetInt(struct + VkPhysicalDeviceGpaProperties2AMD.REVISIONID); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceGpaProperties2AMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceGpaProperties2AMD.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceGpaProperties2AMD} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceGpaProperties2AMD, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceGpaProperties2AMD ELEMENT_FACTORY = VkPhysicalDeviceGpaProperties2AMD.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceGpaProperties2AMD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceGpaProperties2AMD#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceGpaProperties2AMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceGpaProperties2AMD.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceGpaProperties2AMD.npNext(address()); }
        /** @return the value of the {@code revisionId} field. */
        @NativeType("uint32_t")
        public int revisionId() { return VkPhysicalDeviceGpaProperties2AMD.nrevisionId(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceGpaProperties2AMD.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceGpaProperties2AMD.nsType(address(), value); return this; }
        /** Sets the {@link AMDGpaInterface#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GPA_PROPERTIES_2_AMD STRUCTURE_TYPE_PHYSICAL_DEVICE_GPA_PROPERTIES_2_AMD} value to the {@code sType} field. */
        public VkPhysicalDeviceGpaProperties2AMD.Buffer sType$Default() { return sType(AMDGpaInterface.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GPA_PROPERTIES_2_AMD); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceGpaProperties2AMD.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceGpaProperties2AMD.npNext(address(), value); return this; }

    }

}