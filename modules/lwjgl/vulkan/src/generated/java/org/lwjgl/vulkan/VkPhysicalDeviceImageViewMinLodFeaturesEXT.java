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
 * struct VkPhysicalDeviceImageViewMinLodFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 minLod;
 * }}</pre>
 */
public class VkPhysicalDeviceImageViewMinLodFeaturesEXT extends Struct<VkPhysicalDeviceImageViewMinLodFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MINLOD;

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
        MINLOD = layout.offsetof(2);
    }

    protected VkPhysicalDeviceImageViewMinLodFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceImageViewMinLodFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceImageViewMinLodFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImageViewMinLodFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code minLod} field. */
    @NativeType("VkBool32")
    public boolean minLod() { return nminLod(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageViewMinLod#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_MIN_LOD_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_MIN_LOD_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT sType$Default() { return sType(EXTImageViewMinLod.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_MIN_LOD_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code minLod} field. */
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT minLod(@NativeType("VkBool32") boolean value) { nminLod(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT set(
        int sType,
        long pNext,
        boolean minLod
    ) {
        sType(sType);
        pNext(pNext);
        minLod(minLod);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT set(VkPhysicalDeviceImageViewMinLodFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageViewMinLodFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT malloc() {
        return new VkPhysicalDeviceImageViewMinLodFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageViewMinLodFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT calloc() {
        return new VkPhysicalDeviceImageViewMinLodFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageViewMinLodFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageViewMinLodFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageViewMinLodFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT create(long address) {
        return new VkPhysicalDeviceImageViewMinLodFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceImageViewMinLodFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceImageViewMinLodFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageViewMinLodFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageViewMinLodFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageViewMinLodFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageViewMinLodFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageViewMinLodFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageViewMinLodFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageViewMinLodFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageViewMinLodFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageViewMinLodFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageViewMinLodFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceImageViewMinLodFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageViewMinLodFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #minLod}. */
    public static int nminLod(long struct) { return memGetInt(struct + VkPhysicalDeviceImageViewMinLodFeaturesEXT.MINLOD); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageViewMinLodFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageViewMinLodFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #minLod(boolean) minLod}. */
    public static void nminLod(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageViewMinLodFeaturesEXT.MINLOD, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageViewMinLodFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageViewMinLodFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImageViewMinLodFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceImageViewMinLodFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageViewMinLodFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageViewMinLodFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceImageViewMinLodFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageViewMinLodFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceImageViewMinLodFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code minLod} field. */
        @NativeType("VkBool32")
        public boolean minLod() { return VkPhysicalDeviceImageViewMinLodFeaturesEXT.nminLod(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceImageViewMinLodFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageViewMinLodFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageViewMinLod#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_MIN_LOD_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_MIN_LOD_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceImageViewMinLodFeaturesEXT.Buffer sType$Default() { return sType(EXTImageViewMinLod.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_MIN_LOD_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceImageViewMinLodFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceImageViewMinLodFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code minLod} field. */
        public VkPhysicalDeviceImageViewMinLodFeaturesEXT.Buffer minLod(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceImageViewMinLodFeaturesEXT.nminLod(address(), value ? 1 : 0); return this; }

    }

}