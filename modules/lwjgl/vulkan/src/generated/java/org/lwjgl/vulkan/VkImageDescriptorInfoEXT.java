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
 * <pre><code>
 * struct VkImageDescriptorInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkImageViewCreateInfo VkImageViewCreateInfo} const * pView;
 *     VkImageLayout layout;
 * }</code></pre>
 */
public class VkImageDescriptorInfoEXT extends Struct<VkImageDescriptorInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PVIEW,
        LAYOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PVIEW = layout.offsetof(2);
        LAYOUT = layout.offsetof(3);
    }

    protected VkImageDescriptorInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageDescriptorInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkImageDescriptorInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkImageDescriptorInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageDescriptorInfoEXT(ByteBuffer container) {
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
    /** @return a {@link VkImageViewCreateInfo} view of the struct pointed to by the {@code pView} field. */
    @NativeType("VkImageViewCreateInfo const *")
    public VkImageViewCreateInfo pView() { return npView(address()); }
    /** @return the value of the {@code layout} field. */
    @NativeType("VkImageLayout")
    public int layout() { return nlayout(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageDescriptorInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_IMAGE_DESCRIPTOR_INFO_EXT STRUCTURE_TYPE_IMAGE_DESCRIPTOR_INFO_EXT} value to the {@code sType} field. */
    public VkImageDescriptorInfoEXT sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_IMAGE_DESCRIPTOR_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageDescriptorInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageViewCreateInfo} to the {@code pView} field. */
    public VkImageDescriptorInfoEXT pView(@NativeType("VkImageViewCreateInfo const *") VkImageViewCreateInfo value) { npView(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    public VkImageDescriptorInfoEXT layout(@NativeType("VkImageLayout") int value) { nlayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageDescriptorInfoEXT set(
        int sType,
        long pNext,
        VkImageViewCreateInfo pView,
        int layout
    ) {
        sType(sType);
        pNext(pNext);
        pView(pView);
        layout(layout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageDescriptorInfoEXT set(VkImageDescriptorInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageDescriptorInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageDescriptorInfoEXT malloc() {
        return new VkImageDescriptorInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageDescriptorInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageDescriptorInfoEXT calloc() {
        return new VkImageDescriptorInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageDescriptorInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkImageDescriptorInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageDescriptorInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkImageDescriptorInfoEXT} instance for the specified memory address. */
    public static VkImageDescriptorInfoEXT create(long address) {
        return new VkImageDescriptorInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageDescriptorInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkImageDescriptorInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkImageDescriptorInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageDescriptorInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageDescriptorInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageDescriptorInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageDescriptorInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageDescriptorInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageDescriptorInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageDescriptorInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageDescriptorInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageDescriptorInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageDescriptorInfoEXT malloc(MemoryStack stack) {
        return new VkImageDescriptorInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageDescriptorInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageDescriptorInfoEXT calloc(MemoryStack stack) {
        return new VkImageDescriptorInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageDescriptorInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageDescriptorInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageDescriptorInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageDescriptorInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageDescriptorInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageDescriptorInfoEXT.PNEXT); }
    /** Unsafe version of {@link #pView}. */
    public static VkImageViewCreateInfo npView(long struct) { return VkImageViewCreateInfo.create(memGetAddress(struct + VkImageDescriptorInfoEXT.PVIEW)); }
    /** Unsafe version of {@link #layout}. */
    public static int nlayout(long struct) { return memGetInt(struct + VkImageDescriptorInfoEXT.LAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageDescriptorInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageDescriptorInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #pView(VkImageViewCreateInfo) pView}. */
    public static void npView(long struct, VkImageViewCreateInfo value) { memPutAddress(struct + VkImageDescriptorInfoEXT.PVIEW, value.address()); }
    /** Unsafe version of {@link #layout(int) layout}. */
    public static void nlayout(long struct, int value) { memPutInt(struct + VkImageDescriptorInfoEXT.LAYOUT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkImageDescriptorInfoEXT.PVIEW));
    }

    // -----------------------------------

    /** An array of {@link VkImageDescriptorInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkImageDescriptorInfoEXT, Buffer> implements NativeResource {

        private static final VkImageDescriptorInfoEXT ELEMENT_FACTORY = VkImageDescriptorInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkImageDescriptorInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageDescriptorInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageDescriptorInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageDescriptorInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageDescriptorInfoEXT.npNext(address()); }
        /** @return a {@link VkImageViewCreateInfo} view of the struct pointed to by the {@code pView} field. */
        @NativeType("VkImageViewCreateInfo const *")
        public VkImageViewCreateInfo pView() { return VkImageDescriptorInfoEXT.npView(address()); }
        /** @return the value of the {@code layout} field. */
        @NativeType("VkImageLayout")
        public int layout() { return VkImageDescriptorInfoEXT.nlayout(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageDescriptorInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImageDescriptorInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_IMAGE_DESCRIPTOR_INFO_EXT STRUCTURE_TYPE_IMAGE_DESCRIPTOR_INFO_EXT} value to the {@code sType} field. */
        public VkImageDescriptorInfoEXT.Buffer sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_IMAGE_DESCRIPTOR_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageDescriptorInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkImageDescriptorInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageViewCreateInfo} to the {@code pView} field. */
        public VkImageDescriptorInfoEXT.Buffer pView(@NativeType("VkImageViewCreateInfo const *") VkImageViewCreateInfo value) { VkImageDescriptorInfoEXT.npView(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        public VkImageDescriptorInfoEXT.Buffer layout(@NativeType("VkImageLayout") int value) { VkImageDescriptorInfoEXT.nlayout(address(), value); return this; }

    }

}