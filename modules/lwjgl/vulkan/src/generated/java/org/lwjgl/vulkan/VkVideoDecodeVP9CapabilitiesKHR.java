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

import org.lwjgl.vulkan.video.*;

/**
 * <pre>{@code
 * struct VkVideoDecodeVP9CapabilitiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     StdVideoVP9Level maxLevel;
 * }}</pre>
 */
public class VkVideoDecodeVP9CapabilitiesKHR extends Struct<VkVideoDecodeVP9CapabilitiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXLEVEL;

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
        MAXLEVEL = layout.offsetof(2);
    }

    protected VkVideoDecodeVP9CapabilitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeVP9CapabilitiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeVP9CapabilitiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoDecodeVP9CapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeVP9CapabilitiesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code maxLevel} field. */
    @NativeType("StdVideoVP9Level")
    public int maxLevel() { return nmaxLevel(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoDecodeVP9CapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeVP9#VK_STRUCTURE_TYPE_VIDEO_DECODE_VP9_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_DECODE_VP9_CAPABILITIES_KHR} value to the {@code sType} field. */
    public VkVideoDecodeVP9CapabilitiesKHR sType$Default() { return sType(KHRVideoDecodeVP9.VK_STRUCTURE_TYPE_VIDEO_DECODE_VP9_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoDecodeVP9CapabilitiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeVP9CapabilitiesKHR set(
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
    public VkVideoDecodeVP9CapabilitiesKHR set(VkVideoDecodeVP9CapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeVP9CapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeVP9CapabilitiesKHR malloc() {
        return new VkVideoDecodeVP9CapabilitiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeVP9CapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeVP9CapabilitiesKHR calloc() {
        return new VkVideoDecodeVP9CapabilitiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeVP9CapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeVP9CapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeVP9CapabilitiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeVP9CapabilitiesKHR} instance for the specified memory address. */
    public static VkVideoDecodeVP9CapabilitiesKHR create(long address) {
        return new VkVideoDecodeVP9CapabilitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoDecodeVP9CapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeVP9CapabilitiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeVP9CapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeVP9CapabilitiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeVP9CapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeVP9CapabilitiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeVP9CapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeVP9CapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeVP9CapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeVP9CapabilitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoDecodeVP9CapabilitiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeVP9CapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeVP9CapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeVP9CapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeVP9CapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeVP9CapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeVP9CapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeVP9CapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeVP9CapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeVP9CapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeVP9CapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoDecodeVP9CapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeVP9CapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #maxLevel}. */
    public static int nmaxLevel(long struct) { return memGetInt(struct + VkVideoDecodeVP9CapabilitiesKHR.MAXLEVEL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoDecodeVP9CapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeVP9CapabilitiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeVP9CapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeVP9CapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeVP9CapabilitiesKHR ELEMENT_FACTORY = VkVideoDecodeVP9CapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeVP9CapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeVP9CapabilitiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoDecodeVP9CapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeVP9CapabilitiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoDecodeVP9CapabilitiesKHR.npNext(address()); }
        /** @return the value of the {@code maxLevel} field. */
        @NativeType("StdVideoVP9Level")
        public int maxLevel() { return VkVideoDecodeVP9CapabilitiesKHR.nmaxLevel(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoDecodeVP9CapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeVP9CapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeVP9#VK_STRUCTURE_TYPE_VIDEO_DECODE_VP9_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_DECODE_VP9_CAPABILITIES_KHR} value to the {@code sType} field. */
        public VkVideoDecodeVP9CapabilitiesKHR.Buffer sType$Default() { return sType(KHRVideoDecodeVP9.VK_STRUCTURE_TYPE_VIDEO_DECODE_VP9_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoDecodeVP9CapabilitiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoDecodeVP9CapabilitiesKHR.npNext(address(), value); return this; }

    }

}