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
 * Structure specifying representative fragment test.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not included in the {@code pNext} chain, {@code representativeFragmentTestEnable} is considered to be {@link VK10#VK_FALSE FALSE}, and the representative fragment test is disabled.</p>
 * 
 * <p>If the active fragment shader does not specify the {@code EarlyFragmentTests} execution mode, the representative fragment shader test has no effect, even if enabled.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRepresentativeFragmentTest#VK_STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineRepresentativeFragmentTestStateCreateInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #representativeFragmentTestEnable};
 * }</code></pre>
 */
public class VkPipelineRepresentativeFragmentTestStateCreateInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        REPRESENTATIVEFRAGMENTTESTENABLE;

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
        REPRESENTATIVEFRAGMENTTESTENABLE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPipelineRepresentativeFragmentTestStateCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV(ByteBuffer container) {
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
    /** controls whether the representative fragment test is enabled. */
    @NativeType("VkBool32")
    public boolean representativeFragmentTestEnable() { return nrepresentativeFragmentTestEnable(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRepresentativeFragmentTest#VK_STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV} value to the {@link #sType} field. */
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV sType$Default() { return sType(NVRepresentativeFragmentTest.VK_STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #representativeFragmentTestEnable} field. */
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV representativeFragmentTestEnable(@NativeType("VkBool32") boolean value) { nrepresentativeFragmentTestEnable(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV set(
        int sType,
        long pNext,
        boolean representativeFragmentTestEnable
    ) {
        sType(sType);
        pNext(pNext);
        representativeFragmentTestEnable(representativeFragmentTestEnable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV set(VkPipelineRepresentativeFragmentTestStateCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRepresentativeFragmentTestStateCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV malloc() {
        return wrap(VkPipelineRepresentativeFragmentTestStateCreateInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineRepresentativeFragmentTestStateCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV calloc() {
        return wrap(VkPipelineRepresentativeFragmentTestStateCreateInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineRepresentativeFragmentTestStateCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineRepresentativeFragmentTestStateCreateInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRepresentativeFragmentTestStateCreateInfoNV} instance for the specified memory address. */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV create(long address) {
        return wrap(VkPipelineRepresentativeFragmentTestStateCreateInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineRepresentativeFragmentTestStateCreateInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineRepresentativeFragmentTestStateCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV malloc(MemoryStack stack) {
        return wrap(VkPipelineRepresentativeFragmentTestStateCreateInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineRepresentativeFragmentTestStateCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV calloc(MemoryStack stack) {
        return wrap(VkPipelineRepresentativeFragmentTestStateCreateInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRepresentativeFragmentTestStateCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineRepresentativeFragmentTestStateCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #representativeFragmentTestEnable}. */
    public static int nrepresentativeFragmentTestEnable(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRepresentativeFragmentTestStateCreateInfoNV.REPRESENTATIVEFRAGMENTTESTENABLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRepresentativeFragmentTestStateCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineRepresentativeFragmentTestStateCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #representativeFragmentTestEnable(boolean) representativeFragmentTestEnable}. */
    public static void nrepresentativeFragmentTestEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRepresentativeFragmentTestStateCreateInfoNV.REPRESENTATIVEFRAGMENTTESTENABLE, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkPipelineRepresentativeFragmentTestStateCreateInfoNV, Buffer> implements NativeResource {

        private static final VkPipelineRepresentativeFragmentTestStateCreateInfoNV ELEMENT_FACTORY = VkPipelineRepresentativeFragmentTestStateCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineRepresentativeFragmentTestStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineRepresentativeFragmentTestStateCreateInfoNV.nsType(address()); }
        /** @return the value of the {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineRepresentativeFragmentTestStateCreateInfoNV.npNext(address()); }
        /** @return the value of the {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV#representativeFragmentTestEnable} field. */
        @NativeType("VkBool32")
        public boolean representativeFragmentTestEnable() { return VkPipelineRepresentativeFragmentTestStateCreateInfoNV.nrepresentativeFragmentTestEnable(address()) != 0; }

        /** Sets the specified value to the {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV#sType} field. */
        public VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRepresentativeFragmentTestStateCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRepresentativeFragmentTest#VK_STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV} value to the {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV#sType} field. */
        public VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer sType$Default() { return sType(NVRepresentativeFragmentTest.VK_STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV); }
        /** Sets the specified value to the {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV#pNext} field. */
        public VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRepresentativeFragmentTestStateCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV#representativeFragmentTestEnable} field. */
        public VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer representativeFragmentTestEnable(@NativeType("VkBool32") boolean value) { VkPipelineRepresentativeFragmentTestStateCreateInfoNV.nrepresentativeFragmentTestEnable(address(), value ? 1 : 0); return this; }

    }

}