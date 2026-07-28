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
 * struct VkSurfaceCapabilitiesPresentId2KHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 presentId2Supported;
 * }}</pre>
 */
public class VkSurfaceCapabilitiesPresentId2KHR extends Struct<VkSurfaceCapabilitiesPresentId2KHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTID2SUPPORTED;

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
        PRESENTID2SUPPORTED = layout.offsetof(2);
    }

    protected VkSurfaceCapabilitiesPresentId2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSurfaceCapabilitiesPresentId2KHR create(long address, @Nullable ByteBuffer container) {
        return new VkSurfaceCapabilitiesPresentId2KHR(address, container);
    }

    /**
     * Creates a {@code VkSurfaceCapabilitiesPresentId2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfaceCapabilitiesPresentId2KHR(ByteBuffer container) {
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
    /** @return the value of the {@code presentId2Supported} field. */
    @NativeType("VkBool32")
    public boolean presentId2Supported() { return npresentId2Supported(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkSurfaceCapabilitiesPresentId2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPresentId2#VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_ID_2_KHR STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_ID_2_KHR} value to the {@code sType} field. */
    public VkSurfaceCapabilitiesPresentId2KHR sType$Default() { return sType(KHRPresentId2.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_ID_2_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSurfaceCapabilitiesPresentId2KHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code presentId2Supported} field. */
    public VkSurfaceCapabilitiesPresentId2KHR presentId2Supported(@NativeType("VkBool32") boolean value) { npresentId2Supported(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkSurfaceCapabilitiesPresentId2KHR set(
        int sType,
        long pNext,
        boolean presentId2Supported
    ) {
        sType(sType);
        pNext(pNext);
        presentId2Supported(presentId2Supported);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSurfaceCapabilitiesPresentId2KHR set(VkSurfaceCapabilitiesPresentId2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfaceCapabilitiesPresentId2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfaceCapabilitiesPresentId2KHR malloc() {
        return new VkSurfaceCapabilitiesPresentId2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSurfaceCapabilitiesPresentId2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfaceCapabilitiesPresentId2KHR calloc() {
        return new VkSurfaceCapabilitiesPresentId2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSurfaceCapabilitiesPresentId2KHR} instance allocated with {@link BufferUtils}. */
    public static VkSurfaceCapabilitiesPresentId2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfaceCapabilitiesPresentId2KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSurfaceCapabilitiesPresentId2KHR} instance for the specified memory address. */
    public static VkSurfaceCapabilitiesPresentId2KHR create(long address) {
        return new VkSurfaceCapabilitiesPresentId2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSurfaceCapabilitiesPresentId2KHR createSafe(long address) {
        return address == NULL ? null : new VkSurfaceCapabilitiesPresentId2KHR(address, null);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesPresentId2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesPresentId2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesPresentId2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesPresentId2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesPresentId2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesPresentId2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSurfaceCapabilitiesPresentId2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesPresentId2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSurfaceCapabilitiesPresentId2KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSurfaceCapabilitiesPresentId2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceCapabilitiesPresentId2KHR malloc(MemoryStack stack) {
        return new VkSurfaceCapabilitiesPresentId2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSurfaceCapabilitiesPresentId2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceCapabilitiesPresentId2KHR calloc(MemoryStack stack) {
        return new VkSurfaceCapabilitiesPresentId2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesPresentId2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesPresentId2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesPresentId2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesPresentId2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSurfaceCapabilitiesPresentId2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSurfaceCapabilitiesPresentId2KHR.PNEXT); }
    /** Unsafe version of {@link #presentId2Supported}. */
    public static int npresentId2Supported(long struct) { return memGetInt(struct + VkSurfaceCapabilitiesPresentId2KHR.PRESENTID2SUPPORTED); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSurfaceCapabilitiesPresentId2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSurfaceCapabilitiesPresentId2KHR.PNEXT, value); }
    /** Unsafe version of {@link #presentId2Supported(boolean) presentId2Supported}. */
    public static void npresentId2Supported(long struct, int value) { memPutInt(struct + VkSurfaceCapabilitiesPresentId2KHR.PRESENTID2SUPPORTED, value); }

    // -----------------------------------

    /** An array of {@link VkSurfaceCapabilitiesPresentId2KHR} structs. */
    public static class Buffer extends StructBuffer<VkSurfaceCapabilitiesPresentId2KHR, Buffer> implements NativeResource {

        private static final VkSurfaceCapabilitiesPresentId2KHR ELEMENT_FACTORY = VkSurfaceCapabilitiesPresentId2KHR.create(-1L);

        /**
         * Creates a new {@code VkSurfaceCapabilitiesPresentId2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfaceCapabilitiesPresentId2KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSurfaceCapabilitiesPresentId2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSurfaceCapabilitiesPresentId2KHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSurfaceCapabilitiesPresentId2KHR.npNext(address()); }
        /** @return the value of the {@code presentId2Supported} field. */
        @NativeType("VkBool32")
        public boolean presentId2Supported() { return VkSurfaceCapabilitiesPresentId2KHR.npresentId2Supported(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkSurfaceCapabilitiesPresentId2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfaceCapabilitiesPresentId2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPresentId2#VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_ID_2_KHR STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_ID_2_KHR} value to the {@code sType} field. */
        public VkSurfaceCapabilitiesPresentId2KHR.Buffer sType$Default() { return sType(KHRPresentId2.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_ID_2_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSurfaceCapabilitiesPresentId2KHR.Buffer pNext(@NativeType("void *") long value) { VkSurfaceCapabilitiesPresentId2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code presentId2Supported} field. */
        public VkSurfaceCapabilitiesPresentId2KHR.Buffer presentId2Supported(@NativeType("VkBool32") boolean value) { VkSurfaceCapabilitiesPresentId2KHR.npresentId2Supported(address(), value ? 1 : 0); return this; }

    }

}