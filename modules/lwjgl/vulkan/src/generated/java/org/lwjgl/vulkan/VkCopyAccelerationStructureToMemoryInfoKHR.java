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
 * struct VkCopyAccelerationStructureToMemoryInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkAccelerationStructureKHR src;
 *     {@link VkDeviceOrHostAddressKHR VkDeviceOrHostAddressKHR} dst;
 *     VkCopyAccelerationStructureModeKHR mode;
 * }}</pre>
 */
public class VkCopyAccelerationStructureToMemoryInfoKHR extends Struct<VkCopyAccelerationStructureToMemoryInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRC,
        DST,
        MODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(VkDeviceOrHostAddressKHR.SIZEOF, VkDeviceOrHostAddressKHR.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRC = layout.offsetof(2);
        DST = layout.offsetof(3);
        MODE = layout.offsetof(4);
    }

    protected VkCopyAccelerationStructureToMemoryInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyAccelerationStructureToMemoryInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkCopyAccelerationStructureToMemoryInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkCopyAccelerationStructureToMemoryInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyAccelerationStructureToMemoryInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code src} field. */
    @NativeType("VkAccelerationStructureKHR")
    public long src() { return nsrc(address()); }
    /** @return a {@link VkDeviceOrHostAddressKHR} view of the {@code dst} field. */
    public VkDeviceOrHostAddressKHR dst() { return ndst(address()); }
    /** @return the value of the {@code mode} field. */
    @NativeType("VkCopyAccelerationStructureModeKHR")
    public int mode() { return nmode(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCopyAccelerationStructureToMemoryInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR} value to the {@code sType} field. */
    public VkCopyAccelerationStructureToMemoryInfoKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCopyAccelerationStructureToMemoryInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code src} field. */
    public VkCopyAccelerationStructureToMemoryInfoKHR src(@NativeType("VkAccelerationStructureKHR") long value) { nsrc(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressKHR} to the {@code dst} field. */
    public VkCopyAccelerationStructureToMemoryInfoKHR dst(VkDeviceOrHostAddressKHR value) { ndst(address(), value); return this; }
    /** Passes the {@code dst} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkCopyAccelerationStructureToMemoryInfoKHR dst(java.util.function.Consumer<VkDeviceOrHostAddressKHR> consumer) { consumer.accept(dst()); return this; }
    /** Sets the specified value to the {@code mode} field. */
    public VkCopyAccelerationStructureToMemoryInfoKHR mode(@NativeType("VkCopyAccelerationStructureModeKHR") int value) { nmode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyAccelerationStructureToMemoryInfoKHR set(
        int sType,
        long pNext,
        long src,
        VkDeviceOrHostAddressKHR dst,
        int mode
    ) {
        sType(sType);
        pNext(pNext);
        src(src);
        dst(dst);
        mode(mode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyAccelerationStructureToMemoryInfoKHR set(VkCopyAccelerationStructureToMemoryInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyAccelerationStructureToMemoryInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyAccelerationStructureToMemoryInfoKHR malloc() {
        return new VkCopyAccelerationStructureToMemoryInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyAccelerationStructureToMemoryInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyAccelerationStructureToMemoryInfoKHR calloc() {
        return new VkCopyAccelerationStructureToMemoryInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyAccelerationStructureToMemoryInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkCopyAccelerationStructureToMemoryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyAccelerationStructureToMemoryInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyAccelerationStructureToMemoryInfoKHR} instance for the specified memory address. */
    public static VkCopyAccelerationStructureToMemoryInfoKHR create(long address) {
        return new VkCopyAccelerationStructureToMemoryInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyAccelerationStructureToMemoryInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkCopyAccelerationStructureToMemoryInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkCopyAccelerationStructureToMemoryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyAccelerationStructureToMemoryInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyAccelerationStructureToMemoryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyAccelerationStructureToMemoryInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyAccelerationStructureToMemoryInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyAccelerationStructureToMemoryInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyAccelerationStructureToMemoryInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyAccelerationStructureToMemoryInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyAccelerationStructureToMemoryInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyAccelerationStructureToMemoryInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyAccelerationStructureToMemoryInfoKHR malloc(MemoryStack stack) {
        return new VkCopyAccelerationStructureToMemoryInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyAccelerationStructureToMemoryInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyAccelerationStructureToMemoryInfoKHR calloc(MemoryStack stack) {
        return new VkCopyAccelerationStructureToMemoryInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyAccelerationStructureToMemoryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyAccelerationStructureToMemoryInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyAccelerationStructureToMemoryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyAccelerationStructureToMemoryInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCopyAccelerationStructureToMemoryInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyAccelerationStructureToMemoryInfoKHR.PNEXT); }
    /** Unsafe version of {@link #src}. */
    public static long nsrc(long struct) { return memGetLong(struct + VkCopyAccelerationStructureToMemoryInfoKHR.SRC); }
    /** Unsafe version of {@link #dst}. */
    public static VkDeviceOrHostAddressKHR ndst(long struct) { return VkDeviceOrHostAddressKHR.create(struct + VkCopyAccelerationStructureToMemoryInfoKHR.DST); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return memGetInt(struct + VkCopyAccelerationStructureToMemoryInfoKHR.MODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCopyAccelerationStructureToMemoryInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyAccelerationStructureToMemoryInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #src(long) src}. */
    public static void nsrc(long struct, long value) { memPutLong(struct + VkCopyAccelerationStructureToMemoryInfoKHR.SRC, value); }
    /** Unsafe version of {@link #dst(VkDeviceOrHostAddressKHR) dst}. */
    public static void ndst(long struct, VkDeviceOrHostAddressKHR value) { memCopy(value.address(), struct + VkCopyAccelerationStructureToMemoryInfoKHR.DST, VkDeviceOrHostAddressKHR.SIZEOF); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { memPutInt(struct + VkCopyAccelerationStructureToMemoryInfoKHR.MODE, value); }

    // -----------------------------------

    /** An array of {@link VkCopyAccelerationStructureToMemoryInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkCopyAccelerationStructureToMemoryInfoKHR, Buffer> implements NativeResource {

        private static final VkCopyAccelerationStructureToMemoryInfoKHR ELEMENT_FACTORY = VkCopyAccelerationStructureToMemoryInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkCopyAccelerationStructureToMemoryInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyAccelerationStructureToMemoryInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyAccelerationStructureToMemoryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyAccelerationStructureToMemoryInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyAccelerationStructureToMemoryInfoKHR.npNext(address()); }
        /** @return the value of the {@code src} field. */
        @NativeType("VkAccelerationStructureKHR")
        public long src() { return VkCopyAccelerationStructureToMemoryInfoKHR.nsrc(address()); }
        /** @return a {@link VkDeviceOrHostAddressKHR} view of the {@code dst} field. */
        public VkDeviceOrHostAddressKHR dst() { return VkCopyAccelerationStructureToMemoryInfoKHR.ndst(address()); }
        /** @return the value of the {@code mode} field. */
        @NativeType("VkCopyAccelerationStructureModeKHR")
        public int mode() { return VkCopyAccelerationStructureToMemoryInfoKHR.nmode(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCopyAccelerationStructureToMemoryInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyAccelerationStructureToMemoryInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR} value to the {@code sType} field. */
        public VkCopyAccelerationStructureToMemoryInfoKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCopyAccelerationStructureToMemoryInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkCopyAccelerationStructureToMemoryInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code src} field. */
        public VkCopyAccelerationStructureToMemoryInfoKHR.Buffer src(@NativeType("VkAccelerationStructureKHR") long value) { VkCopyAccelerationStructureToMemoryInfoKHR.nsrc(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressKHR} to the {@code dst} field. */
        public VkCopyAccelerationStructureToMemoryInfoKHR.Buffer dst(VkDeviceOrHostAddressKHR value) { VkCopyAccelerationStructureToMemoryInfoKHR.ndst(address(), value); return this; }
        /** Passes the {@code dst} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkCopyAccelerationStructureToMemoryInfoKHR.Buffer dst(java.util.function.Consumer<VkDeviceOrHostAddressKHR> consumer) { consumer.accept(dst()); return this; }
        /** Sets the specified value to the {@code mode} field. */
        public VkCopyAccelerationStructureToMemoryInfoKHR.Buffer mode(@NativeType("VkCopyAccelerationStructureModeKHR") int value) { VkCopyAccelerationStructureToMemoryInfoKHR.nmode(address(), value); return this; }

    }

}