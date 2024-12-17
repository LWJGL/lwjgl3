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
 * struct VkPhysicalDeviceNestedCommandBufferPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxCommandBufferNestingLevel;
 * }}</pre>
 */
public class VkPhysicalDeviceNestedCommandBufferPropertiesEXT extends Struct<VkPhysicalDeviceNestedCommandBufferPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXCOMMANDBUFFERNESTINGLEVEL;

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
        MAXCOMMANDBUFFERNESTINGLEVEL = layout.offsetof(2);
    }

    protected VkPhysicalDeviceNestedCommandBufferPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceNestedCommandBufferPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceNestedCommandBufferPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code maxCommandBufferNestingLevel} field. */
    @NativeType("uint32_t")
    public int maxCommandBufferNestingLevel() { return nmaxCommandBufferNestingLevel(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTNestedCommandBuffer#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT sType$Default() { return sType(EXTNestedCommandBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code maxCommandBufferNestingLevel} field. */
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT maxCommandBufferNestingLevel(@NativeType("uint32_t") int value) { nmaxCommandBufferNestingLevel(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT set(
        int sType,
        long pNext,
        int maxCommandBufferNestingLevel
    ) {
        sType(sType);
        pNext(pNext);
        maxCommandBufferNestingLevel(maxCommandBufferNestingLevel);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT set(VkPhysicalDeviceNestedCommandBufferPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceNestedCommandBufferPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT malloc() {
        return new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceNestedCommandBufferPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT calloc() {
        return new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceNestedCommandBufferPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceNestedCommandBufferPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT create(long address) {
        return new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceNestedCommandBufferPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceNestedCommandBufferPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceNestedCommandBufferPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceNestedCommandBufferPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceNestedCommandBufferPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceNestedCommandBufferPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceNestedCommandBufferPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceNestedCommandBufferPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceNestedCommandBufferPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceNestedCommandBufferPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceNestedCommandBufferPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #maxCommandBufferNestingLevel}. */
    public static int nmaxCommandBufferNestingLevel(long struct) { return memGetInt(struct + VkPhysicalDeviceNestedCommandBufferPropertiesEXT.MAXCOMMANDBUFFERNESTINGLEVEL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceNestedCommandBufferPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceNestedCommandBufferPropertiesEXT.PNEXT, value); }
    /** Unsafe version of {@link #maxCommandBufferNestingLevel(int) maxCommandBufferNestingLevel}. */
    public static void nmaxCommandBufferNestingLevel(long struct, int value) { memPutInt(struct + VkPhysicalDeviceNestedCommandBufferPropertiesEXT.MAXCOMMANDBUFFERNESTINGLEVEL, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceNestedCommandBufferPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceNestedCommandBufferPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceNestedCommandBufferPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceNestedCommandBufferPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceNestedCommandBufferPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceNestedCommandBufferPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceNestedCommandBufferPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceNestedCommandBufferPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceNestedCommandBufferPropertiesEXT.npNext(address()); }
        /** @return the value of the {@code maxCommandBufferNestingLevel} field. */
        @NativeType("uint32_t")
        public int maxCommandBufferNestingLevel() { return VkPhysicalDeviceNestedCommandBufferPropertiesEXT.nmaxCommandBufferNestingLevel(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceNestedCommandBufferPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceNestedCommandBufferPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTNestedCommandBuffer#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceNestedCommandBufferPropertiesEXT.Buffer sType$Default() { return sType(EXTNestedCommandBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceNestedCommandBufferPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceNestedCommandBufferPropertiesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code maxCommandBufferNestingLevel} field. */
        public VkPhysicalDeviceNestedCommandBufferPropertiesEXT.Buffer maxCommandBufferNestingLevel(@NativeType("uint32_t") int value) { VkPhysicalDeviceNestedCommandBufferPropertiesEXT.nmaxCommandBufferNestingLevel(address(), value); return this; }

    }

}