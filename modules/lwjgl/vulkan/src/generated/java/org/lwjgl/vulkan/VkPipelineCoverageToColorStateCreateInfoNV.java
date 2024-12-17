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
 * struct VkPipelineCoverageToColorStateCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineCoverageToColorStateCreateFlagsNV flags;
 *     VkBool32 coverageToColorEnable;
 *     uint32_t coverageToColorLocation;
 * }}</pre>
 */
public class VkPipelineCoverageToColorStateCreateInfoNV extends Struct<VkPipelineCoverageToColorStateCreateInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        COVERAGETOCOLORENABLE,
        COVERAGETOCOLORLOCATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        COVERAGETOCOLORENABLE = layout.offsetof(3);
        COVERAGETOCOLORLOCATION = layout.offsetof(4);
    }

    protected VkPipelineCoverageToColorStateCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineCoverageToColorStateCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineCoverageToColorStateCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkPipelineCoverageToColorStateCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineCoverageToColorStateCreateInfoNV(ByteBuffer container) {
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
    @NativeType("VkPipelineCoverageToColorStateCreateFlagsNV")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code coverageToColorEnable} field. */
    @NativeType("VkBool32")
    public boolean coverageToColorEnable() { return ncoverageToColorEnable(address()) != 0; }
    /** @return the value of the {@code coverageToColorLocation} field. */
    @NativeType("uint32_t")
    public int coverageToColorLocation() { return ncoverageToColorLocation(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineCoverageToColorStateCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVFragmentCoverageToColor#VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV} value to the {@code sType} field. */
    public VkPipelineCoverageToColorStateCreateInfoNV sType$Default() { return sType(NVFragmentCoverageToColor.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineCoverageToColorStateCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPipelineCoverageToColorStateCreateInfoNV flags(@NativeType("VkPipelineCoverageToColorStateCreateFlagsNV") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code coverageToColorEnable} field. */
    public VkPipelineCoverageToColorStateCreateInfoNV coverageToColorEnable(@NativeType("VkBool32") boolean value) { ncoverageToColorEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code coverageToColorLocation} field. */
    public VkPipelineCoverageToColorStateCreateInfoNV coverageToColorLocation(@NativeType("uint32_t") int value) { ncoverageToColorLocation(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineCoverageToColorStateCreateInfoNV set(
        int sType,
        long pNext,
        int flags,
        boolean coverageToColorEnable,
        int coverageToColorLocation
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        coverageToColorEnable(coverageToColorEnable);
        coverageToColorLocation(coverageToColorLocation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineCoverageToColorStateCreateInfoNV set(VkPipelineCoverageToColorStateCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineCoverageToColorStateCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineCoverageToColorStateCreateInfoNV malloc() {
        return new VkPipelineCoverageToColorStateCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineCoverageToColorStateCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineCoverageToColorStateCreateInfoNV calloc() {
        return new VkPipelineCoverageToColorStateCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineCoverageToColorStateCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkPipelineCoverageToColorStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineCoverageToColorStateCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineCoverageToColorStateCreateInfoNV} instance for the specified memory address. */
    public static VkPipelineCoverageToColorStateCreateInfoNV create(long address) {
        return new VkPipelineCoverageToColorStateCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineCoverageToColorStateCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkPipelineCoverageToColorStateCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkPipelineCoverageToColorStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCoverageToColorStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCoverageToColorStateCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineCoverageToColorStateCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineCoverageToColorStateCreateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageToColorStateCreateInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageToColorStateCreateInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageToColorStateCreateInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageToColorStateCreateInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineCoverageToColorStateCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCoverageToColorStateCreateInfoNV malloc(MemoryStack stack) {
        return new VkPipelineCoverageToColorStateCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineCoverageToColorStateCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCoverageToColorStateCreateInfoNV calloc(MemoryStack stack) {
        return new VkPipelineCoverageToColorStateCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineCoverageToColorStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCoverageToColorStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineCoverageToColorStateCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineCoverageToColorStateCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPipelineCoverageToColorStateCreateInfoNV.FLAGS); }
    /** Unsafe version of {@link #coverageToColorEnable}. */
    public static int ncoverageToColorEnable(long struct) { return memGetInt(struct + VkPipelineCoverageToColorStateCreateInfoNV.COVERAGETOCOLORENABLE); }
    /** Unsafe version of {@link #coverageToColorLocation}. */
    public static int ncoverageToColorLocation(long struct) { return memGetInt(struct + VkPipelineCoverageToColorStateCreateInfoNV.COVERAGETOCOLORLOCATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineCoverageToColorStateCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineCoverageToColorStateCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineCoverageToColorStateCreateInfoNV.FLAGS, value); }
    /** Unsafe version of {@link #coverageToColorEnable(boolean) coverageToColorEnable}. */
    public static void ncoverageToColorEnable(long struct, int value) { memPutInt(struct + VkPipelineCoverageToColorStateCreateInfoNV.COVERAGETOCOLORENABLE, value); }
    /** Unsafe version of {@link #coverageToColorLocation(int) coverageToColorLocation}. */
    public static void ncoverageToColorLocation(long struct, int value) { memPutInt(struct + VkPipelineCoverageToColorStateCreateInfoNV.COVERAGETOCOLORLOCATION, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineCoverageToColorStateCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkPipelineCoverageToColorStateCreateInfoNV, Buffer> implements NativeResource {

        private static final VkPipelineCoverageToColorStateCreateInfoNV ELEMENT_FACTORY = VkPipelineCoverageToColorStateCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkPipelineCoverageToColorStateCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineCoverageToColorStateCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineCoverageToColorStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineCoverageToColorStateCreateInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineCoverageToColorStateCreateInfoNV.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkPipelineCoverageToColorStateCreateFlagsNV")
        public int flags() { return VkPipelineCoverageToColorStateCreateInfoNV.nflags(address()); }
        /** @return the value of the {@code coverageToColorEnable} field. */
        @NativeType("VkBool32")
        public boolean coverageToColorEnable() { return VkPipelineCoverageToColorStateCreateInfoNV.ncoverageToColorEnable(address()) != 0; }
        /** @return the value of the {@code coverageToColorLocation} field. */
        @NativeType("uint32_t")
        public int coverageToColorLocation() { return VkPipelineCoverageToColorStateCreateInfoNV.ncoverageToColorLocation(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineCoverageToColorStateCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineCoverageToColorStateCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVFragmentCoverageToColor#VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV} value to the {@code sType} field. */
        public VkPipelineCoverageToColorStateCreateInfoNV.Buffer sType$Default() { return sType(NVFragmentCoverageToColor.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineCoverageToColorStateCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkPipelineCoverageToColorStateCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPipelineCoverageToColorStateCreateInfoNV.Buffer flags(@NativeType("VkPipelineCoverageToColorStateCreateFlagsNV") int value) { VkPipelineCoverageToColorStateCreateInfoNV.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code coverageToColorEnable} field. */
        public VkPipelineCoverageToColorStateCreateInfoNV.Buffer coverageToColorEnable(@NativeType("VkBool32") boolean value) { VkPipelineCoverageToColorStateCreateInfoNV.ncoverageToColorEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code coverageToColorLocation} field. */
        public VkPipelineCoverageToColorStateCreateInfoNV.Buffer coverageToColorLocation(@NativeType("uint32_t") int value) { VkPipelineCoverageToColorStateCreateInfoNV.ncoverageToColorLocation(address(), value); return this; }

    }

}