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
 * struct VkPhysicalDevicePipelineProtectedAccessFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 pipelineProtectedAccess;
 * }}</pre>
 */
public class VkPhysicalDevicePipelineProtectedAccessFeatures extends Struct<VkPhysicalDevicePipelineProtectedAccessFeatures> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINEPROTECTEDACCESS;

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
        PIPELINEPROTECTEDACCESS = layout.offsetof(2);
    }

    protected VkPhysicalDevicePipelineProtectedAccessFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePipelineProtectedAccessFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePipelineProtectedAccessFeatures(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePipelineProtectedAccessFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePipelineProtectedAccessFeatures(ByteBuffer container) {
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
    /** @return the value of the {@code pipelineProtectedAccess} field. */
    @NativeType("VkBool32")
    public boolean pipelineProtectedAccess() { return npipelineProtectedAccess(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePipelineProtectedAccessFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDevicePipelineProtectedAccessFeatures sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePipelineProtectedAccessFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineProtectedAccess} field. */
    public VkPhysicalDevicePipelineProtectedAccessFeatures pipelineProtectedAccess(@NativeType("VkBool32") boolean value) { npipelineProtectedAccess(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePipelineProtectedAccessFeatures set(
        int sType,
        long pNext,
        boolean pipelineProtectedAccess
    ) {
        sType(sType);
        pNext(pNext);
        pipelineProtectedAccess(pipelineProtectedAccess);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePipelineProtectedAccessFeatures set(VkPhysicalDevicePipelineProtectedAccessFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePipelineProtectedAccessFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineProtectedAccessFeatures malloc() {
        return new VkPhysicalDevicePipelineProtectedAccessFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineProtectedAccessFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineProtectedAccessFeatures calloc() {
        return new VkPhysicalDevicePipelineProtectedAccessFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineProtectedAccessFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePipelineProtectedAccessFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineProtectedAccessFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineProtectedAccessFeatures} instance for the specified memory address. */
    public static VkPhysicalDevicePipelineProtectedAccessFeatures create(long address) {
        return new VkPhysicalDevicePipelineProtectedAccessFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePipelineProtectedAccessFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePipelineProtectedAccessFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePipelineProtectedAccessFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineProtectedAccessFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineProtectedAccessFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineProtectedAccessFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineProtectedAccessFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineProtectedAccessFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineProtectedAccessFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineProtectedAccessFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePipelineProtectedAccessFeatures.PNEXT); }
    /** Unsafe version of {@link #pipelineProtectedAccess}. */
    public static int npipelineProtectedAccess(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineProtectedAccessFeatures.PIPELINEPROTECTEDACCESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePipelineProtectedAccessFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePipelineProtectedAccessFeatures.PNEXT, value); }
    /** Unsafe version of {@link #pipelineProtectedAccess(boolean) pipelineProtectedAccess}. */
    public static void npipelineProtectedAccess(long struct, int value) { memPutInt(struct + VkPhysicalDevicePipelineProtectedAccessFeatures.PIPELINEPROTECTEDACCESS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePipelineProtectedAccessFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineProtectedAccessFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePipelineProtectedAccessFeatures ELEMENT_FACTORY = VkPhysicalDevicePipelineProtectedAccessFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePipelineProtectedAccessFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePipelineProtectedAccessFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePipelineProtectedAccessFeatures.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePipelineProtectedAccessFeatures.npNext(address()); }
        /** @return the value of the {@code pipelineProtectedAccess} field. */
        @NativeType("VkBool32")
        public boolean pipelineProtectedAccess() { return VkPhysicalDevicePipelineProtectedAccessFeatures.npipelineProtectedAccess(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePipelineProtectedAccessFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePipelineProtectedAccessFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineProtectedAccess} field. */
        public VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer pipelineProtectedAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePipelineProtectedAccessFeatures.npipelineProtectedAccess(address(), value ? 1 : 0); return this; }

    }

}