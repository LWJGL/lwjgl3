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
 * Structure containing memory map placement parameters.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@link VkMemoryMapInfoKHR}{@code ::flags} contains {@link EXTMapMemoryPlaced#VK_MEMORY_MAP_PLACED_BIT_EXT MEMORY_MAP_PLACED_BIT_EXT}, {@code pPlacedAddress} <b>must</b> not be {@code NULL}</li>
 * <li>{@code pPlacedAddress} <b>must</b> be aligned to an integer multiple of {@link VkPhysicalDeviceMapMemoryPlacedPropertiesEXT}{@code ::minPlacedMemoryMapAlignment}</li>
 * <li>The address range specified by {@code pPlacedAddress} and {@link VkMemoryMapInfoKHR}{@code ::size} <b>must</b> not overlap any existing Vulkan memory object mapping</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMapMemoryPlaced#VK_STRUCTURE_TYPE_MEMORY_MAP_PLACED_INFO_EXT STRUCTURE_TYPE_MEMORY_MAP_PLACED_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryMapPlacedInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     void * {@link #pPlacedAddress};
 * }</code></pre>
 */
public class VkMemoryMapPlacedInfoEXT extends Struct<VkMemoryMapPlacedInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PPLACEDADDRESS;

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
        PPLACEDADDRESS = layout.offsetof(2);
    }

    protected VkMemoryMapPlacedInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryMapPlacedInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryMapPlacedInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkMemoryMapPlacedInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryMapPlacedInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the virtual address at which to place the address. If {@link VkMemoryMapInfoKHR}{@code ::flags} does not contain {@link EXTMapMemoryPlaced#VK_MEMORY_MAP_PLACED_BIT_EXT MEMORY_MAP_PLACED_BIT_EXT}, this value is ignored. */
    @NativeType("void *")
    public long pPlacedAddress() { return npPlacedAddress(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMemoryMapPlacedInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMapMemoryPlaced#VK_STRUCTURE_TYPE_MEMORY_MAP_PLACED_INFO_EXT STRUCTURE_TYPE_MEMORY_MAP_PLACED_INFO_EXT} value to the {@link #sType} field. */
    public VkMemoryMapPlacedInfoEXT sType$Default() { return sType(EXTMapMemoryPlaced.VK_STRUCTURE_TYPE_MEMORY_MAP_PLACED_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMemoryMapPlacedInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #pPlacedAddress} field. */
    public VkMemoryMapPlacedInfoEXT pPlacedAddress(@NativeType("void *") long value) { npPlacedAddress(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryMapPlacedInfoEXT set(
        int sType,
        long pNext,
        long pPlacedAddress
    ) {
        sType(sType);
        pNext(pNext);
        pPlacedAddress(pPlacedAddress);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryMapPlacedInfoEXT set(VkMemoryMapPlacedInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryMapPlacedInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryMapPlacedInfoEXT malloc() {
        return new VkMemoryMapPlacedInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryMapPlacedInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryMapPlacedInfoEXT calloc() {
        return new VkMemoryMapPlacedInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryMapPlacedInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkMemoryMapPlacedInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryMapPlacedInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryMapPlacedInfoEXT} instance for the specified memory address. */
    public static VkMemoryMapPlacedInfoEXT create(long address) {
        return new VkMemoryMapPlacedInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryMapPlacedInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkMemoryMapPlacedInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkMemoryMapPlacedInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapPlacedInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryMapPlacedInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapPlacedInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryMapPlacedInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapPlacedInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryMapPlacedInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapPlacedInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryMapPlacedInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryMapPlacedInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryMapPlacedInfoEXT malloc(MemoryStack stack) {
        return new VkMemoryMapPlacedInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryMapPlacedInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryMapPlacedInfoEXT calloc(MemoryStack stack) {
        return new VkMemoryMapPlacedInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryMapPlacedInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapPlacedInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryMapPlacedInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapPlacedInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryMapPlacedInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryMapPlacedInfoEXT.PNEXT); }
    /** Unsafe version of {@link #pPlacedAddress}. */
    public static long npPlacedAddress(long struct) { return memGetAddress(struct + VkMemoryMapPlacedInfoEXT.PPLACEDADDRESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryMapPlacedInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryMapPlacedInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #pPlacedAddress(long) pPlacedAddress}. */
    public static void npPlacedAddress(long struct, long value) { memPutAddress(struct + VkMemoryMapPlacedInfoEXT.PPLACEDADDRESS, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryMapPlacedInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkMemoryMapPlacedInfoEXT, Buffer> implements NativeResource {

        private static final VkMemoryMapPlacedInfoEXT ELEMENT_FACTORY = VkMemoryMapPlacedInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkMemoryMapPlacedInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryMapPlacedInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryMapPlacedInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMemoryMapPlacedInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryMapPlacedInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkMemoryMapPlacedInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryMapPlacedInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkMemoryMapPlacedInfoEXT#pPlacedAddress} field. */
        @NativeType("void *")
        public long pPlacedAddress() { return VkMemoryMapPlacedInfoEXT.npPlacedAddress(address()); }

        /** Sets the specified value to the {@link VkMemoryMapPlacedInfoEXT#sType} field. */
        public VkMemoryMapPlacedInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryMapPlacedInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMapMemoryPlaced#VK_STRUCTURE_TYPE_MEMORY_MAP_PLACED_INFO_EXT STRUCTURE_TYPE_MEMORY_MAP_PLACED_INFO_EXT} value to the {@link VkMemoryMapPlacedInfoEXT#sType} field. */
        public VkMemoryMapPlacedInfoEXT.Buffer sType$Default() { return sType(EXTMapMemoryPlaced.VK_STRUCTURE_TYPE_MEMORY_MAP_PLACED_INFO_EXT); }
        /** Sets the specified value to the {@link VkMemoryMapPlacedInfoEXT#pNext} field. */
        public VkMemoryMapPlacedInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkMemoryMapPlacedInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryMapPlacedInfoEXT#pPlacedAddress} field. */
        public VkMemoryMapPlacedInfoEXT.Buffer pPlacedAddress(@NativeType("void *") long value) { VkMemoryMapPlacedInfoEXT.npPlacedAddress(address(), value); return this; }

    }

}