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
 * struct VkGpaSessionCreateInfoAMD {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkGpaSessionAMD secondaryCopySource;
 * }}</pre>
 */
public class VkGpaSessionCreateInfoAMD extends Struct<VkGpaSessionCreateInfoAMD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SECONDARYCOPYSOURCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SECONDARYCOPYSOURCE = layout.offsetof(2);
    }

    protected VkGpaSessionCreateInfoAMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGpaSessionCreateInfoAMD create(long address, @Nullable ByteBuffer container) {
        return new VkGpaSessionCreateInfoAMD(address, container);
    }

    /**
     * Creates a {@code VkGpaSessionCreateInfoAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGpaSessionCreateInfoAMD(ByteBuffer container) {
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
    /** @return the value of the {@code secondaryCopySource} field. */
    @NativeType("VkGpaSessionAMD")
    public long secondaryCopySource() { return nsecondaryCopySource(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGpaSessionCreateInfoAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDGpaInterface#VK_STRUCTURE_TYPE_GPA_SESSION_CREATE_INFO_AMD STRUCTURE_TYPE_GPA_SESSION_CREATE_INFO_AMD} value to the {@code sType} field. */
    public VkGpaSessionCreateInfoAMD sType$Default() { return sType(AMDGpaInterface.VK_STRUCTURE_TYPE_GPA_SESSION_CREATE_INFO_AMD); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGpaSessionCreateInfoAMD pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code secondaryCopySource} field. */
    public VkGpaSessionCreateInfoAMD secondaryCopySource(@NativeType("VkGpaSessionAMD") long value) { nsecondaryCopySource(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGpaSessionCreateInfoAMD set(
        int sType,
        long pNext,
        long secondaryCopySource
    ) {
        sType(sType);
        pNext(pNext);
        secondaryCopySource(secondaryCopySource);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGpaSessionCreateInfoAMD set(VkGpaSessionCreateInfoAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGpaSessionCreateInfoAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGpaSessionCreateInfoAMD malloc() {
        return new VkGpaSessionCreateInfoAMD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGpaSessionCreateInfoAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGpaSessionCreateInfoAMD calloc() {
        return new VkGpaSessionCreateInfoAMD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGpaSessionCreateInfoAMD} instance allocated with {@link BufferUtils}. */
    public static VkGpaSessionCreateInfoAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGpaSessionCreateInfoAMD(memAddress(container), container);
    }

    /** Returns a new {@code VkGpaSessionCreateInfoAMD} instance for the specified memory address. */
    public static VkGpaSessionCreateInfoAMD create(long address) {
        return new VkGpaSessionCreateInfoAMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGpaSessionCreateInfoAMD createSafe(long address) {
        return address == NULL ? null : new VkGpaSessionCreateInfoAMD(address, null);
    }

    /**
     * Returns a new {@link VkGpaSessionCreateInfoAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGpaSessionCreateInfoAMD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGpaSessionCreateInfoAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGpaSessionCreateInfoAMD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGpaSessionCreateInfoAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGpaSessionCreateInfoAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGpaSessionCreateInfoAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGpaSessionCreateInfoAMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGpaSessionCreateInfoAMD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkGpaSessionCreateInfoAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGpaSessionCreateInfoAMD malloc(MemoryStack stack) {
        return new VkGpaSessionCreateInfoAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGpaSessionCreateInfoAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGpaSessionCreateInfoAMD calloc(MemoryStack stack) {
        return new VkGpaSessionCreateInfoAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGpaSessionCreateInfoAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGpaSessionCreateInfoAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGpaSessionCreateInfoAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGpaSessionCreateInfoAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkGpaSessionCreateInfoAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGpaSessionCreateInfoAMD.PNEXT); }
    /** Unsafe version of {@link #secondaryCopySource}. */
    public static long nsecondaryCopySource(long struct) { return memGetLong(struct + VkGpaSessionCreateInfoAMD.SECONDARYCOPYSOURCE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkGpaSessionCreateInfoAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGpaSessionCreateInfoAMD.PNEXT, value); }
    /** Unsafe version of {@link #secondaryCopySource(long) secondaryCopySource}. */
    public static void nsecondaryCopySource(long struct, long value) { memPutLong(struct + VkGpaSessionCreateInfoAMD.SECONDARYCOPYSOURCE, value); }

    // -----------------------------------

    /** An array of {@link VkGpaSessionCreateInfoAMD} structs. */
    public static class Buffer extends StructBuffer<VkGpaSessionCreateInfoAMD, Buffer> implements NativeResource {

        private static final VkGpaSessionCreateInfoAMD ELEMENT_FACTORY = VkGpaSessionCreateInfoAMD.create(-1L);

        /**
         * Creates a new {@code VkGpaSessionCreateInfoAMD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGpaSessionCreateInfoAMD#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGpaSessionCreateInfoAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGpaSessionCreateInfoAMD.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGpaSessionCreateInfoAMD.npNext(address()); }
        /** @return the value of the {@code secondaryCopySource} field. */
        @NativeType("VkGpaSessionAMD")
        public long secondaryCopySource() { return VkGpaSessionCreateInfoAMD.nsecondaryCopySource(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGpaSessionCreateInfoAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkGpaSessionCreateInfoAMD.nsType(address(), value); return this; }
        /** Sets the {@link AMDGpaInterface#VK_STRUCTURE_TYPE_GPA_SESSION_CREATE_INFO_AMD STRUCTURE_TYPE_GPA_SESSION_CREATE_INFO_AMD} value to the {@code sType} field. */
        public VkGpaSessionCreateInfoAMD.Buffer sType$Default() { return sType(AMDGpaInterface.VK_STRUCTURE_TYPE_GPA_SESSION_CREATE_INFO_AMD); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGpaSessionCreateInfoAMD.Buffer pNext(@NativeType("void const *") long value) { VkGpaSessionCreateInfoAMD.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code secondaryCopySource} field. */
        public VkGpaSessionCreateInfoAMD.Buffer secondaryCopySource(@NativeType("VkGpaSessionAMD") long value) { VkGpaSessionCreateInfoAMD.nsecondaryCopySource(address(), value); return this; }

    }

}