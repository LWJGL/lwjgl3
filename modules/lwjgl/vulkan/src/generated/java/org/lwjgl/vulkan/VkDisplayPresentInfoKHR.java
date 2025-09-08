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
 * <pre><code>
 * struct VkDisplayPresentInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkRect2D VkRect2D} srcRect;
 *     {@link VkRect2D VkRect2D} dstRect;
 *     VkBool32 persistent;
 * }</code></pre>
 */
public class VkDisplayPresentInfoKHR extends Struct<VkDisplayPresentInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCRECT,
        DSTRECT,
        PERSISTENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF),
            __member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCRECT = layout.offsetof(2);
        DSTRECT = layout.offsetof(3);
        PERSISTENT = layout.offsetof(4);
    }

    protected VkDisplayPresentInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDisplayPresentInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDisplayPresentInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkDisplayPresentInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayPresentInfoKHR(ByteBuffer container) {
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
    /** @return a {@link VkRect2D} view of the {@code srcRect} field. */
    public VkRect2D srcRect() { return nsrcRect(address()); }
    /** @return a {@link VkRect2D} view of the {@code dstRect} field. */
    public VkRect2D dstRect() { return ndstRect(address()); }
    /** @return the value of the {@code persistent} field. */
    @NativeType("VkBool32")
    public boolean persistent() { return npersistent(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkDisplayPresentInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDisplaySwapchain#VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR} value to the {@code sType} field. */
    public VkDisplayPresentInfoKHR sType$Default() { return sType(KHRDisplaySwapchain.VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDisplayPresentInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkRect2D} to the {@code srcRect} field. */
    public VkDisplayPresentInfoKHR srcRect(VkRect2D value) { nsrcRect(address(), value); return this; }
    /** Passes the {@code srcRect} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDisplayPresentInfoKHR srcRect(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(srcRect()); return this; }
    /** Copies the specified {@link VkRect2D} to the {@code dstRect} field. */
    public VkDisplayPresentInfoKHR dstRect(VkRect2D value) { ndstRect(address(), value); return this; }
    /** Passes the {@code dstRect} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDisplayPresentInfoKHR dstRect(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(dstRect()); return this; }
    /** Sets the specified value to the {@code persistent} field. */
    public VkDisplayPresentInfoKHR persistent(@NativeType("VkBool32") boolean value) { npersistent(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkDisplayPresentInfoKHR set(
        int sType,
        long pNext,
        VkRect2D srcRect,
        VkRect2D dstRect,
        boolean persistent
    ) {
        sType(sType);
        pNext(pNext);
        srcRect(srcRect);
        dstRect(dstRect);
        persistent(persistent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDisplayPresentInfoKHR set(VkDisplayPresentInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayPresentInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayPresentInfoKHR malloc() {
        return new VkDisplayPresentInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDisplayPresentInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayPresentInfoKHR calloc() {
        return new VkDisplayPresentInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDisplayPresentInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDisplayPresentInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplayPresentInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDisplayPresentInfoKHR} instance for the specified memory address. */
    public static VkDisplayPresentInfoKHR create(long address) {
        return new VkDisplayPresentInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDisplayPresentInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkDisplayPresentInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkDisplayPresentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPresentInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPresentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPresentInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPresentInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPresentInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDisplayPresentInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayPresentInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDisplayPresentInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPresentInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPresentInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPresentInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPresentInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPresentInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPresentInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPresentInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPresentInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDisplayPresentInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPresentInfoKHR malloc(MemoryStack stack) {
        return new VkDisplayPresentInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDisplayPresentInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPresentInfoKHR calloc(MemoryStack stack) {
        return new VkDisplayPresentInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDisplayPresentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPresentInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPresentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPresentInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDisplayPresentInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDisplayPresentInfoKHR.PNEXT); }
    /** Unsafe version of {@link #srcRect}. */
    public static VkRect2D nsrcRect(long struct) { return VkRect2D.create(struct + VkDisplayPresentInfoKHR.SRCRECT); }
    /** Unsafe version of {@link #dstRect}. */
    public static VkRect2D ndstRect(long struct) { return VkRect2D.create(struct + VkDisplayPresentInfoKHR.DSTRECT); }
    /** Unsafe version of {@link #persistent}. */
    public static int npersistent(long struct) { return memGetInt(struct + VkDisplayPresentInfoKHR.PERSISTENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDisplayPresentInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplayPresentInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #srcRect(VkRect2D) srcRect}. */
    public static void nsrcRect(long struct, VkRect2D value) { memCopy(value.address(), struct + VkDisplayPresentInfoKHR.SRCRECT, VkRect2D.SIZEOF); }
    /** Unsafe version of {@link #dstRect(VkRect2D) dstRect}. */
    public static void ndstRect(long struct, VkRect2D value) { memCopy(value.address(), struct + VkDisplayPresentInfoKHR.DSTRECT, VkRect2D.SIZEOF); }
    /** Unsafe version of {@link #persistent(boolean) persistent}. */
    public static void npersistent(long struct, int value) { memPutInt(struct + VkDisplayPresentInfoKHR.PERSISTENT, value); }

    // -----------------------------------

    /** An array of {@link VkDisplayPresentInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDisplayPresentInfoKHR, Buffer> implements NativeResource {

        private static final VkDisplayPresentInfoKHR ELEMENT_FACTORY = VkDisplayPresentInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDisplayPresentInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayPresentInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDisplayPresentInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDisplayPresentInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDisplayPresentInfoKHR.npNext(address()); }
        /** @return a {@link VkRect2D} view of the {@code srcRect} field. */
        public VkRect2D srcRect() { return VkDisplayPresentInfoKHR.nsrcRect(address()); }
        /** @return a {@link VkRect2D} view of the {@code dstRect} field. */
        public VkRect2D dstRect() { return VkDisplayPresentInfoKHR.ndstRect(address()); }
        /** @return the value of the {@code persistent} field. */
        @NativeType("VkBool32")
        public boolean persistent() { return VkDisplayPresentInfoKHR.npersistent(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkDisplayPresentInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDisplayPresentInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDisplaySwapchain#VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR} value to the {@code sType} field. */
        public VkDisplayPresentInfoKHR.Buffer sType$Default() { return sType(KHRDisplaySwapchain.VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDisplayPresentInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDisplayPresentInfoKHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkRect2D} to the {@code srcRect} field. */
        public VkDisplayPresentInfoKHR.Buffer srcRect(VkRect2D value) { VkDisplayPresentInfoKHR.nsrcRect(address(), value); return this; }
        /** Passes the {@code srcRect} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDisplayPresentInfoKHR.Buffer srcRect(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(srcRect()); return this; }
        /** Copies the specified {@link VkRect2D} to the {@code dstRect} field. */
        public VkDisplayPresentInfoKHR.Buffer dstRect(VkRect2D value) { VkDisplayPresentInfoKHR.ndstRect(address(), value); return this; }
        /** Passes the {@code dstRect} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDisplayPresentInfoKHR.Buffer dstRect(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(dstRect()); return this; }
        /** Sets the specified value to the {@code persistent} field. */
        public VkDisplayPresentInfoKHR.Buffer persistent(@NativeType("VkBool32") boolean value) { VkDisplayPresentInfoKHR.npersistent(address(), value ? 1 : 0); return this; }

    }

}