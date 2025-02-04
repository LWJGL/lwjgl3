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
 * struct VkPartitionedAccelerationStructureFlagsNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 enablePartitionTranslation;
 * }}</pre>
 */
public class VkPartitionedAccelerationStructureFlagsNV extends Struct<VkPartitionedAccelerationStructureFlagsNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ENABLEPARTITIONTRANSLATION;

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
        ENABLEPARTITIONTRANSLATION = layout.offsetof(2);
    }

    protected VkPartitionedAccelerationStructureFlagsNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPartitionedAccelerationStructureFlagsNV create(long address, @Nullable ByteBuffer container) {
        return new VkPartitionedAccelerationStructureFlagsNV(address, container);
    }

    /**
     * Creates a {@code VkPartitionedAccelerationStructureFlagsNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPartitionedAccelerationStructureFlagsNV(ByteBuffer container) {
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
    /** @return the value of the {@code enablePartitionTranslation} field. */
    @NativeType("VkBool32")
    public boolean enablePartitionTranslation() { return nenablePartitionTranslation(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPartitionedAccelerationStructureFlagsNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVPartitionedAccelerationStructure#VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_FLAGS_NV STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_FLAGS_NV} value to the {@code sType} field. */
    public VkPartitionedAccelerationStructureFlagsNV sType$Default() { return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_FLAGS_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPartitionedAccelerationStructureFlagsNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code enablePartitionTranslation} field. */
    public VkPartitionedAccelerationStructureFlagsNV enablePartitionTranslation(@NativeType("VkBool32") boolean value) { nenablePartitionTranslation(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPartitionedAccelerationStructureFlagsNV set(
        int sType,
        long pNext,
        boolean enablePartitionTranslation
    ) {
        sType(sType);
        pNext(pNext);
        enablePartitionTranslation(enablePartitionTranslation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPartitionedAccelerationStructureFlagsNV set(VkPartitionedAccelerationStructureFlagsNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPartitionedAccelerationStructureFlagsNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPartitionedAccelerationStructureFlagsNV malloc() {
        return new VkPartitionedAccelerationStructureFlagsNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPartitionedAccelerationStructureFlagsNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPartitionedAccelerationStructureFlagsNV calloc() {
        return new VkPartitionedAccelerationStructureFlagsNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPartitionedAccelerationStructureFlagsNV} instance allocated with {@link BufferUtils}. */
    public static VkPartitionedAccelerationStructureFlagsNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPartitionedAccelerationStructureFlagsNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPartitionedAccelerationStructureFlagsNV} instance for the specified memory address. */
    public static VkPartitionedAccelerationStructureFlagsNV create(long address) {
        return new VkPartitionedAccelerationStructureFlagsNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPartitionedAccelerationStructureFlagsNV createSafe(long address) {
        return address == NULL ? null : new VkPartitionedAccelerationStructureFlagsNV(address, null);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureFlagsNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureFlagsNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureFlagsNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureFlagsNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureFlagsNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureFlagsNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPartitionedAccelerationStructureFlagsNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureFlagsNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPartitionedAccelerationStructureFlagsNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPartitionedAccelerationStructureFlagsNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPartitionedAccelerationStructureFlagsNV malloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureFlagsNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPartitionedAccelerationStructureFlagsNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPartitionedAccelerationStructureFlagsNV calloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureFlagsNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureFlagsNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureFlagsNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureFlagsNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureFlagsNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPartitionedAccelerationStructureFlagsNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPartitionedAccelerationStructureFlagsNV.PNEXT); }
    /** Unsafe version of {@link #enablePartitionTranslation}. */
    public static int nenablePartitionTranslation(long struct) { return memGetInt(struct + VkPartitionedAccelerationStructureFlagsNV.ENABLEPARTITIONTRANSLATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPartitionedAccelerationStructureFlagsNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPartitionedAccelerationStructureFlagsNV.PNEXT, value); }
    /** Unsafe version of {@link #enablePartitionTranslation(boolean) enablePartitionTranslation}. */
    public static void nenablePartitionTranslation(long struct, int value) { memPutInt(struct + VkPartitionedAccelerationStructureFlagsNV.ENABLEPARTITIONTRANSLATION, value); }

    // -----------------------------------

    /** An array of {@link VkPartitionedAccelerationStructureFlagsNV} structs. */
    public static class Buffer extends StructBuffer<VkPartitionedAccelerationStructureFlagsNV, Buffer> implements NativeResource {

        private static final VkPartitionedAccelerationStructureFlagsNV ELEMENT_FACTORY = VkPartitionedAccelerationStructureFlagsNV.create(-1L);

        /**
         * Creates a new {@code VkPartitionedAccelerationStructureFlagsNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPartitionedAccelerationStructureFlagsNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPartitionedAccelerationStructureFlagsNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPartitionedAccelerationStructureFlagsNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPartitionedAccelerationStructureFlagsNV.npNext(address()); }
        /** @return the value of the {@code enablePartitionTranslation} field. */
        @NativeType("VkBool32")
        public boolean enablePartitionTranslation() { return VkPartitionedAccelerationStructureFlagsNV.nenablePartitionTranslation(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPartitionedAccelerationStructureFlagsNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPartitionedAccelerationStructureFlagsNV.nsType(address(), value); return this; }
        /** Sets the {@link NVPartitionedAccelerationStructure#VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_FLAGS_NV STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_FLAGS_NV} value to the {@code sType} field. */
        public VkPartitionedAccelerationStructureFlagsNV.Buffer sType$Default() { return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_FLAGS_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPartitionedAccelerationStructureFlagsNV.Buffer pNext(@NativeType("void *") long value) { VkPartitionedAccelerationStructureFlagsNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code enablePartitionTranslation} field. */
        public VkPartitionedAccelerationStructureFlagsNV.Buffer enablePartitionTranslation(@NativeType("VkBool32") boolean value) { VkPartitionedAccelerationStructureFlagsNV.nenablePartitionTranslation(address(), value ? 1 : 0); return this; }

    }

}