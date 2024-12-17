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
 * struct VkPhysicalDeviceRobustness2PropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDeviceSize robustStorageBufferAccessSizeAlignment;
 *     VkDeviceSize robustUniformBufferAccessSizeAlignment;
 * }}</pre>
 */
public class VkPhysicalDeviceRobustness2PropertiesEXT extends Struct<VkPhysicalDeviceRobustness2PropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ROBUSTSTORAGEBUFFERACCESSSIZEALIGNMENT,
        ROBUSTUNIFORMBUFFERACCESSSIZEALIGNMENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ROBUSTSTORAGEBUFFERACCESSSIZEALIGNMENT = layout.offsetof(2);
        ROBUSTUNIFORMBUFFERACCESSSIZEALIGNMENT = layout.offsetof(3);
    }

    protected VkPhysicalDeviceRobustness2PropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRobustness2PropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRobustness2PropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRobustness2PropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRobustness2PropertiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code robustStorageBufferAccessSizeAlignment} field. */
    @NativeType("VkDeviceSize")
    public long robustStorageBufferAccessSizeAlignment() { return nrobustStorageBufferAccessSizeAlignment(address()); }
    /** @return the value of the {@code robustUniformBufferAccessSizeAlignment} field. */
    @NativeType("VkDeviceSize")
    public long robustUniformBufferAccessSizeAlignment() { return nrobustUniformBufferAccessSizeAlignment(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceRobustness2PropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTRobustness2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceRobustness2PropertiesEXT sType$Default() { return sType(EXTRobustness2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceRobustness2PropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRobustness2PropertiesEXT set(
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
    public VkPhysicalDeviceRobustness2PropertiesEXT set(VkPhysicalDeviceRobustness2PropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRobustness2PropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRobustness2PropertiesEXT malloc() {
        return new VkPhysicalDeviceRobustness2PropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRobustness2PropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRobustness2PropertiesEXT calloc() {
        return new VkPhysicalDeviceRobustness2PropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRobustness2PropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRobustness2PropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRobustness2PropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRobustness2PropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceRobustness2PropertiesEXT create(long address) {
        return new VkPhysicalDeviceRobustness2PropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceRobustness2PropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRobustness2PropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2PropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2PropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2PropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2PropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2PropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2PropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRobustness2PropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2PropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceRobustness2PropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRobustness2PropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRobustness2PropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRobustness2PropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRobustness2PropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRobustness2PropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRobustness2PropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2PropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2PropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2PropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2PropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceRobustness2PropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRobustness2PropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #robustStorageBufferAccessSizeAlignment}. */
    public static long nrobustStorageBufferAccessSizeAlignment(long struct) { return memGetLong(struct + VkPhysicalDeviceRobustness2PropertiesEXT.ROBUSTSTORAGEBUFFERACCESSSIZEALIGNMENT); }
    /** Unsafe version of {@link #robustUniformBufferAccessSizeAlignment}. */
    public static long nrobustUniformBufferAccessSizeAlignment(long struct) { return memGetLong(struct + VkPhysicalDeviceRobustness2PropertiesEXT.ROBUSTUNIFORMBUFFERACCESSSIZEALIGNMENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRobustness2PropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRobustness2PropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRobustness2PropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRobustness2PropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRobustness2PropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceRobustness2PropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRobustness2PropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRobustness2PropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRobustness2PropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRobustness2PropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRobustness2PropertiesEXT.npNext(address()); }
        /** @return the value of the {@code robustStorageBufferAccessSizeAlignment} field. */
        @NativeType("VkDeviceSize")
        public long robustStorageBufferAccessSizeAlignment() { return VkPhysicalDeviceRobustness2PropertiesEXT.nrobustStorageBufferAccessSizeAlignment(address()); }
        /** @return the value of the {@code robustUniformBufferAccessSizeAlignment} field. */
        @NativeType("VkDeviceSize")
        public long robustUniformBufferAccessSizeAlignment() { return VkPhysicalDeviceRobustness2PropertiesEXT.nrobustUniformBufferAccessSizeAlignment(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceRobustness2PropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRobustness2PropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTRobustness2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceRobustness2PropertiesEXT.Buffer sType$Default() { return sType(EXTRobustness2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceRobustness2PropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRobustness2PropertiesEXT.npNext(address(), value); return this; }

    }

}