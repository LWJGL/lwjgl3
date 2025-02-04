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
 * struct VkClusterAccelerationStructureInputInfoNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxAccelerationStructureCount;
 *     VkBuildAccelerationStructureFlagsKHR flags;
 *     VkClusterAccelerationStructureOpTypeNV opType;
 *     VkClusterAccelerationStructureOpModeNV opMode;
 *     {@link VkClusterAccelerationStructureOpInputNV VkClusterAccelerationStructureOpInputNV} opInput;
 * }}</pre>
 */
public class VkClusterAccelerationStructureInputInfoNV extends Struct<VkClusterAccelerationStructureInputInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXACCELERATIONSTRUCTURECOUNT,
        FLAGS,
        OPTYPE,
        OPMODE,
        OPINPUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(VkClusterAccelerationStructureOpInputNV.SIZEOF, VkClusterAccelerationStructureOpInputNV.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXACCELERATIONSTRUCTURECOUNT = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        OPTYPE = layout.offsetof(4);
        OPMODE = layout.offsetof(5);
        OPINPUT = layout.offsetof(6);
    }

    protected VkClusterAccelerationStructureInputInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkClusterAccelerationStructureInputInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkClusterAccelerationStructureInputInfoNV(address, container);
    }

    /**
     * Creates a {@code VkClusterAccelerationStructureInputInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClusterAccelerationStructureInputInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code maxAccelerationStructureCount} field. */
    @NativeType("uint32_t")
    public int maxAccelerationStructureCount() { return nmaxAccelerationStructureCount(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkBuildAccelerationStructureFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code opType} field. */
    @NativeType("VkClusterAccelerationStructureOpTypeNV")
    public int opType() { return nopType(address()); }
    /** @return the value of the {@code opMode} field. */
    @NativeType("VkClusterAccelerationStructureOpModeNV")
    public int opMode() { return nopMode(address()); }
    /** @return a {@link VkClusterAccelerationStructureOpInputNV} view of the {@code opInput} field. */
    public VkClusterAccelerationStructureOpInputNV opInput() { return nopInput(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkClusterAccelerationStructureInputInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVClusterAccelerationStructure#VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_INPUT_INFO_NV STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_INPUT_INFO_NV} value to the {@code sType} field. */
    public VkClusterAccelerationStructureInputInfoNV sType$Default() { return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_INPUT_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkClusterAccelerationStructureInputInfoNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code maxAccelerationStructureCount} field. */
    public VkClusterAccelerationStructureInputInfoNV maxAccelerationStructureCount(@NativeType("uint32_t") int value) { nmaxAccelerationStructureCount(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkClusterAccelerationStructureInputInfoNV flags(@NativeType("VkBuildAccelerationStructureFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code opType} field. */
    public VkClusterAccelerationStructureInputInfoNV opType(@NativeType("VkClusterAccelerationStructureOpTypeNV") int value) { nopType(address(), value); return this; }
    /** Sets the specified value to the {@code opMode} field. */
    public VkClusterAccelerationStructureInputInfoNV opMode(@NativeType("VkClusterAccelerationStructureOpModeNV") int value) { nopMode(address(), value); return this; }
    /** Copies the specified {@link VkClusterAccelerationStructureOpInputNV} to the {@code opInput} field. */
    public VkClusterAccelerationStructureInputInfoNV opInput(VkClusterAccelerationStructureOpInputNV value) { nopInput(address(), value); return this; }
    /** Passes the {@code opInput} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkClusterAccelerationStructureInputInfoNV opInput(java.util.function.Consumer<VkClusterAccelerationStructureOpInputNV> consumer) { consumer.accept(opInput()); return this; }

    /** Initializes this struct with the specified values. */
    public VkClusterAccelerationStructureInputInfoNV set(
        int sType,
        long pNext,
        int maxAccelerationStructureCount,
        int flags,
        int opType,
        int opMode,
        VkClusterAccelerationStructureOpInputNV opInput
    ) {
        sType(sType);
        pNext(pNext);
        maxAccelerationStructureCount(maxAccelerationStructureCount);
        flags(flags);
        opType(opType);
        opMode(opMode);
        opInput(opInput);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClusterAccelerationStructureInputInfoNV set(VkClusterAccelerationStructureInputInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClusterAccelerationStructureInputInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureInputInfoNV malloc() {
        return new VkClusterAccelerationStructureInputInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureInputInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureInputInfoNV calloc() {
        return new VkClusterAccelerationStructureInputInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureInputInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkClusterAccelerationStructureInputInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureInputInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkClusterAccelerationStructureInputInfoNV} instance for the specified memory address. */
    public static VkClusterAccelerationStructureInputInfoNV create(long address) {
        return new VkClusterAccelerationStructureInputInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkClusterAccelerationStructureInputInfoNV createSafe(long address) {
        return address == NULL ? null : new VkClusterAccelerationStructureInputInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureInputInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureInputInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureInputInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureInputInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureInputInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureInputInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkClusterAccelerationStructureInputInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureInputInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkClusterAccelerationStructureInputInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureInputInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureInputInfoNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureInputInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureInputInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureInputInfoNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureInputInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureInputInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureInputInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureInputInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureInputInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkClusterAccelerationStructureInputInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkClusterAccelerationStructureInputInfoNV.PNEXT); }
    /** Unsafe version of {@link #maxAccelerationStructureCount}. */
    public static int nmaxAccelerationStructureCount(long struct) { return memGetInt(struct + VkClusterAccelerationStructureInputInfoNV.MAXACCELERATIONSTRUCTURECOUNT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkClusterAccelerationStructureInputInfoNV.FLAGS); }
    /** Unsafe version of {@link #opType}. */
    public static int nopType(long struct) { return memGetInt(struct + VkClusterAccelerationStructureInputInfoNV.OPTYPE); }
    /** Unsafe version of {@link #opMode}. */
    public static int nopMode(long struct) { return memGetInt(struct + VkClusterAccelerationStructureInputInfoNV.OPMODE); }
    /** Unsafe version of {@link #opInput}. */
    public static VkClusterAccelerationStructureOpInputNV nopInput(long struct) { return VkClusterAccelerationStructureOpInputNV.create(struct + VkClusterAccelerationStructureInputInfoNV.OPINPUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureInputInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkClusterAccelerationStructureInputInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #maxAccelerationStructureCount(int) maxAccelerationStructureCount}. */
    public static void nmaxAccelerationStructureCount(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureInputInfoNV.MAXACCELERATIONSTRUCTURECOUNT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureInputInfoNV.FLAGS, value); }
    /** Unsafe version of {@link #opType(int) opType}. */
    public static void nopType(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureInputInfoNV.OPTYPE, value); }
    /** Unsafe version of {@link #opMode(int) opMode}. */
    public static void nopMode(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureInputInfoNV.OPMODE, value); }
    /** Unsafe version of {@link #opInput(VkClusterAccelerationStructureOpInputNV) opInput}. */
    public static void nopInput(long struct, VkClusterAccelerationStructureOpInputNV value) { memCopy(value.address(), struct + VkClusterAccelerationStructureInputInfoNV.OPINPUT, VkClusterAccelerationStructureOpInputNV.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkClusterAccelerationStructureInputInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureInputInfoNV, Buffer> implements NativeResource {

        private static final VkClusterAccelerationStructureInputInfoNV ELEMENT_FACTORY = VkClusterAccelerationStructureInputInfoNV.create(-1L);

        /**
         * Creates a new {@code VkClusterAccelerationStructureInputInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClusterAccelerationStructureInputInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkClusterAccelerationStructureInputInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkClusterAccelerationStructureInputInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkClusterAccelerationStructureInputInfoNV.npNext(address()); }
        /** @return the value of the {@code maxAccelerationStructureCount} field. */
        @NativeType("uint32_t")
        public int maxAccelerationStructureCount() { return VkClusterAccelerationStructureInputInfoNV.nmaxAccelerationStructureCount(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkBuildAccelerationStructureFlagsKHR")
        public int flags() { return VkClusterAccelerationStructureInputInfoNV.nflags(address()); }
        /** @return the value of the {@code opType} field. */
        @NativeType("VkClusterAccelerationStructureOpTypeNV")
        public int opType() { return VkClusterAccelerationStructureInputInfoNV.nopType(address()); }
        /** @return the value of the {@code opMode} field. */
        @NativeType("VkClusterAccelerationStructureOpModeNV")
        public int opMode() { return VkClusterAccelerationStructureInputInfoNV.nopMode(address()); }
        /** @return a {@link VkClusterAccelerationStructureOpInputNV} view of the {@code opInput} field. */
        public VkClusterAccelerationStructureOpInputNV opInput() { return VkClusterAccelerationStructureInputInfoNV.nopInput(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkClusterAccelerationStructureInputInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkClusterAccelerationStructureInputInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVClusterAccelerationStructure#VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_INPUT_INFO_NV STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_INPUT_INFO_NV} value to the {@code sType} field. */
        public VkClusterAccelerationStructureInputInfoNV.Buffer sType$Default() { return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_INPUT_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkClusterAccelerationStructureInputInfoNV.Buffer pNext(@NativeType("void *") long value) { VkClusterAccelerationStructureInputInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code maxAccelerationStructureCount} field. */
        public VkClusterAccelerationStructureInputInfoNV.Buffer maxAccelerationStructureCount(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureInputInfoNV.nmaxAccelerationStructureCount(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkClusterAccelerationStructureInputInfoNV.Buffer flags(@NativeType("VkBuildAccelerationStructureFlagsKHR") int value) { VkClusterAccelerationStructureInputInfoNV.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code opType} field. */
        public VkClusterAccelerationStructureInputInfoNV.Buffer opType(@NativeType("VkClusterAccelerationStructureOpTypeNV") int value) { VkClusterAccelerationStructureInputInfoNV.nopType(address(), value); return this; }
        /** Sets the specified value to the {@code opMode} field. */
        public VkClusterAccelerationStructureInputInfoNV.Buffer opMode(@NativeType("VkClusterAccelerationStructureOpModeNV") int value) { VkClusterAccelerationStructureInputInfoNV.nopMode(address(), value); return this; }
        /** Copies the specified {@link VkClusterAccelerationStructureOpInputNV} to the {@code opInput} field. */
        public VkClusterAccelerationStructureInputInfoNV.Buffer opInput(VkClusterAccelerationStructureOpInputNV value) { VkClusterAccelerationStructureInputInfoNV.nopInput(address(), value); return this; }
        /** Passes the {@code opInput} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkClusterAccelerationStructureInputInfoNV.Buffer opInput(java.util.function.Consumer<VkClusterAccelerationStructureOpInputNV> consumer) { consumer.accept(opInput()); return this; }

    }

}