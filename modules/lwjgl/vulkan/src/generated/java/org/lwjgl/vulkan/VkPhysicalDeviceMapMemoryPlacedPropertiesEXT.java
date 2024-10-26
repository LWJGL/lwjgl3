/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing the alignment requirements of placed memory maps for a physical device.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMapMemoryPlacedPropertiesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMapMemoryPlaced#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMapMemoryPlacedPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDeviceSize {@link #minPlacedMemoryMapAlignment};
 * }</code></pre>
 */
public class VkPhysicalDeviceMapMemoryPlacedPropertiesEXT extends Struct<VkPhysicalDeviceMapMemoryPlacedPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MINPLACEDMEMORYMAPALIGNMENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MINPLACEDMEMORYMAPALIGNMENT = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMapMemoryPlacedPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMapMemoryPlacedPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(ByteBuffer container) {
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
    /** the minimum alignment required for memory object offsets and virtual address ranges when using placed memory mapping. */
    @NativeType("VkDeviceSize")
    public long minPlacedMemoryMapAlignment() { return nminPlacedMemoryMapAlignment(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMapMemoryPlaced#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT sType$Default() { return sType(EXTMapMemoryPlaced.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT set(
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
    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT set(VkPhysicalDeviceMapMemoryPlacedPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMapMemoryPlacedPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT malloc() {
        return new VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMapMemoryPlacedPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT calloc() {
        return new VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMapMemoryPlacedPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMapMemoryPlacedPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT create(long address) {
        return new VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMapMemoryPlacedPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMapMemoryPlacedPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #minPlacedMemoryMapAlignment}. */
    public static long nminPlacedMemoryMapAlignment(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.MINPLACEDMEMORYMAPALIGNMENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMapMemoryPlacedPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMapMemoryPlacedPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMapMemoryPlacedPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMapMemoryPlacedPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMapMemoryPlacedPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMapMemoryPlacedPropertiesEXT#minPlacedMemoryMapAlignment} field. */
        @NativeType("VkDeviceSize")
        public long minPlacedMemoryMapAlignment() { return VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.nminPlacedMemoryMapAlignment(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMapMemoryPlaced#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.Buffer sType$Default() { return sType(EXTMapMemoryPlaced.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.npNext(address(), value); return this; }

    }

}