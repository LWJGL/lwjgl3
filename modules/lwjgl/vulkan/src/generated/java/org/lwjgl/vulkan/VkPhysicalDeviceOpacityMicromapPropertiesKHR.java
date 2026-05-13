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
 * struct VkPhysicalDeviceOpacityMicromapPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxOpacity2StateSubdivisionLevel;
 *     uint32_t maxOpacity4StateSubdivisionLevel;
 *     uint32_t maxOpacityLossy4StateSubdivisionLevel;
 *     uint64_t maxMicromapTriangles;
 * }}</pre>
 */
public class VkPhysicalDeviceOpacityMicromapPropertiesKHR extends Struct<VkPhysicalDeviceOpacityMicromapPropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXOPACITY2STATESUBDIVISIONLEVEL,
        MAXOPACITY4STATESUBDIVISIONLEVEL,
        MAXOPACITYLOSSY4STATESUBDIVISIONLEVEL,
        MAXMICROMAPTRIANGLES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXOPACITY2STATESUBDIVISIONLEVEL = layout.offsetof(2);
        MAXOPACITY4STATESUBDIVISIONLEVEL = layout.offsetof(3);
        MAXOPACITYLOSSY4STATESUBDIVISIONLEVEL = layout.offsetof(4);
        MAXMICROMAPTRIANGLES = layout.offsetof(5);
    }

    protected VkPhysicalDeviceOpacityMicromapPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceOpacityMicromapPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceOpacityMicromapPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceOpacityMicromapPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceOpacityMicromapPropertiesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code maxOpacity2StateSubdivisionLevel} field. */
    @NativeType("uint32_t")
    public int maxOpacity2StateSubdivisionLevel() { return nmaxOpacity2StateSubdivisionLevel(address()); }
    /** @return the value of the {@code maxOpacity4StateSubdivisionLevel} field. */
    @NativeType("uint32_t")
    public int maxOpacity4StateSubdivisionLevel() { return nmaxOpacity4StateSubdivisionLevel(address()); }
    /** @return the value of the {@code maxOpacityLossy4StateSubdivisionLevel} field. */
    @NativeType("uint32_t")
    public int maxOpacityLossy4StateSubdivisionLevel() { return nmaxOpacityLossy4StateSubdivisionLevel(address()); }
    /** @return the value of the {@code maxMicromapTriangles} field. */
    @NativeType("uint64_t")
    public long maxMicromapTriangles() { return nmaxMicromapTriangles(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceOpacityMicromapPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHROpacityMicromap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceOpacityMicromapPropertiesKHR sType$Default() { return sType(KHROpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceOpacityMicromapPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceOpacityMicromapPropertiesKHR set(
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
    public VkPhysicalDeviceOpacityMicromapPropertiesKHR set(VkPhysicalDeviceOpacityMicromapPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceOpacityMicromapPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceOpacityMicromapPropertiesKHR malloc() {
        return new VkPhysicalDeviceOpacityMicromapPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceOpacityMicromapPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceOpacityMicromapPropertiesKHR calloc() {
        return new VkPhysicalDeviceOpacityMicromapPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceOpacityMicromapPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceOpacityMicromapPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceOpacityMicromapPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceOpacityMicromapPropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceOpacityMicromapPropertiesKHR create(long address) {
        return new VkPhysicalDeviceOpacityMicromapPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceOpacityMicromapPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceOpacityMicromapPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpacityMicromapPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpacityMicromapPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpacityMicromapPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpacityMicromapPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpacityMicromapPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpacityMicromapPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceOpacityMicromapPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpacityMicromapPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceOpacityMicromapPropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceOpacityMicromapPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceOpacityMicromapPropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceOpacityMicromapPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceOpacityMicromapPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceOpacityMicromapPropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceOpacityMicromapPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpacityMicromapPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpacityMicromapPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpacityMicromapPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpacityMicromapPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceOpacityMicromapPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceOpacityMicromapPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #maxOpacity2StateSubdivisionLevel}. */
    public static int nmaxOpacity2StateSubdivisionLevel(long struct) { return memGetInt(struct + VkPhysicalDeviceOpacityMicromapPropertiesKHR.MAXOPACITY2STATESUBDIVISIONLEVEL); }
    /** Unsafe version of {@link #maxOpacity4StateSubdivisionLevel}. */
    public static int nmaxOpacity4StateSubdivisionLevel(long struct) { return memGetInt(struct + VkPhysicalDeviceOpacityMicromapPropertiesKHR.MAXOPACITY4STATESUBDIVISIONLEVEL); }
    /** Unsafe version of {@link #maxOpacityLossy4StateSubdivisionLevel}. */
    public static int nmaxOpacityLossy4StateSubdivisionLevel(long struct) { return memGetInt(struct + VkPhysicalDeviceOpacityMicromapPropertiesKHR.MAXOPACITYLOSSY4STATESUBDIVISIONLEVEL); }
    /** Unsafe version of {@link #maxMicromapTriangles}. */
    public static long nmaxMicromapTriangles(long struct) { return memGetLong(struct + VkPhysicalDeviceOpacityMicromapPropertiesKHR.MAXMICROMAPTRIANGLES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceOpacityMicromapPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceOpacityMicromapPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceOpacityMicromapPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceOpacityMicromapPropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceOpacityMicromapPropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceOpacityMicromapPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceOpacityMicromapPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceOpacityMicromapPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceOpacityMicromapPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceOpacityMicromapPropertiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceOpacityMicromapPropertiesKHR.npNext(address()); }
        /** @return the value of the {@code maxOpacity2StateSubdivisionLevel} field. */
        @NativeType("uint32_t")
        public int maxOpacity2StateSubdivisionLevel() { return VkPhysicalDeviceOpacityMicromapPropertiesKHR.nmaxOpacity2StateSubdivisionLevel(address()); }
        /** @return the value of the {@code maxOpacity4StateSubdivisionLevel} field. */
        @NativeType("uint32_t")
        public int maxOpacity4StateSubdivisionLevel() { return VkPhysicalDeviceOpacityMicromapPropertiesKHR.nmaxOpacity4StateSubdivisionLevel(address()); }
        /** @return the value of the {@code maxOpacityLossy4StateSubdivisionLevel} field. */
        @NativeType("uint32_t")
        public int maxOpacityLossy4StateSubdivisionLevel() { return VkPhysicalDeviceOpacityMicromapPropertiesKHR.nmaxOpacityLossy4StateSubdivisionLevel(address()); }
        /** @return the value of the {@code maxMicromapTriangles} field. */
        @NativeType("uint64_t")
        public long maxMicromapTriangles() { return VkPhysicalDeviceOpacityMicromapPropertiesKHR.nmaxMicromapTriangles(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceOpacityMicromapPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceOpacityMicromapPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHROpacityMicromap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceOpacityMicromapPropertiesKHR.Buffer sType$Default() { return sType(KHROpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceOpacityMicromapPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceOpacityMicromapPropertiesKHR.npNext(address(), value); return this; }

    }

}