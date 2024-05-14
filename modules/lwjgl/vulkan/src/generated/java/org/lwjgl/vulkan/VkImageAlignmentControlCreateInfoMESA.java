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
 * Specify image alignment.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code maximumRequestedAlignment} is not 0, the implementation <b>should</b> choose an image memory layout that requires an alignment no larger than {@code maximumRequestedAlignment} as reported in {@link VkMemoryRequirements}{@code ::alignment}. If such a layout does not exist for the given image creation parameters, the implementation <b>should</b> return the smallest alignment which is supported in {@link VkMemoryRequirements}.</p>
 * 
 * <p>If an implementation needs to disable image compression for {@code maximumRequestedAlignment} to be honored - where a larger alignment would enable image compression - the implementation <b>should</b> not use {@code maximumRequestedAlignment}, and <b>should</b> return the smallest alignment which does not compromise compression. If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-imageCompressionControl">{@code imageCompressionControl}</a> is enabled, the application <b>can</b> chain a {@link VkImageCompressionControlEXT} with {@link EXTImageCompressionControl#VK_IMAGE_COMPRESSION_DISABLED_EXT IMAGE_COMPRESSION_DISABLED_EXT}. In this case, image compression considerations <b>should</b> not apply when implementation decides alignment.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code maximumRequestedAlignment} is not 0, {@code maximumRequestedAlignment} <b>must</b> be a power of two</li>
 * <li>If {@code maximumRequestedAlignment} is not 0, the bitwise-and of {@code maximumRequestedAlignment} and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-supportedImageAlignmentMask">{@code supportedImageAlignmentMask}</a> <b>must</b> be non-zero</li>
 * <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-imageAlignmentControl">{@code imageAlignmentControl}</a> <b>must</b> be enabled on the device</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link MESAImageAlignmentControl#VK_STRUCTURE_TYPE_IMAGE_ALIGNMENT_CONTROL_CREATE_INFO_MESA STRUCTURE_TYPE_IMAGE_ALIGNMENT_CONTROL_CREATE_INFO_MESA}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageAlignmentControlCreateInfoMESA {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #maximumRequestedAlignment};
 * }</code></pre>
 */
public class VkImageAlignmentControlCreateInfoMESA extends Struct<VkImageAlignmentControlCreateInfoMESA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXIMUMREQUESTEDALIGNMENT;

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
        MAXIMUMREQUESTEDALIGNMENT = layout.offsetof(2);
    }

    protected VkImageAlignmentControlCreateInfoMESA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageAlignmentControlCreateInfoMESA create(long address, @Nullable ByteBuffer container) {
        return new VkImageAlignmentControlCreateInfoMESA(address, container);
    }

    /**
     * Creates a {@code VkImageAlignmentControlCreateInfoMESA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageAlignmentControlCreateInfoMESA(ByteBuffer container) {
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
    /** specifies the maximum alignment for the image. */
    @NativeType("uint32_t")
    public int maximumRequestedAlignment() { return nmaximumRequestedAlignment(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageAlignmentControlCreateInfoMESA sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link MESAImageAlignmentControl#VK_STRUCTURE_TYPE_IMAGE_ALIGNMENT_CONTROL_CREATE_INFO_MESA STRUCTURE_TYPE_IMAGE_ALIGNMENT_CONTROL_CREATE_INFO_MESA} value to the {@link #sType} field. */
    public VkImageAlignmentControlCreateInfoMESA sType$Default() { return sType(MESAImageAlignmentControl.VK_STRUCTURE_TYPE_IMAGE_ALIGNMENT_CONTROL_CREATE_INFO_MESA); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageAlignmentControlCreateInfoMESA pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #maximumRequestedAlignment} field. */
    public VkImageAlignmentControlCreateInfoMESA maximumRequestedAlignment(@NativeType("uint32_t") int value) { nmaximumRequestedAlignment(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageAlignmentControlCreateInfoMESA set(
        int sType,
        long pNext,
        int maximumRequestedAlignment
    ) {
        sType(sType);
        pNext(pNext);
        maximumRequestedAlignment(maximumRequestedAlignment);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageAlignmentControlCreateInfoMESA set(VkImageAlignmentControlCreateInfoMESA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageAlignmentControlCreateInfoMESA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageAlignmentControlCreateInfoMESA malloc() {
        return new VkImageAlignmentControlCreateInfoMESA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageAlignmentControlCreateInfoMESA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageAlignmentControlCreateInfoMESA calloc() {
        return new VkImageAlignmentControlCreateInfoMESA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageAlignmentControlCreateInfoMESA} instance allocated with {@link BufferUtils}. */
    public static VkImageAlignmentControlCreateInfoMESA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageAlignmentControlCreateInfoMESA(memAddress(container), container);
    }

    /** Returns a new {@code VkImageAlignmentControlCreateInfoMESA} instance for the specified memory address. */
    public static VkImageAlignmentControlCreateInfoMESA create(long address) {
        return new VkImageAlignmentControlCreateInfoMESA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageAlignmentControlCreateInfoMESA createSafe(long address) {
        return address == NULL ? null : new VkImageAlignmentControlCreateInfoMESA(address, null);
    }

    /**
     * Returns a new {@link VkImageAlignmentControlCreateInfoMESA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageAlignmentControlCreateInfoMESA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageAlignmentControlCreateInfoMESA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageAlignmentControlCreateInfoMESA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageAlignmentControlCreateInfoMESA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageAlignmentControlCreateInfoMESA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageAlignmentControlCreateInfoMESA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageAlignmentControlCreateInfoMESA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageAlignmentControlCreateInfoMESA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageAlignmentControlCreateInfoMESA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageAlignmentControlCreateInfoMESA malloc(MemoryStack stack) {
        return new VkImageAlignmentControlCreateInfoMESA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageAlignmentControlCreateInfoMESA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageAlignmentControlCreateInfoMESA calloc(MemoryStack stack) {
        return new VkImageAlignmentControlCreateInfoMESA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageAlignmentControlCreateInfoMESA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageAlignmentControlCreateInfoMESA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageAlignmentControlCreateInfoMESA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageAlignmentControlCreateInfoMESA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageAlignmentControlCreateInfoMESA.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageAlignmentControlCreateInfoMESA.PNEXT); }
    /** Unsafe version of {@link #maximumRequestedAlignment}. */
    public static int nmaximumRequestedAlignment(long struct) { return UNSAFE.getInt(null, struct + VkImageAlignmentControlCreateInfoMESA.MAXIMUMREQUESTEDALIGNMENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageAlignmentControlCreateInfoMESA.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageAlignmentControlCreateInfoMESA.PNEXT, value); }
    /** Unsafe version of {@link #maximumRequestedAlignment(int) maximumRequestedAlignment}. */
    public static void nmaximumRequestedAlignment(long struct, int value) { UNSAFE.putInt(null, struct + VkImageAlignmentControlCreateInfoMESA.MAXIMUMREQUESTEDALIGNMENT, value); }

    // -----------------------------------

    /** An array of {@link VkImageAlignmentControlCreateInfoMESA} structs. */
    public static class Buffer extends StructBuffer<VkImageAlignmentControlCreateInfoMESA, Buffer> implements NativeResource {

        private static final VkImageAlignmentControlCreateInfoMESA ELEMENT_FACTORY = VkImageAlignmentControlCreateInfoMESA.create(-1L);

        /**
         * Creates a new {@code VkImageAlignmentControlCreateInfoMESA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageAlignmentControlCreateInfoMESA#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageAlignmentControlCreateInfoMESA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageAlignmentControlCreateInfoMESA#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageAlignmentControlCreateInfoMESA.nsType(address()); }
        /** @return the value of the {@link VkImageAlignmentControlCreateInfoMESA#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageAlignmentControlCreateInfoMESA.npNext(address()); }
        /** @return the value of the {@link VkImageAlignmentControlCreateInfoMESA#maximumRequestedAlignment} field. */
        @NativeType("uint32_t")
        public int maximumRequestedAlignment() { return VkImageAlignmentControlCreateInfoMESA.nmaximumRequestedAlignment(address()); }

        /** Sets the specified value to the {@link VkImageAlignmentControlCreateInfoMESA#sType} field. */
        public VkImageAlignmentControlCreateInfoMESA.Buffer sType(@NativeType("VkStructureType") int value) { VkImageAlignmentControlCreateInfoMESA.nsType(address(), value); return this; }
        /** Sets the {@link MESAImageAlignmentControl#VK_STRUCTURE_TYPE_IMAGE_ALIGNMENT_CONTROL_CREATE_INFO_MESA STRUCTURE_TYPE_IMAGE_ALIGNMENT_CONTROL_CREATE_INFO_MESA} value to the {@link VkImageAlignmentControlCreateInfoMESA#sType} field. */
        public VkImageAlignmentControlCreateInfoMESA.Buffer sType$Default() { return sType(MESAImageAlignmentControl.VK_STRUCTURE_TYPE_IMAGE_ALIGNMENT_CONTROL_CREATE_INFO_MESA); }
        /** Sets the specified value to the {@link VkImageAlignmentControlCreateInfoMESA#pNext} field. */
        public VkImageAlignmentControlCreateInfoMESA.Buffer pNext(@NativeType("void const *") long value) { VkImageAlignmentControlCreateInfoMESA.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageAlignmentControlCreateInfoMESA#maximumRequestedAlignment} field. */
        public VkImageAlignmentControlCreateInfoMESA.Buffer maximumRequestedAlignment(@NativeType("uint32_t") int value) { VkImageAlignmentControlCreateInfoMESA.nmaximumRequestedAlignment(address(), value); return this; }

    }

}