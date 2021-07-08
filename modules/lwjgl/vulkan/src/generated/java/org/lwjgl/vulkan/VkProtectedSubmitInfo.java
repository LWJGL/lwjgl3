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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure indicating whether the submission is protected.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the protected memory feature is not enabled, {@code protectedSubmit} <b>must</b> not be {@link VK10#VK_TRUE TRUE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkProtectedSubmitInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 {@link #protectedSubmit};
 * }</code></pre>
 */
public class VkProtectedSubmitInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PROTECTEDSUBMIT;

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
        PROTECTEDSUBMIT = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkProtectedSubmitInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkProtectedSubmitInfo(ByteBuffer container) {
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
    /** specifies whether the batch is protected. If {@code protectedSubmit} is {@link VK10#VK_TRUE TRUE}, the batch is protected. If {@code protectedSubmit} is {@link VK10#VK_FALSE FALSE}, the batch is unprotected. If the {@link VkSubmitInfo}{@code ::pNext} chain does not include this structure, the batch is unprotected. */
    @NativeType("VkBool32")
    public boolean protectedSubmit() { return nprotectedSubmit(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkProtectedSubmitInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkProtectedSubmitInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #protectedSubmit} field. */
    public VkProtectedSubmitInfo protectedSubmit(@NativeType("VkBool32") boolean value) { nprotectedSubmit(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkProtectedSubmitInfo set(
        int sType,
        long pNext,
        boolean protectedSubmit
    ) {
        sType(sType);
        pNext(pNext);
        protectedSubmit(protectedSubmit);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkProtectedSubmitInfo set(VkProtectedSubmitInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkProtectedSubmitInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkProtectedSubmitInfo malloc() {
        return wrap(VkProtectedSubmitInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkProtectedSubmitInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkProtectedSubmitInfo calloc() {
        return wrap(VkProtectedSubmitInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkProtectedSubmitInfo} instance allocated with {@link BufferUtils}. */
    public static VkProtectedSubmitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkProtectedSubmitInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkProtectedSubmitInfo} instance for the specified memory address. */
    public static VkProtectedSubmitInfo create(long address) {
        return wrap(VkProtectedSubmitInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkProtectedSubmitInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkProtectedSubmitInfo.class, address);
    }

    /**
     * Returns a new {@link VkProtectedSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkProtectedSubmitInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkProtectedSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkProtectedSubmitInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkProtectedSubmitInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkProtectedSubmitInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkProtectedSubmitInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkProtectedSubmitInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkProtectedSubmitInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkProtectedSubmitInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkProtectedSubmitInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkProtectedSubmitInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkProtectedSubmitInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkProtectedSubmitInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkProtectedSubmitInfo mallocStack(MemoryStack stack) {
        return wrap(VkProtectedSubmitInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkProtectedSubmitInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkProtectedSubmitInfo callocStack(MemoryStack stack) {
        return wrap(VkProtectedSubmitInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkProtectedSubmitInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkProtectedSubmitInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkProtectedSubmitInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkProtectedSubmitInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkProtectedSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkProtectedSubmitInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkProtectedSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkProtectedSubmitInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkProtectedSubmitInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkProtectedSubmitInfo.PNEXT); }
    /** Unsafe version of {@link #protectedSubmit}. */
    public static int nprotectedSubmit(long struct) { return UNSAFE.getInt(null, struct + VkProtectedSubmitInfo.PROTECTEDSUBMIT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkProtectedSubmitInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkProtectedSubmitInfo.PNEXT, value); }
    /** Unsafe version of {@link #protectedSubmit(boolean) protectedSubmit}. */
    public static void nprotectedSubmit(long struct, int value) { UNSAFE.putInt(null, struct + VkProtectedSubmitInfo.PROTECTEDSUBMIT, value); }

    // -----------------------------------

    /** An array of {@link VkProtectedSubmitInfo} structs. */
    public static class Buffer extends StructBuffer<VkProtectedSubmitInfo, Buffer> implements NativeResource {

        private static final VkProtectedSubmitInfo ELEMENT_FACTORY = VkProtectedSubmitInfo.create(-1L);

        /**
         * Creates a new {@code VkProtectedSubmitInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkProtectedSubmitInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkProtectedSubmitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkProtectedSubmitInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkProtectedSubmitInfo.npNext(address()); }
        /** @return the value of the {@link VkProtectedSubmitInfo#protectedSubmit} field. */
        @NativeType("VkBool32")
        public boolean protectedSubmit() { return VkProtectedSubmitInfo.nprotectedSubmit(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkProtectedSubmitInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkProtectedSubmitInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkProtectedSubmitInfo.Buffer pNext(@NativeType("void const *") long value) { VkProtectedSubmitInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkProtectedSubmitInfo#protectedSubmit} field. */
        public VkProtectedSubmitInfo.Buffer protectedSubmit(@NativeType("VkBool32") boolean value) { VkProtectedSubmitInfo.nprotectedSubmit(address(), value ? 1 : 0); return this; }

    }

}