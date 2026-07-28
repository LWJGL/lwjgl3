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
 * struct VkRenderingAttachmentFlagsInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkRenderingAttachmentFlagsKHR flags;
 * }}</pre>
 */
public class VkRenderingAttachmentFlagsInfoKHR extends Struct<VkRenderingAttachmentFlagsInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS;

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
        FLAGS = layout.offsetof(2);
    }

    protected VkRenderingAttachmentFlagsInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderingAttachmentFlagsInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkRenderingAttachmentFlagsInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkRenderingAttachmentFlagsInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderingAttachmentFlagsInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkRenderingAttachmentFlagsKHR")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderingAttachmentFlagsInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance10#VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_FLAGS_INFO_KHR STRUCTURE_TYPE_RENDERING_ATTACHMENT_FLAGS_INFO_KHR} value to the {@code sType} field. */
    public VkRenderingAttachmentFlagsInfoKHR sType$Default() { return sType(KHRMaintenance10.VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_FLAGS_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderingAttachmentFlagsInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkRenderingAttachmentFlagsInfoKHR flags(@NativeType("VkRenderingAttachmentFlagsKHR") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderingAttachmentFlagsInfoKHR set(
        int sType,
        long pNext,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderingAttachmentFlagsInfoKHR set(VkRenderingAttachmentFlagsInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderingAttachmentFlagsInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderingAttachmentFlagsInfoKHR malloc() {
        return new VkRenderingAttachmentFlagsInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingAttachmentFlagsInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderingAttachmentFlagsInfoKHR calloc() {
        return new VkRenderingAttachmentFlagsInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingAttachmentFlagsInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkRenderingAttachmentFlagsInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingAttachmentFlagsInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderingAttachmentFlagsInfoKHR} instance for the specified memory address. */
    public static VkRenderingAttachmentFlagsInfoKHR create(long address) {
        return new VkRenderingAttachmentFlagsInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderingAttachmentFlagsInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkRenderingAttachmentFlagsInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentFlagsInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentFlagsInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentFlagsInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentFlagsInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentFlagsInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentFlagsInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderingAttachmentFlagsInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentFlagsInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderingAttachmentFlagsInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderingAttachmentFlagsInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingAttachmentFlagsInfoKHR malloc(MemoryStack stack) {
        return new VkRenderingAttachmentFlagsInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderingAttachmentFlagsInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingAttachmentFlagsInfoKHR calloc(MemoryStack stack) {
        return new VkRenderingAttachmentFlagsInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentFlagsInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentFlagsInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentFlagsInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentFlagsInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderingAttachmentFlagsInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderingAttachmentFlagsInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkRenderingAttachmentFlagsInfoKHR.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderingAttachmentFlagsInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderingAttachmentFlagsInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkRenderingAttachmentFlagsInfoKHR.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkRenderingAttachmentFlagsInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkRenderingAttachmentFlagsInfoKHR, Buffer> implements NativeResource {

        private static final VkRenderingAttachmentFlagsInfoKHR ELEMENT_FACTORY = VkRenderingAttachmentFlagsInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkRenderingAttachmentFlagsInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderingAttachmentFlagsInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderingAttachmentFlagsInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderingAttachmentFlagsInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderingAttachmentFlagsInfoKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkRenderingAttachmentFlagsKHR")
        public int flags() { return VkRenderingAttachmentFlagsInfoKHR.nflags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderingAttachmentFlagsInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderingAttachmentFlagsInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance10#VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_FLAGS_INFO_KHR STRUCTURE_TYPE_RENDERING_ATTACHMENT_FLAGS_INFO_KHR} value to the {@code sType} field. */
        public VkRenderingAttachmentFlagsInfoKHR.Buffer sType$Default() { return sType(KHRMaintenance10.VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_FLAGS_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderingAttachmentFlagsInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkRenderingAttachmentFlagsInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkRenderingAttachmentFlagsInfoKHR.Buffer flags(@NativeType("VkRenderingAttachmentFlagsKHR") int value) { VkRenderingAttachmentFlagsInfoKHR.nflags(address(), value); return this; }

    }

}