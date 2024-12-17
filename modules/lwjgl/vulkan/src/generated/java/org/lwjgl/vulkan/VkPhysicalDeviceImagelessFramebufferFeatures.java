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
 * struct VkPhysicalDeviceImagelessFramebufferFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 imagelessFramebuffer;
 * }}</pre>
 */
public class VkPhysicalDeviceImagelessFramebufferFeatures extends Struct<VkPhysicalDeviceImagelessFramebufferFeatures> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGELESSFRAMEBUFFER;

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
        IMAGELESSFRAMEBUFFER = layout.offsetof(2);
    }

    protected VkPhysicalDeviceImagelessFramebufferFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceImagelessFramebufferFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceImagelessFramebufferFeatures(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImagelessFramebufferFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImagelessFramebufferFeatures(ByteBuffer container) {
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
    /** @return the value of the {@code imagelessFramebuffer} field. */
    @NativeType("VkBool32")
    public boolean imagelessFramebuffer() { return nimagelessFramebuffer(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceImagelessFramebufferFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceImagelessFramebufferFeatures sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceImagelessFramebufferFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code imagelessFramebuffer} field. */
    public VkPhysicalDeviceImagelessFramebufferFeatures imagelessFramebuffer(@NativeType("VkBool32") boolean value) { nimagelessFramebuffer(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImagelessFramebufferFeatures set(
        int sType,
        long pNext,
        boolean imagelessFramebuffer
    ) {
        sType(sType);
        pNext(pNext);
        imagelessFramebuffer(imagelessFramebuffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImagelessFramebufferFeatures set(VkPhysicalDeviceImagelessFramebufferFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImagelessFramebufferFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImagelessFramebufferFeatures malloc() {
        return new VkPhysicalDeviceImagelessFramebufferFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImagelessFramebufferFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImagelessFramebufferFeatures calloc() {
        return new VkPhysicalDeviceImagelessFramebufferFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImagelessFramebufferFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImagelessFramebufferFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImagelessFramebufferFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImagelessFramebufferFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceImagelessFramebufferFeatures create(long address) {
        return new VkPhysicalDeviceImagelessFramebufferFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceImagelessFramebufferFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceImagelessFramebufferFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImagelessFramebufferFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImagelessFramebufferFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImagelessFramebufferFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImagelessFramebufferFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImagelessFramebufferFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImagelessFramebufferFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceImagelessFramebufferFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImagelessFramebufferFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceImagelessFramebufferFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImagelessFramebufferFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImagelessFramebufferFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImagelessFramebufferFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImagelessFramebufferFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImagelessFramebufferFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImagelessFramebufferFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImagelessFramebufferFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImagelessFramebufferFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImagelessFramebufferFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImagelessFramebufferFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceImagelessFramebufferFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImagelessFramebufferFeatures.PNEXT); }
    /** Unsafe version of {@link #imagelessFramebuffer}. */
    public static int nimagelessFramebuffer(long struct) { return memGetInt(struct + VkPhysicalDeviceImagelessFramebufferFeatures.IMAGELESSFRAMEBUFFER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImagelessFramebufferFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImagelessFramebufferFeatures.PNEXT, value); }
    /** Unsafe version of {@link #imagelessFramebuffer(boolean) imagelessFramebuffer}. */
    public static void nimagelessFramebuffer(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImagelessFramebufferFeatures.IMAGELESSFRAMEBUFFER, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImagelessFramebufferFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImagelessFramebufferFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImagelessFramebufferFeatures ELEMENT_FACTORY = VkPhysicalDeviceImagelessFramebufferFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImagelessFramebufferFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImagelessFramebufferFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceImagelessFramebufferFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImagelessFramebufferFeatures.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceImagelessFramebufferFeatures.npNext(address()); }
        /** @return the value of the {@code imagelessFramebuffer} field. */
        @NativeType("VkBool32")
        public boolean imagelessFramebuffer() { return VkPhysicalDeviceImagelessFramebufferFeatures.nimagelessFramebuffer(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceImagelessFramebufferFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImagelessFramebufferFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceImagelessFramebufferFeatures.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceImagelessFramebufferFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceImagelessFramebufferFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code imagelessFramebuffer} field. */
        public VkPhysicalDeviceImagelessFramebufferFeatures.Buffer imagelessFramebuffer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceImagelessFramebufferFeatures.nimagelessFramebuffer(address(), value ? 1 : 0); return this; }

    }

}