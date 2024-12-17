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
 * struct VkPhysicalDeviceSynchronization2Features {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 synchronization2;
 * }}</pre>
 */
public class VkPhysicalDeviceSynchronization2Features extends Struct<VkPhysicalDeviceSynchronization2Features> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SYNCHRONIZATION2;

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
        SYNCHRONIZATION2 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceSynchronization2Features(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceSynchronization2Features create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceSynchronization2Features(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSynchronization2Features} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSynchronization2Features(ByteBuffer container) {
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
    /** @return the value of the {@code synchronization2} field. */
    @NativeType("VkBool32")
    public boolean synchronization2() { return nsynchronization2(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceSynchronization2Features sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceSynchronization2Features sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceSynchronization2Features pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code synchronization2} field. */
    public VkPhysicalDeviceSynchronization2Features synchronization2(@NativeType("VkBool32") boolean value) { nsynchronization2(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSynchronization2Features set(
        int sType,
        long pNext,
        boolean synchronization2
    ) {
        sType(sType);
        pNext(pNext);
        synchronization2(synchronization2);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSynchronization2Features set(VkPhysicalDeviceSynchronization2Features src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSynchronization2Features} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSynchronization2Features malloc() {
        return new VkPhysicalDeviceSynchronization2Features(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSynchronization2Features} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSynchronization2Features calloc() {
        return new VkPhysicalDeviceSynchronization2Features(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSynchronization2Features} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSynchronization2Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSynchronization2Features(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSynchronization2Features} instance for the specified memory address. */
    public static VkPhysicalDeviceSynchronization2Features create(long address) {
        return new VkPhysicalDeviceSynchronization2Features(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceSynchronization2Features createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceSynchronization2Features(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSynchronization2Features.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSynchronization2Features.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSynchronization2Features.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSynchronization2Features.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSynchronization2Features.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSynchronization2Features.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceSynchronization2Features.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSynchronization2Features.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceSynchronization2Features.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSynchronization2Features} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSynchronization2Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSynchronization2Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSynchronization2Features} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSynchronization2Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSynchronization2Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSynchronization2Features.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSynchronization2Features.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSynchronization2Features.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSynchronization2Features.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceSynchronization2Features.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSynchronization2Features.PNEXT); }
    /** Unsafe version of {@link #synchronization2}. */
    public static int nsynchronization2(long struct) { return memGetInt(struct + VkPhysicalDeviceSynchronization2Features.SYNCHRONIZATION2); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSynchronization2Features.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSynchronization2Features.PNEXT, value); }
    /** Unsafe version of {@link #synchronization2(boolean) synchronization2}. */
    public static void nsynchronization2(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSynchronization2Features.SYNCHRONIZATION2, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSynchronization2Features} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSynchronization2Features, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSynchronization2Features ELEMENT_FACTORY = VkPhysicalDeviceSynchronization2Features.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSynchronization2Features.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSynchronization2Features#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceSynchronization2Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSynchronization2Features.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSynchronization2Features.npNext(address()); }
        /** @return the value of the {@code synchronization2} field. */
        @NativeType("VkBool32")
        public boolean synchronization2() { return VkPhysicalDeviceSynchronization2Features.nsynchronization2(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceSynchronization2Features.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSynchronization2Features.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceSynchronization2Features.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceSynchronization2Features.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSynchronization2Features.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code synchronization2} field. */
        public VkPhysicalDeviceSynchronization2Features.Buffer synchronization2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSynchronization2Features.nsynchronization2(address(), value ? 1 : 0); return this; }

    }

}