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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkOpticalFlowExecuteInfoNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkOpticalFlowExecuteFlagsNV flags;
 *     uint32_t regionCount;
 *     {@link VkRect2D VkRect2D} const * pRegions;
 * }}</pre>
 */
public class VkOpticalFlowExecuteInfoNV extends Struct<VkOpticalFlowExecuteInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        REGIONCOUNT,
        PREGIONS;

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
        FLAGS = layout.offsetof(2);
        REGIONCOUNT = layout.offsetof(3);
        PREGIONS = layout.offsetof(4);
    }

    protected VkOpticalFlowExecuteInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkOpticalFlowExecuteInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkOpticalFlowExecuteInfoNV(address, container);
    }

    /**
     * Creates a {@code VkOpticalFlowExecuteInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkOpticalFlowExecuteInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkOpticalFlowExecuteFlagsNV")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code regionCount} field. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** @return a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
    @NativeType("VkRect2D const *")
    public VkRect2D.@Nullable Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkOpticalFlowExecuteInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVOpticalFlow#VK_STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV} value to the {@code sType} field. */
    public VkOpticalFlowExecuteInfoNV sType$Default() { return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkOpticalFlowExecuteInfoNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkOpticalFlowExecuteInfoNV flags(@NativeType("VkOpticalFlowExecuteFlagsNV") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pRegions} field. */
    public VkOpticalFlowExecuteInfoNV pRegions(@NativeType("VkRect2D const *") VkRect2D.@Nullable Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkOpticalFlowExecuteInfoNV set(
        int sType,
        long pNext,
        int flags,
        VkRect2D.@Nullable Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pRegions(pRegions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkOpticalFlowExecuteInfoNV set(VkOpticalFlowExecuteInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkOpticalFlowExecuteInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkOpticalFlowExecuteInfoNV malloc() {
        return new VkOpticalFlowExecuteInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkOpticalFlowExecuteInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkOpticalFlowExecuteInfoNV calloc() {
        return new VkOpticalFlowExecuteInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkOpticalFlowExecuteInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkOpticalFlowExecuteInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkOpticalFlowExecuteInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkOpticalFlowExecuteInfoNV} instance for the specified memory address. */
    public static VkOpticalFlowExecuteInfoNV create(long address) {
        return new VkOpticalFlowExecuteInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkOpticalFlowExecuteInfoNV createSafe(long address) {
        return address == NULL ? null : new VkOpticalFlowExecuteInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkOpticalFlowExecuteInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowExecuteInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkOpticalFlowExecuteInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowExecuteInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOpticalFlowExecuteInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowExecuteInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkOpticalFlowExecuteInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowExecuteInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkOpticalFlowExecuteInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkOpticalFlowExecuteInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOpticalFlowExecuteInfoNV malloc(MemoryStack stack) {
        return new VkOpticalFlowExecuteInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkOpticalFlowExecuteInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOpticalFlowExecuteInfoNV calloc(MemoryStack stack) {
        return new VkOpticalFlowExecuteInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkOpticalFlowExecuteInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowExecuteInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOpticalFlowExecuteInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowExecuteInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkOpticalFlowExecuteInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkOpticalFlowExecuteInfoNV.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkOpticalFlowExecuteInfoNV.FLAGS); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return memGetInt(struct + VkOpticalFlowExecuteInfoNV.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkRect2D.@Nullable Buffer npRegions(long struct) { return VkRect2D.createSafe(memGetAddress(struct + VkOpticalFlowExecuteInfoNV.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkOpticalFlowExecuteInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkOpticalFlowExecuteInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkOpticalFlowExecuteInfoNV.FLAGS, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { memPutInt(struct + VkOpticalFlowExecuteInfoNV.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkRect2D.Buffer) pRegions}. */
    public static void npRegions(long struct, VkRect2D.@Nullable Buffer value) { memPutAddress(struct + VkOpticalFlowExecuteInfoNV.PREGIONS, memAddressSafe(value)); nregionCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nregionCount(struct) != 0) {
            check(memGetAddress(struct + VkOpticalFlowExecuteInfoNV.PREGIONS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkOpticalFlowExecuteInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkOpticalFlowExecuteInfoNV, Buffer> implements NativeResource {

        private static final VkOpticalFlowExecuteInfoNV ELEMENT_FACTORY = VkOpticalFlowExecuteInfoNV.create(-1L);

        /**
         * Creates a new {@code VkOpticalFlowExecuteInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkOpticalFlowExecuteInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkOpticalFlowExecuteInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkOpticalFlowExecuteInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkOpticalFlowExecuteInfoNV.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkOpticalFlowExecuteFlagsNV")
        public int flags() { return VkOpticalFlowExecuteInfoNV.nflags(address()); }
        /** @return the value of the {@code regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkOpticalFlowExecuteInfoNV.nregionCount(address()); }
        /** @return a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
        @NativeType("VkRect2D const *")
        public VkRect2D.@Nullable Buffer pRegions() { return VkOpticalFlowExecuteInfoNV.npRegions(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkOpticalFlowExecuteInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkOpticalFlowExecuteInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVOpticalFlow#VK_STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV} value to the {@code sType} field. */
        public VkOpticalFlowExecuteInfoNV.Buffer sType$Default() { return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkOpticalFlowExecuteInfoNV.Buffer pNext(@NativeType("void *") long value) { VkOpticalFlowExecuteInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkOpticalFlowExecuteInfoNV.Buffer flags(@NativeType("VkOpticalFlowExecuteFlagsNV") int value) { VkOpticalFlowExecuteInfoNV.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pRegions} field. */
        public VkOpticalFlowExecuteInfoNV.Buffer pRegions(@NativeType("VkRect2D const *") VkRect2D.@Nullable Buffer value) { VkOpticalFlowExecuteInfoNV.npRegions(address(), value); return this; }

    }

}