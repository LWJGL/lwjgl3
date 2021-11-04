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
 * Structure specifying swizzle applied to primitive clip coordinates.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code viewportCount} <b>must</b> be greater than or equal to the {@code viewportCount} set in {@link VkPipelineViewportStateCreateInfo}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVViewportSwizzle#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code pViewportSwizzles} <b>must</b> be a valid pointer to an array of {@code viewportCount} valid {@link VkViewportSwizzleNV} structures</li>
 * <li>{@code viewportCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkViewportSwizzleNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineViewportSwizzleStateCreateInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineViewportSwizzleStateCreateFlagsNV {@link #flags};
 *     uint32_t {@link #viewportCount};
 *     {@link VkViewportSwizzleNV VkViewportSwizzleNV} const * {@link #pViewportSwizzles};
 * }</code></pre>
 */
public class VkPipelineViewportSwizzleStateCreateInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        VIEWPORTCOUNT,
        PVIEWPORTSWIZZLES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        VIEWPORTCOUNT = layout.offsetof(3);
        PVIEWPORTSWIZZLES = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPipelineViewportSwizzleStateCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineViewportSwizzleStateCreateInfoNV(ByteBuffer container) {
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
    /** reserved for future use. */
    @NativeType("VkPipelineViewportSwizzleStateCreateFlagsNV")
    public int flags() { return nflags(address()); }
    /** the number of viewport swizzles used by the pipeline. */
    @NativeType("uint32_t")
    public int viewportCount() { return nviewportCount(address()); }
    /** a pointer to an array of {@link VkViewportSwizzleNV} structures, defining the viewport swizzles. */
    @NativeType("VkViewportSwizzleNV const *")
    public VkViewportSwizzleNV.Buffer pViewportSwizzles() { return npViewportSwizzles(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineViewportSwizzleStateCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVViewportSwizzle#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV} value to the {@link #sType} field. */
    public VkPipelineViewportSwizzleStateCreateInfoNV sType$Default() { return sType(NVViewportSwizzle.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineViewportSwizzleStateCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkPipelineViewportSwizzleStateCreateInfoNV flags(@NativeType("VkPipelineViewportSwizzleStateCreateFlagsNV") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkViewportSwizzleNV.Buffer} to the {@link #pViewportSwizzles} field. */
    public VkPipelineViewportSwizzleStateCreateInfoNV pViewportSwizzles(@NativeType("VkViewportSwizzleNV const *") VkViewportSwizzleNV.Buffer value) { npViewportSwizzles(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineViewportSwizzleStateCreateInfoNV set(
        int sType,
        long pNext,
        int flags,
        VkViewportSwizzleNV.Buffer pViewportSwizzles
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pViewportSwizzles(pViewportSwizzles);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineViewportSwizzleStateCreateInfoNV set(VkPipelineViewportSwizzleStateCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineViewportSwizzleStateCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportSwizzleStateCreateInfoNV malloc() {
        return wrap(VkPipelineViewportSwizzleStateCreateInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineViewportSwizzleStateCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportSwizzleStateCreateInfoNV calloc() {
        return wrap(VkPipelineViewportSwizzleStateCreateInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineViewportSwizzleStateCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkPipelineViewportSwizzleStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineViewportSwizzleStateCreateInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineViewportSwizzleStateCreateInfoNV} instance for the specified memory address. */
    public static VkPipelineViewportSwizzleStateCreateInfoNV create(long address) {
        return wrap(VkPipelineViewportSwizzleStateCreateInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineViewportSwizzleStateCreateInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineViewportSwizzleStateCreateInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportSwizzleStateCreateInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportSwizzleStateCreateInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportSwizzleStateCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineViewportSwizzleStateCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportSwizzleStateCreateInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineViewportSwizzleStateCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportSwizzleStateCreateInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportSwizzleStateCreateInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportSwizzleStateCreateInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportSwizzleStateCreateInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportSwizzleStateCreateInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportSwizzleStateCreateInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportSwizzleStateCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportSwizzleStateCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineViewportSwizzleStateCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportSwizzleStateCreateInfoNV malloc(MemoryStack stack) {
        return wrap(VkPipelineViewportSwizzleStateCreateInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineViewportSwizzleStateCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportSwizzleStateCreateInfoNV calloc(MemoryStack stack) {
        return wrap(VkPipelineViewportSwizzleStateCreateInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportSwizzleStateCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportSwizzleStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportSwizzleStateCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineViewportSwizzleStateCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineViewportSwizzleStateCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineViewportSwizzleStateCreateInfoNV.FLAGS); }
    /** Unsafe version of {@link #viewportCount}. */
    public static int nviewportCount(long struct) { return UNSAFE.getInt(null, struct + VkPipelineViewportSwizzleStateCreateInfoNV.VIEWPORTCOUNT); }
    /** Unsafe version of {@link #pViewportSwizzles}. */
    public static VkViewportSwizzleNV.Buffer npViewportSwizzles(long struct) { return VkViewportSwizzleNV.create(memGetAddress(struct + VkPipelineViewportSwizzleStateCreateInfoNV.PVIEWPORTSWIZZLES), nviewportCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineViewportSwizzleStateCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineViewportSwizzleStateCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineViewportSwizzleStateCreateInfoNV.FLAGS, value); }
    /** Sets the specified value to the {@code viewportCount} field of the specified {@code struct}. */
    public static void nviewportCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineViewportSwizzleStateCreateInfoNV.VIEWPORTCOUNT, value); }
    /** Unsafe version of {@link #pViewportSwizzles(VkViewportSwizzleNV.Buffer) pViewportSwizzles}. */
    public static void npViewportSwizzles(long struct, VkViewportSwizzleNV.Buffer value) { memPutAddress(struct + VkPipelineViewportSwizzleStateCreateInfoNV.PVIEWPORTSWIZZLES, value.address()); nviewportCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkPipelineViewportSwizzleStateCreateInfoNV.PVIEWPORTSWIZZLES));
    }

    // -----------------------------------

    /** An array of {@link VkPipelineViewportSwizzleStateCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkPipelineViewportSwizzleStateCreateInfoNV, Buffer> implements NativeResource {

        private static final VkPipelineViewportSwizzleStateCreateInfoNV ELEMENT_FACTORY = VkPipelineViewportSwizzleStateCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkPipelineViewportSwizzleStateCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineViewportSwizzleStateCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineViewportSwizzleStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineViewportSwizzleStateCreateInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineViewportSwizzleStateCreateInfoNV.nsType(address()); }
        /** @return the value of the {@link VkPipelineViewportSwizzleStateCreateInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineViewportSwizzleStateCreateInfoNV.npNext(address()); }
        /** @return the value of the {@link VkPipelineViewportSwizzleStateCreateInfoNV#flags} field. */
        @NativeType("VkPipelineViewportSwizzleStateCreateFlagsNV")
        public int flags() { return VkPipelineViewportSwizzleStateCreateInfoNV.nflags(address()); }
        /** @return the value of the {@link VkPipelineViewportSwizzleStateCreateInfoNV#viewportCount} field. */
        @NativeType("uint32_t")
        public int viewportCount() { return VkPipelineViewportSwizzleStateCreateInfoNV.nviewportCount(address()); }
        /** @return a {@link VkViewportSwizzleNV.Buffer} view of the struct array pointed to by the {@link VkPipelineViewportSwizzleStateCreateInfoNV#pViewportSwizzles} field. */
        @NativeType("VkViewportSwizzleNV const *")
        public VkViewportSwizzleNV.Buffer pViewportSwizzles() { return VkPipelineViewportSwizzleStateCreateInfoNV.npViewportSwizzles(address()); }

        /** Sets the specified value to the {@link VkPipelineViewportSwizzleStateCreateInfoNV#sType} field. */
        public VkPipelineViewportSwizzleStateCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineViewportSwizzleStateCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVViewportSwizzle#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV} value to the {@link VkPipelineViewportSwizzleStateCreateInfoNV#sType} field. */
        public VkPipelineViewportSwizzleStateCreateInfoNV.Buffer sType$Default() { return sType(NVViewportSwizzle.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV); }
        /** Sets the specified value to the {@link VkPipelineViewportSwizzleStateCreateInfoNV#pNext} field. */
        public VkPipelineViewportSwizzleStateCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkPipelineViewportSwizzleStateCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineViewportSwizzleStateCreateInfoNV#flags} field. */
        public VkPipelineViewportSwizzleStateCreateInfoNV.Buffer flags(@NativeType("VkPipelineViewportSwizzleStateCreateFlagsNV") int value) { VkPipelineViewportSwizzleStateCreateInfoNV.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkViewportSwizzleNV.Buffer} to the {@link VkPipelineViewportSwizzleStateCreateInfoNV#pViewportSwizzles} field. */
        public VkPipelineViewportSwizzleStateCreateInfoNV.Buffer pViewportSwizzles(@NativeType("VkViewportSwizzleNV const *") VkViewportSwizzleNV.Buffer value) { VkPipelineViewportSwizzleStateCreateInfoNV.npViewportSwizzles(address(), value); return this; }

    }

}