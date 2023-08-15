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
 * Structure describing the opacity micromap properties of a physical device.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceOpacityMicromapPropertiesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceOpacityMicromapPropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #maxOpacity2StateSubdivisionLevel};
 *     uint32_t {@link #maxOpacity4StateSubdivisionLevel};
 * }</code></pre>
 */
public class VkPhysicalDeviceOpacityMicromapPropertiesEXT extends Struct<VkPhysicalDeviceOpacityMicromapPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXOPACITY2STATESUBDIVISIONLEVEL,
        MAXOPACITY4STATESUBDIVISIONLEVEL;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXOPACITY2STATESUBDIVISIONLEVEL = layout.offsetof(2);
        MAXOPACITY4STATESUBDIVISIONLEVEL = layout.offsetof(3);
    }

    protected VkPhysicalDeviceOpacityMicromapPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceOpacityMicromapPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceOpacityMicromapPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the maximum allowed {@code subdivisionLevel} when {@code format} is {@link EXTOpacityMicromap#VK_OPACITY_MICROMAP_FORMAT_2_STATE_EXT OPACITY_MICROMAP_FORMAT_2_STATE_EXT} */
    @NativeType("uint32_t")
    public int maxOpacity2StateSubdivisionLevel() { return nmaxOpacity2StateSubdivisionLevel(address()); }
    /** the maximum allowed {@code subdivisionLevel} when {@code format} is {@link EXTOpacityMicromap#VK_OPACITY_MICROMAP_FORMAT_4_STATE_EXT OPACITY_MICROMAP_FORMAT_4_STATE_EXT} */
    @NativeType("uint32_t")
    public int maxOpacity4StateSubdivisionLevel() { return nmaxOpacity4StateSubdivisionLevel(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT set(
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
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT set(VkPhysicalDeviceOpacityMicromapPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceOpacityMicromapPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT malloc() {
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceOpacityMicromapPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT calloc() {
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceOpacityMicromapPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceOpacityMicromapPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT create(long address) {
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceOpacityMicromapPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpacityMicromapPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpacityMicromapPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpacityMicromapPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceOpacityMicromapPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceOpacityMicromapPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceOpacityMicromapPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpacityMicromapPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpacityMicromapPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpacityMicromapPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceOpacityMicromapPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #maxOpacity2StateSubdivisionLevel}. */
    public static int nmaxOpacity2StateSubdivisionLevel(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpacityMicromapPropertiesEXT.MAXOPACITY2STATESUBDIVISIONLEVEL); }
    /** Unsafe version of {@link #maxOpacity4StateSubdivisionLevel}. */
    public static int nmaxOpacity4StateSubdivisionLevel(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpacityMicromapPropertiesEXT.MAXOPACITY4STATESUBDIVISIONLEVEL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceOpacityMicromapPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceOpacityMicromapPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceOpacityMicromapPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceOpacityMicromapPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceOpacityMicromapPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceOpacityMicromapPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceOpacityMicromapPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceOpacityMicromapPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceOpacityMicromapPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceOpacityMicromapPropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceOpacityMicromapPropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceOpacityMicromapPropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceOpacityMicromapPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceOpacityMicromapPropertiesEXT#maxOpacity2StateSubdivisionLevel} field. */
        @NativeType("uint32_t")
        public int maxOpacity2StateSubdivisionLevel() { return VkPhysicalDeviceOpacityMicromapPropertiesEXT.nmaxOpacity2StateSubdivisionLevel(address()); }
        /** @return the value of the {@link VkPhysicalDeviceOpacityMicromapPropertiesEXT#maxOpacity4StateSubdivisionLevel} field. */
        @NativeType("uint32_t")
        public int maxOpacity4StateSubdivisionLevel() { return VkPhysicalDeviceOpacityMicromapPropertiesEXT.nmaxOpacity4StateSubdivisionLevel(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceOpacityMicromapPropertiesEXT#sType} field. */
        public VkPhysicalDeviceOpacityMicromapPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceOpacityMicromapPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT} value to the {@link VkPhysicalDeviceOpacityMicromapPropertiesEXT#sType} field. */
        public VkPhysicalDeviceOpacityMicromapPropertiesEXT.Buffer sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceOpacityMicromapPropertiesEXT#pNext} field. */
        public VkPhysicalDeviceOpacityMicromapPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceOpacityMicromapPropertiesEXT.npNext(address(), value); return this; }

    }

}