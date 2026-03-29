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
 * struct VkDeviceMemoryCopyKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkDeviceAddressRangeKHR VkDeviceAddressRangeKHR} srcRange;
 *     VkAddressCommandFlagsKHR srcFlags;
 *     {@link VkDeviceAddressRangeKHR VkDeviceAddressRangeKHR} dstRange;
 *     VkAddressCommandFlagsKHR dstFlags;
 * }</code></pre>
 */
public class VkDeviceMemoryCopyKHR extends Struct<VkDeviceMemoryCopyKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCRANGE,
        SRCFLAGS,
        DSTRANGE,
        DSTFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkDeviceAddressRangeKHR.SIZEOF, VkDeviceAddressRangeKHR.ALIGNOF),
            __member(4),
            __member(VkDeviceAddressRangeKHR.SIZEOF, VkDeviceAddressRangeKHR.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCRANGE = layout.offsetof(2);
        SRCFLAGS = layout.offsetof(3);
        DSTRANGE = layout.offsetof(4);
        DSTFLAGS = layout.offsetof(5);
    }

    protected VkDeviceMemoryCopyKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceMemoryCopyKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceMemoryCopyKHR(address, container);
    }

    /**
     * Creates a {@code VkDeviceMemoryCopyKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceMemoryCopyKHR(ByteBuffer container) {
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
    /** @return a {@link VkDeviceAddressRangeKHR} view of the {@code srcRange} field. */
    public VkDeviceAddressRangeKHR srcRange() { return nsrcRange(address()); }
    /** @return the value of the {@code srcFlags} field. */
    @NativeType("VkAddressCommandFlagsKHR")
    public int srcFlags() { return nsrcFlags(address()); }
    /** @return a {@link VkDeviceAddressRangeKHR} view of the {@code dstRange} field. */
    public VkDeviceAddressRangeKHR dstRange() { return ndstRange(address()); }
    /** @return the value of the {@code dstFlags} field. */
    @NativeType("VkAddressCommandFlagsKHR")
    public int dstFlags() { return ndstFlags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceMemoryCopyKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_DEVICE_MEMORY_COPY_KHR STRUCTURE_TYPE_DEVICE_MEMORY_COPY_KHR} value to the {@code sType} field. */
    public VkDeviceMemoryCopyKHR sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_DEVICE_MEMORY_COPY_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceMemoryCopyKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkDeviceAddressRangeKHR} to the {@code srcRange} field. */
    public VkDeviceMemoryCopyKHR srcRange(VkDeviceAddressRangeKHR value) { nsrcRange(address(), value); return this; }
    /** Passes the {@code srcRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDeviceMemoryCopyKHR srcRange(java.util.function.Consumer<VkDeviceAddressRangeKHR> consumer) { consumer.accept(srcRange()); return this; }
    /** Sets the specified value to the {@code srcFlags} field. */
    public VkDeviceMemoryCopyKHR srcFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { nsrcFlags(address(), value); return this; }
    /** Copies the specified {@link VkDeviceAddressRangeKHR} to the {@code dstRange} field. */
    public VkDeviceMemoryCopyKHR dstRange(VkDeviceAddressRangeKHR value) { ndstRange(address(), value); return this; }
    /** Passes the {@code dstRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDeviceMemoryCopyKHR dstRange(java.util.function.Consumer<VkDeviceAddressRangeKHR> consumer) { consumer.accept(dstRange()); return this; }
    /** Sets the specified value to the {@code dstFlags} field. */
    public VkDeviceMemoryCopyKHR dstFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { ndstFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceMemoryCopyKHR set(
        int sType,
        long pNext,
        VkDeviceAddressRangeKHR srcRange,
        int srcFlags,
        VkDeviceAddressRangeKHR dstRange,
        int dstFlags
    ) {
        sType(sType);
        pNext(pNext);
        srcRange(srcRange);
        srcFlags(srcFlags);
        dstRange(dstRange);
        dstFlags(dstFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceMemoryCopyKHR set(VkDeviceMemoryCopyKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceMemoryCopyKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceMemoryCopyKHR malloc() {
        return new VkDeviceMemoryCopyKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceMemoryCopyKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceMemoryCopyKHR calloc() {
        return new VkDeviceMemoryCopyKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceMemoryCopyKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceMemoryCopyKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceMemoryCopyKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceMemoryCopyKHR} instance for the specified memory address. */
    public static VkDeviceMemoryCopyKHR create(long address) {
        return new VkDeviceMemoryCopyKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceMemoryCopyKHR createSafe(long address) {
        return address == NULL ? null : new VkDeviceMemoryCopyKHR(address, null);
    }

    /**
     * Returns a new {@link VkDeviceMemoryCopyKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryCopyKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryCopyKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryCopyKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryCopyKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryCopyKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceMemoryCopyKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryCopyKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceMemoryCopyKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceMemoryCopyKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceMemoryCopyKHR malloc(MemoryStack stack) {
        return new VkDeviceMemoryCopyKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceMemoryCopyKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceMemoryCopyKHR calloc(MemoryStack stack) {
        return new VkDeviceMemoryCopyKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceMemoryCopyKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryCopyKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryCopyKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryCopyKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceMemoryCopyKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceMemoryCopyKHR.PNEXT); }
    /** Unsafe version of {@link #srcRange}. */
    public static VkDeviceAddressRangeKHR nsrcRange(long struct) { return VkDeviceAddressRangeKHR.create(struct + VkDeviceMemoryCopyKHR.SRCRANGE); }
    /** Unsafe version of {@link #srcFlags}. */
    public static int nsrcFlags(long struct) { return memGetInt(struct + VkDeviceMemoryCopyKHR.SRCFLAGS); }
    /** Unsafe version of {@link #dstRange}. */
    public static VkDeviceAddressRangeKHR ndstRange(long struct) { return VkDeviceAddressRangeKHR.create(struct + VkDeviceMemoryCopyKHR.DSTRANGE); }
    /** Unsafe version of {@link #dstFlags}. */
    public static int ndstFlags(long struct) { return memGetInt(struct + VkDeviceMemoryCopyKHR.DSTFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceMemoryCopyKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceMemoryCopyKHR.PNEXT, value); }
    /** Unsafe version of {@link #srcRange(VkDeviceAddressRangeKHR) srcRange}. */
    public static void nsrcRange(long struct, VkDeviceAddressRangeKHR value) { memCopy(value.address(), struct + VkDeviceMemoryCopyKHR.SRCRANGE, VkDeviceAddressRangeKHR.SIZEOF); }
    /** Unsafe version of {@link #srcFlags(int) srcFlags}. */
    public static void nsrcFlags(long struct, int value) { memPutInt(struct + VkDeviceMemoryCopyKHR.SRCFLAGS, value); }
    /** Unsafe version of {@link #dstRange(VkDeviceAddressRangeKHR) dstRange}. */
    public static void ndstRange(long struct, VkDeviceAddressRangeKHR value) { memCopy(value.address(), struct + VkDeviceMemoryCopyKHR.DSTRANGE, VkDeviceAddressRangeKHR.SIZEOF); }
    /** Unsafe version of {@link #dstFlags(int) dstFlags}. */
    public static void ndstFlags(long struct, int value) { memPutInt(struct + VkDeviceMemoryCopyKHR.DSTFLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceMemoryCopyKHR} structs. */
    public static class Buffer extends StructBuffer<VkDeviceMemoryCopyKHR, Buffer> implements NativeResource {

        private static final VkDeviceMemoryCopyKHR ELEMENT_FACTORY = VkDeviceMemoryCopyKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceMemoryCopyKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceMemoryCopyKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceMemoryCopyKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceMemoryCopyKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceMemoryCopyKHR.npNext(address()); }
        /** @return a {@link VkDeviceAddressRangeKHR} view of the {@code srcRange} field. */
        public VkDeviceAddressRangeKHR srcRange() { return VkDeviceMemoryCopyKHR.nsrcRange(address()); }
        /** @return the value of the {@code srcFlags} field. */
        @NativeType("VkAddressCommandFlagsKHR")
        public int srcFlags() { return VkDeviceMemoryCopyKHR.nsrcFlags(address()); }
        /** @return a {@link VkDeviceAddressRangeKHR} view of the {@code dstRange} field. */
        public VkDeviceAddressRangeKHR dstRange() { return VkDeviceMemoryCopyKHR.ndstRange(address()); }
        /** @return the value of the {@code dstFlags} field. */
        @NativeType("VkAddressCommandFlagsKHR")
        public int dstFlags() { return VkDeviceMemoryCopyKHR.ndstFlags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceMemoryCopyKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceMemoryCopyKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_DEVICE_MEMORY_COPY_KHR STRUCTURE_TYPE_DEVICE_MEMORY_COPY_KHR} value to the {@code sType} field. */
        public VkDeviceMemoryCopyKHR.Buffer sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_DEVICE_MEMORY_COPY_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceMemoryCopyKHR.Buffer pNext(@NativeType("void const *") long value) { VkDeviceMemoryCopyKHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkDeviceAddressRangeKHR} to the {@code srcRange} field. */
        public VkDeviceMemoryCopyKHR.Buffer srcRange(VkDeviceAddressRangeKHR value) { VkDeviceMemoryCopyKHR.nsrcRange(address(), value); return this; }
        /** Passes the {@code srcRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDeviceMemoryCopyKHR.Buffer srcRange(java.util.function.Consumer<VkDeviceAddressRangeKHR> consumer) { consumer.accept(srcRange()); return this; }
        /** Sets the specified value to the {@code srcFlags} field. */
        public VkDeviceMemoryCopyKHR.Buffer srcFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { VkDeviceMemoryCopyKHR.nsrcFlags(address(), value); return this; }
        /** Copies the specified {@link VkDeviceAddressRangeKHR} to the {@code dstRange} field. */
        public VkDeviceMemoryCopyKHR.Buffer dstRange(VkDeviceAddressRangeKHR value) { VkDeviceMemoryCopyKHR.ndstRange(address(), value); return this; }
        /** Passes the {@code dstRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDeviceMemoryCopyKHR.Buffer dstRange(java.util.function.Consumer<VkDeviceAddressRangeKHR> consumer) { consumer.accept(dstRange()); return this; }
        /** Sets the specified value to the {@code dstFlags} field. */
        public VkDeviceMemoryCopyKHR.Buffer dstFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { VkDeviceMemoryCopyKHR.ndstFlags(address(), value); return this; }

    }

}