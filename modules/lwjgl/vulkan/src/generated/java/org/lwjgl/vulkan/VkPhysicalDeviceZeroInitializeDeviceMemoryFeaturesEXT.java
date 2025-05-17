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
 * struct VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 zeroInitializeDeviceMemory;
 * }}</pre>
 */
public class VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT extends Struct<VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ZEROINITIALIZEDEVICEMEMORY;

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
        ZEROINITIALIZEDEVICEMEMORY = layout.offsetof(2);
    }

    protected VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code zeroInitializeDeviceMemory} field. */
    @NativeType("VkBool32")
    public boolean zeroInitializeDeviceMemory() { return nzeroInitializeDeviceMemory(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTZeroInitializeDeviceMemory#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_DEVICE_MEMORY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_DEVICE_MEMORY_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT sType$Default() { return sType(EXTZeroInitializeDeviceMemory.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_DEVICE_MEMORY_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code zeroInitializeDeviceMemory} field. */
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT zeroInitializeDeviceMemory(@NativeType("VkBool32") boolean value) { nzeroInitializeDeviceMemory(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT set(
        int sType,
        long pNext,
        boolean zeroInitializeDeviceMemory
    ) {
        sType(sType);
        pNext(pNext);
        zeroInitializeDeviceMemory(zeroInitializeDeviceMemory);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT set(VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT malloc() {
        return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT calloc() {
        return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT create(long address) {
        return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #zeroInitializeDeviceMemory}. */
    public static int nzeroInitializeDeviceMemory(long struct) { return memGetInt(struct + VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.ZEROINITIALIZEDEVICEMEMORY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #zeroInitializeDeviceMemory(boolean) zeroInitializeDeviceMemory}. */
    public static void nzeroInitializeDeviceMemory(long struct, int value) { memPutInt(struct + VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.ZEROINITIALIZEDEVICEMEMORY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code zeroInitializeDeviceMemory} field. */
        @NativeType("VkBool32")
        public boolean zeroInitializeDeviceMemory() { return VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.nzeroInitializeDeviceMemory(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTZeroInitializeDeviceMemory#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_DEVICE_MEMORY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_DEVICE_MEMORY_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.Buffer sType$Default() { return sType(EXTZeroInitializeDeviceMemory.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_DEVICE_MEMORY_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code zeroInitializeDeviceMemory} field. */
        public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.Buffer zeroInitializeDeviceMemory(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT.nzeroInitializeDeviceMemory(address(), value ? 1 : 0); return this; }

    }

}