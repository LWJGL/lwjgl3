/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying one or more video profiles used in conjunction.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note:</h5>
 * 
 * <p>Video transcoding is an example of a use case that necessitates the specification of multiple profiles in various contexts.</p>
 * </div>
 * 
 * <p>When the application provides a video decode profile and one or more video encode profiles in the profile list, the implementation ensures that any capabilitities returned or resources created are suitable for the video transcoding use cases without the need for manual data transformations.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code pProfiles} <b>must</b> not contain more than one element whose {@code videoCodecOperation} member specifies a decode operation</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR}</li>
 * <li>If {@code profileCount} is not 0, {@code pProfiles} <b>must</b> be a valid pointer to an array of {@code profileCount} valid {@link VkVideoProfileInfoKHR} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoProfileInfoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoProfileListInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #profileCount};
 *     {@link VkVideoProfileInfoKHR VkVideoProfileInfoKHR} const * {@link #pProfiles};
 * }</code></pre>
 */
public class VkVideoProfileListInfoKHR extends Struct<VkVideoProfileListInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PROFILECOUNT,
        PPROFILES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PROFILECOUNT = layout.offsetof(2);
        PPROFILES = layout.offsetof(3);
    }

    protected VkVideoProfileListInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoProfileListInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoProfileListInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoProfileListInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoProfileListInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of elements in the {@code pProfiles} array. */
    @NativeType("uint32_t")
    public int profileCount() { return nprofileCount(address()); }
    /** a pointer to an array of {@link VkVideoProfileInfoKHR} structures. */
    @Nullable
    @NativeType("VkVideoProfileInfoKHR const *")
    public VkVideoProfileInfoKHR.Buffer pProfiles() { return npProfiles(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoProfileListInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoProfileListInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoProfileListInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoProfileInfoKHR.Buffer} to the {@link #pProfiles} field. */
    public VkVideoProfileListInfoKHR pProfiles(@Nullable @NativeType("VkVideoProfileInfoKHR const *") VkVideoProfileInfoKHR.Buffer value) { npProfiles(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoProfileListInfoKHR set(
        int sType,
        long pNext,
        @Nullable VkVideoProfileInfoKHR.Buffer pProfiles
    ) {
        sType(sType);
        pNext(pNext);
        pProfiles(pProfiles);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoProfileListInfoKHR set(VkVideoProfileListInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoProfileListInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoProfileListInfoKHR malloc() {
        return new VkVideoProfileListInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoProfileListInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoProfileListInfoKHR calloc() {
        return new VkVideoProfileListInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoProfileListInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoProfileListInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoProfileListInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoProfileListInfoKHR} instance for the specified memory address. */
    public static VkVideoProfileListInfoKHR create(long address) {
        return new VkVideoProfileListInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoProfileListInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoProfileListInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoProfileListInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoProfileListInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoProfileListInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoProfileListInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoProfileListInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoProfileListInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoProfileListInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoProfileListInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoProfileListInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoProfileListInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoProfileListInfoKHR malloc(MemoryStack stack) {
        return new VkVideoProfileListInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoProfileListInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoProfileListInfoKHR calloc(MemoryStack stack) {
        return new VkVideoProfileListInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoProfileListInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoProfileListInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoProfileListInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoProfileListInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoProfileListInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoProfileListInfoKHR.PNEXT); }
    /** Unsafe version of {@link #profileCount}. */
    public static int nprofileCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoProfileListInfoKHR.PROFILECOUNT); }
    /** Unsafe version of {@link #pProfiles}. */
    @Nullable public static VkVideoProfileInfoKHR.Buffer npProfiles(long struct) { return VkVideoProfileInfoKHR.createSafe(memGetAddress(struct + VkVideoProfileListInfoKHR.PPROFILES), nprofileCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoProfileListInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoProfileListInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code profileCount} field of the specified {@code struct}. */
    public static void nprofileCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoProfileListInfoKHR.PROFILECOUNT, value); }
    /** Unsafe version of {@link #pProfiles(VkVideoProfileInfoKHR.Buffer) pProfiles}. */
    public static void npProfiles(long struct, @Nullable VkVideoProfileInfoKHR.Buffer value) { memPutAddress(struct + VkVideoProfileListInfoKHR.PPROFILES, memAddressSafe(value)); nprofileCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nprofileCount(struct) != 0) {
            check(memGetAddress(struct + VkVideoProfileListInfoKHR.PPROFILES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkVideoProfileListInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoProfileListInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoProfileListInfoKHR ELEMENT_FACTORY = VkVideoProfileListInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoProfileListInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoProfileListInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoProfileListInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoProfileListInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoProfileListInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoProfileListInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoProfileListInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoProfileListInfoKHR#profileCount} field. */
        @NativeType("uint32_t")
        public int profileCount() { return VkVideoProfileListInfoKHR.nprofileCount(address()); }
        /** @return a {@link VkVideoProfileInfoKHR.Buffer} view of the struct array pointed to by the {@link VkVideoProfileListInfoKHR#pProfiles} field. */
        @Nullable
        @NativeType("VkVideoProfileInfoKHR const *")
        public VkVideoProfileInfoKHR.Buffer pProfiles() { return VkVideoProfileListInfoKHR.npProfiles(address()); }

        /** Sets the specified value to the {@link VkVideoProfileListInfoKHR#sType} field. */
        public VkVideoProfileListInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoProfileListInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR} value to the {@link VkVideoProfileListInfoKHR#sType} field. */
        public VkVideoProfileListInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoProfileListInfoKHR#pNext} field. */
        public VkVideoProfileListInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoProfileListInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoProfileInfoKHR.Buffer} to the {@link VkVideoProfileListInfoKHR#pProfiles} field. */
        public VkVideoProfileListInfoKHR.Buffer pProfiles(@Nullable @NativeType("VkVideoProfileInfoKHR const *") VkVideoProfileInfoKHR.Buffer value) { VkVideoProfileListInfoKHR.npProfiles(address(), value); return this; }

    }

}