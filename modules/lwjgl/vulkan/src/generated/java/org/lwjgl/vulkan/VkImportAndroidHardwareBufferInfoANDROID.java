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
 * Import memory from an Android hardware buffer.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VK10#vkAllocateMemory AllocateMemory} command succeeds, the implementation <b>must</b> acquire a reference to the imported hardware buffer, which it <b>must</b> release when the device memory object is freed. If the command fails, the implementation <b>must</b> not retain a reference.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code buffer} is not {@code NULL}, Android hardware buffers <b>must</b> be supported for import, as reported by {@link VkExternalImageFormatProperties} or {@link VkExternalBufferProperties}</li>
 * <li>If {@code buffer} is not {@code NULL}, it <b>must</b> be a valid Android hardware buffer object with {@code AHardwareBuffer_Desc}{@code ::usage} compatible with Vulkan as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-external-android-hardware-buffer">Android Hardware Buffers</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID}</li>
 * <li>{@code buffer} <b>must</b> be a valid pointer to an {@code AHardwareBuffer} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImportAndroidHardwareBufferInfoANDROID {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     AHardwareBuffer * {@link #buffer};
 * }</code></pre>
 */
public class VkImportAndroidHardwareBufferInfoANDROID extends Struct<VkImportAndroidHardwareBufferInfoANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BUFFER = layout.offsetof(2);
    }

    protected VkImportAndroidHardwareBufferInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImportAndroidHardwareBufferInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new VkImportAndroidHardwareBufferInfoANDROID(address, container);
    }

    /**
     * Creates a {@code VkImportAndroidHardwareBufferInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportAndroidHardwareBufferInfoANDROID(ByteBuffer container) {
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
    /** the Android hardware buffer to import. */
    @NativeType("AHardwareBuffer *")
    public long buffer() { return nbuffer(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImportAndroidHardwareBufferInfoANDROID sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID} value to the {@link #sType} field. */
    public VkImportAndroidHardwareBufferInfoANDROID sType$Default() { return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImportAndroidHardwareBufferInfoANDROID pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #buffer} field. */
    public VkImportAndroidHardwareBufferInfoANDROID buffer(@NativeType("AHardwareBuffer *") long value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportAndroidHardwareBufferInfoANDROID set(
        int sType,
        long pNext,
        long buffer
    ) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImportAndroidHardwareBufferInfoANDROID set(VkImportAndroidHardwareBufferInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImportAndroidHardwareBufferInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportAndroidHardwareBufferInfoANDROID malloc() {
        return new VkImportAndroidHardwareBufferInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImportAndroidHardwareBufferInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportAndroidHardwareBufferInfoANDROID calloc() {
        return new VkImportAndroidHardwareBufferInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImportAndroidHardwareBufferInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static VkImportAndroidHardwareBufferInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImportAndroidHardwareBufferInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code VkImportAndroidHardwareBufferInfoANDROID} instance for the specified memory address. */
    public static VkImportAndroidHardwareBufferInfoANDROID create(long address) {
        return new VkImportAndroidHardwareBufferInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportAndroidHardwareBufferInfoANDROID createSafe(long address) {
        return address == NULL ? null : new VkImportAndroidHardwareBufferInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link VkImportAndroidHardwareBufferInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportAndroidHardwareBufferInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImportAndroidHardwareBufferInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportAndroidHardwareBufferInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportAndroidHardwareBufferInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportAndroidHardwareBufferInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImportAndroidHardwareBufferInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImportAndroidHardwareBufferInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportAndroidHardwareBufferInfoANDROID.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImportAndroidHardwareBufferInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportAndroidHardwareBufferInfoANDROID malloc(MemoryStack stack) {
        return new VkImportAndroidHardwareBufferInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImportAndroidHardwareBufferInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportAndroidHardwareBufferInfoANDROID calloc(MemoryStack stack) {
        return new VkImportAndroidHardwareBufferInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImportAndroidHardwareBufferInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportAndroidHardwareBufferInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportAndroidHardwareBufferInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportAndroidHardwareBufferInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImportAndroidHardwareBufferInfoANDROID.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportAndroidHardwareBufferInfoANDROID.PNEXT); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return memGetAddress(struct + VkImportAndroidHardwareBufferInfoANDROID.BUFFER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImportAndroidHardwareBufferInfoANDROID.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportAndroidHardwareBufferInfoANDROID.PNEXT, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { memPutAddress(struct + VkImportAndroidHardwareBufferInfoANDROID.BUFFER, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkImportAndroidHardwareBufferInfoANDROID.BUFFER));
    }

    // -----------------------------------

    /** An array of {@link VkImportAndroidHardwareBufferInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<VkImportAndroidHardwareBufferInfoANDROID, Buffer> implements NativeResource {

        private static final VkImportAndroidHardwareBufferInfoANDROID ELEMENT_FACTORY = VkImportAndroidHardwareBufferInfoANDROID.create(-1L);

        /**
         * Creates a new {@code VkImportAndroidHardwareBufferInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportAndroidHardwareBufferInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImportAndroidHardwareBufferInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImportAndroidHardwareBufferInfoANDROID#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImportAndroidHardwareBufferInfoANDROID.nsType(address()); }
        /** @return the value of the {@link VkImportAndroidHardwareBufferInfoANDROID#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImportAndroidHardwareBufferInfoANDROID.npNext(address()); }
        /** @return the value of the {@link VkImportAndroidHardwareBufferInfoANDROID#buffer} field. */
        @NativeType("AHardwareBuffer *")
        public long buffer() { return VkImportAndroidHardwareBufferInfoANDROID.nbuffer(address()); }

        /** Sets the specified value to the {@link VkImportAndroidHardwareBufferInfoANDROID#sType} field. */
        public VkImportAndroidHardwareBufferInfoANDROID.Buffer sType(@NativeType("VkStructureType") int value) { VkImportAndroidHardwareBufferInfoANDROID.nsType(address(), value); return this; }
        /** Sets the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID} value to the {@link VkImportAndroidHardwareBufferInfoANDROID#sType} field. */
        public VkImportAndroidHardwareBufferInfoANDROID.Buffer sType$Default() { return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID); }
        /** Sets the specified value to the {@link VkImportAndroidHardwareBufferInfoANDROID#pNext} field. */
        public VkImportAndroidHardwareBufferInfoANDROID.Buffer pNext(@NativeType("void const *") long value) { VkImportAndroidHardwareBufferInfoANDROID.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportAndroidHardwareBufferInfoANDROID#buffer} field. */
        public VkImportAndroidHardwareBufferInfoANDROID.Buffer buffer(@NativeType("AHardwareBuffer *") long value) { VkImportAndroidHardwareBufferInfoANDROID.nbuffer(address(), value); return this; }

    }

}