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
 * struct VkImageDrmFormatModifierExplicitCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint64_t drmFormatModifier;
 *     uint32_t drmFormatModifierPlaneCount;
 *     {@link VkSubresourceLayout VkSubresourceLayout} const * pPlaneLayouts;
 * }</code></pre>
 */
public class VkImageDrmFormatModifierExplicitCreateInfoEXT extends Struct<VkImageDrmFormatModifierExplicitCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DRMFORMATMODIFIER,
        DRMFORMATMODIFIERPLANECOUNT,
        PPLANELAYOUTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DRMFORMATMODIFIER = layout.offsetof(2);
        DRMFORMATMODIFIERPLANECOUNT = layout.offsetof(3);
        PPLANELAYOUTS = layout.offsetof(4);
    }

    protected VkImageDrmFormatModifierExplicitCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageDrmFormatModifierExplicitCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkImageDrmFormatModifierExplicitCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkImageDrmFormatModifierExplicitCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageDrmFormatModifierExplicitCreateInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code drmFormatModifier} field. */
    @NativeType("uint64_t")
    public long drmFormatModifier() { return ndrmFormatModifier(address()); }
    /** @return the value of the {@code drmFormatModifierPlaneCount} field. */
    @NativeType("uint32_t")
    public int drmFormatModifierPlaneCount() { return ndrmFormatModifierPlaneCount(address()); }
    /** @return a {@link VkSubresourceLayout.Buffer} view of the struct array pointed to by the {@code pPlaneLayouts} field. */
    @NativeType("VkSubresourceLayout const *")
    public VkSubresourceLayout.Buffer pPlaneLayouts() { return npPlaneLayouts(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageDrmFormatModifierExplicitCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkImageDrmFormatModifierExplicitCreateInfoEXT sType$Default() { return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageDrmFormatModifierExplicitCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code drmFormatModifier} field. */
    public VkImageDrmFormatModifierExplicitCreateInfoEXT drmFormatModifier(@NativeType("uint64_t") long value) { ndrmFormatModifier(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubresourceLayout.Buffer} to the {@code pPlaneLayouts} field. */
    public VkImageDrmFormatModifierExplicitCreateInfoEXT pPlaneLayouts(@NativeType("VkSubresourceLayout const *") VkSubresourceLayout.Buffer value) { npPlaneLayouts(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageDrmFormatModifierExplicitCreateInfoEXT set(
        int sType,
        long pNext,
        long drmFormatModifier,
        VkSubresourceLayout.Buffer pPlaneLayouts
    ) {
        sType(sType);
        pNext(pNext);
        drmFormatModifier(drmFormatModifier);
        pPlaneLayouts(pPlaneLayouts);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageDrmFormatModifierExplicitCreateInfoEXT set(VkImageDrmFormatModifierExplicitCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageDrmFormatModifierExplicitCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT malloc() {
        return new VkImageDrmFormatModifierExplicitCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageDrmFormatModifierExplicitCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT calloc() {
        return new VkImageDrmFormatModifierExplicitCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageDrmFormatModifierExplicitCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageDrmFormatModifierExplicitCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkImageDrmFormatModifierExplicitCreateInfoEXT} instance for the specified memory address. */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT create(long address) {
        return new VkImageDrmFormatModifierExplicitCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageDrmFormatModifierExplicitCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkImageDrmFormatModifierExplicitCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierExplicitCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierExplicitCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierExplicitCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierExplicitCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageDrmFormatModifierExplicitCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT malloc(MemoryStack stack) {
        return new VkImageDrmFormatModifierExplicitCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageDrmFormatModifierExplicitCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT calloc(MemoryStack stack) {
        return new VkImageDrmFormatModifierExplicitCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #drmFormatModifier}. */
    public static long ndrmFormatModifier(long struct) { return memGetLong(struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.DRMFORMATMODIFIER); }
    /** Unsafe version of {@link #drmFormatModifierPlaneCount}. */
    public static int ndrmFormatModifierPlaneCount(long struct) { return memGetInt(struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.DRMFORMATMODIFIERPLANECOUNT); }
    /** Unsafe version of {@link #pPlaneLayouts}. */
    public static VkSubresourceLayout.Buffer npPlaneLayouts(long struct) { return VkSubresourceLayout.create(memGetAddress(struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.PPLANELAYOUTS), ndrmFormatModifierPlaneCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #drmFormatModifier(long) drmFormatModifier}. */
    public static void ndrmFormatModifier(long struct, long value) { memPutLong(struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.DRMFORMATMODIFIER, value); }
    /** Sets the specified value to the {@code drmFormatModifierPlaneCount} field of the specified {@code struct}. */
    public static void ndrmFormatModifierPlaneCount(long struct, int value) { memPutInt(struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.DRMFORMATMODIFIERPLANECOUNT, value); }
    /** Unsafe version of {@link #pPlaneLayouts(VkSubresourceLayout.Buffer) pPlaneLayouts}. */
    public static void npPlaneLayouts(long struct, VkSubresourceLayout.Buffer value) { memPutAddress(struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.PPLANELAYOUTS, value.address()); ndrmFormatModifierPlaneCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.PPLANELAYOUTS));
    }

    // -----------------------------------

    /** An array of {@link VkImageDrmFormatModifierExplicitCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkImageDrmFormatModifierExplicitCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkImageDrmFormatModifierExplicitCreateInfoEXT ELEMENT_FACTORY = VkImageDrmFormatModifierExplicitCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageDrmFormatModifierExplicitCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageDrmFormatModifierExplicitCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageDrmFormatModifierExplicitCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageDrmFormatModifierExplicitCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code drmFormatModifier} field. */
        @NativeType("uint64_t")
        public long drmFormatModifier() { return VkImageDrmFormatModifierExplicitCreateInfoEXT.ndrmFormatModifier(address()); }
        /** @return the value of the {@code drmFormatModifierPlaneCount} field. */
        @NativeType("uint32_t")
        public int drmFormatModifierPlaneCount() { return VkImageDrmFormatModifierExplicitCreateInfoEXT.ndrmFormatModifierPlaneCount(address()); }
        /** @return a {@link VkSubresourceLayout.Buffer} view of the struct array pointed to by the {@code pPlaneLayouts} field. */
        @NativeType("VkSubresourceLayout const *")
        public VkSubresourceLayout.Buffer pPlaneLayouts() { return VkImageDrmFormatModifierExplicitCreateInfoEXT.npPlaneLayouts(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer sType$Default() { return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code drmFormatModifier} field. */
        public VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer drmFormatModifier(@NativeType("uint64_t") long value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.ndrmFormatModifier(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubresourceLayout.Buffer} to the {@code pPlaneLayouts} field. */
        public VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer pPlaneLayouts(@NativeType("VkSubresourceLayout const *") VkSubresourceLayout.Buffer value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.npPlaneLayouts(address(), value); return this; }

    }

}