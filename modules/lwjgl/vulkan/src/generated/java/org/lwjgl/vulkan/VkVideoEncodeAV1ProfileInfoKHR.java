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

import org.lwjgl.vulkan.video.*;

/**
 * <pre>{@code
 * struct VkVideoEncodeAV1ProfileInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     StdVideoAV1Profile stdProfile;
 * }}</pre>
 */
public class VkVideoEncodeAV1ProfileInfoKHR extends Struct<VkVideoEncodeAV1ProfileInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STDPROFILE;

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
        STDPROFILE = layout.offsetof(2);
    }

    protected VkVideoEncodeAV1ProfileInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeAV1ProfileInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeAV1ProfileInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeAV1ProfileInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeAV1ProfileInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code stdProfile} field. */
    @NativeType("StdVideoAV1Profile")
    public int stdProfile() { return nstdProfile(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeAV1ProfileInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PROFILE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PROFILE_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeAV1ProfileInfoKHR sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PROFILE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeAV1ProfileInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code stdProfile} field. */
    public VkVideoEncodeAV1ProfileInfoKHR stdProfile(@NativeType("StdVideoAV1Profile") int value) { nstdProfile(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeAV1ProfileInfoKHR set(
        int sType,
        long pNext,
        int stdProfile
    ) {
        sType(sType);
        pNext(pNext);
        stdProfile(stdProfile);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeAV1ProfileInfoKHR set(VkVideoEncodeAV1ProfileInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeAV1ProfileInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1ProfileInfoKHR malloc() {
        return new VkVideoEncodeAV1ProfileInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1ProfileInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1ProfileInfoKHR calloc() {
        return new VkVideoEncodeAV1ProfileInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1ProfileInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeAV1ProfileInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1ProfileInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeAV1ProfileInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeAV1ProfileInfoKHR create(long address) {
        return new VkVideoEncodeAV1ProfileInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeAV1ProfileInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeAV1ProfileInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1ProfileInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1ProfileInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1ProfileInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1ProfileInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1ProfileInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1ProfileInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeAV1ProfileInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1ProfileInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeAV1ProfileInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1ProfileInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1ProfileInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1ProfileInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1ProfileInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1ProfileInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1ProfileInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1ProfileInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1ProfileInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1ProfileInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1ProfileInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeAV1ProfileInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeAV1ProfileInfoKHR.PNEXT); }
    /** Unsafe version of {@link #stdProfile}. */
    public static int nstdProfile(long struct) { return memGetInt(struct + VkVideoEncodeAV1ProfileInfoKHR.STDPROFILE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1ProfileInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeAV1ProfileInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #stdProfile(int) stdProfile}. */
    public static void nstdProfile(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1ProfileInfoKHR.STDPROFILE, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeAV1ProfileInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1ProfileInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeAV1ProfileInfoKHR ELEMENT_FACTORY = VkVideoEncodeAV1ProfileInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeAV1ProfileInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeAV1ProfileInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeAV1ProfileInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeAV1ProfileInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeAV1ProfileInfoKHR.npNext(address()); }
        /** @return the value of the {@code stdProfile} field. */
        @NativeType("StdVideoAV1Profile")
        public int stdProfile() { return VkVideoEncodeAV1ProfileInfoKHR.nstdProfile(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeAV1ProfileInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeAV1ProfileInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PROFILE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PROFILE_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeAV1ProfileInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PROFILE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeAV1ProfileInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeAV1ProfileInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code stdProfile} field. */
        public VkVideoEncodeAV1ProfileInfoKHR.Buffer stdProfile(@NativeType("StdVideoAV1Profile") int value) { VkVideoEncodeAV1ProfileInfoKHR.nstdProfile(address(), value); return this; }

    }

}