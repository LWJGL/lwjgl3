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
 * Structure containing an Android hardware buffer external format.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code externalFormat} is zero, the effect is as if the {@link VkExternalFormatANDROID} structure was not present. Otherwise, the {@code image} will have the specified external format.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code externalFormat} <b>must</b> be 0 or a value returned in the {@code externalFormat} member of {@link VkAndroidHardwareBufferFormatPropertiesANDROID} by an earlier call to {@link ANDROIDExternalMemoryAndroidHardwareBuffer#vkGetAndroidHardwareBufferPropertiesANDROID GetAndroidHardwareBufferPropertiesANDROID}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExternalFormatANDROID {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint64_t {@link #externalFormat};
 * }</code></pre>
 */
public class VkExternalFormatANDROID extends Struct<VkExternalFormatANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXTERNALFORMAT;

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
        EXTERNALFORMAT = layout.offsetof(2);
    }

    protected VkExternalFormatANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExternalFormatANDROID create(long address, @Nullable ByteBuffer container) {
        return new VkExternalFormatANDROID(address, container);
    }

    /**
     * Creates a {@code VkExternalFormatANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalFormatANDROID(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** an implementation-defined identifier for the external format */
    @NativeType("uint64_t")
    public long externalFormat() { return nexternalFormat(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkExternalFormatANDROID sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID} value to the {@link #sType} field. */
    public VkExternalFormatANDROID sType$Default() { return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkExternalFormatANDROID pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #externalFormat} field. */
    public VkExternalFormatANDROID externalFormat(@NativeType("uint64_t") long value) { nexternalFormat(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExternalFormatANDROID set(
        int sType,
        long pNext,
        long externalFormat
    ) {
        sType(sType);
        pNext(pNext);
        externalFormat(externalFormat);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExternalFormatANDROID set(VkExternalFormatANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExternalFormatANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalFormatANDROID malloc() {
        return new VkExternalFormatANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExternalFormatANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalFormatANDROID calloc() {
        return new VkExternalFormatANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExternalFormatANDROID} instance allocated with {@link BufferUtils}. */
    public static VkExternalFormatANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalFormatANDROID(memAddress(container), container);
    }

    /** Returns a new {@code VkExternalFormatANDROID} instance for the specified memory address. */
    public static VkExternalFormatANDROID create(long address) {
        return new VkExternalFormatANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalFormatANDROID createSafe(long address) {
        return address == NULL ? null : new VkExternalFormatANDROID(address, null);
    }

    /**
     * Returns a new {@link VkExternalFormatANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalFormatANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExternalFormatANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalFormatANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalFormatANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalFormatANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExternalFormatANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalFormatANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalFormatANDROID.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExternalFormatANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalFormatANDROID malloc(MemoryStack stack) {
        return new VkExternalFormatANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExternalFormatANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalFormatANDROID calloc(MemoryStack stack) {
        return new VkExternalFormatANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExternalFormatANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalFormatANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalFormatANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalFormatANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkExternalFormatANDROID.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExternalFormatANDROID.PNEXT); }
    /** Unsafe version of {@link #externalFormat}. */
    public static long nexternalFormat(long struct) { return UNSAFE.getLong(null, struct + VkExternalFormatANDROID.EXTERNALFORMAT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkExternalFormatANDROID.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExternalFormatANDROID.PNEXT, value); }
    /** Unsafe version of {@link #externalFormat(long) externalFormat}. */
    public static void nexternalFormat(long struct, long value) { UNSAFE.putLong(null, struct + VkExternalFormatANDROID.EXTERNALFORMAT, value); }

    // -----------------------------------

    /** An array of {@link VkExternalFormatANDROID} structs. */
    public static class Buffer extends StructBuffer<VkExternalFormatANDROID, Buffer> implements NativeResource {

        private static final VkExternalFormatANDROID ELEMENT_FACTORY = VkExternalFormatANDROID.create(-1L);

        /**
         * Creates a new {@code VkExternalFormatANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalFormatANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExternalFormatANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExternalFormatANDROID#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExternalFormatANDROID.nsType(address()); }
        /** @return the value of the {@link VkExternalFormatANDROID#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkExternalFormatANDROID.npNext(address()); }
        /** @return the value of the {@link VkExternalFormatANDROID#externalFormat} field. */
        @NativeType("uint64_t")
        public long externalFormat() { return VkExternalFormatANDROID.nexternalFormat(address()); }

        /** Sets the specified value to the {@link VkExternalFormatANDROID#sType} field. */
        public VkExternalFormatANDROID.Buffer sType(@NativeType("VkStructureType") int value) { VkExternalFormatANDROID.nsType(address(), value); return this; }
        /** Sets the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID} value to the {@link VkExternalFormatANDROID#sType} field. */
        public VkExternalFormatANDROID.Buffer sType$Default() { return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID); }
        /** Sets the specified value to the {@link VkExternalFormatANDROID#pNext} field. */
        public VkExternalFormatANDROID.Buffer pNext(@NativeType("void *") long value) { VkExternalFormatANDROID.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkExternalFormatANDROID#externalFormat} field. */
        public VkExternalFormatANDROID.Buffer externalFormat(@NativeType("uint64_t") long value) { VkExternalFormatANDROID.nexternalFormat(address(), value); return this; }

    }

}