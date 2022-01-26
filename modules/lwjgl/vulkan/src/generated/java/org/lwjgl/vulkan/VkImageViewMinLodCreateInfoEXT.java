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
 * Structure describing the minimum lod of an image view.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-minLod">{@code minLod}</a> feature is not enabled, {@code minLod} <b>must</b> be {@code 0.0}.</li>
 * <li>{@code minLod} <b>must</b> be less or equal to the index of the last mipmap level accessible to the view.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTImageViewMinLod#VK_STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageViewMinLodCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     float {@link #minLod};
 * }</code></pre>
 */
public class VkImageViewMinLodCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MINLOD;

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
        MINLOD = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkImageViewMinLodCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageViewMinLodCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the value to clamp the minimum LOD accessible by this {@code VkImageView}. */
    public float minLod() { return nminLod(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageViewMinLodCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageViewMinLod#VK_STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkImageViewMinLodCreateInfoEXT sType$Default() { return sType(EXTImageViewMinLod.VK_STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageViewMinLodCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #minLod} field. */
    public VkImageViewMinLodCreateInfoEXT minLod(float value) { nminLod(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageViewMinLodCreateInfoEXT set(
        int sType,
        long pNext,
        float minLod
    ) {
        sType(sType);
        pNext(pNext);
        minLod(minLod);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageViewMinLodCreateInfoEXT set(VkImageViewMinLodCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageViewMinLodCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageViewMinLodCreateInfoEXT malloc() {
        return wrap(VkImageViewMinLodCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageViewMinLodCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageViewMinLodCreateInfoEXT calloc() {
        return wrap(VkImageViewMinLodCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageViewMinLodCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkImageViewMinLodCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageViewMinLodCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageViewMinLodCreateInfoEXT} instance for the specified memory address. */
    public static VkImageViewMinLodCreateInfoEXT create(long address) {
        return wrap(VkImageViewMinLodCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageViewMinLodCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkImageViewMinLodCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkImageViewMinLodCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewMinLodCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageViewMinLodCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewMinLodCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewMinLodCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewMinLodCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageViewMinLodCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageViewMinLodCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageViewMinLodCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkImageViewMinLodCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewMinLodCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkImageViewMinLodCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageViewMinLodCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewMinLodCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkImageViewMinLodCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageViewMinLodCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewMinLodCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewMinLodCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewMinLodCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageViewMinLodCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageViewMinLodCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #minLod}. */
    public static float nminLod(long struct) { return UNSAFE.getFloat(null, struct + VkImageViewMinLodCreateInfoEXT.MINLOD); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageViewMinLodCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageViewMinLodCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #minLod(float) minLod}. */
    public static void nminLod(long struct, float value) { UNSAFE.putFloat(null, struct + VkImageViewMinLodCreateInfoEXT.MINLOD, value); }

    // -----------------------------------

    /** An array of {@link VkImageViewMinLodCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkImageViewMinLodCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkImageViewMinLodCreateInfoEXT ELEMENT_FACTORY = VkImageViewMinLodCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkImageViewMinLodCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageViewMinLodCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkImageViewMinLodCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageViewMinLodCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageViewMinLodCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkImageViewMinLodCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageViewMinLodCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkImageViewMinLodCreateInfoEXT#minLod} field. */
        public float minLod() { return VkImageViewMinLodCreateInfoEXT.nminLod(address()); }

        /** Sets the specified value to the {@link VkImageViewMinLodCreateInfoEXT#sType} field. */
        public VkImageViewMinLodCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImageViewMinLodCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageViewMinLod#VK_STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT} value to the {@link VkImageViewMinLodCreateInfoEXT#sType} field. */
        public VkImageViewMinLodCreateInfoEXT.Buffer sType$Default() { return sType(EXTImageViewMinLod.VK_STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkImageViewMinLodCreateInfoEXT#pNext} field. */
        public VkImageViewMinLodCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkImageViewMinLodCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageViewMinLodCreateInfoEXT#minLod} field. */
        public VkImageViewMinLodCreateInfoEXT.Buffer minLod(float value) { VkImageViewMinLodCreateInfoEXT.nminLod(address(), value); return this; }

    }

}