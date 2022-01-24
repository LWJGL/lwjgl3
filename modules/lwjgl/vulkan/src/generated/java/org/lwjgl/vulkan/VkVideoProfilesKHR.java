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
 * Structure enumerating the video profiles.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_PROFILES_KHR STRUCTURE_TYPE_VIDEO_PROFILES_KHR}</li>
 * <li>{@code pProfiles} <b>must</b> be a valid pointer to a valid {@link VkVideoProfileKHR} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPhysicalDeviceVideoFormatInfoKHR}, {@link VkVideoProfileKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoProfilesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #profileCount};
 *     {@link VkVideoProfileKHR VkVideoProfileKHR} const * {@link #pProfiles};
 * }</code></pre>
 */
public class VkVideoProfilesKHR extends Struct implements NativeResource {

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

    /**
     * Creates a {@code VkVideoProfilesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoProfilesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** an integer which holds the number of video profiles included in {@code pProfiles}. */
    @NativeType("uint32_t")
    public int profileCount() { return nprofileCount(address()); }
    /** a pointer to an array of {@link VkVideoProfileKHR} structures. Each {@link VkVideoProfileKHR} structure <b>must</b> chain the corresponding codec-operation specific extension video profile structure. */
    @NativeType("VkVideoProfileKHR const *")
    public VkVideoProfileKHR pProfiles() { return npProfiles(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoProfilesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_PROFILES_KHR STRUCTURE_TYPE_VIDEO_PROFILES_KHR} value to the {@link #sType} field. */
    public VkVideoProfilesKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PROFILES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoProfilesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #profileCount} field. */
    public VkVideoProfilesKHR profileCount(@NativeType("uint32_t") int value) { nprofileCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoProfileKHR} to the {@link #pProfiles} field. */
    public VkVideoProfilesKHR pProfiles(@NativeType("VkVideoProfileKHR const *") VkVideoProfileKHR value) { npProfiles(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoProfilesKHR set(
        int sType,
        long pNext,
        int profileCount,
        VkVideoProfileKHR pProfiles
    ) {
        sType(sType);
        pNext(pNext);
        profileCount(profileCount);
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
    public VkVideoProfilesKHR set(VkVideoProfilesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoProfilesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoProfilesKHR malloc() {
        return wrap(VkVideoProfilesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoProfilesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoProfilesKHR calloc() {
        return wrap(VkVideoProfilesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoProfilesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoProfilesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoProfilesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoProfilesKHR} instance for the specified memory address. */
    public static VkVideoProfilesKHR create(long address) {
        return wrap(VkVideoProfilesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoProfilesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoProfilesKHR.class, address);
    }

    /**
     * Returns a new {@link VkVideoProfilesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoProfilesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoProfilesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoProfilesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoProfilesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoProfilesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoProfilesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoProfilesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoProfilesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoProfilesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoProfilesKHR malloc(MemoryStack stack) {
        return wrap(VkVideoProfilesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoProfilesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoProfilesKHR calloc(MemoryStack stack) {
        return wrap(VkVideoProfilesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoProfilesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoProfilesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoProfilesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoProfilesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoProfilesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoProfilesKHR.PNEXT); }
    /** Unsafe version of {@link #profileCount}. */
    public static int nprofileCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoProfilesKHR.PROFILECOUNT); }
    /** Unsafe version of {@link #pProfiles}. */
    public static VkVideoProfileKHR npProfiles(long struct) { return VkVideoProfileKHR.create(memGetAddress(struct + VkVideoProfilesKHR.PPROFILES)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoProfilesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoProfilesKHR.PNEXT, value); }
    /** Unsafe version of {@link #profileCount(int) profileCount}. */
    public static void nprofileCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoProfilesKHR.PROFILECOUNT, value); }
    /** Unsafe version of {@link #pProfiles(VkVideoProfileKHR) pProfiles}. */
    public static void npProfiles(long struct, VkVideoProfileKHR value) { memPutAddress(struct + VkVideoProfilesKHR.PPROFILES, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoProfilesKHR.PPROFILES));
    }

    // -----------------------------------

    /** An array of {@link VkVideoProfilesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoProfilesKHR, Buffer> implements NativeResource {

        private static final VkVideoProfilesKHR ELEMENT_FACTORY = VkVideoProfilesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoProfilesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoProfilesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoProfilesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoProfilesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoProfilesKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoProfilesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoProfilesKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoProfilesKHR#profileCount} field. */
        @NativeType("uint32_t")
        public int profileCount() { return VkVideoProfilesKHR.nprofileCount(address()); }
        /** @return a {@link VkVideoProfileKHR} view of the struct pointed to by the {@link VkVideoProfilesKHR#pProfiles} field. */
        @NativeType("VkVideoProfileKHR const *")
        public VkVideoProfileKHR pProfiles() { return VkVideoProfilesKHR.npProfiles(address()); }

        /** Sets the specified value to the {@link VkVideoProfilesKHR#sType} field. */
        public VkVideoProfilesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoProfilesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_PROFILES_KHR STRUCTURE_TYPE_VIDEO_PROFILES_KHR} value to the {@link VkVideoProfilesKHR#sType} field. */
        public VkVideoProfilesKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PROFILES_KHR); }
        /** Sets the specified value to the {@link VkVideoProfilesKHR#pNext} field. */
        public VkVideoProfilesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoProfilesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoProfilesKHR#profileCount} field. */
        public VkVideoProfilesKHR.Buffer profileCount(@NativeType("uint32_t") int value) { VkVideoProfilesKHR.nprofileCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoProfileKHR} to the {@link VkVideoProfilesKHR#pProfiles} field. */
        public VkVideoProfilesKHR.Buffer pProfiles(@NativeType("VkVideoProfileKHR const *") VkVideoProfileKHR value) { VkVideoProfilesKHR.npProfiles(address(), value); return this; }

    }

}