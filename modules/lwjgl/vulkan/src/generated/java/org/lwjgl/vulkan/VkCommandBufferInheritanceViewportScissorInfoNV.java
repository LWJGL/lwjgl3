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
 * struct VkCommandBufferInheritanceViewportScissorInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 viewportScissor2D;
 *     uint32_t viewportDepthCount;
 *     {@link VkViewport VkViewport} const * pViewportDepths;
 * }}</pre>
 */
public class VkCommandBufferInheritanceViewportScissorInfoNV extends Struct<VkCommandBufferInheritanceViewportScissorInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VIEWPORTSCISSOR2D,
        VIEWPORTDEPTHCOUNT,
        PVIEWPORTDEPTHS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIEWPORTSCISSOR2D = layout.offsetof(2);
        VIEWPORTDEPTHCOUNT = layout.offsetof(3);
        PVIEWPORTDEPTHS = layout.offsetof(4);
    }

    protected VkCommandBufferInheritanceViewportScissorInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCommandBufferInheritanceViewportScissorInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkCommandBufferInheritanceViewportScissorInfoNV(address, container);
    }

    /**
     * Creates a {@code VkCommandBufferInheritanceViewportScissorInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandBufferInheritanceViewportScissorInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code viewportScissor2D} field. */
    @NativeType("VkBool32")
    public boolean viewportScissor2D() { return nviewportScissor2D(address()) != 0; }
    /** @return the value of the {@code viewportDepthCount} field. */
    @NativeType("uint32_t")
    public int viewportDepthCount() { return nviewportDepthCount(address()); }
    /** @return a {@link VkViewport} view of the struct pointed to by the {@code pViewportDepths} field. */
    @NativeType("VkViewport const *")
    public @Nullable VkViewport pViewportDepths() { return npViewportDepths(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCommandBufferInheritanceViewportScissorInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVInheritedViewportScissor#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV} value to the {@code sType} field. */
    public VkCommandBufferInheritanceViewportScissorInfoNV sType$Default() { return sType(NVInheritedViewportScissor.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCommandBufferInheritanceViewportScissorInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code viewportScissor2D} field. */
    public VkCommandBufferInheritanceViewportScissorInfoNV viewportScissor2D(@NativeType("VkBool32") boolean value) { nviewportScissor2D(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code viewportDepthCount} field. */
    public VkCommandBufferInheritanceViewportScissorInfoNV viewportDepthCount(@NativeType("uint32_t") int value) { nviewportDepthCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkViewport} to the {@code pViewportDepths} field. */
    public VkCommandBufferInheritanceViewportScissorInfoNV pViewportDepths(@Nullable @NativeType("VkViewport const *") VkViewport value) { npViewportDepths(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCommandBufferInheritanceViewportScissorInfoNV set(
        int sType,
        long pNext,
        boolean viewportScissor2D,
        int viewportDepthCount,
        @Nullable VkViewport pViewportDepths
    ) {
        sType(sType);
        pNext(pNext);
        viewportScissor2D(viewportScissor2D);
        viewportDepthCount(viewportDepthCount);
        pViewportDepths(pViewportDepths);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCommandBufferInheritanceViewportScissorInfoNV set(VkCommandBufferInheritanceViewportScissorInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferInheritanceViewportScissorInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceViewportScissorInfoNV malloc() {
        return new VkCommandBufferInheritanceViewportScissorInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCommandBufferInheritanceViewportScissorInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceViewportScissorInfoNV calloc() {
        return new VkCommandBufferInheritanceViewportScissorInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCommandBufferInheritanceViewportScissorInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferInheritanceViewportScissorInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferInheritanceViewportScissorInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferInheritanceViewportScissorInfoNV} instance for the specified memory address. */
    public static VkCommandBufferInheritanceViewportScissorInfoNV create(long address) {
        return new VkCommandBufferInheritanceViewportScissorInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCommandBufferInheritanceViewportScissorInfoNV createSafe(long address) {
        return address == NULL ? null : new VkCommandBufferInheritanceViewportScissorInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceViewportScissorInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceViewportScissorInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceViewportScissorInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceViewportScissorInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceViewportScissorInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceViewportScissorInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCommandBufferInheritanceViewportScissorInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceViewportScissorInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCommandBufferInheritanceViewportScissorInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceViewportScissorInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceViewportScissorInfoNV malloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceViewportScissorInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceViewportScissorInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceViewportScissorInfoNV calloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceViewportScissorInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceViewportScissorInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceViewportScissorInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceViewportScissorInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceViewportScissorInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCommandBufferInheritanceViewportScissorInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferInheritanceViewportScissorInfoNV.PNEXT); }
    /** Unsafe version of {@link #viewportScissor2D}. */
    public static int nviewportScissor2D(long struct) { return memGetInt(struct + VkCommandBufferInheritanceViewportScissorInfoNV.VIEWPORTSCISSOR2D); }
    /** Unsafe version of {@link #viewportDepthCount}. */
    public static int nviewportDepthCount(long struct) { return memGetInt(struct + VkCommandBufferInheritanceViewportScissorInfoNV.VIEWPORTDEPTHCOUNT); }
    /** Unsafe version of {@link #pViewportDepths}. */
    public static @Nullable VkViewport npViewportDepths(long struct) { return VkViewport.createSafe(memGetAddress(struct + VkCommandBufferInheritanceViewportScissorInfoNV.PVIEWPORTDEPTHS)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceViewportScissorInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferInheritanceViewportScissorInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #viewportScissor2D(boolean) viewportScissor2D}. */
    public static void nviewportScissor2D(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceViewportScissorInfoNV.VIEWPORTSCISSOR2D, value); }
    /** Unsafe version of {@link #viewportDepthCount(int) viewportDepthCount}. */
    public static void nviewportDepthCount(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceViewportScissorInfoNV.VIEWPORTDEPTHCOUNT, value); }
    /** Unsafe version of {@link #pViewportDepths(VkViewport) pViewportDepths}. */
    public static void npViewportDepths(long struct, @Nullable VkViewport value) { memPutAddress(struct + VkCommandBufferInheritanceViewportScissorInfoNV.PVIEWPORTDEPTHS, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkCommandBufferInheritanceViewportScissorInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkCommandBufferInheritanceViewportScissorInfoNV, Buffer> implements NativeResource {

        private static final VkCommandBufferInheritanceViewportScissorInfoNV ELEMENT_FACTORY = VkCommandBufferInheritanceViewportScissorInfoNV.create(-1L);

        /**
         * Creates a new {@code VkCommandBufferInheritanceViewportScissorInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferInheritanceViewportScissorInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCommandBufferInheritanceViewportScissorInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandBufferInheritanceViewportScissorInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCommandBufferInheritanceViewportScissorInfoNV.npNext(address()); }
        /** @return the value of the {@code viewportScissor2D} field. */
        @NativeType("VkBool32")
        public boolean viewportScissor2D() { return VkCommandBufferInheritanceViewportScissorInfoNV.nviewportScissor2D(address()) != 0; }
        /** @return the value of the {@code viewportDepthCount} field. */
        @NativeType("uint32_t")
        public int viewportDepthCount() { return VkCommandBufferInheritanceViewportScissorInfoNV.nviewportDepthCount(address()); }
        /** @return a {@link VkViewport} view of the struct pointed to by the {@code pViewportDepths} field. */
        @NativeType("VkViewport const *")
        public @Nullable VkViewport pViewportDepths() { return VkCommandBufferInheritanceViewportScissorInfoNV.npViewportDepths(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCommandBufferInheritanceViewportScissorInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferInheritanceViewportScissorInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVInheritedViewportScissor#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV} value to the {@code sType} field. */
        public VkCommandBufferInheritanceViewportScissorInfoNV.Buffer sType$Default() { return sType(NVInheritedViewportScissor.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCommandBufferInheritanceViewportScissorInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkCommandBufferInheritanceViewportScissorInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code viewportScissor2D} field. */
        public VkCommandBufferInheritanceViewportScissorInfoNV.Buffer viewportScissor2D(@NativeType("VkBool32") boolean value) { VkCommandBufferInheritanceViewportScissorInfoNV.nviewportScissor2D(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code viewportDepthCount} field. */
        public VkCommandBufferInheritanceViewportScissorInfoNV.Buffer viewportDepthCount(@NativeType("uint32_t") int value) { VkCommandBufferInheritanceViewportScissorInfoNV.nviewportDepthCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkViewport} to the {@code pViewportDepths} field. */
        public VkCommandBufferInheritanceViewportScissorInfoNV.Buffer pViewportDepths(@Nullable @NativeType("VkViewport const *") VkViewport value) { VkCommandBufferInheritanceViewportScissorInfoNV.npViewportDepths(address(), value); return this; }

    }

}