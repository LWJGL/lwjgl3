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
 * struct VkPhysicalDeviceDynamicRenderingLocalReadFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 dynamicRenderingLocalRead;
 * }}</pre>
 */
public class VkPhysicalDeviceDynamicRenderingLocalReadFeatures extends Struct<VkPhysicalDeviceDynamicRenderingLocalReadFeatures> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DYNAMICRENDERINGLOCALREAD;

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
        DYNAMICRENDERINGLOCALREAD = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDynamicRenderingLocalReadFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDynamicRenderingLocalReadFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDynamicRenderingLocalReadFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures(ByteBuffer container) {
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
    /** @return the value of the {@code dynamicRenderingLocalRead} field. */
    @NativeType("VkBool32")
    public boolean dynamicRenderingLocalRead() { return ndynamicRenderingLocalRead(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code dynamicRenderingLocalRead} field. */
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures dynamicRenderingLocalRead(@NativeType("VkBool32") boolean value) { ndynamicRenderingLocalRead(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures set(
        int sType,
        long pNext,
        boolean dynamicRenderingLocalRead
    ) {
        sType(sType);
        pNext(pNext);
        dynamicRenderingLocalRead(dynamicRenderingLocalRead);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures set(VkPhysicalDeviceDynamicRenderingLocalReadFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingLocalReadFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures malloc() {
        return new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingLocalReadFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures calloc() {
        return new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingLocalReadFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingLocalReadFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures create(long address) {
        return new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDynamicRenderingLocalReadFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingLocalReadFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingLocalReadFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingLocalReadFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDynamicRenderingLocalReadFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDynamicRenderingLocalReadFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDynamicRenderingLocalReadFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingLocalReadFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingLocalReadFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDynamicRenderingLocalReadFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDynamicRenderingLocalReadFeatures.PNEXT); }
    /** Unsafe version of {@link #dynamicRenderingLocalRead}. */
    public static int ndynamicRenderingLocalRead(long struct) { return memGetInt(struct + VkPhysicalDeviceDynamicRenderingLocalReadFeatures.DYNAMICRENDERINGLOCALREAD); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDynamicRenderingLocalReadFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDynamicRenderingLocalReadFeatures.PNEXT, value); }
    /** Unsafe version of {@link #dynamicRenderingLocalRead(boolean) dynamicRenderingLocalRead}. */
    public static void ndynamicRenderingLocalRead(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDynamicRenderingLocalReadFeatures.DYNAMICRENDERINGLOCALREAD, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDynamicRenderingLocalReadFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDynamicRenderingLocalReadFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDynamicRenderingLocalReadFeatures ELEMENT_FACTORY = VkPhysicalDeviceDynamicRenderingLocalReadFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDynamicRenderingLocalReadFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDynamicRenderingLocalReadFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDynamicRenderingLocalReadFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDynamicRenderingLocalReadFeatures.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDynamicRenderingLocalReadFeatures.npNext(address()); }
        /** @return the value of the {@code dynamicRenderingLocalRead} field. */
        @NativeType("VkBool32")
        public boolean dynamicRenderingLocalRead() { return VkPhysicalDeviceDynamicRenderingLocalReadFeatures.ndynamicRenderingLocalRead(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDynamicRenderingLocalReadFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDynamicRenderingLocalReadFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceDynamicRenderingLocalReadFeatures.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDynamicRenderingLocalReadFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDynamicRenderingLocalReadFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code dynamicRenderingLocalRead} field. */
        public VkPhysicalDeviceDynamicRenderingLocalReadFeatures.Buffer dynamicRenderingLocalRead(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDynamicRenderingLocalReadFeatures.ndynamicRenderingLocalRead(address(), value ? 1 : 0); return this; }

    }

}