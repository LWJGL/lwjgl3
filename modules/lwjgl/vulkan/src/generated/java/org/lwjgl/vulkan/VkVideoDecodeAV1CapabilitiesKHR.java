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
 * struct VkVideoDecodeAV1CapabilitiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     StdVideoAV1Level maxLevel;
 * }}</pre>
 */
public class VkVideoDecodeAV1CapabilitiesKHR extends Struct<VkVideoDecodeAV1CapabilitiesKHR> implements NativeResource {

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

    protected VkVideoDecodeAV1CapabilitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeAV1CapabilitiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeAV1CapabilitiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoDecodeAV1CapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeAV1CapabilitiesKHR(ByteBuffer container) {
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
    @NativeType("StdVideoAV1Level")
    public int maxLevel() { return nmaxLevel(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoDecodeAV1CapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeAV1#VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_DECODE_AV1_CAPABILITIES_KHR} value to the {@code sType} field. */
    public VkVideoDecodeAV1CapabilitiesKHR sType$Default() { return sType(KHRVideoDecodeAV1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoDecodeAV1CapabilitiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeAV1CapabilitiesKHR set(
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
    public VkVideoDecodeAV1CapabilitiesKHR set(VkVideoDecodeAV1CapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeAV1CapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeAV1CapabilitiesKHR malloc() {
        return new VkVideoDecodeAV1CapabilitiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeAV1CapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeAV1CapabilitiesKHR calloc() {
        return new VkVideoDecodeAV1CapabilitiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeAV1CapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeAV1CapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeAV1CapabilitiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeAV1CapabilitiesKHR} instance for the specified memory address. */
    public static VkVideoDecodeAV1CapabilitiesKHR create(long address) {
        return new VkVideoDecodeAV1CapabilitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoDecodeAV1CapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeAV1CapabilitiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1CapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1CapabilitiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1CapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1CapabilitiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1CapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1CapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeAV1CapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1CapabilitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoDecodeAV1CapabilitiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeAV1CapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeAV1CapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeAV1CapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeAV1CapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeAV1CapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeAV1CapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1CapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1CapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1CapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1CapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoDecodeAV1CapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeAV1CapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #maxLevel}. */
    public static int nmaxLevel(long struct) { return memGetInt(struct + VkVideoDecodeAV1CapabilitiesKHR.MAXLEVEL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoDecodeAV1CapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeAV1CapabilitiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeAV1CapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeAV1CapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeAV1CapabilitiesKHR ELEMENT_FACTORY = VkVideoDecodeAV1CapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeAV1CapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeAV1CapabilitiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoDecodeAV1CapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeAV1CapabilitiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoDecodeAV1CapabilitiesKHR.npNext(address()); }
        /** @return the value of the {@code maxLevel} field. */
        @NativeType("StdVideoAV1Level")
        public int maxLevel() { return VkVideoDecodeAV1CapabilitiesKHR.nmaxLevel(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoDecodeAV1CapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeAV1CapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeAV1#VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_DECODE_AV1_CAPABILITIES_KHR} value to the {@code sType} field. */
        public VkVideoDecodeAV1CapabilitiesKHR.Buffer sType$Default() { return sType(KHRVideoDecodeAV1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoDecodeAV1CapabilitiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoDecodeAV1CapabilitiesKHR.npNext(address(), value); return this; }

    }

}